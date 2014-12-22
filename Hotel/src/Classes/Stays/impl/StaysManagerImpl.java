/**
 */
package Classes.Stays.impl;

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
import Classes.Bills.IBills;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToStayMapImpl;
import Classes.Guests.IGuests;
import Classes.Stays.CreditCard;
import Classes.Stays.Stay;
import Classes.Stays.StaysFactory;
import Classes.Stays.StaysManager;
import Classes.Stays.StaysPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->

 * @generated
 */
public class StaysManagerImpl extends MinimalEObjectImpl.Container implements StaysManager {
	private final Logger logger = LoggerFactory.getLogger(StaysManagerImpl.class);
	public static StaysManagerImpl INSTANCE = new StaysManagerImpl();

	private static int IDCounter = 0;

	private EMap<String, Stay> stays;
	private IBills iBills;
	private IGuests iGuests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private StaysManagerImpl() {
		super();
		stays = new EcoreEMap<String,Stay>(ECoreMapEntriesPackage.Literals.STRING_TO_STAY_MAP, StringToStayMapImpl.class, this, StaysPackage.STAYS_MANAGER__STAYS);
		iBills = IBills.INSTANCE;
		iGuests = IGuests.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkInGuest(String stayID, String guestID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeBookableOfStay(String stayID, String bookableID) {
		if (stays.contains(stayID)) {
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

		Stay stay = StaysFactory.eINSTANCE.createStay();
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
	 * @generated NOT
	 */
	public void removeStay(String stayID) {
		if (!stays.contains(stayID)) {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		} else {
			stays.removeKey(stayID);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Add a bill to an existing stay
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addBillToStay(String stayID, String billID) {
		if (!stays.contains(stayID)) {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		} else {
			stays.get(stayID).addBill(billID);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkOutGuest(String stayID, String guestID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * Add a new resposinble credit card to an existing stay
	 * <!-- end-user-doc -->
	 * @throws SOAPException, InvalidCreditCardException
	 * @generated NOT
	 */
	public void addResponsibleCreditCard(String stayID, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) throws SOAPException, InvalidCreditCardException {
		if (!stays.contains(stayID)) {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		} else {

			CustomerRequires customerReq = CustomerRequires.instance();
			if (!customerReq.isCreditCardValid(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName)) {
				logger.warn("This credit card is not valid.");
				throw new InvalidCreditCardException();
			}

			CreditCard creditCard = StaysFactory.eINSTANCE.createCreditCard();
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
	 * @generated NOT
	 */
	public void changeResponsibleCreditCard(String stayID, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) throws SOAPException, InvalidCreditCardException {
		if (!stays.contains(stayID)) {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		} else {

			CustomerRequires customerReq = CustomerRequires.instance();
			if (!customerReq.isCreditCardValid(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName)) {
				logger.warn("This credit card is not valid.");
				throw new InvalidCreditCardException();
			}

			CreditCard creditCard = StaysFactory.eINSTANCE.createCreditCard();
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
	 * @generated NOT
	 */
	public String getBookableOfHotelStay(String stayID) {
		if (stays.contains(stayID)) {
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
	 * @generated NOT
	 */
	public String getBookingOfHotelStay(String stayID) {
		if (stays.contains(stayID)) {
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
	 * @generated NOT
	 */
	public List<String> getCheckedInGuestsOfHotelStay(String stayID) {
		if (stays.contains(stayID)) {
			return new ArrayList<String>(stays.get(stayID).getCheckedInGuests());
		} else {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getCheckedOutGuestsOfHotelStay(String stayID) {
		if (stays.contains(stayID)) {
			return new ArrayList<String>(stays.get(stayID).getCheckedOutGuests());
		} else {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> searchHotelStays(String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		if (stays.contains(keyword)) {
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
	 * @generated NOT
	 */
	public List<String> searchHotelStaysWithinPeriod(String keyword, LocalDateTime from, LocalDateTime to) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		if (stays.contains(keyword)) {
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
	 * @generated NOT
	 */
	public List<String> getAllUnpayedBillsOfHotelStay(String stayID) {
		if (stays.contains(stayID)) {
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
	 * @generated NOT
	 */
	public void billCreditCardWithAllUnpaidBillsOfHotelStay(String stayID) throws SOAPException, InvalidCreditCardException, InsufficientFundsException {
		if (stays.contains(stayID)) {
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
	 * @generated NOT
	 */
	public boolean isResponsibleCreditCardAdded(String stayID) {
		if (stays.contains(stayID)) {
			return stays.get(stayID).getCreditCard() != null;
		} else {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changePeriodOfStay(String stayID, LocalDateTime from, LocalDateTime to) {
		Stay stay = stays.get(stayID);

		if (stay != null) {
			stay.setFromDate(from);
			stay.setToDate(to);
		} else {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeBillFromStay(String stayID, String billID) {
		if (stays.contains(stayID)) {
			iBills.removeBill(billID);
		} else {
			logger.warn("A stay with ID {} does not exist.", stayID);
			throw new InvalidIDException();
		}
	}
} //StaysManagerImpl
