/**
 */
package Classes.Inventory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Inventory.InventoryManager#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
class InventoryManager implements IManageInventory {
	private static final long serialVersionUID = 1367907355615633727L;
	private final Logger logger = LoggerFactory.getLogger(InventoryManager.class);
	public static InventoryManager INSTANCE = new InventoryManager();
	
	private static int IDCounter = 0;
	private HashMap<String, Item> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private InventoryManager() {
		super();
		items = new HashMap<String,Item>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changeItemStock(String id, int stock) throws InvalidIDException {
		if (items.containsKey(id)) {
			items.get(id).setStock(stock);
		} else {
			logger.warn("The Item with ID {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public double getItemPrice(String id) throws InvalidIDException {
		if (items.containsKey(id)) {
			return items.get(id).getPrice();
		} else {
			logger.warn("The Item with ID {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getItemName(String id) throws InvalidIDException {
		if (items.containsKey(id)) {
			return items.get(id).getName();
		} else {
			logger.warn("The Item with ID {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public int getItemStock(String id) throws InvalidIDException {
		if (items.containsKey(id)) {
			return items.get(id).getStock();
		} else {
			logger.warn("The Item with ID {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public double getItemExpense(String id) throws InvalidIDException {
		if (items.containsKey(id)) {
			return items.get(id).getExpense();
		} else {
			logger.warn("The Item with ID {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllItemIDs() {
		return new ArrayList<String>(items.keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> searchItems(String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		if (items.containsKey(keyword)) {
			searchResult.add(keyword);
		}

		Collection<Item> c = items.values();
		
		// Some property match exactly. Second Order!
		for (Item b : c) {
			if (b.getName().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getId());
			} 
		}
		
		// ID match somewhat. Third Order!
		for (Item b : c) {			
			if (regexPattern.matcher(b.getId()).matches()) {
				searchResult.add(b.getId());
			} 
		}

		// Some property match somewhat. Fourth Order.
		for (Item b : c) {
			if (regexPattern.matcher(b.getName()).matches()) {
				searchResult.add(b.getId());
			}
		}
		

		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changeItemName(String id, String name) throws InvalidIDException {
		if (items.containsKey(id)) {
			items.get(id).setName(name);
		} else {
			logger.warn("The Item with ID {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changeItemPrice(String id, double price) throws InvalidIDException {
		if (items.containsKey(id)) {
			items.get(id).setPrice(price);
		} else {
			logger.warn("The Item with ID {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changeItemExpense(String id, double expense) throws InvalidIDException {
		if (items.containsKey(id)) {
			items.get(id).setExpense(expense);
		} else {
			logger.warn("The Item with ID {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addItem(String name, double price, double expense, int stock) {
		String id = generateID();
		
		Item item = InventoryFactory.INSTANCE.createItem();
			
		item.setId(id);
		item.setName(name);
		item.setPrice(price);
		item.setExpense(expense);
		item.setStock(stock);
		
		items.put(id, item);
	}
	
	private String generateID() {
		return String.format("it%06d", IDCounter++);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void removeItem(String id) throws InvalidIDException {
		if (items.containsKey(id)) {
			items.remove(id);
		} else {
			logger.warn("The Item with ID {} could not be found.", id);
			throw new InvalidIDException();
		}
	}
} //InventoryManagerImpl
