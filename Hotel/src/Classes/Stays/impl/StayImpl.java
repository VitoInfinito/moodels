/**
 */
package Classes.Stays.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
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
 * @generated
 */
public class StayImpl extends MinimalEObjectImpl.Container implements Stay {
	private String id;
	private String bookable;
	private EList<String> bills;
	private EList<String> checkedInGuests;
	private String booking;
	private EList<String> checkedOutGuests;
	private LocalDateTime fromDate;
	private LocalDateTime toDate;
	private CreditCard creditCard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StayImpl() {
		super();
		bills = new EDataTypeUniqueEList<String>(String.class, this, StaysPackage.STAY__BILLS);
		checkedInGuests = new EDataTypeUniqueEList<String>(String.class, this, StaysPackage.STAY__CHECKED_IN_GUESTS);
		checkedOutGuests = new EDataTypeUniqueEList<String>(String.class, this, StaysPackage.STAY__CHECKED_OUT_GUESTS);
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
		return bills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getCheckedInGuests() {
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
	 * @generated NOT
	 */
	public List<String> getCheckedOutGuests() {
		return checkedOutGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDateTime getFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDate(LocalDateTime newFromDate) {
		LocalDateTime oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaysPackage.STAY__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDateTime getToDate() {
		return toDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDate(LocalDateTime newToDate) {
		LocalDateTime oldToDate = toDate;
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
	 * @generated NOT
	 */
	public void addCheckedInGuest(String guestID) {
		checkedInGuests.add(guestID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkOutGuest(String guestID) {
		checkedInGuests.remove(guestID);
		checkedOutGuests.add(guestID);
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
