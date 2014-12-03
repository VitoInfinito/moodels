/**
 */
package Classes.Bookables;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Bookable Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Classes.Bookables.BookablesPackage#getBookableTypes()
 * @model
 * @generated
 */
public enum BookableTypes implements Enumerator {
	/**
	 * The '<em><b>Hotel Room</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOTEL_ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	HOTEL_ROOM(0, "HotelRoom", "HotelRoom"),

	/**
	 * The '<em><b>Hostel Bed</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOSTEL_BED_VALUE
	 * @generated
	 * @ordered
	 */
	HOSTEL_BED(1, "HostelBed", "HostelBed"),

	/**
	 * The '<em><b>Conference Room</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFERENCE_ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	CONFERENCE_ROOM(2, "ConferenceRoom", "ConferenceRoom");

	/**
	 * The '<em><b>Hotel Room</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hotel Room</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOTEL_ROOM
	 * @model name="HotelRoom"
	 * @generated
	 * @ordered
	 */
	public static final int HOTEL_ROOM_VALUE = 0;

	/**
	 * The '<em><b>Hostel Bed</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hostel Bed</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOSTEL_BED
	 * @model name="HostelBed"
	 * @generated
	 * @ordered
	 */
	public static final int HOSTEL_BED_VALUE = 1;

	/**
	 * The '<em><b>Conference Room</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Conference Room</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFERENCE_ROOM
	 * @model name="ConferenceRoom"
	 * @generated
	 * @ordered
	 */
	public static final int CONFERENCE_ROOM_VALUE = 2;

	/**
	 * An array of all the '<em><b>Bookable Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BookableTypes[] VALUES_ARRAY =
		new BookableTypes[] {
			HOTEL_ROOM,
			HOSTEL_BED,
			CONFERENCE_ROOM,
		};

	/**
	 * A public read-only list of all the '<em><b>Bookable Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BookableTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Bookable Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BookableTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BookableTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bookable Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BookableTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BookableTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Bookable Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BookableTypes get(int value) {
		switch (value) {
			case HOTEL_ROOM_VALUE: return HOTEL_ROOM;
			case HOSTEL_BED_VALUE: return HOSTEL_BED;
			case CONFERENCE_ROOM_VALUE: return CONFERENCE_ROOM;
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
	private BookableTypes(int value, String name, String literal) {
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
	
} //BookableTypes
