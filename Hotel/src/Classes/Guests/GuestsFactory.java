/**
 */
package Classes.Guests;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
 class GuestsFactory implements Serializable {
	private static final long serialVersionUID = 4494938240110849854L;
	
	static GuestsFactory INSTANCE = new GuestsFactory();

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private GuestsFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guest createGuest() {
		Guest guest = new Guest();
		return guest;
	}
} //GuestsFactoryImpl
