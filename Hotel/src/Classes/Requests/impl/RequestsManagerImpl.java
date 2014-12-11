/**
 */
package Classes.Requests.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import Classes.InvalidIDException;
import Classes.Bookables.impl.BookablesManagerImpl;
import Classes.Requests.Request;
import Classes.Requests.RequestsFactory;
import Classes.Requests.RequestsManager;
import Classes.Requests.RequestsPackage;

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
	public static RequestsManagerImpl INSTANCE = new RequestsManagerImpl();
	private static int counterID = 1;
	
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
	 * @generated NOT
	 */
	private RequestsManagerImpl() {
		super();
		specialRequest = new EcoreEMap<String,Request>(Classes.ECoreMapEntries.ECoreMapEntriesPackage.Literals.STRING_TO_REQUEST_MAP, Classes.ECoreMapEntries.impl.StringToRequestMapImpl.class, this, RequestsPackage.REQUESTS_MANAGER__SPECIAL_REQUEST);
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
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EMap<String, Request> getSpecialRequest() {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRequestDescription(String specialRequestId) {
		Request req = specialRequest.get(specialRequestId);
		if(req == null){
			logger.warn("The id do not beong to a special request!");
			throw new InvalidIDException("The id was not found!");
		}
		return req.getDescription();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean hasRequestBeenResolved(String specialRequestId) {
		Request req = specialRequest.get(specialRequestId);
		if(req == null){
			logger.warn("The id do not beong to a special request!");
			throw new InvalidIDException("The id was not found!");
		}
		return req.isResolved();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRequestResolved(String specialRequestId) {
		Request req = specialRequest.get(specialRequestId);
		if(req == null){
			logger.warn("The id do not beong to a special request!");
			throw new InvalidIDException("The id was not found!");
		}
		req.setIsResolved(true);

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void deleteRequest(String specialRequestId) {
		Request req = specialRequest.removeKey(specialRequestId);
		if(req == null){
			logger.warn("The bookable with ID {} could not be found. Invalid ID!", specialRequestId);
			throw new InvalidIDException("The id was not found!");
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
	 * @generated NOT
	 */
	public List<String> searchRequests(String keyword) {
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
		return new ArrayList<String>(searchResult);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public List<String> getAllRequestIDs() {
		return new ArrayList<String>(specialRequest.keySet());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setRequestDescription(String specialRequestId, String description) {
		Request req = specialRequest.get(specialRequestId);
		if(req == null){
			logger.warn("The id do not beong to a special request!");
			throw new InvalidIDException("The id was not found!");
		}
		req.setDescription(description);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addRequest(String specialRequestId, String description) {
		throw new UnsupportedOperationException();
	}
	
	private String generateID(){
		return String.format("sr%06d", counterID++);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void createRequest(String description) {
		if(description.length() < 0){
			logger.warn("The description is too short! Invalid argument!");
			throw new IllegalArgumentException("The description was to short!");
		}
		String specialRequestId = generateID();
		Request req = RequestsFactory.eINSTANCE.createRequest();
		req.setDescription(description);
		req.setId(specialRequestId);
		req.setIsResolved(false);
		
		specialRequest.put(specialRequestId,req);
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void eUnset(int featureID) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean eIsSet(int featureID) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * NOT SUPPORTED. EMF CRAP!
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		throw new UnsupportedOperationException();
	}

} //RequestsManagerImpl
