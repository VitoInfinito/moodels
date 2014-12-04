/**
 */
package Classes.ECoreMapEntries.impl;

import Classes.Accounts.Account;

import Classes.Bills.Bill;

import Classes.Bookables.Bookable;

import Classes.Bookings.Booking;

import Classes.Customers.Customer;

import Classes.ECoreMapEntries.*;

import Classes.Feedback.Feedback;

import Classes.Guests.Guest;

import Classes.Inventory.ItemType;

import Classes.Requests.Request;

import Classes.Restaurants.Reservation;
import Classes.Restaurants.Restaurant;
import Classes.Restaurants.RestaurantTable;

import Classes.Services.RoomServiceOrder;
import Classes.Services.Service;

import Classes.Staff.Staff;

import Classes.Stays.Stay;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class ECoreMapEntriesFactoryImpl extends EFactoryImpl implements ECoreMapEntriesFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ECoreMapEntriesFactory init() {
		try {
			ECoreMapEntriesFactory theECoreMapEntriesFactory = (ECoreMapEntriesFactory)EPackage.Registry.INSTANCE.getEFactory(ECoreMapEntriesPackage.eNS_URI);
			if (theECoreMapEntriesFactory != null) {
				return theECoreMapEntriesFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ECoreMapEntriesFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECoreMapEntriesFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ECoreMapEntriesPackage.STRING_TO_BOOKABLE_MAP: return (EObject)createStringToBookableMap();
			case ECoreMapEntriesPackage.STRING_TO_STAY_MAP: return (EObject)createStringToStayMap();
			case ECoreMapEntriesPackage.STRING_TO_CUSTOMER_MAP: return (EObject)createStringToCustomerMap();
			case ECoreMapEntriesPackage.STRING_TO_GUEST_MAP: return (EObject)createStringToGuestMap();
			case ECoreMapEntriesPackage.STRING_TO_BILL_MAP: return (EObject)createStringToBillMap();
			case ECoreMapEntriesPackage.STRING_TO_FEEDBACK_MAP: return (EObject)createStringToFeedbackMap();
			case ECoreMapEntriesPackage.STRING_TO_ACCOUNT_MAP: return (EObject)createStringToAccountMap();
			case ECoreMapEntriesPackage.STRING_TO_ITEM_TYPE_MAP: return (EObject)createStringToItemTypeMap();
			case ECoreMapEntriesPackage.STRING_TO_REQUEST_MAP: return (EObject)createStringToRequestMap();
			case ECoreMapEntriesPackage.STRING_TO_STAFF_MAP: return (EObject)createStringToStaffMap();
			case ECoreMapEntriesPackage.STRING_TO_BOOKING_MAP: return (EObject)createStringToBookingMap();
			case ECoreMapEntriesPackage.STRING_TO_RESTAURANT_MAP: return (EObject)createStringToRestaurantMap();
			case ECoreMapEntriesPackage.STRING_TO_RESERVATION_MAP: return (EObject)createStringToReservationMap();
			case ECoreMapEntriesPackage.STRING_TO_RESTAURANT_TABLE_MAP: return (EObject)createStringToRestaurantTableMap();
			case ECoreMapEntriesPackage.STRING_TO_SERVICE_MAP: return (EObject)createStringToServiceMap();
			case ECoreMapEntriesPackage.STRING_TO_ROOM_SERVICE_ORDER_MAP: return (EObject)createStringToRoomServiceOrderMap();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Bookable> createStringToBookableMap() {
		StringToBookableMapImpl stringToBookableMap = new StringToBookableMapImpl();
		return stringToBookableMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Stay> createStringToStayMap() {
		StringToStayMapImpl stringToStayMap = new StringToStayMapImpl();
		return stringToStayMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Customer> createStringToCustomerMap() {
		StringToCustomerMapImpl stringToCustomerMap = new StringToCustomerMapImpl();
		return stringToCustomerMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Guest> createStringToGuestMap() {
		StringToGuestMapImpl stringToGuestMap = new StringToGuestMapImpl();
		return stringToGuestMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Bill> createStringToBillMap() {
		StringToBillMapImpl stringToBillMap = new StringToBillMapImpl();
		return stringToBillMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Feedback> createStringToFeedbackMap() {
		StringToFeedbackMapImpl stringToFeedbackMap = new StringToFeedbackMapImpl();
		return stringToFeedbackMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Account> createStringToAccountMap() {
		StringToAccountMapImpl stringToAccountMap = new StringToAccountMapImpl();
		return stringToAccountMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, ItemType> createStringToItemTypeMap() {
		StringToItemTypeMapImpl stringToItemTypeMap = new StringToItemTypeMapImpl();
		return stringToItemTypeMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Request> createStringToRequestMap() {
		StringToRequestMapImpl stringToRequestMap = new StringToRequestMapImpl();
		return stringToRequestMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Staff> createStringToStaffMap() {
		StringToStaffMapImpl stringToStaffMap = new StringToStaffMapImpl();
		return stringToStaffMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Booking> createStringToBookingMap() {
		StringToBookingMapImpl stringToBookingMap = new StringToBookingMapImpl();
		return stringToBookingMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Restaurant> createStringToRestaurantMap() {
		StringToRestaurantMapImpl stringToRestaurantMap = new StringToRestaurantMapImpl();
		return stringToRestaurantMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Reservation> createStringToReservationMap() {
		StringToReservationMapImpl stringToReservationMap = new StringToReservationMapImpl();
		return stringToReservationMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, RestaurantTable> createStringToRestaurantTableMap() {
		StringToRestaurantTableMapImpl stringToRestaurantTableMap = new StringToRestaurantTableMapImpl();
		return stringToRestaurantTableMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Service> createStringToServiceMap() {
		StringToServiceMapImpl stringToServiceMap = new StringToServiceMapImpl();
		return stringToServiceMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, RoomServiceOrder> createStringToRoomServiceOrderMap() {
		StringToRoomServiceOrderMapImpl stringToRoomServiceOrderMap = new StringToRoomServiceOrderMapImpl();
		return stringToRoomServiceOrderMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECoreMapEntriesPackage getECoreMapEntriesPackage() {
		return (ECoreMapEntriesPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ECoreMapEntriesPackage getPackage() {
		return ECoreMapEntriesPackage.eINSTANCE;
	}

} //ECoreMapEntriesFactoryImpl
