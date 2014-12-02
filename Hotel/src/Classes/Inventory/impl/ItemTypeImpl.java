/**
 */
package Classes.Inventory.impl;

import Classes.Inventory.InventoryPackage;
import Classes.Inventory.ItemType;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Inventory.impl.ItemTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link Classes.Inventory.impl.ItemTypeImpl#getPrice <em>Price</em>}</li>
 *   <li>{@link Classes.Inventory.impl.ItemTypeImpl#getExpense <em>Expense</em>}</li>
 *   <li>{@link Classes.Inventory.impl.ItemTypeImpl#getStock <em>Stock</em>}</li>
 *   <li>{@link Classes.Inventory.impl.ItemTypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItemTypeImpl extends MinimalEObjectImpl.Container implements ItemType {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected static final int PRICE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPrice() <em>Price</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrice()
	 * @generated
	 * @ordered
	 */
	protected int price = PRICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpense() <em>Expense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpense()
	 * @generated
	 * @ordered
	 */
	protected static final int EXPENSE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExpense() <em>Expense</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpense()
	 * @generated
	 * @ordered
	 */
	protected int expense = EXPENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getStock() <em>Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStock()
	 * @generated
	 * @ordered
	 */
	protected static final int STOCK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStock() <em>Stock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStock()
	 * @generated
	 * @ordered
	 */
	protected int stock = STOCK_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return InventoryPackage.Literals.ITEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.ITEM_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice(int newPrice) {
		int oldPrice = price;
		price = newPrice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.ITEM_TYPE__PRICE, oldPrice, price));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExpense() {
		return expense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpense(int newExpense) {
		int oldExpense = expense;
		expense = newExpense;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.ITEM_TYPE__EXPENSE, oldExpense, expense));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStock(int newStock) {
		int oldStock = stock;
		stock = newStock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.ITEM_TYPE__STOCK, oldStock, stock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, InventoryPackage.ITEM_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrice() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpense() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStock() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case InventoryPackage.ITEM_TYPE__NAME:
				return getName();
			case InventoryPackage.ITEM_TYPE__PRICE:
				return getPrice();
			case InventoryPackage.ITEM_TYPE__EXPENSE:
				return getExpense();
			case InventoryPackage.ITEM_TYPE__STOCK:
				return getStock();
			case InventoryPackage.ITEM_TYPE__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case InventoryPackage.ITEM_TYPE__NAME:
				setName((String)newValue);
				return;
			case InventoryPackage.ITEM_TYPE__PRICE:
				setPrice((Integer)newValue);
				return;
			case InventoryPackage.ITEM_TYPE__EXPENSE:
				setExpense((Integer)newValue);
				return;
			case InventoryPackage.ITEM_TYPE__STOCK:
				setStock((Integer)newValue);
				return;
			case InventoryPackage.ITEM_TYPE__ID:
				setId((Integer)newValue);
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
			case InventoryPackage.ITEM_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case InventoryPackage.ITEM_TYPE__PRICE:
				setPrice(PRICE_EDEFAULT);
				return;
			case InventoryPackage.ITEM_TYPE__EXPENSE:
				setExpense(EXPENSE_EDEFAULT);
				return;
			case InventoryPackage.ITEM_TYPE__STOCK:
				setStock(STOCK_EDEFAULT);
				return;
			case InventoryPackage.ITEM_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case InventoryPackage.ITEM_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case InventoryPackage.ITEM_TYPE__PRICE:
				return price != PRICE_EDEFAULT;
			case InventoryPackage.ITEM_TYPE__EXPENSE:
				return expense != EXPENSE_EDEFAULT;
			case InventoryPackage.ITEM_TYPE__STOCK:
				return stock != STOCK_EDEFAULT;
			case InventoryPackage.ITEM_TYPE__ID:
				return id != ID_EDEFAULT;
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
			case InventoryPackage.ITEM_TYPE___SET_NAME:
				setName();
				return null;
			case InventoryPackage.ITEM_TYPE___SET_PRICE:
				setPrice();
				return null;
			case InventoryPackage.ITEM_TYPE___SET_EXPENSE:
				setExpense();
				return null;
			case InventoryPackage.ITEM_TYPE___SET_STOCK:
				setStock();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", price: ");
		result.append(price);
		result.append(", expense: ");
		result.append(expense);
		result.append(", stock: ");
		result.append(stock);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ItemTypeImpl
