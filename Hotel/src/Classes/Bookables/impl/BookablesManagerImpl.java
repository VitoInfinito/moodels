/**
 */
package Classes.Bookables.impl;

import Classes.Bookables.Bookable;
import Classes.Bookables.BookablesManager;
import Classes.Bookables.BookablesPackage;

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
	public void getBookableBasePrice() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getRoomLocationInfo() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getBookableDescription() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAllBookableIDs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getRoomOfHostelBed() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getBookableCategory() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getConferenceRoomCapacity() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getHotelRoomNbrBeds() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchForBookable() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBookable() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRoomOfHostelBed() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteBookable() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRoomLocation() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeHotelRoomCategory() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeConferenceRoomCategory() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeBasePrice() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeDescription() {
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
			case BookablesPackage.BOOKABLES_MANAGER___GET_BOOKABLE_BASE_PRICE:
				getBookableBasePrice();
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___GET_ROOM_LOCATION_INFO:
				getRoomLocationInfo();
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___GET_BOOKABLE_DESCRIPTION:
				getBookableDescription();
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___GET_ALL_BOOKABLE_IDS:
				getAllBookableIDs();
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___GET_ROOM_OF_HOSTEL_BED:
				getRoomOfHostelBed();
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___GET_BOOKABLE_CATEGORY:
				getBookableCategory();
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___GET_CONFERENCE_ROOM_CAPACITY:
				getConferenceRoomCapacity();
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___GET_HOTEL_ROOM_NBR_BEDS:
				getHotelRoomNbrBeds();
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___SEARCH_FOR_BOOKABLE:
				searchForBookable();
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___ADD_BOOKABLE:
				addBookable();
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_ROOM_OF_HOSTEL_BED:
				changeRoomOfHostelBed();
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___DELETE_BOOKABLE:
				deleteBookable();
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_ROOM_LOCATION:
				changeRoomLocation();
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_HOTEL_ROOM_CATEGORY:
				changeHotelRoomCategory();
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_CONFERENCE_ROOM_CATEGORY:
				changeConferenceRoomCategory();
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_BASE_PRICE:
				changeBasePrice();
				return null;
			case BookablesPackage.BOOKABLES_MANAGER___CHANGE_DESCRIPTION:
				changeDescription();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BookablesManagerImpl
