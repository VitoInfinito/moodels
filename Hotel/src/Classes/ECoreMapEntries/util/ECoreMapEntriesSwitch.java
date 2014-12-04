/**
 */
package Classes.ECoreMapEntries.util;

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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Classes.ECoreMapEntries.ECoreMapEntriesPackage
 * @generated NOT
 */
public class ECoreMapEntriesSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ECoreMapEntriesPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ECoreMapEntriesSwitch() {
		if (modelPackage == null) {
			modelPackage = ECoreMapEntriesPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ECoreMapEntriesPackage.STRING_TO_BOOKABLE_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Bookable> stringToBookableMap = (Map.Entry<String, Bookable>)theEObject;
				T result = caseStringToBookableMap(stringToBookableMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ECoreMapEntriesPackage.STRING_TO_STAY_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Stay> stringToStayMap = (Map.Entry<String, Stay>)theEObject;
				T result = caseStringToStayMap(stringToStayMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ECoreMapEntriesPackage.STRING_TO_CUSTOMER_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Customer> stringToCustomerMap = (Map.Entry<String, Customer>)theEObject;
				T result = caseStringToCustomerMap(stringToCustomerMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ECoreMapEntriesPackage.STRING_TO_GUEST_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Guest> stringToGuestMap = (Map.Entry<String, Guest>)theEObject;
				T result = caseStringToGuestMap(stringToGuestMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ECoreMapEntriesPackage.STRING_TO_BILL_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Bill> stringToBillMap = (Map.Entry<String, Bill>)theEObject;
				T result = caseStringToBillMap(stringToBillMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ECoreMapEntriesPackage.STRING_TO_FEEDBACK_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Feedback> stringToFeedbackMap = (Map.Entry<String, Feedback>)theEObject;
				T result = caseStringToFeedbackMap(stringToFeedbackMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ECoreMapEntriesPackage.STRING_TO_ACCOUNT_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Account> stringToAccountMap = (Map.Entry<String, Account>)theEObject;
				T result = caseStringToAccountMap(stringToAccountMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ECoreMapEntriesPackage.STRING_TO_ITEM_TYPE_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, ItemType> stringToItemTypeMap = (Map.Entry<String, ItemType>)theEObject;
				T result = caseStringToItemTypeMap(stringToItemTypeMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ECoreMapEntriesPackage.STRING_TO_REQUEST_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Request> stringToRequestMap = (Map.Entry<String, Request>)theEObject;
				T result = caseStringToRequestMap(stringToRequestMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ECoreMapEntriesPackage.STRING_TO_STAFF_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Staff> stringToStaffMap = (Map.Entry<String, Staff>)theEObject;
				T result = caseStringToStaffMap(stringToStaffMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ECoreMapEntriesPackage.STRING_TO_BOOKING_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Booking> stringToBookingMap = (Map.Entry<String, Booking>)theEObject;
				T result = caseStringToBookingMap(stringToBookingMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ECoreMapEntriesPackage.STRING_TO_RESTAURANT_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Restaurant> stringToRestaurantMap = (Map.Entry<String, Restaurant>)theEObject;
				T result = caseStringToRestaurantMap(stringToRestaurantMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ECoreMapEntriesPackage.STRING_TO_RESERVATION_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Reservation> stringToReservationMap = (Map.Entry<String, Reservation>)theEObject;
				T result = caseStringToReservationMap(stringToReservationMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ECoreMapEntriesPackage.STRING_TO_RESTAURANT_TABLE_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, RestaurantTable> stringToRestaurantTableMap = (Map.Entry<String, RestaurantTable>)theEObject;
				T result = caseStringToRestaurantTableMap(stringToRestaurantTableMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ECoreMapEntriesPackage.STRING_TO_SERVICE_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, Service> stringToServiceMap = (Map.Entry<String, Service>)theEObject;
				T result = caseStringToServiceMap(stringToServiceMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ECoreMapEntriesPackage.STRING_TO_ROOM_SERVICE_ORDER_MAP: {
				@SuppressWarnings("unchecked") Map.Entry<String, RoomServiceOrder> stringToRoomServiceOrderMap = (Map.Entry<String, RoomServiceOrder>)theEObject;
				T result = caseStringToRoomServiceOrderMap(stringToRoomServiceOrderMap);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Bookable Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Bookable Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToBookableMap(Map.Entry<String, Bookable> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Stay Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Stay Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToStayMap(Map.Entry<String, Stay> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Customer Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Customer Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToCustomerMap(Map.Entry<String, Customer> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Guest Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Guest Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToGuestMap(Map.Entry<String, Guest> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Bill Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Bill Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToBillMap(Map.Entry<String, Bill> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Feedback Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Feedback Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToFeedbackMap(Map.Entry<String, Feedback> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Account Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Account Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToAccountMap(Map.Entry<String, Account> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Item Type Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Item Type Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToItemTypeMap(Map.Entry<String, ItemType> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Request Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Request Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToRequestMap(Map.Entry<String, Request> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Staff Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Staff Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToStaffMap(Map.Entry<String, Staff> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Booking Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Booking Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToBookingMap(Map.Entry<String, Booking> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Restaurant Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Restaurant Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToRestaurantMap(Map.Entry<String, Restaurant> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Reservation Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Reservation Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToReservationMap(Map.Entry<String, Reservation> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Restaurant Table Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Restaurant Table Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToRestaurantTableMap(Map.Entry<String, RestaurantTable> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Service Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Service Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToServiceMap(Map.Entry<String, Service> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>String To Room Service Order Map</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>String To Room Service Order Map</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStringToRoomServiceOrderMap(Map.Entry<String, RoomServiceOrder> object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ECoreMapEntriesSwitch
