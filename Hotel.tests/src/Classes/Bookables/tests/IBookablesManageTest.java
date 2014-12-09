/**
 */
package Classes.Bookables.tests;

import Classes.Bookables.IBookablesManage;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IBookables Manage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link Classes.Bookables.IBookablesAccess#getBookableBasePrice(java.lang.String) <em>Get Bookable Base Price</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesAccess#getRoomLocationInfo(java.lang.String) <em>Get Room Location Info</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesAccess#getBookableDescription(java.lang.String) <em>Get Bookable Description</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesAccess#getAllBookableIDs() <em>Get All Bookable IDs</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesAccess#getRoomOfHostelBed(java.lang.String) <em>Get Room Of Hostel Bed</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesAccess#getHotelRoomCategory(java.lang.String) <em>Get Hotel Room Category</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesAccess#getConferenceRoomCapacity(java.lang.String) <em>Get Conference Room Capacity</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesAccess#getHotelRoomNbrBeds(java.lang.String) <em>Get Hotel Room Nbr Beds</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesAccess#searchForBookable(java.lang.String) <em>Search For Bookable</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesAccess#getRoomLocationFloor(java.lang.String) <em>Get Room Location Floor</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesAccess#getAllHotelRoomIDs() <em>Get All Hotel Room IDs</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesAccess#getAllConferenceRoomIDs() <em>Get All Conference Room IDs</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesAccess#getAllHostelBedIDs() <em>Get All Hostel Bed IDs</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesAccess#getConferenceRoomCategory(java.lang.String) <em>Get Conference Room Category</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesAccess#searchHotelRooms(java.lang.String, Classes.Bookables.HotelRoomCategory) <em>Search Hotel Rooms</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesAccess#searchHostelBeds(java.lang.String) <em>Search Hostel Beds</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesAccess#searchConferenceRooms(java.lang.String, Classes.Bookables.ConferenceRoomCategory) <em>Search Conference Rooms</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesManage#changeHostelBedRoom(java.lang.String, java.lang.String) <em>Change Hostel Bed Room</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesManage#deleteBookable(java.lang.String) <em>Delete Bookable</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesManage#changeRoomLocation(java.lang.String, int, java.lang.String) <em>Change Room Location</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesManage#changeHotelRoomCategory(java.lang.String, Classes.Bookables.HotelRoomCategory) <em>Change Hotel Room Category</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesManage#changeConferenceRoomCategory(java.lang.String, Classes.Bookables.ConferenceRoomCategory) <em>Change Conference Room Category</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesManage#changeBookableBasePrice(java.lang.String, double) <em>Change Bookable Base Price</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesManage#changeBookableDescription(java.lang.String, java.lang.String) <em>Change Bookable Description</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesManage#addHotelRoom(java.lang.String, double, java.lang.String, int, java.lang.String, Classes.Bookables.HotelRoomCategory, int) <em>Add Hotel Room</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesManage#addHostelBed(java.lang.String, double, java.lang.String, java.lang.String) <em>Add Hostel Bed</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesManage#addConferenceRoom(java.lang.String, double, java.lang.String, int, java.lang.String, Classes.Bookables.ConferenceRoomCategory, int) <em>Add Conference Room</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesManage#changeHotelRoomNumberBeds(java.lang.String, int) <em>Change Hotel Room Number Beds</em>}</li>
 *   <li>{@link Classes.Bookables.IBookablesManage#changeConferenceRoomCapacity(java.lang.String, int) <em>Change Conference Room Capacity</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class IBookablesManageTest extends TestCase {

	/**
	 * The fixture for this IBookables Manage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IBookablesManage fixture = null;

	/**
	 * Constructs a new IBookables Manage test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBookablesManageTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this IBookables Manage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IBookablesManage fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this IBookables Manage test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IBookablesManage getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesAccess#getBookableBasePrice(java.lang.String) <em>Get Bookable Base Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesAccess#getBookableBasePrice(java.lang.String)
	 * @generated
	 */
	public void testGetBookableBasePrice__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesAccess#getRoomLocationInfo(java.lang.String) <em>Get Room Location Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesAccess#getRoomLocationInfo(java.lang.String)
	 * @generated
	 */
	public void testGetRoomLocationInfo__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesAccess#getBookableDescription(java.lang.String) <em>Get Bookable Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesAccess#getBookableDescription(java.lang.String)
	 * @generated
	 */
	public void testGetBookableDescription__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesAccess#getAllBookableIDs() <em>Get All Bookable IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesAccess#getAllBookableIDs()
	 * @generated
	 */
	public void testGetAllBookableIDs() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesAccess#getRoomOfHostelBed(java.lang.String) <em>Get Room Of Hostel Bed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesAccess#getRoomOfHostelBed(java.lang.String)
	 * @generated
	 */
	public void testGetRoomOfHostelBed__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesAccess#getHotelRoomCategory(java.lang.String) <em>Get Hotel Room Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesAccess#getHotelRoomCategory(java.lang.String)
	 * @generated
	 */
	public void testGetHotelRoomCategory__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesAccess#getConferenceRoomCapacity(java.lang.String) <em>Get Conference Room Capacity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesAccess#getConferenceRoomCapacity(java.lang.String)
	 * @generated
	 */
	public void testGetConferenceRoomCapacity__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesAccess#getHotelRoomNbrBeds(java.lang.String) <em>Get Hotel Room Nbr Beds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesAccess#getHotelRoomNbrBeds(java.lang.String)
	 * @generated
	 */
	public void testGetHotelRoomNbrBeds__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesAccess#searchForBookable(java.lang.String) <em>Search For Bookable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesAccess#searchForBookable(java.lang.String)
	 * @generated
	 */
	public void testSearchForBookable__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesAccess#getRoomLocationFloor(java.lang.String) <em>Get Room Location Floor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesAccess#getRoomLocationFloor(java.lang.String)
	 * @generated
	 */
	public void testGetRoomLocationFloor__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesAccess#getAllHotelRoomIDs() <em>Get All Hotel Room IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesAccess#getAllHotelRoomIDs()
	 * @generated
	 */
	public void testGetAllHotelRoomIDs() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesAccess#getAllConferenceRoomIDs() <em>Get All Conference Room IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesAccess#getAllConferenceRoomIDs()
	 * @generated
	 */
	public void testGetAllConferenceRoomIDs() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesAccess#getAllHostelBedIDs() <em>Get All Hostel Bed IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesAccess#getAllHostelBedIDs()
	 * @generated
	 */
	public void testGetAllHostelBedIDs() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesAccess#getConferenceRoomCategory(java.lang.String) <em>Get Conference Room Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesAccess#getConferenceRoomCategory(java.lang.String)
	 * @generated
	 */
	public void testGetConferenceRoomCategory__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesAccess#searchHotelRooms(java.lang.String, Classes.Bookables.HotelRoomCategory) <em>Search Hotel Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesAccess#searchHotelRooms(java.lang.String, Classes.Bookables.HotelRoomCategory)
	 * @generated
	 */
	public void testSearchHotelRooms__String_HotelRoomCategory() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesAccess#searchHostelBeds(java.lang.String) <em>Search Hostel Beds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesAccess#searchHostelBeds(java.lang.String)
	 * @generated
	 */
	public void testSearchHostelBeds__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesAccess#searchConferenceRooms(java.lang.String, Classes.Bookables.ConferenceRoomCategory) <em>Search Conference Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesAccess#searchConferenceRooms(java.lang.String, Classes.Bookables.ConferenceRoomCategory)
	 * @generated
	 */
	public void testSearchConferenceRooms__String_ConferenceRoomCategory() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesManage#changeHostelBedRoom(java.lang.String, java.lang.String) <em>Change Hostel Bed Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesManage#changeHostelBedRoom(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testChangeHostelBedRoom__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesManage#deleteBookable(java.lang.String) <em>Delete Bookable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesManage#deleteBookable(java.lang.String)
	 * @generated
	 */
	public void testDeleteBookable__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesManage#changeRoomLocation(java.lang.String, int, java.lang.String) <em>Change Room Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesManage#changeRoomLocation(java.lang.String, int, java.lang.String)
	 * @generated
	 */
	public void testChangeRoomLocation__String_int_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesManage#changeHotelRoomCategory(java.lang.String, Classes.Bookables.HotelRoomCategory) <em>Change Hotel Room Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesManage#changeHotelRoomCategory(java.lang.String, Classes.Bookables.HotelRoomCategory)
	 * @generated
	 */
	public void testChangeHotelRoomCategory__String_HotelRoomCategory() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesManage#changeConferenceRoomCategory(java.lang.String, Classes.Bookables.ConferenceRoomCategory) <em>Change Conference Room Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesManage#changeConferenceRoomCategory(java.lang.String, Classes.Bookables.ConferenceRoomCategory)
	 * @generated
	 */
	public void testChangeConferenceRoomCategory__String_ConferenceRoomCategory() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesManage#changeBookableBasePrice(java.lang.String, double) <em>Change Bookable Base Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesManage#changeBookableBasePrice(java.lang.String, double)
	 * @generated
	 */
	public void testChangeBookableBasePrice__String_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesManage#changeBookableDescription(java.lang.String, java.lang.String) <em>Change Bookable Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesManage#changeBookableDescription(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testChangeBookableDescription__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesManage#addHotelRoom(java.lang.String, double, java.lang.String, int, java.lang.String, Classes.Bookables.HotelRoomCategory, int) <em>Add Hotel Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesManage#addHotelRoom(java.lang.String, double, java.lang.String, int, java.lang.String, Classes.Bookables.HotelRoomCategory, int)
	 * @generated
	 */
	public void testAddHotelRoom__String_double_String_int_String_HotelRoomCategory_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesManage#addHostelBed(java.lang.String, double, java.lang.String, java.lang.String) <em>Add Hostel Bed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesManage#addHostelBed(java.lang.String, double, java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testAddHostelBed__String_double_String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesManage#addConferenceRoom(java.lang.String, double, java.lang.String, int, java.lang.String, Classes.Bookables.ConferenceRoomCategory, int) <em>Add Conference Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesManage#addConferenceRoom(java.lang.String, double, java.lang.String, int, java.lang.String, Classes.Bookables.ConferenceRoomCategory, int)
	 * @generated
	 */
	public void testAddConferenceRoom__String_double_String_int_String_ConferenceRoomCategory_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesManage#changeHotelRoomNumberBeds(java.lang.String, int) <em>Change Hotel Room Number Beds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesManage#changeHotelRoomNumberBeds(java.lang.String, int)
	 * @generated
	 */
	public void testChangeHotelRoomNumberBeds__String_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookables.IBookablesManage#changeConferenceRoomCapacity(java.lang.String, int) <em>Change Conference Room Capacity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesManage#changeConferenceRoomCapacity(java.lang.String, int)
	 * @generated
	 */
	public void testChangeConferenceRoomCapacity__String_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //IBookablesManageTest
