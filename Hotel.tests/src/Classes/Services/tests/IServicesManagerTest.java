package Classes.Services.tests;

import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Services.IServicesAccess;
import Classes.Services.IServicesManager;
import Classes.Utils.InvalidIDException;

public class IServicesManagerTest {
	String service1, roomServiceOrder1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		service1 = IServicesManager.INSTANCE.addService("a", 100, 50);
		IServicesManager.INSTANCE.addRoomServiceMenuItem("b");
		IServicesManager.INSTANCE.changeRoomServiceMenuName("The Menu");
		
		ArrayList<String> services = new ArrayList<String>();
		services.add(service1);
		
		ArrayList<String> items = new ArrayList<String>();
		items.add("b");
		
		roomServiceOrder1 = IServicesManager.INSTANCE.makeRoomServiceOrder(items, services, "bill", "bookable", LocalDateTime.of(2015, 01, 20, 20, 15), false);
	}
	
	@After
	public void tearDown() {
		for (String ID : IServicesManager.INSTANCE.getAllServiceIDs()) {
			IServicesManager.INSTANCE.removeService(ID);
		}
		
		for (String ID : IServicesManager.INSTANCE.getRoomServiceMenuItems()) {
			IServicesManager.INSTANCE.removeRoomServiceMenuItem(ID);
		}
		
		for (String id : IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs()) {
			IServicesManager.INSTANCE.removeRoomServiceOrder(id);
		}
	}

	@Test
	public void testChangeServiceName() {
		IServicesManager.INSTANCE.changeServiceName(service1, "b");
		
		assertTrue(IServicesManager.INSTANCE.getServiceName(service1) == "b");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeServiceName_id_not_exists() {
		IServicesManager.INSTANCE.changeServiceName("", "");
	}

	@Test
	public void testChangeServicePrice() {
		IServicesManager.INSTANCE.changeServicePrice(service1, 200);
		
		assertTrue(IServicesManager.INSTANCE.getServicePrice(service1) == 200);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeServicePrice_id_not_exists() {
		IServicesManager.INSTANCE.changeServicePrice("", 200);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testChangeServicePrice_is_negative() {
		IServicesManager.INSTANCE.changeServicePrice(service1, -200);
	}

	@Test
	public void testChangeServiceExpense() {
		IServicesManager.INSTANCE.changeServiceExpense(service1, 200);
		
		assertTrue(IServicesManager.INSTANCE.getServiceExpense(service1) == 200);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeServiceExpense_id_not_exists() {
		IServicesManager.INSTANCE.changeServiceExpense("", 200);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testChangeServiceExpense_is_negative() {
		IServicesManager.INSTANCE.changeServiceExpense(service1, -200);
	}

	@Test
	public void testAddRoomServiceMenuItem() {
		tearDown();
		
		IServicesManager.INSTANCE.addRoomServiceMenuItem("c");
		assertTrue(IServicesManager.INSTANCE.getRoomServiceMenuItems().size() == 1);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testAddRoomServiceMenuItem_item_id_exists() {
		IServicesManager.INSTANCE.addRoomServiceMenuItem("b");
	}

	@Test
	public void testRemoveRoomServiceMenuItem() {
		IServicesManager.INSTANCE.removeRoomServiceMenuItem("b");
		assertTrue(IServicesManager.INSTANCE.getRoomServiceMenuItems().size() == 0);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRemoveRoomServiceMenuItem_id_not_exists() {
		IServicesManager.INSTANCE.removeRoomServiceMenuItem("c");
	}

	@Test
	public void testChangeRoomServiceMenuName() {
		IServicesManager.INSTANCE.changeRoomServiceMenuName("The Menu 2");
		assertTrue(IServicesManager.INSTANCE.getRoomServiceMenuName() == "The Menu 2");
	}

	@Test
	public void testAddService() {
		IServicesManager.INSTANCE.addService("c", 200, 100);
		assertTrue(IServicesManager.INSTANCE.getAllServiceIDs().size() == 2);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAddService_price_is_negative() {
		IServicesManager.INSTANCE.addService("c", -200, 100);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testAddService_expense_is_negative() {
		IServicesManager.INSTANCE.addService("c", 200, -100);
	}
	
	public void testRemoveService() {
		IServicesManager.INSTANCE.removeService("a");
		assertTrue(IServicesManager.INSTANCE.getAllServiceIDs().size() == 0);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRemoveService_id_not_exists() {
		IServicesManager.INSTANCE.removeService("c");
	}
	
	@Test
	public void testRemoveRoomServiceOrder() {
		IServicesManager.INSTANCE.removeRoomServiceOrder(roomServiceOrder1);
		assertTrue(IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().size() == 0);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testRemoveRoomServiceOrder_id_not_exists() {
		IServicesManager.INSTANCE.removeRoomServiceOrder("");
	}

}
