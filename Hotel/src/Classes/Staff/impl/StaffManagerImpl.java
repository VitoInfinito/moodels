/**
 */
package Classes.Staff.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.InvalidIDException;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToStaffMapImpl;
import Classes.Staff.SalaryContract;
import Classes.Staff.Staff;
import Classes.Staff.StaffFactory;
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

	private EMap<String, Staff> employees;
	private IStatisticsGenerator iStatisticsGenerator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private StaffManagerImpl() {
		super();
		employees = new EcoreEMap<String,Staff>(ECoreMapEntriesPackage.Literals.STRING_TO_STAFF_MAP, StringToStaffMapImpl.class, this, StaffPackage.STAFF_MANAGER__STAFF);
		iStatisticsGenerator = IStatisticsGenerator.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllStaff() {
		return Collections.unmodifiableList(new ArrayList<String>(employees.keySet()));
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
		if(employees.contains(SSID)) {
			return employees.get(SSID).getFirstName();
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
		if(employees.contains(SSID)) {
			return employees.get(SSID).getLastName();
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
		if(employees.contains(SSID)) {
			return employees.get(SSID).getJob();
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
		if(employees.contains(SSID)) {
			return employees.get(SSID).getPhone();
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
		if(employees.contains(SSID)) {
			return employees.get(SSID).getEmail();
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
	public String getStaffSalaryContractType(String SSID) {
		if(employees.contains(SSID)){
			return employees.get(SSID).getSalaryContract().getType();
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
	public double getStaffSalary(String SSID) {
		if(employees.contains(SSID)) {
			return employees.get(SSID).getSalaryContract().getSalary();
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
		if(employees.contains(SSID)) {
			employees.get(SSID).setFirstName(firstName);
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
		if(employees.contains(SSID)) {
			employees.get(SSID).setLastName(lastName);
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
		if(employees.contains(SSID)) {
			employees.get(SSID).setJob(job);
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
		if(employees.contains(SSID)) {
			employees.get(SSID).setPhone(phoneNumber);
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
	public void changeStaffSalaryContract(String SSID, SalaryContract salaryContract) {
		if(employees.contains(SSID)) {
			employees.get(SSID).setSalaryContract(salaryContract);
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
	public EList<String> scheduleStaff(Date from, Date to) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @generated NOT
	*/

	public void addEmployee(String firstname, String lastname, String job, String phone, String email, String SSID, String salaryContractType, double salary) {
		if (employees.containsKey(SSID)) {
			logger.warn("There is already an employee added with the SSID {}. The SSID can not be used as a unique ID!", SSID);
			throw new InvalidIDException("There is already an employee added with the SSID " + SSID + ". The SSID can not be used as a unique ID!");
		}
		
		
		Staff staff = StaffFactory.eINSTANCE.createStaff();
		
		staff.setFirstName(firstname);
		staff.setLastName(lastname);
		staff.setJob(job);
		staff.setPhone(phone);
		staff.setSsid(SSID);

		SalaryContract contract;

		switch (salaryContractType) {
			case "Monthly": contract = StaffFactory.eINSTANCE.createMonthlySalaryContract();
							contract.setSalary(salary);
							staff.setSalaryContract(contract);
							break;
			case "Hourly":	contract = StaffFactory.eINSTANCE.createHourlySalaryContract();
							contract.setSalary(salary);
							staff.setSalaryContract(contract);
							break;
			default:	logger.warn("Invalid salary contract", salaryContractType);
		}
		
		employees.put(SSID, staff);
	}
} //StaffManagerImpl
