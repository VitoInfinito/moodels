/**
 */
package Classes.Feedback;

import org.eclipse.emf.common.util.EList;

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
 * @generated
 */
public interface FeedbackManager extends IFeedback {
	/**
	 * Returns the value of the '<em><b>Feedback</b></em>' reference list.
	 * The list contents are of type {@link Classes.Feedback.Feedback}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feedback</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feedback</em>' reference list.
	 * @see Classes.Feedback.FeedbackPackage#getFeedbackManager_Feedback()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Feedback> getFeedback();

} // FeedbackManager
