/**
 */
package Classes.Bookings.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Bookings</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class BookingsTests extends TestSuite {

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
		TestSuite suite = new BookingsTests("Bookings Tests");
		suite.addTestSuite(BookingTest.class);
		suite.addTestSuite(BookingsManagerTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookingsTests(String name) {
		super(name);
	}

} //BookingsTests
