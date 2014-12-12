/**
 */
package Classes.Bills.impl;

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
import Classes.Bills.Bill;
import Classes.Bills.BillsFactory;
import Classes.Bills.BillsManager;
import Classes.Bills.BillsPackage;
import Classes.Bills.IBills;
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
import Classes.Stays.StaysPackage;
import Classes.Stays.impl.StaysPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BillsPackageImpl extends EPackageImpl implements BillsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billsManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass billEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iBillsEClass = null;

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
	 * @see Classes.Bills.BillsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BillsPackageImpl() {
		super(eNS_URI, BillsFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BillsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BillsPackage init() {
		if (isInited) return (BillsPackage)EPackage.Registry.INSTANCE.getEPackage(BillsPackage.eNS_URI);

		// Obtain or create and register package
		BillsPackageImpl theBillsPackage = (BillsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BillsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BillsPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		BookablesPackageImpl theBookablesPackage = (BookablesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BookablesPackage.eNS_URI) instanceof BookablesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BookablesPackage.eNS_URI) : BookablesPackage.eINSTANCE);
		StaysPackageImpl theStaysPackage = (StaysPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(StaysPackage.eNS_URI) instanceof StaysPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(StaysPackage.eNS_URI) : StaysPackage.eINSTANCE);
		BankingPackageImpl theBankingPackage = (BankingPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(BankingPackage.eNS_URI) instanceof BankingPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(BankingPackage.eNS_URI) : BankingPackage.eINSTANCE);
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
		RequestsPackageImpl theRequestsPackage = (RequestsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequestsPackage.eNS_URI) instanceof RequestsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequestsPackage.eNS_URI) : RequestsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theBillsPackage.createPackageContents();
		theBookablesPackage.createPackageContents();
		theStaysPackage.createPackageContents();
		theBankingPackage.createPackageContents();
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
		theRequestsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theBillsPackage.initializePackageContents();
		theBookablesPackage.initializePackageContents();
		theStaysPackage.initializePackageContents();
		theBankingPackage.initializePackageContents();
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
		theRequestsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBillsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BillsPackage.eNS_URI, theBillsPackage);
		return theBillsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBillsManager() {
		return billsManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillsManager_Bills() {
		return (EReference)billsManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillsManager_CustomerProvides() {
		return (EReference)billsManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillsManager_BookablesAccess() {
		return (EReference)billsManagerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillsManager_InventoryAccess() {
		return (EReference)billsManagerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBillsManager_ServicesAccess() {
		return (EReference)billsManagerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBill() {
		return billEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_IsPaid() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_PaymentType() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_Id() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_Items() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_Services() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_Bookable() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_IssueDate() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_PaymentDate() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBill_TotalAmount() {
		return (EAttribute)billEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBill__AddItem__String() {
		return billEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBill__AddService__String() {
		return billEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIBills() {
		return iBillsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBills__GetIsBillPaid__String() {
		return iBillsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBills__GetAllBillsNotPaid() {
		return iBillsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBills__GetBillPaymentDate__String() {
		return iBillsEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBills__GetAllBillIDs() {
		return iBillsEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBills__SearchBills__String() {
		return iBillsEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBills__GetAllPayedBills() {
		return iBillsEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBills__AddBill__EList_EList_String() {
		return iBillsEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBills__PayBillsWithCreditCard__EList_String_String_int_int_String_String() {
		return iBillsEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBills__GetBillItems__String() {
		return iBillsEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBills__GetBillBookable__String() {
		return iBillsEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBills__GetBillServices__String() {
		return iBillsEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBills__GetBillIssueDate__String() {
		return iBillsEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBills__GetBillPaymentType__String() {
		return iBillsEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBills__PayBillsWithCash__EList() {
		return iBillsEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBills__SendInvoice__String_String() {
		return iBillsEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBills__RemoveBill__String() {
		return iBillsEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIBills__GetBillTotalAmount__String() {
		return iBillsEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillsFactory getBillsFactory() {
		return (BillsFactory)getEFactoryInstance();
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
		billsManagerEClass = createEClass(BILLS_MANAGER);
		createEReference(billsManagerEClass, BILLS_MANAGER__BILLS);
		createEReference(billsManagerEClass, BILLS_MANAGER__CUSTOMER_PROVIDES);
		createEReference(billsManagerEClass, BILLS_MANAGER__BOOKABLES_ACCESS);
		createEReference(billsManagerEClass, BILLS_MANAGER__INVENTORY_ACCESS);
		createEReference(billsManagerEClass, BILLS_MANAGER__SERVICES_ACCESS);

		billEClass = createEClass(BILL);
		createEAttribute(billEClass, BILL__IS_PAID);
		createEAttribute(billEClass, BILL__PAYMENT_TYPE);
		createEAttribute(billEClass, BILL__ID);
		createEAttribute(billEClass, BILL__ITEMS);
		createEAttribute(billEClass, BILL__SERVICES);
		createEAttribute(billEClass, BILL__BOOKABLE);
		createEAttribute(billEClass, BILL__ISSUE_DATE);
		createEAttribute(billEClass, BILL__PAYMENT_DATE);
		createEAttribute(billEClass, BILL__TOTAL_AMOUNT);
		createEOperation(billEClass, BILL___ADD_ITEM__STRING);
		createEOperation(billEClass, BILL___ADD_SERVICE__STRING);

		iBillsEClass = createEClass(IBILLS);
		createEOperation(iBillsEClass, IBILLS___GET_IS_BILL_PAID__STRING);
		createEOperation(iBillsEClass, IBILLS___GET_ALL_BILLS_NOT_PAID);
		createEOperation(iBillsEClass, IBILLS___GET_BILL_PAYMENT_DATE__STRING);
		createEOperation(iBillsEClass, IBILLS___GET_ALL_BILL_IDS);
		createEOperation(iBillsEClass, IBILLS___SEARCH_BILLS__STRING);
		createEOperation(iBillsEClass, IBILLS___GET_ALL_PAYED_BILLS);
		createEOperation(iBillsEClass, IBILLS___ADD_BILL__ELIST_ELIST_STRING);
		createEOperation(iBillsEClass, IBILLS___PAY_BILLS_WITH_CREDIT_CARD__ELIST_STRING_STRING_INT_INT_STRING_STRING);
		createEOperation(iBillsEClass, IBILLS___GET_BILL_ITEMS__STRING);
		createEOperation(iBillsEClass, IBILLS___GET_BILL_BOOKABLE__STRING);
		createEOperation(iBillsEClass, IBILLS___GET_BILL_SERVICES__STRING);
		createEOperation(iBillsEClass, IBILLS___GET_BILL_ISSUE_DATE__STRING);
		createEOperation(iBillsEClass, IBILLS___GET_BILL_PAYMENT_TYPE__STRING);
		createEOperation(iBillsEClass, IBILLS___PAY_BILLS_WITH_CASH__ELIST);
		createEOperation(iBillsEClass, IBILLS___SEND_INVOICE__STRING_STRING);
		createEOperation(iBillsEClass, IBILLS___REMOVE_BILL__STRING);
		createEOperation(iBillsEClass, IBILLS___GET_BILL_TOTAL_AMOUNT__STRING);
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
		BankingPackage theBankingPackage = (BankingPackage)EPackage.Registry.INSTANCE.getEPackage(BankingPackage.eNS_URI);
		BookablesPackage theBookablesPackage = (BookablesPackage)EPackage.Registry.INSTANCE.getEPackage(BookablesPackage.eNS_URI);
		InventoryPackage theInventoryPackage = (InventoryPackage)EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI);
		ServicesPackage theServicesPackage = (ServicesPackage)EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		billsManagerEClass.getESuperTypes().add(this.getIBills());

		// Initialize classes, features, and operations; add parameters
		initEClass(billsManagerEClass, BillsManager.class, "BillsManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBillsManager_Bills(), this.getBill(), null, "bills", null, 0, -1, BillsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBillsManager_CustomerProvides(), theBankingPackage.getCustomerProvides(), null, "customerProvides", null, 1, 1, BillsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBillsManager_BookablesAccess(), theBookablesPackage.getIBookablesAccess(), null, "bookablesAccess", null, 1, 1, BillsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBillsManager_InventoryAccess(), theInventoryPackage.getIInventoryAccess(), null, "inventoryAccess", null, 1, 1, BillsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBillsManager_ServicesAccess(), theServicesPackage.getIServicesAccess(), null, "servicesAccess", null, 1, 1, BillsManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(billEClass, Bill.class, "Bill", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBill_IsPaid(), theTypesPackage.getBoolean(), "isPaid", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_PaymentType(), theTypesPackage.getString(), "paymentType", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_Id(), theTypesPackage.getString(), "id", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_Items(), theTypesPackage.getString(), "items", null, 0, -1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_Services(), theTypesPackage.getString(), "services", null, 0, -1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_Bookable(), theTypesPackage.getString(), "bookable", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_IssueDate(), ecorePackage.getEDate(), "issueDate", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_PaymentDate(), ecorePackage.getEDate(), "paymentDate", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getBill_TotalAmount(), ecorePackage.getEDouble(), "totalAmount", null, 1, 1, Bill.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getBill__AddItem__String(), null, "addItem", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "itemID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getBill__AddService__String(), null, "addService", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "serviceID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iBillsEClass, IBills.class, "IBills", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(getIBills__GetIsBillPaid__String(), theTypesPackage.getBoolean(), "getIsBillPaid", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "billID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBills__GetAllBillsNotPaid(), theTypesPackage.getString(), "getAllBillsNotPaid", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBills__GetBillPaymentDate__String(), ecorePackage.getEDate(), "getBillPaymentDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "billID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBills__GetAllBillIDs(), theTypesPackage.getString(), "getAllBillIDs", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBills__SearchBills__String(), theTypesPackage.getString(), "searchBills", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "keyword", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIBills__GetAllPayedBills(), theTypesPackage.getString(), "getAllPayedBills", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBills__AddBill__EList_EList_String(), null, "addBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "items", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "services", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bookable", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBills__PayBillsWithCreditCard__EList_String_String_int_int_String_String(), null, "payBillsWithCreditCard", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bills", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "ccv", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryMonth", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "expiryYear", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBills__GetBillItems__String(), theTypesPackage.getString(), "getBillItems", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "billID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBills__GetBillBookable__String(), theTypesPackage.getString(), "getBillBookable", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "billID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBills__GetBillServices__String(), theTypesPackage.getString(), "getBillServices", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "billID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBills__GetBillIssueDate__String(), ecorePackage.getEDate(), "getBillIssueDate", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "billID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBills__GetBillPaymentType__String(), theTypesPackage.getString(), "getBillPaymentType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "billID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBills__PayBillsWithCash__EList(), null, "payBillsWithCash", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "bills", 0, -1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBills__SendInvoice__String_String(), null, "sendInvoice", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "billID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBills__RemoveBill__String(), null, "removeBill", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "billID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIBills__GetBillTotalAmount__String(), ecorePackage.getEDouble(), "getBillTotalAmount", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "billID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BillsPackageImpl
