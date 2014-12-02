/**
 */
package Classes.Services.impl;

import Classes.Services.RoomServiceOrder;
import Classes.Services.Service;
import Classes.Services.ServicesPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * The default value of the '{@link #isDelivered() <em>Is Delivered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelivered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DELIVERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDelivered() <em>Is Delivered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDelivered()
	 * @generated
	 * @ordered
	 */
	protected boolean isDelivered = IS_DELIVERED_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DELIVERY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected Date deliveryDate = DELIVERY_DATE_EDEFAULT;

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
	 * The cached value of the '{@link #getItems() <em>Items</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<String> items;

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

	/**
	 * The default value of the '{@link #getBill() <em>Bill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBill()
	 * @generated
	 * @ordered
	 */
	protected static final String BILL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBill() <em>Bill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBill()
	 * @generated
	 * @ordered
	 */
	protected String bill = BILL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomServiceOrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicesPackage.Literals.ROOM_SERVICE_ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectResolvingEList<Service>(Service.class, this, ServicesPackage.ROOM_SERVICE_ORDER__SERVICE);
		}
		return service;
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
		if (items == null) {
			items = new EDataTypeUniqueEList<String>(String.class, this, ServicesPackage.ROOM_SERVICE_ORDER__ITEMS);
		}
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
	public void getIsDelivered() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getID() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDelivered() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryDate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBookable() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addService() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addItem() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeItem() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeService() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBill() {
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
			case ServicesPackage.ROOM_SERVICE_ORDER__SERVICE:
				return getService();
			case ServicesPackage.ROOM_SERVICE_ORDER__IS_DELIVERED:
				return isDelivered();
			case ServicesPackage.ROOM_SERVICE_ORDER__DELIVERY_DATE:
				return getDeliveryDate();
			case ServicesPackage.ROOM_SERVICE_ORDER__BOOKABLE:
				return getBookable();
			case ServicesPackage.ROOM_SERVICE_ORDER__ITEMS:
				return getItems();
			case ServicesPackage.ROOM_SERVICE_ORDER__ID:
				return getId();
			case ServicesPackage.ROOM_SERVICE_ORDER__BILL:
				return getBill();
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
			case ServicesPackage.ROOM_SERVICE_ORDER__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends Service>)newValue);
				return;
			case ServicesPackage.ROOM_SERVICE_ORDER__IS_DELIVERED:
				setIsDelivered((Boolean)newValue);
				return;
			case ServicesPackage.ROOM_SERVICE_ORDER__DELIVERY_DATE:
				setDeliveryDate((Date)newValue);
				return;
			case ServicesPackage.ROOM_SERVICE_ORDER__BOOKABLE:
				setBookable((String)newValue);
				return;
			case ServicesPackage.ROOM_SERVICE_ORDER__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends String>)newValue);
				return;
			case ServicesPackage.ROOM_SERVICE_ORDER__ID:
				setId((String)newValue);
				return;
			case ServicesPackage.ROOM_SERVICE_ORDER__BILL:
				setBill((String)newValue);
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
			case ServicesPackage.ROOM_SERVICE_ORDER__SERVICE:
				getService().clear();
				return;
			case ServicesPackage.ROOM_SERVICE_ORDER__IS_DELIVERED:
				setIsDelivered(IS_DELIVERED_EDEFAULT);
				return;
			case ServicesPackage.ROOM_SERVICE_ORDER__DELIVERY_DATE:
				setDeliveryDate(DELIVERY_DATE_EDEFAULT);
				return;
			case ServicesPackage.ROOM_SERVICE_ORDER__BOOKABLE:
				setBookable(BOOKABLE_EDEFAULT);
				return;
			case ServicesPackage.ROOM_SERVICE_ORDER__ITEMS:
				getItems().clear();
				return;
			case ServicesPackage.ROOM_SERVICE_ORDER__ID:
				setId(ID_EDEFAULT);
				return;
			case ServicesPackage.ROOM_SERVICE_ORDER__BILL:
				setBill(BILL_EDEFAULT);
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
			case ServicesPackage.ROOM_SERVICE_ORDER__SERVICE:
				return service != null && !service.isEmpty();
			case ServicesPackage.ROOM_SERVICE_ORDER__IS_DELIVERED:
				return isDelivered != IS_DELIVERED_EDEFAULT;
			case ServicesPackage.ROOM_SERVICE_ORDER__DELIVERY_DATE:
				return DELIVERY_DATE_EDEFAULT == null ? deliveryDate != null : !DELIVERY_DATE_EDEFAULT.equals(deliveryDate);
			case ServicesPackage.ROOM_SERVICE_ORDER__BOOKABLE:
				return BOOKABLE_EDEFAULT == null ? bookable != null : !BOOKABLE_EDEFAULT.equals(bookable);
			case ServicesPackage.ROOM_SERVICE_ORDER__ITEMS:
				return items != null && !items.isEmpty();
			case ServicesPackage.ROOM_SERVICE_ORDER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case ServicesPackage.ROOM_SERVICE_ORDER__BILL:
				return BILL_EDEFAULT == null ? bill != null : !BILL_EDEFAULT.equals(bill);
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
			case ServicesPackage.ROOM_SERVICE_ORDER___GET_IS_DELIVERED:
				getIsDelivered();
				return null;
			case ServicesPackage.ROOM_SERVICE_ORDER___GET_ID:
				getID();
				return null;
			case ServicesPackage.ROOM_SERVICE_ORDER___SET_IS_DELIVERED:
				setIsDelivered();
				return null;
			case ServicesPackage.ROOM_SERVICE_ORDER___SET_DELIVERY_DATE:
				setDeliveryDate();
				return null;
			case ServicesPackage.ROOM_SERVICE_ORDER___SET_BOOKABLE:
				setBookable();
				return null;
			case ServicesPackage.ROOM_SERVICE_ORDER___ADD_SERVICE:
				addService();
				return null;
			case ServicesPackage.ROOM_SERVICE_ORDER___ADD_ITEM:
				addItem();
				return null;
			case ServicesPackage.ROOM_SERVICE_ORDER___REMOVE_ITEM:
				removeItem();
				return null;
			case ServicesPackage.ROOM_SERVICE_ORDER___REMOVE_SERVICE:
				removeService();
				return null;
			case ServicesPackage.ROOM_SERVICE_ORDER___SET_BILL:
				setBill();
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

} //RoomServiceOrderImpl
