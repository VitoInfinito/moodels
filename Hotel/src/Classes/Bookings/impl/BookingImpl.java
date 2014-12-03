/**
 */
package Classes.Bookings.impl;

import Classes.Bookings.Booking;
import Classes.Bookings.BookingsPackage;

import Classes.Stays.CreditCard;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Booking</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Bookings.impl.BookingImpl#getBookedStays <em>Booked Stays</em>}</li>
 *   <li>{@link Classes.Bookings.impl.BookingImpl#getCustomer <em>Customer</em>}</li>
 *   <li>{@link Classes.Bookings.impl.BookingImpl#getBookingNbr <em>Booking Nbr</em>}</li>
 *   <li>{@link Classes.Bookings.impl.BookingImpl#getNbrGuests <em>Nbr Guests</em>}</li>
 *   <li>{@link Classes.Bookings.impl.BookingImpl#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link Classes.Bookings.impl.BookingImpl#getCreditCard <em>Credit Card</em>}</li>
 *   <li>{@link Classes.Bookings.impl.BookingImpl#getRequests <em>Requests</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookingImpl extends MinimalEObjectImpl.Container implements Booking {
	/**
	 * The cached value of the '{@link #getBookedStays() <em>Booked Stays</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookedStays()
	 * @generated
	 * @ordered
	 */
	protected EList<String> bookedStays;

	/**
	 * The default value of the '{@link #getCustomer() <em>Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected static final String CUSTOMER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCustomer() <em>Customer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomer()
	 * @generated
	 * @ordered
	 */
	protected String customer = CUSTOMER_EDEFAULT;

	/**
	 * The default value of the '{@link #getBookingNbr() <em>Booking Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingNbr()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKING_NBR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookingNbr() <em>Booking Nbr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookingNbr()
	 * @generated
	 * @ordered
	 */
	protected String bookingNbr = BOOKING_NBR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbrGuests() <em>Nbr Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrGuests()
	 * @generated
	 * @ordered
	 */
	protected static final int NBR_GUESTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbrGuests() <em>Nbr Guests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbrGuests()
	 * @generated
	 * @ordered
	 */
	protected int nbrGuests = NBR_GUESTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIssueDate() <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date ISSUE_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIssueDate() <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIssueDate()
	 * @generated
	 * @ordered
	 */
	protected Date issueDate = ISSUE_DATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCreditCard() <em>Credit Card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreditCard()
	 * @generated
	 * @ordered
	 */
	protected CreditCard creditCard;

	/**
	 * The default value of the '{@link #getRequests() <em>Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUESTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequests() <em>Requests</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected String requests = REQUESTS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookingsPackage.Literals.BOOKING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBookedStays() {
		if (bookedStays == null) {
			bookedStays = new EDataTypeUniqueEList<String>(String.class, this, BookingsPackage.BOOKING__BOOKED_STAYS);
		}
		return bookedStays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCustomer() {
		return customer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomer(String newCustomer) {
		String oldCustomer = customer;
		customer = newCustomer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingsPackage.BOOKING__CUSTOMER, oldCustomer, customer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBookingNbr() {
		return bookingNbr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookingNbr(String newBookingNbr) {
		String oldBookingNbr = bookingNbr;
		bookingNbr = newBookingNbr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingsPackage.BOOKING__BOOKING_NBR, oldBookingNbr, bookingNbr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbrGuests() {
		return nbrGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbrGuests(int newNbrGuests) {
		int oldNbrGuests = nbrGuests;
		nbrGuests = newNbrGuests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingsPackage.BOOKING__NBR_GUESTS, oldNbrGuests, nbrGuests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getIssueDate() {
		return issueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueDate(Date newIssueDate) {
		Date oldIssueDate = issueDate;
		issueDate = newIssueDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingsPackage.BOOKING__ISSUE_DATE, oldIssueDate, issueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCard getCreditCard() {
		if (creditCard != null && creditCard.eIsProxy()) {
			InternalEObject oldCreditCard = (InternalEObject)creditCard;
			creditCard = (CreditCard)eResolveProxy(oldCreditCard);
			if (creditCard != oldCreditCard) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookingsPackage.BOOKING__CREDIT_CARD, oldCreditCard, creditCard));
			}
		}
		return creditCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCard basicGetCreditCard() {
		return creditCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditCard(CreditCard newCreditCard) {
		CreditCard oldCreditCard = creditCard;
		creditCard = newCreditCard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingsPackage.BOOKING__CREDIT_CARD, oldCreditCard, creditCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequests() {
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequests(String newRequests) {
		String oldRequests = requests;
		requests = newRequests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookingsPackage.BOOKING__REQUESTS, oldRequests, requests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBookedStay() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void cancelBookedStay() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BookingsPackage.BOOKING__BOOKED_STAYS:
				return getBookedStays();
			case BookingsPackage.BOOKING__CUSTOMER:
				return getCustomer();
			case BookingsPackage.BOOKING__BOOKING_NBR:
				return getBookingNbr();
			case BookingsPackage.BOOKING__NBR_GUESTS:
				return getNbrGuests();
			case BookingsPackage.BOOKING__ISSUE_DATE:
				return getIssueDate();
			case BookingsPackage.BOOKING__CREDIT_CARD:
				if (resolve) return getCreditCard();
				return basicGetCreditCard();
			case BookingsPackage.BOOKING__REQUESTS:
				return getRequests();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BookingsPackage.BOOKING__BOOKED_STAYS:
				getBookedStays().clear();
				getBookedStays().addAll((Collection<? extends String>)newValue);
				return;
			case BookingsPackage.BOOKING__CUSTOMER:
				setCustomer((String)newValue);
				return;
			case BookingsPackage.BOOKING__BOOKING_NBR:
				setBookingNbr((String)newValue);
				return;
			case BookingsPackage.BOOKING__NBR_GUESTS:
				setNbrGuests((Integer)newValue);
				return;
			case BookingsPackage.BOOKING__ISSUE_DATE:
				setIssueDate((Date)newValue);
				return;
			case BookingsPackage.BOOKING__CREDIT_CARD:
				setCreditCard((CreditCard)newValue);
				return;
			case BookingsPackage.BOOKING__REQUESTS:
				setRequests((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BookingsPackage.BOOKING__BOOKED_STAYS:
				getBookedStays().clear();
				return;
			case BookingsPackage.BOOKING__CUSTOMER:
				setCustomer(CUSTOMER_EDEFAULT);
				return;
			case BookingsPackage.BOOKING__BOOKING_NBR:
				setBookingNbr(BOOKING_NBR_EDEFAULT);
				return;
			case BookingsPackage.BOOKING__NBR_GUESTS:
				setNbrGuests(NBR_GUESTS_EDEFAULT);
				return;
			case BookingsPackage.BOOKING__ISSUE_DATE:
				setIssueDate(ISSUE_DATE_EDEFAULT);
				return;
			case BookingsPackage.BOOKING__CREDIT_CARD:
				setCreditCard((CreditCard)null);
				return;
			case BookingsPackage.BOOKING__REQUESTS:
				setRequests(REQUESTS_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BookingsPackage.BOOKING__BOOKED_STAYS:
				return bookedStays != null && !bookedStays.isEmpty();
			case BookingsPackage.BOOKING__CUSTOMER:
				return CUSTOMER_EDEFAULT == null ? customer != null : !CUSTOMER_EDEFAULT.equals(customer);
			case BookingsPackage.BOOKING__BOOKING_NBR:
				return BOOKING_NBR_EDEFAULT == null ? bookingNbr != null : !BOOKING_NBR_EDEFAULT.equals(bookingNbr);
			case BookingsPackage.BOOKING__NBR_GUESTS:
				return nbrGuests != NBR_GUESTS_EDEFAULT;
			case BookingsPackage.BOOKING__ISSUE_DATE:
				return ISSUE_DATE_EDEFAULT == null ? issueDate != null : !ISSUE_DATE_EDEFAULT.equals(issueDate);
			case BookingsPackage.BOOKING__CREDIT_CARD:
				return creditCard != null;
			case BookingsPackage.BOOKING__REQUESTS:
				return REQUESTS_EDEFAULT == null ? requests != null : !REQUESTS_EDEFAULT.equals(requests);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BookingsPackage.BOOKING___ADD_BOOKED_STAY:
				addBookedStay();
				return null;
			case BookingsPackage.BOOKING___CANCEL_BOOKED_STAY:
				cancelBookedStay();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (bookedStays: ");
		result.append(bookedStays);
		result.append(", customer: ");
		result.append(customer);
		result.append(", bookingNbr: ");
		result.append(bookingNbr);
		result.append(", nbrGuests: ");
		result.append(nbrGuests);
		result.append(", issueDate: ");
		result.append(issueDate);
		result.append(", requests: ");
		result.append(requests);
		result.append(')');
		return result.toString();
	}

} //BookingImpl
