/**
 */
package Classes.Stays.impl;

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
import Classes.Stays.CreditCard;
import Classes.Stays.IStays;
import Classes.Stays.Stay;
import Classes.Stays.StaysFactory;
import Classes.Stays.StaysManager;
import Classes.Stays.StaysPackage;
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
public class StaysPackageImpl extends EPackageImpl implements StaysPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass creditCardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staysManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iStaysEClass = null;

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
	 * @see Classes.Stays.StaysPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StaysPackageImpl() {
		super(eNS_URI, StaysFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StaysPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StaysPackage init() {
		if (isInited) return (StaysPackage)EPackage.Registry.INSTANCE.getEPackage(StaysPackage.eNS_URI);

		// Obtain or create and register package
		StaysPackageImpl theStaysPackage = (StaysPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StaysPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StaysPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BookablesPackageImpl theBookablesPackage = (BookablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookablesPackage.eNS_URI) instanceof BookablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookablesPackage.eNS_URI) : BookablesPackage.eINSTANCE);
		BankingPackageImpl theBankingPackage = (BankingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BankingPackage.eNS_URI) instanceof BankingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BankingPackage.eNS_URI) : BankingPackage.eINSTANCE);
		BillsPackageImpl theBillsPackage = (BillsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BillsPackage.eNS_URI) instanceof BillsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BillsPackage.eNS_URI) : BillsPackage.eINSTANCE);
		GuestsPackageImpl theGuestsPackage = (GuestsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuestsPackage.eNS_URI) instanceof GuestsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuestsPackage.eNS_URI) : GuestsPackage.eINSTANCE);
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
		theStaysPackage.createPackageContents();
		theBookablesPackage.createPackageContents();
		theBankingPackage.createPackageContents();
		theBillsPackage.createPackageContents();
		theGuestsPackage.createPackageContents();
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
		theStaysPackage.initializePackageContents();
		theBookablesPackage.initializePackageContents();
		theBankingPackage.initializePackageContents();
		theBillsPackage.initializePackageContents();
		theGuestsPackage.initializePackageContents();
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
		theStaysPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StaysPackage.eNS_URI, theStaysPackage);
		return theStaysPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStay() {
		return stayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStay_ID() {
		return (EAttribute)stayEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStay_Bookable() {
		return (EAttribute)stayEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStay_Bills() {
		return (EAttribute)stayEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStay_CheckedInGuests() {
		return (EAttribute)stayEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStay_Booking() {
		return (EAttribute)stayEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStay_CheckedOutGuests() {
		return (EAttribute)stayEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStay_FromDate() {
		return (EAttribute)stayEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStay_ToDate() {
		return (EAttribute)stayEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStay_CreditCard() {
		return (EReference)stayEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStay__AddBill() {
		return stayEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStay__AddCheckedInGuest() {
		return stayEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStay__CheckOutGuest() {
		return stayEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreditCard() {
		return creditCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCard_CcNumber() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCard_Ccv() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCard_ExpiryMonth() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCard_ExpiryYear() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCard_FirstName() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreditCard_LastName() {
		return (EAttribute)creditCardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaysManager() {
		return staysManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaysManager_Stay() {
		return (EReference)staysManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaysManager_CustomerProvides() {
		return (EReference)staysManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaysManager_IBills() {
		return (EReference)staysManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaysManager_IGuests() {
		return (EReference)staysManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIStays() {
		return iStaysEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__CheckInGuest() {
		return iStaysEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__ChangeBookableOfStay() {
		return iStaysEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__AddNewStay() {
		return iStaysEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__RemoveStay() {
		return iStaysEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__AddBillToStay() {
		return iStaysEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__CheckOutGuest() {
		return iStaysEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__AddResponsibleCreditCard() {
		return iStaysEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__ChangeResponsibleCreditCard() {
		return iStaysEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__GetGuestsOfHotelStay() {
		return iStaysEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__GetBillsOfHotelStay__String() {
		return iStaysEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__GetBookableOfHotelStay() {
		return iStaysEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__GetBookingOfHotelStay() {
		return iStaysEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__GetAllHotelStayIDs() {
		return iStaysEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__GetCheckedInGuestsOfHotelStay() {
		return iStaysEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__GetCheckedOutGuestsOfHotelStay() {
		return iStaysEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__SearchHotelStays() {
		return iStaysEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__SearchHotelStaysWithinPeriod() {
		return iStaysEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__GetAllHotelStaysWithinPeriod() {
		return iStaysEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__GetAllUnpayedBillsOfHotelStay() {
		return iStaysEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__BillCreditCardWithAllUnpaidBillsOfHotelStay() {
		return iStaysEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__IsResponsibleCreditCardAdded() {
		return iStaysEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__ChangePeriodOfStay() {
		return iStaysEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStays__RemoveBillFromStay() {
		return iStaysEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaysFactory getStaysFactory() {
		return (StaysFactory)getEFactoryInstance();
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
		stayEClass = createEClass(STAY);
		createEAttribute(stayEClass, STAY__ID);
		createEAttribute(stayEClass, STAY__BOOKABLE);
		createEAttribute(stayEClass, STAY__BILLS);
		createEAttribute(stayEClass, STAY__CHECKED_IN_GUESTS);
		createEAttribute(stayEClass, STAY__BOOKING);
		createEAttribute(stayEClass, STAY__CHECKED_OUT_GUESTS);
		createEAttribute(stayEClass, STAY__FROM_DATE);
		createEAttribute(stayEClass, STAY__TO_DATE);
		createEReference(stayEClass, STAY__CREDIT_CARD);
		createEOperation(stayEClass, STAY___ADD_BILL);
		createEOperation(stayEClass, STAY___ADD_CHECKED_IN_GUEST);
		createEOperation(stayEClass, STAY___CHECK_OUT_GUEST);

		creditCardEClass = createEClass(CREDIT_CARD);
		createEAttribute(creditCardEClass, CREDIT_CARD__CC_NUMBER);
		createEAttribute(creditCardEClass, CREDIT_CARD__CCV);
		createEAttribute(creditCardEClass, CREDIT_CARD__EXPIRY_MONTH);
		createEAttribute(creditCardEClass, CREDIT_CARD__EXPIRY_YEAR);
		createEAttribute(creditCardEClass, CREDIT_CARD__FIRST_NAME);
		createEAttribute(creditCardEClass, CREDIT_CARD__LAST_NAME);

		staysManagerEClass = createEClass(STAYS_MANAGER);
		createEReference(staysManagerEClass, STAYS_MANAGER__STAY);
		createEReference(staysManagerEClass, STAYS_MANAGER__CUSTOMER_PROVIDES);
		createEReference(staysManagerEClass, STAYS_MANAGER__IBILLS);
		createEReference(staysManagerEClass, STAYS_MANAGER__IGUESTS);

		iStaysEClass = createEClass(ISTAYS);
		createEOperation(iStaysEClass, ISTAYS___CHECK_IN_GUEST);
		createEOperation(iStaysEClass, ISTAYS___CHANGE_BOOKABLE_OF_STAY);
		createEOperation(iStaysEClass, ISTAYS___ADD_NEW_STAY);
		createEOperation(iStaysEClass, ISTAYS___REMOVE_STAY);
		createEOperation(iStaysEClass, ISTAYS___ADD_BILL_TO_STAY);
		createEOperation(iStaysEClass, ISTAYS___CHECK_OUT_GUEST);
		createEOperation(iStaysEClass, ISTAYS___ADD_RESPONSIBLE_CREDIT_CARD);
		createEOperation(iStaysEClass, ISTAYS___CHANGE_RESPONSIBLE_CREDIT_CARD);
		createEOperation(iStaysEClass, ISTAYS___GET_GUESTS_OF_HOTEL_STAY);
		createEOperation(iStaysEClass, ISTAYS___GET_BILLS_OF_HOTEL_STAY__STRING);
		createEOperation(iStaysEClass, ISTAYS___GET_BOOKABLE_OF_HOTEL_STAY);
		createEOperation(iStaysEClass, ISTAYS___GET_BOOKING_OF_HOTEL_STAY);
		createEOperation(iStaysEClass, ISTAYS___GET_ALL_HOTEL_STAY_IDS);
		createEOperation(iStaysEClass, ISTAYS___GET_CHECKED_IN_GUESTS_OF_HOTEL_STAY);
		createEOperation(iStaysEClass, ISTAYS___GET_CHECKED_OUT_GUESTS_OF_HOTEL_STAY);
		createEOperation(iStaysEClass, ISTAYS___SEARCH_HOTEL_STAYS);
		createEOperation(iStaysEClass, ISTAYS___SEARCH_HOTEL_STAYS_WITHIN_PERIOD);
		createEOperation(iStaysEClass, ISTAYS___GET_ALL_HOTEL_STAYS_WITHIN_PERIOD);
		createEOperation(iStaysEClass, ISTAYS___GET_ALL_UNPAYED_BILLS_OF_HOTEL_STAY);
		createEOperation(iStaysEClass, ISTAYS___BILL_CREDIT_CARD_WITH_ALL_UNPAID_BILLS_OF_HOTEL_STAY);
		createEOperation(iStaysEClass, ISTAYS___IS_RESPONSIBLE_CREDIT_CARD_ADDED);
		createEOperation(iStaysEClass, ISTAYS___CHANGE_PERIOD_OF_STAY);
		createEOperation(iStaysEClass, ISTAYS___REMOVE_BILL_FROM_STAY);
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
		BankingPackage theBankingPackage = (BankingPackage)EPackage.Registry.INSTANCE.getEPackage(BankingPackage.eNS_URI);
		BillsPackage theBillsPackage = (BillsPackage)EPackage.Registry.INSTANCE.getEPackage(BillsPackage.eNS_URI);
		GuestsPackage theGuestsPackage = (GuestsPackage)EPackage.Registry.INSTANCE.getEPackage(GuestsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		staysManagerEClass.getESuperTypes().add(this.getIStays());

		// Initialize classes, features, and operations; add parameters
		initEClass(stayEClass, Stay.class, "Stay", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStay_ID(), theTypesPackage.getString(), "ID", null, 1, 1, Stay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStay_Bookable(), theTypesPackage.getString(), "bookable", null, 1, 1, Stay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStay_Bills(), theTypesPackage.getString(), "bills", null, 0, -1, Stay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStay_CheckedInGuests(), theTypesPackage.getString(), "checkedInGuests", null, 0, -1, Stay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStay_Booking(), theTypesPackage.getString(), "booking", null, 1, 1, Stay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStay_CheckedOutGuests(), theTypesPackage.getString(), "checkedOutGuests", null, 0, -1, Stay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStay_FromDate(), ecorePackage.getEDate(), "fromDate", null, 1, 1, Stay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStay_ToDate(), ecorePackage.getEDate(), "toDate", null, 1, 1, Stay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStay_CreditCard(), this.getCreditCard(), null, "creditCard", null, 1, 1, Stay.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getStay__AddBill(), null, "addBill", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStay__AddCheckedInGuest(), null, "addCheckedInGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getStay__CheckOutGuest(), null, "checkOutGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(creditCardEClass, CreditCard.class, "CreditCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCreditCard_CcNumber(), theTypesPackage.getString(), "ccNumber", null, 1, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCard_Ccv(), theTypesPackage.getString(), "ccv", null, 1, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCard_ExpiryMonth(), theTypesPackage.getInteger(), "expiryMonth", null, 1, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCard_ExpiryYear(), theTypesPackage.getInteger(), "expiryYear", null, 1, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCard_FirstName(), theTypesPackage.getString(), "firstName", null, 1, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCreditCard_LastName(), theTypesPackage.getString(), "lastName", null, 1, 1, CreditCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(staysManagerEClass, StaysManager.class, "StaysManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaysManager_Stay(), this.getStay(), null, "stay", null, 0, -1, StaysManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStaysManager_CustomerProvides(), theBankingPackage.getCustomerProvides(), null, "customerProvides", null, 1, 1, StaysManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStaysManager_IBills(), theBillsPackage.getIBills(), null, "iBills", null, 1, 1, StaysManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStaysManager_IGuests(), theGuestsPackage.getIGuests(), null, "iGuests", null, 1, 1, StaysManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iStaysEClass, IStays.class, "IStays", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIStays__CheckInGuest(), null, "checkInGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__ChangeBookableOfStay(), null, "changeBookableOfStay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__AddNewStay(), null, "addNewStay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__RemoveStay(), null, "removeStay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__AddBillToStay(), null, "addBillToStay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__CheckOutGuest(), null, "checkOutGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__AddResponsibleCreditCard(), null, "addResponsibleCreditCard", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__ChangeResponsibleCreditCard(), null, "changeResponsibleCreditCard", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__GetGuestsOfHotelStay(), null, "getGuestsOfHotelStay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getIStays__GetBillsOfHotelStay__String(), null, "getBillsOfHotelStay", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "stayID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__GetBookableOfHotelStay(), null, "getBookableOfHotelStay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__GetBookingOfHotelStay(), null, "getBookingOfHotelStay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__GetAllHotelStayIDs(), null, "getAllHotelStayIDs", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__GetCheckedInGuestsOfHotelStay(), null, "getCheckedInGuestsOfHotelStay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__GetCheckedOutGuestsOfHotelStay(), null, "getCheckedOutGuestsOfHotelStay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__SearchHotelStays(), null, "searchHotelStays", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__SearchHotelStaysWithinPeriod(), null, "searchHotelStaysWithinPeriod", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__GetAllHotelStaysWithinPeriod(), null, "getAllHotelStaysWithinPeriod", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__GetAllUnpayedBillsOfHotelStay(), null, "getAllUnpayedBillsOfHotelStay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__BillCreditCardWithAllUnpaidBillsOfHotelStay(), null, "billCreditCardWithAllUnpaidBillsOfHotelStay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__IsResponsibleCreditCardAdded(), null, "isResponsibleCreditCardAdded", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__ChangePeriodOfStay(), null, "changePeriodOfStay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIStays__RemoveBillFromStay(), null, "removeBillFromStay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //StaysPackageImpl
