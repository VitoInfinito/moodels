/**
 */
package Classes.Statistics;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see Classes.Statistics.StatisticsFactory
 * @model kind="package"
 * @generated
 */
public interface StatisticsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Statistics";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///Classes/Statistics.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Classes.Statistics";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StatisticsPackage eINSTANCE = null;

	/**
	 * The meta object id for the '{@link Classes.Statistics.impl.StatisticImpl <em>Statistic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Statistics.impl.StatisticImpl
	 * @see Classes.Statistics.impl.StatisticsPackageImpl#getStatistic()
	 * @generated
	 */
	int STATISTIC = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Statistic Entry</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__STATISTIC_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>From Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__FROM_DATE = 2;

	/**
	 * The feature id for the '<em><b>To Date</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC__TO_DATE = 3;

	/**
	 * The number of structural features of the '<em>Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Statistic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.Statistics.impl.StatisticEntryImpl <em>Statistic Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Statistics.impl.StatisticEntryImpl
	 * @see Classes.Statistics.impl.StatisticsPackageImpl#getStatisticEntry()
	 * @generated
	 */
	int STATISTIC_ENTRY = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_ENTRY__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Date Of Entry</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_ENTRY__DATE_OF_ENTRY = 1;

	/**
	 * The number of structural features of the '<em>Statistic Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Statistic Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTIC_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.Statistics.impl.DateImpl <em>Date</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Statistics.impl.DateImpl
	 * @see Classes.Statistics.impl.StatisticsPackageImpl#getDate()
	 * @generated
	 */
	int DATE = 2;

	/**
	 * The number of structural features of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Date</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Classes.Statistics.IStatisticsGenerator <em>IStatistics Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Statistics.IStatisticsGenerator
	 * @see Classes.Statistics.impl.StatisticsPackageImpl#getIStatisticsGenerator()
	 * @generated
	 */
	int ISTATISTICS_GENERATOR = 3;

	/**
	 * The number of structural features of the '<em>IStatistics Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATISTICS_GENERATOR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Get Occupancy Statistics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATISTICS_GENERATOR___GET_OCCUPANCY_STATISTICS__DATE_DATE = 0;

	/**
	 * The operation id for the '<em>Get Revenue Statistics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATISTICS_GENERATOR___GET_REVENUE_STATISTICS__DATE_DATE = 1;

	/**
	 * The operation id for the '<em>Get Profit Statistics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATISTICS_GENERATOR___GET_PROFIT_STATISTICS__DATE_DATE = 2;

	/**
	 * The number of operations of the '<em>IStatistics Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ISTATISTICS_GENERATOR_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link Classes.Statistics.impl.StatisticsGeneratorImpl <em>Generator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Classes.Statistics.impl.StatisticsGeneratorImpl
	 * @see Classes.Statistics.impl.StatisticsPackageImpl#getStatisticsGenerator()
	 * @generated
	 */
	int STATISTICS_GENERATOR = 4;

	/**
	 * The feature id for the '<em><b>IBills Access</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_GENERATOR__IBILLS_ACCESS = ISTATISTICS_GENERATOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>IBooking</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_GENERATOR__IBOOKING = ISTATISTICS_GENERATOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>IStaff</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_GENERATOR__ISTAFF = ISTATISTICS_GENERATOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Static Expenses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_GENERATOR__STATIC_EXPENSES = ISTATISTICS_GENERATOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_GENERATOR_FEATURE_COUNT = ISTATISTICS_GENERATOR_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Get Occupancy Statistics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_GENERATOR___GET_OCCUPANCY_STATISTICS__DATE_DATE = ISTATISTICS_GENERATOR___GET_OCCUPANCY_STATISTICS__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Revenue Statistics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_GENERATOR___GET_REVENUE_STATISTICS__DATE_DATE = ISTATISTICS_GENERATOR___GET_REVENUE_STATISTICS__DATE_DATE;

	/**
	 * The operation id for the '<em>Get Profit Statistics</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_GENERATOR___GET_PROFIT_STATISTICS__DATE_DATE = ISTATISTICS_GENERATOR___GET_PROFIT_STATISTICS__DATE_DATE;

	/**
	 * The number of operations of the '<em>Generator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATISTICS_GENERATOR_OPERATION_COUNT = ISTATISTICS_GENERATOR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link Classes.Statistics.Statistic <em>Statistic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistic</em>'.
	 * @see Classes.Statistics.Statistic
	 * @generated
	 */
	EClass getStatistic();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Statistics.Statistic#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see Classes.Statistics.Statistic#getType()
	 * @see #getStatistic()
	 * @generated
	 */
	EAttribute getStatistic_Type();

	/**
	 * Returns the meta object for the reference list '{@link Classes.Statistics.Statistic#getStatisticEntry <em>Statistic Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Statistic Entry</em>'.
	 * @see Classes.Statistics.Statistic#getStatisticEntry()
	 * @see #getStatistic()
	 * @generated
	 */
	EReference getStatistic_StatisticEntry();

	/**
	 * Returns the meta object for the reference '{@link Classes.Statistics.Statistic#getFromDate <em>From Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Date</em>'.
	 * @see Classes.Statistics.Statistic#getFromDate()
	 * @see #getStatistic()
	 * @generated
	 */
	EReference getStatistic_FromDate();

	/**
	 * Returns the meta object for the reference '{@link Classes.Statistics.Statistic#getToDate <em>To Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To Date</em>'.
	 * @see Classes.Statistics.Statistic#getToDate()
	 * @see #getStatistic()
	 * @generated
	 */
	EReference getStatistic_ToDate();

	/**
	 * Returns the meta object for class '{@link Classes.Statistics.StatisticEntry <em>Statistic Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Statistic Entry</em>'.
	 * @see Classes.Statistics.StatisticEntry
	 * @generated
	 */
	EClass getStatisticEntry();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Statistics.StatisticEntry#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see Classes.Statistics.StatisticEntry#getValue()
	 * @see #getStatisticEntry()
	 * @generated
	 */
	EAttribute getStatisticEntry_Value();

	/**
	 * Returns the meta object for the reference '{@link Classes.Statistics.StatisticEntry#getDateOfEntry <em>Date Of Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Date Of Entry</em>'.
	 * @see Classes.Statistics.StatisticEntry#getDateOfEntry()
	 * @see #getStatisticEntry()
	 * @generated
	 */
	EReference getStatisticEntry_DateOfEntry();

	/**
	 * Returns the meta object for class '{@link Classes.Statistics.Date <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date</em>'.
	 * @see Classes.Statistics.Date
	 * @generated
	 */
	EClass getDate();

	/**
	 * Returns the meta object for class '{@link Classes.Statistics.IStatisticsGenerator <em>IStatistics Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IStatistics Generator</em>'.
	 * @see Classes.Statistics.IStatisticsGenerator
	 * @generated
	 */
	EClass getIStatisticsGenerator();

	/**
	 * Returns the meta object for the '{@link Classes.Statistics.IStatisticsGenerator#getOccupancyStatistics(java.util.Date, java.util.Date) <em>Get Occupancy Statistics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Occupancy Statistics</em>' operation.
	 * @see Classes.Statistics.IStatisticsGenerator#getOccupancyStatistics(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIStatisticsGenerator__GetOccupancyStatistics__Date_Date();

	/**
	 * Returns the meta object for the '{@link Classes.Statistics.IStatisticsGenerator#getRevenueStatistics(java.util.Date, java.util.Date) <em>Get Revenue Statistics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Revenue Statistics</em>' operation.
	 * @see Classes.Statistics.IStatisticsGenerator#getRevenueStatistics(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIStatisticsGenerator__GetRevenueStatistics__Date_Date();

	/**
	 * Returns the meta object for the '{@link Classes.Statistics.IStatisticsGenerator#getProfitStatistics(java.util.Date, java.util.Date) <em>Get Profit Statistics</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Profit Statistics</em>' operation.
	 * @see Classes.Statistics.IStatisticsGenerator#getProfitStatistics(java.util.Date, java.util.Date)
	 * @generated
	 */
	EOperation getIStatisticsGenerator__GetProfitStatistics__Date_Date();

	/**
	 * Returns the meta object for class '{@link Classes.Statistics.StatisticsGenerator <em>Generator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generator</em>'.
	 * @see Classes.Statistics.StatisticsGenerator
	 * @generated
	 */
	EClass getStatisticsGenerator();

	/**
	 * Returns the meta object for the reference '{@link Classes.Statistics.StatisticsGenerator#getIBillsAccess <em>IBills Access</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IBills Access</em>'.
	 * @see Classes.Statistics.StatisticsGenerator#getIBillsAccess()
	 * @see #getStatisticsGenerator()
	 * @generated
	 */
	EReference getStatisticsGenerator_IBillsAccess();

	/**
	 * Returns the meta object for the reference '{@link Classes.Statistics.StatisticsGenerator#getIBooking <em>IBooking</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IBooking</em>'.
	 * @see Classes.Statistics.StatisticsGenerator#getIBooking()
	 * @see #getStatisticsGenerator()
	 * @generated
	 */
	EReference getStatisticsGenerator_IBooking();

	/**
	 * Returns the meta object for the reference '{@link Classes.Statistics.StatisticsGenerator#getIStaff <em>IStaff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>IStaff</em>'.
	 * @see Classes.Statistics.StatisticsGenerator#getIStaff()
	 * @see #getStatisticsGenerator()
	 * @generated
	 */
	EReference getStatisticsGenerator_IStaff();

	/**
	 * Returns the meta object for the attribute '{@link Classes.Statistics.StatisticsGenerator#getStaticExpenses <em>Static Expenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static Expenses</em>'.
	 * @see Classes.Statistics.StatisticsGenerator#getStaticExpenses()
	 * @see #getStatisticsGenerator()
	 * @generated
	 */
	EAttribute getStatisticsGenerator_StaticExpenses();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link Classes.Statistics.impl.StatisticImpl <em>Statistic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Statistics.impl.StatisticImpl
		 * @see Classes.Statistics.impl.StatisticsPackageImpl#getStatistic()
		 * @generated
		 */
		EClass STATISTIC = eINSTANCE.getStatistic();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC__TYPE = eINSTANCE.getStatistic_Type();

		/**
		 * The meta object literal for the '<em><b>Statistic Entry</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTIC__STATISTIC_ENTRY = eINSTANCE.getStatistic_StatisticEntry();

		/**
		 * The meta object literal for the '<em><b>From Date</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTIC__FROM_DATE = eINSTANCE.getStatistic_FromDate();

		/**
		 * The meta object literal for the '<em><b>To Date</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTIC__TO_DATE = eINSTANCE.getStatistic_ToDate();

		/**
		 * The meta object literal for the '{@link Classes.Statistics.impl.StatisticEntryImpl <em>Statistic Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Statistics.impl.StatisticEntryImpl
		 * @see Classes.Statistics.impl.StatisticsPackageImpl#getStatisticEntry()
		 * @generated
		 */
		EClass STATISTIC_ENTRY = eINSTANCE.getStatisticEntry();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTIC_ENTRY__VALUE = eINSTANCE.getStatisticEntry_Value();

		/**
		 * The meta object literal for the '<em><b>Date Of Entry</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTIC_ENTRY__DATE_OF_ENTRY = eINSTANCE.getStatisticEntry_DateOfEntry();

		/**
		 * The meta object literal for the '{@link Classes.Statistics.impl.DateImpl <em>Date</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Statistics.impl.DateImpl
		 * @see Classes.Statistics.impl.StatisticsPackageImpl#getDate()
		 * @generated
		 */
		EClass DATE = eINSTANCE.getDate();

		/**
		 * The meta object literal for the '{@link Classes.Statistics.IStatisticsGenerator <em>IStatistics Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Statistics.IStatisticsGenerator
		 * @see Classes.Statistics.impl.StatisticsPackageImpl#getIStatisticsGenerator()
		 * @generated
		 */
		EClass ISTATISTICS_GENERATOR = eINSTANCE.getIStatisticsGenerator();

		/**
		 * The meta object literal for the '<em><b>Get Occupancy Statistics</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTATISTICS_GENERATOR___GET_OCCUPANCY_STATISTICS__DATE_DATE = eINSTANCE.getIStatisticsGenerator__GetOccupancyStatistics__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Revenue Statistics</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTATISTICS_GENERATOR___GET_REVENUE_STATISTICS__DATE_DATE = eINSTANCE.getIStatisticsGenerator__GetRevenueStatistics__Date_Date();

		/**
		 * The meta object literal for the '<em><b>Get Profit Statistics</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ISTATISTICS_GENERATOR___GET_PROFIT_STATISTICS__DATE_DATE = eINSTANCE.getIStatisticsGenerator__GetProfitStatistics__Date_Date();

		/**
		 * The meta object literal for the '{@link Classes.Statistics.impl.StatisticsGeneratorImpl <em>Generator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Classes.Statistics.impl.StatisticsGeneratorImpl
		 * @see Classes.Statistics.impl.StatisticsPackageImpl#getStatisticsGenerator()
		 * @generated
		 */
		EClass STATISTICS_GENERATOR = eINSTANCE.getStatisticsGenerator();

		/**
		 * The meta object literal for the '<em><b>IBills Access</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTICS_GENERATOR__IBILLS_ACCESS = eINSTANCE.getStatisticsGenerator_IBillsAccess();

		/**
		 * The meta object literal for the '<em><b>IBooking</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTICS_GENERATOR__IBOOKING = eINSTANCE.getStatisticsGenerator_IBooking();

		/**
		 * The meta object literal for the '<em><b>IStaff</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATISTICS_GENERATOR__ISTAFF = eINSTANCE.getStatisticsGenerator_IStaff();

		/**
		 * The meta object literal for the '<em><b>Static Expenses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATISTICS_GENERATOR__STATIC_EXPENSES = eINSTANCE.getStatisticsGenerator_StaticExpenses();

	}

} //StatisticsPackage
