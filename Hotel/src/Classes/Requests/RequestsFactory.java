/**
 */
package Classes.Requests;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
 class RequestsFactory implements Serializable {
	private static final long serialVersionUID = 1032355465048622733L;
	static RequestsFactory INSTANCE = new RequestsFactory();

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private RequestsFactory() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Request createRequest() {
		Request request = new Request();
		return request;
	}
} //RequestsFactoryImpl
