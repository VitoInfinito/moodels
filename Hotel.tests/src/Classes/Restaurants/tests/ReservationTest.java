/**
 */
package Classes.Restaurants.tests;

import Classes.Restaurants.Reservation;
import Classes.Restaurants.RestaurantsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ReservationTest extends TestCase {

	/**
	 * The fixture for this Reservation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reservation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ReservationTest.class);
	}

	/**
	 * Constructs a new Reservation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Reservation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Reservation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Reservation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Reservation getFixture() {
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
		setFixture(RestaurantsFactory.eINSTANCE.createReservation());
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

} //ReservationTest
