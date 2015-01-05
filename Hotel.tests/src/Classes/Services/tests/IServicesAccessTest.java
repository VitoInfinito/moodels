package Classes.Services.tests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.chrono.ChronoLocalDateTime;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Services.IServicesAccess;
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
		boolean result = IServicesManager.INSTANCE.searchServices("a").size() == 1;
		assertTrue(result);
	}

	@Test
	public void testSearchRoomServiceOrders() {
		boolean result = IServicesManager.INSTANCE.searchRoomServiceOrders("b").size() == 0;
		assertTrue(result);
	}

	@Test
	public void testGetServiceName() {
		boolean result = false;
		for (String id : IServicesAccess.INSTANCE.getAllServiceIDs()){
			if(IServicesAccess.INSTANCE.getServiceName(id) == "a"){
				result = IServicesAccess.INSTANCE.getServiceName(id) == "a";
			}
		}
		assertTrue(result);
	}

	@Test
	public void testGetServicePrice() {
		boolean result = false;
		for (String id : IServicesAccess.INSTANCE.getAllServiceIDs()){
			if(IServicesAccess.INSTANCE.getServiceName(id) == "b"){
				result = IServicesAccess.INSTANCE.getServicePrice(id) == 200;
			}
		}
		assertTrue(result);
	}

	@Test
	public void testGetServiceExpense() {
		boolean result = false;
		for (String id : IServicesAccess.INSTANCE.getAllServiceIDs()){
			if(IServicesAccess.INSTANCE.getServiceName(id) == "a"){
				result = IServicesAccess.INSTANCE.getServiceExpense(id) == 50;
			}
		}
		assertTrue(result);
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
