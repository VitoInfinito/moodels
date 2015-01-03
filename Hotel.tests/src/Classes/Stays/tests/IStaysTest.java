package Classes.Stays.tests;

import static org.junit.Assert.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Bookables.HotelRoomCategory;
import Classes.Bookables.IBookablesManage;
import Classes.Bookings.IBookings;
import Classes.Customers.ICustomers;
import Classes.Guests.IGuests;
import Classes.Stays.IStays;
import Classes.Utils.GuestAlreadyCheckedInException;
import Classes.Utils.GuestAlreadyCheckedOutException;
import Classes.Utils.GuestNotCheckedInException;
import Classes.Utils.InsufficientFundsException;
import Classes.Utils.InvalidCheckInDateException;
import Classes.Utils.InvalidCreditCardException;
import Classes.Utils.InvalidIDException;
import Classes.Utils.ResponsibleCreditCardNotAddedException;
import Classes.Utils.StayAlreadyFullyCheckedInException;

public class IStaysTest {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
	String stay1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		String bookable1ID = IBookablesManage.INSTANCE.addHotelRoom("1", 100, "desc", 1, "info", HotelRoomCategory.STANDARD_ROOM, 2);
		List<String> bookableList1 = new ArrayList<String>();
		bookableList1.add(bookable1ID);
		ICustomers.INSTANCE.addCustomer("010101-0502", "a", "b", "Mr", "someemail@email.com", "1234");
		
		
		IGuests.INSTANCE.addGuest("010101-0504", "ac", "bc", "Dr", "someemail3@email.com", "1236");
		String booking1ID = IBookings.INSTANCE.makeBooking(bookableList1, "010101-0502", 
				LocalDateTime.parse("2014-10-19 08:29", formatter), LocalDateTime.parse("2014-10-22 12:00", formatter), 
				4, "123", "111", 11, 2016, "a", "b", 1.0, true);
		stay1 = IStays.INSTANCE.addNewStay(bookable1ID, booking1ID, LocalDateTime.parse("2014-10-19 08:29", formatter), LocalDateTime.parse("2014-10-22 12:00", formatter));
		
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
	public void testCheckInGuest_stay_exists_and_guest_exist_expects_checked_in_guest() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IGuests.INSTANCE.addGuest("010101-0503", "ab", "bb", "Mrs", "someemail2@email.com", "1235");
		IStays.INSTANCE.checkInGuest(stay1, "010101-0503");
		List<String> checkedInList = IStays.INSTANCE.getCheckedInGuestsOfHotelStay(stay1);
		assertTrue(checkedInList.contains("010101-0503"));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testCheckInGuest_guest_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}

	@Test(expected=InvalidIDException.class)
	public void testCheckInGuest_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=ResponsibleCreditCardNotAddedException.class)
	public void testCheckInGuest_responsible_creditcard_not_added() throws ResponsibleCreditCardNotAddedException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=GuestAlreadyCheckedInException.class)
	public void testCheckInGuest_guest_already_checked_in() throws GuestAlreadyCheckedInException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=GuestAlreadyCheckedOutException.class)
	public void testCheckInGuest_guest_already_checked_out() throws GuestAlreadyCheckedOutException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidCheckInDateException.class)
	public void testCheckInGuest_check_in_before_check_in_time() throws InvalidCheckInDateException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidCheckInDateException.class)
	public void testCheckInGuest_check_in_after_check_out_time() throws InvalidCheckInDateException {
		fail("Not yet implemented");
		//TODO make test
	}

	@Test(expected=StayAlreadyFullyCheckedInException.class)
	public void testCheckInGuest_exceed_amount_of_checked_in_guests() throws StayAlreadyFullyCheckedInException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	
	
	
	@Test
	public void testChangeBookableOfStay_stay_and_bookable_exists_expects_bookable_set_to_stay() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeBookableOfStay_bookable_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeBookableOfStay_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}

	
	
	@Test
	public void testAddNewStay_bookable_and_booking_exists_expects_stay_is_added() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddNewStay_booking_not_exists() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddNewStay_bookable_not_exists() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}

	
	
	
	@Test
	public void testRemoveStay_stay_exists_expects_stay_removed() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRemoveStay_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}

	
	
	
	@Test
	public void testAddBillToStay_stay_and_bill_exists_expects_bill_added_to_stay() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddBillToStay_bill_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddBillToStay_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	
	

	@Test
	public void testCheckOutGuest_stay_exists_and_guest_exists_in_stay_expects_guets_checked_out() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testCheckOutGuest_guest_not_exist_in_stay() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testCheckOutGuest_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=GuestAlreadyCheckedOutException.class)
	public void testCheckOutGuest_guest_already_checked_out() throws GuestAlreadyCheckedOutException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=GuestNotCheckedInException.class)
	public void testCheckOutGuest_guest_not_checked_in() throws GuestNotCheckedInException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InsufficientFundsException.class)
	public void testCheckOutGuest_bills_not_paid() throws InsufficientFundsException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	
	
	
	@Test(expected=SOAPException.class)
	public void testAddResponsibleCreditCard_no_connection_to_bank() throws SOAPException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test
	public void testAddResponsibleCreditCard_stay_exists_and_valid_creditcard_expects_card_added_to_stay() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddResponsibleCreditCard_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidCreditCardException.class)
	public void testAddResponsibleCreditCard_stay_exists_and_not_valid_creditcard() throws InvalidCreditCardException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	
	
	
	@Test(expected=SOAPException.class)
	public void testChangeResponsibleCreditCard_no_connection_to_bank() throws SOAPException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test
	public void testChangeResponsibleCreditCard_stay_exists_and_valid_creditcard_expects_card_added_to_stay() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeResponsibleCreditCard_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidCreditCardException.class)
	public void testChangeResponsibleCreditCard_stay_exists_and_not_valid_creditcard() throws InvalidCreditCardException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	
	
	
	@Test
	public void testGetGuestsOfHotelStay_stay_exists_expected_list_of_guests_in_stay() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetGuestsOfHotelStay_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	
	
	
	@Test
	public void testGetBillsOfHotelStay_stay_exists_expected_list_of_bills_in_stay() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetBillsOfHotelStay_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	
	
	
	@Test
	public void testGetBookableOfHotelStay_stay_exists_expected_bookable_in_stay() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetBookableOfHotelStay_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	
	
	
	@Test
	public void testGetBookingOfHotelStay_stay_exists_expected_booking_in_stay() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetBookingOfHotelStay_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	
	
	
	@Test
	public void testGetAllHotelStayIDs_expected_non_null_list_with_stays() {
		fail("Not yet implemented");
		//TODO make test
	}

	
	
	
	@Test
	public void testGetCheckedInGuestsOfHotelStay_stay_exists_expected_list_of_checked_in_guests() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetCheckedInGuestsOfHotelStay_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}

	
	
	
	@Test
	public void testGetCheckedOutGuestsOfHotelStay_stay_exists_expected_list_of_checked_out_guests() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetCheckedOutGuestsOfHotelStay_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}

	
	
	
	@Test
	public void testSearchHotelStays_expected_non_null_list_matching_or_somewhat_matching_search() {
		fail("Not yet implemented");
		//TODO make test
	}

	
	
	
	@Test
	public void testSearchHotelStaysWithinPeriod_expected_non_null_list_matching_or_somewhat_matching_search_within_time_period() {
		fail("Not yet implemented");
		//TODO make test
	}

	
	
	
	@Test
	public void testGetAllHotelStaysWithinPeriod_expected_list_with_stays_within_time_period() {
		fail("Not yet implemented");
		//TODO make test
	}

	
	
	
	@Test
	public void testGetAllUnpayedBillsOfHotelStay_stay_exists_expected_list_of_unpayed_bills_in_stay() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetAllUnpayedBillsOfHotelStay_stay_not_exists() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}

	
	
	
	@Test(expected=SOAPException.class)
	public void testBillCreditCardWithAllUnpaidBillsOfHotelStay_no_connection_to_bank() throws SOAPException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test
	public void testBillCreditCardWithAllUnpaidBillsOfHotelStay_stay_exists_and_valid_creditcard_expected_creditcard_billed_and_bills_set_as_payed() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidCreditCardException.class)
	public void testBillCreditCardWithAllUnpaidBillsOfHotelStay_stay_exists_without_creditcard() throws InvalidCreditCardException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testBillCreditCardWithAllUnpaidBillsOfHotelStay_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}

	
	
	
	@Test
	public void testIsResponsibleCreditCardAdded_stay_exists_and_creditcard_added_expected_returned_true() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test
	public void testIsResponsibleCreditCardAdded_stay_exists_and_creditcard_not_added_expected_returned_false() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testIsResponsibleCreditCardAdded_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}

	
	
	
	@Test
	public void testChangePeriodOfStay_stay_exists_expects_time_period_of_stay_changed() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangePeriodOfStay_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}

	
	
	
	@Test
	public void testRemoveBillFromStay_stay_and_bill_exists_expected_bill_removed_from_stay() {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRemoveBillFromStay_bill_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRemoveBillFromStay_stay_not_exist() throws InvalidIDException {
		fail("Not yet implemented");
		//TODO make test
	}
}
