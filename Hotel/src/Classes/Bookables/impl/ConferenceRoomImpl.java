/**
 */
package Classes.Bookables.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import Classes.Bookables.BookablesPackage;
import Classes.Bookables.ConferenceRoom;
import Classes.Bookables.ConferenceRoomCategory;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conference Room</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConferenceRoomImpl extends RoomImpl implements ConferenceRoom {
	private static final ConferenceRoomCategory CATEGORY_EDEFAULT = ConferenceRoomCategory.DINING_ROOM;
	private ConferenceRoomCategory category;
	private int capacity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConferenceRoomImpl() {
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
		ConferenceRoomCategory oldCategory = category;
		category = newCategory == null ? CATEGORY_EDEFAULT : newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookablesPackage.CONFERENCE_ROOM__CATEGORY, oldCategory, category));
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
		int oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookablesPackage.CONFERENCE_ROOM__CAPACITY, oldCapacity, capacity));
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
		result.append(" (category: ");
		result.append(category);
		result.append(", capacity: ");
		result.append(capacity);
		result.append(')');
		return result.toString();
	}

} //ConferenceRoomImpl
