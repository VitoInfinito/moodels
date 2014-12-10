/**
 */
package Classes.Feedback;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see Classes.Feedback.FeedbackPackage
 * @generated
 */
public interface FeedbackFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FeedbackFactory eINSTANCE = Classes.Feedback.impl.FeedbackFactoryImpl.init();

	/**
	 * <!-- begin-user-doc -->
	 * // NOT USED, throws UnsupportedOperationException
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	FeedbackManager createFeedbackManager();

	/**
	 * Returns a new object of class '<em>Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback</em>'.
	 * @generated
	 */
	Feedback createFeedback();

	/**
	 * <!-- begin-user-doc -->
	 * // NOT USED, throws UnsupportedOperationException
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	FeedbackPackage getFeedbackPackage();

} //FeedbackFactory
