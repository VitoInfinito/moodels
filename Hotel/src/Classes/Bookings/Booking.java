/**
 */
package Classes.Bookings;


import java.time.LocalDateTime;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import Classes.Stays.CreditCard;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * @see Classes.Bookings.BookingsPackage#getBooking()
 * @model
 * @generated
 */
public interface Booking extends EObject {
	/**
	 * Returns the value of the '<em><b>Booked Stays</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booked Stays</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booked Stays</em>' attribute list.
	 * @see Classes.Bookings.BookingsPackage#getBooking_BookedStays()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getBookedStays();

	/**
	 * Returns the value of the '<em><b>Customer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Customer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Customer</em>' attribute.
	 * @see #setCustomer(String)
	 * @see Classes.Bookings.BookingsPackage#getBooking_Customer()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCustomer();

	/**
	 * Sets the value of the '{@link Classes.Bookings.Booking#getCustomer <em>Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Customer</em>' attribute.
	 * @see #getCustomer()
	 * @generated
	 */
	void setCustomer(String value);

	/**
	 * Returns the value of the '<em><b>Booking Nbr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking Nbr</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking Nbr</em>' attribute.
	 * @see #setBookingNbr(String)
	 * @see Classes.Bookings.BookingsPackage#getBooking_BookingNbr()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBookingNbr();

	/**
	 * Sets the value of the '{@link Classes.Bookings.Booking#getBookingNbr <em>Booking Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking Nbr</em>' attribute.
	 * @see #getBookingNbr()
	 * @generated
	 */
	void setBookingNbr(String value);

	/**
	 * Returns the value of the '<em><b>Nbr Guests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbr Guests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbr Guests</em>' attribute.
	 * @see #setNbrGuests(int)
	 * @see Classes.Bookings.BookingsPackage#getBooking_NbrGuests()
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false"
	 * @generated
	 */
	int getNbrGuests();

	/**
	 * Sets the value of the '{@link Classes.Bookings.Booking#getNbrGuests <em>Nbr Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbr Guests</em>' attribute.
	 * @see #getNbrGuests()
	 * @generated
	 */
	void setNbrGuests(int value);

	/**
	 * Returns the value of the '<em><b>Issue Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Issue Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue Date</em>' attribute.
	 * @see #setIssueDate(Date)
	 * @see Classes.Bookings.BookingsPackage#getBooking_IssueDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LocalDateTime getIssueDate();

	/**
	 * Sets the value of the '{@link Classes.Bookings.Booking#getIssueDate <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date</em>' attribute.
	 * @see #getIssueDate()
	 * @generated
	 */
	void setIssueDate(LocalDateTime value);

	/**
	 * Returns the value of the '<em><b>Credit Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Credit Card</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credit Card</em>' reference.
	 * @see #setCreditCard(CreditCard)
	 * @see Classes.Bookings.BookingsPackage#getBooking_CreditCard()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CreditCard getCreditCard();

	/**
	 * Sets the value of the '{@link Classes.Bookings.Booking#getCreditCard <em>Credit Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Card</em>' reference.
	 * @see #getCreditCard()
	 * @generated
	 */
	void setCreditCard(CreditCard value);

	/**
	 * Returns the value of the '<em><b>Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requests</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requests</em>' attribute.
	 * @see #setRequests(String)
	 * @see Classes.Bookings.BookingsPackage#getBooking_Requests()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	EList<String> getRequests();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addBookedStay(String stayID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void cancelBookedStay(String stayID);
	
	void addRequest(String requestID);

	void removeRequest(String requestID);
} // Booking
