/**
 */
package Classes.Bookings.impl;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;
import Classes.InsufficientFundsException;
import Classes.InvalidCreditCardException;
import Classes.InvalidIDException;
import Classes.StringUtils;
import Classes.Bills.IBills;
import Classes.Bookables.ConferenceRoomCategory;
import Classes.Bookables.HotelRoomCategory;
import Classes.Bookables.IBookablesAccess;
import Classes.Bookings.Booking;
import Classes.Bookings.BookingsFactory;
import Classes.Bookings.BookingsManager;
import Classes.Bookings.BookingsPackage;
import Classes.Customers.ICustomers;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToBookingMapImpl;
import Classes.Guests.IGuests;
import Classes.Requests.IRequests;
import Classes.Stays.CreditCard;
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
	private IGuests iGuest;
	private ICustomers iCustomer;
	private IBills iBills;
	private IRequests iRequests;

	private static int IDCounter = 1;

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
	 * @return 
	 * @throws SOAPException 
	 * @generated NOT
	 */
	public String makeBooking(List<String> bookables, String customerID, LocalDateTime from, LocalDateTime to, int nbrGuests, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, double discount) throws SOAPException, InvalidIDException, IllegalArgumentException {
		if (bookables.isEmpty()) {
			logger.warn("Tried to make a booking when no bookable IDs were provided.");
			throw new InvalidIDException();
		} else if (nbrGuests < 1) {
			logger.warn("Tried to make a booking with {} nbr of guests. 0 or less is not a valid nbr of guests!", nbrGuests);
			throw new IllegalArgumentException();
		} else if (discount < 0 || discount > 1) {
			logger.warn("The discount {} is not in [0,1].", discount);
			throw new IllegalArgumentException("Discount should be in [0,1]!");
		} else if (from.isAfter(to)) {
			logger.warn("Tried to make a booking when the from date: {} is after the to date: {}!", from, to);
			throw new IllegalArgumentException();
		} else if (!CustomerRequires.instance().isCreditCardValid(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName)) {
			logger.warn("Tried to make a booking with an invalid credit card!");
			throw new InvalidCreditCardException();
		} else if (!getAvailableBookablesInPeriod(from, to).containsAll(bookables)) {
			logger.warn("Tried to make a booking when one or more of the bookables is already booked in the specified period!");
			throw new InvalidIDException();
		}

		Booking booking = BookingsFactory.eINSTANCE.createBooking();

		String bookingNbr = generateBookingNbr();

		booking.setBookingNbr(bookingNbr);

		for (String bookableID : bookables) {
			String stayID = iHotelStayManager.addNewStay(bookableID, bookingNbr, from, to);
			booking.addBookedStay(stayID);
			iHotelStayManager.addBillToStay(stayID, iBills.addBill(new ArrayList<String>(), new ArrayList<String>(), bookableID, from, to, discount));
		}

		iCustomer.addCustomerBooking(customerID, bookingNbr);

		bookings.put(bookingNbr, booking);

		return bookingNbr;
	}

	private String generateBookingNbr() {
		return String.format("bk%06d", IDCounter++);
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

		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getBookedStaysOfBooking(String bookingID) {
		if (bookings.containsKey(bookingID)) {
			return new ArrayList<String>(bookings.get(bookingID).getBookedStays());
		} else {
			logger.warn("A booking with bookingID {} could not be found.", bookingID);
			throw new InvalidIDException();
		}
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
		if (!bookings.containsKey(bookingID)) {
			logger.warn("A booking with bookingID {} could not be found.", bookingID);
			throw new InvalidIDException();
		} 
		
		Booking booking = bookings.get(bookingID);
		List<String> stays = booking.getBookedStays();
		for (String stay : stays) {
			if (!iHotelStayManager.getCheckedInGuestsOfHotelStay(stay).isEmpty()) {
				logger.warn("There are checked in guests of the booking, hence cancellation of the booking is prohibited!");
				throw new InvalidIDException();
			} else if (!iHotelStayManager.getCheckedOutGuestsOfHotelStay(stay).isEmpty()) {
				logger.warn("The booking has already taken place, hence cancellation of the booking is prohibited!");
				throw new InvalidIDException();
			}
		}
		
		for (String stay : stays) {
			booking.cancelBookedStay(stay);
			iHotelStayManager.removeStay(stay);
		}
		
		bookings.removeKey(bookingID);
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
	 * @generated NOT
	 */
	public void addBookedStayToBooking(String bookingID, String bookableID, LocalDateTime from, LocalDateTime to, double discount) {
		if (!bookings.containsKey(bookingID)) {
			logger.warn("A booking with bookingID {} could not be found.", bookingID);
			throw new InvalidIDException();
		} else if (discount < 0 || discount > 1) {
			logger.warn("The discount {} is not in [0,1].", discount);
			throw new IllegalArgumentException("Discount should be in [0,1]!");
		} else if (from.isAfter(to)) {
			logger.warn("Tried to add a new stay to an existing booking when the from date: {} is after the to date: {}!", from, to);
			throw new IllegalArgumentException();
		} else if (!getAvailableBookablesInPeriod(from, to).contains(bookableID)) {
			logger.warn("Tried to add a new stay to an existing booking when the supplies bookables is already booked in the specified period!");
			throw new InvalidIDException();
		}

		String stayID = iHotelStayManager.addNewStay(bookableID, bookingID, from, to);
		bookings.get(bookingID).addBookedStay(stayID);
		iHotelStayManager.addBillToStay(stayID, iBills.addBill(new ArrayList<String>(), new ArrayList<String>(), bookableID, from, to, discount));
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
	 * @generated NOT
	 */
	public List<String> getAllBookingsWithinPeriod(LocalDateTime from, LocalDateTime to) {
		List<String> result = new ArrayList<String>();
		for (Booking b : bookings.values()) {
			if (b.getIssueDate().isAfter(from) && b.getIssueDate().isBefore(to)) {
				result.add(b.getBookingNbr());
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllBookingsWithStaysInPeriod(LocalDateTime from, LocalDateTime to) {
		List<String> stays = iHotelStayManager.getAllHotelStaysWithinPeriod(from, to);

		Set<String> result = new LinkedHashSet<String>();
		for (Booking b : bookings.values()) {
			for (String stayID : b.getBookedStays()) {
				if (stays.contains(stayID)) {
					result.add(b.getBookingNbr());
				}
			}
		}

		return new ArrayList<String>(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> searchBookingsMadeInPeriod(String keyword, LocalDateTime from, LocalDateTime to) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		if (bookings.contains(keyword)) {
			LocalDateTime date = bookings.get(keyword).getIssueDate();
			if (date.isAfter(from) && date.isBefore(to)) {
				searchResult.add(keyword);
			}
		}

		Collection<Booking> c = bookings.values();

		// Some property match exactly. Second Order!
		for (Booking b : c) {
			LocalDateTime date = bookings.get(keyword).getIssueDate();
			if (date.isAfter(from) && date.isBefore(to)) {
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
		}		

		// ID match somewhat. Third Order!
		for (Booking b : c) {	
			LocalDateTime date = bookings.get(keyword).getIssueDate();
			if (date.isAfter(from) && date.isBefore(to)) {
				if (regexPattern.matcher(b.getBookingNbr()).matches()) {
					searchResult.add(b.getBookingNbr());
				} 
			}
		}

		// Some property match somewhat. Fourth Order.
		for (Booking b : c) {
			LocalDateTime date = bookings.get(keyword).getIssueDate();
			if (date.isAfter(from) && date.isBefore(to)) {
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
		}

		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> searchBookingsWithStaysInPeriod(String keyword, LocalDateTime from, LocalDateTime to) {
		List<String> result = searchBookings(keyword);
		List<String> copy = new ArrayList<String>(result);
		List<String> staysInPeriod = iHotelStayManager.getAllHotelStaysWithinPeriod(from, to);
		for (String bookingID : copy) {
			List<String> staysInPeriodCopy = new ArrayList<String>(staysInPeriod);
			staysInPeriodCopy.removeAll(bookings.get(bookingID).getBookedStays());
			if (staysInPeriodCopy.size() == staysInPeriod.size()) {
				result.remove(bookingID);
			}
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> searchForAvailableBookablesInPeriod(LocalDateTime from, LocalDateTime to, String keyword) {
		List<String> result = iBookableAccess.searchForBookable(keyword);
		List<String> staysInPeriod = iHotelStayManager.getAllHotelStaysWithinPeriod(from, to);
		for (String stayID : staysInPeriod) {
			result.remove(iHotelStayManager.getBookableOfHotelStay(stayID));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getAvailableBookablesInPeriod(LocalDateTime from, LocalDateTime to) {
		List<String> result = iBookableAccess.getAllBookableIDs();
		List<String> staysInPeriod = iHotelStayManager.getAllHotelStaysWithinPeriod(from, to);
		for (String stayID : staysInPeriod) {
			result.remove(iHotelStayManager.getBookableOfHotelStay(stayID));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBookingRequest(String bookingID, String description) {
		if (bookings.containsKey(bookingID)) {
			bookings.get(bookingID).addRequest(iRequests.addRequest(description));
		} else {
			logger.warn("A booking with bookingID {} could not be found.", bookingID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeBookingRequest(String bookingID, String requestID) {
		if (bookings.containsKey(bookingID)) {
			bookings.get(bookingID).removeRequest(requestID);
		} else {
			logger.warn("A booking with bookingID {} could not be found.", bookingID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getBookingRequests(String bookingID) {
		return new ArrayList<String>(bookings.get(bookingID).getRequests());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws SOAPException, InvalidCreditCardException, InsufficientFundsException
	 * @generated NOT
	 */
	public void payBookingBills(String bookingID) throws SOAPException, InvalidCreditCardException, InsufficientFundsException {
		if (bookings.containsKey(bookingID)) {
			List<String> bills = new ArrayList<String>();
			Booking booking = bookings.get(bookingID);
			CreditCard card = booking.getCreditCard();
			for (String stayID : booking.getBookedStays()) {
				bills.addAll(iHotelStayManager.getAllUnpayedBillsOfHotelStay(stayID));
			}
			iBills.payBillsWithCreditCard(bills, card.getCcNumber(), card.getCcv(), card.getExpiryMonth(), card.getExpiryYear(), card.getFirstName(), card.getLastName());
		} else {
			logger.warn("A booking with bookingID {} could not be found.", bookingID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws SOAPException, InvalidCreditCardException, InsufficientFundsException
	 * @generated NOT
	 */
	public void payStayBills(String bookingID, String stayID) throws SOAPException, InvalidCreditCardException, InsufficientFundsException {
		if (bookings.containsKey(bookingID)) {
			Booking booking = bookings.get(bookingID);
			if (!booking.getBookedStays().contains(stayID)) {
				logger.warn("The stayID {} does not belong to the specified booking.", bookingID);
				throw new InvalidIDException("The stayID does not belong to the specified booking.");
			}
			CreditCard card = booking.getCreditCard();
			List<String> bills = iHotelStayManager.getAllUnpayedBillsOfHotelStay(stayID);
			iBills.payBillsWithCreditCard(bills, card.getCcNumber(), card.getCcv(), card.getExpiryMonth(), card.getExpiryYear(), card.getFirstName(), card.getLastName());
		} else {
			logger.warn("A booking with bookingID {} could not be found.", bookingID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> searchForAvailableHotelRoomsInPeriod(LocalDateTime from, LocalDateTime to, String keyword, HotelRoomCategory category) {
		List<String> result = iBookableAccess.searchHotelRooms(keyword, category);
		List<String> staysInPeriod = iHotelStayManager.getAllHotelStaysWithinPeriod(from, to);
		for (String stayID : staysInPeriod) {
			result.remove(iHotelStayManager.getBookableOfHotelStay(stayID));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> searchForAvailableHostelBedsInPeriod(LocalDateTime from, LocalDateTime to, String keyword) {
		List<String> result = iBookableAccess.searchHostelBeds(keyword);
		List<String> staysInPeriod = iHotelStayManager.getAllHotelStaysWithinPeriod(from, to);
		for (String stayID : staysInPeriod) {
			result.remove(iHotelStayManager.getBookableOfHotelStay(stayID));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> searchForAvailableConferenceRoomsInPeriod(LocalDateTime from, LocalDateTime to, String keyword, ConferenceRoomCategory category) {
		List<String> result = iBookableAccess.searchConferenceRooms(keyword, category);
		List<String> staysInPeriod = iHotelStayManager.getAllHotelStaysWithinPeriod(from, to);
		for (String stayID : staysInPeriod) {
			result.remove(iHotelStayManager.getBookableOfHotelStay(stayID));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAvailableHotelRoomsInPeriod(LocalDateTime from, LocalDateTime to) {
		List<String> result = iBookableAccess.getAllHotelRoomIDs();
		List<String> staysInPeriod = iHotelStayManager.getAllHotelStaysWithinPeriod(from, to);
		for (String stayID : staysInPeriod) {
			result.remove(iHotelStayManager.getBookableOfHotelStay(stayID));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAvailableConferenceRoomsInPeriod(LocalDateTime from, LocalDateTime to) {
		List<String> result = iBookableAccess.getAllConferenceRoomIDs();
		List<String> staysInPeriod = iHotelStayManager.getAllHotelStaysWithinPeriod(from, to);
		for (String stayID : staysInPeriod) {
			result.remove(iHotelStayManager.getBookableOfHotelStay(stayID));
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAvailableHostelBedsInPeriod(LocalDateTime from, LocalDateTime to) {
		List<String> result = iBookableAccess.getAllHostelBedIDs();
		List<String> staysInPeriod = iHotelStayManager.getAllHotelStaysWithinPeriod(from, to);
		for (String stayID : staysInPeriod) {
			result.remove(iHotelStayManager.getBookableOfHotelStay(stayID));
		}
		return result;
	}

} //BookingsManagerImpl
