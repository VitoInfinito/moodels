/**
 */
package Classes.Statistics;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

import Classes.Guests.IGuests;

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
	
	IStatisticsGenerator INSTANCE = Classes.Statistics.impl.StatisticsGeneratorImpl.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	Statistic getOccupancyStatistics(Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	Statistic getRevenueStatistics(Date from, Date to);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	Statistic getProfitStatistics(Date from, Date to);

} // IStatisticsGenerator
