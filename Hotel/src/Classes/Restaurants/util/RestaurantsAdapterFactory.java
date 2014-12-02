/**
 */
package Classes.Restaurants.util;

import Classes.Restaurants.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Classes.Restaurants.RestaurantsPackage
 * @generated
 */
public class RestaurantsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RestaurantsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RestaurantsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RestaurantsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestaurantsSwitch<Adapter> modelSwitch =
		new RestaurantsSwitch<Adapter>() {
			@Override
			public Adapter caseIRestaurantsManage(IRestaurantsManage object) {
				return createIRestaurantsManageAdapter();
			}
			@Override
			public Adapter caseIRestaurantsAccess(IRestaurantsAccess object) {
				return createIRestaurantsAccessAdapter();
			}
			@Override
			public Adapter caseRestaurantsManager(RestaurantsManager object) {
				return createRestaurantsManagerAdapter();
			}
			@Override
			public Adapter caseRestaurant(Restaurant object) {
				return createRestaurantAdapter();
			}
			@Override
			public Adapter caseReservation(Reservation object) {
				return createReservationAdapter();
			}
			@Override
			public Adapter caseRestaurantTable(RestaurantTable object) {
				return createRestaurantTableAdapter();
			}
			@Override
			public Adapter caseRestaurantMenu(RestaurantMenu object) {
				return createRestaurantMenuAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Classes.Restaurants.IRestaurantsManage <em>IRestaurants Manage</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Restaurants.IRestaurantsManage
	 * @generated
	 */
	public Adapter createIRestaurantsManageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Restaurants.IRestaurantsAccess <em>IRestaurants Access</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Restaurants.IRestaurantsAccess
	 * @generated
	 */
	public Adapter createIRestaurantsAccessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Restaurants.RestaurantsManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Restaurants.RestaurantsManager
	 * @generated
	 */
	public Adapter createRestaurantsManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Restaurants.Restaurant <em>Restaurant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Restaurants.Restaurant
	 * @generated
	 */
	public Adapter createRestaurantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Restaurants.Reservation <em>Reservation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Restaurants.Reservation
	 * @generated
	 */
	public Adapter createReservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Restaurants.RestaurantTable <em>Restaurant Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Restaurants.RestaurantTable
	 * @generated
	 */
	public Adapter createRestaurantTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Restaurants.RestaurantMenu <em>Restaurant Menu</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Restaurants.RestaurantMenu
	 * @generated
	 */
	public Adapter createRestaurantMenuAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RestaurantsAdapterFactory
