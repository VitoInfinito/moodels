/**
 */
package Classes.Bookings.impl;


import java.time.LocalDateTime;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.InvalidIDException;
import Classes.Bookings.Booking;
import Classes.Bookings.BookingsPackage;
import Classes.Stays.CreditCard;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	private final Logger logger = LoggerFactory.getLogger(BookingImpl.class);
	
	private EList<String> bookedStays;
	private String customer;
	private String bookingNbr;
	private int nbrGuests;
	private LocalDateTime issueDate;
	private CreditCard creditCard;
	private EList<String> requests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
		bookedStays = new EDataTypeUniqueEList<String>(String.class, this, BookingsPackage.BOOKING__BOOKED_STAYS);
		requests = new EDataTypeUniqueEList<String>(String.class, this, BookingsPackage.BOOKING__REQUESTS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBookedStays() {
		return bookedStays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(String newCustomer) {
		String oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingsPackage.BOOKING__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBookingNbr() {
		return bookingNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingNbr(String newBookingNbr) {
		String oldBookingNbr = bookingNbr;
		bookingNbr = newBookingNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingsPackage.BOOKING__BOOKING_NBR, oldBookingNbr, bookingNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbrGuests() {
		return nbrGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbrGuests(int newNbrGuests) {
		int oldNbrGuests = nbrGuests;
		nbrGuests = newNbrGuests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingsPackage.BOOKING__NBR_GUESTS, oldNbrGuests, nbrGuests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDateTime getIssueDate() {
		return issueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueDate(LocalDateTime newIssueDate) {
		LocalDateTime oldIssueDate = issueDate;
		issueDate = newIssueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingsPackage.BOOKING__ISSUE_DATE, oldIssueDate, issueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCard getCreditCard() {
		if (creditCard != null && creditCard.eIsProxy()) {
			InternalEObject oldCreditCard = (InternalEObject)creditCard;
			creditCard = (CreditCard)eResolveProxy(oldCreditCard);
			if (creditCard != oldCreditCard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingsPackage.BOOKING__CREDIT_CARD, oldCreditCard, creditCard));
			}
		}
		return creditCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCard basicGetCreditCard() {
		return creditCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditCard(CreditCard newCreditCard) {
		CreditCard oldCreditCard = creditCard;
		creditCard = newCreditCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingsPackage.BOOKING__CREDIT_CARD, oldCreditCard, creditCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRequests() {
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public void addBookedStay(String stayID) throws InvalidIDException {
		if(!bookedStays.contains(stayID)) {
			bookedStays.add(stayID);
		} else {
			logger.warn("A stay with stayID {} is already added to the booking.", stayID);
			throw new InvalidIDException();
		}	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated
	 */
	public void cancelBookedStay(String stayID) throws InvalidIDException {
		if(bookedStays.contains(stayID)) {
			bookedStays.remove(stayID);
		} else {
			logger.warn("A stay with stayID {} could not be found.", stayID);
			throw new InvalidIDException();
		}
	}	
	
	@Override
	public void addRequest(String requestID) throws InvalidIDException {
		if(!requests.contains(requestID)) {
			requests.add(requestID);
		} else {
			logger.warn("A request with requestID {} is already added to the booking.", requestID);
			throw new InvalidIDException();
		}	
	}

	@Override
	public void removeRequest(String requestID) throws InvalidIDException {
		if(requests.contains(requestID)) {
			requests.remove(requestID);
		} else {
			logger.warn("A request with requestID {} could not be found.", requestID);
			throw new InvalidIDException();
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bookedStays: ");
		result.append(bookedStays);
		result.append(", customer: ");
		result.append(customer);
		result.append(", bookingNbr: ");
		result.append(bookingNbr);
		result.append(", nbrGuests: ");
		result.append(nbrGuests);
		result.append(", issueDate: ");
		result.append(issueDate);
		result.append(", requests: ");
		result.append(requests);
		result.append(')');
		return result.toString();
	}



} //BookingImpl
