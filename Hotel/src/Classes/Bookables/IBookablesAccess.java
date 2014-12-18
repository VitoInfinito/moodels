/**
 */
package Classes.Bookables;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

import Classes.InvalidIDException;

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
public interface IBookablesAccess extends EObject {
	
	IBookablesAccess INSTANCE = Classes.Bookables.impl.BookablesManagerImpl.INSTANCE;
	
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
	 * 
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" exceptions="org.eclipse.uml2.types.InvalidIDException" hostelBedIDDataType="org.eclipse.uml2.types.String" hostelBedIDRequired="true" hostelBedIDOrdered="false"
	 * @generated NOT
	 */
	String getRoomOfHostelBed(String hostelBedID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" exceptions="org.eclipse.uml2.types.InvalidIDException" roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	HotelRoomCategory getHotelRoomCategory(String roomID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	int getConferenceRoomCapacity(String roomID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
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
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	int getRoomLocationFloor(String roomID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllHotelRoomIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllConferenceRoomIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllHostelBedIDs();

	/**
	 * <!-- begin-user-doc -->
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
