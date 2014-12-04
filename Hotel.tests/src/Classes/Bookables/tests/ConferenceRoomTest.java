/**
 */
package Classes.Bookables.tests;

import Classes.Bookables.BookablesFactory;
import Classes.Bookables.ConferenceRoom;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Conference Room</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConferenceRoomTest extends RoomTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConferenceRoomTest.class);
	}

	/**
	 * Constructs a new Conference Room test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConferenceRoomTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Conference Room test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected ConferenceRoom getFixture() {
		return (ConferenceRoom)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BookablesFactory.eINSTANCE.createConferenceRoom());
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

} //ConferenceRoomTest
