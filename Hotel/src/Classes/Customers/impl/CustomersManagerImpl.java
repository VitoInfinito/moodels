/**
 */
package Classes.Customers.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.InvalidIDException;
import Classes.Customers.Customer;
import Classes.Customers.CustomersFactory;
import Classes.Customers.CustomersManager;
import Classes.Customers.CustomersPackage;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToCustomerMapImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Customers.impl.CustomersManagerImpl#getCustomer <em>Customer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
@NonNullByDefault
public class CustomersManagerImpl extends MinimalEObjectImpl.Container implements CustomersManager {
	private final Logger logger = LoggerFactory.getLogger(CustomersManagerImpl.class);
	public static CustomersManagerImpl INSTANCE = new CustomersManagerImpl();
	
	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated NOT
	 * @ordered
	 */
	private EMap<String, Customer> customer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private CustomersManagerImpl() {
		super();
		customer = new EcoreEMap<String,Customer>(ECoreMapEntriesPackage.Literals.STRING_TO_CUSTOMER_MAP, StringToCustomerMapImpl.class, this, CustomersPackage.CUSTOMERS_MANAGER__CUSTOMER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CustomersPackage.Literals.CUSTOMERS_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Customer> getCustomer() {
		throw new UnsupportedOperationException();
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
		
		Customer cus = CustomersFactory.eINSTANCE.createCustomer();
		
		cus.setSsid(SSID);
		cus.setFirstname(firstname);
		cus.setLastname(lastname);
		cus.setPhone(phone);
		cus.setTitle(title);
		
		customer.put(SSID, cus);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeCustomerFirstName(String SSID, String firstName) {
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
	 * @generated NOT
	 */
	public void changeCustomerLastName(String SSID, String lastName) {
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
	 * @generated NOT
	 */
	public void changeCustomerTitle(String SSID, String title) {
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
	 * @generated NOT
	 */
	public void changeCustomerEmail(String SSID, String eMail) {
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
	 * @generated NOT
	 */
	@NonNullByDefault
	public void changeCustomerPhone(String SSID, String phoneNr) {
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
	 * @generated NOT
	 */
	@NonNullByDefault
	public String getCustomerFirstName(String SSID) {
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
	 * @generated NOT
	 */
	@NonNullByDefault
	public String getCustomerLastName(String SSID) {
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
	 * @generated NOT
	 */
	public String getCustomerTitle(String SSID) {
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
	 * @generated NOT
	 */
	public String getCustomerEmail(String SSID) {
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
	 * @generated NOT
	 */
	public String getCustomerPhone(String SSID) {
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
	 * @generated NOT
	 */
	public List<String> getCustomerBookings(String SSID) {
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
	 * @generated NOT
	 */
	public List<String> getCustomerRequests(String SSID) {
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
	 * @generated NOT
	 */
	public void addCustomerBooking(String SSID, String bookingID) {
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
	 * @generated NOT
	 */
	public void removeCustomerBooking(String SSID, String bookingID) {
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
	 * @generated NOT
	 */
	public void addCustomerRequest(String SSID, String requestID) {
		if (customer.containsKey(SSID)) {
			customer.get(SSID).addRequest(requestID);
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
	public void removeCustomerRequest(String SSID, String requestID) {
		if (customer.containsKey(SSID)) {
			customer.get(SSID).removeRequest(requestID);
		} else {
			logger.warn("A customer with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}	
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		throw new UnsupportedOperationException();
	}

} //CustomersManagerImpl
