/**
 */
package Classes.Accounts;

import java.util.List;

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
 * @generated NOT
 */
public interface AccountsManager extends IManageAccounts, IAccountsAccess {
	/**
	 * Returns the value of the '<em><b>Account</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link Classes.Accounts.Account},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account</em>' map.
	 * @see Classes.Accounts.AccountsPackage#getAccountsManager_Account()
	 * @model mapType="Classes.ECoreMapEntries.StringToAccountMap<org.eclipse.uml2.types.String, Classes.Accounts.Account>" ordered="false"
	 * @generated NOT
	 */
	List<Account> getAccounts();

} // AccountsManager
