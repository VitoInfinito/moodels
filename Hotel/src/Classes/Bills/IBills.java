/**
 */
package Classes.Bills;

import java.util.Date;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNullByDefault;

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
public interface IBills extends EObject {
	
	IBills INSTANCE = Classes.Bills.impl.BillsManagerImpl.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	boolean getIsBillPaid(String billID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllBillsNotPaid();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	Date getBillPaymentDate(String billID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllBillIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchBills(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllPayedBills();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model itemsDataType="org.eclipse.uml2.types.String" itemsMany="true" itemsOrdered="false" servicesDataType="org.eclipse.uml2.types.String" servicesMany="true" servicesOrdered="false" bookableDataType="org.eclipse.uml2.types.String" bookableRequired="true" bookableOrdered="false"
	 * @generated
	 */
	void addBill(EList<String> items, EList<String> services, String bookable);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model ccNumberDataType="org.eclipse.uml2.types.String" ccNumberRequired="true" ccNumberOrdered="false" ccvDataType="org.eclipse.uml2.types.String" ccvRequired="true" ccvOrdered="false" expiryMonthRequired="true" expiryMonthOrdered="false" expiryYearRequired="true" expiryYearOrdered="false" firstNameDataType="org.eclipse.uml2.types.String" firstNameRequired="true" firstNameOrdered="false" lastNameDataType="org.eclipse.uml2.types.String" lastNameRequired="true" lastNameOrdered="false"
	 * @generated
	 */
	void payBillsWithCreditCard(String ccNumber, String ccv, int expiryMonth, int expiryYear, String firstName, String lastName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getBillItems(String billID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	String getBillBookable(String billID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated NOT
	 */
	List<String> getBillServices(String billID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	Date getBillIssueDate(String billID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	String getBillPaymentType(String billID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model billsDataType="org.eclipse.uml2.types.String" billsMany="true" billsOrdered="false"
	 * @generated
	 */
	void payBillsWithCash(EList<String> bills);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false" emailDataType="org.eclipse.uml2.types.String" emailRequired="true" emailOrdered="false"
	 * @generated
	 */
	void sendInvoice(String billID, String email);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	void removeBill(String billID);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" billIDDataType="org.eclipse.uml2.types.String" billIDRequired="true" billIDOrdered="false"
	 * @generated
	 */
	double getBillTotalAmount(String billID);

} // IBills
