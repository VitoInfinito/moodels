/**
 */
package Classes.Stays.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Stays</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaysTests extends TestSuite {

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
		TestSuite suite = new StaysTests("Stays Tests");
		suite.addTestSuite(StayTest.class);
		suite.addTestSuite(StaysManagerTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaysTests(String name) {
		super(name);
	}

} //StaysTests
