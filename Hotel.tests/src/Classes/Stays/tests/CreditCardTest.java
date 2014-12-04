/**
 */
package Classes.Stays.tests;

import Classes.Stays.CreditCard;
import Classes.Stays.StaysFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Credit Card</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class CreditCardTest extends TestCase {

	/**
	 * The fixture for this Credit Card test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreditCard fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(CreditCardTest.class);
	}

	/**
	 * Constructs a new Credit Card test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCardTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Credit Card test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(CreditCard fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Credit Card test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CreditCard getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(StaysFactory.eINSTANCE.createCreditCard());
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

} //CreditCardTest
