/**
 */
package Classes.Bookables.impl;

import Classes.InvalidIDException;
import Classes.RegexPatterns;
import Classes.Bookables.Bookable;
import Classes.Bookables.BookablesManager;
import Classes.Bookables.BookablesPackage;
import Classes.Bookables.ConferenceRoom;
import Classes.Bookables.ConferenceRoomCategory;
import Classes.Bookables.HostelBed;
import Classes.Bookables.HotelRoom;
import Classes.Bookables.HotelRoomCategory;
import Classes.Bookables.Room;
import Classes.Stays.IStays;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
import org.eclipse.uml2.types.TypesPackage;
import org.eclipse.uml2.types.impl.StringToBookableMapImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Bookables.impl.BookablesManagerImpl#getBookables <em>Bookables</em>}</li>
 *   <li>{@link Classes.Bookables.impl.BookablesManagerImpl#getIHotelStayManager <em>IHotel Stay Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookablesManagerImpl extends MinimalEObjectImpl.Container implements BookablesManager {
	
	/**
	 * The cached value of the '{@link #getBookables() <em>Bookables</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBookables()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, Bookable> bookables;

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
	public EMap<String, Bookable> getBookables() {
		if (bookables == null) {
			bookables = new EcoreEMap<String,Bookable>(TypesPackage.Literals.STRING_TO_BOOKABLE_MAP, StringToBookableMapImpl.class, this, BookablesPackage.BOOKABLES_MANAGER__BOOKABLES);
		}
		return bookables;
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
	 * @generated NOT
	 */
	public double getBookableBasePrice(String bookableID) throws InvalidIDException {
		Bookable bookable = bookables.get(bookableID);
		if (bookable == null) {
			throw new InvalidIDException();
		}
		return bookable.getBaseprice();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRoomLocationInfo(String roomID) throws InvalidIDException {
		Bookable bookable = bookables.get(roomID);
		if (bookable == null || !(bookable instanceof Room)) {
			throw new InvalidIDException();
		}
		return ((Room)bookable).getLocation().getAddtionalInfo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getBookableDescription(String bookableID) throws InvalidIDException {
		Bookable bookable = bookables.get(bookableID);
		if (bookable == null) {
			throw new InvalidIDException();
		}
		return bookable.getDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllBookableIDs() {
		return new ArrayList<String>(bookables.keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRoomOfHostelBed(String hostelBedID) throws InvalidIDException {
		Bookable bookable = bookables.get(hostelBedID);
		if (bookable == null || !(bookable instanceof HostelBed)) {
			throw new InvalidIDException();
		}
		return ((HostelBed)bookable).getRoom().getId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public HotelRoomCategory getHotelRoomCategory(String roomID) throws InvalidIDException {
		Bookable bookable = bookables.get(roomID);
		if (bookable == null || !(bookable instanceof HotelRoom)) {
			throw new InvalidIDException();
		}
		return ((HotelRoom)bookable).getCategory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getConferenceRoomCapacity(String roomID) throws InvalidIDException {
		Bookable bookable = bookables.get(roomID);
		if (bookable == null || !(bookable instanceof ConferenceRoom)) {
			throw new InvalidIDException();
		}
		return ((ConferenceRoom)bookable).getCapacity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getHotelRoomNbrBeds(String ID) throws InvalidIDException {
		Bookable bookable = bookables.get(ID);
		if (bookable == null || !(bookable instanceof HotelRoom)) {
			throw new InvalidIDException();
		}
		return ((HotelRoom)bookable).getNbrBeds();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> searchForBookable(String keyword) {
		Set<String> searchResult = new LinkedHashSet<String>();

		/*
		// Exact ID match. First!
		Bookable bookable = bookables.get(keyword);
		if (bookable != null) {
			searchResult.add(bookable.getId());
		}

		// Some property match exactly
		Collection<Bookable> c = bookables.values();
		for (Bookable b : c) {
			if (b.getDescription() == keyword) {
				searchResult.add(b.getId());
			} else if (keyword.matches(RegexPatterns.IntOnlyRegex) && Integer.parseInt(keyword) == b.getBaseprice()) {
				searchResult.add(b.getId());
			} //else if (b instanceof Room)
		}

		// Some property match somewhat
		for (Bookable b : c) {
			if (b.getDescription().contains(keyword)) {
				searchResult.add(b.getId());
			}
		}
		*/


		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public int getRoomLocationFloor(String roomID) throws InvalidIDException {
		Bookable bookable = bookables.get(roomID);
		if (bookable == null || !(bookable instanceof Room)) {
			throw new InvalidIDException();
		}
		return ((Room)bookable).getLocation().getFloor();
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
	 * @generated NOT
	 */
	public ConferenceRoomCategory getConferenceRoomCategory(String roomID) throws InvalidIDException {
		Bookable bookable = bookables.get(roomID);
		if (bookable == null || !(bookable instanceof ConferenceRoom)) {
			throw new InvalidIDException();
		}
		return ((ConferenceRoom)bookable).getCategory();
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
	public void changeRoomOfHostelBed(String hostelBedID, String roomID) throws InvalidIDException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteBookable(String bookableID) throws InvalidIDException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRoomLocation(String roomID, int floor, String additionalInfo) throws InvalidIDException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeHotelRoomCategory(String roomID, HotelRoomCategory category) throws InvalidIDException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeConferenceRoomCategory(String roomID, ConferenceRoomCategory category) throws InvalidIDException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeBasePrice(String bookableID, double basePrice) throws InvalidIDException {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeDescription(String bookableID, String description) throws InvalidIDException {
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case BookablesPackage.BOOKABLES_MANAGER__BOOKABLES:
			return ((InternalEList<?>)getBookables()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case BookablesPackage.BOOKABLES_MANAGER__BOOKABLES:
			if (coreType) return getBookables();
			else return getBookables().map();
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
		case BookablesPackage.BOOKABLES_MANAGER__BOOKABLES:
			((EStructuralFeature.Setting)getBookables()).set(newValue);
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
		case BookablesPackage.BOOKABLES_MANAGER__BOOKABLES:
			getBookables().clear();
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
		case BookablesPackage.BOOKABLES_MANAGER__BOOKABLES:
			return bookables != null && !bookables.isEmpty();
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
			try {
				return getBookableBasePrice((String)arguments.get(0));
			}
			catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		case BookablesPackage.BOOKABLES_MANAGER___GET_ROOM_LOCATION_INFO__STRING:
			try {
				return getRoomLocationInfo((String)arguments.get(0));
			}
			catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		case BookablesPackage.BOOKABLES_MANAGER___GET_BOOKABLE_DESCRIPTION__STRING:
			try {
				return getBookableDescription((String)arguments.get(0));
			}
			catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		case BookablesPackage.BOOKABLES_MANAGER___GET_ALL_BOOKABLE_IDS:
			return getAllBookableIDs();
		case BookablesPackage.BOOKABLES_MANAGER___GET_ROOM_OF_HOSTEL_BED__STRING:
			try {
				return getRoomOfHostelBed((String)arguments.get(0));
			}
			catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
		case BookablesPackage.BOOKABLES_MANAGER___GET_HOTEL_ROOM_CATEGORY__STRING:
			try {
				return getHotelRoomCategory((String)arguments.get(0));
			}
			catch (Throwable throwable) {
				throw new InvocationTargetException(throwable);
			}
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
