package Classes.Stays.tests;

import static org.junit.Assert.fail;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Bookables.HotelRoomCategory;
import Classes.Bookables.IBookablesManage;
import Classes.Bookings.IBookings;
import Classes.Customers.ICustomers;
import Classes.Stays.IStays;
import Classes.Utils.InvalidIDException;

public class IStaysTest {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		String bookable1ID = IBookablesManage.INSTANCE.addHotelRoom("1", 100, "desc", 1, "info", HotelRoomCategory.STANDARD_ROOM, 2);
		List<String> bookableList1 = new ArrayList<String>();
		bookableList1.add(bookable1ID);
		String customer1ID = "010101-0502";
		ICustomers.INSTANCE.addCustomer(customer1ID, "a", "b", "Mr", "someemail@email.com", "1234");
		String booking1ID = IBookings.INSTANCE.makeBooking(bookableList1, customer1ID, 
				LocalDateTime.parse("2014-10-19 08:29", formatter), LocalDateTime.parse("2014-10-22 12:00", formatter), 
				4, "123", "111", 11, 2016, "a", "b", 1.0, true);
		IStays.INSTANCE.addNewStay(bookable1ID, booking1ID, LocalDateTime.parse("2014-10-19 08:29", formatter), LocalDateTime.parse("2014-10-22 12:00", formatter));
		
	}
	
	@After
	public void tearDown() throws InvalidIDException {
		for (String id : IStays.INSTANCE.getAllHotelStayIDs()) {
			IStays.INSTANCE.removeStay(id);
		}
		for(String id : IBookings.INSTANCE.getAllBookings()) {
			IBookings.INSTANCE.cancelBooking(id);
		}
		for(String id : ICustomers.INSTANCE.getAllCustomers()) {
			ICustomers.INSTANCE.removeCustomer(id);
		}
		for(String id : IBookablesManage.INSTANCE.getAllBookableIDs()) {
			IBookablesManage.INSTANCE.deleteBookable(id);
		}
	}
	
	@Test
	public void testCheckInGuest_stay_and_guest_exist_expects_checked_in_guest() {
		fail("Not yet implemented");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testCheckInGuest_guest_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
	}

	@Test(expected=InvalidIDException.class)
	public void testCheckInGuest_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testCheckInGuest_guest_already_checked_in() throws InvalidIDException {
		fail("Not yet implemented");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testCheckInGuest_guest_already_checked_out() throws InvalidIDException {
		fail("Not yet implemented");
	}

	
	
	@Test
	public void testChangeBookableOfStay_stay_and_bookable_exists_expects_bookable_set_to_stay() {
		fail("Not yet implemented");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeBookableOfStay_bookable_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeBookableOfStay_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
	}

	
	
	
	
	@Test
	public void testAddNewStay_bookable_and_booking_exists_expects_stay_is_added() {
		fail("Not yet implemented");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddNewStay_booking_not_exists() throws InvalidIDException {
		fail("Not yet implemented");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddNewStay_bookable_not_exists() throws InvalidIDException {
		fail("Not yet implemented");
	}

	
	
	
	@Test
	public void testRemoveStay_stay_exists_expects_stay_removed() {
		fail("Not yet implemented");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRemoveStay_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
	}

	@Test
	public void testAddBillToStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testCheckOutGuest() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddResponsibleCreditCard() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeResponsibleCreditCard() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetGuestsOfHotelStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBillsOfHotelStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBookableOfHotelStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBookingOfHotelStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllHotelStayIDs() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCheckedInGuestsOfHotelStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCheckedOutGuestsOfHotelStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchHotelStays() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchHotelStaysWithinPeriod() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllHotelStaysWithinPeriod() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllUnpayedBillsOfHotelStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testBillCreditCardWithAllUnpaidBillsOfHotelStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsResponsibleCreditCardAdded() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangePeriodOfStay() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveBillFromStay() {
		fail("Not yet implemented");
	}

}
