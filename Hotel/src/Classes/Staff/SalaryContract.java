/**
 */
package Classes.Staff;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Salary Contract</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
 abstract class SalaryContract implements Serializable {
	private static final long serialVersionUID = -2264012237471483737L;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalaryContract() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public abstract double getSalary();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public abstract String getType();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public abstract void setSalary(double salary);
} //SalaryContractImpl
