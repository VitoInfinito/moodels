/**
 */
package Classes.Bookables.impl;

import Classes.Bookables.Bookable;
import Classes.Bookables.BookablesManager;
import Classes.Bookables.BookablesPackage;

import Classes.Bookables.ConferenceRoomCategory;
import Classes.Bookables.HotelRoomCategory;
import Classes.Stays.IStays;

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
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Bookables.impl.BookablesManagerImpl#getBookable <em>Bookable</em>}</li>
 *   <li>{@link Classes.Bookables.impl.BookablesManagerImpl#getIHotelStayManager <em>IHotel Stay Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookablesManagerImpl extends MinimalEObjectImpl.Container implements BookablesManager {
	/**
	 * The cached value of the '{@link #getBookable() <em>Bookable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookable()
	 * @generated
	 * @ordered
	 */
	protected EList<Bookable> bookable;

	/**
	 * The cached value of the '{@link #getIHotelStayManager() <em>IHotel Stay Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIHotelStayManager()
	 * @generated
	 * @ordered
	 */
	protected IStays iHotelStayManager;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookablesManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BookablesPackage.Literals.BOOKABLES_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Bookable> getBookable() {
		if (bookable == null) {
			bookable = new EObjectResolvingEList<Bookable>(Bookable.class, this, BookablesPackage.BOOKABLES_MANAGER__BOOKABLE);
		}
		return bookable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStays getIHotelStayManager() {
		if (iHotelStayManager != null && iHotelStayManager.eIsProxy()) {
			InternalEObject oldIHotelStayManager = (InternalEObject)iHotelStayManager;
			iHotelStayManager = (IStays)eResolveProxy(oldIHotelStayManager);
			if (iHotelStayManager != oldIHotelStayManager) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BookablesPackage.BOOKABLES_MANAGER__IHOTEL_STAY_MANAGER, oldIHotelStayManager, iHotelStayManager));
			}
		}
		return iHotelStayManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStays basicGetIHotelStayManager() {
		return iHotelStayManager;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIHotelStayManager(IStays newIHotelStayManager) {
		IStays oldIHotelStayManager = iHotelStayManager;
		iHotelStayManager = newIHotelStayManager;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookablesPackage.BOOKABLES_MANAGER__IHOTEL_STAY_MANAGER, oldIHotelStayManager, iHotelStayManager));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getBookableBasePrice(String bookableID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomLocationInfo(String roomID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBookableDescription(String bookableID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllBookableIDs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoomOfHostelBed(String hostelBedID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelRoomCategory getHotelRoomCategory(String roomID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getConferenceRoomCapacity(String roomID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHotelRoomNbrBeds(String ID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchForBookable(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRoomLocationFloor(String roomID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllRoomIDs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllConferenceRoomIDs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAllHostelBedIDs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConferenceRoomCategory getConferenceRoomCategory(String roomID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchHotelRooms(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchHostelBeds(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchConferenceRooms(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBookable(double basePrice, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRoomOfHostelBed(String hostelBedID, String roomID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteBookable(String bookableID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRoomLocation(String roomID, int floor, String additionalInfo) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeHotelRoomCategory(String roomID, HotelRoomCategory category) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeConferenceRoomCategory(String roomID, ConferenceRoomCategory category) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeBasePrice(String bookableID, double basePrice) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeDescription(String bookableID, String description) {
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
			case BookablesPackage.BOOKABLES_MANAGER__BOOKABLE:
				return getBookable();
			case BookablesPackage.BOOKABLES_MANAGER__IHOTEL_STAY_MANAGER:
				if (resolve) return getIHotelStayManager();
				return basicGetIHotelStayManager();
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
			case BookablesPackage.BOOKABLES_MANAGER__BOOKABLE:
				getBookable().clear();
				getBookable().addAll((Collection<? extends Bookable>)newValue);
				return;
			case BookablesPackage.BOOKABLES_MANAGER__IHOTEL_STAY_MANAGER:
				setIHotelStayManager((IStays)newValue);
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
			case BookablesPackage.BOOKABLES_MANAGER__BOOKABLE:
				getBookable().clear();
				return;
			case BookablesPackage.BOOKABLES_MANAGER__IHOTEL_STAY_MANAGER:
				setIHotelStayManager((IStays)null);
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
			case BookablesPackage.BOOKABLES_MANAGER__BOOKABLE:
				return bookable != null && !bookable.isEmpty();
			case BookablesPackage.BOOKABLES_MANAGER__IHOTEL_STAY_MANAGER:
				return iHotelStayManager != null;
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
			case BookablesPackage.BOOKABLES_MANAGER___GET_BOOKABLE_BASE_PRICE__STRING:
				return getBookableBasePrice((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___GET_ROOM_LOCATION_INFO__STRING:
				return getRoomLocationInfo((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___GET_BOOKABLE_DESCRIPTION__STRING:
				return getBookableDescription((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___GET_ALL_BOOKABLE_IDS:
				return getAllBookableIDs();
			case BookablesPackage.BOOKABLES_MANAGER___GET_ROOM_OF_HOSTEL_BED__STRING:
				return getRoomOfHostelBed((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___GET_HOTEL_ROOM_CATEGORY__STRING:
				return getHotelRoomCategory((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___GET_CONFERENCE_ROOM_CAPACITY__STRING:
				return getConferenceRoomCapacity((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___GET_HOTEL_ROOM_NBR_BEDS__STRING:
				return getHotelRoomNbrBeds((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___SEARCH_FOR_BOOKABLE__STRING:
				return searchForBookable((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___GET_ROOM_LOCATION_FLOOR__STRING:
				return getRoomLocationFloor((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___GET_ALL_ROOM_IDS:
				return getAllRoomIDs();
			case BookablesPackage.BOOKABLES_MANAGER___GET_ALL_CONFERENCE_ROOM_IDS:
				return getAllConferenceRoomIDs();
			case BookablesPackage.BOOKABLES_MANAGER___GET_ALL_HOSTEL_BED_IDS:
				return getAllHostelBedIDs();
			case BookablesPackage.BOOKABLES_MANAGER___GET_CONFERENCE_ROOM_CATEGORY__STRING:
				return getConferenceRoomCategory((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___SEARCH_HOTEL_ROOMS__STRING:
				return searchHotelRooms((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___SEARCH_HOSTEL_BEDS__STRING:
				return searchHostelBeds((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___SEARCH_CONFERENCE_ROOMS__STRING:
				return searchConferenceRooms((String)arguments.get(0));
			case BookablesPackage.BOOKABLES_MANAGER___ADD_BOOKABLE__DOUBLE_STRING:
				addBookable((Double)arguments.get(0), (String)arguments.get(1));
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_ROOM_OF_HOSTEL_BED__STRING_STRING:
				changeRoomOfHostelBed((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___DELETE_BOOKABLE__STRING:
				deleteBookable((String)arguments.get(0));
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_ROOM_LOCATION__STRING_INT_STRING:
				changeRoomLocation((String)arguments.get(0), (Integer)arguments.get(1), (String)arguments.get(2));
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_HOTEL_ROOM_CATEGORY__STRING_HOTELROOMCATEGORY:
				changeHotelRoomCategory((String)arguments.get(0), (HotelRoomCategory)arguments.get(1));
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_CONFERENCE_ROOM_CATEGORY__STRING_CONFERENCEROOMCATEGORY:
				changeConferenceRoomCategory((String)arguments.get(0), (ConferenceRoomCategory)arguments.get(1));
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_BASE_PRICE__STRING_DOUBLE:
				changeBasePrice((String)arguments.get(0), (Double)arguments.get(1));
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_DESCRIPTION__STRING_STRING:
				changeDescription((String)arguments.get(0), (String)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookablesManagerImpl
