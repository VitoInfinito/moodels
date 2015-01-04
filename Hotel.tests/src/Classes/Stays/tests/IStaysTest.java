package Classes.Stays.tests;

import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;
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
	private static String stay1;
	private static String stay2;
	private static String stay3;
	private static String stay4;
	private static String stay5;
	private static String stay6;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		AdministratorRequires bankingAdmin = AdministratorRequires.instance();
		bankingAdmin.addCreditCard("12342352", "523", 9, 17, "Alfred","Johansson");
		bankingAdmin.addCreditCard("23453262", "833", 7, 18, "Sigurd","Matsson");
		bankingAdmin.addCreditCard("34563532", "831", 11, 19, "Yvar","Svensson");
		bankingAdmin.addCreditCard("45565426", "892", 1, 17, "Anders","Hallgren");
		
		IBookablesManage.INSTANCE.addHotelRoom("301", 1300, "desc1", 1, "loc1", HotelRoomCategory.STANDARD_ROOM, 2);
		IBookablesManage.INSTANCE.addHotelRoom("302", 1300, "desc2", 2, "loc2", HotelRoomCategory.STANDARD_ROOM, 2);	
		IBookablesManage.INSTANCE.addHotelRoom("402", 2000, "desc8", 8, "loc8", HotelRoomCategory.FAMILY_ROOM, 4);
		IBookablesManage.INSTANCE.addHotelRoom("503", 3000, "desc9", 9, "loc9", HotelRoomCategory.SUITE, 4);
		IBookablesManage.INSTANCE.addHotelRoom("601", 1300, "desc13", 13, "loc13", HotelRoomCategory.STANDARD_ROOM, 6);
		IBookablesManage.INSTANCE.addHotelRoom("403", 2000, "desc7", 7, "loc7", HotelRoomCategory.FAMILY_ROOM, 4);	
		
		ICustomers.INSTANCE.addCustomer("760911-0078", "Alfred","Johansson", "mr", "aj@korv.se", "0700-000071");
		ICustomers.INSTANCE.addCustomer("750411-0068", "Sigurd","Matsson", "mr", "sm@korv.se", "0700-000072");
		ICustomers.INSTANCE.addCustomer("930607-0098", "Yvar","Svensson", "mr", "ys@korv.se", "0700-000073");
		ICustomers.INSTANCE.addCustomer("861008-0028", "Anders","Hallgren", "mr", "ah@korv.se", "0700-000074");
		
		IGuests.INSTANCE.addGuest("760911-0078", "Alfred","Johansson", "mr", "aj@korv.se", "0700-000071");
		IGuests.INSTANCE.addGuest("750411-0068", "Sigurd","Matsson", "mr", "sm@korv.se", "0700-000072");
		IGuests.INSTANCE.addGuest("930607-0098", "Yvar","Svensson", "mr", "ys@korv.se", "0700-000073");
		IGuests.INSTANCE.addGuest("861008-0028", "Anders","Hallgren", "mr", "ah@korv.se", "0700-000074");
		IGuests.INSTANCE.addGuest("760912-0016", "Martin","Grönvall", "mr", "mg@korv.se", "0700-000075");
		IGuests.INSTANCE.addGuest("760913-0094", "David","Evertsson", "mr", "de@korv.se", "0700-000076");
		IGuests.INSTANCE.addGuest("760914-0022", "Ork","Inte", "mr", "oi@korv.se", "0700-000077");
		IGuests.INSTANCE.addGuest("760915-0080", "Mer","Detta", "mr", "md@korv.se", "0700-000078");
	}

	@Before
	public void setUp() throws Exception {
		List<String> bookableList1 = new ArrayList<String>();
		bookableList1.add("402");
		
		List<String> bookableList2 = new ArrayList<String>();
		bookableList2.add("402");
		
		List<String> bookableList3 = new ArrayList<String>();
		bookableList3.add("301");
		
		List<String> bookableList4 = new ArrayList<String>();
		bookableList4.add("302");
		
		List<String> bookableList5 = new ArrayList<String>();
		bookableList5.add("503");
		
		List<String> bookableList6 = new ArrayList<String>();
		bookableList6.add("601");
		

		String booking1 = IBookings.INSTANCE.makeBooking(bookableList1, "760911-0078", LocalDateTime.of(2015, 1, 1, 15, 0), LocalDateTime.of(2016, 1, 5, 10, 0), 4, "12342352", "523", 9, 17, "Alfred","Johansson", 0, true);
		String booking2 = IBookings.INSTANCE.makeBooking(bookableList2, "760911-0078", LocalDateTime.of(2016, 1, 6, 15, 0), LocalDateTime.of(2017, 4, 18, 10, 0), 2, "12342352", "523", 9, 17, "Alfred","Johansson", 0.2, false);
		String booking3 = IBookings.INSTANCE.makeBooking(bookableList3, "750411-0068", LocalDateTime.of(2015, 1, 4, 15, 0), LocalDateTime.of(2017, 4, 20, 10, 0), 2, "23453262", "833", 7, 18, "Sigurd","Matsson", 0.2, true);
		String booking4 = IBookings.INSTANCE.makeBooking(bookableList4, "930607-0098", LocalDateTime.of(2015, 1, 1, 15, 0), LocalDateTime.of(2015, 1, 2, 10, 0), 2, "34563532", "831", 11, 19, "Yvar","Svensson", 0, false);
		String booking5 = IBookings.INSTANCE.makeBooking(bookableList5, "861008-0028", LocalDateTime.of(2015, 1, 2, 8, 0), LocalDateTime.of(2017, 4, 23, 17, 0), 4, "45565426", "892", 1, 17, "Anders","Hallgren", 0.2, true);
		String booking6 = IBookings.INSTANCE.makeBooking(bookableList6, "861008-0028", LocalDateTime.of(2015, 1, 2, 8, 0), LocalDateTime.of(2017, 4, 22, 17, 0), 6, "45565426", "892", 1, 17, "Anders","Hallgren", 0, false);

		
		stay1 = IBookings.INSTANCE.getBookedStaysOfBooking(booking1).get(0);
		stay2 = IBookings.INSTANCE.getBookedStaysOfBooking(booking2).get(0);
		stay3 = IBookings.INSTANCE.getBookedStaysOfBooking(booking3).get(0);
		stay4 = IBookings.INSTANCE.getBookedStaysOfBooking(booking4).get(0);
		stay5 = IBookings.INSTANCE.getBookedStaysOfBooking(booking5).get(0);
		stay6 = IBookings.INSTANCE.getBookedStaysOfBooking(booking6).get(0);
		
		
		IStays.INSTANCE.addResponsibleCreditCard(stay1, "12342352", "523", 9, 17, "Alfred","Johansson");
		IStays.INSTANCE.addResponsibleCreditCard(stay2, "12342352", "523", 9, 17, "Alfred","Johansson");
		IStays.INSTANCE.addResponsibleCreditCard(stay4, "34563532", "831", 11, 19, "Yvar","Svensson");
		IStays.INSTANCE.addResponsibleCreditCard(stay5, "45565426", "892", 1, 17, "Anders","Hallgren");
		IStays.INSTANCE.addResponsibleCreditCard(stay6, "45565426", "892", 1, 17, "Anders","Hallgren");
		
	}
	
	@After
	public void tearDown() throws InvalidIDException, GuestNotCheckedInException, GuestAlreadyCheckedOutException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		for (String id : IStays.INSTANCE.getAllHotelStayIDs()) {
			//IStays.INSTANCE.removeStay(id);
			for(String gid : IStays.INSTANCE.getCheckedInGuestsOfHotelStay(id)) {
				IStays.INSTANCE.checkOutGuest(id, gid);
			}
			
		}
		for(String id : IBookings.INSTANCE.getAllBookings()) {
			IBookings.INSTANCE.cancelBooking(id);
		}
		
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		for(String id : ICustomers.INSTANCE.getAllCustomers()) {
			ICustomers.INSTANCE.removeCustomer(id);
		}
		for(String id : IGuests.INSTANCE.getAllGuestIDs()) {
			IGuests.INSTANCE.removeGuest(id);
		}
		for(String id : IBookablesManage.INSTANCE.getAllBookableIDs()) {
			IBookablesManage.INSTANCE.deleteBookable(id);
		}
		
		AdministratorRequires bankingAdmin = AdministratorRequires.instance();
		bankingAdmin.removeCreditCard("12342352", "523", 9, 23, "Alfred","Johansson");
		bankingAdmin.removeCreditCard("23453262", "833", 7, 18, "Sigurd","Matsson");
		bankingAdmin.removeCreditCard("34563532", "831", 11, 19, "Yvar","Svensson");
		bankingAdmin.removeCreditCard("45565426", "892", 1, 3, "Anders","Hallgren");
		
		
	}
	
	@Test
	public void testCheckInGuest_stay_exists_and_guest_exist_expects_checked_in_guest() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "760911-0078");
		List<String> checkedInList = IStays.INSTANCE.getCheckedInGuestsOfHotelStay(stay1);
		assertTrue(checkedInList.contains("760911-0078"));
	}
	
	/*@Test(expected=InvalidIDException.class)
	public void testCheckInGuest_guest_not_exist() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "666666-6666");
	}

	@Test(expected=InvalidIDException.class)
	public void testCheckInGuest_stay_not_exist() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException  {
		IStays.INSTANCE.checkInGuest("thisshalltntexist", "666666-6666");
	}
	
	@Test(expected=ResponsibleCreditCardNotAddedException.class)
	public void testCheckInGuest_responsible_creditcard_not_added() throws ResponsibleCreditCardNotAddedException, InvalidIDException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay3, "760911-0078");
	}
	
	@Test(expected=GuestAlreadyCheckedInException.class)
	public void testCheckInGuest_guest_already_checked_in() throws GuestAlreadyCheckedInException, InvalidIDException, ResponsibleCreditCardNotAddedException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "760911-0078");
		IStays.INSTANCE.checkInGuest(stay1, "760911-0078");
	}
	
	@Test(expected=GuestAlreadyCheckedOutException.class)
	public void testCheckInGuest_guest_already_checked_out() throws GuestAlreadyCheckedOutException, InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestNotCheckedInException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		IStays.INSTANCE.checkInGuest(stay1, "760911-0078");
		IStays.INSTANCE.checkOutGuest(stay1, "760911-0078");
		IStays.INSTANCE.checkInGuest(stay1, "760911-0078");
	}
	
	@Test(expected=InvalidCheckInDateException.class)
	public void testCheckInGuest_check_in_before_check_in_time() throws InvalidCheckInDateException, InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay2, "760911-0078");
	}
	
	@Test(expected=InvalidCheckInDateException.class)
	public void testCheckInGuest_check_in_after_check_out_time() throws InvalidCheckInDateException, InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay4, "760911-0078");
	}

	@Test(expected=StayAlreadyFullyCheckedInException.class)
	public void testCheckInGuest_exceed_amount_of_checked_in_guests() throws StayAlreadyFullyCheckedInException, InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "760911-0078");
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		IStays.INSTANCE.checkInGuest(stay1, "930607-0098");
		IStays.INSTANCE.checkInGuest(stay1, "760913-0094");
		IStays.INSTANCE.checkInGuest(stay1, "760914-0022");
	}
	
	
	
	
	@Test
	public void testChangeBookableOfStay_stay_and_bookable_exists_expects_bookable_set_to_stay() {
		assertTrue(IStays.INSTANCE.getBookableOfHotelStay(stay1).equals("402"));
		//changeBookableOfStay gives nullPointerException to row 153 in StaysManager when trying to access iBookings available bookables within time period
		IStays.INSTANCE.changeBookableOfStay(stay1, "403");
		assertTrue(IStays.INSTANCE.getBookableOfHotelStay(stay1).equals("403"));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeBookableOfStay_bookable_not_exist() throws InvalidIDException {
		//changeBookableOfStay gives nullPointerException to row 153 in StaysManager when trying to access iBookings available bookables within time period
		IStays.INSTANCE.changeBookableOfStay(stay1, "66666");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeBookableOfStay_stay_not_exist() throws InvalidIDException {
		IStays.INSTANCE.changeBookableOfStay("66666", "66666");
	}

	
	
	@Test
	public void testAddNewStay_bookable_and_booking_exists_expects_stay_is_added() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookableList = new ArrayList<String>();
		bookableList.add("403");
		String booking = IBookings.INSTANCE.makeBooking(bookableList, "760911-0078", LocalDateTime.of(2016, 1, 1, 15, 0), LocalDateTime.of(2016, 1, 5, 10, 0), 4, "12342352", "523", 9, 17, "Alfred","Johansson", 0, true);
		String stay = IStays.INSTANCE.addNewStay("402", booking, LocalDateTime.of(2018, 1, 1, 15, 0), LocalDateTime.of(2018, 1, 5, 10, 0));
		assertTrue(IStays.INSTANCE.getAllHotelStayIDs().contains(stay));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddNewStay_booking_not_exists() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookableList = new ArrayList<String>();
		bookableList.add("403");
		//String booking = IBookings.INSTANCE.makeBooking(bookableList, "760911-0078", LocalDateTime.of(2016, 1, 1, 15, 0), LocalDateTime.of(2016, 1, 5, 10, 0), 4, "12342352", "523", 9, 17, "Alfred","Johansson", 0, true);
		String stay = IStays.INSTANCE.addNewStay("402", "6666", LocalDateTime.of(2018, 1, 1, 15, 0), LocalDateTime.of(2018, 1, 5, 10, 0));
	}*/
	
	/*@Test(expected=InvalidIDException.class)
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
	}*/
}
