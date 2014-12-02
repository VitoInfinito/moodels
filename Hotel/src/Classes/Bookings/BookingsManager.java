/**
 */
package Classes.Bookings;

import Classes.Banking.CustomerProvides;

import Classes.Bills.IBills;

import Classes.Bookables.IBookablesAccess;

import Classes.Customers.ICustomers;

import Classes.Guests.IGuests;

import Classes.Stays.IStays;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Bookings.BookingsManager#getBooking <em>Booking</em>}</li>
 *   <li>{@link Classes.Bookings.BookingsManager#getIBookableAccess <em>IBookable Access</em>}</li>
 *   <li>{@link Classes.Bookings.BookingsManager#getIHotelStayManager <em>IHotel Stay Manager</em>}</li>
 *   <li>{@link Classes.Bookings.BookingsManager#getBank <em>Bank</em>}</li>
 *   <li>{@link Classes.Bookings.BookingsManager#getIGuest <em>IGuest</em>}</li>
 *   <li>{@link Classes.Bookings.BookingsManager#getICustomer <em>ICustomer</em>}</li>
 *   <li>{@link Classes.Bookings.BookingsManager#getIBills <em>IBills</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Bookings.BookingsPackage#getBookingsManager()
 * @model
 * @generated
 */
public interface BookingsManager extends IBookings {
	/**
	 * Returns the value of the '<em><b>Booking</b></em>' reference list.
	 * The list contents are of type {@link Classes.Bookings.Booking}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Booking</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Booking</em>' reference list.
	 * @see Classes.Bookings.BookingsPackage#getBookingsManager_Booking()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Booking> getBooking();

	/**
	 * Returns the value of the '<em><b>IBookable Access</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IBookable Access</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IBookable Access</em>' reference.
	 * @see #setIBookableAccess(IBookablesAccess)
	 * @see Classes.Bookings.BookingsPackage#getBookingsManager_IBookableAccess()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IBookablesAccess getIBookableAccess();

	/**
	 * Sets the value of the '{@link Classes.Bookings.BookingsManager#getIBookableAccess <em>IBookable Access</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBookable Access</em>' reference.
	 * @see #getIBookableAccess()
	 * @generated
	 */
	void setIBookableAccess(IBookablesAccess value);

	/**
	 * Returns the value of the '<em><b>IHotel Stay Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IHotel Stay Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IHotel Stay Manager</em>' reference.
	 * @see #setIHotelStayManager(IStays)
	 * @see Classes.Bookings.BookingsPackage#getBookingsManager_IHotelStayManager()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IStays getIHotelStayManager();

	/**
	 * Sets the value of the '{@link Classes.Bookings.BookingsManager#getIHotelStayManager <em>IHotel Stay Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IHotel Stay Manager</em>' reference.
	 * @see #getIHotelStayManager()
	 * @generated
	 */
	void setIHotelStayManager(IStays value);

	/**
	 * Returns the value of the '<em><b>Bank</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bank</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bank</em>' reference.
	 * @see #setBank(CustomerProvides)
	 * @see Classes.Bookings.BookingsPackage#getBookingsManager_Bank()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CustomerProvides getBank();

	/**
	 * Sets the value of the '{@link Classes.Bookings.BookingsManager#getBank <em>Bank</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bank</em>' reference.
	 * @see #getBank()
	 * @generated
	 */
	void setBank(CustomerProvides value);

	/**
	 * Returns the value of the '<em><b>IGuest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IGuest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IGuest</em>' reference.
	 * @see #setIGuest(IGuests)
	 * @see Classes.Bookings.BookingsPackage#getBookingsManager_IGuest()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IGuests getIGuest();

	/**
	 * Sets the value of the '{@link Classes.Bookings.BookingsManager#getIGuest <em>IGuest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IGuest</em>' reference.
	 * @see #getIGuest()
	 * @generated
	 */
	void setIGuest(IGuests value);

	/**
	 * Returns the value of the '<em><b>ICustomer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ICustomer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ICustomer</em>' reference.
	 * @see #setICustomer(ICustomers)
	 * @see Classes.Bookings.BookingsPackage#getBookingsManager_ICustomer()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ICustomers getICustomer();

	/**
	 * Sets the value of the '{@link Classes.Bookings.BookingsManager#getICustomer <em>ICustomer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ICustomer</em>' reference.
	 * @see #getICustomer()
	 * @generated
	 */
	void setICustomer(ICustomers value);

	/**
	 * Returns the value of the '<em><b>IBills</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IBills</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IBills</em>' reference.
	 * @see #setIBills(IBills)
	 * @see Classes.Bookings.BookingsPackage#getBookingsManager_IBills()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IBills getIBills();

	/**
	 * Sets the value of the '{@link Classes.Bookings.BookingsManager#getIBills <em>IBills</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IBills</em>' reference.
	 * @see #getIBills()
	 * @generated
	 */
	void setIBills(IBills value);

} // BookingsManager
