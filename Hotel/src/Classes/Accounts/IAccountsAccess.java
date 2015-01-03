/**
 */
package Classes.Accounts;

import java.io.Serializable;

import org.eclipse.jdt.annotation.NonNullByDefault;

import Classes.Utils.InvalidIDException;


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
@NonNullByDefault
public interface IAccountsAccess extends Serializable {
	
	IAccountsAccess INSTANCE = Classes.Accounts.AccountsManager.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		username != null && password != null
	 * Ensures:
	 * 		if there exists an account acc such that acc.username == username && acc.password == password
	 * 			true is returned
	 * 		otherwise
	 * 			false is returned
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" usernameDataType="org.eclipse.uml2.types.String" usernameRequired="true" usernameOrdered="false" passwordDataType="org.eclipse.uml2.types.String" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	boolean validateAccount(String username, String password);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		username != null && password != null
	 * Ensures:
	 * 		if there exists an account acc such that acc.username == username && acc.password == password
	 * 			true is returned
	 * 		otherwise
	 * 			false is returned
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" usernameDataType="org.eclipse.uml2.types.String" usernameRequired="true" usernameOrdered="false" passwordDataType="org.eclipse.uml2.types.String" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	boolean login(String username, String password);
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		username != null
	 * Ensures:
	 * 		if there exists an account acc such that acc.username == username
	 * 			the non null accountType of acc is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" usernameDataType="org.eclipse.uml2.types.String" usernameRequired="true" usernameOrdered="false" passwordDataType="org.eclipse.uml2.types.String" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	AccountType getAccountType(String username) throws InvalidIDException;

} // IAccountsAccess
