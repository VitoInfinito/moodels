/**
 */
package Classes.Stays;

import Classes.Banking.CustomerProvides;
import Classes.Bills.IBills;
import Classes.Guests.IGuests;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Stays.StaysManager#getStay <em>Stay</em>}</li>
 *   <li>{@link Classes.Stays.StaysManager#getCustomerProvides <em>Customer Provides</em>}</li>
 *   <li>{@link Classes.Stays.StaysManager#getIBills <em>IBills</em>}</li>
 *   <li>{@link Classes.Stays.StaysManager#getIGuests <em>IGuests</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Stays.StaysPackage#getStaysManager()
 * @model
 * @generated NOT
 */
public interface StaysManager extends IStays {
	/**
	 * Returns the value of the '<em><b>Stay</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link Classes.Stays.Stay},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stay</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stay</em>' map.
	 * @see Classes.Stays.StaysPackage#getStaysManager_Stay()
	 * @model mapType="Classes.ECoreMapEntries.StringToStayMap<org.eclipse.uml2.types.String, Classes.Stays.Stay>" ordered="false"
	 * @generated
	 */
	EMap<String, Stay> getStay();

	/**
	 * Returns the value of the '<em><b>Customer Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer Provides</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer Provides</em>' reference.
	 * @see #setCustomerProvides(CustomerProvides)
	 * @see Classes.Stays.StaysPackage#getStaysManager_CustomerProvides()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CustomerProvides getCustomerProvides();

	/**
	 * Sets the value of the '{@link Classes.Stays.StaysManager#getCustomerProvides <em>Customer Provides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Provides</em>' reference.
	 * @see #getCustomerProvides()
	 * @generated
	 */
	void setCustomerProvides(CustomerProvides value);

	/**
	 * Returns the value of the '<em><b>IBills</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IBills</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IBills</em>' reference.
	 * @see #setIBills(IBills)
	 * @see Classes.Stays.StaysPackage#getStaysManager_IBills()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IBills getIBills();

	/**
	 * Sets the value of the '{@link Classes.Stays.StaysManager#getIBills <em>IBills</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBills</em>' reference.
	 * @see #getIBills()
	 * @generated
	 */
	void setIBills(IBills value);

	/**
	 * Returns the value of the '<em><b>IGuests</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IGuests</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IGuests</em>' reference.
	 * @see #setIGuests(IGuests)
	 * @see Classes.Stays.StaysPackage#getStaysManager_IGuests()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IGuests getIGuests();

	/**
	 * Sets the value of the '{@link Classes.Stays.StaysManager#getIGuests <em>IGuests</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IGuests</em>' reference.
	 * @see #getIGuests()
	 * @generated
	 */
	void setIGuests(IGuests value);

} // StaysManager
