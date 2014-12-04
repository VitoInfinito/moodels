/**
 */
package Classes.Restaurants;

import org.eclipse.emf.common.util.EMap;

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
 * @generated NOT
 */
public interface RestaurantsManager extends IRestaurantsManage {
	/**
	 * Returns the value of the '<em><b>Restaurant</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link Classes.Restaurants.Restaurant},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restaurant</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restaurant</em>' map.
	 * @see Classes.Restaurants.RestaurantsPackage#getRestaurantsManager_Restaurant()
	 * @model mapType="Classes.ECoreMapEntries.StringToRestaurantMap<org.eclipse.uml2.types.String, Classes.Restaurants.Restaurant>" ordered="false"
	 * @generated
	 */
	EMap<String, Restaurant> getRestaurant();

} // RestaurantsManager
