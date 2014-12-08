/**
 */
package Classes.Accounts;

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
	 * @model usernameDataType="org.eclipse.uml2.types.String" usernameRequired="true" usernameOrdered="false" passwordDataType="org.eclipse.uml2.types.String" passwordRequired="true" passwordOrdered="false"
	 * @generated
	 */
	void addAccount(String username, String password);

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
	 * @model usernameDataType="org.eclipse.uml2.types.String" usernameRequired="true" usernameOrdered="false"
	 * @generated
	 */
	void getAccountPassword(String username);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getAccounts();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void searchAccounts();

} // IManageAccounts
