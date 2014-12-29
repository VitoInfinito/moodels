/**
 */
package Classes.Bookings;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.Stays.CreditCard;
import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Booking implements Serializable {

	private static final long serialVersionUID = 2228793076798270219L;

	private final Logger logger = LoggerFactory.getLogger(Booking.class);
	
	private List<String> bookedStays;
	private String customer;
	private String bookingNbr;
	private int nbrGuests;
	private LocalDateTime issueDate;
	private CreditCard creditCard;
	private List<String> requests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Booking() {
		super();
		bookedStays = new ArrayList<String>();
		requests = new ArrayList<String>();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getBookedStays() {
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
		customer = newCustomer;
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
		bookingNbr = newBookingNbr;
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
		nbrGuests = newNbrGuests;
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
		issueDate = newIssueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCard getCreditCard() {
		return creditCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditCard(CreditCard newCreditCard) {
		creditCard = newCreditCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getRequests() {
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
	
	public void addRequest(String requestID) throws InvalidIDException {
		if(!requests.contains(requestID)) {
			requests.add(requestID);
		} else {
			logger.warn("A request with requestID {} is already added to the booking.", requestID);
			throw new InvalidIDException();
		}	
	}

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
