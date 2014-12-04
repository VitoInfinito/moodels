/**
 */
package Classes.Staff.tests;

import Classes.Staff.MonthlySalaryContract;
import Classes.Staff.StaffFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Monthly Salary Contract</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class MonthlySalaryContractTest extends SalaryContractTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(MonthlySalaryContractTest.class);
	}

	/**
	 * Constructs a new Monthly Salary Contract test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthlySalaryContractTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Monthly Salary Contract test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected MonthlySalaryContract getFixture() {
		return (MonthlySalaryContract)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StaffFactory.eINSTANCE.createMonthlySalaryContract());
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

} //MonthlySalaryContractTest
