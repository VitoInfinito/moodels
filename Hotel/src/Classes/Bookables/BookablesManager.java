/**
 */
package Classes.Bookables;

import Classes.Stays.IStays;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Bookables.BookablesManager#getBookable <em>Bookable</em>}</li>
 *   <li>{@link Classes.Bookables.BookablesManager#getIHotelStayManager <em>IHotel Stay Manager</em>}</li>
 * </ul>
 * </p>
 *
 * @see Classes.Bookables.BookablesPackage#getBookablesManager()
 * @model
 * @generated
 */
public interface BookablesManager extends IBookablesManage {
	/**
	 * Returns the value of the '<em><b>Bookable</b></em>' reference list.
	 * The list contents are of type {@link Classes.Bookables.Bookable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookable</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookable</em>' reference list.
	 * @see Classes.Bookables.BookablesPackage#getBookablesManager_Bookable()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Bookable> getBookable();

	/**
	 * Returns the value of the '<em><b>IHotel Stay Manager</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IHotel Stay Manager</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IHotel Stay Manager</em>' reference.
	 * @see #setIHotelStayManager(IStays)
	 * @see Classes.Bookables.BookablesPackage#getBookablesManager_IHotelStayManager()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	IStays getIHotelStayManager();

	/**
	 * Sets the value of the '{@link Classes.Bookables.BookablesManager#getIHotelStayManager <em>IHotel Stay Manager</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IHotel Stay Manager</em>' reference.
	 * @see #getIHotelStayManager()
	 * @generated
	 */
	void setIHotelStayManager(IStays value);

} // BookablesManager
