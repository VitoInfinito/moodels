/**
 */
package Classes.Guests;

import java.io.Serializable;
import java.util.List;

import org.eclipse.jdt.annotation.NonNullByDefault;

import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IGuests</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Guests.GuestsPackage#getIGuests()
 * @model interface="true" abstract="true"
 * @generated
 */
@NonNullByDefault
public interface IGuests extends Serializable {
	
	IGuests INSTANCE = Classes.Guests.GuestsManager.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllGuestIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" firstnameDataType="org.eclipse.uml2.types.String" firstnameRequired="true" firstnameOrdered="false" lastnameDataType="org.eclipse.uml2.types.String" lastnameRequired="true" lastnameOrdered="false" titleDataType="org.eclipse.uml2.types.String" titleRequired="true" titleOrdered="false" emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false" phoneDataType="org.eclipse.uml2.types.String" phoneRequired="true" phoneOrdered="false"
	 * @generated
	 */
	void addGuest(String SSID, String firstname, String lastname, String title, String email, String phone) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false"
	 * @generated
	 */
	void changeGuestFirstName(String SSID, String firstName) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	void changeGuestLastName(String SSID, String lastName) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" titleDataType="org.eclipse.uml2.types.String" titleRequired="true" titleOrdered="false"
	 * @generated
	 */
	void changeGuestTitle(String SSID, String title) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" eMailDataType="org.eclipse.uml2.types.String" eMailRequired="true" eMailOrdered="false"
	 * @generated
	 */
	void changeGuestEmail(String SSID, String eMail) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" phoneNrDataType="org.eclipse.uml2.types.String" phoneNrRequired="true" phoneNrOrdered="false"
	 * @generated
	 */
	void changeGuestPhone(String SSID, String phoneNr) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestFirstName(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestLastName(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestTitle(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestEmail(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestPhone(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchGuests(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getGuestStays(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getGuestRequests(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated
	 */
	void removeGuestStay(String SSID, String stayID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" requestIDDataType="org.eclipse.uml2.types.String" requestIDRequired="true" requestIDOrdered="false" desctiptionDataType="org.eclipse.uml2.types.String" desctiptionRequired="true" desctiptionOrdered="false"
	 * @generated
	 */
	void addGuestRequest(String SSID, String description) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" requestIDDataType="org.eclipse.uml2.types.String" requestIDRequired="true" requestIDOrdered="false"
	 * @generated
	 */
	void removeGuestRequest(String SSID, String requestID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestAccountUsername(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestAccountPassword(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	void generateGuestAccount(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	void removeGuestAccount(String SSID) throws InvalidIDException;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated NOT
	 */
	void removeGuest(String id) throws InvalidIDException;

} // IGuests
