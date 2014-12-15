/**
 */
package Classes.Customers.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import Classes.Customers.Customer;
import Classes.Customers.CustomersFactory;
import Classes.Customers.CustomersManager;
import Classes.Customers.CustomersPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomersFactoryImpl extends EFactoryImpl implements CustomersFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CustomersFactory init() {
		try {
			CustomersFactory theCustomersFactory = (CustomersFactory)EPackage.Registry.INSTANCE.getEFactory(CustomersPackage.eNS_URI);
			if (theCustomersFactory != null) {
				return theCustomersFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CustomersFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private CustomersFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Customer createCustomer() {
		CustomerImpl customer = new CustomerImpl();
		return customer;
	}
} //CustomersFactoryImpl
