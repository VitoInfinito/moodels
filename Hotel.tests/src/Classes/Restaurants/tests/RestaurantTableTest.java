/**
 */
package Classes.Restaurants.tests;

import Classes.Restaurants.RestaurantTable;
import Classes.Restaurants.RestaurantsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Restaurant Table</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestaurantTableTest extends TestCase {

	/**
	 * The fixture for this Restaurant Table test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestaurantTable fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RestaurantTableTest.class);
	}

	/**
	 * Constructs a new Restaurant Table test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantTableTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Restaurant Table test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RestaurantTable fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Restaurant Table test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestaurantTable getFixture() {
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
		setFixture(RestaurantsFactory.eINSTANCE.createRestaurantTable());
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

} //RestaurantTableTest
