/**
 */
package Classes.Feedback;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.annotation.NonNullByDefault;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IFeedback</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see Classes.Feedback.FeedbackPackage#getIFeedback()
 * @model interface="true" abstract="true"
 * @generated
 */
@NonNullByDefault
public interface IFeedback extends EObject {
	IFeedback INSTANCE = Classes.Feedback.impl.FeedbackManagerImpl.INSTANCE;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllFeedbackIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false"
	 * @generated
	 */
	String getFeedbackDescription(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false"
	 * @generated
	 */
	boolean getFeedbackIsResolved(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false"
	 * @generated
	 */
	boolean getFeedbackIsNoted(String id);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false" descDataType="org.eclipse.uml2.types.String" descRequired="true" descOrdered="false"
	 * @generated
	 */
	void setFeedbackDescription(String id, String desc);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false" statusDataType="org.eclipse.uml2.types.Boolean" statusRequired="true" statusOrdered="false"
	 * @generated
	 */
	void setFeedbackIsResolved(String id, boolean status);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false" statusDataType="org.eclipse.uml2.types.Boolean" statusRequired="true" statusOrdered="false"
	 * @generated
	 */
	void setFeedbackIsNoted(String id, boolean status);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated
	 */
	EList<String> searchFeedback(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model descDataType="org.eclipse.uml2.types.String" descRequired="true" descOrdered="false"
	 * @generated
	 */
	void addFeedback(String desc);

} // IFeedback
