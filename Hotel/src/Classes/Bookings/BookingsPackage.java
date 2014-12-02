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
	 * The operation id for the '<em>Get Booking Nbr</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___GET_BOOKING_NBR = 0;

	/**
	 * The operation id for the '<em>Get Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___GET_CUSTOMER = 1;

	/**
	 * The operation id for the '<em>Get Nbr Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___GET_NBR_GUESTS = 2;

	/**
	 * The operation id for the '<em>Get Booked Stays</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___GET_BOOKED_STAYS = 3;

	/**
	 * The operation id for the '<em>Set Nbr Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___SET_NBR_GUESTS = 4;

	/**
	 * The operation id for the '<em>Add Booked Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___ADD_BOOKED_STAY = 5;

	/**
	 * The operation id for the '<em>Cancel Booked Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___CANCEL_BOOKED_STAY = 6;

	/**
	 * The operation id for the '<em>Get Issue Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___GET_ISSUE_DATE = 7;

	/**
	 * The operation id for the '<em>Get Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING___GET_CREDIT_CARD = 8;

	/**
	 * The number of operations of the '<em>Booking</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKING_OPERATION_COUNT = 9;

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
	int IBOOKINGS___MAKE_BOOKING = 0;

	/**
	 * The operation id for the '<em>Search Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___SEARCH_BOOKINGS = 1;

	/**
	 * The operation id for the '<em>Get Booked Stays Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_BOOKED_STAYS_OF_BOOKING = 2;

	/**
	 * The operation id for the '<em>Get Customer Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_CUSTOMER_OF_BOOKING = 3;

	/**
	 * The operation id for the '<em>Get Nbr Guest Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_NBR_GUEST_OF_BOOKING = 4;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___CANCEL_BOOKING = 5;

	/**
	 * The operation id for the '<em>Cancel Stay Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___CANCEL_STAY_OF_BOOKING = 6;

	/**
	 * The operation id for the '<em>Add Booked Stay To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___ADD_BOOKED_STAY_TO_BOOKING = 7;

	/**
	 * The operation id for the '<em>Change Nbr Guests Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___CHANGE_NBR_GUESTS_OF_BOOKING = 8;

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
	int IBOOKINGS___GET_ALL_BOOKINGS_WITHIN_PERIOD = 10;

	/**
	 * The operation id for the '<em>Get All Bookings With Stays In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_ALL_BOOKINGS_WITH_STAYS_IN_PERIOD = 11;

	/**
	 * The operation id for the '<em>Search Bookings Made In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___SEARCH_BOOKINGS_MADE_IN_PERIOD = 12;

	/**
	 * The operation id for the '<em>Search Bookings With Stays In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___SEARCH_BOOKINGS_WITH_STAYS_IN_PERIOD = 13;

	/**
	 * The operation id for the '<em>Search For Available Bookables In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___SEARCH_FOR_AVAILABLE_BOOKABLES_IN_PERIOD__DATE_DATE = 14;

	/**
	 * The operation id for the '<em>Get Available Bookables In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_AVAILABLE_BOOKABLES_IN_PERIOD = 15;

	/**
	 * The operation id for the '<em>Add Booking Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___ADD_BOOKING_REQUEST = 16;

	/**
	 * The operation id for the '<em>Remove Booking Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___REMOVE_BOOKING_REQUEST = 17;

	/**
	 * The operation id for the '<em>Get Booking Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___GET_BOOKING_REQUESTS = 18;

	/**
	 * The operation id for the '<em>Pay Booking Bills</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___PAY_BOOKING_BILLS = 19;

	/**
	 * The operation id for the '<em>Pay Stay Bills</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS___PAY_STAY_BILLS = 20;

	/**
	 * The number of operations of the '<em>IBookings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBOOKINGS_OPERATION_COUNT = 21;

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
	int BOOKINGS_MANAGER___MAKE_BOOKING = IBOOKINGS___MAKE_BOOKING;

	/**
	 * The operation id for the '<em>Search Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___SEARCH_BOOKINGS = IBOOKINGS___SEARCH_BOOKINGS;

	/**
	 * The operation id for the '<em>Get Booked Stays Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___GET_BOOKED_STAYS_OF_BOOKING = IBOOKINGS___GET_BOOKED_STAYS_OF_BOOKING;

	/**
	 * The operation id for the '<em>Get Customer Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___GET_CUSTOMER_OF_BOOKING = IBOOKINGS___GET_CUSTOMER_OF_BOOKING;

	/**
	 * The operation id for the '<em>Get Nbr Guest Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___GET_NBR_GUEST_OF_BOOKING = IBOOKINGS___GET_NBR_GUEST_OF_BOOKING;

	/**
	 * The operation id for the '<em>Cancel Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___CANCEL_BOOKING = IBOOKINGS___CANCEL_BOOKING;

	/**
	 * The operation id for the '<em>Cancel Stay Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___CANCEL_STAY_OF_BOOKING = IBOOKINGS___CANCEL_STAY_OF_BOOKING;

	/**
	 * The operation id for the '<em>Add Booked Stay To Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___ADD_BOOKED_STAY_TO_BOOKING = IBOOKINGS___ADD_BOOKED_STAY_TO_BOOKING;

	/**
	 * The operation id for the '<em>Change Nbr Guests Of Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___CHANGE_NBR_GUESTS_OF_BOOKING = IBOOKINGS___CHANGE_NBR_GUESTS_OF_BOOKING;

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
	int BOOKINGS_MANAGER___GET_ALL_BOOKINGS_WITHIN_PERIOD = IBOOKINGS___GET_ALL_BOOKINGS_WITHIN_PERIOD;

	/**
	 * The operation id for the '<em>Get All Bookings With Stays In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___GET_ALL_BOOKINGS_WITH_STAYS_IN_PERIOD = IBOOKINGS___GET_ALL_BOOKINGS_WITH_STAYS_IN_PERIOD;

	/**
	 * The operation id for the '<em>Search Bookings Made In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___SEARCH_BOOKINGS_MADE_IN_PERIOD = IBOOKINGS___SEARCH_BOOKINGS_MADE_IN_PERIOD;

	/**
	 * The operation id for the '<em>Search Bookings With Stays In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___SEARCH_BOOKINGS_WITH_STAYS_IN_PERIOD = IBOOKINGS___SEARCH_BOOKINGS_WITH_STAYS_IN_PERIOD;

	/**
	 * The operation id for the '<em>Search For Available Bookables In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___SEARCH_FOR_AVAILABLE_BOOKABLES_IN_PERIOD__DATE_DATE = IBOOKINGS___SEARCH_FOR_AVAILABLE_BOOKABLES_IN_PERIOD__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Available Bookables In Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___GET_AVAILABLE_BOOKABLES_IN_PERIOD = IBOOKINGS___GET_AVAILABLE_BOOKABLES_IN_PERIOD;

	/**
	 * The operation id for the '<em>Add Booking Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___ADD_BOOKING_REQUEST = IBOOKINGS___ADD_BOOKING_REQUEST;

	/**
	 * The operation id for the '<em>Remove Booking Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___REMOVE_BOOKING_REQUEST = IBOOKINGS___REMOVE_BOOKING_REQUEST;

	/**
	 * The operation id for the '<em>Get Booking Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___GET_BOOKING_REQUESTS = IBOOKINGS___GET_BOOKING_REQUESTS;

	/**
	 * The operation id for the '<em>Pay Booking Bills</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___PAY_BOOKING_BILLS = IBOOKINGS___PAY_BOOKING_BILLS;

	/**
	 * The operation id for the '<em>Pay Stay Bills</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOKINGS_MANAGER___PAY_STAY_BILLS = IBOOKINGS___PAY_STAY_BILLS;

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
	 * Returns the meta object for the '{@link Classes.Bookings.Booking#getBookingNbr() <em>Get Booking Nbr</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking Nbr</em>' operation.
	 * @see Classes.Bookings.Booking#getBookingNbr()
	 * @generated
	 */
	EOperation getBooking__GetBookingNbr();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.Booking#getCustomer() <em>Get Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer</em>' operation.
	 * @see Classes.Bookings.Booking#getCustomer()
	 * @generated
	 */
	EOperation getBooking__GetCustomer();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.Booking#getNbrGuests() <em>Get Nbr Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nbr Guests</em>' operation.
	 * @see Classes.Bookings.Booking#getNbrGuests()
	 * @generated
	 */
	EOperation getBooking__GetNbrGuests();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.Booking#getBookedStays() <em>Get Booked Stays</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booked Stays</em>' operation.
	 * @see Classes.Bookings.Booking#getBookedStays()
	 * @generated
	 */
	EOperation getBooking__GetBookedStays();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.Booking#setNbrGuests() <em>Set Nbr Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Nbr Guests</em>' operation.
	 * @see Classes.Bookings.Booking#setNbrGuests()
	 * @generated
	 */
	EOperation getBooking__SetNbrGuests();

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
	 * Returns the meta object for the '{@link Classes.Bookings.Booking#getIssueDate() <em>Get Issue Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Issue Date</em>' operation.
	 * @see Classes.Bookings.Booking#getIssueDate()
	 * @generated
	 */
	EOperation getBooking__GetIssueDate();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.Booking#getCreditCard() <em>Get Credit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Credit Card</em>' operation.
	 * @see Classes.Bookings.Booking#getCreditCard()
	 * @generated
	 */
	EOperation getBooking__GetCreditCard();

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
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#makeBooking() <em>Make Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Booking</em>' operation.
	 * @see Classes.Bookings.IBookings#makeBooking()
	 * @generated
	 */
	EOperation getIBookings__MakeBooking();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#searchBookings() <em>Search Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Bookings</em>' operation.
	 * @see Classes.Bookings.IBookings#searchBookings()
	 * @generated
	 */
	EOperation getIBookings__SearchBookings();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#getBookedStaysOfBooking() <em>Get Booked Stays Of Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booked Stays Of Booking</em>' operation.
	 * @see Classes.Bookings.IBookings#getBookedStaysOfBooking()
	 * @generated
	 */
	EOperation getIBookings__GetBookedStaysOfBooking();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#getCustomerOfBooking() <em>Get Customer Of Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer Of Booking</em>' operation.
	 * @see Classes.Bookings.IBookings#getCustomerOfBooking()
	 * @generated
	 */
	EOperation getIBookings__GetCustomerOfBooking();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#getNbrGuestOfBooking() <em>Get Nbr Guest Of Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nbr Guest Of Booking</em>' operation.
	 * @see Classes.Bookings.IBookings#getNbrGuestOfBooking()
	 * @generated
	 */
	EOperation getIBookings__GetNbrGuestOfBooking();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#cancelBooking() <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Booking</em>' operation.
	 * @see Classes.Bookings.IBookings#cancelBooking()
	 * @generated
	 */
	EOperation getIBookings__CancelBooking();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#cancelStayOfBooking() <em>Cancel Stay Of Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Cancel Stay Of Booking</em>' operation.
	 * @see Classes.Bookings.IBookings#cancelStayOfBooking()
	 * @generated
	 */
	EOperation getIBookings__CancelStayOfBooking();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#addBookedStayToBooking() <em>Add Booked Stay To Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Booked Stay To Booking</em>' operation.
	 * @see Classes.Bookings.IBookings#addBookedStayToBooking()
	 * @generated
	 */
	EOperation getIBookings__AddBookedStayToBooking();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#changeNbrGuestsOfBooking() <em>Change Nbr Guests Of Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Nbr Guests Of Booking</em>' operation.
	 * @see Classes.Bookings.IBookings#changeNbrGuestsOfBooking()
	 * @generated
	 */
	EOperation getIBookings__ChangeNbrGuestsOfBooking();

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
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#getAllBookingsWithinPeriod() <em>Get All Bookings Within Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Bookings Within Period</em>' operation.
	 * @see Classes.Bookings.IBookings#getAllBookingsWithinPeriod()
	 * @generated
	 */
	EOperation getIBookings__GetAllBookingsWithinPeriod();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#getAllBookingsWithStaysInPeriod() <em>Get All Bookings With Stays In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Bookings With Stays In Period</em>' operation.
	 * @see Classes.Bookings.IBookings#getAllBookingsWithStaysInPeriod()
	 * @generated
	 */
	EOperation getIBookings__GetAllBookingsWithStaysInPeriod();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#searchBookingsMadeInPeriod() <em>Search Bookings Made In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Bookings Made In Period</em>' operation.
	 * @see Classes.Bookings.IBookings#searchBookingsMadeInPeriod()
	 * @generated
	 */
	EOperation getIBookings__SearchBookingsMadeInPeriod();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#searchBookingsWithStaysInPeriod() <em>Search Bookings With Stays In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Bookings With Stays In Period</em>' operation.
	 * @see Classes.Bookings.IBookings#searchBookingsWithStaysInPeriod()
	 * @generated
	 */
	EOperation getIBookings__SearchBookingsWithStaysInPeriod();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#searchForAvailableBookablesInPeriod(java.util.Date, java.util.Date) <em>Search For Available Bookables In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search For Available Bookables In Period</em>' operation.
	 * @see Classes.Bookings.IBookings#searchForAvailableBookablesInPeriod(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIBookings__SearchForAvailableBookablesInPeriod__Date_Date();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#getAvailableBookablesInPeriod() <em>Get Available Bookables In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Available Bookables In Period</em>' operation.
	 * @see Classes.Bookings.IBookings#getAvailableBookablesInPeriod()
	 * @generated
	 */
	EOperation getIBookings__GetAvailableBookablesInPeriod();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#addBookingRequest() <em>Add Booking Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Booking Request</em>' operation.
	 * @see Classes.Bookings.IBookings#addBookingRequest()
	 * @generated
	 */
	EOperation getIBookings__AddBookingRequest();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#removeBookingRequest() <em>Remove Booking Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Booking Request</em>' operation.
	 * @see Classes.Bookings.IBookings#removeBookingRequest()
	 * @generated
	 */
	EOperation getIBookings__RemoveBookingRequest();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#getBookingRequests() <em>Get Booking Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking Requests</em>' operation.
	 * @see Classes.Bookings.IBookings#getBookingRequests()
	 * @generated
	 */
	EOperation getIBookings__GetBookingRequests();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#payBookingBills() <em>Pay Booking Bills</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay Booking Bills</em>' operation.
	 * @see Classes.Bookings.IBookings#payBookingBills()
	 * @generated
	 */
	EOperation getIBookings__PayBookingBills();

	/**
	 * Returns the meta object for the '{@link Classes.Bookings.IBookings#payStayBills() <em>Pay Stay Bills</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay Stay Bills</em>' operation.
	 * @see Classes.Bookings.IBookings#payStayBills()
	 * @generated
	 */
	EOperation getIBookings__PayStayBills();

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
		 * The meta object literal for the '<em><b>Get Booking Nbr</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___GET_BOOKING_NBR = eINSTANCE.getBooking__GetBookingNbr();

		/**
		 * The meta object literal for the '<em><b>Get Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___GET_CUSTOMER = eINSTANCE.getBooking__GetCustomer();

		/**
		 * The meta object literal for the '<em><b>Get Nbr Guests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___GET_NBR_GUESTS = eINSTANCE.getBooking__GetNbrGuests();

		/**
		 * The meta object literal for the '<em><b>Get Booked Stays</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___GET_BOOKED_STAYS = eINSTANCE.getBooking__GetBookedStays();

		/**
		 * The meta object literal for the '<em><b>Set Nbr Guests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___SET_NBR_GUESTS = eINSTANCE.getBooking__SetNbrGuests();

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
		 * The meta object literal for the '<em><b>Get Issue Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___GET_ISSUE_DATE = eINSTANCE.getBooking__GetIssueDate();

		/**
		 * The meta object literal for the '<em><b>Get Credit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BOOKING___GET_CREDIT_CARD = eINSTANCE.getBooking__GetCreditCard();

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
		EOperation IBOOKINGS___MAKE_BOOKING = eINSTANCE.getIBookings__MakeBooking();

		/**
		 * The meta object literal for the '<em><b>Search Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___SEARCH_BOOKINGS = eINSTANCE.getIBookings__SearchBookings();

		/**
		 * The meta object literal for the '<em><b>Get Booked Stays Of Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_BOOKED_STAYS_OF_BOOKING = eINSTANCE.getIBookings__GetBookedStaysOfBooking();

		/**
		 * The meta object literal for the '<em><b>Get Customer Of Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_CUSTOMER_OF_BOOKING = eINSTANCE.getIBookings__GetCustomerOfBooking();

		/**
		 * The meta object literal for the '<em><b>Get Nbr Guest Of Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_NBR_GUEST_OF_BOOKING = eINSTANCE.getIBookings__GetNbrGuestOfBooking();

		/**
		 * The meta object literal for the '<em><b>Cancel Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___CANCEL_BOOKING = eINSTANCE.getIBookings__CancelBooking();

		/**
		 * The meta object literal for the '<em><b>Cancel Stay Of Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___CANCEL_STAY_OF_BOOKING = eINSTANCE.getIBookings__CancelStayOfBooking();

		/**
		 * The meta object literal for the '<em><b>Add Booked Stay To Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___ADD_BOOKED_STAY_TO_BOOKING = eINSTANCE.getIBookings__AddBookedStayToBooking();

		/**
		 * The meta object literal for the '<em><b>Change Nbr Guests Of Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___CHANGE_NBR_GUESTS_OF_BOOKING = eINSTANCE.getIBookings__ChangeNbrGuestsOfBooking();

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
		EOperation IBOOKINGS___GET_ALL_BOOKINGS_WITHIN_PERIOD = eINSTANCE.getIBookings__GetAllBookingsWithinPeriod();

		/**
		 * The meta object literal for the '<em><b>Get All Bookings With Stays In Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_ALL_BOOKINGS_WITH_STAYS_IN_PERIOD = eINSTANCE.getIBookings__GetAllBookingsWithStaysInPeriod();

		/**
		 * The meta object literal for the '<em><b>Search Bookings Made In Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___SEARCH_BOOKINGS_MADE_IN_PERIOD = eINSTANCE.getIBookings__SearchBookingsMadeInPeriod();

		/**
		 * The meta object literal for the '<em><b>Search Bookings With Stays In Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___SEARCH_BOOKINGS_WITH_STAYS_IN_PERIOD = eINSTANCE.getIBookings__SearchBookingsWithStaysInPeriod();

		/**
		 * The meta object literal for the '<em><b>Search For Available Bookables In Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___SEARCH_FOR_AVAILABLE_BOOKABLES_IN_PERIOD__DATE_DATE = eINSTANCE.getIBookings__SearchForAvailableBookablesInPeriod__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Available Bookables In Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_AVAILABLE_BOOKABLES_IN_PERIOD = eINSTANCE.getIBookings__GetAvailableBookablesInPeriod();

		/**
		 * The meta object literal for the '<em><b>Add Booking Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___ADD_BOOKING_REQUEST = eINSTANCE.getIBookings__AddBookingRequest();

		/**
		 * The meta object literal for the '<em><b>Remove Booking Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___REMOVE_BOOKING_REQUEST = eINSTANCE.getIBookings__RemoveBookingRequest();

		/**
		 * The meta object literal for the '<em><b>Get Booking Requests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___GET_BOOKING_REQUESTS = eINSTANCE.getIBookings__GetBookingRequests();

		/**
		 * The meta object literal for the '<em><b>Pay Booking Bills</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___PAY_BOOKING_BILLS = eINSTANCE.getIBookings__PayBookingBills();

		/**
		 * The meta object literal for the '<em><b>Pay Stay Bills</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBOOKINGS___PAY_STAY_BILLS = eINSTANCE.getIBookings__PayStayBills();

	}

} //BookingsPackage
