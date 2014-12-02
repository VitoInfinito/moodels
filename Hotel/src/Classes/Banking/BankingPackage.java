/**
 */
package Classes.Banking;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;

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
 * @see Classes.Banking.BankingFactory
 * @model kind="package"
 * @generated
 */
public interface BankingPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Banking";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/Banking.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Banking";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BankingPackage eINSTANCE = Classes.Banking.impl.BankingPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.Banking.AdministratorProvides <em>Administrator Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Banking.AdministratorProvides
	 * @see Classes.Banking.impl.BankingPackageImpl#getAdministratorProvides()
	 * @generated
	 */
	int ADMINISTRATOR_PROVIDES = 0;

	/**
	 * The number of structural features of the '<em>Administrator Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Make Deposit</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Add Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES___ADD_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = 1;

	/**
	 * The operation id for the '<em>Remove Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES___REMOVE_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Get Balance</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES___GET_BALANCE__STRING_STRING_INT_INT_STRING_STRING = 3;

	/**
	 * The number of operations of the '<em>Administrator Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_PROVIDES_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link Classes.Banking.CustomerProvides <em>Customer Provides</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Banking.CustomerProvides
	 * @see Classes.Banking.impl.BankingPackageImpl#getCustomerProvides()
	 * @generated
	 */
	int CUSTOMER_PROVIDES = 1;

	/**
	 * The number of structural features of the '<em>Customer Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_PROVIDES_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Make Payment</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_PROVIDES___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Is Credit Card Valid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_PROVIDES___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING = 1;

	/**
	 * The number of operations of the '<em>Customer Provides</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOMER_PROVIDES_OPERATION_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link Classes.Banking.AdministratorProvides <em>Administrator Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrator Provides</em>'.
	 * @see Classes.Banking.AdministratorProvides
	 * @generated
	 */
	EClass getAdministratorProvides();

	/**
	 * Returns the meta object for the '{@link Classes.Banking.AdministratorProvides#makeDeposit(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double) <em>Make Deposit</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Deposit</em>' operation.
	 * @see Classes.Banking.AdministratorProvides#makeDeposit(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double)
	 * @generated
	 */
	EOperation getAdministratorProvides__MakeDeposit__String_String_int_int_String_String_double();

	/**
	 * Returns the meta object for the '{@link Classes.Banking.AdministratorProvides#addCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Add Credit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Credit Card</em>' operation.
	 * @see Classes.Banking.AdministratorProvides#addCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAdministratorProvides__AddCreditCard__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Banking.AdministratorProvides#removeCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Remove Credit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Credit Card</em>' operation.
	 * @see Classes.Banking.AdministratorProvides#removeCreditCard(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAdministratorProvides__RemoveCreditCard__String_String_int_int_String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Banking.AdministratorProvides#getBalance(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Get Balance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Balance</em>' operation.
	 * @see Classes.Banking.AdministratorProvides#getBalance(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAdministratorProvides__GetBalance__String_String_int_int_String_String();

	/**
	 * Returns the meta object for class '{@link Classes.Banking.CustomerProvides <em>Customer Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Customer Provides</em>'.
	 * @see Classes.Banking.CustomerProvides
	 * @generated
	 */
	EClass getCustomerProvides();

	/**
	 * Returns the meta object for the '{@link Classes.Banking.CustomerProvides#makePayment(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double) <em>Make Payment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Make Payment</em>' operation.
	 * @see Classes.Banking.CustomerProvides#makePayment(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String, double)
	 * @generated
	 */
	EOperation getCustomerProvides__MakePayment__String_String_int_int_String_String_double();

	/**
	 * Returns the meta object for the '{@link Classes.Banking.CustomerProvides#isCreditCardValid(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String) <em>Is Credit Card Valid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Credit Card Valid</em>' operation.
	 * @see Classes.Banking.CustomerProvides#isCreditCardValid(java.lang.String, java.lang.String, int, int, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCustomerProvides__IsCreditCardValid__String_String_int_int_String_String();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BankingFactory getBankingFactory();

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
		 * The meta object literal for the '{@link Classes.Banking.AdministratorProvides <em>Administrator Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Banking.AdministratorProvides
		 * @see Classes.Banking.impl.BankingPackageImpl#getAdministratorProvides()
		 * @generated
		 */
		EClass ADMINISTRATOR_PROVIDES = eINSTANCE.getAdministratorProvides();

		/**
		 * The meta object literal for the '<em><b>Make Deposit</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR_PROVIDES___MAKE_DEPOSIT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = eINSTANCE.getAdministratorProvides__MakeDeposit__String_String_int_int_String_String_double();

		/**
		 * The meta object literal for the '<em><b>Add Credit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR_PROVIDES___ADD_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getAdministratorProvides__AddCreditCard__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Credit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR_PROVIDES___REMOVE_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getAdministratorProvides__RemoveCreditCard__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '<em><b>Get Balance</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ADMINISTRATOR_PROVIDES___GET_BALANCE__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getAdministratorProvides__GetBalance__String_String_int_int_String_String();

		/**
		 * The meta object literal for the '{@link Classes.Banking.CustomerProvides <em>Customer Provides</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Banking.CustomerProvides
		 * @see Classes.Banking.impl.BankingPackageImpl#getCustomerProvides()
		 * @generated
		 */
		EClass CUSTOMER_PROVIDES = eINSTANCE.getCustomerProvides();

		/**
		 * The meta object literal for the '<em><b>Make Payment</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_PROVIDES___MAKE_PAYMENT__STRING_STRING_INT_INT_STRING_STRING_DOUBLE = eINSTANCE.getCustomerProvides__MakePayment__String_String_int_int_String_String_double();

		/**
		 * The meta object literal for the '<em><b>Is Credit Card Valid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CUSTOMER_PROVIDES___IS_CREDIT_CARD_VALID__STRING_STRING_INT_INT_STRING_STRING = eINSTANCE.getCustomerProvides__IsCreditCardValid__String_String_int_int_String_String();

	}

} //BankingPackage
