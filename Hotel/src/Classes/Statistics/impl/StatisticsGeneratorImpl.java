/**
 */
package Classes.Statistics.impl;


import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import Classes.Bills.IBills;
import Classes.Bookings.IBookings;
import Classes.Inventory.IInventoryAccess;
import Classes.Services.IServicesAccess;
import Classes.Staff.IStaff;
import Classes.Statistics.StatisticsGenerator;
import Classes.Statistics.StatisticsPackage;
import Classes.Stays.IStays;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generator</b></em>'.
 * <!-- end-user-doc -->
 * @generated NOT
 */
public class StatisticsGeneratorImpl extends MinimalEObjectImpl.Container implements StatisticsGenerator {
	private final Logger logger = LoggerFactory.getLogger(StatisticsGeneratorImpl.class);
	public static StatisticsGeneratorImpl INSTANCE = new StatisticsGeneratorImpl();

	private IBills iBillsAccess;
	private IBookings iBooking;
	private IStaff iStaff;
	private IStays iStays;
	private IServicesAccess iService;
	private IInventoryAccess iInventory;
	private double dailyStaticExpenses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private StatisticsGeneratorImpl() {
		super();
		iBillsAccess = IBills.INSTANCE;
		iBooking = IBookings.INSTANCE;
		iStaff = IStaff.INSTANCE;
		iStays = IStays.INSTANCE;
		iService = IServicesAccess.INSTANCE;
		iInventory = IInventoryAccess.INSTANCE;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getStaticExpenses() {
		return dailyStaticExpenses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticExpenses(double newStaticExpenses) {
		double oldStaticExpenses = dailyStaticExpenses;
		dailyStaticExpenses = newStaticExpenses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StatisticsPackage.STATISTICS_GENERATOR__STATIC_EXPENSES, oldStaticExpenses, dailyStaticExpenses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedHashMap<LocalDateTime, Integer> getOccupancyStatistics(LocalDateTime from, LocalDateTime to) {
		LinkedHashMap<LocalDateTime, Integer> map = new LinkedHashMap<LocalDateTime, Integer>();
		
		LocalDateTime entryDate = LocalDateTime.of(from.getYear(), from.getMonth(), from.getDayOfMonth(), 0, 0);
		int entryValue = 0;
		
		while (entryDate.isBefore(to)) {
			for (String booking : iBooking.getAllBookingsWithStaysInPeriod(entryDate, entryDate.plusDays(1).minusNanos(1))) {
				entryValue += iBooking.getNbrGuestOfBooking(booking);
			}
			map.put(entryDate, entryValue);
			
			entryDate = entryDate.plusDays(1);
			entryValue = 0;
		}
		
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedHashMap<LocalDateTime, Double> getRevenueStatistics(LocalDateTime from, LocalDateTime to) {
		LinkedHashMap<LocalDateTime, Double> map = new LinkedHashMap<LocalDateTime, Double>();
		
		LocalDateTime entryDate = LocalDateTime.of(from.getYear(), from.getMonth(), from.getDayOfMonth(), 0, 0);
		double entryValue = 0;
		
		while (entryDate.isBefore(to)) {
			for (String bill : iBillsAccess.getAllPayedBills()) {
				LocalDateTime paymentDate = iBillsAccess.getBillPaymentDate(bill);
				if (paymentDate.isAfter(entryDate) && paymentDate.isBefore(entryDate.plusDays(1).minusNanos(1))) { // Payed within period
					entryValue += iBillsAccess.getBillTotalAmount(bill);
				}
			}
			map.put(entryDate, entryValue);
			
			entryDate = entryDate.plusDays(1);
			entryValue = 0;
		}
		
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkedHashMap<LocalDateTime, Double> getProfitStatistics(LocalDateTime from, LocalDateTime to) {
		LinkedHashMap<LocalDateTime, Double> map = new LinkedHashMap<LocalDateTime, Double>();
		
		LocalDateTime entryDate = LocalDateTime.of(from.getYear(), from.getMonth(), from.getDayOfMonth(), 0, 0);
		double entryValue = 0;
		
		while (entryDate.isBefore(to)) {
			for (String bill : iBillsAccess.getAllPayedBills()) {
				LocalDateTime paymentDate = iBillsAccess.getBillPaymentDate(bill);
				if (paymentDate.isAfter(entryDate) && paymentDate.isBefore(entryDate.plusDays(1).minusNanos(1))) { // Payed within period
					entryValue += iBillsAccess.getBillTotalAmount(bill);
					List<String> services = iBillsAccess.getBillServices(bill);
					List<String> items = iBillsAccess.getBillItems(bill);
					
					for (String service : services) {
						entryValue -= iService.getServiceExpense(service);
					}
					
					for (String item : items) {
						entryValue -= iInventory.getItemExpense(item);
					}
				}
			}
			
			for (String employee : iStaff.getAllStaff()) {
				if (iStaff.getStaffSalaryContractType(employee).equals("Hourly")) {
					entryValue -= iStaff.getStaffSalary(employee) * 40/7.0; // Average salary per day assuming working 40 hours a week...
				} else if (iStaff.getStaffSalaryContractType(employee).equals("Monthly")) {
					entryValue -= iStaff.getStaffSalary(employee) /  (365.25/12); // Average salary per day not ignoring leap years.
				}
			}
			
			entryValue -= dailyStaticExpenses;
			
			map.put(entryDate, entryValue);
			
			entryDate = entryDate.plusDays(1);
			entryValue = 0;
		}
		
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (staticExpenses: ");
		result.append(dailyStaticExpenses);
		result.append(')');
		return result.toString();
	}

} //StatisticsGeneratorImpl
