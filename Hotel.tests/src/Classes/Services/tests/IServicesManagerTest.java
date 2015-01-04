package Classes.Services.tests;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Services.IServicesManager;
import Classes.Utils.InvalidIDException;

public class IServicesManagerTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		IServicesManager.INSTANCE.addService("a", 100, 50);
		IServicesManager.INSTANCE.addRoomServiceMenuItem("b");
		IServicesManager.INSTANCE.changeRoomServiceMenuName("The Menu");
	}
	
	@After
	public void tearDown() {
		for (String ID : IServicesManager.INSTANCE.getAllServiceIDs()) {
			IServicesManager.INSTANCE.removeService(ID);
		}
		
		for (String ID : IServicesManager.INSTANCE.getRoomServiceMenuItems()) {
			IServicesManager.INSTANCE.removeRoomServiceMenuItem(ID);
		}
	}

	@Test
	public void testChangeServiceName() {
		String serviceID = IServicesManager.INSTANCE.getAllServiceIDs().get(0);
		IServicesManager.INSTANCE.changeServiceName(serviceID, "b");
		
		assertTrue(IServicesManager.INSTANCE.getServiceName(serviceID) == "b");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeServiceName_id_not_exists() {
		IServicesManager.INSTANCE.changeServiceName("", "");
	}

	@Test
	public void testChangeServicePrice() {
		String serviceID = IServicesManager.INSTANCE.getAllServiceIDs().get(0);
		IServicesManager.INSTANCE.changeServicePrice(serviceID, 200);
		
		assertTrue(IServicesManager.INSTANCE.getServicePrice(serviceID) == 200);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeServicePrice_id_not_exists() {
		IServicesManager.INSTANCE.changeServicePrice("", 200);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testChangeServicePrice_is_negative() {
		String serviceID = IServicesManager.INSTANCE.getAllServiceIDs().get(0);
		IServicesManager.INSTANCE.changeServicePrice(serviceID, -200);
	}

	@Test
	public void testChangeServiceExpense() {
		String serviceID = IServicesManager.INSTANCE.getAllServiceIDs().get(0);
		IServicesManager.INSTANCE.changeServiceExpense(serviceID, 200);
		
		assertTrue(IServicesManager.INSTANCE.getServiceExpense(serviceID) == 200);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeServiceExpense_id_not_exists() {
		IServicesManager.INSTANCE.changeServiceExpense("", 200);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testChangeServiceExpense_is_negative() {
		String serviceID = IServicesManager.INSTANCE.getAllServiceIDs().get(0);
		IServicesManager.INSTANCE.changeServiceExpense(serviceID, -200);
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

}
