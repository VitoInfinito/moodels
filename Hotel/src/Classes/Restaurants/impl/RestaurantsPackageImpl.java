/**
 */
package Classes.Restaurants.impl;

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
import Classes.Requests.RequestsPackage;
import Classes.Requests.impl.RequestsPackageImpl;
import Classes.Restaurants.IRestaurantsAccess;
import Classes.Restaurants.IRestaurantsManage;
import Classes.Restaurants.Reservation;
import Classes.Restaurants.Restaurant;
import Classes.Restaurants.RestaurantMenu;
import Classes.Restaurants.RestaurantTable;
import Classes.Restaurants.RestaurantsFactory;
import Classes.Restaurants.RestaurantsManager;
import Classes.Restaurants.RestaurantsPackage;
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
public class RestaurantsPackageImpl extends EPackageImpl implements RestaurantsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRestaurantsManageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iRestaurantsAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restaurantsManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restaurantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reservationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restaurantTableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass restaurantMenuEClass = null;

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
	 * @see Classes.Restaurants.RestaurantsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RestaurantsPackageImpl() {
		super(eNS_URI, RestaurantsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link RestaurantsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RestaurantsPackage init() {
		if (isInited) return (RestaurantsPackage)EPackage.Registry.INSTANCE.getEPackage(RestaurantsPackage.eNS_URI);

		// Obtain or create and register package
		RestaurantsPackageImpl theRestaurantsPackage = (RestaurantsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof RestaurantsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new RestaurantsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BookablesPackageImpl theBookablesPackage = (BookablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookablesPackage.eNS_URI) instanceof BookablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookablesPackage.eNS_URI) : BookablesPackage.eINSTANCE);
		StaysPackageImpl theStaysPackage = (StaysPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaysPackage.eNS_URI) instanceof StaysPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaysPackage.eNS_URI) : StaysPackage.eINSTANCE);
		BankingPackageImpl theBankingPackage = (BankingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BankingPackage.eNS_URI) instanceof BankingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BankingPackage.eNS_URI) : BankingPackage.eINSTANCE);
		BillsPackageImpl theBillsPackage = (BillsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BillsPackage.eNS_URI) instanceof BillsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BillsPackage.eNS_URI) : BillsPackage.eINSTANCE);
		GuestsPackageImpl theGuestsPackage = (GuestsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(GuestsPackage.eNS_URI) instanceof GuestsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(GuestsPackage.eNS_URI) : GuestsPackage.eINSTANCE);
		AccountsPackageImpl theAccountsPackage = (AccountsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AccountsPackage.eNS_URI) instanceof AccountsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AccountsPackage.eNS_URI) : AccountsPackage.eINSTANCE);
		BookingsPackageImpl theBookingsPackage = (BookingsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookingsPackage.eNS_URI) instanceof BookingsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookingsPackage.eNS_URI) : BookingsPackage.eINSTANCE);
		CustomersPackageImpl theCustomersPackage = (CustomersPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) instanceof CustomersPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(CustomersPackage.eNS_URI) : CustomersPackage.eINSTANCE);
		StatisticsPackageImpl theStatisticsPackage = (StatisticsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StatisticsPackage.eNS_URI) instanceof StatisticsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StatisticsPackage.eNS_URI) : StatisticsPackage.eINSTANCE);
		StaffPackageImpl theStaffPackage = (StaffPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) instanceof StaffPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI) : StaffPackage.eINSTANCE);
		InventoryPackageImpl theInventoryPackage = (InventoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI) instanceof InventoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI) : InventoryPackage.eINSTANCE);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) : ServicesPackage.eINSTANCE);
		FeedbackPackageImpl theFeedbackPackage = (FeedbackPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeedbackPackage.eNS_URI) instanceof FeedbackPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeedbackPackage.eNS_URI) : FeedbackPackage.eINSTANCE);
		RequestsPackageImpl theRequestsPackage = (RequestsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequestsPackage.eNS_URI) instanceof RequestsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequestsPackage.eNS_URI) : RequestsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theRestaurantsPackage.createPackageContents();
		theBookablesPackage.createPackageContents();
		theStaysPackage.createPackageContents();
		theBankingPackage.createPackageContents();
		theBillsPackage.createPackageContents();
		theGuestsPackage.createPackageContents();
		theAccountsPackage.createPackageContents();
		theBookingsPackage.createPackageContents();
		theCustomersPackage.createPackageContents();
		theStatisticsPackage.createPackageContents();
		theStaffPackage.createPackageContents();
		theInventoryPackage.createPackageContents();
		theServicesPackage.createPackageContents();
		theFeedbackPackage.createPackageContents();
		theRequestsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theRestaurantsPackage.initializePackageContents();
		theBookablesPackage.initializePackageContents();
		theStaysPackage.initializePackageContents();
		theBankingPackage.initializePackageContents();
		theBillsPackage.initializePackageContents();
		theGuestsPackage.initializePackageContents();
		theAccountsPackage.initializePackageContents();
		theBookingsPackage.initializePackageContents();
		theCustomersPackage.initializePackageContents();
		theStatisticsPackage.initializePackageContents();
		theStaffPackage.initializePackageContents();
		theInventoryPackage.initializePackageContents();
		theServicesPackage.initializePackageContents();
		theFeedbackPackage.initializePackageContents();
		theRequestsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRestaurantsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RestaurantsPackage.eNS_URI, theRestaurantsPackage);
		return theRestaurantsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRestaurantsManage() {
		return iRestaurantsManageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__AddRestaurant__String() {
		return iRestaurantsManageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__RemoveRestaurant__String() {
		return iRestaurantsManageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__AddRestaurantTable__String_int_String() {
		return iRestaurantsManageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__RemoveRestaurantTable__String_String() {
		return iRestaurantsManageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__ChangeRestaurantName__String_String() {
		return iRestaurantsManageEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__ChangeTableNumberOfSeats__String_String_int() {
		return iRestaurantsManageEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__AddMenuItem__String_String() {
		return iRestaurantsManageEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__RemoveMenuItem__String_String() {
		return iRestaurantsManageEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__ChangeMenuName__String_String() {
		return iRestaurantsManageEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__ChangeTableNumber__String_String_String() {
		return iRestaurantsManageEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIRestaurantsAccess() {
		return iRestaurantsAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetRestaurantReservations__String() {
		return iRestaurantsAccessEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetRestaurantTables__String() {
		return iRestaurantsAccessEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetRestaurantTableNumberOfSeats__String_String() {
		return iRestaurantsAccessEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetAvailableTables__Date_Date_String() {
		return iRestaurantsAccessEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetReservationGuest__String_String() {
		return iRestaurantsAccessEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetRestaurantMenuName__String() {
		return iRestaurantsAccessEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetAllRestaurantNames() {
		return iRestaurantsAccessEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__SearchRestaurants__String() {
		return iRestaurantsAccessEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__SearchRestaurantReservations__String_String() {
		return iRestaurantsAccessEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__SearchRestaurantTables__String_String() {
		return iRestaurantsAccessEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__MakeReservation__String_EList_String_Date_Date() {
		return iRestaurantsAccessEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__CancelReservation__String_String() {
		return iRestaurantsAccessEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__ChangeReservedTables__String_String_EList() {
		return iRestaurantsAccessEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetAvailableTablesByNbrGuests__Date_Date_int() {
		return iRestaurantsAccessEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetRestaurantMenuItems__String() {
		return iRestaurantsAccessEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetReservationFromTime__String_String() {
		return iRestaurantsAccessEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetReservationToTime__String_String() {
		return iRestaurantsAccessEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__SearchRestaurantReservationsWithTime__String_String_Date_Date() {
		return iRestaurantsAccessEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestaurantsManager() {
		return restaurantsManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestaurantsManager_Restaurant() {
		return (EReference)restaurantsManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestaurant() {
		return restaurantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestaurant_Name() {
		return (EAttribute)restaurantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestaurant_Reservation() {
		return (EReference)restaurantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestaurant_RestaurantTable() {
		return (EReference)restaurantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRestaurant_Menu() {
		return (EReference)restaurantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRestaurant__AddReservation() {
		return restaurantEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReservation() {
		return reservationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_Id() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_ReservedBy() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReservation_RestaurantTable() {
		return (EReference)reservationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_From() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReservation_To() {
		return (EAttribute)reservationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestaurantTable() {
		return restaurantTableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestaurantTable_TableNumber() {
		return (EAttribute)restaurantTableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestaurantTable_NumberOfSeats() {
		return (EAttribute)restaurantTableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRestaurantMenu() {
		return restaurantMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestaurantMenu_Name() {
		return (EAttribute)restaurantMenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRestaurantMenu_Items() {
		return (EAttribute)restaurantMenuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRestaurantMenu__AddItem() {
		return restaurantMenuEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRestaurantMenu__RemoveItem() {
		return restaurantMenuEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantsFactory getRestaurantsFactory() {
		return (RestaurantsFactory)getEFactoryInstance();
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
		iRestaurantsManageEClass = createEClass(IRESTAURANTS_MANAGE);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___ADD_RESTAURANT__STRING);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___REMOVE_RESTAURANT__STRING);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___ADD_RESTAURANT_TABLE__STRING_INT_STRING);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___REMOVE_RESTAURANT_TABLE__STRING_STRING);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___CHANGE_RESTAURANT_NAME__STRING_STRING);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___CHANGE_TABLE_NUMBER_OF_SEATS__STRING_STRING_INT);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___ADD_MENU_ITEM__STRING_STRING);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___REMOVE_MENU_ITEM__STRING_STRING);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___CHANGE_MENU_NAME__STRING_STRING);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___CHANGE_TABLE_NUMBER__STRING_STRING_STRING);

		iRestaurantsAccessEClass = createEClass(IRESTAURANTS_ACCESS);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_RESTAURANT_RESERVATIONS__STRING);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_RESTAURANT_TABLES__STRING);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_RESTAURANT_TABLE_NUMBER_OF_SEATS__STRING_STRING);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_AVAILABLE_TABLES__DATE_DATE_STRING);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_RESERVATION_GUEST__STRING_STRING);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_RESTAURANT_MENU_NAME__STRING);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_ALL_RESTAURANT_NAMES);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___SEARCH_RESTAURANTS__STRING);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_RESERVATIONS__STRING_STRING);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_TABLES__STRING_STRING);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___MAKE_RESERVATION__STRING_ELIST_STRING_DATE_DATE);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___CANCEL_RESERVATION__STRING_STRING);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___CHANGE_RESERVED_TABLES__STRING_STRING_ELIST);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_AVAILABLE_TABLES_BY_NBR_GUESTS__DATE_DATE_INT);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_RESTAURANT_MENU_ITEMS__STRING);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_RESERVATION_FROM_TIME__STRING_STRING);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_RESERVATION_TO_TIME__STRING_STRING);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_RESERVATIONS_WITH_TIME__STRING_STRING_DATE_DATE);

		restaurantsManagerEClass = createEClass(RESTAURANTS_MANAGER);
		createEReference(restaurantsManagerEClass, RESTAURANTS_MANAGER__RESTAURANT);

		restaurantEClass = createEClass(RESTAURANT);
		createEAttribute(restaurantEClass, RESTAURANT__NAME);
		createEReference(restaurantEClass, RESTAURANT__RESERVATION);
		createEReference(restaurantEClass, RESTAURANT__RESTAURANT_TABLE);
		createEReference(restaurantEClass, RESTAURANT__MENU);
		createEOperation(restaurantEClass, RESTAURANT___ADD_RESERVATION);

		reservationEClass = createEClass(RESERVATION);
		createEAttribute(reservationEClass, RESERVATION__ID);
		createEAttribute(reservationEClass, RESERVATION__RESERVED_BY);
		createEReference(reservationEClass, RESERVATION__RESTAURANT_TABLE);
		createEAttribute(reservationEClass, RESERVATION__FROM);
		createEAttribute(reservationEClass, RESERVATION__TO);

		restaurantTableEClass = createEClass(RESTAURANT_TABLE);
		createEAttribute(restaurantTableEClass, RESTAURANT_TABLE__TABLE_NUMBER);
		createEAttribute(restaurantTableEClass, RESTAURANT_TABLE__NUMBER_OF_SEATS);

		restaurantMenuEClass = createEClass(RESTAURANT_MENU);
		createEAttribute(restaurantMenuEClass, RESTAURANT_MENU__NAME);
		createEAttribute(restaurantMenuEClass, RESTAURANT_MENU__ITEMS);
		createEOperation(restaurantMenuEClass, RESTAURANT_MENU___ADD_ITEM);
		createEOperation(restaurantMenuEClass, RESTAURANT_MENU___REMOVE_ITEM);
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
		iRestaurantsManageEClass.getESuperTypes().add(this.getIRestaurantsAccess());
		restaurantsManagerEClass.getESuperTypes().add(this.getIRestaurantsManage());

		// Initialize classes, features, and operations; add parameters
		initEClass(iRestaurantsManageEClass, IRestaurantsManage.class, "IRestaurantsManage", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getIRestaurantsManage__AddRestaurant__String(), null, "addRestaurant", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsManage__RemoveRestaurant__String(), null, "removeRestaurant", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsManage__AddRestaurantTable__String_int_String(), null, "addRestaurantTable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nbrSeats", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "tableNbr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsManage__RemoveRestaurantTable__String_String(), null, "removeRestaurantTable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "tableNbr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsManage__ChangeRestaurantName__String_String(), null, "changeRestaurantName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsManage__ChangeTableNumberOfSeats__String_String_int(), null, "changeTableNumberOfSeats", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "tableNbr", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nbrSeats", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsManage__AddMenuItem__String_String(), null, "addMenuItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "itemID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsManage__RemoveMenuItem__String_String(), null, "removeMenuItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "itemID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsManage__ChangeMenuName__String_String(), null, "changeMenuName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsManage__ChangeTableNumber__String_String_String(), null, "changeTableNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "oldTableNbr", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "newTableNbr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iRestaurantsAccessEClass, IRestaurantsAccess.class, "IRestaurantsAccess", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIRestaurantsAccess__GetRestaurantReservations__String(), theTypesPackage.getString(), "getRestaurantReservations", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsAccess__GetRestaurantTables__String(), theTypesPackage.getString(), "getRestaurantTables", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsAccess__GetRestaurantTableNumberOfSeats__String_String(), theTypesPackage.getInteger(), "getRestaurantTableNumberOfSeats", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "tableNbr", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsAccess__GetAvailableTables__Date_Date_String(), theTypesPackage.getString(), "getAvailableTables", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsAccess__GetReservationGuest__String_String(), theTypesPackage.getString(), "getReservationGuest", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "reservationID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsAccess__GetRestaurantMenuName__String(), theTypesPackage.getString(), "getRestaurantMenuName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsAccess__GetAllRestaurantNames(), theTypesPackage.getString(), "getAllRestaurantNames", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsAccess__SearchRestaurants__String(), theTypesPackage.getString(), "searchRestaurants", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "keyword", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsAccess__SearchRestaurantReservations__String_String(), theTypesPackage.getString(), "searchRestaurantReservations", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "keyword", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsAccess__SearchRestaurantTables__String_String(), theTypesPackage.getString(), "searchRestaurantTables", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "keyword", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsAccess__MakeReservation__String_EList_String_Date_Date(), null, "makeReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "tables", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "guestID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsAccess__CancelReservation__String_String(), null, "cancelReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "reservationID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsAccess__ChangeReservedTables__String_String_EList(), null, "changeReservedTables", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "reservationID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "tables", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsAccess__GetAvailableTablesByNbrGuests__Date_Date_int(), theTypesPackage.getString(), "getAvailableTablesByNbrGuests", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nbrGuests", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsAccess__GetRestaurantMenuItems__String(), theTypesPackage.getString(), "getRestaurantMenuItems", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsAccess__GetReservationFromTime__String_String(), ecorePackage.getEDate(), "getReservationFromTime", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "reservationID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsAccess__GetReservationToTime__String_String(), ecorePackage.getEDate(), "getReservationToTime", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "reservationID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIRestaurantsAccess__SearchRestaurantReservationsWithTime__String_String_Date_Date(), theTypesPackage.getString(), "searchRestaurantReservationsWithTime", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "restaurantID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "keyword", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(restaurantsManagerEClass, RestaurantsManager.class, "RestaurantsManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestaurantsManager_Restaurant(), this.getRestaurant(), null, "restaurant", null, 0, -1, RestaurantsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(restaurantEClass, Restaurant.class, "Restaurant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestaurant_Name(), theTypesPackage.getString(), "name", null, 1, 1, Restaurant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRestaurant_Reservation(), this.getReservation(), null, "reservation", null, 0, -1, Restaurant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRestaurant_RestaurantTable(), this.getRestaurantTable(), null, "restaurantTable", null, 0, -1, Restaurant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRestaurant_Menu(), this.getRestaurantMenu(), null, "menu", null, 1, 1, Restaurant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getRestaurant__AddReservation(), null, "addReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(reservationEClass, Reservation.class, "Reservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReservation_Id(), theTypesPackage.getString(), "id", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_ReservedBy(), theTypesPackage.getString(), "reservedBy", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservation_RestaurantTable(), this.getRestaurantTable(), null, "restaurantTable", null, 1, -1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_From(), ecorePackage.getEDate(), "from", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_To(), ecorePackage.getEDate(), "to", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(restaurantTableEClass, RestaurantTable.class, "RestaurantTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestaurantTable_TableNumber(), theTypesPackage.getString(), "tableNumber", null, 1, 1, RestaurantTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRestaurantTable_NumberOfSeats(), theTypesPackage.getInteger(), "numberOfSeats", null, 1, 1, RestaurantTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(restaurantMenuEClass, RestaurantMenu.class, "RestaurantMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestaurantMenu_Name(), theTypesPackage.getString(), "name", null, 1, 1, RestaurantMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRestaurantMenu_Items(), theTypesPackage.getString(), "items", null, 0, -1, RestaurantMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getRestaurantMenu__AddItem(), null, "addItem", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRestaurantMenu__RemoveItem(), null, "removeItem", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RestaurantsPackageImpl
