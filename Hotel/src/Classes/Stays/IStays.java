/**
 */
package Classes.Stays;

import java.util.Date;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IStays</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Stays.StaysPackage#getIStays()
 * @model interface="true" abstract="true"
 * @generated
 */
@NonNullByDefault
public interface IStays extends EObject {
	
	IStays INSTANCE = Classes.Stays.impl.StaysManagerImpl.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false" guestIDDataType="org.eclipse.uml2.types.String" guestIDRequired="true" guestIDOrdered="false"
	 * @generated
	 */
	void checkInGuest(String stayID, String guestID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false" bookableIDDataType="org.eclipse.uml2.types.String" bookableIDRequired="true" bookableIDOrdered="false"
	 * @generated
	 */
	void changeBookableOfStay(String stayID, String bookableID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookableIDDataType="org.eclipse.uml2.types.String" bookableIDRequired="true" bookableIDOrdered="false" bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" fromDateRequired="true" fromDateOrdered="false" toDateRequired="true" toDateOrdered="false"
	 * @generated
	 */
	void addNewStay(String bookableID, String bookingID, Date fromDate, Date toDate);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated
	 */
	void removeStay(String stayID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	void addBillToStay(String stayID, String billID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false" guestIDDataType="org.eclipse.uml2.types.String" guestIDRequired="true" guestIDOrdered="false"
	 * @generated
	 */
	void checkOutGuest(String stayID, String guestID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws SOAPException 
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated NOT
	 */
	void addResponsibleCreditCard(String stayID, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) throws SOAPException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws SOAPException 
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated NOT
	 */
	void changeResponsibleCreditCard(String stayID, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) throws SOAPException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getGuestsOfHotelStay(String stayID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getBillsOfHotelStay(String stayID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated
	 */
	String getBookableOfHotelStay(String stayID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated
	 */
	String getBookingOfHotelStay(String stayID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllHotelStayIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getCheckedInGuestsOfHotelStay(String stayID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getCheckedOutGuestsOfHotelStay(String stayID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	EList<String> searchHotelStays(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	EList<String> searchHotelStaysWithinPeriod(String keyword, Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	EList<String> getAllHotelStaysWithinPeriod(Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getAllUnpayedBillsOfHotelStay(String stayID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated
	 */
	void billCreditCardWithAllUnpaidBillsOfHotelStay(String stayID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated
	 */
	boolean isResponsibleCreditCardAdded(String stayID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	void changePeriodOfStay(String stayID, Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	void removeBillFromStay(String stayID, String billID);

} // IStays
