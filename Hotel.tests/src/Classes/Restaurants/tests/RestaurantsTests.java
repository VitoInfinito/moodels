/**
 */
package Classes.Restaurants.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>Restaurants</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestaurantsTests extends TestSuite {

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
		TestSuite suite = new RestaurantsTests("Restaurants Tests");
		suite.addTestSuite(RestaurantsManagerTest.class);
		suite.addTestSuite(RestaurantTest.class);
		suite.addTestSuite(RestaurantMenuTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantsTests(String name) {
		super(name);
	}

} //RestaurantsTests
