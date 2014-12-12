/**
 */
package Classes.Statistics.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
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
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Statistics.impl.StatisticsGeneratorImpl#getIBillsAccess <em>IBills Access</em>}</li>
 *   <li>{@link Classes.Statistics.impl.StatisticsGeneratorImpl#getIBooking <em>IBooking</em>}</li>
 *   <li>{@link Classes.Statistics.impl.StatisticsGeneratorImpl#getIStaff <em>IStaff</em>}</li>
 *   <li>{@link Classes.Statistics.impl.StatisticsGeneratorImpl#getStaticExpenses <em>Static Expenses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatisticsGeneratorImpl extends MinimalEObjectImpl.Container implements StatisticsGenerator {
	private final Logger logger = LoggerFactory.getLogger(StatisticsGeneratorImpl.class);
	public static StatisticsGeneratorImpl INSTANCE = new StatisticsGeneratorImpl();
	
	
	/**
	 * The cached value of the '{@link #getIBillsAccess() <em>IBills Access</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBillsAccess()
	 * @generated
	 * @ordered
	 */
	protected IBills iBillsAccess;

	/**
	 * The cached value of the '{@link #getIBooking() <em>IBooking</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIBooking()
	 * @generated
	 * @ordered
	 */
	protected IBookings iBooking;

	/**
	 * The cached value of the '{@link #getIStaff() <em>IStaff</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIStaff()
	 * @generated
	 * @ordered
	 */
	protected IStaff iStaff;

	/**
	 * The default value of the '{@link #getStaticExpenses() <em>Static Expenses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticExpenses()
	 * @generated
	 * @ordered
	 */
	protected static final double STATIC_EXPENSES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getStaticExpenses() <em>Static Expenses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticExpenses()
	 * @generated
	 * @ordered
	 */
	protected double staticExpenses = STATIC_EXPENSES_EDEFAULT;

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
	@Override
	protected EClass eStaticClass() {
		return StatisticsPackage.Literals.STATISTICS_GENERATOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IBills getIBillsAccess() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IBills basicGetIBillsAccess() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIBillsAccess(IBills newIBillsAccess) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IBookings getIBooking() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IBookings basicGetIBooking() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIBooking(IBookings newIBooking) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IStaff getIStaff() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IStaff basicGetIStaff() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIStaff(IStaff newIStaff) {
		throw new UnsupportedOperationException();
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
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
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
