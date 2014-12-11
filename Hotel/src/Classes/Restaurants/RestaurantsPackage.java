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
	 * The operation id for the '<em>Get Restaurant Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_RESTAURANT_RESERVATIONS__STRING = 0;

	/**
	 * The operation id for the '<em>Get Restaurant Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_RESTAURANT_TABLES__STRING = 1;

	/**
	 * The operation id for the '<em>Get Restaurant Table Number Of Seats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_RESTAURANT_TABLE_NUMBER_OF_SEATS__STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Get Available Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_AVAILABLE_TABLES__DATE_DATE_STRING = 3;

	/**
	 * The operation id for the '<em>Get Reservation Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_RESERVATION_GUEST__STRING_STRING = 4;

	/**
	 * The operation id for the '<em>Get Restaurant Menu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_RESTAURANT_MENU_NAME__STRING = 5;

	/**
	 * The operation id for the '<em>Get All Restaurant Names</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_ALL_RESTAURANT_NAMES = 6;

	/**
	 * The operation id for the '<em>Search Restaurants</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___SEARCH_RESTAURANTS__STRING = 7;

	/**
	 * The operation id for the '<em>Search Restaurant Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_RESERVATIONS__STRING_STRING = 8;

	/**
	 * The operation id for the '<em>Search Restaurant Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_TABLES__STRING_STRING = 9;

	/**
	 * The operation id for the '<em>Make Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___MAKE_RESERVATION__STRING_ELIST_STRING_DATE_DATE = 10;

	/**
	 * The operation id for the '<em>Cancel Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___CANCEL_RESERVATION__STRING_STRING = 11;

	/**
	 * The operation id for the '<em>Change Reserved Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___CHANGE_RESERVED_TABLES__STRING_STRING_ELIST = 12;

	/**
	 * The operation id for the '<em>Get Available Tables By Nbr Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_AVAILABLE_TABLES_BY_NBR_GUESTS__STRING_DATE_DATE_INT = 13;

	/**
	 * The operation id for the '<em>Get Restaurant Menu Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_RESTAURANT_MENU_ITEMS__STRING = 14;

	/**
	 * The operation id for the '<em>Get Reservation From Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_RESERVATION_FROM_TIME__STRING_STRING = 15;

	/**
	 * The operation id for the '<em>Get Reservation To Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___GET_RESERVATION_TO_TIME__STRING_STRING = 16;

	/**
	 * The operation id for the '<em>Search Restaurant Reservations With Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_RESERVATIONS_WITH_TIME__STRING_STRING_DATE_DATE = 17;

	/**
	 * The number of operations of the '<em>IRestaurants Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_ACCESS_OPERATION_COUNT = 18;

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
	 * The operation id for the '<em>Get Restaurant Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_RESTAURANT_RESERVATIONS__STRING = IRESTAURANTS_ACCESS___GET_RESTAURANT_RESERVATIONS__STRING;

	/**
	 * The operation id for the '<em>Get Restaurant Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_RESTAURANT_TABLES__STRING = IRESTAURANTS_ACCESS___GET_RESTAURANT_TABLES__STRING;

	/**
	 * The operation id for the '<em>Get Restaurant Table Number Of Seats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_RESTAURANT_TABLE_NUMBER_OF_SEATS__STRING_STRING = IRESTAURANTS_ACCESS___GET_RESTAURANT_TABLE_NUMBER_OF_SEATS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Available Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_AVAILABLE_TABLES__DATE_DATE_STRING = IRESTAURANTS_ACCESS___GET_AVAILABLE_TABLES__DATE_DATE_STRING;

	/**
	 * The operation id for the '<em>Get Reservation Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_RESERVATION_GUEST__STRING_STRING = IRESTAURANTS_ACCESS___GET_RESERVATION_GUEST__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Restaurant Menu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_RESTAURANT_MENU_NAME__STRING = IRESTAURANTS_ACCESS___GET_RESTAURANT_MENU_NAME__STRING;

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
	int IRESTAURANTS_MANAGE___SEARCH_RESTAURANTS__STRING = IRESTAURANTS_ACCESS___SEARCH_RESTAURANTS__STRING;

	/**
	 * The operation id for the '<em>Search Restaurant Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___SEARCH_RESTAURANT_RESERVATIONS__STRING_STRING = IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_RESERVATIONS__STRING_STRING;

	/**
	 * The operation id for the '<em>Search Restaurant Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___SEARCH_RESTAURANT_TABLES__STRING_STRING = IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_TABLES__STRING_STRING;

	/**
	 * The operation id for the '<em>Make Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___MAKE_RESERVATION__STRING_ELIST_STRING_DATE_DATE = IRESTAURANTS_ACCESS___MAKE_RESERVATION__STRING_ELIST_STRING_DATE_DATE;

	/**
	 * The operation id for the '<em>Cancel Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___CANCEL_RESERVATION__STRING_STRING = IRESTAURANTS_ACCESS___CANCEL_RESERVATION__STRING_STRING;

	/**
	 * The operation id for the '<em>Change Reserved Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___CHANGE_RESERVED_TABLES__STRING_STRING_ELIST = IRESTAURANTS_ACCESS___CHANGE_RESERVED_TABLES__STRING_STRING_ELIST;

	/**
	 * The operation id for the '<em>Get Available Tables By Nbr Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_AVAILABLE_TABLES_BY_NBR_GUESTS__STRING_DATE_DATE_INT = IRESTAURANTS_ACCESS___GET_AVAILABLE_TABLES_BY_NBR_GUESTS__STRING_DATE_DATE_INT;

	/**
	 * The operation id for the '<em>Get Restaurant Menu Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_RESTAURANT_MENU_ITEMS__STRING = IRESTAURANTS_ACCESS___GET_RESTAURANT_MENU_ITEMS__STRING;

	/**
	 * The operation id for the '<em>Get Reservation From Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_RESERVATION_FROM_TIME__STRING_STRING = IRESTAURANTS_ACCESS___GET_RESERVATION_FROM_TIME__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Reservation To Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___GET_RESERVATION_TO_TIME__STRING_STRING = IRESTAURANTS_ACCESS___GET_RESERVATION_TO_TIME__STRING_STRING;

	/**
	 * The operation id for the '<em>Search Restaurant Reservations With Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___SEARCH_RESTAURANT_RESERVATIONS_WITH_TIME__STRING_STRING_DATE_DATE = IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_RESERVATIONS_WITH_TIME__STRING_STRING_DATE_DATE;

	/**
	 * The operation id for the '<em>Add Restaurant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___ADD_RESTAURANT__STRING = IRESTAURANTS_ACCESS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Remove Restaurant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___REMOVE_RESTAURANT__STRING = IRESTAURANTS_ACCESS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Restaurant Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___ADD_RESTAURANT_TABLE__STRING_INT_STRING = IRESTAURANTS_ACCESS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Remove Restaurant Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___REMOVE_RESTAURANT_TABLE__STRING_STRING = IRESTAURANTS_ACCESS_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Change Restaurant Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___CHANGE_RESTAURANT_NAME__STRING_STRING = IRESTAURANTS_ACCESS_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Change Table Number Of Seats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___CHANGE_TABLE_NUMBER_OF_SEATS__STRING_STRING_INT = IRESTAURANTS_ACCESS_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Add Menu Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___ADD_MENU_ITEM__STRING_STRING = IRESTAURANTS_ACCESS_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Remove Menu Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___REMOVE_MENU_ITEM__STRING_STRING = IRESTAURANTS_ACCESS_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Change Menu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___CHANGE_MENU_NAME__STRING_STRING = IRESTAURANTS_ACCESS_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Change Table Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IRESTAURANTS_MANAGE___CHANGE_TABLE_NUMBER__STRING_STRING_STRING = IRESTAURANTS_ACCESS_OPERATION_COUNT + 9;

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
	 * The feature id for the '<em><b>Restaurant</b></em>' reference list.
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
	 * The operation id for the '<em>Get Restaurant Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_RESTAURANT_RESERVATIONS__STRING = IRESTAURANTS_MANAGE___GET_RESTAURANT_RESERVATIONS__STRING;

	/**
	 * The operation id for the '<em>Get Restaurant Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_RESTAURANT_TABLES__STRING = IRESTAURANTS_MANAGE___GET_RESTAURANT_TABLES__STRING;

	/**
	 * The operation id for the '<em>Get Restaurant Table Number Of Seats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_RESTAURANT_TABLE_NUMBER_OF_SEATS__STRING_STRING = IRESTAURANTS_MANAGE___GET_RESTAURANT_TABLE_NUMBER_OF_SEATS__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Available Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_AVAILABLE_TABLES__DATE_DATE_STRING = IRESTAURANTS_MANAGE___GET_AVAILABLE_TABLES__DATE_DATE_STRING;

	/**
	 * The operation id for the '<em>Get Reservation Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_RESERVATION_GUEST__STRING_STRING = IRESTAURANTS_MANAGE___GET_RESERVATION_GUEST__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Restaurant Menu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_RESTAURANT_MENU_NAME__STRING = IRESTAURANTS_MANAGE___GET_RESTAURANT_MENU_NAME__STRING;

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
	int RESTAURANTS_MANAGER___SEARCH_RESTAURANTS__STRING = IRESTAURANTS_MANAGE___SEARCH_RESTAURANTS__STRING;

	/**
	 * The operation id for the '<em>Search Restaurant Reservations</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___SEARCH_RESTAURANT_RESERVATIONS__STRING_STRING = IRESTAURANTS_MANAGE___SEARCH_RESTAURANT_RESERVATIONS__STRING_STRING;

	/**
	 * The operation id for the '<em>Search Restaurant Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___SEARCH_RESTAURANT_TABLES__STRING_STRING = IRESTAURANTS_MANAGE___SEARCH_RESTAURANT_TABLES__STRING_STRING;

	/**
	 * The operation id for the '<em>Make Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___MAKE_RESERVATION__STRING_ELIST_STRING_DATE_DATE = IRESTAURANTS_MANAGE___MAKE_RESERVATION__STRING_ELIST_STRING_DATE_DATE;

	/**
	 * The operation id for the '<em>Cancel Reservation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___CANCEL_RESERVATION__STRING_STRING = IRESTAURANTS_MANAGE___CANCEL_RESERVATION__STRING_STRING;

	/**
	 * The operation id for the '<em>Change Reserved Tables</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___CHANGE_RESERVED_TABLES__STRING_STRING_ELIST = IRESTAURANTS_MANAGE___CHANGE_RESERVED_TABLES__STRING_STRING_ELIST;

	/**
	 * The operation id for the '<em>Get Available Tables By Nbr Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_AVAILABLE_TABLES_BY_NBR_GUESTS__STRING_DATE_DATE_INT = IRESTAURANTS_MANAGE___GET_AVAILABLE_TABLES_BY_NBR_GUESTS__STRING_DATE_DATE_INT;

	/**
	 * The operation id for the '<em>Get Restaurant Menu Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_RESTAURANT_MENU_ITEMS__STRING = IRESTAURANTS_MANAGE___GET_RESTAURANT_MENU_ITEMS__STRING;

	/**
	 * The operation id for the '<em>Get Reservation From Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_RESERVATION_FROM_TIME__STRING_STRING = IRESTAURANTS_MANAGE___GET_RESERVATION_FROM_TIME__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Reservation To Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___GET_RESERVATION_TO_TIME__STRING_STRING = IRESTAURANTS_MANAGE___GET_RESERVATION_TO_TIME__STRING_STRING;

	/**
	 * The operation id for the '<em>Search Restaurant Reservations With Time</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___SEARCH_RESTAURANT_RESERVATIONS_WITH_TIME__STRING_STRING_DATE_DATE = IRESTAURANTS_MANAGE___SEARCH_RESTAURANT_RESERVATIONS_WITH_TIME__STRING_STRING_DATE_DATE;

	/**
	 * The operation id for the '<em>Add Restaurant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___ADD_RESTAURANT__STRING = IRESTAURANTS_MANAGE___ADD_RESTAURANT__STRING;

	/**
	 * The operation id for the '<em>Remove Restaurant</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___REMOVE_RESTAURANT__STRING = IRESTAURANTS_MANAGE___REMOVE_RESTAURANT__STRING;

	/**
	 * The operation id for the '<em>Add Restaurant Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___ADD_RESTAURANT_TABLE__STRING_INT_STRING = IRESTAURANTS_MANAGE___ADD_RESTAURANT_TABLE__STRING_INT_STRING;

	/**
	 * The operation id for the '<em>Remove Restaurant Table</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___REMOVE_RESTAURANT_TABLE__STRING_STRING = IRESTAURANTS_MANAGE___REMOVE_RESTAURANT_TABLE__STRING_STRING;

	/**
	 * The operation id for the '<em>Change Restaurant Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___CHANGE_RESTAURANT_NAME__STRING_STRING = IRESTAURANTS_MANAGE___CHANGE_RESTAURANT_NAME__STRING_STRING;

	/**
	 * The operation id for the '<em>Change Table Number Of Seats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___CHANGE_TABLE_NUMBER_OF_SEATS__STRING_STRING_INT = IRESTAURANTS_MANAGE___CHANGE_TABLE_NUMBER_OF_SEATS__STRING_STRING_INT;

	/**
	 * The operation id for the '<em>Add Menu Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___ADD_MENU_ITEM__STRING_STRING = IRESTAURANTS_MANAGE___ADD_MENU_ITEM__STRING_STRING;

	/**
	 * The operation id for the '<em>Remove Menu Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___REMOVE_MENU_ITEM__STRING_STRING = IRESTAURANTS_MANAGE___REMOVE_MENU_ITEM__STRING_STRING;

	/**
	 * The operation id for the '<em>Change Menu Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___CHANGE_MENU_NAME__STRING_STRING = IRESTAURANTS_MANAGE___CHANGE_MENU_NAME__STRING_STRING;

	/**
	 * The operation id for the '<em>Change Table Number</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANTS_MANAGER___CHANGE_TABLE_NUMBER__STRING_STRING_STRING = IRESTAURANTS_MANAGE___CHANGE_TABLE_NUMBER__STRING_STRING_STRING;

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
	 * The feature id for the '<em><b>Reservation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT__RESERVATION = 1;

	/**
	 * The feature id for the '<em><b>Restaurant Table</b></em>' reference list.
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
	int RESTAURANT_MENU___ADD_ITEM__STRING = 0;

	/**
	 * The operation id for the '<em>Remove Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESTAURANT_MENU___REMOVE_ITEM__STRING = 1;

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
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#addRestaurant(java.lang.String) <em>Add Restaurant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Restaurant</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#addRestaurant(java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsManage__AddRestaurant__String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#removeRestaurant(java.lang.String) <em>Remove Restaurant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Restaurant</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#removeRestaurant(java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsManage__RemoveRestaurant__String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#addRestaurantTable(java.lang.String, int, java.lang.String) <em>Add Restaurant Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Restaurant Table</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#addRestaurantTable(java.lang.String, int, java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsManage__AddRestaurantTable__String_int_String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#removeRestaurantTable(java.lang.String, java.lang.String) <em>Remove Restaurant Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Restaurant Table</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#removeRestaurantTable(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsManage__RemoveRestaurantTable__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#changeRestaurantName(java.lang.String, java.lang.String) <em>Change Restaurant Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Restaurant Name</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#changeRestaurantName(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsManage__ChangeRestaurantName__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#changeTableNumberOfSeats(java.lang.String, java.lang.String, int) <em>Change Table Number Of Seats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Table Number Of Seats</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#changeTableNumberOfSeats(java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getIRestaurantsManage__ChangeTableNumberOfSeats__String_String_int();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#addMenuItem(java.lang.String, java.lang.String) <em>Add Menu Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Menu Item</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#addMenuItem(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsManage__AddMenuItem__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#removeMenuItem(java.lang.String, java.lang.String) <em>Remove Menu Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Menu Item</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#removeMenuItem(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsManage__RemoveMenuItem__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#changeMenuName(java.lang.String, java.lang.String) <em>Change Menu Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Menu Name</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#changeMenuName(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsManage__ChangeMenuName__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsManage#changeTableNumber(java.lang.String, java.lang.String, java.lang.String) <em>Change Table Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Table Number</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsManage#changeTableNumber(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsManage__ChangeTableNumber__String_String_String();

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
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getRestaurantReservations(java.lang.String) <em>Get Restaurant Reservations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Restaurant Reservations</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getRestaurantReservations(java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetRestaurantReservations__String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getRestaurantTables(java.lang.String) <em>Get Restaurant Tables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Restaurant Tables</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getRestaurantTables(java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetRestaurantTables__String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getRestaurantTableNumberOfSeats(java.lang.String, java.lang.String) <em>Get Restaurant Table Number Of Seats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Restaurant Table Number Of Seats</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getRestaurantTableNumberOfSeats(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetRestaurantTableNumberOfSeats__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getAvailableTables(java.util.Date, java.util.Date, java.lang.String) <em>Get Available Tables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Tables</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getAvailableTables(java.util.Date, java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetAvailableTables__Date_Date_String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getReservationGuest(java.lang.String, java.lang.String) <em>Get Reservation Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reservation Guest</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getReservationGuest(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetReservationGuest__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getRestaurantMenuName(java.lang.String) <em>Get Restaurant Menu Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Restaurant Menu Name</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getRestaurantMenuName(java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetRestaurantMenuName__String();

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
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#searchRestaurants(java.lang.String) <em>Search Restaurants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Restaurants</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#searchRestaurants(java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsAccess__SearchRestaurants__String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#searchRestaurantReservations(java.lang.String, java.lang.String) <em>Search Restaurant Reservations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Restaurant Reservations</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#searchRestaurantReservations(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsAccess__SearchRestaurantReservations__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#searchRestaurantTables(java.lang.String, java.lang.String) <em>Search Restaurant Tables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Restaurant Tables</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#searchRestaurantTables(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsAccess__SearchRestaurantTables__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#makeReservation(java.lang.String, org.eclipse.emf.common.util.EList, java.lang.String, java.util.Date, java.util.Date) <em>Make Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Reservation</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#makeReservation(java.lang.String, org.eclipse.emf.common.util.EList, java.lang.String, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIRestaurantsAccess__MakeReservation__String_EList_String_Date_Date();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#cancelReservation(java.lang.String, java.lang.String) <em>Cancel Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Reservation</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#cancelReservation(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsAccess__CancelReservation__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#changeReservedTables(java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList) <em>Change Reserved Tables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Reserved Tables</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#changeReservedTables(java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	EOperation getIRestaurantsAccess__ChangeReservedTables__String_String_EList();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getAvailableTablesByNbrGuests(java.lang.String, java.util.Date, java.util.Date, int) <em>Get Available Tables By Nbr Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Tables By Nbr Guests</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getAvailableTablesByNbrGuests(java.lang.String, java.util.Date, java.util.Date, int)
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetAvailableTablesByNbrGuests__String_Date_Date_int();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getRestaurantMenuItems(java.lang.String) <em>Get Restaurant Menu Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Restaurant Menu Items</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getRestaurantMenuItems(java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetRestaurantMenuItems__String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getReservationFromTime(java.lang.String, java.lang.String) <em>Get Reservation From Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reservation From Time</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getReservationFromTime(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetReservationFromTime__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#getReservationToTime(java.lang.String, java.lang.String) <em>Get Reservation To Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Reservation To Time</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#getReservationToTime(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIRestaurantsAccess__GetReservationToTime__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.IRestaurantsAccess#searchRestaurantReservationsWithTime(java.lang.String, java.lang.String, java.util.Date, java.util.Date) <em>Search Restaurant Reservations With Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Restaurant Reservations With Time</em>' operation.
	 * @see Classes.Restaurants.IRestaurantsAccess#searchRestaurantReservationsWithTime(java.lang.String, java.lang.String, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIRestaurantsAccess__SearchRestaurantReservationsWithTime__String_String_Date_Date();

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
	 * Returns the meta object for the reference list '{@link Classes.Restaurants.RestaurantsManager#getRestaurant <em>Restaurant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Restaurant</em>'.
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
	 * Returns the meta object for the reference list '{@link Classes.Restaurants.Restaurant#getReservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reservation</em>'.
	 * @see Classes.Restaurants.Restaurant#getReservation()
	 * @see #getRestaurant()
	 * @generated
	 */
	EReference getRestaurant_Reservation();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Restaurants.Restaurant#getRestaurantTable <em>Restaurant Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Restaurant Table</em>'.
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
	 * Returns the meta object for the '{@link Classes.Restaurants.RestaurantMenu#addItem(java.lang.String) <em>Add Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Item</em>' operation.
	 * @see Classes.Restaurants.RestaurantMenu#addItem(java.lang.String)
	 * @generated
	 */
	EOperation getRestaurantMenu__AddItem__String();

	/**
	 * Returns the meta object for the '{@link Classes.Restaurants.RestaurantMenu#removeItem(java.lang.String) <em>Remove Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Item</em>' operation.
	 * @see Classes.Restaurants.RestaurantMenu#removeItem(java.lang.String)
	 * @generated
	 */
	EOperation getRestaurantMenu__RemoveItem__String();

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
		EOperation IRESTAURANTS_MANAGE___ADD_RESTAURANT__STRING = eINSTANCE.getIRestaurantsManage__AddRestaurant__String();

		/**
		 * The meta object literal for the '<em><b>Remove Restaurant</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___REMOVE_RESTAURANT__STRING = eINSTANCE.getIRestaurantsManage__RemoveRestaurant__String();

		/**
		 * The meta object literal for the '<em><b>Add Restaurant Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___ADD_RESTAURANT_TABLE__STRING_INT_STRING = eINSTANCE.getIRestaurantsManage__AddRestaurantTable__String_int_String();

		/**
		 * The meta object literal for the '<em><b>Remove Restaurant Table</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___REMOVE_RESTAURANT_TABLE__STRING_STRING = eINSTANCE.getIRestaurantsManage__RemoveRestaurantTable__String_String();

		/**
		 * The meta object literal for the '<em><b>Change Restaurant Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___CHANGE_RESTAURANT_NAME__STRING_STRING = eINSTANCE.getIRestaurantsManage__ChangeRestaurantName__String_String();

		/**
		 * The meta object literal for the '<em><b>Change Table Number Of Seats</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___CHANGE_TABLE_NUMBER_OF_SEATS__STRING_STRING_INT = eINSTANCE.getIRestaurantsManage__ChangeTableNumberOfSeats__String_String_int();

		/**
		 * The meta object literal for the '<em><b>Add Menu Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___ADD_MENU_ITEM__STRING_STRING = eINSTANCE.getIRestaurantsManage__AddMenuItem__String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Menu Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___REMOVE_MENU_ITEM__STRING_STRING = eINSTANCE.getIRestaurantsManage__RemoveMenuItem__String_String();

		/**
		 * The meta object literal for the '<em><b>Change Menu Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___CHANGE_MENU_NAME__STRING_STRING = eINSTANCE.getIRestaurantsManage__ChangeMenuName__String_String();

		/**
		 * The meta object literal for the '<em><b>Change Table Number</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_MANAGE___CHANGE_TABLE_NUMBER__STRING_STRING_STRING = eINSTANCE.getIRestaurantsManage__ChangeTableNumber__String_String_String();

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
		 * The meta object literal for the '<em><b>Get Restaurant Reservations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_RESTAURANT_RESERVATIONS__STRING = eINSTANCE.getIRestaurantsAccess__GetRestaurantReservations__String();

		/**
		 * The meta object literal for the '<em><b>Get Restaurant Tables</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_RESTAURANT_TABLES__STRING = eINSTANCE.getIRestaurantsAccess__GetRestaurantTables__String();

		/**
		 * The meta object literal for the '<em><b>Get Restaurant Table Number Of Seats</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_RESTAURANT_TABLE_NUMBER_OF_SEATS__STRING_STRING = eINSTANCE.getIRestaurantsAccess__GetRestaurantTableNumberOfSeats__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Available Tables</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_AVAILABLE_TABLES__DATE_DATE_STRING = eINSTANCE.getIRestaurantsAccess__GetAvailableTables__Date_Date_String();

		/**
		 * The meta object literal for the '<em><b>Get Reservation Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_RESERVATION_GUEST__STRING_STRING = eINSTANCE.getIRestaurantsAccess__GetReservationGuest__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Restaurant Menu Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_RESTAURANT_MENU_NAME__STRING = eINSTANCE.getIRestaurantsAccess__GetRestaurantMenuName__String();

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
		EOperation IRESTAURANTS_ACCESS___SEARCH_RESTAURANTS__STRING = eINSTANCE.getIRestaurantsAccess__SearchRestaurants__String();

		/**
		 * The meta object literal for the '<em><b>Search Restaurant Reservations</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_RESERVATIONS__STRING_STRING = eINSTANCE.getIRestaurantsAccess__SearchRestaurantReservations__String_String();

		/**
		 * The meta object literal for the '<em><b>Search Restaurant Tables</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_TABLES__STRING_STRING = eINSTANCE.getIRestaurantsAccess__SearchRestaurantTables__String_String();

		/**
		 * The meta object literal for the '<em><b>Make Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___MAKE_RESERVATION__STRING_ELIST_STRING_DATE_DATE = eINSTANCE.getIRestaurantsAccess__MakeReservation__String_EList_String_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Cancel Reservation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___CANCEL_RESERVATION__STRING_STRING = eINSTANCE.getIRestaurantsAccess__CancelReservation__String_String();

		/**
		 * The meta object literal for the '<em><b>Change Reserved Tables</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___CHANGE_RESERVED_TABLES__STRING_STRING_ELIST = eINSTANCE.getIRestaurantsAccess__ChangeReservedTables__String_String_EList();

		/**
		 * The meta object literal for the '<em><b>Get Available Tables By Nbr Guests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_AVAILABLE_TABLES_BY_NBR_GUESTS__STRING_DATE_DATE_INT = eINSTANCE.getIRestaurantsAccess__GetAvailableTablesByNbrGuests__String_Date_Date_int();

		/**
		 * The meta object literal for the '<em><b>Get Restaurant Menu Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_RESTAURANT_MENU_ITEMS__STRING = eINSTANCE.getIRestaurantsAccess__GetRestaurantMenuItems__String();

		/**
		 * The meta object literal for the '<em><b>Get Reservation From Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_RESERVATION_FROM_TIME__STRING_STRING = eINSTANCE.getIRestaurantsAccess__GetReservationFromTime__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Reservation To Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___GET_RESERVATION_TO_TIME__STRING_STRING = eINSTANCE.getIRestaurantsAccess__GetReservationToTime__String_String();

		/**
		 * The meta object literal for the '<em><b>Search Restaurant Reservations With Time</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_RESERVATIONS_WITH_TIME__STRING_STRING_DATE_DATE = eINSTANCE.getIRestaurantsAccess__SearchRestaurantReservationsWithTime__String_String_Date_Date();

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
		 * The meta object literal for the '<em><b>Restaurant</b></em>' reference list feature.
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
		 * The meta object literal for the '<em><b>Reservation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESTAURANT__RESERVATION = eINSTANCE.getRestaurant_Reservation();

		/**
		 * The meta object literal for the '<em><b>Restaurant Table</b></em>' reference list feature.
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
		EOperation RESTAURANT_MENU___ADD_ITEM__STRING = eINSTANCE.getRestaurantMenu__AddItem__String();

		/**
		 * The meta object literal for the '<em><b>Remove Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RESTAURANT_MENU___REMOVE_ITEM__STRING = eINSTANCE.getRestaurantMenu__RemoveItem__String();

	}

} //RestaurantsPackage
