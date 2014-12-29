/**
 */
package Classes.Restaurants;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Restaurant Table</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
 class RestaurantTable implements Serializable {
	private static final long serialVersionUID = 475935089525365236L;
	private String tableNumber;
	private int numberOfSeats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RestaurantTable() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTableNumber() {
		return tableNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableNumber(String newTableNumber) {
		tableNumber = newTableNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfSeats(int newNumberOfSeats) {
		numberOfSeats = newNumberOfSeats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tableNumber: ");
		result.append(tableNumber);
		result.append(", numberOfSeats: ");
		result.append(numberOfSeats);
		result.append(')');
		return result.toString();
	}

} //RestaurantTableImpl
