/**
 */
package Classes.Requests.impl;

import Classes.InvalidIDException;
import Classes.RegexPatterns;
import Classes.Bookables.Bookable;
import Classes.Bookables.HotelRoom;
import Classes.Bookables.RoomLocation;
import Classes.Bookables.impl.BookablesManagerImpl;
import Classes.Requests.Request;
import Classes.Requests.RequestsFactory;
import Classes.Requests.RequestsManager;
import Classes.Requests.RequestsPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
	
	private final Logger logger = LoggerFactory.getLogger(BookablesManagerImpl.class);
	
	/**
	 * The cached value of the '{@link #getSpecialRequest() <em>Special Request</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialRequest()
	 * @generated NOT
	 * @ordered
	 */
	private EMap<String, Request> specialRequest;

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
	public EMap<String, Request> getSpecialRequest() {
		if (specialRequest == null) {
			specialRequest = new EcoreEMap<String,Request>(Classes.ECoreMapEntries.ECoreMapEntriesPackage.Literals.STRING_TO_REQUEST_MAP, Classes.ECoreMapEntries.impl.StringToRequestMapImpl.class, this, RequestsPackage.REQUESTS_MANAGER__SPECIAL_REQUEST);
		}
		return specialRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRequestDescription(String specialRequestId) {
		if(specialRequestId == null){
			logger.warn("The id passed was null! Invalid argument!");
			throw new IllegalArgumentException("The id was null!");
		}
		Request req = specialRequest.get(specialRequestId);
		if(req == null){
			logger.warn("The id do not beong to a special request!");
			throw new IllegalArgumentException("The id was not found!");
		}
		return req.getDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean hasRequestBeenResolved(String specialRequestId) {
		if(specialRequestId == null){
			logger.warn("The id passed was null! Invalid argument!");
			throw new IllegalArgumentException("The id was null!");
		}
		Request req = specialRequest.get(specialRequestId);
		if(req == null){
			logger.warn("The id do not beong to a special request!");
			throw new IllegalArgumentException("The id was not found!");
		}
		return req.isResolved();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRequestResolved(String specialRequestId) {
		if(specialRequestId == null){
			logger.warn("The id passed was null! Invalid argument!");
			throw new IllegalArgumentException("The id was null!");
		}
		Request req = specialRequest.get(specialRequestId);
		if(req == null){
			logger.warn("The id do not beong to a special request!");
			throw new IllegalArgumentException("The id was not found!");
		}
		req.setIsResolved(true);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void deleteRequest(String specialRequestId) {
		if(specialRequestId == null){
			logger.warn("The id passed was null! Invalid argument!");
			throw new IllegalArgumentException("The id was null!");
		}
		Request req = specialRequest.removeKey(specialRequestId);
		if(req == null){
			logger.warn("The bookable with ID {} could not be found. Invalid ID!", specialRequestId);
			throw new InvalidIDException();
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void changeRequestDesc(String specialRequestId, String description) {
		setRequestDescription(specialRequestId, description);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> searchRequests(String keyword) {
		if (keyword == null) {
			logger.warn("The keyword passed was null! Invalid argument!");
			throw new IllegalArgumentException("The keyword was null!");
		}
		keyword = keyword.trim();
		Set<String> searchResult = new LinkedHashSet<String>();
		Pattern regexPattern = Pattern.compile("(?i:.*" + keyword + ".*)");
		
		// Exact ID match. First Order!
		searchResult.add(specialRequest.get(keyword).getId());


		// ID match somewhat. Second Order!
		Collection<Request> tmpC = specialRequest.values();
		for (Request sp : tmpC) {			
			if (regexPattern.matcher(sp.getId()).matches()) {
				searchResult.add(sp.getId());
			}
		}

		return new BasicEList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> getAllRequestIDs() {
		Collection<Request> sReq = getSpecialRequest().values();
		EList<String> tmp = new BasicEList<String>();
		for(Request sp: sReq){
			tmp.add(sp.getId());
		}
		return tmp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRequestDescription(String specialRequestId, String description) {
		if(specialRequestId == null){
			logger.warn("The id passed was null! Invalid argument!");
			throw new IllegalArgumentException("The id was null!");
		}
		Request req = specialRequest.get(specialRequestId);
		if(req == null){
			logger.warn("The id do not beong to a special request!");
			throw new IllegalArgumentException("The id was not found!");
		}
		req.setDescription(description);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addRequest(String specialRequestId, String description) {
		if(specialRequestId == null){
			logger.warn("The id passed was null! Invalid argument!");
			throw new IllegalArgumentException("The id was null!");
		}
		if(description.length() > 0){
			logger.warn("The description is to short! Invalid argument!");
			throw new IllegalArgumentException("The description was to short!");
		}
		Request req = RequestsFactory.eINSTANCE.createRequest();
		req.setDescription(description);
		req.setId(specialRequestId);
		req.setIsResolved(false);
		
		specialRequest.put(specialRequestId,req);
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
			case RequestsPackage.REQUESTS_MANAGER___HAS_REQUEST_BEEN_RESOLVED__STRING:
				return hasRequestBeenResolved((String)arguments.get(0));
			case RequestsPackage.REQUESTS_MANAGER___SET_REQUEST_RESOLVED__STRING:
				setRequestResolved((String)arguments.get(0));
				return null;
			case RequestsPackage.REQUESTS_MANAGER___DELETE_REQUEST__STRING:
				deleteRequest((String)arguments.get(0));
				return null;
			case RequestsPackage.REQUESTS_MANAGER___CHANGE_REQUEST_DESC__STRING_STRING:
				changeRequestDesc((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case RequestsPackage.REQUESTS_MANAGER___SEARCH_REQUESTS__STRING:
				return searchRequests((String)arguments.get(0));
			case RequestsPackage.REQUESTS_MANAGER___GET_ALL_REQUEST_IDS:
				return getAllRequestIDs();
			case RequestsPackage.REQUESTS_MANAGER___SET_REQUEST_DESCRIPTION__STRING_STRING:
				setRequestDescription((String)arguments.get(0), (String)arguments.get(1));
				return null;
			case RequestsPackage.REQUESTS_MANAGER___ADD_REQUEST__STRING_STRING:
				addRequest((String)arguments.get(0), (String)arguments.get(1));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //RequestsManagerImpl
