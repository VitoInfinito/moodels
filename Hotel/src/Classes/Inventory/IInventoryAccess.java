/**
 */
package Classes.Inventory;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IInventory Access</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Inventory.InventoryPackage#getIInventoryAccess()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IInventoryAccess extends EObject {
	
	IInventoryAccess INSTANCE = Classes.Inventory.impl.InventoryManagerImpl.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false" stockDataType="org.eclipse.uml2.types.Integer" stockRequired="true" stockOrdered="false"
	 * @generated
	 */
	void changeItemStock(String id, int stock);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false"
	 * @generated
	 */
	double getItemPrice(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false"
	 * @generated
	 */
	String getItemName(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Integer" required="true" ordered="false" idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false"
	 * @generated
	 */
	int getItemStock(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false" idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false"
	 * @generated
	 */
	double getItemExpense(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllItemIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	EList<String> searchItems(String keyword);

} // IInventoryAccess
