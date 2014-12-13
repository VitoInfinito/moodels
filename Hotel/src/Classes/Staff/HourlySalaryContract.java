/**
 */
package Classes.Staff;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hourly Salary Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Staff.HourlySalaryContract#getSalary <em>Salary</em>}</li>
 *   <li>{@link Classes.Staff.HourlySalaryContract#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Staff.StaffPackage#getHourlySalaryContract()
 * @model
 * @generated
 */
public interface HourlySalaryContract extends SalaryContract {
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
	 * @see Classes.Staff.StaffPackage#getHourlySalaryContract_Salary()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	double getSalary();

	/**
	 * Sets the value of the '{@link Classes.Staff.HourlySalaryContract#getSalary <em>Salary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Salary</em>' attribute.
	 * @see #getSalary()
	 * @generated
	 */
	void setSalary(double value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see Classes.Staff.StaffPackage#getHourlySalaryContract_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getType();

} // HourlySalaryContract
