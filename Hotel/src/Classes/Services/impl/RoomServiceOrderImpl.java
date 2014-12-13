/**
 */
package Classes.Services.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.InvalidIDException;
import Classes.Bills.impl.BillsManagerImpl;
import Classes.Services.RoomServiceOrder;
import Classes.Services.Service;
import Classes.Services.ServicesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Service Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Services.impl.RoomServiceOrderImpl#getService <em>Service</em>}</li>
 *   <li>{@link Classes.Services.impl.RoomServiceOrderImpl#isDelivered <em>Is Delivered</em>}</li>
 *   <li>{@link Classes.Services.impl.RoomServiceOrderImpl#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link Classes.Services.impl.RoomServiceOrderImpl#getBookable <em>Bookable</em>}</li>
 *   <li>{@link Classes.Services.impl.RoomServiceOrderImpl#getItems <em>Items</em>}</li>
 *   <li>{@link Classes.Services.impl.RoomServiceOrderImpl#getId <em>Id</em>}</li>
 *   <li>{@link Classes.Services.impl.RoomServiceOrderImpl#getBill <em>Bill</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoomServiceOrderImpl extends MinimalEObjectImpl.Container implements RoomServiceOrder {
	private final Logger logger = LoggerFactory.getLogger(RoomServiceOrderImpl.class);
	private EList<Service> service;
	private boolean isDelivered;
	private Date deliveryDate;
	private String bookable;
	private EList<String> items;
	private String id;
	private String bill;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomServiceOrderImpl() {
		super();
		service = new EObjectResolvingEList<Service>(Service.class, this, ServicesPackage.ROOM_SERVICE_ORDER__SERVICE);
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
		boolean oldIsDelivered = isDelivered;
		isDelivered = newIsDelivered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.ROOM_SERVICE_ORDER__IS_DELIVERED, oldIsDelivered, isDelivered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryDate(Date newDeliveryDate) {
		Date oldDeliveryDate = deliveryDate;
		deliveryDate = newDeliveryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.ROOM_SERVICE_ORDER__DELIVERY_DATE, oldDeliveryDate, deliveryDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.ROOM_SERVICE_ORDER__BOOKABLE, oldBookable, bookable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getItems() {
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
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.ROOM_SERVICE_ORDER__ID, oldId, id));
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
		String oldBill = bill;
		bill = newBill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.ROOM_SERVICE_ORDER__BILL, oldBill, bill));
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
		if (eIsProxy()) return super.toString();

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


	@Override
	public EList<Service> getService() {
		return service;
	}

} //RoomServiceOrderImpl
