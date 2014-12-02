/**
 */
package Classes.Accounts;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Account Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Classes.Accounts.AccountsPackage#getAccountType()
 * @model
 * @generated
 */
public enum AccountType implements Enumerator {
	/**
	 * The '<em><b>Manager</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANAGER_VALUE
	 * @generated
	 * @ordered
	 */
	MANAGER(0, "Manager", "Manager"),

	/**
	 * The '<em><b>Customer Service</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CUSTOMER_SERVICE_VALUE
	 * @generated
	 * @ordered
	 */
	CUSTOMER_SERVICE(1, "CustomerService", "CustomerService"),

	/**
	 * The '<em><b>Guest</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GUEST_VALUE
	 * @generated
	 * @ordered
	 */
	GUEST(2, "Guest", "Guest"),

	/**
	 * The '<em><b>Staff</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STAFF_VALUE
	 * @generated
	 * @ordered
	 */
	STAFF(3, "Staff", "Staff");

	/**
	 * The '<em><b>Manager</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Manager</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANAGER
	 * @model name="Manager"
	 * @generated
	 * @ordered
	 */
	public static final int MANAGER_VALUE = 0;

	/**
	 * The '<em><b>Customer Service</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Customer Service</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CUSTOMER_SERVICE
	 * @model name="CustomerService"
	 * @generated
	 * @ordered
	 */
	public static final int CUSTOMER_SERVICE_VALUE = 1;

	/**
	 * The '<em><b>Guest</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Guest</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GUEST
	 * @model name="Guest"
	 * @generated
	 * @ordered
	 */
	public static final int GUEST_VALUE = 2;

	/**
	 * The '<em><b>Staff</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Staff</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STAFF
	 * @model name="Staff"
	 * @generated
	 * @ordered
	 */
	public static final int STAFF_VALUE = 3;

	/**
	 * An array of all the '<em><b>Account Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AccountType[] VALUES_ARRAY =
		new AccountType[] {
			MANAGER,
			CUSTOMER_SERVICE,
			GUEST,
			STAFF,
		};

	/**
	 * A public read-only list of all the '<em><b>Account Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AccountType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Account Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccountType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccountType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Account Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccountType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AccountType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Account Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AccountType get(int value) {
		switch (value) {
			case MANAGER_VALUE: return MANAGER;
			case CUSTOMER_SERVICE_VALUE: return CUSTOMER_SERVICE;
			case GUEST_VALUE: return GUEST;
			case STAFF_VALUE: return STAFF;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AccountType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AccountType
