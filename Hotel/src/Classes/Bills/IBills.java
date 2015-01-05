/**
 */
package Classes.Bills;

import java.time.LocalDateTime;
import java.util.List;

import javax.xml.soap.SOAPException;

import org.eclipse.jdt.annotation.NonNullByDefault;
import org.eclipse.jdt.annotation.Nullable;

import Classes.Utils.InsufficientFundsException;
import Classes.Utils.InvalidCreditCardException;
import Classes.Utils.InvalidIDException;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IBills</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Bills.BillsPackage#getIBills()
 * @model interface="true" abstract="true"
 * @generated
 */
@NonNullByDefault
public interface IBills {
	
	IBills INSTANCE = Classes.Bills.BillsManager.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		billID != null
	 * Ensures:
	 * 		if there exists an bill such that bill.id == billID
	 * 			it returns the paid status for that bill
	 * 		otherwise
	 * 			An InvalidIDException is thrown 
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	boolean getIsBillPaid(String billID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		nothing
	 * Ensures:
	 * 	 	A non null list of all bills that are not payed.
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllBillsNotPaid();

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		billID != null
	 * Ensures:
	 * 		if there exists an bill such that bill.id == billID
	 * 			it returns the payment date of the specified bill
	 * 		otherwise
	 * 			An InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	LocalDateTime getBillPaymentDate(String billID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		nothing
	 * Ensures:
	 * 	 	A non null list of all bills IDs.
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllBillIDs();

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		keyword != null
	 * Ensures:
	 * 	 	returns a non-null list of all bill IDs matching something in the following order:
	 * 			1. Bills with id that exactly matches the keyword
	 * 			2. Bills with id that has some matching to the keyword
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchBills(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		nothing
	 * Ensures:
	 * 	 	A non null list of all bills that are payed.
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllPayedBills();

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		items != null && services != null && discount != null
	 * Ensures:
	 * 		if the requirements are satisfied 
	 * 			a bill is added
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * NOTE the the bookable and the from and to dates are supplied if the bill is including a bookable, not if the bill is put on a room etc.
	 * Discount is between 0 and 1.
	 * <!-- end-user-doc -->
	 * @param to 
	 * @param from 
	 * @return 
	 * @throws InvalidIDException 
	 * @model itemsDataType="org.eclipse.uml2.types.String" itemsMany="true" itemsOrdered="false" servicesDataType="org.eclipse.uml2.types.String" servicesMany="true" servicesOrdered="false" bookableDataType="org.eclipse.uml2.types.String" bookableRequired="true" bookableOrdered="false"
	 * @generated NOT
	 */
	String addBill(List<String> items, List<String> services, @Nullable String bookable, @Nullable LocalDateTime from, @Nullable LocalDateTime to, double discount) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc --> TODO: This needs polish
	 * Requires:
	 * 		bills != null && ccNumber != null && ccv != null && expiryMonth != null && expiryYear != null && firstName != null && lastName != null
	 * Ensures:
	 * 	 	if !bill.getBillIsPayed() && requirements are met
	 * 			Changes the status of the bill
	 * 		otherwise
	 * 			SOAPException, InvalidCreditCardException, InsufficientFundsException may be thrown.
	 * <!-- end-user-doc -->
	 * @throws SOAPException, InvalidCreditCardException, InsufficientFundsException
	 * @model billsDataType="org.eclipse.uml2.types.String" billsMany="true" billsOrdered="false" ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated NOT
	 */
	void payBillsWithCreditCard(List<String> bills, String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName) throws SOAPException, InvalidCreditCardException, InsufficientFundsException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		billID != null
	 * Ensures:
	 * 	 	if there exists items to a bill satisfying billID == bill.id
	 * 			non null list of items belonging to that bill is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getBillItems(String billID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		billID != null
	 * Ensures:
	 * 	 	if there a bill satisfying billID == bill.id
	 * 			returns the bookable of that bill
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	String getBillBookable(String billID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		billID != null
	 * Ensures:
	 * 	 	if there exists a bill satisfying billID == bill.id
	 * 			the bookable of that bill is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getBillServices(String billID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		billID != null
	 * Ensures:
	 * 	 	if there a bill satisfying billID == bill.id
	 * 			returns the issue date of that bill
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	LocalDateTime getBillIssueDate(String billID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		billID != null
	 * Ensures:
	 * 	 	if there a bill satisfying billID == bill.id
	 * 			returns the payment type of that bill
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	String getBillPaymentType(String billID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		bills != null
	 * Ensures:
	 * 	 	The payed status of the bills is updated to payed.
	 * <!-- end-user-doc -->
	 * @model billsDataType="org.eclipse.uml2.types.String" billsMany="true" billsOrdered="false"
	 * @generated NOT
	 */
	void payBillsWithCash(List<String> bills);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		billID != null && email != null
	 * Ensures:
	 * 	 	if there a bill satisfying billID == bill.id && email != null
	 * 			The invoice is sent by email
	 * <!-- end-user-doc -->
	 * @model billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false" emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	void sendInvoice(String billID, String email);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		billID != null
	 * Ensures:
	 * 	 	if there a bill satisfying billID == bill.id
	 * 			The bill is removed.
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	void removeBill(String billID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		billID != null
	 * Ensures:
	 * 	 	if there a bill satisfying billID == bill.id
	 * 			returns the total amount of that bill
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model required="true" ordered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	double getBillTotalAmount(String billID) throws InvalidIDException;

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		billID != null
	 * Ensures:
	 * 	 	if there a bill satisfying billID == bill.id
	 * 			returns the discount of that bill
	 * 		otherwise
	 * 			InvalidIDException is thrown.
	 * <!-- end-user-doc -->
	 * @throws InvalidIDException 
	 * @model billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	double getBillDiscount(String billID) throws InvalidIDException;

} // IBills
