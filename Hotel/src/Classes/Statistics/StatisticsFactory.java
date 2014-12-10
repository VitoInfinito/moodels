/**
 */
package Classes.Statistics;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Classes.Statistics.StatisticsPackage
 * @generated
 */
public interface StatisticsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatisticsFactory eINSTANCE = Classes.Statistics.impl.StatisticsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Statistic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistic</em>'.
	 * @generated
	 */
	Statistic createStatistic();

	/**
	 * Returns a new object of class '<em>Statistic Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Statistic Entry</em>'.
	 * @generated
	 */
	StatisticEntry createStatisticEntry();

	/**
	 * Returns a new object of class '<em>Date</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Date</em>'.
	 * @generated
	 */
	Date createDate();

	/**
	 * <!-- begin-user-doc -->
	 * // NOT USED, throws UnsupportedOperationException
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	StatisticsGenerator createStatisticsGenerator();

	/**
	 * <!-- begin-user-doc -->
	 * // NOT USED, throws UnsupportedOperationException
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	StatisticsPackage getStatisticsPackage();

} //StatisticsFactory
