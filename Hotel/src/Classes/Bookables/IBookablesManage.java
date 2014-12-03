/**
 */
package Classes.Bookables;


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
public interface IBookablesManage extends IBookablesAccess {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model basePriceRequired="true" basePriceOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void addBookable(double basePrice, String description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model hostelBedIDDataType="org.eclipse.uml2.types.String" hostelBedIDRequired="true" hostelBedIDOrdered="false" roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false"
	 * @generated
	 */
	void changeRoomOfHostelBed(String hostelBedID, String roomID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookableIDDataType="org.eclipse.uml2.types.String" bookableIDRequired="true" bookableIDOrdered="false"
	 * @generated
	 */
	void deleteBookable(String bookableID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false" floorDataType="org.eclipse.uml2.types.Integer" floorRequired="true" floorOrdered="false" additionalInfoDataType="org.eclipse.uml2.types.String" additionalInfoRequired="true" additionalInfoOrdered="false"
	 * @generated
	 */
	void changeRoomLocation(String roomID, int floor, String additionalInfo);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false" categoryRequired="true" categoryOrdered="false"
	 * @generated
	 */
	void changeHotelRoomCategory(String roomID, HotelRoomCategory category);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model roomIDDataType="org.eclipse.uml2.types.String" roomIDRequired="true" roomIDOrdered="false" categoryRequired="true" categoryOrdered="false"
	 * @generated
	 */
	void changeConferenceRoomCategory(String roomID, ConferenceRoomCategory category);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookableIDDataType="org.eclipse.uml2.types.String" bookableIDRequired="true" bookableIDOrdered="false" basePriceRequired="true" basePriceOrdered="false"
	 * @generated
	 */
	void changeBasePrice(String bookableID, double basePrice);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookableIDDataType="org.eclipse.uml2.types.String" bookableIDRequired="true" bookableIDOrdered="false" descriptionDataType="org.eclipse.uml2.types.String" descriptionRequired="true" descriptionOrdered="false"
	 * @generated
	 */
	void changeDescription(String bookableID, String description);

} // IBookablesManage
