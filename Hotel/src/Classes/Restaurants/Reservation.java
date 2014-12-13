/**
 */
package Classes.Restaurants;

import java.util.Date;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reservation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Restaurants.Reservation#getId <em>Id</em>}</li>
 *   <li>{@link Classes.Restaurants.Reservation#getReservedBy <em>Reserved By</em>}</li>
 *   <li>{@link Classes.Restaurants.Reservation#getRestaurantTable <em>Restaurant Table</em>}</li>
 *   <li>{@link Classes.Restaurants.Reservation#getFrom <em>From</em>}</li>
 *   <li>{@link Classes.Restaurants.Reservation#getTo <em>To</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Restaurants.RestaurantsPackage#getReservation()
 * @model
 * @generated
 */
public interface Reservation extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Classes.Restaurants.RestaurantsPackage#getReservation_Id()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Classes.Restaurants.Reservation#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Reserved By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserved By</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserved By</em>' attribute.
	 * @see #setReservedBy(String)
	 * @see Classes.Restaurants.RestaurantsPackage#getReservation_ReservedBy()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getReservedBy();

	/**
	 * Sets the value of the '{@link Classes.Restaurants.Reservation#getReservedBy <em>Reserved By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved By</em>' attribute.
	 * @see #getReservedBy()
	 * @generated
	 */
	void setReservedBy(String value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(Date)
	 * @see Classes.Restaurants.RestaurantsPackage#getReservation_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getFrom();

	/**
	 * Sets the value of the '{@link Classes.Restaurants.Reservation#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Date value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(Date)
	 * @see Classes.Restaurants.RestaurantsPackage#getReservation_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getTo();

	/**
	 * Sets the value of the '{@link Classes.Restaurants.Reservation#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(Date value);

	void addTable(RestaurantTable restaurantTable);

	void changeTables(List<RestaurantTable> tables);

} // Reservation
