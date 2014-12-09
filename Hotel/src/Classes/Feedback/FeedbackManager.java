/**
 */
package Classes.Feedback;

import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Feedback.FeedbackManager#getFeedback <em>Feedback</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Feedback.FeedbackPackage#getFeedbackManager()
 * @model
 * @generated NOT
 */
public interface FeedbackManager extends IFeedback {
	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link Classes.Feedback.Feedback},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' map.
	 * @see Classes.Feedback.FeedbackPackage#getFeedbackManager_Feedback()
	 * @model mapType="Classes.ECoreMapEntries.StringToFeedbackMap<org.eclipse.uml2.types.String, Classes.Feedback.Feedback>" ordered="false"
	 * @generated NOT
	 */
	List<Feedback> getFeedbacks();

} // FeedbackManager
