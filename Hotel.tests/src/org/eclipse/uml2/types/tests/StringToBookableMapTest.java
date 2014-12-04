/**
 */
package org.eclipse.uml2.types.tests;

import Classes.Bookables.Bookable;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.uml2.types.TypesFactory;
import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>String To Bookable Map</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StringToBookableMapTest extends TestCase {

	/**
	 * The fixture for this String To Bookable Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<String, Bookable> fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StringToBookableMapTest.class);
	}

	/**
	 * Constructs a new String To Bookable Map test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringToBookableMapTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this String To Bookable Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Map.Entry<String, Bookable> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this String To Bookable Map test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Map.Entry<String, Bookable> getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected void setUp() throws Exception {
		setFixture((Map.Entry<String, Bookable>)TypesFactory.eINSTANCE.create(TypesPackage.Literals.STRING_TO_BOOKABLE_MAP));
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

} //StringToBookableMapTest
