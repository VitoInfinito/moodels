/**
 */
package Classes.Stays;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stay</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Stay implements Serializable {
	private static final long serialVersionUID = -4306846415538567427L;
	private String id;
	private String bookable;
	private List<String> bills;
	private List<String> checkedInGuests;
	private String booking;
	private List<String> checkedOutGuests;
	private LocalDateTime fromDate;
	private LocalDateTime toDate;
	private CreditCard creditCard;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Stay() {
		super();
		bills = new ArrayList<String>();
		checkedInGuests = new ArrayList<String>();
		checkedOutGuests = new ArrayList<String>();
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
		id = newID;
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
		bookable = newBookable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getBills() {
		return bills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getCheckedInGuests() {
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
		booking = newBooking;
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
		fromDate = newFromDate;
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
		toDate = newToDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreditCard getCreditCard() {
		return creditCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreditCard(CreditCard newCreditCard) {
		creditCard = newCreditCard;
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
	 * Adds a bill to the list of bills
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeBill(String billID) {
		bills.remove(billID);
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
