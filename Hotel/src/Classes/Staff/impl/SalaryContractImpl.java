/**
 */
package Classes.Staff.impl;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import Classes.Staff.SalaryContract;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Salary Contract</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public abstract class SalaryContractImpl extends MinimalEObjectImpl.Container implements SalaryContract {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SalaryContractImpl() {
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
