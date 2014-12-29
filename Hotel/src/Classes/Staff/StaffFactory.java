/**
 */
package Classes.Staff;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
 class StaffFactory implements Serializable{
	private static final long serialVersionUID = 1088489696036529955L;
	static StaffFactory INSTANCE = new StaffFactory();

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StaffFactory() {
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staff createStaff() {
		Staff staff = new Staff();
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthlySalaryContract createMonthlySalaryContract() {
		MonthlySalaryContract monthlySalaryContract = new MonthlySalaryContract();
		return monthlySalaryContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HourlySalaryContract createHourlySalaryContract() {
		HourlySalaryContract hourlySalaryContract = new HourlySalaryContract();
		return hourlySalaryContract;
	}
} //StaffFactoryImpl
