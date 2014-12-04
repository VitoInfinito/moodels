/**
 */
package Classes.Customers;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Customers.CustomersManager#getCustomer <em>Customer</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Customers.CustomersPackage#getCustomersManager()
 * @model
 * @generated NOT
 */
public interface CustomersManager extends ICustomers {
	/**
	 * Returns the value of the '<em><b>Customer</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link Classes.Customers.Customer},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' map.
	 * @see Classes.Customers.CustomersPackage#getCustomersManager_Customer()
	 * @model mapType="Classes.ECoreMapEntries.StringToCustomerMap<org.eclipse.uml2.types.String, Classes.Customers.Customer>" ordered="false"
	 * @generated
	 */
	EMap<String, Customer> getCustomer();

} // CustomersManager
