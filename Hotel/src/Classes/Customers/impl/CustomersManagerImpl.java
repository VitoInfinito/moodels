/**
 */
package Classes.Customers.impl;

import Classes.Customers.Customer;
import Classes.Customers.CustomersManager;
import Classes.Customers.CustomersPackage;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToCustomerMapImpl;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Customer> getCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllCustomers() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addCustomer(String SSID, String firstname, String lastname, String title, String email, String phone) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeCustomerFirstName(String SSID, String firstName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeCustomerLastName(String SSID, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeCustomerTitle(String SSID, String title) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeCustomerEmail(String SSID, String eMail) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeCustomerPhone(String SSID, String phoneNr) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerFirstName(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerLastName(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerTitle(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerEmail(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomerPhone(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchCustomers(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCustomerBookings(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCustomerRequests(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addCustomerBooking(String SSID, String bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeCustomerBooking(String SSID, String bookingID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addCustomerRequest(String SSID, String requestID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeCustomerRequest(String SSID, String requestID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CustomersPackage.CUSTOMERS_MANAGER__CUSTOMER:
				return ((InternalEList<?>)getCustomer()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CustomersPackage.CUSTOMERS_MANAGER__CUSTOMER:
				if (coreType) return getCustomer();
				else return getCustomer().map();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CustomersPackage.CUSTOMERS_MANAGER__CUSTOMER:
				((EStructuralFeature.Setting)getCustomer()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CustomersPackage.CUSTOMERS_MANAGER__CUSTOMER:
				getCustomer().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CustomersPackage.CUSTOMERS_MANAGER__CUSTOMER:
				return customer != null && !customer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CustomersPackage.CUSTOMERS_MANAGER___GET_ALL_CUSTOMERS:
				return getAllCustomers();
			case CustomersPackage.CUSTOMERS_MANAGER___ADD_CUSTOMER__STRING_STRING_STRING_STRING_STRING_STRING:
				addCustomer((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
				return null;
			case CustomersPackage.CUSTOMERS_MANAGER___CHANGE_CUSTOMER_FIRST_NAME__STRING_STRING:
				changeCustomerFirstName((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case CustomersPackage.CUSTOMERS_MANAGER___CHANGE_CUSTOMER_LAST_NAME__STRING_STRING:
				changeCustomerLastName((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case CustomersPackage.CUSTOMERS_MANAGER___CHANGE_CUSTOMER_TITLE__STRING_STRING:
				changeCustomerTitle((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case CustomersPackage.CUSTOMERS_MANAGER___CHANGE_CUSTOMER_EMAIL__STRING_STRING:
				changeCustomerEmail((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case CustomersPackage.CUSTOMERS_MANAGER___CHANGE_CUSTOMER_PHONE__STRING_STRING:
				changeCustomerPhone((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case CustomersPackage.CUSTOMERS_MANAGER___GET_CUSTOMER_FIRST_NAME__STRING:
				return getCustomerFirstName((String)arguments.get(0));
			case CustomersPackage.CUSTOMERS_MANAGER___GET_CUSTOMER_LAST_NAME__STRING:
				return getCustomerLastName((String)arguments.get(0));
			case CustomersPackage.CUSTOMERS_MANAGER___GET_CUSTOMER_TITLE__STRING:
				return getCustomerTitle((String)arguments.get(0));
			case CustomersPackage.CUSTOMERS_MANAGER___GET_CUSTOMER_EMAIL__STRING:
				return getCustomerEmail((String)arguments.get(0));
			case CustomersPackage.CUSTOMERS_MANAGER___GET_CUSTOMER_PHONE__STRING:
				return getCustomerPhone((String)arguments.get(0));
			case CustomersPackage.CUSTOMERS_MANAGER___SEARCH_CUSTOMERS__STRING:
				return searchCustomers((String)arguments.get(0));
			case CustomersPackage.CUSTOMERS_MANAGER___GET_CUSTOMER_BOOKINGS__STRING:
				return getCustomerBookings((String)arguments.get(0));
			case CustomersPackage.CUSTOMERS_MANAGER___GET_CUSTOMER_REQUESTS__STRING:
				return getCustomerRequests((String)arguments.get(0));
			case CustomersPackage.CUSTOMERS_MANAGER___ADD_CUSTOMER_BOOKING__STRING_STRING:
				addCustomerBooking((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case CustomersPackage.CUSTOMERS_MANAGER___REMOVE_CUSTOMER_BOOKING__STRING_STRING:
				removeCustomerBooking((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case CustomersPackage.CUSTOMERS_MANAGER___ADD_CUSTOMER_REQUEST__STRING_STRING:
				addCustomerRequest((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case CustomersPackage.CUSTOMERS_MANAGER___REMOVE_CUSTOMER_REQUEST__STRING_STRING:
				removeCustomerRequest((String)arguments.get(0), (String)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CustomersManagerImpl
