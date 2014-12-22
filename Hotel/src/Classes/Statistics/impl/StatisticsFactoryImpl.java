/**
 */
package Classes.Statistics.impl;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import Classes.Statistics.StatisticsFactory;
import Classes.Statistics.StatisticsPackage;

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
	private StatisticsFactoryImpl() {
		super();
	}
} //StatisticsFactoryImpl
