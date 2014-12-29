/**
 */
package Classes.Bookables;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conference Room</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
class ConferenceRoom extends Room {

	private static final long serialVersionUID = -9211032418459362184L;
	
	private static final ConferenceRoomCategory CATEGORY_EDEFAULT = ConferenceRoomCategory.DINING_ROOM;
	private ConferenceRoomCategory category;
	private int capacity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConferenceRoom() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConferenceRoomCategory getCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(ConferenceRoomCategory newCategory) {
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(int newCapacity) {
		capacity = newCapacity;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (category: ");
		result.append(category);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //ConferenceRoomImpl
