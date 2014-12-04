/**
 */
package Classes.Bookings.impl;

import Classes.Accounts.AccountsPackage;
import Classes.Accounts.impl.AccountsPackageImpl;
import Classes.Banking.BankingPackage;
import Classes.Banking.impl.BankingPackageImpl;
import Classes.Bills.BillsPackage;
import Classes.Bills.impl.BillsPackageImpl;
import Classes.Bookables.BookablesPackage;
import Classes.Bookables.impl.BookablesPackageImpl;
import Classes.Bookings.Booking;
import Classes.Bookings.BookingsFactory;
import Classes.Bookings.BookingsManager;
import Classes.Bookings.BookingsPackage;
import Classes.Bookings.IBookings;
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
public class BookingsPackageImpl extends EPackageImpl implements BookingsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookingsManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBookingsEClass = null;

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
	 * @see Classes.Bookings.BookingsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BookingsPackageImpl() {
		super(eNS_URI, BookingsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BookingsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BookingsPackage init() {
		if (isInited) return (BookingsPackage)EPackage.Registry.INSTANCE.getEPackage(BookingsPackage.eNS_URI);

		// Obtain or create and register package
		BookingsPackageImpl theBookingsPackage = (BookingsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BookingsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BookingsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BookablesPackageImpl theBookablesPackage = (BookablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookablesPackage.eNS_URI) instanceof BookablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookablesPackage.eNS_URI) : BookablesPackage.eINSTANCE);
		StaysPackageImpl theStaysPackage = (StaysPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaysPackage.eNS_URI) instanceof StaysPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaysPackage.eNS_URI) : StaysPackage.eINSTANCE);
		BankingPackageImpl theBankingPackage = (BankingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BankingPackage.eNS_URI) instanceof BankingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BankingPackage.eNS_URI) : BankingPackage.eINSTANCE);
		BillsPackageImpl theBillsPackage = (BillsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BillsPackage.eNS_URI) instanceof BillsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BillsPackage.eNS_URI) : BillsPackage.eINSTANCE);
		GuestsPackageImpl theGuestsPackage = (GuestsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuestsPackage.eNS_URI) instanceof GuestsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuestsPackage.eNS_URI) : GuestsPackage.eINSTANCE);
		AccountsPackageImpl theAccountsPackage = (AccountsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AccountsPackage.eNS_URI) instanceof AccountsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AccountsPackage.eNS_URI) : AccountsPackage.eINSTANCE);
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
		theBookingsPackage.createPackageContents();
		theBookablesPackage.createPackageContents();
		theStaysPackage.createPackageContents();
		theBankingPackage.createPackageContents();
		theBillsPackage.createPackageContents();
		theGuestsPackage.createPackageContents();
		theAccountsPackage.createPackageContents();
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
		theBookingsPackage.initializePackageContents();
		theBookablesPackage.initializePackageContents();
		theStaysPackage.initializePackageContents();
		theBankingPackage.initializePackageContents();
		theBillsPackage.initializePackageContents();
		theGuestsPackage.initializePackageContents();
		theAccountsPackage.initializePackageContents();
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
		theBookingsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BookingsPackage.eNS_URI, theBookingsPackage);
		return theBookingsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooking() {
		return bookingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_BookedStays() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Customer() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_BookingNbr() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_NbrGuests() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_IssueDate() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBooking_CreditCard() {
		return (EReference)bookingEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooking_Requests() {
		return (EAttribute)bookingEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__AddBookedStay() {
		return bookingEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBooking__CancelBookedStay() {
		return bookingEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookingsManager() {
		return bookingsManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingsManager_Booking() {
		return (EReference)bookingsManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingsManager_IBookableAccess() {
		return (EReference)bookingsManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingsManager_IHotelStayManager() {
		return (EReference)bookingsManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingsManager_Bank() {
		return (EReference)bookingsManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingsManager_IGuest() {
		return (EReference)bookingsManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingsManager_ICustomer() {
		return (EReference)bookingsManagerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookingsManager_IBills() {
		return (EReference)bookingsManagerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBookings() {
		return iBookingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__MakeBooking() {
		return iBookingsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__SearchBookings() {
		return iBookingsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__GetBookedStaysOfBooking() {
		return iBookingsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__GetCustomerOfBooking() {
		return iBookingsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__GetNbrGuestOfBooking() {
		return iBookingsEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__CancelBooking() {
		return iBookingsEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__CancelStayOfBooking() {
		return iBookingsEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__AddBookedStayToBooking() {
		return iBookingsEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__ChangeNbrGuestsOfBooking() {
		return iBookingsEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__GetAllBookings() {
		return iBookingsEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__GetAllBookingsWithinPeriod() {
		return iBookingsEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__GetAllBookingsWithStaysInPeriod() {
		return iBookingsEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__SearchBookingsMadeInPeriod() {
		return iBookingsEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__SearchBookingsWithStaysInPeriod() {
		return iBookingsEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__SearchForAvailableBookablesInPeriod__Date_Date() {
		return iBookingsEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__GetAvailableBookablesInPeriod() {
		return iBookingsEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__AddBookingRequest() {
		return iBookingsEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__RemoveBookingRequest() {
		return iBookingsEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__GetBookingRequests() {
		return iBookingsEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__PayBookingBills() {
		return iBookingsEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookings__PayStayBills() {
		return iBookingsEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingsFactory getBookingsFactory() {
		return (BookingsFactory)getEFactoryInstance();
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
		bookingEClass = createEClass(BOOKING);
		createEAttribute(bookingEClass, BOOKING__BOOKED_STAYS);
		createEAttribute(bookingEClass, BOOKING__CUSTOMER);
		createEAttribute(bookingEClass, BOOKING__BOOKING_NBR);
		createEAttribute(bookingEClass, BOOKING__NBR_GUESTS);
		createEAttribute(bookingEClass, BOOKING__ISSUE_DATE);
		createEReference(bookingEClass, BOOKING__CREDIT_CARD);
		createEAttribute(bookingEClass, BOOKING__REQUESTS);
		createEOperation(bookingEClass, BOOKING___ADD_BOOKED_STAY);
		createEOperation(bookingEClass, BOOKING___CANCEL_BOOKED_STAY);

		bookingsManagerEClass = createEClass(BOOKINGS_MANAGER);
		createEReference(bookingsManagerEClass, BOOKINGS_MANAGER__BOOKING);
		createEReference(bookingsManagerEClass, BOOKINGS_MANAGER__IBOOKABLE_ACCESS);
		createEReference(bookingsManagerEClass, BOOKINGS_MANAGER__IHOTEL_STAY_MANAGER);
		createEReference(bookingsManagerEClass, BOOKINGS_MANAGER__BANK);
		createEReference(bookingsManagerEClass, BOOKINGS_MANAGER__IGUEST);
		createEReference(bookingsManagerEClass, BOOKINGS_MANAGER__ICUSTOMER);
		createEReference(bookingsManagerEClass, BOOKINGS_MANAGER__IBILLS);

		iBookingsEClass = createEClass(IBOOKINGS);
		createEOperation(iBookingsEClass, IBOOKINGS___MAKE_BOOKING);
		createEOperation(iBookingsEClass, IBOOKINGS___SEARCH_BOOKINGS);
		createEOperation(iBookingsEClass, IBOOKINGS___GET_BOOKED_STAYS_OF_BOOKING);
		createEOperation(iBookingsEClass, IBOOKINGS___GET_CUSTOMER_OF_BOOKING);
		createEOperation(iBookingsEClass, IBOOKINGS___GET_NBR_GUEST_OF_BOOKING);
		createEOperation(iBookingsEClass, IBOOKINGS___CANCEL_BOOKING);
		createEOperation(iBookingsEClass, IBOOKINGS___CANCEL_STAY_OF_BOOKING);
		createEOperation(iBookingsEClass, IBOOKINGS___ADD_BOOKED_STAY_TO_BOOKING);
		createEOperation(iBookingsEClass, IBOOKINGS___CHANGE_NBR_GUESTS_OF_BOOKING);
		createEOperation(iBookingsEClass, IBOOKINGS___GET_ALL_BOOKINGS);
		createEOperation(iBookingsEClass, IBOOKINGS___GET_ALL_BOOKINGS_WITHIN_PERIOD);
		createEOperation(iBookingsEClass, IBOOKINGS___GET_ALL_BOOKINGS_WITH_STAYS_IN_PERIOD);
		createEOperation(iBookingsEClass, IBOOKINGS___SEARCH_BOOKINGS_MADE_IN_PERIOD);
		createEOperation(iBookingsEClass, IBOOKINGS___SEARCH_BOOKINGS_WITH_STAYS_IN_PERIOD);
		createEOperation(iBookingsEClass, IBOOKINGS___SEARCH_FOR_AVAILABLE_BOOKABLES_IN_PERIOD__DATE_DATE);
		createEOperation(iBookingsEClass, IBOOKINGS___GET_AVAILABLE_BOOKABLES_IN_PERIOD);
		createEOperation(iBookingsEClass, IBOOKINGS___ADD_BOOKING_REQUEST);
		createEOperation(iBookingsEClass, IBOOKINGS___REMOVE_BOOKING_REQUEST);
		createEOperation(iBookingsEClass, IBOOKINGS___GET_BOOKING_REQUESTS);
		createEOperation(iBookingsEClass, IBOOKINGS___PAY_BOOKING_BILLS);
		createEOperation(iBookingsEClass, IBOOKINGS___PAY_STAY_BILLS);
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
		StaysPackage theStaysPackage = (StaysPackage)EPackage.Registry.INSTANCE.getEPackage(StaysPackage.eNS_URI);
		BookablesPackage theBookablesPackage = (BookablesPackage)EPackage.Registry.INSTANCE.getEPackage(BookablesPackage.eNS_URI);
		BankingPackage theBankingPackage = (BankingPackage)EPackage.Registry.INSTANCE.getEPackage(BankingPackage.eNS_URI);
		GuestsPackage theGuestsPackage = (GuestsPackage)EPackage.Registry.INSTANCE.getEPackage(GuestsPackage.eNS_URI);
		CustomersPackage theCustomersPackage = (CustomersPackage)EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI);
		BillsPackage theBillsPackage = (BillsPackage)EPackage.Registry.INSTANCE.getEPackage(BillsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bookingsManagerEClass.getESuperTypes().add(this.getIBookings());

		// Initialize classes, features, and operations; add parameters
		initEClass(bookingEClass, Booking.class, "Booking", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooking_BookedStays(), theTypesPackage.getString(), "bookedStays", null, 0, -1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Customer(), theTypesPackage.getString(), "customer", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_BookingNbr(), theTypesPackage.getString(), "bookingNbr", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_NbrGuests(), theTypesPackage.getInteger(), "nbrGuests", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_IssueDate(), ecorePackage.getEDate(), "issueDate", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBooking_CreditCard(), theStaysPackage.getCreditCard(), null, "creditCard", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBooking_Requests(), theTypesPackage.getString(), "requests", null, 1, 1, Booking.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getBooking__AddBookedStay(), null, "addBookedStay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getBooking__CancelBookedStay(), null, "cancelBookedStay", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookingsManagerEClass, BookingsManager.class, "BookingsManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookingsManager_Booking(), this.getBooking(), null, "booking", null, 0, -1, BookingsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingsManager_IBookableAccess(), theBookablesPackage.getIBookablesAccess(), null, "iBookableAccess", null, 1, 1, BookingsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingsManager_IHotelStayManager(), theStaysPackage.getIStays(), null, "iHotelStayManager", null, 1, 1, BookingsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingsManager_Bank(), theBankingPackage.getCustomerProvides(), null, "bank", null, 1, 1, BookingsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingsManager_IGuest(), theGuestsPackage.getIGuests(), null, "iGuest", null, 1, 1, BookingsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingsManager_ICustomer(), theCustomersPackage.getICustomers(), null, "iCustomer", null, 1, 1, BookingsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookingsManager_IBills(), theBillsPackage.getIBills(), null, "iBills", null, 1, 1, BookingsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iBookingsEClass, IBookings.class, "IBookings", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIBookings__MakeBooking(), null, "makeBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__SearchBookings(), null, "searchBookings", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__GetBookedStaysOfBooking(), null, "getBookedStaysOfBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__GetCustomerOfBooking(), null, "getCustomerOfBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__GetNbrGuestOfBooking(), null, "getNbrGuestOfBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__CancelBooking(), null, "cancelBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__CancelStayOfBooking(), null, "cancelStayOfBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__AddBookedStayToBooking(), null, "addBookedStayToBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__ChangeNbrGuestsOfBooking(), null, "changeNbrGuestsOfBooking", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__GetAllBookings(), null, "getAllBookings", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__GetAllBookingsWithinPeriod(), null, "getAllBookingsWithinPeriod", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__GetAllBookingsWithStaysInPeriod(), null, "getAllBookingsWithStaysInPeriod", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__SearchBookingsMadeInPeriod(), null, "searchBookingsMadeInPeriod", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__SearchBookingsWithStaysInPeriod(), null, "searchBookingsWithStaysInPeriod", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getIBookings__SearchForAvailableBookablesInPeriod__Date_Date(), null, "searchForAvailableBookablesInPeriod", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__GetAvailableBookablesInPeriod(), null, "getAvailableBookablesInPeriod", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__AddBookingRequest(), null, "addBookingRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__RemoveBookingRequest(), null, "removeBookingRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__GetBookingRequests(), null, "getBookingRequests", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__PayBookingBills(), null, "payBookingBills", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookings__PayStayBills(), null, "payStayBills", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BookingsPackageImpl
