/**
 */
package Classes.Guests;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNullByDefault;

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
public interface IGuests extends EObject {
	
	IGuests INSTANCE = Classes.Guests.impl.GuestsManagerImpl.INSTANCE;
	
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
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" firstnameDataType="org.eclipse.uml2.types.String" firstnameRequired="true" firstnameOrdered="false" lastnameDataType="org.eclipse.uml2.types.String" lastnameRequired="true" lastnameOrdered="false" titleDataType="org.eclipse.uml2.types.String" titleRequired="true" titleOrdered="false" emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false" phoneDataType="org.eclipse.uml2.types.String" phoneRequired="true" phoneOrdered="false"
	 * @generated
	 */
	void addGuest(String SSID, String firstname, String lastname, String title, String email, String phone);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false"
	 * @generated
	 */
	void changeGuestFirstName(String SSID, String firstName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	void changeGuestLastName(String SSID, String lastName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" titleDataType="org.eclipse.uml2.types.String" titleRequired="true" titleOrdered="false"
	 * @generated
	 */
	void changeGuestTitle(String SSID, String title);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" eMailDataType="org.eclipse.uml2.types.String" eMailRequired="true" eMailOrdered="false"
	 * @generated
	 */
	void changeGuestEmail(String SSID, String eMail);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" phoneNrDataType="org.eclipse.uml2.types.String" phoneNrRequired="true" phoneNrOrdered="false"
	 * @generated
	 */
	void changeGuestPhone(String SSID, String phoneNr);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestFirstName(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestLastName(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestTitle(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestEmail(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestPhone(String SSID);

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
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getGuestStays(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getGuestRequests(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated
	 */
	void removeGuestStay(String SSID, String stayID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" requestIDDataType="org.eclipse.uml2.types.String" requestIDRequired="true" requestIDOrdered="false" desctiptionDataType="org.eclipse.uml2.types.String" desctiptionRequired="true" desctiptionOrdered="false"
	 * @generated
	 */
	void addGuestRequest(String SSID, String requestID, String desctiption);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" requestIDDataType="org.eclipse.uml2.types.String" requestIDRequired="true" requestIDOrdered="false"
	 * @generated
	 */
	void removeGuestRequest(String SSID, String requestID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestAccountUsername(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getGuestAccountPassword(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	void generateGuestAccount(String SSID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	void removeGuestAccount(String SSID);

} // IGuests
