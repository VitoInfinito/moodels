/**
 */
package Classes.Restaurants;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restaurant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Restaurants.Restaurant#getName <em>Name</em>}</li>
 *   <li>{@link Classes.Restaurants.Restaurant#getReservation <em>Reservation</em>}</li>
 *   <li>{@link Classes.Restaurants.Restaurant#getRestaurantTable <em>Restaurant Table</em>}</li>
 *   <li>{@link Classes.Restaurants.Restaurant#getMenu <em>Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Restaurants.RestaurantsPackage#getRestaurant()
 * @model
 * @generated
 */
public interface Restaurant extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see Classes.Restaurants.RestaurantsPackage#getRestaurant_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link Classes.Restaurants.Restaurant#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Reservation</b></em>' reference list.
	 * The list contents are of type {@link Classes.Restaurants.Reservation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reservation</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reservation</em>' reference list.
	 * @see Classes.Restaurants.RestaurantsPackage#getRestaurant_Reservation()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Reservation> getReservation();

	/**
	 * Returns the value of the '<em><b>Restaurant Table</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Restaurant Table</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Restaurant Table</em>' reference.
	 * @see #setRestaurantTable(RestaurantTable)
	 * @see Classes.Restaurants.RestaurantsPackage#getRestaurant_RestaurantTable()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RestaurantTable getRestaurantTable();

	/**
	 * Sets the value of the '{@link Classes.Restaurants.Restaurant#getRestaurantTable <em>Restaurant Table</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Restaurant Table</em>' reference.
	 * @see #getRestaurantTable()
	 * @generated
	 */
	void setRestaurantTable(RestaurantTable value);

	/**
	 * Returns the value of the '<em><b>Menu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Menu</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Menu</em>' reference.
	 * @see #setMenu(RestaurantMenu)
	 * @see Classes.Restaurants.RestaurantsPackage#getRestaurant_Menu()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RestaurantMenu getMenu();

	/**
	 * Sets the value of the '{@link Classes.Restaurants.Restaurant#getMenu <em>Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Menu</em>' reference.
	 * @see #getMenu()
	 * @generated
	 */
	void setMenu(RestaurantMenu value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setName();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addReservation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getAllTables();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getAllReservations();

} // Restaurant
