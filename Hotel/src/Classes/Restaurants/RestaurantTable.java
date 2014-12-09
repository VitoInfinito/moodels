/**
 */
package Classes.Restaurants;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restaurant Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Restaurants.RestaurantTable#getTableNumber <em>Table Number</em>}</li>
 *   <li>{@link Classes.Restaurants.RestaurantTable#getNumberOfSeats <em>Number Of Seats</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Restaurants.RestaurantsPackage#getRestaurantTable()
 * @model
 * @generated
 */
public interface RestaurantTable extends EObject {
	/**
	 * Returns the value of the '<em><b>Table Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Table Number</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Table Number</em>' attribute.
	 * @see #setTableNumber(String)
	 * @see Classes.Restaurants.RestaurantsPackage#getRestaurantTable_TableNumber()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getTableNumber();

	/**
	 * Sets the value of the '{@link Classes.Restaurants.RestaurantTable#getTableNumber <em>Table Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Table Number</em>' attribute.
	 * @see #getTableNumber()
	 * @generated
	 */
	void setTableNumber(String value);

	/**
	 * Returns the value of the '<em><b>Number Of Seats</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Seats</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Seats</em>' attribute.
	 * @see #setNumberOfSeats(int)
	 * @see Classes.Restaurants.RestaurantsPackage#getRestaurantTable_NumberOfSeats()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNumberOfSeats();

	/**
	 * Sets the value of the '{@link Classes.Restaurants.RestaurantTable#getNumberOfSeats <em>Number Of Seats</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Seats</em>' attribute.
	 * @see #getNumberOfSeats()
	 * @generated
	 */
	void setNumberOfSeats(int value);

} // RestaurantTable
