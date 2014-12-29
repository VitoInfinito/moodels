/**
 */
package Classes.Bills;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bill</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
class Bill implements Serializable {

	private static final long serialVersionUID = 5901451234757714595L;	
	private boolean isPaid;
	private String paymentType;
	private String id;
	private List<String> items;
	private List<String> services;
	private String bookable;
	private LocalDateTime issueDate;
	private LocalDateTime paymentDate;
	private double totalAmount;
	private double discount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Bill() {
		items = new ArrayList<String>();
		services = new ArrayList<String>();
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
		isPaid = newIsPaid;
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
		paymentType = newPaymentType;
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
		id = newId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getServices() {
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
		bookable = newBookable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDateTime getIssueDate() {
		return issueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIssueDate(LocalDateTime newIssueDate) {
		issueDate = newIssueDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDateTime getPaymentDate() {
		return paymentDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPaymentDate(LocalDateTime newPaymentDate) {
		paymentDate = newPaymentDate;
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
		totalAmount = newTotalAmount;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscount(double newDiscount) {
		discount = newDiscount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addItem(String itemID) {
		items.add(itemID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addService(String serviceID) {
		services.add(serviceID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
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
