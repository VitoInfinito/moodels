package Classes.Restaurants.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

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
		
		IRestaurantsManage.INSTANCE.addRestaurant("abababababahej");
		IRestaurantsManage.INSTANCE.addRestaurant("lolololololhej");
		
		IRestaurantsManage.INSTANCE.addRestaurantTable("abababababahej", 4, "abababababahej");
		IRestaurantsManage.INSTANCE.addRestaurantTable("abababababahej", 6, "lolololololhej");
		
		ArrayList<String> tables = new ArrayList<String>();
		tables.add("abababababahej");
		tables.add("lolololololhej");
		
		IRestaurantsManage.INSTANCE.makeReservation(
				"abababababahej", 
				tables, 
				"abababababahej", 
				LocalDateTime.parse("2014-10-10 10:00", formatter), 
				LocalDateTime.parse("2014-10-10 12:00", formatter)
			);
		
		IRestaurantsManage.INSTANCE.makeReservation(
				"abababababahej", 
				tables, 
				"lolololololhej", 
				LocalDateTime.parse("2014-10-10 10:00", formatter), 
				LocalDateTime.parse("2014-10-10 12:00", formatter)
			);
		
		IRestaurantsManage.INSTANCE.changeMenuName("testaurant", "The Menu");
		
		IRestaurantsManage.INSTANCE.addMenuItem("testaurant", "10");
		IRestaurantsManage.INSTANCE.addMenuItem("testaurant", "20");
		
		IRestaurantsManage.INSTANCE.addRestaurantTable("testaurant", 4, "1");
		IRestaurantsManage.INSTANCE.addRestaurantTable("testaurant", 6, "2");
		
		ArrayList<String> tables2 = new ArrayList<String>();
		tables2.add("1");
		tables2.add("2");
		
		IRestaurantsManage.INSTANCE.makeReservation(
			"testaurant", 
			tables2, 
			"010101-0101", 
			LocalDateTime.parse("2014-10-22 14:00", formatter), 
			LocalDateTime.parse("2014-10-22 12:00", formatter)
		);
	}
	
	@After
	public void tearDown() {
		for(String id : IRestaurantsAccess.INSTANCE.getAllRestaurantNames()) {
			IRestaurantsManage.INSTANCE.removeRestaurant(id);
		}
	}

	@Test
	public void testGetRestaurantReservations() {
		assertTrue(IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").size() == 1);
		int result = IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").size();
		assertTrue(result == 1);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRestaurantReservations_notExists_throwsException(){
		IRestaurantsManage.INSTANCE.getRestaurantReservations("apabepacepa");
	}

	@Test
	public void testGetRestaurantTables() {
		assertTrue(IRestaurantsManage.INSTANCE.getRestaurantTables("testaurant").size() == 2);
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
			"");
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
	
	@Test(expected=InvalidIDException.class)
	public void testGetRestaurantMenuName_notExists_throwsException() {
		IRestaurantsManage.INSTANCE.getRestaurantMenuName("");
	}

	@Test
	public void testGetAllRestaurantNames() {
		assertTrue(IRestaurantsManage.INSTANCE.getAllRestaurantNames().size() == 3);
	}
	
	@Test
	public void testSearchRestaurants_restaurantsEmpty_expectEmptyList() {
		tearDown();
		
		boolean result = IRestaurantsManage.INSTANCE.searchRestaurants("ab").isEmpty();
		assertTrue(result);
	}
	
	@Test
	public void testSearchRestaurants_restaurantsNotEmpty_expectEmptyList() {
		boolean result = IRestaurantsManage.INSTANCE.searchRestaurants("xx").isEmpty();
		assertTrue(result);
	}
	
	@Test
	public void testSearchRestaurants_expectsListNonNull() {
		List<String> list = IRestaurantsManage.INSTANCE.searchRestaurants("xx");
		assertNotNull(list);
	}
	
	@Test
	public void testSearchRestaurants_nameMatchExactly() {
		List<String> list = IRestaurantsManage.INSTANCE.searchRestaurants("abababababahej");
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchRestaurants_nameMatchSomewhat() {
		List<String> list = IRestaurantsManage.INSTANCE.searchRestaurants("bab");
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchRestaurants_menuMatchExactly() {
		List<String> list = IRestaurantsManage.INSTANCE.searchRestaurants("The Menu");
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchRestaurants_menuMatchSomewhat() {
		List<String> list = IRestaurantsManage.INSTANCE.searchRestaurants("The Men");
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchRestaurants_multipleMatches() {
		List<String> list = IRestaurantsManage.INSTANCE.searchRestaurants("hej");
		assertTrue(list.size() == 2);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testSearchRestaurantReservations_notExists_throwsException() {
		IRestaurantsManage.INSTANCE.searchRestaurantReservations("", "");
	}
	
	@Test
	public void testSearchRestaurantReservations_reservationsEmpty_expectEmptyList() {
		boolean result = IRestaurantsManage.INSTANCE.searchRestaurantReservations("lolololololhej", "ab").isEmpty();
		assertTrue(result);
	}
	
	@Test
	public void testSearchRestaurantReservations_reservationsNotEmpty_expectEmptyList() {
		boolean result = IRestaurantsManage.INSTANCE.searchRestaurantReservations("abababababahej", "xx").isEmpty();
		assertTrue(result);
	}
	
	@Test
	public void testSearchRestaurantReservations_expectsListNonNull() {
		List<String> list = IRestaurantsManage.INSTANCE.searchRestaurantReservations("abababababahej", "xx");
		assertNotNull(list);
	}
	
	@Test
	public void testSearchRestaurantReservations_idMatchExactly() {
		String reservationID = IRestaurantsManage.INSTANCE.getRestaurantReservations("abababababahej").get(0);
		
		List<String> list = IRestaurantsManage.INSTANCE.searchRestaurantReservations("abababababahej", reservationID);
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchRestaurantReservations_idMatchSomewhat() {
		String reservationID = IRestaurantsManage.INSTANCE.getRestaurantReservations("abababababahej").get(0).substring(2);
		
		List<String> list = IRestaurantsManage.INSTANCE.searchRestaurantReservations("abababababahej", reservationID);
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchRestaurantReservations_reservedByMatchExactly() {
		List<String> list = IRestaurantsManage.INSTANCE.searchRestaurantReservations("abababababahej", "abababababahej");
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchRestaurantReservations_reservedByMatchSomewhat() {
		List<String> list = IRestaurantsManage.INSTANCE.searchRestaurantReservations("abababababahej", "bab");
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchRestaurantReservations_reservedByMatchSomewhat_multipleMatches() {
		List<String> list = IRestaurantsManage.INSTANCE.searchRestaurantReservations("abababababahej", "hej");
		assertTrue(list.size() == 2);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testSearchRestaurantTables_notExists_throwsException() {
		IRestaurantsManage.INSTANCE.searchRestaurantTables("", "");
	}
	
	@Test
	public void testSearchRestaurantTables_tablesEmpty_expectEmptyList() {
		boolean result = IRestaurantsManage.INSTANCE.searchRestaurantTables("lolololololhej", "ab").isEmpty();
		assertTrue(result);
	}
	
	@Test
	public void testSearchRestaurantTables_tablesNotEmpty_expectEmptyList() {
		boolean result = IRestaurantsManage.INSTANCE.searchRestaurantTables("abababababahej", "xx").isEmpty();
		assertTrue(result);
	}
	
	@Test
	public void testSearchRestaurantTables_tablesListNonNull() {
		List<String> list = IRestaurantsManage.INSTANCE.searchRestaurantTables("abababababahej", "xx");
		assertNotNull(list);
	}
	
	@Test
	public void testSearchRestaurantTables_nameMatchExactly() {
		List<String> list = IRestaurantsManage.INSTANCE.searchRestaurantTables("abababababahej", "abababababahej");
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchRestaurantTables_nameMatchSomewhat() {
		List<String> list = IRestaurantsManage.INSTANCE.searchRestaurantTables("abababababahej", "bab");
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchRestaurantTables_seatsMatchExactly() {
		List<String> list = IRestaurantsManage.INSTANCE.searchRestaurantTables("abababababahej", "4");
		assertTrue(list.size() == 1);
	}

	@Test
	public void testMakeReservation() {
		String reservationID = IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").get(0);
		IRestaurantsManage.INSTANCE.cancelReservation("testaurant", reservationID);
		
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
		
		assertTrue(IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").size() == 1);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testMakeReservation_notExists_throwsException() {
		IRestaurantsManage.INSTANCE.makeReservation(
			"", 
			new ArrayList<String>(), 
			"", 
			LocalDateTime.parse("2014-10-10 12:00", formatter), 
			LocalDateTime.parse("2014-10-10 14:00", formatter)
		);
	}

	@Test
	public void testCancelReservation() {
		String reservationID = IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").get(0);
		IRestaurantsManage.INSTANCE.cancelReservation("testaurant", reservationID);
		
		assertTrue(IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").size() == 0);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testCancelReservation_notExists_throwsException() {
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
		
		assertTrue(IRestaurantsManage.INSTANCE.getReservationTables("testaurant", reservationID).size() == 1);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeReservedTables_notExists_throwsException() {
		String reservationID = IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").get(0);
		
		ArrayList<String> tables = new ArrayList<String>();
		tables.add("1");
		
		IRestaurantsManage.INSTANCE.changeReservedTables("apabepacepa", reservationID, tables);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeReservedTables_reservationNotExists_throwsException() {
		ArrayList<String> tables = new ArrayList<String>();
		tables.add("1");
		
		IRestaurantsManage.INSTANCE.changeReservedTables("apabepacepa", "", tables);
	}
	
	public void testGetReservationTables() {
		String reservationID = IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").get(0);
		assertTrue(IRestaurantsManage.INSTANCE.getReservationTables("testaurant", reservationID).size() == 2);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetReservationTables_notExists_throwsException() {
		String reservationID = IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").get(0);
		IRestaurantsManage.INSTANCE.getReservationTables("", reservationID);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetReservationTables_reservationNotExists_throwsException() {
		IRestaurantsManage.INSTANCE.getReservationTables("testaurant", "");
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
		String reservationID = IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").get(0);
		
		boolean result = 	IRestaurantsManage.INSTANCE.getReservationFromTime("testaurant", reservationID).isEqual(
							LocalDateTime.parse("2014-10-22 12:00", formatter));
		
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetReservationFromTime_notExists_throwsException() {
		String reservationID = IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").get(0);
		IRestaurantsManage.INSTANCE.getReservationFromTime("", reservationID);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetReservationFromTime_reservationNotExists_throwsException() {
		IRestaurantsManage.INSTANCE.getReservationFromTime("testaurant", "");
	}

	@Test
	public void testGetReservationToTime() {
		String reservationID = IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").get(0);
		
		boolean result = 	IRestaurantsManage.INSTANCE.getReservationToTime("testaurant", reservationID).isEqual(
							LocalDateTime.parse("2014-10-22 14:00", formatter));
		
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetReservationToTime_notExists_throwsException() {
		String reservationID = IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").get(0);
		IRestaurantsManage.INSTANCE.getReservationToTime("", reservationID);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetReservationToTime_reservationNotExists_throwsException() {
		IRestaurantsManage.INSTANCE.getReservationToTime("testaurant", "");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testSearchRestaurantReservationsWithTime_notExists_throwsException() {
		IRestaurantsManage.INSTANCE.searchRestaurantReservationsWithTime("", "", null, null);
	}

	@Test
	public void testSearchRestaurantReservationsWithTime() {
		//TODO
		fail("Not yet implemented");
	}
}
