/**
 */
package Classes.Customers.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Customers</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class CustomersTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new CustomersTests("Customers Tests");
		suite.addTestSuite(CustomersManagerTest.class);
		suite.addTestSuite(CustomerTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomersTests(String name) {
		super(name);
	}

} //CustomersTests
