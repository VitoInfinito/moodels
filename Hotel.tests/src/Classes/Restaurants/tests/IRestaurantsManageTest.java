package Classes.Restaurants.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Classes.Restaurants.IRestaurantsAccess;
import Classes.Restaurants.IRestaurantsManage;
import Classes.Utils.InvalidIDException;

public class IRestaurantsManageTest {

	@Before
	public void setUp() throws Exception {
		IRestaurantsManage.INSTANCE.addRestaurant("abcd");
		IRestaurantsManage.INSTANCE.addRestaurantTable("abcd", 2, "5");
	}
	
	@After
	public void teardown() {
		for(String id : IRestaurantsAccess.INSTANCE.getAllRestaurantNames())
			IRestaurantsManage.INSTANCE.removeRestaurant(id);
	}

	@Test
	public void testAddRestaurant() { 
		boolean result = IRestaurantsAccess.INSTANCE.getAllRestaurantNames().size() == 1;
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddRestaurant_notExists_throwsException(){
		IRestaurantsManage.INSTANCE.addRestaurant("abcd");
	}

	@Test
	public void testRemoveRestaurant() {
		teardown();
		boolean result = IRestaurantsAccess.INSTANCE.getAllRestaurantNames().size() == 0;
		assertTrue(result);
	}

	@Test
	public void testAddRestaurantTable() {
		boolean result = IRestaurantsManage.INSTANCE.getRestaurantTableNumberOfSeats("abcd", "5") == 2;
		assertTrue(result);
	}

	@Test
	public void testRemoveRestaurantTable() {
		IRestaurantsManage.INSTANCE.removeRestaurantTable("abcd", "5");
		boolean result = IRestaurantsManage.INSTANCE.getRestaurantTables("abcd").isEmpty();
		assertTrue(result);
		
	}

	@Test
	public void testChangeRestaurantName() {
		IRestaurantsManage.INSTANCE.changeRestaurantName("abcd", "efgh");
		boolean result = 	!(IRestaurantsManage.INSTANCE.getAllRestaurantNames().contains("abcd")) && 
							IRestaurantsManage.INSTANCE.getAllRestaurantNames().contains("efgh");
		assertTrue(result);
	}

	@Test
	public void testChangeTableNumberOfSeats() {
		IRestaurantsManage.INSTANCE.changeTableNumberOfSeats("abcd", "5", 3);
		boolean result = IRestaurantsManage.INSTANCE.getRestaurantTableNumberOfSeats("abcd", "5") == 3;
		assertTrue(result);
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
