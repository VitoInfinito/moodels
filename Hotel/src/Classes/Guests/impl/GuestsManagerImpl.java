/**
 */
package Classes.Guests.impl;

import Classes.Accounts.IManageAccounts;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToGuestMapImpl;
import Classes.Guests.Guest;
import Classes.Guests.GuestsManager;
import Classes.Guests.GuestsPackage;
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
 *   <li>{@link Classes.Guests.impl.GuestsManagerImpl#getGuest <em>Guest</em>}</li>
 *   <li>{@link Classes.Guests.impl.GuestsManagerImpl#getIManageAccounts <em>IManage Accounts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuestsManagerImpl extends MinimalEObjectImpl.Container implements GuestsManager {
	/**
	 * The cached value of the '{@link #getGuest() <em>Guest</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuest()
	 * @generated NOT
	 * @ordered
	 */
	private EMap<String, Guest> guest;

	/**
	 * The cached value of the '{@link #getIManageAccounts() <em>IManage Accounts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIManageAccounts()
	 * @generated
	 * @ordered
	 */
	protected IManageAccounts iManageAccounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestsManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuestsPackage.Literals.GUESTS_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Guest> getGuest() {
		if (guest == null) {
			guest = new EcoreEMap<String,Guest>(ECoreMapEntriesPackage.Literals.STRING_TO_GUEST_MAP, StringToGuestMapImpl.class, this, GuestsPackage.GUESTS_MANAGER__GUEST);
		}
		return guest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IManageAccounts getIManageAccounts() {
		if (iManageAccounts != null && iManageAccounts.eIsProxy()) {
			InternalEObject oldIManageAccounts = (InternalEObject)iManageAccounts;
			iManageAccounts = (IManageAccounts)eResolveProxy(oldIManageAccounts);
			if (iManageAccounts != oldIManageAccounts) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, GuestsPackage.GUESTS_MANAGER__IMANAGE_ACCOUNTS, oldIManageAccounts, iManageAccounts));
			}
		}
		return iManageAccounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IManageAccounts basicGetIManageAccounts() {
		return iManageAccounts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIManageAccounts(IManageAccounts newIManageAccounts) {
		IManageAccounts oldIManageAccounts = iManageAccounts;
		iManageAccounts = newIManageAccounts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuestsPackage.GUESTS_MANAGER__IMANAGE_ACCOUNTS, oldIManageAccounts, iManageAccounts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAllGuests() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addGuest() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeGuestFirstName(String SSID, String firstName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeGuestLastName(String SSID, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeGuestTitle(String SSID, String title) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeGuestEmail(String SSID, String eMail) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeGuestPhone(String SSID, String phoneNr) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGuestFirstName(String SSID) {
		if(guest.contains(SSID)) {
			return guest.get(SSID).getFirstname();
		} else {
			// TODO: Fix better NotFound-handling
			return "";
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuestLastName(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuestTitle(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuestEmail(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuestPhone(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchGuests() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getGuestStays(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getGuestRequests(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeGuestStay() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addGuestRequest() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeGuestRequest() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getGuestAccountUsername(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getGuestAccountPassword(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateGuestAccount() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeGuestAccount() {
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
			case GuestsPackage.GUESTS_MANAGER__GUEST:
				return ((InternalEList<?>)getGuest()).basicRemove(otherEnd, msgs);
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
			case GuestsPackage.GUESTS_MANAGER__GUEST:
				if (coreType) return getGuest();
				else return getGuest().map();
			case GuestsPackage.GUESTS_MANAGER__IMANAGE_ACCOUNTS:
				if (resolve) return getIManageAccounts();
				return basicGetIManageAccounts();
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
			case GuestsPackage.GUESTS_MANAGER__GUEST:
				((EStructuralFeature.Setting)getGuest()).set(newValue);
				return;
			case GuestsPackage.GUESTS_MANAGER__IMANAGE_ACCOUNTS:
				setIManageAccounts((IManageAccounts)newValue);
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
			case GuestsPackage.GUESTS_MANAGER__GUEST:
				getGuest().clear();
				return;
			case GuestsPackage.GUESTS_MANAGER__IMANAGE_ACCOUNTS:
				setIManageAccounts((IManageAccounts)null);
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
			case GuestsPackage.GUESTS_MANAGER__GUEST:
				return guest != null && !guest.isEmpty();
			case GuestsPackage.GUESTS_MANAGER__IMANAGE_ACCOUNTS:
				return iManageAccounts != null;
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
			case GuestsPackage.GUESTS_MANAGER___GET_ALL_GUESTS:
				getAllGuests();
				return null;
			case GuestsPackage.GUESTS_MANAGER___ADD_GUEST:
				addGuest();
				return null;
			case GuestsPackage.GUESTS_MANAGER___CHANGE_GUEST_FIRST_NAME__STRING_STRING:
				changeGuestFirstName((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GuestsPackage.GUESTS_MANAGER___CHANGE_GUEST_LAST_NAME__STRING_STRING:
				changeGuestLastName((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GuestsPackage.GUESTS_MANAGER___CHANGE_GUEST_TITLE__STRING_STRING:
				changeGuestTitle((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GuestsPackage.GUESTS_MANAGER___CHANGE_GUEST_EMAIL__STRING_STRING:
				changeGuestEmail((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GuestsPackage.GUESTS_MANAGER___CHANGE_GUEST_PHONE__STRING_STRING:
				changeGuestPhone((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GuestsPackage.GUESTS_MANAGER___GET_GUEST_FIRST_NAME__STRING:
				return getGuestFirstName((String)arguments.get(0));
			case GuestsPackage.GUESTS_MANAGER___GET_GUEST_LAST_NAME__STRING:
				return getGuestLastName((String)arguments.get(0));
			case GuestsPackage.GUESTS_MANAGER___GET_GUEST_TITLE__STRING:
				return getGuestTitle((String)arguments.get(0));
			case GuestsPackage.GUESTS_MANAGER___GET_GUEST_EMAIL__STRING:
				return getGuestEmail((String)arguments.get(0));
			case GuestsPackage.GUESTS_MANAGER___GET_GUEST_PHONE__STRING:
				return getGuestPhone((String)arguments.get(0));
			case GuestsPackage.GUESTS_MANAGER___SEARCH_GUESTS:
				searchGuests();
				return null;
			case GuestsPackage.GUESTS_MANAGER___GET_GUEST_STAYS__STRING:
				getGuestStays((String)arguments.get(0));
				return null;
			case GuestsPackage.GUESTS_MANAGER___GET_GUEST_REQUESTS__STRING:
				getGuestRequests((String)arguments.get(0));
				return null;
			case GuestsPackage.GUESTS_MANAGER___REMOVE_GUEST_STAY:
				removeGuestStay();
				return null;
			case GuestsPackage.GUESTS_MANAGER___ADD_GUEST_REQUEST:
				addGuestRequest();
				return null;
			case GuestsPackage.GUESTS_MANAGER___REMOVE_GUEST_REQUEST:
				removeGuestRequest();
				return null;
			case GuestsPackage.GUESTS_MANAGER___GET_GUEST_ACCOUNT_USERNAME__STRING:
				getGuestAccountUsername((String)arguments.get(0));
				return null;
			case GuestsPackage.GUESTS_MANAGER___GET_GUEST_ACCOUNT_PASSWORD__STRING:
				getGuestAccountPassword((String)arguments.get(0));
				return null;
			case GuestsPackage.GUESTS_MANAGER___GENERATE_GUEST_ACCOUNT:
				generateGuestAccount();
				return null;
			case GuestsPackage.GUESTS_MANAGER___REMOVE_GUEST_ACCOUNT:
				removeGuestAccount();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GuestsManagerImpl
