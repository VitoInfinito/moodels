/**
 */
package Classes.Guests.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Classes.InvalidIDException;
import Classes.Accounts.IManageAccounts;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToGuestMapImpl;
import Classes.Guests.Guest;
import Classes.Guests.GuestsFactory;
import Classes.Guests.GuestsManager;
import Classes.Guests.GuestsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Guests.impl.GuestsManagerImpl#getGuests <em>Guests</em>}</li>
 *   <li>{@link Classes.Guests.impl.GuestsManagerImpl#getIManageAccounts <em>IManage Accounts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuestsManagerImpl extends MinimalEObjectImpl.Container implements GuestsManager {
	private final Logger logger = LoggerFactory.getLogger(GuestsManagerImpl.class);
	public static GuestsManagerImpl INSTANCE = new GuestsManagerImpl();
	
	/**
	 * The cached value of the '{@link #getGuests() <em>Guest</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuests()
	 * @generated NOT
	 * @ordered
	 */
	private EMap<String, Guest> guests;

	/**
	 * The cached value of the '{@link #getIManageAccounts() <em>IManage Accounts</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIManageAccounts()
	 * @generated NOT
	 * @ordered
	 */
	private IManageAccounts iManageAccounts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private GuestsManagerImpl() {
		super();
		guests = new EcoreEMap<String,Guest>(ECoreMapEntriesPackage.Literals.STRING_TO_GUEST_MAP, StringToGuestMapImpl.class, this, GuestsPackage.GUESTS_MANAGER__GUESTS);
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
	public EMap<String, Guest> getGuests() {
		return guests;
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
	 * Requires: 
	 * 		nothing
	 * Ensures:
	 * 		A List<String> of all guest ID:s is returned.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllGuestIDs() {
		return new ArrayList<String>(guests.keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * Requires: 
	 * 		nothing
	 * Ensures:
	 * 		if SSID == null || firstname == null || lastname == null || email == null || guests.containsKey(SSID)
	 * 			IllegalArgumentException is thrown.
	 * 		Otherwise
	 * 			A new guest is added.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addGuest(String SSID, String firstname, String lastname, String title, String email, String phone) {
		if (SSID == null) {
			logger.warn("The SSID passed was null! Invalid argument!");
			throw new IllegalArgumentException("The roomNumber was null!");
		} else if (firstname == null) {
			logger.warn("The firstname was null! Invalid argument!");
			throw new IllegalArgumentException("The basePrice was negative!");
		} else if (lastname == null) {
			logger.warn("The lastname passed was null! Invalid argument!");
			throw new IllegalArgumentException("The description was null!");
		} else if (email == null) {
			logger.warn("The email passed was null! Invalid argument!");
			throw new IllegalArgumentException("The locationInfo was null!");
		}  
		
		if (guests.containsKey(SSID)) {
			logger.warn("There is already a guest added with the SSID {}. The SSID can not be used as a unique ID!", SSID);
			throw new InvalidIDException("There is already a SSID added with the SSID " + SSID + ". The SSID can not be used as a unique ID!");
		}
		
		Guest guest = GuestsFactory.eINSTANCE.createGuest();
		
		guest.setSsid(SSID);
		guest.setFirstname(firstname);
		guest.setLastname(lastname);
		guest.setTitle(title);
		guest.setEmail(email);
		guest.setPhone(phone);
		
		guests.put(SSID, guest);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeGuestFirstName(String SSID, String firstName) {
		if(guests.contains(SSID)) {
			guests.get(SSID).setFirstname(firstName);
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeGuestLastName(String SSID, String lastName) {
		if(guests.contains(SSID)) {
			guests.get(SSID).setLastname(lastName);
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeGuestTitle(String SSID, String title) {
		if(guests.contains(SSID)) {
			guests.get(SSID).setTitle(title);
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeGuestEmail(String SSID, String eMail) {
		if(guests.contains(SSID)) {
			guests.get(SSID).setEmail(eMail);
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeGuestPhone(String SSID, String phoneNr) {
		if(guests.contains(SSID)) {
			guests.get(SSID).setPhone(phoneNr);
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGuestFirstName(String SSID) {
		if(guests.contains(SSID)) {
			return guests.get(SSID).getFirstname();
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGuestLastName(String SSID) {
		if(guests.contains(SSID)) {
			return guests.get(SSID).getLastname();
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGuestTitle(String SSID) {
		if(guests.contains(SSID)) {
			return guests.get(SSID).getTitle();
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGuestEmail(String SSID) {
		if(guests.contains(SSID)) {
			return guests.get(SSID).getEmail();
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getGuestPhone(String SSID) {
		if(guests.contains(SSID)) {
			return guests.get(SSID).getPhone();
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchGuests(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getGuestStays(String SSID) {
		if(guests.contains(SSID)) {
			return guests.get(SSID).getStays();
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getGuestRequests(String SSID) {
		if(guests.contains(SSID)) {
			return guests.get(SSID).getRequests();
		} else {
			logger.warn("A guest with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeGuestStay(String SSID, String stayID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addGuestRequest(String SSID, String requestID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeGuestRequest(String SSID, String requestID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuestAccountUsername(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuestAccountPassword(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void generateGuestAccount(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeGuestAccount(String SSID) {
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
			case GuestsPackage.GUESTS_MANAGER__GUESTS:
				return ((InternalEList<?>)getGuests()).basicRemove(otherEnd, msgs);
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
			case GuestsPackage.GUESTS_MANAGER__GUESTS:
				if (coreType) return getGuests();
				else return getGuests().map();
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
			case GuestsPackage.GUESTS_MANAGER__GUESTS:
				((EStructuralFeature.Setting)getGuests()).set(newValue);
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
			case GuestsPackage.GUESTS_MANAGER__GUESTS:
				getGuests().clear();
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
			case GuestsPackage.GUESTS_MANAGER__GUESTS:
				return guests != null && !guests.isEmpty();
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
			case GuestsPackage.GUESTS_MANAGER___GET_ALL_GUEST_IDS:
				return getAllGuestIDs();
			case GuestsPackage.GUESTS_MANAGER___ADD_GUEST__STRING_STRING_STRING_STRING_STRING_STRING:
				addGuest((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
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
			case GuestsPackage.GUESTS_MANAGER___SEARCH_GUESTS__STRING:
				return searchGuests((String)arguments.get(0));
			case GuestsPackage.GUESTS_MANAGER___GET_GUEST_STAYS__STRING:
				return getGuestStays((String)arguments.get(0));
			case GuestsPackage.GUESTS_MANAGER___GET_GUEST_REQUESTS__STRING:
				return getGuestRequests((String)arguments.get(0));
			case GuestsPackage.GUESTS_MANAGER___REMOVE_GUEST_STAY__STRING_STRING:
				removeGuestStay((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GuestsPackage.GUESTS_MANAGER___ADD_GUEST_REQUEST__STRING_STRING:
				addGuestRequest((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GuestsPackage.GUESTS_MANAGER___REMOVE_GUEST_REQUEST__STRING_STRING:
				removeGuestRequest((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GuestsPackage.GUESTS_MANAGER___GET_GUEST_ACCOUNT_USERNAME__STRING:
				return getGuestAccountUsername((String)arguments.get(0));
			case GuestsPackage.GUESTS_MANAGER___GET_GUEST_ACCOUNT_PASSWORD__STRING:
				return getGuestAccountPassword((String)arguments.get(0));
			case GuestsPackage.GUESTS_MANAGER___GENERATE_GUEST_ACCOUNT__STRING:
				generateGuestAccount((String)arguments.get(0));
				return null;
			case GuestsPackage.GUESTS_MANAGER___REMOVE_GUEST_ACCOUNT__STRING:
				removeGuestAccount((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}
} //GuestsManagerImpl
