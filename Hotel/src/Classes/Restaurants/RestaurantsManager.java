/**
 */
package Classes.Restaurants;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Restaurants.RestaurantsManager#getRestaurant <em>Restaurant</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Restaurants.RestaurantsPackage#getRestaurantsManager()
 * @model
 * @generated
 */
public interface RestaurantsManager extends IRestaurantsManage {
	/**
	 * Returns the value of the '<em><b>Restaurant</b></em>' reference list.
	 * The list contents are of type {@link Classes.Restaurants.Restaurant}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restaurant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restaurant</em>' reference list.
	 * @see Classes.Restaurants.RestaurantsPackage#getRestaurantsManager_Restaurant()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Restaurant> getRestaurant();

} // RestaurantsManager
