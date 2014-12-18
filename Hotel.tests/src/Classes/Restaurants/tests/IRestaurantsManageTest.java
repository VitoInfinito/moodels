package Classes.Restaurants.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Classes.Restaurants.IRestaurantsAccess;
import Classes.Restaurants.IRestaurantsManage;

public class IRestaurantsManageTest {

	@Before
	public void setUp() throws Exception {
		IRestaurantsManage.INSTANCE.addRestaurant("abcd");
	}
	
	@After
	public void teardown() {
		for(String id : IRestaurantsAccess.INSTANCE.getAllRestaurantNames())
			IRestaurantsManage.INSTANCE.removeRestaurant(id);
	}

	@Test
	public void testAddRestaurant() {
		boolean result = IRestaurantsAccess.INSTANCE.getAllRestaurantNames().size() == 0;
		assertFalse(result);
	}

	@Test
	public void testRemoveRestaurant() {
		teardown();
		boolean result = IRestaurantsAccess.INSTANCE.getAllRestaurantNames().size() == 0;
		assertTrue(result);
	}

	@Test
	public void testAddRestaurantTable() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveRestaurantTable() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeRestaurantName() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeTableNumberOfSeats() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddMenuItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testRemoveMenuItem() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeMenuName() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeTableNumber() {
		fail("Not yet implemented");
	}

}
