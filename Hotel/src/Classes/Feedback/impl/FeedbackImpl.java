/**
 */
package Classes.Feedback.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import Classes.Feedback.Feedback;
import Classes.Feedback.FeedbackPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feedback</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link Classes.Feedback.impl.FeedbackImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link Classes.Feedback.impl.FeedbackImpl#isNoted <em>Is Noted</em>}</li>
 *   <li>{@link Classes.Feedback.impl.FeedbackImpl#isResolved <em>Is Resolved</em>}</li>
 *   <li>{@link Classes.Feedback.impl.FeedbackImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeedbackImpl extends MinimalEObjectImpl.Container implements Feedback {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isNoted() <em>Is Noted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoted()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NOTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isNoted() <em>Is Noted</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNoted()
	 * @generated
	 * @ordered
	 */
	protected boolean isNoted = IS_NOTED_EDEFAULT;

	/**
	 * The default value of the '{@link #isResolved() <em>Is Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RESOLVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isResolved() <em>Is Resolved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isResolved()
	 * @generated
	 * @ordered
	 */
	protected boolean isResolved = IS_RESOLVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeedbackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FeedbackPackage.Literals.FEEDBACK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeedbackPackage.FEEDBACK__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNoted() {
		return isNoted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNoted(boolean newIsNoted) {
		boolean oldIsNoted = isNoted;
		isNoted = newIsNoted;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeedbackPackage.FEEDBACK__IS_NOTED, oldIsNoted, isNoted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isResolved() {
		return isResolved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsResolved(boolean newIsResolved) {
		boolean oldIsResolved = isResolved;
		isResolved = newIsResolved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeedbackPackage.FEEDBACK__IS_RESOLVED, oldIsResolved, isResolved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FeedbackPackage.FEEDBACK__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FeedbackPackage.FEEDBACK__DESCRIPTION:
				return getDescription();
			case FeedbackPackage.FEEDBACK__IS_NOTED:
				return isNoted();
			case FeedbackPackage.FEEDBACK__IS_RESOLVED:
				return isResolved();
			case FeedbackPackage.FEEDBACK__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FeedbackPackage.FEEDBACK__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case FeedbackPackage.FEEDBACK__IS_NOTED:
				setIsNoted((Boolean)newValue);
				return;
			case FeedbackPackage.FEEDBACK__IS_RESOLVED:
				setIsResolved((Boolean)newValue);
				return;
			case FeedbackPackage.FEEDBACK__ID:
				setId((String)newValue);
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
			case FeedbackPackage.FEEDBACK__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case FeedbackPackage.FEEDBACK__IS_NOTED:
				setIsNoted(IS_NOTED_EDEFAULT);
				return;
			case FeedbackPackage.FEEDBACK__IS_RESOLVED:
				setIsResolved(IS_RESOLVED_EDEFAULT);
				return;
			case FeedbackPackage.FEEDBACK__ID:
				setId(ID_EDEFAULT);
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
			case FeedbackPackage.FEEDBACK__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case FeedbackPackage.FEEDBACK__IS_NOTED:
				return isNoted != IS_NOTED_EDEFAULT;
			case FeedbackPackage.FEEDBACK__IS_RESOLVED:
				return isResolved != IS_RESOLVED_EDEFAULT;
			case FeedbackPackage.FEEDBACK__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (description: ");
		result.append(description);
		result.append(", isNoted: ");
		result.append(isNoted);
		result.append(", isResolved: ");
		result.append(isResolved);
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //FeedbackImpl
