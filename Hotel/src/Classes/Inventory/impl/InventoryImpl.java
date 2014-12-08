/**
 */
package Classes.Inventory.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Classes.InvalidIDException;
import Classes.Inventory.Inventory;
import Classes.Inventory.InventoryPackage;
import Classes.Inventory.ItemType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inventory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Inventory.impl.InventoryImpl#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InventoryImpl extends MinimalEObjectImpl.Container implements Inventory {
	private final Logger logger = LoggerFactory.getLogger(ItemTypeImpl.class);
	
	/**
	 * The cached value of the '{@link #getItemType() <em>Item Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemType()
	 * @generated NOT
	 * @ordered
	 */
	private EMap<String, ItemType> itemType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected InventoryImpl() {
		super();
		
		itemType = (EMap<String, ItemType>) new HashMap<String, ItemType>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.INVENTORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, ItemType> getItemType() {
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeItemStock(int id, int stock) {
		if (itemType.containsKey(id + "")) {
			itemType.get(id + "").setStock(stock);
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
	public int getItemPrice(int id) {
		if (itemType.containsKey(id + "")) {
			return itemType.get(id + "").getPrice();
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
	public String getItemName(int id) {
		if (itemType.containsKey(id + "")) {
			return itemType.get(id + "").getName();
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
	public int getItemStock(int id) {
		if (itemType.containsKey(id + "")) {
			return itemType.get(id + "").getStock();
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
	public int getItemExpense(int id) {
		if (itemType.containsKey(id + "")) {
			return itemType.get(id + "").getExpense();
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
	public EList<Integer> getAllItemIDs() {
		List<String> strList = new ArrayList<String>(getItemType().keySet());
		List<Integer> intList = new ArrayList<Integer>();
		
		for(String s : strList) {
			intList.add(Integer.valueOf(s));
		}
		
		return (EList<Integer>) intList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeItemName(int id, String name) {
		if (itemType.containsKey(id + "")) {
			itemType.get(id + "").setName(name);
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
	public void changeItemPrice(int id, int price) {
		if (itemType.containsKey(id + "")) {
			itemType.get(id + "").setPrice(price);
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
	public void changeItemExpense(int id, int expense) {
		if (itemType.containsKey(id + "")) {
			itemType.get(id + "").setExpense(expense);
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
	public void addItem(int id, String name, int price, int expense, int stock) {
		if (!itemType.containsKey(id + "")) {
			ItemTypeImpl item = new ItemTypeImpl();
			
			item.setId(id);
			item.setName(name);
			item.setPrice(price);
			item.setExpense(expense);
			item.setStock(stock);
			
			itemType.put(id + "", item);
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
	public void removeItem(int id) {
		if (itemType.containsKey(id + "")) {
			itemType.remove(id + "");
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
			case InventoryPackage.INVENTORY__ITEM_TYPE:
				return getItemType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InventoryPackage.INVENTORY__ITEM_TYPE:
				getItemType().clear();
				getItemType().addAll((Collection<? extends Entry<String, ItemType>>)newValue);
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
			case InventoryPackage.INVENTORY__ITEM_TYPE:
				getItemType().clear();
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
			case InventoryPackage.INVENTORY__ITEM_TYPE:
				return itemType != null && !itemType.isEmpty();
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
			case InventoryPackage.INVENTORY___CHANGE_ITEM_STOCK__INT_INT:
				changeItemStock((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case InventoryPackage.INVENTORY___GET_ITEM_PRICE__INT:
				return getItemPrice((Integer)arguments.get(0));
			case InventoryPackage.INVENTORY___GET_ITEM_NAME__INT:
				return getItemName((Integer)arguments.get(0));
			case InventoryPackage.INVENTORY___GET_ITEM_STOCK__INT:
				return getItemStock((Integer)arguments.get(0));
			case InventoryPackage.INVENTORY___GET_ITEM_EXPENSE__INT:
				return getItemExpense((Integer)arguments.get(0));
			case InventoryPackage.INVENTORY___GET_ALL_ITEM_IDS:
				return getAllItemIDs();
			case InventoryPackage.INVENTORY___SEARCH_ITEMS:
				searchItems();
				return null;
			case InventoryPackage.INVENTORY___CHANGE_ITEM_NAME__INT_STRING:
				changeItemName((Integer)arguments.get(0), (String)arguments.get(1));
				return null;
			case InventoryPackage.INVENTORY___CHANGE_ITEM_PRICE__INT_INT:
				changeItemPrice((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case InventoryPackage.INVENTORY___CHANGE_ITEM_EXPENSE__INT_INT:
				changeItemExpense((Integer)arguments.get(0), (Integer)arguments.get(1));
				return null;
			case InventoryPackage.INVENTORY___ADD_ITEM__INT_STRING_INT_INT_INT:
				addItem((Integer)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (Integer)arguments.get(4));
				return null;
			case InventoryPackage.INVENTORY___REMOVE_ITEM__INT:
				removeItem((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //InventoryImpl
