/**
 */
package Classes.Restaurants;

import java.time.LocalDateTime;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNullByDefault;

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
public interface IRestaurantsAccess extends EObject {
	
	IRestaurantsAccess INSTANCE = Classes.Restaurants.impl.RestaurantsManagerImpl.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getRestaurantReservations(String restaurantID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getRestaurantTables(String restaurantID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" tableNbrDataType="org.eclipse.uml2.types.String" tableNbrRequired="true" tableNbrOrdered="false"
	 * @generated
	 */
	int getRestaurantTableNumberOfSeats(String restaurantID, String tableNbr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" toRequired="true" toOrdered="false" fromRequired="true" fromOrdered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getAvailableTables(LocalDateTime to, LocalDateTime from, String restaurantID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" reservationIDDataType="org.eclipse.uml2.types.String" reservationIDRequired="true" reservationIDOrdered="false"
	 * @generated
	 */
	String getReservationGuest(String restaurantID, String reservationID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false"
	 * @generated
	 */
	String getRestaurantMenuName(String restaurantID);

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
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchRestaurantReservations(String restaurantID, String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchRestaurantTables(String restaurantID, String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" tablesDataType="org.eclipse.uml2.types.String" tablesMany="true" tablesOrdered="false" guestIDDataType="org.eclipse.uml2.types.String" guestIDRequired="true" guestIDOrdered="false" toRequired="true" toOrdered="false" fromRequired="true" fromOrdered="false"
	 * @generated NOT
	 */
	void makeReservation(String restaurantID, List<String> tables, String guestID, LocalDateTime to, LocalDateTime from);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" reservationIDDataType="org.eclipse.uml2.types.String" reservationIDRequired="true" reservationIDOrdered="false"
	 * @generated
	 */
	void cancelReservation(String restaurantID, String reservationID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" reservationIDDataType="org.eclipse.uml2.types.String" reservationIDRequired="true" reservationIDOrdered="false" tablesDataType="org.eclipse.uml2.types.String" tablesMany="true" tablesOrdered="false"
	 * @generated
	 */
	void changeReservedTables(String restaurantID, String reservationID, List<String> tables);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" toRequired="true" toOrdered="false" fromRequired="true" fromOrdered="false" nbrGuestsDataType="org.eclipse.uml2.types.Integer" nbrGuestsRequired="true" nbrGuestsOrdered="false"
	 * @generated NOT
	 */
	List<String> getAvailableTablesByNbrGuests(String restaurantID, LocalDateTime to, LocalDateTime from, int nbrGuests);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getRestaurantMenuItems(String restaurantID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" reservationIDDataType="org.eclipse.uml2.types.String" reservationIDRequired="true" reservationIDOrdered="false"
	 * @generated
	 */
	LocalDateTime getReservationFromTime(String restaurantID, String reservationID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" reservationIDDataType="org.eclipse.uml2.types.String" reservationIDRequired="true" reservationIDOrdered="false"
	 * @generated
	 */
	LocalDateTime getReservationToTime(String restaurantID, String reservationID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" restaurantIDDataType="org.eclipse.uml2.types.String" restaurantIDRequired="true" restaurantIDOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated NOT
	 */
	List<String> searchRestaurantReservationsWithTime(String restaurantID, String keyword, LocalDateTime from, LocalDateTime to);

} // IRestaurantsAccess
