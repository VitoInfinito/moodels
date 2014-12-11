/**
 */
package Classes.Staff;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Classes.Staff.StaffFactory
 * @model kind="package"
 * @generated
 */
public interface StaffPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Staff";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/Staff.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Staff";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StaffPackage eINSTANCE = Classes.Staff.impl.StaffPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.Staff.IStaff <em>IStaff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Staff.IStaff
	 * @see Classes.Staff.impl.StaffPackageImpl#getIStaff()
	 * @generated
	 */
	int ISTAFF = 5;

	/**
	 * The number of structural features of the '<em>IStaff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get All Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF___GET_ALL_STAFF = 0;

	/**
	 * The operation id for the '<em>Search Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF___SEARCH_STAFF__STRING = 1;

	/**
	 * The operation id for the '<em>Get Staff First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF___GET_STAFF_FIRST_NAME__STRING = 2;

	/**
	 * The operation id for the '<em>Get Staff Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF___GET_STAFF_LAST_NAME__STRING = 3;

	/**
	 * The operation id for the '<em>Get Staff Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF___GET_STAFF_JOB__STRING = 4;

	/**
	 * The operation id for the '<em>Get Staff Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF___GET_STAFF_PHONE__STRING = 5;

	/**
	 * The operation id for the '<em>Get Staff Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF___GET_STAFF_EMAIL__STRING = 6;

	/**
	 * The operation id for the '<em>Get Staff Salary Contract Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF___GET_STAFF_SALARY_CONTRACT_TYPE__STRING = 7;

	/**
	 * The operation id for the '<em>Get Staff Salary</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF___GET_STAFF_SALARY__STRING = 8;

	/**
	 * The operation id for the '<em>Change Staff First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF___CHANGE_STAFF_FIRST_NAME__STRING_STRING = 9;

	/**
	 * The operation id for the '<em>Change Staff Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF___CHANGE_STAFF_LAST_NAME__STRING_STRING = 10;

	/**
	 * The operation id for the '<em>Change Staff Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF___CHANGE_STAFF_JOB__STRING_STRING = 11;

	/**
	 * The operation id for the '<em>Change Staff Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF___CHANGE_STAFF_PHONE__STRING_STRING = 12;

	/**
	 * The operation id for the '<em>Change Staff Salary Contract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF___CHANGE_STAFF_SALARY_CONTRACT__STRING_SALARYCONTRACT = 13;

	/**
	 * The operation id for the '<em>Schedule Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF___SCHEDULE_STAFF__DATE_DATE = 14;

	/**
	 * The operation id for the '<em>Add Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF___ADD_EMPLOYEE__STRING_STRING_STRING_STRING_STRING_STRING_STRING_DOUBLE = 15;

	/**
	 * The number of operations of the '<em>IStaff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAFF_OPERATION_COUNT = 16;

	/**
	 * The meta object id for the '{@link Classes.Staff.impl.StaffManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Staff.impl.StaffManagerImpl
	 * @see Classes.Staff.impl.StaffPackageImpl#getStaffManager()
	 * @generated
	 */
	int STAFF_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Staff</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER__STAFF = ISTAFF_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IStatistics Generator</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER__ISTATISTICS_GENERATOR = ISTAFF_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER_FEATURE_COUNT = ISTAFF_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER___GET_ALL_STAFF = ISTAFF___GET_ALL_STAFF;

	/**
	 * The operation id for the '<em>Search Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER___SEARCH_STAFF__STRING = ISTAFF___SEARCH_STAFF__STRING;

	/**
	 * The operation id for the '<em>Get Staff First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER___GET_STAFF_FIRST_NAME__STRING = ISTAFF___GET_STAFF_FIRST_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Staff Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER___GET_STAFF_LAST_NAME__STRING = ISTAFF___GET_STAFF_LAST_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Staff Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER___GET_STAFF_JOB__STRING = ISTAFF___GET_STAFF_JOB__STRING;

	/**
	 * The operation id for the '<em>Get Staff Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER___GET_STAFF_PHONE__STRING = ISTAFF___GET_STAFF_PHONE__STRING;

	/**
	 * The operation id for the '<em>Get Staff Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER___GET_STAFF_EMAIL__STRING = ISTAFF___GET_STAFF_EMAIL__STRING;

	/**
	 * The operation id for the '<em>Get Staff Salary Contract Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER___GET_STAFF_SALARY_CONTRACT_TYPE__STRING = ISTAFF___GET_STAFF_SALARY_CONTRACT_TYPE__STRING;

	/**
	 * The operation id for the '<em>Get Staff Salary</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER___GET_STAFF_SALARY__STRING = ISTAFF___GET_STAFF_SALARY__STRING;

	/**
	 * The operation id for the '<em>Change Staff First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER___CHANGE_STAFF_FIRST_NAME__STRING_STRING = ISTAFF___CHANGE_STAFF_FIRST_NAME__STRING_STRING;

	/**
	 * The operation id for the '<em>Change Staff Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER___CHANGE_STAFF_LAST_NAME__STRING_STRING = ISTAFF___CHANGE_STAFF_LAST_NAME__STRING_STRING;

	/**
	 * The operation id for the '<em>Change Staff Job</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER___CHANGE_STAFF_JOB__STRING_STRING = ISTAFF___CHANGE_STAFF_JOB__STRING_STRING;

	/**
	 * The operation id for the '<em>Change Staff Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER___CHANGE_STAFF_PHONE__STRING_STRING = ISTAFF___CHANGE_STAFF_PHONE__STRING_STRING;

	/**
	 * The operation id for the '<em>Change Staff Salary Contract</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER___CHANGE_STAFF_SALARY_CONTRACT__STRING_SALARYCONTRACT = ISTAFF___CHANGE_STAFF_SALARY_CONTRACT__STRING_SALARYCONTRACT;

	/**
	 * The operation id for the '<em>Schedule Staff</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER___SCHEDULE_STAFF__DATE_DATE = ISTAFF___SCHEDULE_STAFF__DATE_DATE;

	/**
	 * The operation id for the '<em>Add Employee</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER___ADD_EMPLOYEE__STRING_STRING_STRING_STRING_STRING_STRING_STRING_DOUBLE = ISTAFF___ADD_EMPLOYEE__STRING_STRING_STRING_STRING_STRING_STRING_STRING_DOUBLE;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_MANAGER_OPERATION_COUNT = ISTAFF_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.Staff.impl.StaffImpl <em>Staff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Staff.impl.StaffImpl
	 * @see Classes.Staff.impl.StaffPackageImpl#getStaff()
	 * @generated
	 */
	int STAFF = 1;

	/**
	 * The feature id for the '<em><b>Salary Contract</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__SALARY_CONTRACT = 0;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Job</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__JOB = 3;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__PHONE = 4;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__EMAIL = 5;

	/**
	 * The feature id for the '<em><b>Ssid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF__SSID = 6;

	/**
	 * The number of structural features of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Staff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAFF_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.Staff.impl.SalaryContractImpl <em>Salary Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Staff.impl.SalaryContractImpl
	 * @see Classes.Staff.impl.StaffPackageImpl#getSalaryContract()
	 * @generated
	 */
	int SALARY_CONTRACT = 2;

	/**
	 * The number of structural features of the '<em>Salary Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_CONTRACT_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Salary</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_CONTRACT___GET_SALARY = 0;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_CONTRACT___GET_TYPE = 1;

	/**
	 * The number of operations of the '<em>Salary Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SALARY_CONTRACT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Classes.Staff.impl.MonthlySalaryContractImpl <em>Monthly Salary Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Staff.impl.MonthlySalaryContractImpl
	 * @see Classes.Staff.impl.StaffPackageImpl#getMonthlySalaryContract()
	 * @generated
	 */
	int MONTHLY_SALARY_CONTRACT = 3;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTHLY_SALARY_CONTRACT__SALARY = SALARY_CONTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTHLY_SALARY_CONTRACT__TYPE = SALARY_CONTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Monthly Salary Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTHLY_SALARY_CONTRACT_FEATURE_COUNT = SALARY_CONTRACT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Salary</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTHLY_SALARY_CONTRACT___GET_SALARY = SALARY_CONTRACT___GET_SALARY;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTHLY_SALARY_CONTRACT___GET_TYPE = SALARY_CONTRACT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Monthly Salary Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MONTHLY_SALARY_CONTRACT_OPERATION_COUNT = SALARY_CONTRACT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.Staff.impl.HourlySalaryContractImpl <em>Hourly Salary Contract</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Staff.impl.HourlySalaryContractImpl
	 * @see Classes.Staff.impl.StaffPackageImpl#getHourlySalaryContract()
	 * @generated
	 */
	int HOURLY_SALARY_CONTRACT = 4;

	/**
	 * The feature id for the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOURLY_SALARY_CONTRACT__SALARY = SALARY_CONTRACT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOURLY_SALARY_CONTRACT__TYPE = SALARY_CONTRACT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Hourly Salary Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOURLY_SALARY_CONTRACT_FEATURE_COUNT = SALARY_CONTRACT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Salary</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOURLY_SALARY_CONTRACT___GET_SALARY = SALARY_CONTRACT___GET_SALARY;

	/**
	 * The operation id for the '<em>Get Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOURLY_SALARY_CONTRACT___GET_TYPE = SALARY_CONTRACT___GET_TYPE;

	/**
	 * The number of operations of the '<em>Hourly Salary Contract</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOURLY_SALARY_CONTRACT_OPERATION_COUNT = SALARY_CONTRACT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Classes.Staff.StaffManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see Classes.Staff.StaffManager
	 * @generated
	 */
	EClass getStaffManager();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Staff.StaffManager#getStaff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Staff</em>'.
	 * @see Classes.Staff.StaffManager#getStaff()
	 * @see #getStaffManager()
	 * @generated
	 */
	EReference getStaffManager_Staff();

	/**
	 * Returns the meta object for the reference '{@link Classes.Staff.StaffManager#getIStatisticsGenerator <em>IStatistics Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IStatistics Generator</em>'.
	 * @see Classes.Staff.StaffManager#getIStatisticsGenerator()
	 * @see #getStaffManager()
	 * @generated
	 */
	EReference getStaffManager_IStatisticsGenerator();

	/**
	 * Returns the meta object for class '{@link Classes.Staff.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Staff</em>'.
	 * @see Classes.Staff.Staff
	 * @generated
	 */
	EClass getStaff();

	/**
	 * Returns the meta object for the reference '{@link Classes.Staff.Staff#getSalaryContract <em>Salary Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Salary Contract</em>'.
	 * @see Classes.Staff.Staff#getSalaryContract()
	 * @see #getStaff()
	 * @generated
	 */
	EReference getStaff_SalaryContract();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Staff.Staff#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see Classes.Staff.Staff#getFirstName()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Staff.Staff#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see Classes.Staff.Staff#getLastName()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_LastName();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Staff.Staff#getJob <em>Job</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Job</em>'.
	 * @see Classes.Staff.Staff#getJob()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Job();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Staff.Staff#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see Classes.Staff.Staff#getPhone()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Phone();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Staff.Staff#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Classes.Staff.Staff#getEmail()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Email();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Staff.Staff#getSsid <em>Ssid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssid</em>'.
	 * @see Classes.Staff.Staff#getSsid()
	 * @see #getStaff()
	 * @generated
	 */
	EAttribute getStaff_Ssid();

	/**
	 * Returns the meta object for class '{@link Classes.Staff.SalaryContract <em>Salary Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Salary Contract</em>'.
	 * @see Classes.Staff.SalaryContract
	 * @generated
	 */
	EClass getSalaryContract();

	/**
	 * Returns the meta object for the '{@link Classes.Staff.SalaryContract#getSalary() <em>Get Salary</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Salary</em>' operation.
	 * @see Classes.Staff.SalaryContract#getSalary()
	 * @generated
	 */
	EOperation getSalaryContract__GetSalary();

	/**
	 * Returns the meta object for the '{@link Classes.Staff.SalaryContract#getType() <em>Get Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Type</em>' operation.
	 * @see Classes.Staff.SalaryContract#getType()
	 * @generated
	 */
	EOperation getSalaryContract__GetType();

	/**
	 * Returns the meta object for class '{@link Classes.Staff.MonthlySalaryContract <em>Monthly Salary Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Monthly Salary Contract</em>'.
	 * @see Classes.Staff.MonthlySalaryContract
	 * @generated
	 */
	EClass getMonthlySalaryContract();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Staff.MonthlySalaryContract#getSalary <em>Salary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salary</em>'.
	 * @see Classes.Staff.MonthlySalaryContract#getSalary()
	 * @see #getMonthlySalaryContract()
	 * @generated
	 */
	EAttribute getMonthlySalaryContract_Salary();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Staff.MonthlySalaryContract#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Classes.Staff.MonthlySalaryContract#getType()
	 * @see #getMonthlySalaryContract()
	 * @generated
	 */
	EAttribute getMonthlySalaryContract_Type();

	/**
	 * Returns the meta object for class '{@link Classes.Staff.HourlySalaryContract <em>Hourly Salary Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hourly Salary Contract</em>'.
	 * @see Classes.Staff.HourlySalaryContract
	 * @generated
	 */
	EClass getHourlySalaryContract();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Staff.HourlySalaryContract#getSalary <em>Salary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Salary</em>'.
	 * @see Classes.Staff.HourlySalaryContract#getSalary()
	 * @see #getHourlySalaryContract()
	 * @generated
	 */
	EAttribute getHourlySalaryContract_Salary();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Staff.HourlySalaryContract#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Classes.Staff.HourlySalaryContract#getType()
	 * @see #getHourlySalaryContract()
	 * @generated
	 */
	EAttribute getHourlySalaryContract_Type();

	/**
	 * Returns the meta object for class '{@link Classes.Staff.IStaff <em>IStaff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IStaff</em>'.
	 * @see Classes.Staff.IStaff
	 * @generated
	 */
	EClass getIStaff();

	/**
	 * Returns the meta object for the '{@link Classes.Staff.IStaff#getAllStaff() <em>Get All Staff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Staff</em>' operation.
	 * @see Classes.Staff.IStaff#getAllStaff()
	 * @generated
	 */
	EOperation getIStaff__GetAllStaff();

	/**
	 * Returns the meta object for the '{@link Classes.Staff.IStaff#searchStaff(java.lang.String) <em>Search Staff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Staff</em>' operation.
	 * @see Classes.Staff.IStaff#searchStaff(java.lang.String)
	 * @generated
	 */
	EOperation getIStaff__SearchStaff__String();

	/**
	 * Returns the meta object for the '{@link Classes.Staff.IStaff#getStaffFirstName(java.lang.String) <em>Get Staff First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Staff First Name</em>' operation.
	 * @see Classes.Staff.IStaff#getStaffFirstName(java.lang.String)
	 * @generated
	 */
	EOperation getIStaff__GetStaffFirstName__String();

	/**
	 * Returns the meta object for the '{@link Classes.Staff.IStaff#getStaffLastName(java.lang.String) <em>Get Staff Last Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Staff Last Name</em>' operation.
	 * @see Classes.Staff.IStaff#getStaffLastName(java.lang.String)
	 * @generated
	 */
	EOperation getIStaff__GetStaffLastName__String();

	/**
	 * Returns the meta object for the '{@link Classes.Staff.IStaff#getStaffJob(java.lang.String) <em>Get Staff Job</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Staff Job</em>' operation.
	 * @see Classes.Staff.IStaff#getStaffJob(java.lang.String)
	 * @generated
	 */
	EOperation getIStaff__GetStaffJob__String();

	/**
	 * Returns the meta object for the '{@link Classes.Staff.IStaff#getStaffPhone(java.lang.String) <em>Get Staff Phone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Staff Phone</em>' operation.
	 * @see Classes.Staff.IStaff#getStaffPhone(java.lang.String)
	 * @generated
	 */
	EOperation getIStaff__GetStaffPhone__String();

	/**
	 * Returns the meta object for the '{@link Classes.Staff.IStaff#getStaffEmail(java.lang.String) <em>Get Staff Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Staff Email</em>' operation.
	 * @see Classes.Staff.IStaff#getStaffEmail(java.lang.String)
	 * @generated
	 */
	EOperation getIStaff__GetStaffEmail__String();

	/**
	 * Returns the meta object for the '{@link Classes.Staff.IStaff#getStaffSalaryContractType(java.lang.String) <em>Get Staff Salary Contract Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Staff Salary Contract Type</em>' operation.
	 * @see Classes.Staff.IStaff#getStaffSalaryContractType(java.lang.String)
	 * @generated
	 */
	EOperation getIStaff__GetStaffSalaryContractType__String();

	/**
	 * Returns the meta object for the '{@link Classes.Staff.IStaff#getStaffSalary(java.lang.String) <em>Get Staff Salary</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Staff Salary</em>' operation.
	 * @see Classes.Staff.IStaff#getStaffSalary(java.lang.String)
	 * @generated
	 */
	EOperation getIStaff__GetStaffSalary__String();

	/**
	 * Returns the meta object for the '{@link Classes.Staff.IStaff#changeStaffFirstName(java.lang.String, java.lang.String) <em>Change Staff First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Staff First Name</em>' operation.
	 * @see Classes.Staff.IStaff#changeStaffFirstName(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIStaff__ChangeStaffFirstName__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Staff.IStaff#changeStaffLastName(java.lang.String, java.lang.String) <em>Change Staff Last Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Staff Last Name</em>' operation.
	 * @see Classes.Staff.IStaff#changeStaffLastName(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIStaff__ChangeStaffLastName__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Staff.IStaff#changeStaffJob(java.lang.String, java.lang.String) <em>Change Staff Job</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Staff Job</em>' operation.
	 * @see Classes.Staff.IStaff#changeStaffJob(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIStaff__ChangeStaffJob__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Staff.IStaff#changeStaffPhone(java.lang.String, java.lang.String) <em>Change Staff Phone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Staff Phone</em>' operation.
	 * @see Classes.Staff.IStaff#changeStaffPhone(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIStaff__ChangeStaffPhone__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Staff.IStaff#changeStaffSalaryContract(java.lang.String, Classes.Staff.SalaryContract) <em>Change Staff Salary Contract</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Staff Salary Contract</em>' operation.
	 * @see Classes.Staff.IStaff#changeStaffSalaryContract(java.lang.String, Classes.Staff.SalaryContract)
	 * @generated
	 */
	EOperation getIStaff__ChangeStaffSalaryContract__String_SalaryContract();

	/**
	 * Returns the meta object for the '{@link Classes.Staff.IStaff#scheduleStaff(java.util.Date, java.util.Date) <em>Schedule Staff</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Schedule Staff</em>' operation.
	 * @see Classes.Staff.IStaff#scheduleStaff(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIStaff__ScheduleStaff__Date_Date();

	/**
	 * Returns the meta object for the '{@link Classes.Staff.IStaff#addEmployee(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double) <em>Add Employee</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Employee</em>' operation.
	 * @see Classes.Staff.IStaff#addEmployee(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, double)
	 * @generated
	 */
	EOperation getIStaff__AddEmployee__String_String_String_String_String_String_String_double();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StaffFactory getStaffFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Classes.Staff.impl.StaffManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Staff.impl.StaffManagerImpl
		 * @see Classes.Staff.impl.StaffPackageImpl#getStaffManager()
		 * @generated
		 */
		EClass STAFF_MANAGER = eINSTANCE.getStaffManager();

		/**
		 * The meta object literal for the '<em><b>Staff</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_MANAGER__STAFF = eINSTANCE.getStaffManager_Staff();

		/**
		 * The meta object literal for the '<em><b>IStatistics Generator</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF_MANAGER__ISTATISTICS_GENERATOR = eINSTANCE.getStaffManager_IStatisticsGenerator();

		/**
		 * The meta object literal for the '{@link Classes.Staff.impl.StaffImpl <em>Staff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Staff.impl.StaffImpl
		 * @see Classes.Staff.impl.StaffPackageImpl#getStaff()
		 * @generated
		 */
		EClass STAFF = eINSTANCE.getStaff();

		/**
		 * The meta object literal for the '<em><b>Salary Contract</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAFF__SALARY_CONTRACT = eINSTANCE.getStaff_SalaryContract();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__FIRST_NAME = eINSTANCE.getStaff_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__LAST_NAME = eINSTANCE.getStaff_LastName();

		/**
		 * The meta object literal for the '<em><b>Job</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__JOB = eINSTANCE.getStaff_Job();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__PHONE = eINSTANCE.getStaff_Phone();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__EMAIL = eINSTANCE.getStaff_Email();

		/**
		 * The meta object literal for the '<em><b>Ssid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAFF__SSID = eINSTANCE.getStaff_Ssid();

		/**
		 * The meta object literal for the '{@link Classes.Staff.impl.SalaryContractImpl <em>Salary Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Staff.impl.SalaryContractImpl
		 * @see Classes.Staff.impl.StaffPackageImpl#getSalaryContract()
		 * @generated
		 */
		EClass SALARY_CONTRACT = eINSTANCE.getSalaryContract();

		/**
		 * The meta object literal for the '<em><b>Get Salary</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SALARY_CONTRACT___GET_SALARY = eINSTANCE.getSalaryContract__GetSalary();

		/**
		 * The meta object literal for the '<em><b>Get Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SALARY_CONTRACT___GET_TYPE = eINSTANCE.getSalaryContract__GetType();

		/**
		 * The meta object literal for the '{@link Classes.Staff.impl.MonthlySalaryContractImpl <em>Monthly Salary Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Staff.impl.MonthlySalaryContractImpl
		 * @see Classes.Staff.impl.StaffPackageImpl#getMonthlySalaryContract()
		 * @generated
		 */
		EClass MONTHLY_SALARY_CONTRACT = eINSTANCE.getMonthlySalaryContract();

		/**
		 * The meta object literal for the '<em><b>Salary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONTHLY_SALARY_CONTRACT__SALARY = eINSTANCE.getMonthlySalaryContract_Salary();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MONTHLY_SALARY_CONTRACT__TYPE = eINSTANCE.getMonthlySalaryContract_Type();

		/**
		 * The meta object literal for the '{@link Classes.Staff.impl.HourlySalaryContractImpl <em>Hourly Salary Contract</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Staff.impl.HourlySalaryContractImpl
		 * @see Classes.Staff.impl.StaffPackageImpl#getHourlySalaryContract()
		 * @generated
		 */
		EClass HOURLY_SALARY_CONTRACT = eINSTANCE.getHourlySalaryContract();

		/**
		 * The meta object literal for the '<em><b>Salary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOURLY_SALARY_CONTRACT__SALARY = eINSTANCE.getHourlySalaryContract_Salary();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOURLY_SALARY_CONTRACT__TYPE = eINSTANCE.getHourlySalaryContract_Type();

		/**
		 * The meta object literal for the '{@link Classes.Staff.IStaff <em>IStaff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Staff.IStaff
		 * @see Classes.Staff.impl.StaffPackageImpl#getIStaff()
		 * @generated
		 */
		EClass ISTAFF = eINSTANCE.getIStaff();

		/**
		 * The meta object literal for the '<em><b>Get All Staff</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF___GET_ALL_STAFF = eINSTANCE.getIStaff__GetAllStaff();

		/**
		 * The meta object literal for the '<em><b>Search Staff</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF___SEARCH_STAFF__STRING = eINSTANCE.getIStaff__SearchStaff__String();

		/**
		 * The meta object literal for the '<em><b>Get Staff First Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF___GET_STAFF_FIRST_NAME__STRING = eINSTANCE.getIStaff__GetStaffFirstName__String();

		/**
		 * The meta object literal for the '<em><b>Get Staff Last Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF___GET_STAFF_LAST_NAME__STRING = eINSTANCE.getIStaff__GetStaffLastName__String();

		/**
		 * The meta object literal for the '<em><b>Get Staff Job</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF___GET_STAFF_JOB__STRING = eINSTANCE.getIStaff__GetStaffJob__String();

		/**
		 * The meta object literal for the '<em><b>Get Staff Phone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF___GET_STAFF_PHONE__STRING = eINSTANCE.getIStaff__GetStaffPhone__String();

		/**
		 * The meta object literal for the '<em><b>Get Staff Email</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF___GET_STAFF_EMAIL__STRING = eINSTANCE.getIStaff__GetStaffEmail__String();

		/**
		 * The meta object literal for the '<em><b>Get Staff Salary Contract Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF___GET_STAFF_SALARY_CONTRACT_TYPE__STRING = eINSTANCE.getIStaff__GetStaffSalaryContractType__String();

		/**
		 * The meta object literal for the '<em><b>Get Staff Salary</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF___GET_STAFF_SALARY__STRING = eINSTANCE.getIStaff__GetStaffSalary__String();

		/**
		 * The meta object literal for the '<em><b>Change Staff First Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF___CHANGE_STAFF_FIRST_NAME__STRING_STRING = eINSTANCE.getIStaff__ChangeStaffFirstName__String_String();

		/**
		 * The meta object literal for the '<em><b>Change Staff Last Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF___CHANGE_STAFF_LAST_NAME__STRING_STRING = eINSTANCE.getIStaff__ChangeStaffLastName__String_String();

		/**
		 * The meta object literal for the '<em><b>Change Staff Job</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF___CHANGE_STAFF_JOB__STRING_STRING = eINSTANCE.getIStaff__ChangeStaffJob__String_String();

		/**
		 * The meta object literal for the '<em><b>Change Staff Phone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF___CHANGE_STAFF_PHONE__STRING_STRING = eINSTANCE.getIStaff__ChangeStaffPhone__String_String();

		/**
		 * The meta object literal for the '<em><b>Change Staff Salary Contract</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF___CHANGE_STAFF_SALARY_CONTRACT__STRING_SALARYCONTRACT = eINSTANCE.getIStaff__ChangeStaffSalaryContract__String_SalaryContract();

		/**
		 * The meta object literal for the '<em><b>Schedule Staff</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF___SCHEDULE_STAFF__DATE_DATE = eINSTANCE.getIStaff__ScheduleStaff__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Add Employee</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAFF___ADD_EMPLOYEE__STRING_STRING_STRING_STRING_STRING_STRING_STRING_DOUBLE = eINSTANCE.getIStaff__AddEmployee__String_String_String_String_String_String_String_double();

	}

} //StaffPackage
