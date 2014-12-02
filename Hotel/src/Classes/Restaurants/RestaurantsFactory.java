/**
 */
package Classes.Restaurants;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Classes.Restaurants.RestaurantsPackage
 * @generated
 */
public interface RestaurantsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RestaurantsFactory eINSTANCE = Classes.Restaurants.impl.RestaurantsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Manager</em>'.
	 * @generated
	 */
	RestaurantsManager createRestaurantsManager();

	/**
	 * Returns a new object of class '<em>Restaurant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restaurant</em>'.
	 * @generated
	 */
	Restaurant createRestaurant();

	/**
	 * Returns a new object of class '<em>Reservation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reservation</em>'.
	 * @generated
	 */
	Reservation createReservation();

	/**
	 * Returns a new object of class '<em>Restaurant Table</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restaurant Table</em>'.
	 * @generated
	 */
	RestaurantTable createRestaurantTable();

	/**
	 * Returns a new object of class '<em>Restaurant Menu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Restaurant Menu</em>'.
	 * @generated
	 */
	RestaurantMenu createRestaurantMenu();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RestaurantsPackage getRestaurantsPackage();

} //RestaurantsFactory
