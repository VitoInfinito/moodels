package Classes.Bills.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Bills.IBills;
import Classes.Inventory.IInventoryAccess;

public class IBillsTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		
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
	
	@Test
	public void testGetIsBillPaid_expects_billIsPaid() {
		IBills.INSTANCE.payBillsWithCash(IBills.INSTANCE.getAllBillIDs());
		
		String billid = IBills.INSTANCE.getAllBillIDs().get(0);
		
		assertTrue(IBills.INSTANCE.getIsBillPaid(billid));
	}

	@Test
	public void testGetAllBillsNotPaid_expects_nonePaid() {
		
		while (!IBills.INSTANCE.getAllBillIDs().isEmpty()) {
			IBills.INSTANCE.removeBill(IBills.INSTANCE.getAllBillIDs().get(0));
		}
		
		IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 0.9);
		
		int size = IBills.INSTANCE.getAllBillsNotPaid().size();
		System.out.println(size);
		assertTrue(size == 1);
	}
	
	@Test
	public void testGetAllBillsNotPaid_expects_allPaid() {
		IBills.INSTANCE.payBillsWithCash(IBills.INSTANCE.getAllBillIDs());
		
		int size = IBills.INSTANCE.getAllBillsNotPaid().size();
		System.out.println(size);
		assertTrue(size == 0);
	}

	@Test
	public void testGetBillPaymentDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllBillIDs() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchBills() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllPayedBills() {
		fail("Not yet implemented");
	}

	@Test
	public void testPayBillsWithCreditCard() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBillItems() {
		fail("Not yet implemented");
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
		fail("Not yet implemented");
	}

	@Test
	public void testGetBillPaymentType() {
		fail("Not yet implemented");
	}

	@Test
	public void testPayBillsWithCash() {
		fail("Not yet implemented");
	}

	@Test
	public void testSendInvoice() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveBill() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBillTotalAmount() {
		fail("Not yet implemented");
	}

}
