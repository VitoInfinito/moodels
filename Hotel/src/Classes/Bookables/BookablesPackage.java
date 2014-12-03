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
	 * The operation id for the '<em>Set Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_LOCATION___SET_INFO = 0;

	/**
	 * The number of operations of the '<em>Room Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOM_LOCATION_OPERATION_COUNT = 1;

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
	int CONFERENCE_ROOM = 4;

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
	 * The meta object id for the '{@link Classes.Bookables.impl.HotelRoomImpl <em>Hotel Room</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.impl.HotelRoomImpl
	 * @see Classes.Bookables.impl.BookablesPackageImpl#getHotelRoom()
	 * @generated
	 */
	int HOTEL_ROOM = 5;

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
	int IBOOKABLES_ACCESS___GET_BOOKABLE_BASE_PRICE = 0;

	/**
	 * The operation id for the '<em>Get Room Location Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___GET_ROOM_LOCATION_INFO = 1;

	/**
	 * The operation id for the '<em>Get Bookable Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___GET_BOOKABLE_DESCRIPTION = 2;

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
	int IBOOKABLES_ACCESS___GET_ROOM_OF_HOSTEL_BED = 4;

	/**
	 * The operation id for the '<em>Get Bookable Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___GET_BOOKABLE_CATEGORY = 5;

	/**
	 * The operation id for the '<em>Get Conference Room Capacity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___GET_CONFERENCE_ROOM_CAPACITY = 6;

	/**
	 * The operation id for the '<em>Get Hotel Room Nbr Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___GET_HOTEL_ROOM_NBR_BEDS = 7;

	/**
	 * The operation id for the '<em>Search For Bookable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS___SEARCH_FOR_BOOKABLE = 8;

	/**
	 * The number of operations of the '<em>IBookables Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_ACCESS_OPERATION_COUNT = 9;

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
	int IBOOKABLES_MANAGE___GET_BOOKABLE_BASE_PRICE = IBOOKABLES_ACCESS___GET_BOOKABLE_BASE_PRICE;

	/**
	 * The operation id for the '<em>Get Room Location Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___GET_ROOM_LOCATION_INFO = IBOOKABLES_ACCESS___GET_ROOM_LOCATION_INFO;

	/**
	 * The operation id for the '<em>Get Bookable Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___GET_BOOKABLE_DESCRIPTION = IBOOKABLES_ACCESS___GET_BOOKABLE_DESCRIPTION;

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
	int IBOOKABLES_MANAGE___GET_ROOM_OF_HOSTEL_BED = IBOOKABLES_ACCESS___GET_ROOM_OF_HOSTEL_BED;

	/**
	 * The operation id for the '<em>Get Bookable Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___GET_BOOKABLE_CATEGORY = IBOOKABLES_ACCESS___GET_BOOKABLE_CATEGORY;

	/**
	 * The operation id for the '<em>Get Conference Room Capacity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___GET_CONFERENCE_ROOM_CAPACITY = IBOOKABLES_ACCESS___GET_CONFERENCE_ROOM_CAPACITY;

	/**
	 * The operation id for the '<em>Get Hotel Room Nbr Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___GET_HOTEL_ROOM_NBR_BEDS = IBOOKABLES_ACCESS___GET_HOTEL_ROOM_NBR_BEDS;

	/**
	 * The operation id for the '<em>Search For Bookable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___SEARCH_FOR_BOOKABLE = IBOOKABLES_ACCESS___SEARCH_FOR_BOOKABLE;

	/**
	 * The operation id for the '<em>Add Bookable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___ADD_BOOKABLE = IBOOKABLES_ACCESS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Change Room Of Hostel Bed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___CHANGE_ROOM_OF_HOSTEL_BED = IBOOKABLES_ACCESS_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Delete Bookable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___DELETE_BOOKABLE = IBOOKABLES_ACCESS_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Change Room Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___CHANGE_ROOM_LOCATION = IBOOKABLES_ACCESS_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Change Hotel Room Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___CHANGE_HOTEL_ROOM_CATEGORY = IBOOKABLES_ACCESS_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Change Conference Room Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___CHANGE_CONFERENCE_ROOM_CATEGORY = IBOOKABLES_ACCESS_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Change Base Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___CHANGE_BASE_PRICE = IBOOKABLES_ACCESS_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Change Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE___CHANGE_DESCRIPTION = IBOOKABLES_ACCESS_OPERATION_COUNT + 7;

	/**
	 * The number of operations of the '<em>IBookables Manage</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKABLES_MANAGE_OPERATION_COUNT = IBOOKABLES_ACCESS_OPERATION_COUNT + 8;

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
	 * The feature id for the '<em><b>Bookable</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER__BOOKABLE = IBOOKABLES_MANAGE_FEATURE_COUNT + 0;

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
	int BOOKABLES_MANAGER___GET_BOOKABLE_BASE_PRICE = IBOOKABLES_MANAGE___GET_BOOKABLE_BASE_PRICE;

	/**
	 * The operation id for the '<em>Get Room Location Info</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___GET_ROOM_LOCATION_INFO = IBOOKABLES_MANAGE___GET_ROOM_LOCATION_INFO;

	/**
	 * The operation id for the '<em>Get Bookable Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___GET_BOOKABLE_DESCRIPTION = IBOOKABLES_MANAGE___GET_BOOKABLE_DESCRIPTION;

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
	int BOOKABLES_MANAGER___GET_ROOM_OF_HOSTEL_BED = IBOOKABLES_MANAGE___GET_ROOM_OF_HOSTEL_BED;

	/**
	 * The operation id for the '<em>Get Bookable Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___GET_BOOKABLE_CATEGORY = IBOOKABLES_MANAGE___GET_BOOKABLE_CATEGORY;

	/**
	 * The operation id for the '<em>Get Conference Room Capacity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___GET_CONFERENCE_ROOM_CAPACITY = IBOOKABLES_MANAGE___GET_CONFERENCE_ROOM_CAPACITY;

	/**
	 * The operation id for the '<em>Get Hotel Room Nbr Beds</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___GET_HOTEL_ROOM_NBR_BEDS = IBOOKABLES_MANAGE___GET_HOTEL_ROOM_NBR_BEDS;

	/**
	 * The operation id for the '<em>Search For Bookable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___SEARCH_FOR_BOOKABLE = IBOOKABLES_MANAGE___SEARCH_FOR_BOOKABLE;

	/**
	 * The operation id for the '<em>Add Bookable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___ADD_BOOKABLE = IBOOKABLES_MANAGE___ADD_BOOKABLE;

	/**
	 * The operation id for the '<em>Change Room Of Hostel Bed</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___CHANGE_ROOM_OF_HOSTEL_BED = IBOOKABLES_MANAGE___CHANGE_ROOM_OF_HOSTEL_BED;

	/**
	 * The operation id for the '<em>Delete Bookable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___DELETE_BOOKABLE = IBOOKABLES_MANAGE___DELETE_BOOKABLE;

	/**
	 * The operation id for the '<em>Change Room Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___CHANGE_ROOM_LOCATION = IBOOKABLES_MANAGE___CHANGE_ROOM_LOCATION;

	/**
	 * The operation id for the '<em>Change Hotel Room Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___CHANGE_HOTEL_ROOM_CATEGORY = IBOOKABLES_MANAGE___CHANGE_HOTEL_ROOM_CATEGORY;

	/**
	 * The operation id for the '<em>Change Conference Room Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___CHANGE_CONFERENCE_ROOM_CATEGORY = IBOOKABLES_MANAGE___CHANGE_CONFERENCE_ROOM_CATEGORY;

	/**
	 * The operation id for the '<em>Change Base Price</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___CHANGE_BASE_PRICE = IBOOKABLES_MANAGE___CHANGE_BASE_PRICE;

	/**
	 * The operation id for the '<em>Change Description</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKABLES_MANAGER___CHANGE_DESCRIPTION = IBOOKABLES_MANAGE___CHANGE_DESCRIPTION;

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
	int CONFERENCE_ROOM_CATEGORY = 9;

	/**
	 * The meta object id for the '{@link Classes.Bookables.HotelRoomCategory <em>Hotel Room Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookables.HotelRoomCategory
	 * @see Classes.Bookables.impl.BookablesPackageImpl#getHotelRoomCategory()
	 * @generated
	 */
	int HOTEL_ROOM_CATEGORY = 10;


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
	 * Returns the meta object for the '{@link Classes.Bookables.RoomLocation#setInfo() <em>Set Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Info</em>' operation.
	 * @see Classes.Bookables.RoomLocation#setInfo()
	 * @generated
	 */
	EOperation getRoomLocation__SetInfo();

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
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#addBookable() <em>Add Bookable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Bookable</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#addBookable()
	 * @generated
	 */
	EOperation getIBookablesManage__AddBookable();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#changeRoomOfHostelBed() <em>Change Room Of Hostel Bed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Room Of Hostel Bed</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#changeRoomOfHostelBed()
	 * @generated
	 */
	EOperation getIBookablesManage__ChangeRoomOfHostelBed();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#deleteBookable() <em>Delete Bookable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Bookable</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#deleteBookable()
	 * @generated
	 */
	EOperation getIBookablesManage__DeleteBookable();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#changeRoomLocation() <em>Change Room Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Room Location</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#changeRoomLocation()
	 * @generated
	 */
	EOperation getIBookablesManage__ChangeRoomLocation();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#changeHotelRoomCategory() <em>Change Hotel Room Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Hotel Room Category</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#changeHotelRoomCategory()
	 * @generated
	 */
	EOperation getIBookablesManage__ChangeHotelRoomCategory();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#changeConferenceRoomCategory() <em>Change Conference Room Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Conference Room Category</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#changeConferenceRoomCategory()
	 * @generated
	 */
	EOperation getIBookablesManage__ChangeConferenceRoomCategory();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#changeBasePrice() <em>Change Base Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Base Price</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#changeBasePrice()
	 * @generated
	 */
	EOperation getIBookablesManage__ChangeBasePrice();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesManage#changeDescription() <em>Change Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Description</em>' operation.
	 * @see Classes.Bookables.IBookablesManage#changeDescription()
	 * @generated
	 */
	EOperation getIBookablesManage__ChangeDescription();

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
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getBookableBasePrice() <em>Get Bookable Base Price</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookable Base Price</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getBookableBasePrice()
	 * @generated
	 */
	EOperation getIBookablesAccess__GetBookableBasePrice();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getRoomLocationInfo() <em>Get Room Location Info</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Location Info</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getRoomLocationInfo()
	 * @generated
	 */
	EOperation getIBookablesAccess__GetRoomLocationInfo();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getBookableDescription() <em>Get Bookable Description</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookable Description</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getBookableDescription()
	 * @generated
	 */
	EOperation getIBookablesAccess__GetBookableDescription();

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
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getRoomOfHostelBed() <em>Get Room Of Hostel Bed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Room Of Hostel Bed</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getRoomOfHostelBed()
	 * @generated
	 */
	EOperation getIBookablesAccess__GetRoomOfHostelBed();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getBookableCategory() <em>Get Bookable Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookable Category</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getBookableCategory()
	 * @generated
	 */
	EOperation getIBookablesAccess__GetBookableCategory();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getConferenceRoomCapacity() <em>Get Conference Room Capacity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Conference Room Capacity</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getConferenceRoomCapacity()
	 * @generated
	 */
	EOperation getIBookablesAccess__GetConferenceRoomCapacity();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#getHotelRoomNbrBeds() <em>Get Hotel Room Nbr Beds</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Hotel Room Nbr Beds</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#getHotelRoomNbrBeds()
	 * @generated
	 */
	EOperation getIBookablesAccess__GetHotelRoomNbrBeds();

	/**
	 * Returns the meta object for the '{@link Classes.Bookables.IBookablesAccess#searchForBookable() <em>Search For Bookable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search For Bookable</em>' operation.
	 * @see Classes.Bookables.IBookablesAccess#searchForBookable()
	 * @generated
	 */
	EOperation getIBookablesAccess__SearchForBookable();

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
	 * Returns the meta object for the reference list '{@link Classes.Bookables.BookablesManager#getBookable <em>Bookable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bookable</em>'.
	 * @see Classes.Bookables.BookablesManager#getBookable()
	 * @see #getBookablesManager()
	 * @generated
	 */
	EReference getBookablesManager_Bookable();

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
		 * The meta object literal for the '<em><b>Set Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ROOM_LOCATION___SET_INFO = eINSTANCE.getRoomLocation__SetInfo();

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
		 * The meta object literal for the '<em><b>Add Bookable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___ADD_BOOKABLE = eINSTANCE.getIBookablesManage__AddBookable();

		/**
		 * The meta object literal for the '<em><b>Change Room Of Hostel Bed</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___CHANGE_ROOM_OF_HOSTEL_BED = eINSTANCE.getIBookablesManage__ChangeRoomOfHostelBed();

		/**
		 * The meta object literal for the '<em><b>Delete Bookable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___DELETE_BOOKABLE = eINSTANCE.getIBookablesManage__DeleteBookable();

		/**
		 * The meta object literal for the '<em><b>Change Room Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___CHANGE_ROOM_LOCATION = eINSTANCE.getIBookablesManage__ChangeRoomLocation();

		/**
		 * The meta object literal for the '<em><b>Change Hotel Room Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___CHANGE_HOTEL_ROOM_CATEGORY = eINSTANCE.getIBookablesManage__ChangeHotelRoomCategory();

		/**
		 * The meta object literal for the '<em><b>Change Conference Room Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___CHANGE_CONFERENCE_ROOM_CATEGORY = eINSTANCE.getIBookablesManage__ChangeConferenceRoomCategory();

		/**
		 * The meta object literal for the '<em><b>Change Base Price</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___CHANGE_BASE_PRICE = eINSTANCE.getIBookablesManage__ChangeBasePrice();

		/**
		 * The meta object literal for the '<em><b>Change Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_MANAGE___CHANGE_DESCRIPTION = eINSTANCE.getIBookablesManage__ChangeDescription();

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
		EOperation IBOOKABLES_ACCESS___GET_BOOKABLE_BASE_PRICE = eINSTANCE.getIBookablesAccess__GetBookableBasePrice();

		/**
		 * The meta object literal for the '<em><b>Get Room Location Info</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___GET_ROOM_LOCATION_INFO = eINSTANCE.getIBookablesAccess__GetRoomLocationInfo();

		/**
		 * The meta object literal for the '<em><b>Get Bookable Description</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___GET_BOOKABLE_DESCRIPTION = eINSTANCE.getIBookablesAccess__GetBookableDescription();

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
		EOperation IBOOKABLES_ACCESS___GET_ROOM_OF_HOSTEL_BED = eINSTANCE.getIBookablesAccess__GetRoomOfHostelBed();

		/**
		 * The meta object literal for the '<em><b>Get Bookable Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___GET_BOOKABLE_CATEGORY = eINSTANCE.getIBookablesAccess__GetBookableCategory();

		/**
		 * The meta object literal for the '<em><b>Get Conference Room Capacity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___GET_CONFERENCE_ROOM_CAPACITY = eINSTANCE.getIBookablesAccess__GetConferenceRoomCapacity();

		/**
		 * The meta object literal for the '<em><b>Get Hotel Room Nbr Beds</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___GET_HOTEL_ROOM_NBR_BEDS = eINSTANCE.getIBookablesAccess__GetHotelRoomNbrBeds();

		/**
		 * The meta object literal for the '<em><b>Search For Bookable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKABLES_ACCESS___SEARCH_FOR_BOOKABLE = eINSTANCE.getIBookablesAccess__SearchForBookable();

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
		 * The meta object literal for the '<em><b>Bookable</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKABLES_MANAGER__BOOKABLE = eINSTANCE.getBookablesManager_Bookable();

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
