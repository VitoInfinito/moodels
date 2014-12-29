/**
 */
package Classes.Customers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.Requests.IRequests;
import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
@NonNullByDefault
class CustomersManager implements ICustomers {
	private static final long serialVersionUID = -4072756213874809017L;
	
	private final Logger logger = LoggerFactory.getLogger(CustomersManager.class);
	public static CustomersManager INSTANCE = new CustomersManager();

	private IRequests iRequests;

	private HashMap<String, Customer> customer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private CustomersManager() {
		super();
		customer = new HashMap<String,Customer>();
		iRequests = IRequests.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		Nothing
	 * Ensures:
	 * 		A list containing all customer ID:s is returned.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllCustomers() {
		return new ArrayList<String>(customer.keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		
	 * Ensures:
	 *		
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addCustomer(String SSID, String firstname, String lastname, String title, String email, String phone) throws InvalidIDException {
		if (customer.containsKey(SSID)) {
			logger.warn("There is already a customer added with the SSID {}. The SSID can not be used as a unique ID!", SSID);
			throw new InvalidIDException("There is already a customer added with the SSID " + SSID + ". The SSID can not be used as a unique ID!");
		}

		Customer cus = CustomersFactory.INSTANCE.createCustomer();

		cus.setSsid(SSID);
		cus.setFirstname(firstname);
		cus.setLastname(lastname);
		cus.setEmail(email);
		cus.setPhone(phone);
		cus.setTitle(title);

		customer.put(SSID, cus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		
	 * Ensures:
	 *		
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void removeCustomer(String SSID) throws InvalidIDException {
		if (customer.containsKey(SSID)) {
			customer.remove(SSID);
		} else {
			logger.warn("There is no costumer with the SSID {}", SSID);
			throw new InvalidIDException("There is no costumer with the SSID " + SSID);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changeCustomerFirstName(String SSID, String firstName) throws InvalidIDException {
		if (customer.containsKey(SSID)) {
			customer.get(SSID).setFirstname(firstName);
		} else {
			logger.warn("A customer with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changeCustomerLastName(String SSID, String lastName) throws InvalidIDException {
		if (customer.containsKey(SSID)) {
			customer.get(SSID).setLastname(lastName);
		} else {
			logger.warn("A customer with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changeCustomerTitle(String SSID, String title) throws InvalidIDException {
		if (customer.containsKey(SSID)) {
			customer.get(SSID).setTitle(title);
		} else {
			logger.warn("A customer with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changeCustomerEmail(String SSID, String eMail) throws InvalidIDException {
		if (customer.containsKey(SSID)) {
			customer.get(SSID).setEmail(eMail);
		} else {
			logger.warn("A customer with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	@NonNullByDefault
	public void changeCustomerPhone(String SSID, String phoneNr) throws InvalidIDException {
		if (customer.containsKey(SSID)) {
			customer.get(SSID).setPhone(phoneNr);
		} else {
			logger.warn("A customer with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	@NonNullByDefault
	public String getCustomerFirstName(String SSID) throws InvalidIDException {
		if (customer.containsKey(SSID)) {
			return customer.get(SSID).getFirstname();
		} else {
			logger.warn("A customer with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	@NonNullByDefault
	public String getCustomerLastName(String SSID) throws InvalidIDException {
		if (customer.containsKey(SSID)) {
			return customer.get(SSID).getLastname();
		} else {
			logger.warn("A customer with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getCustomerTitle(String SSID) throws InvalidIDException {
		if (customer.containsKey(SSID)) {
			return customer.get(SSID).getTitle();
		} else {
			logger.warn("A customer with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getCustomerEmail(String SSID) throws InvalidIDException {
		if (customer.containsKey(SSID)) {
			return customer.get(SSID).getEmail();
		} else {
			logger.warn("A customer with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getCustomerPhone(String SSID) throws InvalidIDException {
		if (customer.containsKey(SSID)) {
			return customer.get(SSID).getPhone();
		} else {
			logger.warn("A customer with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> searchCustomers(String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		if (customer.containsKey(keyword)) {
			searchResult.add(keyword);
		}

		Collection<Customer> c = customer.values();

		// Some property match exactly. Second Order!
		for (Customer b : c) {
			if (b.getFirstname().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getSsid());
			} else if (b.getLastname().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getSsid());
			} else if (b.getTitle().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getSsid());
			} else if (b.getEmail().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getSsid());
			} else if (b.getPhone().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getSsid());
			} else if (b.getBookings().contains(keyword)) {
				searchResult.add(b.getSsid());
			} else if (b.getRequests().contains(keyword)) {
				searchResult.add(b.getSsid());
			}
		}

		// ID match somewhat. Third Order!
		for (Customer b : c) {			
			if (regexPattern.matcher(b.getSsid()).matches()) {
				searchResult.add(b.getSsid());
			} 
		}

		// Some property match somewhat. Fourth Order.
		for (Customer b : c) {
			if (regexPattern.matcher(b.getFirstname()).matches()) {
				searchResult.add(b.getSsid());
			} else if (regexPattern.matcher(b.getLastname()).matches()) {
				searchResult.add(b.getSsid());
			} else if (regexPattern.matcher(b.getTitle()).matches()) {
				searchResult.add(b.getSsid());
			} else if (regexPattern.matcher(b.getFirstname()).matches()) {
				searchResult.add(b.getSsid());
			} else if (regexPattern.matcher(b.getEmail()).matches()) {
				searchResult.add(b.getSsid());
			} else if (regexPattern.matcher(b.getPhone()).matches()) {
				searchResult.add(b.getSsid());
			} else {
				for (String booking : b.getBookings()) {
					if (regexPattern.matcher(booking).matches()) {
						searchResult.add(b.getSsid());
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
	public List<String> getCustomerBookings(String SSID) throws InvalidIDException {
		if (customer.containsKey(SSID)) {
			return new ArrayList<String>(customer.get(SSID).getBookings());
		} else {
			logger.warn("A customer with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public List<String> getCustomerRequests(String SSID) throws InvalidIDException {
		if (customer.containsKey(SSID)) {
			return new ArrayList<String>(customer.get(SSID).getRequests());
		} else {
			logger.warn("A customer with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void addCustomerBooking(String SSID, String bookingID) throws InvalidIDException {
		if (customer.containsKey(SSID)) {
			customer.get(SSID).addBooking(bookingID);
		} else {
			logger.warn("A customer with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void removeCustomerBooking(String SSID, String bookingID) throws InvalidIDException {
		if (customer.containsKey(SSID)) {
			customer.get(SSID).removeBooking(bookingID);
		} else {
			logger.warn("A customer with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void addCustomerRequest(String SSID, String description) throws InvalidIDException {
		if (customer.containsKey(SSID)) {
			customer.get(SSID).addRequest(iRequests.addRequest(description));
		} else {
			logger.warn("A customer with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}	
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void removeCustomerRequest(String SSID, String requestID) throws InvalidIDException {
		if (customer.containsKey(SSID)) {
			iRequests.deleteRequest(requestID);
			customer.get(SSID).removeRequest(requestID);
		} else {
			logger.warn("A customer with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}	
	}
} //CustomersManagerImpl
