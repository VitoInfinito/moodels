/**
 */
package Classes.Inventory.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.InvalidIDException;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToItemMapImpl;
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
	private InventoryManagerImpl() {
		super();
		items = new EcoreEMap<String,Item>(ECoreMapEntriesPackage.Literals.STRING_TO_ITEM_TYPE_MAP, StringToItemMapImpl.class, this, InventoryPackage.INVENTORY_MANAGER__ITEMS);
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
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Item> getItems() {
		throw new UnsupportedOperationException();
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
	 * @generated NOT
	 */
	public void changeItemPrice(String id, double price) {
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
	public void changeItemExpense(String id, double expense) {
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
	public void addItem(String name, double price, double expense, int stock) {
		String id = IDCounter++ + "";
		
		Item item = new ItemImpl();
			
		item.setId(id);
		item.setName(name);
		item.setPrice(price);
		item.setExpense(expense);
		item.setStock(stock);
		
		items.put(id, item);
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
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		throw new UnsupportedOperationException();
	}
} //InventoryManagerImpl
