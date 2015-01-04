/**
 */
package Classes.Customers;

import java.io.Serializable;
import java.util.List;

import org.eclipse.jdt.annotation.NonNullByDefault;

import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ICustomers</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Customers.CustomersPackage#getICustomers()
 * @model interface="true" abstract="true"
 * @generated
 */
@NonNullByDefault
public interface ICustomers extends Serializable {
	
	ICustomers INSTANCE = Classes.Customers.CustomersManager.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		nothing
	 * Ensures:
	 * 		if there exists at least 1 customer in customers
	 * 			returns a list of all customers
	 * 		otherwise
	 * 			an empty list is returned
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllCustomers();

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		nothing
	 * Ensures:
	 * 		if no customer exists with the given SSID
	 * 			adds a new customer to the list
	 * 		otherwise
	 * 			throws InvalidIDException
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" firstnameDataType="org.eclipse.uml2.types.String" firstnameRequired="true" firstnameOrdered="false" lastnameDataType="org.eclipse.uml2.types.String" lastnameRequired="true" lastnameOrdered="false" titleDataType="org.eclipse.uml2.types.String" titleRequired="true" titleOrdered="false" emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false" phoneDataType="org.eclipse.uml2.types.String" phoneRequired="true" phoneOrdered="false"
	 * @generated
	 */
	void addCustomer(String SSID, String firstname, String lastname, String title, String email, String phone) throws InvalidIDException;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		nothing
	 * Ensures:
	 * 		if a customer exists with the given SSID
	 * 			removes the customer from the list
	 * 		otherwise
	 * 			throws InvalidIDException
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" firstnameDataType="org.eclipse.uml2.types.String" firstnameRequired="true" firstnameOrdered="false" lastnameDataType="org.eclipse.uml2.types.String" lastnameRequired="true" lastnameOrdered="false" titleDataType="org.eclipse.uml2.types.String" titleRequired="true" titleOrdered="false" emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false" phoneDataType="org.eclipse.uml2.types.String" phoneRequired="true" phoneOrdered="false"
	 * @generated
	 */
	void removeCustomer(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		nothing
	 * Ensures:
	 * 		if a customer exists with the given SSID
	 * 			changes the customer's first name
	 * 		otherwise
	 * 			throws InvalidIDException
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false"
	 * @generated
	 */
	void changeCustomerFirstName(String SSID, String firstName) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		nothing
	 * Ensures:
	 * 		if a customer exists with the given SSID
	 * 			changes the customer's last name
	 * 		otherwise
	 * 			throws InvalidIDException
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	void changeCustomerLastName(String SSID, String lastName) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		nothing
	 * Ensures:
	 * 		if a customer exists with the given SSID
	 * 			changes the customer's title
	 * 		otherwise
	 * 			throws InvalidIDException
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" titleDataType="org.eclipse.uml2.types.String" titleRequired="true" titleOrdered="false"
	 * @generated
	 */
	void changeCustomerTitle(String SSID, String title) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		nothing
	 * Ensures:
	 * 		if a customer exists with the given SSID
	 * 			changes the customer's email
	 * 		otherwise
	 * 			throws InvalidIDException
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" eMailDataType="org.eclipse.uml2.types.String" eMailRequired="true" eMailOrdered="false"
	 * @generated
	 */
	void changeCustomerEmail(String SSID, String eMail) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		nothing
	 * Ensures:
	 * 		if a customer exists with the given SSID
	 * 			changes the customer's phone
	 * 		otherwise
	 * 			throws InvalidIDException
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" phoneNrDataType="org.eclipse.uml2.types.String" phoneNrRequired="true" phoneNrOrdered="false"
	 * @generated
	 */
	void changeCustomerPhone(String SSID, String phoneNr) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		SSID != null
	 * Ensures:
	 * 		if there exists an customer such that customer.SSID == SSID
	 * 			the non null firstName of customer is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getCustomerFirstName(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		SSID != null
	 * Ensures:
	 * 		if there exists an customer such that customer.SSID == SSID
	 * 			the non null lastName of customer is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getCustomerLastName(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		SSID != null
	 * Ensures:
	 * 		if there exists an customer such that customer.SSID == SSID
	 * 			the non null title of customer is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getCustomerTitle(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		SSID != null
	 * Ensures:
	 * 		if there exists an customer such that customer.SSID == SSID
	 * 			the non null email of customer is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getCustomerEmail(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		SSID != null
	 * Ensures:
	 * 		if there exists an customer such that customer.SSID == SSID
	 * 			the non null phone of customer is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated
	 */
	String getCustomerPhone(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		keyword != null
	 * Ensures:
	 * 	 	returns a non-null list of all customer ids matching something in the following order:
	 * 			1. Accounts with id that exactly matches the keyword
	 * 			2. Accounts with id that has some matching to the keyword
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchCustomers(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		nothing
	 * Ensures:
	 * 	 	A non null list of all customer bookings is returned.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getCustomerBookings(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		nothing
	 * Ensures:
	 * 	 	A non null list of all customer requests is returned.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getCustomerRequests(String SSID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		SSID != null && bookingsID != null
	 * Ensures:
	 * 		if there exists a booking such that customer.bookingID == bookingID
	 * 			InvalidIDException is thrown.
	 * 		otherwise
	 * 			a booking is added where customer.SSID == SSID && customer.bookingID == bookingID
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	void addCustomerBooking(String SSID, String bookingID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		SSID != null && bookingID != null
	 * Ensures:
	 * 		if there exists a customer such that customer.SSID == SSID && customer.bookingID == bookingID
	 * 			booking is removed.
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	void removeCustomerBooking(String SSID, String bookingID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		SSID != null && description != null
	 * Ensures:
	 * 		if there exists a customer such that customer.SSID == SSID
	 * 			a request is added where customer.SSID == SSID && customer.request.decription == description
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" requestIDDataType="org.eclipse.uml2.types.String" requestIDRequired="true" requestIDOrdered="false"
	 * @generated
	 */
	void addCustomerRequest(String SSID, String description) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		SSID != null && requestID != null
	 * Ensures:
	 * 		if there exists a customer such that customer.SSID == SSID && customer.requestID == requestIDD
	 * 			request is removed.
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model SSIDDataType="org.eclipse.uml2.types.String" SSIDRequired="true" SSIDOrdered="false" requestIDDataType="org.eclipse.uml2.types.String" requestIDRequired="true" requestIDOrdered="false"
	 * @generated
	 */
	void removeCustomerRequest(String SSID, String requestID) throws InvalidIDException;

} // ICustomers
