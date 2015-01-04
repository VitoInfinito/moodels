package Classes.Restaurants.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Restaurants.IRestaurantsAccess;
import Classes.Restaurants.IRestaurantsManage;
import Classes.Utils.InvalidIDException;

public class IRestaurantsAccessTest {

	@Before
	public void setUp() throws Exception {
		IRestaurantsManage.INSTANCE.addRestaurant("testaurant");
	}
	
	@After
	public void teardown() {
		for(String id : IRestaurantsAccess.INSTANCE.getAllRestaurantNames())
			IRestaurantsManage.INSTANCE.removeRestaurant(id);
	}

	@Test
	public void testGetRestaurantReservations() {
		IRestaurantsManage.INSTANCE.addRestaurantTable("testaurant", 4, "1");
		boolean result = IRestaurantsManage.INSTANCE.getRestaurantReservations("testaurant").contains("1");
		System.out.println(result);
		assertTrue(result); 
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRestaurantReservations_notExists_throwsException(){
		IRestaurantsManage.INSTANCE.getRestaurantReservations("apabepacepa");
	}

	@Test
	public void testGetRestaurantTables() {
		//TODO
		fail("Not yet implemented");
	}

	@Test
	public void testGetRestaurantTableNumberOfSeats() {
		//TODO
		fail("Not yet implemented");
	}

	@Test
	public void testGetAvailableTables() {
		//TODO
		fail("Not yet implemented");
	}

	@Test
	public void testGetReservationGuest() {
		//TODO
		fail("Not yet implemented");
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
