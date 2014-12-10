/**
 */
package Classes.Staff;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Classes.Staff.StaffPackage
 * @generated
 */
public interface StaffFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	StaffFactory eINSTANCE = Classes.Staff.impl.StaffFactoryImpl.init();

	/**
	 * <!-- begin-user-doc -->
	 * // NOT USED, throws UnsupportedOperationException
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	StaffManager createStaffManager();

	/**
	 * Returns a new object of class '<em>Staff</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Staff</em>'.
	 * @generated
	 */
	Staff createStaff();

	/**
	 * Returns a new object of class '<em>Monthly Salary Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Monthly Salary Contract</em>'.
	 * @generated
	 */
	MonthlySalaryContract createMonthlySalaryContract();

	/**
	 * Returns a new object of class '<em>Hourly Salary Contract</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hourly Salary Contract</em>'.
	 * @generated
	 */
	HourlySalaryContract createHourlySalaryContract();

	/**
	 * <!-- begin-user-doc -->
	 * // NOT USED, throws UnsupportedOperationException
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	StaffPackage getStaffPackage();

} //StaffFactory
