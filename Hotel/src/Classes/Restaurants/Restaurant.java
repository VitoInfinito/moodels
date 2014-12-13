/**
 */
package Classes.Restaurants;

import java.util.Date;
import java.util.List;

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
 * @generated NOT
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param from 
	 * @param to 
	 * @param guestID 
	 * @param tables 
	 * @model
	 * @generated
	 */
	void addReservation(List<String> tables, String guestID, Date to, Date from);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Reservation getReservation(String reservationID);

	void changeTableNumber(String oldTableNbr, String newTableNbr);

	void changeTableNumberOfSeats(String tableNbr, int nbrSeats);

	void removeTable(String tableNbr);

	void addTable(String tableNbr, int nbrSeats);

	List<String> getReservationIDs();

	List<String> getRestaurantTableIDs();

	int getTableNumberOfSeats(String tableNbr);

	List<String> getAvailableTables(Date to, Date from);

	List<String> searchReservations(String keyword);

	List<String> searchTables(String keyword);

	void cancelReservation(String reservationID);

	void changeReservedTables(String reservationID, List<String> tables);

	List<String> getAvailableTablesByNbrGuests(Date to, Date from, int nbrGuests);

	List<String> searchReservationsWithTime(String keyword, Date from, Date to);


} // Restaurant
