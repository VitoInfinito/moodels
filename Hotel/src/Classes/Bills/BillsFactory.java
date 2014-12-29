/**
 */
package Classes.Bills;

import java.io.Serializable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
class BillsFactory implements Serializable {

	private static final long serialVersionUID = 3917258725752262235L;
	
	static BillsFactory INSTANCE = new BillsFactory();

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	private BillsFactory() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Bill createBill() {
		Bill bill = new Bill();
		return bill;
	}
} //BillsFactoryImpl
