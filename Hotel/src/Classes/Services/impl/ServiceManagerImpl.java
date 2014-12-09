/**
 */
package Classes.Services.impl;

import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToRoomServiceOrderMapImpl;
import Classes.ECoreMapEntries.impl.StringToServiceMapImpl;
import Classes.Services.RoomServiceMenu;
import Classes.Services.RoomServiceOrder;
import Classes.Services.Service;
import Classes.Services.ServiceManager;
import Classes.Services.ServicesPackage;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Services.impl.ServiceManagerImpl#getService <em>Service</em>}</li>
 *   <li>{@link Classes.Services.impl.ServiceManagerImpl#getRoomServiceOrder <em>Room Service Order</em>}</li>
 *   <li>{@link Classes.Services.impl.ServiceManagerImpl#getRoomServiceMenu <em>Room Service Menu</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceManagerImpl extends MinimalEObjectImpl.Container implements ServiceManager {
	/**
	 * The cached value of the '{@link #getService() <em>Service</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated NOT
	 * @ordered
	 */
	private EMap<String, Service> service;

	/**
	 * The cached value of the '{@link #getRoomServiceOrder() <em>Room Service Order</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomServiceOrder()
	 * @generated NOT
	 * @ordered
	 */
	private EMap<String, RoomServiceOrder> roomServiceOrder;

	/**
	 * The cached value of the '{@link #getRoomServiceMenu() <em>Room Service Menu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomServiceMenu()
	 * @generated
	 * @ordered
	 */
	protected RoomServiceMenu roomServiceMenu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicesPackage.Literals.SERVICE_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Service> getService() {
		if (service == null) {
			service = new EcoreEMap<String,Service>(ECoreMapEntriesPackage.Literals.STRING_TO_SERVICE_MAP, StringToServiceMapImpl.class, this, ServicesPackage.SERVICE_MANAGER__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, RoomServiceOrder> getRoomServiceOrder() {
		if (roomServiceOrder == null) {
			roomServiceOrder = new EcoreEMap<String,RoomServiceOrder>(ECoreMapEntriesPackage.Literals.STRING_TO_ROOM_SERVICE_ORDER_MAP, StringToRoomServiceOrderMapImpl.class, this, ServicesPackage.SERVICE_MANAGER__ROOM_SERVICE_ORDER);
		}
		return roomServiceOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomServiceMenu getRoomServiceMenu() {
		if (roomServiceMenu != null && roomServiceMenu.eIsProxy()) {
			InternalEObject oldRoomServiceMenu = (InternalEObject)roomServiceMenu;
			roomServiceMenu = (RoomServiceMenu)eResolveProxy(oldRoomServiceMenu);
			if (roomServiceMenu != oldRoomServiceMenu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicesPackage.SERVICE_MANAGER__ROOM_SERVICE_MENU, oldRoomServiceMenu, roomServiceMenu));
			}
		}
		return roomServiceMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomServiceMenu basicGetRoomServiceMenu() {
		return roomServiceMenu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoomServiceMenu(RoomServiceMenu newRoomServiceMenu) {
		RoomServiceMenu oldRoomServiceMenu = roomServiceMenu;
		roomServiceMenu = newRoomServiceMenu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicesPackage.SERVICE_MANAGER__ROOM_SERVICE_MENU, oldRoomServiceMenu, roomServiceMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllServiceIDs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllRoomServiceOrderIDs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchServices(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchRoomServiceOrders(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName(String serviceID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getServicePrice(String serviceID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getServiceExpense(String serviceID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRSODelivered(String orderID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getRSODeliveryDate(String orderID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRSOBookable(String orderID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRSOItems(String orderID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRSOServices(String orderID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRSOISDelivered(String orderID, boolean isDelivered) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRSODeliveryDate(String orderID, Date date) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomServiceMenuName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRoomServiceMenuItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRSOBill(String orderID, String billID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRSOBill(String orderID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makeRoomServiceOrder(EList<String> items, EList<String> services, String bill, String bookable, Date deliveryDate, boolean isDelivered) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeServiceName(String serviceID, String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeServicePrice(String serviceID, double price) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeServiceExpense(String serviceID, double expense) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRoomServiceMenuItem(String itemID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoomServiceMenuItem(String itemID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRoomServiceMenuName(String name) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addService(String name, double price, double expense) {
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
			case ServicesPackage.SERVICE_MANAGER__SERVICE:
				return ((InternalEList<?>)getService()).basicRemove(otherEnd, msgs);
			case ServicesPackage.SERVICE_MANAGER__ROOM_SERVICE_ORDER:
				return ((InternalEList<?>)getRoomServiceOrder()).basicRemove(otherEnd, msgs);
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
			case ServicesPackage.SERVICE_MANAGER__SERVICE:
				if (coreType) return getService();
				else return getService().map();
			case ServicesPackage.SERVICE_MANAGER__ROOM_SERVICE_ORDER:
				if (coreType) return getRoomServiceOrder();
				else return getRoomServiceOrder().map();
			case ServicesPackage.SERVICE_MANAGER__ROOM_SERVICE_MENU:
				if (resolve) return getRoomServiceMenu();
				return basicGetRoomServiceMenu();
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
			case ServicesPackage.SERVICE_MANAGER__SERVICE:
				((EStructuralFeature.Setting)getService()).set(newValue);
				return;
			case ServicesPackage.SERVICE_MANAGER__ROOM_SERVICE_ORDER:
				((EStructuralFeature.Setting)getRoomServiceOrder()).set(newValue);
				return;
			case ServicesPackage.SERVICE_MANAGER__ROOM_SERVICE_MENU:
				setRoomServiceMenu((RoomServiceMenu)newValue);
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
			case ServicesPackage.SERVICE_MANAGER__SERVICE:
				getService().clear();
				return;
			case ServicesPackage.SERVICE_MANAGER__ROOM_SERVICE_ORDER:
				getRoomServiceOrder().clear();
				return;
			case ServicesPackage.SERVICE_MANAGER__ROOM_SERVICE_MENU:
				setRoomServiceMenu((RoomServiceMenu)null);
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
			case ServicesPackage.SERVICE_MANAGER__SERVICE:
				return service != null && !service.isEmpty();
			case ServicesPackage.SERVICE_MANAGER__ROOM_SERVICE_ORDER:
				return roomServiceOrder != null && !roomServiceOrder.isEmpty();
			case ServicesPackage.SERVICE_MANAGER__ROOM_SERVICE_MENU:
				return roomServiceMenu != null;
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
			case ServicesPackage.SERVICE_MANAGER___GET_ALL_SERVICE_IDS:
				return getAllServiceIDs();
			case ServicesPackage.SERVICE_MANAGER___GET_ALL_ROOM_SERVICE_ORDER_IDS:
				return getAllRoomServiceOrderIDs();
			case ServicesPackage.SERVICE_MANAGER___SEARCH_SERVICES__STRING:
				return searchServices((String)arguments.get(0));
			case ServicesPackage.SERVICE_MANAGER___SEARCH_ROOM_SERVICE_ORDERS__STRING:
				return searchRoomServiceOrders((String)arguments.get(0));
			case ServicesPackage.SERVICE_MANAGER___GET_SERVICE_NAME__STRING:
				return getServiceName((String)arguments.get(0));
			case ServicesPackage.SERVICE_MANAGER___GET_SERVICE_PRICE__STRING:
				return getServicePrice((String)arguments.get(0));
			case ServicesPackage.SERVICE_MANAGER___GET_SERVICE_EXPENSE__STRING:
				return getServiceExpense((String)arguments.get(0));
			case ServicesPackage.SERVICE_MANAGER___IS_RSO_DELIVERED__STRING:
				return isRSODelivered((String)arguments.get(0));
			case ServicesPackage.SERVICE_MANAGER___GET_RSO_DELIVERY_DATE__STRING:
				return getRSODeliveryDate((String)arguments.get(0));
			case ServicesPackage.SERVICE_MANAGER___GET_RSO_BOOKABLE__STRING:
				return getRSOBookable((String)arguments.get(0));
			case ServicesPackage.SERVICE_MANAGER___GET_RSO_ITEMS__STRING:
				return getRSOItems((String)arguments.get(0));
			case ServicesPackage.SERVICE_MANAGER___GET_RSO_SERVICES__STRING:
				return getRSOServices((String)arguments.get(0));
			case ServicesPackage.SERVICE_MANAGER___CHANGE_RSOIS_DELIVERED__STRING_BOOLEAN:
				changeRSOISDelivered((String)arguments.get(0), (Boolean)arguments.get(1));
				return null;
			case ServicesPackage.SERVICE_MANAGER___CHANGE_RSO_DELIVERY_DATE__STRING_DATE:
				changeRSODeliveryDate((String)arguments.get(0), (Date)arguments.get(1));
				return null;
			case ServicesPackage.SERVICE_MANAGER___GET_ROOM_SERVICE_MENU_NAME:
				return getRoomServiceMenuName();
			case ServicesPackage.SERVICE_MANAGER___GET_ROOM_SERVICE_MENU_ITEMS:
				return getRoomServiceMenuItems();
			case ServicesPackage.SERVICE_MANAGER___SET_RSO_BILL__STRING_STRING:
				setRSOBill((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ServicesPackage.SERVICE_MANAGER___GET_RSO_BILL__STRING:
				return getRSOBill((String)arguments.get(0));
			case ServicesPackage.SERVICE_MANAGER___MAKE_ROOM_SERVICE_ORDER__ELIST_ELIST_STRING_STRING_DATE_BOOLEAN:
				makeRoomServiceOrder((EList<String>)arguments.get(0), (EList<String>)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Date)arguments.get(4), (Boolean)arguments.get(5));
				return null;
			case ServicesPackage.SERVICE_MANAGER___CHANGE_SERVICE_NAME__STRING_STRING:
				changeServiceName((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case ServicesPackage.SERVICE_MANAGER___CHANGE_SERVICE_PRICE__STRING_DOUBLE:
				changeServicePrice((String)arguments.get(0), (Double)arguments.get(1));
				return null;
			case ServicesPackage.SERVICE_MANAGER___CHANGE_SERVICE_EXPENSE__STRING_DOUBLE:
				changeServiceExpense((String)arguments.get(0), (Double)arguments.get(1));
				return null;
			case ServicesPackage.SERVICE_MANAGER___ADD_ROOM_SERVICE_MENU_ITEM__STRING:
				addRoomServiceMenuItem((String)arguments.get(0));
				return null;
			case ServicesPackage.SERVICE_MANAGER___REMOVE_ROOM_SERVICE_MENU_ITEM__STRING:
				removeRoomServiceMenuItem((String)arguments.get(0));
				return null;
			case ServicesPackage.SERVICE_MANAGER___CHANGE_ROOM_SERVICE_MENU_NAME__STRING:
				changeRoomServiceMenuName((String)arguments.get(0));
				return null;
			case ServicesPackage.SERVICE_MANAGER___ADD_SERVICE__STRING_DOUBLE_DOUBLE:
				addService((String)arguments.get(0), (Double)arguments.get(1), (Double)arguments.get(2));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceManagerImpl
