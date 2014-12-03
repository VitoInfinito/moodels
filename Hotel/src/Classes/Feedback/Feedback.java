/**
 */
package Classes.Feedback;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Feedback.Feedback#getDescription <em>Description</em>}</li>
 *   <li>{@link Classes.Feedback.Feedback#isNoted <em>Is Noted</em>}</li>
 *   <li>{@link Classes.Feedback.Feedback#isResolved <em>Is Resolved</em>}</li>
 *   <li>{@link Classes.Feedback.Feedback#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Feedback.FeedbackPackage#getFeedback()
 * @model
 * @generated
 */
public interface Feedback extends EObject {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see Classes.Feedback.FeedbackPackage#getFeedback_Description()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link Classes.Feedback.Feedback#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is Noted</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Noted</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Noted</em>' attribute.
	 * @see #setIsNoted(boolean)
	 * @see Classes.Feedback.FeedbackPackage#getFeedback_IsNoted()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isNoted();

	/**
	 * Sets the value of the '{@link Classes.Feedback.Feedback#isNoted <em>Is Noted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Noted</em>' attribute.
	 * @see #isNoted()
	 * @generated
	 */
	void setIsNoted(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Resolved</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Resolved</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Resolved</em>' attribute.
	 * @see #setIsResolved(boolean)
	 * @see Classes.Feedback.FeedbackPackage#getFeedback_IsResolved()
	 * @model dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isResolved();

	/**
	 * Sets the value of the '{@link Classes.Feedback.Feedback#isResolved <em>Is Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Resolved</em>' attribute.
	 * @see #isResolved()
	 * @generated
	 */
	void setIsResolved(boolean value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see Classes.Feedback.FeedbackPackage#getFeedback_Id()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link Classes.Feedback.Feedback#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

} // Feedback
