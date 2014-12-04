/**
 */
package Classes.Requests;

import java.util.Map;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Requests.RequestsManager#getSpecialRequest <em>Special Request</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Requests.RequestsPackage#getRequestsManager()
 * @model
 * @generated NOT
 */
public interface RequestsManager extends IRequests {
	/**
	 * Returns the value of the '<em><b>Special Request</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}&lt;java.lang.String, Classes.Requests.Request>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Request</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Request</em>' reference list.
	 * @see Classes.Requests.RequestsPackage#getRequestsManager_SpecialRequest()
	 * @model mapType="Classes.ECoreMapEntries.StringToRequestMap<org.eclipse.uml2.types.String, Classes.Requests.Request>" ordered="false"
	 * @generated
	 */
	EList<Map.Entry<String, Request>> getSpecialRequest();

} // RequestsManager