/**
 */
package Classes.Bookables.tests;

import Classes.Bookables.BookablesFactory;
import Classes.Bookables.RoomLocation;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Room Location</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class RoomLocationTest extends TestCase {

	/**
	 * The fixture for this Room Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomLocation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(RoomLocationTest.class);
	}

	/**
	 * Constructs a new Room Location test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RoomLocationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Room Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(RoomLocation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Room Location test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoomLocation getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(BookablesFactory.eINSTANCE.createRoomLocation());
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

} //RoomLocationTest
