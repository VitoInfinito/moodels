/**
 */
package Classes.Staff.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Staff</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaffTests extends TestSuite {

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
		TestSuite suite = new StaffTests("Staff Tests");
		suite.addTestSuite(StaffManagerTest.class);
		suite.addTestSuite(MonthlySalaryContractTest.class);
		suite.addTestSuite(HourlySalaryContractTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffTests(String name) {
		super(name);
	}

} //StaffTests
