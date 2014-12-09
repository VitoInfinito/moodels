/**
 */
package Classes.Services.impl;

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
import Classes.Services.IServicesAccess;
import Classes.Services.IServicesManage;
import Classes.Services.RoomServiceMenu;
import Classes.Services.RoomServiceOrder;
import Classes.Services.Service;
import Classes.Services.ServiceManager;
import Classes.Services.ServicesFactory;
import Classes.Services.ServicesPackage;
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
public class ServicesPackageImpl extends EPackageImpl implements ServicesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomServiceMenuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iServicesAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomServiceOrderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iServicesManageEClass = null;

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
	 * @see Classes.Services.ServicesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServicesPackageImpl() {
		super(eNS_URI, ServicesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ServicesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServicesPackage init() {
		if (isInited) return (ServicesPackage)EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI);

		// Obtain or create and register package
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServicesPackageImpl());

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
		RestaurantsPackageImpl theRestaurantsPackage = (RestaurantsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestaurantsPackage.eNS_URI) instanceof RestaurantsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestaurantsPackage.eNS_URI) : RestaurantsPackage.eINSTANCE);
		FeedbackPackageImpl theFeedbackPackage = (FeedbackPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeedbackPackage.eNS_URI) instanceof FeedbackPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeedbackPackage.eNS_URI) : FeedbackPackage.eINSTANCE);
		RequestsPackageImpl theRequestsPackage = (RequestsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequestsPackage.eNS_URI) instanceof RequestsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequestsPackage.eNS_URI) : RequestsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theServicesPackage.createPackageContents();
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
		theRestaurantsPackage.createPackageContents();
		theFeedbackPackage.createPackageContents();
		theRequestsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theServicesPackage.initializePackageContents();
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
		theRestaurantsPackage.initializePackageContents();
		theFeedbackPackage.initializePackageContents();
		theRequestsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServicesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServicesPackage.eNS_URI, theServicesPackage);
		return theServicesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomServiceMenu() {
		return roomServiceMenuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomServiceMenu_Name() {
		return (EAttribute)roomServiceMenuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomServiceMenu_Items() {
		return (EAttribute)roomServiceMenuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomServiceMenu__AddItem__String() {
		return roomServiceMenuEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomServiceMenu__RemoveItem__String() {
		return roomServiceMenuEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIServicesAccess() {
		return iServicesAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__GetAllServiceIDs() {
		return iServicesAccessEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__GetAllRoomServiceOrderIDs() {
		return iServicesAccessEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__SearchServices__String() {
		return iServicesAccessEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__SearchRoomServiceOrders__String() {
		return iServicesAccessEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__GetServiceName__String() {
		return iServicesAccessEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__GetServicePrice__String() {
		return iServicesAccessEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__GetServiceExpense__String() {
		return iServicesAccessEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__IsRSODelivered__String() {
		return iServicesAccessEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__GetRSODeliveryDate__String() {
		return iServicesAccessEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__GetRSOBookable__String() {
		return iServicesAccessEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__GetRSOItems__String() {
		return iServicesAccessEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__GetRSOServices__String() {
		return iServicesAccessEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__ChangeRSOISDelivered__String_boolean() {
		return iServicesAccessEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__ChangeRSODeliveryDate__String_Date() {
		return iServicesAccessEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__GetRoomServiceMenuName() {
		return iServicesAccessEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__GetRoomServiceMenuItems() {
		return iServicesAccessEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__SetRSOBill__String_String() {
		return iServicesAccessEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__GetRSOBill__String() {
		return iServicesAccessEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesAccess__MakeRoomServiceOrder__EList_EList_String_String_Date_boolean() {
		return iServicesAccessEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceManager() {
		return serviceManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceManager_Service() {
		return (EReference)serviceManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceManager_RoomServiceOrder() {
		return (EReference)serviceManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceManager_RoomServiceMenu() {
		return (EReference)serviceManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Name() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Price() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Expense() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getService_Id() {
		return (EAttribute)serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomServiceOrder() {
		return roomServiceOrderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoomServiceOrder_Service() {
		return (EReference)roomServiceOrderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomServiceOrder_IsDelivered() {
		return (EAttribute)roomServiceOrderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomServiceOrder_DeliveryDate() {
		return (EAttribute)roomServiceOrderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomServiceOrder_Bookable() {
		return (EAttribute)roomServiceOrderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomServiceOrder_Items() {
		return (EAttribute)roomServiceOrderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomServiceOrder_Id() {
		return (EAttribute)roomServiceOrderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomServiceOrder_Bill() {
		return (EAttribute)roomServiceOrderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomServiceOrder__AddService() {
		return roomServiceOrderEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomServiceOrder__AddItem() {
		return roomServiceOrderEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomServiceOrder__RemoveItem() {
		return roomServiceOrderEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRoomServiceOrder__RemoveService() {
		return roomServiceOrderEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIServicesManage() {
		return iServicesManageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesManage__ChangeServiceName__String_String() {
		return iServicesManageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesManage__ChangeServicePrice__String_double() {
		return iServicesManageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesManage__ChangeServiceExpense__String_double() {
		return iServicesManageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesManage__AddRoomServiceMenuItem__String() {
		return iServicesManageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesManage__RemoveRoomServiceMenuItem__String() {
		return iServicesManageEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesManage__ChangeRoomServiceMenuName__String() {
		return iServicesManageEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIServicesManage__AddService__String_double_double() {
		return iServicesManageEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicesFactory getServicesFactory() {
		return (ServicesFactory)getEFactoryInstance();
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
		roomServiceMenuEClass = createEClass(ROOM_SERVICE_MENU);
		createEAttribute(roomServiceMenuEClass, ROOM_SERVICE_MENU__NAME);
		createEAttribute(roomServiceMenuEClass, ROOM_SERVICE_MENU__ITEMS);
		createEOperation(roomServiceMenuEClass, ROOM_SERVICE_MENU___ADD_ITEM__STRING);
		createEOperation(roomServiceMenuEClass, ROOM_SERVICE_MENU___REMOVE_ITEM__STRING);

		iServicesAccessEClass = createEClass(ISERVICES_ACCESS);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___GET_ALL_SERVICE_IDS);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___GET_ALL_ROOM_SERVICE_ORDER_IDS);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___SEARCH_SERVICES__STRING);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___SEARCH_ROOM_SERVICE_ORDERS__STRING);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___GET_SERVICE_NAME__STRING);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___GET_SERVICE_PRICE__STRING);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___GET_SERVICE_EXPENSE__STRING);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___IS_RSO_DELIVERED__STRING);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___GET_RSO_DELIVERY_DATE__STRING);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___GET_RSO_BOOKABLE__STRING);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___GET_RSO_ITEMS__STRING);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___GET_RSO_SERVICES__STRING);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___CHANGE_RSOIS_DELIVERED__STRING_BOOLEAN);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___CHANGE_RSO_DELIVERY_DATE__STRING_DATE);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___GET_ROOM_SERVICE_MENU_NAME);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___GET_ROOM_SERVICE_MENU_ITEMS);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___SET_RSO_BILL__STRING_STRING);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___GET_RSO_BILL__STRING);
		createEOperation(iServicesAccessEClass, ISERVICES_ACCESS___MAKE_ROOM_SERVICE_ORDER__ELIST_ELIST_STRING_STRING_DATE_BOOLEAN);

		serviceManagerEClass = createEClass(SERVICE_MANAGER);
		createEReference(serviceManagerEClass, SERVICE_MANAGER__SERVICE);
		createEReference(serviceManagerEClass, SERVICE_MANAGER__ROOM_SERVICE_ORDER);
		createEReference(serviceManagerEClass, SERVICE_MANAGER__ROOM_SERVICE_MENU);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEAttribute(serviceEClass, SERVICE__PRICE);
		createEAttribute(serviceEClass, SERVICE__EXPENSE);
		createEAttribute(serviceEClass, SERVICE__ID);

		roomServiceOrderEClass = createEClass(ROOM_SERVICE_ORDER);
		createEReference(roomServiceOrderEClass, ROOM_SERVICE_ORDER__SERVICE);
		createEAttribute(roomServiceOrderEClass, ROOM_SERVICE_ORDER__IS_DELIVERED);
		createEAttribute(roomServiceOrderEClass, ROOM_SERVICE_ORDER__DELIVERY_DATE);
		createEAttribute(roomServiceOrderEClass, ROOM_SERVICE_ORDER__BOOKABLE);
		createEAttribute(roomServiceOrderEClass, ROOM_SERVICE_ORDER__ITEMS);
		createEAttribute(roomServiceOrderEClass, ROOM_SERVICE_ORDER__ID);
		createEAttribute(roomServiceOrderEClass, ROOM_SERVICE_ORDER__BILL);
		createEOperation(roomServiceOrderEClass, ROOM_SERVICE_ORDER___ADD_SERVICE);
		createEOperation(roomServiceOrderEClass, ROOM_SERVICE_ORDER___ADD_ITEM);
		createEOperation(roomServiceOrderEClass, ROOM_SERVICE_ORDER___REMOVE_ITEM);
		createEOperation(roomServiceOrderEClass, ROOM_SERVICE_ORDER___REMOVE_SERVICE);

		iServicesManageEClass = createEClass(ISERVICES_MANAGE);
		createEOperation(iServicesManageEClass, ISERVICES_MANAGE___CHANGE_SERVICE_NAME__STRING_STRING);
		createEOperation(iServicesManageEClass, ISERVICES_MANAGE___CHANGE_SERVICE_PRICE__STRING_DOUBLE);
		createEOperation(iServicesManageEClass, ISERVICES_MANAGE___CHANGE_SERVICE_EXPENSE__STRING_DOUBLE);
		createEOperation(iServicesManageEClass, ISERVICES_MANAGE___ADD_ROOM_SERVICE_MENU_ITEM__STRING);
		createEOperation(iServicesManageEClass, ISERVICES_MANAGE___REMOVE_ROOM_SERVICE_MENU_ITEM__STRING);
		createEOperation(iServicesManageEClass, ISERVICES_MANAGE___CHANGE_ROOM_SERVICE_MENU_NAME__STRING);
		createEOperation(iServicesManageEClass, ISERVICES_MANAGE___ADD_SERVICE__STRING_DOUBLE_DOUBLE);
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
		serviceManagerEClass.getESuperTypes().add(this.getIServicesManage());
		iServicesManageEClass.getESuperTypes().add(this.getIServicesAccess());

		// Initialize classes, features, and operations; add parameters
		initEClass(roomServiceMenuEClass, RoomServiceMenu.class, "RoomServiceMenu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomServiceMenu_Name(), theTypesPackage.getString(), "name", null, 1, 1, RoomServiceMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomServiceMenu_Items(), theTypesPackage.getString(), "items", null, 0, -1, RoomServiceMenu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getRoomServiceMenu__AddItem__String(), null, "addItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "itemID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getRoomServiceMenu__RemoveItem__String(), null, "removeItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "itemID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iServicesAccessEClass, IServicesAccess.class, "IServicesAccess", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIServicesAccess__GetAllServiceIDs(), theTypesPackage.getString(), "getAllServiceIDs", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIServicesAccess__GetAllRoomServiceOrderIDs(), theTypesPackage.getString(), "getAllRoomServiceOrderIDs", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesAccess__SearchServices__String(), theTypesPackage.getString(), "searchServices", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "keyword", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesAccess__SearchRoomServiceOrders__String(), theTypesPackage.getString(), "searchRoomServiceOrders", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "keyword", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesAccess__GetServiceName__String(), theTypesPackage.getString(), "getServiceName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesAccess__GetServicePrice__String(), ecorePackage.getEDouble(), "getServicePrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesAccess__GetServiceExpense__String(), ecorePackage.getEDouble(), "getServiceExpense", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesAccess__IsRSODelivered__String(), theTypesPackage.getBoolean(), "isRSODelivered", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "orderID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesAccess__GetRSODeliveryDate__String(), ecorePackage.getEDate(), "getRSODeliveryDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "orderID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesAccess__GetRSOBookable__String(), theTypesPackage.getString(), "getRSOBookable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "orderID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesAccess__GetRSOItems__String(), theTypesPackage.getString(), "getRSOItems", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "orderID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesAccess__GetRSOServices__String(), theTypesPackage.getString(), "getRSOServices", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "orderID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesAccess__ChangeRSOISDelivered__String_boolean(), null, "changeRSOISDelivered", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "orderID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "isDelivered", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesAccess__ChangeRSODeliveryDate__String_Date(), null, "changeRSODeliveryDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "orderID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "date", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIServicesAccess__GetRoomServiceMenuName(), theTypesPackage.getString(), "getRoomServiceMenuName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIServicesAccess__GetRoomServiceMenuItems(), theTypesPackage.getString(), "getRoomServiceMenuItems", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesAccess__SetRSOBill__String_String(), null, "setRSOBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "orderID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "billID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesAccess__GetRSOBill__String(), theTypesPackage.getString(), "getRSOBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "orderID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesAccess__MakeRoomServiceOrder__EList_EList_String_String_Date_boolean(), null, "makeRoomServiceOrder", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "items", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "services", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "deliveryDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getBoolean(), "isDelivered", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(serviceManagerEClass, ServiceManager.class, "ServiceManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getServiceManager_Service(), this.getService(), null, "service", null, 0, -1, ServiceManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceManager_RoomServiceOrder(), this.getRoomServiceOrder(), null, "roomServiceOrder", null, 0, -1, ServiceManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getServiceManager_RoomServiceMenu(), this.getRoomServiceMenu(), null, "roomServiceMenu", null, 1, 1, ServiceManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Name(), theTypesPackage.getString(), "name", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getService_Price(), ecorePackage.getEDouble(), "price", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getService_Expense(), ecorePackage.getEDouble(), "expense", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getService_Id(), theTypesPackage.getString(), "id", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomServiceOrderEClass, RoomServiceOrder.class, "RoomServiceOrder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoomServiceOrder_Service(), this.getService(), null, "service", null, 0, -1, RoomServiceOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomServiceOrder_IsDelivered(), theTypesPackage.getBoolean(), "isDelivered", null, 1, 1, RoomServiceOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomServiceOrder_DeliveryDate(), ecorePackage.getEDate(), "deliveryDate", null, 1, 1, RoomServiceOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomServiceOrder_Bookable(), theTypesPackage.getString(), "bookable", null, 1, 1, RoomServiceOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomServiceOrder_Items(), theTypesPackage.getString(), "items", null, 0, -1, RoomServiceOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomServiceOrder_Id(), theTypesPackage.getString(), "id", null, 1, 1, RoomServiceOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomServiceOrder_Bill(), theTypesPackage.getString(), "bill", null, 1, 1, RoomServiceOrder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getRoomServiceOrder__AddService(), null, "addService", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomServiceOrder__AddItem(), null, "addItem", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomServiceOrder__RemoveItem(), null, "removeItem", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getRoomServiceOrder__RemoveService(), null, "removeService", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iServicesManageEClass, IServicesManage.class, "IServicesManage", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIServicesManage__ChangeServiceName__String_String(), null, "changeServiceName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesManage__ChangeServicePrice__String_double(), null, "changeServicePrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesManage__ChangeServiceExpense__String_double(), null, "changeServiceExpense", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "expense", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesManage__AddRoomServiceMenuItem__String(), null, "addRoomServiceMenuItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "itemID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesManage__RemoveRoomServiceMenuItem__String(), null, "removeRoomServiceMenuItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "itemID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesManage__ChangeRoomServiceMenuName__String(), null, "changeRoomServiceMenuName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIServicesManage__AddService__String_double_double(), null, "addService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "name", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "price", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "expense", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ServicesPackageImpl
