package Classes.Customers.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Customers.ICustomers;
import Classes.Utils.InvalidIDException;

public class ICustomersTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ICustomers.INSTANCE.addCustomer("010101-0101", "Sven", "Svensson", "Mr", "sven.svensson@gmail.com", "0707-777776");
		ICustomers.INSTANCE.addCustomer("010101-0102", "Bengt", "Bengtsson", "Dr", "bengt.bengtsson@gmail.com", "0707-777777");
		ICustomers.INSTANCE.addCustomer("010101-0103", "Maja", "Andersson", "Ms", "maja.andersson@gmail.com", "0707-777778");
	}
	
	@After
	public void tearDown() throws Exception {
		for(String SSID : ICustomers.INSTANCE.getAllCustomers()) {
			ICustomers.INSTANCE.removeCustomer(SSID);
		}
	}

	@Test
	public void testGetAllCustomers() {
		boolean result = ICustomers.INSTANCE.getAllCustomers().size() == 3;
		assertTrue(result);
	}

	@Test
	public void testAddCustomer_notExists_customerAdded() {
		ICustomers.INSTANCE.addCustomer("010101-0104", "Sara", "Eriksson", "Ms", "sara.eriksson@gmail.com", "0707-777779");
		boolean result = ICustomers.INSTANCE.getAllCustomers().size() == 4;
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddCustomer_exists_throwsException() {
		ICustomers.INSTANCE.addCustomer("010101-0101", "Sven", "Svensson", "Mr", "sven.svensson@gmail.com", "0707-777776");
	}
	
	@Test
	public void testRemoveCustomer_exists_customerRemoved() {
		ICustomers.INSTANCE.removeCustomer("010101-0101");
		boolean result = ICustomers.INSTANCE.getAllCustomers().size() == 2;
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRemoveCustomer_notExists_throwsException() {
		ICustomers.INSTANCE.removeCustomer("0");
	}

	@Test
	public void testChangeCustomerFirstName_exists_firstNameChanged() {
		ICustomers.INSTANCE.changeCustomerFirstName("010101-0101", "Karl");
		boolean result = ICustomers.INSTANCE.getCustomerFirstName("010101-0101").equals("Karl");
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeCustomerFirstName_notExists_throwsException() {
		ICustomers.INSTANCE.changeCustomerFirstName("0", "Karl");
	}

	@Test
	public void testChangeCustomerLastName_exists_lastNameChanged() {
		ICustomers.INSTANCE.changeCustomerLastName("010101-0101", "Larsson");
		boolean result = ICustomers.INSTANCE.getCustomerLastName("010101-0101").equals("Larsson");
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeCustomerLastName_notExists_throwsException() {
		ICustomers.INSTANCE.changeCustomerFirstName("0", "Larsson");
	}

	@Test
	public void testChangeCustomerTitle() {
		// TODO 
		fail("Not yet implemented");
	}

	@Test
	public void testChangeCustomerEmail() {
		// TODO 
		fail("Not yet implemented");
	}

	@Test
	public void testChangeCustomerPhone() {
		// TODO 
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerFirstName() {
		boolean result = ICustomers.INSTANCE.getCustomerFirstName("010101-0101").equals("Sven");
		assertTrue(result);
	}

	@Test
	public void testGetCustomerLastName() {
		boolean result = ICustomers.INSTANCE.getCustomerLastName("010101-0101").equals("Svensson");
		assertTrue(result);
	}

	@Test
	public void testGetCustomerTitle() {
		boolean result = ICustomers.INSTANCE.getCustomerTitle("010101-0101").equals("Mr");
		assertTrue(result);
	}

	@Test
	public void testGetCustomerEmail() {
		boolean result = ICustomers.INSTANCE.getCustomerEmail("010101-0101").equals("sven.svensson@gmail.com");
		assertTrue(result);
	}

	@Test
	public void testGetCustomerPhone() {
		boolean result = ICustomers.INSTANCE.getCustomerPhone("010101-0101").equals("0707-777777");
		assertTrue(result);
	}

	@Test
	public void testSearchCustomers() {
		// TODO 
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerBookings() {
		// TODO 
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerRequests() {
		// TODO 
		fail("Not yet implemented");
	}

	@Test
	public void testAddCustomerBooking() {
		// TODO 
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveCustomerBooking() {
		// TODO 
		fail("Not yet implemented");
	}

	@Test
	public void testAddCustomerRequest() {
		// TODO 
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveCustomerRequest() {
		// TODO 
		fail("Not yet implemented");
	}

}
