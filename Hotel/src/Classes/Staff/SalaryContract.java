/**
 */
package Classes.Staff;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Salary Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Staff.StaffPackage#getSalaryContract()
 * @model abstract="true"
 * @generated
 */
public interface SalaryContract extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	double getSalary();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 * @generated
	 */
	String getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model salaryRequired="true" salaryOrdered="false"
	 * @generated
	 */
	void setSalary(double salary);

} // SalaryContract
