/**
 */
package Classes.Accounts;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

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
public interface IManageAccounts extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model usernameDataType="org.eclipse.uml2.types.String" usernameRequired="true" usernameOrdered="false" passwordDataType="org.eclipse.uml2.types.String" passwordRequired="true" passwordOrdered="false" typeRequired="true" typeOrdered="false"
	 * @generated
	 */
	void addAccount(String username, String password, AccountType type);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model usernameDataType="org.eclipse.uml2.types.String" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	void deleteAccount(String username);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model oldUsernameDataType="org.eclipse.uml2.types.String" oldUsernameRequired="true" oldUsernameOrdered="false" newUsernameDataType="org.eclipse.uml2.types.String" newUsernameRequired="true" newUsernameOrdered="false"
	 * @generated
	 */
	void renameAccount(String oldUsername, String newUsername);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model newPasswordDataType="org.eclipse.uml2.types.String" newPasswordRequired="true" newPasswordOrdered="false" usernameDataType="org.eclipse.uml2.types.String" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	void changePassword(String newPassword, String username);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" usernameDataType="org.eclipse.uml2.types.String" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	String getAccountPassword(String username);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" usernameDataType="org.eclipse.uml2.types.String" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	String getAccountName(String username);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	EList<String> searchAccounts(String keyword);

} // IManageAccounts
