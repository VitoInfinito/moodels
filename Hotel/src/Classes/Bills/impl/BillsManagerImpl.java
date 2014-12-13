/**
 */
package Classes.Bills.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

import javax.xml.soap.SOAPException;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.jdt.annotation.NonNullByDefault;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import se.chalmers.cse.mdsd1415.banking.customerRequires.CustomerRequires;
import Classes.InvalidCreditCardException;
import Classes.InvalidIDException;
import Classes.Bills.Bill;
import Classes.Bills.BillsFactory;
import Classes.Bills.BillsManager;
import Classes.Bills.BillsPackage;
import Classes.Bookables.IBookablesAccess;
import Classes.ECoreMapEntries.ECoreMapEntriesPackage;
import Classes.ECoreMapEntries.impl.StringToBillMapImpl;
import Classes.Inventory.IInventoryAccess;
import Classes.Services.IServicesAccess;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
@NonNullByDefault
public class BillsManagerImpl extends MinimalEObjectImpl.Container implements BillsManager {
	private final Logger logger = LoggerFactory.getLogger(BillsManagerImpl.class);
	public static BillsManagerImpl INSTANCE = new BillsManagerImpl();
	private static int idCounter = 1;

	private EMap<String, Bill> bills;
	
	private IBookablesAccess bookablesAccess;
	private IInventoryAccess inventoryAccess;
	private IServicesAccess servicesAccess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private BillsManagerImpl() {
		super();
		bills = new EcoreEMap<String,Bill>(ECoreMapEntriesPackage.Literals.STRING_TO_BILL_MAP, StringToBillMapImpl.class, this, BillsPackage.BILLS_MANAGER__BILLS);
		bookablesAccess = IBookablesAccess.INSTANCE;
		inventoryAccess = IInventoryAccess.INSTANCE;
		servicesAccess = IServicesAccess.INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean getIsBillPaid(String billID) {
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
		return Collections.unmodifiableList(notPaid);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Date getBillPaymentDate(String billID) {
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
	 * @generated NOT
	 */
	public List<String> getAllBillIDs() {
		return Collections.unmodifiableList(new ArrayList<String>(bills.keySet()));
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
		

		return Collections.unmodifiableList(new ArrayList<String>(searchResult));
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
		return Collections.unmodifiableList(paidBills);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addBill(List<String> items, List<String> services, String bookable, double discount) {
		if (discount < 0 || discount > 1) {
			logger.warn("The discount {} is not in [0,1].", discount);
			throw new IllegalArgumentException("Discount should be in [0,1]!");
		}
		
		Bill bill = BillsFactory.eINSTANCE.createBill(); 
		
		String ID = generateID();
		
		bill.setId(ID);
		bill.setIsPaid(false);
		bill.setIssueDate(new Date());
		
		// Calculate total cost
		double totalCost = 0;
		
		if (bookable != null) {
			totalCost += bookablesAccess.getBookableBasePrice(bookable);
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
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws SOAPException, InvalidCreditCardException
	 * @generated NOT
	 */
	public void payBillsWithCreditCard(List<String> billss, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) throws SOAPException, InvalidCreditCardException {
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
			throw new InvalidCreditCardException("Insufficient funds!");
		}
		
		for (String billID : billss) {
			Bill bill = bills.get(billID);
			bill.setIsPaid(true);
			bill.setPaymentDate(new Date());
			bill.setPaymentType("Credit Card");
		}
	}

	private String generateID() {
		return String.format("bi%06d", idCounter++);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getBillItems(String billID) {
		if (bills.containsKey(billID)) {
			return Collections.unmodifiableList(bills.get(billID).getItems());
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
	public String getBillBookable(String billID) {
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
	 * @generated NOT
	 */
	public List<String> getBillServices(String billID) {
		if (bills.containsKey(billID)) {
			return Collections.unmodifiableList(bills.get(billID).getServices());
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
	public Date getBillIssueDate(String billID) {
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
	 * @generated NOT
	 */
	public String getBillPaymentType(String billID) {
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
			bill.setPaymentDate(new Date());
			bill.setPaymentType("Cash");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sendInvoice(String billID, String email) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeBill(String billID) {
		if (bills.containsKey(billID)) {
			bills.removeKey(billID);
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
	public double getBillTotalAmount(String billID) {
		if (bills.containsKey(billID)) {
			return bills.get(billID).getTotalAmount();
		} else {
			logger.warn("A bill with id {} could not be found.", billID);
			throw new InvalidIDException();
		}
	}
} //BillsManagerImpl
