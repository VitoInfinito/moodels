/**
 */
package Classes.Staff.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import Classes.Staff.MonthlySalaryContract;
import Classes.Staff.StaffPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monthly Salary Contract</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class MonthlySalaryContractImpl extends SalaryContractImpl implements MonthlySalaryContract {

	private double salary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MonthlySalaryContractImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getSalary() {
		return salary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSalary(double newSalary) {
		double oldSalary = salary;
		salary = newSalary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaffPackage.MONTHLY_SALARY_CONTRACT__SALARY, oldSalary, salary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getType() {
		return "Monthly";
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
		result.append(" (salary: ");
		result.append(salary);
		result.append(", type: ");
		result.append(getType());
		result.append(')');
		return result.toString();
	}

} //MonthlySalaryContractImpl
