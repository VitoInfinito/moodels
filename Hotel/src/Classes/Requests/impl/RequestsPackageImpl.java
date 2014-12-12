/**
 */
package Classes.Requests.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.types.impl.TypesPackageImpl;

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
import Classes.Customers.CustomersPackage;
import Classes.Customers.impl.CustomersPackageImpl;
import Classes.Feedback.FeedbackPackage;
import Classes.Feedback.impl.FeedbackPackageImpl;
import Classes.Guests.GuestsPackage;
import Classes.Guests.impl.GuestsPackageImpl;
import Classes.Inventory.InventoryPackage;
import Classes.Inventory.impl.InventoryPackageImpl;
import Classes.Requests.IRequests;
import Classes.Requests.Request;
import Classes.Requests.RequestsFactory;
import Classes.Requests.RequestsManager;
import Classes.Requests.RequestsPackage;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RequestsPackageImpl extends EPackageImpl implements RequestsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRequestsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestsManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestEClass = null;

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
	 * @see Classes.Requests.RequestsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RequestsPackageImpl() {
		super(eNS_URI, RequestsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RequestsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RequestsPackage init() {
		if (isInited) return (RequestsPackage)EPackage.Registry.INSTANCE.getEPackage(RequestsPackage.eNS_URI);

		// Obtain or create and register package
		RequestsPackageImpl theRequestsPackage = (RequestsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RequestsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RequestsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BookablesPackageImpl theBookablesPackage = (BookablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookablesPackage.eNS_URI) instanceof BookablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookablesPackage.eNS_URI) : BookablesPackage.eINSTANCE);
		StaysPackageImpl theStaysPackage = (StaysPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaysPackage.eNS_URI) instanceof StaysPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaysPackage.eNS_URI) : StaysPackage.eINSTANCE);
		BankingPackageImpl theBankingPackage = (BankingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BankingPackage.eNS_URI) instanceof BankingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BankingPackage.eNS_URI) : BankingPackage.eINSTANCE);
		BillsPackageImpl theBillsPackage = (BillsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BillsPackage.eNS_URI) instanceof BillsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BillsPackage.eNS_URI) : BillsPackage.eINSTANCE);
		InventoryPackageImpl theInventoryPackage = (InventoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI) instanceof InventoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI) : InventoryPackage.eINSTANCE);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) : ServicesPackage.eINSTANCE);
		GuestsPackageImpl theGuestsPackage = (GuestsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuestsPackage.eNS_URI) instanceof GuestsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuestsPackage.eNS_URI) : GuestsPackage.eINSTANCE);
		AccountsPackageImpl theAccountsPackage = (AccountsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AccountsPackage.eNS_URI) instanceof AccountsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AccountsPackage.eNS_URI) : AccountsPackage.eINSTANCE);
		BookingsPackageImpl theBookingsPackage = (BookingsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookingsPackage.eNS_URI) instanceof BookingsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookingsPackage.eNS_URI) : BookingsPackage.eINSTANCE);
		CustomersPackageImpl theCustomersPackage = (CustomersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) instanceof CustomersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) : CustomersPackage.eINSTANCE);
		StatisticsPackageImpl theStatisticsPackage = (StatisticsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatisticsPackage.eNS_URI) instanceof StatisticsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatisticsPackage.eNS_URI) : StatisticsPackage.eINSTANCE);
		StaffPackageImpl theStaffPackage = (StaffPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) instanceof StaffPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) : StaffPackage.eINSTANCE);
		RestaurantsPackageImpl theRestaurantsPackage = (RestaurantsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestaurantsPackage.eNS_URI) instanceof RestaurantsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestaurantsPackage.eNS_URI) : RestaurantsPackage.eINSTANCE);
		FeedbackPackageImpl theFeedbackPackage = (FeedbackPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeedbackPackage.eNS_URI) instanceof FeedbackPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeedbackPackage.eNS_URI) : FeedbackPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theRequestsPackage.createPackageContents();
		theBookablesPackage.createPackageContents();
		theStaysPackage.createPackageContents();
		theBankingPackage.createPackageContents();
		theBillsPackage.createPackageContents();
		theInventoryPackage.createPackageContents();
		theServicesPackage.createPackageContents();
		theGuestsPackage.createPackageContents();
		theAccountsPackage.createPackageContents();
		theBookingsPackage.createPackageContents();
		theCustomersPackage.createPackageContents();
		theStatisticsPackage.createPackageContents();
		theStaffPackage.createPackageContents();
		theRestaurantsPackage.createPackageContents();
		theFeedbackPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theRequestsPackage.initializePackageContents();
		theBookablesPackage.initializePackageContents();
		theStaysPackage.initializePackageContents();
		theBankingPackage.initializePackageContents();
		theBillsPackage.initializePackageContents();
		theInventoryPackage.initializePackageContents();
		theServicesPackage.initializePackageContents();
		theGuestsPackage.initializePackageContents();
		theAccountsPackage.initializePackageContents();
		theBookingsPackage.initializePackageContents();
		theCustomersPackage.initializePackageContents();
		theStatisticsPackage.initializePackageContents();
		theStaffPackage.initializePackageContents();
		theRestaurantsPackage.initializePackageContents();
		theFeedbackPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRequestsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RequestsPackage.eNS_URI, theRequestsPackage);
		return theRequestsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRequests() {
		return iRequestsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRequests__GetRequestDescription__String() {
		return iRequestsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRequests__HasRequestBeenResolved__String() {
		return iRequestsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRequests__SetRequestResolved__String() {
		return iRequestsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRequests__DeleteRequest__String() {
		return iRequestsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRequests__ChangeRequestDesc__String_String() {
		return iRequestsEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRequests__SearchRequests__String() {
		return iRequestsEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRequests__GetAllRequestIDs() {
		return iRequestsEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRequests__SetRequestDescription__String_String() {
		return iRequestsEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRequests__AddRequest__String_String() {
		return iRequestsEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRequests__CreateRequest__String() {
		return iRequestsEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestsManager() {
		return requestsManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequestsManager_SpecialRequest() {
		return (EReference)requestsManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequest() {
		return requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Id() {
		return (EAttribute)requestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_Description() {
		return (EAttribute)requestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequest_IsResolved() {
		return (EAttribute)requestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestsFactory getRequestsFactory() {
		return (RequestsFactory)getEFactoryInstance();
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
		iRequestsEClass = createEClass(IREQUESTS);
		createEOperation(iRequestsEClass, IREQUESTS___GET_REQUEST_DESCRIPTION__STRING);
		createEOperation(iRequestsEClass, IREQUESTS___HAS_REQUEST_BEEN_RESOLVED__STRING);
		createEOperation(iRequestsEClass, IREQUESTS___SET_REQUEST_RESOLVED__STRING);
		createEOperation(iRequestsEClass, IREQUESTS___DELETE_REQUEST__STRING);
		createEOperation(iRequestsEClass, IREQUESTS___CHANGE_REQUEST_DESC__STRING_STRING);
		createEOperation(iRequestsEClass, IREQUESTS___SEARCH_REQUESTS__STRING);
		createEOperation(iRequestsEClass, IREQUESTS___GET_ALL_REQUEST_IDS);
		createEOperation(iRequestsEClass, IREQUESTS___SET_REQUEST_DESCRIPTION__STRING_STRING);
		createEOperation(iRequestsEClass, IREQUESTS___ADD_REQUEST__STRING_STRING);
		createEOperation(iRequestsEClass, IREQUESTS___CREATE_REQUEST__STRING);

		requestsManagerEClass = createEClass(REQUESTS_MANAGER);
		createEReference(requestsManagerEClass, REQUESTS_MANAGER__SPECIAL_REQUEST);

		requestEClass = createEClass(REQUEST);
		createEAttribute(requestEClass, REQUEST__ID);
		createEAttribute(requestEClass, REQUEST__DESCRIPTION);
		createEAttribute(requestEClass, REQUEST__IS_RESOLVED);
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
		requestsManagerEClass.getESuperTypes().add(this.getIRequests());

		// Initialize classes, features, and operations; add parameters
		initEClass(iRequestsEClass, IRequests.class, "IRequests", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getIRequests__GetRequestDescription__String(), theTypesPackage.getString(), "getRequestDescription", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "specialRequestId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRequests__HasRequestBeenResolved__String(), theTypesPackage.getBoolean(), "hasRequestBeenResolved", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "specialRequestId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRequests__SetRequestResolved__String(), null, "setRequestResolved", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SpecialRequestId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRequests__DeleteRequest__String(), null, "deleteRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "specialRequestId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRequests__ChangeRequestDesc__String_String(), null, "changeRequestDesc", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "specialRequestId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRequests__SearchRequests__String(), theTypesPackage.getString(), "searchRequests", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "keyword", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRequests__GetAllRequestIDs(), theTypesPackage.getString(), "getAllRequestIDs", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRequests__SetRequestDescription__String_String(), null, "setRequestDescription", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "specialRequestId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRequests__AddRequest__String_String(), null, "addRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "specialRequestId", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRequests__CreateRequest__String(), null, "createRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(requestsManagerEClass, RequestsManager.class, "RequestsManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequestsManager_SpecialRequest(), this.getRequest(), null, "specialRequest", null, 0, -1, RequestsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(requestEClass, Request.class, "Request", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRequest_Id(), theTypesPackage.getString(), "id", null, 1, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequest_Description(), theTypesPackage.getString(), "description", null, 1, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRequest_IsResolved(), theTypesPackage.getBoolean(), "isResolved", null, 1, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RequestsPackageImpl
