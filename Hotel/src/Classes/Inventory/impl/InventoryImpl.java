/**
 */
package Classes.Inventory.impl;

import Classes.InvalidIDException;
import Classes.Inventory.Inventory;
import Classes.Inventory.InventoryPackage;
import Classes.Inventory.ItemType;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	 * The cached value of the '{@link #getItemType() <em>Item Type</em>}' map.
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
	 * @generated
	 */
	protected InventoryImpl() {
		super();
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
	
	private int getItemTypeIndex(int id) throws InvalidIDException {
		for (int i = 0; i < itemType.size(); i++) {
			if (itemType.get(i).getId() == id) {
				return i;
			}
		}
		
		logger.warn("The ItemType with ID {} could not be found.", id);
		throw new InvalidIDException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ItemType> getItemType() {
		if (itemType == null) {
			itemType = new EObjectResolvingEList<ItemType>(ItemType.class, this, InventoryPackage.INVENTORY__ITEM_TYPE);
		}
		return itemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeItemStock(int id, int stock) {
		itemType.get(getItemTypeIndex(id)).setStock(stock);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getItemPrice(int id) {
		return itemType.get(getItemTypeIndex(id)).getPrice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getItemName(int id) {
		return itemType.get(getItemTypeIndex(id)).getName();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getItemStock(int id) {
		return itemType.get(getItemTypeIndex(id)).getStock();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getItemExpense(int id) {
		return itemType.get(getItemTypeIndex(id)).getExpense();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Integer> getAllItemIDs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
		itemType.get(getItemTypeIndex(id)).setName(name);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeItemPrice(int id, int price) {
		itemType.get(getItemTypeIndex(id)).setPrice(price);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeItemExpense(int id, int expense) {
		itemType.get(getItemTypeIndex(id)).setExpense(expense);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addItem(String name, int price, int expense, int stock) {
		ItemTypeImpl item = new ItemTypeImpl();
		
		item.setName(name);
		item.setPrice(price);
		item.setExpense(expense);
		item.setStock(stock);
		
		itemType.add(item);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeItem(int id) {
		itemType.remove(getItemTypeIndex(id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case InventoryPackage.INVENTORY__ITEM_TYPE:
				return ((InternalEList<?>)getItemType()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.INVENTORY__ITEM_TYPE:
				if (coreType) return getItemType();
				else return getItemType().map();
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
				((EStructuralFeature.Setting)getItemType()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
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
	 * @generated NOT
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
	@SuppressWarnings("unchecked")
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
			case InventoryPackage.INVENTORY___ADD_ITEM__STRING_INT_INT_INT:
				addItem((String)arguments.get(0), (Integer)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3));
				return null;
			case InventoryPackage.INVENTORY___REMOVE_ITEM__INT:
				removeItem((Integer)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //InventoryImpl
