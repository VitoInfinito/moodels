/**
 */
package Classes.Accounts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Account</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Accounts.Account#getAccountType <em>Account Type</em>}</li>
 *   <li>{@link Classes.Accounts.Account#getUsername <em>Username</em>}</li>
 *   <li>{@link Classes.Accounts.Account#getPassword <em>Password</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Accounts.AccountsPackage#getAccount()
 * @model
 * @generated
 */
public interface Account extends EObject {
	/**
	 * Returns the value of the '<em><b>Account Type</b></em>' attribute.
	 * The literals are from the enumeration {@link Classes.Accounts.AccountType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Account Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Account Type</em>' attribute.
	 * @see Classes.Accounts.AccountType
	 * @see #setAccountType(AccountType)
	 * @see Classes.Accounts.AccountsPackage#getAccount_AccountType()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AccountType getAccountType();

	/**
	 * Sets the value of the '{@link Classes.Accounts.Account#getAccountType <em>Account Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Account Type</em>' attribute.
	 * @see Classes.Accounts.AccountType
	 * @see #getAccountType()
	 * @generated
	 */
	void setAccountType(AccountType value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see Classes.Accounts.AccountsPackage#getAccount_Username()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link Classes.Accounts.Account#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see Classes.Accounts.AccountsPackage#getAccount_Password()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link Classes.Accounts.Account#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setPassword();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setUsername();

} // Account
