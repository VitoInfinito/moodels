/**
 */
package Classes.Restaurants;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import org.eclipse.jdt.annotation.NonNullByDefault;

import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IRestaurants Access</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Restaurants.RestaurantsPackage#getIRestaurantsAccess()
 * @model interface="true" abstract="true"
 * @generated
 */
@NonNullByDefault
public interface IRestaurantsAccess extends Serializable {
	
	IRestaurantsAccess INSTANCE = Classes.Restaurants.RestaurantsManager.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		restaurantID != null
	 * Ensures:
	 * 		if there exists a restaurant with the ID restaurantID  
	 * 			the all reservations for that restaurant is returned
	 * 		otherwise
	 * 			an InvalidIDException will be thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getRestaurantReservations(String restaurantID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		restaurantID != null
	 * Ensures:
	 * 		if there exists a restaurant with the ID restaurantID  
	 * 			the restaurant's  tables will be returned
	 * 		otherwise
	 * 			an InvalidIDException will be thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getRestaurantTables(String restaurantID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		restaurantID != null && tableNbr != null
	 * Ensures:
	 * 		if there exists a restaurant with the ID restaurantID  
	 * 			the number of seats by the table is returned
	 * 		otherwise
	 * 			an InvalidIDException will be thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" tableNbrDataType="org.eclipse.uml2.types.String" tableNbrRequired="true" tableNbrOrdered="false"
	 * @generated
	 */
	int getRestaurantTableNumberOfSeats(String restaurantID, String tableNbr) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		to != null && from != null && != restaurantID != null
	 * Ensures:
	 * 		if there exists a table at the restaurant with the ID restaurantID  
	 * 			available table times will be returned 
	 * 		otherwise
	 * 			an InvalidIDException will be thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" toRequired="true" toOrdered="false" fromRequired="true" fromOrdered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getAvailableTables(LocalDateTime to, LocalDateTime from, String restaurantID) throws InvalidIDException;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		reservationID != null && != restaurantID != null
	 * Ensures:
	 * 		if there exists a guest at the restaurant with the ID restaurantID  
	 * 			the guest with ID reservation ID will be returned 
	 * 		otherwise
	 * 			an InvalidIDException will be thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" reservationIDDataType="org.eclipse.uml2.types.String" reservationIDRequired="true" reservationIDOrdered="false"
	 * @generated
	 */
	String getReservationGuest(String restaurantID, String reservationID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		reservationID != null && != restaurantID != null
	 * Ensures:
	 * 		if there exists a restaurant with id restaurantID and a reservation at that restaurant with the ID reservationID 
	 * 			a list of the reserved tables for that reservation is returned
	 * 		otherwise
	 * 			an InvalidIDException will be thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" reservationIDDataType="org.eclipse.uml2.types.String" reservationIDRequired="true" reservationIDOrdered="false"
	 * @generated
	 */
	List<String> getReservationTables(String restaurantID, String reservationID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		restaurantID != null
	 * Ensures:
	 * 		that the restaurant menu names will be returned if any exists
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false"
	 * @generated
	 */
	String getRestaurantMenuName(String restaurantID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Ensures:
	 * 		that all restaurant names will be returned
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllRestaurantNames();

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		keyword != null
	 * Ensures:
	 * 		that the restaurants with the keyword will be returned
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchRestaurants(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		restaurantID != null && keyword != null
	 * Ensures:
	 * 		if restaurant with ID restaurantID exists
	 * 			it will be returned if it matches the keyword
	 * 		otherwise
	 * 			throws InvalidIDException
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchRestaurantReservations(String restaurantID, String keyword) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		keyword != null && restaurantID != null
	 * Ensures:
	 * 		if there exists a table at the restaurant with the ID restaurantID  
	 * 			it will be returned if it matches the keyword 
	 * 		otherwise
	 * 			an InvalidIDException will be thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchRestaurantTables(String restaurantID, String keyword) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		restaurantID != null && 
	 * 		tables != null &&
	 * 		guestID != null &&
	 * 		to != null &&
	 * 		from != null
	 * Ensures:
	 * 		if the restaurantID and the specified time are valid 
	 * 			make a reservation for the selected time 
	 * 		otherwise
	 * 			an InvalidIDException will be thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" tablesDataType="org.eclipse.uml2.types.String" tablesMany="true" tablesOrdered="false" guestIDDataType="org.eclipse.uml2.types.String" guestIDRequired="true" guestIDOrdered="false" toRequired="true" toOrdered="false" fromRequired="true" fromOrdered="false"
	 * @generated NOT
	 */
	void makeReservation(String restaurantID, List<String> tables, String guestID, LocalDateTime to, LocalDateTime from) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		restaurantID != null && 
	 * 		reservationID != null 
	 * Ensures:
	 * 		if the restaurantID exists and reservationID is valid 
	 * 			cancel the reservation with ID reservationID 
	 * 		otherwise
	 * 			an InvalidIDException will be thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" reservationIDDataType="org.eclipse.uml2.types.String" reservationIDRequired="true" reservationIDOrdered="false"
	 * @generated
	 */
	void cancelReservation(String restaurantID, String reservationID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		restaurantID != null && 
	 * 		reservationID != null &&
	 * 		tables != null  
	 * Ensures:
	 * 		if the restaurantID exists and reservationID is valid 
	 * 			change the time for the table with ID reservationID
	 * 		otherwise
	 * 			an InvalidIDException will be thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" reservationIDDataType="org.eclipse.uml2.types.String" reservationIDRequired="true" reservationIDOrdered="false" tablesDataType="org.eclipse.uml2.types.String" tablesMany="true" tablesOrdered="false"
	 * @generated
	 */
	void changeReservedTables(String restaurantID, String reservationID, List<String> tables) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		restaurantID != null && 
	 * 		to != null &&
	 * 		from != null &&
	 * 		nbrGuests != null  
	 * Ensures:
	 * 		return all the abailable tables for the specified number of guests during the time period given.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" toRequired="true" toOrdered="false" fromRequired="true" fromOrdered="false" nbrGuestsDataType="org.eclipse.uml2.types.Integer" nbrGuestsRequired="true" nbrGuestsOrdered="false"
	 * @generated NOT
	 */
	List<String> getAvailableTablesByNbrGuests(String restaurantID, LocalDateTime to, LocalDateTime from, int nbrGuests) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	  Requires:
	 * 		restaurantID != null  
	 * Ensures:
	 * 		returns the menu items on the restaurant with ID restaurantID
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getRestaurantMenuItems(String restaurantID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	  Requires:
	 * 		restaurantID != null && 
	 * 		reservationID != null 
	 * Ensures:
	 * 		gives the starting time for a reservation at the specified restaurant.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" reservationIDDataType="org.eclipse.uml2.types.String" reservationIDRequired="true" reservationIDOrdered="false"
	 * @generated
	 */
	LocalDateTime getReservationFromTime(String restaurantID, String reservationID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	  Requires:
	 * 		restaurantID != null && 
	 * 		reservationID != null 
	 * Ensures:
	 * 		gives the ending time for a reservation at the specified restaurant.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" reservationIDDataType="org.eclipse.uml2.types.String" reservationIDRequired="true" reservationIDOrdered="false"
	 * @generated
	 */
	LocalDateTime getReservationToTime(String restaurantID, String reservationID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 Requires:
	 * 		restaurantID != null && 
	 * 		keyword != null &&
	 * 		from != null &&
	 * 		to != null  
	 * Ensures:
	 * 		gives the reservations during the specified time period
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated NOT
	 */
	List<String> searchRestaurantReservationsWithTime(String restaurantID, String keyword, LocalDateTime from, LocalDateTime to) throws InvalidIDException;

} // IRestaurantsAccess
