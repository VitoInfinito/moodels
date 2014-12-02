/**
 */
package Classes.Statistics.impl;

import Classes.Statistics.Date;
import Classes.Statistics.Statistic;
import Classes.Statistics.StatisticEntry;
import Classes.Statistics.StatisticsPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statistic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Statistics.impl.StatisticImpl#getType <em>Type</em>}</li>
 *   <li>{@link Classes.Statistics.impl.StatisticImpl#getStatisticEntry <em>Statistic Entry</em>}</li>
 *   <li>{@link Classes.Statistics.impl.StatisticImpl#getFromDate <em>From Date</em>}</li>
 *   <li>{@link Classes.Statistics.impl.StatisticImpl#getToDate <em>To Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatisticImpl extends MinimalEObjectImpl.Container implements Statistic {
	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStatisticEntry() <em>Statistic Entry</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatisticEntry()
	 * @generated
	 * @ordered
	 */
	protected EList<StatisticEntry> statisticEntry;

	/**
	 * The cached value of the '{@link #getFromDate() <em>From Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromDate()
	 * @generated
	 * @ordered
	 */
	protected Date fromDate;

	/**
	 * The cached value of the '{@link #getToDate() <em>To Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToDate()
	 * @generated
	 * @ordered
	 */
	protected Date toDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatisticImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatisticsPackage.Literals.STATISTIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StatisticEntry> getStatisticEntry() {
		if (statisticEntry == null) {
			statisticEntry = new EObjectResolvingEList<StatisticEntry>(StatisticEntry.class, this, StatisticsPackage.STATISTIC__STATISTIC_ENTRY);
		}
		return statisticEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getFromDate() {
		if (fromDate != null && fromDate.eIsProxy()) {
			InternalEObject oldFromDate = (InternalEObject)fromDate;
			fromDate = (Date)eResolveProxy(oldFromDate);
			if (fromDate != oldFromDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatisticsPackage.STATISTIC__FROM_DATE, oldFromDate, fromDate));
			}
		}
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetFromDate() {
		return fromDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromDate(Date newFromDate) {
		Date oldFromDate = fromDate;
		fromDate = newFromDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatisticsPackage.STATISTIC__FROM_DATE, oldFromDate, fromDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getToDate() {
		if (toDate != null && toDate.eIsProxy()) {
			InternalEObject oldToDate = (InternalEObject)toDate;
			toDate = (Date)eResolveProxy(oldToDate);
			if (toDate != oldToDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatisticsPackage.STATISTIC__TO_DATE, oldToDate, toDate));
			}
		}
		return toDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetToDate() {
		return toDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToDate(Date newToDate) {
		Date oldToDate = toDate;
		toDate = newToDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatisticsPackage.STATISTIC__TO_DATE, oldToDate, toDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatisticsPackage.STATISTIC__TYPE:
				return getType();
			case StatisticsPackage.STATISTIC__STATISTIC_ENTRY:
				return getStatisticEntry();
			case StatisticsPackage.STATISTIC__FROM_DATE:
				if (resolve) return getFromDate();
				return basicGetFromDate();
			case StatisticsPackage.STATISTIC__TO_DATE:
				if (resolve) return getToDate();
				return basicGetToDate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StatisticsPackage.STATISTIC__STATISTIC_ENTRY:
				getStatisticEntry().clear();
				getStatisticEntry().addAll((Collection<? extends StatisticEntry>)newValue);
				return;
			case StatisticsPackage.STATISTIC__FROM_DATE:
				setFromDate((Date)newValue);
				return;
			case StatisticsPackage.STATISTIC__TO_DATE:
				setToDate((Date)newValue);
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
			case StatisticsPackage.STATISTIC__STATISTIC_ENTRY:
				getStatisticEntry().clear();
				return;
			case StatisticsPackage.STATISTIC__FROM_DATE:
				setFromDate((Date)null);
				return;
			case StatisticsPackage.STATISTIC__TO_DATE:
				setToDate((Date)null);
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
			case StatisticsPackage.STATISTIC__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case StatisticsPackage.STATISTIC__STATISTIC_ENTRY:
				return statisticEntry != null && !statisticEntry.isEmpty();
			case StatisticsPackage.STATISTIC__FROM_DATE:
				return fromDate != null;
			case StatisticsPackage.STATISTIC__TO_DATE:
				return toDate != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //StatisticImpl
