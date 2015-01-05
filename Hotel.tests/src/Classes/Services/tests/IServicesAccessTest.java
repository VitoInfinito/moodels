package Classes.Services.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

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
	private String service1, roomServiceOrder1;
	
	@BeforeClass
	public static void setUpBeforeClass() {
	}

	@Before
	public void setUp() throws Exception {
		service1 = IServicesManager.INSTANCE.addService("a", 100, 50);
		IServicesManager.INSTANCE.addService("b", 200, 75);
		
		IServicesManager.INSTANCE.addService("abababababahej", 0, 0);
		IServicesManager.INSTANCE.addService("lolololololhej", 0, 0);
		
		IServicesManager.INSTANCE.addRoomServiceMenuItem("c");
		IServicesManager.INSTANCE.addRoomServiceMenuItem("d");
		
		IServicesManager.INSTANCE.changeRoomServiceMenuName("The Menu");
		
		ArrayList<String> services = new ArrayList<String>();
		services.add(service1);
		
		ArrayList<String> items = new ArrayList<String>();
		items.add("c");
		
		roomServiceOrder1 = IServicesAccess.INSTANCE.makeRoomServiceOrder(items, services, "bill", "bookable", LocalDateTime.of(2015, 01, 20, 20, 15), false);
		IServicesAccess.INSTANCE.makeRoomServiceOrder(items, services, "billinge", "bookable", LocalDateTime.of(2015, 01, 20, 20, 15), false);
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
		assertTrue(result == 2);
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
		List<String> list = IServicesAccess.INSTANCE.searchServices(service1);
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchServices_idMatchSomewhat() {
		String serviceID = service1.substring(2);
		
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
	public void testSearchRoomServiceOrders_id_exact_match() {
		String service1 = roomServiceOrder1;
		
		List<String> list = IServicesAccess.INSTANCE.searchRoomServiceOrders(service1);
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchRoomServiceOrders_name_partial_match() {
		List<String> list = IServicesAccess.INSTANCE.searchRoomServiceOrders("bill");
		assertTrue(list.size() == 2);
	}
	
	@Test
	public void testSearchRoomServiceOrders_id_partial_match() {
		String service1 = roomServiceOrder1.substring(2);
		
		List<String> list = IServicesAccess.INSTANCE.searchRoomServiceOrders(service1);
		assertTrue(list.size() == 1);
	}
	
	@Test
	public void testSearchRoomServiceOrders_exact_match() {
		List<String> list = IServicesAccess.INSTANCE.searchRoomServiceOrders("billinge");
		assertTrue(list.size() == 1);
	}

	@Test
	public void testGetServiceName() {
		assertTrue(IServicesAccess.INSTANCE.getServiceName(service1) == "a");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetServiceName_id_not_exists() {
		IServicesAccess.INSTANCE.getServiceName("");
	}

	@Test
	public void testGetServicePrice() {
		assertTrue(IServicesAccess.INSTANCE.getServicePrice(service1) == 100);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetServicePrice_id_not_exists() {
		IServicesAccess.INSTANCE.getServicePrice("");
	}

	@Test
	public void testGetServiceExpense() {	
		assertTrue(IServicesAccess.INSTANCE.getServiceExpense(service1) == 50);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetServiceExpense_id_not_exists() {
		IServicesAccess.INSTANCE.getServiceExpense("");
	}

	@Test
	public void testIsRSODelivered_isNotDelivered_ExpectNo() {
		assertFalse(IServicesAccess.INSTANCE.isRSODelivered(roomServiceOrder1));
	}

	@Test
	public void testIsRSODelivered_isDelivered_ExpectYes() {
		IServicesAccess.INSTANCE.changeRSOISDelivered(roomServiceOrder1, true);
		assertTrue(IServicesAccess.INSTANCE.isRSODelivered(roomServiceOrder1));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testIsRSODelivered_id_not_exists() {
		IServicesAccess.INSTANCE.isRSODelivered("");
	}

	@Test
	public void testGetRSODeliveryDate() {
		boolean result = IServicesAccess.INSTANCE.getRSODeliveryDate(roomServiceOrder1).isEqual(LocalDateTime.of(2015, 01, 20, 20, 15));
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRSODeliveryDate_id_not_exists() {
		IServicesAccess.INSTANCE.getRSODeliveryDate("");
	}

	@Test
	public void testGetRSOBookable() {
		assertTrue(IServicesAccess.INSTANCE.getRSOBookable(roomServiceOrder1) == "bookable");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRSOBookable_id_not_exists() {
		IServicesAccess.INSTANCE.getRSOBookable("");
	}

	@Test
	public void testGetRSOItems() {
		assertTrue(IServicesAccess.INSTANCE.getRSOItems(roomServiceOrder1).size() == 1);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRSOItems_id_not_exists() {
		IServicesAccess.INSTANCE.getRSOItems("");
	}

	@Test
	public void testGetRSOServices() {
		assertTrue(IServicesAccess.INSTANCE.getRSOServices(roomServiceOrder1).size() == 1);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRSOServices_id_not_exists() {
		IServicesAccess.INSTANCE.getRSOServices("");
	}

	@Test
	public void testChangeRSOISDelivered() {
		IServicesAccess.INSTANCE.changeRSOISDelivered(roomServiceOrder1, true);
		assertTrue(IServicesAccess.INSTANCE.isRSODelivered(roomServiceOrder1));
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeRSOISDelivered_id_not_exists() {
		IServicesAccess.INSTANCE.isRSODelivered("");
	}

	@Test
	public void testChangeRSODeliveryDate() {
		LocalDateTime date = LocalDateTime.of(2016, 01, 20, 20, 15);
		
		IServicesAccess.INSTANCE.changeRSODeliveryDate(roomServiceOrder1, date);
		boolean result = IServicesAccess.INSTANCE.getRSODeliveryDate(roomServiceOrder1).isEqual(date);
		
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
		IServicesAccess.INSTANCE.setRSOBill(roomServiceOrder1, "bill2");
		
		assertTrue(IServicesAccess.INSTANCE.getRSOBill(roomServiceOrder1) == "bill2");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testSetRSOBill_id_not_exists() {
		IServicesAccess.INSTANCE.setRSOBill("", null);
	}

	@Test
	public void testGetRSOBill() {
		assertTrue(IServicesAccess.INSTANCE.getRSOBill(roomServiceOrder1) == "bill");
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetRSOBill_id_not_exists() {
		IServicesAccess.INSTANCE.getRSOBill("");
	}

	@Test
	public void testMakeRoomServiceOrder() {
		ArrayList<String> services = new ArrayList<String>();
		services.add(service1);
		
		ArrayList<String> items = new ArrayList<String>();
		items.add("c");
		
		IServicesAccess.INSTANCE.makeRoomServiceOrder(items, services, "bill", "bookable", LocalDateTime.of(2015, 01, 20, 20, 15), false);
		assertTrue(IServicesAccess.INSTANCE.getAllRoomServiceOrderIDs().size() == 3);
	}

}
