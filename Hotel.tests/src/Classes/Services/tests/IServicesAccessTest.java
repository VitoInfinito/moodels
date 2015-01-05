package Classes.Services.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Services.IServicesAccess;
import Classes.Services.IServicesManager;
import Classes.Utils.InvalidIDException;

public class IServicesAccessTest {
	
	@BeforeClass
	public static void setUpBeforeClass() {
	}

	@Before
	public void setUp() throws Exception {
		IServicesManager.INSTANCE.addService("a", 100, 50);
		IServicesManager.INSTANCE.addService("b", 200, 75);
		
		IServicesManager.INSTANCE.addService("abababababahej", 0, 0);
		IServicesManager.INSTANCE.addService("lolololololhej", 0, 0);
		
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
		assertTrue(result == 4);
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
	public void testSearchServices_servicesEmpty_expectEmptyList() {
		tearDown();
		
		boolean result = IServicesAccess.INSTANCE.searchServices("ab").isEmpty();
		assertTrue(result);
	}
	
	@Test
	public void testSearchServices_servicesNotEmpty_expectEmptyList() {
		boolean result = IServicesAccess.INSTANCE.searchServices("xx").isEmpty();
		assertTrue(result);
	}
	
	@Test
	public void testSearchServices_expectsListNonNull() {
		List<String> list = IServicesAccess.INSTANCE.searchServices("xx");
		assertNotNull(list);
	}
	
	@Test
	public void testSearchServices_idMatchExactly() {
		String serviceID = IServicesAccess.INSTANCE.getAllServiceIDs().get(0);
		
		List<String> list = IServicesAccess.INSTANCE.searchServices(serviceID);
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchServices_idMatchSomewhat() {
		String serviceID = IServicesAccess.INSTANCE.getAllServiceIDs().get(0).substring(2);
		
		List<String> list = IServicesAccess.INSTANCE.searchServices(serviceID);
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchServices_nameMatchExactly() {
		List<String> list = IServicesAccess.INSTANCE.searchServices("abababababahej");
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchServices_nameMatchSomewhat() {
		List<String> list = IServicesAccess.INSTANCE.searchServices("bab");
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchServices_nameMatchSomewhat_multipleMatches() {
		List<String> list = IServicesAccess.INSTANCE.searchServices("hej");
		assertTrue(list.size() == 2);
	}

	@Test
	public void testSearchRoomServiceOrders() {
		fail("Unimplemented");
		// TODO
		
		// #### OBSERVERA!	Detta ska testas:
		
		// Exact ID match. First Order!
		// Some property match exactly. Second Order! (Bill, Bookable, Items, Service)
		// ID match somewhat. Third Order!
		// Some property match somewhat. Fourth Order. (Bill, Bookable)
	}

	@Test
	public void testGetServiceName() {
		String serviceID = IServicesAccess.INSTANCE.getAllServiceIDs().get(0);
		assertTrue(IServicesAccess.INSTANCE.getServiceName(serviceID) == "a");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetServiceName_id_not_exists() {
		IServicesAccess.INSTANCE.getServiceName("");
	}

	@Test
	public void testGetServicePrice() {
		String serviceID = IServicesAccess.INSTANCE.getAllServiceIDs().get(0);
		assertTrue(IServicesAccess.INSTANCE.getServicePrice(serviceID) == 100);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetServicePrice_id_not_exists() {
		IServicesAccess.INSTANCE.getServicePrice("");
	}

	@Test
	public void testGetServiceExpense() {
		String serviceID = IServicesAccess.INSTANCE.getAllServiceIDs().get(0);
		assertTrue(IServicesAccess.INSTANCE.getServiceExpense(serviceID) == 50);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetServiceExpense_id_not_exists() {
		IServicesAccess.INSTANCE.getServiceExpense("");
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
	
	@Test(expected=InvalidIDException.class)
	public void testIsRSODelivered_id_not_exists() {
		IServicesAccess.INSTANCE.isRSODelivered("");
	}

	@Test
	public void testGetRSODeliveryDate() {
		String orderID = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().get(0);
		boolean result = IServicesAccess.INSTANCE.getRSODeliveryDate(orderID).isEqual(LocalDateTime.of(2015, 01, 20, 20, 15));
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRSODeliveryDate_id_not_exists() {
		IServicesAccess.INSTANCE.getRSODeliveryDate("");
	}

	@Test
	public void testGetRSOBookable() {
		String orderID = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().get(0);
		assertTrue(IServicesAccess.INSTANCE.getRSOBookable(orderID) == "bookable");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRSOBookable_id_not_exists() {
		IServicesAccess.INSTANCE.getRSOBookable("");
	}

	@Test
	public void testGetRSOItems() {
		String orderID = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().get(0);
		assertTrue(IServicesAccess.INSTANCE.getRSOItems(orderID).size() == 1);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRSOItems_id_not_exists() {
		IServicesAccess.INSTANCE.getRSOItems("");
	}

	@Test
	public void testGetRSOServices() {
		String orderID = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().get(0);
		assertTrue(IServicesAccess.INSTANCE.getRSOServices(orderID).size() == 1);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRSOServices_id_not_exists() {
		IServicesAccess.INSTANCE.getRSOServices("");
	}

	@Test
	public void testChangeRSOISDelivered() {
		String orderID = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().get(0);
		
		IServicesAccess.INSTANCE.changeRSOISDelivered(orderID, true);
		assertTrue(IServicesAccess.INSTANCE.isRSODelivered(orderID));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeRSOISDelivered_id_not_exists() {
		IServicesAccess.INSTANCE.isRSODelivered("");
	}

	@Test
	public void testChangeRSODeliveryDate() {
		String orderID = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().get(0);
		
		LocalDateTime date = LocalDateTime.of(2016, 01, 20, 20, 15);
		
		IServicesAccess.INSTANCE.changeRSODeliveryDate(orderID, date);
		boolean result = IServicesAccess.INSTANCE.getRSODeliveryDate(orderID).isEqual(date);
		
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeRSODeliveryDate_id_not_exists() {
		IServicesAccess.INSTANCE.changeRSODeliveryDate("", null);
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
	
	@Test(expected=InvalidIDException.class)
	public void testSetRSOBill_id_not_exists() {
		IServicesAccess.INSTANCE.setRSOBill("", null);
	}

	@Test
	public void testGetRSOBill() {
		String orderID = IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().get(0);
		assertTrue(IServicesAccess.INSTANCE.getRSOBill(orderID) == "bill");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRSOBill_id_not_exists() {
		IServicesAccess.INSTANCE.getRSOBill("");
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

}
