package Classes.Bookings.tests;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.omg.CORBA.IntHolder;

import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;
import Classes.Bills.IBills;
import Classes.Bookables.ConferenceRoomCategory;
import Classes.Bookables.HotelRoomCategory;
import Classes.Bookables.IBookablesManage;
import Classes.Bookings.IBookings;
import Classes.Customers.ICustomers;
import Classes.Stays.IStays;
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
		booking4 = IBookings.INSTANCE.makeBooking(bookables4, "861104-0088", LocalDateTime.of(2015, 2, 21, 15, 0), LocalDateTime.of(2015, 2, 22, 10, 0), 5, "475367456", "567", 7, 17, "Anders","Hallgren", 0, false);
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
	public void testGetBookedStaysOfBooking() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCustomerOfBooking() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNbrGuestOfBooking() {
		fail("Not yet implemented");
	}

	@Test
	public void testCancelBooking() {
		fail("Not yet implemented");
	}

	@Test
	public void testCancelStayOfBooking() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddBookedStayToBooking() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeNbrGuestsOfBooking() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllBookings() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllBookingsWithinPeriod() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllBookingsWithStaysInPeriod() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchBookingsMadeInPeriod() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchBookingsWithStaysInPeriod() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchForAvailableBookablesInPeriod() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetAvailableBookablesInPeriod() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddBookingRequest() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveBookingRequest() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBookingRequests() {
		fail("Not yet implemented");
	}

	@Test
	public void testPayBookingBills() {
		fail("Not yet implemented");
	}

	@Test
	public void testPayStayBills() {
		fail("Not yet implemented");
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
