/**
 */
package Classes.Bookings;

import java.time.LocalDateTime;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNullByDefault;

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
public interface IBookings extends EObject {
	
	IBookings INSTANCE = Classes.Bookings.impl.BookingsManagerImpl.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookablesDataType="org.eclipse.uml2.types.String" bookablesMany="true" bookablesOrdered="false" customerIDDataType="org.eclipse.uml2.types.String" customerIDRequired="true" customerIDOrdered="false" guestsDataType="org.eclipse.uml2.types.String" guestsMany="true" guestsOrdered="false" requestsDataType="org.eclipse.uml2.types.String" requestsMany="true" requestsOrdered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	void makeBooking(EList<String> bookables, String customerID, EList<String> guests, EList<String> requests, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	EList<String> searchBookings(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	EList<String> getBookedStaysOfBooking(String bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	String getCustomerOfBooking(String bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	int getNbrGuestOfBooking(String bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	void cancelBooking(String bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated
	 */
	void cancelStayOfBooking(String bookingID, String stayID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated
	 */
	void addBookedStayToBooking(String bookingID, String stayID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" nbrGuestsDataType="org.eclipse.uml2.types.Integer" nbrGuestsRequired="true" nbrGuestsOrdered="false"
	 * @generated
	 */
	void changeNbrGuestsOfBooking(String bookingID, int nbrGuests);

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
	EList<String> getAllBookingsWithinPeriod(LocalDateTime from, LocalDateTime to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	EList<String> getAllBookingsWithStaysInPeriod(LocalDateTime from, LocalDateTime to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	EList<String> searchBookingsMadeInPeriod(String keyword, LocalDateTime from, LocalDateTime to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	EList<String> searchBookingsWithStaysInPeriod(String keyword, LocalDateTime from, LocalDateTime to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	EList<String> searchForAvailableBookablesInPeriod(LocalDateTime from, LocalDateTime to, String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	EList<String> getAvailableBookablesInPeriod(LocalDateTime from, LocalDateTime to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" requestIDDataType="org.eclipse.uml2.types.String" requestIDRequired="true" requestIDOrdered="false"
	 * @generated
	 */
	void addBookingRequest(String bookingID, String description);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" requestIDDataType="org.eclipse.uml2.types.String" requestIDRequired="true" requestIDOrdered="false"
	 * @generated
	 */
	void removeBookingRequest(String bookingID, String requestID);

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
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false"
	 * @generated
	 */
	void payBookingBills(String bookingID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model bookingIDDataType="org.eclipse.uml2.types.String" bookingIDRequired="true" bookingIDOrdered="false" stayIDDataType="org.eclipse.uml2.types.String" stayIDRequired="true" stayIDOrdered="false"
	 * @generated
	 */
	void payStayBills(String bookingID, String stayID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	EList<String> searchForAvailableHotelRoomsInPeriod(LocalDateTime from, LocalDateTime to, String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	EList<String> searchForAvailableHostelBedsInPeriod(LocalDateTime from, LocalDateTime to, String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	EList<String> searchForAvailableConferenceRoomsInPeriod(LocalDateTime from, LocalDateTime to, String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	EList<String> getAvailableHotelRoomsInPeriod(LocalDateTime from, LocalDateTime to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	EList<String> getAvailableConferenceRoomsInPeriod(LocalDateTime from, LocalDateTime to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	EList<String> getAvailableHostelBedsInPeriod(LocalDateTime from, LocalDateTime to);

} // IBookings
