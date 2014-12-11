/**
 */
package Classes.Staff.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Classes.InvalidIDException;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToStaffMapImpl;
import Classes.Staff.Staff;
import Classes.Staff.StaffManager;
import Classes.Staff.StaffPackage;
import Classes.Statistics.IStatisticsGenerator;

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
	private final Logger logger = LoggerFactory.getLogger(StaffManagerImpl.class);
	public static StaffManagerImpl INSTANCE = new StaffManagerImpl();
	
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
	 * @generated NOT
	 */
	private StaffManagerImpl() {
		super();
		staff = new EcoreEMap<String,Staff>(ECoreMapEntriesPackage.Literals.STRING_TO_STAFF_MAP, StringToStaffMapImpl.class, this, StaffPackage.STAFF_MANAGER__STAFF);
		iStatisticsGenerator = IStatisticsGenerator.INSTANCE;
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
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Staff> getStaff() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IStatisticsGenerator getIStatisticsGenerator() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public IStatisticsGenerator basicGetIStatisticsGenerator() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIStatisticsGenerator(IStatisticsGenerator newIStatisticsGenerator) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllStaff() {
		return new ArrayList<String>(staff.keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchStaff(String keyword) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStaffFirstName(String SSID) {
		if(staff.contains(SSID)) {
			return staff.get(SSID).getFirstName();
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStaffLastName(String SSID) {
		if(staff.contains(SSID)) {
			return staff.get(SSID).getLastName();
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStaffJob(String SSID) {
		if(staff.contains(SSID)) {
			return staff.get(SSID).getJob();
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStaffPhone(String SSID) {
		if(staff.contains(SSID)) {
			return staff.get(SSID).getPhone();
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getStaffEmail(String SSID) {
		if(staff.contains(SSID)) {
			return staff.get(SSID).getEmail();
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStaffSalaryContractType(String SSID) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public double getStaffSalary(String SSID) {
		if(staff.contains(SSID)) {
			return staff.get(SSID).getSalaryContract().getSalary();
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeStaffFirstName(String SSID, String firstName) {
		if(staff.contains(SSID)) {
			staff.get(SSID).setFirstName(firstName);
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeStaffLastName(String SSID, String lastName) {
		if(staff.contains(SSID)) {
			staff.get(SSID).setLastName(lastName);
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeStaffJob(String SSID, String job) {
		if(staff.contains(SSID)) {
			staff.get(SSID).setJob(job);;
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeStaffPhone(String SSID, String phoneNumber) {
		if(staff.contains(SSID)) {
			staff.get(SSID).setPhone(phoneNumber);;
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
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
	public EList<String> scheduleStaff(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addEmployee(String firstname, String lastname, String job, String phone, String email, String SSID, String salaryContractType, double salary) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		throw new UnsupportedOperationException();
	}

} //StaffManagerImpl
