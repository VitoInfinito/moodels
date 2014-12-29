/**
 */
package Classes.Accounts;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
class Account implements Serializable {
	private static final AccountType ACCOUNT_TYPE_EDEFAULT = AccountType.GUEST;
	private AccountType accountType = ACCOUNT_TYPE_EDEFAULT;
	private String username;
	private String password;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccountType getAccountType() {
		return accountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccountType(AccountType newAccountType) {
		AccountType oldAccountType = accountType;
		accountType = newAccountType == null ? ACCOUNT_TYPE_EDEFAULT : newAccountType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (accountType: ");
		result.append(accountType);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //AccountImpl
