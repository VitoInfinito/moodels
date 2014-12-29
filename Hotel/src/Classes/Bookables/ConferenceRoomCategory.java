/**
 */
package Classes.Bookables;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Conference Room Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see Classes.Bookables.BookablesPackage#getConferenceRoomCategory()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Conference Room Category'"
 * @generated
 */
public enum ConferenceRoomCategory {
	/**
	 * The '<em><b>Dining Room</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DINING_ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	DINING_ROOM(0, "DiningRoom", "DiningRoom"),

	/**
	 * The '<em><b>Lecture Room</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LECTURE_ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	LECTURE_ROOM(1, "LectureRoom", "LectureRoom"),

	/**
	 * The '<em><b>Meeting Room</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEETING_ROOM_VALUE
	 * @generated
	 * @ordered
	 */
	MEETING_ROOM(2, "MeetingRoom", "MeetingRoom"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(3, "Other", "Other");

	/**
	 * The '<em><b>Dining Room</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dining Room</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DINING_ROOM
	 * @model name="DiningRoom"
	 * @generated
	 * @ordered
	 */
	public static final int DINING_ROOM_VALUE = 0;

	/**
	 * The '<em><b>Lecture Room</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Lecture Room</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LECTURE_ROOM
	 * @model name="LectureRoom"
	 * @generated
	 * @ordered
	 */
	public static final int LECTURE_ROOM_VALUE = 1;

	/**
	 * The '<em><b>Meeting Room</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Meeting Room</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEETING_ROOM
	 * @model name="MeetingRoom"
	 * @generated
	 * @ordered
	 */
	public static final int MEETING_ROOM_VALUE = 2;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 3;

	/**
	 * An array of all the '<em><b>Conference Room Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ConferenceRoomCategory[] VALUES_ARRAY =
		new ConferenceRoomCategory[] {
			DINING_ROOM,
			LECTURE_ROOM,
			MEETING_ROOM,
			OTHER,
		};

	/**
	 * A public read-only list of all the '<em><b>Conference Room Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ConferenceRoomCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Conference Room Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConferenceRoomCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConferenceRoomCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conference Room Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConferenceRoomCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ConferenceRoomCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Conference Room Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ConferenceRoomCategory get(int value) {
		switch (value) {
			case DINING_ROOM_VALUE: return DINING_ROOM;
			case LECTURE_ROOM_VALUE: return LECTURE_ROOM;
			case MEETING_ROOM_VALUE: return MEETING_ROOM;
			case OTHER_VALUE: return OTHER;
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
	private ConferenceRoomCategory(int value, String name, String literal) {
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
	
} //ConferenceRoomCategory
