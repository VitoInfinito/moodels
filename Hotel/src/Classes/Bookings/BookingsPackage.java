/**
 */
package Classes.Bookings;

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
 * @see Classes.Bookings.BookingsFactory
 * @model kind="package"
 * @generated
 */
public interface BookingsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Bookings";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/Bookings.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Bookings";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BookingsPackage eINSTANCE = Classes.Bookings.impl.BookingsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.Bookings.impl.BookingImpl <em>Booking</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.impl.BookingImpl
	 * @see Classes.Bookings.impl.BookingsPackageImpl#getBooking()
	 * @generated
	 */
	int BOOKING = 0;

	/**
	 * The feature id for the '<em><b>Booked Stays</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKED_STAYS = 0;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CUSTOMER = 1;

	/**
	 * The feature id for the '<em><b>Booking Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__BOOKING_NBR = 2;

	/**
	 * The feature id for the '<em><b>Nbr Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__NBR_GUESTS = 3;

	/**
	 * The feature id for the '<em><b>Issue Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__ISSUE_DATE = 4;

	/**
	 * The feature id for the '<em><b>Credit Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__CREDIT_CARD = 5;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING__REQUESTS = 6;

	/**
	 * The number of structural features of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_FEATURE_COUNT = 7;

	/**
	 * The operation id for the '<em>Add Booked Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___ADD_BOOKED_STAY = 0;

	/**
	 * The operation id for the '<em>Cancel Booked Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CANCEL_BOOKED_STAY = 1;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Classes.Bookings.IBookings <em>IBookings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings
	 * @see Classes.Bookings.impl.BookingsPackageImpl#getIBookings()
	 * @generated
	 */
	int IBOOKINGS = 2;

	/**
	 * The number of structural features of the '<em>IBookings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Make Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___MAKE_BOOKING__ELIST_STRING_ELIST_ELIST_STRING_STRING_INT_INT_STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Search Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___SEARCH_BOOKINGS__STRING = 1;

	/**
	 * The operation id for the '<em>Get Booked Stays Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_BOOKED_STAYS_OF_BOOKING__STRING = 2;

	/**
	 * The operation id for the '<em>Get Customer Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_CUSTOMER_OF_BOOKING__STRING = 3;

	/**
	 * The operation id for the '<em>Get Nbr Guest Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_NBR_GUEST_OF_BOOKING__STRING = 4;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___CANCEL_BOOKING__STRING = 5;

	/**
	 * The operation id for the '<em>Cancel Stay Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___CANCEL_STAY_OF_BOOKING__STRING_STRING = 6;

	/**
	 * The operation id for the '<em>Add Booked Stay To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___ADD_BOOKED_STAY_TO_BOOKING__STRING_STRING = 7;

	/**
	 * The operation id for the '<em>Change Nbr Guests Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___CHANGE_NBR_GUESTS_OF_BOOKING__STRING_INT = 8;

	/**
	 * The operation id for the '<em>Get All Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_ALL_BOOKINGS = 9;

	/**
	 * The operation id for the '<em>Get All Bookings Within Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_ALL_BOOKINGS_WITHIN_PERIOD__DATE_DATE = 10;

	/**
	 * The operation id for the '<em>Get All Bookings With Stays In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_ALL_BOOKINGS_WITH_STAYS_IN_PERIOD__DATE_DATE = 11;

	/**
	 * The operation id for the '<em>Search Bookings Made In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___SEARCH_BOOKINGS_MADE_IN_PERIOD__STRING_DATE_DATE = 12;

	/**
	 * The operation id for the '<em>Search Bookings With Stays In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___SEARCH_BOOKINGS_WITH_STAYS_IN_PERIOD__STRING_DATE_DATE = 13;

	/**
	 * The operation id for the '<em>Search For Available Bookables In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___SEARCH_FOR_AVAILABLE_BOOKABLES_IN_PERIOD__DATE_DATE_STRING = 14;

	/**
	 * The operation id for the '<em>Get Available Bookables In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_AVAILABLE_BOOKABLES_IN_PERIOD__DATE_DATE = 15;

	/**
	 * The operation id for the '<em>Add Booking Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___ADD_BOOKING_REQUEST__STRING_STRING = 16;

	/**
	 * The operation id for the '<em>Remove Booking Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___REMOVE_BOOKING_REQUEST__STRING_STRING = 17;

	/**
	 * The operation id for the '<em>Get Booking Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_BOOKING_REQUESTS__STRING = 18;

	/**
	 * The operation id for the '<em>Pay Booking Bills</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___PAY_BOOKING_BILLS__STRING = 19;

	/**
	 * The operation id for the '<em>Pay Stay Bills</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___PAY_STAY_BILLS__STRING_STRING = 20;

	/**
	 * The operation id for the '<em>Search For Available Hotel Rooms In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___SEARCH_FOR_AVAILABLE_HOTEL_ROOMS_IN_PERIOD__DATE_DATE_STRING = 21;

	/**
	 * The operation id for the '<em>Search For Available Hostel Beds In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___SEARCH_FOR_AVAILABLE_HOSTEL_BEDS_IN_PERIOD__DATE_DATE_STRING = 22;

	/**
	 * The operation id for the '<em>Search For Available Conference Rooms In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___SEARCH_FOR_AVAILABLE_CONFERENCE_ROOMS_IN_PERIOD__DATE_DATE_STRING = 23;

	/**
	 * The operation id for the '<em>Get Available Hotel Rooms In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_AVAILABLE_HOTEL_ROOMS_IN_PERIOD__DATE_DATE = 24;

	/**
	 * The operation id for the '<em>Get Available Conference Rooms In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_AVAILABLE_CONFERENCE_ROOMS_IN_PERIOD__DATE_DATE = 25;

	/**
	 * The operation id for the '<em>Get Available Hostel Beds In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_AVAILABLE_HOSTEL_BEDS_IN_PERIOD__DATE_DATE = 26;

	/**
	 * The number of operations of the '<em>IBookings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS_OPERATION_COUNT = 27;

	/**
	 * The meta object id for the '{@link Classes.Bookings.impl.BookingsManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.impl.BookingsManagerImpl
	 * @see Classes.Bookings.impl.BookingsPackageImpl#getBookingsManager()
	 * @generated
	 */
	int BOOKINGS_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Booking</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER__BOOKING = IBOOKINGS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IBookable Access</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER__IBOOKABLE_ACCESS = IBOOKINGS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IHotel Stay Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER__IHOTEL_STAY_MANAGER = IBOOKINGS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER__BANK = IBOOKINGS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>IGuest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER__IGUEST = IBOOKINGS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>ICustomer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER__ICUSTOMER = IBOOKINGS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>IBills</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER__IBILLS = IBOOKINGS_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER_FEATURE_COUNT = IBOOKINGS_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Make Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___MAKE_BOOKING__ELIST_STRING_ELIST_ELIST_STRING_STRING_INT_INT_STRING_STRING = IBOOKINGS___MAKE_BOOKING__ELIST_STRING_ELIST_ELIST_STRING_STRING_INT_INT_STRING_STRING;

	/**
	 * The operation id for the '<em>Search Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___SEARCH_BOOKINGS__STRING = IBOOKINGS___SEARCH_BOOKINGS__STRING;

	/**
	 * The operation id for the '<em>Get Booked Stays Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___GET_BOOKED_STAYS_OF_BOOKING__STRING = IBOOKINGS___GET_BOOKED_STAYS_OF_BOOKING__STRING;

	/**
	 * The operation id for the '<em>Get Customer Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___GET_CUSTOMER_OF_BOOKING__STRING = IBOOKINGS___GET_CUSTOMER_OF_BOOKING__STRING;

	/**
	 * The operation id for the '<em>Get Nbr Guest Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___GET_NBR_GUEST_OF_BOOKING__STRING = IBOOKINGS___GET_NBR_GUEST_OF_BOOKING__STRING;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___CANCEL_BOOKING__STRING = IBOOKINGS___CANCEL_BOOKING__STRING;

	/**
	 * The operation id for the '<em>Cancel Stay Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___CANCEL_STAY_OF_BOOKING__STRING_STRING = IBOOKINGS___CANCEL_STAY_OF_BOOKING__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Booked Stay To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___ADD_BOOKED_STAY_TO_BOOKING__STRING_STRING = IBOOKINGS___ADD_BOOKED_STAY_TO_BOOKING__STRING_STRING;

	/**
	 * The operation id for the '<em>Change Nbr Guests Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___CHANGE_NBR_GUESTS_OF_BOOKING__STRING_INT = IBOOKINGS___CHANGE_NBR_GUESTS_OF_BOOKING__STRING_INT;

	/**
	 * The operation id for the '<em>Get All Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___GET_ALL_BOOKINGS = IBOOKINGS___GET_ALL_BOOKINGS;

	/**
	 * The operation id for the '<em>Get All Bookings Within Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___GET_ALL_BOOKINGS_WITHIN_PERIOD__DATE_DATE = IBOOKINGS___GET_ALL_BOOKINGS_WITHIN_PERIOD__DATE_DATE;

	/**
	 * The operation id for the '<em>Get All Bookings With Stays In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___GET_ALL_BOOKINGS_WITH_STAYS_IN_PERIOD__DATE_DATE = IBOOKINGS___GET_ALL_BOOKINGS_WITH_STAYS_IN_PERIOD__DATE_DATE;

	/**
	 * The operation id for the '<em>Search Bookings Made In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___SEARCH_BOOKINGS_MADE_IN_PERIOD__STRING_DATE_DATE = IBOOKINGS___SEARCH_BOOKINGS_MADE_IN_PERIOD__STRING_DATE_DATE;

	/**
	 * The operation id for the '<em>Search Bookings With Stays In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___SEARCH_BOOKINGS_WITH_STAYS_IN_PERIOD__STRING_DATE_DATE = IBOOKINGS___SEARCH_BOOKINGS_WITH_STAYS_IN_PERIOD__STRING_DATE_DATE;

	/**
	 * The operation id for the '<em>Search For Available Bookables In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___SEARCH_FOR_AVAILABLE_BOOKABLES_IN_PERIOD__DATE_DATE_STRING = IBOOKINGS___SEARCH_FOR_AVAILABLE_BOOKABLES_IN_PERIOD__DATE_DATE_STRING;

	/**
	 * The operation id for the '<em>Get Available Bookables In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___GET_AVAILABLE_BOOKABLES_IN_PERIOD__DATE_DATE = IBOOKINGS___GET_AVAILABLE_BOOKABLES_IN_PERIOD__DATE_DATE;

	/**
	 * The operation id for the '<em>Add Booking Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___ADD_BOOKING_REQUEST__STRING_STRING = IBOOKINGS___ADD_BOOKING_REQUEST__STRING_STRING;

	/**
	 * The operation id for the '<em>Remove Booking Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___REMOVE_BOOKING_REQUEST__STRING_STRING = IBOOKINGS___REMOVE_BOOKING_REQUEST__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Booking Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___GET_BOOKING_REQUESTS__STRING = IBOOKINGS___GET_BOOKING_REQUESTS__STRING;

	/**
	 * The operation id for the '<em>Pay Booking Bills</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___PAY_BOOKING_BILLS__STRING = IBOOKINGS___PAY_BOOKING_BILLS__STRING;

	/**
	 * The operation id for the '<em>Pay Stay Bills</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___PAY_STAY_BILLS__STRING_STRING = IBOOKINGS___PAY_STAY_BILLS__STRING_STRING;

	/**
	 * The operation id for the '<em>Search For Available Hotel Rooms In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___SEARCH_FOR_AVAILABLE_HOTEL_ROOMS_IN_PERIOD__DATE_DATE_STRING = IBOOKINGS___SEARCH_FOR_AVAILABLE_HOTEL_ROOMS_IN_PERIOD__DATE_DATE_STRING;

	/**
	 * The operation id for the '<em>Search For Available Hostel Beds In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___SEARCH_FOR_AVAILABLE_HOSTEL_BEDS_IN_PERIOD__DATE_DATE_STRING = IBOOKINGS___SEARCH_FOR_AVAILABLE_HOSTEL_BEDS_IN_PERIOD__DATE_DATE_STRING;

	/**
	 * The operation id for the '<em>Search For Available Conference Rooms In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___SEARCH_FOR_AVAILABLE_CONFERENCE_ROOMS_IN_PERIOD__DATE_DATE_STRING = IBOOKINGS___SEARCH_FOR_AVAILABLE_CONFERENCE_ROOMS_IN_PERIOD__DATE_DATE_STRING;

	/**
	 * The operation id for the '<em>Get Available Hotel Rooms In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___GET_AVAILABLE_HOTEL_ROOMS_IN_PERIOD__DATE_DATE = IBOOKINGS___GET_AVAILABLE_HOTEL_ROOMS_IN_PERIOD__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Available Conference Rooms In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___GET_AVAILABLE_CONFERENCE_ROOMS_IN_PERIOD__DATE_DATE = IBOOKINGS___GET_AVAILABLE_CONFERENCE_ROOMS_IN_PERIOD__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Available Hostel Beds In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___GET_AVAILABLE_HOSTEL_BEDS_IN_PERIOD__DATE_DATE = IBOOKINGS___GET_AVAILABLE_HOSTEL_BEDS_IN_PERIOD__DATE_DATE;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER_OPERATION_COUNT = IBOOKINGS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Classes.Bookings.Booking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Booking</em>'.
	 * @see Classes.Bookings.Booking
	 * @generated
	 */
	EClass getBooking();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.Bookings.Booking#getBookedStays <em>Booked Stays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Booked Stays</em>'.
	 * @see Classes.Bookings.Booking#getBookedStays()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookedStays();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bookings.Booking#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Customer</em>'.
	 * @see Classes.Bookings.Booking#getCustomer()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Customer();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bookings.Booking#getBookingNbr <em>Booking Nbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking Nbr</em>'.
	 * @see Classes.Bookings.Booking#getBookingNbr()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_BookingNbr();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bookings.Booking#getNbrGuests <em>Nbr Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbr Guests</em>'.
	 * @see Classes.Bookings.Booking#getNbrGuests()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_NbrGuests();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bookings.Booking#getIssueDate <em>Issue Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Date</em>'.
	 * @see Classes.Bookings.Booking#getIssueDate()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_IssueDate();

	/**
	 * Returns the meta object for the reference '{@link Classes.Bookings.Booking#getCreditCard <em>Credit Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credit Card</em>'.
	 * @see Classes.Bookings.Booking#getCreditCard()
	 * @see #getBooking()
	 * @generated
	 */
	EReference getBooking_CreditCard();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bookings.Booking#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requests</em>'.
	 * @see Classes.Bookings.Booking#getRequests()
	 * @see #getBooking()
	 * @generated
	 */
	EAttribute getBooking_Requests();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.Booking#addBookedStay() <em>Add Booked Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Booked Stay</em>' operation.
	 * @see Classes.Bookings.Booking#addBookedStay()
	 * @generated
	 */
	EOperation getBooking__AddBookedStay();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.Booking#cancelBookedStay() <em>Cancel Booked Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booked Stay</em>' operation.
	 * @see Classes.Bookings.Booking#cancelBookedStay()
	 * @generated
	 */
	EOperation getBooking__CancelBookedStay();

	/**
	 * Returns the meta object for class '{@link Classes.Bookings.BookingsManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see Classes.Bookings.BookingsManager
	 * @generated
	 */
	EClass getBookingsManager();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Bookings.BookingsManager#getBooking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Booking</em>'.
	 * @see Classes.Bookings.BookingsManager#getBooking()
	 * @see #getBookingsManager()
	 * @generated
	 */
	EReference getBookingsManager_Booking();

	/**
	 * Returns the meta object for the reference '{@link Classes.Bookings.BookingsManager#getIBookableAccess <em>IBookable Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IBookable Access</em>'.
	 * @see Classes.Bookings.BookingsManager#getIBookableAccess()
	 * @see #getBookingsManager()
	 * @generated
	 */
	EReference getBookingsManager_IBookableAccess();

	/**
	 * Returns the meta object for the reference '{@link Classes.Bookings.BookingsManager#getIHotelStayManager <em>IHotel Stay Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IHotel Stay Manager</em>'.
	 * @see Classes.Bookings.BookingsManager#getIHotelStayManager()
	 * @see #getBookingsManager()
	 * @generated
	 */
	EReference getBookingsManager_IHotelStayManager();

	/**
	 * Returns the meta object for the reference '{@link Classes.Bookings.BookingsManager#getBank <em>Bank</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Bank</em>'.
	 * @see Classes.Bookings.BookingsManager#getBank()
	 * @see #getBookingsManager()
	 * @generated
	 */
	EReference getBookingsManager_Bank();

	/**
	 * Returns the meta object for the reference '{@link Classes.Bookings.BookingsManager#getIGuest <em>IGuest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IGuest</em>'.
	 * @see Classes.Bookings.BookingsManager#getIGuest()
	 * @see #getBookingsManager()
	 * @generated
	 */
	EReference getBookingsManager_IGuest();

	/**
	 * Returns the meta object for the reference '{@link Classes.Bookings.BookingsManager#getICustomer <em>ICustomer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>ICustomer</em>'.
	 * @see Classes.Bookings.BookingsManager#getICustomer()
	 * @see #getBookingsManager()
	 * @generated
	 */
	EReference getBookingsManager_ICustomer();

	/**
	 * Returns the meta object for the reference '{@link Classes.Bookings.BookingsManager#getIBills <em>IBills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IBills</em>'.
	 * @see Classes.Bookings.BookingsManager#getIBills()
	 * @see #getBookingsManager()
	 * @generated
	 */
	EReference getBookingsManager_IBills();

	/**
	 * Returns the meta object for class '{@link Classes.Bookings.IBookings <em>IBookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBookings</em>'.
	 * @see Classes.Bookings.IBookings
	 * @generated
	 */
	EClass getIBookings();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#makeBooking(org.eclipse.emf.common.util.EList, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Make Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Booking</em>' operation.
	 * @see Classes.Bookings.IBookings#makeBooking(org.eclipse.emf.common.util.EList, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBookings__MakeBooking__EList_String_EList_EList_String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#searchBookings(java.lang.String) <em>Search Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Bookings</em>' operation.
	 * @see Classes.Bookings.IBookings#searchBookings(java.lang.String)
	 * @generated
	 */
	EOperation getIBookings__SearchBookings__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#getBookedStaysOfBooking(java.lang.String) <em>Get Booked Stays Of Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booked Stays Of Booking</em>' operation.
	 * @see Classes.Bookings.IBookings#getBookedStaysOfBooking(java.lang.String)
	 * @generated
	 */
	EOperation getIBookings__GetBookedStaysOfBooking__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#getCustomerOfBooking(java.lang.String) <em>Get Customer Of Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer Of Booking</em>' operation.
	 * @see Classes.Bookings.IBookings#getCustomerOfBooking(java.lang.String)
	 * @generated
	 */
	EOperation getIBookings__GetCustomerOfBooking__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#getNbrGuestOfBooking(java.lang.String) <em>Get Nbr Guest Of Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nbr Guest Of Booking</em>' operation.
	 * @see Classes.Bookings.IBookings#getNbrGuestOfBooking(java.lang.String)
	 * @generated
	 */
	EOperation getIBookings__GetNbrGuestOfBooking__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#cancelBooking(java.lang.String) <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking</em>' operation.
	 * @see Classes.Bookings.IBookings#cancelBooking(java.lang.String)
	 * @generated
	 */
	EOperation getIBookings__CancelBooking__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#cancelStayOfBooking(java.lang.String, java.lang.String) <em>Cancel Stay Of Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Stay Of Booking</em>' operation.
	 * @see Classes.Bookings.IBookings#cancelStayOfBooking(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBookings__CancelStayOfBooking__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#addBookedStayToBooking(java.lang.String, java.lang.String) <em>Add Booked Stay To Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Booked Stay To Booking</em>' operation.
	 * @see Classes.Bookings.IBookings#addBookedStayToBooking(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBookings__AddBookedStayToBooking__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#changeNbrGuestsOfBooking(java.lang.String, int) <em>Change Nbr Guests Of Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Nbr Guests Of Booking</em>' operation.
	 * @see Classes.Bookings.IBookings#changeNbrGuestsOfBooking(java.lang.String, int)
	 * @generated
	 */
	EOperation getIBookings__ChangeNbrGuestsOfBooking__String_int();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#getAllBookings() <em>Get All Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Bookings</em>' operation.
	 * @see Classes.Bookings.IBookings#getAllBookings()
	 * @generated
	 */
	EOperation getIBookings__GetAllBookings();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#getAllBookingsWithinPeriod(java.util.Date, java.util.Date) <em>Get All Bookings Within Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Bookings Within Period</em>' operation.
	 * @see Classes.Bookings.IBookings#getAllBookingsWithinPeriod(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIBookings__GetAllBookingsWithinPeriod__Date_Date();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#getAllBookingsWithStaysInPeriod(java.util.Date, java.util.Date) <em>Get All Bookings With Stays In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Bookings With Stays In Period</em>' operation.
	 * @see Classes.Bookings.IBookings#getAllBookingsWithStaysInPeriod(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIBookings__GetAllBookingsWithStaysInPeriod__Date_Date();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#searchBookingsMadeInPeriod(java.lang.String, java.util.Date, java.util.Date) <em>Search Bookings Made In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Bookings Made In Period</em>' operation.
	 * @see Classes.Bookings.IBookings#searchBookingsMadeInPeriod(java.lang.String, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIBookings__SearchBookingsMadeInPeriod__String_Date_Date();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#searchBookingsWithStaysInPeriod(java.lang.String, java.util.Date, java.util.Date) <em>Search Bookings With Stays In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Bookings With Stays In Period</em>' operation.
	 * @see Classes.Bookings.IBookings#searchBookingsWithStaysInPeriod(java.lang.String, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIBookings__SearchBookingsWithStaysInPeriod__String_Date_Date();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#searchForAvailableBookablesInPeriod(java.util.Date, java.util.Date, java.lang.String) <em>Search For Available Bookables In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search For Available Bookables In Period</em>' operation.
	 * @see Classes.Bookings.IBookings#searchForAvailableBookablesInPeriod(java.util.Date, java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getIBookings__SearchForAvailableBookablesInPeriod__Date_Date_String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#getAvailableBookablesInPeriod(java.util.Date, java.util.Date) <em>Get Available Bookables In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Bookables In Period</em>' operation.
	 * @see Classes.Bookings.IBookings#getAvailableBookablesInPeriod(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIBookings__GetAvailableBookablesInPeriod__Date_Date();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#addBookingRequest(java.lang.String, java.lang.String) <em>Add Booking Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Booking Request</em>' operation.
	 * @see Classes.Bookings.IBookings#addBookingRequest(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBookings__AddBookingRequest__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#removeBookingRequest(java.lang.String, java.lang.String) <em>Remove Booking Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Booking Request</em>' operation.
	 * @see Classes.Bookings.IBookings#removeBookingRequest(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBookings__RemoveBookingRequest__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#getBookingRequests(java.lang.String) <em>Get Booking Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking Requests</em>' operation.
	 * @see Classes.Bookings.IBookings#getBookingRequests(java.lang.String)
	 * @generated
	 */
	EOperation getIBookings__GetBookingRequests__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#payBookingBills(java.lang.String) <em>Pay Booking Bills</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay Booking Bills</em>' operation.
	 * @see Classes.Bookings.IBookings#payBookingBills(java.lang.String)
	 * @generated
	 */
	EOperation getIBookings__PayBookingBills__String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#payStayBills(java.lang.String, java.lang.String) <em>Pay Stay Bills</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay Stay Bills</em>' operation.
	 * @see Classes.Bookings.IBookings#payStayBills(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIBookings__PayStayBills__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#searchForAvailableHotelRoomsInPeriod(java.util.Date, java.util.Date, java.lang.String) <em>Search For Available Hotel Rooms In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search For Available Hotel Rooms In Period</em>' operation.
	 * @see Classes.Bookings.IBookings#searchForAvailableHotelRoomsInPeriod(java.util.Date, java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getIBookings__SearchForAvailableHotelRoomsInPeriod__Date_Date_String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#searchForAvailableHostelBedsInPeriod(java.util.Date, java.util.Date, java.lang.String) <em>Search For Available Hostel Beds In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search For Available Hostel Beds In Period</em>' operation.
	 * @see Classes.Bookings.IBookings#searchForAvailableHostelBedsInPeriod(java.util.Date, java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getIBookings__SearchForAvailableHostelBedsInPeriod__Date_Date_String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#searchForAvailableConferenceRoomsInPeriod(java.util.Date, java.util.Date, java.lang.String) <em>Search For Available Conference Rooms In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search For Available Conference Rooms In Period</em>' operation.
	 * @see Classes.Bookings.IBookings#searchForAvailableConferenceRoomsInPeriod(java.util.Date, java.util.Date, java.lang.String)
	 * @generated
	 */
	EOperation getIBookings__SearchForAvailableConferenceRoomsInPeriod__Date_Date_String();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#getAvailableHotelRoomsInPeriod(java.util.Date, java.util.Date) <em>Get Available Hotel Rooms In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Hotel Rooms In Period</em>' operation.
	 * @see Classes.Bookings.IBookings#getAvailableHotelRoomsInPeriod(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIBookings__GetAvailableHotelRoomsInPeriod__Date_Date();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#getAvailableConferenceRoomsInPeriod(java.util.Date, java.util.Date) <em>Get Available Conference Rooms In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Conference Rooms In Period</em>' operation.
	 * @see Classes.Bookings.IBookings#getAvailableConferenceRoomsInPeriod(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIBookings__GetAvailableConferenceRoomsInPeriod__Date_Date();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#getAvailableHostelBedsInPeriod(java.util.Date, java.util.Date) <em>Get Available Hostel Beds In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Hostel Beds In Period</em>' operation.
	 * @see Classes.Bookings.IBookings#getAvailableHostelBedsInPeriod(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIBookings__GetAvailableHostelBedsInPeriod__Date_Date();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BookingsFactory getBookingsFactory();

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
		 * The meta object literal for the '{@link Classes.Bookings.impl.BookingImpl <em>Booking</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Bookings.impl.BookingImpl
		 * @see Classes.Bookings.impl.BookingsPackageImpl#getBooking()
		 * @generated
		 */
		EClass BOOKING = eINSTANCE.getBooking();

		/**
		 * The meta object literal for the '<em><b>Booked Stays</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKED_STAYS = eINSTANCE.getBooking_BookedStays();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__CUSTOMER = eINSTANCE.getBooking_Customer();

		/**
		 * The meta object literal for the '<em><b>Booking Nbr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__BOOKING_NBR = eINSTANCE.getBooking_BookingNbr();

		/**
		 * The meta object literal for the '<em><b>Nbr Guests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__NBR_GUESTS = eINSTANCE.getBooking_NbrGuests();

		/**
		 * The meta object literal for the '<em><b>Issue Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__ISSUE_DATE = eINSTANCE.getBooking_IssueDate();

		/**
		 * The meta object literal for the '<em><b>Credit Card</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKING__CREDIT_CARD = eINSTANCE.getBooking_CreditCard();

		/**
		 * The meta object literal for the '<em><b>Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOKING__REQUESTS = eINSTANCE.getBooking_Requests();

		/**
		 * The meta object literal for the '<em><b>Add Booked Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___ADD_BOOKED_STAY = eINSTANCE.getBooking__AddBookedStay();

		/**
		 * The meta object literal for the '<em><b>Cancel Booked Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___CANCEL_BOOKED_STAY = eINSTANCE.getBooking__CancelBookedStay();

		/**
		 * The meta object literal for the '{@link Classes.Bookings.impl.BookingsManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Bookings.impl.BookingsManagerImpl
		 * @see Classes.Bookings.impl.BookingsPackageImpl#getBookingsManager()
		 * @generated
		 */
		EClass BOOKINGS_MANAGER = eINSTANCE.getBookingsManager();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKINGS_MANAGER__BOOKING = eINSTANCE.getBookingsManager_Booking();

		/**
		 * The meta object literal for the '<em><b>IBookable Access</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKINGS_MANAGER__IBOOKABLE_ACCESS = eINSTANCE.getBookingsManager_IBookableAccess();

		/**
		 * The meta object literal for the '<em><b>IHotel Stay Manager</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKINGS_MANAGER__IHOTEL_STAY_MANAGER = eINSTANCE.getBookingsManager_IHotelStayManager();

		/**
		 * The meta object literal for the '<em><b>Bank</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKINGS_MANAGER__BANK = eINSTANCE.getBookingsManager_Bank();

		/**
		 * The meta object literal for the '<em><b>IGuest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKINGS_MANAGER__IGUEST = eINSTANCE.getBookingsManager_IGuest();

		/**
		 * The meta object literal for the '<em><b>ICustomer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKINGS_MANAGER__ICUSTOMER = eINSTANCE.getBookingsManager_ICustomer();

		/**
		 * The meta object literal for the '<em><b>IBills</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOKINGS_MANAGER__IBILLS = eINSTANCE.getBookingsManager_IBills();

		/**
		 * The meta object literal for the '{@link Classes.Bookings.IBookings <em>IBookings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Bookings.IBookings
		 * @see Classes.Bookings.impl.BookingsPackageImpl#getIBookings()
		 * @generated
		 */
		EClass IBOOKINGS = eINSTANCE.getIBookings();

		/**
		 * The meta object literal for the '<em><b>Make Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___MAKE_BOOKING__ELIST_STRING_ELIST_ELIST_STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getIBookings__MakeBooking__EList_String_EList_EList_String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Search Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___SEARCH_BOOKINGS__STRING = eINSTANCE.getIBookings__SearchBookings__String();

		/**
		 * The meta object literal for the '<em><b>Get Booked Stays Of Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_BOOKED_STAYS_OF_BOOKING__STRING = eINSTANCE.getIBookings__GetBookedStaysOfBooking__String();

		/**
		 * The meta object literal for the '<em><b>Get Customer Of Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_CUSTOMER_OF_BOOKING__STRING = eINSTANCE.getIBookings__GetCustomerOfBooking__String();

		/**
		 * The meta object literal for the '<em><b>Get Nbr Guest Of Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_NBR_GUEST_OF_BOOKING__STRING = eINSTANCE.getIBookings__GetNbrGuestOfBooking__String();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___CANCEL_BOOKING__STRING = eINSTANCE.getIBookings__CancelBooking__String();

		/**
		 * The meta object literal for the '<em><b>Cancel Stay Of Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___CANCEL_STAY_OF_BOOKING__STRING_STRING = eINSTANCE.getIBookings__CancelStayOfBooking__String_String();

		/**
		 * The meta object literal for the '<em><b>Add Booked Stay To Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___ADD_BOOKED_STAY_TO_BOOKING__STRING_STRING = eINSTANCE.getIBookings__AddBookedStayToBooking__String_String();

		/**
		 * The meta object literal for the '<em><b>Change Nbr Guests Of Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___CHANGE_NBR_GUESTS_OF_BOOKING__STRING_INT = eINSTANCE.getIBookings__ChangeNbrGuestsOfBooking__String_int();

		/**
		 * The meta object literal for the '<em><b>Get All Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_ALL_BOOKINGS = eINSTANCE.getIBookings__GetAllBookings();

		/**
		 * The meta object literal for the '<em><b>Get All Bookings Within Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_ALL_BOOKINGS_WITHIN_PERIOD__DATE_DATE = eINSTANCE.getIBookings__GetAllBookingsWithinPeriod__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get All Bookings With Stays In Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_ALL_BOOKINGS_WITH_STAYS_IN_PERIOD__DATE_DATE = eINSTANCE.getIBookings__GetAllBookingsWithStaysInPeriod__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Search Bookings Made In Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___SEARCH_BOOKINGS_MADE_IN_PERIOD__STRING_DATE_DATE = eINSTANCE.getIBookings__SearchBookingsMadeInPeriod__String_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Search Bookings With Stays In Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___SEARCH_BOOKINGS_WITH_STAYS_IN_PERIOD__STRING_DATE_DATE = eINSTANCE.getIBookings__SearchBookingsWithStaysInPeriod__String_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Search For Available Bookables In Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___SEARCH_FOR_AVAILABLE_BOOKABLES_IN_PERIOD__DATE_DATE_STRING = eINSTANCE.getIBookings__SearchForAvailableBookablesInPeriod__Date_Date_String();

		/**
		 * The meta object literal for the '<em><b>Get Available Bookables In Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_AVAILABLE_BOOKABLES_IN_PERIOD__DATE_DATE = eINSTANCE.getIBookings__GetAvailableBookablesInPeriod__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Add Booking Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___ADD_BOOKING_REQUEST__STRING_STRING = eINSTANCE.getIBookings__AddBookingRequest__String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Booking Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___REMOVE_BOOKING_REQUEST__STRING_STRING = eINSTANCE.getIBookings__RemoveBookingRequest__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Booking Requests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_BOOKING_REQUESTS__STRING = eINSTANCE.getIBookings__GetBookingRequests__String();

		/**
		 * The meta object literal for the '<em><b>Pay Booking Bills</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___PAY_BOOKING_BILLS__STRING = eINSTANCE.getIBookings__PayBookingBills__String();

		/**
		 * The meta object literal for the '<em><b>Pay Stay Bills</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___PAY_STAY_BILLS__STRING_STRING = eINSTANCE.getIBookings__PayStayBills__String_String();

		/**
		 * The meta object literal for the '<em><b>Search For Available Hotel Rooms In Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___SEARCH_FOR_AVAILABLE_HOTEL_ROOMS_IN_PERIOD__DATE_DATE_STRING = eINSTANCE.getIBookings__SearchForAvailableHotelRoomsInPeriod__Date_Date_String();

		/**
		 * The meta object literal for the '<em><b>Search For Available Hostel Beds In Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___SEARCH_FOR_AVAILABLE_HOSTEL_BEDS_IN_PERIOD__DATE_DATE_STRING = eINSTANCE.getIBookings__SearchForAvailableHostelBedsInPeriod__Date_Date_String();

		/**
		 * The meta object literal for the '<em><b>Search For Available Conference Rooms In Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___SEARCH_FOR_AVAILABLE_CONFERENCE_ROOMS_IN_PERIOD__DATE_DATE_STRING = eINSTANCE.getIBookings__SearchForAvailableConferenceRoomsInPeriod__Date_Date_String();

		/**
		 * The meta object literal for the '<em><b>Get Available Hotel Rooms In Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_AVAILABLE_HOTEL_ROOMS_IN_PERIOD__DATE_DATE = eINSTANCE.getIBookings__GetAvailableHotelRoomsInPeriod__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Available Conference Rooms In Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_AVAILABLE_CONFERENCE_ROOMS_IN_PERIOD__DATE_DATE = eINSTANCE.getIBookings__GetAvailableConferenceRoomsInPeriod__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Available Hostel Beds In Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_AVAILABLE_HOSTEL_BEDS_IN_PERIOD__DATE_DATE = eINSTANCE.getIBookings__GetAvailableHostelBedsInPeriod__Date_Date();

	}

} //BookingsPackage
