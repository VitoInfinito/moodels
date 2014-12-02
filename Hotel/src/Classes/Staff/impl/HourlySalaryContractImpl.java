/**
 */
package Classes.Staff.impl;

import Classes.Staff.HourlySalaryContract;
import Classes.Staff.StaffPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hourly Salary Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Staff.impl.HourlySalaryContractImpl#getSalaryHour <em>Salary Hour</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HourlySalaryContractImpl extends SalaryContractImpl implements HourlySalaryContract {
	/**
	 * The default value of the '{@link #getSalaryHour() <em>Salary Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalaryHour()
	 * @generated
	 * @ordered
	 */
	protected static final double SALARY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getSalaryHour() <em>Salary Hour</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSalaryHour()
	 * @generated
	 * @ordered
	 */
	protected double salaryHour = SALARY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HourlySalaryContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaffPackage.Literals.HOURLY_SALARY_CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSalary() {
		return salaryHour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalary(double newSalaryHour) {
		double oldSalaryHour = salaryHour;
		salaryHour = newSalaryHour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaffPackage.HOURLY_SALARY_CONTRACT__SALARY_HOUR, oldSalaryHour, salaryHour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaffPackage.HOURLY_SALARY_CONTRACT__SALARY_HOUR:
				return getSalary();
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
			case StaffPackage.HOURLY_SALARY_CONTRACT__SALARY_HOUR:
				setSalary((Double)newValue);
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
			case StaffPackage.HOURLY_SALARY_CONTRACT__SALARY_HOUR:
				setSalary(SALARY_EDEFAULT);
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
			case StaffPackage.HOURLY_SALARY_CONTRACT__SALARY_HOUR:
				return salaryHour != SALARY_EDEFAULT;
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
		result.append(" (salaryHour: ");
		result.append(salaryHour);
		result.append(')');
		return result.toString();
	}

} //HourlySalaryContractImpl
