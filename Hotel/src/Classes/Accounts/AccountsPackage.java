/**
 */
package Classes.Accounts;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see Classes.Accounts.AccountsFactory
 * @model kind="package"
 * @generated
 */
public interface AccountsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Accounts";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/Accounts.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Accounts";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AccountsPackage eINSTANCE = Classes.Accounts.impl.AccountsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.Accounts.impl.AccountImpl <em>Account</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Accounts.impl.AccountImpl
	 * @see Classes.Accounts.impl.AccountsPackageImpl#getAccount()
	 * @generated
	 */
	int ACCOUNT = 0;

	/**
	 * The feature id for the '<em><b>Account Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__ACCOUNT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__USERNAME = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT__PASSWORD = 2;

	/**
	 * The number of structural features of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Get Password</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT___GET_PASSWORD = 0;

	/**
	 * The operation id for the '<em>Get Username</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT___GET_USERNAME = 1;

	/**
	 * The operation id for the '<em>Set Password</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT___SET_PASSWORD = 2;

	/**
	 * The operation id for the '<em>Set Username</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT___SET_USERNAME = 3;

	/**
	 * The number of operations of the '<em>Account</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNT_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link Classes.Accounts.IManageAccounts <em>IManage Accounts</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Accounts.IManageAccounts
	 * @see Classes.Accounts.impl.AccountsPackageImpl#getIManageAccounts()
	 * @generated
	 */
	int IMANAGE_ACCOUNTS = 3;

	/**
	 * The number of structural features of the '<em>IManage Accounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_ACCOUNTS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Add Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_ACCOUNTS___ADD_ACCOUNT__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Delete Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_ACCOUNTS___DELETE_ACCOUNT__STRING = 1;

	/**
	 * The operation id for the '<em>Rename Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_ACCOUNTS___RENAME_ACCOUNT__STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Change Password</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_ACCOUNTS___CHANGE_PASSWORD__STRING_STRING = 3;

	/**
	 * The operation id for the '<em>Get Account Password</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_ACCOUNTS___GET_ACCOUNT_PASSWORD = 4;

	/**
	 * The operation id for the '<em>Get Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_ACCOUNTS___GET_ACCOUNTS = 5;

	/**
	 * The operation id for the '<em>Search Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_ACCOUNTS___SEARCH_ACCOUNTS = 6;

	/**
	 * The number of operations of the '<em>IManage Accounts</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMANAGE_ACCOUNTS_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link Classes.Accounts.impl.AccountsManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Accounts.impl.AccountsManagerImpl
	 * @see Classes.Accounts.impl.AccountsPackageImpl#getAccountsManager()
	 * @generated
	 */
	int ACCOUNTS_MANAGER = 1;

	/**
	 * The feature id for the '<em><b>Account</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS_MANAGER__ACCOUNT = IMANAGE_ACCOUNTS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS_MANAGER_FEATURE_COUNT = IMANAGE_ACCOUNTS_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS_MANAGER___ADD_ACCOUNT__STRING_STRING = IMANAGE_ACCOUNTS___ADD_ACCOUNT__STRING_STRING;

	/**
	 * The operation id for the '<em>Delete Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS_MANAGER___DELETE_ACCOUNT__STRING = IMANAGE_ACCOUNTS___DELETE_ACCOUNT__STRING;

	/**
	 * The operation id for the '<em>Rename Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS_MANAGER___RENAME_ACCOUNT__STRING_STRING = IMANAGE_ACCOUNTS___RENAME_ACCOUNT__STRING_STRING;

	/**
	 * The operation id for the '<em>Change Password</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS_MANAGER___CHANGE_PASSWORD__STRING_STRING = IMANAGE_ACCOUNTS___CHANGE_PASSWORD__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Account Password</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS_MANAGER___GET_ACCOUNT_PASSWORD = IMANAGE_ACCOUNTS___GET_ACCOUNT_PASSWORD;

	/**
	 * The operation id for the '<em>Get Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS_MANAGER___GET_ACCOUNTS = IMANAGE_ACCOUNTS___GET_ACCOUNTS;

	/**
	 * The operation id for the '<em>Search Accounts</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS_MANAGER___SEARCH_ACCOUNTS = IMANAGE_ACCOUNTS___SEARCH_ACCOUNTS;

	/**
	 * The operation id for the '<em>Validate Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS_MANAGER___VALIDATE_ACCOUNT__STRING_STRING = IMANAGE_ACCOUNTS_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS_MANAGER___LOGIN__STRING_STRING = IMANAGE_ACCOUNTS_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCOUNTS_MANAGER_OPERATION_COUNT = IMANAGE_ACCOUNTS_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link Classes.Accounts.IAccountsAccess <em>IAccounts Access</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Accounts.IAccountsAccess
	 * @see Classes.Accounts.impl.AccountsPackageImpl#getIAccountsAccess()
	 * @generated
	 */
	int IACCOUNTS_ACCESS = 2;

	/**
	 * The number of structural features of the '<em>IAccounts Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACCOUNTS_ACCESS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Validate Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACCOUNTS_ACCESS___VALIDATE_ACCOUNT__STRING_STRING = 0;

	/**
	 * The operation id for the '<em>Login</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACCOUNTS_ACCESS___LOGIN__STRING_STRING = 1;

	/**
	 * The number of operations of the '<em>IAccounts Access</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACCOUNTS_ACCESS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link Classes.Accounts.AccountType <em>Account Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Accounts.AccountType
	 * @see Classes.Accounts.impl.AccountsPackageImpl#getAccountType()
	 * @generated
	 */
	int ACCOUNT_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link Classes.Accounts.Account <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Account</em>'.
	 * @see Classes.Accounts.Account
	 * @generated
	 */
	EClass getAccount();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Accounts.Account#getAccountType <em>Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account Type</em>'.
	 * @see Classes.Accounts.Account#getAccountType()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_AccountType();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Accounts.Account#getUsername <em>Username</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Username</em>'.
	 * @see Classes.Accounts.Account#getUsername()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Username();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Accounts.Account#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see Classes.Accounts.Account#getPassword()
	 * @see #getAccount()
	 * @generated
	 */
	EAttribute getAccount_Password();

	/**
	 * Returns the meta object for the '{@link Classes.Accounts.Account#getPassword() <em>Get Password</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Password</em>' operation.
	 * @see Classes.Accounts.Account#getPassword()
	 * @generated
	 */
	EOperation getAccount__GetPassword();

	/**
	 * Returns the meta object for the '{@link Classes.Accounts.Account#getUsername() <em>Get Username</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Username</em>' operation.
	 * @see Classes.Accounts.Account#getUsername()
	 * @generated
	 */
	EOperation getAccount__GetUsername();

	/**
	 * Returns the meta object for the '{@link Classes.Accounts.Account#setPassword() <em>Set Password</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Password</em>' operation.
	 * @see Classes.Accounts.Account#setPassword()
	 * @generated
	 */
	EOperation getAccount__SetPassword();

	/**
	 * Returns the meta object for the '{@link Classes.Accounts.Account#setUsername() <em>Set Username</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Username</em>' operation.
	 * @see Classes.Accounts.Account#setUsername()
	 * @generated
	 */
	EOperation getAccount__SetUsername();

	/**
	 * Returns the meta object for class '{@link Classes.Accounts.AccountsManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see Classes.Accounts.AccountsManager
	 * @generated
	 */
	EClass getAccountsManager();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Accounts.AccountsManager#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Account</em>'.
	 * @see Classes.Accounts.AccountsManager#getAccount()
	 * @see #getAccountsManager()
	 * @generated
	 */
	EReference getAccountsManager_Account();

	/**
	 * Returns the meta object for class '{@link Classes.Accounts.IAccountsAccess <em>IAccounts Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAccounts Access</em>'.
	 * @see Classes.Accounts.IAccountsAccess
	 * @generated
	 */
	EClass getIAccountsAccess();

	/**
	 * Returns the meta object for the '{@link Classes.Accounts.IAccountsAccess#validateAccount(java.lang.String, java.lang.String) <em>Validate Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Validate Account</em>' operation.
	 * @see Classes.Accounts.IAccountsAccess#validateAccount(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIAccountsAccess__ValidateAccount__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Accounts.IAccountsAccess#login(java.lang.String, java.lang.String) <em>Login</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Login</em>' operation.
	 * @see Classes.Accounts.IAccountsAccess#login(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIAccountsAccess__Login__String_String();

	/**
	 * Returns the meta object for class '{@link Classes.Accounts.IManageAccounts <em>IManage Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IManage Accounts</em>'.
	 * @see Classes.Accounts.IManageAccounts
	 * @generated
	 */
	EClass getIManageAccounts();

	/**
	 * Returns the meta object for the '{@link Classes.Accounts.IManageAccounts#addAccount(java.lang.String, java.lang.String) <em>Add Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Account</em>' operation.
	 * @see Classes.Accounts.IManageAccounts#addAccount(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIManageAccounts__AddAccount__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Accounts.IManageAccounts#deleteAccount(java.lang.String) <em>Delete Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Account</em>' operation.
	 * @see Classes.Accounts.IManageAccounts#deleteAccount(java.lang.String)
	 * @generated
	 */
	EOperation getIManageAccounts__DeleteAccount__String();

	/**
	 * Returns the meta object for the '{@link Classes.Accounts.IManageAccounts#renameAccount(java.lang.String, java.lang.String) <em>Rename Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Rename Account</em>' operation.
	 * @see Classes.Accounts.IManageAccounts#renameAccount(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIManageAccounts__RenameAccount__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Accounts.IManageAccounts#changePassword(java.lang.String, java.lang.String) <em>Change Password</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Password</em>' operation.
	 * @see Classes.Accounts.IManageAccounts#changePassword(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIManageAccounts__ChangePassword__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Accounts.IManageAccounts#getAccountPassword() <em>Get Account Password</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Account Password</em>' operation.
	 * @see Classes.Accounts.IManageAccounts#getAccountPassword()
	 * @generated
	 */
	EOperation getIManageAccounts__GetAccountPassword();

	/**
	 * Returns the meta object for the '{@link Classes.Accounts.IManageAccounts#getAccounts() <em>Get Accounts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Accounts</em>' operation.
	 * @see Classes.Accounts.IManageAccounts#getAccounts()
	 * @generated
	 */
	EOperation getIManageAccounts__GetAccounts();

	/**
	 * Returns the meta object for the '{@link Classes.Accounts.IManageAccounts#searchAccounts() <em>Search Accounts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Accounts</em>' operation.
	 * @see Classes.Accounts.IManageAccounts#searchAccounts()
	 * @generated
	 */
	EOperation getIManageAccounts__SearchAccounts();

	/**
	 * Returns the meta object for enum '{@link Classes.Accounts.AccountType <em>Account Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Account Type</em>'.
	 * @see Classes.Accounts.AccountType
	 * @generated
	 */
	EEnum getAccountType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AccountsFactory getAccountsFactory();

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
		 * The meta object literal for the '{@link Classes.Accounts.impl.AccountImpl <em>Account</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Accounts.impl.AccountImpl
		 * @see Classes.Accounts.impl.AccountsPackageImpl#getAccount()
		 * @generated
		 */
		EClass ACCOUNT = eINSTANCE.getAccount();

		/**
		 * The meta object literal for the '<em><b>Account Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__ACCOUNT_TYPE = eINSTANCE.getAccount_AccountType();

		/**
		 * The meta object literal for the '<em><b>Username</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__USERNAME = eINSTANCE.getAccount_Username();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACCOUNT__PASSWORD = eINSTANCE.getAccount_Password();

		/**
		 * The meta object literal for the '<em><b>Get Password</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCOUNT___GET_PASSWORD = eINSTANCE.getAccount__GetPassword();

		/**
		 * The meta object literal for the '<em><b>Get Username</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCOUNT___GET_USERNAME = eINSTANCE.getAccount__GetUsername();

		/**
		 * The meta object literal for the '<em><b>Set Password</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCOUNT___SET_PASSWORD = eINSTANCE.getAccount__SetPassword();

		/**
		 * The meta object literal for the '<em><b>Set Username</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCOUNT___SET_USERNAME = eINSTANCE.getAccount__SetUsername();

		/**
		 * The meta object literal for the '{@link Classes.Accounts.impl.AccountsManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Accounts.impl.AccountsManagerImpl
		 * @see Classes.Accounts.impl.AccountsPackageImpl#getAccountsManager()
		 * @generated
		 */
		EClass ACCOUNTS_MANAGER = eINSTANCE.getAccountsManager();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCOUNTS_MANAGER__ACCOUNT = eINSTANCE.getAccountsManager_Account();

		/**
		 * The meta object literal for the '{@link Classes.Accounts.IAccountsAccess <em>IAccounts Access</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Accounts.IAccountsAccess
		 * @see Classes.Accounts.impl.AccountsPackageImpl#getIAccountsAccess()
		 * @generated
		 */
		EClass IACCOUNTS_ACCESS = eINSTANCE.getIAccountsAccess();

		/**
		 * The meta object literal for the '<em><b>Validate Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IACCOUNTS_ACCESS___VALIDATE_ACCOUNT__STRING_STRING = eINSTANCE.getIAccountsAccess__ValidateAccount__String_String();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IACCOUNTS_ACCESS___LOGIN__STRING_STRING = eINSTANCE.getIAccountsAccess__Login__String_String();

		/**
		 * The meta object literal for the '{@link Classes.Accounts.IManageAccounts <em>IManage Accounts</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Accounts.IManageAccounts
		 * @see Classes.Accounts.impl.AccountsPackageImpl#getIManageAccounts()
		 * @generated
		 */
		EClass IMANAGE_ACCOUNTS = eINSTANCE.getIManageAccounts();

		/**
		 * The meta object literal for the '<em><b>Add Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGE_ACCOUNTS___ADD_ACCOUNT__STRING_STRING = eINSTANCE.getIManageAccounts__AddAccount__String_String();

		/**
		 * The meta object literal for the '<em><b>Delete Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGE_ACCOUNTS___DELETE_ACCOUNT__STRING = eINSTANCE.getIManageAccounts__DeleteAccount__String();

		/**
		 * The meta object literal for the '<em><b>Rename Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGE_ACCOUNTS___RENAME_ACCOUNT__STRING_STRING = eINSTANCE.getIManageAccounts__RenameAccount__String_String();

		/**
		 * The meta object literal for the '<em><b>Change Password</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGE_ACCOUNTS___CHANGE_PASSWORD__STRING_STRING = eINSTANCE.getIManageAccounts__ChangePassword__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Account Password</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGE_ACCOUNTS___GET_ACCOUNT_PASSWORD = eINSTANCE.getIManageAccounts__GetAccountPassword();

		/**
		 * The meta object literal for the '<em><b>Get Accounts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGE_ACCOUNTS___GET_ACCOUNTS = eINSTANCE.getIManageAccounts__GetAccounts();

		/**
		 * The meta object literal for the '<em><b>Search Accounts</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IMANAGE_ACCOUNTS___SEARCH_ACCOUNTS = eINSTANCE.getIManageAccounts__SearchAccounts();

		/**
		 * The meta object literal for the '{@link Classes.Accounts.AccountType <em>Account Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Accounts.AccountType
		 * @see Classes.Accounts.impl.AccountsPackageImpl#getAccountType()
		 * @generated
		 */
		EEnum ACCOUNT_TYPE = eINSTANCE.getAccountType();

	}

} //AccountsPackage
