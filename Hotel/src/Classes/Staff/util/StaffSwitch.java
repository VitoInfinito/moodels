/**
 */
package Classes.Staff.util;

import Classes.Staff.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see Classes.Staff.StaffPackage
 * @generated
 */
public class StaffSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StaffPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffSwitch() {
		if (modelPackage == null) {
			modelPackage = StaffPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case StaffPackage.STAFF_MANAGER: {
				StaffManager staffManager = (StaffManager)theEObject;
				T result = caseStaffManager(staffManager);
				if (result == null) result = caseIStaff(staffManager);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StaffPackage.STAFF: {
				Staff staff = (Staff)theEObject;
				T result = caseStaff(staff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StaffPackage.SALARY_CONTRACT: {
				SalaryContract salaryContract = (SalaryContract)theEObject;
				T result = caseSalaryContract(salaryContract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StaffPackage.MONTHLY_SALARY_CONTRACT: {
				MonthlySalaryContract monthlySalaryContract = (MonthlySalaryContract)theEObject;
				T result = caseMonthlySalaryContract(monthlySalaryContract);
				if (result == null) result = caseSalaryContract(monthlySalaryContract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StaffPackage.HOURLY_SALARY_CONTRACT: {
				HourlySalaryContract hourlySalaryContract = (HourlySalaryContract)theEObject;
				T result = caseHourlySalaryContract(hourlySalaryContract);
				if (result == null) result = caseSalaryContract(hourlySalaryContract);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case StaffPackage.ISTAFF: {
				IStaff iStaff = (IStaff)theEObject;
				T result = caseIStaff(iStaff);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manager</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaffManager(StaffManager object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Staff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Staff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaff(Staff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Salary Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Salary Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSalaryContract(SalaryContract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Monthly Salary Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Monthly Salary Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMonthlySalaryContract(MonthlySalaryContract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hourly Salary Contract</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hourly Salary Contract</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHourlySalaryContract(HourlySalaryContract object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IStaff</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IStaff</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIStaff(IStaff object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //StaffSwitch
