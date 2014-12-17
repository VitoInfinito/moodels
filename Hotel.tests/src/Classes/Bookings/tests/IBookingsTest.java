/**
 */
package Classes.Bookings.tests;

import Classes.Bookings.IBookings;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>IBookings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link Classes.Bookings.IBookings#makeBooking(org.eclipse.emf.common.util.EList, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Make Booking</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#searchBookings(java.lang.String) <em>Search Bookings</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#getBookedStaysOfBooking(java.lang.String) <em>Get Booked Stays Of Booking</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#getCustomerOfBooking(java.lang.String) <em>Get Customer Of Booking</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#getNbrGuestOfBooking(java.lang.String) <em>Get Nbr Guest Of Booking</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#cancelBooking(java.lang.String) <em>Cancel Booking</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#cancelStayOfBooking(java.lang.String, java.lang.String) <em>Cancel Stay Of Booking</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#addBookedStayToBooking(java.lang.String, java.lang.String) <em>Add Booked Stay To Booking</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#changeNbrGuestsOfBooking(java.lang.String, int) <em>Change Nbr Guests Of Booking</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#getAllBookings() <em>Get All Bookings</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#getAllBookingsWithinPeriod(java.util.Date, java.util.Date) <em>Get All Bookings Within Period</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#getAllBookingsWithStaysInPeriod(java.util.Date, java.util.Date) <em>Get All Bookings With Stays In Period</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#searchBookingsMadeInPeriod(java.lang.String, java.util.Date, java.util.Date) <em>Search Bookings Made In Period</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#searchBookingsWithStaysInPeriod(java.lang.String, java.util.Date, java.util.Date) <em>Search Bookings With Stays In Period</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#searchForAvailableBookablesInPeriod(java.util.Date, java.util.Date, java.lang.String) <em>Search For Available Bookables In Period</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#getAvailableBookablesInPeriod(java.util.Date, java.util.Date) <em>Get Available Bookables In Period</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#addBookingRequest(java.lang.String, java.lang.String) <em>Add Booking Request</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#removeBookingRequest(java.lang.String, java.lang.String) <em>Remove Booking Request</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#getBookingRequests(java.lang.String) <em>Get Booking Requests</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#payBookingBills(java.lang.String) <em>Pay Booking Bills</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#payStayBills(java.lang.String, java.lang.String) <em>Pay Stay Bills</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#searchForAvailableHotelRoomsInPeriod(java.util.Date, java.util.Date, java.lang.String) <em>Search For Available Hotel Rooms In Period</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#searchForAvailableHostelBedsInPeriod(java.util.Date, java.util.Date, java.lang.String) <em>Search For Available Hostel Beds In Period</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#searchForAvailableConferenceRoomsInPeriod(java.util.Date, java.util.Date, java.lang.String) <em>Search For Available Conference Rooms In Period</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#getAvailableHotelRoomsInPeriod(java.util.Date, java.util.Date) <em>Get Available Hotel Rooms In Period</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#getAvailableConferenceRoomsInPeriod(java.util.Date, java.util.Date) <em>Get Available Conference Rooms In Period</em>}</li>
 *   <li>{@link Classes.Bookings.IBookings#getAvailableHostelBedsInPeriod(java.util.Date, java.util.Date) <em>Get Available Hostel Beds In Period</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class IBookingsTest extends TestCase {

	/**
	 * The fixture for this IBookings test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IBookings fixture = null;

	/**
	 * Constructs a new IBookings test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBookingsTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this IBookings test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IBookings fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this IBookings test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IBookings getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#makeBooking(org.eclipse.emf.common.util.EList, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Make Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#makeBooking(org.eclipse.emf.common.util.EList, java.lang.String, org.eclipse.emf.common.util.EList, org.eclipse.emf.common.util.EList, java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testMakeBooking__EList_String_EList_EList_String_String_int_int_String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#searchBookings(java.lang.String) <em>Search Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#searchBookings(java.lang.String)
	 * @generated
	 */
	public void testSearchBookings__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#getBookedStaysOfBooking(java.lang.String) <em>Get Booked Stays Of Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#getBookedStaysOfBooking(java.lang.String)
	 * @generated
	 */
	public void testGetBookedStaysOfBooking__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#getCustomerOfBooking(java.lang.String) <em>Get Customer Of Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#getCustomerOfBooking(java.lang.String)
	 * @generated
	 */
	public void testGetCustomerOfBooking__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#getNbrGuestOfBooking(java.lang.String) <em>Get Nbr Guest Of Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#getNbrGuestOfBooking(java.lang.String)
	 * @generated
	 */
	public void testGetNbrGuestOfBooking__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#cancelBooking(java.lang.String) <em>Cancel Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#cancelBooking(java.lang.String)
	 * @generated
	 */
	public void testCancelBooking__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#cancelStayOfBooking(java.lang.String, java.lang.String) <em>Cancel Stay Of Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#cancelStayOfBooking(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testCancelStayOfBooking__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#addBookedStayToBooking(java.lang.String, java.lang.String) <em>Add Booked Stay To Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#addBookedStayToBooking(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testAddBookedStayToBooking__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#changeNbrGuestsOfBooking(java.lang.String, int) <em>Change Nbr Guests Of Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#changeNbrGuestsOfBooking(java.lang.String, int)
	 * @generated
	 */
	public void testChangeNbrGuestsOfBooking__String_int() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#getAllBookings() <em>Get All Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#getAllBookings()
	 * @generated
	 */
	public void testGetAllBookings() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#getAllBookingsWithinPeriod(java.util.Date, java.util.Date) <em>Get All Bookings Within Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#getAllBookingsWithinPeriod(java.util.Date, java.util.Date)
	 * @generated
	 */
	public void testGetAllBookingsWithinPeriod__Date_Date() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#getAllBookingsWithStaysInPeriod(java.util.Date, java.util.Date) <em>Get All Bookings With Stays In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#getAllBookingsWithStaysInPeriod(java.util.Date, java.util.Date)
	 * @generated
	 */
	public void testGetAllBookingsWithStaysInPeriod__Date_Date() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#searchBookingsMadeInPeriod(java.lang.String, java.util.Date, java.util.Date) <em>Search Bookings Made In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#searchBookingsMadeInPeriod(java.lang.String, java.util.Date, java.util.Date)
	 * @generated
	 */
	public void testSearchBookingsMadeInPeriod__String_Date_Date() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#searchBookingsWithStaysInPeriod(java.lang.String, java.util.Date, java.util.Date) <em>Search Bookings With Stays In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#searchBookingsWithStaysInPeriod(java.lang.String, java.util.Date, java.util.Date)
	 * @generated
	 */
	public void testSearchBookingsWithStaysInPeriod__String_Date_Date() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#searchForAvailableBookablesInPeriod(java.util.Date, java.util.Date, java.lang.String) <em>Search For Available Bookables In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#searchForAvailableBookablesInPeriod(java.util.Date, java.util.Date, java.lang.String)
	 * @generated
	 */
	public void testSearchForAvailableBookablesInPeriod__Date_Date_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#getAvailableBookablesInPeriod(java.util.Date, java.util.Date) <em>Get Available Bookables In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#getAvailableBookablesInPeriod(java.util.Date, java.util.Date)
	 * @generated
	 */
	public void testGetAvailableBookablesInPeriod__Date_Date() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#addBookingRequest(java.lang.String, java.lang.String) <em>Add Booking Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#addBookingRequest(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testAddBookingRequest__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#removeBookingRequest(java.lang.String, java.lang.String) <em>Remove Booking Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#removeBookingRequest(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testRemoveBookingRequest__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#getBookingRequests(java.lang.String) <em>Get Booking Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#getBookingRequests(java.lang.String)
	 * @generated
	 */
	public void testGetBookingRequests__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#payBookingBills(java.lang.String) <em>Pay Booking Bills</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#payBookingBills(java.lang.String)
	 * @generated
	 */
	public void testPayBookingBills__String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#payStayBills(java.lang.String, java.lang.String) <em>Pay Stay Bills</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#payStayBills(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testPayStayBills__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#searchForAvailableHotelRoomsInPeriod(java.util.Date, java.util.Date, java.lang.String) <em>Search For Available Hotel Rooms In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#searchForAvailableHotelRoomsInPeriod(java.util.Date, java.util.Date, java.lang.String)
	 * @generated
	 */
	public void testSearchForAvailableHotelRoomsInPeriod__Date_Date_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#searchForAvailableHostelBedsInPeriod(java.util.Date, java.util.Date, java.lang.String) <em>Search For Available Hostel Beds In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#searchForAvailableHostelBedsInPeriod(java.util.Date, java.util.Date, java.lang.String)
	 * @generated
	 */
	public void testSearchForAvailableHostelBedsInPeriod__Date_Date_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#searchForAvailableConferenceRoomsInPeriod(java.util.Date, java.util.Date, java.lang.String) <em>Search For Available Conference Rooms In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#searchForAvailableConferenceRoomsInPeriod(java.util.Date, java.util.Date, java.lang.String)
	 * @generated
	 */
	public void testSearchForAvailableConferenceRoomsInPeriod__Date_Date_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#getAvailableHotelRoomsInPeriod(java.util.Date, java.util.Date) <em>Get Available Hotel Rooms In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#getAvailableHotelRoomsInPeriod(java.util.Date, java.util.Date)
	 * @generated
	 */
	public void testGetAvailableHotelRoomsInPeriod__Date_Date() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#getAvailableConferenceRoomsInPeriod(java.util.Date, java.util.Date) <em>Get Available Conference Rooms In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#getAvailableConferenceRoomsInPeriod(java.util.Date, java.util.Date)
	 * @generated
	 */
	public void testGetAvailableConferenceRoomsInPeriod__Date_Date() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link Classes.Bookings.IBookings#getAvailableHostelBedsInPeriod(java.util.Date, java.util.Date) <em>Get Available Hostel Beds In Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bookings.IBookings#getAvailableHostelBedsInPeriod(java.util.Date, java.util.Date)
	 * @generated
	 */
	public void testGetAvailableHostelBedsInPeriod__Date_Date() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //IBookingsTest
