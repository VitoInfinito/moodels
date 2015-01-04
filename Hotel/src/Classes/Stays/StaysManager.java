/**
 */
package Classes.Stays;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import javax.xml.soap.SOAPException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;
import Classes.Bills.IBills;
import Classes.Bookables.IBookablesAccess;
import Classes.Bookings.IBookings;
import Classes.Guests.IGuests;
import Classes.Utils.CreditCard;
import Classes.Utils.GuestAlreadyCheckedInException;
import Classes.Utils.GuestAlreadyCheckedOutException;
import Classes.Utils.GuestNotCheckedInException;
import Classes.Utils.InsufficientFundsException;
import Classes.Utils.InvalidCheckInDateException;
import Classes.Utils.InvalidCreditCardException;
import Classes.Utils.InvalidIDException;
import Classes.Utils.ResponsibleCreditCardNotAddedException;
import Classes.Utils.StayAlreadyFullyCheckedInException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->	

 * @generated
 */
public class StaysManager implements IStays {
	private static final long serialVersionUID = -8104300603889046779L;
	private final Logger logger = LoggerFactory.getLogger(StaysManager.class);
	public static StaysManager INSTANCE = new StaysManager();

	private static int IDCounter = 0;

	private HashMap<String, Stay> stays;
	private IBills iBills;
	private IGuests iGuests;
	private IBookings iBookings;
	private IBookablesAccess iBookables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private StaysManager() {
		super();
		stays = new HashMap<String,Stay>();
		iBills = IBills.INSTANCE;
		iGuests = IGuests.INSTANCE;
		iBookings = IBookings.INSTANCE;
		iBookables = IBookablesAccess.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws ResponsibleCreditCardNotAddedException 
	 * @throws InvalidIDException 
	 * @throws GuestAlreadyCheckedInException 
	 * @throws StayAlreadyFullyCheckedInException 
	 * @throws InvalidCheckInDateException 
	 * @throws GuestAlreadyCheckedOutException 
	 * @generated
	 */
	public void checkInGuest(String stayID, String guestID) throws ResponsibleCreditCardNotAddedException, InvalidIDException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException {
		if (!stays.containsKey(stayID)) {
			logger.warn("A stay with ID {} could not be found.", stayID);
			throw new InvalidIDException();
		} else if (!isResponsibleCreditCardAdded(stayID)) {
			logger.warn("Tried to check in a guest to the stay with id: {} when a responsible credit card has not been supplied yet!");
			throw new ResponsibleCreditCardNotAddedException();
		} else if (!iGuests.getAllGuestIDs().contains(guestID)) {
			logger.warn("A guest with ID {} could not be found.", guestID);
			throw new InvalidIDException();
		} 

		Stay stay = stays.get(stayID);
		String bookableID = stay.getBookable();

		// Validate so the day of the check in matches a day of the stay period.
		LocalDateTime dateTimeFrom = stay.getFromDate();
		LocalDateTime dateFrom = LocalDateTime.of(dateTimeFrom.getYear(), dateTimeFrom.getMonth(), dateTimeFrom.getDayOfMonth(), 0, 0);
		LocalDateTime dateTimeTo = stay.getToDate();
		LocalDateTime dateTo = LocalDateTime.of(dateTimeTo.getYear(), dateTimeTo.getMonth(), dateTimeTo.getDayOfMonth(), 0, 0);
		LocalDateTime now = LocalDateTime.now();
		if (now.isBefore(dateFrom) || now.isAfter(dateTo)) {
			logger.warn("The guest {} can not check in to the stay {}, since the current date {} is not within the booked stay date period from: {}, to: {}.", guestID, stayID, now, dateFrom, dateTo);
			throw new InvalidCheckInDateException();
		}

		// Validate so the guest is not already checked in
		List<String> alreadyCheckedIn = stay.getCheckedInGuests();
		if (alreadyCheckedIn.contains(guestID)) {
			logger.warn("The guest {} has already checked in to the stay with id {}!", guestID, stayID);
			throw new GuestAlreadyCheckedInException();
		}

		// Validate so the guest is not already checked out
		List<String> checkedOutGuests = stay.getCheckedOutGuests();
		if (checkedOutGuests.contains(guestID)) {
			logger.warn("The guest {} has already checked out from the stay with id {}!", guestID, stayID);
			throw new GuestAlreadyCheckedOutException();
		}

		// Figure out which kind of bookable the guest should be checked in to
		if (iBookables.getAllHotelRoomIDs().contains(bookableID)) {
			// Validate so not full
			if (alreadyCheckedIn.size() >= iBookables.getHotelRoomNbrBeds(bookableID)) {
				logger.warn("The hotel room is already fully checked in for stay {}, the guest {} can not be checked in!", stayID, guestID);
				throw new StayAlreadyFullyCheckedInException();
			}
		} else if (iBookables.getAllHostelBedIDs().contains(bookableID)) {
			// Validate so no person is checked in already
			if (alreadyCheckedIn.size() >= 1) {
				logger.warn("The hostel bed of stay {} already has a checked in guest, the guest {} can not be checked in!", stayID, guestID);
				throw new StayAlreadyFullyCheckedInException();
			}
		} else {
			logger.warn("The stay with id: {} is for a conference room! One can not check in to a conference room.", stayID);
			throw new InvalidIDException();
		}

		// Check in guest
		stay.addCheckedInGuest(guestID);
		if(!iGuests.getAllGuestIDs().contains(guestID))
			iGuests.generateGuestAccount(guestID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changeBookableOfStay(String stayID, String bookableID) throws InvalidIDException {
		if (stays.containsKey(stayID)) {
			Stay stay = stays.get(stayID);
			if (!iBookings.getAvailableBookablesInPeriod(stay.getFromDate(), stay.getToDate()).contains(bookableID)) {
				logger.warn("Tried to change the bookable of a stay when the bookable is already booked within the period of the stay!");
				throw new InvalidIDException();
			}

			// Remove the old bill for the old bookable
			String oldBill = "";
			for (String bill : stay.getBills()) {
				if (iBills.getBillBookable(bill) != null) {
					removeBillFromStay(stayID, bill);
					oldBill = bill;
					// There can only be one such bill per stay so just break..
					break;
				}
			}

			// Add a new bill for the new bookable
			addBillToStay(stayID, iBills.addBill(new ArrayList<String>(), new ArrayList<String>(), bookableID, stay.getFromDate(), stay.getToDate(), iBills.getBillDiscount(oldBill)));

			stays.get(stayID).setBookable(bookableID);
		} else {
			logger.warn("A stay with ID {} could not be found.", stayID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Add a new stay
	 * <!-- end-user-doc -->
	 * @return 
	 * @generated NOT
	 */
	public String addNewStay(String bookableID, String bookingID, LocalDateTime fromDate, LocalDateTime toDate) {
		String id = generateID();

		Stay stay = StaysFactory.INSTANCE.createStay();
		stay.setID(id);
		stay.setBookable(bookableID);
		stay.setBooking(bookingID);
		stay.setFromDate(fromDate);
		stay.setToDate(toDate);

		stays.put(id, stay);

		return id;
	}

	private String generateID() {
		return String.format("st%06d", IDCounter++);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Remove an existing stay
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void removeStay(String stayID) throws InvalidIDException {
		if (!stays.containsKey(stayID)) {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		} else {
			stays.remove(stayID);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Add a bill to an existing stay
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void addBillToStay(String stayID, String billID) throws InvalidIDException {
		if (!stays.containsKey(stayID)) {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		} else {
			stays.get(stayID).addBill(billID);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws GuestNotCheckedInException 
	 * @throws GuestAlreadyCheckedOutException 
	 * @throws InsufficientFundsException 
	 * @throws InvalidCreditCardException 
	 * @throws SOAPException 
	 * @generated
	 */
	public void checkOutGuest(String stayID, String guestID) throws InvalidIDException, GuestNotCheckedInException, GuestAlreadyCheckedOutException, SOAPException, InvalidCreditCardException, InsufficientFundsException {
		if (!stays.containsKey(stayID)) {
			logger.warn("A stay with ID {} could not be found.", stayID);
			throw new InvalidIDException();
		} else if (!iGuests.getAllGuestIDs().contains(guestID)) {
			logger.warn("A guest with ID {} could not be found.", guestID);
			throw new InvalidIDException();
		} 

		Stay stay = stays.get(stayID);

		// Validate so the guest is checked in
		List<String> checkedInGuests = stay.getCheckedInGuests();
		if (!checkedInGuests.contains(guestID)) {
			logger.warn("The guest {} is not checked in to the stay with id {}!", guestID, stayID);
			throw new GuestNotCheckedInException();
		}

		// Validate so the guest is not already checked out
		List<String> alreadyCheckedOut = stay.getCheckedOutGuests();
		if (alreadyCheckedOut.contains(guestID)) {
			logger.warn("The guest {} has already checked out from the stay with id {}!", guestID, stayID);
			throw new GuestAlreadyCheckedOutException();
		}

		// If last guest checking out and bills unpaid bills exist we bill the responsible credit card for those.
		if (checkedInGuests.size() == 1) {
			List<String> bills = getAllUnpayedBillsOfHotelStay(stayID);
			if (!bills.isEmpty()) {
				CreditCard card = stay.getCreditCard();
				iBills.payBillsWithCreditCard(bills, card.getCcNumber(), card.getCcv(), card.getExpiryMonth(), card.getExpiryYear(), card.getFirstName(), card.getLastName());
			}
		}
		
		stay.checkOutGuest(guestID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Add a new resposinble credit card to an existing stay
	 * <!-- end-user-doc -->
	 * @throws SOAPException, InvalidCreditCardException
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void addResponsibleCreditCard(String stayID, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) throws SOAPException, InvalidCreditCardException, InvalidIDException {
		if (!stays.containsKey(stayID)) {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		} else {

			CustomerRequires customerReq = CustomerRequires.instance();
			if (!customerReq.isCreditCardValid(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName)) {
				logger.warn("This credit card is not valid.");
				throw new InvalidCreditCardException();
			}

			CreditCard creditCard = new CreditCard();
			creditCard.setCcNumber(ccNumber);
			creditCard.setCcv(ccv);
			creditCard.setExpiryMonth(expiryMonth);
			creditCard.setExpiryYear(expiryYear);
			creditCard.setFirstName(firstName);
			creditCard.setLastName(lastName);
			stays.get(stayID).setCreditCard(creditCard);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Change the responsible credit card of an existing stay
	 * <!-- end-user-doc -->
	 * @throws SOAPException, InvalidCreditCardException
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changeResponsibleCreditCard(String stayID, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) throws SOAPException, InvalidCreditCardException, InvalidIDException {
		if (!stays.containsKey(stayID)) {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		} else {

			CustomerRequires customerReq = CustomerRequires.instance();
			if (!customerReq.isCreditCardValid(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName)) {
				logger.warn("This credit card is not valid.");
				throw new InvalidCreditCardException();
			}

			CreditCard creditCard = new CreditCard();
			creditCard.setCcNumber(ccNumber);
			creditCard.setCcv(ccv);
			creditCard.setExpiryMonth(expiryMonth);
			creditCard.setExpiryYear(expiryYear);
			creditCard.setFirstName(firstName);
			creditCard.setLastName(lastName);
			stays.get(stayID).setCreditCard(creditCard);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Get all the guests of an existing stay
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getGuestsOfHotelStay(String stayID) {
		return new ArrayList<String>(stays.get(stayID).getCheckedInGuests());
	}

	/**
	 * <!-- begin-user-doc -->
	 * Get all the bills fo an existing stay
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getBillsOfHotelStay(String stayID) {
		return new ArrayList<String>(stays.get(stayID).getBills());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getBookableOfHotelStay(String stayID) throws InvalidIDException {
		if (stays.containsKey(stayID)) {
			return stays.get(stayID).getBookable();
		} else {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Get all the booking of an existing stay
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getBookingOfHotelStay(String stayID) throws InvalidIDException {
		if (stays.containsKey(stayID)) {
			return stays.get(stayID).getBooking();
		} else {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Get a list of all existing stays
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllHotelStayIDs() {
		return new ArrayList<String>(stays.keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public List<String> getCheckedInGuestsOfHotelStay(String stayID) throws InvalidIDException {
		if (stays.containsKey(stayID)) {
			return new ArrayList<String>(stays.get(stayID).getCheckedInGuests());
		} else {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public List<String> getCheckedOutGuestsOfHotelStay(String stayID) throws InvalidIDException {
		if (stays.containsKey(stayID)) {
			return new ArrayList<String>(stays.get(stayID).getCheckedOutGuests());
		} else {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public List<String> searchHotelStays(String keyword) throws InvalidIDException {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		if (stays.containsKey(keyword)) {
			searchResult.add(keyword);
		}

		Collection<Stay> c = stays.values();

		// Some property match exactly. Second Order!
		for (Stay b : c) {
			if (b.getBookable().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getID());
			} else if (b.getBooking().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getID());
			} else if (b.getCheckedInGuests().contains(keyword)) {
				searchResult.add(b.getID());
			} else if (b.getCheckedOutGuests().contains(keyword)) {
				searchResult.add(b.getID());
			} else {
				for (String guest : b.getCheckedInGuests()) {
					if (iGuests.getGuestFirstName(guest).equalsIgnoreCase(keyword)) {
						searchResult.add(b.getID());
					} else if (iGuests.getGuestLastName(guest).equalsIgnoreCase(keyword)) {
						searchResult.add(b.getID());
					} else if (iGuests.getGuestEmail(guest).equalsIgnoreCase(keyword)) {
						searchResult.add(b.getID());
					} else if (iGuests.getGuestPhone(guest).equalsIgnoreCase(keyword)) {
						searchResult.add(b.getID());
					} 
				}
			}

		}		

		// ID match somewhat. Third Order!
		for (Stay b : c) {			
			if (regexPattern.matcher(b.getID()).matches()) {
				searchResult.add(b.getID());
			} 
		}

		// Some property match somewhat. Fourth Order.
		for (Stay b : c) {
			if (regexPattern.matcher(b.getBookable()).matches()) {
				searchResult.add(b.getID());
			} else if (regexPattern.matcher((b.getBooking())).matches()) {
				searchResult.add(b.getID());
			} else {
				for (String guest : b.getCheckedInGuests()) {
					if (regexPattern.matcher(iGuests.getGuestFirstName(guest)).matches()) {
						searchResult.add(b.getID());
					} else if (regexPattern.matcher(iGuests.getGuestLastName(guest)).matches()) {
						searchResult.add(b.getID());
					} else if (regexPattern.matcher(iGuests.getGuestEmail(guest)).matches()) {
						searchResult.add(b.getID());
					} else if (regexPattern.matcher(iGuests.getGuestPhone(guest)).matches()) {
						searchResult.add(b.getID());
					} 
				}
			}
		}

		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public List<String> searchHotelStaysWithinPeriod(String keyword, LocalDateTime from, LocalDateTime to) throws InvalidIDException {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		if (stays.containsKey(keyword)) {
			LocalDateTime sFrom = stays.get(keyword).getFromDate();
			LocalDateTime sTo = stays.get(keyword).getToDate();
			if ((sFrom.isAfter(from) && sFrom.isBefore(to)) ||  // Stay begins within period
					(sTo.isAfter(from) && sTo.isBefore(to))     ||  // Stay ends within period
					(sFrom.isBefore(from) && sTo.isAfter(to))) {	// Stay starts before the period and ends after the period
				searchResult.add(keyword);
			}
			searchResult.add(keyword);
		}

		Collection<Stay> c = stays.values();

		// Some property match exactly. Second Order!
		for (Stay b : c) {
			if ((b.getFromDate().isAfter(from) && b.getFromDate().isBefore(to)) ||  // Stay begins within period
					(b.getToDate().isAfter(from) && b.getToDate().isBefore(to))     ||  // Stay ends within period
					(b.getFromDate().isBefore(from) && b.getToDate().isAfter(to))) {	  // Stay starts before the period and ends after the period
				if (b.getBookable().equalsIgnoreCase(keyword)) {
					searchResult.add(b.getID());
				} else if (b.getBooking().equalsIgnoreCase(keyword)) {
					searchResult.add(b.getID());
				} else if (b.getCheckedInGuests().contains(keyword)) {
					searchResult.add(b.getID());
				} else if (b.getCheckedOutGuests().contains(keyword)) {
					searchResult.add(b.getID());
				} else {
					for (String guest : b.getCheckedInGuests()) {
						if (iGuests.getGuestFirstName(guest).equalsIgnoreCase(keyword)) {
							searchResult.add(b.getID());
						} else if (iGuests.getGuestLastName(guest).equalsIgnoreCase(keyword)) {
							searchResult.add(b.getID());
						} else if (iGuests.getGuestEmail(guest).equalsIgnoreCase(keyword)) {
							searchResult.add(b.getID());
						} else if (iGuests.getGuestPhone(guest).equalsIgnoreCase(keyword)) {
							searchResult.add(b.getID());
						} 
					}
				}
			}
		}		

		// ID match somewhat. Third Order!
		for (Stay b : c) {			
			if ((b.getFromDate().isAfter(from) && b.getFromDate().isBefore(to)) ||  // Stay begins within period
					(b.getToDate().isAfter(from) && b.getToDate().isBefore(to))     ||  // Stay ends within period
					(b.getFromDate().isBefore(from) && b.getToDate().isAfter(to))) {	  // Stay starts before the period and ends after the period
				if (regexPattern.matcher(b.getID()).matches()) {
					searchResult.add(b.getID());
				} 
			}
		}

		// Some property match somewhat. Fourth Order.
		for (Stay b : c) {
			if ((b.getFromDate().isAfter(from) && b.getFromDate().isBefore(to)) ||  // Stay begins within period
					(b.getToDate().isAfter(from) && b.getToDate().isBefore(to))     ||  // Stay ends within period
					(b.getFromDate().isBefore(from) && b.getToDate().isAfter(to))) {	// Stay starts before the period and ends after the period
				if (regexPattern.matcher(b.getBookable()).matches()) {
					searchResult.add(b.getID());
				} else if (regexPattern.matcher((b.getBooking())).matches()) {
					searchResult.add(b.getID());
				} else {
					for (String guest : b.getCheckedInGuests()) {
						if (regexPattern.matcher(iGuests.getGuestFirstName(guest)).matches()) {
							searchResult.add(b.getID());
						} else if (regexPattern.matcher(iGuests.getGuestLastName(guest)).matches()) {
							searchResult.add(b.getID());
						} else if (regexPattern.matcher(iGuests.getGuestEmail(guest)).matches()) {
							searchResult.add(b.getID());
						} else if (regexPattern.matcher(iGuests.getGuestPhone(guest)).matches()) {
							searchResult.add(b.getID());
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
	 * @generated NOT
	 */
	public List<String> getAllHotelStaysWithinPeriod(LocalDateTime from, LocalDateTime to) {
		List<String> result = new ArrayList<String>();

		for (Stay stay : stays.values()) {
			if ((stay.getFromDate().isAfter(from) && stay.getFromDate().isBefore(to)) ||  // Stay begins within period
					(stay.getToDate().isAfter(from) && stay.getToDate().isBefore(to))     ||  // Stay ends within period
					(stay.getFromDate().isBefore(from) && stay.getToDate().isAfter(to))) {	  // Stay starts before the period and ends after the period
				result.add(stay.getID());
			}
		}

		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public List<String> getAllUnpayedBillsOfHotelStay(String stayID) throws InvalidIDException {
		if (stays.containsKey(stayID)) {
			List<String> unpaid = new ArrayList<String>();

			List<String> bills = stays.get(stayID).getBills();

			for (String billID : bills) {
				if (!iBills.getIsBillPaid(billID))
					unpaid.add(billID);
			}

			return unpaid;
		} else {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws SOAPException, InvalidCreditCardException, InsufficientFundsException
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void billCreditCardWithAllUnpaidBillsOfHotelStay(String stayID) throws SOAPException, InvalidCreditCardException, InsufficientFundsException, InvalidIDException {
		if (stays.containsKey(stayID)) {
			CreditCard creditCard = stays.get(stayID).getCreditCard();
			if (creditCard != null) {
				iBills.payBillsWithCreditCard(getAllUnpayedBillsOfHotelStay(stayID), creditCard.getCcNumber(), creditCard.getCcv(), creditCard.getExpiryMonth(), creditCard.getExpiryYear(), creditCard.getFirstName(), creditCard.getLastName());
			} else {
				logger.warn("A credit card is not registered with the stay.");
				throw new InvalidIDException();
			}
		} else {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public boolean isResponsibleCreditCardAdded(String stayID) throws InvalidIDException {
		if (stays.containsKey(stayID)) {
			return stays.get(stayID).getCreditCard() != null;
		} else {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changePeriodOfStay(String stayID, LocalDateTime from, LocalDateTime to) throws InvalidIDException {
		Stay stay = stays.get(stayID);

		if (stay != null) {
			// Check if period is outside of the old period
			if (stay.getFromDate().isBefore(from) && stay.getToDate().isBefore(from) || stay.getFromDate().isAfter(to) && stay.getToDate().isAfter(to)) {
				// Ensure that the bookable is free in the new period
				if (!iBookings.getAvailableBookablesInPeriod(from, to).contains(stay.getBookable())) {
					logger.warn("Tried to change the period of a stay when the bookable is already booked in the requested period!");
					throw new InvalidIDException();
				}
				// Check if new period interleaves the old period with a sooner start time
			} else if (stay.getFromDate().isBefore(from) && stay.getToDate().isAfter(from) && stay.getToDate().isBefore(to)) {
				// Ensure that the bookable is free for the new earlier days
				if (!iBookings.getAvailableBookablesInPeriod(from, stay.getFromDate().minusNanos(1)).contains(stay.getBookable())) {
					logger.warn("Tried to change the period of a stay when the bookable is already booked in the requested period!");
					throw new InvalidIDException();
				}
				// Check if new period interleaves the old period with a later end time
			} else if (stay.getFromDate().isAfter(from) && stay.getFromDate().isBefore(to) && stay.getToDate().isAfter(to)) {
				// Ensure that the bookable is free for the new later days
				if (!iBookings.getAvailableBookablesInPeriod(stay.getToDate().plusNanos(1), to).contains(stay.getBookable())) {
					logger.warn("Tried to change the period of a stay when the bookable is already booked in the requested period!");
					throw new InvalidIDException();
				}
				// Check if new period interleaves the old period with a sooner start time and a later end time
			} else if (stay.getFromDate().isBefore(from) && stay.getToDate().isAfter(to)) {
				// Ensure that the bookable is free for the new days outside the old booked period
				if (!iBookings.getAvailableBookablesInPeriod(stay.getToDate().plusNanos(1), to).contains(stay.getBookable()) || !iBookings.getAvailableBookablesInPeriod(from, stay.getFromDate().minusNanos(1)).contains(stay.getBookable())) {
					logger.warn("Tried to change the period of a stay when the bookable is already booked in the requested period!");
					throw new InvalidIDException();
				}
			}

			// Checks passed.. Conclusion -> The room is free for the specified period and the period can be changed accordingly.

			stay.setFromDate(from);
			stay.setToDate(to);

			// Remove the old bill for the old bookable
			String oldBill = "";
			for (String bill : stay.getBills()) {
				if (iBills.getBillBookable(bill) != null) {
					removeBillFromStay(stayID, bill);
					oldBill = bill;
					// There can only be one such bill per stay so just break..
					break;
				}
			}

			// Add a new bill for the new bookable
			addBillToStay(stayID, iBills.addBill(new ArrayList<String>(), new ArrayList<String>(), stay.getBookable(), from, to, iBills.getBillDiscount(oldBill)));
		} else {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void removeBillFromStay(String stayID, String billID) throws InvalidIDException {
		if (stays.containsKey(stayID) && stays.get(stayID).getBills().contains(billID)) {
			iBills.removeBill(billID);
			stays.get(stayID).removeBill(billID);
		} else {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public LocalDateTime getFromDateOfHotelStay(String stayID) throws InvalidIDException {
		if (stays.containsKey(stayID)) {
			return stays.get(stayID).getFromDate();
		} else {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public LocalDateTime getToDateOfHotelStay(String stayID) throws InvalidIDException {
		if (stays.containsKey(stayID)) {
			return stays.get(stayID).getToDate();
		} else {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		}
	}
} //StaysManagerImpl
