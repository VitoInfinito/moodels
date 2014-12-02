/**
 */
package Classes.Bookables;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Hotel Room Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Classes.Bookables.BookablesPackage#getHotelRoomCategory()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Hotel Room Category'"
 * @generated
 */
public enum HotelRoomCategory implements Enumerator {
	/**
	 * The '<em><b>Standard Room</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STANDARD_ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	STANDARD_ROOM(0, "StandardRoom", "StandardRoom"),

	/**
	 * The '<em><b>Family Room</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FAMILY_ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	FAMILY_ROOM(1, "FamilyRoom", "FamilyRoom"),

	/**
	 * The '<em><b>Suite</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUITE_VALUE
	 * @generated
	 * @ordered
	 */
	SUITE(2, "Suite", "Suite");

	/**
	 * The '<em><b>Standard Room</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Standard Room</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STANDARD_ROOM
	 * @model name="StandardRoom"
	 * @generated
	 * @ordered
	 */
	public static final int STANDARD_ROOM_VALUE = 0;

	/**
	 * The '<em><b>Family Room</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Family Room</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FAMILY_ROOM
	 * @model name="FamilyRoom"
	 * @generated
	 * @ordered
	 */
	public static final int FAMILY_ROOM_VALUE = 1;

	/**
	 * The '<em><b>Suite</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Suite</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUITE
	 * @model name="Suite"
	 * @generated
	 * @ordered
	 */
	public static final int SUITE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Hotel Room Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HotelRoomCategory[] VALUES_ARRAY =
		new HotelRoomCategory[] {
			STANDARD_ROOM,
			FAMILY_ROOM,
			SUITE,
		};

	/**
	 * A public read-only list of all the '<em><b>Hotel Room Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HotelRoomCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Hotel Room Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HotelRoomCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HotelRoomCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hotel Room Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HotelRoomCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HotelRoomCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Hotel Room Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HotelRoomCategory get(int value) {
		switch (value) {
			case STANDARD_ROOM_VALUE: return STANDARD_ROOM;
			case FAMILY_ROOM_VALUE: return FAMILY_ROOM;
			case SUITE_VALUE: return SUITE;
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
	private HotelRoomCategory(int value, String name, String literal) {
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
	
} //HotelRoomCategory
