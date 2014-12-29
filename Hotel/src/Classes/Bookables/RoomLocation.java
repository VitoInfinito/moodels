/**
 */
package Classes.Bookables;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Room Location</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
class RoomLocation implements Serializable {

	private static final long serialVersionUID = 3590396218832615270L;

	private int floor;
	private String addtionalInfo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomLocation() {
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
		floor = newFloor;
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
		addtionalInfo = newAddtionalInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (floor: ");
		result.append(floor);
		result.append(", addtionalInfo: ");
		result.append(addtionalInfo);
		result.append(')');
		return result.toString();
	}

} //RoomLocationImpl
