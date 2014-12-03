/**
 */
package Classes.Bookables;

import Classes.Stays.IStays;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Manager</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link Classes.Bookables.BookablesManager#getBookables <em>Bookables</em>}</li>
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
	 * Returns the value of the '<em><b>Bookables</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link Classes.Bookables.Bookable},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bookables</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bookables</em>' map.
	 * @see Classes.Bookables.BookablesPackage#getBookablesManager_Bookables()
	 * @model mapType="org.eclipse.uml2.types.StringToBookableMap<org.eclipse.uml2.types.String, Classes.Bookables.Bookable>" ordered="false"
	 * @generated
	 */
	EMap<String, Bookable> getBookables();

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
