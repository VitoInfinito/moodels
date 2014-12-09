/**
 */
package Classes.Inventory.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Classes.InvalidIDException;
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
	
	/**
	 * The cached value of the '{@link #getItemType() <em>Item Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated NOT
	 * @ordered
	 */
	private EMap<String, Item> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected InventoryManagerImpl() {
		super();
		items = (EMap<String, Item>) new HashMap<String, Item>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.INVENTORY_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<Item> getItems() {
		return (List<Item>) items.values();
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
			logger.warn("The ItemType with ID {} could not be found.", id);
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
			logger.warn("The ItemType with ID {} could not be found.", id);
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
			logger.warn("The ItemType with ID {} could not be found.", id);
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
			logger.warn("The ItemType with ID {} could not be found.", id);
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
			logger.warn("The ItemType with ID {} could not be found.", id);
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
	 * @generated
	 */
	public EList<String> searchItems(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			logger.warn("The ItemType with ID {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeItemPrice(String id, double price) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeItemExpense(String id, double expense) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeItemPrice(String id, int price) {
		if (items.containsKey(id)) {
			items.get(id).setPrice(price);
		} else {
			logger.warn("The ItemType with ID {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeItemExpense(String id, int expense) {
		if (items.containsKey(id)) {
			items.get(id).setExpense(expense);
		} else {
			logger.warn("The ItemType with ID {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addItem(String id, String name, int price, int expense, int stock) {
		if (!items.containsKey(id)) {
			Item item = new ItemImpl();
			
			item.setId(id);
			item.setName(name);
			item.setPrice(price);
			item.setExpense(expense);
			item.setStock(stock);
			
			items.put(id, item);
		} else {
			logger.warn("An ItemType with ID {} were already in the inventory.", id);
			throw new InvalidIDException();
		}
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
			logger.warn("The ItemType with ID {} could not be found.", id);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.INVENTORY_MANAGER__ITEMS:
				return getItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InventoryPackage.INVENTORY_MANAGER__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends Item>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case InventoryPackage.INVENTORY_MANAGER__ITEMS:
				getItems().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case InventoryPackage.INVENTORY_MANAGER__ITEMS:
				return items != null && !items.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case InventoryPackage.INVENTORY_MANAGER___CHANGE_ITEM_STOCK__STRING_INT:
				changeItemStock((String)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case InventoryPackage.INVENTORY_MANAGER___GET_ITEM_PRICE__STRING:
				return getItemPrice((String)arguments.get(0));
			case InventoryPackage.INVENTORY_MANAGER___GET_ITEM_NAME__STRING:
				return getItemName((String)arguments.get(0));
			case InventoryPackage.INVENTORY_MANAGER___GET_ITEM_STOCK__STRING:
				return getItemStock((String)arguments.get(0));
			case InventoryPackage.INVENTORY_MANAGER___GET_ITEM_EXPENSE__STRING:
				return getItemExpense((String)arguments.get(0));
			case InventoryPackage.INVENTORY_MANAGER___GET_ALL_ITEM_IDS:
				return getAllItemIDs();
			case InventoryPackage.INVENTORY_MANAGER___SEARCH_ITEMS__STRING:
				return searchItems((String)arguments.get(0));
			case InventoryPackage.INVENTORY_MANAGER___CHANGE_ITEM_NAME__STRING_STRING:
				changeItemName((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case InventoryPackage.INVENTORY_MANAGER___CHANGE_ITEM_PRICE__STRING_DOUBLE:
				changeItemPrice((String)arguments.get(0), (Double)arguments.get(1));
				return null;
			case InventoryPackage.INVENTORY_MANAGER___CHANGE_ITEM_EXPENSE__STRING_DOUBLE:
				changeItemExpense((String)arguments.get(0), (Double)arguments.get(1));
				return null;
			case InventoryPackage.INVENTORY_MANAGER___ADD_ITEM__STRING_STRING_INT_INT_INT:
				addItem((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
				return null;
			case InventoryPackage.INVENTORY_MANAGER___REMOVE_ITEM__STRING:
				removeItem((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //InventoryManagerImpl
