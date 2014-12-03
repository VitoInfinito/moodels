/**
 */
package Classes.Statistics;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IStatistics Generator</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Statistics.StatisticsPackage#getIStatisticsGenerator()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IStatisticsGenerator extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getOccupancyStatistics();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getRevenueStatistics();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getProfitStatistics();

} // IStatisticsGenerator
