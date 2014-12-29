/**
 */
package Classes.Feedback;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
class FeedbackFactory implements Serializable {

	private static final long serialVersionUID = -3992807685375113300L;
	
	static FeedbackFactory INSTANCE = new FeedbackFactory();

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private FeedbackFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feedback createFeedback() {
		Feedback feedback = new Feedback();
		return feedback;
	}
} //FeedbackFactoryImpl
