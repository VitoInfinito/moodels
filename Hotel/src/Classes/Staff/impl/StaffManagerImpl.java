/**
 */
package Classes.Staff.impl;

import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToStaffMapImpl;
import Classes.Staff.Staff;
import Classes.Staff.StaffManager;
import Classes.Staff.StaffPackage;
import Classes.Statistics.IStatisticsGenerator;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Staff.impl.StaffManagerImpl#getStaff <em>Staff</em>}</li>
 *   <li>{@link Classes.Staff.impl.StaffManagerImpl#getIStatisticsGenerator <em>IStatistics Generator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaffManagerImpl extends MinimalEObjectImpl.Container implements StaffManager {
	/**
	 * The cached value of the '{@link #getStaff() <em>Staff</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaff()
	 * @generated NOT
	 * @ordered
	 */
	private EMap<String, Staff> staff;

	/**
	 * The cached value of the '{@link #getIStatisticsGenerator() <em>IStatistics Generator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIStatisticsGenerator()
	 * @generated
	 * @ordered
	 */
	protected IStatisticsGenerator iStatisticsGenerator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaffManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StaffPackage.Literals.STAFF_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Staff> getStaff() {
		if (staff == null) {
			staff = new EcoreEMap<String,Staff>(ECoreMapEntriesPackage.Literals.STRING_TO_STAFF_MAP, StringToStaffMapImpl.class, this, StaffPackage.STAFF_MANAGER__STAFF);
		}
		return staff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStatisticsGenerator getIStatisticsGenerator() {
		if (iStatisticsGenerator != null && iStatisticsGenerator.eIsProxy()) {
			InternalEObject oldIStatisticsGenerator = (InternalEObject)iStatisticsGenerator;
			iStatisticsGenerator = (IStatisticsGenerator)eResolveProxy(oldIStatisticsGenerator);
			if (iStatisticsGenerator != oldIStatisticsGenerator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StaffPackage.STAFF_MANAGER__ISTATISTICS_GENERATOR, oldIStatisticsGenerator, iStatisticsGenerator));
			}
		}
		return iStatisticsGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IStatisticsGenerator basicGetIStatisticsGenerator() {
		return iStatisticsGenerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIStatisticsGenerator(IStatisticsGenerator newIStatisticsGenerator) {
		IStatisticsGenerator oldIStatisticsGenerator = iStatisticsGenerator;
		iStatisticsGenerator = newIStatisticsGenerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StaffPackage.STAFF_MANAGER__ISTATISTICS_GENERATOR, oldIStatisticsGenerator, iStatisticsGenerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAllStaff() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchStaff() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getStaffFirstName(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getStaffLastName(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getStaffJob(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getStaffPhone(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getStaffEmail(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getStaffSalaryContractType(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getStaffSalary(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeStaffFirstName(String SSID, String firstName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeStaffLastName(String SSID, String lastName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeStaffJob(String SSID, String job) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeStaffPhone(String SSID, String phoneNumber) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeStaffSalaryContract(String SSID, String salaryContract) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void scheduleStaff() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StaffPackage.STAFF_MANAGER__STAFF:
				return ((InternalEList<?>)getStaff()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StaffPackage.STAFF_MANAGER__STAFF:
				if (coreType) return getStaff();
				else return getStaff().map();
			case StaffPackage.STAFF_MANAGER__ISTATISTICS_GENERATOR:
				if (resolve) return getIStatisticsGenerator();
				return basicGetIStatisticsGenerator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case StaffPackage.STAFF_MANAGER__STAFF:
				((EStructuralFeature.Setting)getStaff()).set(newValue);
				return;
			case StaffPackage.STAFF_MANAGER__ISTATISTICS_GENERATOR:
				setIStatisticsGenerator((IStatisticsGenerator)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case StaffPackage.STAFF_MANAGER__STAFF:
				getStaff().clear();
				return;
			case StaffPackage.STAFF_MANAGER__ISTATISTICS_GENERATOR:
				setIStatisticsGenerator((IStatisticsGenerator)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case StaffPackage.STAFF_MANAGER__STAFF:
				return staff != null && !staff.isEmpty();
			case StaffPackage.STAFF_MANAGER__ISTATISTICS_GENERATOR:
				return iStatisticsGenerator != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case StaffPackage.STAFF_MANAGER___GET_ALL_STAFF:
				getAllStaff();
				return null;
			case StaffPackage.STAFF_MANAGER___SEARCH_STAFF:
				searchStaff();
				return null;
			case StaffPackage.STAFF_MANAGER___GET_STAFF_FIRST_NAME__STRING:
				getStaffFirstName((String)arguments.get(0));
				return null;
			case StaffPackage.STAFF_MANAGER___GET_STAFF_LAST_NAME__STRING:
				getStaffLastName((String)arguments.get(0));
				return null;
			case StaffPackage.STAFF_MANAGER___GET_STAFF_JOB__STRING:
				getStaffJob((String)arguments.get(0));
				return null;
			case StaffPackage.STAFF_MANAGER___GET_STAFF_PHONE__STRING:
				getStaffPhone((String)arguments.get(0));
				return null;
			case StaffPackage.STAFF_MANAGER___GET_STAFF_EMAIL__STRING:
				getStaffEmail((String)arguments.get(0));
				return null;
			case StaffPackage.STAFF_MANAGER___GET_STAFF_SALARY_CONTRACT_TYPE__STRING:
				getStaffSalaryContractType((String)arguments.get(0));
				return null;
			case StaffPackage.STAFF_MANAGER___GET_STAFF_SALARY__STRING:
				getStaffSalary((String)arguments.get(0));
				return null;
			case StaffPackage.STAFF_MANAGER___CHANGE_STAFF_FIRST_NAME__STRING_STRING:
				changeStaffFirstName((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case StaffPackage.STAFF_MANAGER___CHANGE_STAFF_LAST_NAME__STRING_STRING:
				changeStaffLastName((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case StaffPackage.STAFF_MANAGER___CHANGE_STAFF_JOB__STRING_STRING:
				changeStaffJob((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case StaffPackage.STAFF_MANAGER___CHANGE_STAFF_PHONE__STRING_STRING:
				changeStaffPhone((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case StaffPackage.STAFF_MANAGER___CHANGE_STAFF_SALARY_CONTRACT__STRING_STRING:
				changeStaffSalaryContract((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case StaffPackage.STAFF_MANAGER___SCHEDULE_STAFF:
				scheduleStaff();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //StaffManagerImpl
