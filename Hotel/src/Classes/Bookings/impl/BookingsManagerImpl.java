/**
 */
package Classes.Bookings.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.InvalidIDException;
import Classes.StringUtils;
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

	private EMap<String, Booking> bookings;

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
		bookings = new EcoreEMap<String,Booking>(ECoreMapEntriesPackage.Literals.STRING_TO_BOOKING_MAP, StringToBookingMapImpl.class, this, BookingsPackage.BOOKINGS_MANAGER__BOOKING);
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
	 * @generated NOT
	 */
	public List<String> searchBookings(String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		if (bookings.contains(keyword)) {
			searchResult.add(keyword);
		}

		Collection<Booking> c = bookings.values();

		// Some property match exactly. Second Order!
		for (Booking b : c) {
			if (b.getCustomer().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getBookingNbr());
			} else if (iGuest.getGuestFirstName(b.getCustomer()).equalsIgnoreCase(keyword)) {
				searchResult.add(b.getBookingNbr());
			} else if (iGuest.getGuestLastName(b.getCustomer()).equalsIgnoreCase(keyword)) {
				searchResult.add(b.getBookingNbr());
			} else if (iGuest.getGuestEmail(b.getCustomer()).equalsIgnoreCase(keyword)) {
				searchResult.add(b.getBookingNbr());
			} else if (iGuest.getGuestPhone(b.getCustomer()).equalsIgnoreCase(keyword)) {
				searchResult.add(b.getBookingNbr());
			} else if (b.getBookedStays().contains(keyword)) {
				searchResult.add(b.getBookingNbr());
			} else if (keyword.matches(StringUtils.IntOnlyRegex) && Integer.valueOf(keyword) == b.getNbrGuests()) {
				searchResult.add(b.getBookingNbr());
			} else {
				for (String stay : b.getBookedStays()) {
					if (iHotelStayManager.getBookableOfHotelStay(stay).equalsIgnoreCase(keyword)) {
						searchResult.add(b.getBookingNbr());
					}
				}
			}

		}		

		// ID match somewhat. Third Order!
		for (Booking b : c) {			
			if (regexPattern.matcher(b.getBookingNbr()).matches()) {
				searchResult.add(b.getBookingNbr());
			} 
		}

		// Some property match somewhat. Fourth Order.
		for (Booking b : c) {
			if (regexPattern.matcher(b.getCustomer()).matches()) {
				searchResult.add(b.getBookingNbr());
			} else if (regexPattern.matcher(iGuest.getGuestFirstName(b.getCustomer())).matches()){
				searchResult.add(b.getBookingNbr());
			} else if (regexPattern.matcher(iGuest.getGuestLastName(b.getCustomer())).matches()){
				searchResult.add(b.getBookingNbr());
			} else if (regexPattern.matcher(iGuest.getGuestEmail(b.getCustomer())).matches()){
				searchResult.add(b.getBookingNbr());
			} else if (regexPattern.matcher(iGuest.getGuestPhone(b.getCustomer())).matches()){
				searchResult.add(b.getBookingNbr());
			} else {
				for (String stay : b.getBookedStays()) {
					if (regexPattern.matcher(iHotelStayManager.getBookableOfHotelStay(stay)).matches()) {
						searchResult.add(b.getBookingNbr());
					}
				}
			}
		}

		return Collections.unmodifiableList(new ArrayList<String>(searchResult));
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
		if (!bookings.contains(bookingID)) {
			logger.warn("A booking with ID {} does not exist.", bookingID);
			throw new InvalidIDException();
		} else {
			return bookings.get(bookingID).getCustomer();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * get the number of guests of a specific booking
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getNbrGuestOfBooking(String bookingID) {
		if (!bookings.contains(bookingID)) {
			logger.warn("A booking with ID {} does not exist.", bookingID);
			throw new InvalidIDException();
		} else {
			return bookings.get(bookingID).getNbrGuests();
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
		if (!bookings.contains(bookingID)) {
			logger.warn("A booking with ID {} does not exist.", bookingID);
			throw new InvalidIDException();
		} else {
			bookings.get(bookingID).setNbrGuests(nbrGuests);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns a list of all existing bookings
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllBookings() {
		return new ArrayList<String>(bookings.keySet());
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
