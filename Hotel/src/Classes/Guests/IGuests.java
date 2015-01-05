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
	 * Requires:
	 * 		nothing
	 * Ensures:
	 * 	 	A non null list of all guest id's is returned.
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllGuestIDs();

	/**
	 * <!-- begin-user-doc -->
	 * 		SSID != null && firstname != null && lastname != null && title != null && email != null && phone != null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 			InvalidIDException is thrown.
	 * 		otherwise
	 * 			a guest is added where guest.SSID == SSID && guest.firstname == firstname && guest.lastname = lastname &&
	 * 			guest.title = title && guest.email == email && guest.phone == phone
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" firstnameDataType="org.eclipse.uml2.types.String" firstnameRequired="true" firstnameOrdered="false" lastnameDataType="org.eclipse.uml2.types.String" lastnameRequired="true" lastnameOrdered="false" titleDataType="org.eclipse.uml2.types.String" titleRequired="true" titleOrdered="false" emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false" phoneDataType="org.eclipse.uml2.types.String" phoneRequired="true" phoneOrdered="false"
	 * @generated
	 */
	void addGuest(String SSID, String firstname, String lastname, String title, String email, String phone) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		SSID != null && firstname == null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 			guest.firstname == firstname
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false"
	 * @generated
	 */
	void changeGuestFirstName(String SSID, String firstName) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * 		SSID != null && lastname == null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 			guest.lastname == lastname
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	void changeGuestLastName(String SSID, String lastName) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * 		SSID != null && title == null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 			guest.title == title
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" titleDataType="org.eclipse.uml2.types.String" titleRequired="true" titleOrdered="false"
	 * @generated
	 */
	void changeGuestTitle(String SSID, String title) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * 		SSID != null && email == null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 			guest.email == email
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" eMailDataType="org.eclipse.uml2.types.String" eMailRequired="true" eMailOrdered="false"
	 * @generated
	 */
	void changeGuestEmail(String SSID, String eMail) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * 		SSID != null && phone == null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 			guest.phone == phone
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" phoneNrDataType="org.eclipse.uml2.types.String" phoneNrRequired="true" phoneNrOrdered="false"
	 * @generated
	 */
	void changeGuestPhone(String SSID, String phoneNr) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		SSID != null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 			non null guest.firstname is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestFirstName(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * 		SSID != null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 			non null guest.lastname is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestLastName(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * 		SSID != null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 			non null guest.title is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestTitle(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * 		SSID != null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 			non null guest.email is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestEmail(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * 		SSID != null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 			non null guest.phone is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestPhone(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		keyword != null
	 * Ensures:
	 * 	 	returns a non-null list of all guests matching something in the following order:
	 * 			1. Guests with id that exactly matches the keyword
	 * 			2. Guests with id that has some matching to the keyword
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchGuests(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		SSID != null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 	 		A non null list of all guest stays is returned.
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getGuestStays(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires
	 * 		SSID != null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 	 		A non null list of all guest requests is returned.
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getGuestRequests(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		SSID != null && stayID != null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID && guest.stayID == stayID
	 * 			stay is removed.
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated
	 */
	void removeGuestStay(String SSID, String stayID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		SSID != null && requestID != null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 			a request is added where guest.requestID == requestID
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" requestIDDataType="org.eclipse.uml2.types.String" requestIDRequired="true" requestIDOrdered="false" desctiptionDataType="org.eclipse.uml2.types.String" desctiptionRequired="true" desctiptionOrdered="false"
	 * @generated NOT
	 */
	void addGuestRequest(String SSID, String requestID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		SSID != null && requestID != null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID && guest.requestID == requestID
	 * 			request is removed.
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" requestIDDataType="org.eclipse.uml2.types.String" requestIDRequired="true" requestIDOrdered="false"
	 * @generated
	 */
	void removeGuestRequest(String SSID, String requestID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires
	 * 		SSID != null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 			non null guest.accountusername is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestAccountUsername(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires
	 * 		SSID != null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 			non null guest.accountupassword is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestAccountPassword(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires
	 * 		SSID != null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 			a guest with guest.SSID == SSID and a generated 6-character password is created
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	void generateGuestAccount(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * 		SSID != null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 			guest.account is removed.
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	void removeGuestAccount(String SSID) throws InvalidIDException;
	
	/**
	 * <!-- begin-user-doc -->
	 * 		SSID != null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 			guest is removed.
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated NOT
	 */
	void removeGuest(String id) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		SSID != null && stayID != null
	 * Ensures:
	 * 		if there exists a guest such that guest.SSID == SSID
	 * 			a request is added where guest.stayID == stayID
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated NOT
	 */
	void addGuestStay(String guestID, String stayID);

} // IGuests
