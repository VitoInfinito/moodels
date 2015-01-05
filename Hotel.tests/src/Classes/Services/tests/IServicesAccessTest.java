package Classes.Services.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Services.IServicesManager;

public class IServicesAccessTest {
	
	@BeforeClass
	public static void setUpBeforeClass() {
	}

	@Before
	public void setUp() throws Exception {
		IServicesManager.INSTANCE.addService("a", 100, 50);
		IServicesManager.INSTANCE.addService("b", 200, 75);
		
		IServicesManager.INSTANCE.addRoomServiceMenuItem("c");
		IServicesManager.INSTANCE.addRoomServiceMenuItem("d");
	}
	
	@After
	public void tearDown() {
		for (String id : IServicesManager.INSTANCE.getRoomServiceMenuItems()) {
			 IServicesManager.INSTANCE.removeRoomServiceMenuItem(id);
		}
		for (String id : IServicesManager.INSTANCE.getAllServiceIDs()) {
			 IServicesManager.INSTANCE.removeService(id);
		}
		
		
	}

	@Test
	public void testGetAllServiceIDsEmptyExpectEmpty() {
		tearDown();
		
		int result = IServicesManager.INSTANCE.getAllServiceIDs().size();
		assertTrue(result == 0);
	}
	
	@Test
	public void testGetAllServiceIDsNotEmpty() {
		int result = IServicesManager.INSTANCE.getAllServiceIDs().size();
		assertTrue(result == 2);
	}
	
	@Test
	public void testGetAllRoomServiceOrderIDsEmptyExpectEmpty() {
		tearDown();
		
		int result = IServicesManager.INSTANCE.getAllRoomServiceOrderIDs().size();
		assertTrue(result == 0);
	}
	
	@Test
	public void testGetAllRoomServiceOrderIDsNotEmpty() {
		int result = IServicesManager.INSTANCE.getAllRoomServiceOrderIDs().size();
		assertTrue(result == 2);
	}

	@Test
	public void testSearchServices() {
		fail("Not yet implemented");
	}

	@Test
	public void testSearchRoomServiceOrders() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetServiceName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetServicePrice() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetServiceExpense() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsRSODelivered() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRSODeliveryDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRSOBookable() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRSOItems() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRSOServices() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeRSOISDelivered() {
		fail("Not yet implemented");
	}

	@Test
	public void testChangeRSODeliveryDate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRoomServiceMenuName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRoomServiceMenuItems() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetRSOBill() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRSOBill() {
		fail("Not yet implemented");
	}

	@Test
	public void testMakeRoomServiceOrder() {
		fail("Not yet implemented");
	}

}
