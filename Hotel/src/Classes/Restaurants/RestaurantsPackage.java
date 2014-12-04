/**
 */
package Classes.Restaurants;

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
 * @see Classes.Restaurants.RestaurantsFactory
 * @model kind="package"
 * @generated
 */
public interface RestaurantsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Restaurants";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/Restaurants.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Restaurants";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestaurantsPackage eINSTANCE = Classes.Restaurants.impl.RestaurantsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.Restaurants.IRestaurantsAccess <em>IRestaurants Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess
	 * @see Classes.Restaurants.impl.RestaurantsPackageImpl#getIRestaurantsAccess()
	 * @generated
	 */
	int IRESTAURANTS_ACCESS = 1;

	/**
	 * The number of structural features of the '<em>IRestaurants Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Reservation Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_RESERVATION_ID = 0;

	/**
	 * The operation id for the '<em>Get All Reservation Ids</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_ALL_RESERVATION_IDS = 1;

	/**
	 * The operation id for the '<em>Get Empty Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_EMPTY_TABLES = 2;

	/**
	 * The operation id for the '<em>Get Empty Seats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_EMPTY_SEATS = 3;

	/**
	 * The operation id for the '<em>Get Empty Tables With Nbr Of Seats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_EMPTY_TABLES_WITH_NBR_OF_SEATS = 4;

	/**
	 * The operation id for the '<em>Get Reservation Id By Guest Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_RESERVATION_ID_BY_GUEST_NAME = 5;

	/**
	 * The operation id for the '<em>Get Menu Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_MENU_INFORMATION = 6;

	/**
	 * The operation id for the '<em>Get All Restaurant Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_ALL_RESTAURANT_NAMES = 7;

	/**
	 * The operation id for the '<em>Search Restaurants</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___SEARCH_RESTAURANTS = 8;

	/**
	 * The operation id for the '<em>Search Restaurant Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_RESERVATIONS = 9;

	/**
	 * The operation id for the '<em>Search Restaurant Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_TABLES = 10;

	/**
	 * The operation id for the '<em>Get Menu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_MENU_NAME = 11;

	/**
	 * The operation id for the '<em>Make Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___MAKE_RESERVATION = 12;

	/**
	 * The operation id for the '<em>Remove Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___REMOVE_RESERVATION = 13;

	/**
	 * The operation id for the '<em>Change Reservation Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___CHANGE_RESERVATION_TABLES = 14;

	/**
	 * The number of operations of the '<em>IRestaurants Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS_OPERATION_COUNT = 15;

	/**
	 * The meta object id for the '{@link Classes.Restaurants.IRestaurantsManage <em>IRestaurants Manage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsManage
	 * @see Classes.Restaurants.impl.RestaurantsPackageImpl#getIRestaurantsManage()
	 * @generated
	 */
	int IRESTAURANTS_MANAGE = 0;

	/**
	 * The number of structural features of the '<em>IRestaurants Manage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE_FEATURE_COUNT = IRESTAURANTS_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Reservation Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_RESERVATION_ID = IRESTAURANTS_ACCESS___GET_RESERVATION_ID;

	/**
	 * The operation id for the '<em>Get All Reservation Ids</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_ALL_RESERVATION_IDS = IRESTAURANTS_ACCESS___GET_ALL_RESERVATION_IDS;

	/**
	 * The operation id for the '<em>Get Empty Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_EMPTY_TABLES = IRESTAURANTS_ACCESS___GET_EMPTY_TABLES;

	/**
	 * The operation id for the '<em>Get Empty Seats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_EMPTY_SEATS = IRESTAURANTS_ACCESS___GET_EMPTY_SEATS;

	/**
	 * The operation id for the '<em>Get Empty Tables With Nbr Of Seats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_EMPTY_TABLES_WITH_NBR_OF_SEATS = IRESTAURANTS_ACCESS___GET_EMPTY_TABLES_WITH_NBR_OF_SEATS;

	/**
	 * The operation id for the '<em>Get Reservation Id By Guest Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_RESERVATION_ID_BY_GUEST_NAME = IRESTAURANTS_ACCESS___GET_RESERVATION_ID_BY_GUEST_NAME;

	/**
	 * The operation id for the '<em>Get Menu Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_MENU_INFORMATION = IRESTAURANTS_ACCESS___GET_MENU_INFORMATION;

	/**
	 * The operation id for the '<em>Get All Restaurant Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_ALL_RESTAURANT_NAMES = IRESTAURANTS_ACCESS___GET_ALL_RESTAURANT_NAMES;

	/**
	 * The operation id for the '<em>Search Restaurants</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___SEARCH_RESTAURANTS = IRESTAURANTS_ACCESS___SEARCH_RESTAURANTS;

	/**
	 * The operation id for the '<em>Search Restaurant Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___SEARCH_RESTAURANT_RESERVATIONS = IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_RESERVATIONS;

	/**
	 * The operation id for the '<em>Search Restaurant Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___SEARCH_RESTAURANT_TABLES = IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_TABLES;

	/**
	 * The operation id for the '<em>Get Menu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_MENU_NAME = IRESTAURANTS_ACCESS___GET_MENU_NAME;

	/**
	 * The operation id for the '<em>Make Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___MAKE_RESERVATION = IRESTAURANTS_ACCESS___MAKE_RESERVATION;

	/**
	 * The operation id for the '<em>Remove Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___REMOVE_RESERVATION = IRESTAURANTS_ACCESS___REMOVE_RESERVATION;

	/**
	 * The operation id for the '<em>Change Reservation Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___CHANGE_RESERVATION_TABLES = IRESTAURANTS_ACCESS___CHANGE_RESERVATION_TABLES;

	/**
	 * The operation id for the '<em>Add Restaurant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___ADD_RESTAURANT = IRESTAURANTS_ACCESS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Restaurant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___REMOVE_RESTAURANT = IRESTAURANTS_ACCESS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Restaurant Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___ADD_RESTAURANT_TABLE = IRESTAURANTS_ACCESS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Remove Restaurant Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___REMOVE_RESTAURANT_TABLE = IRESTAURANTS_ACCESS_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Change Restaurant Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___CHANGE_RESTAURANT_NAME = IRESTAURANTS_ACCESS_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Change Table Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___CHANGE_TABLE_INFORMATION = IRESTAURANTS_ACCESS_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Menu Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___ADD_MENU_ITEM = IRESTAURANTS_ACCESS_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Remove Menu Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___REMOVE_MENU_ITEM = IRESTAURANTS_ACCESS_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Change Menu Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___CHANGE_MENU_ITEM = IRESTAURANTS_ACCESS_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Change Menu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___CHANGE_MENU_NAME = IRESTAURANTS_ACCESS_OPERATION_COUNT + 9;

	/**
	 * The number of operations of the '<em>IRestaurants Manage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE_OPERATION_COUNT = IRESTAURANTS_ACCESS_OPERATION_COUNT + 10;

	/**
	 * The meta object id for the '{@link Classes.Restaurants.impl.RestaurantsManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.impl.RestaurantsManagerImpl
	 * @see Classes.Restaurants.impl.RestaurantsPackageImpl#getRestaurantsManager()
	 * @generated
	 */
	int RESTAURANTS_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Restaurant</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER__RESTAURANT = IRESTAURANTS_MANAGE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER_FEATURE_COUNT = IRESTAURANTS_MANAGE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Reservation Id</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_RESERVATION_ID = IRESTAURANTS_MANAGE___GET_RESERVATION_ID;

	/**
	 * The operation id for the '<em>Get All Reservation Ids</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_ALL_RESERVATION_IDS = IRESTAURANTS_MANAGE___GET_ALL_RESERVATION_IDS;

	/**
	 * The operation id for the '<em>Get Empty Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_EMPTY_TABLES = IRESTAURANTS_MANAGE___GET_EMPTY_TABLES;

	/**
	 * The operation id for the '<em>Get Empty Seats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_EMPTY_SEATS = IRESTAURANTS_MANAGE___GET_EMPTY_SEATS;

	/**
	 * The operation id for the '<em>Get Empty Tables With Nbr Of Seats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_EMPTY_TABLES_WITH_NBR_OF_SEATS = IRESTAURANTS_MANAGE___GET_EMPTY_TABLES_WITH_NBR_OF_SEATS;

	/**
	 * The operation id for the '<em>Get Reservation Id By Guest Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_RESERVATION_ID_BY_GUEST_NAME = IRESTAURANTS_MANAGE___GET_RESERVATION_ID_BY_GUEST_NAME;

	/**
	 * The operation id for the '<em>Get Menu Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_MENU_INFORMATION = IRESTAURANTS_MANAGE___GET_MENU_INFORMATION;

	/**
	 * The operation id for the '<em>Get All Restaurant Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_ALL_RESTAURANT_NAMES = IRESTAURANTS_MANAGE___GET_ALL_RESTAURANT_NAMES;

	/**
	 * The operation id for the '<em>Search Restaurants</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___SEARCH_RESTAURANTS = IRESTAURANTS_MANAGE___SEARCH_RESTAURANTS;

	/**
	 * The operation id for the '<em>Search Restaurant Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___SEARCH_RESTAURANT_RESERVATIONS = IRESTAURANTS_MANAGE___SEARCH_RESTAURANT_RESERVATIONS;

	/**
	 * The operation id for the '<em>Search Restaurant Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___SEARCH_RESTAURANT_TABLES = IRESTAURANTS_MANAGE___SEARCH_RESTAURANT_TABLES;

	/**
	 * The operation id for the '<em>Get Menu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_MENU_NAME = IRESTAURANTS_MANAGE___GET_MENU_NAME;

	/**
	 * The operation id for the '<em>Make Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___MAKE_RESERVATION = IRESTAURANTS_MANAGE___MAKE_RESERVATION;

	/**
	 * The operation id for the '<em>Remove Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___REMOVE_RESERVATION = IRESTAURANTS_MANAGE___REMOVE_RESERVATION;

	/**
	 * The operation id for the '<em>Change Reservation Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___CHANGE_RESERVATION_TABLES = IRESTAURANTS_MANAGE___CHANGE_RESERVATION_TABLES;

	/**
	 * The operation id for the '<em>Add Restaurant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___ADD_RESTAURANT = IRESTAURANTS_MANAGE___ADD_RESTAURANT;

	/**
	 * The operation id for the '<em>Remove Restaurant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___REMOVE_RESTAURANT = IRESTAURANTS_MANAGE___REMOVE_RESTAURANT;

	/**
	 * The operation id for the '<em>Add Restaurant Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___ADD_RESTAURANT_TABLE = IRESTAURANTS_MANAGE___ADD_RESTAURANT_TABLE;

	/**
	 * The operation id for the '<em>Remove Restaurant Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___REMOVE_RESTAURANT_TABLE = IRESTAURANTS_MANAGE___REMOVE_RESTAURANT_TABLE;

	/**
	 * The operation id for the '<em>Change Restaurant Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___CHANGE_RESTAURANT_NAME = IRESTAURANTS_MANAGE___CHANGE_RESTAURANT_NAME;

	/**
	 * The operation id for the '<em>Change Table Information</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___CHANGE_TABLE_INFORMATION = IRESTAURANTS_MANAGE___CHANGE_TABLE_INFORMATION;

	/**
	 * The operation id for the '<em>Add Menu Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___ADD_MENU_ITEM = IRESTAURANTS_MANAGE___ADD_MENU_ITEM;

	/**
	 * The operation id for the '<em>Remove Menu Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___REMOVE_MENU_ITEM = IRESTAURANTS_MANAGE___REMOVE_MENU_ITEM;

	/**
	 * The operation id for the '<em>Change Menu Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___CHANGE_MENU_ITEM = IRESTAURANTS_MANAGE___CHANGE_MENU_ITEM;

	/**
	 * The operation id for the '<em>Change Menu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___CHANGE_MENU_NAME = IRESTAURANTS_MANAGE___CHANGE_MENU_NAME;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER_OPERATION_COUNT = IRESTAURANTS_MANAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.Restaurants.impl.RestaurantImpl <em>Restaurant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.impl.RestaurantImpl
	 * @see Classes.Restaurants.impl.RestaurantsPackageImpl#getRestaurant()
	 * @generated
	 */
	int RESTAURANT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Reservation</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__RESERVATION = 1;

	/**
	 * The feature id for the '<em><b>Restaurant Table</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__RESTAURANT_TABLE = 2;

	/**
	 * The feature id for the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__MENU = 3;

	/**
	 * The number of structural features of the '<em>Restaurant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Add Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT___ADD_RESERVATION = 0;

	/**
	 * The number of operations of the '<em>Restaurant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link Classes.Restaurants.impl.ReservationImpl <em>Reservation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.impl.ReservationImpl
	 * @see Classes.Restaurants.impl.RestaurantsPackageImpl#getReservation()
	 * @generated
	 */
	int RESERVATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Reserved By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__RESERVED_BY = 1;

	/**
	 * The feature id for the '<em><b>Restaurant Table</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__RESTAURANT_TABLE = 2;

	/**
	 * The feature id for the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__FROM = 3;

	/**
	 * The feature id for the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION__TO = 4;

	/**
	 * The number of structural features of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Reservation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESERVATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.Restaurants.impl.RestaurantTableImpl <em>Restaurant Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.impl.RestaurantTableImpl
	 * @see Classes.Restaurants.impl.RestaurantsPackageImpl#getRestaurantTable()
	 * @generated
	 */
	int RESTAURANT_TABLE = 5;

	/**
	 * The feature id for the '<em><b>Table Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_TABLE__TABLE_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Number Of Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_TABLE__NUMBER_OF_SEATS = 1;

	/**
	 * The number of structural features of the '<em>Restaurant Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Restaurant Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.Restaurants.impl.RestaurantMenuImpl <em>Restaurant Menu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.impl.RestaurantMenuImpl
	 * @see Classes.Restaurants.impl.RestaurantsPackageImpl#getRestaurantMenu()
	 * @generated
	 */
	int RESTAURANT_MENU = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_MENU__NAME = 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_MENU__ITEMS = 1;

	/**
	 * The number of structural features of the '<em>Restaurant Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_MENU_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_MENU___ADD_ITEM = 0;

	/**
	 * The operation id for the '<em>Remove Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_MENU___REMOVE_ITEM = 1;

	/**
	 * The number of operations of the '<em>Restaurant Menu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_MENU_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link Classes.Restaurants.IRestaurantsManage <em>IRestaurants Manage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRestaurants Manage</em>'.
	 * @see Classes.Restaurants.IRestaurantsManage
	 * @generated
	 */
	EClass getIRestaurantsManage();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#addRestaurant() <em>Add Restaurant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Restaurant</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#addRestaurant()
	 * @generated
	 */
	EOperation getIRestaurantsManage__AddRestaurant();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#removeRestaurant() <em>Remove Restaurant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Restaurant</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#removeRestaurant()
	 * @generated
	 */
	EOperation getIRestaurantsManage__RemoveRestaurant();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#addRestaurantTable() <em>Add Restaurant Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Restaurant Table</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#addRestaurantTable()
	 * @generated
	 */
	EOperation getIRestaurantsManage__AddRestaurantTable();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#removeRestaurantTable() <em>Remove Restaurant Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Restaurant Table</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#removeRestaurantTable()
	 * @generated
	 */
	EOperation getIRestaurantsManage__RemoveRestaurantTable();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#changeRestaurantName() <em>Change Restaurant Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Restaurant Name</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#changeRestaurantName()
	 * @generated
	 */
	EOperation getIRestaurantsManage__ChangeRestaurantName();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#changeTableInformation() <em>Change Table Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Table Information</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#changeTableInformation()
	 * @generated
	 */
	EOperation getIRestaurantsManage__ChangeTableInformation();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#addMenuItem() <em>Add Menu Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Menu Item</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#addMenuItem()
	 * @generated
	 */
	EOperation getIRestaurantsManage__AddMenuItem();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#removeMenuItem() <em>Remove Menu Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Menu Item</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#removeMenuItem()
	 * @generated
	 */
	EOperation getIRestaurantsManage__RemoveMenuItem();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#changeMenuItem() <em>Change Menu Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Menu Item</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#changeMenuItem()
	 * @generated
	 */
	EOperation getIRestaurantsManage__ChangeMenuItem();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#changeMenuName() <em>Change Menu Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Menu Name</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#changeMenuName()
	 * @generated
	 */
	EOperation getIRestaurantsManage__ChangeMenuName();

	/**
	 * Returns the meta object for class '{@link Classes.Restaurants.IRestaurantsAccess <em>IRestaurants Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IRestaurants Access</em>'.
	 * @see Classes.Restaurants.IRestaurantsAccess
	 * @generated
	 */
	EClass getIRestaurantsAccess();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getReservationId() <em>Get Reservation Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reservation Id</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getReservationId()
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetReservationId();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getAllReservationIds() <em>Get All Reservation Ids</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Reservation Ids</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getAllReservationIds()
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetAllReservationIds();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getEmptyTables() <em>Get Empty Tables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Empty Tables</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getEmptyTables()
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetEmptyTables();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getEmptySeats() <em>Get Empty Seats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Empty Seats</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getEmptySeats()
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetEmptySeats();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getEmptyTablesWithNbrOfSeats() <em>Get Empty Tables With Nbr Of Seats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Empty Tables With Nbr Of Seats</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getEmptyTablesWithNbrOfSeats()
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetEmptyTablesWithNbrOfSeats();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getReservationIdByGuestName() <em>Get Reservation Id By Guest Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reservation Id By Guest Name</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getReservationIdByGuestName()
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetReservationIdByGuestName();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getMenuInformation() <em>Get Menu Information</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Menu Information</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getMenuInformation()
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetMenuInformation();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getAllRestaurantNames() <em>Get All Restaurant Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Restaurant Names</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getAllRestaurantNames()
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetAllRestaurantNames();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#searchRestaurants() <em>Search Restaurants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Restaurants</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#searchRestaurants()
	 * @generated
	 */
	EOperation getIRestaurantsAccess__SearchRestaurants();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#searchRestaurantReservations() <em>Search Restaurant Reservations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Restaurant Reservations</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#searchRestaurantReservations()
	 * @generated
	 */
	EOperation getIRestaurantsAccess__SearchRestaurantReservations();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#searchRestaurantTables() <em>Search Restaurant Tables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Restaurant Tables</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#searchRestaurantTables()
	 * @generated
	 */
	EOperation getIRestaurantsAccess__SearchRestaurantTables();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getMenuName() <em>Get Menu Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Menu Name</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getMenuName()
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetMenuName();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#makeReservation() <em>Make Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Reservation</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#makeReservation()
	 * @generated
	 */
	EOperation getIRestaurantsAccess__MakeReservation();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#removeReservation() <em>Remove Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Reservation</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#removeReservation()
	 * @generated
	 */
	EOperation getIRestaurantsAccess__RemoveReservation();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#changeReservationTables() <em>Change Reservation Tables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Reservation Tables</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#changeReservationTables()
	 * @generated
	 */
	EOperation getIRestaurantsAccess__ChangeReservationTables();

	/**
	 * Returns the meta object for class '{@link Classes.Restaurants.RestaurantsManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see Classes.Restaurants.RestaurantsManager
	 * @generated
	 */
	EClass getRestaurantsManager();

	/**
	 * Returns the meta object for the map '{@link Classes.Restaurants.RestaurantsManager#getRestaurant <em>Restaurant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Restaurant</em>'.
	 * @see Classes.Restaurants.RestaurantsManager#getRestaurant()
	 * @see #getRestaurantsManager()
	 * @generated
	 */
	EReference getRestaurantsManager_Restaurant();

	/**
	 * Returns the meta object for class '{@link Classes.Restaurants.Restaurant <em>Restaurant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restaurant</em>'.
	 * @see Classes.Restaurants.Restaurant
	 * @generated
	 */
	EClass getRestaurant();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Restaurants.Restaurant#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Classes.Restaurants.Restaurant#getName()
	 * @see #getRestaurant()
	 * @generated
	 */
	EAttribute getRestaurant_Name();

	/**
	 * Returns the meta object for the map '{@link Classes.Restaurants.Restaurant#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Reservation</em>'.
	 * @see Classes.Restaurants.Restaurant#getReservation()
	 * @see #getRestaurant()
	 * @generated
	 */
	EReference getRestaurant_Reservation();

	/**
	 * Returns the meta object for the map '{@link Classes.Restaurants.Restaurant#getRestaurantTable <em>Restaurant Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Restaurant Table</em>'.
	 * @see Classes.Restaurants.Restaurant#getRestaurantTable()
	 * @see #getRestaurant()
	 * @generated
	 */
	EReference getRestaurant_RestaurantTable();

	/**
	 * Returns the meta object for the reference '{@link Classes.Restaurants.Restaurant#getMenu <em>Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Menu</em>'.
	 * @see Classes.Restaurants.Restaurant#getMenu()
	 * @see #getRestaurant()
	 * @generated
	 */
	EReference getRestaurant_Menu();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.Restaurant#addReservation() <em>Add Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Reservation</em>' operation.
	 * @see Classes.Restaurants.Restaurant#addReservation()
	 * @generated
	 */
	EOperation getRestaurant__AddReservation();

	/**
	 * Returns the meta object for class '{@link Classes.Restaurants.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reservation</em>'.
	 * @see Classes.Restaurants.Reservation
	 * @generated
	 */
	EClass getReservation();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Restaurants.Reservation#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Classes.Restaurants.Reservation#getId()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_Id();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Restaurants.Reservation#getReservedBy <em>Reserved By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reserved By</em>'.
	 * @see Classes.Restaurants.Reservation#getReservedBy()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_ReservedBy();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Restaurants.Reservation#getRestaurantTable <em>Restaurant Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Restaurant Table</em>'.
	 * @see Classes.Restaurants.Reservation#getRestaurantTable()
	 * @see #getReservation()
	 * @generated
	 */
	EReference getReservation_RestaurantTable();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Restaurants.Reservation#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From</em>'.
	 * @see Classes.Restaurants.Reservation#getFrom()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_From();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Restaurants.Reservation#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To</em>'.
	 * @see Classes.Restaurants.Reservation#getTo()
	 * @see #getReservation()
	 * @generated
	 */
	EAttribute getReservation_To();

	/**
	 * Returns the meta object for class '{@link Classes.Restaurants.RestaurantTable <em>Restaurant Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restaurant Table</em>'.
	 * @see Classes.Restaurants.RestaurantTable
	 * @generated
	 */
	EClass getRestaurantTable();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Restaurants.RestaurantTable#getTableNumber <em>Table Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Table Number</em>'.
	 * @see Classes.Restaurants.RestaurantTable#getTableNumber()
	 * @see #getRestaurantTable()
	 * @generated
	 */
	EAttribute getRestaurantTable_TableNumber();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Restaurants.RestaurantTable#getNumberOfSeats <em>Number Of Seats</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Seats</em>'.
	 * @see Classes.Restaurants.RestaurantTable#getNumberOfSeats()
	 * @see #getRestaurantTable()
	 * @generated
	 */
	EAttribute getRestaurantTable_NumberOfSeats();

	/**
	 * Returns the meta object for class '{@link Classes.Restaurants.RestaurantMenu <em>Restaurant Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Restaurant Menu</em>'.
	 * @see Classes.Restaurants.RestaurantMenu
	 * @generated
	 */
	EClass getRestaurantMenu();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Restaurants.RestaurantMenu#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see Classes.Restaurants.RestaurantMenu#getName()
	 * @see #getRestaurantMenu()
	 * @generated
	 */
	EAttribute getRestaurantMenu_Name();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.Restaurants.RestaurantMenu#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Items</em>'.
	 * @see Classes.Restaurants.RestaurantMenu#getItems()
	 * @see #getRestaurantMenu()
	 * @generated
	 */
	EAttribute getRestaurantMenu_Items();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.RestaurantMenu#addItem() <em>Add Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Item</em>' operation.
	 * @see Classes.Restaurants.RestaurantMenu#addItem()
	 * @generated
	 */
	EOperation getRestaurantMenu__AddItem();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.RestaurantMenu#removeItem() <em>Remove Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Item</em>' operation.
	 * @see Classes.Restaurants.RestaurantMenu#removeItem()
	 * @generated
	 */
	EOperation getRestaurantMenu__RemoveItem();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RestaurantsFactory getRestaurantsFactory();

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
		 * The meta object literal for the '{@link Classes.Restaurants.IRestaurantsManage <em>IRestaurants Manage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Restaurants.IRestaurantsManage
		 * @see Classes.Restaurants.impl.RestaurantsPackageImpl#getIRestaurantsManage()
		 * @generated
		 */
		EClass IRESTAURANTS_MANAGE = eINSTANCE.getIRestaurantsManage();

		/**
		 * The meta object literal for the '<em><b>Add Restaurant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___ADD_RESTAURANT = eINSTANCE.getIRestaurantsManage__AddRestaurant();

		/**
		 * The meta object literal for the '<em><b>Remove Restaurant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___REMOVE_RESTAURANT = eINSTANCE.getIRestaurantsManage__RemoveRestaurant();

		/**
		 * The meta object literal for the '<em><b>Add Restaurant Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___ADD_RESTAURANT_TABLE = eINSTANCE.getIRestaurantsManage__AddRestaurantTable();

		/**
		 * The meta object literal for the '<em><b>Remove Restaurant Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___REMOVE_RESTAURANT_TABLE = eINSTANCE.getIRestaurantsManage__RemoveRestaurantTable();

		/**
		 * The meta object literal for the '<em><b>Change Restaurant Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___CHANGE_RESTAURANT_NAME = eINSTANCE.getIRestaurantsManage__ChangeRestaurantName();

		/**
		 * The meta object literal for the '<em><b>Change Table Information</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___CHANGE_TABLE_INFORMATION = eINSTANCE.getIRestaurantsManage__ChangeTableInformation();

		/**
		 * The meta object literal for the '<em><b>Add Menu Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___ADD_MENU_ITEM = eINSTANCE.getIRestaurantsManage__AddMenuItem();

		/**
		 * The meta object literal for the '<em><b>Remove Menu Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___REMOVE_MENU_ITEM = eINSTANCE.getIRestaurantsManage__RemoveMenuItem();

		/**
		 * The meta object literal for the '<em><b>Change Menu Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___CHANGE_MENU_ITEM = eINSTANCE.getIRestaurantsManage__ChangeMenuItem();

		/**
		 * The meta object literal for the '<em><b>Change Menu Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___CHANGE_MENU_NAME = eINSTANCE.getIRestaurantsManage__ChangeMenuName();

		/**
		 * The meta object literal for the '{@link Classes.Restaurants.IRestaurantsAccess <em>IRestaurants Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Restaurants.IRestaurantsAccess
		 * @see Classes.Restaurants.impl.RestaurantsPackageImpl#getIRestaurantsAccess()
		 * @generated
		 */
		EClass IRESTAURANTS_ACCESS = eINSTANCE.getIRestaurantsAccess();

		/**
		 * The meta object literal for the '<em><b>Get Reservation Id</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_RESERVATION_ID = eINSTANCE.getIRestaurantsAccess__GetReservationId();

		/**
		 * The meta object literal for the '<em><b>Get All Reservation Ids</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_ALL_RESERVATION_IDS = eINSTANCE.getIRestaurantsAccess__GetAllReservationIds();

		/**
		 * The meta object literal for the '<em><b>Get Empty Tables</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_EMPTY_TABLES = eINSTANCE.getIRestaurantsAccess__GetEmptyTables();

		/**
		 * The meta object literal for the '<em><b>Get Empty Seats</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_EMPTY_SEATS = eINSTANCE.getIRestaurantsAccess__GetEmptySeats();

		/**
		 * The meta object literal for the '<em><b>Get Empty Tables With Nbr Of Seats</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_EMPTY_TABLES_WITH_NBR_OF_SEATS = eINSTANCE.getIRestaurantsAccess__GetEmptyTablesWithNbrOfSeats();

		/**
		 * The meta object literal for the '<em><b>Get Reservation Id By Guest Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_RESERVATION_ID_BY_GUEST_NAME = eINSTANCE.getIRestaurantsAccess__GetReservationIdByGuestName();

		/**
		 * The meta object literal for the '<em><b>Get Menu Information</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_MENU_INFORMATION = eINSTANCE.getIRestaurantsAccess__GetMenuInformation();

		/**
		 * The meta object literal for the '<em><b>Get All Restaurant Names</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_ALL_RESTAURANT_NAMES = eINSTANCE.getIRestaurantsAccess__GetAllRestaurantNames();

		/**
		 * The meta object literal for the '<em><b>Search Restaurants</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___SEARCH_RESTAURANTS = eINSTANCE.getIRestaurantsAccess__SearchRestaurants();

		/**
		 * The meta object literal for the '<em><b>Search Restaurant Reservations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_RESERVATIONS = eINSTANCE.getIRestaurantsAccess__SearchRestaurantReservations();

		/**
		 * The meta object literal for the '<em><b>Search Restaurant Tables</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_TABLES = eINSTANCE.getIRestaurantsAccess__SearchRestaurantTables();

		/**
		 * The meta object literal for the '<em><b>Get Menu Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_MENU_NAME = eINSTANCE.getIRestaurantsAccess__GetMenuName();

		/**
		 * The meta object literal for the '<em><b>Make Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___MAKE_RESERVATION = eINSTANCE.getIRestaurantsAccess__MakeReservation();

		/**
		 * The meta object literal for the '<em><b>Remove Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___REMOVE_RESERVATION = eINSTANCE.getIRestaurantsAccess__RemoveReservation();

		/**
		 * The meta object literal for the '<em><b>Change Reservation Tables</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___CHANGE_RESERVATION_TABLES = eINSTANCE.getIRestaurantsAccess__ChangeReservationTables();

		/**
		 * The meta object literal for the '{@link Classes.Restaurants.impl.RestaurantsManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Restaurants.impl.RestaurantsManagerImpl
		 * @see Classes.Restaurants.impl.RestaurantsPackageImpl#getRestaurantsManager()
		 * @generated
		 */
		EClass RESTAURANTS_MANAGER = eINSTANCE.getRestaurantsManager();

		/**
		 * The meta object literal for the '<em><b>Restaurant</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTAURANTS_MANAGER__RESTAURANT = eINSTANCE.getRestaurantsManager_Restaurant();

		/**
		 * The meta object literal for the '{@link Classes.Restaurants.impl.RestaurantImpl <em>Restaurant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Restaurants.impl.RestaurantImpl
		 * @see Classes.Restaurants.impl.RestaurantsPackageImpl#getRestaurant()
		 * @generated
		 */
		EClass RESTAURANT = eINSTANCE.getRestaurant();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT__NAME = eINSTANCE.getRestaurant_Name();

		/**
		 * The meta object literal for the '<em><b>Reservation</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTAURANT__RESERVATION = eINSTANCE.getRestaurant_Reservation();

		/**
		 * The meta object literal for the '<em><b>Restaurant Table</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTAURANT__RESTAURANT_TABLE = eINSTANCE.getRestaurant_RestaurantTable();

		/**
		 * The meta object literal for the '<em><b>Menu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTAURANT__MENU = eINSTANCE.getRestaurant_Menu();

		/**
		 * The meta object literal for the '<em><b>Add Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESTAURANT___ADD_RESERVATION = eINSTANCE.getRestaurant__AddReservation();

		/**
		 * The meta object literal for the '{@link Classes.Restaurants.impl.ReservationImpl <em>Reservation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Restaurants.impl.ReservationImpl
		 * @see Classes.Restaurants.impl.RestaurantsPackageImpl#getReservation()
		 * @generated
		 */
		EClass RESERVATION = eINSTANCE.getReservation();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__ID = eINSTANCE.getReservation_Id();

		/**
		 * The meta object literal for the '<em><b>Reserved By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__RESERVED_BY = eINSTANCE.getReservation_ReservedBy();

		/**
		 * The meta object literal for the '<em><b>Restaurant Table</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESERVATION__RESTAURANT_TABLE = eINSTANCE.getReservation_RestaurantTable();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__FROM = eINSTANCE.getReservation_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESERVATION__TO = eINSTANCE.getReservation_To();

		/**
		 * The meta object literal for the '{@link Classes.Restaurants.impl.RestaurantTableImpl <em>Restaurant Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Restaurants.impl.RestaurantTableImpl
		 * @see Classes.Restaurants.impl.RestaurantsPackageImpl#getRestaurantTable()
		 * @generated
		 */
		EClass RESTAURANT_TABLE = eINSTANCE.getRestaurantTable();

		/**
		 * The meta object literal for the '<em><b>Table Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT_TABLE__TABLE_NUMBER = eINSTANCE.getRestaurantTable_TableNumber();

		/**
		 * The meta object literal for the '<em><b>Number Of Seats</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT_TABLE__NUMBER_OF_SEATS = eINSTANCE.getRestaurantTable_NumberOfSeats();

		/**
		 * The meta object literal for the '{@link Classes.Restaurants.impl.RestaurantMenuImpl <em>Restaurant Menu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Restaurants.impl.RestaurantMenuImpl
		 * @see Classes.Restaurants.impl.RestaurantsPackageImpl#getRestaurantMenu()
		 * @generated
		 */
		EClass RESTAURANT_MENU = eINSTANCE.getRestaurantMenu();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT_MENU__NAME = eINSTANCE.getRestaurantMenu_Name();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESTAURANT_MENU__ITEMS = eINSTANCE.getRestaurantMenu_Items();

		/**
		 * The meta object literal for the '<em><b>Add Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESTAURANT_MENU___ADD_ITEM = eINSTANCE.getRestaurantMenu__AddItem();

		/**
		 * The meta object literal for the '<em><b>Remove Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESTAURANT_MENU___REMOVE_ITEM = eINSTANCE.getRestaurantMenu__RemoveItem();

	}

} //RestaurantsPackage
