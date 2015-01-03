/**
 */
package Classes.Stays;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.eclipse.jdt.annotation.NonNullByDefault;

import Classes.Utils.GuestAlreadyCheckedInException;
import Classes.Utils.GuestAlreadyCheckedOutException;
import Classes.Utils.GuestNotCheckedInException;
import Classes.Utils.InsufficientFundsException;
import Classes.Utils.InvalidCheckInDateException;
import Classes.Utils.InvalidCreditCardException;
import Classes.Utils.InvalidIDException;
import Classes.Utils.ResponsibleCreditCardNotAddedException;
import Classes.Utils.StayAlreadyFullyCheckedInException;

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
public interface IStays extends Serializable {
	
	IStays INSTANCE = Classes.Stays.StaysManager.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		stayID != null && guestID != null
	 * Ensures:
	 * 		if there exists a stay such that stay.id == stayID && there exists a guest such that guest.id == guestID
	 * 			Guest is checked in to the stay
	 * 		else if there exists a stay such that stay.id == stayID && there does not exist a guest such that guest.id == guestID
	 * 			InvalidIDException is received
	 * 		else if there does not exist a stay such that stay.id == stayID
	 * 			InvalidIDException is received
	 * 		else if a responsible credit card is not added
	 * 			ResponsibleCreditCardNotAddedException is received
	 * 		else if the guest is already checked in to the stay
	 * 			GuestAlreadyCheckedInException is received
	 * 		else if the guest is already checked out of the stay
	 * 			GuestAlreadyCheckedOutException is received
	 * 		else if the guest tried to check in before the check in time
	 * 			InvalidCheckInDateException is received
	 * 		else if the guest tried to check in after the check out time
	 * 			InvalidCheckInDateException is received
	 * 		else if the amount of checked in guests are already at capacity
	 * 			StayAlreadyFullyCheckedInException is received
	 * <!-- end-user-doc -->
	 * @throws ResponsibleCreditCardNotAddedException 
	 * @throws InvalidIDException 
	 * @throws GuestAlreadyCheckedInException 
	 * @throws StayAlreadyFullyCheckedInException 
	 * @throws InvalidCheckInDateException 
	 * @throws GuestAlreadyCheckedOutException 
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false" guestIDDataType="org.eclipse.uml2.types.String" guestIDRequired="true" guestIDOrdered="false"
	 * @generated NOT
	 */
	void checkInGuest(String stayID, String guestID) throws ResponsibleCreditCardNotAddedException, InvalidIDException, GuestAlreadyCheckedInException, StayAlreadyFullyCheckedInException, InvalidCheckInDateException, GuestAlreadyCheckedOutException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		stayID != null && bookableID != null
	 * Ensures:
	 * 		if there exists a stay such that stay.id == stayID && there exists a bookable with bookable.id == bookableID
	 * 			The bookableID is set as the bookable belonging to the stay
	 * 		else if there exists a stay such that stay.id == stayID && there does not exist a bookable such that bookable.id == bookableID
	 * 			InvalidIDException is received
	 * 		else if there does not exist a stay such that stay.id == stayID
	 * 			InvalidIDException is received
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false" bookableIDDataType="org.eclipse.uml2.types.String" bookableIDRequired="true" bookableIDOrdered="false"
	 * @generated NOT
	 */
	void changeBookableOfStay(String stayID, String bookableID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		bookableID != null && bookingID != null && fromDate != null && toDate != null && time of from < time of to
	 * Ensures:
	 * 		if there exists a bookable such that bookable.id == bookableID && there exists a booking such that booking.id == bookingID
	 * 			A new stay is added with the bookable belonging to bookableID 
	 * 			and the booking belonging to bookingID with the dates fromDate 
	 * 			as stay.fromDate and toDate as stay.toDate && the generated stayID is returned
	 * 		else if there exists a bookable such that bookable.id == bookableID && there does not exist a booking such that booking.id == bookingID
	 * 			InvalidIDException is received
	 * 		else if there does not exist a bookable such that bookable.id == bookableID
	 * 			InvalidIDException is received
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException
	 * @return The ID of the added Stay
	 * @model bookableIDDataType="org.eclipse.uml2.types.String" bookableIDRequired="true" bookableIDOrdered="false" bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" fromDateRequired="true" fromDateOrdered="false" toDateRequired="true" toDateOrdered="false"
	 * @generated NOT
	 */
	String addNewStay(String bookableID, String bookingID, LocalDateTime fromDate, LocalDateTime toDate);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		stayID != null
	 * Ensures:
	 * 		if there exists a stay such that stay.id == stayID
	 * 			The stay is removed from the map of stays
	 * 		otherwise
	 * 			InvalidIDException is received
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated NOT
	 */
	void removeStay(String stayID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		stayID != null && billID != null
	 * Ensures:
	 * 		if there exists a stay such that stay.id == stayID && there exists a bill such that bill.id == billID
	 * 			The bill is added to the stay
	 * 		else if there exists a stay such that stay.id == stayID && there does not exist a bill such that bill.id == billID
	 * 			InvalidIDException is received
	 * 		else if there does not exist a stay such that stay.id == stayID
	 * 			InvalidIDException is received
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated NOT
	 */
	void addBillToStay(String stayID, String billID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		stayID != null && guestID != null
	 * Ensures:
	 * 		if there exists a stay such that stay.id == stayID && there exists a guest in that stay such that guest.id == guestID
	 * 			The guest is checked out of the stay
	 * 		else if there exists a stay such that stay.id == stayID && there does not exist a guest in that stay such that guest.id == guestID
	 * 			InvalidIDException is received
	 * 		else if there does not exist a stay such that stay.id == stayID
	 *			InvalidIDException is received
	 *		else if guest is already checked out
	 *			GuestAlreadyCheckedOutException is received
	 *		else if guest is not checked in yet
	 *			GuestNotCheckedInException is received
	 *		else if all bills have not been paid
	 *			InsufficientFundsException is received
	 * <!-- end-user-doc -->
	 * @throws GuestNotCheckedInException 
	 * @throws GuestAlreadyCheckedOutException 
	 * @throws InvalidIDException 
	 * @throws InsufficientFundsException 
	 * @throws InvalidCreditCardException 
	 * @throws SOAPException 
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false" guestIDDataType="org.eclipse.uml2.types.String" guestIDRequired="true" guestIDOrdered="false"
	 * @generated NOT
	 */
	void checkOutGuest(String stayID, String guestID) throws InvalidIDException, GuestNotCheckedInException, GuestAlreadyCheckedOutException, SOAPException, InvalidCreditCardException, InsufficientFundsException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		stayID != null && ccNumber != null && ccv != null && expiryMonth != null && expiryYear != null && firstName != null && lastName != null
	 * Ensures:
	 * 		if there does not exist a connection to the bank
	 * 			SOAPException
	 * 		else if there exists a stay such that stay.id == stayID && ccNumber, ccv, expiryMonth, expiryYear, firstName and lastName are all belonging to the same valid creditcard
	 * 			The creditcard is added with its information is added to the stay
	 * 		else if there does not exist a stay such that stay.id == stayID
	 * 			InvalidIDException is received
	 * 		else if there does exist a stay such that stay.id == stayID && the information ccNumber, ccv, expiryDate, expiryMonth, firstName and Lastname does not belong to valid creditcard
	 * 			InvalidCreditCardException
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException, InvalidCreditCardException, SOAPException
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated NOT
	 */
	void addResponsibleCreditCard(String stayID, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) throws SOAPException, InvalidCreditCardException, InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		stayID != null && ccNumber != null && ccv != null && expiryMonth != null && expiryYear != null && firstName != null && lastName != null
	 * Ensures:
	 * 		if there does not exist a connection to the bank
	 * 			SOAPException
	 * 		else if there exists a stay such that stay.id == stayID && ccNumber, ccv, expiryMonth, expiryYear, firstName and lastName are all belonging to the same valid creditcard
	 * 			The creditcard belonging to the stay is changed with its information
	 * 		else if there does not exist a stay such that stay.id == stayID
	 * 			InvalidIDException is received
	 * 		else if there does exist a stay such that stay.id == stayID && the information ccNumber, ccv, expiryDate, expiryMonth, firstName and Lastname does not belong to  valid creditcard
	 * 			InvalidCreditCardException
	 * <!-- end-user-doc -->
	 * @throws SOAPException, InvalidCreditCardException, InvalidIDException
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated NOT
	 */
	void changeResponsibleCreditCard(String stayID, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) throws SOAPException, InvalidCreditCardException, InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		stayID != null
	 * Ensures:
	 * 		if there exists a stay such that stay.id == stayID
	 * 			returns the guests belonging to the stay
	 * 		otherwise
	 * 			InvalidIDException is received
	 * <!-- end-user-doc -->
	 * @return List of guests belonging to stay
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getGuestsOfHotelStay(String stayID);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		stayID != null
	 * Ensures:
	 * 		if there exists a stay such that stay.id == stayID
	 * 			returns the bills belonging to the stay
	 * 		otherwise
	 * 			InvalidIDException is received
	 * <!-- end-user-doc -->
	 * @return List of bills belonging to stay
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getBillsOfHotelStay(String stayID);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		stayID != null
	 * Ensures:
	 * 		if there exists a stay such that stay.id == stayID
	 * 			returns the bookables belonging to the stay
	 * 		otherwise
	 * 			InvalidIDException is received
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @return ID of bookable belonging to stay
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated NOT
	 */
	String getBookableOfHotelStay(String stayID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		stayID != null
	 * Ensures:
	 * 		if there exists a stay such that stay.id == stayID
	 * 			returns the booking belonging to the stay
	 * 		otherwise
	 * 			InvalidIDException is received
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @return ID of booking belonging to stay
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated NOT
	 */
	String getBookingOfHotelStay(String stayID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		Nothing
	 * Ensures:
	 * 		returns a non-null list with all the stays
	 * <!-- end-user-doc -->
	 * @return List of all stays
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllHotelStayIDs();

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		stayID != null
	 * Ensures:
	 * 		if there exists a stay such that stay.id == stayID
	 * 			returns a non-null list with all checked in guests belonging to the stay
	 * 		otherwise
	 * 			InvalidIDException is received
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException
	 * @return List of all checked in guests belonging to stay
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getCheckedInGuestsOfHotelStay(String stayID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		stayID != null
	 * Ensures:
	 * 		if there exists a stay such that stay.id == stayID
	 * 			returns a non-null list with all checked out guests belonging to the stay
	 * 		otherwise
	 * 			InvalidIDException is received
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @return List of all checked out guests belonging to stay
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getCheckedOutGuestsOfHotelStay(String stayID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		keyword != null
	 * Ensures:
	 * 		returns a non-null list of all stays matching something in the following order:
	 * 			1. Stays with id that exactly matches the keyword
	 * 			2. Stays with id that has some matching to the keyword
	 * 			3. Stays with attributes that exactly matches the keyword
	 * 			4. Stays with attributes that has some matching to the keyword
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException
	 * @return List of stays matching or somewhat matching the keyword
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchHotelStays(String keyword) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		keyword != null && from != null &&  to != null && time of from < time of to
	 * Ensures:
	 * 		returns a non-null list of all stays within the time period of from to to matching something in the following order:
	 * 			1. Stays with exact matches to keyword
	 * 			2. Stays with some matching to the keyword
	 * 			3. Stays with attributes that exactly matches the keyword
	 * 			4. Stays with attributes that has some matching to the keyword
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @return List of stays matching or somewhat matching the keyword
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated NOT
	 */
	List<String> searchHotelStaysWithinPeriod(String keyword, LocalDateTime from, LocalDateTime to) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		from != null && to != null && time of from < time of to
	 * Ensures:
	 * 		returns a non-null list of all stays within the time period of from to to
	 * <!-- end-user-doc -->
	 * @return List of all stays within time period
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated NOT
	 */
	List<String> getAllHotelStaysWithinPeriod(LocalDateTime from, LocalDateTime to);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		stayID != null
	 * Ensures:
	 * 		if there exists a stay such that stay.id == stayID
	 * 			returns a non-null list with all unpayed bills belongin to the stay
	 * 		otherwise
	 * 			InvalidIDException
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @return List of all unpaid bills belonging to stay
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getAllUnpayedBillsOfHotelStay(String stayID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		stayID != null
	 * Ensures:
	 * 		if there does not exist a connection to the bank
	 * 			SOAPException
	 * 		else if there exists a stay such that stay.id == stayID && the stay has a creditcard
	 * 			The credit card is billed and the bills are set as payed
	 * 		else if there exists a stay such that stay.id == stayID && the stay does not have a creditcard
	 * 			InvalidCreditCardException
	 * 		else if there does not exist a stay such that stay.id == stayID
	 * 			InvalidIDException is received
	 * <!-- end-user-doc -->
	 * @throws SOAPException, InvalidCreditCardException, InsufficientFundsException 
	 * @throws InvalidIDException 
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated NOT
	 */
	void billCreditCardWithAllUnpaidBillsOfHotelStay(String stayID) throws SOAPException, InvalidCreditCardException, InsufficientFundsException, InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		stayID != null
	 * Ensures:
	 * 		if there exists a stay such that stay.id == stayID && that stay has a creditcard
	 * 			return true
	 * 		else if there exists a stay such that stay.id == stayID && that stay does not have a creditcard
	 * 			return false
	 * 		else if there does not exist a stay such that stay.id == stayID
	 * 			InvalidIDException is received
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @return boolean of whether or not a creditcard has been set as responsible for the stay
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated NOT
	 */
	boolean isResponsibleCreditCardAdded(String stayID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		stayID != null && from != null && to != null && time of from < time of to
	 * Ensures:
	 * 		if there exists a stay such that stay.id == stayID
	 * 			Changes the time period of the stay to be between from and to
	 * 		otherwise
	 * 			InvalidIDException is received
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated NOT
	 */
	void changePeriodOfStay(String stayID, LocalDateTime from, LocalDateTime to) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		stayID != null && billID != null
	 * Ensures:
	 * 		if there exists a stay such that stay.id == stayID && there exists a bill such that bill.id == billID
	 * 			The bill is removed from the stay
	 * 		else if there exists a stay such that stay.id == stayID && there does not exist a bill such that bill.id == billID
	 * 			InvalidIDException is received
	 * 		else if there does not exist a stay such that stay.id == stayID
	 * 			InvalidIDException is received
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated NOT
	 */
	void removeBillFromStay(String stayID, String billID) throws InvalidIDException;

} // IStays
