/**
 */
package Classes.Customers;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Classes.Customers.CustomersFactory
 * @model kind="package"
 * @generated
 */
public interface CustomersPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Customers";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/Customers.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Customers";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CustomersPackage eINSTANCE = Classes.Customers.impl.CustomersPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.Customers.ICustomers <em>ICustomers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Customers.ICustomers
	 * @see Classes.Customers.impl.CustomersPackageImpl#getICustomers()
	 * @generated
	 */
	int ICUSTOMERS = 2;

	/**
	 * The number of structural features of the '<em>ICustomers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get All Customers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___GET_ALL_CUSTOMERS = 0;

	/**
	 * The operation id for the '<em>Add Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___ADD_CUSTOMER = 1;

	/**
	 * The operation id for the '<em>Change Customer First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___CHANGE_CUSTOMER_FIRST_NAME = 2;

	/**
	 * The operation id for the '<em>Change Customer Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___CHANGE_CUSTOMER_LAST_NAME = 3;

	/**
	 * The operation id for the '<em>Change Customer Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___CHANGE_CUSTOMER_TITLE = 4;

	/**
	 * The operation id for the '<em>Change Customer Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___CHANGE_CUSTOMER_EMAIL = 5;

	/**
	 * The operation id for the '<em>Change Customer Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___CHANGE_CUSTOMER_PHONE = 6;

	/**
	 * The operation id for the '<em>Get Customer First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___GET_CUSTOMER_FIRST_NAME = 7;

	/**
	 * The operation id for the '<em>Get Customer Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___GET_CUSTOMER_LAST_NAME = 8;

	/**
	 * The operation id for the '<em>Get Customer Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___GET_CUSTOMER_TITLE = 9;

	/**
	 * The operation id for the '<em>Get Customer Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___GET_CUSTOMER_EMAIL = 10;

	/**
	 * The operation id for the '<em>Get Customer Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___GET_CUSTOMER_PHONE = 11;

	/**
	 * The operation id for the '<em>Search Customers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___SEARCH_CUSTOMERS = 12;

	/**
	 * The operation id for the '<em>Get Customer Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___GET_CUSTOMER_BOOKINGS = 13;

	/**
	 * The operation id for the '<em>Get Customer Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___GET_CUSTOMER_REQUESTS = 14;

	/**
	 * The operation id for the '<em>Add Customer Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___ADD_CUSTOMER_BOOKING = 15;

	/**
	 * The operation id for the '<em>Remove Customer Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___REMOVE_CUSTOMER_BOOKING = 16;

	/**
	 * The operation id for the '<em>Add Customer Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___ADD_CUSTOMER_REQUEST = 17;

	/**
	 * The operation id for the '<em>Remove Customer Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS___REMOVE_CUSTOMER_REQUEST = 18;

	/**
	 * The number of operations of the '<em>ICustomers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICUSTOMERS_OPERATION_COUNT = 19;

	/**
	 * The meta object id for the '{@link Classes.Customers.impl.CustomersManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Customers.impl.CustomersManagerImpl
	 * @see Classes.Customers.impl.CustomersPackageImpl#getCustomersManager()
	 * @generated
	 */
	int CUSTOMERS_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Customer</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER__CUSTOMER = ICUSTOMERS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER_FEATURE_COUNT = ICUSTOMERS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get All Customers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___GET_ALL_CUSTOMERS = ICUSTOMERS___GET_ALL_CUSTOMERS;

	/**
	 * The operation id for the '<em>Add Customer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___ADD_CUSTOMER = ICUSTOMERS___ADD_CUSTOMER;

	/**
	 * The operation id for the '<em>Change Customer First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___CHANGE_CUSTOMER_FIRST_NAME = ICUSTOMERS___CHANGE_CUSTOMER_FIRST_NAME;

	/**
	 * The operation id for the '<em>Change Customer Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___CHANGE_CUSTOMER_LAST_NAME = ICUSTOMERS___CHANGE_CUSTOMER_LAST_NAME;

	/**
	 * The operation id for the '<em>Change Customer Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___CHANGE_CUSTOMER_TITLE = ICUSTOMERS___CHANGE_CUSTOMER_TITLE;

	/**
	 * The operation id for the '<em>Change Customer Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___CHANGE_CUSTOMER_EMAIL = ICUSTOMERS___CHANGE_CUSTOMER_EMAIL;

	/**
	 * The operation id for the '<em>Change Customer Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___CHANGE_CUSTOMER_PHONE = ICUSTOMERS___CHANGE_CUSTOMER_PHONE;

	/**
	 * The operation id for the '<em>Get Customer First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___GET_CUSTOMER_FIRST_NAME = ICUSTOMERS___GET_CUSTOMER_FIRST_NAME;

	/**
	 * The operation id for the '<em>Get Customer Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___GET_CUSTOMER_LAST_NAME = ICUSTOMERS___GET_CUSTOMER_LAST_NAME;

	/**
	 * The operation id for the '<em>Get Customer Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___GET_CUSTOMER_TITLE = ICUSTOMERS___GET_CUSTOMER_TITLE;

	/**
	 * The operation id for the '<em>Get Customer Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___GET_CUSTOMER_EMAIL = ICUSTOMERS___GET_CUSTOMER_EMAIL;

	/**
	 * The operation id for the '<em>Get Customer Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___GET_CUSTOMER_PHONE = ICUSTOMERS___GET_CUSTOMER_PHONE;

	/**
	 * The operation id for the '<em>Search Customers</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___SEARCH_CUSTOMERS = ICUSTOMERS___SEARCH_CUSTOMERS;

	/**
	 * The operation id for the '<em>Get Customer Bookings</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___GET_CUSTOMER_BOOKINGS = ICUSTOMERS___GET_CUSTOMER_BOOKINGS;

	/**
	 * The operation id for the '<em>Get Customer Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___GET_CUSTOMER_REQUESTS = ICUSTOMERS___GET_CUSTOMER_REQUESTS;

	/**
	 * The operation id for the '<em>Add Customer Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___ADD_CUSTOMER_BOOKING = ICUSTOMERS___ADD_CUSTOMER_BOOKING;

	/**
	 * The operation id for the '<em>Remove Customer Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___REMOVE_CUSTOMER_BOOKING = ICUSTOMERS___REMOVE_CUSTOMER_BOOKING;

	/**
	 * The operation id for the '<em>Add Customer Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___ADD_CUSTOMER_REQUEST = ICUSTOMERS___ADD_CUSTOMER_REQUEST;

	/**
	 * The operation id for the '<em>Remove Customer Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER___REMOVE_CUSTOMER_REQUEST = ICUSTOMERS___REMOVE_CUSTOMER_REQUEST;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMERS_MANAGER_OPERATION_COUNT = ICUSTOMERS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.Customers.impl.CustomerImpl <em>Customer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Customers.impl.CustomerImpl
	 * @see Classes.Customers.impl.CustomersPackageImpl#getCustomer()
	 * @generated
	 */
	int CUSTOMER = 1;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__FIRSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__LASTNAME = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__PHONE = 4;

	/**
	 * The feature id for the '<em><b>Ssid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__SSID = 5;

	/**
	 * The feature id for the '<em><b>Bookings</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__BOOKINGS = 6;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER__REQUESTS = 7;

	/**
	 * The number of structural features of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_FEATURE_COUNT = 8;

	/**
	 * The operation id for the '<em>Add Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___ADD_BOOKING = 0;

	/**
	 * The operation id for the '<em>Remove Booking</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___REMOVE_BOOKING = 1;

	/**
	 * The operation id for the '<em>Add Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___ADD_REQUEST = 2;

	/**
	 * The operation id for the '<em>Remove Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER___REMOVE_REQUEST = 3;

	/**
	 * The number of operations of the '<em>Customer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_OPERATION_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link Classes.Customers.CustomersManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see Classes.Customers.CustomersManager
	 * @generated
	 */
	EClass getCustomersManager();

	/**
	 * Returns the meta object for the map '{@link Classes.Customers.CustomersManager#getCustomer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Customer</em>'.
	 * @see Classes.Customers.CustomersManager#getCustomer()
	 * @see #getCustomersManager()
	 * @generated
	 */
	EReference getCustomersManager_Customer();

	/**
	 * Returns the meta object for class '{@link Classes.Customers.Customer <em>Customer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer</em>'.
	 * @see Classes.Customers.Customer
	 * @generated
	 */
	EClass getCustomer();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Customers.Customer#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see Classes.Customers.Customer#getFirstname()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Customers.Customer#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see Classes.Customers.Customer#getLastname()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Customers.Customer#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see Classes.Customers.Customer#getTitle()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Title();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Customers.Customer#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Classes.Customers.Customer#getEmail()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Email();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Customers.Customer#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see Classes.Customers.Customer#getPhone()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Phone();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Customers.Customer#getSsid <em>Ssid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssid</em>'.
	 * @see Classes.Customers.Customer#getSsid()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Ssid();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.Customers.Customer#getBookings <em>Bookings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bookings</em>'.
	 * @see Classes.Customers.Customer#getBookings()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Bookings();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.Customers.Customer#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Requests</em>'.
	 * @see Classes.Customers.Customer#getRequests()
	 * @see #getCustomer()
	 * @generated
	 */
	EAttribute getCustomer_Requests();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.Customer#addBooking() <em>Add Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Booking</em>' operation.
	 * @see Classes.Customers.Customer#addBooking()
	 * @generated
	 */
	EOperation getCustomer__AddBooking();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.Customer#removeBooking() <em>Remove Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Booking</em>' operation.
	 * @see Classes.Customers.Customer#removeBooking()
	 * @generated
	 */
	EOperation getCustomer__RemoveBooking();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.Customer#addRequest() <em>Add Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Request</em>' operation.
	 * @see Classes.Customers.Customer#addRequest()
	 * @generated
	 */
	EOperation getCustomer__AddRequest();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.Customer#removeRequest() <em>Remove Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Request</em>' operation.
	 * @see Classes.Customers.Customer#removeRequest()
	 * @generated
	 */
	EOperation getCustomer__RemoveRequest();

	/**
	 * Returns the meta object for class '{@link Classes.Customers.ICustomers <em>ICustomers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>ICustomers</em>'.
	 * @see Classes.Customers.ICustomers
	 * @generated
	 */
	EClass getICustomers();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#getAllCustomers() <em>Get All Customers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Customers</em>' operation.
	 * @see Classes.Customers.ICustomers#getAllCustomers()
	 * @generated
	 */
	EOperation getICustomers__GetAllCustomers();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#addCustomer() <em>Add Customer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Customer</em>' operation.
	 * @see Classes.Customers.ICustomers#addCustomer()
	 * @generated
	 */
	EOperation getICustomers__AddCustomer();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#changeCustomerFirstName() <em>Change Customer First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Customer First Name</em>' operation.
	 * @see Classes.Customers.ICustomers#changeCustomerFirstName()
	 * @generated
	 */
	EOperation getICustomers__ChangeCustomerFirstName();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#changeCustomerLastName() <em>Change Customer Last Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Customer Last Name</em>' operation.
	 * @see Classes.Customers.ICustomers#changeCustomerLastName()
	 * @generated
	 */
	EOperation getICustomers__ChangeCustomerLastName();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#changeCustomerTitle() <em>Change Customer Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Customer Title</em>' operation.
	 * @see Classes.Customers.ICustomers#changeCustomerTitle()
	 * @generated
	 */
	EOperation getICustomers__ChangeCustomerTitle();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#changeCustomerEmail() <em>Change Customer Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Customer Email</em>' operation.
	 * @see Classes.Customers.ICustomers#changeCustomerEmail()
	 * @generated
	 */
	EOperation getICustomers__ChangeCustomerEmail();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#changeCustomerPhone() <em>Change Customer Phone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Customer Phone</em>' operation.
	 * @see Classes.Customers.ICustomers#changeCustomerPhone()
	 * @generated
	 */
	EOperation getICustomers__ChangeCustomerPhone();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#getCustomerFirstName() <em>Get Customer First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer First Name</em>' operation.
	 * @see Classes.Customers.ICustomers#getCustomerFirstName()
	 * @generated
	 */
	EOperation getICustomers__GetCustomerFirstName();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#getCustomerLastName() <em>Get Customer Last Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer Last Name</em>' operation.
	 * @see Classes.Customers.ICustomers#getCustomerLastName()
	 * @generated
	 */
	EOperation getICustomers__GetCustomerLastName();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#getCustomerTitle() <em>Get Customer Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer Title</em>' operation.
	 * @see Classes.Customers.ICustomers#getCustomerTitle()
	 * @generated
	 */
	EOperation getICustomers__GetCustomerTitle();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#getCustomerEmail() <em>Get Customer Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer Email</em>' operation.
	 * @see Classes.Customers.ICustomers#getCustomerEmail()
	 * @generated
	 */
	EOperation getICustomers__GetCustomerEmail();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#getCustomerPhone() <em>Get Customer Phone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer Phone</em>' operation.
	 * @see Classes.Customers.ICustomers#getCustomerPhone()
	 * @generated
	 */
	EOperation getICustomers__GetCustomerPhone();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#searchCustomers() <em>Search Customers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Customers</em>' operation.
	 * @see Classes.Customers.ICustomers#searchCustomers()
	 * @generated
	 */
	EOperation getICustomers__SearchCustomers();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#getCustomerBookings() <em>Get Customer Bookings</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer Bookings</em>' operation.
	 * @see Classes.Customers.ICustomers#getCustomerBookings()
	 * @generated
	 */
	EOperation getICustomers__GetCustomerBookings();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#getCustomerRequests() <em>Get Customer Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Customer Requests</em>' operation.
	 * @see Classes.Customers.ICustomers#getCustomerRequests()
	 * @generated
	 */
	EOperation getICustomers__GetCustomerRequests();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#addCustomerBooking() <em>Add Customer Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Customer Booking</em>' operation.
	 * @see Classes.Customers.ICustomers#addCustomerBooking()
	 * @generated
	 */
	EOperation getICustomers__AddCustomerBooking();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#removeCustomerBooking() <em>Remove Customer Booking</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Customer Booking</em>' operation.
	 * @see Classes.Customers.ICustomers#removeCustomerBooking()
	 * @generated
	 */
	EOperation getICustomers__RemoveCustomerBooking();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#addCustomerRequest() <em>Add Customer Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Customer Request</em>' operation.
	 * @see Classes.Customers.ICustomers#addCustomerRequest()
	 * @generated
	 */
	EOperation getICustomers__AddCustomerRequest();

	/**
	 * Returns the meta object for the '{@link Classes.Customers.ICustomers#removeCustomerRequest() <em>Remove Customer Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Customer Request</em>' operation.
	 * @see Classes.Customers.ICustomers#removeCustomerRequest()
	 * @generated
	 */
	EOperation getICustomers__RemoveCustomerRequest();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CustomersFactory getCustomersFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Classes.Customers.impl.CustomersManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Customers.impl.CustomersManagerImpl
		 * @see Classes.Customers.impl.CustomersPackageImpl#getCustomersManager()
		 * @generated
		 */
		EClass CUSTOMERS_MANAGER = eINSTANCE.getCustomersManager();

		/**
		 * The meta object literal for the '<em><b>Customer</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CUSTOMERS_MANAGER__CUSTOMER = eINSTANCE.getCustomersManager_Customer();

		/**
		 * The meta object literal for the '{@link Classes.Customers.impl.CustomerImpl <em>Customer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Customers.impl.CustomerImpl
		 * @see Classes.Customers.impl.CustomersPackageImpl#getCustomer()
		 * @generated
		 */
		EClass CUSTOMER = eINSTANCE.getCustomer();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__FIRSTNAME = eINSTANCE.getCustomer_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__LASTNAME = eINSTANCE.getCustomer_Lastname();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__TITLE = eINSTANCE.getCustomer_Title();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__EMAIL = eINSTANCE.getCustomer_Email();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__PHONE = eINSTANCE.getCustomer_Phone();

		/**
		 * The meta object literal for the '<em><b>Ssid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__SSID = eINSTANCE.getCustomer_Ssid();

		/**
		 * The meta object literal for the '<em><b>Bookings</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__BOOKINGS = eINSTANCE.getCustomer_Bookings();

		/**
		 * The meta object literal for the '<em><b>Requests</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOMER__REQUESTS = eINSTANCE.getCustomer_Requests();

		/**
		 * The meta object literal for the '<em><b>Add Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___ADD_BOOKING = eINSTANCE.getCustomer__AddBooking();

		/**
		 * The meta object literal for the '<em><b>Remove Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___REMOVE_BOOKING = eINSTANCE.getCustomer__RemoveBooking();

		/**
		 * The meta object literal for the '<em><b>Add Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___ADD_REQUEST = eINSTANCE.getCustomer__AddRequest();

		/**
		 * The meta object literal for the '<em><b>Remove Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER___REMOVE_REQUEST = eINSTANCE.getCustomer__RemoveRequest();

		/**
		 * The meta object literal for the '{@link Classes.Customers.ICustomers <em>ICustomers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Customers.ICustomers
		 * @see Classes.Customers.impl.CustomersPackageImpl#getICustomers()
		 * @generated
		 */
		EClass ICUSTOMERS = eINSTANCE.getICustomers();

		/**
		 * The meta object literal for the '<em><b>Get All Customers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___GET_ALL_CUSTOMERS = eINSTANCE.getICustomers__GetAllCustomers();

		/**
		 * The meta object literal for the '<em><b>Add Customer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___ADD_CUSTOMER = eINSTANCE.getICustomers__AddCustomer();

		/**
		 * The meta object literal for the '<em><b>Change Customer First Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___CHANGE_CUSTOMER_FIRST_NAME = eINSTANCE.getICustomers__ChangeCustomerFirstName();

		/**
		 * The meta object literal for the '<em><b>Change Customer Last Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___CHANGE_CUSTOMER_LAST_NAME = eINSTANCE.getICustomers__ChangeCustomerLastName();

		/**
		 * The meta object literal for the '<em><b>Change Customer Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___CHANGE_CUSTOMER_TITLE = eINSTANCE.getICustomers__ChangeCustomerTitle();

		/**
		 * The meta object literal for the '<em><b>Change Customer Email</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___CHANGE_CUSTOMER_EMAIL = eINSTANCE.getICustomers__ChangeCustomerEmail();

		/**
		 * The meta object literal for the '<em><b>Change Customer Phone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___CHANGE_CUSTOMER_PHONE = eINSTANCE.getICustomers__ChangeCustomerPhone();

		/**
		 * The meta object literal for the '<em><b>Get Customer First Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___GET_CUSTOMER_FIRST_NAME = eINSTANCE.getICustomers__GetCustomerFirstName();

		/**
		 * The meta object literal for the '<em><b>Get Customer Last Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___GET_CUSTOMER_LAST_NAME = eINSTANCE.getICustomers__GetCustomerLastName();

		/**
		 * The meta object literal for the '<em><b>Get Customer Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___GET_CUSTOMER_TITLE = eINSTANCE.getICustomers__GetCustomerTitle();

		/**
		 * The meta object literal for the '<em><b>Get Customer Email</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___GET_CUSTOMER_EMAIL = eINSTANCE.getICustomers__GetCustomerEmail();

		/**
		 * The meta object literal for the '<em><b>Get Customer Phone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___GET_CUSTOMER_PHONE = eINSTANCE.getICustomers__GetCustomerPhone();

		/**
		 * The meta object literal for the '<em><b>Search Customers</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___SEARCH_CUSTOMERS = eINSTANCE.getICustomers__SearchCustomers();

		/**
		 * The meta object literal for the '<em><b>Get Customer Bookings</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___GET_CUSTOMER_BOOKINGS = eINSTANCE.getICustomers__GetCustomerBookings();

		/**
		 * The meta object literal for the '<em><b>Get Customer Requests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___GET_CUSTOMER_REQUESTS = eINSTANCE.getICustomers__GetCustomerRequests();

		/**
		 * The meta object literal for the '<em><b>Add Customer Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___ADD_CUSTOMER_BOOKING = eINSTANCE.getICustomers__AddCustomerBooking();

		/**
		 * The meta object literal for the '<em><b>Remove Customer Booking</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___REMOVE_CUSTOMER_BOOKING = eINSTANCE.getICustomers__RemoveCustomerBooking();

		/**
		 * The meta object literal for the '<em><b>Add Customer Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___ADD_CUSTOMER_REQUEST = eINSTANCE.getICustomers__AddCustomerRequest();

		/**
		 * The meta object literal for the '<em><b>Remove Customer Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICUSTOMERS___REMOVE_CUSTOMER_REQUEST = eINSTANCE.getICustomers__RemoveCustomerRequest();

	}

} //CustomersPackage
