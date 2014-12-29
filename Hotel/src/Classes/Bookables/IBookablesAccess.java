/**
 */
package Classes.Bookables;

import java.io.Serializable;
import java.util.List;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBookables Access</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Bookables.BookablesPackage#getIBookablesAccess()
 * @model interface="true" abstract="true"
 * @generated
 */
@NonNullByDefault
public interface IBookablesAccess extends Serializable {
	
	IBookablesAccess INSTANCE = Classes.Bookables.BookablesManager.INSTANCE;
	
	/**
	 * <!-- begin-user-doc --> 
	 * Requires:
	 * 		bookableID != null
	 * Ensures:
	 * 		if there dosen't exist a bookable object such as bookable.bookableID != bookableID 
	 * 			InvalidIDException is thrown
	 * 		otherwise
	 * 			returns a non null double that is the base price of the specific bookable
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" exceptions="org.eclipse.uml2.types.InvalidIDException" bookableIDDataType="org.eclipse.uml2.types.String" bookableIDRequired="true" bookableIDOrdered="false"
	 * @generated NOT
	 */
	double getBookableBasePrice(String bookableID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		roomID != null
	 * Ensures:
	 * 		if there exists a roomID such that room.roomID == roomID
	 * 			return a non null string containing information about the specific room
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" exceptions="org.eclipse.uml2.types.InvalidIDException" roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	String getRoomLocationInfo(String roomID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		bookableID != null
	 * Ensures:
	 * 		if there dosen't exist a bookable object such as bookable.bookableID == bookableID 
	 * 			InvalidIDException is thrown
	 * 		otherwise
	 * 			returns a non null double that is the description of the specific bookable
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" exceptions="org.eclipse.uml2.types.InvalidIDException" bookableIDDataType="org.eclipse.uml2.types.String" bookableIDRequired="true" bookableIDOrdered="false"
	 * @generated NOT
	 */
	String getBookableDescription(String bookableID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		nothing
	 * Ensures:
	 * 		return a non null list off all bookableIDs in string form
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllBookableIDs();

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		hostelBedID != null
	 * Ensures:
	 * 		if there exist an hostelRoomID suchs that hostelRoomID == hostelBedID and that the specific
	 * 				room is a room containing hostelbeds.
	 * 			return a non null string id of the room that the hostelbed is placed in
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" exceptions="org.eclipse.uml2.types.InvalidIDException" hostelBedIDDataType="org.eclipse.uml2.types.String" hostelBedIDRequired="true" hostelBedIDOrdered="false"
	 * @generated NOT
	 */
	String getRoomOfHostelBed(String hostelBedID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		roomID != null
	 * Ensures:
	 * 		if there exist an hotelRoomID suchs that hotelRoomID == roomID and that the specific
	 * 				room is a hotelroom.
	 * 			return a non null string id of hotel room
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" exceptions="org.eclipse.uml2.types.InvalidIDException" roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	HotelRoomCategory getHotelRoomCategory(String roomID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		roomID != null
	 * Ensures:
	 * 		if there exist an conferenceRoomID suchs that  conferenceRoomID == roomID and that the specific
	 * 				room is a conferenceRoom.
	 * 			return a non null integer of the capacity of the conference room
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	int getConferenceRoomCapacity(String roomID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		ID != null
	 * Ensures:
	 * 		if there exist an hotelRoomID suchs that hotelRoomID == ID and that the specific
	 * 				room is a hotelroom.
	 * 			return a non null integer of the number of beds in the specific hotel room
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" IDDataType="org.eclipse.uml2.types.String" IDRequired="true" IDOrdered="false"
	 * @generated NOT
	 */
	int getHotelRoomNbrBeds(String ID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchForBookable(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		ID != null
	 * Ensures:
	 * 		if there exist an hotelRoomID suchs that roomID == ID and that the specific
	 * 				room is a hotelroom.
	 * 			return a non null integer of the floor number of the specific hotel room
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	int getRoomLocationFloor(String roomID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 
	 * Ensures:
	 * 		return a non null List of strings of all the room IDs that is a HotelRoom
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllHotelRoomIDs();

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 
	 * Ensures:
	 * 		return a non null List of strings of all the room IDs that is a ConferenceRoom
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllConferenceRoomIDs();

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 
	 * Ensures:
	 * 		return a non null List of strings of all the bookable objects IDs that is a hostelbed
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllHostelBedIDs();

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		roomID != null
	 * Ensures:
	 * 		if there exist an conferenceRoomID suchs that  conferenceRoomID == roomID and that the specific
	 * 				room is a conferenceRoom.
	 * 			return a non null ConferenceRoomCategory of the specific conference room that was linked with the id
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	ConferenceRoomCategory getConferenceRoomCategory(String roomID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * NOTE: category == null implies that all categories are searched.
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchHotelRooms(String keyword, @Nullable HotelRoomCategory category);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchHostelBeds(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * NOTE: category == null implies that all categories are searched.
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchConferenceRooms(String keyword, @Nullable ConferenceRoomCategory category);

} // IBookablesAccess
