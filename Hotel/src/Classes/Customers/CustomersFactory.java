/**
 */
package Classes.Customers;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
class CustomersFactory implements Serializable {
	private static final long serialVersionUID = 4429344991355880398L;
	
	static CustomersFactory INSTANCE = new CustomersFactory();

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CustomersFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		Customer customer = new Customer();
		return customer;
	}
} //CustomersFactoryImpl
