package Classes.Services.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.LocalDateTime;
import java.util.ArrayList;

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
		
		IServicesManager.INSTANCE.changeRoomServiceMenuName("The Menu");
		
		ArrayList<String> services = new ArrayList<String>();
		services.add(IServicesAccess.INSTANCE.getAllServiceIDs().get(0));
		
		ArrayList<String> items = new ArrayList<String>();
		items.add("c");
		
		IServicesAccess.INSTANCE.makeRoomServiceOrder(items, services, "bill", "bookable", LocalDateTime.of(2015, 01, 20, 20, 15), false);
	}
	
	@After
	public void tearDown() {
		for (String id : IServicesAccess.INSTANCE.getRoomServiceMenuItems()) {
			IServicesManager.INSTANCE.removeRoomServiceMenuItem(id);
		}
		
		for (String id : IServicesAccess.INSTANCE.getAllServiceIDs()) {
			IServicesManager.INSTANCE.removeService(id);
		}
		
		for (String id : IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs()) {
			IServicesManager.INSTANCE.removeRoomServiceOrder(id);
		}
	}

	@Test
	public void testGetAllServiceIDsEmptyExpectEmpty() {
		tearDown();
		
		int result = IServicesAccess.INSTANCE.getAllServiceIDs().size();
		assertTrue(result == 0);
	}
	
	@Test
	public void testGetAllServiceIDsNotEmpty() {
		int result = IServicesAccess.INSTANCE.getAllServiceIDs().size();
		assertTrue(result == 2);
	}
	
	@Test
	public void testGetAllRoomServiceOrderIDsEmptyExpectEmpty() {
		tearDown();
		
		int result = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().size();
		assertTrue(result == 0);
	}
	
	@Test
	public void testGetAllRoomServiceOrderIDsNotEmpty() {
		int result = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().size();
		assertTrue(result == 1);
	}

	@Test
	public void testSearchServices() {
		boolean result = IServicesAccess.INSTANCE.searchServices("a").size() == 1;
		assertTrue(result);
	}

	@Test
	public void testSearchRoomServiceOrders() {
		fail("Unimplemented");
		// TODO
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
	public void testIsRSODelivered_isNotDelivered_ExpectNo() {
		String orderID = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().get(0);
		assertFalse(IServicesAccess.INSTANCE.isRSODelivered(orderID));
	}

	@Test
	public void testIsRSODelivered_isDelivered_ExpectYes() {
		String orderID = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().get(0);
		
		IServicesAccess.INSTANCE.changeRSOISDelivered(orderID, true);
		assertTrue(IServicesAccess.INSTANCE.isRSODelivered(orderID));
	}

	@Test
	public void testGetRSODeliveryDate() {
		String orderID = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().get(0);
		
		boolean result = IServicesAccess.INSTANCE.getRSODeliveryDate(orderID).isEqual(LocalDateTime.of(2015, 01, 20, 20, 15));
		assertTrue(result);
	}

	@Test
	public void testGetRSOBookable() {
		String orderID = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().get(0);
		assertTrue(IServicesAccess.INSTANCE.getRSOBookable(orderID) == "bookable");
	}

	@Test
	public void testGetRSOItems() {
		String orderID = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().get(0);
		assertTrue(IServicesAccess.INSTANCE.getRSOItems(orderID).size() == 1);
	}

	@Test
	public void testGetRSOServices() {
		String orderID = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().get(0);
		assertTrue(IServicesAccess.INSTANCE.getRSOServices(orderID).size() == 1);
	}

	@Test
	public void testChangeRSOISDelivered() {
		String orderID = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().get(0);
		
		IServicesAccess.INSTANCE.changeRSOISDelivered(orderID, true);
		assertTrue(IServicesAccess.INSTANCE.isRSODelivered(orderID));
	}

	@Test
	public void testChangeRSODeliveryDate() {
		String orderID = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().get(0);
		
		LocalDateTime date = LocalDateTime.of(2016, 01, 20, 20, 15);
		
		IServicesAccess.INSTANCE.changeRSODeliveryDate(orderID, date);
		boolean result = IServicesAccess.INSTANCE.getRSODeliveryDate(orderID).isEqual(date);
		
		assertTrue(result);
	}

	@Test
	public void testGetRoomServiceMenuName() {
		assertTrue(IServicesAccess.INSTANCE.getRoomServiceMenuName() == "The Menu");
	}

	@Test
	public void testGetRoomServiceMenuItems() {
		assertTrue(IServicesAccess.INSTANCE.getRoomServiceMenuItems().size() == 2);
	}

	@Test
	public void testSetRSOBill() {
		String orderID = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().get(0);
		
		IServicesAccess.INSTANCE.setRSOBill(orderID, "bill2");
		
		assertTrue(IServicesAccess.INSTANCE.getRSOBill(orderID) == "bill2");
	}

	@Test
	public void testGetRSOBill() {
		String orderID = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().get(0);
		assertTrue(IServicesAccess.INSTANCE.getRSOBill(orderID) == "bill");
	}

	@Test
	public void testMakeRoomServiceOrder() {
		ArrayList<String> services = new ArrayList<String>();
		services.add(IServicesAccess.INSTANCE.getAllServiceIDs().get(0));
		
		ArrayList<String> items = new ArrayList<String>();
		items.add("c");
		
		IServicesAccess.INSTANCE.makeRoomServiceOrder(items, services, "bill", "bookable", LocalDateTime.of(2015, 01, 20, 20, 15), false);
	
		assertTrue(IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().size() == 2);
	}
	
	@Test
	public void testRemoveRoomServiceOrder() {
		String orderID = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().get(0);
		
		IServicesManager.INSTANCE.removeRoomServiceOrder(orderID);
		
		assertTrue(IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().size() == 0);
	}

}
