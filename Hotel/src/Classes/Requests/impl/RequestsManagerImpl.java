/**
 */
package Classes.Requests.impl;

import Classes.Requests.Request;
import Classes.Requests.RequestsManager;
import Classes.Requests.RequestsPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

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
	 * @generated
	 * @ordered
	 */
	protected EList<Request> specialRequest;

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
	 * @generated
	 */
	public EList<Request> getSpecialRequest() {
		if (specialRequest == null) {
			specialRequest = new EObjectResolvingEList<Request>(Request.class, this, RequestsPackage.REQUESTS_MANAGER__SPECIAL_REQUEST);
		}
		return specialRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
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
	public void hasRequestBeenResolved() {
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
	public void deleteRequest() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void changeRequestDesc() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void searchRequests() {
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
	 * @generated
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
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case RequestsPackage.REQUESTS_MANAGER__SPECIAL_REQUEST:
				getSpecialRequest().clear();
				getSpecialRequest().addAll((Collection<? extends Request>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
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
	 * @generated
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case RequestsPackage.REQUESTS_MANAGER___GET_REQUEST_DESCRIPTION:
				getRequestDescription();
				return null;
			case RequestsPackage.REQUESTS_MANAGER___HAS_REQUEST_BEEN_RESOLVED:
				hasRequestBeenResolved();
				return null;
			case RequestsPackage.REQUESTS_MANAGER___SET_REQUEST_RESOLVED:
				setRequestResolved();
				return null;
			case RequestsPackage.REQUESTS_MANAGER___DELETE_REQUEST:
				deleteRequest();
				return null;
			case RequestsPackage.REQUESTS_MANAGER___CHANGE_REQUEST_DESC:
				changeRequestDesc();
				return null;
			case RequestsPackage.REQUESTS_MANAGER___SEARCH_REQUESTS:
				searchRequests();
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
