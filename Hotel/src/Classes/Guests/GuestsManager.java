/**
 */
package Classes.Guests;

import Classes.Accounts.IManageAccounts;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Guests.GuestsManager#getGuest <em>Guest</em>}</li>
 *   <li>{@link Classes.Guests.GuestsManager#getIManageAccounts <em>IManage Accounts</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Guests.GuestsPackage#getGuestsManager()
 * @model
 * @generated NOT
 */
public interface GuestsManager extends IGuests {
	/**
	 * Returns the value of the '<em><b>Guest</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link Classes.Guests.Guest},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guest</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guest</em>' map.
	 * @see Classes.Guests.GuestsPackage#getGuestsManager_Guest()
	 * @model mapType="Classes.ECoreMapEntries.StringToGuestMap<org.eclipse.uml2.types.String, Classes.Guests.Guest>" ordered="false"
	 * @generated NOT
	 */
	EMap<String, Guest> getGuests();

	/**
	 * Returns the value of the '<em><b>IManage Accounts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IManage Accounts</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IManage Accounts</em>' reference.
	 * @see #setIManageAccounts(IManageAccounts)
	 * @see Classes.Guests.GuestsPackage#getGuestsManager_IManageAccounts()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IManageAccounts getIManageAccounts();

	/**
	 * Sets the value of the '{@link Classes.Guests.GuestsManager#getIManageAccounts <em>IManage Accounts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IManage Accounts</em>' reference.
	 * @see #getIManageAccounts()
	 * @generated
	 */
	void setIManageAccounts(IManageAccounts value);

} // GuestsManager
