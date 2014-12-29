/**
 */
package Classes.Services;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Service Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * @generated
 */
 class RoomServiceOrder implements Serializable {
	private static final long serialVersionUID = 2087502679560309770L;
	private List<Service> service;
	private boolean isDelivered;
	private LocalDateTime deliveryDate;
	private String bookable;
	private List<String> items;
	private String id;
	private String bill;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomServiceOrder() {
		super();
		service = new ArrayList<Service>();
		items = new ArrayList<String>();
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDelivered() {
		return isDelivered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDelivered(boolean newIsDelivered) {
		isDelivered = newIsDelivered;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDateTime getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryDate(LocalDateTime newDeliveryDate) {
		deliveryDate = newDeliveryDate;
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
	public List<String> getItems() {
		return items;
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
	public String getBill() {
		return bill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBill(String newBill) {
		bill = newBill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addService(Service ser) {
		service.add(ser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addItem(String itemID) {
		items.add(itemID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeItem(String itemID) {
		items.remove(itemID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeService(Service ser) {
		service.remove(ser);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isDelivered: ");
		result.append(isDelivered);
		result.append(", deliveryDate: ");
		result.append(deliveryDate);
		result.append(", bookable: ");
		result.append(bookable);
		result.append(", items: ");
		result.append(items);
		result.append(", id: ");
		result.append(id);
		result.append(", bill: ");
		result.append(bill);
		result.append(')');
		return result.toString();
	}

	public List<Service> getService() {
		return service;
	}

} //RoomServiceOrderImpl
