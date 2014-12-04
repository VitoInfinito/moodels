/**
 */
package Classes.Bookables.impl;

import Classes.Accounts.AccountsPackage;
import Classes.Accounts.impl.AccountsPackageImpl;
import Classes.Banking.BankingPackage;
import Classes.Banking.impl.BankingPackageImpl;
import Classes.Bills.BillsPackage;
import Classes.Bills.impl.BillsPackageImpl;
import Classes.Bookables.Bookable;
import Classes.Bookables.BookablesFactory;
import Classes.Bookables.BookablesManager;
import Classes.Bookables.BookablesPackage;
import Classes.Bookables.ConferenceRoom;
import Classes.Bookables.ConferenceRoomCategory;
import Classes.Bookables.HostelBed;
import Classes.Bookables.HotelRoom;
import Classes.Bookables.HotelRoomCategory;
import Classes.Bookables.IBookablesAccess;
import Classes.Bookables.IBookablesManage;
import Classes.Bookables.Room;
import Classes.Bookables.RoomLocation;
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
import Classes.Stays.StaysPackage;
import Classes.Stays.impl.StaysPackageImpl;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
public class BookablesPackageImpl extends EPackageImpl implements BookablesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass roomLocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hostelBedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conferenceRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hotelRoomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBookablesManageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBookablesAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookablesManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conferenceRoomCategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum hotelRoomCategoryEEnum = null;

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
	 * @see Classes.Bookables.BookablesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BookablesPackageImpl() {
		super(eNS_URI, BookablesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BookablesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BookablesPackage init() {
		if (isInited) return (BookablesPackage)EPackage.Registry.INSTANCE.getEPackage(BookablesPackage.eNS_URI);

		// Obtain or create and register package
		BookablesPackageImpl theBookablesPackage = (BookablesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BookablesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BookablesPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
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
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) : ServicesPackage.eINSTANCE);
		FeedbackPackageImpl theFeedbackPackage = (FeedbackPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeedbackPackage.eNS_URI) instanceof FeedbackPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeedbackPackage.eNS_URI) : FeedbackPackage.eINSTANCE);
		RequestsPackageImpl theRequestsPackage = (RequestsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequestsPackage.eNS_URI) instanceof RequestsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequestsPackage.eNS_URI) : RequestsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
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
		theServicesPackage.createPackageContents();
		theFeedbackPackage.createPackageContents();
		theRequestsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
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
		theServicesPackage.initializePackageContents();
		theFeedbackPackage.initializePackageContents();
		theRequestsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBookablesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BookablesPackage.eNS_URI, theBookablesPackage);
		return theBookablesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookable() {
		return bookableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookable_Baseprice() {
		return (EAttribute)bookableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookable_Id() {
		return (EAttribute)bookableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookable_Description() {
		return (EAttribute)bookableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoom() {
		return roomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRoom_Location() {
		return (EReference)roomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRoomLocation() {
		return roomLocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomLocation_Floor() {
		return (EAttribute)roomLocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRoomLocation_AddtionalInfo() {
		return (EAttribute)roomLocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHostelBed() {
		return hostelBedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHostelBed_Room() {
		return (EReference)hostelBedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConferenceRoom() {
		return conferenceRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConferenceRoom_Category() {
		return (EAttribute)conferenceRoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConferenceRoom_Capacity() {
		return (EAttribute)conferenceRoomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHotelRoom() {
		return hotelRoomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotelRoom_Category() {
		return (EAttribute)hotelRoomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHotelRoom_NbrBeds() {
		return (EAttribute)hotelRoomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBookablesManage() {
		return iBookablesManageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesManage__ChangeHostelBedRoom__String_String() {
		return iBookablesManageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesManage__DeleteBookable__String() {
		return iBookablesManageEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesManage__ChangeRoomLocation__String_int_String() {
		return iBookablesManageEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesManage__ChangeHotelRoomCategory__String_HotelRoomCategory() {
		return iBookablesManageEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesManage__ChangeConferenceRoomCategory__String_ConferenceRoomCategory() {
		return iBookablesManageEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesManage__ChangeBookableBasePrice__String_double() {
		return iBookablesManageEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesManage__ChangeBookableDescription__String_String() {
		return iBookablesManageEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesManage__AddHotelRoom__double_String_int_String_HotelRoomCategory_int() {
		return iBookablesManageEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesManage__AddHostelBed__double_String_String() {
		return iBookablesManageEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesManage__AddConferenceRoom__double_String_int_String_ConferenceRoomCategory_int() {
		return iBookablesManageEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesManage__ChangeHotelRoomNumberBeds__String_int() {
		return iBookablesManageEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesManage__ChangeConferenceRoomCapacity__String_int() {
		return iBookablesManageEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBookablesAccess() {
		return iBookablesAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesAccess__GetBookableBasePrice__String() {
		return iBookablesAccessEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesAccess__GetRoomLocationInfo__String() {
		return iBookablesAccessEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesAccess__GetBookableDescription__String() {
		return iBookablesAccessEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesAccess__GetAllBookableIDs() {
		return iBookablesAccessEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesAccess__GetRoomOfHostelBed__String() {
		return iBookablesAccessEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesAccess__GetHotelRoomCategory__String() {
		return iBookablesAccessEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesAccess__GetConferenceRoomCapacity__String() {
		return iBookablesAccessEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesAccess__GetHotelRoomNbrBeds__String() {
		return iBookablesAccessEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesAccess__SearchForBookable__String() {
		return iBookablesAccessEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesAccess__GetRoomLocationFloor__String() {
		return iBookablesAccessEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesAccess__GetAllHotelRoomIDs() {
		return iBookablesAccessEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesAccess__GetAllConferenceRoomIDs() {
		return iBookablesAccessEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesAccess__GetAllHostelBedIDs() {
		return iBookablesAccessEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesAccess__GetConferenceRoomCategory__String() {
		return iBookablesAccessEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesAccess__SearchHotelRooms__String_HotelRoomCategory() {
		return iBookablesAccessEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesAccess__SearchHostelBeds__String() {
		return iBookablesAccessEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBookablesAccess__SearchConferenceRooms__String_ConferenceRoomCategory() {
		return iBookablesAccessEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookablesManager() {
		return bookablesManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookablesManager_Bookables() {
		return (EReference)bookablesManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookablesManager_IHotelStayManager() {
		return (EReference)bookablesManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConferenceRoomCategory() {
		return conferenceRoomCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHotelRoomCategory() {
		return hotelRoomCategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookablesFactory getBookablesFactory() {
		return (BookablesFactory)getEFactoryInstance();
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
		bookableEClass = createEClass(BOOKABLE);
		createEAttribute(bookableEClass, BOOKABLE__BASEPRICE);
		createEAttribute(bookableEClass, BOOKABLE__ID);
		createEAttribute(bookableEClass, BOOKABLE__DESCRIPTION);

		roomEClass = createEClass(ROOM);
		createEReference(roomEClass, ROOM__LOCATION);

		roomLocationEClass = createEClass(ROOM_LOCATION);
		createEAttribute(roomLocationEClass, ROOM_LOCATION__FLOOR);
		createEAttribute(roomLocationEClass, ROOM_LOCATION__ADDTIONAL_INFO);

		hostelBedEClass = createEClass(HOSTEL_BED);
		createEReference(hostelBedEClass, HOSTEL_BED__ROOM);

		conferenceRoomEClass = createEClass(CONFERENCE_ROOM);
		createEAttribute(conferenceRoomEClass, CONFERENCE_ROOM__CATEGORY);
		createEAttribute(conferenceRoomEClass, CONFERENCE_ROOM__CAPACITY);

		hotelRoomEClass = createEClass(HOTEL_ROOM);
		createEAttribute(hotelRoomEClass, HOTEL_ROOM__CATEGORY);
		createEAttribute(hotelRoomEClass, HOTEL_ROOM__NBR_BEDS);

		iBookablesManageEClass = createEClass(IBOOKABLES_MANAGE);
		createEOperation(iBookablesManageEClass, IBOOKABLES_MANAGE___CHANGE_HOSTEL_BED_ROOM__STRING_STRING);
		createEOperation(iBookablesManageEClass, IBOOKABLES_MANAGE___DELETE_BOOKABLE__STRING);
		createEOperation(iBookablesManageEClass, IBOOKABLES_MANAGE___CHANGE_ROOM_LOCATION__STRING_INT_STRING);
		createEOperation(iBookablesManageEClass, IBOOKABLES_MANAGE___CHANGE_HOTEL_ROOM_CATEGORY__STRING_HOTELROOMCATEGORY);
		createEOperation(iBookablesManageEClass, IBOOKABLES_MANAGE___CHANGE_CONFERENCE_ROOM_CATEGORY__STRING_CONFERENCEROOMCATEGORY);
		createEOperation(iBookablesManageEClass, IBOOKABLES_MANAGE___CHANGE_BOOKABLE_BASE_PRICE__STRING_DOUBLE);
		createEOperation(iBookablesManageEClass, IBOOKABLES_MANAGE___CHANGE_BOOKABLE_DESCRIPTION__STRING_STRING);
		createEOperation(iBookablesManageEClass, IBOOKABLES_MANAGE___ADD_HOTEL_ROOM__DOUBLE_STRING_INT_STRING_HOTELROOMCATEGORY_INT);
		createEOperation(iBookablesManageEClass, IBOOKABLES_MANAGE___ADD_HOSTEL_BED__DOUBLE_STRING_STRING);
		createEOperation(iBookablesManageEClass, IBOOKABLES_MANAGE___ADD_CONFERENCE_ROOM__DOUBLE_STRING_INT_STRING_CONFERENCEROOMCATEGORY_INT);
		createEOperation(iBookablesManageEClass, IBOOKABLES_MANAGE___CHANGE_HOTEL_ROOM_NUMBER_BEDS__STRING_INT);
		createEOperation(iBookablesManageEClass, IBOOKABLES_MANAGE___CHANGE_CONFERENCE_ROOM_CAPACITY__STRING_INT);

		iBookablesAccessEClass = createEClass(IBOOKABLES_ACCESS);
		createEOperation(iBookablesAccessEClass, IBOOKABLES_ACCESS___GET_BOOKABLE_BASE_PRICE__STRING);
		createEOperation(iBookablesAccessEClass, IBOOKABLES_ACCESS___GET_ROOM_LOCATION_INFO__STRING);
		createEOperation(iBookablesAccessEClass, IBOOKABLES_ACCESS___GET_BOOKABLE_DESCRIPTION__STRING);
		createEOperation(iBookablesAccessEClass, IBOOKABLES_ACCESS___GET_ALL_BOOKABLE_IDS);
		createEOperation(iBookablesAccessEClass, IBOOKABLES_ACCESS___GET_ROOM_OF_HOSTEL_BED__STRING);
		createEOperation(iBookablesAccessEClass, IBOOKABLES_ACCESS___GET_HOTEL_ROOM_CATEGORY__STRING);
		createEOperation(iBookablesAccessEClass, IBOOKABLES_ACCESS___GET_CONFERENCE_ROOM_CAPACITY__STRING);
		createEOperation(iBookablesAccessEClass, IBOOKABLES_ACCESS___GET_HOTEL_ROOM_NBR_BEDS__STRING);
		createEOperation(iBookablesAccessEClass, IBOOKABLES_ACCESS___SEARCH_FOR_BOOKABLE__STRING);
		createEOperation(iBookablesAccessEClass, IBOOKABLES_ACCESS___GET_ROOM_LOCATION_FLOOR__STRING);
		createEOperation(iBookablesAccessEClass, IBOOKABLES_ACCESS___GET_ALL_HOTEL_ROOM_IDS);
		createEOperation(iBookablesAccessEClass, IBOOKABLES_ACCESS___GET_ALL_CONFERENCE_ROOM_IDS);
		createEOperation(iBookablesAccessEClass, IBOOKABLES_ACCESS___GET_ALL_HOSTEL_BED_IDS);
		createEOperation(iBookablesAccessEClass, IBOOKABLES_ACCESS___GET_CONFERENCE_ROOM_CATEGORY__STRING);
		createEOperation(iBookablesAccessEClass, IBOOKABLES_ACCESS___SEARCH_HOTEL_ROOMS__STRING_HOTELROOMCATEGORY);
		createEOperation(iBookablesAccessEClass, IBOOKABLES_ACCESS___SEARCH_HOSTEL_BEDS__STRING);
		createEOperation(iBookablesAccessEClass, IBOOKABLES_ACCESS___SEARCH_CONFERENCE_ROOMS__STRING_CONFERENCEROOMCATEGORY);

		bookablesManagerEClass = createEClass(BOOKABLES_MANAGER);
		createEReference(bookablesManagerEClass, BOOKABLES_MANAGER__BOOKABLES);
		createEReference(bookablesManagerEClass, BOOKABLES_MANAGER__IHOTEL_STAY_MANAGER);

		// Create enums
		conferenceRoomCategoryEEnum = createEEnum(CONFERENCE_ROOM_CATEGORY);
		hotelRoomCategoryEEnum = createEEnum(HOTEL_ROOM_CATEGORY);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		roomEClass.getESuperTypes().add(this.getBookable());
		hostelBedEClass.getESuperTypes().add(this.getBookable());
		conferenceRoomEClass.getESuperTypes().add(this.getRoom());
		hotelRoomEClass.getESuperTypes().add(this.getRoom());
		iBookablesManageEClass.getESuperTypes().add(this.getIBookablesAccess());
		bookablesManagerEClass.getESuperTypes().add(this.getIBookablesManage());

		// Initialize classes, features, and operations; add parameters
		initEClass(bookableEClass, Bookable.class, "Bookable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBookable_Baseprice(), ecorePackage.getEDouble(), "baseprice", null, 1, 1, Bookable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookable_Id(), theTypesPackage.getString(), "id", null, 1, 1, Bookable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBookable_Description(), theTypesPackage.getString(), "description", null, 1, 1, Bookable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomEClass, Room.class, "Room", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRoom_Location(), this.getRoomLocation(), null, "location", null, 1, 1, Room.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(roomLocationEClass, RoomLocation.class, "RoomLocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoomLocation_Floor(), theTypesPackage.getInteger(), "floor", null, 1, 1, RoomLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoomLocation_AddtionalInfo(), theTypesPackage.getString(), "addtionalInfo", null, 1, 1, RoomLocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hostelBedEClass, HostelBed.class, "HostelBed", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHostelBed_Room(), this.getRoom(), null, "room", null, 1, 1, HostelBed.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(conferenceRoomEClass, ConferenceRoom.class, "ConferenceRoom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConferenceRoom_Category(), this.getConferenceRoomCategory(), "category", null, 1, 1, ConferenceRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getConferenceRoom_Capacity(), theTypesPackage.getInteger(), "capacity", null, 1, 1, ConferenceRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hotelRoomEClass, HotelRoom.class, "HotelRoom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHotelRoom_Category(), this.getHotelRoomCategory(), "category", null, 1, 1, HotelRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHotelRoom_NbrBeds(), theTypesPackage.getInteger(), "nbrBeds", null, 1, 1, HotelRoom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iBookablesManageEClass, IBookablesManage.class, "IBookablesManage", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getIBookablesManage__ChangeHostelBedRoom__String_String(), null, "changeHostelBedRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "hostelBedID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesManage__DeleteBookable__String(), null, "deleteBookable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookableID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesManage__ChangeRoomLocation__String_int_String(), null, "changeRoomLocation", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "floor", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "additionalInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesManage__ChangeHotelRoomCategory__String_HotelRoomCategory(), null, "changeHotelRoomCategory", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotelRoomCategory(), "category", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesManage__ChangeConferenceRoomCategory__String_ConferenceRoomCategory(), null, "changeConferenceRoomCategory", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getConferenceRoomCategory(), "category", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesManage__ChangeBookableBasePrice__String_double(), null, "changeBookableBasePrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookableID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "basePrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesManage__ChangeBookableDescription__String_String(), null, "changeBookableDescription", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookableID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesManage__AddHotelRoom__double_String_int_String_HotelRoomCategory_int(), theTypesPackage.getString(), "addHotelRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "basePrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "floor", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "locationInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotelRoomCategory(), "category", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nbrBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesManage__AddHostelBed__double_String_String(), theTypesPackage.getString(), "addHostelBed", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "basePrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesManage__AddConferenceRoom__double_String_int_String_ConferenceRoomCategory_int(), theTypesPackage.getString(), "addConferenceRoom", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "basePrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "description", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "floor", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "locationInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getConferenceRoomCategory(), "category", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "capacity", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesManage__ChangeHotelRoomNumberBeds__String_int(), null, "changeHotelRoomNumberBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "nbrBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesManage__ChangeConferenceRoomCapacity__String_int(), null, "changeConferenceRoomCapacity", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getInteger(), "capacity", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBookablesAccessEClass, IBookablesAccess.class, "IBookablesAccess", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIBookablesAccess__GetBookableBasePrice__String(), ecorePackage.getEDouble(), "getBookableBasePrice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookableID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesAccess__GetRoomLocationInfo__String(), theTypesPackage.getString(), "getRoomLocationInfo", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesAccess__GetBookableDescription__String(), theTypesPackage.getString(), "getBookableDescription", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookableID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookablesAccess__GetAllBookableIDs(), theTypesPackage.getString(), "getAllBookableIDs", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesAccess__GetRoomOfHostelBed__String(), theTypesPackage.getString(), "getRoomOfHostelBed", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "hostelBedID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesAccess__GetHotelRoomCategory__String(), this.getHotelRoomCategory(), "getHotelRoomCategory", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesAccess__GetConferenceRoomCapacity__String(), theTypesPackage.getInteger(), "getConferenceRoomCapacity", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesAccess__GetHotelRoomNbrBeds__String(), theTypesPackage.getInteger(), "getHotelRoomNbrBeds", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesAccess__SearchForBookable__String(), theTypesPackage.getString(), "searchForBookable", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "keyword", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesAccess__GetRoomLocationFloor__String(), theTypesPackage.getInteger(), "getRoomLocationFloor", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookablesAccess__GetAllHotelRoomIDs(), theTypesPackage.getString(), "getAllHotelRoomIDs", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookablesAccess__GetAllConferenceRoomIDs(), theTypesPackage.getString(), "getAllConferenceRoomIDs", 0, -1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBookablesAccess__GetAllHostelBedIDs(), theTypesPackage.getString(), "getAllHostelBedIDs", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesAccess__GetConferenceRoomCategory__String(), this.getConferenceRoomCategory(), "getConferenceRoomCategory", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "roomID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesAccess__SearchHotelRooms__String_HotelRoomCategory(), theTypesPackage.getString(), "searchHotelRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "keyword", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getHotelRoomCategory(), "category", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesAccess__SearchHostelBeds__String(), theTypesPackage.getString(), "searchHostelBeds", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "keyword", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBookablesAccess__SearchConferenceRooms__String_ConferenceRoomCategory(), theTypesPackage.getString(), "searchConferenceRooms", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "keyword", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getConferenceRoomCategory(), "category", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(bookablesManagerEClass, BookablesManager.class, "BookablesManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookablesManager_Bookables(), this.getBookable(), null, "bookables", null, 0, -1, BookablesManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBookablesManager_IHotelStayManager(), theStaysPackage.getIStays(), null, "iHotelStayManager", null, 1, 1, BookablesManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(conferenceRoomCategoryEEnum, ConferenceRoomCategory.class, "ConferenceRoomCategory");
		addEEnumLiteral(conferenceRoomCategoryEEnum, ConferenceRoomCategory.DINING_ROOM);
		addEEnumLiteral(conferenceRoomCategoryEEnum, ConferenceRoomCategory.LECTURE_ROOM);
		addEEnumLiteral(conferenceRoomCategoryEEnum, ConferenceRoomCategory.MEETING_ROOM);
		addEEnumLiteral(conferenceRoomCategoryEEnum, ConferenceRoomCategory.OTHER);

		initEEnum(hotelRoomCategoryEEnum, HotelRoomCategory.class, "HotelRoomCategory");
		addEEnumLiteral(hotelRoomCategoryEEnum, HotelRoomCategory.STANDARD_ROOM);
		addEEnumLiteral(hotelRoomCategoryEEnum, HotelRoomCategory.FAMILY_ROOM);
		addEEnumLiteral(hotelRoomCategoryEEnum, HotelRoomCategory.SUITE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/uml2/2.0.0/UML
		createUMLAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/uml2/2.0.0/UML</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUMLAnnotations() {
		String source = "http://www.eclipse.org/uml2/2.0.0/UML";	
		addAnnotation
		  (roomLocationEClass, 
		   source, 
		   new String[] {
			 "originalName", "Room Location"
		   });	
		addAnnotation
		  (hostelBedEClass, 
		   source, 
		   new String[] {
			 "originalName", "Hostel Bed"
		   });	
		addAnnotation
		  (conferenceRoomEClass, 
		   source, 
		   new String[] {
			 "originalName", "Conference Room"
		   });	
		addAnnotation
		  (conferenceRoomCategoryEEnum, 
		   source, 
		   new String[] {
			 "originalName", "Conference Room Category"
		   });	
		addAnnotation
		  (hotelRoomEClass, 
		   source, 
		   new String[] {
			 "originalName", "Hotel Room"
		   });	
		addAnnotation
		  (hotelRoomCategoryEEnum, 
		   source, 
		   new String[] {
			 "originalName", "Hotel Room Category"
		   });
	}

} //BookablesPackageImpl
