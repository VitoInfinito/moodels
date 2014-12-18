package Classes.Customers.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Customers.ICustomers;

public class ICustomersTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		ICustomers.INSTANCE.addCustomer("010101-0101", "Sven", "Svensson", "Mr", "sven.svensson@gmail.com", "0707-777777");
		ICustomers.INSTANCE.addCustomer("010101-0102", "Bengt", "Bengtsson", "Dr", "bengt.bengtsson@gmail.com", "0707-777778");
		ICustomers.INSTANCE.addCustomer("010101-0103", "Maja", "Andersson", "Ms", "maja.andersson@gmail.com", "0707-777779");
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
	public void testAddCustomer() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testRemoveCustomer() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeCustomerFirstName() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeCustomerLastName() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeCustomerTitle() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeCustomerEmail() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeCustomerPhone() {
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
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerBookings() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerRequests() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddCustomerBooking() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveCustomerBooking() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddCustomerRequest() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveCustomerRequest() {
		fail("Not yet implemented");
	}

}
