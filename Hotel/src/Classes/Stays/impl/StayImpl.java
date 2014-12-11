/**
 */
package Classes.Stays.impl;

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

import Classes.Stays.CreditCard;
import Classes.Stays.Stay;
import Classes.Stays.StaysPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stay</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Stays.impl.StayImpl#getID <em>ID</em>}</li>
 *   <li>{@link Classes.Stays.impl.StayImpl#getBookable <em>Bookable</em>}</li>
 *   <li>{@link Classes.Stays.impl.StayImpl#getBills <em>Bills</em>}</li>
 *   <li>{@link Classes.Stays.impl.StayImpl#getCheckedInGuests <em>Checked In Guests</em>}</li>
 *   <li>{@link Classes.Stays.impl.StayImpl#getBooking <em>Booking</em>}</li>
 *   <li>{@link Classes.Stays.impl.StayImpl#getCheckedOutGuests <em>Checked Out Guests</em>}</li>
 *   <li>{@link Classes.Stays.impl.StayImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link Classes.Stays.impl.StayImpl#getToDate <em>To Date</em>}</li>
 *   <li>{@link Classes.Stays.impl.StayImpl#getCreditCard <em>Credit Card</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StayImpl extends MinimalEObjectImpl.Container implements Stay {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getBookable() <em>Bookable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookable()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBookable() <em>Bookable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookable()
	 * @generated
	 * @ordered
	 */
	protected String bookable = BOOKABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBills() <em>Bills</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBills()
	 * @generated
	 * @ordered
	 */
	protected EList<String> bills;

	/**
	 * The cached value of the '{@link #getCheckedInGuests() <em>Checked In Guests</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckedInGuests()
	 * @generated
	 * @ordered
	 */
	protected EList<String> checkedInGuests;

	/**
	 * The default value of the '{@link #getBooking() <em>Booking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking()
	 * @generated
	 * @ordered
	 */
	protected static final String BOOKING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBooking() <em>Booking</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBooking()
	 * @generated
	 * @ordered
	 */
	protected String booking = BOOKING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCheckedOutGuests() <em>Checked Out Guests</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCheckedOutGuests()
	 * @generated
	 * @ordered
	 */
	protected EList<String> checkedOutGuests;

	/**
	 * The default value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate = FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToDate() <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date TO_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToDate() <em>To Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDate()
	 * @generated
	 * @ordered
	 */
	protected Date toDate = TO_DATE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaysPackage.Literals.STAY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaysPackage.STAY__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBookable() {
		return bookable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookable(String newBookable) {
		String oldBookable = bookable;
		bookable = newBookable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaysPackage.STAY__BOOKABLE, oldBookable, bookable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBills() {
		if (bills == null) {
			bills = new EDataTypeUniqueEList<String>(String.class, this, StaysPackage.STAY__BILLS);
		}
		return bills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCheckedInGuests() {
		if (checkedInGuests == null) {
			checkedInGuests = new EDataTypeUniqueEList<String>(String.class, this, StaysPackage.STAY__CHECKED_IN_GUESTS);
		}
		return checkedInGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBooking() {
		return booking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBooking(String newBooking) {
		String oldBooking = booking;
		booking = newBooking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaysPackage.STAY__BOOKING, oldBooking, booking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCheckedOutGuests() {
		if (checkedOutGuests == null) {
			checkedOutGuests = new EDataTypeUniqueEList<String>(String.class, this, StaysPackage.STAY__CHECKED_OUT_GUESTS);
		}
		return checkedOutGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaysPackage.STAY__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getToDate() {
		return toDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDate(Date newToDate) {
		Date oldToDate = toDate;
		toDate = newToDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaysPackage.STAY__TO_DATE, oldToDate, toDate));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaysPackage.STAY__CREDIT_CARD, oldCreditCard, creditCard));
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
			eNotify(new ENotificationImpl(this, Notification.SET, StaysPackage.STAY__CREDIT_CARD, oldCreditCard, creditCard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * Adds a bill to the list of bills
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addBill(String billID) {
		bills.add(billID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addCheckedInGuest(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkOutGuest() {
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
			case StaysPackage.STAY__ID:
				return getID();
			case StaysPackage.STAY__BOOKABLE:
				return getBookable();
			case StaysPackage.STAY__BILLS:
				return getBills();
			case StaysPackage.STAY__CHECKED_IN_GUESTS:
				return getCheckedInGuests();
			case StaysPackage.STAY__BOOKING:
				return getBooking();
			case StaysPackage.STAY__CHECKED_OUT_GUESTS:
				return getCheckedOutGuests();
			case StaysPackage.STAY__FROM_DATE:
				return getFromDate();
			case StaysPackage.STAY__TO_DATE:
				return getToDate();
			case StaysPackage.STAY__CREDIT_CARD:
				if (resolve) return getCreditCard();
				return basicGetCreditCard();
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
			case StaysPackage.STAY__ID:
				setID((String)newValue);
				return;
			case StaysPackage.STAY__BOOKABLE:
				setBookable((String)newValue);
				return;
			case StaysPackage.STAY__BILLS:
				getBills().clear();
				getBills().addAll((Collection<? extends String>)newValue);
				return;
			case StaysPackage.STAY__CHECKED_IN_GUESTS:
				getCheckedInGuests().clear();
				getCheckedInGuests().addAll((Collection<? extends String>)newValue);
				return;
			case StaysPackage.STAY__BOOKING:
				setBooking((String)newValue);
				return;
			case StaysPackage.STAY__CHECKED_OUT_GUESTS:
				getCheckedOutGuests().clear();
				getCheckedOutGuests().addAll((Collection<? extends String>)newValue);
				return;
			case StaysPackage.STAY__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case StaysPackage.STAY__TO_DATE:
				setToDate((Date)newValue);
				return;
			case StaysPackage.STAY__CREDIT_CARD:
				setCreditCard((CreditCard)newValue);
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
			case StaysPackage.STAY__ID:
				setID(ID_EDEFAULT);
				return;
			case StaysPackage.STAY__BOOKABLE:
				setBookable(BOOKABLE_EDEFAULT);
				return;
			case StaysPackage.STAY__BILLS:
				getBills().clear();
				return;
			case StaysPackage.STAY__CHECKED_IN_GUESTS:
				getCheckedInGuests().clear();
				return;
			case StaysPackage.STAY__BOOKING:
				setBooking(BOOKING_EDEFAULT);
				return;
			case StaysPackage.STAY__CHECKED_OUT_GUESTS:
				getCheckedOutGuests().clear();
				return;
			case StaysPackage.STAY__FROM_DATE:
				setFromDate(FROM_DATE_EDEFAULT);
				return;
			case StaysPackage.STAY__TO_DATE:
				setToDate(TO_DATE_EDEFAULT);
				return;
			case StaysPackage.STAY__CREDIT_CARD:
				setCreditCard((CreditCard)null);
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
			case StaysPackage.STAY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case StaysPackage.STAY__BOOKABLE:
				return BOOKABLE_EDEFAULT == null ? bookable != null : !BOOKABLE_EDEFAULT.equals(bookable);
			case StaysPackage.STAY__BILLS:
				return bills != null && !bills.isEmpty();
			case StaysPackage.STAY__CHECKED_IN_GUESTS:
				return checkedInGuests != null && !checkedInGuests.isEmpty();
			case StaysPackage.STAY__BOOKING:
				return BOOKING_EDEFAULT == null ? booking != null : !BOOKING_EDEFAULT.equals(booking);
			case StaysPackage.STAY__CHECKED_OUT_GUESTS:
				return checkedOutGuests != null && !checkedOutGuests.isEmpty();
			case StaysPackage.STAY__FROM_DATE:
				return FROM_DATE_EDEFAULT == null ? fromDate != null : !FROM_DATE_EDEFAULT.equals(fromDate);
			case StaysPackage.STAY__TO_DATE:
				return TO_DATE_EDEFAULT == null ? toDate != null : !TO_DATE_EDEFAULT.equals(toDate);
			case StaysPackage.STAY__CREDIT_CARD:
				return creditCard != null;
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
			case StaysPackage.STAY___ADD_BILL__STRING:
				addBill((String)arguments.get(0));
				return null;
			case StaysPackage.STAY___ADD_CHECKED_IN_GUEST__STRING:
				addCheckedInGuest((String)arguments.get(0));
				return null;
			case StaysPackage.STAY___CHECK_OUT_GUEST:
				checkOutGuest();
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", bookable: ");
		result.append(bookable);
		result.append(", bills: ");
		result.append(bills);
		result.append(", checkedInGuests: ");
		result.append(checkedInGuests);
		result.append(", booking: ");
		result.append(booking);
		result.append(", checkedOutGuests: ");
		result.append(checkedOutGuests);
		result.append(", fromDate: ");
		result.append(fromDate);
		result.append(", toDate: ");
		result.append(toDate);
		result.append(')');
		return result.toString();
	}

} //StayImpl
