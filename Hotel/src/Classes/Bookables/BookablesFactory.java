/**
 */
package Classes.Bookables;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Classes.Bookables.BookablesPackage
 * @generated
 */
public interface BookablesFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BookablesFactory eINSTANCE = Classes.Bookables.impl.BookablesFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Room Location</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Room Location</em>'.
	 * @generated
	 */
	RoomLocation createRoomLocation();

	/**
	 * Returns a new object of class '<em>Hostel Bed</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hostel Bed</em>'.
	 * @generated
	 */
	HostelBed createHostelBed();

	/**
	 * Returns a new object of class '<em>Conference Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conference Room</em>'.
	 * @generated
	 */
	ConferenceRoom createConferenceRoom();

	/**
	 * Returns a new object of class '<em>Hotel Room</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hotel Room</em>'.
	 * @generated NOT
	 */
	HotelRoom createHotelRoom();
} //BookablesFactory
