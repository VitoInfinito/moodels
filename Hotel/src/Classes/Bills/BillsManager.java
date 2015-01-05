/**
 */
package Classes.Bills;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import javax.xml.soap.SOAPException;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;
import Classes.Bookables.IBookablesAccess;
import Classes.Inventory.IInventoryAccess;
import Classes.Services.IServicesAccess;
import Classes.Utils.InsufficientFundsException;
import Classes.Utils.InvalidCreditCardException;
import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
@NonNullByDefault
class BillsManager implements IBills {
	private final Logger logger = LoggerFactory.getLogger(BillsManager.class);
	public static BillsManager INSTANCE = new BillsManager();
	private static int idCounter = 1;

	private HashMap<String, Bill> bills;
	
	private IBookablesAccess bookablesAccess;
	private IInventoryAccess inventoryAccess;
	private IServicesAccess servicesAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private BillsManager() {
		super();
		bills = new HashMap<String,Bill>();
		bookablesAccess = IBookablesAccess.INSTANCE;
		inventoryAccess = IInventoryAccess.INSTANCE;
		servicesAccess = IServicesAccess.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public boolean getIsBillPaid(String billID) throws InvalidIDException {
		if (bills.containsKey(billID)) {
			return bills.get(billID).isPaid();
		} else {
			logger.warn("A bill with id {} could not be found.", billID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllBillsNotPaid() {
		List<String> notPaid = new ArrayList<String>();
		for(Bill b : bills.values()) {
			if(!b.isPaid()) 
				notPaid.add(b.getId());
		}
		return notPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public LocalDateTime getBillPaymentDate(String billID) throws InvalidIDException {
		if (bills.containsKey(billID)) {
			return bills.get(billID).getPaymentDate();
		} else {
			logger.warn("A bill with id {} could not be found.", billID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllBillIDs() {
		return new ArrayList<String>(bills.keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> searchBills(String keyword) {
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");

		// Exact ID match. First Order!
		if (bills.containsKey(keyword)) {
			searchResult.add(keyword);
		}

		Collection<Bill> c = bills.values();
		
		// Some property match exactly. Second Order!
		for (Bill b : c) {
			if (b.getBookable().equalsIgnoreCase(keyword)) {
				searchResult.add(b.getId());
			} else if (b.getItems().contains(keyword)) {
				searchResult.add(b.getId());
			} else if (b.getServices().contains(keyword)) {
				searchResult.add(b.getId());
			}
		}
		
		// ID match somewhat. Third Order!
		for (Bill b : c) {			
			if (regexPattern.matcher(b.getId()).matches()) {
				searchResult.add(b.getId());
			} 
		}

		// Some property match somewhat. Fourth Order.
		for (Bill b : c) {
			if (regexPattern.matcher(b.getBookable()).matches()) {
				searchResult.add(b.getId());
			}
		}
		

		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllPayedBills() {
		List<String> paidBills = new ArrayList<String>();

		for(Bill b : bills.values()){
			if(b.isPaid())
				paidBills.add(b.getId());
		}
		return paidBills;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String addBill(List<String> items, List<String> services, String bookable, LocalDateTime from, LocalDateTime to, double discount) throws InvalidIDException {
		if (discount < 0 || discount > 1) {
			logger.warn("The discount {} is not in [0,1].", discount);
			throw new IllegalArgumentException("Discount should be in [0,1]!");
		}
		
		Bill bill = BillsFactory.INSTANCE.createBill(); 
		
		String ID = generateID();
		
		bill.setId(ID);
		bill.setIsPaid(false);
		bill.setPaymentDate(to);
		bill.setIssueDate(LocalDateTime.now());
		bill.setDiscount(discount);
		
		// Calculate total cost
		double totalCost = 0;
		
		if (bookable != null) {
			totalCost += bookablesAccess.getBookableBasePrice(bookable) * from.until(to, ChronoUnit.DAYS);
			bill.setBookable(bookable);
		}
		
		for (String item : items) {
			totalCost += inventoryAccess.getItemPrice(item);
			bill.addItem(item);
		}
		
		for (String service : services) {
			totalCost += servicesAccess.getServicePrice(service);
			bill.addService(service);
		}
		
		totalCost *= (1-discount);
		
		bill.setTotalAmount(totalCost);
		
		bills.put(ID, bill);
		
		return ID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws SOAPException, InvalidCreditCardException, InsufficientFundsException
	 * @generated NOT
	 */
	public void payBillsWithCreditCard(List<String> billss, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) throws SOAPException, InvalidCreditCardException, InsufficientFundsException {
		CustomerRequires bank = CustomerRequires.instance();
		
		// Validate card
		if (!bank.isCreditCardValid(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName)) {
			logger.warn("The card passed was invalid.");
			throw new InvalidCreditCardException("Invalid card!");
		}
		
		// Calc sum
		double sum = 0;
		
		for (String bill : billss) {
			sum += bills.get(bill).getTotalAmount();
		}
		
		// Pay
		if (!bank.makePayment(ccNumber, ccv, expiryMonth, expiryYear, firstName, lastName, sum)) {
			logger.warn("The card passed had insufficient funds to pay the amount {}.", sum);
			throw new InsufficientFundsException("Insufficient funds!");
		}
		
		for (String billID : billss) {
			Bill bill = bills.get(billID);
			bill.setIsPaid(true);
			bill.setPaymentDate(LocalDateTime.now());
			bill.setPaymentType("Credit Card");
		}
	}

	private String generateID() {
		return String.format("bi%06d", idCounter++);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public List<String> getBillItems(String billID) throws InvalidIDException {
		if (bills.containsKey(billID)) {
			return new ArrayList<String>(bills.get(billID).getItems());
		} else {
			logger.warn("A bill with id {} could not be found.", billID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getBillBookable(String billID) throws InvalidIDException {
		if (bills.containsKey(billID)) {
			return bills.get(billID).getBookable();
		} else {
			logger.warn("A bill with id {} could not be found.", billID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public List<String> getBillServices(String billID) throws InvalidIDException {
		if (bills.containsKey(billID)) {
			return new ArrayList<String>(bills.get(billID).getServices());
		} else {
			logger.warn("A bill with id {} could not be found.", billID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public LocalDateTime getBillIssueDate(String billID) throws InvalidIDException {
		if (bills.containsKey(billID)) {
			return bills.get(billID).getIssueDate();
		} else {
			logger.warn("A bill with id {} could not be found.", billID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public String getBillPaymentType(String billID) throws InvalidIDException {
		if (bills.containsKey(billID)) {
			return bills.get(billID).getPaymentType();
		} else {
			logger.warn("A bill with id {} could not be found.", billID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void payBillsWithCash(List<String> billss) {
		for (String billID : billss) {
			Bill bill = bills.get(billID);
			bill.setIsPaid(true);
			bill.setPaymentDate(LocalDateTime.now());
			bill.setPaymentType("Cash");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendInvoice(String billID, String email) {
		System.out.println("Sending the following invoice to " + email + ".");
		System.out.println(bills.get(billID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public void removeBill(String billID) throws InvalidIDException {
		if (bills.containsKey(billID)) {
			bills.remove(billID);
		} else {
			logger.warn("A bill with id {} could not be found.", billID);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @generated NOT
	 */
	public double getBillTotalAmount(String billID) throws InvalidIDException {
		if (bills.containsKey(billID)) {
			return bills.get(billID).getTotalAmount();
		} else {
			logger.warn("A bill with id {} could not be found.", billID);
			throw new InvalidIDException();
		}
	}

	@Override
	public double getBillDiscount(String billID) throws InvalidIDException {
		if (bills.containsKey(billID)) {
			return bills.get(billID).getDiscount();
		} else {
			logger.warn("A bill with id {} could not be found.", billID);
			throw new InvalidIDException();
		}
	}
} //BillsManagerImpl
