package Classes.Bills.tests;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.xml.soap.SOAPException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Bills.IBills;
import Classes.Inventory.IManageInventory;
import Classes.Utils.InsufficientFundsException;
import Classes.Utils.InvalidCreditCardException;
import Classes.Utils.InvalidIDException;

public class IBillsTest {
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
			//AdministratorRequires bankingAdmin = AdministratorRequires.instance();
			//bankingAdmin.addCreditCard("12345678", "234", 3, 17, "Adolf","Eriksson");
	}
		@AfterClass
		public static void tearDownAfterClass() throws Exception {
			//AdministratorRequires bankingAdmin = AdministratorRequires.instance();
			//bankingAdmin.removeCreditCard("12345678", "234", 3, 17, "Adolf","Eriksson");
	}
	
	@Before
	public void setUp() throws Exception {
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		IManageInventory.INSTANCE.addItem("Toppias", 23.15, 13.37, 15);
		IManageInventory.INSTANCE.addItem("Ba-na-na", 5.99, 25.65, 100);
	}
	
	@After
	public void tearDown() throws InvalidIDException {
		for (String id : IManageInventory.INSTANCE.getAllItemIDs()) {
			IManageInventory.INSTANCE.removeItem(id);
		}
	}
	
	public void removeAllBills() {
		while (!IBills.INSTANCE.getAllBillIDs().isEmpty()) {
			IBills.INSTANCE.removeBill(IBills.INSTANCE.getAllBillIDs().get(0));
		}
	}
	
	@Test
	public void testAddBill() {
		int preSize = IBills.INSTANCE.getAllBillIDs().size();
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.5);
		
		assertTrue(IBills.INSTANCE.getAllBillIDs().size() == (preSize + 1));
	}

	@Test
	public void testGetIsBillPaid_expects_billIsNotPaid() {
		String billid = IBills.INSTANCE.getAllBillIDs().get(0);
		
		assertFalse(IBills.INSTANCE.getIsBillPaid(billid));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetIsBillPaid_expects_exception() {
		IBills.INSTANCE.getIsBillPaid("loljkNobillhere");
	}
	
	@Test
	public void testGetIsBillPaid_expects_billIsPaid() {
		IBills.INSTANCE.payBillsWithCash(IBills.INSTANCE.getAllBillIDs());
		
		String billid = IBills.INSTANCE.getAllBillIDs().get(0);
		
		assertTrue(IBills.INSTANCE.getIsBillPaid(billid));
	}

	@Test
	public void testGetAllBillsNotPaid_expects_nonePaid() {
		
		removeAllBills();
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		
		int size = IBills.INSTANCE.getAllBillsNotPaid().size();
		assertTrue(size == 1);
	}
	
	@Test
	public void testGetAllBillsNotPaid_expects_allPaid() {
		IBills.INSTANCE.payBillsWithCash(IBills.INSTANCE.getAllBillIDs());
		
		int size = IBills.INSTANCE.getAllBillsNotPaid().size();
		assertTrue(size == 0);
	}

	@Test
	public void testGetBillPaymentDate() {
		removeAllBills();
		
		LocalDateTime a = LocalDateTime.of(1991, 11, 30, 0, 0);
		LocalDateTime b = LocalDateTime.of(2000, 11, 30, 0, 0);
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, a, b, 0.9);
	
		assertTrue(IBills.INSTANCE.getBillPaymentDate(IBills.INSTANCE.getAllBillIDs().get(0)).equals(b));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetBillPaymentDate_expects_exception() {
		removeAllBills();
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, LocalDateTime.parse("2014-10-19 08:00", formatter), LocalDateTime.parse("2014-10-19 09:00", formatter), 0.9);
	
		assertTrue(IBills.INSTANCE.getBillPaymentDate("ehmhergherd").equals(LocalDateTime.parse("2014-10-19 09:00", formatter)));
	}

	@Test
	public void testGetAllBillIDs() {
		removeAllBills();
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, LocalDateTime.parse("2014-10-19 08:02", formatter), LocalDateTime.parse("2014-10-19 09:00", formatter), 0.9);
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, LocalDateTime.parse("2014-10-19 13:26", formatter), LocalDateTime.parse("2014-10-19 09:00", formatter), 0.9);
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, LocalDateTime.parse("2014-10-19 02:03", formatter), LocalDateTime.parse("2014-10-19 09:00", formatter), 0.9);
		
		int count = IBills.INSTANCE.getAllBillIDs().size();
		
		assertTrue(count == 3);
	}

	@Test
	public void testSearchBills_expect_empty() {
		removeAllBills();
		
		boolean result = IBills.INSTANCE.searchBills("LOL2k2k2k2kk2k2").isEmpty();
		assertTrue(result);
	}

	@Test
	public void testGetAllPayedBills() {
		removeAllBills();
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		
		IBills.INSTANCE.payBillsWithCash(IBills.INSTANCE.getAllBillIDs());
		
		assertTrue(IBills.INSTANCE.getAllPayedBills().size() == 2);
	}

	@Test
	public void testPayBillsWithCreditCard() throws SOAPException, InvalidCreditCardException, InsufficientFundsException {
		removeAllBills();
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		
		//IBills.INSTANCE.payBillsWithCreditCard(IBills.INSTANCE.getAllBillIDs(), "12345678", "234", 3, 17, "Adolf", "Eriksson");
		
		assertTrue(IBills.INSTANCE.getAllBillsNotPaid().size() == 0);
	}
	
	@Test
	public void testGetBillItems_excpets_noItems() {
		removeAllBills();
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		
		int count = IBills.INSTANCE.getBillItems(IBills.INSTANCE.getAllBillIDs().get(0)).size();
		
		assertTrue(count == 0);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetBillItems_excpets_exception() {
		removeAllBills();
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		
		int count = IBills.INSTANCE.getBillItems("nein").size();
		
		assertTrue(count == 0);
	}

	@Test(expected=InvalidIDException.class)
	public void testGetBillBookable_expects_exception() {
		removeAllBills();
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), "202", null, null, 0.9);
		
		assertTrue(IBills.INSTANCE.getBillBookable(IBills.INSTANCE.getAllBillIDs().get(0)).equals("202"));
	}
	
	@Test
	public void testGetBillBookable_expects_null() {
		removeAllBills();
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		
		assertTrue(IBills.INSTANCE.getBillBookable(IBills.INSTANCE.getAllBillIDs().get(0)) == null);
	}
	
	@Test
	public void testGetBillServices_excpets_noItems() {
		removeAllBills();
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		
		int count = IBills.INSTANCE.getBillServices(IBills.INSTANCE.getAllBillIDs().get(0)).size();
		
		assertTrue(count == 0);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetBillServices_excpets_exception() {
		removeAllBills();
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		
		int count = IBills.INSTANCE.getBillServices("nein").size();
		
		assertTrue(count == 0);
	}

	@Test
	public void testGetBillIssueDate() {
		removeAllBills();
		
		LocalDateTime a = LocalDateTime.of(1991, 11, 30, 0, 0);
		LocalDateTime b = LocalDateTime.of(2000, 11, 30, 0, 0);
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, a, b, 0.9);
		
		assertTrue(IBills.INSTANCE.getBillIssueDate(IBills.INSTANCE.getAllBillIDs().get(0)).equals(a));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetBillIssueDate_expects_exception() {
		removeAllBills();
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, LocalDateTime.parse("2014-10-19 08:00", formatter), LocalDateTime.parse("2014-10-19 09:00", formatter), 0.9);
		
		assertTrue(IBills.INSTANCE.getBillPaymentDate("invalid_ID").equals(LocalDateTime.parse("2014-10-19 08:00", formatter)));
	}

	@Test
	public void testGetBillPaymentType() {
		removeAllBills();
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, LocalDateTime.parse("2014-10-19 08:00", formatter), LocalDateTime.parse("2014-10-19 09:00", formatter), 0.9);
		
		assertTrue(IBills.INSTANCE.getBillPaymentType(IBills.INSTANCE.getAllBillIDs().get(0)) == null);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetBillPaymentType_expects_exception() {
		IBills.INSTANCE.getBillPaymentType("ASDASD");
	}

	@Test
	public void testPayBillsWithCash() {
		removeAllBills();
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		
		IBills.INSTANCE.payBillsWithCash(IBills.INSTANCE.getAllBillIDs());
		
		assertTrue(IBills.INSTANCE.getAllBillsNotPaid().size() == 0);
	}
	
	@Test(expected=UnsupportedOperationException.class)
	public void testSendInvoice() {
		IBills.INSTANCE.sendInvoice("", "");
	}

	@Test
	public void testRemoveBill() {
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		
		removeAllBills();
		
		assertTrue(IBills.INSTANCE.getAllBillIDs().size() == 0);
	}
	
	@Test
	public void testRemoveBill_expects_oneBillLeft() {
		removeAllBills();
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		
		IBills.INSTANCE.removeBill(IBills.INSTANCE.getAllBillIDs().get(0));
		
		assertTrue(IBills.INSTANCE.getAllBillIDs().size() == 1);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRemoveBill_expects_exception() {
		removeAllBills();
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		
		IBills.INSTANCE.removeBill("aslkdh");
		
		assertTrue(IBills.INSTANCE.getAllBillIDs().size() == 1);
	}

	@Test
	public void testGetBillTotalAmount() {
		removeAllBills();
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		double price = IBills.INSTANCE.getBillTotalAmount(IBills.INSTANCE.getAllBillIDs().get(0));
		assertTrue(price == 0);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetBillTotalAmount_expect_exception() {
		removeAllBills();
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		double price = IBills.INSTANCE.getBillTotalAmount("ASDAS");
		assertTrue(price == 0);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetBillTotalAmount_expects_exception() {
		IBills.INSTANCE.getBillTotalAmount("LOL");
	}

}
