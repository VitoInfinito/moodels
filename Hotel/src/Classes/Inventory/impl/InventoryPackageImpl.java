/**
 */
package Classes.Inventory.impl;

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

import Classes.Inventory.IInventoryAccess;
import Classes.Inventory.IManageInventory;
import Classes.Inventory.Inventory;
import Classes.Inventory.InventoryFactory;
import Classes.Inventory.InventoryPackage;
import Classes.Inventory.ItemType;

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
public class InventoryPackageImpl extends EPackageImpl implements InventoryPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iManageInventoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iInventoryAccessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inventoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemTypeEClass = null;

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
	 * @see Classes.Inventory.InventoryPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private InventoryPackageImpl() {
		super(eNS_URI, InventoryFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link InventoryPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static InventoryPackage init() {
		if (isInited) return (InventoryPackage)EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI);

		// Obtain or create and register package
		InventoryPackageImpl theInventoryPackage = (InventoryPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof InventoryPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new InventoryPackageImpl());

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
		RestaurantsPackageImpl theRestaurantsPackage = (RestaurantsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestaurantsPackage.eNS_URI) instanceof RestaurantsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestaurantsPackage.eNS_URI) : RestaurantsPackage.eINSTANCE);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) : ServicesPackage.eINSTANCE);
		FeedbackPackageImpl theFeedbackPackage = (FeedbackPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeedbackPackage.eNS_URI) instanceof FeedbackPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeedbackPackage.eNS_URI) : FeedbackPackage.eINSTANCE);
		RequestsPackageImpl theRequestsPackage = (RequestsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequestsPackage.eNS_URI) instanceof RequestsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequestsPackage.eNS_URI) : RequestsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theInventoryPackage.createPackageContents();
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
		theRestaurantsPackage.createPackageContents();
		theServicesPackage.createPackageContents();
		theFeedbackPackage.createPackageContents();
		theRequestsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theInventoryPackage.initializePackageContents();
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
		theRestaurantsPackage.initializePackageContents();
		theServicesPackage.initializePackageContents();
		theFeedbackPackage.initializePackageContents();
		theRequestsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInventoryPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(InventoryPackage.eNS_URI, theInventoryPackage);
		return theInventoryPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIManageInventory() {
		return iManageInventoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIManageInventory__ChangeItemName() {
		return iManageInventoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIManageInventory__ChangeItemPrice() {
		return iManageInventoryEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIManageInventory__ChangeItemExpense() {
		return iManageInventoryEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIManageInventory__AddItem() {
		return iManageInventoryEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIManageInventory__RemoveItem() {
		return iManageInventoryEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIInventoryAccess() {
		return iInventoryAccessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIInventoryAccess__ChangeItemStock() {
		return iInventoryAccessEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIInventoryAccess__GetItemPrice() {
		return iInventoryAccessEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIInventoryAccess__GetItemName() {
		return iInventoryAccessEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIInventoryAccess__GetItemStock() {
		return iInventoryAccessEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIInventoryAccess__GetItemExpense() {
		return iInventoryAccessEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIInventoryAccess__GetAllItemIDs() {
		return iInventoryAccessEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIInventoryAccess__SearchItems() {
		return iInventoryAccessEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInventory() {
		return inventoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInventory_ItemType() {
		return (EReference)inventoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemType() {
		return itemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_Name() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_Price() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_Expense() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_Stock() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemType_Id() {
		return (EAttribute)itemTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItemType__GetName() {
		return itemTypeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItemType__SetName() {
		return itemTypeEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItemType__GetPrice() {
		return itemTypeEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItemType__SetPrice() {
		return itemTypeEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItemType__GetExpense() {
		return itemTypeEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItemType__SetExpense() {
		return itemTypeEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItemType__GetStock() {
		return itemTypeEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItemType__SetStock() {
		return itemTypeEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItemType__GetId() {
		return itemTypeEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InventoryFactory getInventoryFactory() {
		return (InventoryFactory)getEFactoryInstance();
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
		iManageInventoryEClass = createEClass(IMANAGE_INVENTORY);
		createEOperation(iManageInventoryEClass, IMANAGE_INVENTORY___CHANGE_ITEM_NAME);
		createEOperation(iManageInventoryEClass, IMANAGE_INVENTORY___CHANGE_ITEM_PRICE);
		createEOperation(iManageInventoryEClass, IMANAGE_INVENTORY___CHANGE_ITEM_EXPENSE);
		createEOperation(iManageInventoryEClass, IMANAGE_INVENTORY___ADD_ITEM);
		createEOperation(iManageInventoryEClass, IMANAGE_INVENTORY___REMOVE_ITEM);

		iInventoryAccessEClass = createEClass(IINVENTORY_ACCESS);
		createEOperation(iInventoryAccessEClass, IINVENTORY_ACCESS___CHANGE_ITEM_STOCK);
		createEOperation(iInventoryAccessEClass, IINVENTORY_ACCESS___GET_ITEM_PRICE);
		createEOperation(iInventoryAccessEClass, IINVENTORY_ACCESS___GET_ITEM_NAME);
		createEOperation(iInventoryAccessEClass, IINVENTORY_ACCESS___GET_ITEM_STOCK);
		createEOperation(iInventoryAccessEClass, IINVENTORY_ACCESS___GET_ITEM_EXPENSE);
		createEOperation(iInventoryAccessEClass, IINVENTORY_ACCESS___GET_ALL_ITEM_IDS);
		createEOperation(iInventoryAccessEClass, IINVENTORY_ACCESS___SEARCH_ITEMS);

		inventoryEClass = createEClass(INVENTORY);
		createEReference(inventoryEClass, INVENTORY__ITEM_TYPE);

		itemTypeEClass = createEClass(ITEM_TYPE);
		createEAttribute(itemTypeEClass, ITEM_TYPE__NAME);
		createEAttribute(itemTypeEClass, ITEM_TYPE__PRICE);
		createEAttribute(itemTypeEClass, ITEM_TYPE__EXPENSE);
		createEAttribute(itemTypeEClass, ITEM_TYPE__STOCK);
		createEAttribute(itemTypeEClass, ITEM_TYPE__ID);
		createEOperation(itemTypeEClass, ITEM_TYPE___GET_NAME);
		createEOperation(itemTypeEClass, ITEM_TYPE___SET_NAME);
		createEOperation(itemTypeEClass, ITEM_TYPE___GET_PRICE);
		createEOperation(itemTypeEClass, ITEM_TYPE___SET_PRICE);
		createEOperation(itemTypeEClass, ITEM_TYPE___GET_EXPENSE);
		createEOperation(itemTypeEClass, ITEM_TYPE___SET_EXPENSE);
		createEOperation(itemTypeEClass, ITEM_TYPE___GET_STOCK);
		createEOperation(itemTypeEClass, ITEM_TYPE___SET_STOCK);
		createEOperation(itemTypeEClass, ITEM_TYPE___GET_ID);
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
		iManageInventoryEClass.getESuperTypes().add(this.getIInventoryAccess());
		inventoryEClass.getESuperTypes().add(this.getIManageInventory());

		// Initialize classes, features, and operations; add parameters
		initEClass(iManageInventoryEClass, IManageInventory.class, "IManageInventory", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIManageInventory__ChangeItemName(), null, "changeItemName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIManageInventory__ChangeItemPrice(), null, "changeItemPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIManageInventory__ChangeItemExpense(), null, "changeItemExpense", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIManageInventory__AddItem(), null, "addItem", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIManageInventory__RemoveItem(), null, "removeItem", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(iInventoryAccessEClass, IInventoryAccess.class, "IInventoryAccess", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIInventoryAccess__ChangeItemStock(), null, "changeItemStock", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIInventoryAccess__GetItemPrice(), null, "getItemPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIInventoryAccess__GetItemName(), null, "getItemName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIInventoryAccess__GetItemStock(), null, "getItemStock", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIInventoryAccess__GetItemExpense(), null, "getItemExpense", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIInventoryAccess__GetAllItemIDs(), null, "getAllItemIDs", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getIInventoryAccess__SearchItems(), null, "searchItems", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(inventoryEClass, Inventory.class, "Inventory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInventory_ItemType(), this.getItemType(), null, "itemType", null, 0, -1, Inventory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(itemTypeEClass, ItemType.class, "ItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItemType_Name(), theTypesPackage.getString(), "name", null, 1, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getItemType_Price(), theTypesPackage.getInteger(), "price", null, 1, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getItemType_Expense(), theTypesPackage.getInteger(), "expense", null, 1, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getItemType_Stock(), theTypesPackage.getInteger(), "stock", null, 1, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getItemType_Id(), theTypesPackage.getInteger(), "id", null, 1, 1, ItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getItemType__GetName(), null, "getName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getItemType__SetName(), null, "setName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getItemType__GetPrice(), null, "getPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getItemType__SetPrice(), null, "setPrice", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getItemType__GetExpense(), null, "getExpense", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getItemType__SetExpense(), null, "setExpense", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getItemType__GetStock(), null, "getStock", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getItemType__SetStock(), null, "setStock", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEOperation(getItemType__GetId(), null, "getId", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //InventoryPackageImpl
