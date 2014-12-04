/**
 */
package Classes.Services;

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
 * @see Classes.Services.ServicesFactory
 * @model kind="package"
 * @generated
 */
public interface ServicesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Services";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/Services.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Services";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServicesPackage eINSTANCE = Classes.Services.impl.ServicesPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.Services.impl.RoomServiceMenuImpl <em>Room Service Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Services.impl.RoomServiceMenuImpl
	 * @see Classes.Services.impl.ServicesPackageImpl#getRoomServiceMenu()
	 * @generated
	 */
	int ROOM_SERVICE_MENU = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_MENU__NAME = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_MENU__ITEMS = 1;

	/**
	 * The number of structural features of the '<em>Room Service Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_MENU_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_MENU___ADD_ITEM = 0;

	/**
	 * The operation id for the '<em>Remove Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_MENU___REMOVE_ITEM = 1;

	/**
	 * The number of operations of the '<em>Room Service Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_MENU_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Classes.Services.IServicesAccess <em>IServices Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Services.IServicesAccess
	 * @see Classes.Services.impl.ServicesPackageImpl#getIServicesAccess()
	 * @generated
	 */
	int ISERVICES_ACCESS = 1;

	/**
	 * The number of structural features of the '<em>IServices Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get All Service IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___GET_ALL_SERVICE_IDS = 0;

	/**
	 * The operation id for the '<em>Get All Room Service Order IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___GET_ALL_ROOM_SERVICE_ORDER_IDS = 1;

	/**
	 * The operation id for the '<em>Search Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___SEARCH_SERVICES = 2;

	/**
	 * The operation id for the '<em>Search Room Service Orders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___SEARCH_ROOM_SERVICE_ORDERS = 3;

	/**
	 * The operation id for the '<em>Get Service Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___GET_SERVICE_NAME = 4;

	/**
	 * The operation id for the '<em>Get Service Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___GET_SERVICE_PRICE = 5;

	/**
	 * The operation id for the '<em>Get Service Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___GET_SERVICE_EXPENSE = 6;

	/**
	 * The operation id for the '<em>Is RSO Delivered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___IS_RSO_DELIVERED = 7;

	/**
	 * The operation id for the '<em>Get RSO Delivery Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___GET_RSO_DELIVERY_DATE = 8;

	/**
	 * The operation id for the '<em>Get RSO Bookable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___GET_RSO_BOOKABLE = 9;

	/**
	 * The operation id for the '<em>Get RSO Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___GET_RSO_ITEMS = 10;

	/**
	 * The operation id for the '<em>Get RSO Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___GET_RSO_SERVICES = 11;

	/**
	 * The operation id for the '<em>Change RSOIS Delivered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___CHANGE_RSOIS_DELIVERED = 12;

	/**
	 * The operation id for the '<em>Change RSO Delivery Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___CHANGE_RSO_DELIVERY_DATE = 13;

	/**
	 * The operation id for the '<em>Get Room Service Menu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___GET_ROOM_SERVICE_MENU_NAME = 14;

	/**
	 * The operation id for the '<em>Get Room Service Menu Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___GET_ROOM_SERVICE_MENU_ITEMS = 15;

	/**
	 * The operation id for the '<em>Get Room Service Menu Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___GET_ROOM_SERVICE_MENU_INFORMATION = 16;

	/**
	 * The operation id for the '<em>Set RSO Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___SET_RSO_BILL = 17;

	/**
	 * The operation id for the '<em>Get RSO Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___GET_RSO_BILL = 18;

	/**
	 * The operation id for the '<em>Make Room Service Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS___MAKE_ROOM_SERVICE_ORDER = 19;

	/**
	 * The number of operations of the '<em>IServices Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_ACCESS_OPERATION_COUNT = 20;

	/**
	 * The meta object id for the '{@link Classes.Services.IServicesManage <em>IServices Manage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Services.IServicesManage
	 * @see Classes.Services.impl.ServicesPackageImpl#getIServicesManage()
	 * @generated
	 */
	int ISERVICES_MANAGE = 5;

	/**
	 * The number of structural features of the '<em>IServices Manage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE_FEATURE_COUNT = ISERVICES_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get All Service IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___GET_ALL_SERVICE_IDS = ISERVICES_ACCESS___GET_ALL_SERVICE_IDS;

	/**
	 * The operation id for the '<em>Get All Room Service Order IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___GET_ALL_ROOM_SERVICE_ORDER_IDS = ISERVICES_ACCESS___GET_ALL_ROOM_SERVICE_ORDER_IDS;

	/**
	 * The operation id for the '<em>Search Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___SEARCH_SERVICES = ISERVICES_ACCESS___SEARCH_SERVICES;

	/**
	 * The operation id for the '<em>Search Room Service Orders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___SEARCH_ROOM_SERVICE_ORDERS = ISERVICES_ACCESS___SEARCH_ROOM_SERVICE_ORDERS;

	/**
	 * The operation id for the '<em>Get Service Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___GET_SERVICE_NAME = ISERVICES_ACCESS___GET_SERVICE_NAME;

	/**
	 * The operation id for the '<em>Get Service Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___GET_SERVICE_PRICE = ISERVICES_ACCESS___GET_SERVICE_PRICE;

	/**
	 * The operation id for the '<em>Get Service Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___GET_SERVICE_EXPENSE = ISERVICES_ACCESS___GET_SERVICE_EXPENSE;

	/**
	 * The operation id for the '<em>Is RSO Delivered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___IS_RSO_DELIVERED = ISERVICES_ACCESS___IS_RSO_DELIVERED;

	/**
	 * The operation id for the '<em>Get RSO Delivery Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___GET_RSO_DELIVERY_DATE = ISERVICES_ACCESS___GET_RSO_DELIVERY_DATE;

	/**
	 * The operation id for the '<em>Get RSO Bookable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___GET_RSO_BOOKABLE = ISERVICES_ACCESS___GET_RSO_BOOKABLE;

	/**
	 * The operation id for the '<em>Get RSO Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___GET_RSO_ITEMS = ISERVICES_ACCESS___GET_RSO_ITEMS;

	/**
	 * The operation id for the '<em>Get RSO Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___GET_RSO_SERVICES = ISERVICES_ACCESS___GET_RSO_SERVICES;

	/**
	 * The operation id for the '<em>Change RSOIS Delivered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___CHANGE_RSOIS_DELIVERED = ISERVICES_ACCESS___CHANGE_RSOIS_DELIVERED;

	/**
	 * The operation id for the '<em>Change RSO Delivery Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___CHANGE_RSO_DELIVERY_DATE = ISERVICES_ACCESS___CHANGE_RSO_DELIVERY_DATE;

	/**
	 * The operation id for the '<em>Get Room Service Menu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___GET_ROOM_SERVICE_MENU_NAME = ISERVICES_ACCESS___GET_ROOM_SERVICE_MENU_NAME;

	/**
	 * The operation id for the '<em>Get Room Service Menu Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___GET_ROOM_SERVICE_MENU_ITEMS = ISERVICES_ACCESS___GET_ROOM_SERVICE_MENU_ITEMS;

	/**
	 * The operation id for the '<em>Get Room Service Menu Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___GET_ROOM_SERVICE_MENU_INFORMATION = ISERVICES_ACCESS___GET_ROOM_SERVICE_MENU_INFORMATION;

	/**
	 * The operation id for the '<em>Set RSO Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___SET_RSO_BILL = ISERVICES_ACCESS___SET_RSO_BILL;

	/**
	 * The operation id for the '<em>Get RSO Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___GET_RSO_BILL = ISERVICES_ACCESS___GET_RSO_BILL;

	/**
	 * The operation id for the '<em>Make Room Service Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___MAKE_ROOM_SERVICE_ORDER = ISERVICES_ACCESS___MAKE_ROOM_SERVICE_ORDER;

	/**
	 * The operation id for the '<em>Change Service Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___CHANGE_SERVICE_NAME = ISERVICES_ACCESS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Service Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___CHANGE_SERVICE_PRICE = ISERVICES_ACCESS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Change Service Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___CHANGE_SERVICE_EXPENSE = ISERVICES_ACCESS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Room Service Menu Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___ADD_ROOM_SERVICE_MENU_ITEM = ISERVICES_ACCESS_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Remove Room Service Menu Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___REMOVE_ROOM_SERVICE_MENU_ITEM = ISERVICES_ACCESS_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Change Room Service Menu Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___CHANGE_ROOM_SERVICE_MENU_ITEM = ISERVICES_ACCESS_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Change Room Service Menu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE___CHANGE_ROOM_SERVICE_MENU_NAME = ISERVICES_ACCESS_OPERATION_COUNT + 6;

	/**
	 * The number of operations of the '<em>IServices Manage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISERVICES_MANAGE_OPERATION_COUNT = ISERVICES_ACCESS_OPERATION_COUNT + 7;

	/**
	 * The meta object id for the '{@link Classes.Services.impl.ServiceManagerImpl <em>Service Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Services.impl.ServiceManagerImpl
	 * @see Classes.Services.impl.ServicesPackageImpl#getServiceManager()
	 * @generated
	 */
	int SERVICE_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER__SERVICE = ISERVICES_MANAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Room Service Order</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER__ROOM_SERVICE_ORDER = ISERVICES_MANAGE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Room Service Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER__ROOM_SERVICE_MENU = ISERVICES_MANAGE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Service Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER_FEATURE_COUNT = ISERVICES_MANAGE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Get All Service IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___GET_ALL_SERVICE_IDS = ISERVICES_MANAGE___GET_ALL_SERVICE_IDS;

	/**
	 * The operation id for the '<em>Get All Room Service Order IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___GET_ALL_ROOM_SERVICE_ORDER_IDS = ISERVICES_MANAGE___GET_ALL_ROOM_SERVICE_ORDER_IDS;

	/**
	 * The operation id for the '<em>Search Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___SEARCH_SERVICES = ISERVICES_MANAGE___SEARCH_SERVICES;

	/**
	 * The operation id for the '<em>Search Room Service Orders</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___SEARCH_ROOM_SERVICE_ORDERS = ISERVICES_MANAGE___SEARCH_ROOM_SERVICE_ORDERS;

	/**
	 * The operation id for the '<em>Get Service Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___GET_SERVICE_NAME = ISERVICES_MANAGE___GET_SERVICE_NAME;

	/**
	 * The operation id for the '<em>Get Service Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___GET_SERVICE_PRICE = ISERVICES_MANAGE___GET_SERVICE_PRICE;

	/**
	 * The operation id for the '<em>Get Service Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___GET_SERVICE_EXPENSE = ISERVICES_MANAGE___GET_SERVICE_EXPENSE;

	/**
	 * The operation id for the '<em>Is RSO Delivered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___IS_RSO_DELIVERED = ISERVICES_MANAGE___IS_RSO_DELIVERED;

	/**
	 * The operation id for the '<em>Get RSO Delivery Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___GET_RSO_DELIVERY_DATE = ISERVICES_MANAGE___GET_RSO_DELIVERY_DATE;

	/**
	 * The operation id for the '<em>Get RSO Bookable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___GET_RSO_BOOKABLE = ISERVICES_MANAGE___GET_RSO_BOOKABLE;

	/**
	 * The operation id for the '<em>Get RSO Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___GET_RSO_ITEMS = ISERVICES_MANAGE___GET_RSO_ITEMS;

	/**
	 * The operation id for the '<em>Get RSO Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___GET_RSO_SERVICES = ISERVICES_MANAGE___GET_RSO_SERVICES;

	/**
	 * The operation id for the '<em>Change RSOIS Delivered</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___CHANGE_RSOIS_DELIVERED = ISERVICES_MANAGE___CHANGE_RSOIS_DELIVERED;

	/**
	 * The operation id for the '<em>Change RSO Delivery Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___CHANGE_RSO_DELIVERY_DATE = ISERVICES_MANAGE___CHANGE_RSO_DELIVERY_DATE;

	/**
	 * The operation id for the '<em>Get Room Service Menu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___GET_ROOM_SERVICE_MENU_NAME = ISERVICES_MANAGE___GET_ROOM_SERVICE_MENU_NAME;

	/**
	 * The operation id for the '<em>Get Room Service Menu Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___GET_ROOM_SERVICE_MENU_ITEMS = ISERVICES_MANAGE___GET_ROOM_SERVICE_MENU_ITEMS;

	/**
	 * The operation id for the '<em>Get Room Service Menu Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___GET_ROOM_SERVICE_MENU_INFORMATION = ISERVICES_MANAGE___GET_ROOM_SERVICE_MENU_INFORMATION;

	/**
	 * The operation id for the '<em>Set RSO Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___SET_RSO_BILL = ISERVICES_MANAGE___SET_RSO_BILL;

	/**
	 * The operation id for the '<em>Get RSO Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___GET_RSO_BILL = ISERVICES_MANAGE___GET_RSO_BILL;

	/**
	 * The operation id for the '<em>Make Room Service Order</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___MAKE_ROOM_SERVICE_ORDER = ISERVICES_MANAGE___MAKE_ROOM_SERVICE_ORDER;

	/**
	 * The operation id for the '<em>Change Service Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___CHANGE_SERVICE_NAME = ISERVICES_MANAGE___CHANGE_SERVICE_NAME;

	/**
	 * The operation id for the '<em>Change Service Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___CHANGE_SERVICE_PRICE = ISERVICES_MANAGE___CHANGE_SERVICE_PRICE;

	/**
	 * The operation id for the '<em>Change Service Expense</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___CHANGE_SERVICE_EXPENSE = ISERVICES_MANAGE___CHANGE_SERVICE_EXPENSE;

	/**
	 * The operation id for the '<em>Add Room Service Menu Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___ADD_ROOM_SERVICE_MENU_ITEM = ISERVICES_MANAGE___ADD_ROOM_SERVICE_MENU_ITEM;

	/**
	 * The operation id for the '<em>Remove Room Service Menu Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___REMOVE_ROOM_SERVICE_MENU_ITEM = ISERVICES_MANAGE___REMOVE_ROOM_SERVICE_MENU_ITEM;

	/**
	 * The operation id for the '<em>Change Room Service Menu Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___CHANGE_ROOM_SERVICE_MENU_ITEM = ISERVICES_MANAGE___CHANGE_ROOM_SERVICE_MENU_ITEM;

	/**
	 * The operation id for the '<em>Change Room Service Menu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER___CHANGE_ROOM_SERVICE_MENU_NAME = ISERVICES_MANAGE___CHANGE_ROOM_SERVICE_MENU_NAME;

	/**
	 * The number of operations of the '<em>Service Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_MANAGER_OPERATION_COUNT = ISERVICES_MANAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.Services.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Services.impl.ServiceImpl
	 * @see Classes.Services.impl.ServicesPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Price</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__PRICE = 1;

	/**
	 * The feature id for the '<em><b>Expense</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__EXPENSE = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE__ID = 3;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.Services.impl.RoomServiceOrderImpl <em>Room Service Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Services.impl.RoomServiceOrderImpl
	 * @see Classes.Services.impl.ServicesPackageImpl#getRoomServiceOrder()
	 * @generated
	 */
	int ROOM_SERVICE_ORDER = 4;

	/**
	 * The feature id for the '<em><b>Service</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_ORDER__SERVICE = 0;

	/**
	 * The feature id for the '<em><b>Is Delivered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_ORDER__IS_DELIVERED = 1;

	/**
	 * The feature id for the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_ORDER__DELIVERY_DATE = 2;

	/**
	 * The feature id for the '<em><b>Bookable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_ORDER__BOOKABLE = 3;

	/**
	 * The feature id for the '<em><b>Items</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_ORDER__ITEMS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_ORDER__ID = 5;

	/**
	 * The feature id for the '<em><b>Bill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_ORDER__BILL = 6;

	/**
	 * The number of structural features of the '<em>Room Service Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_ORDER_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Add Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_ORDER___ADD_SERVICE = 0;

	/**
	 * The operation id for the '<em>Add Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_ORDER___ADD_ITEM = 1;

	/**
	 * The operation id for the '<em>Remove Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_ORDER___REMOVE_ITEM = 2;

	/**
	 * The operation id for the '<em>Remove Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_ORDER___REMOVE_SERVICE = 3;

	/**
	 * The number of operations of the '<em>Room Service Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_SERVICE_ORDER_OPERATION_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link Classes.Services.RoomServiceMenu <em>Room Service Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Service Menu</em>'.
	 * @see Classes.Services.RoomServiceMenu
	 * @generated
	 */
	EClass getRoomServiceMenu();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Services.RoomServiceMenu#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Classes.Services.RoomServiceMenu#getName()
	 * @see #getRoomServiceMenu()
	 * @generated
	 */
	EAttribute getRoomServiceMenu_Name();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.Services.RoomServiceMenu#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Items</em>'.
	 * @see Classes.Services.RoomServiceMenu#getItems()
	 * @see #getRoomServiceMenu()
	 * @generated
	 */
	EAttribute getRoomServiceMenu_Items();

	/**
	 * Returns the meta object for the '{@link Classes.Services.RoomServiceMenu#addItem() <em>Add Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Item</em>' operation.
	 * @see Classes.Services.RoomServiceMenu#addItem()
	 * @generated
	 */
	EOperation getRoomServiceMenu__AddItem();

	/**
	 * Returns the meta object for the '{@link Classes.Services.RoomServiceMenu#removeItem() <em>Remove Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Item</em>' operation.
	 * @see Classes.Services.RoomServiceMenu#removeItem()
	 * @generated
	 */
	EOperation getRoomServiceMenu__RemoveItem();

	/**
	 * Returns the meta object for class '{@link Classes.Services.IServicesAccess <em>IServices Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IServices Access</em>'.
	 * @see Classes.Services.IServicesAccess
	 * @generated
	 */
	EClass getIServicesAccess();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#getAllServiceIDs() <em>Get All Service IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Service IDs</em>' operation.
	 * @see Classes.Services.IServicesAccess#getAllServiceIDs()
	 * @generated
	 */
	EOperation getIServicesAccess__GetAllServiceIDs();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#getAllRoomServiceOrderIDs() <em>Get All Room Service Order IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Room Service Order IDs</em>' operation.
	 * @see Classes.Services.IServicesAccess#getAllRoomServiceOrderIDs()
	 * @generated
	 */
	EOperation getIServicesAccess__GetAllRoomServiceOrderIDs();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#searchServices() <em>Search Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Services</em>' operation.
	 * @see Classes.Services.IServicesAccess#searchServices()
	 * @generated
	 */
	EOperation getIServicesAccess__SearchServices();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#searchRoomServiceOrders() <em>Search Room Service Orders</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Room Service Orders</em>' operation.
	 * @see Classes.Services.IServicesAccess#searchRoomServiceOrders()
	 * @generated
	 */
	EOperation getIServicesAccess__SearchRoomServiceOrders();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#getServiceName() <em>Get Service Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Service Name</em>' operation.
	 * @see Classes.Services.IServicesAccess#getServiceName()
	 * @generated
	 */
	EOperation getIServicesAccess__GetServiceName();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#getServicePrice() <em>Get Service Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Service Price</em>' operation.
	 * @see Classes.Services.IServicesAccess#getServicePrice()
	 * @generated
	 */
	EOperation getIServicesAccess__GetServicePrice();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#getServiceExpense() <em>Get Service Expense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Service Expense</em>' operation.
	 * @see Classes.Services.IServicesAccess#getServiceExpense()
	 * @generated
	 */
	EOperation getIServicesAccess__GetServiceExpense();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#isRSODelivered() <em>Is RSO Delivered</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is RSO Delivered</em>' operation.
	 * @see Classes.Services.IServicesAccess#isRSODelivered()
	 * @generated
	 */
	EOperation getIServicesAccess__IsRSODelivered();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#getRSODeliveryDate() <em>Get RSO Delivery Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get RSO Delivery Date</em>' operation.
	 * @see Classes.Services.IServicesAccess#getRSODeliveryDate()
	 * @generated
	 */
	EOperation getIServicesAccess__GetRSODeliveryDate();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#getRSOBookable() <em>Get RSO Bookable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get RSO Bookable</em>' operation.
	 * @see Classes.Services.IServicesAccess#getRSOBookable()
	 * @generated
	 */
	EOperation getIServicesAccess__GetRSOBookable();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#getRSOItems() <em>Get RSO Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get RSO Items</em>' operation.
	 * @see Classes.Services.IServicesAccess#getRSOItems()
	 * @generated
	 */
	EOperation getIServicesAccess__GetRSOItems();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#getRSOServices() <em>Get RSO Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get RSO Services</em>' operation.
	 * @see Classes.Services.IServicesAccess#getRSOServices()
	 * @generated
	 */
	EOperation getIServicesAccess__GetRSOServices();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#changeRSOISDelivered() <em>Change RSOIS Delivered</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change RSOIS Delivered</em>' operation.
	 * @see Classes.Services.IServicesAccess#changeRSOISDelivered()
	 * @generated
	 */
	EOperation getIServicesAccess__ChangeRSOISDelivered();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#changeRSODeliveryDate() <em>Change RSO Delivery Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change RSO Delivery Date</em>' operation.
	 * @see Classes.Services.IServicesAccess#changeRSODeliveryDate()
	 * @generated
	 */
	EOperation getIServicesAccess__ChangeRSODeliveryDate();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#getRoomServiceMenuName() <em>Get Room Service Menu Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Service Menu Name</em>' operation.
	 * @see Classes.Services.IServicesAccess#getRoomServiceMenuName()
	 * @generated
	 */
	EOperation getIServicesAccess__GetRoomServiceMenuName();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#getRoomServiceMenuItems() <em>Get Room Service Menu Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Service Menu Items</em>' operation.
	 * @see Classes.Services.IServicesAccess#getRoomServiceMenuItems()
	 * @generated
	 */
	EOperation getIServicesAccess__GetRoomServiceMenuItems();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#getRoomServiceMenuInformation() <em>Get Room Service Menu Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Service Menu Information</em>' operation.
	 * @see Classes.Services.IServicesAccess#getRoomServiceMenuInformation()
	 * @generated
	 */
	EOperation getIServicesAccess__GetRoomServiceMenuInformation();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#setRSOBill() <em>Set RSO Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set RSO Bill</em>' operation.
	 * @see Classes.Services.IServicesAccess#setRSOBill()
	 * @generated
	 */
	EOperation getIServicesAccess__SetRSOBill();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#getRSOBill() <em>Get RSO Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get RSO Bill</em>' operation.
	 * @see Classes.Services.IServicesAccess#getRSOBill()
	 * @generated
	 */
	EOperation getIServicesAccess__GetRSOBill();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesAccess#makeRoomServiceOrder() <em>Make Room Service Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Room Service Order</em>' operation.
	 * @see Classes.Services.IServicesAccess#makeRoomServiceOrder()
	 * @generated
	 */
	EOperation getIServicesAccess__MakeRoomServiceOrder();

	/**
	 * Returns the meta object for class '{@link Classes.Services.ServiceManager <em>Service Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service Manager</em>'.
	 * @see Classes.Services.ServiceManager
	 * @generated
	 */
	EClass getServiceManager();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Services.ServiceManager#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service</em>'.
	 * @see Classes.Services.ServiceManager#getService()
	 * @see #getServiceManager()
	 * @generated
	 */
	EReference getServiceManager_Service();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Services.ServiceManager#getRoomServiceOrder <em>Room Service Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Room Service Order</em>'.
	 * @see Classes.Services.ServiceManager#getRoomServiceOrder()
	 * @see #getServiceManager()
	 * @generated
	 */
	EReference getServiceManager_RoomServiceOrder();

	/**
	 * Returns the meta object for the reference '{@link Classes.Services.ServiceManager#getRoomServiceMenu <em>Room Service Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room Service Menu</em>'.
	 * @see Classes.Services.ServiceManager#getRoomServiceMenu()
	 * @see #getServiceManager()
	 * @generated
	 */
	EReference getServiceManager_RoomServiceMenu();

	/**
	 * Returns the meta object for class '{@link Classes.Services.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see Classes.Services.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Services.Service#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Classes.Services.Service#getName()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Name();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Services.Service#getPrice <em>Price</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Price</em>'.
	 * @see Classes.Services.Service#getPrice()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Price();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Services.Service#getExpense <em>Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expense</em>'.
	 * @see Classes.Services.Service#getExpense()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Expense();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Services.Service#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Classes.Services.Service#getId()
	 * @see #getService()
	 * @generated
	 */
	EAttribute getService_Id();

	/**
	 * Returns the meta object for class '{@link Classes.Services.RoomServiceOrder <em>Room Service Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Service Order</em>'.
	 * @see Classes.Services.RoomServiceOrder
	 * @generated
	 */
	EClass getRoomServiceOrder();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Services.RoomServiceOrder#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Service</em>'.
	 * @see Classes.Services.RoomServiceOrder#getService()
	 * @see #getRoomServiceOrder()
	 * @generated
	 */
	EReference getRoomServiceOrder_Service();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Services.RoomServiceOrder#isDelivered <em>Is Delivered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Delivered</em>'.
	 * @see Classes.Services.RoomServiceOrder#isDelivered()
	 * @see #getRoomServiceOrder()
	 * @generated
	 */
	EAttribute getRoomServiceOrder_IsDelivered();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Services.RoomServiceOrder#getDeliveryDate <em>Delivery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Date</em>'.
	 * @see Classes.Services.RoomServiceOrder#getDeliveryDate()
	 * @see #getRoomServiceOrder()
	 * @generated
	 */
	EAttribute getRoomServiceOrder_DeliveryDate();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Services.RoomServiceOrder#getBookable <em>Bookable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bookable</em>'.
	 * @see Classes.Services.RoomServiceOrder#getBookable()
	 * @see #getRoomServiceOrder()
	 * @generated
	 */
	EAttribute getRoomServiceOrder_Bookable();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.Services.RoomServiceOrder#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Items</em>'.
	 * @see Classes.Services.RoomServiceOrder#getItems()
	 * @see #getRoomServiceOrder()
	 * @generated
	 */
	EAttribute getRoomServiceOrder_Items();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Services.RoomServiceOrder#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Classes.Services.RoomServiceOrder#getId()
	 * @see #getRoomServiceOrder()
	 * @generated
	 */
	EAttribute getRoomServiceOrder_Id();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Services.RoomServiceOrder#getBill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bill</em>'.
	 * @see Classes.Services.RoomServiceOrder#getBill()
	 * @see #getRoomServiceOrder()
	 * @generated
	 */
	EAttribute getRoomServiceOrder_Bill();

	/**
	 * Returns the meta object for the '{@link Classes.Services.RoomServiceOrder#addService() <em>Add Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Service</em>' operation.
	 * @see Classes.Services.RoomServiceOrder#addService()
	 * @generated
	 */
	EOperation getRoomServiceOrder__AddService();

	/**
	 * Returns the meta object for the '{@link Classes.Services.RoomServiceOrder#addItem() <em>Add Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Item</em>' operation.
	 * @see Classes.Services.RoomServiceOrder#addItem()
	 * @generated
	 */
	EOperation getRoomServiceOrder__AddItem();

	/**
	 * Returns the meta object for the '{@link Classes.Services.RoomServiceOrder#removeItem() <em>Remove Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Item</em>' operation.
	 * @see Classes.Services.RoomServiceOrder#removeItem()
	 * @generated
	 */
	EOperation getRoomServiceOrder__RemoveItem();

	/**
	 * Returns the meta object for the '{@link Classes.Services.RoomServiceOrder#removeService() <em>Remove Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Service</em>' operation.
	 * @see Classes.Services.RoomServiceOrder#removeService()
	 * @generated
	 */
	EOperation getRoomServiceOrder__RemoveService();

	/**
	 * Returns the meta object for class '{@link Classes.Services.IServicesManage <em>IServices Manage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IServices Manage</em>'.
	 * @see Classes.Services.IServicesManage
	 * @generated
	 */
	EClass getIServicesManage();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesManage#changeServiceName() <em>Change Service Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Service Name</em>' operation.
	 * @see Classes.Services.IServicesManage#changeServiceName()
	 * @generated
	 */
	EOperation getIServicesManage__ChangeServiceName();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesManage#changeServicePrice() <em>Change Service Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Service Price</em>' operation.
	 * @see Classes.Services.IServicesManage#changeServicePrice()
	 * @generated
	 */
	EOperation getIServicesManage__ChangeServicePrice();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesManage#changeServiceExpense() <em>Change Service Expense</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Service Expense</em>' operation.
	 * @see Classes.Services.IServicesManage#changeServiceExpense()
	 * @generated
	 */
	EOperation getIServicesManage__ChangeServiceExpense();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesManage#addRoomServiceMenuItem() <em>Add Room Service Menu Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Room Service Menu Item</em>' operation.
	 * @see Classes.Services.IServicesManage#addRoomServiceMenuItem()
	 * @generated
	 */
	EOperation getIServicesManage__AddRoomServiceMenuItem();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesManage#removeRoomServiceMenuItem() <em>Remove Room Service Menu Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Room Service Menu Item</em>' operation.
	 * @see Classes.Services.IServicesManage#removeRoomServiceMenuItem()
	 * @generated
	 */
	EOperation getIServicesManage__RemoveRoomServiceMenuItem();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesManage#changeRoomServiceMenuItem() <em>Change Room Service Menu Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Room Service Menu Item</em>' operation.
	 * @see Classes.Services.IServicesManage#changeRoomServiceMenuItem()
	 * @generated
	 */
	EOperation getIServicesManage__ChangeRoomServiceMenuItem();

	/**
	 * Returns the meta object for the '{@link Classes.Services.IServicesManage#changeRoomServiceMenuName() <em>Change Room Service Menu Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Room Service Menu Name</em>' operation.
	 * @see Classes.Services.IServicesManage#changeRoomServiceMenuName()
	 * @generated
	 */
	EOperation getIServicesManage__ChangeRoomServiceMenuName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServicesFactory getServicesFactory();

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
		 * The meta object literal for the '{@link Classes.Services.impl.RoomServiceMenuImpl <em>Room Service Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Services.impl.RoomServiceMenuImpl
		 * @see Classes.Services.impl.ServicesPackageImpl#getRoomServiceMenu()
		 * @generated
		 */
		EClass ROOM_SERVICE_MENU = eINSTANCE.getRoomServiceMenu();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_SERVICE_MENU__NAME = eINSTANCE.getRoomServiceMenu_Name();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_SERVICE_MENU__ITEMS = eINSTANCE.getRoomServiceMenu_Items();

		/**
		 * The meta object literal for the '<em><b>Add Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_SERVICE_MENU___ADD_ITEM = eINSTANCE.getRoomServiceMenu__AddItem();

		/**
		 * The meta object literal for the '<em><b>Remove Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_SERVICE_MENU___REMOVE_ITEM = eINSTANCE.getRoomServiceMenu__RemoveItem();

		/**
		 * The meta object literal for the '{@link Classes.Services.IServicesAccess <em>IServices Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Services.IServicesAccess
		 * @see Classes.Services.impl.ServicesPackageImpl#getIServicesAccess()
		 * @generated
		 */
		EClass ISERVICES_ACCESS = eINSTANCE.getIServicesAccess();

		/**
		 * The meta object literal for the '<em><b>Get All Service IDs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___GET_ALL_SERVICE_IDS = eINSTANCE.getIServicesAccess__GetAllServiceIDs();

		/**
		 * The meta object literal for the '<em><b>Get All Room Service Order IDs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___GET_ALL_ROOM_SERVICE_ORDER_IDS = eINSTANCE.getIServicesAccess__GetAllRoomServiceOrderIDs();

		/**
		 * The meta object literal for the '<em><b>Search Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___SEARCH_SERVICES = eINSTANCE.getIServicesAccess__SearchServices();

		/**
		 * The meta object literal for the '<em><b>Search Room Service Orders</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___SEARCH_ROOM_SERVICE_ORDERS = eINSTANCE.getIServicesAccess__SearchRoomServiceOrders();

		/**
		 * The meta object literal for the '<em><b>Get Service Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___GET_SERVICE_NAME = eINSTANCE.getIServicesAccess__GetServiceName();

		/**
		 * The meta object literal for the '<em><b>Get Service Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___GET_SERVICE_PRICE = eINSTANCE.getIServicesAccess__GetServicePrice();

		/**
		 * The meta object literal for the '<em><b>Get Service Expense</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___GET_SERVICE_EXPENSE = eINSTANCE.getIServicesAccess__GetServiceExpense();

		/**
		 * The meta object literal for the '<em><b>Is RSO Delivered</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___IS_RSO_DELIVERED = eINSTANCE.getIServicesAccess__IsRSODelivered();

		/**
		 * The meta object literal for the '<em><b>Get RSO Delivery Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___GET_RSO_DELIVERY_DATE = eINSTANCE.getIServicesAccess__GetRSODeliveryDate();

		/**
		 * The meta object literal for the '<em><b>Get RSO Bookable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___GET_RSO_BOOKABLE = eINSTANCE.getIServicesAccess__GetRSOBookable();

		/**
		 * The meta object literal for the '<em><b>Get RSO Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___GET_RSO_ITEMS = eINSTANCE.getIServicesAccess__GetRSOItems();

		/**
		 * The meta object literal for the '<em><b>Get RSO Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___GET_RSO_SERVICES = eINSTANCE.getIServicesAccess__GetRSOServices();

		/**
		 * The meta object literal for the '<em><b>Change RSOIS Delivered</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___CHANGE_RSOIS_DELIVERED = eINSTANCE.getIServicesAccess__ChangeRSOISDelivered();

		/**
		 * The meta object literal for the '<em><b>Change RSO Delivery Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___CHANGE_RSO_DELIVERY_DATE = eINSTANCE.getIServicesAccess__ChangeRSODeliveryDate();

		/**
		 * The meta object literal for the '<em><b>Get Room Service Menu Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___GET_ROOM_SERVICE_MENU_NAME = eINSTANCE.getIServicesAccess__GetRoomServiceMenuName();

		/**
		 * The meta object literal for the '<em><b>Get Room Service Menu Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___GET_ROOM_SERVICE_MENU_ITEMS = eINSTANCE.getIServicesAccess__GetRoomServiceMenuItems();

		/**
		 * The meta object literal for the '<em><b>Get Room Service Menu Information</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___GET_ROOM_SERVICE_MENU_INFORMATION = eINSTANCE.getIServicesAccess__GetRoomServiceMenuInformation();

		/**
		 * The meta object literal for the '<em><b>Set RSO Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___SET_RSO_BILL = eINSTANCE.getIServicesAccess__SetRSOBill();

		/**
		 * The meta object literal for the '<em><b>Get RSO Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___GET_RSO_BILL = eINSTANCE.getIServicesAccess__GetRSOBill();

		/**
		 * The meta object literal for the '<em><b>Make Room Service Order</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_ACCESS___MAKE_ROOM_SERVICE_ORDER = eINSTANCE.getIServicesAccess__MakeRoomServiceOrder();

		/**
		 * The meta object literal for the '{@link Classes.Services.impl.ServiceManagerImpl <em>Service Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Services.impl.ServiceManagerImpl
		 * @see Classes.Services.impl.ServicesPackageImpl#getServiceManager()
		 * @generated
		 */
		EClass SERVICE_MANAGER = eINSTANCE.getServiceManager();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MANAGER__SERVICE = eINSTANCE.getServiceManager_Service();

		/**
		 * The meta object literal for the '<em><b>Room Service Order</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MANAGER__ROOM_SERVICE_ORDER = eINSTANCE.getServiceManager_RoomServiceOrder();

		/**
		 * The meta object literal for the '<em><b>Room Service Menu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SERVICE_MANAGER__ROOM_SERVICE_MENU = eINSTANCE.getServiceManager_RoomServiceMenu();

		/**
		 * The meta object literal for the '{@link Classes.Services.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Services.impl.ServiceImpl
		 * @see Classes.Services.impl.ServicesPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

		/**
		 * The meta object literal for the '<em><b>Price</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__PRICE = eINSTANCE.getService_Price();

		/**
		 * The meta object literal for the '<em><b>Expense</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__EXPENSE = eINSTANCE.getService_Expense();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SERVICE__ID = eINSTANCE.getService_Id();

		/**
		 * The meta object literal for the '{@link Classes.Services.impl.RoomServiceOrderImpl <em>Room Service Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Services.impl.RoomServiceOrderImpl
		 * @see Classes.Services.impl.ServicesPackageImpl#getRoomServiceOrder()
		 * @generated
		 */
		EClass ROOM_SERVICE_ORDER = eINSTANCE.getRoomServiceOrder();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM_SERVICE_ORDER__SERVICE = eINSTANCE.getRoomServiceOrder_Service();

		/**
		 * The meta object literal for the '<em><b>Is Delivered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_SERVICE_ORDER__IS_DELIVERED = eINSTANCE.getRoomServiceOrder_IsDelivered();

		/**
		 * The meta object literal for the '<em><b>Delivery Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_SERVICE_ORDER__DELIVERY_DATE = eINSTANCE.getRoomServiceOrder_DeliveryDate();

		/**
		 * The meta object literal for the '<em><b>Bookable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_SERVICE_ORDER__BOOKABLE = eINSTANCE.getRoomServiceOrder_Bookable();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_SERVICE_ORDER__ITEMS = eINSTANCE.getRoomServiceOrder_Items();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_SERVICE_ORDER__ID = eINSTANCE.getRoomServiceOrder_Id();

		/**
		 * The meta object literal for the '<em><b>Bill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_SERVICE_ORDER__BILL = eINSTANCE.getRoomServiceOrder_Bill();

		/**
		 * The meta object literal for the '<em><b>Add Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_SERVICE_ORDER___ADD_SERVICE = eINSTANCE.getRoomServiceOrder__AddService();

		/**
		 * The meta object literal for the '<em><b>Add Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_SERVICE_ORDER___ADD_ITEM = eINSTANCE.getRoomServiceOrder__AddItem();

		/**
		 * The meta object literal for the '<em><b>Remove Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_SERVICE_ORDER___REMOVE_ITEM = eINSTANCE.getRoomServiceOrder__RemoveItem();

		/**
		 * The meta object literal for the '<em><b>Remove Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_SERVICE_ORDER___REMOVE_SERVICE = eINSTANCE.getRoomServiceOrder__RemoveService();

		/**
		 * The meta object literal for the '{@link Classes.Services.IServicesManage <em>IServices Manage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Services.IServicesManage
		 * @see Classes.Services.impl.ServicesPackageImpl#getIServicesManage()
		 * @generated
		 */
		EClass ISERVICES_MANAGE = eINSTANCE.getIServicesManage();

		/**
		 * The meta object literal for the '<em><b>Change Service Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_MANAGE___CHANGE_SERVICE_NAME = eINSTANCE.getIServicesManage__ChangeServiceName();

		/**
		 * The meta object literal for the '<em><b>Change Service Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_MANAGE___CHANGE_SERVICE_PRICE = eINSTANCE.getIServicesManage__ChangeServicePrice();

		/**
		 * The meta object literal for the '<em><b>Change Service Expense</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_MANAGE___CHANGE_SERVICE_EXPENSE = eINSTANCE.getIServicesManage__ChangeServiceExpense();

		/**
		 * The meta object literal for the '<em><b>Add Room Service Menu Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_MANAGE___ADD_ROOM_SERVICE_MENU_ITEM = eINSTANCE.getIServicesManage__AddRoomServiceMenuItem();

		/**
		 * The meta object literal for the '<em><b>Remove Room Service Menu Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_MANAGE___REMOVE_ROOM_SERVICE_MENU_ITEM = eINSTANCE.getIServicesManage__RemoveRoomServiceMenuItem();

		/**
		 * The meta object literal for the '<em><b>Change Room Service Menu Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_MANAGE___CHANGE_ROOM_SERVICE_MENU_ITEM = eINSTANCE.getIServicesManage__ChangeRoomServiceMenuItem();

		/**
		 * The meta object literal for the '<em><b>Change Room Service Menu Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISERVICES_MANAGE___CHANGE_ROOM_SERVICE_MENU_NAME = eINSTANCE.getIServicesManage__ChangeRoomServiceMenuName();

	}

} //ServicesPackage