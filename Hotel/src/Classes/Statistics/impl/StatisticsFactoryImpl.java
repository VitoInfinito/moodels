/**
 */
package Classes.Statistics.impl;

import Classes.Statistics.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatisticsFactoryImpl extends EFactoryImpl implements StatisticsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StatisticsFactory init() {
		try {
			StatisticsFactory theStatisticsFactory = (StatisticsFactory)EPackage.Registry.INSTANCE.getEFactory(StatisticsPackage.eNS_URI);
			if (theStatisticsFactory != null) {
				return theStatisticsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StatisticsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case StatisticsPackage.STATISTIC: return createStatistic();
			case StatisticsPackage.STATISTIC_ENTRY: return createStatisticEntry();
			case StatisticsPackage.DATE: return createDate();
			case StatisticsPackage.STATISTICS_GENERATOR: return createStatisticsGenerator();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statistic createStatistic() {
		StatisticImpl statistic = new StatisticImpl();
		return statistic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticEntry createStatisticEntry() {
		StatisticEntryImpl statisticEntry = new StatisticEntryImpl();
		return statisticEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date createDate() {
		DateImpl date = new DateImpl();
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticsGenerator createStatisticsGenerator() {
		return StatisticsGeneratorImpl.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatisticsPackage getStatisticsPackage() {
		return (StatisticsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static StatisticsPackage getPackage() {
		return StatisticsPackage.eINSTANCE;
	}

} //StatisticsFactoryImpl
