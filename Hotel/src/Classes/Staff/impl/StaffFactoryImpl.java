/**
 */
package Classes.Staff.impl;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import Classes.Staff.HourlySalaryContract;
import Classes.Staff.MonthlySalaryContract;
import Classes.Staff.Staff;
import Classes.Staff.StaffFactory;
import Classes.Staff.StaffPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StaffFactoryImpl extends EFactoryImpl implements StaffFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StaffFactory init() {
		try {
			StaffFactory theStaffFactory = (StaffFactory)EPackage.Registry.INSTANCE.getEFactory(StaffPackage.eNS_URI);
			if (theStaffFactory != null) {
				return theStaffFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new StaffFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StaffFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Staff createStaff() {
		StaffImpl staff = new StaffImpl();
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MonthlySalaryContract createMonthlySalaryContract() {
		MonthlySalaryContractImpl monthlySalaryContract = new MonthlySalaryContractImpl();
		return monthlySalaryContract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HourlySalaryContract createHourlySalaryContract() {
		HourlySalaryContractImpl hourlySalaryContract = new HourlySalaryContractImpl();
		return hourlySalaryContract;
	}
} //StaffFactoryImpl
