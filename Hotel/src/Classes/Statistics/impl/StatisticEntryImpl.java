/**
 */
package Classes.Statistics.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import Classes.Statistics.Date;
import Classes.Statistics.StatisticEntry;
import Classes.Statistics.StatisticsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Statistic Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Statistics.impl.StatisticEntryImpl#getValue <em>Value</em>}</li>
 *   <li>{@link Classes.Statistics.impl.StatisticEntryImpl#getDateOfEntry <em>Date Of Entry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StatisticEntryImpl extends MinimalEObjectImpl.Container implements StatisticEntry {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final double VALUE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected double value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDateOfEntry() <em>Date Of Entry</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfEntry()
	 * @generated
	 * @ordered
	 */
	protected Date dateOfEntry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StatisticEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StatisticsPackage.Literals.STATISTIC_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateOfEntry() {
		if (dateOfEntry != null && dateOfEntry.eIsProxy()) {
			InternalEObject oldDateOfEntry = (InternalEObject)dateOfEntry;
			dateOfEntry = (Date)eResolveProxy(oldDateOfEntry);
			if (dateOfEntry != oldDateOfEntry) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StatisticsPackage.STATISTIC_ENTRY__DATE_OF_ENTRY, oldDateOfEntry, dateOfEntry));
			}
		}
		return dateOfEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date basicGetDateOfEntry() {
		return dateOfEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfEntry(Date newDateOfEntry) {
		Date oldDateOfEntry = dateOfEntry;
		dateOfEntry = newDateOfEntry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatisticsPackage.STATISTIC_ENTRY__DATE_OF_ENTRY, oldDateOfEntry, dateOfEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StatisticsPackage.STATISTIC_ENTRY__VALUE:
				return getValue();
			case StatisticsPackage.STATISTIC_ENTRY__DATE_OF_ENTRY:
				if (resolve) return getDateOfEntry();
				return basicGetDateOfEntry();
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
			case StatisticsPackage.STATISTIC_ENTRY__DATE_OF_ENTRY:
				setDateOfEntry((Date)newValue);
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
			case StatisticsPackage.STATISTIC_ENTRY__DATE_OF_ENTRY:
				setDateOfEntry((Date)null);
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
			case StatisticsPackage.STATISTIC_ENTRY__VALUE:
				return value != VALUE_EDEFAULT;
			case StatisticsPackage.STATISTIC_ENTRY__DATE_OF_ENTRY:
				return dateOfEntry != null;
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
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //StatisticEntryImpl
