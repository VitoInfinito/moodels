/**
 */
package Classes.Bills.impl;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import Classes.Bills.Bill;
import Classes.Bills.BillsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Bills.impl.BillImpl#isPaid <em>Is Paid</em>}</li>
 *   <li>{@link Classes.Bills.impl.BillImpl#getPaymentType <em>Payment Type</em>}</li>
 *   <li>{@link Classes.Bills.impl.BillImpl#getId <em>Id</em>}</li>
 *   <li>{@link Classes.Bills.impl.BillImpl#getItems <em>Items</em>}</li>
 *   <li>{@link Classes.Bills.impl.BillImpl#getServices <em>Services</em>}</li>
 *   <li>{@link Classes.Bills.impl.BillImpl#getBookable <em>Bookable</em>}</li>
 *   <li>{@link Classes.Bills.impl.BillImpl#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link Classes.Bills.impl.BillImpl#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link Classes.Bills.impl.BillImpl#getTotalAmount <em>Total Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BillImpl extends MinimalEObjectImpl.Container implements Bill {
	/**
	 * The default value of the '{@link #isPaid() <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PAID_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPaid() <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPaid()
	 * @generated
	 * @ordered
	 */
	protected boolean isPaid = IS_PAID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPaymentType() <em>Payment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentType()
	 * @generated
	 * @ordered
	 */
	protected static final String PAYMENT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentType() <em>Payment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentType()
	 * @generated
	 * @ordered
	 */
	protected String paymentType = PAYMENT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	// TODO what if a bill get issued and then the prices of the items/services change?....
	
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<String> items;

	/**
	 * The cached value of the '{@link #getServices() <em>Services</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<String> services;

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
	 * The default value of the '{@link #getPaymentDate() <em>Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date PAYMENT_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPaymentDate() <em>Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaymentDate()
	 * @generated
	 * @ordered
	 */
	protected Date paymentDate = PAYMENT_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTotalAmount() <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAmount()
	 * @generated
	 * @ordered
	 */
	protected static final double TOTAL_AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTotalAmount() <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAmount()
	 * @generated
	 * @ordered
	 */
	protected double totalAmount = TOTAL_AMOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BillImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillsPackage.Literals.BILL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPaid() {
		return isPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPaid(boolean newIsPaid) {
		boolean oldIsPaid = isPaid;
		isPaid = newIsPaid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillsPackage.BILL__IS_PAID, oldIsPaid, isPaid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPaymentType() {
		return paymentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentType(String newPaymentType) {
		String oldPaymentType = paymentType;
		paymentType = newPaymentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillsPackage.BILL__PAYMENT_TYPE, oldPaymentType, paymentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillsPackage.BILL__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getItems() {
		if (items == null) {
			items = new EDataTypeUniqueEList<String>(String.class, this, BillsPackage.BILL__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getServices() {
		if (services == null) {
			services = new EDataTypeUniqueEList<String>(String.class, this, BillsPackage.BILL__SERVICES);
		}
		return services;
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
			eNotify(new ENotificationImpl(this, Notification.SET, BillsPackage.BILL__BOOKABLE, oldBookable, bookable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, BillsPackage.BILL__ISSUE_DATE, oldIssueDate, issueDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentDate(Date newPaymentDate) {
		Date oldPaymentDate = paymentDate;
		paymentDate = newPaymentDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillsPackage.BILL__PAYMENT_DATE, oldPaymentDate, paymentDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getTotalAmount() {
		return totalAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTotalAmount(double newTotalAmount) {
		double oldTotalAmount = totalAmount;
		totalAmount = newTotalAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillsPackage.BILL__TOTAL_AMOUNT, oldTotalAmount, totalAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BillsPackage.BILL__IS_PAID:
				return isPaid();
			case BillsPackage.BILL__PAYMENT_TYPE:
				return getPaymentType();
			case BillsPackage.BILL__ID:
				return getId();
			case BillsPackage.BILL__ITEMS:
				return getItems();
			case BillsPackage.BILL__SERVICES:
				return getServices();
			case BillsPackage.BILL__BOOKABLE:
				return getBookable();
			case BillsPackage.BILL__ISSUE_DATE:
				return getIssueDate();
			case BillsPackage.BILL__PAYMENT_DATE:
				return getPaymentDate();
			case BillsPackage.BILL__TOTAL_AMOUNT:
				return getTotalAmount();
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
			case BillsPackage.BILL__IS_PAID:
				setIsPaid((Boolean)newValue);
				return;
			case BillsPackage.BILL__PAYMENT_TYPE:
				setPaymentType((String)newValue);
				return;
			case BillsPackage.BILL__ID:
				setId((String)newValue);
				return;
			case BillsPackage.BILL__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends String>)newValue);
				return;
			case BillsPackage.BILL__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends String>)newValue);
				return;
			case BillsPackage.BILL__BOOKABLE:
				setBookable((String)newValue);
				return;
			case BillsPackage.BILL__ISSUE_DATE:
				setIssueDate((Date)newValue);
				return;
			case BillsPackage.BILL__PAYMENT_DATE:
				setPaymentDate((Date)newValue);
				return;
			case BillsPackage.BILL__TOTAL_AMOUNT:
				setTotalAmount((Double)newValue);
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
			case BillsPackage.BILL__IS_PAID:
				setIsPaid(IS_PAID_EDEFAULT);
				return;
			case BillsPackage.BILL__PAYMENT_TYPE:
				setPaymentType(PAYMENT_TYPE_EDEFAULT);
				return;
			case BillsPackage.BILL__ID:
				setId(ID_EDEFAULT);
				return;
			case BillsPackage.BILL__ITEMS:
				getItems().clear();
				return;
			case BillsPackage.BILL__SERVICES:
				getServices().clear();
				return;
			case BillsPackage.BILL__BOOKABLE:
				setBookable(BOOKABLE_EDEFAULT);
				return;
			case BillsPackage.BILL__ISSUE_DATE:
				setIssueDate(ISSUE_DATE_EDEFAULT);
				return;
			case BillsPackage.BILL__PAYMENT_DATE:
				setPaymentDate(PAYMENT_DATE_EDEFAULT);
				return;
			case BillsPackage.BILL__TOTAL_AMOUNT:
				setTotalAmount(TOTAL_AMOUNT_EDEFAULT);
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
			case BillsPackage.BILL__IS_PAID:
				return isPaid != IS_PAID_EDEFAULT;
			case BillsPackage.BILL__PAYMENT_TYPE:
				return PAYMENT_TYPE_EDEFAULT == null ? paymentType != null : !PAYMENT_TYPE_EDEFAULT.equals(paymentType);
			case BillsPackage.BILL__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case BillsPackage.BILL__ITEMS:
				return items != null && !items.isEmpty();
			case BillsPackage.BILL__SERVICES:
				return services != null && !services.isEmpty();
			case BillsPackage.BILL__BOOKABLE:
				return BOOKABLE_EDEFAULT == null ? bookable != null : !BOOKABLE_EDEFAULT.equals(bookable);
			case BillsPackage.BILL__ISSUE_DATE:
				return ISSUE_DATE_EDEFAULT == null ? issueDate != null : !ISSUE_DATE_EDEFAULT.equals(issueDate);
			case BillsPackage.BILL__PAYMENT_DATE:
				return PAYMENT_DATE_EDEFAULT == null ? paymentDate != null : !PAYMENT_DATE_EDEFAULT.equals(paymentDate);
			case BillsPackage.BILL__TOTAL_AMOUNT:
				return totalAmount != TOTAL_AMOUNT_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (isPaid: ");
		result.append(isPaid);
		result.append(", paymentType: ");
		result.append(paymentType);
		result.append(", id: ");
		result.append(id);
		result.append(", items: ");
		result.append(items);
		result.append(", services: ");
		result.append(services);
		result.append(", bookable: ");
		result.append(bookable);
		result.append(", issueDate: ");
		result.append(issueDate);
		result.append(", paymentDate: ");
		result.append(paymentDate);
		result.append(", totalAmount: ");
		result.append(totalAmount);
		result.append(')');
		return result.toString();
	}

} //BillImpl
