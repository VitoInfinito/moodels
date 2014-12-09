/**
 */
package Classes.Statistics.impl;

import Classes.Bills.IBills;

import Classes.Bookings.IBookings;

import Classes.Staff.IStaff;

import Classes.Statistics.Statistic;
import Classes.Statistics.StatisticsGenerator;
import Classes.Statistics.StatisticsPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Date;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

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
	 * @generated
	 */
	protected StatisticsGeneratorImpl() {
		super();
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
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBills getIBillsAccess() {
		if (iBillsAccess != null && iBillsAccess.eIsProxy()) {
			InternalEObject oldIBillsAccess = (InternalEObject)iBillsAccess;
			iBillsAccess = (IBills)eResolveProxy(oldIBillsAccess);
			if (iBillsAccess != oldIBillsAccess) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatisticsPackage.STATISTICS_GENERATOR__IBILLS_ACCESS, oldIBillsAccess, iBillsAccess));
			}
		}
		return iBillsAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBills basicGetIBillsAccess() {
		return iBillsAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIBillsAccess(IBills newIBillsAccess) {
		IBills oldIBillsAccess = iBillsAccess;
		iBillsAccess = newIBillsAccess;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatisticsPackage.STATISTICS_GENERATOR__IBILLS_ACCESS, oldIBillsAccess, iBillsAccess));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBookings getIBooking() {
		if (iBooking != null && iBooking.eIsProxy()) {
			InternalEObject oldIBooking = (InternalEObject)iBooking;
			iBooking = (IBookings)eResolveProxy(oldIBooking);
			if (iBooking != oldIBooking) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatisticsPackage.STATISTICS_GENERATOR__IBOOKING, oldIBooking, iBooking));
			}
		}
		return iBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IBookings basicGetIBooking() {
		return iBooking;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIBooking(IBookings newIBooking) {
		IBookings oldIBooking = iBooking;
		iBooking = newIBooking;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatisticsPackage.STATISTICS_GENERATOR__IBOOKING, oldIBooking, iBooking));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStaff getIStaff() {
		if (iStaff != null && iStaff.eIsProxy()) {
			InternalEObject oldIStaff = (InternalEObject)iStaff;
			iStaff = (IStaff)eResolveProxy(oldIStaff);
			if (iStaff != oldIStaff) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatisticsPackage.STATISTICS_GENERATOR__ISTAFF, oldIStaff, iStaff));
			}
		}
		return iStaff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStaff basicGetIStaff() {
		return iStaff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIStaff(IStaff newIStaff) {
		IStaff oldIStaff = iStaff;
		iStaff = newIStaff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatisticsPackage.STATISTICS_GENERATOR__ISTAFF, oldIStaff, iStaff));
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatisticsPackage.STATISTICS_GENERATOR__IBILLS_ACCESS:
				if (resolve) return getIBillsAccess();
				return basicGetIBillsAccess();
			case StatisticsPackage.STATISTICS_GENERATOR__IBOOKING:
				if (resolve) return getIBooking();
				return basicGetIBooking();
			case StatisticsPackage.STATISTICS_GENERATOR__ISTAFF:
				if (resolve) return getIStaff();
				return basicGetIStaff();
			case StatisticsPackage.STATISTICS_GENERATOR__STATIC_EXPENSES:
				return getStaticExpenses();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatisticsPackage.STATISTICS_GENERATOR__IBILLS_ACCESS:
				setIBillsAccess((IBills)newValue);
				return;
			case StatisticsPackage.STATISTICS_GENERATOR__IBOOKING:
				setIBooking((IBookings)newValue);
				return;
			case StatisticsPackage.STATISTICS_GENERATOR__ISTAFF:
				setIStaff((IStaff)newValue);
				return;
			case StatisticsPackage.STATISTICS_GENERATOR__STATIC_EXPENSES:
				setStaticExpenses((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StatisticsPackage.STATISTICS_GENERATOR__IBILLS_ACCESS:
				setIBillsAccess((IBills)null);
				return;
			case StatisticsPackage.STATISTICS_GENERATOR__IBOOKING:
				setIBooking((IBookings)null);
				return;
			case StatisticsPackage.STATISTICS_GENERATOR__ISTAFF:
				setIStaff((IStaff)null);
				return;
			case StatisticsPackage.STATISTICS_GENERATOR__STATIC_EXPENSES:
				setStaticExpenses(STATIC_EXPENSES_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StatisticsPackage.STATISTICS_GENERATOR__IBILLS_ACCESS:
				return iBillsAccess != null;
			case StatisticsPackage.STATISTICS_GENERATOR__IBOOKING:
				return iBooking != null;
			case StatisticsPackage.STATISTICS_GENERATOR__ISTAFF:
				return iStaff != null;
			case StatisticsPackage.STATISTICS_GENERATOR__STATIC_EXPENSES:
				return staticExpenses != STATIC_EXPENSES_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StatisticsPackage.STATISTICS_GENERATOR___GET_OCCUPANCY_STATISTICS__DATE_DATE:
				return getOccupancyStatistics((Date)arguments.get(0), (Date)arguments.get(1));
			case StatisticsPackage.STATISTICS_GENERATOR___GET_REVENUE_STATISTICS__DATE_DATE:
				return getRevenueStatistics((Date)arguments.get(0), (Date)arguments.get(1));
			case StatisticsPackage.STATISTICS_GENERATOR___GET_PROFIT_STATISTICS__DATE_DATE:
				return getProfitStatistics((Date)arguments.get(0), (Date)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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
