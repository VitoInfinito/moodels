/**
 */
package Classes.Bookables.tests;

import Classes.Bookables.BookablesFactory;
import Classes.Bookables.HotelRoom;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Hotel Room</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HotelRoomTest extends RoomTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HotelRoomTest.class);
	}

	/**
	 * Constructs a new Hotel Room test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HotelRoomTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Hotel Room test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected HotelRoom getFixture() {
		return (HotelRoom)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BookablesFactory.eINSTANCE.createHotelRoom());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //HotelRoomTest
