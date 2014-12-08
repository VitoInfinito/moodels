/**
 */
package Classes.Guests;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Classes.Guests.GuestsFactory
 * @model kind="package"
 * @generated
 */
public interface GuestsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Guests";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/Guests.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Guests";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GuestsPackage eINSTANCE = Classes.Guests.impl.GuestsPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.Guests.IGuests <em>IGuests</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Guests.IGuests
	 * @see Classes.Guests.impl.GuestsPackageImpl#getIGuests()
	 * @generated
	 */
	int IGUESTS = 2;

	/**
	 * The number of structural features of the '<em>IGuests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get All Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GET_ALL_GUESTS = 0;

	/**
	 * The operation id for the '<em>Add Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___ADD_GUEST = 1;

	/**
	 * The operation id for the '<em>Change Guest First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___CHANGE_GUEST_FIRST_NAME__STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Change Guest Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___CHANGE_GUEST_LAST_NAME__STRING_STRING = 3;

	/**
	 * The operation id for the '<em>Change Guest Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___CHANGE_GUEST_TITLE__STRING_STRING = 4;

	/**
	 * The operation id for the '<em>Change Guest Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___CHANGE_GUEST_EMAIL = 5;

	/**
	 * The operation id for the '<em>Change Guest Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___CHANGE_GUEST_PHONE = 6;

	/**
	 * The operation id for the '<em>Get Guest First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GET_GUEST_FIRST_NAME = 7;

	/**
	 * The operation id for the '<em>Get Guest Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GET_GUEST_LAST_NAME__STRING = 8;

	/**
	 * The operation id for the '<em>Get Guest Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GET_GUEST_TITLE = 9;

	/**
	 * The operation id for the '<em>Get Guest Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GET_GUEST_EMAIL = 10;

	/**
	 * The operation id for the '<em>Get Guest Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GET_GUEST_PHONE = 11;

	/**
	 * The operation id for the '<em>Search Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___SEARCH_GUESTS = 12;

	/**
	 * The operation id for the '<em>Get Guest Stays</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GET_GUEST_STAYS = 13;

	/**
	 * The operation id for the '<em>Get Guest Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GET_GUEST_REQUESTS = 14;

	/**
	 * The operation id for the '<em>Remove Guest Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___REMOVE_GUEST_STAY = 15;

	/**
	 * The operation id for the '<em>Add Guest Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___ADD_GUEST_REQUEST = 16;

	/**
	 * The operation id for the '<em>Remove Guest Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___REMOVE_GUEST_REQUEST = 17;

	/**
	 * The operation id for the '<em>Get Guest Account Username</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GET_GUEST_ACCOUNT_USERNAME = 18;

	/**
	 * The operation id for the '<em>Get Guest Account Password</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GET_GUEST_ACCOUNT_PASSWORD = 19;

	/**
	 * The operation id for the '<em>Generate Guest Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GENERATE_GUEST_ACCOUNT = 20;

	/**
	 * The operation id for the '<em>Remove Guest Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___REMOVE_GUEST_ACCOUNT = 21;

	/**
	 * The number of operations of the '<em>IGuests</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS_OPERATION_COUNT = 22;

	/**
	 * The meta object id for the '{@link Classes.Guests.impl.GuestsManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Guests.impl.GuestsManagerImpl
	 * @see Classes.Guests.impl.GuestsPackageImpl#getGuestsManager()
	 * @generated
	 */
	int GUESTS_MANAGER = 0;

	/**
	 * The feature id for the '<em><b>Guest</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER__GUEST = IGUESTS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IManage Accounts</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER__IMANAGE_ACCOUNTS = IGUESTS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER_FEATURE_COUNT = IGUESTS_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Get All Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GET_ALL_GUESTS = IGUESTS___GET_ALL_GUESTS;

	/**
	 * The operation id for the '<em>Add Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___ADD_GUEST = IGUESTS___ADD_GUEST;

	/**
	 * The operation id for the '<em>Change Guest First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___CHANGE_GUEST_FIRST_NAME__STRING_STRING = IGUESTS___CHANGE_GUEST_FIRST_NAME__STRING_STRING;

	/**
	 * The operation id for the '<em>Change Guest Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___CHANGE_GUEST_LAST_NAME__STRING_STRING = IGUESTS___CHANGE_GUEST_LAST_NAME__STRING_STRING;

	/**
	 * The operation id for the '<em>Change Guest Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___CHANGE_GUEST_TITLE__STRING_STRING = IGUESTS___CHANGE_GUEST_TITLE__STRING_STRING;

	/**
	 * The operation id for the '<em>Change Guest Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___CHANGE_GUEST_EMAIL = IGUESTS___CHANGE_GUEST_EMAIL;

	/**
	 * The operation id for the '<em>Change Guest Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___CHANGE_GUEST_PHONE = IGUESTS___CHANGE_GUEST_PHONE;

	/**
	 * The operation id for the '<em>Get Guest First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GET_GUEST_FIRST_NAME = IGUESTS___GET_GUEST_FIRST_NAME;

	/**
	 * The operation id for the '<em>Get Guest Last Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GET_GUEST_LAST_NAME__STRING = IGUESTS___GET_GUEST_LAST_NAME__STRING;

	/**
	 * The operation id for the '<em>Get Guest Title</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GET_GUEST_TITLE = IGUESTS___GET_GUEST_TITLE;

	/**
	 * The operation id for the '<em>Get Guest Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GET_GUEST_EMAIL = IGUESTS___GET_GUEST_EMAIL;

	/**
	 * The operation id for the '<em>Get Guest Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GET_GUEST_PHONE = IGUESTS___GET_GUEST_PHONE;

	/**
	 * The operation id for the '<em>Search Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___SEARCH_GUESTS = IGUESTS___SEARCH_GUESTS;

	/**
	 * The operation id for the '<em>Get Guest Stays</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GET_GUEST_STAYS = IGUESTS___GET_GUEST_STAYS;

	/**
	 * The operation id for the '<em>Get Guest Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GET_GUEST_REQUESTS = IGUESTS___GET_GUEST_REQUESTS;

	/**
	 * The operation id for the '<em>Remove Guest Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___REMOVE_GUEST_STAY = IGUESTS___REMOVE_GUEST_STAY;

	/**
	 * The operation id for the '<em>Add Guest Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___ADD_GUEST_REQUEST = IGUESTS___ADD_GUEST_REQUEST;

	/**
	 * The operation id for the '<em>Remove Guest Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___REMOVE_GUEST_REQUEST = IGUESTS___REMOVE_GUEST_REQUEST;

	/**
	 * The operation id for the '<em>Get Guest Account Username</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GET_GUEST_ACCOUNT_USERNAME = IGUESTS___GET_GUEST_ACCOUNT_USERNAME;

	/**
	 * The operation id for the '<em>Get Guest Account Password</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GET_GUEST_ACCOUNT_PASSWORD = IGUESTS___GET_GUEST_ACCOUNT_PASSWORD;

	/**
	 * The operation id for the '<em>Generate Guest Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GENERATE_GUEST_ACCOUNT = IGUESTS___GENERATE_GUEST_ACCOUNT;

	/**
	 * The operation id for the '<em>Remove Guest Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___REMOVE_GUEST_ACCOUNT = IGUESTS___REMOVE_GUEST_ACCOUNT;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER_OPERATION_COUNT = IGUESTS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Classes.Guests.impl.GuestImpl <em>Guest</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Guests.impl.GuestImpl
	 * @see Classes.Guests.impl.GuestsPackageImpl#getGuest()
	 * @generated
	 */
	int GUEST = 1;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__FIRSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Lastname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__LASTNAME = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__EMAIL = 3;

	/**
	 * The feature id for the '<em><b>Phone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__PHONE = 4;

	/**
	 * The feature id for the '<em><b>Ssid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__SSID = 5;

	/**
	 * The feature id for the '<em><b>Requests</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__REQUESTS = 6;

	/**
	 * The feature id for the '<em><b>Stays</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__STAYS = 7;

	/**
	 * The feature id for the '<em><b>Account</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST__ACCOUNT = 8;

	/**
	 * The number of structural features of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Add Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___ADD_STAY = 0;

	/**
	 * The operation id for the '<em>Remove Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___REMOVE_STAY = 1;

	/**
	 * The operation id for the '<em>Add Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___ADD_REQUEST = 2;

	/**
	 * The operation id for the '<em>Remove Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___REMOVE_REQUEST = 3;

	/**
	 * The number of operations of the '<em>Guest</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST_OPERATION_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link Classes.Guests.GuestsManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see Classes.Guests.GuestsManager
	 * @generated
	 */
	EClass getGuestsManager();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Guests.GuestsManager#getGuest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guest</em>'.
	 * @see Classes.Guests.GuestsManager#getGuest()
	 * @see #getGuestsManager()
	 * @generated
	 */
	EReference getGuestsManager_Guest();

	/**
	 * Returns the meta object for the reference '{@link Classes.Guests.GuestsManager#getIManageAccounts <em>IManage Accounts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IManage Accounts</em>'.
	 * @see Classes.Guests.GuestsManager#getIManageAccounts()
	 * @see #getGuestsManager()
	 * @generated
	 */
	EReference getGuestsManager_IManageAccounts();

	/**
	 * Returns the meta object for class '{@link Classes.Guests.Guest <em>Guest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guest</em>'.
	 * @see Classes.Guests.Guest
	 * @generated
	 */
	EClass getGuest();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Guests.Guest#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see Classes.Guests.Guest#getFirstname()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_Firstname();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Guests.Guest#getLastname <em>Lastname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lastname</em>'.
	 * @see Classes.Guests.Guest#getLastname()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_Lastname();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Guests.Guest#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see Classes.Guests.Guest#getTitle()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_Title();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Guests.Guest#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see Classes.Guests.Guest#getEmail()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_Email();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Guests.Guest#getPhone <em>Phone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone</em>'.
	 * @see Classes.Guests.Guest#getPhone()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_Phone();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Guests.Guest#getSsid <em>Ssid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssid</em>'.
	 * @see Classes.Guests.Guest#getSsid()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_Ssid();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.Guests.Guest#getRequests <em>Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Requests</em>'.
	 * @see Classes.Guests.Guest#getRequests()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_Requests();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.Guests.Guest#getStays <em>Stays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stays</em>'.
	 * @see Classes.Guests.Guest#getStays()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_Stays();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Guests.Guest#getAccount <em>Account</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Account</em>'.
	 * @see Classes.Guests.Guest#getAccount()
	 * @see #getGuest()
	 * @generated
	 */
	EAttribute getGuest_Account();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.Guest#addStay() <em>Add Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Stay</em>' operation.
	 * @see Classes.Guests.Guest#addStay()
	 * @generated
	 */
	EOperation getGuest__AddStay();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.Guest#removeStay() <em>Remove Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Stay</em>' operation.
	 * @see Classes.Guests.Guest#removeStay()
	 * @generated
	 */
	EOperation getGuest__RemoveStay();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.Guest#addRequest() <em>Add Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Request</em>' operation.
	 * @see Classes.Guests.Guest#addRequest()
	 * @generated
	 */
	EOperation getGuest__AddRequest();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.Guest#removeRequest() <em>Remove Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Request</em>' operation.
	 * @see Classes.Guests.Guest#removeRequest()
	 * @generated
	 */
	EOperation getGuest__RemoveRequest();

	/**
	 * Returns the meta object for class '{@link Classes.Guests.IGuests <em>IGuests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IGuests</em>'.
	 * @see Classes.Guests.IGuests
	 * @generated
	 */
	EClass getIGuests();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getAllGuests() <em>Get All Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Guests</em>' operation.
	 * @see Classes.Guests.IGuests#getAllGuests()
	 * @generated
	 */
	EOperation getIGuests__GetAllGuests();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#addGuest() <em>Add Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Guest</em>' operation.
	 * @see Classes.Guests.IGuests#addGuest()
	 * @generated
	 */
	EOperation getIGuests__AddGuest();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#changeGuestFirstName(java.lang.String, java.lang.String) <em>Change Guest First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Guest First Name</em>' operation.
	 * @see Classes.Guests.IGuests#changeGuestFirstName(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__ChangeGuestFirstName__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#changeGuestLastName(java.lang.String, java.lang.String) <em>Change Guest Last Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Guest Last Name</em>' operation.
	 * @see Classes.Guests.IGuests#changeGuestLastName(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__ChangeGuestLastName__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#changeGuestTitle(java.lang.String, java.lang.String) <em>Change Guest Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Guest Title</em>' operation.
	 * @see Classes.Guests.IGuests#changeGuestTitle(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__ChangeGuestTitle__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#changeGuestEmail() <em>Change Guest Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Guest Email</em>' operation.
	 * @see Classes.Guests.IGuests#changeGuestEmail()
	 * @generated
	 */
	EOperation getIGuests__ChangeGuestEmail();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#changeGuestPhone() <em>Change Guest Phone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Guest Phone</em>' operation.
	 * @see Classes.Guests.IGuests#changeGuestPhone()
	 * @generated
	 */
	EOperation getIGuests__ChangeGuestPhone();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getGuestFirstName() <em>Get Guest First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guest First Name</em>' operation.
	 * @see Classes.Guests.IGuests#getGuestFirstName()
	 * @generated
	 */
	EOperation getIGuests__GetGuestFirstName();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getGuestLastName(java.lang.String) <em>Get Guest Last Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guest Last Name</em>' operation.
	 * @see Classes.Guests.IGuests#getGuestLastName(java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__GetGuestLastName__String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getGuestTitle() <em>Get Guest Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guest Title</em>' operation.
	 * @see Classes.Guests.IGuests#getGuestTitle()
	 * @generated
	 */
	EOperation getIGuests__GetGuestTitle();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getGuestEmail() <em>Get Guest Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guest Email</em>' operation.
	 * @see Classes.Guests.IGuests#getGuestEmail()
	 * @generated
	 */
	EOperation getIGuests__GetGuestEmail();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getGuestPhone() <em>Get Guest Phone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guest Phone</em>' operation.
	 * @see Classes.Guests.IGuests#getGuestPhone()
	 * @generated
	 */
	EOperation getIGuests__GetGuestPhone();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#searchGuests() <em>Search Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Guests</em>' operation.
	 * @see Classes.Guests.IGuests#searchGuests()
	 * @generated
	 */
	EOperation getIGuests__SearchGuests();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getGuestStays() <em>Get Guest Stays</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guest Stays</em>' operation.
	 * @see Classes.Guests.IGuests#getGuestStays()
	 * @generated
	 */
	EOperation getIGuests__GetGuestStays();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getGuestRequests() <em>Get Guest Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guest Requests</em>' operation.
	 * @see Classes.Guests.IGuests#getGuestRequests()
	 * @generated
	 */
	EOperation getIGuests__GetGuestRequests();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#removeGuestStay() <em>Remove Guest Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Guest Stay</em>' operation.
	 * @see Classes.Guests.IGuests#removeGuestStay()
	 * @generated
	 */
	EOperation getIGuests__RemoveGuestStay();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#addGuestRequest() <em>Add Guest Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Guest Request</em>' operation.
	 * @see Classes.Guests.IGuests#addGuestRequest()
	 * @generated
	 */
	EOperation getIGuests__AddGuestRequest();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#removeGuestRequest() <em>Remove Guest Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Guest Request</em>' operation.
	 * @see Classes.Guests.IGuests#removeGuestRequest()
	 * @generated
	 */
	EOperation getIGuests__RemoveGuestRequest();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getGuestAccountUsername() <em>Get Guest Account Username</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guest Account Username</em>' operation.
	 * @see Classes.Guests.IGuests#getGuestAccountUsername()
	 * @generated
	 */
	EOperation getIGuests__GetGuestAccountUsername();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getGuestAccountPassword() <em>Get Guest Account Password</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guest Account Password</em>' operation.
	 * @see Classes.Guests.IGuests#getGuestAccountPassword()
	 * @generated
	 */
	EOperation getIGuests__GetGuestAccountPassword();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#generateGuestAccount() <em>Generate Guest Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Guest Account</em>' operation.
	 * @see Classes.Guests.IGuests#generateGuestAccount()
	 * @generated
	 */
	EOperation getIGuests__GenerateGuestAccount();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#removeGuestAccount() <em>Remove Guest Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Guest Account</em>' operation.
	 * @see Classes.Guests.IGuests#removeGuestAccount()
	 * @generated
	 */
	EOperation getIGuests__RemoveGuestAccount();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GuestsFactory getGuestsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Classes.Guests.impl.GuestsManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Guests.impl.GuestsManagerImpl
		 * @see Classes.Guests.impl.GuestsPackageImpl#getGuestsManager()
		 * @generated
		 */
		EClass GUESTS_MANAGER = eINSTANCE.getGuestsManager();

		/**
		 * The meta object literal for the '<em><b>Guest</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUESTS_MANAGER__GUEST = eINSTANCE.getGuestsManager_Guest();

		/**
		 * The meta object literal for the '<em><b>IManage Accounts</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUESTS_MANAGER__IMANAGE_ACCOUNTS = eINSTANCE.getGuestsManager_IManageAccounts();

		/**
		 * The meta object literal for the '{@link Classes.Guests.impl.GuestImpl <em>Guest</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Guests.impl.GuestImpl
		 * @see Classes.Guests.impl.GuestsPackageImpl#getGuest()
		 * @generated
		 */
		EClass GUEST = eINSTANCE.getGuest();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__FIRSTNAME = eINSTANCE.getGuest_Firstname();

		/**
		 * The meta object literal for the '<em><b>Lastname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__LASTNAME = eINSTANCE.getGuest_Lastname();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__TITLE = eINSTANCE.getGuest_Title();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__EMAIL = eINSTANCE.getGuest_Email();

		/**
		 * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__PHONE = eINSTANCE.getGuest_Phone();

		/**
		 * The meta object literal for the '<em><b>Ssid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__SSID = eINSTANCE.getGuest_Ssid();

		/**
		 * The meta object literal for the '<em><b>Requests</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__REQUESTS = eINSTANCE.getGuest_Requests();

		/**
		 * The meta object literal for the '<em><b>Stays</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__STAYS = eINSTANCE.getGuest_Stays();

		/**
		 * The meta object literal for the '<em><b>Account</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUEST__ACCOUNT = eINSTANCE.getGuest_Account();

		/**
		 * The meta object literal for the '<em><b>Add Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST___ADD_STAY = eINSTANCE.getGuest__AddStay();

		/**
		 * The meta object literal for the '<em><b>Remove Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST___REMOVE_STAY = eINSTANCE.getGuest__RemoveStay();

		/**
		 * The meta object literal for the '<em><b>Add Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST___ADD_REQUEST = eINSTANCE.getGuest__AddRequest();

		/**
		 * The meta object literal for the '<em><b>Remove Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST___REMOVE_REQUEST = eINSTANCE.getGuest__RemoveRequest();

		/**
		 * The meta object literal for the '{@link Classes.Guests.IGuests <em>IGuests</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Guests.IGuests
		 * @see Classes.Guests.impl.GuestsPackageImpl#getIGuests()
		 * @generated
		 */
		EClass IGUESTS = eINSTANCE.getIGuests();

		/**
		 * The meta object literal for the '<em><b>Get All Guests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GET_ALL_GUESTS = eINSTANCE.getIGuests__GetAllGuests();

		/**
		 * The meta object literal for the '<em><b>Add Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___ADD_GUEST = eINSTANCE.getIGuests__AddGuest();

		/**
		 * The meta object literal for the '<em><b>Change Guest First Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___CHANGE_GUEST_FIRST_NAME__STRING_STRING = eINSTANCE.getIGuests__ChangeGuestFirstName__String_String();

		/**
		 * The meta object literal for the '<em><b>Change Guest Last Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___CHANGE_GUEST_LAST_NAME__STRING_STRING = eINSTANCE.getIGuests__ChangeGuestLastName__String_String();

		/**
		 * The meta object literal for the '<em><b>Change Guest Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___CHANGE_GUEST_TITLE__STRING_STRING = eINSTANCE.getIGuests__ChangeGuestTitle__String_String();

		/**
		 * The meta object literal for the '<em><b>Change Guest Email</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___CHANGE_GUEST_EMAIL = eINSTANCE.getIGuests__ChangeGuestEmail();

		/**
		 * The meta object literal for the '<em><b>Change Guest Phone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___CHANGE_GUEST_PHONE = eINSTANCE.getIGuests__ChangeGuestPhone();

		/**
		 * The meta object literal for the '<em><b>Get Guest First Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GET_GUEST_FIRST_NAME = eINSTANCE.getIGuests__GetGuestFirstName();

		/**
		 * The meta object literal for the '<em><b>Get Guest Last Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GET_GUEST_LAST_NAME__STRING = eINSTANCE.getIGuests__GetGuestLastName__String();

		/**
		 * The meta object literal for the '<em><b>Get Guest Title</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GET_GUEST_TITLE = eINSTANCE.getIGuests__GetGuestTitle();

		/**
		 * The meta object literal for the '<em><b>Get Guest Email</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GET_GUEST_EMAIL = eINSTANCE.getIGuests__GetGuestEmail();

		/**
		 * The meta object literal for the '<em><b>Get Guest Phone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GET_GUEST_PHONE = eINSTANCE.getIGuests__GetGuestPhone();

		/**
		 * The meta object literal for the '<em><b>Search Guests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___SEARCH_GUESTS = eINSTANCE.getIGuests__SearchGuests();

		/**
		 * The meta object literal for the '<em><b>Get Guest Stays</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GET_GUEST_STAYS = eINSTANCE.getIGuests__GetGuestStays();

		/**
		 * The meta object literal for the '<em><b>Get Guest Requests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GET_GUEST_REQUESTS = eINSTANCE.getIGuests__GetGuestRequests();

		/**
		 * The meta object literal for the '<em><b>Remove Guest Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___REMOVE_GUEST_STAY = eINSTANCE.getIGuests__RemoveGuestStay();

		/**
		 * The meta object literal for the '<em><b>Add Guest Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___ADD_GUEST_REQUEST = eINSTANCE.getIGuests__AddGuestRequest();

		/**
		 * The meta object literal for the '<em><b>Remove Guest Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___REMOVE_GUEST_REQUEST = eINSTANCE.getIGuests__RemoveGuestRequest();

		/**
		 * The meta object literal for the '<em><b>Get Guest Account Username</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GET_GUEST_ACCOUNT_USERNAME = eINSTANCE.getIGuests__GetGuestAccountUsername();

		/**
		 * The meta object literal for the '<em><b>Get Guest Account Password</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GET_GUEST_ACCOUNT_PASSWORD = eINSTANCE.getIGuests__GetGuestAccountPassword();

		/**
		 * The meta object literal for the '<em><b>Generate Guest Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GENERATE_GUEST_ACCOUNT = eINSTANCE.getIGuests__GenerateGuestAccount();

		/**
		 * The meta object literal for the '<em><b>Remove Guest Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___REMOVE_GUEST_ACCOUNT = eINSTANCE.getIGuests__RemoveGuestAccount();

	}

} //GuestsPackage
