/**
 */
package Classes.Bills;

import Classes.Banking.CustomerProvides;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Bills.BillsManager#getBill <em>Bill</em>}</li>
 *   <li>{@link Classes.Bills.BillsManager#getCustomerProvides <em>Customer Provides</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Bills.BillsPackage#getBillsManager()
 * @model
 * @generated NOT
 */
public interface BillsManager extends IBills {
	/**
	 * Returns the value of the '<em><b>Bill</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link Classes.Bills.Bill},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bill</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bill</em>' map.
	 * @see Classes.Bills.BillsPackage#getBillsManager_Bill()
	 * @model mapType="Classes.ECoreMapEntries.StringToBillMap<org.eclipse.uml2.types.String, Classes.Bills.Bill>" ordered="false"
	 * @generated
	 */
	EMap<String, Bill> getBill();

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
	 * @see Classes.Bills.BillsPackage#getBillsManager_CustomerProvides()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CustomerProvides getCustomerProvides();

	/**
	 * Sets the value of the '{@link Classes.Bills.BillsManager#getCustomerProvides <em>Customer Provides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer Provides</em>' reference.
	 * @see #getCustomerProvides()
	 * @generated
	 */
	void setCustomerProvides(CustomerProvides value);

} // BillsManager
