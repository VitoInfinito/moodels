package Classes.Statistics.tests;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
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
import Classes.Statistics.IStatisticsGenerator;
import Classes.Utils.InvalidIDException;

public class IStatisticsGeneratorTest {
	
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

	@Test
	public void testGetOccupancyStatistics_no_bookings_expects_zero_entry_values() {
		LinkedHashMap<LocalDateTime, Integer> stats = IStatisticsGenerator.INSTANCE.getOccupancyStatistics(LocalDateTime.of(2015, 3, 20, 8, 0), LocalDateTime.of(2015, 3, 22, 17, 0));
		assertTrue(stats.keySet().size() == 3);
		assertTrue(stats.values().size() == 3);
		assertTrue(stats.get(LocalDateTime.of(2015, 3, 20, 0, 0)) == 0);
		assertTrue(stats.get(LocalDateTime.of(2015, 3, 21, 0, 0)) == 0);
		assertTrue(stats.get(LocalDateTime.of(2015, 3, 22, 0, 0)) == 0);
	}
	
	@Test
	public void testGetOccupancyStatistics_bookings_made_expects_entry_values_correct() {
		LinkedHashMap<LocalDateTime, Integer> stats = IStatisticsGenerator.INSTANCE.getOccupancyStatistics(LocalDateTime.of(2015, 2, 12, 8, 0), LocalDateTime.of(2015, 2, 23, 17, 0));
		assertTrue(stats.keySet().size() == 12);
		assertTrue(stats.values().size() == 12);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 12, 0, 0)) == 4);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 13, 0, 0)) == 4);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 14, 0, 0)) == 4);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 15, 0, 0)) == 4);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 16, 0, 0)) == 6);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 17, 0, 0)) == 2);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 18, 0, 0)) == 8);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 19, 0, 0)) == 6);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 20, 0, 0)) == 6);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 21, 0, 0)) == 122);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 22, 0, 0)) == 122);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 23, 0, 0)) == 20);
	}

	@Test
	public void testGetRevenueStatistics() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetProfitStatistics() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testGetStaticExpenses() {
		IStatisticsGenerator.INSTANCE.setStaticExpenses(10000);
		assertTrue(IStatisticsGenerator.INSTANCE.getStaticExpenses() == 10000);
		IStatisticsGenerator.INSTANCE.setStaticExpenses(0);
	}
	
	@Test
	public void testSetStaticExpenses() {
		IStatisticsGenerator.INSTANCE.setStaticExpenses(20000);
		assertTrue(IStatisticsGenerator.INSTANCE.getStaticExpenses() == 20000);
		IStatisticsGenerator.INSTANCE.setStaticExpenses(0);
	}

}
