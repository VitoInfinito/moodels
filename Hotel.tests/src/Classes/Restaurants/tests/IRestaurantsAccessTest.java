package Classes.Restaurants.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Classes.Restaurants.IRestaurantsAccess;
import Classes.Restaurants.IRestaurantsManage;
import Classes.Utils.InvalidIDException;

public class IRestaurantsAccessTest {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

	@Before
	public void setUp() throws Exception {
		IRestaurantsManage.INSTANCE.addRestaurant("testaurant");
		
		IRestaurantsManage.INSTANCE.changeMenuName("testaurant", "The Menu");
		
		IRestaurantsManage.INSTANCE.addMenuItem("testaurant", "10");
		IRestaurantsManage.INSTANCE.addMenuItem("testaurant", "20");
		
		IRestaurantsManage.INSTANCE.addRestaurantTable("testaurant", 4, "1");
		IRestaurantsManage.INSTANCE.addRestaurantTable("testaurant", 6, "2");
		
		ArrayList<String> tables = new ArrayList<String>();
		tables.add("1");
		tables.add("2");
		
		IRestaurantsManage.INSTANCE.makeReservation(
			"testaurant", 
			tables, 
			"010101-0101", 
			LocalDateTime.parse("2014-10-22 12:00", formatter), 
			LocalDateTime.parse("2014-10-22 14:00", formatter)
		);
	}
	
	@After
	public void teardown() {
		for(String id : IRestaurantsAccess.INSTANCE.getAllRestaurantNames()) {
			IRestaurantsManage.INSTANCE.removeRestaurant(id);
		}
	}

	@Test
	public void testGetRestaurantReservations() {
		assertTrue(IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").size() == 1);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRestaurantReservations_notExists_throwsException(){
		IRestaurantsManage.INSTANCE.getRestaurantReservations("apabepacepa");
	}

	@Test
	public void testGetRestaurantTables() {
		assertTrue(IRestaurantsManage.INSTANCE.getRestaurantTables("testaurant").size() == 1);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRestaurantTables_notExists_throwsException(){
		IRestaurantsManage.INSTANCE.getRestaurantTables("apabepacepa");
	}

	@Test
	public void testGetRestaurantTableNumberOfSeats() {
		assertTrue(IRestaurantsManage.INSTANCE.getRestaurantTableNumberOfSeats("testaurant", "1") == 4);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRestaurantTableNumberOfSeats_notExists_throwsException(){
		IRestaurantsManage.INSTANCE.getRestaurantTableNumberOfSeats("apabepacepa", "1");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRestaurantTableNumberOfSeats_tableNotExists_throwsException(){
		IRestaurantsManage.INSTANCE.getRestaurantTableNumberOfSeats("testaurant", "3");
	}

	@Test
	public void testGetAvailableTablesNoneExpectNone() {
		int result = IRestaurantsManage.INSTANCE.getAvailableTables(
						LocalDateTime.parse("2014-10-22 12:30", formatter),
						LocalDateTime.parse("2014-10-22 13:00", formatter),
						"testaurant").size();
		assertTrue(result == 0);
	}
	
	@Test
	public void testGetAvailableTablesAllExpectAll() {
		int result = IRestaurantsManage.INSTANCE.getAvailableTables(
						LocalDateTime.parse("2014-10-23 12:30", formatter),
						LocalDateTime.parse("2014-10-23 13:00", formatter),
						"testaurant").size();
		assertTrue(result == 2);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetAvailableTables_notExists_throwsException(){
		IRestaurantsManage.INSTANCE.getAvailableTables(
			LocalDateTime.parse("2014-10-23 12:30", formatter),
			LocalDateTime.parse("2014-10-23 13:00", formatter),
			"testaurant");
	}

	@Test
	public void testGetReservationGuest() {
		String reservationID = IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").get(0);
		assertTrue(IRestaurantsManage.INSTANCE.getReservationGuest("testaurant", reservationID) == "010101-0101");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetReservationGuest_notExists_throwsException(){
		IRestaurantsManage.INSTANCE.getReservationGuest("apabepacepa", "");
	}

	@Test
	public void testGetRestaurantMenuName() {
		assertTrue(IRestaurantsManage.INSTANCE.getRestaurantMenuName("testaurant") == "The Menu");
	}
	
	@Test
	public void testGetRestaurantMenuName_notExists_throwsException() {
		IRestaurantsManage.INSTANCE.getRestaurantMenuName("");
	}

	@Test
	public void testGetAllRestaurantNames() {
		assertTrue(IRestaurantsManage.INSTANCE.getAllRestaurantNames().size() == 1);
	}

	@Test
	public void testSearchRestaurants() {
		//TODO
		fail("Not yet implemented");
	}

	@Test
	public void testSearchRestaurantReservations() {
		//TODO
		fail("Not yet implemented");
	}

	@Test
	public void testSearchRestaurantTables() {
		//TODO
		fail("Not yet implemented");
	}

	@Test
	public void testMakeReservation() {
		//TODO
		fail("Not yet implemented");
	}

	@Test
	public void testCancelReservation() {
		String reservationID = IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").get(0);
		IRestaurantsManage.INSTANCE.cancelReservation("testaurant", reservationID);
		
		assertTrue(IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").size() == 1);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testCancelReservation_notExists_throwsException(){
		String reservationID = IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").get(0);
		IRestaurantsManage.INSTANCE.cancelReservation("apabepacepa", reservationID);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testCancelReservation_reservationNotExists_throwsException() {
		IRestaurantsManage.INSTANCE.cancelReservation("testaurant", "");
	}

	@Test
	public void testChangeReservedTables() {
		String reservationID = IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").get(0);
		
		ArrayList<String> tables = new ArrayList<String>();
		tables.add("1");
		
		IRestaurantsManage.INSTANCE.changeReservedTables("testaurant", reservationID, tables);
		
		// TODO		SOMETHING TO ASSERT, BUT WHAT? CAN WE GET RESERVED TABLES FOR A RESERVATION?
		assertTrue(false);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeReservedTables_notExists_throwsException() {
		String reservationID = IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").get(0);
		
		ArrayList<String> tables = new ArrayList<String>();
		tables.add("1");
		
		IRestaurantsManage.INSTANCE.changeReservedTables("apabepacepa", reservationID, tables);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeReservedTablesNotExists_throwsException() {
		ArrayList<String> tables = new ArrayList<String>();
		tables.add("1");
		
		IRestaurantsManage.INSTANCE.changeReservedTables("apabepacepa", "", tables);
	}

	@Test
	public void testGetAvailableTablesByNbrGuests() {
		int result = IRestaurantsManage.INSTANCE.getAvailableTablesByNbrGuests(
			"testaurant",
			LocalDateTime.parse("2014-10-20 12:30", formatter),
			LocalDateTime.parse("2014-10-20 10:30", formatter),
			5).size();
		
		assertTrue(result == 1);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetAvailableTablesByNbrGuests_notExists_throwsException() {
		IRestaurantsManage.INSTANCE.getAvailableTablesByNbrGuests(
			"apabepacepa",
			LocalDateTime.parse("2014-10-20 12:30", formatter),
			LocalDateTime.parse("2014-10-20 10:30", formatter),
			5
		);
	}

	@Test
	public void testGetRestaurantMenuItems() {
		assertTrue(IRestaurantsManage.INSTANCE.getRestaurantMenuItems("testaurant").size() == 2);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRestaurantMenuItems_notExists_throwsException() {
		IRestaurantsManage.INSTANCE.getRestaurantMenuItems("");
	}

	@Test
	public void testGetReservationFromTime() {
		//TODO
		fail("Not yet implemented");
	}

	@Test
	public void testGetReservationToTime() {
		//TODO
		fail("Not yet implemented");
	}

	@Test
	public void testSearchRestaurantReservationsWithTime() {
		//TODO
		fail("Not yet implemented");
	}
}
