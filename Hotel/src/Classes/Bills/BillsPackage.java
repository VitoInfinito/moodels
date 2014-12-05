/**
 */
package Classes.Bills;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Classes.Bills.BillsFactory
 * @model kind="package"
 * @generated
 */
public interface BillsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Bills";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/Bills.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Bills";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BillsPackage eINSTANCE = Classes.Bills.impl.BillsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.Bills.IBills <em>IBills</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bills.IBills
	 * @see Classes.Bills.impl.BillsPackageImpl#getIBills()
	 * @generated
	 */
	int IBILLS = 2;

	/**
	 * The number of structural features of the '<em>IBills</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Is Bill Paid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLS___GET_IS_BILL_PAID = 0;

	/**
	 * The operation id for the '<em>Get All Bills Not Paid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLS___GET_ALL_BILLS_NOT_PAID = 1;

	/**
	 * The operation id for the '<em>Get Bill Payment Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLS___GET_BILL_PAYMENT_DATE = 2;

	/**
	 * The operation id for the '<em>Get All Bill IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLS___GET_ALL_BILL_IDS = 3;

	/**
	 * The operation id for the '<em>Search Bills</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLS___SEARCH_BILLS = 4;

	/**
	 * The operation id for the '<em>Get All Payed Bills</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLS___GET_ALL_PAYED_BILLS = 5;

	/**
	 * The operation id for the '<em>Add Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLS___ADD_BILL = 6;

	/**
	 * The operation id for the '<em>Pay Bills With Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLS___PAY_BILLS_WITH_CREDIT_CARD = 7;

	/**
	 * The operation id for the '<em>Get Bill Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLS___GET_BILL_ITEMS = 8;

	/**
	 * The operation id for the '<em>Get Bill Bookable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLS___GET_BILL_BOOKABLE = 9;

	/**
	 * The operation id for the '<em>Get Bill Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLS___GET_BILL_SERVICES = 10;

	/**
	 * The operation id for the '<em>Get Bill Issue Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLS___GET_BILL_ISSUE_DATE = 11;

	/**
	 * The operation id for the '<em>Get Bill Payment Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLS___GET_BILL_PAYMENT_TYPE = 12;

	/**
	 * The operation id for the '<em>Pay Bills With Cash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLS___PAY_BILLS_WITH_CASH = 13;

	/**
	 * The operation id for the '<em>Send Invoice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLS___SEND_INVOICE = 14;

	/**
	 * The operation id for the '<em>Remove Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLS___REMOVE_BILL = 15;

	/**
	 * The number of operations of the '<em>IBills</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IBILLS_OPERATION_COUNT = 16;

	/**
	 * The meta object id for the '{@link Classes.Bills.impl.BillsManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bills.impl.BillsManagerImpl
	 * @see Classes.Bills.impl.BillsPackageImpl#getBillsManager()
	 * @generated
	 */
	int BILLS_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Bill</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER__BILL = IBILLS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customer Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER__CUSTOMER_PROVIDES = IBILLS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER_FEATURE_COUNT = IBILLS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get Is Bill Paid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER___GET_IS_BILL_PAID = IBILLS___GET_IS_BILL_PAID;

	/**
	 * The operation id for the '<em>Get All Bills Not Paid</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER___GET_ALL_BILLS_NOT_PAID = IBILLS___GET_ALL_BILLS_NOT_PAID;

	/**
	 * The operation id for the '<em>Get Bill Payment Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER___GET_BILL_PAYMENT_DATE = IBILLS___GET_BILL_PAYMENT_DATE;

	/**
	 * The operation id for the '<em>Get All Bill IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER___GET_ALL_BILL_IDS = IBILLS___GET_ALL_BILL_IDS;

	/**
	 * The operation id for the '<em>Search Bills</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER___SEARCH_BILLS = IBILLS___SEARCH_BILLS;

	/**
	 * The operation id for the '<em>Get All Payed Bills</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER___GET_ALL_PAYED_BILLS = IBILLS___GET_ALL_PAYED_BILLS;

	/**
	 * The operation id for the '<em>Add Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER___ADD_BILL = IBILLS___ADD_BILL;

	/**
	 * The operation id for the '<em>Pay Bills With Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER___PAY_BILLS_WITH_CREDIT_CARD = IBILLS___PAY_BILLS_WITH_CREDIT_CARD;

	/**
	 * The operation id for the '<em>Get Bill Items</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER___GET_BILL_ITEMS = IBILLS___GET_BILL_ITEMS;

	/**
	 * The operation id for the '<em>Get Bill Bookable</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER___GET_BILL_BOOKABLE = IBILLS___GET_BILL_BOOKABLE;

	/**
	 * The operation id for the '<em>Get Bill Services</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER___GET_BILL_SERVICES = IBILLS___GET_BILL_SERVICES;

	/**
	 * The operation id for the '<em>Get Bill Issue Date</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER___GET_BILL_ISSUE_DATE = IBILLS___GET_BILL_ISSUE_DATE;

	/**
	 * The operation id for the '<em>Get Bill Payment Type</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER___GET_BILL_PAYMENT_TYPE = IBILLS___GET_BILL_PAYMENT_TYPE;

	/**
	 * The operation id for the '<em>Pay Bills With Cash</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER___PAY_BILLS_WITH_CASH = IBILLS___PAY_BILLS_WITH_CASH;

	/**
	 * The operation id for the '<em>Send Invoice</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER___SEND_INVOICE = IBILLS___SEND_INVOICE;

	/**
	 * The operation id for the '<em>Remove Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER___REMOVE_BILL = IBILLS___REMOVE_BILL;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILLS_MANAGER_OPERATION_COUNT = IBILLS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.Bills.impl.BillImpl <em>Bill</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Bills.impl.BillImpl
	 * @see Classes.Bills.impl.BillsPackageImpl#getBill()
	 * @generated
	 */
	int BILL = 1;

	/**
	 * The feature id for the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__IS_PAID = 0;

	/**
	 * The feature id for the '<em><b>Payment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__PAYMENT_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__ID = 2;

	/**
	 * The feature id for the '<em><b>Items</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__ITEMS = 3;

	/**
	 * The feature id for the '<em><b>Services</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__SERVICES = 4;

	/**
	 * The feature id for the '<em><b>Bookable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__BOOKABLE = 5;

	/**
	 * The feature id for the '<em><b>Issue Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__ISSUE_DATE = 6;

	/**
	 * The feature id for the '<em><b>Payment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__PAYMENT_DATE = 7;

	/**
	 * The feature id for the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL__TOTAL_AMOUNT = 8;

	/**
	 * The number of structural features of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Bill</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BILL_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link Classes.Bills.BillsManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see Classes.Bills.BillsManager
	 * @generated
	 */
	EClass getBillsManager();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Bills.BillsManager#getBill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bill</em>'.
	 * @see Classes.Bills.BillsManager#getBill()
	 * @see #getBillsManager()
	 * @generated
	 */
	EReference getBillsManager_Bill();

	/**
	 * Returns the meta object for the reference '{@link Classes.Bills.BillsManager#getCustomerProvides <em>Customer Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Provides</em>'.
	 * @see Classes.Bills.BillsManager#getCustomerProvides()
	 * @see #getBillsManager()
	 * @generated
	 */
	EReference getBillsManager_CustomerProvides();

	/**
	 * Returns the meta object for class '{@link Classes.Bills.Bill <em>Bill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bill</em>'.
	 * @see Classes.Bills.Bill
	 * @generated
	 */
	EClass getBill();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bills.Bill#isPaid <em>Is Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Paid</em>'.
	 * @see Classes.Bills.Bill#isPaid()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_IsPaid();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bills.Bill#getPaymentType <em>Payment Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Type</em>'.
	 * @see Classes.Bills.Bill#getPaymentType()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_PaymentType();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bills.Bill#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Classes.Bills.Bill#getId()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Id();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.Bills.Bill#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Items</em>'.
	 * @see Classes.Bills.Bill#getItems()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Items();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.Bills.Bill#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Services</em>'.
	 * @see Classes.Bills.Bill#getServices()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Services();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bills.Bill#getBookable <em>Bookable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bookable</em>'.
	 * @see Classes.Bills.Bill#getBookable()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_Bookable();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bills.Bill#getIssueDate <em>Issue Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Issue Date</em>'.
	 * @see Classes.Bills.Bill#getIssueDate()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_IssueDate();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bills.Bill#getPaymentDate <em>Payment Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Payment Date</em>'.
	 * @see Classes.Bills.Bill#getPaymentDate()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_PaymentDate();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Bills.Bill#getTotalAmount <em>Total Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Total Amount</em>'.
	 * @see Classes.Bills.Bill#getTotalAmount()
	 * @see #getBill()
	 * @generated
	 */
	EAttribute getBill_TotalAmount();

	/**
	 * Returns the meta object for class '{@link Classes.Bills.IBills <em>IBills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IBills</em>'.
	 * @see Classes.Bills.IBills
	 * @generated
	 */
	EClass getIBills();

	/**
	 * Returns the meta object for the '{@link Classes.Bills.IBills#getIsBillPaid() <em>Get Is Bill Paid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Is Bill Paid</em>' operation.
	 * @see Classes.Bills.IBills#getIsBillPaid()
	 * @generated
	 */
	EOperation getIBills__GetIsBillPaid();

	/**
	 * Returns the meta object for the '{@link Classes.Bills.IBills#getAllBillsNotPaid() <em>Get All Bills Not Paid</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Bills Not Paid</em>' operation.
	 * @see Classes.Bills.IBills#getAllBillsNotPaid()
	 * @generated
	 */
	EOperation getIBills__GetAllBillsNotPaid();

	/**
	 * Returns the meta object for the '{@link Classes.Bills.IBills#getBillPaymentDate() <em>Get Bill Payment Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bill Payment Date</em>' operation.
	 * @see Classes.Bills.IBills#getBillPaymentDate()
	 * @generated
	 */
	EOperation getIBills__GetBillPaymentDate();

	/**
	 * Returns the meta object for the '{@link Classes.Bills.IBills#getAllBillIDs() <em>Get All Bill IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Bill IDs</em>' operation.
	 * @see Classes.Bills.IBills#getAllBillIDs()
	 * @generated
	 */
	EOperation getIBills__GetAllBillIDs();

	/**
	 * Returns the meta object for the '{@link Classes.Bills.IBills#searchBills() <em>Search Bills</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Bills</em>' operation.
	 * @see Classes.Bills.IBills#searchBills()
	 * @generated
	 */
	EOperation getIBills__SearchBills();

	/**
	 * Returns the meta object for the '{@link Classes.Bills.IBills#getAllPayedBills() <em>Get All Payed Bills</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Payed Bills</em>' operation.
	 * @see Classes.Bills.IBills#getAllPayedBills()
	 * @generated
	 */
	EOperation getIBills__GetAllPayedBills();

	/**
	 * Returns the meta object for the '{@link Classes.Bills.IBills#addBill() <em>Add Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Bill</em>' operation.
	 * @see Classes.Bills.IBills#addBill()
	 * @generated
	 */
	EOperation getIBills__AddBill();

	/**
	 * Returns the meta object for the '{@link Classes.Bills.IBills#payBillsWithCreditCard() <em>Pay Bills With Credit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay Bills With Credit Card</em>' operation.
	 * @see Classes.Bills.IBills#payBillsWithCreditCard()
	 * @generated
	 */
	EOperation getIBills__PayBillsWithCreditCard();

	/**
	 * Returns the meta object for the '{@link Classes.Bills.IBills#getBillItems() <em>Get Bill Items</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bill Items</em>' operation.
	 * @see Classes.Bills.IBills#getBillItems()
	 * @generated
	 */
	EOperation getIBills__GetBillItems();

	/**
	 * Returns the meta object for the '{@link Classes.Bills.IBills#getBillBookable() <em>Get Bill Bookable</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bill Bookable</em>' operation.
	 * @see Classes.Bills.IBills#getBillBookable()
	 * @generated
	 */
	EOperation getIBills__GetBillBookable();

	/**
	 * Returns the meta object for the '{@link Classes.Bills.IBills#getBillServices() <em>Get Bill Services</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bill Services</em>' operation.
	 * @see Classes.Bills.IBills#getBillServices()
	 * @generated
	 */
	EOperation getIBills__GetBillServices();

	/**
	 * Returns the meta object for the '{@link Classes.Bills.IBills#getBillIssueDate() <em>Get Bill Issue Date</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bill Issue Date</em>' operation.
	 * @see Classes.Bills.IBills#getBillIssueDate()
	 * @generated
	 */
	EOperation getIBills__GetBillIssueDate();

	/**
	 * Returns the meta object for the '{@link Classes.Bills.IBills#getBillPaymentType() <em>Get Bill Payment Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bill Payment Type</em>' operation.
	 * @see Classes.Bills.IBills#getBillPaymentType()
	 * @generated
	 */
	EOperation getIBills__GetBillPaymentType();

	/**
	 * Returns the meta object for the '{@link Classes.Bills.IBills#payBillsWithCash() <em>Pay Bills With Cash</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Pay Bills With Cash</em>' operation.
	 * @see Classes.Bills.IBills#payBillsWithCash()
	 * @generated
	 */
	EOperation getIBills__PayBillsWithCash();

	/**
	 * Returns the meta object for the '{@link Classes.Bills.IBills#sendInvoice() <em>Send Invoice</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Invoice</em>' operation.
	 * @see Classes.Bills.IBills#sendInvoice()
	 * @generated
	 */
	EOperation getIBills__SendInvoice();

	/**
	 * Returns the meta object for the '{@link Classes.Bills.IBills#removeBill() <em>Remove Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Bill</em>' operation.
	 * @see Classes.Bills.IBills#removeBill()
	 * @generated
	 */
	EOperation getIBills__RemoveBill();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BillsFactory getBillsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Classes.Bills.impl.BillsManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Bills.impl.BillsManagerImpl
		 * @see Classes.Bills.impl.BillsPackageImpl#getBillsManager()
		 * @generated
		 */
		EClass BILLS_MANAGER = eINSTANCE.getBillsManager();

		/**
		 * The meta object literal for the '<em><b>Bill</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLS_MANAGER__BILL = eINSTANCE.getBillsManager_Bill();

		/**
		 * The meta object literal for the '<em><b>Customer Provides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BILLS_MANAGER__CUSTOMER_PROVIDES = eINSTANCE.getBillsManager_CustomerProvides();

		/**
		 * The meta object literal for the '{@link Classes.Bills.impl.BillImpl <em>Bill</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Bills.impl.BillImpl
		 * @see Classes.Bills.impl.BillsPackageImpl#getBill()
		 * @generated
		 */
		EClass BILL = eINSTANCE.getBill();

		/**
		 * The meta object literal for the '<em><b>Is Paid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__IS_PAID = eINSTANCE.getBill_IsPaid();

		/**
		 * The meta object literal for the '<em><b>Payment Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__PAYMENT_TYPE = eINSTANCE.getBill_PaymentType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__ID = eINSTANCE.getBill_Id();

		/**
		 * The meta object literal for the '<em><b>Items</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__ITEMS = eINSTANCE.getBill_Items();

		/**
		 * The meta object literal for the '<em><b>Services</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__SERVICES = eINSTANCE.getBill_Services();

		/**
		 * The meta object literal for the '<em><b>Bookable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__BOOKABLE = eINSTANCE.getBill_Bookable();

		/**
		 * The meta object literal for the '<em><b>Issue Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__ISSUE_DATE = eINSTANCE.getBill_IssueDate();

		/**
		 * The meta object literal for the '<em><b>Payment Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__PAYMENT_DATE = eINSTANCE.getBill_PaymentDate();

		/**
		 * The meta object literal for the '<em><b>Total Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BILL__TOTAL_AMOUNT = eINSTANCE.getBill_TotalAmount();

		/**
		 * The meta object literal for the '{@link Classes.Bills.IBills <em>IBills</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Bills.IBills
		 * @see Classes.Bills.impl.BillsPackageImpl#getIBills()
		 * @generated
		 */
		EClass IBILLS = eINSTANCE.getIBills();

		/**
		 * The meta object literal for the '<em><b>Get Is Bill Paid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLS___GET_IS_BILL_PAID = eINSTANCE.getIBills__GetIsBillPaid();

		/**
		 * The meta object literal for the '<em><b>Get All Bills Not Paid</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLS___GET_ALL_BILLS_NOT_PAID = eINSTANCE.getIBills__GetAllBillsNotPaid();

		/**
		 * The meta object literal for the '<em><b>Get Bill Payment Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLS___GET_BILL_PAYMENT_DATE = eINSTANCE.getIBills__GetBillPaymentDate();

		/**
		 * The meta object literal for the '<em><b>Get All Bill IDs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLS___GET_ALL_BILL_IDS = eINSTANCE.getIBills__GetAllBillIDs();

		/**
		 * The meta object literal for the '<em><b>Search Bills</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLS___SEARCH_BILLS = eINSTANCE.getIBills__SearchBills();

		/**
		 * The meta object literal for the '<em><b>Get All Payed Bills</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLS___GET_ALL_PAYED_BILLS = eINSTANCE.getIBills__GetAllPayedBills();

		/**
		 * The meta object literal for the '<em><b>Add Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLS___ADD_BILL = eINSTANCE.getIBills__AddBill();

		/**
		 * The meta object literal for the '<em><b>Pay Bills With Credit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLS___PAY_BILLS_WITH_CREDIT_CARD = eINSTANCE.getIBills__PayBillsWithCreditCard();

		/**
		 * The meta object literal for the '<em><b>Get Bill Items</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLS___GET_BILL_ITEMS = eINSTANCE.getIBills__GetBillItems();

		/**
		 * The meta object literal for the '<em><b>Get Bill Bookable</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLS___GET_BILL_BOOKABLE = eINSTANCE.getIBills__GetBillBookable();

		/**
		 * The meta object literal for the '<em><b>Get Bill Services</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLS___GET_BILL_SERVICES = eINSTANCE.getIBills__GetBillServices();

		/**
		 * The meta object literal for the '<em><b>Get Bill Issue Date</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLS___GET_BILL_ISSUE_DATE = eINSTANCE.getIBills__GetBillIssueDate();

		/**
		 * The meta object literal for the '<em><b>Get Bill Payment Type</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLS___GET_BILL_PAYMENT_TYPE = eINSTANCE.getIBills__GetBillPaymentType();

		/**
		 * The meta object literal for the '<em><b>Pay Bills With Cash</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLS___PAY_BILLS_WITH_CASH = eINSTANCE.getIBills__PayBillsWithCash();

		/**
		 * The meta object literal for the '<em><b>Send Invoice</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLS___SEND_INVOICE = eINSTANCE.getIBills__SendInvoice();

		/**
		 * The meta object literal for the '<em><b>Remove Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IBILLS___REMOVE_BILL = eINSTANCE.getIBills__RemoveBill();

	}

} //BillsPackage
