/**
 */
package Classes.Bookables;

import org.eclipse.jdt.annotation.NonNullByDefault;

import Classes.Utils.InvalidIDException;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBookables Manage</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Bookables.BookablesPackage#getIBookablesManage()
 * @model interface="true" abstract="true"
 * @generated
 */
@NonNullByDefault
public interface IBookablesManage extends IBookablesAccess {
	
	IBookablesManage INSTANCE = Classes.Bookables.BookablesManager.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model hostelBedIDDataType="org.eclipse.uml2.types.String" hostelBedIDRequired="true" hostelBedIDOrdered="false" roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	void changeHostelBedRoom(String hostelBedID, String roomID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookableIDDataType="org.eclipse.uml2.types.String" bookableIDRequired="true" bookableIDOrdered="false"
	 * @generated NOT
	 */
	void deleteBookable(String bookableID) throws InvalidIDException ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false" floorDataType="org.eclipse.uml2.types.Integer" floorRequired="true" floorOrdered="false" additionalInfoDataType="org.eclipse.uml2.types.String" additionalInfoRequired="true" additionalInfoOrdered="false"
	 * @generated NOT
	 */
	void changeRoomLocation(String roomID, int floor, String additionalInfo) throws InvalidIDException ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false" categoryRequired="true" categoryOrdered="false"
	 * @generated NOT
	 */
	void changeHotelRoomCategory(String roomID, HotelRoomCategory category) throws InvalidIDException ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false" categoryRequired="true" categoryOrdered="false"
	 * @generated NOT
	 */
	void changeConferenceRoomCategory(String roomID, ConferenceRoomCategory category) throws InvalidIDException ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookableIDDataType="org.eclipse.uml2.types.String" bookableIDRequired="true" bookableIDOrdered="false" basePriceRequired="true" basePriceOrdered="false"
	 * @generated NOT
	 */
	void changeBookableBasePrice(String bookableID, double basePrice) throws InvalidIDException, IllegalArgumentException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookableIDDataType="org.eclipse.uml2.types.String" bookableIDRequired="true" bookableIDOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated NOT
	 */
	void changeBookableDescription(String bookableID, String description) throws InvalidIDException ;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" roomNumberDataType="org.eclipse.uml2.types.String" roomNumberRequired="true" roomNumberOrdered="false" basePriceRequired="true" basePriceOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false" floorDataType="org.eclipse.uml2.types.Integer" floorRequired="true" floorOrdered="false" locationInfoDataType="org.eclipse.uml2.types.String" locationInfoRequired="true" locationInfoOrdered="false" categoryRequired="true" categoryOrdered="false" nbrBedsDataType="org.eclipse.uml2.types.Integer" nbrBedsRequired="true" nbrBedsOrdered="false"
	 * @generated NOT
	 */
	String addHotelRoom(String roomNumber, double basePrice, String description, int floor, String locationInfo, HotelRoomCategory category, int nbrBeds) throws InvalidIDException, IllegalArgumentException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" bedNumberDataType="org.eclipse.uml2.types.String" bedNumberRequired="true" bedNumberOrdered="false" basePriceRequired="true" basePriceOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false" roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false"
	 * @generated NOT
	 */
	String addHostelBed(String bedNumber, double basePrice, String description, String roomID) throws InvalidIDException, IllegalArgumentException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" roomNumberDataType="org.eclipse.uml2.types.String" roomNumberRequired="true" roomNumberOrdered="false" basePriceRequired="true" basePriceOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false" floorDataType="org.eclipse.uml2.types.Integer" floorRequired="true" floorOrdered="false" locationInfoDataType="org.eclipse.uml2.types.String" locationInfoRequired="true" locationInfoOrdered="false" categoryRequired="true" categoryOrdered="false" capacityDataType="org.eclipse.uml2.types.Integer" capacityRequired="true" capacityOrdered="false"
	 * @generated NOT
	 */
	String addConferenceRoom(String roomNumber, double basePrice, String description, int floor, String locationInfo, ConferenceRoomCategory category, int capacity) throws InvalidIDException, IllegalArgumentException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false" nbrBedsDataType="org.eclipse.uml2.types.Integer" nbrBedsRequired="true" nbrBedsOrdered="false"
	 * @generated NOT
	 */
	void changeHotelRoomNumberBeds(String roomID, int nbrBeds) throws InvalidIDException, IllegalArgumentException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false" capacityDataType="org.eclipse.uml2.types.Integer" capacityRequired="true" capacityOrdered="false"
	 * @generated NOT
	 */
	void changeConferenceRoomCapacity(String roomID, int capacity) throws InvalidIDException, IllegalArgumentException;

} // IBookablesManage
