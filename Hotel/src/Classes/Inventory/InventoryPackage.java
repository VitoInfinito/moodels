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
	int IINVENTORY_ACCESS = 1;

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
	int IINVENTORY_ACCESS___CHANGE_ITEM_STOCK__INT_INT = 0;

	/**
	 * The operation id for the '<em>Get Item Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINVENTORY_ACCESS___GET_ITEM_PRICE__INT = 1;

	/**
	 * The operation id for the '<em>Get Item Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINVENTORY_ACCESS___GET_ITEM_NAME__INT = 2;

	/**
	 * The operation id for the '<em>Get Item Stock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINVENTORY_ACCESS___GET_ITEM_STOCK__INT = 3;

	/**
	 * The operation id for the '<em>Get Item Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IINVENTORY_ACCESS___GET_ITEM_EXPENSE__INT = 4;

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
	int IINVENTORY_ACCESS___SEARCH_ITEMS = 6;

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
	int IMANAGE_INVENTORY___CHANGE_ITEM_STOCK__INT_INT = IINVENTORY_ACCESS___CHANGE_ITEM_STOCK__INT_INT;

	/**
	 * The operation id for the '<em>Get Item Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___GET_ITEM_PRICE__INT = IINVENTORY_ACCESS___GET_ITEM_PRICE__INT;

	/**
	 * The operation id for the '<em>Get Item Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___GET_ITEM_NAME__INT = IINVENTORY_ACCESS___GET_ITEM_NAME__INT;

	/**
	 * The operation id for the '<em>Get Item Stock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___GET_ITEM_STOCK__INT = IINVENTORY_ACCESS___GET_ITEM_STOCK__INT;

	/**
	 * The operation id for the '<em>Get Item Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___GET_ITEM_EXPENSE__INT = IINVENTORY_ACCESS___GET_ITEM_EXPENSE__INT;

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
	int IMANAGE_INVENTORY___SEARCH_ITEMS = IINVENTORY_ACCESS___SEARCH_ITEMS;

	/**
	 * The operation id for the '<em>Change Item Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___CHANGE_ITEM_NAME__INT_STRING = IINVENTORY_ACCESS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Item Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___CHANGE_ITEM_PRICE__INT_INT = IINVENTORY_ACCESS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Change Item Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___CHANGE_ITEM_EXPENSE__INT_INT = IINVENTORY_ACCESS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___ADD_ITEM__STRING_INT_INT_INT = IINVENTORY_ACCESS_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Remove Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY___REMOVE_ITEM__INT = IINVENTORY_ACCESS_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>IManage Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_INVENTORY_OPERATION_COUNT = IINVENTORY_ACCESS_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link Classes.Inventory.impl.InventoryImpl <em>Inventory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Inventory.impl.InventoryImpl
	 * @see Classes.Inventory.impl.InventoryPackageImpl#getInventory()
	 * @generated
	 */
	int INVENTORY = 2;

	/**
	 * The feature id for the '<em><b>Item Type</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY__ITEM_TYPE = IMANAGE_INVENTORY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_FEATURE_COUNT = IMANAGE_INVENTORY_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Change Item Stock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY___CHANGE_ITEM_STOCK__INT_INT = IMANAGE_INVENTORY___CHANGE_ITEM_STOCK__INT_INT;

	/**
	 * The operation id for the '<em>Get Item Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY___GET_ITEM_PRICE__INT = IMANAGE_INVENTORY___GET_ITEM_PRICE__INT;

	/**
	 * The operation id for the '<em>Get Item Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY___GET_ITEM_NAME__INT = IMANAGE_INVENTORY___GET_ITEM_NAME__INT;

	/**
	 * The operation id for the '<em>Get Item Stock</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY___GET_ITEM_STOCK__INT = IMANAGE_INVENTORY___GET_ITEM_STOCK__INT;

	/**
	 * The operation id for the '<em>Get Item Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY___GET_ITEM_EXPENSE__INT = IMANAGE_INVENTORY___GET_ITEM_EXPENSE__INT;

	/**
	 * The operation id for the '<em>Get All Item IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY___GET_ALL_ITEM_IDS = IMANAGE_INVENTORY___GET_ALL_ITEM_IDS;

	/**
	 * The operation id for the '<em>Search Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY___SEARCH_ITEMS = IMANAGE_INVENTORY___SEARCH_ITEMS;

	/**
	 * The operation id for the '<em>Change Item Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY___CHANGE_ITEM_NAME__INT_STRING = IMANAGE_INVENTORY___CHANGE_ITEM_NAME__INT_STRING;

	/**
	 * The operation id for the '<em>Change Item Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY___CHANGE_ITEM_PRICE__INT_INT = IMANAGE_INVENTORY___CHANGE_ITEM_PRICE__INT_INT;

	/**
	 * The operation id for the '<em>Change Item Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY___CHANGE_ITEM_EXPENSE__INT_INT = IMANAGE_INVENTORY___CHANGE_ITEM_EXPENSE__INT_INT;

	/**
	 * The operation id for the '<em>Add Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY___ADD_ITEM__STRING_INT_INT_INT = IMANAGE_INVENTORY___ADD_ITEM__STRING_INT_INT_INT;

	/**
	 * The operation id for the '<em>Remove Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY___REMOVE_ITEM__INT = IMANAGE_INVENTORY___REMOVE_ITEM__INT;

	/**
	 * The number of operations of the '<em>Inventory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INVENTORY_OPERATION_COUNT = IMANAGE_INVENTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.Inventory.impl.ItemTypeImpl <em>Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Inventory.impl.ItemTypeImpl
	 * @see Classes.Inventory.impl.InventoryPackageImpl#getItemType()
	 * @generated
	 */
	int ITEM_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Expense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__EXPENSE = 2;

	/**
	 * The feature id for the '<em><b>Stock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__STOCK = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE__ID = 4;

	/**
	 * The number of structural features of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_TYPE_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the '{@link Classes.Inventory.IManageInventory#changeItemName(int, java.lang.String) <em>Change Item Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Item Name</em>' operation.
	 * @see Classes.Inventory.IManageInventory#changeItemName(int, java.lang.String)
	 * @generated
	 */
	EOperation getIManageInventory__ChangeItemName__int_String();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IManageInventory#changeItemPrice(int, int) <em>Change Item Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Item Price</em>' operation.
	 * @see Classes.Inventory.IManageInventory#changeItemPrice(int, int)
	 * @generated
	 */
	EOperation getIManageInventory__ChangeItemPrice__int_int();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IManageInventory#changeItemExpense(int, int) <em>Change Item Expense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Item Expense</em>' operation.
	 * @see Classes.Inventory.IManageInventory#changeItemExpense(int, int)
	 * @generated
	 */
	EOperation getIManageInventory__ChangeItemExpense__int_int();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IManageInventory#addItem(java.lang.String, int, int, int) <em>Add Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Item</em>' operation.
	 * @see Classes.Inventory.IManageInventory#addItem(java.lang.String, int, int, int)
	 * @generated
	 */
	EOperation getIManageInventory__AddItem__String_int_int_int();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IManageInventory#removeItem(int) <em>Remove Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Item</em>' operation.
	 * @see Classes.Inventory.IManageInventory#removeItem(int)
	 * @generated
	 */
	EOperation getIManageInventory__RemoveItem__int();

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
	 * Returns the meta object for the '{@link Classes.Inventory.IInventoryAccess#changeItemStock(int, int) <em>Change Item Stock</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Item Stock</em>' operation.
	 * @see Classes.Inventory.IInventoryAccess#changeItemStock(int, int)
	 * @generated
	 */
	EOperation getIInventoryAccess__ChangeItemStock__int_int();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IInventoryAccess#getItemPrice(int) <em>Get Item Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Item Price</em>' operation.
	 * @see Classes.Inventory.IInventoryAccess#getItemPrice(int)
	 * @generated
	 */
	EOperation getIInventoryAccess__GetItemPrice__int();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IInventoryAccess#getItemName(int) <em>Get Item Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Item Name</em>' operation.
	 * @see Classes.Inventory.IInventoryAccess#getItemName(int)
	 * @generated
	 */
	EOperation getIInventoryAccess__GetItemName__int();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IInventoryAccess#getItemStock(int) <em>Get Item Stock</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Item Stock</em>' operation.
	 * @see Classes.Inventory.IInventoryAccess#getItemStock(int)
	 * @generated
	 */
	EOperation getIInventoryAccess__GetItemStock__int();

	/**
	 * Returns the meta object for the '{@link Classes.Inventory.IInventoryAccess#getItemExpense(int) <em>Get Item Expense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Item Expense</em>' operation.
	 * @see Classes.Inventory.IInventoryAccess#getItemExpense(int)
	 * @generated
	 */
	EOperation getIInventoryAccess__GetItemExpense__int();

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
	 * Returns the meta object for the '{@link Classes.Inventory.IInventoryAccess#searchItems() <em>Search Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Items</em>' operation.
	 * @see Classes.Inventory.IInventoryAccess#searchItems()
	 * @generated
	 */
	EOperation getIInventoryAccess__SearchItems();

	/**
	 * Returns the meta object for class '{@link Classes.Inventory.Inventory <em>Inventory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inventory</em>'.
	 * @see Classes.Inventory.Inventory
	 * @generated
	 */
	EClass getInventory();

	/**
	 * Returns the meta object for the map '{@link Classes.Inventory.Inventory#getItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Item Type</em>'.
	 * @see Classes.Inventory.Inventory#getItemType()
	 * @see #getInventory()
	 * @generated
	 */
	EReference getInventory_ItemType();

	/**
	 * Returns the meta object for class '{@link Classes.Inventory.ItemType <em>Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Type</em>'.
	 * @see Classes.Inventory.ItemType
	 * @generated
	 */
	EClass getItemType();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Inventory.ItemType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Classes.Inventory.ItemType#getName()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Name();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Inventory.ItemType#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Classes.Inventory.ItemType#getPrice()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Price();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Inventory.ItemType#getExpense <em>Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expense</em>'.
	 * @see Classes.Inventory.ItemType#getExpense()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Expense();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Inventory.ItemType#getStock <em>Stock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stock</em>'.
	 * @see Classes.Inventory.ItemType#getStock()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Stock();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Inventory.ItemType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Classes.Inventory.ItemType#getId()
	 * @see #getItemType()
	 * @generated
	 */
	EAttribute getItemType_Id();

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
		EOperation IMANAGE_INVENTORY___CHANGE_ITEM_NAME__INT_STRING = eINSTANCE.getIManageInventory__ChangeItemName__int_String();

		/**
		 * The meta object literal for the '<em><b>Change Item Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGE_INVENTORY___CHANGE_ITEM_PRICE__INT_INT = eINSTANCE.getIManageInventory__ChangeItemPrice__int_int();

		/**
		 * The meta object literal for the '<em><b>Change Item Expense</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGE_INVENTORY___CHANGE_ITEM_EXPENSE__INT_INT = eINSTANCE.getIManageInventory__ChangeItemExpense__int_int();

		/**
		 * The meta object literal for the '<em><b>Add Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGE_INVENTORY___ADD_ITEM__STRING_INT_INT_INT = eINSTANCE.getIManageInventory__AddItem__String_int_int_int();

		/**
		 * The meta object literal for the '<em><b>Remove Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGE_INVENTORY___REMOVE_ITEM__INT = eINSTANCE.getIManageInventory__RemoveItem__int();

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
		EOperation IINVENTORY_ACCESS___CHANGE_ITEM_STOCK__INT_INT = eINSTANCE.getIInventoryAccess__ChangeItemStock__int_int();

		/**
		 * The meta object literal for the '<em><b>Get Item Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IINVENTORY_ACCESS___GET_ITEM_PRICE__INT = eINSTANCE.getIInventoryAccess__GetItemPrice__int();

		/**
		 * The meta object literal for the '<em><b>Get Item Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IINVENTORY_ACCESS___GET_ITEM_NAME__INT = eINSTANCE.getIInventoryAccess__GetItemName__int();

		/**
		 * The meta object literal for the '<em><b>Get Item Stock</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IINVENTORY_ACCESS___GET_ITEM_STOCK__INT = eINSTANCE.getIInventoryAccess__GetItemStock__int();

		/**
		 * The meta object literal for the '<em><b>Get Item Expense</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IINVENTORY_ACCESS___GET_ITEM_EXPENSE__INT = eINSTANCE.getIInventoryAccess__GetItemExpense__int();

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
		EOperation IINVENTORY_ACCESS___SEARCH_ITEMS = eINSTANCE.getIInventoryAccess__SearchItems();

		/**
		 * The meta object literal for the '{@link Classes.Inventory.impl.InventoryImpl <em>Inventory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Inventory.impl.InventoryImpl
		 * @see Classes.Inventory.impl.InventoryPackageImpl#getInventory()
		 * @generated
		 */
		EClass INVENTORY = eINSTANCE.getInventory();

		/**
		 * The meta object literal for the '<em><b>Item Type</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INVENTORY__ITEM_TYPE = eINSTANCE.getInventory_ItemType();

		/**
		 * The meta object literal for the '{@link Classes.Inventory.impl.ItemTypeImpl <em>Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Inventory.impl.ItemTypeImpl
		 * @see Classes.Inventory.impl.InventoryPackageImpl#getItemType()
		 * @generated
		 */
		EClass ITEM_TYPE = eINSTANCE.getItemType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__NAME = eINSTANCE.getItemType_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__PRICE = eINSTANCE.getItemType_Price();

		/**
		 * The meta object literal for the '<em><b>Expense</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__EXPENSE = eINSTANCE.getItemType_Expense();

		/**
		 * The meta object literal for the '<em><b>Stock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__STOCK = eINSTANCE.getItemType_Stock();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_TYPE__ID = eINSTANCE.getItemType_Id();

	}

} //InventoryPackage
