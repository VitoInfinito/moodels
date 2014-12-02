/**
 */
package Classes.Staff.util;

import Classes.Staff.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Classes.Staff.StaffPackage
 * @generated
 */
public class StaffAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static StaffPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaffAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = StaffPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffSwitch<Adapter> modelSwitch =
		new StaffSwitch<Adapter>() {
			@Override
			public Adapter caseStaffManager(StaffManager object) {
				return createStaffManagerAdapter();
			}
			@Override
			public Adapter caseStaff(Staff object) {
				return createStaffAdapter();
			}
			@Override
			public Adapter caseSalaryContract(SalaryContract object) {
				return createSalaryContractAdapter();
			}
			@Override
			public Adapter caseMonthlySalaryContract(MonthlySalaryContract object) {
				return createMonthlySalaryContractAdapter();
			}
			@Override
			public Adapter caseHourlySalaryContract(HourlySalaryContract object) {
				return createHourlySalaryContractAdapter();
			}
			@Override
			public Adapter caseIStaff(IStaff object) {
				return createIStaffAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link Classes.Staff.StaffManager <em>Manager</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Staff.StaffManager
	 * @generated
	 */
	public Adapter createStaffManagerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Staff.Staff <em>Staff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Staff.Staff
	 * @generated
	 */
	public Adapter createStaffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Staff.SalaryContract <em>Salary Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Staff.SalaryContract
	 * @generated
	 */
	public Adapter createSalaryContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Staff.MonthlySalaryContract <em>Monthly Salary Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Staff.MonthlySalaryContract
	 * @generated
	 */
	public Adapter createMonthlySalaryContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Staff.HourlySalaryContract <em>Hourly Salary Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Staff.HourlySalaryContract
	 * @generated
	 */
	public Adapter createHourlySalaryContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Classes.Staff.IStaff <em>IStaff</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Classes.Staff.IStaff
	 * @generated
	 */
	public Adapter createIStaffAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //StaffAdapterFactory
