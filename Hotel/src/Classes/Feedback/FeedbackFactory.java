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
	 * Returns a new object of class '<em>Feedback</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Feedback</em>'.
	 * @generated
	 */
	Feedback createFeedback();
} //FeedbackFactory
