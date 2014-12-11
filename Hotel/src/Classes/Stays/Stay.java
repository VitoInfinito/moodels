/**
 */
package Classes.Stays;

import java.util.Date;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stay</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Stays.Stay#getID <em>ID</em>}</li>
 *   <li>{@link Classes.Stays.Stay#getBookable <em>Bookable</em>}</li>
 *   <li>{@link Classes.Stays.Stay#getBills <em>Bills</em>}</li>
 *   <li>{@link Classes.Stays.Stay#getCheckedInGuests <em>Checked In Guests</em>}</li>
 *   <li>{@link Classes.Stays.Stay#getBooking <em>Booking</em>}</li>
 *   <li>{@link Classes.Stays.Stay#getCheckedOutGuests <em>Checked Out Guests</em>}</li>
 *   <li>{@link Classes.Stays.Stay#getFromDate <em>From Date</em>}</li>
 *   <li>{@link Classes.Stays.Stay#getToDate <em>To Date</em>}</li>
 *   <li>{@link Classes.Stays.Stay#getCreditCard <em>Credit Card</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Stays.StaysPackage#getStay()
 * @model
 * @generated
 */
public interface Stay extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see Classes.Stays.StaysPackage#getStay_ID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link Classes.Stays.Stay#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Bookable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookable</em>' attribute.
	 * @see #setBookable(String)
	 * @see Classes.Stays.StaysPackage#getStay_Bookable()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBookable();

	/**
	 * Sets the value of the '{@link Classes.Stays.Stay#getBookable <em>Bookable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bookable</em>' attribute.
	 * @see #getBookable()
	 * @generated
	 */
	void setBookable(String value);

	/**
	 * Returns the value of the '<em><b>Bills</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bills</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bills</em>' attribute list.
	 * @see Classes.Stays.StaysPackage#getStay_Bills()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getBills();

	/**
	 * Returns the value of the '<em><b>Checked In Guests</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked In Guests</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked In Guests</em>' attribute list.
	 * @see Classes.Stays.StaysPackage#getStay_CheckedInGuests()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getCheckedInGuests();

	/**
	 * Returns the value of the '<em><b>Booking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking</em>' attribute.
	 * @see #setBooking(String)
	 * @see Classes.Stays.StaysPackage#getStay_Booking()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBooking();

	/**
	 * Sets the value of the '{@link Classes.Stays.Stay#getBooking <em>Booking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Booking</em>' attribute.
	 * @see #getBooking()
	 * @generated
	 */
	void setBooking(String value);

	/**
	 * Returns the value of the '<em><b>Checked Out Guests</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Checked Out Guests</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Checked Out Guests</em>' attribute list.
	 * @see Classes.Stays.StaysPackage#getStay_CheckedOutGuests()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getCheckedOutGuests();

	/**
	 * Returns the value of the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Date</em>' attribute.
	 * @see #setFromDate(Date)
	 * @see Classes.Stays.StaysPackage#getStay_FromDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getFromDate();

	/**
	 * Sets the value of the '{@link Classes.Stays.Stay#getFromDate <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Date</em>' attribute.
	 * @see #getFromDate()
	 * @generated
	 */
	void setFromDate(Date value);

	/**
	 * Returns the value of the '<em><b>To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Date</em>' attribute.
	 * @see #setToDate(Date)
	 * @see Classes.Stays.StaysPackage#getStay_ToDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getToDate();

	/**
	 * Sets the value of the '{@link Classes.Stays.Stay#getToDate <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Date</em>' attribute.
	 * @see #getToDate()
	 * @generated
	 */
	void setToDate(Date value);

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
	 * @see Classes.Stays.StaysPackage#getStay_CreditCard()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CreditCard getCreditCard();

	/**
	 * Sets the value of the '{@link Classes.Stays.Stay#getCreditCard <em>Credit Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credit Card</em>' reference.
	 * @see #getCreditCard()
	 * @generated
	 */
	void setCreditCard(CreditCard value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addBill();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addCheckedInGuest();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void checkOutGuest();

} // Stay
