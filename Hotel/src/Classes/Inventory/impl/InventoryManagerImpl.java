/**
 */
package Classes.Inventory.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.InvalidIDException;
import Classes.Bills.Bill;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToItemMapImpl;
import Classes.Inventory.InventoryFactory;
import Classes.Inventory.InventoryManager;
import Classes.Inventory.InventoryPackage;
import Classes.Inventory.Item;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Inventory.impl.InventoryManagerImpl#getItems <em>Items</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InventoryManagerImpl extends MinimalEObjectImpl.Container implements InventoryManager {
	private final Logger logger = LoggerFactory.getLogger(InventoryManagerImpl.class);
	public static InventoryManagerImpl INSTANCE = new InventoryManagerImpl();
	
	private static int IDCounter = 0;
	private EMap<String, Item> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private InventoryManagerImpl() {
		super();
		items = new EcoreEMap<String,Item>(ECoreMapEntriesPackage.Literals.STRING_TO_ITEM_MAP, StringToItemMapImpl.class, this, InventoryPackage.INVENTORY_MANAGER__ITEMS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeItemStock(String id, int stock) {
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
	 * @generated NOT
	 */
	public double getItemPrice(String id) {
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
	 * @generated NOT
	 */
	public String getItemName(String id) {
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
	 * @generated NOT
	 */
	public int getItemStock(String id) {
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
	 * @generated NOT
	 */
	public double getItemExpense(String id) {
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
		return Collections.unmodifiableList(new ArrayList<String>(items.keySet()));
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
		

		return Collections.unmodifiableList(new ArrayList<String>(searchResult));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeItemName(String id, String name) {
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
	 * @generated NOT
	 */
	public void changeItemPrice(String id, double price) {
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
	 * @generated NOT
	 */
	public void changeItemExpense(String id, double expense) {
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
		
		Item item = InventoryFactory.eINSTANCE.createItem();
			
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
	 * @generated NOT
	 */
	public void removeItem(String id) {
		if (items.containsKey(id)) {
			items.remove(id);
		} else {
			logger.warn("The Item with ID {} could not be found.", id);
			throw new InvalidIDException();
		}
	}
} //InventoryManagerImpl
