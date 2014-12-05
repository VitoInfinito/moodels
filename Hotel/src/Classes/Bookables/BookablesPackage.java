/**
 */
package Classes.Bookables;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see Classes.Bookables.BookablesFactory
 * @model kind="package"
 * @generated
 */
public interface BookablesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Bookables";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/Bookables.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Bookables";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BookablesPackage eINSTANCE = Classes.Bookables.impl.BookablesPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.Bookables.impl.BookableImpl <em>Bookable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.impl.BookableImpl
	 * @see Classes.Bookables.impl.BookablesPackageImpl#getBookable()
	 * @generated
	 */
	int BOOKABLE = 0;

	/**
	 * The feature id for the '<em><b>Baseprice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLE__BASEPRICE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLE__ID = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Bookable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Bookable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.Bookables.impl.RoomImpl <em>Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.impl.RoomImpl
	 * @see Classes.Bookables.impl.BookablesPackageImpl#getRoom()
	 * @generated
	 */
	int ROOM = 1;

	/**
	 * The feature id for the '<em><b>Baseprice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__BASEPRICE = BOOKABLE__BASEPRICE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__ID = BOOKABLE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__DESCRIPTION = BOOKABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM__LOCATION = BOOKABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_FEATURE_COUNT = BOOKABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_OPERATION_COUNT = BOOKABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.Bookables.impl.RoomLocationImpl <em>Room Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.impl.RoomLocationImpl
	 * @see Classes.Bookables.impl.BookablesPackageImpl#getRoomLocation()
	 * @generated
	 */
	int ROOM_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Floor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_LOCATION__FLOOR = 0;

	/**
	 * The feature id for the '<em><b>Addtional Info</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_LOCATION__ADDTIONAL_INFO = 1;

	/**
	 * The number of structural features of the '<em>Room Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Room Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.Bookables.impl.HostelBedImpl <em>Hostel Bed</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.impl.HostelBedImpl
	 * @see Classes.Bookables.impl.BookablesPackageImpl#getHostelBed()
	 * @generated
	 */
	int HOSTEL_BED = 3;

	/**
	 * The feature id for the '<em><b>Baseprice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTEL_BED__BASEPRICE = BOOKABLE__BASEPRICE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTEL_BED__ID = BOOKABLE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTEL_BED__DESCRIPTION = BOOKABLE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Room</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTEL_BED__ROOM = BOOKABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Hostel Bed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTEL_BED_FEATURE_COUNT = BOOKABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Hostel Bed</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOSTEL_BED_OPERATION_COUNT = BOOKABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.Bookables.impl.ConferenceRoomImpl <em>Conference Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.impl.ConferenceRoomImpl
	 * @see Classes.Bookables.impl.BookablesPackageImpl#getConferenceRoom()
	 * @generated
	 */
	int CONFERENCE_ROOM = 5;

	/**
	 * The meta object id for the '{@link Classes.Bookables.impl.HotelRoomImpl <em>Hotel Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.impl.HotelRoomImpl
	 * @see Classes.Bookables.impl.BookablesPackageImpl#getHotelRoom()
	 * @generated
	 */
	int HOTEL_ROOM = 4;

	/**
	 * The feature id for the '<em><b>Baseprice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM__BASEPRICE = ROOM__BASEPRICE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM__ID = ROOM__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM__DESCRIPTION = ROOM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM__LOCATION = ROOM__LOCATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM__CATEGORY = ROOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nbr Beds</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM__NBR_BEDS = ROOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hotel Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM_FEATURE_COUNT = ROOM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Hotel Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOTEL_ROOM_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Baseprice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__BASEPRICE = ROOM__BASEPRICE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__ID = ROOM__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__DESCRIPTION = ROOM__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Location</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__LOCATION = ROOM__LOCATION;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__CATEGORY = ROOM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM__CAPACITY = ROOM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Conference Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_FEATURE_COUNT = ROOM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Conference Room</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFERENCE_ROOM_OPERATION_COUNT = ROOM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.Bookables.IBookablesAccess <em>IBookables Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesAccess
	 * @see Classes.Bookables.impl.BookablesPackageImpl#getIBookablesAccess()
	 * @generated
	 */
	int IBOOKABLES_ACCESS = 7;

	/**
	 * The number of structural features of the '<em>IBookables Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Bookable Base Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___GET_BOOKABLE_BASE_PRICE__STRING = 0;

	/**
	 * The operation id for the '<em>Get Room Location Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___GET_ROOM_LOCATION_INFO__STRING = 1;

	/**
	 * The operation id for the '<em>Get Bookable Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___GET_BOOKABLE_DESCRIPTION__STRING = 2;

	/**
	 * The operation id for the '<em>Get All Bookable IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___GET_ALL_BOOKABLE_IDS = 3;

	/**
	 * The operation id for the '<em>Get Room Of Hostel Bed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___GET_ROOM_OF_HOSTEL_BED__STRING = 4;

	/**
	 * The operation id for the '<em>Get Hotel Room Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___GET_HOTEL_ROOM_CATEGORY__STRING = 5;

	/**
	 * The operation id for the '<em>Get Conference Room Capacity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___GET_CONFERENCE_ROOM_CAPACITY__STRING = 6;

	/**
	 * The operation id for the '<em>Get Hotel Room Nbr Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___GET_HOTEL_ROOM_NBR_BEDS__STRING = 7;

	/**
	 * The operation id for the '<em>Search For Bookable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___SEARCH_FOR_BOOKABLE__STRING = 8;

	/**
	 * The operation id for the '<em>Get Room Location Floor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___GET_ROOM_LOCATION_FLOOR__STRING = 9;

	/**
	 * The operation id for the '<em>Get All Hotel Room IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___GET_ALL_HOTEL_ROOM_IDS = 10;

	/**
	 * The operation id for the '<em>Get All Conference Room IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___GET_ALL_CONFERENCE_ROOM_IDS = 11;

	/**
	 * The operation id for the '<em>Get All Hostel Bed IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___GET_ALL_HOSTEL_BED_IDS = 12;

	/**
	 * The operation id for the '<em>Get Conference Room Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___GET_CONFERENCE_ROOM_CATEGORY__STRING = 13;

	/**
	 * The operation id for the '<em>Search Hotel Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___SEARCH_HOTEL_ROOMS__STRING_HOTELROOMCATEGORY = 14;

	/**
	 * The operation id for the '<em>Search Hostel Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___SEARCH_HOSTEL_BEDS__STRING = 15;

	/**
	 * The operation id for the '<em>Search Conference Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___SEARCH_CONFERENCE_ROOMS__STRING_CONFERENCEROOMCATEGORY = 16;

	/**
	 * The number of operations of the '<em>IBookables Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS_OPERATION_COUNT = 17;

	/**
	 * The meta object id for the '{@link Classes.Bookables.IBookablesManage <em>IBookables Manage</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.IBookablesManage
	 * @see Classes.Bookables.impl.BookablesPackageImpl#getIBookablesManage()
	 * @generated
	 */
	int IBOOKABLES_MANAGE = 6;

	/**
	 * The number of structural features of the '<em>IBookables Manage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE_FEATURE_COUNT = IBOOKABLES_ACCESS_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Bookable Base Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___GET_BOOKABLE_BASE_PRICE__STRING = IBOOKABLES_ACCESS___GET_BOOKABLE_BASE_PRICE__STRING;

	/**
	 * The operation id for the '<em>Get Room Location Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___GET_ROOM_LOCATION_INFO__STRING = IBOOKABLES_ACCESS___GET_ROOM_LOCATION_INFO__STRING;

	/**
	 * The operation id for the '<em>Get Bookable Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___GET_BOOKABLE_DESCRIPTION__STRING = IBOOKABLES_ACCESS___GET_BOOKABLE_DESCRIPTION__STRING;

	/**
	 * The operation id for the '<em>Get All Bookable IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___GET_ALL_BOOKABLE_IDS = IBOOKABLES_ACCESS___GET_ALL_BOOKABLE_IDS;

	/**
	 * The operation id for the '<em>Get Room Of Hostel Bed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___GET_ROOM_OF_HOSTEL_BED__STRING = IBOOKABLES_ACCESS___GET_ROOM_OF_HOSTEL_BED__STRING;

	/**
	 * The operation id for the '<em>Get Hotel Room Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___GET_HOTEL_ROOM_CATEGORY__STRING = IBOOKABLES_ACCESS___GET_HOTEL_ROOM_CATEGORY__STRING;

	/**
	 * The operation id for the '<em>Get Conference Room Capacity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___GET_CONFERENCE_ROOM_CAPACITY__STRING = IBOOKABLES_ACCESS___GET_CONFERENCE_ROOM_CAPACITY__STRING;

	/**
	 * The operation id for the '<em>Get Hotel Room Nbr Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___GET_HOTEL_ROOM_NBR_BEDS__STRING = IBOOKABLES_ACCESS___GET_HOTEL_ROOM_NBR_BEDS__STRING;

	/**
	 * The operation id for the '<em>Search For Bookable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___SEARCH_FOR_BOOKABLE__STRING = IBOOKABLES_ACCESS___SEARCH_FOR_BOOKABLE__STRING;

	/**
	 * The operation id for the '<em>Get Room Location Floor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___GET_ROOM_LOCATION_FLOOR__STRING = IBOOKABLES_ACCESS___GET_ROOM_LOCATION_FLOOR__STRING;

	/**
	 * The operation id for the '<em>Get All Hotel Room IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___GET_ALL_HOTEL_ROOM_IDS = IBOOKABLES_ACCESS___GET_ALL_HOTEL_ROOM_IDS;

	/**
	 * The operation id for the '<em>Get All Conference Room IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___GET_ALL_CONFERENCE_ROOM_IDS = IBOOKABLES_ACCESS___GET_ALL_CONFERENCE_ROOM_IDS;

	/**
	 * The operation id for the '<em>Get All Hostel Bed IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___GET_ALL_HOSTEL_BED_IDS = IBOOKABLES_ACCESS___GET_ALL_HOSTEL_BED_IDS;

	/**
	 * The operation id for the '<em>Get Conference Room Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___GET_CONFERENCE_ROOM_CATEGORY__STRING = IBOOKABLES_ACCESS___GET_CONFERENCE_ROOM_CATEGORY__STRING;

	/**
	 * The operation id for the '<em>Search Hotel Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___SEARCH_HOTEL_ROOMS__STRING_HOTELROOMCATEGORY = IBOOKABLES_ACCESS___SEARCH_HOTEL_ROOMS__STRING_HOTELROOMCATEGORY;

	/**
	 * The operation id for the '<em>Search Hostel Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___SEARCH_HOSTEL_BEDS__STRING = IBOOKABLES_ACCESS___SEARCH_HOSTEL_BEDS__STRING;

	/**
	 * The operation id for the '<em>Search Conference Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___SEARCH_CONFERENCE_ROOMS__STRING_CONFERENCEROOMCATEGORY = IBOOKABLES_ACCESS___SEARCH_CONFERENCE_ROOMS__STRING_CONFERENCEROOMCATEGORY;

	/**
	 * The operation id for the '<em>Change Hostel Bed Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___CHANGE_HOSTEL_BED_ROOM__STRING_STRING = IBOOKABLES_ACCESS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Delete Bookable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___DELETE_BOOKABLE__STRING = IBOOKABLES_ACCESS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Change Room Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___CHANGE_ROOM_LOCATION__STRING_INT_STRING = IBOOKABLES_ACCESS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Change Hotel Room Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___CHANGE_HOTEL_ROOM_CATEGORY__STRING_HOTELROOMCATEGORY = IBOOKABLES_ACCESS_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Change Conference Room Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___CHANGE_CONFERENCE_ROOM_CATEGORY__STRING_CONFERENCEROOMCATEGORY = IBOOKABLES_ACCESS_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Change Bookable Base Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___CHANGE_BOOKABLE_BASE_PRICE__STRING_DOUBLE = IBOOKABLES_ACCESS_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Change Bookable Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___CHANGE_BOOKABLE_DESCRIPTION__STRING_STRING = IBOOKABLES_ACCESS_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Add Hotel Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___ADD_HOTEL_ROOM__STRING_DOUBLE_STRING_INT_STRING_HOTELROOMCATEGORY_INT = IBOOKABLES_ACCESS_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Add Hostel Bed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___ADD_HOSTEL_BED__STRING_DOUBLE_STRING_STRING = IBOOKABLES_ACCESS_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Add Conference Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___ADD_CONFERENCE_ROOM__STRING_DOUBLE_STRING_INT_STRING_CONFERENCEROOMCATEGORY_INT = IBOOKABLES_ACCESS_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Change Hotel Room Number Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___CHANGE_HOTEL_ROOM_NUMBER_BEDS__STRING_INT = IBOOKABLES_ACCESS_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Change Conference Room Capacity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___CHANGE_CONFERENCE_ROOM_CAPACITY__STRING_INT = IBOOKABLES_ACCESS_OPERATION_COUNT + 11;

	/**
	 * The number of operations of the '<em>IBookables Manage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE_OPERATION_COUNT = IBOOKABLES_ACCESS_OPERATION_COUNT + 12;

	/**
	 * The meta object id for the '{@link Classes.Bookables.impl.BookablesManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.impl.BookablesManagerImpl
	 * @see Classes.Bookables.impl.BookablesPackageImpl#getBookablesManager()
	 * @generated
	 */
	int BOOKABLES_MANAGER = 8;

	/**
	 * The feature id for the '<em><b>Bookables</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER__BOOKABLES = IBOOKABLES_MANAGE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IHotel Stay Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER__IHOTEL_STAY_MANAGER = IBOOKABLES_MANAGE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER_FEATURE_COUNT = IBOOKABLES_MANAGE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Bookable Base Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___GET_BOOKABLE_BASE_PRICE__STRING = IBOOKABLES_MANAGE___GET_BOOKABLE_BASE_PRICE__STRING;

	/**
	 * The operation id for the '<em>Get Room Location Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___GET_ROOM_LOCATION_INFO__STRING = IBOOKABLES_MANAGE___GET_ROOM_LOCATION_INFO__STRING;

	/**
	 * The operation id for the '<em>Get Bookable Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___GET_BOOKABLE_DESCRIPTION__STRING = IBOOKABLES_MANAGE___GET_BOOKABLE_DESCRIPTION__STRING;

	/**
	 * The operation id for the '<em>Get All Bookable IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___GET_ALL_BOOKABLE_IDS = IBOOKABLES_MANAGE___GET_ALL_BOOKABLE_IDS;

	/**
	 * The operation id for the '<em>Get Room Of Hostel Bed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___GET_ROOM_OF_HOSTEL_BED__STRING = IBOOKABLES_MANAGE___GET_ROOM_OF_HOSTEL_BED__STRING;

	/**
	 * The operation id for the '<em>Get Hotel Room Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___GET_HOTEL_ROOM_CATEGORY__STRING = IBOOKABLES_MANAGE___GET_HOTEL_ROOM_CATEGORY__STRING;

	/**
	 * The operation id for the '<em>Get Conference Room Capacity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___GET_CONFERENCE_ROOM_CAPACITY__STRING = IBOOKABLES_MANAGE___GET_CONFERENCE_ROOM_CAPACITY__STRING;

	/**
	 * The operation id for the '<em>Get Hotel Room Nbr Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___GET_HOTEL_ROOM_NBR_BEDS__STRING = IBOOKABLES_MANAGE___GET_HOTEL_ROOM_NBR_BEDS__STRING;

	/**
	 * The operation id for the '<em>Search For Bookable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___SEARCH_FOR_BOOKABLE__STRING = IBOOKABLES_MANAGE___SEARCH_FOR_BOOKABLE__STRING;

	/**
	 * The operation id for the '<em>Get Room Location Floor</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___GET_ROOM_LOCATION_FLOOR__STRING = IBOOKABLES_MANAGE___GET_ROOM_LOCATION_FLOOR__STRING;

	/**
	 * The operation id for the '<em>Get All Hotel Room IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___GET_ALL_HOTEL_ROOM_IDS = IBOOKABLES_MANAGE___GET_ALL_HOTEL_ROOM_IDS;

	/**
	 * The operation id for the '<em>Get All Conference Room IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___GET_ALL_CONFERENCE_ROOM_IDS = IBOOKABLES_MANAGE___GET_ALL_CONFERENCE_ROOM_IDS;

	/**
	 * The operation id for the '<em>Get All Hostel Bed IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___GET_ALL_HOSTEL_BED_IDS = IBOOKABLES_MANAGE___GET_ALL_HOSTEL_BED_IDS;

	/**
	 * The operation id for the '<em>Get Conference Room Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___GET_CONFERENCE_ROOM_CATEGORY__STRING = IBOOKABLES_MANAGE___GET_CONFERENCE_ROOM_CATEGORY__STRING;

	/**
	 * The operation id for the '<em>Search Hotel Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___SEARCH_HOTEL_ROOMS__STRING_HOTELROOMCATEGORY = IBOOKABLES_MANAGE___SEARCH_HOTEL_ROOMS__STRING_HOTELROOMCATEGORY;

	/**
	 * The operation id for the '<em>Search Hostel Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___SEARCH_HOSTEL_BEDS__STRING = IBOOKABLES_MANAGE___SEARCH_HOSTEL_BEDS__STRING;

	/**
	 * The operation id for the '<em>Search Conference Rooms</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___SEARCH_CONFERENCE_ROOMS__STRING_CONFERENCEROOMCATEGORY = IBOOKABLES_MANAGE___SEARCH_CONFERENCE_ROOMS__STRING_CONFERENCEROOMCATEGORY;

	/**
	 * The operation id for the '<em>Change Hostel Bed Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___CHANGE_HOSTEL_BED_ROOM__STRING_STRING = IBOOKABLES_MANAGE___CHANGE_HOSTEL_BED_ROOM__STRING_STRING;

	/**
	 * The operation id for the '<em>Delete Bookable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___DELETE_BOOKABLE__STRING = IBOOKABLES_MANAGE___DELETE_BOOKABLE__STRING;

	/**
	 * The operation id for the '<em>Change Room Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___CHANGE_ROOM_LOCATION__STRING_INT_STRING = IBOOKABLES_MANAGE___CHANGE_ROOM_LOCATION__STRING_INT_STRING;

	/**
	 * The operation id for the '<em>Change Hotel Room Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___CHANGE_HOTEL_ROOM_CATEGORY__STRING_HOTELROOMCATEGORY = IBOOKABLES_MANAGE___CHANGE_HOTEL_ROOM_CATEGORY__STRING_HOTELROOMCATEGORY;

	/**
	 * The operation id for the '<em>Change Conference Room Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___CHANGE_CONFERENCE_ROOM_CATEGORY__STRING_CONFERENCEROOMCATEGORY = IBOOKABLES_MANAGE___CHANGE_CONFERENCE_ROOM_CATEGORY__STRING_CONFERENCEROOMCATEGORY;

	/**
	 * The operation id for the '<em>Change Bookable Base Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___CHANGE_BOOKABLE_BASE_PRICE__STRING_DOUBLE = IBOOKABLES_MANAGE___CHANGE_BOOKABLE_BASE_PRICE__STRING_DOUBLE;

	/**
	 * The operation id for the '<em>Change Bookable Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___CHANGE_BOOKABLE_DESCRIPTION__STRING_STRING = IBOOKABLES_MANAGE___CHANGE_BOOKABLE_DESCRIPTION__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Hotel Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___ADD_HOTEL_ROOM__STRING_DOUBLE_STRING_INT_STRING_HOTELROOMCATEGORY_INT = IBOOKABLES_MANAGE___ADD_HOTEL_ROOM__STRING_DOUBLE_STRING_INT_STRING_HOTELROOMCATEGORY_INT;

	/**
	 * The operation id for the '<em>Add Hostel Bed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___ADD_HOSTEL_BED__STRING_DOUBLE_STRING_STRING = IBOOKABLES_MANAGE___ADD_HOSTEL_BED__STRING_DOUBLE_STRING_STRING;

	/**
	 * The operation id for the '<em>Add Conference Room</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___ADD_CONFERENCE_ROOM__STRING_DOUBLE_STRING_INT_STRING_CONFERENCEROOMCATEGORY_INT = IBOOKABLES_MANAGE___ADD_CONFERENCE_ROOM__STRING_DOUBLE_STRING_INT_STRING_CONFERENCEROOMCATEGORY_INT;

	/**
	 * The operation id for the '<em>Change Hotel Room Number Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___CHANGE_HOTEL_ROOM_NUMBER_BEDS__STRING_INT = IBOOKABLES_MANAGE___CHANGE_HOTEL_ROOM_NUMBER_BEDS__STRING_INT;

	/**
	 * The operation id for the '<em>Change Conference Room Capacity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___CHANGE_CONFERENCE_ROOM_CAPACITY__STRING_INT = IBOOKABLES_MANAGE___CHANGE_CONFERENCE_ROOM_CAPACITY__STRING_INT;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER_OPERATION_COUNT = IBOOKABLES_MANAGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.Bookables.ConferenceRoomCategory <em>Conference Room Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.ConferenceRoomCategory
	 * @see Classes.Bookables.impl.BookablesPackageImpl#getConferenceRoomCategory()
	 * @generated
	 */
	int CONFERENCE_ROOM_CATEGORY = 10;

	/**
	 * The meta object id for the '{@link Classes.Bookables.HotelRoomCategory <em>Hotel Room Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.HotelRoomCategory
	 * @see Classes.Bookables.impl.BookablesPackageImpl#getHotelRoomCategory()
	 * @generated
	 */
	int HOTEL_ROOM_CATEGORY = 9;


	/**
	 * Returns the meta object for class '{@link Classes.Bookables.Bookable <em>Bookable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bookable</em>'.
	 * @see Classes.Bookables.Bookable
	 * @generated
	 */
	EClass getBookable();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bookables.Bookable#getBaseprice <em>Baseprice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baseprice</em>'.
	 * @see Classes.Bookables.Bookable#getBaseprice()
	 * @see #getBookable()
	 * @generated
	 */
	EAttribute getBookable_Baseprice();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bookables.Bookable#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Classes.Bookables.Bookable#getId()
	 * @see #getBookable()
	 * @generated
	 */
	EAttribute getBookable_Id();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bookables.Bookable#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see Classes.Bookables.Bookable#getDescription()
	 * @see #getBookable()
	 * @generated
	 */
	EAttribute getBookable_Description();

	/**
	 * Returns the meta object for class '{@link Classes.Bookables.Room <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room</em>'.
	 * @see Classes.Bookables.Room
	 * @generated
	 */
	EClass getRoom();

	/**
	 * Returns the meta object for the reference '{@link Classes.Bookables.Room#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Location</em>'.
	 * @see Classes.Bookables.Room#getLocation()
	 * @see #getRoom()
	 * @generated
	 */
	EReference getRoom_Location();

	/**
	 * Returns the meta object for class '{@link Classes.Bookables.RoomLocation <em>Room Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Room Location</em>'.
	 * @see Classes.Bookables.RoomLocation
	 * @generated
	 */
	EClass getRoomLocation();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bookables.RoomLocation#getFloor <em>Floor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Floor</em>'.
	 * @see Classes.Bookables.RoomLocation#getFloor()
	 * @see #getRoomLocation()
	 * @generated
	 */
	EAttribute getRoomLocation_Floor();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bookables.RoomLocation#getAddtionalInfo <em>Addtional Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Addtional Info</em>'.
	 * @see Classes.Bookables.RoomLocation#getAddtionalInfo()
	 * @see #getRoomLocation()
	 * @generated
	 */
	EAttribute getRoomLocation_AddtionalInfo();

	/**
	 * Returns the meta object for class '{@link Classes.Bookables.HostelBed <em>Hostel Bed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hostel Bed</em>'.
	 * @see Classes.Bookables.HostelBed
	 * @generated
	 */
	EClass getHostelBed();

	/**
	 * Returns the meta object for the reference '{@link Classes.Bookables.HostelBed#getRoom <em>Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Room</em>'.
	 * @see Classes.Bookables.HostelBed#getRoom()
	 * @see #getHostelBed()
	 * @generated
	 */
	EReference getHostelBed_Room();

	/**
	 * Returns the meta object for class '{@link Classes.Bookables.ConferenceRoom <em>Conference Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Conference Room</em>'.
	 * @see Classes.Bookables.ConferenceRoom
	 * @generated
	 */
	EClass getConferenceRoom();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bookables.ConferenceRoom#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see Classes.Bookables.ConferenceRoom#getCategory()
	 * @see #getConferenceRoom()
	 * @generated
	 */
	EAttribute getConferenceRoom_Category();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bookables.ConferenceRoom#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity</em>'.
	 * @see Classes.Bookables.ConferenceRoom#getCapacity()
	 * @see #getConferenceRoom()
	 * @generated
	 */
	EAttribute getConferenceRoom_Capacity();

	/**
	 * Returns the meta object for class '{@link Classes.Bookables.HotelRoom <em>Hotel Room</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hotel Room</em>'.
	 * @see Classes.Bookables.HotelRoom
	 * @generated
	 */
	EClass getHotelRoom();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bookables.HotelRoom#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see Classes.Bookables.HotelRoom#getCategory()
	 * @see #getHotelRoom()
	 * @generated
	 */
	EAttribute getHotelRoom_Category();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bookables.HotelRoom#getNbrBeds <em>Nbr Beds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbr Beds</em>'.
	 * @see Classes.Bookables.HotelRoom#getNbrBeds()
	 * @see #getHotelRoom()
	 * @generated
	 */
	EAttribute getHotelRoom_NbrBeds();

	/**
	 * Returns the meta object for class '{@link Classes.Bookables.IBookablesManage <em>IBookables Manage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBookables Manage</em>'.
	 * @see Classes.Bookables.IBookablesManage
	 * @generated
	 */
	EClass getIBookablesManage();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#changeHostelBedRoom(java.lang.String, java.lang.String) <em>Change Hostel Bed Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Hostel Bed Room</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#changeHostelBedRoom(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBookablesManage__ChangeHostelBedRoom__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#deleteBookable(java.lang.String) <em>Delete Bookable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Bookable</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#deleteBookable(java.lang.String)
	 * @generated
	 */
	EOperation getIBookablesManage__DeleteBookable__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#changeRoomLocation(java.lang.String, int, java.lang.String) <em>Change Room Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Room Location</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#changeRoomLocation(java.lang.String, int, java.lang.String)
	 * @generated
	 */
	EOperation getIBookablesManage__ChangeRoomLocation__String_int_String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#changeHotelRoomCategory(java.lang.String, Classes.Bookables.HotelRoomCategory) <em>Change Hotel Room Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Hotel Room Category</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#changeHotelRoomCategory(java.lang.String, Classes.Bookables.HotelRoomCategory)
	 * @generated
	 */
	EOperation getIBookablesManage__ChangeHotelRoomCategory__String_HotelRoomCategory();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#changeConferenceRoomCategory(java.lang.String, Classes.Bookables.ConferenceRoomCategory) <em>Change Conference Room Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Conference Room Category</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#changeConferenceRoomCategory(java.lang.String, Classes.Bookables.ConferenceRoomCategory)
	 * @generated
	 */
	EOperation getIBookablesManage__ChangeConferenceRoomCategory__String_ConferenceRoomCategory();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#changeBookableBasePrice(java.lang.String, double) <em>Change Bookable Base Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Bookable Base Price</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#changeBookableBasePrice(java.lang.String, double)
	 * @generated
	 */
	EOperation getIBookablesManage__ChangeBookableBasePrice__String_double();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#changeBookableDescription(java.lang.String, java.lang.String) <em>Change Bookable Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Bookable Description</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#changeBookableDescription(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBookablesManage__ChangeBookableDescription__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#addHotelRoom(java.lang.String, double, java.lang.String, int, java.lang.String, Classes.Bookables.HotelRoomCategory, int) <em>Add Hotel Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Hotel Room</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#addHotelRoom(java.lang.String, double, java.lang.String, int, java.lang.String, Classes.Bookables.HotelRoomCategory, int)
	 * @generated
	 */
	EOperation getIBookablesManage__AddHotelRoom__String_double_String_int_String_HotelRoomCategory_int();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#addHostelBed(java.lang.String, double, java.lang.String, java.lang.String) <em>Add Hostel Bed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Hostel Bed</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#addHostelBed(java.lang.String, double, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBookablesManage__AddHostelBed__String_double_String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#addConferenceRoom(java.lang.String, double, java.lang.String, int, java.lang.String, Classes.Bookables.ConferenceRoomCategory, int) <em>Add Conference Room</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Conference Room</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#addConferenceRoom(java.lang.String, double, java.lang.String, int, java.lang.String, Classes.Bookables.ConferenceRoomCategory, int)
	 * @generated
	 */
	EOperation getIBookablesManage__AddConferenceRoom__String_double_String_int_String_ConferenceRoomCategory_int();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#changeHotelRoomNumberBeds(java.lang.String, int) <em>Change Hotel Room Number Beds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Hotel Room Number Beds</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#changeHotelRoomNumberBeds(java.lang.String, int)
	 * @generated
	 */
	EOperation getIBookablesManage__ChangeHotelRoomNumberBeds__String_int();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#changeConferenceRoomCapacity(java.lang.String, int) <em>Change Conference Room Capacity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Conference Room Capacity</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#changeConferenceRoomCapacity(java.lang.String, int)
	 * @generated
	 */
	EOperation getIBookablesManage__ChangeConferenceRoomCapacity__String_int();

	/**
	 * Returns the meta object for class '{@link Classes.Bookables.IBookablesAccess <em>IBookables Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBookables Access</em>'.
	 * @see Classes.Bookables.IBookablesAccess
	 * @generated
	 */
	EClass getIBookablesAccess();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getBookableBasePrice(java.lang.String) <em>Get Bookable Base Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookable Base Price</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getBookableBasePrice(java.lang.String)
	 * @generated
	 */
	EOperation getIBookablesAccess__GetBookableBasePrice__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getRoomLocationInfo(java.lang.String) <em>Get Room Location Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Location Info</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getRoomLocationInfo(java.lang.String)
	 * @generated
	 */
	EOperation getIBookablesAccess__GetRoomLocationInfo__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getBookableDescription(java.lang.String) <em>Get Bookable Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookable Description</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getBookableDescription(java.lang.String)
	 * @generated
	 */
	EOperation getIBookablesAccess__GetBookableDescription__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getAllBookableIDs() <em>Get All Bookable IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Bookable IDs</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getAllBookableIDs()
	 * @generated
	 */
	EOperation getIBookablesAccess__GetAllBookableIDs();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getRoomOfHostelBed(java.lang.String) <em>Get Room Of Hostel Bed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Of Hostel Bed</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getRoomOfHostelBed(java.lang.String)
	 * @generated
	 */
	EOperation getIBookablesAccess__GetRoomOfHostelBed__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getHotelRoomCategory(java.lang.String) <em>Get Hotel Room Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Hotel Room Category</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getHotelRoomCategory(java.lang.String)
	 * @generated
	 */
	EOperation getIBookablesAccess__GetHotelRoomCategory__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getConferenceRoomCapacity(java.lang.String) <em>Get Conference Room Capacity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Conference Room Capacity</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getConferenceRoomCapacity(java.lang.String)
	 * @generated
	 */
	EOperation getIBookablesAccess__GetConferenceRoomCapacity__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getHotelRoomNbrBeds(java.lang.String) <em>Get Hotel Room Nbr Beds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Hotel Room Nbr Beds</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getHotelRoomNbrBeds(java.lang.String)
	 * @generated
	 */
	EOperation getIBookablesAccess__GetHotelRoomNbrBeds__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#searchForBookable(java.lang.String) <em>Search For Bookable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search For Bookable</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#searchForBookable(java.lang.String)
	 * @generated
	 */
	EOperation getIBookablesAccess__SearchForBookable__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getRoomLocationFloor(java.lang.String) <em>Get Room Location Floor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Location Floor</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getRoomLocationFloor(java.lang.String)
	 * @generated
	 */
	EOperation getIBookablesAccess__GetRoomLocationFloor__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getAllHotelRoomIDs() <em>Get All Hotel Room IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Hotel Room IDs</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getAllHotelRoomIDs()
	 * @generated
	 */
	EOperation getIBookablesAccess__GetAllHotelRoomIDs();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getAllConferenceRoomIDs() <em>Get All Conference Room IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Conference Room IDs</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getAllConferenceRoomIDs()
	 * @generated
	 */
	EOperation getIBookablesAccess__GetAllConferenceRoomIDs();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getAllHostelBedIDs() <em>Get All Hostel Bed IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Hostel Bed IDs</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getAllHostelBedIDs()
	 * @generated
	 */
	EOperation getIBookablesAccess__GetAllHostelBedIDs();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getConferenceRoomCategory(java.lang.String) <em>Get Conference Room Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Conference Room Category</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getConferenceRoomCategory(java.lang.String)
	 * @generated
	 */
	EOperation getIBookablesAccess__GetConferenceRoomCategory__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#searchHotelRooms(java.lang.String, Classes.Bookables.HotelRoomCategory) <em>Search Hotel Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Hotel Rooms</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#searchHotelRooms(java.lang.String, Classes.Bookables.HotelRoomCategory)
	 * @generated
	 */
	EOperation getIBookablesAccess__SearchHotelRooms__String_HotelRoomCategory();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#searchHostelBeds(java.lang.String) <em>Search Hostel Beds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Hostel Beds</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#searchHostelBeds(java.lang.String)
	 * @generated
	 */
	EOperation getIBookablesAccess__SearchHostelBeds__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#searchConferenceRooms(java.lang.String, Classes.Bookables.ConferenceRoomCategory) <em>Search Conference Rooms</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Conference Rooms</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#searchConferenceRooms(java.lang.String, Classes.Bookables.ConferenceRoomCategory)
	 * @generated
	 */
	EOperation getIBookablesAccess__SearchConferenceRooms__String_ConferenceRoomCategory();

	/**
	 * Returns the meta object for class '{@link Classes.Bookables.BookablesManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see Classes.Bookables.BookablesManager
	 * @generated
	 */
	EClass getBookablesManager();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Bookables.BookablesManager#getBookables <em>Bookables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bookables</em>'.
	 * @see Classes.Bookables.BookablesManager#getBookables()
	 * @see #getBookablesManager()
	 * @generated
	 */
	EReference getBookablesManager_Bookables();

	/**
	 * Returns the meta object for the reference '{@link Classes.Bookables.BookablesManager#getIHotelStayManager <em>IHotel Stay Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IHotel Stay Manager</em>'.
	 * @see Classes.Bookables.BookablesManager#getIHotelStayManager()
	 * @see #getBookablesManager()
	 * @generated
	 */
	EReference getBookablesManager_IHotelStayManager();

	/**
	 * Returns the meta object for enum '{@link Classes.Bookables.ConferenceRoomCategory <em>Conference Room Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Conference Room Category</em>'.
	 * @see Classes.Bookables.ConferenceRoomCategory
	 * @generated
	 */
	EEnum getConferenceRoomCategory();

	/**
	 * Returns the meta object for enum '{@link Classes.Bookables.HotelRoomCategory <em>Hotel Room Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Hotel Room Category</em>'.
	 * @see Classes.Bookables.HotelRoomCategory
	 * @generated
	 */
	EEnum getHotelRoomCategory();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BookablesFactory getBookablesFactory();

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
		 * The meta object literal for the '{@link Classes.Bookables.impl.BookableImpl <em>Bookable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Bookables.impl.BookableImpl
		 * @see Classes.Bookables.impl.BookablesPackageImpl#getBookable()
		 * @generated
		 */
		EClass BOOKABLE = eINSTANCE.getBookable();

		/**
		 * The meta object literal for the '<em><b>Baseprice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKABLE__BASEPRICE = eINSTANCE.getBookable_Baseprice();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKABLE__ID = eINSTANCE.getBookable_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKABLE__DESCRIPTION = eINSTANCE.getBookable_Description();

		/**
		 * The meta object literal for the '{@link Classes.Bookables.impl.RoomImpl <em>Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Bookables.impl.RoomImpl
		 * @see Classes.Bookables.impl.BookablesPackageImpl#getRoom()
		 * @generated
		 */
		EClass ROOM = eINSTANCE.getRoom();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROOM__LOCATION = eINSTANCE.getRoom_Location();

		/**
		 * The meta object literal for the '{@link Classes.Bookables.impl.RoomLocationImpl <em>Room Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Bookables.impl.RoomLocationImpl
		 * @see Classes.Bookables.impl.BookablesPackageImpl#getRoomLocation()
		 * @generated
		 */
		EClass ROOM_LOCATION = eINSTANCE.getRoomLocation();

		/**
		 * The meta object literal for the '<em><b>Floor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_LOCATION__FLOOR = eINSTANCE.getRoomLocation_Floor();

		/**
		 * The meta object literal for the '<em><b>Addtional Info</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOM_LOCATION__ADDTIONAL_INFO = eINSTANCE.getRoomLocation_AddtionalInfo();

		/**
		 * The meta object literal for the '{@link Classes.Bookables.impl.HostelBedImpl <em>Hostel Bed</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Bookables.impl.HostelBedImpl
		 * @see Classes.Bookables.impl.BookablesPackageImpl#getHostelBed()
		 * @generated
		 */
		EClass HOSTEL_BED = eINSTANCE.getHostelBed();

		/**
		 * The meta object literal for the '<em><b>Room</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOSTEL_BED__ROOM = eINSTANCE.getHostelBed_Room();

		/**
		 * The meta object literal for the '{@link Classes.Bookables.impl.ConferenceRoomImpl <em>Conference Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Bookables.impl.ConferenceRoomImpl
		 * @see Classes.Bookables.impl.BookablesPackageImpl#getConferenceRoom()
		 * @generated
		 */
		EClass CONFERENCE_ROOM = eINSTANCE.getConferenceRoom();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE_ROOM__CATEGORY = eINSTANCE.getConferenceRoom_Category();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFERENCE_ROOM__CAPACITY = eINSTANCE.getConferenceRoom_Capacity();

		/**
		 * The meta object literal for the '{@link Classes.Bookables.impl.HotelRoomImpl <em>Hotel Room</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Bookables.impl.HotelRoomImpl
		 * @see Classes.Bookables.impl.BookablesPackageImpl#getHotelRoom()
		 * @generated
		 */
		EClass HOTEL_ROOM = eINSTANCE.getHotelRoom();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_ROOM__CATEGORY = eINSTANCE.getHotelRoom_Category();

		/**
		 * The meta object literal for the '<em><b>Nbr Beds</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOTEL_ROOM__NBR_BEDS = eINSTANCE.getHotelRoom_NbrBeds();

		/**
		 * The meta object literal for the '{@link Classes.Bookables.IBookablesManage <em>IBookables Manage</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Bookables.IBookablesManage
		 * @see Classes.Bookables.impl.BookablesPackageImpl#getIBookablesManage()
		 * @generated
		 */
		EClass IBOOKABLES_MANAGE = eINSTANCE.getIBookablesManage();

		/**
		 * The meta object literal for the '<em><b>Change Hostel Bed Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___CHANGE_HOSTEL_BED_ROOM__STRING_STRING = eINSTANCE.getIBookablesManage__ChangeHostelBedRoom__String_String();

		/**
		 * The meta object literal for the '<em><b>Delete Bookable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___DELETE_BOOKABLE__STRING = eINSTANCE.getIBookablesManage__DeleteBookable__String();

		/**
		 * The meta object literal for the '<em><b>Change Room Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___CHANGE_ROOM_LOCATION__STRING_INT_STRING = eINSTANCE.getIBookablesManage__ChangeRoomLocation__String_int_String();

		/**
		 * The meta object literal for the '<em><b>Change Hotel Room Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___CHANGE_HOTEL_ROOM_CATEGORY__STRING_HOTELROOMCATEGORY = eINSTANCE.getIBookablesManage__ChangeHotelRoomCategory__String_HotelRoomCategory();

		/**
		 * The meta object literal for the '<em><b>Change Conference Room Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___CHANGE_CONFERENCE_ROOM_CATEGORY__STRING_CONFERENCEROOMCATEGORY = eINSTANCE.getIBookablesManage__ChangeConferenceRoomCategory__String_ConferenceRoomCategory();

		/**
		 * The meta object literal for the '<em><b>Change Bookable Base Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___CHANGE_BOOKABLE_BASE_PRICE__STRING_DOUBLE = eINSTANCE.getIBookablesManage__ChangeBookableBasePrice__String_double();

		/**
		 * The meta object literal for the '<em><b>Change Bookable Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___CHANGE_BOOKABLE_DESCRIPTION__STRING_STRING = eINSTANCE.getIBookablesManage__ChangeBookableDescription__String_String();

		/**
		 * The meta object literal for the '<em><b>Add Hotel Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___ADD_HOTEL_ROOM__STRING_DOUBLE_STRING_INT_STRING_HOTELROOMCATEGORY_INT = eINSTANCE.getIBookablesManage__AddHotelRoom__String_double_String_int_String_HotelRoomCategory_int();

		/**
		 * The meta object literal for the '<em><b>Add Hostel Bed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___ADD_HOSTEL_BED__STRING_DOUBLE_STRING_STRING = eINSTANCE.getIBookablesManage__AddHostelBed__String_double_String_String();

		/**
		 * The meta object literal for the '<em><b>Add Conference Room</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___ADD_CONFERENCE_ROOM__STRING_DOUBLE_STRING_INT_STRING_CONFERENCEROOMCATEGORY_INT = eINSTANCE.getIBookablesManage__AddConferenceRoom__String_double_String_int_String_ConferenceRoomCategory_int();

		/**
		 * The meta object literal for the '<em><b>Change Hotel Room Number Beds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___CHANGE_HOTEL_ROOM_NUMBER_BEDS__STRING_INT = eINSTANCE.getIBookablesManage__ChangeHotelRoomNumberBeds__String_int();

		/**
		 * The meta object literal for the '<em><b>Change Conference Room Capacity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___CHANGE_CONFERENCE_ROOM_CAPACITY__STRING_INT = eINSTANCE.getIBookablesManage__ChangeConferenceRoomCapacity__String_int();

		/**
		 * The meta object literal for the '{@link Classes.Bookables.IBookablesAccess <em>IBookables Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Bookables.IBookablesAccess
		 * @see Classes.Bookables.impl.BookablesPackageImpl#getIBookablesAccess()
		 * @generated
		 */
		EClass IBOOKABLES_ACCESS = eINSTANCE.getIBookablesAccess();

		/**
		 * The meta object literal for the '<em><b>Get Bookable Base Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___GET_BOOKABLE_BASE_PRICE__STRING = eINSTANCE.getIBookablesAccess__GetBookableBasePrice__String();

		/**
		 * The meta object literal for the '<em><b>Get Room Location Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___GET_ROOM_LOCATION_INFO__STRING = eINSTANCE.getIBookablesAccess__GetRoomLocationInfo__String();

		/**
		 * The meta object literal for the '<em><b>Get Bookable Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___GET_BOOKABLE_DESCRIPTION__STRING = eINSTANCE.getIBookablesAccess__GetBookableDescription__String();

		/**
		 * The meta object literal for the '<em><b>Get All Bookable IDs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___GET_ALL_BOOKABLE_IDS = eINSTANCE.getIBookablesAccess__GetAllBookableIDs();

		/**
		 * The meta object literal for the '<em><b>Get Room Of Hostel Bed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___GET_ROOM_OF_HOSTEL_BED__STRING = eINSTANCE.getIBookablesAccess__GetRoomOfHostelBed__String();

		/**
		 * The meta object literal for the '<em><b>Get Hotel Room Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___GET_HOTEL_ROOM_CATEGORY__STRING = eINSTANCE.getIBookablesAccess__GetHotelRoomCategory__String();

		/**
		 * The meta object literal for the '<em><b>Get Conference Room Capacity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___GET_CONFERENCE_ROOM_CAPACITY__STRING = eINSTANCE.getIBookablesAccess__GetConferenceRoomCapacity__String();

		/**
		 * The meta object literal for the '<em><b>Get Hotel Room Nbr Beds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___GET_HOTEL_ROOM_NBR_BEDS__STRING = eINSTANCE.getIBookablesAccess__GetHotelRoomNbrBeds__String();

		/**
		 * The meta object literal for the '<em><b>Search For Bookable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___SEARCH_FOR_BOOKABLE__STRING = eINSTANCE.getIBookablesAccess__SearchForBookable__String();

		/**
		 * The meta object literal for the '<em><b>Get Room Location Floor</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___GET_ROOM_LOCATION_FLOOR__STRING = eINSTANCE.getIBookablesAccess__GetRoomLocationFloor__String();

		/**
		 * The meta object literal for the '<em><b>Get All Hotel Room IDs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___GET_ALL_HOTEL_ROOM_IDS = eINSTANCE.getIBookablesAccess__GetAllHotelRoomIDs();

		/**
		 * The meta object literal for the '<em><b>Get All Conference Room IDs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___GET_ALL_CONFERENCE_ROOM_IDS = eINSTANCE.getIBookablesAccess__GetAllConferenceRoomIDs();

		/**
		 * The meta object literal for the '<em><b>Get All Hostel Bed IDs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___GET_ALL_HOSTEL_BED_IDS = eINSTANCE.getIBookablesAccess__GetAllHostelBedIDs();

		/**
		 * The meta object literal for the '<em><b>Get Conference Room Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___GET_CONFERENCE_ROOM_CATEGORY__STRING = eINSTANCE.getIBookablesAccess__GetConferenceRoomCategory__String();

		/**
		 * The meta object literal for the '<em><b>Search Hotel Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___SEARCH_HOTEL_ROOMS__STRING_HOTELROOMCATEGORY = eINSTANCE.getIBookablesAccess__SearchHotelRooms__String_HotelRoomCategory();

		/**
		 * The meta object literal for the '<em><b>Search Hostel Beds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___SEARCH_HOSTEL_BEDS__STRING = eINSTANCE.getIBookablesAccess__SearchHostelBeds__String();

		/**
		 * The meta object literal for the '<em><b>Search Conference Rooms</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___SEARCH_CONFERENCE_ROOMS__STRING_CONFERENCEROOMCATEGORY = eINSTANCE.getIBookablesAccess__SearchConferenceRooms__String_ConferenceRoomCategory();

		/**
		 * The meta object literal for the '{@link Classes.Bookables.impl.BookablesManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Bookables.impl.BookablesManagerImpl
		 * @see Classes.Bookables.impl.BookablesPackageImpl#getBookablesManager()
		 * @generated
		 */
		EClass BOOKABLES_MANAGER = eINSTANCE.getBookablesManager();

		/**
		 * The meta object literal for the '<em><b>Bookables</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKABLES_MANAGER__BOOKABLES = eINSTANCE.getBookablesManager_Bookables();

		/**
		 * The meta object literal for the '<em><b>IHotel Stay Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKABLES_MANAGER__IHOTEL_STAY_MANAGER = eINSTANCE.getBookablesManager_IHotelStayManager();

		/**
		 * The meta object literal for the '{@link Classes.Bookables.ConferenceRoomCategory <em>Conference Room Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Bookables.ConferenceRoomCategory
		 * @see Classes.Bookables.impl.BookablesPackageImpl#getConferenceRoomCategory()
		 * @generated
		 */
		EEnum CONFERENCE_ROOM_CATEGORY = eINSTANCE.getConferenceRoomCategory();

		/**
		 * The meta object literal for the '{@link Classes.Bookables.HotelRoomCategory <em>Hotel Room Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Bookables.HotelRoomCategory
		 * @see Classes.Bookables.impl.BookablesPackageImpl#getHotelRoomCategory()
		 * @generated
		 */
		EEnum HOTEL_ROOM_CATEGORY = eINSTANCE.getHotelRoomCategory();

	}

} //BookablesPackage
