package Classes.Bills.tests;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Bills.IBills;
import Classes.Inventory.IInventoryAccess;
import Classes.Utils.InvalidIDException;

public class IBillsTest {
	
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		
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
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, LocalDateTime.parse("2014-10-19 08:00", formatter), LocalDateTime.parse("2014-10-19 09:00", formatter), 0.9);
	
		assertTrue(IBills.INSTANCE.getBillPaymentDate(IBills.INSTANCE.getAllBillIDs().get(0)).equals(LocalDateTime.parse("2014-10-19 09:00", formatter)));
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
	public void testSearchBills() {
		fail("Not yet implemented");
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
	public void testPayBillsWithCreditCard() {
		removeAllBills();
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		
		//IBills.INSTANCE.payBillsWithCreditCard(IBills.INSTANCE.getAllBillIDs(), ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName);
		
		assertTrue(IBills.INSTANCE.getAllBillsNotPaid().size() == 0);
	}

	@Test
	public void testGetBillItems() {
		//TODO
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

	@Test
	public void testGetBillBookable() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBillServices() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBillIssueDate() {
		removeAllBills();
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, LocalDateTime.parse("2014-10-19 08:00", formatter), LocalDateTime.parse("2014-10-19 09:00", formatter), 0.9);
		
		assertTrue(IBills.INSTANCE.getBillPaymentDate(IBills.INSTANCE.getAllBillIDs().get(0)).equals(LocalDateTime.parse("2014-10-19 08:00", formatter)));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetBillIssueDate_expects_exception() {
		removeAllBills();
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, LocalDateTime.parse("2014-10-19 08:00", formatter), LocalDateTime.parse("2014-10-19 09:00", formatter), 0.9);
		
		assertTrue(IBills.INSTANCE.getBillPaymentDate("invalid_ID").equals(LocalDateTime.parse("2014-10-19 08:00", formatter)));
	}

	@Test
	public void testGetBillPaymentType() {
		fail("Not yet implemented");
	}

	@Test
	public void testPayBillsWithCash() {
		removeAllBills();
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		
		IBills.INSTANCE.payBillsWithCash(IBills.INSTANCE.getAllBillIDs());
		
		assertTrue(IBills.INSTANCE.getAllBillsNotPaid().size() == 0);
	}

	@Test
	public void testSendInvoice() {
		fail("Not yet implemented");
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
	public void testGetBillTotalAmount() {
		fail("Not yet implemented");
	}

}
