/**
 */
package Classes.Statistics.tests;

import Classes.Statistics.StatisticEntry;
import Classes.Statistics.StatisticsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Statistic Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatisticEntryTest extends TestCase {

	/**
	 * The fixture for this Statistic Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatisticEntry fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StatisticEntryTest.class);
	}

	/**
	 * Constructs a new Statistic Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticEntryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Statistic Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(StatisticEntry fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Statistic Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatisticEntry getFixture() {
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
		setFixture(StatisticsFactory.eINSTANCE.createStatisticEntry());
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

} //StatisticEntryTest
