/**
 */
package Classes.Feedback;

import java.util.List;

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
	 * Requires:
	 * 		Nothing
	 * Ensures:
	 * 		if there are more than zero stored feedbacks
	 * 			return a list of all the stored feedbacks IDs
	 * 		otherwise
	 * 			return an empty list
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="org.eclipse.uml2.types.String" ordered="false"
	 * @generated NOT
	 */
	List<String> getAllFeedbackIDs();

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a feedback such that feedback.id == id
	 * 			the non null description of the feedback is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false" idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false"
	 * @generated
	 */
	String getFeedbackDescription(String id);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a feedback such that feedback.id == id
	 * 			the non null resolved status of the feedback is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false"
	 * @generated
	 */
	boolean getFeedbackIsResolved(String id);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a feedback such that feedback.id == id
	 * 			the non null noted status of the feedback is returned
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false" idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false"
	 * @generated
	 */
	boolean getFeedbackIsNoted(String id);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * 		desc = !null
	 * Ensures:
	 * 		if there exists a feedback such that feedback.id == id
	 * 			the desc of the feedback is set to the desc
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false" descDataType="org.eclipse.uml2.types.String" descRequired="true" descOrdered="false"
	 * @generated
	 */
	void setFeedbackDescription(String id, String desc);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a feedback such that feedback.id == id
	 * 			the resolved status of the feedback is set to status
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false" statusDataType="org.eclipse.uml2.types.Boolean" statusRequired="true" statusOrdered="false"
	 * @generated
	 */
	void setFeedbackIsResolved(String id, boolean status);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		if there exists a feedback such that feedback.id == id
	 * 			the noted status of the feedback is set to status
	 * 		otherwise
	 * 			InvalidIDException is thrown
	 * <!-- end-user-doc -->
	 * @model idDataType="org.eclipse.uml2.types.String" idRequired="true" idOrdered="false" statusDataType="org.eclipse.uml2.types.Boolean" statusRequired="true" statusOrdered="false"
	 * @generated
	 */
	void setFeedbackIsNoted(String id, boolean status);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.eclipse.uml2.types.String" ordered="false" keywordDataType="org.eclipse.uml2.types.String" keywordRequired="true" keywordOrdered="false"
	 * @generated NOT
	 */
	List<String> searchFeedback(String keyword);

	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		desc != null
	 * Ensures:
	 * 		that there are a feedback f with f.desc == desc
	 * <!-- end-user-doc -->
	 * @model descDataType="org.eclipse.uml2.types.String" descRequired="true" descOrdered="false"
	 * @generated
	 */
	void addFeedback(String desc);
	
	/**
	 * <!-- begin-user-doc -->
	 * Requires:
	 * 		id != null
	 * Ensures:
	 * 		that the feedback f with f.id == id are no more
	 * <!-- end-user-doc -->
	 * @model descDataType="org.eclipse.uml2.types.String" descRequired="true" descOrdered="false"
	 * @generated
	 */
	void removeFeedback(String id);

} // IFeedback
