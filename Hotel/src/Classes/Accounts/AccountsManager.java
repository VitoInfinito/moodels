/**
 */
package Classes.Accounts;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Accounts.AccountsManager#getAccount <em>Account</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Accounts.AccountsPackage#getAccountsManager()
 * @model
 * @generated
 */
public interface AccountsManager extends IManageAccounts, IAccountsAccess {
	/**
	 * Returns the value of the '<em><b>Account</b></em>' reference list.
	 * The list contents are of type {@link Classes.Accounts.Account}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' reference list.
	 * @see Classes.Accounts.AccountsPackage#getAccountsManager_Account()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Account> getAccount();

} // AccountsManager
