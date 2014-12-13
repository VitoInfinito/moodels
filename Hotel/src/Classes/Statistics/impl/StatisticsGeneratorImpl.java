/**
 */
package Classes.Statistics.impl;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.Bills.IBills;
import Classes.Bookings.IBookings;
import Classes.Staff.IStaff;
import Classes.Statistics.Statistic;
import Classes.Statistics.StatisticsGenerator;
import Classes.Statistics.StatisticsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class StatisticsGeneratorImpl extends MinimalEObjectImpl.Container implements StatisticsGenerator {
	private final Logger logger = LoggerFactory.getLogger(StatisticsGeneratorImpl.class);
	public static StatisticsGeneratorImpl INSTANCE = new StatisticsGeneratorImpl();

	private IBills iBillsAccess;
	private IBookings iBooking;
	private IStaff iStaff;
	private double staticExpenses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private StatisticsGeneratorImpl() {
		super();
		iBillsAccess = IBills.INSTANCE;
		iBooking = IBookings.INSTANCE;
		iStaff = IStaff.INSTANCE;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStaticExpenses() {
		return staticExpenses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticExpenses(double newStaticExpenses) {
		double oldStaticExpenses = staticExpenses;
		staticExpenses = newStaticExpenses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatisticsPackage.STATISTICS_GENERATOR__STATIC_EXPENSES, oldStaticExpenses, staticExpenses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statistic getOccupancyStatistics(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statistic getRevenueStatistics(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Statistic getProfitStatistics(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (staticExpenses: ");
		result.append(staticExpenses);
		result.append(')');
		return result.toString();
	}

} //StatisticsGeneratorImpl
