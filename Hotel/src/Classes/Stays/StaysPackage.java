/**
 */
package Classes.Stays;

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
 * @see Classes.Stays.StaysFactory
 * @model kind="package"
 * @generated
 */
public interface StaysPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Stays";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/Stays.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Stays";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StaysPackage eINSTANCE = Classes.Stays.impl.StaysPackageImpl.init();

	/**
	 * The meta object id for the '{@link Classes.Stays.impl.StayImpl <em>Stay</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Stays.impl.StayImpl
	 * @see Classes.Stays.impl.StaysPackageImpl#getStay()
	 * @generated
	 */
	int STAY = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY__ID = 0;

	/**
	 * The feature id for the '<em><b>Bookable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY__BOOKABLE = 1;

	/**
	 * The feature id for the '<em><b>Bills</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY__BILLS = 2;

	/**
	 * The feature id for the '<em><b>Checked In Guests</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY__CHECKED_IN_GUESTS = 3;

	/**
	 * The feature id for the '<em><b>Booking</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY__BOOKING = 4;

	/**
	 * The feature id for the '<em><b>Checked Out Guests</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY__CHECKED_OUT_GUESTS = 5;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY__FROM_DATE = 6;

	/**
	 * The feature id for the '<em><b>To Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY__TO_DATE = 7;

	/**
	 * The feature id for the '<em><b>Credit Card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY__CREDIT_CARD = 8;

	/**
	 * The number of structural features of the '<em>Stay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY_FEATURE_COUNT = 9;

	/**
	 * The operation id for the '<em>Add Bill</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY___ADD_BILL = 0;

	/**
	 * The operation id for the '<em>Add Checked In Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY___ADD_CHECKED_IN_GUEST = 1;

	/**
	 * The operation id for the '<em>Check Out Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY___CHECK_OUT_GUEST = 2;

	/**
	 * The number of operations of the '<em>Stay</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAY_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Classes.Stays.impl.CreditCardImpl <em>Credit Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Stays.impl.CreditCardImpl
	 * @see Classes.Stays.impl.StaysPackageImpl#getCreditCard()
	 * @generated
	 */
	int CREDIT_CARD = 1;

	/**
	 * The feature id for the '<em><b>Cc Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__CC_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Ccv</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__CCV = 1;

	/**
	 * The feature id for the '<em><b>Expiry Month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__EXPIRY_MONTH = 2;

	/**
	 * The feature id for the '<em><b>Expiry Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__EXPIRY_YEAR = 3;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__FIRST_NAME = 4;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD__LAST_NAME = 5;

	/**
	 * The number of structural features of the '<em>Credit Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Credit Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREDIT_CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.Stays.IStays <em>IStays</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Stays.IStays
	 * @see Classes.Stays.impl.StaysPackageImpl#getIStays()
	 * @generated
	 */
	int ISTAYS = 3;

	/**
	 * The number of structural features of the '<em>IStays</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Check In Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___CHECK_IN_GUEST = 0;

	/**
	 * The operation id for the '<em>Change Bookable Of Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___CHANGE_BOOKABLE_OF_STAY = 1;

	/**
	 * The operation id for the '<em>Add New Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___ADD_NEW_STAY = 2;

	/**
	 * The operation id for the '<em>Remove Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___REMOVE_STAY = 3;

	/**
	 * The operation id for the '<em>Add Bill To Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___ADD_BILL_TO_STAY = 4;

	/**
	 * The operation id for the '<em>Check Out Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___CHECK_OUT_GUEST = 5;

	/**
	 * The operation id for the '<em>Add Responsible Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___ADD_RESPONSIBLE_CREDIT_CARD = 6;

	/**
	 * The operation id for the '<em>Change Responsible Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___CHANGE_RESPONSIBLE_CREDIT_CARD = 7;

	/**
	 * The operation id for the '<em>Get Guests Of Hotel Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___GET_GUESTS_OF_HOTEL_STAY = 8;

	/**
	 * The operation id for the '<em>Get Bills Of Hotel Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___GET_BILLS_OF_HOTEL_STAY__STRING = 9;

	/**
	 * The operation id for the '<em>Get Bookable Of Hotel Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___GET_BOOKABLE_OF_HOTEL_STAY = 10;

	/**
	 * The operation id for the '<em>Get Booking Of Hotel Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___GET_BOOKING_OF_HOTEL_STAY = 11;

	/**
	 * The operation id for the '<em>Get All Hotel Stay IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___GET_ALL_HOTEL_STAY_IDS = 12;

	/**
	 * The operation id for the '<em>Get Checked In Guests Of Hotel Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___GET_CHECKED_IN_GUESTS_OF_HOTEL_STAY = 13;

	/**
	 * The operation id for the '<em>Get Checked Out Guests Of Hotel Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___GET_CHECKED_OUT_GUESTS_OF_HOTEL_STAY = 14;

	/**
	 * The operation id for the '<em>Search Hotel Stays</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___SEARCH_HOTEL_STAYS = 15;

	/**
	 * The operation id for the '<em>Search Hotel Stays Within Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___SEARCH_HOTEL_STAYS_WITHIN_PERIOD = 16;

	/**
	 * The operation id for the '<em>Get All Hotel Stays Within Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___GET_ALL_HOTEL_STAYS_WITHIN_PERIOD = 17;

	/**
	 * The operation id for the '<em>Get All Unpayed Bills Of Hotel Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___GET_ALL_UNPAYED_BILLS_OF_HOTEL_STAY = 18;

	/**
	 * The operation id for the '<em>Bill Credit Card With All Unpaid Bills Of Hotel Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___BILL_CREDIT_CARD_WITH_ALL_UNPAID_BILLS_OF_HOTEL_STAY = 19;

	/**
	 * The operation id for the '<em>Is Responsible Credit Card Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___IS_RESPONSIBLE_CREDIT_CARD_ADDED = 20;

	/**
	 * The operation id for the '<em>Change Period Of Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___CHANGE_PERIOD_OF_STAY = 21;

	/**
	 * The operation id for the '<em>Remove Bill From Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS___REMOVE_BILL_FROM_STAY = 22;

	/**
	 * The number of operations of the '<em>IStays</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTAYS_OPERATION_COUNT = 23;

	/**
	 * The meta object id for the '{@link Classes.Stays.impl.StaysManagerImpl <em>Manager</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Stays.impl.StaysManagerImpl
	 * @see Classes.Stays.impl.StaysPackageImpl#getStaysManager()
	 * @generated
	 */
	int STAYS_MANAGER = 2;

	/**
	 * The feature id for the '<em><b>Stay</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER__STAY = ISTAYS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Customer Provides</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER__CUSTOMER_PROVIDES = ISTAYS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IBills</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER__IBILLS = ISTAYS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>IGuests</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER__IGUESTS = ISTAYS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER_FEATURE_COUNT = ISTAYS_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Check In Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___CHECK_IN_GUEST = ISTAYS___CHECK_IN_GUEST;

	/**
	 * The operation id for the '<em>Change Bookable Of Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___CHANGE_BOOKABLE_OF_STAY = ISTAYS___CHANGE_BOOKABLE_OF_STAY;

	/**
	 * The operation id for the '<em>Add New Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___ADD_NEW_STAY = ISTAYS___ADD_NEW_STAY;

	/**
	 * The operation id for the '<em>Remove Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___REMOVE_STAY = ISTAYS___REMOVE_STAY;

	/**
	 * The operation id for the '<em>Add Bill To Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___ADD_BILL_TO_STAY = ISTAYS___ADD_BILL_TO_STAY;

	/**
	 * The operation id for the '<em>Check Out Guest</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___CHECK_OUT_GUEST = ISTAYS___CHECK_OUT_GUEST;

	/**
	 * The operation id for the '<em>Add Responsible Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___ADD_RESPONSIBLE_CREDIT_CARD = ISTAYS___ADD_RESPONSIBLE_CREDIT_CARD;

	/**
	 * The operation id for the '<em>Change Responsible Credit Card</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___CHANGE_RESPONSIBLE_CREDIT_CARD = ISTAYS___CHANGE_RESPONSIBLE_CREDIT_CARD;

	/**
	 * The operation id for the '<em>Get Guests Of Hotel Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___GET_GUESTS_OF_HOTEL_STAY = ISTAYS___GET_GUESTS_OF_HOTEL_STAY;

	/**
	 * The operation id for the '<em>Get Bills Of Hotel Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___GET_BILLS_OF_HOTEL_STAY__STRING = ISTAYS___GET_BILLS_OF_HOTEL_STAY__STRING;

	/**
	 * The operation id for the '<em>Get Bookable Of Hotel Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___GET_BOOKABLE_OF_HOTEL_STAY = ISTAYS___GET_BOOKABLE_OF_HOTEL_STAY;

	/**
	 * The operation id for the '<em>Get Booking Of Hotel Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___GET_BOOKING_OF_HOTEL_STAY = ISTAYS___GET_BOOKING_OF_HOTEL_STAY;

	/**
	 * The operation id for the '<em>Get All Hotel Stay IDs</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___GET_ALL_HOTEL_STAY_IDS = ISTAYS___GET_ALL_HOTEL_STAY_IDS;

	/**
	 * The operation id for the '<em>Get Checked In Guests Of Hotel Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___GET_CHECKED_IN_GUESTS_OF_HOTEL_STAY = ISTAYS___GET_CHECKED_IN_GUESTS_OF_HOTEL_STAY;

	/**
	 * The operation id for the '<em>Get Checked Out Guests Of Hotel Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___GET_CHECKED_OUT_GUESTS_OF_HOTEL_STAY = ISTAYS___GET_CHECKED_OUT_GUESTS_OF_HOTEL_STAY;

	/**
	 * The operation id for the '<em>Search Hotel Stays</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___SEARCH_HOTEL_STAYS = ISTAYS___SEARCH_HOTEL_STAYS;

	/**
	 * The operation id for the '<em>Search Hotel Stays Within Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___SEARCH_HOTEL_STAYS_WITHIN_PERIOD = ISTAYS___SEARCH_HOTEL_STAYS_WITHIN_PERIOD;

	/**
	 * The operation id for the '<em>Get All Hotel Stays Within Period</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___GET_ALL_HOTEL_STAYS_WITHIN_PERIOD = ISTAYS___GET_ALL_HOTEL_STAYS_WITHIN_PERIOD;

	/**
	 * The operation id for the '<em>Get All Unpayed Bills Of Hotel Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___GET_ALL_UNPAYED_BILLS_OF_HOTEL_STAY = ISTAYS___GET_ALL_UNPAYED_BILLS_OF_HOTEL_STAY;

	/**
	 * The operation id for the '<em>Bill Credit Card With All Unpaid Bills Of Hotel Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___BILL_CREDIT_CARD_WITH_ALL_UNPAID_BILLS_OF_HOTEL_STAY = ISTAYS___BILL_CREDIT_CARD_WITH_ALL_UNPAID_BILLS_OF_HOTEL_STAY;

	/**
	 * The operation id for the '<em>Is Responsible Credit Card Added</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___IS_RESPONSIBLE_CREDIT_CARD_ADDED = ISTAYS___IS_RESPONSIBLE_CREDIT_CARD_ADDED;

	/**
	 * The operation id for the '<em>Change Period Of Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___CHANGE_PERIOD_OF_STAY = ISTAYS___CHANGE_PERIOD_OF_STAY;

	/**
	 * The operation id for the '<em>Remove Bill From Stay</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER___REMOVE_BILL_FROM_STAY = ISTAYS___REMOVE_BILL_FROM_STAY;

	/**
	 * The number of operations of the '<em>Manager</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STAYS_MANAGER_OPERATION_COUNT = ISTAYS_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Classes.Stays.Stay <em>Stay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stay</em>'.
	 * @see Classes.Stays.Stay
	 * @generated
	 */
	EClass getStay();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Stays.Stay#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Classes.Stays.Stay#getID()
	 * @see #getStay()
	 * @generated
	 */
	EAttribute getStay_ID();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Stays.Stay#getBookable <em>Bookable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bookable</em>'.
	 * @see Classes.Stays.Stay#getBookable()
	 * @see #getStay()
	 * @generated
	 */
	EAttribute getStay_Bookable();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.Stays.Stay#getBills <em>Bills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bills</em>'.
	 * @see Classes.Stays.Stay#getBills()
	 * @see #getStay()
	 * @generated
	 */
	EAttribute getStay_Bills();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.Stays.Stay#getCheckedInGuests <em>Checked In Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Checked In Guests</em>'.
	 * @see Classes.Stays.Stay#getCheckedInGuests()
	 * @see #getStay()
	 * @generated
	 */
	EAttribute getStay_CheckedInGuests();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Stays.Stay#getBooking <em>Booking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Booking</em>'.
	 * @see Classes.Stays.Stay#getBooking()
	 * @see #getStay()
	 * @generated
	 */
	EAttribute getStay_Booking();

	/**
	 * Returns the meta object for the attribute list '{@link Classes.Stays.Stay#getCheckedOutGuests <em>Checked Out Guests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Checked Out Guests</em>'.
	 * @see Classes.Stays.Stay#getCheckedOutGuests()
	 * @see #getStay()
	 * @generated
	 */
	EAttribute getStay_CheckedOutGuests();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Stays.Stay#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Date</em>'.
	 * @see Classes.Stays.Stay#getFromDate()
	 * @see #getStay()
	 * @generated
	 */
	EAttribute getStay_FromDate();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Stays.Stay#getToDate <em>To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>To Date</em>'.
	 * @see Classes.Stays.Stay#getToDate()
	 * @see #getStay()
	 * @generated
	 */
	EAttribute getStay_ToDate();

	/**
	 * Returns the meta object for the reference '{@link Classes.Stays.Stay#getCreditCard <em>Credit Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Credit Card</em>'.
	 * @see Classes.Stays.Stay#getCreditCard()
	 * @see #getStay()
	 * @generated
	 */
	EReference getStay_CreditCard();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.Stay#addBill() <em>Add Bill</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Bill</em>' operation.
	 * @see Classes.Stays.Stay#addBill()
	 * @generated
	 */
	EOperation getStay__AddBill();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.Stay#addCheckedInGuest() <em>Add Checked In Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Checked In Guest</em>' operation.
	 * @see Classes.Stays.Stay#addCheckedInGuest()
	 * @generated
	 */
	EOperation getStay__AddCheckedInGuest();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.Stay#checkOutGuest() <em>Check Out Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out Guest</em>' operation.
	 * @see Classes.Stays.Stay#checkOutGuest()
	 * @generated
	 */
	EOperation getStay__CheckOutGuest();

	/**
	 * Returns the meta object for class '{@link Classes.Stays.CreditCard <em>Credit Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Credit Card</em>'.
	 * @see Classes.Stays.CreditCard
	 * @generated
	 */
	EClass getCreditCard();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Stays.CreditCard#getCcNumber <em>Cc Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cc Number</em>'.
	 * @see Classes.Stays.CreditCard#getCcNumber()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_CcNumber();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Stays.CreditCard#getCcv <em>Ccv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ccv</em>'.
	 * @see Classes.Stays.CreditCard#getCcv()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_Ccv();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Stays.CreditCard#getExpiryMonth <em>Expiry Month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Month</em>'.
	 * @see Classes.Stays.CreditCard#getExpiryMonth()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_ExpiryMonth();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Stays.CreditCard#getExpiryYear <em>Expiry Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiry Year</em>'.
	 * @see Classes.Stays.CreditCard#getExpiryYear()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_ExpiryYear();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Stays.CreditCard#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see Classes.Stays.CreditCard#getFirstName()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Stays.CreditCard#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see Classes.Stays.CreditCard#getLastName()
	 * @see #getCreditCard()
	 * @generated
	 */
	EAttribute getCreditCard_LastName();

	/**
	 * Returns the meta object for class '{@link Classes.Stays.StaysManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manager</em>'.
	 * @see Classes.Stays.StaysManager
	 * @generated
	 */
	EClass getStaysManager();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Stays.StaysManager#getStay <em>Stay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Stay</em>'.
	 * @see Classes.Stays.StaysManager#getStay()
	 * @see #getStaysManager()
	 * @generated
	 */
	EReference getStaysManager_Stay();

	/**
	 * Returns the meta object for the reference '{@link Classes.Stays.StaysManager#getCustomerProvides <em>Customer Provides</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Customer Provides</em>'.
	 * @see Classes.Stays.StaysManager#getCustomerProvides()
	 * @see #getStaysManager()
	 * @generated
	 */
	EReference getStaysManager_CustomerProvides();

	/**
	 * Returns the meta object for the reference '{@link Classes.Stays.StaysManager#getIBills <em>IBills</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IBills</em>'.
	 * @see Classes.Stays.StaysManager#getIBills()
	 * @see #getStaysManager()
	 * @generated
	 */
	EReference getStaysManager_IBills();

	/**
	 * Returns the meta object for the reference '{@link Classes.Stays.StaysManager#getIGuests <em>IGuests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IGuests</em>'.
	 * @see Classes.Stays.StaysManager#getIGuests()
	 * @see #getStaysManager()
	 * @generated
	 */
	EReference getStaysManager_IGuests();

	/**
	 * Returns the meta object for class '{@link Classes.Stays.IStays <em>IStays</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IStays</em>'.
	 * @see Classes.Stays.IStays
	 * @generated
	 */
	EClass getIStays();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#checkInGuest() <em>Check In Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check In Guest</em>' operation.
	 * @see Classes.Stays.IStays#checkInGuest()
	 * @generated
	 */
	EOperation getIStays__CheckInGuest();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#changeBookableOfStay() <em>Change Bookable Of Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Bookable Of Stay</em>' operation.
	 * @see Classes.Stays.IStays#changeBookableOfStay()
	 * @generated
	 */
	EOperation getIStays__ChangeBookableOfStay();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#addNewStay() <em>Add New Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add New Stay</em>' operation.
	 * @see Classes.Stays.IStays#addNewStay()
	 * @generated
	 */
	EOperation getIStays__AddNewStay();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#removeStay() <em>Remove Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Stay</em>' operation.
	 * @see Classes.Stays.IStays#removeStay()
	 * @generated
	 */
	EOperation getIStays__RemoveStay();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#addBillToStay() <em>Add Bill To Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Bill To Stay</em>' operation.
	 * @see Classes.Stays.IStays#addBillToStay()
	 * @generated
	 */
	EOperation getIStays__AddBillToStay();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#checkOutGuest() <em>Check Out Guest</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Check Out Guest</em>' operation.
	 * @see Classes.Stays.IStays#checkOutGuest()
	 * @generated
	 */
	EOperation getIStays__CheckOutGuest();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#addResponsibleCreditCard() <em>Add Responsible Credit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Responsible Credit Card</em>' operation.
	 * @see Classes.Stays.IStays#addResponsibleCreditCard()
	 * @generated
	 */
	EOperation getIStays__AddResponsibleCreditCard();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#changeResponsibleCreditCard() <em>Change Responsible Credit Card</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Responsible Credit Card</em>' operation.
	 * @see Classes.Stays.IStays#changeResponsibleCreditCard()
	 * @generated
	 */
	EOperation getIStays__ChangeResponsibleCreditCard();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#getGuestsOfHotelStay() <em>Get Guests Of Hotel Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Guests Of Hotel Stay</em>' operation.
	 * @see Classes.Stays.IStays#getGuestsOfHotelStay()
	 * @generated
	 */
	EOperation getIStays__GetGuestsOfHotelStay();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#getBillsOfHotelStay(java.lang.String) <em>Get Bills Of Hotel Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bills Of Hotel Stay</em>' operation.
	 * @see Classes.Stays.IStays#getBillsOfHotelStay(java.lang.String)
	 * @generated
	 */
	EOperation getIStays__GetBillsOfHotelStay__String();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#getBookableOfHotelStay() <em>Get Bookable Of Hotel Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Bookable Of Hotel Stay</em>' operation.
	 * @see Classes.Stays.IStays#getBookableOfHotelStay()
	 * @generated
	 */
	EOperation getIStays__GetBookableOfHotelStay();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#getBookingOfHotelStay() <em>Get Booking Of Hotel Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Booking Of Hotel Stay</em>' operation.
	 * @see Classes.Stays.IStays#getBookingOfHotelStay()
	 * @generated
	 */
	EOperation getIStays__GetBookingOfHotelStay();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#getAllHotelStayIDs() <em>Get All Hotel Stay IDs</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Hotel Stay IDs</em>' operation.
	 * @see Classes.Stays.IStays#getAllHotelStayIDs()
	 * @generated
	 */
	EOperation getIStays__GetAllHotelStayIDs();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#getCheckedInGuestsOfHotelStay() <em>Get Checked In Guests Of Hotel Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Checked In Guests Of Hotel Stay</em>' operation.
	 * @see Classes.Stays.IStays#getCheckedInGuestsOfHotelStay()
	 * @generated
	 */
	EOperation getIStays__GetCheckedInGuestsOfHotelStay();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#getCheckedOutGuestsOfHotelStay() <em>Get Checked Out Guests Of Hotel Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Checked Out Guests Of Hotel Stay</em>' operation.
	 * @see Classes.Stays.IStays#getCheckedOutGuestsOfHotelStay()
	 * @generated
	 */
	EOperation getIStays__GetCheckedOutGuestsOfHotelStay();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#searchHotelStays() <em>Search Hotel Stays</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Hotel Stays</em>' operation.
	 * @see Classes.Stays.IStays#searchHotelStays()
	 * @generated
	 */
	EOperation getIStays__SearchHotelStays();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#searchHotelStaysWithinPeriod() <em>Search Hotel Stays Within Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search Hotel Stays Within Period</em>' operation.
	 * @see Classes.Stays.IStays#searchHotelStaysWithinPeriod()
	 * @generated
	 */
	EOperation getIStays__SearchHotelStaysWithinPeriod();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#getAllHotelStaysWithinPeriod() <em>Get All Hotel Stays Within Period</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Hotel Stays Within Period</em>' operation.
	 * @see Classes.Stays.IStays#getAllHotelStaysWithinPeriod()
	 * @generated
	 */
	EOperation getIStays__GetAllHotelStaysWithinPeriod();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#getAllUnpayedBillsOfHotelStay() <em>Get All Unpayed Bills Of Hotel Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get All Unpayed Bills Of Hotel Stay</em>' operation.
	 * @see Classes.Stays.IStays#getAllUnpayedBillsOfHotelStay()
	 * @generated
	 */
	EOperation getIStays__GetAllUnpayedBillsOfHotelStay();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#billCreditCardWithAllUnpaidBillsOfHotelStay() <em>Bill Credit Card With All Unpaid Bills Of Hotel Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Bill Credit Card With All Unpaid Bills Of Hotel Stay</em>' operation.
	 * @see Classes.Stays.IStays#billCreditCardWithAllUnpaidBillsOfHotelStay()
	 * @generated
	 */
	EOperation getIStays__BillCreditCardWithAllUnpaidBillsOfHotelStay();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#isResponsibleCreditCardAdded() <em>Is Responsible Credit Card Added</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Responsible Credit Card Added</em>' operation.
	 * @see Classes.Stays.IStays#isResponsibleCreditCardAdded()
	 * @generated
	 */
	EOperation getIStays__IsResponsibleCreditCardAdded();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#changePeriodOfStay() <em>Change Period Of Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Change Period Of Stay</em>' operation.
	 * @see Classes.Stays.IStays#changePeriodOfStay()
	 * @generated
	 */
	EOperation getIStays__ChangePeriodOfStay();

	/**
	 * Returns the meta object for the '{@link Classes.Stays.IStays#removeBillFromStay() <em>Remove Bill From Stay</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Bill From Stay</em>' operation.
	 * @see Classes.Stays.IStays#removeBillFromStay()
	 * @generated
	 */
	EOperation getIStays__RemoveBillFromStay();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	StaysFactory getStaysFactory();

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
		 * The meta object literal for the '{@link Classes.Stays.impl.StayImpl <em>Stay</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Stays.impl.StayImpl
		 * @see Classes.Stays.impl.StaysPackageImpl#getStay()
		 * @generated
		 */
		EClass STAY = eINSTANCE.getStay();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAY__ID = eINSTANCE.getStay_ID();

		/**
		 * The meta object literal for the '<em><b>Bookable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAY__BOOKABLE = eINSTANCE.getStay_Bookable();

		/**
		 * The meta object literal for the '<em><b>Bills</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAY__BILLS = eINSTANCE.getStay_Bills();

		/**
		 * The meta object literal for the '<em><b>Checked In Guests</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAY__CHECKED_IN_GUESTS = eINSTANCE.getStay_CheckedInGuests();

		/**
		 * The meta object literal for the '<em><b>Booking</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAY__BOOKING = eINSTANCE.getStay_Booking();

		/**
		 * The meta object literal for the '<em><b>Checked Out Guests</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAY__CHECKED_OUT_GUESTS = eINSTANCE.getStay_CheckedOutGuests();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAY__FROM_DATE = eINSTANCE.getStay_FromDate();

		/**
		 * The meta object literal for the '<em><b>To Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STAY__TO_DATE = eINSTANCE.getStay_ToDate();

		/**
		 * The meta object literal for the '<em><b>Credit Card</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAY__CREDIT_CARD = eINSTANCE.getStay_CreditCard();

		/**
		 * The meta object literal for the '<em><b>Add Bill</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAY___ADD_BILL = eINSTANCE.getStay__AddBill();

		/**
		 * The meta object literal for the '<em><b>Add Checked In Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAY___ADD_CHECKED_IN_GUEST = eINSTANCE.getStay__AddCheckedInGuest();

		/**
		 * The meta object literal for the '<em><b>Check Out Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation STAY___CHECK_OUT_GUEST = eINSTANCE.getStay__CheckOutGuest();

		/**
		 * The meta object literal for the '{@link Classes.Stays.impl.CreditCardImpl <em>Credit Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Stays.impl.CreditCardImpl
		 * @see Classes.Stays.impl.StaysPackageImpl#getCreditCard()
		 * @generated
		 */
		EClass CREDIT_CARD = eINSTANCE.getCreditCard();

		/**
		 * The meta object literal for the '<em><b>Cc Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__CC_NUMBER = eINSTANCE.getCreditCard_CcNumber();

		/**
		 * The meta object literal for the '<em><b>Ccv</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__CCV = eINSTANCE.getCreditCard_Ccv();

		/**
		 * The meta object literal for the '<em><b>Expiry Month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__EXPIRY_MONTH = eINSTANCE.getCreditCard_ExpiryMonth();

		/**
		 * The meta object literal for the '<em><b>Expiry Year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__EXPIRY_YEAR = eINSTANCE.getCreditCard_ExpiryYear();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__FIRST_NAME = eINSTANCE.getCreditCard_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREDIT_CARD__LAST_NAME = eINSTANCE.getCreditCard_LastName();

		/**
		 * The meta object literal for the '{@link Classes.Stays.impl.StaysManagerImpl <em>Manager</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Stays.impl.StaysManagerImpl
		 * @see Classes.Stays.impl.StaysPackageImpl#getStaysManager()
		 * @generated
		 */
		EClass STAYS_MANAGER = eINSTANCE.getStaysManager();

		/**
		 * The meta object literal for the '<em><b>Stay</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAYS_MANAGER__STAY = eINSTANCE.getStaysManager_Stay();

		/**
		 * The meta object literal for the '<em><b>Customer Provides</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAYS_MANAGER__CUSTOMER_PROVIDES = eINSTANCE.getStaysManager_CustomerProvides();

		/**
		 * The meta object literal for the '<em><b>IBills</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAYS_MANAGER__IBILLS = eINSTANCE.getStaysManager_IBills();

		/**
		 * The meta object literal for the '<em><b>IGuests</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STAYS_MANAGER__IGUESTS = eINSTANCE.getStaysManager_IGuests();

		/**
		 * The meta object literal for the '{@link Classes.Stays.IStays <em>IStays</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Stays.IStays
		 * @see Classes.Stays.impl.StaysPackageImpl#getIStays()
		 * @generated
		 */
		EClass ISTAYS = eINSTANCE.getIStays();

		/**
		 * The meta object literal for the '<em><b>Check In Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___CHECK_IN_GUEST = eINSTANCE.getIStays__CheckInGuest();

		/**
		 * The meta object literal for the '<em><b>Change Bookable Of Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___CHANGE_BOOKABLE_OF_STAY = eINSTANCE.getIStays__ChangeBookableOfStay();

		/**
		 * The meta object literal for the '<em><b>Add New Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___ADD_NEW_STAY = eINSTANCE.getIStays__AddNewStay();

		/**
		 * The meta object literal for the '<em><b>Remove Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___REMOVE_STAY = eINSTANCE.getIStays__RemoveStay();

		/**
		 * The meta object literal for the '<em><b>Add Bill To Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___ADD_BILL_TO_STAY = eINSTANCE.getIStays__AddBillToStay();

		/**
		 * The meta object literal for the '<em><b>Check Out Guest</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___CHECK_OUT_GUEST = eINSTANCE.getIStays__CheckOutGuest();

		/**
		 * The meta object literal for the '<em><b>Add Responsible Credit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___ADD_RESPONSIBLE_CREDIT_CARD = eINSTANCE.getIStays__AddResponsibleCreditCard();

		/**
		 * The meta object literal for the '<em><b>Change Responsible Credit Card</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___CHANGE_RESPONSIBLE_CREDIT_CARD = eINSTANCE.getIStays__ChangeResponsibleCreditCard();

		/**
		 * The meta object literal for the '<em><b>Get Guests Of Hotel Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___GET_GUESTS_OF_HOTEL_STAY = eINSTANCE.getIStays__GetGuestsOfHotelStay();

		/**
		 * The meta object literal for the '<em><b>Get Bills Of Hotel Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___GET_BILLS_OF_HOTEL_STAY__STRING = eINSTANCE.getIStays__GetBillsOfHotelStay__String();

		/**
		 * The meta object literal for the '<em><b>Get Bookable Of Hotel Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___GET_BOOKABLE_OF_HOTEL_STAY = eINSTANCE.getIStays__GetBookableOfHotelStay();

		/**
		 * The meta object literal for the '<em><b>Get Booking Of Hotel Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___GET_BOOKING_OF_HOTEL_STAY = eINSTANCE.getIStays__GetBookingOfHotelStay();

		/**
		 * The meta object literal for the '<em><b>Get All Hotel Stay IDs</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___GET_ALL_HOTEL_STAY_IDS = eINSTANCE.getIStays__GetAllHotelStayIDs();

		/**
		 * The meta object literal for the '<em><b>Get Checked In Guests Of Hotel Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___GET_CHECKED_IN_GUESTS_OF_HOTEL_STAY = eINSTANCE.getIStays__GetCheckedInGuestsOfHotelStay();

		/**
		 * The meta object literal for the '<em><b>Get Checked Out Guests Of Hotel Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___GET_CHECKED_OUT_GUESTS_OF_HOTEL_STAY = eINSTANCE.getIStays__GetCheckedOutGuestsOfHotelStay();

		/**
		 * The meta object literal for the '<em><b>Search Hotel Stays</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___SEARCH_HOTEL_STAYS = eINSTANCE.getIStays__SearchHotelStays();

		/**
		 * The meta object literal for the '<em><b>Search Hotel Stays Within Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___SEARCH_HOTEL_STAYS_WITHIN_PERIOD = eINSTANCE.getIStays__SearchHotelStaysWithinPeriod();

		/**
		 * The meta object literal for the '<em><b>Get All Hotel Stays Within Period</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___GET_ALL_HOTEL_STAYS_WITHIN_PERIOD = eINSTANCE.getIStays__GetAllHotelStaysWithinPeriod();

		/**
		 * The meta object literal for the '<em><b>Get All Unpayed Bills Of Hotel Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___GET_ALL_UNPAYED_BILLS_OF_HOTEL_STAY = eINSTANCE.getIStays__GetAllUnpayedBillsOfHotelStay();

		/**
		 * The meta object literal for the '<em><b>Bill Credit Card With All Unpaid Bills Of Hotel Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___BILL_CREDIT_CARD_WITH_ALL_UNPAID_BILLS_OF_HOTEL_STAY = eINSTANCE.getIStays__BillCreditCardWithAllUnpaidBillsOfHotelStay();

		/**
		 * The meta object literal for the '<em><b>Is Responsible Credit Card Added</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___IS_RESPONSIBLE_CREDIT_CARD_ADDED = eINSTANCE.getIStays__IsResponsibleCreditCardAdded();

		/**
		 * The meta object literal for the '<em><b>Change Period Of Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___CHANGE_PERIOD_OF_STAY = eINSTANCE.getIStays__ChangePeriodOfStay();

		/**
		 * The meta object literal for the '<em><b>Remove Bill From Stay</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTAYS___REMOVE_BILL_FROM_STAY = eINSTANCE.getIStays__RemoveBillFromStay();

	}

} //StaysPackage
