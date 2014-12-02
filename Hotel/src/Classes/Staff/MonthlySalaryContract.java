/**
 */
package Classes.Staff;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Monthly Salary Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Staff.MonthlySalaryContract#getSalary <em>Salary</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Staff.StaffPackage#getMonthlySalaryContract()
 * @model
 * @generated
 */
public interface MonthlySalaryContract extends SalaryContract {
	/**
	 * Returns the value of the '<em><b>Salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Salary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Salary</em>' attribute.
	 * @see #setSalary(double)
	 * @see Classes.Staff.StaffPackage#getMonthlySalaryContract_Salary()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getSalary();

	/**
	 * Sets the value of the '{@link Classes.Staff.MonthlySalaryContract#getSalary <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salary</em>' attribute.
	 * @see #getSalary()
	 * @generated
	 */
	void setSalary(double value);

} // MonthlySalaryContract
