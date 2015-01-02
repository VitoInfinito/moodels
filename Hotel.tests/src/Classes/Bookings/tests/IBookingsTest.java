package Classes.Bookings.tests;

import static org.junit.Assert.fail;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import se.chalmers.cse.mdsd1415.banking.administratorRequires.AdministratorRequires;
import Classes.Bookables.ConferenceRoomCategory;
import Classes.Bookables.HotelRoomCategory;
import Classes.Bookables.IBookablesManage;
import Classes.Bookings.IBookings;
import Classes.Customers.ICustomers;
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

	@Test
	public void testMakeBooking() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchBookings() {
		fail("Not yet implemented");
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
