/**
 */
package Classes.Restaurants;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
 class RestaurantsFactory implements Serializable {

	private static final long serialVersionUID = 5591998307554643982L;

	static RestaurantsFactory INSTANCE = new RestaurantsFactory();

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RestaurantsFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restaurant createRestaurant() {
		Restaurant restaurant = new Restaurant();
		return restaurant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation createReservation() {
		Reservation reservation = new Reservation();
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantTable createRestaurantTable() {
		RestaurantTable restaurantTable = new RestaurantTable();
		return restaurantTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantMenu createRestaurantMenu() {
		RestaurantMenu restaurantMenu = new RestaurantMenu();
		return restaurantMenu;
	}
} //RestaurantsFactoryImpl
