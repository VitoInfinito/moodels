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
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	LinkedHashMap<LocalDateTime, Integer> getOccupancyStatistics(LocalDateTime from, LocalDateTime to) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	LinkedHashMap<LocalDateTime, Double> getRevenueStatistics(LocalDateTime from, LocalDateTime to) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" fromRequired="true" fromOrdered="false" toRequired="true" toOrdered="false"
	 * @generated
	 */
	LinkedHashMap<LocalDateTime, Double> getProfitStatistics(LocalDateTime from, LocalDateTime to) throws InvalidIDException;

} // IStatisticsGenerator
