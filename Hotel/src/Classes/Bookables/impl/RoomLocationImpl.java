/**
 */
package Classes.Bookables.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import Classes.Bookables.BookablesPackage;
import Classes.Bookables.RoomLocation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Location</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoomLocationImpl extends MinimalEObjectImpl.Container implements RoomLocation {

	private int floor;
	private String addtionalInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomLocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getFloor() {
		return floor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloor(int newFloor) {
		int oldFloor = floor;
		floor = newFloor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookablesPackage.ROOM_LOCATION__FLOOR, oldFloor, floor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddtionalInfo() {
		return addtionalInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddtionalInfo(String newAddtionalInfo) {
		String oldAddtionalInfo = addtionalInfo;
		addtionalInfo = newAddtionalInfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BookablesPackage.ROOM_LOCATION__ADDTIONAL_INFO, oldAddtionalInfo, addtionalInfo));
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
		result.append(" (floor: ");
		result.append(floor);
		result.append(", addtionalInfo: ");
		result.append(addtionalInfo);
		result.append(')');
		return result.toString();
	}

} //RoomLocationImpl
