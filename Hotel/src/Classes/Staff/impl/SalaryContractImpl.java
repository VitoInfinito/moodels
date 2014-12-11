/**
 */
package Classes.Staff.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import Classes.Staff.SalaryContract;
import Classes.Staff.StaffPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Salary Contract</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
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
	@Override
	protected EClass eStaticClass() {
		return StaffPackage.Literals.SALARY_CONTRACT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getSalary() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSalary(double salary) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StaffPackage.SALARY_CONTRACT___GET_SALARY:
				return getSalary();
			case StaffPackage.SALARY_CONTRACT___GET_TYPE:
				return getType();
			case StaffPackage.SALARY_CONTRACT___SET_SALARY__DOUBLE:
				setSalary((Double)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SalaryContractImpl
