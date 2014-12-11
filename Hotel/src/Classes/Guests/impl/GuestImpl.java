/**
 */
package Classes.Guests.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.InvalidIDException;
import Classes.Guests.Guest;
import Classes.Guests.GuestsPackage;
import Classes.Requests.RequestsManager;
import Classes.Stays.StaysManager;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Guests.impl.GuestImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link Classes.Guests.impl.GuestImpl#getLastname <em>Lastname</em>}</li>
 *   <li>{@link Classes.Guests.impl.GuestImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link Classes.Guests.impl.GuestImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link Classes.Guests.impl.GuestImpl#getPhone <em>Phone</em>}</li>
 *   <li>{@link Classes.Guests.impl.GuestImpl#getSsid <em>Ssid</em>}</li>
 *   <li>{@link Classes.Guests.impl.GuestImpl#getRequests <em>Requests</em>}</li>
 *   <li>{@link Classes.Guests.impl.GuestImpl#getStays <em>Stays</em>}</li>
 *   <li>{@link Classes.Guests.impl.GuestImpl#getAccount <em>Account</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuestImpl extends MinimalEObjectImpl.Container implements Guest {
	private final Logger logger = LoggerFactory.getLogger(GuestsManagerImpl.class);
	
	/**
	 * The default value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRSTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected String firstname = FIRSTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected static final String LASTNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLastname() <em>Lastname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastname()
	 * @generated
	 * @ordered
	 */
	protected String lastname = LASTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhone() <em>Phone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhone()
	 * @generated
	 * @ordered
	 */
	protected String phone = PHONE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSsid() <em>Ssid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsid()
	 * @generated
	 * @ordered
	 */
	protected static final String SSID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSsid() <em>Ssid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSsid()
	 * @generated
	 * @ordered
	 */
	protected String ssid = SSID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequests() <em>Requests</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<String> requests;

	/**
	 * The cached value of the '{@link #getStays() <em>Stays</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStays()
	 * @generated
	 * @ordered
	 */
	protected EList<String> stays;

	/**
	 * The default value of the '{@link #getAccount() <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccount() <em>Account</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccount()
	 * @generated
	 * @ordered
	 */
	protected String account = ACCOUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GuestsPackage.Literals.GUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstname(String newFirstname) {
		String oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuestsPackage.GUEST__FIRSTNAME, oldFirstname, firstname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastname(String newLastname) {
		String oldLastname = lastname;
		lastname = newLastname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuestsPackage.GUEST__LASTNAME, oldLastname, lastname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuestsPackage.GUEST__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuestsPackage.GUEST__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhone(String newPhone) {
		String oldPhone = phone;
		phone = newPhone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuestsPackage.GUEST__PHONE, oldPhone, phone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSsid() {
		return ssid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSsid(String newSsid) {
		String oldSsid = ssid;
		ssid = newSsid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuestsPackage.GUEST__SSID, oldSsid, ssid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRequests() {
		if (requests == null) {
			requests = new EDataTypeUniqueEList<String>(String.class, this, GuestsPackage.GUEST__REQUESTS);
		}
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStays() {
		if (stays == null) {
			stays = new EDataTypeUniqueEList<String>(String.class, this, GuestsPackage.GUEST__STAYS);
		}
		return stays;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccount() {
		return account;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccount(String newAccount) {
		String oldAccount = account;
		account = newAccount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GuestsPackage.GUEST__ACCOUNT, oldAccount, account));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addStay(String bookableID, String bookingID, Date fromDate, Date toDate) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeStay(String stayID) {
		if(stays.contains(stayID)) {
			StaysManager.INSTANCE.removeStay(stayID);
			stays.remove(stayID);
		} else {
			logger.warn("A stay with stayID {} could not be found.", stayID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRequest(String requestID, String description) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeRequest(String requestID) {
		if(stays.contains(requestID)) {
			RequestsManager.INSTANCE.deleteRequest(requestID);
			stays.remove(requestID);
		} else {
			logger.warn("A stay with requestID {} could not be found.", requestID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GuestsPackage.GUEST__FIRSTNAME:
				return getFirstname();
			case GuestsPackage.GUEST__LASTNAME:
				return getLastname();
			case GuestsPackage.GUEST__TITLE:
				return getTitle();
			case GuestsPackage.GUEST__EMAIL:
				return getEmail();
			case GuestsPackage.GUEST__PHONE:
				return getPhone();
			case GuestsPackage.GUEST__SSID:
				return getSsid();
			case GuestsPackage.GUEST__REQUESTS:
				return getRequests();
			case GuestsPackage.GUEST__STAYS:
				return getStays();
			case GuestsPackage.GUEST__ACCOUNT:
				return getAccount();
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
			case GuestsPackage.GUEST__FIRSTNAME:
				setFirstname((String)newValue);
				return;
			case GuestsPackage.GUEST__LASTNAME:
				setLastname((String)newValue);
				return;
			case GuestsPackage.GUEST__TITLE:
				setTitle((String)newValue);
				return;
			case GuestsPackage.GUEST__EMAIL:
				setEmail((String)newValue);
				return;
			case GuestsPackage.GUEST__PHONE:
				setPhone((String)newValue);
				return;
			case GuestsPackage.GUEST__SSID:
				setSsid((String)newValue);
				return;
			case GuestsPackage.GUEST__REQUESTS:
				getRequests().clear();
				getRequests().addAll((Collection<? extends String>)newValue);
				return;
			case GuestsPackage.GUEST__STAYS:
				getStays().clear();
				getStays().addAll((Collection<? extends String>)newValue);
				return;
			case GuestsPackage.GUEST__ACCOUNT:
				setAccount((String)newValue);
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
			case GuestsPackage.GUEST__FIRSTNAME:
				setFirstname(FIRSTNAME_EDEFAULT);
				return;
			case GuestsPackage.GUEST__LASTNAME:
				setLastname(LASTNAME_EDEFAULT);
				return;
			case GuestsPackage.GUEST__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case GuestsPackage.GUEST__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case GuestsPackage.GUEST__PHONE:
				setPhone(PHONE_EDEFAULT);
				return;
			case GuestsPackage.GUEST__SSID:
				setSsid(SSID_EDEFAULT);
				return;
			case GuestsPackage.GUEST__REQUESTS:
				getRequests().clear();
				return;
			case GuestsPackage.GUEST__STAYS:
				getStays().clear();
				return;
			case GuestsPackage.GUEST__ACCOUNT:
				setAccount(ACCOUNT_EDEFAULT);
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
			case GuestsPackage.GUEST__FIRSTNAME:
				return FIRSTNAME_EDEFAULT == null ? firstname != null : !FIRSTNAME_EDEFAULT.equals(firstname);
			case GuestsPackage.GUEST__LASTNAME:
				return LASTNAME_EDEFAULT == null ? lastname != null : !LASTNAME_EDEFAULT.equals(lastname);
			case GuestsPackage.GUEST__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case GuestsPackage.GUEST__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case GuestsPackage.GUEST__PHONE:
				return PHONE_EDEFAULT == null ? phone != null : !PHONE_EDEFAULT.equals(phone);
			case GuestsPackage.GUEST__SSID:
				return SSID_EDEFAULT == null ? ssid != null : !SSID_EDEFAULT.equals(ssid);
			case GuestsPackage.GUEST__REQUESTS:
				return requests != null && !requests.isEmpty();
			case GuestsPackage.GUEST__STAYS:
				return stays != null && !stays.isEmpty();
			case GuestsPackage.GUEST__ACCOUNT:
				return ACCOUNT_EDEFAULT == null ? account != null : !ACCOUNT_EDEFAULT.equals(account);
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
			case GuestsPackage.GUEST___ADD_STAY__STRING_STRING_DATE_DATE:
				addStay((String)arguments.get(0), (String)arguments.get(1), (Date)arguments.get(2), (Date)arguments.get(3));
				return null;
			case GuestsPackage.GUEST___REMOVE_STAY__STRING:
				removeStay((String)arguments.get(0));
				return null;
			case GuestsPackage.GUEST___ADD_REQUEST__STRING_STRING:
				addRequest((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case GuestsPackage.GUEST___REMOVE_REQUEST__STRING:
				removeRequest((String)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (firstname: ");
		result.append(firstname);
		result.append(", lastname: ");
		result.append(lastname);
		result.append(", title: ");
		result.append(title);
		result.append(", email: ");
		result.append(email);
		result.append(", phone: ");
		result.append(phone);
		result.append(", ssid: ");
		result.append(ssid);
		result.append(", requests: ");
		result.append(requests);
		result.append(", stays: ");
		result.append(stays);
		result.append(", account: ");
		result.append(account);
		result.append(')');
		return result.toString();
	}

} //GuestImpl
