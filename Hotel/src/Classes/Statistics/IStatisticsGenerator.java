/**
 */
package Classes.Statistics;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.LinkedHashMap;

import org.eclipse.jdt.annotation.NonNullByDefault;

import Classes.Utils.InvalidIDException;

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
@NonNullByDefault
public interface IStatisticsGenerator extends Serializable {
	
	IStatisticsGenerator INSTANCE = Classes.Statistics.StatisticsGenerator.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		from != null && to != null && from.isBefore(to)
	 * Ensures:
	 * 		returns a non null LinkedHashMap were for each day between from and to there exists and entry mapped to the expected guest occupancy on that day.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	LinkedHashMap<LocalDateTime, Integer> getOccupancyStatistics(LocalDateTime from, LocalDateTime to);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		from != null && to != null && from.isBefore(to)
	 * Ensures:
	 * 		returns a non null LinkedHashMap were for each day between from and to there exists and entry mapped to the revenue for that day.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	LinkedHashMap<LocalDateTime, Double> getRevenueStatistics(LocalDateTime from, LocalDateTime to);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		from != null && to != null && from.isBefore(to)
	 * Ensures:
	 * 		returns a non null LinkedHashMap were for each day between from and to there exists and entry mapped to the profit for that day.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	LinkedHashMap<LocalDateTime, Double> getProfitStatistics(LocalDateTime from, LocalDateTime to);
	
	/**
	 * <!-- begin-user-doc -->
	  * Requires:
	 * 		nothing
	 * Ensures:
	 * 		the static expenses of the hotel is returned.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	double getStaticExpenses();

	/**
	 * <!-- begin-user-doc -->
	  * Requires:
	 * 		nothing
	 * Ensures:
	 * 		the static expenses of the hotel is set to newStaticExpenses.
	 * <!-- end-user-doc -->
	 * @generated
	 */
	void setStaticExpenses(double newStaticExpenses);

} // IStatisticsGenerator
