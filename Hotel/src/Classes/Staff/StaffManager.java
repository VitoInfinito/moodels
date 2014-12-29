/**
 */
package Classes.Staff;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.Statistics.IStatisticsGenerator;
import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
 class StaffManager implements IStaff{
	private static final long serialVersionUID = -1643928709286590108L;
	private final Logger logger = LoggerFactory.getLogger(StaffManager.class);
	public static StaffManager INSTANCE = new StaffManager();

	private HashMap<String, Staff> employees;
	private IStatisticsGenerator iStatisticsGenerator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private StaffManager() {
		super();
		employees = new HashMap<String,Staff>();
		iStatisticsGenerator = IStatisticsGenerator.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllStaff() {
		return new ArrayList<String>(employees.keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> searchStaff(String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		if (employees.containsKey(keyword)) {
			searchResult.add(keyword);
		}

		Collection<Staff> c = employees.values();
		
		// Some property match exactly. Second Order!
		for (Staff b : c) {
			if (b.getFirstName().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getSsid());
			} else if (b.getLastName().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getSsid());
			} else if (b.getJob().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getSsid());
			} else if (b.getEmail().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getSsid());
			} else if (b.getPhone().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getSsid());
			} else if (b.getSalaryContract().getType().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getSsid());
			}
		}
		
		// ID match somewhat. Third Order!
		for (Staff b : c) {			
			if (regexPattern.matcher(b.getSsid()).matches()) {
				searchResult.add(b.getSsid());
			} 
		}

		// Some property match somewhat. Fourth Order.
		for (Staff b : c) {
			if (regexPattern.matcher(b.getFirstName()).matches()) {
				searchResult.add(b.getSsid());
			} else if (regexPattern.matcher(b.getLastName()).matches()) {
				searchResult.add(b.getSsid());
			} else if (regexPattern.matcher(b.getJob()).matches()) {
				searchResult.add(b.getSsid());
			} else if (regexPattern.matcher(b.getEmail()).matches()) {
				searchResult.add(b.getSsid());
			} else if (regexPattern.matcher(b.getPhone()).matches()) {
				searchResult.add(b.getSsid());
			} else if (regexPattern.matcher(b.getPhone()).matches()) {
				searchResult.add(b.getSsid());
			} else if (regexPattern.matcher(b.getSalaryContract().getType()).matches()) {
				searchResult.add(b.getSsid());
			}
		}
		

		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getStaffFirstName(String SSID) throws InvalidIDException {
		if(employees.containsKey(SSID)) {
			return employees.get(SSID).getFirstName();
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getStaffLastName(String SSID) throws InvalidIDException {
		if(employees.containsKey(SSID)) {
			return employees.get(SSID).getLastName();
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getStaffJob(String SSID) throws InvalidIDException {
		if(employees.containsKey(SSID)) {
			return employees.get(SSID).getJob();
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getStaffPhone(String SSID) throws InvalidIDException {
		if(employees.containsKey(SSID)) {
			return employees.get(SSID).getPhone();
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getStaffEmail(String SSID) throws InvalidIDException {
		if(employees.containsKey(SSID)) {
			return employees.get(SSID).getEmail();
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getStaffSalaryContractType(String SSID) throws InvalidIDException {
		if(employees.containsKey(SSID)){
			return employees.get(SSID).getSalaryContract().getType();
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public double getStaffSalary(String SSID) throws InvalidIDException {
		if(employees.containsKey(SSID)) {
			return employees.get(SSID).getSalaryContract().getSalary();
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changeStaffFirstName(String SSID, String firstName) throws InvalidIDException {
		if(employees.containsKey(SSID)) {
			employees.get(SSID).setFirstName(firstName);
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changeStaffLastName(String SSID, String lastName) throws InvalidIDException {
		if(employees.containsKey(SSID)) {
			employees.get(SSID).setLastName(lastName);
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changeStaffJob(String SSID, String job) throws InvalidIDException {
		if(employees.containsKey(SSID)) {
			employees.get(SSID).setJob(job);
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changeStaffPhone(String SSID, String phoneNumber) throws InvalidIDException {
		if(employees.containsKey(SSID)) {
			employees.get(SSID).setPhone(phoneNumber);
		} else {
			logger.warn("A staff with SSID {} could not be found.", SSID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void changeStaffSalaryContract(String SSID, SalaryContract salaryContract) throws InvalidIDException {
		if(employees.containsKey(SSID)) {
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
	public LinkedHashMap<LocalDateTime, List<String>> scheduleStaff(LocalDateTime from, LocalDateTime to) {
		// TODO implement this better...
		LinkedHashMap<LocalDateTime, List<String>> dailyWorkers = new LinkedHashMap<LocalDateTime, List<String>>();
		LinkedHashMap<LocalDateTime, Integer> stat = iStatisticsGenerator.getOccupancyStatistics(from, to);
		List<Staff> allEmplyees = new ArrayList<Staff>(employees.values());
		for (Map.Entry<LocalDateTime, Integer> entry : stat.entrySet()) {
			int requiredWorkers = entry.getValue()/10;  // Hardcoded... lacked time to implement in a more advanced way
			HashSet<String> working = new HashSet<String>();
			Collections.shuffle(allEmplyees);
			for (Staff employee : employees.values()) {
				if (working.size() == requiredWorkers) {
					break;
				}
				working.add(employee.getSsid());
			}
			dailyWorkers.put(entry.getKey(), new ArrayList<String>(working));
		}
		return dailyWorkers;
	}

	/**
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @throws InvalidIDException 
	* @generated NOT
	*/

	public void addEmployee(String firstname, String lastname, String job, String phone, String email, String SSID, String salaryContractType, double salary) throws InvalidIDException {
		if (employees.containsKey(SSID)) {
			logger.warn("There is already an employee added with the SSID {}. The SSID can not be used as a unique ID!", SSID);
			throw new InvalidIDException("There is already an employee added with the SSID " + SSID + ". The SSID can not be used as a unique ID!");
		}
		
		
		Staff staff = StaffFactory.INSTANCE.createStaff();
		
		staff.setFirstName(firstname);
		staff.setLastName(lastname);
		staff.setJob(job);
		staff.setPhone(phone);
		staff.setSsid(SSID);

		SalaryContract contract;

		switch (salaryContractType) {
			case "Monthly": contract = StaffFactory.INSTANCE.createMonthlySalaryContract();
							contract.setSalary(salary);
							staff.setSalaryContract(contract);
							break;
			case "Hourly":	contract = StaffFactory.INSTANCE.createHourlySalaryContract();
							contract.setSalary(salary);
							staff.setSalaryContract(contract);
							break;
			default:	logger.warn("Invalid salary contract", salaryContractType);
		}
		
		employees.put(SSID, staff);
	}
} //StaffManagerImpl
