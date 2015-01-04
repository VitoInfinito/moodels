package Classes.Bookings.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;
import Classes.Bills.IBills;
import Classes.Bookables.ConferenceRoomCategory;
import Classes.Bookables.HotelRoomCategory;
import Classes.Bookables.IBookablesManage;
import Classes.Bookings.IBookings;
import Classes.Customers.ICustomers;
import Classes.Requests.IRequests;
import Classes.Stays.IStays;
import Classes.Utils.InsufficientFundsException;
import Classes.Utils.InvalidCreditCardException;
import Classes.Utils.InvalidIDException;

public class IBookingsTest {
	
	private static String booking1;
	private static String booking2;
	private static String booking3;
	private static String booking4;
	private static String booking5;
	private static String booking6;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		AdministratorRequires bankingAdmin = AdministratorRequires.instance();
		bankingAdmin.addCreditCard("12345678", "234", 3, 17, "Adolf","Eriksson");
		bankingAdmin.addCreditCard("643563576", "863", 4, 20, "Pelle","Petterson");
		bankingAdmin.addCreditCard("34336534", "655", 10, 18, "Greger","Gregersson");
		bankingAdmin.addCreditCard("475367456", "567", 7, 17, "Anders","Hallgren");
		
		IBookablesManage.INSTANCE.addHotelRoom("101", 1300, "desc1", 1, "loc1", HotelRoomCategory.STANDARD_ROOM, 2);	
		IBookablesManage.INSTANCE.addHotelRoom("202", 2000, "desc2", 2, "loc2", HotelRoomCategory.FAMILY_ROOM, 4);		
		IBookablesManage.INSTANCE.addHotelRoom("303", 3000, "desc3", 3, "loc3", HotelRoomCategory.SUITE, 4);
		IBookablesManage.INSTANCE.addHotelRoom("501", 1300, "desc10", 10, "loc7", HotelRoomCategory.STANDARD_ROOM, 6);	
		
		IBookablesManage.INSTANCE.addConferenceRoom("23", 10000, "desc4", 4, "loc4", ConferenceRoomCategory.LECTURE_ROOM, 30);
		IBookablesManage.INSTANCE.addConferenceRoom("24", 13000, "desc5", 5, "loc5", ConferenceRoomCategory.MEETING_ROOM, 10);	
		IBookablesManage.INSTANCE.addConferenceRoom("25", 14000, "desc6", 6, "loc6", ConferenceRoomCategory.DINING_ROOM, 150);	
		
		IBookablesManage.INSTANCE.addHostelBed("653", 400, "desc7", "501");
		IBookablesManage.INSTANCE.addHostelBed("654", 500, "desc8", "501");
		IBookablesManage.INSTANCE.addHostelBed("655", 600, "desc9", "501");
		
		ICustomers.INSTANCE.addCustomer("861104-0058", "Adolf","Eriksson", "mr", "ae@korv.se", "0700-000001");
		ICustomers.INSTANCE.addCustomer("861104-0068", "Pelle","Petterson", "mr", "pp@korv.se", "0700-000002");
		ICustomers.INSTANCE.addCustomer("861104-0078", "Greger","Gregersson", "mr", "gg@korv.se", "0700-000003");
		ICustomers.INSTANCE.addCustomer("861104-0088", "Anders","Hallgren", "mr", "ah@korv.se", "0700-000004");
		
		//bankingAdmin.makeDeposit("12345678", "234", 3, 17, "Adolf","Eriksson", 25.50); <- use within test methods for paying
	}

	@Before
	public void setUp() throws Exception {
		List<String> bookables1 = new ArrayList<String>();
		bookables1.add("202");
		
		List<String> bookables2 = new ArrayList<String>();
		bookables2.add("202");
		
		List<String> bookables3 = new ArrayList<String>();
		bookables3.add("101");
		bookables3.add("202");
		bookables3.add("303");
		
		List<String> bookables4 = new ArrayList<String>();
		bookables4.add("654");
		bookables4.add("653");
		
		List<String> bookables5 = new ArrayList<String>();
		bookables5.add("23");
		bookables5.add("24");
		
		List<String> bookables6 = new ArrayList<String>();
		bookables6.add("25");
		
		booking1 = IBookings.INSTANCE.makeBooking(bookables1, "861104-0078", LocalDateTime.of(2015, 2, 12, 15, 0), LocalDateTime.of(2015, 2, 16, 10, 0), 4, "34336534", "655", 10, 18, "Greger","Gregersson", 0, true);
		booking2 = IBookings.INSTANCE.makeBooking(bookables2, "861104-0078", LocalDateTime.of(2015, 2, 16, 15, 0), LocalDateTime.of(2015, 2, 18, 10, 0), 2, "34336534", "655", 10, 18, "Greger","Gregersson", 0.2, false);
		booking3 = IBookings.INSTANCE.makeBooking(bookables3, "861104-0088", LocalDateTime.of(2015, 2, 18, 15, 0), LocalDateTime.of(2015, 2, 20, 10, 0), 6, "475367456", "567", 7, 17, "Anders","Hallgren", 0.2, true);
		booking4 = IBookings.INSTANCE.makeBooking(bookables4, "861104-0088", LocalDateTime.of(2015, 2, 21, 15, 0), LocalDateTime.of(2015, 2, 22, 10, 0), 2, "475367456", "567", 7, 17, "Anders","Hallgren", 0, false);
		booking5 = IBookings.INSTANCE.makeBooking(bookables5, "861104-0058", LocalDateTime.of(2015, 2, 21, 8, 0), LocalDateTime.of(2015, 2, 23, 17, 0), 20, "12345678", "234", 3, 17, "Adolf","Eriksson", 0.2, true);
		booking6 = IBookings.INSTANCE.makeBooking(bookables6, "861104-0058", LocalDateTime.of(2015, 2, 21, 8, 0), LocalDateTime.of(2015, 2, 22, 17, 0), 100, "12345678", "234", 3, 17, "Adolf","Eriksson", 0, false);
	}

	@After
	public void tearDown() throws InvalidIDException {
		for (String id : IBookings.INSTANCE.getAllBookings()) {
			IBookings.INSTANCE.cancelBooking(id);
		}
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		AdministratorRequires bankingAdmin = AdministratorRequires.instance();
		bankingAdmin.removeCreditCard("12345678", "234", 3, 17, "Adolf","Eriksson");
		bankingAdmin.removeCreditCard("643563576", "863", 4, 20, "Pelle","Petterson");
		bankingAdmin.removeCreditCard("34336534", "655", 10, 18, "Greger","Gregersson");
		bankingAdmin.removeCreditCard("475367456", "567", 7, 17, "Anders","Hallgren");
		for (String id : IBookablesManage.INSTANCE.getAllBookableIDs()) {
			IBookablesManage.INSTANCE.deleteBookable(id);
		}
		for (String id : ICustomers.INSTANCE.getAllCustomers()) {
			ICustomers.INSTANCE.removeCustomer(id);
		}
	}

	@Test(expected=InvalidIDException.class)
	public void testMakeBooking_bookables_empty_expects_exception() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		IBookings.INSTANCE.makeBooking(new ArrayList<String>(), "861104-0078", LocalDateTime.of(2015, 3, 12, 15, 0), LocalDateTime.of(2015, 3, 16, 10, 0), 4, "34336534", "655", 10, 18, "Greger","Gregersson", 0, true);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMakeBooking_nbr_guests_less_than_one_expects_exception() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookables5 = new ArrayList<String>();
		bookables5.add("23");
		bookables5.add("24");
		IBookings.INSTANCE.makeBooking(bookables5, "861104-0078", LocalDateTime.of(2015, 3, 12, 15, 0), LocalDateTime.of(2015, 3, 16, 10, 0), 0, "34336534", "655", 10, 18, "Greger","Gregersson", 0, true);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMakeBooking_nbr_guests_greater_than_capacity_expects_exception() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookables5 = new ArrayList<String>();
		bookables5.add("23");
		bookables5.add("24");
		IBookings.INSTANCE.makeBooking(bookables5, "861104-0078", LocalDateTime.of(2015, 3, 12, 15, 0), LocalDateTime.of(2015, 3, 16, 10, 0), 50, "34336534", "655", 10, 18, "Greger","Gregersson", 0, true);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMakeBooking_discount_less_then_zero_expects_exception() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookables5 = new ArrayList<String>();
		bookables5.add("23");
		bookables5.add("24");
		IBookings.INSTANCE.makeBooking(bookables5, "861104-0078", LocalDateTime.of(2015, 3, 12, 15, 0), LocalDateTime.of(2015, 3, 16, 10, 0), 4, "34336534", "655", 10, 18, "Greger","Gregersson", -1, true);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testMakeBooking_discount_greater_than_one_expects_exception() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookables5 = new ArrayList<String>();
		bookables5.add("23");
		bookables5.add("24");
		IBookings.INSTANCE.makeBooking(bookables5, "861104-0078", LocalDateTime.of(2015, 3, 12, 15, 0), LocalDateTime.of(2015, 3, 16, 10, 0), 4, "34336534", "655", 10, 18, "Greger","Gregersson", 2, true);
	}
	
	@Test(expected=InvalidCreditCardException.class)
	public void testMakeBooking_invalid_credit_card_expects_exception() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookables5 = new ArrayList<String>();
		bookables5.add("23");
		IBookings.INSTANCE.makeBooking(bookables5, "861104-0078", LocalDateTime.of(2015, 3, 12, 15, 0), LocalDateTime.of(2015, 3, 16, 10, 0), 4, "34116534", "655", 10, 18, "Greger","Gregersson", 0, true);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testMakeBooking_bookable_already_booked_period_overlaps_right_expects_exception() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookables5 = new ArrayList<String>();
		bookables5.add("23");
		IBookings.INSTANCE.makeBooking(bookables5, "861104-0078", LocalDateTime.of(2015, 2, 22, 8, 0), LocalDateTime.of(2015, 2, 24, 17, 0), 4, "34336534", "655", 10, 18, "Greger","Gregersson", 0, true);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testMakeBooking_bookable_already_booked_period_overlaps_left_expects_exception() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookables5 = new ArrayList<String>();
		bookables5.add("23");
		IBookings.INSTANCE.makeBooking(bookables5, "861104-0078", LocalDateTime.of(2015, 2, 20, 8, 0), LocalDateTime.of(2015, 2, 22, 17, 0), 4, "34336534", "655", 10, 18, "Greger","Gregersson", 0, true);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testMakeBooking_bookable_already_booked_period_within_expects_exception() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookables5 = new ArrayList<String>();
		bookables5.add("23");
		IBookings.INSTANCE.makeBooking(bookables5, "861104-0078", LocalDateTime.of(2015, 2, 22, 8, 0), LocalDateTime.of(2015, 2, 22, 17, 0), 4, "34336534", "655", 10, 18, "Greger","Gregersson", 0, true);
	}
	
	@Test
	public void testMakeBooking_valid_parameters_responsiblecard_true_expects_non_null_result() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookables1 = new ArrayList<String>();
		bookables1.add("202");
		String bookingNbr = IBookings.INSTANCE.makeBooking(bookables1, "861104-0078", LocalDateTime.of(2015, 3, 4, 15, 0), LocalDateTime.of(2015, 3, 10, 10, 0), 4, "34336534", "655", 10, 18, "Greger","Gregersson", 0, true);
		assertTrue(bookingNbr != null);
	}
	
	@Test
	public void testMakeBooking_valid_parameters_responsiblecard_true_expects_booking_exists() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookables1 = new ArrayList<String>();
		bookables1.add("202");
		String bookingNbr = IBookings.INSTANCE.makeBooking(bookables1, "861104-0078", LocalDateTime.of(2015, 3, 4, 15, 0), LocalDateTime.of(2015, 3, 10, 10, 0), 4, "34336534", "655", 10, 18, "Greger","Gregersson", 0, true);
		assertTrue(IBookings.INSTANCE.getAllBookings().contains(bookingNbr));
	}
	
	@Test
	public void testMakeBooking_valid_parameters_responsiblecard_true_expects_stay_in_room_exist() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookables1 = new ArrayList<String>();
		bookables1.add("202");
		String bookingNbr = IBookings.INSTANCE.makeBooking(bookables1, "861104-0078", LocalDateTime.of(2015, 3, 4, 15, 0), LocalDateTime.of(2015, 3, 10, 10, 0), 4, "34336534", "655", 10, 18, "Greger","Gregersson", 0, true);
		List<String> stays = IBookings.INSTANCE.getBookedStaysOfBooking(bookingNbr);
		assertTrue(stays.size() == 1);
		assertTrue(IStays.INSTANCE.getBookableOfHotelStay(stays.get(0)).equals("202"));
	}
	
	@Test
	public void testMakeBooking_valid_parameters_responsiblecard_true_expects_bill_added_to_each_stay() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookables1 = new ArrayList<String>();
		bookables1.add("202");
		String bookingNbr = IBookings.INSTANCE.makeBooking(bookables1, "861104-0078", LocalDateTime.of(2015, 3, 4, 15, 0), LocalDateTime.of(2015, 3, 10, 10, 0), 4, "34336534", "655", 10, 18, "Greger","Gregersson", 0, true);
		List<String> stays = IBookings.INSTANCE.getBookedStaysOfBooking(bookingNbr);
		List<String> bills = IStays.INSTANCE.getBillsOfHotelStay(stays.get(0));
		assertTrue(bills.size() == 1);
		assertTrue(IBills.INSTANCE.getBillBookable(bills.get(0)).equals("202"));
		assertFalse(IBills.INSTANCE.getIsBillPaid(bills.get(0)));
		assertTrue(IBills.INSTANCE.getBillDiscount(bills.get(0)) == 0);
		assertTrue(IBills.INSTANCE.getBillTotalAmount(bills.get(0)) >= 0);
	}
	
	@Test
	public void testMakeBooking_valid_parameters_many_rooms_responsiblecard_true_expects_stay_in_room_exist() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookables1 = new ArrayList<String>();
		bookables1.add("202");
		bookables1.add("303");
		String bookingNbr = IBookings.INSTANCE.makeBooking(bookables1, "861104-0078", LocalDateTime.of(2015, 3, 4, 15, 0), LocalDateTime.of(2015, 3, 10, 10, 0), 4, "34336534", "655", 10, 18, "Greger","Gregersson", 0, true);
		List<String> stays = IBookings.INSTANCE.getBookedStaysOfBooking(bookingNbr);
		assertTrue(stays.size() == 2);
		assertTrue(IStays.INSTANCE.getBookableOfHotelStay(stays.get(0)).equals("202"));
		assertTrue(IStays.INSTANCE.getBookableOfHotelStay(stays.get(1)).equals("303"));
	}
	
	@Test
	public void testMakeBooking_valid_parameters_responsiblecard_true_expects_stay_period_correct() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookables1 = new ArrayList<String>();
		bookables1.add("202");
		String bookingNbr = IBookings.INSTANCE.makeBooking(bookables1, "861104-0078", LocalDateTime.of(2015, 3, 4, 15, 0), LocalDateTime.of(2015, 3, 10, 10, 0), 4, "34336534", "655", 10, 18, "Greger","Gregersson", 0, true);
		List<String> stays = IBookings.INSTANCE.getBookedStaysOfBooking(bookingNbr);
		assertTrue(IStays.INSTANCE.getToDateOfHotelStay(stays.get(0)).equals(LocalDateTime.of(2015, 3, 10, 10, 0)));
		assertTrue(IStays.INSTANCE.getFromDateOfHotelStay(stays.get(0)).equals(LocalDateTime.of(2015, 3, 4, 15, 0)));
	}
	
	@Test
	public void testMakeBooking_valid_parameters_responsiblecard_true_expects_stay_responsible_card_added() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookables1 = new ArrayList<String>();
		bookables1.add("202");
		String bookingNbr = IBookings.INSTANCE.makeBooking(bookables1, "861104-0078", LocalDateTime.of(2015, 3, 4, 15, 0), LocalDateTime.of(2015, 3, 10, 10, 0), 4, "34336534", "655", 10, 18, "Greger","Gregersson", 0, true);
		List<String> stays = IBookings.INSTANCE.getBookedStaysOfBooking(bookingNbr);
		assertTrue(IStays.INSTANCE.isResponsibleCreditCardAdded(stays.get(0)));
	}
	
	@Test
	public void testMakeBooking_valid_parameters_responsiblecard_false_expects_stay_responsible_card_not_added() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookables1 = new ArrayList<String>();
		bookables1.add("202");
		String bookingNbr = IBookings.INSTANCE.makeBooking(bookables1, "861104-0078", LocalDateTime.of(2015, 3, 4, 15, 0), LocalDateTime.of(2015, 3, 10, 10, 0), 4, "34336534", "655", 10, 18, "Greger","Gregersson", 0, false);
		List<String> stays = IBookings.INSTANCE.getBookedStaysOfBooking(bookingNbr);
		assertFalse(IStays.INSTANCE.isResponsibleCreditCardAdded(stays.get(0)));
	}
	
	@Test
	public void testMakeBooking_valid_parameters_responsiblecard_true_expects_customer_correct() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookables1 = new ArrayList<String>();
		bookables1.add("202");
		String bookingNbr = IBookings.INSTANCE.makeBooking(bookables1, "861104-0078", LocalDateTime.of(2015, 3, 4, 15, 0), LocalDateTime.of(2015, 3, 10, 10, 0), 4, "34336534", "655", 10, 18, "Greger","Gregersson", 0, true);
		String customerID = IBookings.INSTANCE.getCustomerOfBooking(bookingNbr);
		assertTrue(customerID.equals("861104-0078"));
	}
	
	@Test
	public void testMakeBooking_valid_parameters_responsiblecard_true_expects_booking_added_to_customer() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookables1 = new ArrayList<String>();
		bookables1.add("202");
		String bookingNbr = IBookings.INSTANCE.makeBooking(bookables1, "861104-0078", LocalDateTime.of(2015, 3, 4, 15, 0), LocalDateTime.of(2015, 3, 10, 10, 0), 4, "34336534", "655", 10, 18, "Greger","Gregersson", 0, true);
		assertTrue(ICustomers.INSTANCE.getCustomerBookings("861104-0078").contains(bookingNbr));
	}
	
	@Test
	public void testSearchBookings_exact_id_match_expects_first_element_in_result() {
		List<String> result = IBookings.INSTANCE.searchBookings(booking1);
		assertTrue(result.get(0).equals(booking1));
		assertTrue(result.size() == 1);
	}
	
	@Test
	public void testSearchBookings_id_match_somewhat_expects_booking_in_result() {
		List<String> result = IBookings.INSTANCE.searchBookings(booking1.substring(2));
		assertTrue(result.contains(booking1));
	}
	
	@Test
	public void testSearchBookings_on_customer_id_expects_customer_bookings_found() {
		List<String> result = IBookings.INSTANCE.searchBookings("861104-0058");
		assertTrue(result.contains(booking5));
		assertTrue(result.contains(booking6));
	}
	
	@Test
	public void testSearchBookings_on_part_of_customer_id_expects_customer_bookings_found() {
		List<String> result = IBookings.INSTANCE.searchBookings("104");
		assertTrue(result.contains(booking5));
		assertTrue(result.contains(booking6));
	}
	
	@Test
	public void testSearchBookings_empty_string_expects_all_bookings() {
		List<String> result = IBookings.INSTANCE.searchBookings("");
		assertTrue(result.contains(booking1));
		assertTrue(result.contains(booking2));
		assertTrue(result.contains(booking3));
		assertTrue(result.contains(booking4));
		assertTrue(result.contains(booking5));
		assertTrue(result.contains(booking6));
		assertTrue(result.size() == 6);
	}

	@Test
	public void testGetBookedStaysOfBooking_booking_with_single_bookable_expects_bookables_of_booking_correct() {
		List<String> stays = IBookings.INSTANCE.getBookedStaysOfBooking(booking2);
		assertTrue(stays.size() == 1);
		assertTrue(IStays.INSTANCE.getBookableOfHotelStay(stays.get(0)).equals("202"));
	}
	
	@Test
	public void testGetBookedStaysOfBooking_booking_with_many_bookables_expects_bookables_of_booking_correct() {
		List<String> stays = IBookings.INSTANCE.getBookedStaysOfBooking(booking3);
		assertTrue(stays.size() == 3);
		assertTrue(IStays.INSTANCE.getBookableOfHotelStay(stays.get(0)).equals("101"));
		assertTrue(IStays.INSTANCE.getBookableOfHotelStay(stays.get(1)).equals("202"));
		assertTrue(IStays.INSTANCE.getBookableOfHotelStay(stays.get(2)).equals("303"));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetBookedStaysOfBooking_invalid_booking_expects_exception() {
		IBookings.INSTANCE.getBookedStaysOfBooking("dontExist");
	}

	@Test
	public void testGetCustomerOfBooking_valid_booking_expects_customer_currect() {
		String customerID = IBookings.INSTANCE.getCustomerOfBooking(booking1);
		assertTrue(customerID.equals("861104-0078"));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetCustomerOfBooking_invalid_booking_expects_exception() {
		IBookings.INSTANCE.getCustomerOfBooking("korv");
	}

	@Test
	public void testGetNbrGuestOfBooking_valid_booking_expects_nbrGuests_currect() {
		assertTrue(IBookings.INSTANCE.getNbrGuestOfBooking(booking6) == 100);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetNbrGuestOfBooking_invalid_booking_expects_exception() {
		IBookings.INSTANCE.getNbrGuestOfBooking("finnsEj");
	}

	@Test
	public void testCancelBooking_expects_stays_requests_booking_removed() {
		List<String> stays = IBookings.INSTANCE.getBookedStaysOfBooking(booking3);
		String reqID = IRequests.INSTANCE.addRequest("korv");
		IBookings.INSTANCE.addBookingRequest(booking2, reqID);
		List<String> requests = IBookings.INSTANCE.getBookingRequests(booking3);
		IBookings.INSTANCE.cancelBooking(booking3);
		assertFalse(IBookings.INSTANCE.getAllBookings().contains(booking3));
		assertTrue(Collections.disjoint(IStays.INSTANCE.getAllHotelStayIDs(), stays));
		assertTrue(Collections.disjoint(IRequests.INSTANCE.getAllRequestIDs(), requests));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testCancelBooking_invalid_booking_expects_exception() {
		IBookings.INSTANCE.cancelBooking("someid");
	}

	@Test
	public void testCancelStayOfBooking_more_stays_expects_stay_removed() {
		String stay = IBookings.INSTANCE.getBookedStaysOfBooking(booking3).get(0);
		IBookings.INSTANCE.cancelStayOfBooking(booking3, stay);
		assertFalse(IBookings.INSTANCE.getBookedStaysOfBooking(booking3).contains(stay));
		assertFalse(IStays.INSTANCE.getAllHotelStayIDs().contains(stay));
	}
	
	@Test
	public void testCancelStayOfBooking_one_stay_expects_stays_requests_booking_removed() {
		String stay = IBookings.INSTANCE.getBookedStaysOfBooking(booking2).get(0);
		String reqID = IRequests.INSTANCE.addRequest("korv");
		IBookings.INSTANCE.addBookingRequest(booking2, reqID);
		List<String> requests = IBookings.INSTANCE.getBookingRequests(booking2);
		IBookings.INSTANCE.cancelStayOfBooking(booking2, stay);
		assertFalse(IBookings.INSTANCE.getAllBookings().contains(booking2));
		assertFalse(IStays.INSTANCE.getAllHotelStayIDs().contains(stay));
		assertTrue(Collections.disjoint(IRequests.INSTANCE.getAllRequestIDs(), requests));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testCancelStayOfBooking_invalid_booking_expects_exception() {
		IBookings.INSTANCE.cancelStayOfBooking("finnsej", IBookings.INSTANCE.getBookedStaysOfBooking(booking2).get(0));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testCancelStayOfBooking_invalid_stay_expects_exception() {
		IBookings.INSTANCE.cancelStayOfBooking(booking2, "finnsej");
	}

	@Test
	public void testAddBookedStayToBooking() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeNbrGuestsOfBooking_valid_booking_expects_nbrGuests_currect() {
		IBookings.INSTANCE.changeNbrGuestsOfBooking(booking6, 200);
		assertTrue(IBookings.INSTANCE.getNbrGuestOfBooking(booking6) == 200);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeNbrGuestsOfBooking_invalid_booking_expects_exception() {
		IBookings.INSTANCE.changeNbrGuestsOfBooking("wtf", 200);
	}

	@Test
	public void testGetAllBookings_expects_all_bookings() {
		List<String> bookings = IBookings.INSTANCE.getAllBookings();
		assertTrue(bookings.contains(booking1));
		assertTrue(bookings.contains(booking2));
		assertTrue(bookings.contains(booking3));
		assertTrue(bookings.contains(booking4));
		assertTrue(bookings.contains(booking5));
		assertTrue(bookings.contains(booking6));
		assertTrue(bookings.size() == 6);
	}

	@Test
	public void testGetAllBookingsWithinPeriod_period_overlaps_expects_all_bookings() {
		LocalDateTime to = LocalDateTime.now().plusDays(1);
		LocalDateTime from = LocalDateTime.now().minusDays(1);
		List<String> bookings = IBookings.INSTANCE.getAllBookingsWithinPeriod(from, to);
		assertTrue(bookings.contains(booking1));
		assertTrue(bookings.contains(booking2));
		assertTrue(bookings.contains(booking3));
		assertTrue(bookings.contains(booking4));
		assertTrue(bookings.contains(booking5));
		assertTrue(bookings.contains(booking6));
		assertTrue(bookings.size() == 6);
	}
	
	@Test
	public void testGetAllBookingsWithinPeriod_period_not_overlaps_expects_no_bookings() {
		LocalDateTime to = LocalDateTime.now().plusDays(2);
		LocalDateTime from = LocalDateTime.now().plusDays(1);
		List<String> bookings = IBookings.INSTANCE.getAllBookingsWithinPeriod(from, to);
		assertTrue(bookings.isEmpty());
	}

	@Test
	public void testGetAllBookingsWithStaysInPeriod_period_intersects_expects_intersecting_stay_period_bookings() {
		LocalDateTime to = LocalDateTime.of(2015, 2, 22, 0, 0);
		LocalDateTime from = LocalDateTime.of(2015, 2, 21, 0, 0);
		List<String> bookings = IBookings.INSTANCE.getAllBookingsWithStaysInPeriod(from, to);
		assertTrue(bookings.contains(booking4));
		assertTrue(bookings.contains(booking5));
		assertTrue(bookings.contains(booking6));
		assertTrue(bookings.size() == 3);
	}
	
	@Test
	public void testGetAllBookingsWithStaysInPeriod_period_overlaps_expects_overlapped_stay_period_bookings() {
		LocalDateTime to = LocalDateTime.of(2015, 2, 24, 0, 0);
		LocalDateTime from = LocalDateTime.of(2015, 2, 21, 0, 0);
		List<String> bookings = IBookings.INSTANCE.getAllBookingsWithStaysInPeriod(from, to);
		assertTrue(bookings.contains(booking4));
		assertTrue(bookings.contains(booking5));
		assertTrue(bookings.contains(booking6));
		assertTrue(bookings.size() == 3);
	}
	
	@Test
	public void testGetAllBookingsWithStaysInPeriod_period_does_not_intersect_expects_no_bookings() {
		LocalDateTime to = LocalDateTime.of(2015, 3, 22, 0, 0);
		LocalDateTime from = LocalDateTime.of(2015, 3, 21, 0, 0);
		List<String> bookings = IBookings.INSTANCE.getAllBookingsWithStaysInPeriod(from, to);
		assertTrue(bookings.isEmpty());
	}

	@Test
	public void testSearchBookingsMadeInPeriod_no_bookings_made_in_period_expects_no_bookings_found() {
		LocalDateTime to = LocalDateTime.now().minusDays(1);
		LocalDateTime from = LocalDateTime.now().minusDays(2);
		List<String> result = IBookings.INSTANCE.searchBookingsMadeInPeriod("", from, to);
		assertTrue(result.isEmpty());
	}
	
	@Test
	public void testSearchBookingsMadeInPeriod_exact_id_match_expects_first_element_in_result() {
		LocalDateTime to = LocalDateTime.now().plusDays(1);
		LocalDateTime from = LocalDateTime.now().minusDays(1);
		List<String> result = IBookings.INSTANCE.searchBookingsMadeInPeriod(booking1, from, to);
		assertTrue(result.get(0).equals(booking1));
		assertTrue(result.size() == 1);
	}
	
	@Test
	public void testSearchBookingsMadeInPeriod_id_match_somewhat_expects_booking_in_result() {
		LocalDateTime to = LocalDateTime.now().plusDays(1);
		LocalDateTime from = LocalDateTime.now().minusDays(1);
		List<String> result = IBookings.INSTANCE.searchBookingsMadeInPeriod(booking1.substring(2), from, to);
		assertTrue(result.contains(booking1));
	}
	
	@Test
	public void testSearchBookingsMadeInPeriod_on_customer_id_expects_customer_bookings_found() {
		LocalDateTime to = LocalDateTime.now().plusDays(1);
		LocalDateTime from = LocalDateTime.now().minusDays(1);
		List<String> result = IBookings.INSTANCE.searchBookingsMadeInPeriod("861104-0058", from, to);
		assertTrue(result.contains(booking5));
		assertTrue(result.contains(booking6));
	}
	
	@Test
	public void testSearchBookingsMadeInPeriod_on_part_of_customer_id_expects_customer_bookings_found() {
		LocalDateTime to = LocalDateTime.now().plusDays(1);
		LocalDateTime from = LocalDateTime.now().minusDays(1);
		List<String> result = IBookings.INSTANCE.searchBookingsMadeInPeriod("104", from, to);
		assertTrue(result.contains(booking5));
		assertTrue(result.contains(booking6));
	}
	
	@Test
	public void testSearchBookingsMadeInPeriod_empty_string_expects_all_bookings() {
		LocalDateTime to = LocalDateTime.now().plusDays(1);
		LocalDateTime from = LocalDateTime.now().minusDays(1);
		List<String> result = IBookings.INSTANCE.searchBookingsMadeInPeriod("", from, to);
		assertTrue(result.contains(booking1));
		assertTrue(result.contains(booking2));
		assertTrue(result.contains(booking3));
		assertTrue(result.contains(booking4));
		assertTrue(result.contains(booking5));
		assertTrue(result.contains(booking6));
		assertTrue(result.size() == 6);
	}

	@Test
	public void testSearchBookingsWithStaysInPeriod_empty_string_period_intersects_expects_intersecting_stay_period_bookings() {
		LocalDateTime to = LocalDateTime.of(2015, 2, 22, 0, 0);
		LocalDateTime from = LocalDateTime.of(2015, 2, 21, 0, 0);
		List<String> bookings = IBookings.INSTANCE.searchBookingsWithStaysInPeriod("", from, to);
		assertTrue(bookings.contains(booking4));
		assertTrue(bookings.contains(booking5));
		assertTrue(bookings.contains(booking6));
		assertTrue(bookings.size() == 3);
	}
	
	@Test
	public void testSearchBookingsWithStaysInPeriod_empty_string_period_does_not_intersect_expects_no_bookings() {
		LocalDateTime to = LocalDateTime.of(2015, 3, 22, 0, 0);
		LocalDateTime from = LocalDateTime.of(2015, 3, 21, 0, 0);
		List<String> bookings = IBookings.INSTANCE.searchBookingsWithStaysInPeriod("", from, to);
		assertTrue(bookings.isEmpty());
	}
	
	@Test
	public void testSearchBookingsWithStaysInPeriod_empty_string_period_overlaps_expects_overlapped_stay_period_bookings() {
		LocalDateTime to = LocalDateTime.of(2015, 2, 24, 0, 0);
		LocalDateTime from = LocalDateTime.of(2015, 2, 21, 0, 0);
		List<String> bookings = IBookings.INSTANCE.searchBookingsWithStaysInPeriod("", from, to);
		assertTrue(bookings.contains(booking4));
		assertTrue(bookings.contains(booking5));
		assertTrue(bookings.contains(booking6));
		assertTrue(bookings.size() == 3);
	}
	
	@Test
	public void testSearchBookingsWithStaysInPeriod_no_bookings_with_stays_in_period_expects_no_bookings_found() {
		LocalDateTime to = LocalDateTime.of(2015, 3, 24, 0, 0);
		LocalDateTime from = LocalDateTime.of(2015, 3, 21, 0, 0);
		List<String> bookings = IBookings.INSTANCE.searchBookingsWithStaysInPeriod("", from, to);
		assertTrue(bookings.isEmpty());
	}
	
	@Test
	public void testSearchBookingsWithStaysInPeriod_exact_id_match_expects_first_element_in_result() {
		LocalDateTime to = LocalDateTime.of(2015, 2, 24, 0, 0);
		LocalDateTime from = LocalDateTime.of(2015, 2, 21, 0, 0);
		List<String> result = IBookings.INSTANCE.searchBookingsWithStaysInPeriod(booking4, from, to);
		assertTrue(result.get(0).equals(booking4));
		assertTrue(result.size() == 1);
	}
	
	@Test
	public void testSearchBookingsWithStaysInPeriod_id_match_somewhat_expects_booking_in_result() {
		LocalDateTime to = LocalDateTime.of(2015, 2, 24, 0, 0);
		LocalDateTime from = LocalDateTime.of(2015, 2, 21, 0, 0);
		List<String> result = IBookings.INSTANCE.searchBookingsWithStaysInPeriod(booking4.substring(2), from, to);
		assertTrue(result.contains(booking4));
	}
	
	@Test
	public void testSearchBookingsWithStaysInPeriod_on_customer_id_expects_customer_bookings_found() {
		LocalDateTime to = LocalDateTime.of(2015, 2, 24, 0, 0);
		LocalDateTime from = LocalDateTime.of(2015, 2, 21, 0, 0);
		List<String> result = IBookings.INSTANCE.searchBookingsWithStaysInPeriod("861104-0058", from, to);
		assertTrue(result.contains(booking5));
		assertTrue(result.contains(booking6));
	}
	
	@Test
	public void testSearchBookingsWithStaysInPeriod_on_part_of_customer_id_expects_customer_bookings_found() {
		LocalDateTime to = LocalDateTime.of(2015, 2, 24, 0, 0);
		LocalDateTime from = LocalDateTime.of(2015, 2, 21, 0, 0);
		List<String> result = IBookings.INSTANCE.searchBookingsWithStaysInPeriod("104", from, to);
		assertTrue(result.contains(booking5));
		assertTrue(result.contains(booking6));
	}

	@Test
	public void testSearchForAvailableBookablesInPeriod() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAvailableBookablesInPeriod_period_intersects_expects_non_intersecting_bookables() {
		LocalDateTime to = LocalDateTime.of(2015, 2, 22, 0, 0);
		LocalDateTime from = LocalDateTime.of(2015, 2, 21, 0, 0);
		List<String> bookables = IBookings.INSTANCE.getAvailableBookablesInPeriod(from, to);
		assertTrue(bookables.contains("101"));
		assertTrue(bookables.contains("202"));
		assertTrue(bookables.contains("303"));
		assertTrue(bookables.contains("501"));
		assertTrue(bookables.contains("655"));
		assertTrue(bookables.size() == 5);
	}
	
	@Test
	public void testGetAvailableBookablesInPeriod_period_overlaps_expects_expects_non_intersecting_bookables() {
		LocalDateTime to = LocalDateTime.of(2015, 2, 24, 0, 0);
		LocalDateTime from = LocalDateTime.of(2015, 2, 21, 0, 0);
		List<String> bookables = IBookings.INSTANCE.getAvailableBookablesInPeriod(from, to);
		assertTrue(bookables.contains("101"));
		assertTrue(bookables.contains("202"));
		assertTrue(bookables.contains("303"));
		assertTrue(bookables.contains("501"));
		assertTrue(bookables.contains("655"));
		assertTrue(bookables.size() == 5);
	}
	
	
	@Test
	public void testGetAvailableBookablesInPeriod_period_does_not_intersect_expects_all_bookables() {
		LocalDateTime to = LocalDateTime.of(2015, 3, 22, 0, 0);
		LocalDateTime from = LocalDateTime.of(2015, 3, 21, 0, 0);
		List<String> bookables = IBookings.INSTANCE.getAvailableBookablesInPeriod(from, to);
		assertTrue(bookables.contains("101"));
		assertTrue(bookables.contains("202"));
		assertTrue(bookables.contains("303"));
		assertTrue(bookables.contains("501"));
		assertTrue(bookables.contains("653"));
		assertTrue(bookables.contains("654"));
		assertTrue(bookables.contains("655"));
		assertTrue(bookables.contains("23"));
		assertTrue(bookables.contains("24"));
		assertTrue(bookables.contains("25"));
		assertTrue(bookables.size() == 10);
	}
	
	@Test
	public void testGetAvailableBookablesInPeriod_period_overlaps_all_bookings_expects_all_unbooked_bookables() {
		LocalDateTime to = LocalDateTime.of(2015, 3, 1, 0, 0);
		LocalDateTime from = LocalDateTime.of(2015, 2, 1, 0, 0);
		List<String> bookables = IBookings.INSTANCE.getAvailableBookablesInPeriod(from, to);
		assertTrue(bookables.contains("501"));
		assertTrue(bookables.contains("655"));
		assertTrue(bookables.size() == 2);
	}
	

	@Test
	public void testAddBookingRequest_expects_request_added() {
		String reqID = IRequests.INSTANCE.addRequest("korv");
		IBookings.INSTANCE.addBookingRequest(booking2, reqID);
		List<String> requests = IBookings.INSTANCE.getBookingRequests(booking2);
		assertTrue(requests.contains(reqID));
		assertTrue(requests.size() == 1);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddBookingRequest_invalid_booking_expects_exception() {
		IBookings.INSTANCE.addBookingRequest("finnsej", "someid");
	}

	@Test
	public void testRemoveBookingRequest_expects_request_removed() {
		String reqID = IRequests.INSTANCE.addRequest("korv");
		IBookings.INSTANCE.addBookingRequest(booking2, reqID);
		IBookings.INSTANCE.removeBookingRequest(booking2, reqID);
		List<String> requests = IBookings.INSTANCE.getBookingRequests(booking2);
		assertFalse(requests.contains(reqID));
		assertTrue(requests.size() == 0);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRemoveBookingRequest_invalid_booking_expects_exception() {
		String reqID = IRequests.INSTANCE.addRequest("korv");
		IBookings.INSTANCE.addBookingRequest(booking2, reqID);
		IBookings.INSTANCE.removeBookingRequest("finnsej", "someid");
	}

	@Test
	public void testGetBookingRequests_expects_requests() {
		String reqID = IRequests.INSTANCE.addRequest("korv");
		IBookings.INSTANCE.addBookingRequest(booking2, reqID);
		List<String> requests = IBookings.INSTANCE.getBookingRequests(booking2);
		assertTrue(requests.contains(reqID));
		assertTrue(requests.size() == 1);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetBookingRequests_invalid_booking_expects_exception() {
		IBookings.INSTANCE.getBookingRequests("finnsej");
	}

	@Test(expected=InsufficientFundsException.class)
	public void testPayBookingBills_insufficient_funds_expects_exception() throws InvalidIDException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		IBookings.INSTANCE.payBookingBills(booking2);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testPayBookingBills_invalid_booking_expects_exception() throws InvalidIDException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		IBookings.INSTANCE.payBookingBills("finnsej");
	}
	
	@Test
	public void testPayBookingBills_sufficient_funds_expects_bills_payed() throws InvalidIDException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		AdministratorRequires.instance().makeDeposit("34336534", "655", 10, 18, "Greger","Gregersson", 100000);
		List<String> stays = IBookings.INSTANCE.getBookedStaysOfBooking(booking2);
		List<String> bills = new ArrayList<String>();
		for (String stay : stays) {
			bills.addAll(IStays.INSTANCE.getAllUnpayedBillsOfHotelStay(stay));
		}
		IBookings.INSTANCE.payBookingBills(booking2);
		assertTrue(AdministratorRequires.instance().getBalance("34336534", "655", 10, 18, "Greger","Gregersson") < 100000);
		for (String bill : bills) {
			assertTrue(IBills.INSTANCE.getIsBillPaid(bill));
		}
		// Cleanup
		CustomerRequires.instance().makePayment("34336534", "655", 10, 18, "Greger","Gregersson", AdministratorRequires.instance().getBalance("34336534", "655", 10, 18, "Greger","Gregersson"));
	}

	@Test(expected=InsufficientFundsException.class)
	public void testPayStayBills_insufficient_funds_expects_exception() throws InvalidIDException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		IBookings.INSTANCE.payStayBills(booking2, IBookings.INSTANCE.getBookedStaysOfBooking(booking2).get(0));
	}
	
	
	@Test(expected=InvalidIDException.class)
	public void testPayStayBills_invalid_booking_expects_exception() throws InvalidIDException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		IBookings.INSTANCE.payStayBills("finnsej", IBookings.INSTANCE.getBookedStaysOfBooking(booking2).get(0));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testPayStayBills_invalid_stay_expects_exception() throws InvalidIDException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		IBookings.INSTANCE.payStayBills(booking2, "finnsej");
	}
	
	@Test
	public void testPayStayBills_sufficient_funds_expects_bills_payed() throws InvalidIDException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		AdministratorRequires.instance().makeDeposit("34336534", "655", 10, 18, "Greger","Gregersson", 100000);
		List<String> stays = IBookings.INSTANCE.getBookedStaysOfBooking(booking2);
		List<String> bills = new ArrayList<String>();
		bills.addAll(IStays.INSTANCE.getAllUnpayedBillsOfHotelStay(stays.get(0)));
		IBookings.INSTANCE.payStayBills(booking2, stays.get(0));
		assertTrue(AdministratorRequires.instance().getBalance("34336534", "655", 10, 18, "Greger","Gregersson") < 100000);
		for (String bill : bills) {
			assertTrue(IBills.INSTANCE.getIsBillPaid(bill));
		}
		// Cleanup
		CustomerRequires.instance().makePayment("34336534", "655", 10, 18, "Greger","Gregersson", AdministratorRequires.instance().getBalance("34336534", "655", 10, 18, "Greger","Gregersson"));
	}
	
	
	@Test
	public void testSearchForAvailableHotelRoomsInPeriod() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchForAvailableHostelBedsInPeriod() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchForAvailableConferenceRoomsInPeriod() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAvailableHotelRoomsInPeriod() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAvailableConferenceRoomsInPeriod() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAvailableHostelBedsInPeriod() {
		fail("Not yet implemented");
	}

}
