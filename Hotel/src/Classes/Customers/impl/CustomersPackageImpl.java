/**
 */
package Classes.Customers.impl;

import Classes.Accounts.AccountsPackage;

import Classes.Accounts.impl.AccountsPackageImpl;

import Classes.Banking.BankingPackage;

import Classes.Banking.impl.BankingPackageImpl;

import Classes.Bills.BillsPackage;

import Classes.Bills.impl.BillsPackageImpl;

import Classes.Bookables.BookablesPackage;

import Classes.Bookables.impl.BookablesPackageImpl;

import Classes.Bookings.BookingsPackage;

import Classes.Bookings.impl.BookingsPackageImpl;

import Classes.Customers.Customer;
import Classes.Customers.CustomersFactory;
import Classes.Customers.CustomersManager;
import Classes.Customers.CustomersPackage;
import Classes.Customers.ICustomers;

import Classes.Feedback.FeedbackPackage;

import Classes.Feedback.impl.FeedbackPackageImpl;

import Classes.Guests.GuestsPackage;

import Classes.Guests.impl.GuestsPackageImpl;

import Classes.Inventory.InventoryPackage;

import Classes.Inventory.impl.InventoryPackageImpl;

import Classes.Requests.RequestsPackage;

import Classes.Requests.impl.RequestsPackageImpl;

import Classes.Restaurants.RestaurantsPackage;

import Classes.Restaurants.impl.RestaurantsPackageImpl;

import Classes.Services.ServicesPackage;

import Classes.Services.impl.ServicesPackageImpl;

import Classes.Staff.StaffPackage;

import Classes.Staff.impl.StaffPackageImpl;

import Classes.Statistics.StatisticsPackage;

import Classes.Statistics.impl.StatisticsPackageImpl;

import Classes.Stays.StaysPackage;

import Classes.Stays.impl.StaysPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomersPackageImpl extends EPackageImpl implements CustomersPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customersManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iCustomersEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see Classes.Customers.CustomersPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CustomersPackageImpl() {
		super(eNS_URI, CustomersFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CustomersPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CustomersPackage init() {
		if (isInited) return (CustomersPackage)EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI);

		// Obtain or create and register package
		CustomersPackageImpl theCustomersPackage = (CustomersPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CustomersPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CustomersPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BookablesPackageImpl theBookablesPackage = (BookablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookablesPackage.eNS_URI) instanceof BookablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookablesPackage.eNS_URI) : BookablesPackage.eINSTANCE);
		StaysPackageImpl theStaysPackage = (StaysPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaysPackage.eNS_URI) instanceof StaysPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaysPackage.eNS_URI) : StaysPackage.eINSTANCE);
		BankingPackageImpl theBankingPackage = (BankingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BankingPackage.eNS_URI) instanceof BankingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BankingPackage.eNS_URI) : BankingPackage.eINSTANCE);
		BillsPackageImpl theBillsPackage = (BillsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BillsPackage.eNS_URI) instanceof BillsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BillsPackage.eNS_URI) : BillsPackage.eINSTANCE);
		GuestsPackageImpl theGuestsPackage = (GuestsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuestsPackage.eNS_URI) instanceof GuestsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuestsPackage.eNS_URI) : GuestsPackage.eINSTANCE);
		AccountsPackageImpl theAccountsPackage = (AccountsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AccountsPackage.eNS_URI) instanceof AccountsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AccountsPackage.eNS_URI) : AccountsPackage.eINSTANCE);
		BookingsPackageImpl theBookingsPackage = (BookingsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookingsPackage.eNS_URI) instanceof BookingsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookingsPackage.eNS_URI) : BookingsPackage.eINSTANCE);
		StatisticsPackageImpl theStatisticsPackage = (StatisticsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatisticsPackage.eNS_URI) instanceof StatisticsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatisticsPackage.eNS_URI) : StatisticsPackage.eINSTANCE);
		StaffPackageImpl theStaffPackage = (StaffPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) instanceof StaffPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) : StaffPackage.eINSTANCE);
		InventoryPackageImpl theInventoryPackage = (InventoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI) instanceof InventoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI) : InventoryPackage.eINSTANCE);
		RestaurantsPackageImpl theRestaurantsPackage = (RestaurantsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestaurantsPackage.eNS_URI) instanceof RestaurantsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestaurantsPackage.eNS_URI) : RestaurantsPackage.eINSTANCE);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) : ServicesPackage.eINSTANCE);
		FeedbackPackageImpl theFeedbackPackage = (FeedbackPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeedbackPackage.eNS_URI) instanceof FeedbackPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeedbackPackage.eNS_URI) : FeedbackPackage.eINSTANCE);
		RequestsPackageImpl theRequestsPackage = (RequestsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequestsPackage.eNS_URI) instanceof RequestsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequestsPackage.eNS_URI) : RequestsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theCustomersPackage.createPackageContents();
		theBookablesPackage.createPackageContents();
		theStaysPackage.createPackageContents();
		theBankingPackage.createPackageContents();
		theBillsPackage.createPackageContents();
		theGuestsPackage.createPackageContents();
		theAccountsPackage.createPackageContents();
		theBookingsPackage.createPackageContents();
		theStatisticsPackage.createPackageContents();
		theStaffPackage.createPackageContents();
		theInventoryPackage.createPackageContents();
		theRestaurantsPackage.createPackageContents();
		theServicesPackage.createPackageContents();
		theFeedbackPackage.createPackageContents();
		theRequestsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theCustomersPackage.initializePackageContents();
		theBookablesPackage.initializePackageContents();
		theStaysPackage.initializePackageContents();
		theBankingPackage.initializePackageContents();
		theBillsPackage.initializePackageContents();
		theGuestsPackage.initializePackageContents();
		theAccountsPackage.initializePackageContents();
		theBookingsPackage.initializePackageContents();
		theStatisticsPackage.initializePackageContents();
		theStaffPackage.initializePackageContents();
		theInventoryPackage.initializePackageContents();
		theRestaurantsPackage.initializePackageContents();
		theServicesPackage.initializePackageContents();
		theFeedbackPackage.initializePackageContents();
		theRequestsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCustomersPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CustomersPackage.eNS_URI, theCustomersPackage);
		return theCustomersPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomersManager() {
		return customersManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCustomersManager_Customer() {
		return (EReference)customersManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomer() {
		return customerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Firstname() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Lastname() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Title() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Email() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Phone() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Ssid() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Bookings() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomer_Requests() {
		return (EAttribute)customerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__GetFirstName() {
		return customerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__GetLastName() {
		return customerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__GetTitle() {
		return customerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__GetEmail() {
		return customerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__GetPhone() {
		return customerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__GetSSID() {
		return customerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__SetFirstName() {
		return customerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__SetLastName() {
		return customerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__SetTitle() {
		return customerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__SetEmail() {
		return customerEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__SetPhone() {
		return customerEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__AddBooking() {
		return customerEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__RemoveBooking() {
		return customerEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__AddRequest() {
		return customerEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__GetBookings() {
		return customerEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__RemoveRequest() {
		return customerEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCustomer__GetRequests() {
		return customerEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getICustomers() {
		return iCustomersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__GetAllCustomers() {
		return iCustomersEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__AddCustomer() {
		return iCustomersEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__ChangeCustomerFirstName() {
		return iCustomersEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__ChangeCustomerLastName() {
		return iCustomersEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__ChangeCustomerTitle() {
		return iCustomersEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__ChangeCustomerEmail() {
		return iCustomersEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__ChangeCustomerPhone() {
		return iCustomersEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__GetCustomerFirstName() {
		return iCustomersEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__GetCustomerLastName() {
		return iCustomersEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__GetCustomerTitle() {
		return iCustomersEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__GetCustomerEmail() {
		return iCustomersEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__GetCustomerPhone() {
		return iCustomersEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__SearchCustomers() {
		return iCustomersEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__GetCustomerBookings() {
		return iCustomersEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__GetCustomerRequests() {
		return iCustomersEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__AddCustomerBooking() {
		return iCustomersEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__RemoveCustomerBooking() {
		return iCustomersEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__AddCustomerRequest() {
		return iCustomersEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getICustomers__RemoveCustomerRequest() {
		return iCustomersEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomersFactory getCustomersFactory() {
		return (CustomersFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		customersManagerEClass = createEClass(CUSTOMERS_MANAGER);
		createEReference(customersManagerEClass, CUSTOMERS_MANAGER__CUSTOMER);

		customerEClass = createEClass(CUSTOMER);
		createEAttribute(customerEClass, CUSTOMER__FIRSTNAME);
		createEAttribute(customerEClass, CUSTOMER__LASTNAME);
		createEAttribute(customerEClass, CUSTOMER__TITLE);
		createEAttribute(customerEClass, CUSTOMER__EMAIL);
		createEAttribute(customerEClass, CUSTOMER__PHONE);
		createEAttribute(customerEClass, CUSTOMER__SSID);
		createEAttribute(customerEClass, CUSTOMER__BOOKINGS);
		createEAttribute(customerEClass, CUSTOMER__REQUESTS);
		createEOperation(customerEClass, CUSTOMER___GET_FIRST_NAME);
		createEOperation(customerEClass, CUSTOMER___GET_LAST_NAME);
		createEOperation(customerEClass, CUSTOMER___GET_TITLE);
		createEOperation(customerEClass, CUSTOMER___GET_EMAIL);
		createEOperation(customerEClass, CUSTOMER___GET_PHONE);
		createEOperation(customerEClass, CUSTOMER___GET_SSID);
		createEOperation(customerEClass, CUSTOMER___SET_FIRST_NAME);
		createEOperation(customerEClass, CUSTOMER___SET_LAST_NAME);
		createEOperation(customerEClass, CUSTOMER___SET_TITLE);
		createEOperation(customerEClass, CUSTOMER___SET_EMAIL);
		createEOperation(customerEClass, CUSTOMER___SET_PHONE);
		createEOperation(customerEClass, CUSTOMER___ADD_BOOKING);
		createEOperation(customerEClass, CUSTOMER___REMOVE_BOOKING);
		createEOperation(customerEClass, CUSTOMER___ADD_REQUEST);
		createEOperation(customerEClass, CUSTOMER___GET_BOOKINGS);
		createEOperation(customerEClass, CUSTOMER___REMOVE_REQUEST);
		createEOperation(customerEClass, CUSTOMER___GET_REQUESTS);

		iCustomersEClass = createEClass(ICUSTOMERS);
		createEOperation(iCustomersEClass, ICUSTOMERS___GET_ALL_CUSTOMERS);
		createEOperation(iCustomersEClass, ICUSTOMERS___ADD_CUSTOMER);
		createEOperation(iCustomersEClass, ICUSTOMERS___CHANGE_CUSTOMER_FIRST_NAME);
		createEOperation(iCustomersEClass, ICUSTOMERS___CHANGE_CUSTOMER_LAST_NAME);
		createEOperation(iCustomersEClass, ICUSTOMERS___CHANGE_CUSTOMER_TITLE);
		createEOperation(iCustomersEClass, ICUSTOMERS___CHANGE_CUSTOMER_EMAIL);
		createEOperation(iCustomersEClass, ICUSTOMERS___CHANGE_CUSTOMER_PHONE);
		createEOperation(iCustomersEClass, ICUSTOMERS___GET_CUSTOMER_FIRST_NAME);
		createEOperation(iCustomersEClass, ICUSTOMERS___GET_CUSTOMER_LAST_NAME);
		createEOperation(iCustomersEClass, ICUSTOMERS___GET_CUSTOMER_TITLE);
		createEOperation(iCustomersEClass, ICUSTOMERS___GET_CUSTOMER_EMAIL);
		createEOperation(iCustomersEClass, ICUSTOMERS___GET_CUSTOMER_PHONE);
		createEOperation(iCustomersEClass, ICUSTOMERS___SEARCH_CUSTOMERS);
		createEOperation(iCustomersEClass, ICUSTOMERS___GET_CUSTOMER_BOOKINGS);
		createEOperation(iCustomersEClass, ICUSTOMERS___GET_CUSTOMER_REQUESTS);
		createEOperation(iCustomersEClass, ICUSTOMERS___ADD_CUSTOMER_BOOKING);
		createEOperation(iCustomersEClass, ICUSTOMERS___REMOVE_CUSTOMER_BOOKING);
		createEOperation(iCustomersEClass, ICUSTOMERS___ADD_CUSTOMER_REQUEST);
		createEOperation(iCustomersEClass, ICUSTOMERS___REMOVE_CUSTOMER_REQUEST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		customersManagerEClass.getESuperTypes().add(this.getICustomers());

		// Initialize classes, features, and operations; add parameters
		initEClass(customersManagerEClass, CustomersManager.class, "CustomersManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCustomersManager_Customer(), this.getCustomer(), null, "customer", null, 0, -1, CustomersManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(customerEClass, Customer.class, "Customer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomer_Firstname(), theTypesPackage.getString(), "firstname", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Lastname(), theTypesPackage.getString(), "lastname", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Title(), theTypesPackage.getString(), "title", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Email(), theTypesPackage.getString(), "email", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Phone(), theTypesPackage.getString(), "phone", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Ssid(), theTypesPackage.getString(), "ssid", null, 1, 1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Bookings(), theTypesPackage.getString(), "bookings", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCustomer_Requests(), theTypesPackage.getString(), "requests", null, 0, -1, Customer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getCustomer__GetFirstName(), null, "getFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__GetLastName(), null, "getLastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__GetTitle(), null, "getTitle", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__GetEmail(), null, "getEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__GetPhone(), null, "getPhone", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__GetSSID(), null, "getSSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__SetFirstName(), null, "setFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__SetLastName(), null, "setLastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__SetTitle(), null, "setTitle", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__SetEmail(), null, "setEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__SetPhone(), null, "setPhone", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__AddBooking(), null, "addBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__RemoveBooking(), null, "removeBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__AddRequest(), null, "addRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__GetBookings(), null, "getBookings", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__RemoveRequest(), null, "removeRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getCustomer__GetRequests(), null, "getRequests", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iCustomersEClass, ICustomers.class, "ICustomers", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getICustomers__GetAllCustomers(), null, "getAllCustomers", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICustomers__AddCustomer(), null, "addCustomer", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICustomers__ChangeCustomerFirstName(), null, "changeCustomerFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICustomers__ChangeCustomerLastName(), null, "changeCustomerLastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICustomers__ChangeCustomerTitle(), null, "changeCustomerTitle", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICustomers__ChangeCustomerEmail(), null, "changeCustomerEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICustomers__ChangeCustomerPhone(), null, "changeCustomerPhone", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICustomers__GetCustomerFirstName(), null, "getCustomerFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICustomers__GetCustomerLastName(), null, "getCustomerLastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICustomers__GetCustomerTitle(), null, "getCustomerTitle", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICustomers__GetCustomerEmail(), null, "getCustomerEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICustomers__GetCustomerPhone(), null, "getCustomerPhone", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICustomers__SearchCustomers(), null, "searchCustomers", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICustomers__GetCustomerBookings(), null, "getCustomerBookings", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICustomers__GetCustomerRequests(), null, "getCustomerRequests", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICustomers__AddCustomerBooking(), null, "addCustomerBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICustomers__RemoveCustomerBooking(), null, "removeCustomerBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICustomers__AddCustomerRequest(), null, "addCustomerRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getICustomers__RemoveCustomerRequest(), null, "removeCustomerRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CustomersPackageImpl
