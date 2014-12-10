/**
 */
package Classes.Bills.impl;

import Classes.Banking.CustomerProvides;
import Classes.Bills.Bill;
import Classes.Bills.BillsManager;
import Classes.Bills.BillsPackage;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToBillMapImpl;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Bills.impl.BillsManagerImpl#getBill <em>Bill</em>}</li>
 *   <li>{@link Classes.Bills.impl.BillsManagerImpl#getCustomerProvides <em>Customer Provides</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BillsManagerImpl extends MinimalEObjectImpl.Container implements BillsManager {
	private final Logger logger = LoggerFactory.getLogger(BillsManagerImpl.class);
	public static BillsManagerImpl INSTANCE = new BillsManagerImpl();
	
	/**
	 * The cached value of the '{@link #getBill() <em>Bill</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBill()
	 * @generated NOT
	 * @ordered
	 */
	private EMap<String, Bill> bill;

	/**
	 * The cached value of the '{@link #getCustomerProvides() <em>Customer Provides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerProvides()
	 * @generated
	 * @ordered
	 */
	protected CustomerProvides customerProvides;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private BillsManagerImpl() {
		super();
		bill = new EcoreEMap<String,Bill>(ECoreMapEntriesPackage.Literals.STRING_TO_BILL_MAP, StringToBillMapImpl.class, this, BillsPackage.BILLS_MANAGER__BILL);
		// TODO fetch customer provides
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BillsPackage.Literals.BILLS_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Bill> getBill() {
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerProvides getCustomerProvides() {
		if (customerProvides != null && customerProvides.eIsProxy()) {
			InternalEObject oldCustomerProvides = (InternalEObject)customerProvides;
			customerProvides = (CustomerProvides)eResolveProxy(oldCustomerProvides);
			if (customerProvides != oldCustomerProvides) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BillsPackage.BILLS_MANAGER__CUSTOMER_PROVIDES, oldCustomerProvides, customerProvides));
			}
		}
		return customerProvides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerProvides basicGetCustomerProvides() {
		return customerProvides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerProvides(CustomerProvides newCustomerProvides) {
		CustomerProvides oldCustomerProvides = customerProvides;
		customerProvides = newCustomerProvides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BillsPackage.BILLS_MANAGER__CUSTOMER_PROVIDES, oldCustomerProvides, customerProvides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean getIsBillPaid(String billID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllBillsNotPaid() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBillPaymentDate(String billID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllBillIDs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchBills(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllPayedBills() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBill(EList<String> items, EList<String> services, String bookable) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void payBillsWithCreditCard(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBillItems(String billID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBillBookable(String billID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBillServices(String billID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getBillIssueDate(String billID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBillPaymentType(String billID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void payBillsWithCash(EList<String> bills) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendInvoice(String billID, String email) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeBill(String billID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBillTotalAmount(String billID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BillsPackage.BILLS_MANAGER__BILL:
				return ((InternalEList<?>)getBill()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BillsPackage.BILLS_MANAGER__BILL:
				if (coreType) return getBill();
				else return getBill().map();
			case BillsPackage.BILLS_MANAGER__CUSTOMER_PROVIDES:
				if (resolve) return getCustomerProvides();
				return basicGetCustomerProvides();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BillsPackage.BILLS_MANAGER__BILL:
				((EStructuralFeature.Setting)getBill()).set(newValue);
				return;
			case BillsPackage.BILLS_MANAGER__CUSTOMER_PROVIDES:
				setCustomerProvides((CustomerProvides)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BillsPackage.BILLS_MANAGER__BILL:
				getBill().clear();
				return;
			case BillsPackage.BILLS_MANAGER__CUSTOMER_PROVIDES:
				setCustomerProvides((CustomerProvides)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BillsPackage.BILLS_MANAGER__BILL:
				return bill != null && !bill.isEmpty();
			case BillsPackage.BILLS_MANAGER__CUSTOMER_PROVIDES:
				return customerProvides != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BillsPackage.BILLS_MANAGER___GET_IS_BILL_PAID__STRING:
				return getIsBillPaid((String)arguments.get(0));
			case BillsPackage.BILLS_MANAGER___GET_ALL_BILLS_NOT_PAID:
				return getAllBillsNotPaid();
			case BillsPackage.BILLS_MANAGER___GET_BILL_PAYMENT_DATE__STRING:
				return getBillPaymentDate((String)arguments.get(0));
			case BillsPackage.BILLS_MANAGER___GET_ALL_BILL_IDS:
				return getAllBillIDs();
			case BillsPackage.BILLS_MANAGER___SEARCH_BILLS__STRING:
				return searchBills((String)arguments.get(0));
			case BillsPackage.BILLS_MANAGER___GET_ALL_PAYED_BILLS:
				return getAllPayedBills();
			case BillsPackage.BILLS_MANAGER___ADD_BILL__ELIST_ELIST_STRING:
				addBill((EList<String>)arguments.get(0), (EList<String>)arguments.get(1), (String)arguments.get(2));
				return null;
			case BillsPackage.BILLS_MANAGER___PAY_BILLS_WITH_CREDIT_CARD__STRING_STRING_INT_INT_STRING_STRING:
				payBillsWithCreditCard((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2), (Integer)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
				return null;
			case BillsPackage.BILLS_MANAGER___GET_BILL_ITEMS__STRING:
				return getBillItems((String)arguments.get(0));
			case BillsPackage.BILLS_MANAGER___GET_BILL_BOOKABLE__STRING:
				return getBillBookable((String)arguments.get(0));
			case BillsPackage.BILLS_MANAGER___GET_BILL_SERVICES__STRING:
				return getBillServices((String)arguments.get(0));
			case BillsPackage.BILLS_MANAGER___GET_BILL_ISSUE_DATE__STRING:
				return getBillIssueDate((String)arguments.get(0));
			case BillsPackage.BILLS_MANAGER___GET_BILL_PAYMENT_TYPE__STRING:
				return getBillPaymentType((String)arguments.get(0));
			case BillsPackage.BILLS_MANAGER___PAY_BILLS_WITH_CASH__ELIST:
				payBillsWithCash((EList<String>)arguments.get(0));
				return null;
			case BillsPackage.BILLS_MANAGER___SEND_INVOICE__STRING_STRING:
				sendInvoice((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case BillsPackage.BILLS_MANAGER___REMOVE_BILL__STRING:
				removeBill((String)arguments.get(0));
				return null;
			case BillsPackage.BILLS_MANAGER___GET_BILL_TOTAL_AMOUNT__STRING:
				return getBillTotalAmount((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BillsManagerImpl
