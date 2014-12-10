/**
 */
package Classes.Guests.impl;

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
import Classes.Guests.Guest;
import Classes.Guests.GuestsFactory;
import Classes.Guests.GuestsManager;
import Classes.Guests.GuestsPackage;
import Classes.Guests.IGuests;
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
public class GuestsPackageImpl extends EPackageImpl implements GuestsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestsManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass guestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iGuestsEClass = null;

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
	 * @see Classes.Guests.GuestsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GuestsPackageImpl() {
		super(eNS_URI, GuestsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GuestsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GuestsPackage init() {
		if (isInited) return (GuestsPackage)EPackage.Registry.INSTANCE.getEPackage(GuestsPackage.eNS_URI);

		// Obtain or create and register package
		GuestsPackageImpl theGuestsPackage = (GuestsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GuestsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GuestsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BookablesPackageImpl theBookablesPackage = (BookablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookablesPackage.eNS_URI) instanceof BookablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookablesPackage.eNS_URI) : BookablesPackage.eINSTANCE);
		StaysPackageImpl theStaysPackage = (StaysPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaysPackage.eNS_URI) instanceof StaysPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaysPackage.eNS_URI) : StaysPackage.eINSTANCE);
		BankingPackageImpl theBankingPackage = (BankingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BankingPackage.eNS_URI) instanceof BankingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BankingPackage.eNS_URI) : BankingPackage.eINSTANCE);
		BillsPackageImpl theBillsPackage = (BillsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BillsPackage.eNS_URI) instanceof BillsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BillsPackage.eNS_URI) : BillsPackage.eINSTANCE);
		AccountsPackageImpl theAccountsPackage = (AccountsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AccountsPackage.eNS_URI) instanceof AccountsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AccountsPackage.eNS_URI) : AccountsPackage.eINSTANCE);
		BookingsPackageImpl theBookingsPackage = (BookingsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookingsPackage.eNS_URI) instanceof BookingsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookingsPackage.eNS_URI) : BookingsPackage.eINSTANCE);
		CustomersPackageImpl theCustomersPackage = (CustomersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) instanceof CustomersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) : CustomersPackage.eINSTANCE);
		StatisticsPackageImpl theStatisticsPackage = (StatisticsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatisticsPackage.eNS_URI) instanceof StatisticsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatisticsPackage.eNS_URI) : StatisticsPackage.eINSTANCE);
		StaffPackageImpl theStaffPackage = (StaffPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) instanceof StaffPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) : StaffPackage.eINSTANCE);
		InventoryPackageImpl theInventoryPackage = (InventoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI) instanceof InventoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI) : InventoryPackage.eINSTANCE);
		RestaurantsPackageImpl theRestaurantsPackage = (RestaurantsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestaurantsPackage.eNS_URI) instanceof RestaurantsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestaurantsPackage.eNS_URI) : RestaurantsPackage.eINSTANCE);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) : ServicesPackage.eINSTANCE);
		FeedbackPackageImpl theFeedbackPackage = (FeedbackPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeedbackPackage.eNS_URI) instanceof FeedbackPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeedbackPackage.eNS_URI) : FeedbackPackage.eINSTANCE);
		RequestsPackageImpl theRequestsPackage = (RequestsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequestsPackage.eNS_URI) instanceof RequestsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequestsPackage.eNS_URI) : RequestsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theGuestsPackage.createPackageContents();
		theBookablesPackage.createPackageContents();
		theStaysPackage.createPackageContents();
		theBankingPackage.createPackageContents();
		theBillsPackage.createPackageContents();
		theAccountsPackage.createPackageContents();
		theBookingsPackage.createPackageContents();
		theCustomersPackage.createPackageContents();
		theStatisticsPackage.createPackageContents();
		theStaffPackage.createPackageContents();
		theInventoryPackage.createPackageContents();
		theRestaurantsPackage.createPackageContents();
		theServicesPackage.createPackageContents();
		theFeedbackPackage.createPackageContents();
		theRequestsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theGuestsPackage.initializePackageContents();
		theBookablesPackage.initializePackageContents();
		theStaysPackage.initializePackageContents();
		theBankingPackage.initializePackageContents();
		theBillsPackage.initializePackageContents();
		theAccountsPackage.initializePackageContents();
		theBookingsPackage.initializePackageContents();
		theCustomersPackage.initializePackageContents();
		theStatisticsPackage.initializePackageContents();
		theStaffPackage.initializePackageContents();
		theInventoryPackage.initializePackageContents();
		theRestaurantsPackage.initializePackageContents();
		theServicesPackage.initializePackageContents();
		theFeedbackPackage.initializePackageContents();
		theRequestsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGuestsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GuestsPackage.eNS_URI, theGuestsPackage);
		return theGuestsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuestsManager() {
		return guestsManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuestsManager_Guests() {
		return (EReference)guestsManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGuestsManager_IManageAccounts() {
		return (EReference)guestsManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGuest() {
		return guestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_Firstname() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_Lastname() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_Title() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_Email() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_Phone() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_Ssid() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_Requests() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_Stays() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGuest_Account() {
		return (EAttribute)guestEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuest__AddStay() {
		return guestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuest__RemoveStay() {
		return guestEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuest__AddRequest() {
		return guestEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGuest__RemoveRequest() {
		return guestEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIGuests() {
		return iGuestsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__GetAllGuests() {
		return iGuestsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__AddGuest__String_String_String_String_String_String() {
		return iGuestsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__ChangeGuestFirstName__String_String() {
		return iGuestsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__ChangeGuestLastName__String_String() {
		return iGuestsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__ChangeGuestTitle__String_String() {
		return iGuestsEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__ChangeGuestEmail__String_String() {
		return iGuestsEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__ChangeGuestPhone__String_String() {
		return iGuestsEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__GetGuestFirstName__String() {
		return iGuestsEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__GetGuestLastName__String() {
		return iGuestsEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__GetGuestTitle__String() {
		return iGuestsEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__GetGuestEmail__String() {
		return iGuestsEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__GetGuestPhone__String() {
		return iGuestsEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__SearchGuests__String() {
		return iGuestsEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__GetGuestStays__String() {
		return iGuestsEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__GetGuestRequests__String() {
		return iGuestsEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__RemoveGuestStay__String_String() {
		return iGuestsEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__AddGuestRequest__String_String() {
		return iGuestsEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__RemoveGuestRequest__String_String() {
		return iGuestsEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__GetGuestAccountUsername__String() {
		return iGuestsEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__GetGuestAccountPassword__String() {
		return iGuestsEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__GenerateGuestAccount__String() {
		return iGuestsEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIGuests__RemoveGuestAccount__String() {
		return iGuestsEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestsFactory getGuestsFactory() {
		return (GuestsFactory)getEFactoryInstance();
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
		guestsManagerEClass = createEClass(GUESTS_MANAGER);
		createEReference(guestsManagerEClass, GUESTS_MANAGER__GUESTS);
		createEReference(guestsManagerEClass, GUESTS_MANAGER__IMANAGE_ACCOUNTS);

		guestEClass = createEClass(GUEST);
		createEAttribute(guestEClass, GUEST__FIRSTNAME);
		createEAttribute(guestEClass, GUEST__LASTNAME);
		createEAttribute(guestEClass, GUEST__TITLE);
		createEAttribute(guestEClass, GUEST__EMAIL);
		createEAttribute(guestEClass, GUEST__PHONE);
		createEAttribute(guestEClass, GUEST__SSID);
		createEAttribute(guestEClass, GUEST__REQUESTS);
		createEAttribute(guestEClass, GUEST__STAYS);
		createEAttribute(guestEClass, GUEST__ACCOUNT);
		createEOperation(guestEClass, GUEST___ADD_STAY);
		createEOperation(guestEClass, GUEST___REMOVE_STAY);
		createEOperation(guestEClass, GUEST___ADD_REQUEST);
		createEOperation(guestEClass, GUEST___REMOVE_REQUEST);

		iGuestsEClass = createEClass(IGUESTS);
		createEOperation(iGuestsEClass, IGUESTS___GET_ALL_GUESTS);
		createEOperation(iGuestsEClass, IGUESTS___ADD_GUEST__STRING_STRING_STRING_STRING_STRING_STRING);
		createEOperation(iGuestsEClass, IGUESTS___CHANGE_GUEST_FIRST_NAME__STRING_STRING);
		createEOperation(iGuestsEClass, IGUESTS___CHANGE_GUEST_LAST_NAME__STRING_STRING);
		createEOperation(iGuestsEClass, IGUESTS___CHANGE_GUEST_TITLE__STRING_STRING);
		createEOperation(iGuestsEClass, IGUESTS___CHANGE_GUEST_EMAIL__STRING_STRING);
		createEOperation(iGuestsEClass, IGUESTS___CHANGE_GUEST_PHONE__STRING_STRING);
		createEOperation(iGuestsEClass, IGUESTS___GET_GUEST_FIRST_NAME__STRING);
		createEOperation(iGuestsEClass, IGUESTS___GET_GUEST_LAST_NAME__STRING);
		createEOperation(iGuestsEClass, IGUESTS___GET_GUEST_TITLE__STRING);
		createEOperation(iGuestsEClass, IGUESTS___GET_GUEST_EMAIL__STRING);
		createEOperation(iGuestsEClass, IGUESTS___GET_GUEST_PHONE__STRING);
		createEOperation(iGuestsEClass, IGUESTS___SEARCH_GUESTS__STRING);
		createEOperation(iGuestsEClass, IGUESTS___GET_GUEST_STAYS__STRING);
		createEOperation(iGuestsEClass, IGUESTS___GET_GUEST_REQUESTS__STRING);
		createEOperation(iGuestsEClass, IGUESTS___REMOVE_GUEST_STAY__STRING_STRING);
		createEOperation(iGuestsEClass, IGUESTS___ADD_GUEST_REQUEST__STRING_STRING);
		createEOperation(iGuestsEClass, IGUESTS___REMOVE_GUEST_REQUEST__STRING_STRING);
		createEOperation(iGuestsEClass, IGUESTS___GET_GUEST_ACCOUNT_USERNAME__STRING);
		createEOperation(iGuestsEClass, IGUESTS___GET_GUEST_ACCOUNT_PASSWORD__STRING);
		createEOperation(iGuestsEClass, IGUESTS___GENERATE_GUEST_ACCOUNT__STRING);
		createEOperation(iGuestsEClass, IGUESTS___REMOVE_GUEST_ACCOUNT__STRING);
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
		AccountsPackage theAccountsPackage = (AccountsPackage)EPackage.Registry.INSTANCE.getEPackage(AccountsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		guestsManagerEClass.getESuperTypes().add(this.getIGuests());

		// Initialize classes, features, and operations; add parameters
		initEClass(guestsManagerEClass, GuestsManager.class, "GuestsManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGuestsManager_Guests(), this.getGuest(), null, "guests", null, 0, -1, GuestsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getGuestsManager_IManageAccounts(), theAccountsPackage.getIManageAccounts(), null, "iManageAccounts", null, 1, 1, GuestsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(guestEClass, Guest.class, "Guest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGuest_Firstname(), theTypesPackage.getString(), "firstname", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_Lastname(), theTypesPackage.getString(), "lastname", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_Title(), theTypesPackage.getString(), "title", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_Email(), theTypesPackage.getString(), "email", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_Phone(), theTypesPackage.getString(), "phone", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_Ssid(), theTypesPackage.getString(), "ssid", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_Requests(), theTypesPackage.getString(), "requests", null, 0, -1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_Stays(), theTypesPackage.getString(), "stays", null, 0, -1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getGuest_Account(), theTypesPackage.getString(), "account", null, 1, 1, Guest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getGuest__AddStay(), null, "addStay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGuest__RemoveStay(), null, "removeStay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGuest__AddRequest(), null, "addRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getGuest__RemoveRequest(), null, "removeRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iGuestsEClass, IGuests.class, "IGuests", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIGuests__GetAllGuests(), this.getGuest(), "getAllGuests", 0, -1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getIGuests__AddGuest__String_String_String_String_String_String(), null, "addGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "title", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "phone", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__ChangeGuestFirstName__String_String(), null, "changeGuestFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__ChangeGuestLastName__String_String(), null, "changeGuestLastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__ChangeGuestTitle__String_String(), null, "changeGuestTitle", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "title", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__ChangeGuestEmail__String_String(), null, "changeGuestEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "eMail", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__ChangeGuestPhone__String_String(), null, "changeGuestPhone", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "phoneNr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__GetGuestFirstName__String(), theTypesPackage.getString(), "getGuestFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__GetGuestLastName__String(), theTypesPackage.getString(), "getGuestLastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__GetGuestTitle__String(), theTypesPackage.getString(), "getGuestTitle", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__GetGuestEmail__String(), theTypesPackage.getString(), "getGuestEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__GetGuestPhone__String(), theTypesPackage.getString(), "getGuestPhone", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__SearchGuests__String(), theTypesPackage.getString(), "searchGuests", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "keyword", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__GetGuestStays__String(), theTypesPackage.getString(), "getGuestStays", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__GetGuestRequests__String(), theTypesPackage.getString(), "getGuestRequests", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__RemoveGuestStay__String_String(), null, "removeGuestStay", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "stayID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__AddGuestRequest__String_String(), null, "addGuestRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "requestID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__RemoveGuestRequest__String_String(), null, "removeGuestRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "requestID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__GetGuestAccountUsername__String(), theTypesPackage.getString(), "getGuestAccountUsername", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__GetGuestAccountPassword__String(), theTypesPackage.getString(), "getGuestAccountPassword", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__GenerateGuestAccount__String(), null, "generateGuestAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIGuests__RemoveGuestAccount__String(), null, "removeGuestAccount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GuestsPackageImpl
