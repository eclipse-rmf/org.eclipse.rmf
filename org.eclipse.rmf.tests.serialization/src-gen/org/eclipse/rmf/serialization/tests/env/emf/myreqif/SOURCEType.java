/**
 */
package org.eclipse.rmf.serialization.tests.env.emf.myreqif;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SOURCE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.SOURCEType#getSPECOBJECTREF <em>SPECOBJECTREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage#getSOURCEType()
 * @model extendedMetaData="name='SOURCE_._type' kind='elementOnly'"
 * @generated
 */
public interface SOURCEType extends EObject {
	/**
	 * Returns the value of the '<em><b>SPECOBJECTREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECOBJECTREF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECOBJECTREF</em>' attribute.
	 * @see #setSPECOBJECTREF(String)
	 * @see org.eclipse.rmf.serialization.tests.env.emf.myreqif.MyreqifPackage#getSOURCEType_SPECOBJECTREF()
	 * @model dataType="org.eclipse.rmf.serialization.tests.env.emf.myreqif.GLOBALREF"
	 *        extendedMetaData="kind='element' name='SPEC-OBJECT-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSPECOBJECTREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.serialization.tests.env.emf.myreqif.SOURCEType#getSPECOBJECTREF <em>SPECOBJECTREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECOBJECTREF</em>' attribute.
	 * @see #getSPECOBJECTREF()
	 * @generated
	 */
	void setSPECOBJECTREF(String value);

} // SOURCEType
