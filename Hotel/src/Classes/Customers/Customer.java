/**
 */
package Classes.Customers;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Customer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
class Customer implements Serializable {
	
	private static final long serialVersionUID = -6471791488852827978L;

	private final Logger logger = LoggerFactory.getLogger(Customer.class);
	
	private String firstname;
	private String lastname;
	private String title ;
	private String email;
	private String phone;
	private String ssid;
	private List<String> bookings;
	private List<String> requests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Customer() {
		super();
		bookings = new ArrayList<String>();
		requests = new ArrayList<String>();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstname(String newFirstname) {
		firstname = newFirstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastname(String newLastname) {
		lastname = newLastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		title = newTitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		email = newEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(String newPhone) {
		phone = newPhone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSsid() {
		return ssid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsid(String newSsid) {
		ssid = newSsid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getBookings() {
		return bookings;
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
	 * @generated NOT
	 */
	public void addBooking(String bookingID) throws InvalidIDException {
		if(!bookings.contains(bookingID)) {
			bookings.add(bookingID);
		} else {
			logger.warn("A booking with bookingID {} is already added to the booking.", bookingID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void removeBooking(String bookingID) throws InvalidIDException {
		if(bookings.contains(bookingID)) {
			bookings.remove(bookingID);
		} else {
			logger.warn("A booking with bookingID {} could not be found.", bookingID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void addRequest(String requestID) throws InvalidIDException {
		if(!requests.contains(requestID)) {
			requests.add(requestID);
		} else {
			logger.warn("A request with requestID {} is already added to the booking.", requestID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
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
		result.append(" (firstname: ");
		result.append(firstname);
		result.append(", lastname: ");
		result.append(lastname);
		result.append(", title: ");
		result.append(title);
		result.append(", email: ");
		result.append(email);
		result.append(", phone: ");
		result.append(phone);
		result.append(", ssid: ");
		result.append(ssid);
		result.append(", bookings: ");
		result.append(bookings);
		result.append(", requests: ");
		result.append(requests);
		result.append(')');
		return result.toString();
	}

} //CustomerImpl
