/**
 */
package Classes.Guests.impl;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guest</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GuestImpl extends MinimalEObjectImpl.Container implements Guest {
	private final Logger logger = LoggerFactory.getLogger(GuestImpl.class);

	private String firstname;
	private String lastname;
	private String title;
	private String email;
	private String phone;
	private String ssid;
	private EList<String> requests;
	private EList<String> stays;
	private String account;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestImpl() {
		super();
		requests = new EDataTypeUniqueEList<String>(String.class, this, GuestsPackage.GUEST__REQUESTS);
		stays = new EDataTypeUniqueEList<String>(String.class, this, GuestsPackage.GUEST__STAYS);
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
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStays() {
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
	public void addStay(String stayID) {
		if(!stays.contains(stayID)) {
			stays.add(stayID);
		} else {
			logger.warn("A stay with stayID {} is already added.", stayID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeStay(String stayID) {
		if(stays.contains(stayID)) {
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
	public void addRequest(String requestID) {
		if(!requests.contains(requestID)) {
			requests.add(requestID);
		} else {
			logger.warn("A request with requestID {} is already added.", requestID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeRequest(String requestID) {
		if(requests.contains(requestID)) {
			requests.remove(requestID);
		} else {
			logger.warn("A request with requestID {} could not be found.", requestID);
			throw new InvalidIDException();
		}
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
