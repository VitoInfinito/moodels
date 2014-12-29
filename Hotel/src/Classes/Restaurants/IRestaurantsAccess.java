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
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getRestaurantReservations(String restaurantID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getRestaurantTables(String restaurantID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" tableNbrDataType="org.eclipse.uml2.types.String" tableNbrRequired="true" tableNbrOrdered="false"
	 * @generated
	 */
	int getRestaurantTableNumberOfSeats(String restaurantID, String tableNbr) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" toRequired="true" toOrdered="false" fromRequired="true" fromOrdered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getAvailableTables(LocalDateTime to, LocalDateTime from, String restaurantID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" reservationIDDataType="org.eclipse.uml2.types.String" reservationIDRequired="true" reservationIDOrdered="false"
	 * @generated
	 */
	String getReservationGuest(String restaurantID, String reservationID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false"
	 * @generated
	 */
	String getRestaurantMenuName(String restaurantID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllRestaurantNames();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchRestaurants(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchRestaurantReservations(String restaurantID, String keyword) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchRestaurantTables(String restaurantID, String keyword) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" tablesDataType="org.eclipse.uml2.types.String" tablesMany="true" tablesOrdered="false" guestIDDataType="org.eclipse.uml2.types.String" guestIDRequired="true" guestIDOrdered="false" toRequired="true" toOrdered="false" fromRequired="true" fromOrdered="false"
	 * @generated NOT
	 */
	void makeReservation(String restaurantID, List<String> tables, String guestID, LocalDateTime to, LocalDateTime from) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" reservationIDDataType="org.eclipse.uml2.types.String" reservationIDRequired="true" reservationIDOrdered="false"
	 * @generated
	 */
	void cancelReservation(String restaurantID, String reservationID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" reservationIDDataType="org.eclipse.uml2.types.String" reservationIDRequired="true" reservationIDOrdered="false" tablesDataType="org.eclipse.uml2.types.String" tablesMany="true" tablesOrdered="false"
	 * @generated
	 */
	void changeReservedTables(String restaurantID, String reservationID, List<String> tables) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" toRequired="true" toOrdered="false" fromRequired="true" fromOrdered="false" nbrGuestsDataType="org.eclipse.uml2.types.Integer" nbrGuestsRequired="true" nbrGuestsOrdered="false"
	 * @generated NOT
	 */
	List<String> getAvailableTablesByNbrGuests(String restaurantID, LocalDateTime to, LocalDateTime from, int nbrGuests) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getRestaurantMenuItems(String restaurantID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" reservationIDDataType="org.eclipse.uml2.types.String" reservationIDRequired="true" reservationIDOrdered="false"
	 * @generated
	 */
	LocalDateTime getReservationFromTime(String restaurantID, String reservationID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" reservationIDDataType="org.eclipse.uml2.types.String" reservationIDRequired="true" reservationIDOrdered="false"
	 * @generated
	 */
	LocalDateTime getReservationToTime(String restaurantID, String reservationID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated NOT
	 */
	List<String> searchRestaurantReservationsWithTime(String restaurantID, String keyword, LocalDateTime from, LocalDateTime to) throws InvalidIDException;

} // IRestaurantsAccess
