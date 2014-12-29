/**
 */
package Classes.Staff;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hourly Salary Contract</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
 class HourlySalaryContract extends SalaryContract {
	private static final long serialVersionUID = 2122385879663964171L;
	private double salary;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HourlySalaryContract() {
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
		return "Hourly";
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

} //HourlySalaryContractImpl
