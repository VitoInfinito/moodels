package Classes.Restaurants.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import Classes.Restaurants.IRestaurantsAccess;
import Classes.Restaurants.IRestaurantsManage;
import Classes.Utils.InvalidIDException;

public class IRestaurantsManageTest {

	@Before
	public void setUp() throws Exception {
		IRestaurantsManage.INSTANCE.addRestaurant("testaurant");
		IRestaurantsManage.INSTANCE.addRestaurantTable("testaurant", 2, "5");
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
		IRestaurantsManage.INSTANCE.addRestaurant("testaurant");
	}

	@Test
	public void testRemoveRestaurant() {
		teardown();
		boolean result = IRestaurantsAccess.INSTANCE.getAllRestaurantNames().size() == 0;
		assertTrue(result);
	}

	@Test
	public void testAddRestaurantTable() {
		boolean result = IRestaurantsManage.INSTANCE.getRestaurantTableNumberOfSeats("testaurant", "5") == 2;
		assertTrue(result);
	}

	@Test
	public void testRemoveRestaurantTable() {
		IRestaurantsManage.INSTANCE.removeRestaurantTable("testaurant", "5");
		boolean result = IRestaurantsManage.INSTANCE.getRestaurantTables("testaurant").isEmpty();
		assertTrue(result);
		
	}

	@Test
	public void testChangeRestaurantName() {
		IRestaurantsManage.INSTANCE.changeRestaurantName("testaurant", "efgh");
		boolean result = 	!(IRestaurantsManage.INSTANCE.getAllRestaurantNames().contains("testaurant")) && 
							IRestaurantsManage.INSTANCE.getAllRestaurantNames().contains("efgh");
		assertTrue(result);
	}

	@Test
	public void testChangeTableNumberOfSeats() {
		IRestaurantsManage.INSTANCE.changeTableNumberOfSeats("testaurant", "5", 3);
		boolean result = IRestaurantsManage.INSTANCE.getRestaurantTableNumberOfSeats("testaurant", "5") == 3;
		assertTrue(result);
	}

	@Test
	public void testAddMenuItem() {
		IRestaurantsManage.INSTANCE.addMenuItem("testaurant", "banana");
		boolean result = IRestaurantsManage.INSTANCE.getRestaurantMenuItems("testaurant").contains("banana");
		assertTrue(result);
			
	}

	@Test
	public void testRemoveMenuItem() {
		IRestaurantsManage.INSTANCE.addMenuItem("testaurant", "banana");
		IRestaurantsManage.INSTANCE.removeMenuItem("testaurant", "banana");
		boolean result = IRestaurantsManage.INSTANCE.getRestaurantMenuItems("testaurant").isEmpty();
		assertTrue(result);
	}

	@Test
	public void testChangeMenuName() {
		IRestaurantsManage.INSTANCE.changeMenuName("testaurant", "theName");
		boolean result = IRestaurantsManage.INSTANCE.getRestaurantMenuName("testaurant") == "theName";
		assertTrue(result);
	}

	@Test
	public void testChangeTableNumber() {
		IRestaurantsManage.INSTANCE.changeTableNumber("testaurant", "5", "1");
		boolean result = IRestaurantsManage.INSTANCE.getRestaurantTables("testaurant").contains("1");
		assertTrue(result);
	}

}
