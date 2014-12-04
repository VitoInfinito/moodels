/**
 */
package Classes.Stays.impl;

import Classes.Banking.CustomerProvides;
import Classes.Bills.IBills;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToStayMapImpl;
import Classes.Guests.IGuests;
import Classes.Stays.Stay;
import Classes.Stays.StaysManager;
import Classes.Stays.StaysPackage;
import java.lang.reflect.InvocationTargetException;
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
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Stays.impl.StaysManagerImpl#getStay <em>Stay</em>}</li>
 *   <li>{@link Classes.Stays.impl.StaysManagerImpl#getCustomerProvides <em>Customer Provides</em>}</li>
 *   <li>{@link Classes.Stays.impl.StaysManagerImpl#getIBills <em>IBills</em>}</li>
 *   <li>{@link Classes.Stays.impl.StaysManagerImpl#getIGuests <em>IGuests</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaysManagerImpl extends MinimalEObjectImpl.Container implements StaysManager {
	/**
	 * The cached value of the '{@link #getStay() <em>Stay</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStay()
	 * @generated NOT
	 * @ordered
	 */
	private EMap<String, Stay> stay;

	/**
	 * The cached value of the '{@link #getCustomerProvides() <em>Customer Provides</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCustomerProvides()
	 * @generated
	 * @ordered
	 */
	protected CustomerProvides customerProvides;

	/**
	 * The cached value of the '{@link #getIBills() <em>IBills</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBills()
	 * @generated
	 * @ordered
	 */
	protected IBills iBills;

	/**
	 * The cached value of the '{@link #getIGuests() <em>IGuests</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIGuests()
	 * @generated
	 * @ordered
	 */
	protected IGuests iGuests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaysManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaysPackage.Literals.STAYS_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Stay> getStay() {
		if (stay == null) {
			stay = new EcoreEMap<String,Stay>(ECoreMapEntriesPackage.Literals.STRING_TO_STAY_MAP, StringToStayMapImpl.class, this, StaysPackage.STAYS_MANAGER__STAY);
		}
		return stay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerProvides getCustomerProvides() {
		if (customerProvides != null && customerProvides.eIsProxy()) {
			InternalEObject oldCustomerProvides = (InternalEObject)customerProvides;
			customerProvides = (CustomerProvides)eResolveProxy(oldCustomerProvides);
			if (customerProvides != oldCustomerProvides) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaysPackage.STAYS_MANAGER__CUSTOMER_PROVIDES, oldCustomerProvides, customerProvides));
			}
		}
		return customerProvides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomerProvides basicGetCustomerProvides() {
		return customerProvides;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCustomerProvides(CustomerProvides newCustomerProvides) {
		CustomerProvides oldCustomerProvides = customerProvides;
		customerProvides = newCustomerProvides;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaysPackage.STAYS_MANAGER__CUSTOMER_PROVIDES, oldCustomerProvides, customerProvides));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBills getIBills() {
		if (iBills != null && iBills.eIsProxy()) {
			InternalEObject oldIBills = (InternalEObject)iBills;
			iBills = (IBills)eResolveProxy(oldIBills);
			if (iBills != oldIBills) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaysPackage.STAYS_MANAGER__IBILLS, oldIBills, iBills));
			}
		}
		return iBills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBills basicGetIBills() {
		return iBills;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIBills(IBills newIBills) {
		IBills oldIBills = iBills;
		iBills = newIBills;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaysPackage.STAYS_MANAGER__IBILLS, oldIBills, iBills));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IGuests getIGuests() {
		if (iGuests != null && iGuests.eIsProxy()) {
			InternalEObject oldIGuests = (InternalEObject)iGuests;
			iGuests = (IGuests)eResolveProxy(oldIGuests);
			if (iGuests != oldIGuests) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaysPackage.STAYS_MANAGER__IGUESTS, oldIGuests, iGuests));
			}
		}
		return iGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IGuests basicGetIGuests() {
		return iGuests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIGuests(IGuests newIGuests) {
		IGuests oldIGuests = iGuests;
		iGuests = newIGuests;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaysPackage.STAYS_MANAGER__IGUESTS, oldIGuests, iGuests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkInGuest() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeBookableOfStay() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addNewStay() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeStay() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addBillToStay() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void checkOutGuest() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addResponsibleCreditCard() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeResponsibleCreditCard() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getGuestsOfHotelStay() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getBillsOfHotelStay(String stayID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getBookableOfHotelStay() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getBookingOfHotelStay() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAllHotelStayIDs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getCheckedInGuestsOfHotelStay() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getCheckedOutGuestsOfHotelStay() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchHotelStays() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchHotelStaysWithinPeriod() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAllHotelStaysWithinPeriod() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAllUnpayedBillsOfHotelStay() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void billCreditCardWithAllUnpaidBillsOfHotelStay() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void isResponsibleCreditCardAdded() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changePeriodOfStay() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeBillFromStay() {
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
			case StaysPackage.STAYS_MANAGER__STAY:
				return ((InternalEList<?>)getStay()).basicRemove(otherEnd, msgs);
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
			case StaysPackage.STAYS_MANAGER__STAY:
				if (coreType) return getStay();
				else return getStay().map();
			case StaysPackage.STAYS_MANAGER__CUSTOMER_PROVIDES:
				if (resolve) return getCustomerProvides();
				return basicGetCustomerProvides();
			case StaysPackage.STAYS_MANAGER__IBILLS:
				if (resolve) return getIBills();
				return basicGetIBills();
			case StaysPackage.STAYS_MANAGER__IGUESTS:
				if (resolve) return getIGuests();
				return basicGetIGuests();
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
			case StaysPackage.STAYS_MANAGER__STAY:
				((EStructuralFeature.Setting)getStay()).set(newValue);
				return;
			case StaysPackage.STAYS_MANAGER__CUSTOMER_PROVIDES:
				setCustomerProvides((CustomerProvides)newValue);
				return;
			case StaysPackage.STAYS_MANAGER__IBILLS:
				setIBills((IBills)newValue);
				return;
			case StaysPackage.STAYS_MANAGER__IGUESTS:
				setIGuests((IGuests)newValue);
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
			case StaysPackage.STAYS_MANAGER__STAY:
				getStay().clear();
				return;
			case StaysPackage.STAYS_MANAGER__CUSTOMER_PROVIDES:
				setCustomerProvides((CustomerProvides)null);
				return;
			case StaysPackage.STAYS_MANAGER__IBILLS:
				setIBills((IBills)null);
				return;
			case StaysPackage.STAYS_MANAGER__IGUESTS:
				setIGuests((IGuests)null);
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
			case StaysPackage.STAYS_MANAGER__STAY:
				return stay != null && !stay.isEmpty();
			case StaysPackage.STAYS_MANAGER__CUSTOMER_PROVIDES:
				return customerProvides != null;
			case StaysPackage.STAYS_MANAGER__IBILLS:
				return iBills != null;
			case StaysPackage.STAYS_MANAGER__IGUESTS:
				return iGuests != null;
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
			case StaysPackage.STAYS_MANAGER___CHECK_IN_GUEST:
				checkInGuest();
				return null;
			case StaysPackage.STAYS_MANAGER___CHANGE_BOOKABLE_OF_STAY:
				changeBookableOfStay();
				return null;
			case StaysPackage.STAYS_MANAGER___ADD_NEW_STAY:
				addNewStay();
				return null;
			case StaysPackage.STAYS_MANAGER___REMOVE_STAY:
				removeStay();
				return null;
			case StaysPackage.STAYS_MANAGER___ADD_BILL_TO_STAY:
				addBillToStay();
				return null;
			case StaysPackage.STAYS_MANAGER___CHECK_OUT_GUEST:
				checkOutGuest();
				return null;
			case StaysPackage.STAYS_MANAGER___ADD_RESPONSIBLE_CREDIT_CARD:
				addResponsibleCreditCard();
				return null;
			case StaysPackage.STAYS_MANAGER___CHANGE_RESPONSIBLE_CREDIT_CARD:
				changeResponsibleCreditCard();
				return null;
			case StaysPackage.STAYS_MANAGER___GET_GUESTS_OF_HOTEL_STAY:
				getGuestsOfHotelStay();
				return null;
			case StaysPackage.STAYS_MANAGER___GET_BILLS_OF_HOTEL_STAY__STRING:
				getBillsOfHotelStay((String)arguments.get(0));
				return null;
			case StaysPackage.STAYS_MANAGER___GET_BOOKABLE_OF_HOTEL_STAY:
				getBookableOfHotelStay();
				return null;
			case StaysPackage.STAYS_MANAGER___GET_BOOKING_OF_HOTEL_STAY:
				getBookingOfHotelStay();
				return null;
			case StaysPackage.STAYS_MANAGER___GET_ALL_HOTEL_STAY_IDS:
				getAllHotelStayIDs();
				return null;
			case StaysPackage.STAYS_MANAGER___GET_CHECKED_IN_GUESTS_OF_HOTEL_STAY:
				getCheckedInGuestsOfHotelStay();
				return null;
			case StaysPackage.STAYS_MANAGER___GET_CHECKED_OUT_GUESTS_OF_HOTEL_STAY:
				getCheckedOutGuestsOfHotelStay();
				return null;
			case StaysPackage.STAYS_MANAGER___SEARCH_HOTEL_STAYS:
				searchHotelStays();
				return null;
			case StaysPackage.STAYS_MANAGER___SEARCH_HOTEL_STAYS_WITHIN_PERIOD:
				searchHotelStaysWithinPeriod();
				return null;
			case StaysPackage.STAYS_MANAGER___GET_ALL_HOTEL_STAYS_WITHIN_PERIOD:
				getAllHotelStaysWithinPeriod();
				return null;
			case StaysPackage.STAYS_MANAGER___GET_ALL_UNPAYED_BILLS_OF_HOTEL_STAY:
				getAllUnpayedBillsOfHotelStay();
				return null;
			case StaysPackage.STAYS_MANAGER___BILL_CREDIT_CARD_WITH_ALL_UNPAID_BILLS_OF_HOTEL_STAY:
				billCreditCardWithAllUnpaidBillsOfHotelStay();
				return null;
			case StaysPackage.STAYS_MANAGER___IS_RESPONSIBLE_CREDIT_CARD_ADDED:
				isResponsibleCreditCardAdded();
				return null;
			case StaysPackage.STAYS_MANAGER___CHANGE_PERIOD_OF_STAY:
				changePeriodOfStay();
				return null;
			case StaysPackage.STAYS_MANAGER___REMOVE_BILL_FROM_STAY:
				removeBillFromStay();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //StaysManagerImpl
