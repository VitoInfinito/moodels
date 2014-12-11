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
	 * The operation id for the '<em>Get All Guest IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GET_ALL_GUEST_IDS = 0;

	/**
	 * The operation id for the '<em>Add Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___ADD_GUEST__STRING_STRING_STRING_STRING_STRING_STRING = 1;

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
	int IGUESTS___CHANGE_GUEST_EMAIL__STRING_STRING = 5;

	/**
	 * The operation id for the '<em>Change Guest Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___CHANGE_GUEST_PHONE__STRING_STRING = 6;

	/**
	 * The operation id for the '<em>Get Guest First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GET_GUEST_FIRST_NAME__STRING = 7;

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
	int IGUESTS___GET_GUEST_TITLE__STRING = 9;

	/**
	 * The operation id for the '<em>Get Guest Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GET_GUEST_EMAIL__STRING = 10;

	/**
	 * The operation id for the '<em>Get Guest Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GET_GUEST_PHONE__STRING = 11;

	/**
	 * The operation id for the '<em>Search Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___SEARCH_GUESTS__STRING = 12;

	/**
	 * The operation id for the '<em>Get Guest Stays</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GET_GUEST_STAYS__STRING = 13;

	/**
	 * The operation id for the '<em>Get Guest Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GET_GUEST_REQUESTS__STRING = 14;

	/**
	 * The operation id for the '<em>Remove Guest Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___REMOVE_GUEST_STAY__STRING_STRING = 15;

	/**
	 * The operation id for the '<em>Add Guest Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___ADD_GUEST_REQUEST__STRING_STRING_STRING = 16;

	/**
	 * The operation id for the '<em>Remove Guest Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___REMOVE_GUEST_REQUEST__STRING_STRING = 17;

	/**
	 * The operation id for the '<em>Get Guest Account Username</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GET_GUEST_ACCOUNT_USERNAME__STRING = 18;

	/**
	 * The operation id for the '<em>Get Guest Account Password</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GET_GUEST_ACCOUNT_PASSWORD__STRING = 19;

	/**
	 * The operation id for the '<em>Generate Guest Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___GENERATE_GUEST_ACCOUNT__STRING = 20;

	/**
	 * The operation id for the '<em>Remove Guest Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IGUESTS___REMOVE_GUEST_ACCOUNT__STRING = 21;

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
	 * The feature id for the '<em><b>Guests</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER__GUESTS = IGUESTS_FEATURE_COUNT + 0;

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
	 * The operation id for the '<em>Get All Guest IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GET_ALL_GUEST_IDS = IGUESTS___GET_ALL_GUEST_IDS;

	/**
	 * The operation id for the '<em>Add Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___ADD_GUEST__STRING_STRING_STRING_STRING_STRING_STRING = IGUESTS___ADD_GUEST__STRING_STRING_STRING_STRING_STRING_STRING;

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
	int GUESTS_MANAGER___CHANGE_GUEST_EMAIL__STRING_STRING = IGUESTS___CHANGE_GUEST_EMAIL__STRING_STRING;

	/**
	 * The operation id for the '<em>Change Guest Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___CHANGE_GUEST_PHONE__STRING_STRING = IGUESTS___CHANGE_GUEST_PHONE__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Guest First Name</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GET_GUEST_FIRST_NAME__STRING = IGUESTS___GET_GUEST_FIRST_NAME__STRING;

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
	int GUESTS_MANAGER___GET_GUEST_TITLE__STRING = IGUESTS___GET_GUEST_TITLE__STRING;

	/**
	 * The operation id for the '<em>Get Guest Email</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GET_GUEST_EMAIL__STRING = IGUESTS___GET_GUEST_EMAIL__STRING;

	/**
	 * The operation id for the '<em>Get Guest Phone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GET_GUEST_PHONE__STRING = IGUESTS___GET_GUEST_PHONE__STRING;

	/**
	 * The operation id for the '<em>Search Guests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___SEARCH_GUESTS__STRING = IGUESTS___SEARCH_GUESTS__STRING;

	/**
	 * The operation id for the '<em>Get Guest Stays</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GET_GUEST_STAYS__STRING = IGUESTS___GET_GUEST_STAYS__STRING;

	/**
	 * The operation id for the '<em>Get Guest Requests</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GET_GUEST_REQUESTS__STRING = IGUESTS___GET_GUEST_REQUESTS__STRING;

	/**
	 * The operation id for the '<em>Remove Guest Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___REMOVE_GUEST_STAY__STRING_STRING = IGUESTS___REMOVE_GUEST_STAY__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Guest Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___ADD_GUEST_REQUEST__STRING_STRING_STRING = IGUESTS___ADD_GUEST_REQUEST__STRING_STRING_STRING;

	/**
	 * The operation id for the '<em>Remove Guest Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___REMOVE_GUEST_REQUEST__STRING_STRING = IGUESTS___REMOVE_GUEST_REQUEST__STRING_STRING;

	/**
	 * The operation id for the '<em>Get Guest Account Username</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GET_GUEST_ACCOUNT_USERNAME__STRING = IGUESTS___GET_GUEST_ACCOUNT_USERNAME__STRING;

	/**
	 * The operation id for the '<em>Get Guest Account Password</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GET_GUEST_ACCOUNT_PASSWORD__STRING = IGUESTS___GET_GUEST_ACCOUNT_PASSWORD__STRING;

	/**
	 * The operation id for the '<em>Generate Guest Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___GENERATE_GUEST_ACCOUNT__STRING = IGUESTS___GENERATE_GUEST_ACCOUNT__STRING;

	/**
	 * The operation id for the '<em>Remove Guest Account</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUESTS_MANAGER___REMOVE_GUEST_ACCOUNT__STRING = IGUESTS___REMOVE_GUEST_ACCOUNT__STRING;

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
	int GUEST___ADD_STAY__STRING_STRING_DATE_DATE = 0;

	/**
	 * The operation id for the '<em>Remove Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___REMOVE_STAY__STRING = 1;

	/**
	 * The operation id for the '<em>Add Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___ADD_REQUEST__STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Remove Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUEST___REMOVE_REQUEST__STRING = 3;

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
	 * Returns the meta object for the reference list '{@link Classes.Guests.GuestsManager#getGuests <em>Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Guests</em>'.
	 * @see Classes.Guests.GuestsManager#getGuests()
	 * @see #getGuestsManager()
	 * @generated
	 */
	EReference getGuestsManager_Guests();

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
	 * Returns the meta object for the '{@link Classes.Guests.Guest#addStay(java.lang.String, java.lang.String, java.util.Date, java.util.Date) <em>Add Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Stay</em>' operation.
	 * @see Classes.Guests.Guest#addStay(java.lang.String, java.lang.String, java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getGuest__AddStay__String_String_Date_Date();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.Guest#removeStay(java.lang.String) <em>Remove Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Stay</em>' operation.
	 * @see Classes.Guests.Guest#removeStay(java.lang.String)
	 * @generated
	 */
	EOperation getGuest__RemoveStay__String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.Guest#addRequest(java.lang.String, java.lang.String) <em>Add Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Request</em>' operation.
	 * @see Classes.Guests.Guest#addRequest(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getGuest__AddRequest__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.Guest#removeRequest(java.lang.String) <em>Remove Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Request</em>' operation.
	 * @see Classes.Guests.Guest#removeRequest(java.lang.String)
	 * @generated
	 */
	EOperation getGuest__RemoveRequest__String();

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
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getAllGuestIDs() <em>Get All Guest IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Guest IDs</em>' operation.
	 * @see Classes.Guests.IGuests#getAllGuestIDs()
	 * @generated
	 */
	EOperation getIGuests__GetAllGuestIDs();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#addGuest(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Add Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Guest</em>' operation.
	 * @see Classes.Guests.IGuests#addGuest(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__AddGuest__String_String_String_String_String_String();

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
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#changeGuestEmail(java.lang.String, java.lang.String) <em>Change Guest Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Guest Email</em>' operation.
	 * @see Classes.Guests.IGuests#changeGuestEmail(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__ChangeGuestEmail__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#changeGuestPhone(java.lang.String, java.lang.String) <em>Change Guest Phone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Guest Phone</em>' operation.
	 * @see Classes.Guests.IGuests#changeGuestPhone(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__ChangeGuestPhone__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getGuestFirstName(java.lang.String) <em>Get Guest First Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guest First Name</em>' operation.
	 * @see Classes.Guests.IGuests#getGuestFirstName(java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__GetGuestFirstName__String();

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
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getGuestTitle(java.lang.String) <em>Get Guest Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guest Title</em>' operation.
	 * @see Classes.Guests.IGuests#getGuestTitle(java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__GetGuestTitle__String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getGuestEmail(java.lang.String) <em>Get Guest Email</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guest Email</em>' operation.
	 * @see Classes.Guests.IGuests#getGuestEmail(java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__GetGuestEmail__String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getGuestPhone(java.lang.String) <em>Get Guest Phone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guest Phone</em>' operation.
	 * @see Classes.Guests.IGuests#getGuestPhone(java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__GetGuestPhone__String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#searchGuests(java.lang.String) <em>Search Guests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Guests</em>' operation.
	 * @see Classes.Guests.IGuests#searchGuests(java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__SearchGuests__String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getGuestStays(java.lang.String) <em>Get Guest Stays</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guest Stays</em>' operation.
	 * @see Classes.Guests.IGuests#getGuestStays(java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__GetGuestStays__String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getGuestRequests(java.lang.String) <em>Get Guest Requests</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guest Requests</em>' operation.
	 * @see Classes.Guests.IGuests#getGuestRequests(java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__GetGuestRequests__String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#removeGuestStay(java.lang.String, java.lang.String) <em>Remove Guest Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Guest Stay</em>' operation.
	 * @see Classes.Guests.IGuests#removeGuestStay(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__RemoveGuestStay__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#addGuestRequest(java.lang.String, java.lang.String, java.lang.String) <em>Add Guest Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Guest Request</em>' operation.
	 * @see Classes.Guests.IGuests#addGuestRequest(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__AddGuestRequest__String_String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#removeGuestRequest(java.lang.String, java.lang.String) <em>Remove Guest Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Guest Request</em>' operation.
	 * @see Classes.Guests.IGuests#removeGuestRequest(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__RemoveGuestRequest__String_String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getGuestAccountUsername(java.lang.String) <em>Get Guest Account Username</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guest Account Username</em>' operation.
	 * @see Classes.Guests.IGuests#getGuestAccountUsername(java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__GetGuestAccountUsername__String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#getGuestAccountPassword(java.lang.String) <em>Get Guest Account Password</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guest Account Password</em>' operation.
	 * @see Classes.Guests.IGuests#getGuestAccountPassword(java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__GetGuestAccountPassword__String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#generateGuestAccount(java.lang.String) <em>Generate Guest Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generate Guest Account</em>' operation.
	 * @see Classes.Guests.IGuests#generateGuestAccount(java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__GenerateGuestAccount__String();

	/**
	 * Returns the meta object for the '{@link Classes.Guests.IGuests#removeGuestAccount(java.lang.String) <em>Remove Guest Account</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Guest Account</em>' operation.
	 * @see Classes.Guests.IGuests#removeGuestAccount(java.lang.String)
	 * @generated
	 */
	EOperation getIGuests__RemoveGuestAccount__String();

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
		 * The meta object literal for the '<em><b>Guests</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUESTS_MANAGER__GUESTS = eINSTANCE.getGuestsManager_Guests();

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
		EOperation GUEST___ADD_STAY__STRING_STRING_DATE_DATE = eINSTANCE.getGuest__AddStay__String_String_Date_Date();

		/**
		 * The meta object literal for the '<em><b>Remove Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST___REMOVE_STAY__STRING = eINSTANCE.getGuest__RemoveStay__String();

		/**
		 * The meta object literal for the '<em><b>Add Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST___ADD_REQUEST__STRING_STRING = eINSTANCE.getGuest__AddRequest__String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GUEST___REMOVE_REQUEST__STRING = eINSTANCE.getGuest__RemoveRequest__String();

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
		 * The meta object literal for the '<em><b>Get All Guest IDs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GET_ALL_GUEST_IDS = eINSTANCE.getIGuests__GetAllGuestIDs();

		/**
		 * The meta object literal for the '<em><b>Add Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___ADD_GUEST__STRING_STRING_STRING_STRING_STRING_STRING = eINSTANCE.getIGuests__AddGuest__String_String_String_String_String_String();

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
		EOperation IGUESTS___CHANGE_GUEST_EMAIL__STRING_STRING = eINSTANCE.getIGuests__ChangeGuestEmail__String_String();

		/**
		 * The meta object literal for the '<em><b>Change Guest Phone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___CHANGE_GUEST_PHONE__STRING_STRING = eINSTANCE.getIGuests__ChangeGuestPhone__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Guest First Name</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GET_GUEST_FIRST_NAME__STRING = eINSTANCE.getIGuests__GetGuestFirstName__String();

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
		EOperation IGUESTS___GET_GUEST_TITLE__STRING = eINSTANCE.getIGuests__GetGuestTitle__String();

		/**
		 * The meta object literal for the '<em><b>Get Guest Email</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GET_GUEST_EMAIL__STRING = eINSTANCE.getIGuests__GetGuestEmail__String();

		/**
		 * The meta object literal for the '<em><b>Get Guest Phone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GET_GUEST_PHONE__STRING = eINSTANCE.getIGuests__GetGuestPhone__String();

		/**
		 * The meta object literal for the '<em><b>Search Guests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___SEARCH_GUESTS__STRING = eINSTANCE.getIGuests__SearchGuests__String();

		/**
		 * The meta object literal for the '<em><b>Get Guest Stays</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GET_GUEST_STAYS__STRING = eINSTANCE.getIGuests__GetGuestStays__String();

		/**
		 * The meta object literal for the '<em><b>Get Guest Requests</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GET_GUEST_REQUESTS__STRING = eINSTANCE.getIGuests__GetGuestRequests__String();

		/**
		 * The meta object literal for the '<em><b>Remove Guest Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___REMOVE_GUEST_STAY__STRING_STRING = eINSTANCE.getIGuests__RemoveGuestStay__String_String();

		/**
		 * The meta object literal for the '<em><b>Add Guest Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___ADD_GUEST_REQUEST__STRING_STRING_STRING = eINSTANCE.getIGuests__AddGuestRequest__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Remove Guest Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___REMOVE_GUEST_REQUEST__STRING_STRING = eINSTANCE.getIGuests__RemoveGuestRequest__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Guest Account Username</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GET_GUEST_ACCOUNT_USERNAME__STRING = eINSTANCE.getIGuests__GetGuestAccountUsername__String();

		/**
		 * The meta object literal for the '<em><b>Get Guest Account Password</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GET_GUEST_ACCOUNT_PASSWORD__STRING = eINSTANCE.getIGuests__GetGuestAccountPassword__String();

		/**
		 * The meta object literal for the '<em><b>Generate Guest Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___GENERATE_GUEST_ACCOUNT__STRING = eINSTANCE.getIGuests__GenerateGuestAccount__String();

		/**
		 * The meta object literal for the '<em><b>Remove Guest Account</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IGUESTS___REMOVE_GUEST_ACCOUNT__STRING = eINSTANCE.getIGuests__RemoveGuestAccount__String();

	}

} //GuestsPackage
