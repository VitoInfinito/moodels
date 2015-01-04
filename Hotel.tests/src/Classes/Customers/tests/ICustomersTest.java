package Classes.Customers.tests;

import static org.junit.Assert.*;

import java.util.List;

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
		ICustomers.INSTANCE.addCustomer("010101-0103", "Maja", "Andersdotter", "Ms", "maja.andersdotter@gmail.com", "0707-777778");
		
		ICustomers.INSTANCE.addCustomerBooking("010101-0101", "001");
		ICustomers.INSTANCE.addCustomerBooking("010101-0101", "002");
		
		ICustomers.INSTANCE.addCustomerRequest("010101-0101", "I want food");
		ICustomers.INSTANCE.addCustomerRequest("010101-0101", "I want drinks");
	}
	
	@After
	public void tearDown() throws InvalidIDException {
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
	public void testChangeCustomerTitle_exists_titleChanged() {
		ICustomers.INSTANCE.changeCustomerTitle("010101-0101", "Ms");
		boolean result = ICustomers.INSTANCE.getCustomerTitle("010101-0101").equals("Ms");
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeCustomerTitle_notExists_throwsException() {
		ICustomers.INSTANCE.changeCustomerTitle("0", "Ms");
	}

	@Test
	public void testChangeCustomerEmail_exists_emailChanged() {
		ICustomers.INSTANCE.changeCustomerEmail("010101-0101", "sven.svensson@hotmail.com");
		boolean result = ICustomers.INSTANCE.getCustomerEmail("010101-0101").equals("sven.svensson@hotmail.com");
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeCustomerEmail_notExists_throwsException() {
		ICustomers.INSTANCE.changeCustomerEmail("0", "sven.svenssn@hotmail.com");
	}

	@Test
	public void testChangeCustomerPhone_exists_phoneChanged() {
		ICustomers.INSTANCE.changeCustomerPhone("010101-0101", "070-7777775");
		boolean result = ICustomers.INSTANCE.getCustomerPhone("010101-0101").equals("070-7777775");
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeCustomerPhone_notExists_throwsException() {
		ICustomers.INSTANCE.changeCustomerPhone("0", "0707-77777");
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
		boolean result = ICustomers.INSTANCE.getCustomerPhone("010101-0101").equals("0707-777776");
		assertTrue(result);
	}

	@Test
	public void testSearchCustomers_customersEmpty_expectEmptyList() throws InvalidIDException{
		tearDown();
		boolean result = ICustomers.INSTANCE.searchCustomers("Sven").isEmpty();
		assertTrue(result);
	}
	
	@Test
	public void testSearchCustomers_customersNotEmpty_expectsEmptyList() {
		boolean result = ICustomers.INSTANCE.searchCustomers("XXX").isEmpty();
		assertTrue(result);
	}
	
	@Test
	public void testSearchCustomers_expects_list_non_null() {
		List<String> list = ICustomers.INSTANCE.searchCustomers("XXX");
		assertNotNull(list);
	}
	
	@Test
	public void testSearchCustomers_idMatchExactly() {
		List<String> list = ICustomers.INSTANCE.searchCustomers("Svensson");
		assertTrue(list.contains("010101-0101"));
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchCustomers_idMatchSomewhat() {
		List<String> list = ICustomers.INSTANCE.searchCustomers("ven");
		assertTrue(list.contains("010101-0101"));
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchCustomers_multipleMatches() {
		List<String> list = ICustomers.INSTANCE.searchCustomers("son");
		assertTrue(list.size() == 2);
	}

	@Test
	public void testGetCustomerBookings_exists_returnsList() {
		boolean result = ICustomers.INSTANCE.getCustomerBookings("010101-0101").size() == 2;
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetCustomerBookings_notExists_throwsException() {
		ICustomers.INSTANCE.getCustomerBookings("0");
	}

	@Test
	public void testGetCustomerRequests_exists_returnsList() {
		boolean result = ICustomers.INSTANCE.getCustomerRequests("010101-0101").size() == 2;
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetCustomerRequest_notExists_throwsException() {
		ICustomers.INSTANCE.getCustomerRequests("0");
	}

	@Test
	public void testAddCustomerBooking_exists_bookingAdded() {
		ICustomers.INSTANCE.addCustomerBooking("010101-0101", "003");
		boolean result = ICustomers.INSTANCE.getCustomerBookings("010101-0101").size() == 3;
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddCustomerBooking_exists_bookingAreadyExists_throwsException() {
		ICustomers.INSTANCE.addCustomerBooking("010101-0101", "001");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddCustomerBooking_notExists_throwsException() {
		ICustomers.INSTANCE.addCustomerBooking("0", "003");
	}

	@Test
	public void testRemoveCustomerBooking_customerExistsListNotEmpty_bookingRemoved() {
		String reqID = ICustomers.INSTANCE.getCustomerBookings("010101-0101").get(0);
		ICustomers.INSTANCE.removeCustomerBooking("010101-0101", reqID);
		boolean result = ICustomers.INSTANCE.getCustomerBookings("010101-0101").size() == 1;
		assertTrue(result);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testRemoveCustomerBooking_customerExistsListEmpty_throwsException() {
		for(String bookID : ICustomers.INSTANCE.getCustomerBookings("010101-0101")) {
			ICustomers.INSTANCE.removeCustomerBooking("010101-0101", bookID);
		}
		ICustomers.INSTANCE.getCustomerBookings("010101-0101").get(0);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRemoveCustomerBooking_customerExistsBookingNotExists_throwsException() {
		ICustomers.INSTANCE.removeCustomerBooking("010101-0101", "0");
	}

	@Test
	public void testAddCustomerRequest_exists_requestAdded() {
		ICustomers.INSTANCE.addCustomerRequest("010101-0101", "I want cake");
		boolean result = ICustomers.INSTANCE.getCustomerRequests("010101-0101").size() == 3;
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddCustomerRequest_notExists_throwsException() {
		ICustomers.INSTANCE.addCustomerRequest("0", "I want cake");
	}

	@Test
	public void testRemoveCustomerRequest_customerExistsListNotEmpty_requestRemoved() {
		String reqID = ICustomers.INSTANCE.getCustomerRequests("010101-0101").get(0);
		ICustomers.INSTANCE.removeCustomerRequest("010101-0101", reqID);
		boolean result = ICustomers.INSTANCE.getCustomerRequests("010101-0101").size() == 1;
		assertTrue(result);
	}
	
	@Test(expected=IndexOutOfBoundsException.class)
	public void testRemoveCustomerRequest_customerExistsListEmpty_throwsException() {
		for(String reqID : ICustomers.INSTANCE.getCustomerRequests("010101-0101")) {
			ICustomers.INSTANCE.removeCustomerRequest("010101-0101", reqID);
		}
		ICustomers.INSTANCE.getCustomerRequests("010101-0101").get(0);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRemoveCustomerRequest_customerExistsRequestNotExists_throwsException() {
		ICustomers.INSTANCE.removeCustomerRequest("010101-0101", "0");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRemoveCustomerRequest_customerNotExistsRequestNotExists_throwsException() {
		ICustomers.INSTANCE.removeCustomerRequest("0", "0");
	}

}
