/**
 */
package Classes.Restaurants;

import java.time.LocalDateTime;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Restaurant</b></em>'.
 * <!-- end-user-doc -->
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
	void addReservation(List<String> tables, String guestID, LocalDateTime to, LocalDateTime from);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Reservation getReservation(String reservationID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeTableNumber(String oldTableNbr, String newTableNbr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeTableNumberOfSeats(String tableNbr, int nbrSeats);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeTable(String tableNbr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addTable(String tableNbr, int nbrSeats);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	List<String> getReservationIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	List<String> getRestaurantTableIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	int getTableNumberOfSeats(String tableNbr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	List<String> getAvailableTables(LocalDateTime to, LocalDateTime from);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	List<String> searchReservations(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	List<String> searchTables(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancelReservation(String reservationID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void changeReservedTables(String reservationID, List<String> tables);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	List<String> getAvailableTablesByNbrGuests(LocalDateTime to, LocalDateTime from, int nbrGuests);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	List<String> searchReservationsWithTime(String keyword, LocalDateTime from, LocalDateTime to);
} // Restaurant
