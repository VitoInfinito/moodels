/**
 */
package Classes.Restaurants.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import Classes.Restaurants.Reservation;
import Classes.Restaurants.Restaurant;
import Classes.Restaurants.RestaurantMenu;
import Classes.Restaurants.RestaurantTable;
import Classes.Restaurants.RestaurantsFactory;
import Classes.Restaurants.RestaurantsManager;
import Classes.Restaurants.RestaurantsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RestaurantsFactoryImpl extends EFactoryImpl implements RestaurantsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RestaurantsFactory init() {
		try {
			RestaurantsFactory theRestaurantsFactory = (RestaurantsFactory)EPackage.Registry.INSTANCE.getEFactory(RestaurantsPackage.eNS_URI);
			if (theRestaurantsFactory != null) {
				return theRestaurantsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RestaurantsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RestaurantsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Restaurant createRestaurant() {
		RestaurantImpl restaurant = new RestaurantImpl();
		return restaurant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reservation createReservation() {
		ReservationImpl reservation = new ReservationImpl();
		return reservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantTable createRestaurantTable() {
		RestaurantTableImpl restaurantTable = new RestaurantTableImpl();
		return restaurantTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantMenu createRestaurantMenu() {
		RestaurantMenuImpl restaurantMenu = new RestaurantMenuImpl();
		return restaurantMenu;
	}
} //RestaurantsFactoryImpl
