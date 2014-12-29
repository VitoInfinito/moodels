/**
 */
package Classes.Staff;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Monthly Salary Contract</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
 class MonthlySalaryContract extends SalaryContract {

	private static final long serialVersionUID = 2153642060872727819L;
	private double salary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MonthlySalaryContract() {
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
		salary = newSalary;
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
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (salary: ");
		result.append(salary);
		result.append(", type: ");
		result.append(getType());
		result.append(')');
		return result.toString();
	}

} //MonthlySalaryContractImpl
