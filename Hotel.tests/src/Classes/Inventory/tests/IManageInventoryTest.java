package Classes.Inventory.tests;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import Classes.Inventory.IManageInventory;
import Classes.Utils.InvalidIDException;


public class IManageInventoryTest {
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		IManageInventory.INSTANCE.addItem("Toppias", 23.15, 13.37, 15);
		IManageInventory.INSTANCE.addItem("Ba-na-na", 5.99, 0.5, 100);
	}
	
	@After
	public void tearDown() throws InvalidIDException {
		for (String id : IManageInventory.INSTANCE.getAllItemIDs()) {
			IManageInventory.INSTANCE.removeItem(id);
		}
	}

	@Test
	public void testChangeItemName() {
		List<String> itemIDs = IManageInventory.INSTANCE.getAllItemIDs();
		IManageInventory.INSTANCE.changeItemName(itemIDs.get(0), "Tikkat");
		boolean result = (IManageInventory.INSTANCE.getItemName(itemIDs.get(0)) == "Tikkat");
		assertTrue(result);
	}

	@Test
	public void testChangeItemPrice() {
		List<String> itemIDs = IManageInventory.INSTANCE.getAllItemIDs();
		IManageInventory.INSTANCE.changeItemPrice(itemIDs.get(1), 0);
		boolean result = (IManageInventory.INSTANCE.getItemPrice(itemIDs.get(1)) == 0);
		assertTrue(result);
	}

	@Test
	public void testChangeItemExpense() {
		List<String> itemIDs = IManageInventory.INSTANCE.getAllItemIDs();
		IManageInventory.INSTANCE.changeItemExpense(itemIDs.get(0), 73);
		boolean result = (IManageInventory.INSTANCE.getItemExpense(itemIDs.get(0)) == 73);
		assertTrue(result);
	}

	@Test
	public void testAddItem() {
		IManageInventory.INSTANCE.addItem("Everything", 500.3, 5, 12378);
		boolean result = false;
		for (String id : IManageInventory.INSTANCE.getAllItemIDs()) {
			if (	((IManageInventory.INSTANCE.getItemName(id) == "Everything") && 
					IManageInventory.INSTANCE.getItemPrice(id) == 500.3 &&
					IManageInventory.INSTANCE.getItemExpense(id) == 5 &&
					IManageInventory.INSTANCE.getItemStock(id) == 12378)){					
						result = true;
						break;
			}
		}
		assertTrue(result);
	}

	@Test
	public void testRemoveItem() {
		tearDown();
		boolean result = (IManageInventory.INSTANCE.getAllItemIDs().size() == 0);
		assertTrue(result);
	}

}
