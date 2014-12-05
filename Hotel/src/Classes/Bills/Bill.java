/**
 */
package Classes.Bills;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Bills.Bill#isPaid <em>Is Paid</em>}</li>
 *   <li>{@link Classes.Bills.Bill#getPaymentType <em>Payment Type</em>}</li>
 *   <li>{@link Classes.Bills.Bill#getId <em>Id</em>}</li>
 *   <li>{@link Classes.Bills.Bill#getItems <em>Items</em>}</li>
 *   <li>{@link Classes.Bills.Bill#getServices <em>Services</em>}</li>
 *   <li>{@link Classes.Bills.Bill#getBookable <em>Bookable</em>}</li>
 *   <li>{@link Classes.Bills.Bill#getIssueDate <em>Issue Date</em>}</li>
 *   <li>{@link Classes.Bills.Bill#getPaymentDate <em>Payment Date</em>}</li>
 *   <li>{@link Classes.Bills.Bill#getTotalAmount <em>Total Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Bills.BillsPackage#getBill()
 * @model
 * @generated
 */
public interface Bill extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Paid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Paid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Paid</em>' attribute.
	 * @see #setIsPaid(boolean)
	 * @see Classes.Bills.BillsPackage#getBill_IsPaid()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isPaid();

	/**
	 * Sets the value of the '{@link Classes.Bills.Bill#isPaid <em>Is Paid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Paid</em>' attribute.
	 * @see #isPaid()
	 * @generated
	 */
	void setIsPaid(boolean value);

	/**
	 * Returns the value of the '<em><b>Payment Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Type</em>' attribute.
	 * @see #setPaymentType(String)
	 * @see Classes.Bills.BillsPackage#getBill_PaymentType()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPaymentType();

	/**
	 * Sets the value of the '{@link Classes.Bills.Bill#getPaymentType <em>Payment Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Type</em>' attribute.
	 * @see #getPaymentType()
	 * @generated
	 */
	void setPaymentType(String value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Classes.Bills.BillsPackage#getBill_Id()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Classes.Bills.Bill#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' attribute list.
	 * @see Classes.Bills.BillsPackage#getBill_Items()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getItems();

	/**
	 * Returns the value of the '<em><b>Services</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' attribute list.
	 * @see Classes.Bills.BillsPackage#getBill_Services()
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated
	 */
	EList<String> getServices();

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
	 * @see Classes.Bills.BillsPackage#getBill_Bookable()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getBookable();

	/**
	 * Sets the value of the '{@link Classes.Bills.Bill#getBookable <em>Bookable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bookable</em>' attribute.
	 * @see #getBookable()
	 * @generated
	 */
	void setBookable(String value);

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
	 * @see Classes.Bills.BillsPackage#getBill_IssueDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getIssueDate();

	/**
	 * Sets the value of the '{@link Classes.Bills.Bill#getIssueDate <em>Issue Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Issue Date</em>' attribute.
	 * @see #getIssueDate()
	 * @generated
	 */
	void setIssueDate(Date value);

	/**
	 * Returns the value of the '<em><b>Payment Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payment Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payment Date</em>' attribute.
	 * @see #setPaymentDate(Date)
	 * @see Classes.Bills.BillsPackage#getBill_PaymentDate()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Date getPaymentDate();

	/**
	 * Sets the value of the '{@link Classes.Bills.Bill#getPaymentDate <em>Payment Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Payment Date</em>' attribute.
	 * @see #getPaymentDate()
	 * @generated
	 */
	void setPaymentDate(Date value);

	/**
	 * Returns the value of the '<em><b>Total Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Amount</em>' attribute.
	 * @see #setTotalAmount(double)
	 * @see Classes.Bills.BillsPackage#getBill_TotalAmount()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getTotalAmount();

	/**
	 * Sets the value of the '{@link Classes.Bills.Bill#getTotalAmount <em>Total Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Total Amount</em>' attribute.
	 * @see #getTotalAmount()
	 * @generated
	 */
	void setTotalAmount(double value);

} // Bill
