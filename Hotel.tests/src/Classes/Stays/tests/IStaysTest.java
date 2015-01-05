package Classes.Stays.tests;

import static org.junit.Assert.*;

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
import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;
import Classes.Bills.IBills;
import Classes.Bookables.ConferenceRoomCategory;
import Classes.Bookables.HotelRoomCategory;
import Classes.Bookables.IBookablesManage;
import Classes.Bookings.IBookings;
import Classes.Customers.ICustomers;
import Classes.Guests.IGuests;
import Classes.Inventory.IManageInventory;
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
	private static String booking1;
	private static String stay2;
	private static String stay3;
	private static String stay4;
	private static String stay5;
	private static String stay6;
	private static String stay7;
	private static String stay8;
	
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
		IBookablesManage.INSTANCE.addConferenceRoom("601", 13000, "desc13", 13, "loc13", ConferenceRoomCategory.DINING_ROOM, 30);
		IBookablesManage.INSTANCE.addHotelRoom("403", 2000, "desc7", 7, "loc7", HotelRoomCategory.FAMILY_ROOM, 4);	
		IBookablesManage.INSTANCE.addHotelRoom("777", 2000, "desc77", 77, "loc77", HotelRoomCategory.FAMILY_ROOM, 4);	
		IBookablesManage.INSTANCE.addHostelBed("1", 2, "desc1", "403");
		
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
		
		List<String> bookableList7 = new ArrayList<String>();
		bookableList7.add("777");
		
		List<String> bookableList8 = new ArrayList<String>();
		bookableList8.add("1");
		

		booking1 = IBookings.INSTANCE.makeBooking(bookableList1, "760911-0078", LocalDateTime.of(2015, 1, 1, 15, 0), LocalDateTime.of(2016, 1, 5, 10, 0), 4, "12342352", "523", 9, 17, "Alfred","Johansson", 0, true);
		String booking2 = IBookings.INSTANCE.makeBooking(bookableList2, "760911-0078", LocalDateTime.of(2016, 1, 6, 15, 0), LocalDateTime.of(2017, 4, 18, 10, 0), 2, "12342352", "523", 9, 17, "Alfred","Johansson", 0.2, true);
		String booking3 = IBookings.INSTANCE.makeBooking(bookableList3, "750411-0068", LocalDateTime.of(2015, 1, 4, 15, 0), LocalDateTime.of(2017, 4, 20, 10, 0), 2, "23453262", "833", 7, 18, "Sigurd","Matsson", 0.2, false);
		String booking4 = IBookings.INSTANCE.makeBooking(bookableList4, "930607-0098", LocalDateTime.of(2015, 1, 1, 15, 0), LocalDateTime.of(2015, 1, 2, 10, 0), 2, "34563532", "831", 11, 19, "Yvar","Svensson", 0, true);
		String booking5 = IBookings.INSTANCE.makeBooking(bookableList5, "861008-0028", LocalDateTime.of(2015, 1, 2, 8, 0), LocalDateTime.of(2017, 4, 23, 17, 0), 4, "45565426", "892", 1, 17, "Anders","Hallgren", 0.2, true);
		String booking6 = IBookings.INSTANCE.makeBooking(bookableList6, "861008-0028", LocalDateTime.of(2015, 1, 2, 8, 0), LocalDateTime.of(2017, 4, 22, 17, 0), 6, "45565426", "892", 1, 17, "Anders","Hallgren", 0, true);
		String booking7 = IBookings.INSTANCE.makeBooking(bookableList7, "750411-0068", LocalDateTime.of(2015, 1, 2, 8, 0), LocalDateTime.of(2017, 4, 22, 17, 0), 2, "23453262", "833", 7, 18, "Sigurd","Matsson", 0, true);
		String booking8 = IBookings.INSTANCE.makeBooking(bookableList8, "750411-0068", LocalDateTime.of(2015, 1, 2, 8, 0), LocalDateTime.of(2017, 4, 22, 17, 0), 1, "23453262", "833", 7, 18, "Sigurd","Matsson", 0, true);
		
		stay1 = IBookings.INSTANCE.getBookedStaysOfBooking(booking1).get(0);
		stay2 = IBookings.INSTANCE.getBookedStaysOfBooking(booking2).get(0);
		stay3 = IBookings.INSTANCE.getBookedStaysOfBooking(booking3).get(0);
		stay4 = IBookings.INSTANCE.getBookedStaysOfBooking(booking4).get(0);
		stay5 = IBookings.INSTANCE.getBookedStaysOfBooking(booking5).get(0);
		stay6 = IBookings.INSTANCE.getBookedStaysOfBooking(booking6).get(0);
		stay7 = IBookings.INSTANCE.getBookedStaysOfBooking(booking7).get(0);
		stay8 = IBookings.INSTANCE.getBookedStaysOfBooking(booking8).get(0);
		
		AdministratorRequires.instance().makeDeposit("12342352", "523", 9, 17, "Alfred","Johansson", 10000000);
		AdministratorRequires.instance().makeDeposit("34563532", "831", 11, 19, "Yvar","Svensson", 10000000);
		AdministratorRequires.instance().makeDeposit("45565426", "892", 1, 17, "Anders","Hallgren", 10000000);
		
	}
	
	@After
	public void tearDown() throws InvalidIDException, GuestNotCheckedInException, GuestAlreadyCheckedOutException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		
		AdministratorRequires.instance().makeDeposit("23453262", "833", 7, 18, "Sigurd","Matsson", 10000000);
		for (String id : IStays.INSTANCE.getAllHotelStayIDs()) {
			
			for(String gid : IStays.INSTANCE.getCheckedInGuestsOfHotelStay(id)) {
				IStays.INSTANCE.checkOutGuest(id, gid);
			}
			//IStays.INSTANCE.removeStay(id);
			
		}
		for(String id : IBookings.INSTANCE.getAllBookings()) {
			IBookings.INSTANCE.cancelBooking(id);
		}
		
		
		// Cleanup
		CustomerRequires.instance().makePayment("12342352", "523", 9, 17, "Alfred","Johansson", AdministratorRequires.instance().getBalance("12342352", "523", 9, 17, "Alfred","Johansson"));
		CustomerRequires.instance().makePayment("34563532", "831", 11, 19, "Yvar","Svensson", AdministratorRequires.instance().getBalance("34563532", "831", 11, 19, "Yvar","Svensson"));
		CustomerRequires.instance().makePayment("45565426", "892", 1, 17, "Anders","Hallgren", AdministratorRequires.instance().getBalance("45565426", "892", 1, 17, "Anders","Hallgren"));
		CustomerRequires.instance().makePayment("23453262", "833", 7, 18, "Sigurd","Matsson", AdministratorRequires.instance().getBalance("23453262", "833", 7, 18, "Sigurd","Matsson"));
		
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
		for(String id : IBills.INSTANCE.getAllBillIDs()) {
			IBills.INSTANCE.removeBill(id);
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
	
	@Test(expected=InvalidIDException.class)
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
	public void testCheckInGuest_check_in_to_taken_hostel_bed() throws InvalidCheckInDateException, InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay8, "760911-0078");
		IStays.INSTANCE.checkInGuest(stay8, "861008-0028");
	}

	
	@Test(expected=InvalidIDException.class)
	public void testCheckInGuest_check_in_to_conference_room() throws InvalidCheckInDateException, InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay6, "760911-0078");
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
		String stay = IBookings.INSTANCE.getBookedStaysOfBooking(booking).get(0);
		assertTrue(IStays.INSTANCE.getAllHotelStayIDs().contains(stay));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddNewStay_booking_not_exists() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		IStays.INSTANCE.addNewStay("402", "6666", LocalDateTime.of(2018, 1, 1, 15, 0), LocalDateTime.of(2018, 1, 5, 10, 0));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddNewStay_bookable_not_exists() throws InvalidIDException, IllegalArgumentException, SOAPException, InvalidCreditCardException {
		List<String> bookableList = new ArrayList<String>();
		bookableList.add("667788");
		IBookings.INSTANCE.makeBooking(bookableList, "760911-0078", LocalDateTime.of(2020, 1, 1, 15, 0), LocalDateTime.of(2020, 1, 5, 10, 0), 4, "12342352", "523", 9, 17, "Alfred","Johansson", 0, true);
	}

	
	
	
	@Test
	public void testRemoveStay_stay_exists_expects_stay_removed() {
		for(String id : IBookings.INSTANCE.getAllBookings()) {
			for(String sid : IBookings.INSTANCE.getBookedStaysOfBooking(id)) {
				if(sid.equals(stay1)) {
					IBookings.INSTANCE.cancelStayOfBooking(id, sid);
				}
			}
		}
		assertTrue(!IStays.INSTANCE.getAllHotelStayIDs().contains(stay1));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRemoveStay_stay_not_exist() throws InvalidIDException {
		IStays.INSTANCE.removeStay("66666");
	}

	
	
	
	@Test
	public void testAddBillToStay_stay_and_bill_exists_expects_bill_added_to_stay() {
		String bill = IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 1);
		IStays.INSTANCE.addBillToStay(stay1, bill);
		assertTrue(IStays.INSTANCE.getBillsOfHotelStay(stay1).contains(bill));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddBillToStay_bill_not_exist() throws InvalidIDException {
		IStays.INSTANCE.addBillToStay(stay1, "66666");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddBillToStay_stay_not_exist() throws InvalidIDException {
		IStays.INSTANCE.addBillToStay("66666", "66666");
	}
	
	
	

	@Test
	public void testCheckOutGuest_stay_exists_and_guest_exists_in_stay_expects_guets_checked_out() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException, GuestNotCheckedInException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		IStays.INSTANCE.checkInGuest(stay1, "760911-0078");
		IStays.INSTANCE.checkOutGuest(stay1, "760911-0078");
		assertTrue(IStays.INSTANCE.getCheckedOutGuestsOfHotelStay(stay1).contains("760911-0078"));
	}
	
	@Test(expected=GuestNotCheckedInException.class)
	public void testCheckOutGuest_guest_not_exist_in_stay() throws InvalidIDException, GuestNotCheckedInException, GuestAlreadyCheckedOutException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		IStays.INSTANCE.checkOutGuest(stay1, "760911-0078");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testCheckOutGuest_stay_not_exist() throws InvalidIDException, GuestNotCheckedInException, GuestAlreadyCheckedOutException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		IStays.INSTANCE.checkOutGuest("66666", "760911-0078");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testCheckOutGuest_guest_not_exist() throws InvalidIDException, GuestNotCheckedInException, GuestAlreadyCheckedOutException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		IStays.INSTANCE.checkOutGuest(stay1, "666666");
	}
	
	@Test(expected=GuestAlreadyCheckedOutException.class)
	public void testCheckOutGuest_guest_already_checked_out() throws GuestAlreadyCheckedOutException, InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestNotCheckedInException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		IStays.INSTANCE.checkInGuest(stay1, "760911-0078");
		IStays.INSTANCE.checkOutGuest(stay1, "760911-0078");
		IStays.INSTANCE.checkOutGuest(stay1, "760911-0078");
	}
	
	@Test(expected=GuestNotCheckedInException.class)
	public void testCheckOutGuest_guest_not_checked_in() throws GuestNotCheckedInException, InvalidIDException, GuestAlreadyCheckedOutException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		IStays.INSTANCE.checkOutGuest(stay1, "760911-0078");
	}
	
	@Test(expected=InsufficientFundsException.class)
	public void testCheckOutGuest_bills_not_paid() throws InsufficientFundsException, InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException, GuestNotCheckedInException, SOAPException, InvalidCreditCardException {
		IStays.INSTANCE.checkInGuest(stay7, "760911-0078");
		IStays.INSTANCE.checkOutGuest(stay7, "760911-0078");
	}
	
	
	
	
	@Test
	public void testAddResponsibleCreditCard_stay_exists_and_valid_creditcard_expects_card_added_to_stay() throws InvalidIDException, SOAPException, InvalidCreditCardException {
		IStays.INSTANCE.addResponsibleCreditCard(stay3, "34563532", "831", 11, 19, "Yvar","Svensson");
		assertTrue(IStays.INSTANCE.isResponsibleCreditCardAdded(stay3));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddResponsibleCreditCard_stay_not_exist() throws InvalidIDException, SOAPException, InvalidCreditCardException {
		IStays.INSTANCE.addResponsibleCreditCard("6666", "34563532", "831", 11, 19, "Yvar","Svensson");
	}
	
	@Test(expected=InvalidCreditCardException.class)
	public void testAddResponsibleCreditCard_stay_exists_and_not_valid_creditcard() throws InvalidCreditCardException, InvalidIDException, SOAPException {
		IStays.INSTANCE.addResponsibleCreditCard(stay3, "6666", "666", 1, 1, "a","b");
	}
	
	
	
	
	@Test
	public void testChangeResponsibleCreditCard_stay_exists_and_valid_creditcard_expects_card_added_to_stay() throws InvalidIDException, SOAPException, InvalidCreditCardException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException, GuestNotCheckedInException, InsufficientFundsException {
		double originalBalance = AdministratorRequires.instance().getBalance("45565426", "892", 1, 17, "Anders","Hallgren");
		IStays.INSTANCE.changeResponsibleCreditCard(stay1, "45565426", "892", 1, 17, "Anders","Hallgren");
		IStays.INSTANCE.checkInGuest(stay1, "760911-0078");
		IStays.INSTANCE.checkOutGuest(stay1, "760911-0078");
		assertTrue(AdministratorRequires.instance().getBalance("45565426", "892", 1, 17, "Anders","Hallgren") < originalBalance);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeResponsibleCreditCard_stay_not_exist() throws InvalidIDException, SOAPException, InvalidCreditCardException {
		IStays.INSTANCE.changeResponsibleCreditCard("6666", "45565426", "892", 1, 17, "Anders","Hallgren");
	}
	
	@Test(expected=InvalidCreditCardException.class)
	public void testChangeResponsibleCreditCard_stay_exists_and_not_valid_creditcard() throws InvalidCreditCardException, InvalidIDException, SOAPException {
		IStays.INSTANCE.changeResponsibleCreditCard(stay1, "66666", "666", 1, 1, "a","b");
	}
	
	
	
	
	@Test
	public void testGetGuestsOfHotelStay_stay_exists_expected_list_of_guests_in_stay() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		IStays.INSTANCE.checkInGuest(stay1, "760912-0016");
		IStays.INSTANCE.checkInGuest(stay1, "760913-0094");
		List<String> guests = IStays.INSTANCE.getGuestsOfHotelStay(stay1);
		assertTrue(guests.size() == 3);
		assertTrue(guests.contains("861008-0028"));
		assertTrue(guests.contains("760912-0016"));
		assertTrue(guests.contains("760913-0094"));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetGuestsOfHotelStay_stay_not_exist() throws InvalidIDException {
		IStays.INSTANCE.getGuestsOfHotelStay("6666");
	}
	
	
	
	
	@Test
	public void testGetBillsOfHotelStay_stay_exists_expected_list_of_bills_in_stay() {
		String bill = IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 1);
		IStays.INSTANCE.addBillToStay(stay1, bill);
		assertTrue(IStays.INSTANCE.getBillsOfHotelStay(stay1).contains(bill));
		IBills.INSTANCE.removeBill(bill);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetBillsOfHotelStay_stay_not_exist() throws InvalidIDException {
		IStays.INSTANCE.getBillsOfHotelStay("6666");
	}
	
	
	
	
	@Test
	public void testGetBookableOfHotelStay_stay_exists_expected_bookable_in_stay() {
		assertTrue(IStays.INSTANCE.getBookableOfHotelStay(stay1).equals("402"));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetBookableOfHotelStay_stay_not_exist() throws InvalidIDException {
		IStays.INSTANCE.getBookableOfHotelStay("6666");
	}
	
	
	
	
	@Test
	public void testGetBookingOfHotelStay_stay_exists_expected_booking_in_stay() {
		assertTrue(IStays.INSTANCE.getBookingOfHotelStay(stay1).equals(booking1));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetBookingOfHotelStay_stay_not_exist() throws InvalidIDException {
		IStays.INSTANCE.getBookingOfHotelStay("6666");
	}
	
	
	
	
	@Test
	public void testGetAllHotelStayIDs_expected_non_null_list_with_stays() {
		List<String> staysList = IStays.INSTANCE.getAllHotelStayIDs();
		assertTrue(staysList.size() == 8);
		assertTrue(staysList.contains(stay1));
		assertTrue(staysList.contains(stay2));
		assertTrue(staysList.contains(stay3));
		assertTrue(staysList.contains(stay4));
		assertTrue(staysList.contains(stay5));
		assertTrue(staysList.contains(stay6));
		assertTrue(staysList.contains(stay7));
		assertTrue(staysList.contains(stay8));
	}

	
	
	
	@Test
	public void testGetCheckedInGuestsOfHotelStay_stay_exists_expected_list_of_checked_in_guests() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		IStays.INSTANCE.checkInGuest(stay1, "760912-0016");
		IStays.INSTANCE.checkInGuest(stay1, "760913-0094");
		List<String> guests = IStays.INSTANCE.getCheckedInGuestsOfHotelStay(stay1);
		assertTrue(guests.size() == 3);
		assertTrue(guests.contains("861008-0028"));
		assertTrue(guests.contains("760912-0016"));
		assertTrue(guests.contains("760913-0094"));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetCheckedInGuestsOfHotelStay_stay_not_exist() throws InvalidIDException {
		IStays.INSTANCE.getCheckedInGuestsOfHotelStay("6666");
	}

	
	
	
	@Test
	public void testGetCheckedOutGuestsOfHotelStay_stay_exists_expected_list_of_checked_out_guests() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException, GuestNotCheckedInException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		IStays.INSTANCE.checkInGuest(stay1, "760912-0016");
		IStays.INSTANCE.checkInGuest(stay1, "760913-0094");
		IStays.INSTANCE.checkOutGuest(stay1, "760913-0094");
		IStays.INSTANCE.checkOutGuest(stay1, "760912-0016");
		List<String> guests = IStays.INSTANCE.getCheckedOutGuestsOfHotelStay(stay1);
		assertTrue(guests.size() == 2);
		assertTrue(guests.contains("760913-0094"));
		assertTrue(guests.contains("760912-0016"));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetCheckedOutGuestsOfHotelStay_stay_not_exist() throws InvalidIDException {
		IStays.INSTANCE.getCheckedOutGuestsOfHotelStay("6666");
	}

	
	
	
	@Test
	public void testSearchHotelStays_exact_id_match_expects_first_element_in_result() {
		List<String> search = IStays.INSTANCE.searchHotelStays(stay1);
		assertTrue(search.get(0).equals(stay1));
	}
	
	@Test
	public void testSearchHotelStays_id_match_somewhat_expects_stay_in_result() {
		List<String> search = IStays.INSTANCE.searchHotelStays(stay1.substring(2));
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStays_on_bookable_id_expects_bookable_stay_found() {
		List<String> search = IStays.INSTANCE.searchHotelStays(IStays.INSTANCE.getBookableOfHotelStay(stay1));
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStays_on_part_of_bookable_id_expects_bookable_stay_found() {
		List<String> search = IStays.INSTANCE.searchHotelStays(IStays.INSTANCE.getBookableOfHotelStay(stay1).substring(2));
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStays_on_booking_id_expects_booking_stay_found() {
		List<String> search = IStays.INSTANCE.searchHotelStays(IStays.INSTANCE.getBookingOfHotelStay(stay1));
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStays_on_part_of_booking_id_expects_booking_stay_found() {
		List<String> search = IStays.INSTANCE.searchHotelStays(IStays.INSTANCE.getBookingOfHotelStay(stay1).substring(2));
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStays_on_checked_in_guest_id_expects_checked_in_guest_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStays("861008-0028");
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStays_on_part_of_checked_in_guest_id_expects_checked_in_guest_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStays("861008");
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStays_on_checked_in_guest_by_first_name_id_expects_checked_in_guest_by_first_name_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStays("Anders");
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStays_on_part_of_checked_in_guest_by_first_name_id_expects_checked_in_guest_by_first_name_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStays("Ande");
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStays_on_checked_in_guest_by_last_name_id_expects_checked_in_guest_by_last_name_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStays("Hallgren");
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStays_on_part_of_checked_in_guest_by_last_name_id_expects_checked_in_guest_by_last_name_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStays("Hallg");
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStays_on_checked_in_guest_by_email_id_expects_checked_in_guest_by_email_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStays("ah@korv.se");
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStays_on_part_of_checked_in_guest_by_email_id_expects_checked_in_guest_by_email_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStays("ah@korv");
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStays_on_checked_in_guest_by_phone_id_expects_checked_in_guest_by_phone_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStays("0700-000074");
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStays_on_part_of_checked_in_guest_by_phone_id_expects_checked_in_guest_by_phone_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStays("000074");
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStays_on_checked_out_guest_id_expects_checked_out_guest_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException, GuestNotCheckedInException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		IStays.INSTANCE.checkOutGuest(stay1, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStays("861008-0028");
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStays_empty_string_expects_all_bookings() {
		List<String> search = IStays.INSTANCE.searchHotelStays("");
		assertTrue(search.size() == 8);
		assertTrue(search.contains(stay1));
		assertTrue(search.contains(stay2));
		assertTrue(search.contains(stay3));
		assertTrue(search.contains(stay4));
		assertTrue(search.contains(stay5));
		assertTrue(search.contains(stay6));
		assertTrue(search.contains(stay7));
		assertTrue(search.contains(stay8));
	}
	
	@Test
	public void testSearchHotelStaysWithinPeriod_exact_id_match_expects_first_element_in_result() {
		List<String> search = IStays.INSTANCE.searchHotelStaysWithinPeriod(stay1, LocalDateTime.of(2015, 1, 1, 14, 0), LocalDateTime.of(2015, 5, 5, 10, 0));
		assertTrue(search.get(0).equals(stay1));
	}
	
	@Test
	public void testSearchHotelStaysWithinPeriod_id_match_somewhat_expects_stay_in_result() {
		List<String> search = IStays.INSTANCE.searchHotelStaysWithinPeriod(stay1.substring(2), LocalDateTime.of(2015, 1, 1, 14, 0), LocalDateTime.of(2015, 5, 5, 10, 0));
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStaysWithinPeriod_on_bookable_id_expects_bookable_stay_found() {
		List<String> search = IStays.INSTANCE.searchHotelStaysWithinPeriod(IStays.INSTANCE.getBookableOfHotelStay(stay1), LocalDateTime.of(2015, 1, 1, 14, 0), LocalDateTime.of(2015, 5, 5, 10, 0));
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStaysWithinPeriod_on_part_of_bookable_id_expects_bookable_stay_found() {
		List<String> search = IStays.INSTANCE.searchHotelStaysWithinPeriod(IStays.INSTANCE.getBookableOfHotelStay(stay1).substring(2), LocalDateTime.of(2015, 1, 1, 14, 0), LocalDateTime.of(2015, 5, 5, 10, 0));
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStaysWithinPeriod_on_booking_id_expects_booking_stay_found() {
		List<String> search = IStays.INSTANCE.searchHotelStaysWithinPeriod(IStays.INSTANCE.getBookingOfHotelStay(stay1), LocalDateTime.of(2015, 1, 1, 14, 0), LocalDateTime.of(2015, 5, 5, 10, 0));
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStaysWithinPeriod_on_part_of_booking_id_expects_booking_stay_found() {
		List<String> search = IStays.INSTANCE.searchHotelStaysWithinPeriod(IStays.INSTANCE.getBookingOfHotelStay(stay1).substring(2), LocalDateTime.of(2015, 1, 1, 14, 0), LocalDateTime.of(2015, 5, 5, 10, 0));
		assertTrue(search.contains(stay1));
	}
	
	@Test
	public void testSearchHotelStaysWithinPeriod_on_checked_in_guest_id_expects_checked_in_guest_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		IStays.INSTANCE.checkInGuest(stay5, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStaysWithinPeriod("861008-0028", LocalDateTime.of(2015, 1, 1, 14, 0), LocalDateTime.of(2015, 1, 2, 3, 0));
		assertTrue(search.contains(stay1));
		assertFalse(search.contains(stay5));
	}
	
	@Test
	public void testSearchHotelStaysWithinPeriod_on_part_of_checked_in_guest_id_expects_checked_in_guest_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		IStays.INSTANCE.checkInGuest(stay5, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStaysWithinPeriod("861008", LocalDateTime.of(2015, 1, 1, 14, 0), LocalDateTime.of(2015, 1, 2, 3, 0));
		assertTrue(search.contains(stay1));
		assertFalse(search.contains(stay5));
	}
	
	@Test
	public void testSearchHotelStaysWithinPeriod_on_checked_in_guest_by_first_name_id_expects_checked_in_guest_by_first_name_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		IStays.INSTANCE.checkInGuest(stay5, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStaysWithinPeriod("Anders", LocalDateTime.of(2015, 1, 1, 14, 0), LocalDateTime.of(2015, 1, 2, 3, 0));
		assertTrue(search.contains(stay1));
		assertFalse(search.contains(stay5));
	}
	
	@Test
	public void testSearchHotelStaysWithinPeriod_on_part_of_checked_in_guest_by_first_name_id_expects_checked_in_guest_by_first_name_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		IStays.INSTANCE.checkInGuest(stay5, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStaysWithinPeriod("Ande", LocalDateTime.of(2015, 1, 1, 14, 0), LocalDateTime.of(2015, 1, 2, 3, 0));
		assertTrue(search.contains(stay1));
		assertFalse(search.contains(stay5));
	}
	
	@Test
	public void testSearchHotelStaysWithinPeriod_on_checked_in_guest_by_last_name_id_expects_checked_in_guest_by_last_name_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		IStays.INSTANCE.checkInGuest(stay5, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStaysWithinPeriod("Hallgren", LocalDateTime.of(2015, 1, 1, 14, 0), LocalDateTime.of(2015, 1, 2, 3, 0));
		assertTrue(search.contains(stay1));
		assertFalse(search.contains(stay5));
	}
	
	@Test
	public void testSearchHotelStaysWithinPeriod_on_part_of_checked_in_guest_by_last_name_id_expects_checked_in_guest_by_last_name_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		IStays.INSTANCE.checkInGuest(stay5, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStaysWithinPeriod("Hallg", LocalDateTime.of(2015, 1, 1, 14, 0), LocalDateTime.of(2015, 1, 2, 3, 0));
		assertTrue(search.contains(stay1));
		assertFalse(search.contains(stay5));
	}
	
	@Test
	public void testSearchHotelStaysWithinPeriod_on_checked_in_guest_by_email_id_expects_checked_in_guest_by_email_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		IStays.INSTANCE.checkInGuest(stay5, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStaysWithinPeriod("ah@korv.se", LocalDateTime.of(2015, 1, 1, 14, 0), LocalDateTime.of(2015, 1, 2, 3, 0));
		assertTrue(search.contains(stay1));
		assertFalse(search.contains(stay5));
	}
	
	@Test
	public void testSearchHotelStaysWithinPeriod_on_part_of_checked_in_guest_by_email_id_expects_checked_in_guest_by_email_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		IStays.INSTANCE.checkInGuest(stay5, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStaysWithinPeriod("ah@korv", LocalDateTime.of(2015, 1, 1, 14, 0), LocalDateTime.of(2015, 1, 2, 3, 0));
		assertTrue(search.contains(stay1));
		assertFalse(search.contains(stay5));
	}
	
	@Test
	public void testSearchHotelStaysWithinPeriod_on_checked_in_guest_by_phone_id_expects_checked_in_guest_by_phone_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		IStays.INSTANCE.checkInGuest(stay5, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStaysWithinPeriod("0700-000074", LocalDateTime.of(2015, 1, 1, 14, 0), LocalDateTime.of(2015, 1, 2, 3, 0));
		assertTrue(search.contains(stay1));
		assertFalse(search.contains(stay5));
	}
	
	@Test
	public void testSearchHotelStaysWithinPeriod_on_part_of_checked_in_guest_by_phone_id_expects_checked_in_guest_by_phone_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		IStays.INSTANCE.checkInGuest(stay5, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStaysWithinPeriod("000074", LocalDateTime.of(2015, 1, 1, 14, 0), LocalDateTime.of(2015, 1, 2, 3, 0));
		assertTrue(search.contains(stay1));
		assertFalse(search.contains(stay5));
	}
	
	@Test
	public void testSearchHotelStaysWithinPeriod_on_checked_out_guest_id_expects_checked_out_guest_stay_found() throws InvalidIDException, ResponsibleCreditCardNotAddedException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException, GuestNotCheckedInException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		IStays.INSTANCE.checkInGuest(stay1, "861008-0028");
		IStays.INSTANCE.checkInGuest(stay5, "861008-0028");
		IStays.INSTANCE.checkOutGuest(stay1, "861008-0028");
		IStays.INSTANCE.checkOutGuest(stay5, "861008-0028");
		List<String> search = IStays.INSTANCE.searchHotelStaysWithinPeriod("861008-0028", LocalDateTime.of(2015, 1, 1, 14, 0), LocalDateTime.of(2015, 1, 2, 3, 0));
		assertTrue(search.contains(stay1));
		assertFalse(search.contains(stay5));
	}
	
	@Test
	public void testSearchHotelStaysWithinPeriod_empty_string_expects_all_bookings_within_time_period() {
		List<String> search = IStays.INSTANCE.searchHotelStaysWithinPeriod("", LocalDateTime.of(2015, 1, 2, 1, 0), LocalDateTime.of(2015, 5, 5, 10, 0));
		assertTrue(search.size() == 7);
		assertTrue(search.contains(stay1));
		assertTrue(search.contains(stay3));
		assertTrue(search.contains(stay4));
		assertTrue(search.contains(stay5));
		assertTrue(search.contains(stay6));
		assertTrue(search.contains(stay7));
		assertTrue(search.contains(stay8));
	}

	
	
	
	@Test
	public void testGetAllHotelStaysWithinPeriod_expected_list_with_stays_within_time_period() {
		List<String> search = IStays.INSTANCE.getAllHotelStaysWithinPeriod(LocalDateTime.of(2015, 1, 2, 1, 0), LocalDateTime.of(2015, 5, 5, 10, 0));
		assertTrue(search.size() == 7);
		assertTrue(search.contains(stay1));
		assertTrue(search.contains(stay3));
		assertTrue(search.contains(stay4));
		assertTrue(search.contains(stay5));
		assertTrue(search.contains(stay6));
		assertTrue(search.contains(stay7));
		assertTrue(search.contains(stay8));
	}

	
	
	
	@Test
	public void testGetAllUnpayedBillsOfHotelStay_stay_exists_expected_list_of_unpayed_bills_in_stay() {
		String bill = IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 1);
		IStays.INSTANCE.addBillToStay(stay1, bill);
		List<String> bills = IStays.INSTANCE.getAllUnpayedBillsOfHotelStay(stay1);
		assertTrue(bills.contains(bill));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetAllUnpayedBillsOfHotelStay_stay_not_exists() throws InvalidIDException {
		IStays.INSTANCE.getAllUnpayedBillsOfHotelStay("6666");
	}

	
	
	
	@Test
	public void testBillCreditCardWithAllUnpaidBillsOfHotelStay_stay_exists_and_valid_creditcard_expected_creditcard_billed_and_bills_set_as_payed() throws InvalidIDException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		IStays.INSTANCE.billCreditCardWithAllUnpaidBillsOfHotelStay(stay1);
	}
	
	@Test(expected=InvalidCreditCardException.class)
	public void testBillCreditCardWithAllUnpaidBillsOfHotelStay_stay_exists_without_creditcard() throws InvalidCreditCardException, InvalidIDException, SOAPException, InsufficientFundsException {
		IStays.INSTANCE.billCreditCardWithAllUnpaidBillsOfHotelStay(stay3);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testBillCreditCardWithAllUnpaidBillsOfHotelStay_stay_not_exist() throws InvalidIDException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		IStays.INSTANCE.billCreditCardWithAllUnpaidBillsOfHotelStay("6666");
	}

	
	
	
	@Test
	public void testIsResponsibleCreditCardAdded_stay_exists_and_creditcard_added_expected_returned_true() {
		assertTrue(IStays.INSTANCE.isResponsibleCreditCardAdded(stay1));
	}
	
	@Test
	public void testIsResponsibleCreditCardAdded_stay_exists_and_creditcard_not_added_expected_returned_false() {
		assertFalse(IStays.INSTANCE.isResponsibleCreditCardAdded(stay3));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testIsResponsibleCreditCardAdded_stay_not_exist() throws InvalidIDException {
		IStays.INSTANCE.isResponsibleCreditCardAdded("6666");
	}

	
	
	
	@Test
	public void testChangePeriodOfStay_stay_exists_expects_time_period_of_stay_changed() {
		IStays.INSTANCE.changePeriodOfStay(stay1, LocalDateTime.of(2015,1,2,15,0), LocalDateTime.of(2015,1,4,10,0));
		assertTrue(IStays.INSTANCE.getFromDateOfHotelStay(stay1).compareTo(LocalDateTime.of(2015,1,2,15,0)) == 0);
		assertTrue(IStays.INSTANCE.getToDateOfHotelStay(stay1).compareTo(LocalDateTime.of(2015,1,4,10,0)) == 0);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangePeriodOfStay_stay_not_exist() throws InvalidIDException {
		IStays.INSTANCE.changePeriodOfStay("6666", LocalDateTime.of(2015,1,2,15,0), LocalDateTime.of(2015,1,4,10,0));
	}

	
	
	
	@Test
	public void testRemoveBillFromStay_stay_and_bill_exists_expected_bill_removed_from_stay() {
		String bill = IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), null, null, null, 1);
		IStays.INSTANCE.addBillToStay(stay1, bill);
		List<String> bills = IStays.INSTANCE.getBillsOfHotelStay(stay1);
		assertTrue(bills.contains(bill));
		IStays.INSTANCE.removeBillFromStay(stay1, bill);
		bills = IStays.INSTANCE.getBillsOfHotelStay(stay1);
		assertFalse(bills.contains(bill));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRemoveBillFromStay_bill_not_exist() throws InvalidIDException {
		IStays.INSTANCE.removeBillFromStay(stay1, "thisbillaintreal");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRemoveBillFromStay_stay_not_exist() throws InvalidIDException {
		IStays.INSTANCE.removeBillFromStay("6666", "thisbilldoesnotmatterifitisreal");
	}
}
