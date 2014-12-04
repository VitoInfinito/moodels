/**
 */
package Classes.Bookables.tests;

import Classes.Bookables.BookablesFactory;
import Classes.Bookables.HostelBed;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hostel Bed</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HostelBedTest extends BookableTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HostelBedTest.class);
	}

	/**
	 * Constructs a new Hostel Bed test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HostelBedTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hostel Bed test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HostelBed getFixture() {
		return (HostelBed)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BookablesFactory.eINSTANCE.createHostelBed());
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

} //HostelBedTest
