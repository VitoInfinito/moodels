/**
 */
package Classes.Accounts;

import java.io.Serializable;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
class AccountsFactory implements Serializable {
	static AccountsFactory INSTANCE = new AccountsFactory();

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AccountsFactory() {
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Account createAccount() {
		Account account = new Account();
		return account;
	}
} //AccountsFactoryImpl
