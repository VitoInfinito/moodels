/**
 */
package Classes.Bookings.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.InvalidIDException;
import Classes.Banking.CustomerProvides;
import Classes.Bills.IBills;
import Classes.Bookables.IBookablesAccess;
import Classes.Bookings.Booking;
import Classes.Bookings.BookingsManager;
import Classes.Bookings.BookingsPackage;
import Classes.Customers.ICustomers;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToBookingMapImpl;
import Classes.Guests.IGuests;
import Classes.Requests.IRequests;
import Classes.Stays.IStays;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookingsManagerImpl extends MinimalEObjectImpl.Container implements BookingsManager {
	private final Logger logger = LoggerFactory.getLogger(BookingsManagerImpl.class);
	public static BookingsManagerImpl INSTANCE = new BookingsManagerImpl();
	
	private EMap<String, Booking> booking;

	private IBookablesAccess iBookableAccess;
	private IStays iHotelStayManager;
	private CustomerProvides bank;
	private IGuests iGuest;
	private ICustomers iCustomer;
	private IBills iBills;
	private IRequests iRequests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private BookingsManagerImpl() {
		super();
		booking = new EcoreEMap<String,Booking>(ECoreMapEntriesPackage.Literals.STRING_TO_BOOKING_MAP, StringToBookingMapImpl.class, this, BookingsPackage.BOOKINGS_MANAGER__BOOKING);
		iBookableAccess = IBookablesAccess.INSTANCE;
		iHotelStayManager = IStays.INSTANCE;
		iGuest = IGuests.INSTANCE;
		iCustomer = ICustomers.INSTANCE;
		iBills = IBills.INSTANCE;
		iRequests = IRequests.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makeBooking(EList<String> bookables, String customerID, EList<String> guests, EList<String> requests, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchBookings(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBookedStaysOfBooking(String bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Get the customer for a specific booking
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getCustomerOfBooking(String bookingID) {
		if (!booking.contains(bookingID)) {
			logger.warn("A booking with ID {} does not exist.", bookingID);
			throw new InvalidIDException();
		} else {
			return booking.get(bookingID).getCustomer();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * get the number of guests of a specific booking
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getNbrGuestOfBooking(String bookingID) {
		if (!booking.contains(bookingID)) {
			logger.warn("A booking with ID {} does not exist.", bookingID);
			throw new InvalidIDException();
		} else {
			return booking.get(bookingID).getNbrGuests();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelBooking(String bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelStayOfBooking(String bookingID, String stayID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBookedStayToBooking(String bookingID, String stayID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Change the number of guests on a specific booking
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeNbrGuestsOfBooking(String bookingID, int nbrGuests) {
		if (!booking.contains(bookingID)) {
			logger.warn("A booking with ID {} does not exist.", bookingID);
			throw new InvalidIDException();
		} else {
			booking.get(bookingID).setNbrGuests(nbrGuests);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of all existing bookings
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllBookings() {
		return new ArrayList<String>(booking.keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllBookingsWithinPeriod(LocalDateTime from, LocalDateTime to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllBookingsWithStaysInPeriod(LocalDateTime from, LocalDateTime to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchBookingsMadeInPeriod(String keyword, LocalDateTime from, LocalDateTime to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchBookingsWithStaysInPeriod(String keyword, LocalDateTime from, LocalDateTime to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchForAvailableBookablesInPeriod(LocalDateTime from, LocalDateTime to, String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAvailableBookablesInPeriod(LocalDateTime from, LocalDateTime to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBookingRequest(String bookingID, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeBookingRequest(String bookingID, String requestID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getBookingRequests(String bookingID) {
		
		//TODO Check whether or not there could be multiple requests, change method in booking
		
		//return new ArrayList<String>(booking.get(bookingID).getRequests());
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void payBookingBills(String bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void payStayBills(String bookingID, String stayID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchForAvailableHotelRoomsInPeriod(LocalDateTime from, LocalDateTime to, String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchForAvailableHostelBedsInPeriod(LocalDateTime from, LocalDateTime to, String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchForAvailableConferenceRoomsInPeriod(LocalDateTime from, LocalDateTime to, String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAvailableHotelRoomsInPeriod(LocalDateTime from, LocalDateTime to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAvailableConferenceRoomsInPeriod(LocalDateTime from, LocalDateTime to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAvailableHostelBedsInPeriod(LocalDateTime from, LocalDateTime to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

} //BookingsManagerImpl
