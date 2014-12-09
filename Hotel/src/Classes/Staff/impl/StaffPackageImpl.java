/**
 */
package Classes.Staff.impl;

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
import Classes.Staff.HourlySalaryContract;
import Classes.Staff.IStaff;
import Classes.Staff.MonthlySalaryContract;
import Classes.Staff.SalaryContract;
import Classes.Staff.Staff;
import Classes.Staff.StaffFactory;
import Classes.Staff.StaffManager;
import Classes.Staff.StaffPackage;
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
public class StaffPackageImpl extends EPackageImpl implements StaffPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffManagerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staffEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass salaryContractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monthlySalaryContractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass hourlySalaryContractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iStaffEClass = null;

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
	 * @see Classes.Staff.StaffPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StaffPackageImpl() {
		super(eNS_URI, StaffFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link StaffPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StaffPackage init() {
		if (isInited) return (StaffPackage)EPackage.Registry.INSTANCE.getEPackage(StaffPackage.eNS_URI);

		// Obtain or create and register package
		StaffPackageImpl theStaffPackage = (StaffPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof StaffPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new StaffPackageImpl());

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
		InventoryPackageImpl theInventoryPackage = (InventoryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI) instanceof InventoryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(InventoryPackage.eNS_URI) : InventoryPackage.eINSTANCE);
		RestaurantsPackageImpl theRestaurantsPackage = (RestaurantsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RestaurantsPackage.eNS_URI) instanceof RestaurantsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RestaurantsPackage.eNS_URI) : RestaurantsPackage.eINSTANCE);
		ServicesPackageImpl theServicesPackage = (ServicesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) instanceof ServicesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServicesPackage.eNS_URI) : ServicesPackage.eINSTANCE);
		FeedbackPackageImpl theFeedbackPackage = (FeedbackPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(FeedbackPackage.eNS_URI) instanceof FeedbackPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(FeedbackPackage.eNS_URI) : FeedbackPackage.eINSTANCE);
		RequestsPackageImpl theRequestsPackage = (RequestsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(RequestsPackage.eNS_URI) instanceof RequestsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(RequestsPackage.eNS_URI) : RequestsPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theStaffPackage.createPackageContents();
		theBookablesPackage.createPackageContents();
		theStaysPackage.createPackageContents();
		theBankingPackage.createPackageContents();
		theBillsPackage.createPackageContents();
		theGuestsPackage.createPackageContents();
		theAccountsPackage.createPackageContents();
		theBookingsPackage.createPackageContents();
		theCustomersPackage.createPackageContents();
		theStatisticsPackage.createPackageContents();
		theInventoryPackage.createPackageContents();
		theRestaurantsPackage.createPackageContents();
		theServicesPackage.createPackageContents();
		theFeedbackPackage.createPackageContents();
		theRequestsPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theStaffPackage.initializePackageContents();
		theBookablesPackage.initializePackageContents();
		theStaysPackage.initializePackageContents();
		theBankingPackage.initializePackageContents();
		theBillsPackage.initializePackageContents();
		theGuestsPackage.initializePackageContents();
		theAccountsPackage.initializePackageContents();
		theBookingsPackage.initializePackageContents();
		theCustomersPackage.initializePackageContents();
		theStatisticsPackage.initializePackageContents();
		theInventoryPackage.initializePackageContents();
		theRestaurantsPackage.initializePackageContents();
		theServicesPackage.initializePackageContents();
		theFeedbackPackage.initializePackageContents();
		theRequestsPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theStaffPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StaffPackage.eNS_URI, theStaffPackage);
		return theStaffPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaffManager() {
		return staffManagerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffManager_Staff() {
		return (EReference)staffManagerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaffManager_IStatisticsGenerator() {
		return (EReference)staffManagerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaff() {
		return staffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaff_SalaryContract() {
		return (EReference)staffEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaff_FirstName() {
		return (EAttribute)staffEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaff_LastName() {
		return (EAttribute)staffEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaff_Job() {
		return (EAttribute)staffEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaff_Phone() {
		return (EAttribute)staffEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaff_Email() {
		return (EAttribute)staffEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaff_Ssid() {
		return (EAttribute)staffEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSalaryContract() {
		return salaryContractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSalaryContract__GetSalary() {
		return salaryContractEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonthlySalaryContract() {
		return monthlySalaryContractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMonthlySalaryContract_Salary() {
		return (EAttribute)monthlySalaryContractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHourlySalaryContract() {
		return hourlySalaryContractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHourlySalaryContract_Salary() {
		return (EAttribute)hourlySalaryContractEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIStaff() {
		return iStaffEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaff__GetAllStaff() {
		return iStaffEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaff__SearchStaff__String() {
		return iStaffEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaff__GetStaffFirstName__String() {
		return iStaffEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaff__GetStaffLastName__String() {
		return iStaffEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaff__GetStaffJob__String() {
		return iStaffEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaff__GetStaffPhone__String() {
		return iStaffEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaff__GetStaffEmail__String() {
		return iStaffEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaff__GetStaffSalaryContractType__String() {
		return iStaffEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaff__GetStaffSalary__String() {
		return iStaffEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaff__ChangeStaffFirstName__String_String() {
		return iStaffEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaff__ChangeStaffLastName__String_String() {
		return iStaffEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaff__ChangeStaffJob__String_String() {
		return iStaffEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaff__ChangeStaffPhone__String_String() {
		return iStaffEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaff__ChangeStaffSalaryContract__String_String() {
		return iStaffEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaff__ScheduleStaff__Date_Date() {
		return iStaffEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getIStaff__AddEmployee__String_String_String_String_String_String_String_double() {
		return iStaffEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffFactory getStaffFactory() {
		return (StaffFactory)getEFactoryInstance();
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
		staffManagerEClass = createEClass(STAFF_MANAGER);
		createEReference(staffManagerEClass, STAFF_MANAGER__STAFF);
		createEReference(staffManagerEClass, STAFF_MANAGER__ISTATISTICS_GENERATOR);

		staffEClass = createEClass(STAFF);
		createEReference(staffEClass, STAFF__SALARY_CONTRACT);
		createEAttribute(staffEClass, STAFF__FIRST_NAME);
		createEAttribute(staffEClass, STAFF__LAST_NAME);
		createEAttribute(staffEClass, STAFF__JOB);
		createEAttribute(staffEClass, STAFF__PHONE);
		createEAttribute(staffEClass, STAFF__EMAIL);
		createEAttribute(staffEClass, STAFF__SSID);

		salaryContractEClass = createEClass(SALARY_CONTRACT);
		createEOperation(salaryContractEClass, SALARY_CONTRACT___GET_SALARY);

		monthlySalaryContractEClass = createEClass(MONTHLY_SALARY_CONTRACT);
		createEAttribute(monthlySalaryContractEClass, MONTHLY_SALARY_CONTRACT__SALARY);

		hourlySalaryContractEClass = createEClass(HOURLY_SALARY_CONTRACT);
		createEAttribute(hourlySalaryContractEClass, HOURLY_SALARY_CONTRACT__SALARY);

		iStaffEClass = createEClass(ISTAFF);
		createEOperation(iStaffEClass, ISTAFF___GET_ALL_STAFF);
		createEOperation(iStaffEClass, ISTAFF___SEARCH_STAFF__STRING);
		createEOperation(iStaffEClass, ISTAFF___GET_STAFF_FIRST_NAME__STRING);
		createEOperation(iStaffEClass, ISTAFF___GET_STAFF_LAST_NAME__STRING);
		createEOperation(iStaffEClass, ISTAFF___GET_STAFF_JOB__STRING);
		createEOperation(iStaffEClass, ISTAFF___GET_STAFF_PHONE__STRING);
		createEOperation(iStaffEClass, ISTAFF___GET_STAFF_EMAIL__STRING);
		createEOperation(iStaffEClass, ISTAFF___GET_STAFF_SALARY_CONTRACT_TYPE__STRING);
		createEOperation(iStaffEClass, ISTAFF___GET_STAFF_SALARY__STRING);
		createEOperation(iStaffEClass, ISTAFF___CHANGE_STAFF_FIRST_NAME__STRING_STRING);
		createEOperation(iStaffEClass, ISTAFF___CHANGE_STAFF_LAST_NAME__STRING_STRING);
		createEOperation(iStaffEClass, ISTAFF___CHANGE_STAFF_JOB__STRING_STRING);
		createEOperation(iStaffEClass, ISTAFF___CHANGE_STAFF_PHONE__STRING_STRING);
		createEOperation(iStaffEClass, ISTAFF___CHANGE_STAFF_SALARY_CONTRACT__STRING_STRING);
		createEOperation(iStaffEClass, ISTAFF___SCHEDULE_STAFF__DATE_DATE);
		createEOperation(iStaffEClass, ISTAFF___ADD_EMPLOYEE__STRING_STRING_STRING_STRING_STRING_STRING_STRING_DOUBLE);
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
		StatisticsPackage theStatisticsPackage = (StatisticsPackage)EPackage.Registry.INSTANCE.getEPackage(StatisticsPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		staffManagerEClass.getESuperTypes().add(this.getIStaff());
		monthlySalaryContractEClass.getESuperTypes().add(this.getSalaryContract());
		hourlySalaryContractEClass.getESuperTypes().add(this.getSalaryContract());

		// Initialize classes, features, and operations; add parameters
		initEClass(staffManagerEClass, StaffManager.class, "StaffManager", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaffManager_Staff(), this.getStaff(), null, "staff", null, 0, -1, StaffManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getStaffManager_IStatisticsGenerator(), theStatisticsPackage.getIStatisticsGenerator(), null, "iStatisticsGenerator", null, 1, 1, StaffManager.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(staffEClass, Staff.class, "Staff", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaff_SalaryContract(), this.getSalaryContract(), null, "salaryContract", null, 1, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaff_FirstName(), theTypesPackage.getString(), "firstName", null, 1, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaff_LastName(), theTypesPackage.getString(), "lastName", null, 1, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaff_Job(), theTypesPackage.getString(), "job", null, 1, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaff_Phone(), theTypesPackage.getString(), "phone", null, 1, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaff_Email(), theTypesPackage.getString(), "email", null, 1, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getStaff_Ssid(), theTypesPackage.getString(), "ssid", null, 1, 1, Staff.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(salaryContractEClass, SalaryContract.class, "SalaryContract", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getSalaryContract__GetSalary(), ecorePackage.getEDouble(), "getSalary", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(monthlySalaryContractEClass, MonthlySalaryContract.class, "MonthlySalaryContract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMonthlySalaryContract_Salary(), ecorePackage.getEDouble(), "salary", null, 1, 1, MonthlySalaryContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(hourlySalaryContractEClass, HourlySalaryContract.class, "HourlySalaryContract", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHourlySalaryContract_Salary(), ecorePackage.getEDouble(), "salary", null, 1, 1, HourlySalaryContract.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(iStaffEClass, IStaff.class, "IStaff", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getIStaff__GetAllStaff(), theTypesPackage.getString(), "getAllStaff", 0, -1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = initEOperation(getIStaff__SearchStaff__String(), theTypesPackage.getString(), "searchStaff", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "keyword", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaff__GetStaffFirstName__String(), theTypesPackage.getString(), "getStaffFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaff__GetStaffLastName__String(), theTypesPackage.getString(), "getStaffLastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaff__GetStaffJob__String(), theTypesPackage.getString(), "getStaffJob", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaff__GetStaffPhone__String(), theTypesPackage.getString(), "getStaffPhone", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaff__GetStaffEmail__String(), theTypesPackage.getString(), "getStaffEmail", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaff__GetStaffSalaryContractType__String(), theTypesPackage.getString(), "getStaffSalaryContractType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaff__GetStaffSalary__String(), theTypesPackage.getReal(), "getStaffSalary", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaff__ChangeStaffFirstName__String_String(), null, "changeStaffFirstName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "firstName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaff__ChangeStaffLastName__String_String(), null, "changeStaffLastName", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "lastName", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaff__ChangeStaffJob__String_String(), null, "changeStaffJob", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "job", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaff__ChangeStaffPhone__String_String(), null, "changeStaffPhone", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "phoneNumber", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaff__ChangeStaffSalaryContract__String_String(), null, "changeStaffSalaryContract", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "salaryContract", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaff__ScheduleStaff__Date_Date(), theTypesPackage.getString(), "scheduleStaff", 0, -1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "from", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDate(), "to", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getIStaff__AddEmployee__String_String_String_String_String_String_String_double(), null, "addEmployee", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "firstname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "lastname", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "job", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "phone", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "email", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "SSID", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, theTypesPackage.getString(), "salaryContractType", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "salary", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //StaffPackageImpl
