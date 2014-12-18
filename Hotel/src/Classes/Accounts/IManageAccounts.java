/**
 */
package Classes.Accounts;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNullByDefault;

import Classes.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IManage Accounts</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Accounts.AccountsPackage#getIManageAccounts()
 * @model interface="true" abstract="true"
 * @generated
 */
@NonNullByDefault
public interface IManageAccounts extends EObject {
	
	IManageAccounts INSTANCE = Classes.Accounts.impl.AccountsManagerImpl.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		username != null && password != null && type != null
	 * Ensures:
	 * 		if there exists an account acc such that acc.username == username
	 * 			InvalidIDException is thrown.
	 * 		otherwise
	 * 			an account acc is added where acc.username == username && acc.password == password && acc.type = type
	 * <!-- end-user-doc -->
	 * @model usernameDataType="org.eclipse.uml2.types.String" usernameRequired="true" usernameOrdered="false" passwordDataType="org.eclipse.uml2.types.String" passwordRequired="true" passwordOrdered="false" typeRequired="true" typeOrdered="false"
	 * @generated
	 */
	void addAccount(String username, String password, AccountType type) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		username != null
	 * Ensures:
	 * 		if there exists an account acc such that acc.username == username
	 * 			acc is removed.
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @model usernameDataType="org.eclipse.uml2.types.String" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	void deleteAccount(String username) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		username != null
	 * Ensures:
	 * 		if there exists an account acc such that acc.username == oldUsername
	 * 			acc.username == newUsername
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @model oldUsernameDataType="org.eclipse.uml2.types.String" oldUsernameRequired="true" oldUsernameOrdered="false" newUsernameDataType="org.eclipse.uml2.types.String" newUsernameRequired="true" newUsernameOrdered="false"
	 * @generated
	 */
	void renameAccount(String oldUsername, String newUsername) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		username != null
	 * Ensures:
	 * 		if there exists an account acc such that acc.username == username
	 * 			acc.password == newPassword
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @model newPasswordDataType="org.eclipse.uml2.types.String" newPasswordRequired="true" newPasswordOrdered="false" usernameDataType="org.eclipse.uml2.types.String" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	void changePassword(String newPassword, String username);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		username != null
	 * Ensures:
	 * 		if there exists an account acc such that acc.username == username
	 * 			non null acc.password is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" usernameDataType="org.eclipse.uml2.types.String" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	String getAccountPassword(String username) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		username != null
	 * Ensures:
	 * 		if there exists an account acc such that acc.username == username
	 * 			non null acc.username is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" usernameDataType="org.eclipse.uml2.types.String" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	String getAccountName(String username) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		keyword != null
	 * Ensures:
	 * 	 	returns a non-null list of all accounts ids matching something in the following order:
	 * 			1. Accounts with id that exactly matches the keyword
	 * 			2. Accounts with id that has some matching to the keyword
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchAccounts(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		nothing
	 * Ensures:
	 * 	 	A non null list of all accounts usernames is returned.
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> getAllAccountIDs();

} // IManageAccounts
