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
		//TODO
		fail("Not yet implemented");
	}

	@Test
	public void testGetAllRestaurantNames() {
		//TODO
		fail("Not yet implemented");
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
		//TODO
		fail("Not yet implemented");
	}

	@Test
	public void testChangeReservedTables() {
		//TODO
		fail("Not yet implemented");
	}

	@Test
	public void testGetAvailableTablesByNbrGuests() {
		//TODO
		fail("Not yet implemented");
	}

	@Test
	public void testGetRestaurantMenuItems() {
		//TODO
		fail("Not yet implemented");
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
