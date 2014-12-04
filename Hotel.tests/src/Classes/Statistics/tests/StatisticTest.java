/**
 */
package Classes.Statistics.tests;

import Classes.Statistics.Statistic;
import Classes.Statistics.StatisticsFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Statistic</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatisticTest extends TestCase {

	/**
	 * The fixture for this Statistic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Statistic fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(StatisticTest.class);
	}

	/**
	 * Constructs a new Statistic test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Statistic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Statistic fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Statistic test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Statistic getFixture() {
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
		setFixture(StatisticsFactory.eINSTANCE.createStatistic());
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

} //StatisticTest
