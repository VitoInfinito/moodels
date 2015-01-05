package Classes.Statistics.tests;

import static org.junit.Assert.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedHashMap;
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
import Classes.Inventory.IInventoryAccess;
import Classes.Inventory.IManageInventory;
import Classes.Services.IServicesManager;
import Classes.Statistics.IStatisticsGenerator;
import Classes.Utils.InsufficientFundsException;
import Classes.Utils.InvalidCreditCardException;
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
		
		IStatisticsGenerator.INSTANCE.setStaticExpenses(0);
		
		for (String id : IBills.INSTANCE.getAllBillIDs()) {
			IBills.INSTANCE.removeBill(id);
		}
		
		for (String id : IServicesManager.INSTANCE.getAllServiceIDs()) {
			IServicesManager.INSTANCE.removeService(id);
		}
		
		for (String id : IManageInventory.INSTANCE.getAllItemIDs()) {
			IManageInventory.INSTANCE.removeItem(id);
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
	public void testGetRevenueStatistics_no_payments_expects_zero_entry_values() {
		LinkedHashMap<LocalDateTime, Double> stats = IStatisticsGenerator.INSTANCE.getRevenueStatistics(LocalDateTime.of(2015, 2, 12, 8, 0), LocalDateTime.of(2015, 2, 23, 17, 0));
		assertTrue(stats.keySet().size() == 12);
		assertTrue(stats.values().size() == 12);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 12, 0, 0)) == 0);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 13, 0, 0)) == 0);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 14, 0, 0)) == 0);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 15, 0, 0)) == 0);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 16, 0, 0)) == 0);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 17, 0, 0)) == 0);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 18, 0, 0)) == 0);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 19, 0, 0)) == 0);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 20, 0, 0)) == 0);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 21, 0, 0)) == 0);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 22, 0, 0)) == 0);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 23, 0, 0)) == 0);
	}
	
	@Test
	public void testGetRevenueStatistics_with_payments_expects_entry_values_correct() throws SOAPException, InvalidCreditCardException, InsufficientFundsException {
		AdministratorRequires.instance().makeDeposit("12345678", "234", 3, 17, "Adolf","Eriksson", 90000);
		String service = IServicesManager.INSTANCE.addService("massage", 599, 200);
		List<String> purchasedServices = new ArrayList<String>();
		purchasedServices.add(service);
		
		String item1 = IManageInventory.INSTANCE.addItem("gurka", 99, 40, 20);
		String item2 = IManageInventory.INSTANCE.addItem("korv", 50, 20, 20);
		List<String> purchasedItems = new ArrayList<String>();
		purchasedItems.add(item1);
		purchasedItems.add(item2);
		
		String bill1 = IBills.INSTANCE.addBill(purchasedItems, new ArrayList<String>(), null, null, null, 0);
		String bill2 = IBills.INSTANCE.addBill(new ArrayList<String>(), purchasedServices, null, null, null, 0);
		String bill3 = IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), "303", LocalDateTime.of(2015, 2, 12, 8, 0), LocalDateTime.of(2015, 2, 23, 17, 0), 0.2); // 11 nights in a suite for 3000 a night with 20% discount
		List<String> bills = new ArrayList<String>();
		bills.add(bill1);
		bills.add(bill2);
		bills.add(bill3);
		
		IBills.INSTANCE.payBillsWithCreditCard(bills, "12345678", "234", 3, 17, "Adolf","Eriksson");
		
		LinkedHashMap<LocalDateTime, Double> stats = IStatisticsGenerator.INSTANCE.getRevenueStatistics(LocalDateTime.now().minusDays(1), LocalDateTime.now().plusDays(1));
		
		assertTrue(stats.keySet().size() == 3);
		assertTrue(stats.values().size() == 3);
		
		assertTrue(stats.get(LocalDateTime.of(LocalDateTime.now().minusDays(1).getYear(), LocalDateTime.now().minusDays(1).getMonth(), LocalDateTime.now().minusDays(1).getDayOfMonth(), 0, 0)) == 0);
		// 599 + 99 + 50 + 11 * 3000 * 0.2 = 27148
		assertTrue(stats.get(LocalDateTime.of(LocalDateTime.now().getYear(), LocalDateTime.now().getMonth(), LocalDateTime.now().getDayOfMonth(), 0, 0)) == 27148);
		assertTrue(stats.get(LocalDateTime.of(LocalDateTime.now().plusDays(1).getYear(), LocalDateTime.now().plusDays(1).getMonth(), LocalDateTime.now().plusDays(1).getDayOfMonth(), 0, 0)) == 0);
		
		CustomerRequires.instance().makePayment("12345678", "234", 3, 17, "Adolf","Eriksson", AdministratorRequires.instance().getBalance("12345678", "234", 3, 17, "Adolf","Eriksson"));
	}

	@Test
	public void testGetProfitStatistics_no_payments_expects_negative_static_expenses_entry_values() {
		IStatisticsGenerator.INSTANCE.setStaticExpenses(5000);
		
		LinkedHashMap<LocalDateTime, Double> stats = IStatisticsGenerator.INSTANCE.getProfitStatistics(LocalDateTime.of(2015, 2, 12, 8, 0), LocalDateTime.of(2015, 2, 23, 17, 0));
		assertTrue(stats.keySet().size() == 12);
		assertTrue(stats.values().size() == 12);
		
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 12, 0, 0)) == -5000);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 13, 0, 0)) == -5000);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 14, 0, 0)) == -5000);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 15, 0, 0)) == -5000);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 16, 0, 0)) == -5000);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 17, 0, 0)) == -5000);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 18, 0, 0)) == -5000);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 19, 0, 0)) == -5000);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 20, 0, 0)) == -5000);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 21, 0, 0)) == -5000);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 22, 0, 0)) == -5000);
		assertTrue(stats.get(LocalDateTime.of(2015, 2, 23, 0, 0)) == -5000);
	}
	
	@Test
	public void testGetProfitStatistics_with_payments_expects_entry_values_correct() throws SOAPException, InvalidCreditCardException, InsufficientFundsException {
		IStatisticsGenerator.INSTANCE.setStaticExpenses(5000);
		
		AdministratorRequires.instance().makeDeposit("12345678", "234", 3, 17, "Adolf","Eriksson", 90000);
		String service = IServicesManager.INSTANCE.addService("massage", 599, 200);
		List<String> purchasedServices = new ArrayList<String>();
		purchasedServices.add(service);
		
		String item1 = IManageInventory.INSTANCE.addItem("gurka", 99, 40, 20);
		String item2 = IManageInventory.INSTANCE.addItem("korv", 50, 20, 20);
		List<String> purchasedItems = new ArrayList<String>();
		purchasedItems.add(item1);
		purchasedItems.add(item2);
		
		String bill1 = IBills.INSTANCE.addBill(purchasedItems, new ArrayList<String>(), null, null, null, 0);
		String bill2 = IBills.INSTANCE.addBill(new ArrayList<String>(), purchasedServices, null, null, null, 0);
		String bill3 = IBills.INSTANCE.addBill(new ArrayList<String>(), new ArrayList<String>(), "303", LocalDateTime.of(2015, 2, 12, 8, 0), LocalDateTime.of(2015, 2, 23, 17, 0), 0.2); // 11 nights in a suite for 3000 a night with 20% discount
		List<String> bills = new ArrayList<String>();
		bills.add(bill1);
		bills.add(bill2);
		bills.add(bill3);
		
		IBills.INSTANCE.payBillsWithCreditCard(bills, "12345678", "234", 3, 17, "Adolf","Eriksson");
		
		LinkedHashMap<LocalDateTime, Double> stats = IStatisticsGenerator.INSTANCE.getProfitStatistics(LocalDateTime.now().minusDays(1), LocalDateTime.now().plusDays(1));
		
		assertTrue(stats.keySet().size() == 3);
		assertTrue(stats.values().size() == 3);
		
		double v = stats.get(LocalDateTime.of(LocalDateTime.now().getYear(), LocalDateTime.now().getMonth(), LocalDateTime.now().getDayOfMonth(), 0, 0));
		assertTrue(stats.get(LocalDateTime.of(LocalDateTime.now().minusDays(1).getYear(), LocalDateTime.now().minusDays(1).getMonth(), LocalDateTime.now().minusDays(1).getDayOfMonth(), 0, 0)) == -5000);
		// 599 + 99 + 50 + 11 * 3000 * 0.2 - (40 + 20 + 200 + 5000) = 21888
		assertTrue(stats.get(LocalDateTime.of(LocalDateTime.now().getYear(), LocalDateTime.now().getMonth(), LocalDateTime.now().getDayOfMonth(), 0, 0)) == 21888);
		assertTrue(stats.get(LocalDateTime.of(LocalDateTime.now().plusDays(1).getYear(), LocalDateTime.now().plusDays(1).getMonth(), LocalDateTime.now().plusDays(1).getDayOfMonth(), 0, 0)) == -5000);
		
		CustomerRequires.instance().makePayment("12345678", "234", 3, 17, "Adolf","Eriksson", AdministratorRequires.instance().getBalance("12345678", "234", 3, 17, "Adolf","Eriksson"));
	}
	
	@Test
	public void testGetStaticExpenses() {
		IStatisticsGenerator.INSTANCE.setStaticExpenses(10000);
		assertTrue(IStatisticsGenerator.INSTANCE.getStaticExpenses() == 10000);
	}
	
	@Test
	public void testSetStaticExpenses() {
		IStatisticsGenerator.INSTANCE.setStaticExpenses(20000);
		assertTrue(IStatisticsGenerator.INSTANCE.getStaticExpenses() == 20000);
	}

}
