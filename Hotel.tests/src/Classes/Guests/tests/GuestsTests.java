/**
 */
package Classes.Guests.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Guests</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuestsTests extends TestSuite {

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
		TestSuite suite = new GuestsTests("Guests Tests");
		suite.addTestSuite(GuestsManagerTest.class);
		suite.addTestSuite(GuestTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestsTests(String name) {
		super(name);
	}

} //GuestsTests
