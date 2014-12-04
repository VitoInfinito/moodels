/**
 */
package Classes.Restaurants.impl;

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
		Classes.ECoreMapEntries.impl.ECoreMapEntriesPackageImpl theECoreMapEntriesPackage = (Classes.ECoreMapEntries.impl.ECoreMapEntriesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Classes.ECoreMapEntries.ECoreMapEntriesPackage.eNS_URI) instanceof Classes.ECoreMapEntries.impl.ECoreMapEntriesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Classes.ECoreMapEntries.ECoreMapEntriesPackage.eNS_URI) : Classes.ECoreMapEntries.ECoreMapEntriesPackage.eINSTANCE);
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
		theECoreMapEntriesPackage.createPackageContents();
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
		theECoreMapEntriesPackage.initializePackageContents();
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
	public EOperation getIRestaurantsManage__AddRestaurant() {
		return iRestaurantsManageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__RemoveRestaurant() {
		return iRestaurantsManageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__AddRestaurantTable() {
		return iRestaurantsManageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__RemoveRestaurantTable() {
		return iRestaurantsManageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__ChangeRestaurantName() {
		return iRestaurantsManageEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__ChangeTableInformation() {
		return iRestaurantsManageEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__AddMenuItem() {
		return iRestaurantsManageEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__RemoveMenuItem() {
		return iRestaurantsManageEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__ChangeMenuItem() {
		return iRestaurantsManageEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsManage__ChangeMenuName() {
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
	public EOperation getIRestaurantsAccess__GetReservationId() {
		return iRestaurantsAccessEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetAllReservationIds() {
		return iRestaurantsAccessEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetEmptyTables() {
		return iRestaurantsAccessEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetEmptySeats() {
		return iRestaurantsAccessEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetEmptyTablesWithNbrOfSeats() {
		return iRestaurantsAccessEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetReservationIdByGuestName() {
		return iRestaurantsAccessEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetMenuInformation() {
		return iRestaurantsAccessEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetAllRestaurantNames() {
		return iRestaurantsAccessEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__SearchRestaurants() {
		return iRestaurantsAccessEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__SearchRestaurantReservations() {
		return iRestaurantsAccessEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__SearchRestaurantTables() {
		return iRestaurantsAccessEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__GetMenuName() {
		return iRestaurantsAccessEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__MakeReservation() {
		return iRestaurantsAccessEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__RemoveReservation() {
		return iRestaurantsAccessEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIRestaurantsAccess__ChangeReservationTables() {
		return iRestaurantsAccessEClass.getEOperations().get(14);
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
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___ADD_RESTAURANT);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___REMOVE_RESTAURANT);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___ADD_RESTAURANT_TABLE);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___REMOVE_RESTAURANT_TABLE);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___CHANGE_RESTAURANT_NAME);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___CHANGE_TABLE_INFORMATION);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___ADD_MENU_ITEM);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___REMOVE_MENU_ITEM);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___CHANGE_MENU_ITEM);
		createEOperation(iRestaurantsManageEClass, IRESTAURANTS_MANAGE___CHANGE_MENU_NAME);

		iRestaurantsAccessEClass = createEClass(IRESTAURANTS_ACCESS);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_RESERVATION_ID);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_ALL_RESERVATION_IDS);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_EMPTY_TABLES);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_EMPTY_SEATS);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_EMPTY_TABLES_WITH_NBR_OF_SEATS);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_RESERVATION_ID_BY_GUEST_NAME);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_MENU_INFORMATION);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_ALL_RESTAURANT_NAMES);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___SEARCH_RESTAURANTS);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_RESERVATIONS);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___SEARCH_RESTAURANT_TABLES);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___GET_MENU_NAME);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___MAKE_RESERVATION);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___REMOVE_RESERVATION);
		createEOperation(iRestaurantsAccessEClass, IRESTAURANTS_ACCESS___CHANGE_RESERVATION_TABLES);

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
		Classes.ECoreMapEntries.ECoreMapEntriesPackage theECoreMapEntriesPackage = (Classes.ECoreMapEntries.ECoreMapEntriesPackage)EPackage.Registry.INSTANCE.getEPackage(Classes.ECoreMapEntries.ECoreMapEntriesPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		iRestaurantsManageEClass.getESuperTypes().add(this.getIRestaurantsAccess());
		restaurantsManagerEClass.getESuperTypes().add(this.getIRestaurantsManage());

		// Initialize classes, features, and operations; add parameters
		initEClass(iRestaurantsManageEClass, IRestaurantsManage.class, "IRestaurantsManage", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIRestaurantsManage__AddRestaurant(), null, "addRestaurant", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsManage__RemoveRestaurant(), null, "removeRestaurant", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsManage__AddRestaurantTable(), null, "addRestaurantTable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsManage__RemoveRestaurantTable(), null, "removeRestaurantTable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsManage__ChangeRestaurantName(), null, "changeRestaurantName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsManage__ChangeTableInformation(), null, "changeTableInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsManage__AddMenuItem(), null, "addMenuItem", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsManage__RemoveMenuItem(), null, "removeMenuItem", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsManage__ChangeMenuItem(), null, "changeMenuItem", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsManage__ChangeMenuName(), null, "changeMenuName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iRestaurantsAccessEClass, IRestaurantsAccess.class, "IRestaurantsAccess", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIRestaurantsAccess__GetReservationId(), null, "getReservationId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsAccess__GetAllReservationIds(), null, "getAllReservationIds", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsAccess__GetEmptyTables(), null, "getEmptyTables", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsAccess__GetEmptySeats(), null, "getEmptySeats", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsAccess__GetEmptyTablesWithNbrOfSeats(), null, "getEmptyTablesWithNbrOfSeats", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsAccess__GetReservationIdByGuestName(), null, "getReservationIdByGuestName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsAccess__GetMenuInformation(), null, "getMenuInformation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsAccess__GetAllRestaurantNames(), null, "getAllRestaurantNames", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsAccess__SearchRestaurants(), null, "searchRestaurants", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsAccess__SearchRestaurantReservations(), null, "searchRestaurantReservations", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsAccess__SearchRestaurantTables(), null, "searchRestaurantTables", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsAccess__GetMenuName(), null, "getMenuName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsAccess__MakeReservation(), null, "makeReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsAccess__RemoveReservation(), null, "removeReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIRestaurantsAccess__ChangeReservationTables(), null, "changeReservationTables", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(restaurantsManagerEClass, RestaurantsManager.class, "RestaurantsManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRestaurantsManager_Restaurant(), theECoreMapEntriesPackage.getStringToRestaurantMap(), null, "restaurant", null, 0, -1, RestaurantsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(restaurantEClass, Restaurant.class, "Restaurant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestaurant_Name(), theTypesPackage.getString(), "name", null, 1, 1, Restaurant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRestaurant_Reservation(), theECoreMapEntriesPackage.getStringToReservationMap(), null, "reservation", null, 0, -1, Restaurant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRestaurant_RestaurantTable(), theECoreMapEntriesPackage.getStringToRestaurantTableMap(), null, "restaurantTable", null, 0, -1, Restaurant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRestaurant_Menu(), this.getRestaurantMenu(), null, "menu", null, 1, 1, Restaurant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getRestaurant__AddReservation(), null, "addReservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(reservationEClass, Reservation.class, "Reservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReservation_Id(), theTypesPackage.getInteger(), "id", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_ReservedBy(), theTypesPackage.getString(), "reservedBy", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReservation_RestaurantTable(), this.getRestaurantTable(), null, "restaurantTable", null, 1, -1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_From(), ecorePackage.getEDate(), "from", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getReservation_To(), ecorePackage.getEDate(), "to", null, 1, 1, Reservation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(restaurantTableEClass, RestaurantTable.class, "RestaurantTable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRestaurantTable_TableNumber(), theTypesPackage.getInteger(), "tableNumber", null, 1, 1, RestaurantTable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
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
