/**
 */
package Classes.Requests.impl;

import Classes.Requests.Request;
import Classes.Requests.RequestsManager;
import Classes.Requests.RequestsPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import java.util.Map;
import java.util.Map.Entry;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Requests.impl.RequestsManagerImpl#getSpecialRequest <em>Special Request</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequestsManagerImpl extends MinimalEObjectImpl.Container implements RequestsManager {
	/**
	 * The cached value of the '{@link #getSpecialRequest() <em>Special Request</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialRequest()
	 * @generated NOT
	 * @ordered
	 */
	private EList<Map.Entry<String, Request>> specialRequest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequestsManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RequestsPackage.Literals.REQUESTS_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Map.Entry<String, Request>> getSpecialRequest() {
		if (specialRequest == null) {
			specialRequest = new EObjectResolvingEList<Map.Entry<String, Request>>(Entry.class, this, RequestsPackage.REQUESTS_MANAGER__SPECIAL_REQUEST);
		}
		return specialRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequestDescription(String specialRequestId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void hasRequestBeenResolved(boolean _) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void getRequestDescription() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestResolved() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void deleteRequest(String specialRequestId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRequestDesc(String specialRequestId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchRequests(String specialRequestId, EList<String> _) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getAllRequestIDs() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestDescription() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addRequest() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RequestsPackage.REQUESTS_MANAGER__SPECIAL_REQUEST:
				return getSpecialRequest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequestsPackage.REQUESTS_MANAGER__SPECIAL_REQUEST:
				getSpecialRequest().clear();
				getSpecialRequest().addAll((Collection<? extends Map.Entry<String, Request>>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case RequestsPackage.REQUESTS_MANAGER__SPECIAL_REQUEST:
				getSpecialRequest().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case RequestsPackage.REQUESTS_MANAGER__SPECIAL_REQUEST:
				return specialRequest != null && !specialRequest.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RequestsPackage.REQUESTS_MANAGER___GET_REQUEST_DESCRIPTION__STRING:
				return getRequestDescription((String)arguments.get(0));
			case RequestsPackage.REQUESTS_MANAGER___HAS_REQUEST_BEEN_RESOLVED__BOOLEAN:
				hasRequestBeenResolved((Boolean)arguments.get(0));
				return null;
			case RequestsPackage.REQUESTS_MANAGER___SET_REQUEST_RESOLVED:
				setRequestResolved();
				return null;
			case RequestsPackage.REQUESTS_MANAGER___DELETE_REQUEST__STRING:
				deleteRequest((String)arguments.get(0));
				return null;
			case RequestsPackage.REQUESTS_MANAGER___CHANGE_REQUEST_DESC__STRING:
				changeRequestDesc((String)arguments.get(0));
				return null;
			case RequestsPackage.REQUESTS_MANAGER___SEARCH_REQUESTS__STRING_ELIST:
				searchRequests((String)arguments.get(0), (EList<String>)arguments.get(1));
				return null;
			case RequestsPackage.REQUESTS_MANAGER___GET_ALL_REQUEST_IDS:
				getAllRequestIDs();
				return null;
			case RequestsPackage.REQUESTS_MANAGER___SET_REQUEST_DESCRIPTION:
				setRequestDescription();
				return null;
			case RequestsPackage.REQUESTS_MANAGER___ADD_REQUEST:
				addRequest();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RequestsManagerImpl
