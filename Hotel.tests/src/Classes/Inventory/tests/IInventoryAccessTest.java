package Classes.Inventory.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Inventory.IInventoryAccess;
import Classes.Inventory.IManageInventory;
import Classes.Utils.InvalidIDException;

public class IInventoryAccessTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		IManageInventory.INSTANCE.addItem("Toppias", 23.15, 13.37, 15);
		IManageInventory.INSTANCE.addItem("Ba-na-na", 5.99, 25.65, 100);
	}
	
	@After
	public void tearDown() throws InvalidIDException {
		for (String id : IManageInventory.INSTANCE.getAllItemIDs()) {
			IManageInventory.INSTANCE.removeItem(id);
		}
	}

	@Test
	public void testChangeItemStock() {
		boolean result = false;
		for(String id : IInventoryAccess.INSTANCE.getAllItemIDs()){
			if(IInventoryAccess.INSTANCE.getItemName(id) == "Ba-na-na"){
				IInventoryAccess.INSTANCE.changeItemStock(id, 1000);
				result = IInventoryAccess.INSTANCE.getItemStock(id) == 1000;
			}
		}
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testChangeItemStock_expects_exception() {
		IInventoryAccess.INSTANCE.changeItemStock("lulcake", 1000);
	}

	@Test
	public void testGetItemPrice() {
		boolean result = false;
		for(String id : IInventoryAccess.INSTANCE.getAllItemIDs()){
			if(IInventoryAccess.INSTANCE.getItemName(id) == "Toppias"){
				result = IInventoryAccess.INSTANCE.getItemPrice(id) == 23.15;
			}
		}
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetItemPrice_expects_exception() {
		
		boolean result = IInventoryAccess.INSTANCE.getItemPrice("lulcake") == 23.15;
		assertTrue(result);
	}

	@Test
	public void testGetItemName() {
		boolean result = false;
		for(String id : IInventoryAccess.INSTANCE.getAllItemIDs()){
			if(IInventoryAccess.INSTANCE.getItemName(id) == "Toppias"){
				result = true;
			}
		}
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetItemName_expects_exception() {
		
		String result = IInventoryAccess.INSTANCE.getItemName("lulcake");
		assertTrue(result.equals("lulcake"));
	}

	@Test
	public void testGetItemStock() {
		boolean result = false;
		for(String id : IInventoryAccess.INSTANCE.getAllItemIDs()){
			if(IInventoryAccess.INSTANCE.getItemName(id) == "Ba-na-na"){
				result = IInventoryAccess.INSTANCE.getItemStock(id) == 100;
			}
		}
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetItemStock_expects_exception() {
		
		double result = IInventoryAccess.INSTANCE.getItemStock("lulcake");
		assertTrue(result == 0);
	}

	@Test
	public void testGetItemExpense() {
		boolean result = false;
		for(String id : IInventoryAccess.INSTANCE.getAllItemIDs()){
			if(IInventoryAccess.INSTANCE.getItemName(id) == "Toppias"){
				result = IInventoryAccess.INSTANCE.getItemExpense(id) == 13.37;
			}
		}
		assertTrue(result);
	}
	
	@Test(expected=InvalidIDException.class)
	public void testGetItemExpense_expects_exception() {
		
		double result = IInventoryAccess.INSTANCE.getItemExpense("lulcake");
		assertTrue(result == 0);
	}

	@Test
	public void testGetAllItemIDsExpectNotEmpty() {
		List<String> items= IInventoryAccess.INSTANCE.getAllItemIDs();
		assertTrue(items.size() == 2);
	}

	@Test
	public void testGetAllItemIDsExpectEmpty() {
		tearDown();
		List<String> items = IInventoryAccess.INSTANCE.getAllItemIDs();
		assertTrue(items.size() == 0);
	}
	
	@Test
	public void testSearchItemsExpectTwoMatches() {
		boolean result = IInventoryAccess.INSTANCE.searchItems("a").size() == 2;
		assertTrue(result);
	}
	
	@Test
	public void testSearchItemsExpectOneMatch() {
		boolean result = IInventoryAccess.INSTANCE.searchItems("na").size() == 1;
		assertTrue(result);
	}
	
	@Test
	public void testSearchItemsExpectNoMatches() {
		boolean result = IInventoryAccess.INSTANCE.searchItems("Banana").size() == 0;
		assertTrue(result);
	}
}
