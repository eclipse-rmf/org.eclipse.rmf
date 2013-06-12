/**
 */
package org.eclipse.rmf.tests.serialization.env.emf.myreqif;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VALUES Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType3#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.VALUESType3#getENUMVALUEREF <em>ENUMVALUEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getVALUESType3()
 * @model extendedMetaData="name='VALUES_._3_._type' kind='elementOnly'"
 * @generated
 */
public interface VALUESType3 extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getVALUESType3_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>ENUMVALUEREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ENUMVALUEREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ENUMVALUEREF</em>' attribute list.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getVALUESType3_ENUMVALUEREF()
	 * @model unique="false" dataType="org.eclipse.rmf.tests.serialization.env.emf.myreqif.LOCALREF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ENUM-VALUE-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getENUMVALUEREF();

} // VALUESType3
