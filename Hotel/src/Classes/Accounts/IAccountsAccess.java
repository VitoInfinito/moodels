/**
 */
package Classes.Accounts;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IAccounts Access</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Accounts.AccountsPackage#getIAccountsAccess()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IAccountsAccess extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" usernameDataType="org.eclipse.uml2.types.String" usernameRequired="true" usernameOrdered="false" passwordDataType="org.eclipse.uml2.types.String" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	boolean validateAccount(String username, String password);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" usernameDataType="org.eclipse.uml2.types.String" usernameRequired="true" usernameOrdered="false" passwordDataType="org.eclipse.uml2.types.String" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	boolean login(String username, String password);

} // IAccountsAccess
