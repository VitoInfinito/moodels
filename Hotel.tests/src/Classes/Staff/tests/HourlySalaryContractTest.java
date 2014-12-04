/**
 */
package Classes.Staff.tests;

import Classes.Staff.HourlySalaryContract;
import Classes.Staff.StaffFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hourly Salary Contract</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HourlySalaryContractTest extends SalaryContractTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HourlySalaryContractTest.class);
	}

	/**
	 * Constructs a new Hourly Salary Contract test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HourlySalaryContractTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hourly Salary Contract test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HourlySalaryContract getFixture() {
		return (HourlySalaryContract)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StaffFactory.eINSTANCE.createHourlySalaryContract());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //HourlySalaryContractTest
