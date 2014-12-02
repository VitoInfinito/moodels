/**
 */
package Classes.Services.impl;

import Classes.Services.RoomServiceMenu;
import Classes.Services.RoomServiceOrder;
import Classes.Services.Service;
import Classes.Services.ServiceManager;
import Classes.Services.ServicesPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

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
	 * The cached value of the '{@link #getService() <em>Service</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> service;

	/**
	 * The cached value of the '{@link #getRoomServiceOrder() <em>Room Service Order</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoomServiceOrder()
	 * @generated
	 * @ordered
	 */
	protected EList<RoomServiceOrder> roomServiceOrder;

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
	 * @generated
	 */
	public EList<Service> getService() {
		if (service == null) {
			service = new EObjectResolvingEList<Service>(Service.class, this, ServicesPackage.SERVICE_MANAGER__SERVICE);
		}
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoomServiceOrder> getRoomServiceOrder() {
		if (roomServiceOrder == null) {
			roomServiceOrder = new EObjectResolvingEList<RoomServiceOrder>(RoomServiceOrder.class, this, ServicesPackage.SERVICE_MANAGER__ROOM_SERVICE_ORDER);
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
	public void getAllServiceIDs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAllRoomServiceOrderIDs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchServices() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchRoomServiceOrders() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getServiceName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getServicePrice() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getServiceExpense() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void isRSODelivered() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getRSODeliveryDate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getRSOBookable() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getRSOItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getRSOServices() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRSOISDelivered() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRSODeliveryDate() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getRoomServiceMenuName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getRoomServiceMenuItems() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getRoomServiceMenuInformation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRSOBill() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getRSOBill() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void makeRoomServiceOrder() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeServiceName() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeServicePrice() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeServiceExpense() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRoomServiceMenuItem() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeRoomServiceMenuItem() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRoomServiceMenuItem() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRoomServiceMenuName() {
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
			case ServicesPackage.SERVICE_MANAGER__SERVICE:
				return getService();
			case ServicesPackage.SERVICE_MANAGER__ROOM_SERVICE_ORDER:
				return getRoomServiceOrder();
			case ServicesPackage.SERVICE_MANAGER__ROOM_SERVICE_MENU:
				if (resolve) return getRoomServiceMenu();
				return basicGetRoomServiceMenu();
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
			case ServicesPackage.SERVICE_MANAGER__SERVICE:
				getService().clear();
				getService().addAll((Collection<? extends Service>)newValue);
				return;
			case ServicesPackage.SERVICE_MANAGER__ROOM_SERVICE_ORDER:
				getRoomServiceOrder().clear();
				getRoomServiceOrder().addAll((Collection<? extends RoomServiceOrder>)newValue);
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
	 * @generated
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
	 * @generated
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ServicesPackage.SERVICE_MANAGER___GET_ALL_SERVICE_IDS:
				getAllServiceIDs();
				return null;
			case ServicesPackage.SERVICE_MANAGER___GET_ALL_ROOM_SERVICE_ORDER_IDS:
				getAllRoomServiceOrderIDs();
				return null;
			case ServicesPackage.SERVICE_MANAGER___SEARCH_SERVICES:
				searchServices();
				return null;
			case ServicesPackage.SERVICE_MANAGER___SEARCH_ROOM_SERVICE_ORDERS:
				searchRoomServiceOrders();
				return null;
			case ServicesPackage.SERVICE_MANAGER___GET_SERVICE_NAME:
				getServiceName();
				return null;
			case ServicesPackage.SERVICE_MANAGER___GET_SERVICE_PRICE:
				getServicePrice();
				return null;
			case ServicesPackage.SERVICE_MANAGER___GET_SERVICE_EXPENSE:
				getServiceExpense();
				return null;
			case ServicesPackage.SERVICE_MANAGER___IS_RSO_DELIVERED:
				isRSODelivered();
				return null;
			case ServicesPackage.SERVICE_MANAGER___GET_RSO_DELIVERY_DATE:
				getRSODeliveryDate();
				return null;
			case ServicesPackage.SERVICE_MANAGER___GET_RSO_BOOKABLE:
				getRSOBookable();
				return null;
			case ServicesPackage.SERVICE_MANAGER___GET_RSO_ITEMS:
				getRSOItems();
				return null;
			case ServicesPackage.SERVICE_MANAGER___GET_RSO_SERVICES:
				getRSOServices();
				return null;
			case ServicesPackage.SERVICE_MANAGER___CHANGE_RSOIS_DELIVERED:
				changeRSOISDelivered();
				return null;
			case ServicesPackage.SERVICE_MANAGER___CHANGE_RSO_DELIVERY_DATE:
				changeRSODeliveryDate();
				return null;
			case ServicesPackage.SERVICE_MANAGER___GET_ROOM_SERVICE_MENU_NAME:
				getRoomServiceMenuName();
				return null;
			case ServicesPackage.SERVICE_MANAGER___GET_ROOM_SERVICE_MENU_ITEMS:
				getRoomServiceMenuItems();
				return null;
			case ServicesPackage.SERVICE_MANAGER___GET_ROOM_SERVICE_MENU_INFORMATION:
				getRoomServiceMenuInformation();
				return null;
			case ServicesPackage.SERVICE_MANAGER___SET_RSO_BILL:
				setRSOBill();
				return null;
			case ServicesPackage.SERVICE_MANAGER___GET_RSO_BILL:
				getRSOBill();
				return null;
			case ServicesPackage.SERVICE_MANAGER___MAKE_ROOM_SERVICE_ORDER:
				makeRoomServiceOrder();
				return null;
			case ServicesPackage.SERVICE_MANAGER___CHANGE_SERVICE_NAME:
				changeServiceName();
				return null;
			case ServicesPackage.SERVICE_MANAGER___CHANGE_SERVICE_PRICE:
				changeServicePrice();
				return null;
			case ServicesPackage.SERVICE_MANAGER___CHANGE_SERVICE_EXPENSE:
				changeServiceExpense();
				return null;
			case ServicesPackage.SERVICE_MANAGER___ADD_ROOM_SERVICE_MENU_ITEM:
				addRoomServiceMenuItem();
				return null;
			case ServicesPackage.SERVICE_MANAGER___REMOVE_ROOM_SERVICE_MENU_ITEM:
				removeRoomServiceMenuItem();
				return null;
			case ServicesPackage.SERVICE_MANAGER___CHANGE_ROOM_SERVICE_MENU_ITEM:
				changeRoomServiceMenuItem();
				return null;
			case ServicesPackage.SERVICE_MANAGER___CHANGE_ROOM_SERVICE_MENU_NAME:
				changeRoomServiceMenuName();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ServiceManagerImpl
