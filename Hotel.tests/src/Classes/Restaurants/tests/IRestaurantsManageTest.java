/**
 */
package Classes.Restaurants.tests;

import Classes.Restaurants.IRestaurantsManage;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IRestaurants Manage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link Classes.Restaurants.IRestaurantsAccess#getRestaurantReservations(java.lang.String) <em>Get Restaurant Reservations</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsAccess#getRestaurantTables(java.lang.String) <em>Get Restaurant Tables</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsAccess#getRestaurantTableNumberOfSeats(java.lang.String, java.lang.String) <em>Get Restaurant Table Number Of Seats</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsAccess#getAvailableTables(java.util.Date, java.util.Date, java.lang.String) <em>Get Available Tables</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsAccess#getReservationGuest(java.lang.String, java.lang.String) <em>Get Reservation Guest</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsAccess#getRestaurantMenuName(java.lang.String) <em>Get Restaurant Menu Name</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsAccess#getAllRestaurantNames() <em>Get All Restaurant Names</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsAccess#searchRestaurants(java.lang.String) <em>Search Restaurants</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsAccess#searchRestaurantReservations(java.lang.String, java.lang.String) <em>Search Restaurant Reservations</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsAccess#searchRestaurantTables(java.lang.String, java.lang.String) <em>Search Restaurant Tables</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsAccess#makeReservation(java.lang.String, org.eclipse.emf.common.util.EList, java.lang.String, java.util.Date, java.util.Date) <em>Make Reservation</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsAccess#cancelReservation(java.lang.String, java.lang.String) <em>Cancel Reservation</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsAccess#changeReservedTables(java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList) <em>Change Reserved Tables</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsAccess#getAvailableTablesByNbrGuests(java.lang.String, java.util.Date, java.util.Date, int) <em>Get Available Tables By Nbr Guests</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsAccess#getRestaurantMenuItems(java.lang.String) <em>Get Restaurant Menu Items</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsAccess#getReservationFromTime(java.lang.String, java.lang.String) <em>Get Reservation From Time</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsAccess#getReservationToTime(java.lang.String, java.lang.String) <em>Get Reservation To Time</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsAccess#searchRestaurantReservationsWithTime(java.lang.String, java.lang.String, java.util.Date, java.util.Date) <em>Search Restaurant Reservations With Time</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsManage#addRestaurant(java.lang.String) <em>Add Restaurant</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsManage#removeRestaurant(java.lang.String) <em>Remove Restaurant</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsManage#addRestaurantTable(java.lang.String, int, java.lang.String) <em>Add Restaurant Table</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsManage#removeRestaurantTable(java.lang.String, java.lang.String) <em>Remove Restaurant Table</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsManage#changeRestaurantName(java.lang.String, java.lang.String) <em>Change Restaurant Name</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsManage#changeTableNumberOfSeats(java.lang.String, java.lang.String, int) <em>Change Table Number Of Seats</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsManage#addMenuItem(java.lang.String, java.lang.String) <em>Add Menu Item</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsManage#removeMenuItem(java.lang.String, java.lang.String) <em>Remove Menu Item</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsManage#changeMenuName(java.lang.String, java.lang.String) <em>Change Menu Name</em>}</li>
 *   <li>{@link Classes.Restaurants.IRestaurantsManage#changeTableNumber(java.lang.String, java.lang.String, java.lang.String) <em>Change Table Number</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class IRestaurantsManageTest extends TestCase {

	/**
	 * The fixture for this IRestaurants Manage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IRestaurantsManage fixture = null;

	/**
	 * Constructs a new IRestaurants Manage test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IRestaurantsManageTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this IRestaurants Manage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IRestaurantsManage fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this IRestaurants Manage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IRestaurantsManage getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsAccess#getRestaurantReservations(java.lang.String) <em>Get Restaurant Reservations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess#getRestaurantReservations(java.lang.String)
	 * @generated
	 */
	public void testGetRestaurantReservations__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsAccess#getRestaurantTables(java.lang.String) <em>Get Restaurant Tables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess#getRestaurantTables(java.lang.String)
	 * @generated
	 */
	public void testGetRestaurantTables__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsAccess#getRestaurantTableNumberOfSeats(java.lang.String, java.lang.String) <em>Get Restaurant Table Number Of Seats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess#getRestaurantTableNumberOfSeats(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testGetRestaurantTableNumberOfSeats__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsAccess#getAvailableTables(java.util.Date, java.util.Date, java.lang.String) <em>Get Available Tables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess#getAvailableTables(java.util.Date, java.util.Date, java.lang.String)
	 * @generated
	 */
	public void testGetAvailableTables__Date_Date_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsAccess#getReservationGuest(java.lang.String, java.lang.String) <em>Get Reservation Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess#getReservationGuest(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testGetReservationGuest__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsAccess#getRestaurantMenuName(java.lang.String) <em>Get Restaurant Menu Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess#getRestaurantMenuName(java.lang.String)
	 * @generated
	 */
	public void testGetRestaurantMenuName__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsAccess#getAllRestaurantNames() <em>Get All Restaurant Names</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess#getAllRestaurantNames()
	 * @generated
	 */
	public void testGetAllRestaurantNames() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsAccess#searchRestaurants(java.lang.String) <em>Search Restaurants</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess#searchRestaurants(java.lang.String)
	 * @generated
	 */
	public void testSearchRestaurants__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsAccess#searchRestaurantReservations(java.lang.String, java.lang.String) <em>Search Restaurant Reservations</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess#searchRestaurantReservations(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testSearchRestaurantReservations__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsAccess#searchRestaurantTables(java.lang.String, java.lang.String) <em>Search Restaurant Tables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess#searchRestaurantTables(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testSearchRestaurantTables__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsAccess#makeReservation(java.lang.String, org.eclipse.emf.common.util.EList, java.lang.String, java.util.Date, java.util.Date) <em>Make Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess#makeReservation(java.lang.String, org.eclipse.emf.common.util.EList, java.lang.String, java.util.Date, java.util.Date)
	 * @generated
	 */
	public void testMakeReservation__String_EList_String_Date_Date() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsAccess#cancelReservation(java.lang.String, java.lang.String) <em>Cancel Reservation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess#cancelReservation(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testCancelReservation__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsAccess#changeReservedTables(java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList) <em>Change Reserved Tables</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess#changeReservedTables(java.lang.String, java.lang.String, org.eclipse.emf.common.util.EList)
	 * @generated
	 */
	public void testChangeReservedTables__String_String_EList() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsAccess#getAvailableTablesByNbrGuests(java.lang.String, java.util.Date, java.util.Date, int) <em>Get Available Tables By Nbr Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess#getAvailableTablesByNbrGuests(java.lang.String, java.util.Date, java.util.Date, int)
	 * @generated
	 */
	public void testGetAvailableTablesByNbrGuests__String_Date_Date_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsAccess#getRestaurantMenuItems(java.lang.String) <em>Get Restaurant Menu Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess#getRestaurantMenuItems(java.lang.String)
	 * @generated
	 */
	public void testGetRestaurantMenuItems__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsAccess#getReservationFromTime(java.lang.String, java.lang.String) <em>Get Reservation From Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess#getReservationFromTime(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testGetReservationFromTime__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsAccess#getReservationToTime(java.lang.String, java.lang.String) <em>Get Reservation To Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess#getReservationToTime(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testGetReservationToTime__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsAccess#searchRestaurantReservationsWithTime(java.lang.String, java.lang.String, java.util.Date, java.util.Date) <em>Search Restaurant Reservations With Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsAccess#searchRestaurantReservationsWithTime(java.lang.String, java.lang.String, java.util.Date, java.util.Date)
	 * @generated
	 */
	public void testSearchRestaurantReservationsWithTime__String_String_Date_Date() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsManage#addRestaurant(java.lang.String) <em>Add Restaurant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsManage#addRestaurant(java.lang.String)
	 * @generated
	 */
	public void testAddRestaurant__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsManage#removeRestaurant(java.lang.String) <em>Remove Restaurant</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsManage#removeRestaurant(java.lang.String)
	 * @generated
	 */
	public void testRemoveRestaurant__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsManage#addRestaurantTable(java.lang.String, int, java.lang.String) <em>Add Restaurant Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsManage#addRestaurantTable(java.lang.String, int, java.lang.String)
	 * @generated
	 */
	public void testAddRestaurantTable__String_int_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsManage#removeRestaurantTable(java.lang.String, java.lang.String) <em>Remove Restaurant Table</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsManage#removeRestaurantTable(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testRemoveRestaurantTable__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsManage#changeRestaurantName(java.lang.String, java.lang.String) <em>Change Restaurant Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsManage#changeRestaurantName(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testChangeRestaurantName__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsManage#changeTableNumberOfSeats(java.lang.String, java.lang.String, int) <em>Change Table Number Of Seats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsManage#changeTableNumberOfSeats(java.lang.String, java.lang.String, int)
	 * @generated
	 */
	public void testChangeTableNumberOfSeats__String_String_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsManage#addMenuItem(java.lang.String, java.lang.String) <em>Add Menu Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsManage#addMenuItem(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testAddMenuItem__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsManage#removeMenuItem(java.lang.String, java.lang.String) <em>Remove Menu Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsManage#removeMenuItem(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testRemoveMenuItem__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsManage#changeMenuName(java.lang.String, java.lang.String) <em>Change Menu Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsManage#changeMenuName(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testChangeMenuName__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Restaurants.IRestaurantsManage#changeTableNumber(java.lang.String, java.lang.String, java.lang.String) <em>Change Table Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Restaurants.IRestaurantsManage#changeTableNumber(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testChangeTableNumber__String_String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //IRestaurantsManageTest
