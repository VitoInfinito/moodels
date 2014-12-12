/**
 */
package Classes.Inventory;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Classes.Inventory.InventoryFactory
 * @model kind="package"
 * @generated
 */
public interface InventoryPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Inventory";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/Inventory.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Inventory";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	InventoryPackage eINSTANCE = Classes.Inventory.impl.InventoryPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.Inventory.IInventoryAccess <em>IInventory Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Inventory.IInventoryAccess
	 * @see Classes.Inventory.impl.InventoryPackageImpl#getIInventoryAccess()
	 * @generated
	 */
	int IINVENTORY_ACCESS = 3;

	/**
	 * The number of structural features of the '<em>IInventory Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINVENTORY_ACCESS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Change Item Stock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINVENTORY_ACCESS___CHANGE_ITEM_STOCK__STRING_INT = 0;

	/**
	 * The operation id for the '<em>Get Item Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINVENTORY_ACCESS___GET_ITEM_PRICE__STRING = 1;

	/**
	 * The operation id for the '<em>Get Item Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINVENTORY_ACCESS___GET_ITEM_NAME__STRING = 2;

	/**
	 * The operation id for the '<em>Get Item Stock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINVENTORY_ACCESS___GET_ITEM_STOCK__STRING = 3;

	/**
	 * The operation id for the '<em>Get Item Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINVENTORY_ACCESS___GET_ITEM_EXPENSE__STRING = 4;

	/**
	 * The operation id for the '<em>Get All Item IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINVENTORY_ACCESS___GET_ALL_ITEM_IDS = 5;

	/**
	 * The operation id for the '<em>Search Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINVENTORY_ACCESS___SEARCH_ITEMS__STRING = 6;

	/**
	 * The number of operations of the '<em>IInventory Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINVENTORY_ACCESS_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link Classes.Inventory.IManageInventory <em>IManage Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Inventory.IManageInventory
	 * @see Classes.Inventory.impl.InventoryPackageImpl#getIManageInventory()
	 * @generated
	 */
	int IMANAGE_INVENTORY = 0;

	/**
	 * The number of structural features of the '<em>IManage Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY_FEATURE_COUNT = IINVENTORY_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Item Stock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___CHANGE_ITEM_STOCK__STRING_INT = IINVENTORY_ACCESS___CHANGE_ITEM_STOCK__STRING_INT;

	/**
	 * The operation id for the '<em>Get Item Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___GET_ITEM_PRICE__STRING = IINVENTORY_ACCESS___GET_ITEM_PRICE__STRING;

	/**
	 * The operation id for the '<em>Get Item Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___GET_ITEM_NAME__STRING = IINVENTORY_ACCESS___GET_ITEM_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Item Stock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___GET_ITEM_STOCK__STRING = IINVENTORY_ACCESS___GET_ITEM_STOCK__STRING;

	/**
	 * The operation id for the '<em>Get Item Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___GET_ITEM_EXPENSE__STRING = IINVENTORY_ACCESS___GET_ITEM_EXPENSE__STRING;

	/**
	 * The operation id for the '<em>Get All Item IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___GET_ALL_ITEM_IDS = IINVENTORY_ACCESS___GET_ALL_ITEM_IDS;

	/**
	 * The operation id for the '<em>Search Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___SEARCH_ITEMS__STRING = IINVENTORY_ACCESS___SEARCH_ITEMS__STRING;

	/**
	 * The operation id for the '<em>Change Item Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___CHANGE_ITEM_NAME__STRING_STRING = IINVENTORY_ACCESS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Item Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___CHANGE_ITEM_PRICE__STRING_DOUBLE = IINVENTORY_ACCESS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Change Item Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___CHANGE_ITEM_EXPENSE__STRING_DOUBLE = IINVENTORY_ACCESS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___ADD_ITEM__STRING_DOUBLE_DOUBLE_INT = IINVENTORY_ACCESS_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Remove Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___REMOVE_ITEM__STRING = IINVENTORY_ACCESS_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>IManage Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY_OPERATION_COUNT = IINVENTORY_ACCESS_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link Classes.Inventory.impl.InventoryManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Inventory.impl.InventoryManagerImpl
	 * @see Classes.Inventory.impl.InventoryPackageImpl#getInventoryManager()
	 * @generated
	 */
	int INVENTORY_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MANAGER__ITEMS = IMANAGE_INVENTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MANAGER_FEATURE_COUNT = IMANAGE_INVENTORY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Change Item Stock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MANAGER___CHANGE_ITEM_STOCK__STRING_INT = IMANAGE_INVENTORY___CHANGE_ITEM_STOCK__STRING_INT;

	/**
	 * The operation id for the '<em>Get Item Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MANAGER___GET_ITEM_PRICE__STRING = IMANAGE_INVENTORY___GET_ITEM_PRICE__STRING;

	/**
	 * The operation id for the '<em>Get Item Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MANAGER___GET_ITEM_NAME__STRING = IMANAGE_INVENTORY___GET_ITEM_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Item Stock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MANAGER___GET_ITEM_STOCK__STRING = IMANAGE_INVENTORY___GET_ITEM_STOCK__STRING;

	/**
	 * The operation id for the '<em>Get Item Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MANAGER___GET_ITEM_EXPENSE__STRING = IMANAGE_INVENTORY___GET_ITEM_EXPENSE__STRING;

	/**
	 * The operation id for the '<em>Get All Item IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MANAGER___GET_ALL_ITEM_IDS = IMANAGE_INVENTORY___GET_ALL_ITEM_IDS;

	/**
	 * The operation id for the '<em>Search Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MANAGER___SEARCH_ITEMS__STRING = IMANAGE_INVENTORY___SEARCH_ITEMS__STRING;

	/**
	 * The operation id for the '<em>Change Item Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MANAGER___CHANGE_ITEM_NAME__STRING_STRING = IMANAGE_INVENTORY___CHANGE_ITEM_NAME__STRING_STRING;

	/**
	 * The operation id for the '<em>Change Item Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MANAGER___CHANGE_ITEM_PRICE__STRING_DOUBLE = IMANAGE_INVENTORY___CHANGE_ITEM_PRICE__STRING_DOUBLE;

	/**
	 * The operation id for the '<em>Change Item Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MANAGER___CHANGE_ITEM_EXPENSE__STRING_DOUBLE = IMANAGE_INVENTORY___CHANGE_ITEM_EXPENSE__STRING_DOUBLE;

	/**
	 * The operation id for the '<em>Add Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MANAGER___ADD_ITEM__STRING_DOUBLE_DOUBLE_INT = IMANAGE_INVENTORY___ADD_ITEM__STRING_DOUBLE_DOUBLE_INT;

	/**
	 * The operation id for the '<em>Remove Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MANAGER___REMOVE_ITEM__STRING = IMANAGE_INVENTORY___REMOVE_ITEM__STRING;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_MANAGER_OPERATION_COUNT = IMANAGE_INVENTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.Inventory.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Inventory.impl.ItemImpl
	 * @see Classes.Inventory.impl.InventoryPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Expense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__EXPENSE = 2;

	/**
	 * The feature id for the '<em><b>Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__STOCK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ID = 4;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link Classes.Inventory.IManageInventory <em>IManage Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IManage Inventory</em>'.
	 * @see Classes.Inventory.IManageInventory
	 * @generated
	 */
	EClass getIManageInventory();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IManageInventory#changeItemName(java.lang.String, java.lang.String) <em>Change Item Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Item Name</em>' operation.
	 * @see Classes.Inventory.IManageInventory#changeItemName(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIManageInventory__ChangeItemName__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IManageInventory#changeItemPrice(java.lang.String, double) <em>Change Item Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Item Price</em>' operation.
	 * @see Classes.Inventory.IManageInventory#changeItemPrice(java.lang.String, double)
	 * @generated
	 */
	EOperation getIManageInventory__ChangeItemPrice__String_double();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IManageInventory#changeItemExpense(java.lang.String, double) <em>Change Item Expense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Item Expense</em>' operation.
	 * @see Classes.Inventory.IManageInventory#changeItemExpense(java.lang.String, double)
	 * @generated
	 */
	EOperation getIManageInventory__ChangeItemExpense__String_double();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IManageInventory#addItem(java.lang.String, double, double, int) <em>Add Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Item</em>' operation.
	 * @see Classes.Inventory.IManageInventory#addItem(java.lang.String, double, double, int)
	 * @generated
	 */
	EOperation getIManageInventory__AddItem__String_double_double_int();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IManageInventory#removeItem(java.lang.String) <em>Remove Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Item</em>' operation.
	 * @see Classes.Inventory.IManageInventory#removeItem(java.lang.String)
	 * @generated
	 */
	EOperation getIManageInventory__RemoveItem__String();

	/**
	 * Returns the meta object for class '{@link Classes.Inventory.IInventoryAccess <em>IInventory Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IInventory Access</em>'.
	 * @see Classes.Inventory.IInventoryAccess
	 * @generated
	 */
	EClass getIInventoryAccess();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IInventoryAccess#changeItemStock(java.lang.String, int) <em>Change Item Stock</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Item Stock</em>' operation.
	 * @see Classes.Inventory.IInventoryAccess#changeItemStock(java.lang.String, int)
	 * @generated
	 */
	EOperation getIInventoryAccess__ChangeItemStock__String_int();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IInventoryAccess#getItemPrice(java.lang.String) <em>Get Item Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Item Price</em>' operation.
	 * @see Classes.Inventory.IInventoryAccess#getItemPrice(java.lang.String)
	 * @generated
	 */
	EOperation getIInventoryAccess__GetItemPrice__String();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IInventoryAccess#getItemName(java.lang.String) <em>Get Item Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Item Name</em>' operation.
	 * @see Classes.Inventory.IInventoryAccess#getItemName(java.lang.String)
	 * @generated
	 */
	EOperation getIInventoryAccess__GetItemName__String();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IInventoryAccess#getItemStock(java.lang.String) <em>Get Item Stock</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Item Stock</em>' operation.
	 * @see Classes.Inventory.IInventoryAccess#getItemStock(java.lang.String)
	 * @generated
	 */
	EOperation getIInventoryAccess__GetItemStock__String();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IInventoryAccess#getItemExpense(java.lang.String) <em>Get Item Expense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Item Expense</em>' operation.
	 * @see Classes.Inventory.IInventoryAccess#getItemExpense(java.lang.String)
	 * @generated
	 */
	EOperation getIInventoryAccess__GetItemExpense__String();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IInventoryAccess#getAllItemIDs() <em>Get All Item IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Item IDs</em>' operation.
	 * @see Classes.Inventory.IInventoryAccess#getAllItemIDs()
	 * @generated
	 */
	EOperation getIInventoryAccess__GetAllItemIDs();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IInventoryAccess#searchItems(java.lang.String) <em>Search Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Items</em>' operation.
	 * @see Classes.Inventory.IInventoryAccess#searchItems(java.lang.String)
	 * @generated
	 */
	EOperation getIInventoryAccess__SearchItems__String();

	/**
	 * Returns the meta object for class '{@link Classes.Inventory.InventoryManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see Classes.Inventory.InventoryManager
	 * @generated
	 */
	EClass getInventoryManager();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Inventory.InventoryManager#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Items</em>'.
	 * @see Classes.Inventory.InventoryManager#getItems()
	 * @see #getInventoryManager()
	 * @generated
	 */
	EReference getInventoryManager_Items();

	/**
	 * Returns the meta object for class '{@link Classes.Inventory.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see Classes.Inventory.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Inventory.Item#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Classes.Inventory.Item#getName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Inventory.Item#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Classes.Inventory.Item#getPrice()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Price();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Inventory.Item#getExpense <em>Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expense</em>'.
	 * @see Classes.Inventory.Item#getExpense()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Expense();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Inventory.Item#getStock <em>Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stock</em>'.
	 * @see Classes.Inventory.Item#getStock()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Stock();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Inventory.Item#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Classes.Inventory.Item#getId()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Id();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	InventoryFactory getInventoryFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Classes.Inventory.IManageInventory <em>IManage Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Inventory.IManageInventory
		 * @see Classes.Inventory.impl.InventoryPackageImpl#getIManageInventory()
		 * @generated
		 */
		EClass IMANAGE_INVENTORY = eINSTANCE.getIManageInventory();

		/**
		 * The meta object literal for the '<em><b>Change Item Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGE_INVENTORY___CHANGE_ITEM_NAME__STRING_STRING = eINSTANCE.getIManageInventory__ChangeItemName__String_String();

		/**
		 * The meta object literal for the '<em><b>Change Item Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGE_INVENTORY___CHANGE_ITEM_PRICE__STRING_DOUBLE = eINSTANCE.getIManageInventory__ChangeItemPrice__String_double();

		/**
		 * The meta object literal for the '<em><b>Change Item Expense</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGE_INVENTORY___CHANGE_ITEM_EXPENSE__STRING_DOUBLE = eINSTANCE.getIManageInventory__ChangeItemExpense__String_double();

		/**
		 * The meta object literal for the '<em><b>Add Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGE_INVENTORY___ADD_ITEM__STRING_DOUBLE_DOUBLE_INT = eINSTANCE.getIManageInventory__AddItem__String_double_double_int();

		/**
		 * The meta object literal for the '<em><b>Remove Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGE_INVENTORY___REMOVE_ITEM__STRING = eINSTANCE.getIManageInventory__RemoveItem__String();

		/**
		 * The meta object literal for the '{@link Classes.Inventory.IInventoryAccess <em>IInventory Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Inventory.IInventoryAccess
		 * @see Classes.Inventory.impl.InventoryPackageImpl#getIInventoryAccess()
		 * @generated
		 */
		EClass IINVENTORY_ACCESS = eINSTANCE.getIInventoryAccess();

		/**
		 * The meta object literal for the '<em><b>Change Item Stock</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IINVENTORY_ACCESS___CHANGE_ITEM_STOCK__STRING_INT = eINSTANCE.getIInventoryAccess__ChangeItemStock__String_int();

		/**
		 * The meta object literal for the '<em><b>Get Item Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IINVENTORY_ACCESS___GET_ITEM_PRICE__STRING = eINSTANCE.getIInventoryAccess__GetItemPrice__String();

		/**
		 * The meta object literal for the '<em><b>Get Item Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IINVENTORY_ACCESS___GET_ITEM_NAME__STRING = eINSTANCE.getIInventoryAccess__GetItemName__String();

		/**
		 * The meta object literal for the '<em><b>Get Item Stock</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IINVENTORY_ACCESS___GET_ITEM_STOCK__STRING = eINSTANCE.getIInventoryAccess__GetItemStock__String();

		/**
		 * The meta object literal for the '<em><b>Get Item Expense</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IINVENTORY_ACCESS___GET_ITEM_EXPENSE__STRING = eINSTANCE.getIInventoryAccess__GetItemExpense__String();

		/**
		 * The meta object literal for the '<em><b>Get All Item IDs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IINVENTORY_ACCESS___GET_ALL_ITEM_IDS = eINSTANCE.getIInventoryAccess__GetAllItemIDs();

		/**
		 * The meta object literal for the '<em><b>Search Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IINVENTORY_ACCESS___SEARCH_ITEMS__STRING = eINSTANCE.getIInventoryAccess__SearchItems__String();

		/**
		 * The meta object literal for the '{@link Classes.Inventory.impl.InventoryManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Inventory.impl.InventoryManagerImpl
		 * @see Classes.Inventory.impl.InventoryPackageImpl#getInventoryManager()
		 * @generated
		 */
		EClass INVENTORY_MANAGER = eINSTANCE.getInventoryManager();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY_MANAGER__ITEMS = eINSTANCE.getInventoryManager_Items();

		/**
		 * The meta object literal for the '{@link Classes.Inventory.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Inventory.impl.ItemImpl
		 * @see Classes.Inventory.impl.InventoryPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NAME = eINSTANCE.getItem_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__PRICE = eINSTANCE.getItem_Price();

		/**
		 * The meta object literal for the '<em><b>Expense</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__EXPENSE = eINSTANCE.getItem_Expense();

		/**
		 * The meta object literal for the '<em><b>Stock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__STOCK = eINSTANCE.getItem_Stock();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__ID = eINSTANCE.getItem_Id();

	}

} //InventoryPackage
