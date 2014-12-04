/**
 */
package Classes.Services.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Services</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServicesTests extends TestSuite {

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
		TestSuite suite = new ServicesTests("Services Tests");
		suite.addTestSuite(RoomServiceMenuTest.class);
		suite.addTestSuite(ServiceManagerTest.class);
		suite.addTestSuite(RoomServiceOrderTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServicesTests(String name) {
		super(name);
	}

} //ServicesTests
