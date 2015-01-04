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
	 * Requires:
	 * 		bookables != null && customerID != null && from != null && to != null && ccNumber != null && ccv != null && firstName != null && lastName != null
	 * Ensures:
	 * 		if bookables is empty
	 * 			InvalidIDException is thrown.
	 * 		otherwise
	 * 			if nbrGuests < 1 || discount < 0 || discount > 1 || from.isAfter(to) || nbrGuests > total capacity of the bookables
	 * 				IllegalArgumentException is thrown.
	 * 			otherwise
	 * 				if credit card is invalid
	 * 					InvalidCreditCardException is thrown.
	 * 				otherwise
	 * 					if some bookable in bookables is already booked in the specified period
	 * 						InvalidIDException is thrown
	 * 					otherwise
	 * 						if isResponsibleCreditCard is true
	 * 							A booking is created with a unique booking id and stays for the specified bookables for the specified period and the credit card is saved in the booking and as a responsible card for the stays. The booking is added to the customer. The booking id is returned.
	 * 						otherwise
	 * 							A booking is created with a unique booking id and stays for the specified bookables for the specified period and the credit card is saved in the booking. The booking is added to the customer. The booking id is returned.
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
	 * Requires:
	 * 		keyword != null
	 * Ensures:
	 * 		returns a non-null id list of all booking matching something in the following order:
	 * 			1. Bookings with id that exactly matches the keyword
	 * 			2. Bookings with attributes that exactly matches the keyword
	 * 			3. Bookings with id that has some matching to the keyword
	 * 			4. Bookings with attributes that has some matching to the keyword
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @throws NumberFormatException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	List<String> searchBookings(String keyword) throws NumberFormatException, InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		bookingID != null
	 * Ensures:
	 * 		if there exists a booking such that booking.id == bookingID
	 * 			returns a non-null list with all booked stays of that booking
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	List<String> getBookedStaysOfBooking(String bookingID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		bookingID != null
	 * Ensures:
	 * 		if there exists a booking such that booking.id == bookingID
	 * 			returns the non null customer id of the booking
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	String getCustomerOfBooking(String bookingID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		bookingID != null
	 * Ensures:
	 * 		if there exists a booking such that booking.id == bookingID
	 * 			returns the number of guests of the booking
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	int getNbrGuestOfBooking(String bookingID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		bookingID != null
	 * Ensures:
	 * 		if there exists a booking such that booking.id == bookingID
	 * 			if there are no checked in or checked out guests of the stay already
	 * 				The booking and the booked stays of the booking are removed and canceled.
	 * 			otherwise
	 * 				InvalidIDException is thrown
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	void cancelBooking(String bookingID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		bookingID != null
	 * Ensures:
	 * 		if there exists a booking such that booking.id == bookingID && there exists a booked stay in the booking such that stay.id == stayID
	 * 			if there are no checked in or checked out guests of the stay already
	 * 				if the booking only contains one stay
	 * 					The booking and the booked stay of the booking are removed and canceled.
	 * 				otherwise
	 * 					The booked stay of the booking are removed and canceled.
	 * 			otherwise
	 * 				InvalidIDException is thrown
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated
	 */
	void cancelStayOfBooking(String bookingID, String stayID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		bookables != null && customerID != null && from != null && to != null && ccNumber != null && ccv != null && firstName != null && lastName != null
	 * Ensures:
	 * 		if there does not exists a booking such that booking.id == bookingID
	 * 			InvalidIDException is thrown.
	 * 		otherwise
	 * 			if discount < 0 || discount > 1 || from.isAfter(to)
	 * 				IllegalArgumentException is thrown.
	 * 			otherwise
	 * 					if the bookable is already booked in the specified period
	 * 						InvalidIDException is thrown
	 * 					otherwise
	 * 						A stay for the specified bookable is created and added to the booking for the specified period and with the specified discount.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated
	 */
	void addBookedStayToBooking(String bookingID, String bookableID, LocalDateTime from, LocalDateTime to, double discount) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		bookingID != null
	 * Ensures:
	 * 		if there exists a booking such that booking.id == bookingID
	 * 			booking.nbrGuests is set to nbrGuests
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" nbrGuestsDataType="org.eclipse.uml2.types.Integer" nbrGuestsRequired="true" nbrGuestsOrdered="false"
	 * @generated
	 */
	void changeNbrGuestsOfBooking(String bookingID, int nbrGuests) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		nothing
	 * Ensures:
	 * 		a non null list of all booking IDs is returned
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllBookings();

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		from != null && to != null && from.isBefore(to)
	 * Ensures:
	 * 		a non null id list containing all ids of bookings made within the specified period. 
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	List<String> getAllBookingsWithinPeriod(LocalDateTime from, LocalDateTime to);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		from != null && to != null && from.isBefore(to)
	 * Ensures:
	 * 		a non null id list containing all ids of bookings with stays in the specified period.
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	List<String> getAllBookingsWithStaysInPeriod(LocalDateTime from, LocalDateTime to);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		keyword != null && from != null && to != null && from.isBefore(to)
	 * Ensures:
	 * 		returns a non-null id list of all bookings made in the specified period matching something in the following order:
	 * 			1. Bookings with id that exactly matches the keyword
	 * 			2. Bookings with attributes that exactly matches the keyword
	 * 			3. Bookings with id that has some matching to the keyword
	 * 			4. Bookings with attributes that has some matching to the keyword
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @throws NumberFormatException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	List<String> searchBookingsMadeInPeriod(String keyword, LocalDateTime from, LocalDateTime to) throws NumberFormatException, InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		keyword != null && from != null && to != null && from.isBefore(to)
	 * Ensures:
	 * 		returns a non-null id list of all bookings with stays in the specified period matching something in the following order:
	 * 			1. Bookings with id that exactly matches the keyword
	 * 			2. Bookings with attributes that exactly matches the keyword
	 * 			3. Bookings with id that has some matching to the keyword
	 * 			4. Bookings with attributes that has some matching to the keyword
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @throws NumberFormatException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	List<String> searchBookingsWithStaysInPeriod(String keyword, LocalDateTime from, LocalDateTime to) throws NumberFormatException, InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		keyword != null && from != null && to != null && from.isBefore(to)
	 * Ensures:
	 * 		returns a non-null id list of all bookables that has no stay booked within the specified period matching something in the following order:
	 * 			1. Bookables with id that exactly matches the keyword
	 * 			2. Bookables with attributes that exactly matches the keyword
	 * 			3. Bookables with id that has some matching to the keyword
	 * 			4. Bookables with attributes that has some matching to the keyword
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	List<String> searchForAvailableBookablesInPeriod(LocalDateTime from, LocalDateTime to, String keyword) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		from != null && to != null && from.isBefore(to)
	 * Ensures:
	 * 		returns a non-null id list of all bookables that has no stay booked within the specified period
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	List<String> getAvailableBookablesInPeriod(LocalDateTime from, LocalDateTime to) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		bookingID != null && description != null
	 * Ensures:
	 * 		if there exists a booking such that booking.id == bookingID
	 * 			a request with the description is created and added to the booking
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" requestIDDataType="org.eclipse.uml2.types.String" requestIDRequired="true" requestIDOrdered="false"
	 * @generated
	 */
	void addBookingRequest(String bookingID, String description) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		bookingID != null && requestID != null
	 * Ensures:
	 * 		if there exists a booking such that booking.id == bookingID
	 * 			the request with requestID is removed from the booking if any
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" requestIDDataType="org.eclipse.uml2.types.String" requestIDRequired="true" requestIDOrdered="false"
	 * @generated
	 */
	void removeBookingRequest(String bookingID, String requestID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		bookingID != null && requestID != null
	 * Ensures:
	 * 		if there exists a booking such that booking.id == bookingID
	 * 			a non null list of all the requests made for the booking is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getBookingRequests(String bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		bookingID != null
	 * Ensures:
	 * 		if there exists a booking such that booking.id == bookingID
	 * 			if there are communication issues with the bank service
	 * 				SOAPException is thrown.
	 * 			otherwise
	 * 				if the credit card of the booking is invalid 
	 * 					InvalidCreditCardException is thrown.
	 * 				otherwise
	 * 					if the credit card of the booking do not have the funds to pay all the unpaid bills of the booked stays
	 * 						InsufficientFundsException is thrown.
	 * 					otherwise
	 * 						all the unpaid bills of the booked stays of the booking are paid
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws SOAPException 
	 * @throws InvalidIDException 
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	void payBookingBills(String bookingID) throws SOAPException, InvalidCreditCardException, InsufficientFundsException, InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		bookingID != null && stayID != null
	 * Ensures:
	 * 		if there exists a booking such that booking.id == bookingID && the booking contains a stay such that stay.id == stayID
	 * 			if there are communication issues with the bank service
	 * 				SOAPException is thrown.
	 * 			otherwise
	 * 				if the credit card of the booking is invalid 
	 * 					InvalidCreditCardException is thrown.
	 * 				otherwise
	 * 					if the credit card of the booking do not have the funds to pay all the unpaid bills of the booked stay
	 * 						InsufficientFundsException is thrown.
	 * 					otherwise
	 * 						all the unpaid bills of the booked stay of the booking are paid
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws SOAPException, InvalidCreditCardException, InsufficientFundsException 
	 * @throws InvalidIDException 
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated
	 */
	void payStayBills(String bookingID, String stayID) throws SOAPException, InvalidCreditCardException, InsufficientFundsException, InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		keyword != null && from != null && to != null && from.isBefore(to)
	 * Ensures:
	 * 		returns a non-null id list of all hotel rooms that has no stay booked within the specified period matching something in the following order:
	 * 			1. Hotel rooms with id that exactly matches the keyword
	 * 			2. Hotel rooms with attributes that exactly matches the keyword
	 * 			3. Hotel rooms with id that has some matching to the keyword
	 * 			4. Hotel rooms with attributes that has some matching to the keyword
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	List<String> searchForAvailableHotelRoomsInPeriod(LocalDateTime from, LocalDateTime to, String keyword, HotelRoomCategory categor) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		keyword != null && from != null && to != null && from.isBefore(to)
	 * Ensures:
	 * 		returns a non-null id list of all hostel beds that has no stay booked within the specified period matching something in the following order:
	 * 			1. Hostel beds with id that exactly matches the keyword
	 * 			2. Hostel beds with attributes that exactly matches the keyword
	 * 			3. Hostel beds with id that has some matching to the keyword
	 * 			4. Hostel beds with attributes that has some matching to the keyword
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	List<String> searchForAvailableHostelBedsInPeriod(LocalDateTime from, LocalDateTime to, String keyword) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		keyword != null && from != null && to != null && from.isBefore(to)
	 * Ensures:
	 * 		returns a non-null id list of all conference rooms that has no stay booked within the specified period matching something in the following order:
	 * 			1. Conference rooms with id that exactly matches the keyword
	 * 			2. Conference rooms with attributes that exactly matches the keyword
	 * 			3. Conference rooms with id that has some matching to the keyword
	 * 			4. Conference rooms with attributes that has some matching to the keyword
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	List<String> searchForAvailableConferenceRoomsInPeriod(LocalDateTime from, LocalDateTime to, String keyword, ConferenceRoomCategory categor) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		from != null && to != null && from.isBefore(to)
	 * Ensures:
	 * 		returns a non-null id list of all hotel rooms that has no stay booked within the specified period
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	List<String> getAvailableHotelRoomsInPeriod(LocalDateTime from, LocalDateTime to) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		from != null && to != null && from.isBefore(to)
	 * Ensures:
	 * 		returns a non-null id list of all conference rooms that has no stay booked within the specified period
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	List<String> getAvailableConferenceRoomsInPeriod(LocalDateTime from, LocalDateTime to) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		from != null && to != null && from.isBefore(to)
	 * Ensures:
	 * 		returns a non-null id list of all hostel beds that has no stay booked within the specified period
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	List<String> getAvailableHostelBedsInPeriod(LocalDateTime from, LocalDateTime to) throws InvalidIDException;

} // IBookings
