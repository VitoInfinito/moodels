/**
 */
package Classes.Bookings;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.eclipse.jdt.annotation.NonNullByDefault;

import Classes.Bookables.ConferenceRoomCategory;
import Classes.Bookables.HotelRoomCategory;
import Classes.Utils.InsufficientFundsException;
import Classes.Utils.InvalidCreditCardException;
import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBookings</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Bookings.BookingsPackage#getIBookings()
 * @model interface="true" abstract="true"
 * @generated
 */
@NonNullByDefault
public interface IBookings extends Serializable {
	
	IBookings INSTANCE = Classes.Bookings.BookingsManager.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws SOAPException 
	 * @throws IllegalArgumentException 
	 * @throws InvalidIDException 
	 * @throws InvalidCreditCardException 
	 * @model bookablesDataType="org.eclipse.uml2.types.String" bookablesMany="true" bookablesOrdered="false" customerIDDataType="org.eclipse.uml2.types.String" customerIDRequired="true" customerIDOrdered="false" guestsDataType="org.eclipse.uml2.types.String" guestsMany="true" guestsOrdered="false" requestsDataType="org.eclipse.uml2.types.String" requestsMany="true" requestsOrdered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	String makeBooking(List<String> bookables, String customerID, LocalDateTime from, LocalDateTime to, int nbrGuests, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName, double discountFactor, boolean isResponsibleCreditCard) throws SOAPException, InvalidIDException, IllegalArgumentException, InvalidCreditCardException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @throws NumberFormatException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	List<String> searchBookings(String keyword) throws NumberFormatException, InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	List<String> getBookedStaysOfBooking(String bookingID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	String getCustomerOfBooking(String bookingID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	int getNbrGuestOfBooking(String bookingID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	void cancelBooking(String bookingID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated
	 */
	void cancelStayOfBooking(String bookingID, String stayID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated
	 */
	void addBookedStayToBooking(String bookingID, String bookableID, LocalDateTime from, LocalDateTime to, double discount) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" nbrGuestsDataType="org.eclipse.uml2.types.Integer" nbrGuestsRequired="true" nbrGuestsOrdered="false"
	 * @generated
	 */
	void changeNbrGuestsOfBooking(String bookingID, int nbrGuests) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllBookings();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	List<String> getAllBookingsWithinPeriod(LocalDateTime from, LocalDateTime to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	List<String> getAllBookingsWithStaysInPeriod(LocalDateTime from, LocalDateTime to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @throws NumberFormatException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	List<String> searchBookingsMadeInPeriod(String keyword, LocalDateTime from, LocalDateTime to) throws NumberFormatException, InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @throws NumberFormatException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	List<String> searchBookingsWithStaysInPeriod(String keyword, LocalDateTime from, LocalDateTime to) throws NumberFormatException, InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	List<String> searchForAvailableBookablesInPeriod(LocalDateTime from, LocalDateTime to, String keyword) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	List<String> getAvailableBookablesInPeriod(LocalDateTime from, LocalDateTime to) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" requestIDDataType="org.eclipse.uml2.types.String" requestIDRequired="true" requestIDOrdered="false"
	 * @generated
	 */
	void addBookingRequest(String bookingID, String description) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" requestIDDataType="org.eclipse.uml2.types.String" requestIDRequired="true" requestIDOrdered="false"
	 * @generated
	 */
	void removeBookingRequest(String bookingID, String requestID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getBookingRequests(String bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws SOAPException 
	 * @throws InvalidIDException 
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	void payBookingBills(String bookingID) throws SOAPException, InvalidCreditCardException, InsufficientFundsException, InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws SOAPException, InvalidCreditCardException, InsufficientFundsException 
	 * @throws InvalidIDException 
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated
	 */
	void payStayBills(String bookingID, String stayID) throws SOAPException, InvalidCreditCardException, InsufficientFundsException, InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	List<String> searchForAvailableHotelRoomsInPeriod(LocalDateTime from, LocalDateTime to, String keyword, HotelRoomCategory categor) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	List<String> searchForAvailableHostelBedsInPeriod(LocalDateTime from, LocalDateTime to, String keyword) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	List<String> searchForAvailableConferenceRoomsInPeriod(LocalDateTime from, LocalDateTime to, String keyword, ConferenceRoomCategory categor) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	List<String> getAvailableHotelRoomsInPeriod(LocalDateTime from, LocalDateTime to) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	List<String> getAvailableConferenceRoomsInPeriod(LocalDateTime from, LocalDateTime to) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	List<String> getAvailableHostelBedsInPeriod(LocalDateTime from, LocalDateTime to) throws InvalidIDException;

} // IBookings
