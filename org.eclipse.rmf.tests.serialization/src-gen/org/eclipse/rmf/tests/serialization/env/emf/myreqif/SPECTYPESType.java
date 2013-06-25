/**
 * Copyright (c) 2013 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    itemis AG - initial API and implementation
 * 
 */
package org.eclipse.rmf.tests.serialization.env.emf.myreqif;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SPECTYPES Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType#getRELATIONGROUPTYPE <em>RELATIONGROUPTYPE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType#getSPECOBJECTTYPE <em>SPECOBJECTTYPE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType#getSPECRELATIONTYPE <em>SPECRELATIONTYPE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType#getSPECIFICATIONTYPE <em>SPECIFICATIONTYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getSPECTYPESType()
 * @model extendedMetaData="name='SPEC-TYPES_._type' kind='elementOnly'"
 * @generated
 */
public interface SPECTYPESType extends EObject {
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
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getSPECTYPESType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>RELATIONGROUPTYPE</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.RELATIONGROUPTYPE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RELATIONGROUPTYPE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RELATIONGROUPTYPE</em>' containment reference list.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getSPECTYPESType_RELATIONGROUPTYPE()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='RELATION-GROUP-TYPE' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<RELATIONGROUPTYPE> getRELATIONGROUPTYPE();

	/**
	 * Returns the value of the '<em><b>SPECOBJECTTYPE</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTTYPE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECOBJECTTYPE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECOBJECTTYPE</em>' containment reference list.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getSPECTYPESType_SPECOBJECTTYPE()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SPEC-OBJECT-TYPE' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SPECOBJECTTYPE> getSPECOBJECTTYPE();

	/**
	 * Returns the value of the '<em><b>SPECRELATIONTYPE</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONTYPE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECRELATIONTYPE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECRELATIONTYPE</em>' containment reference list.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getSPECTYPESType_SPECRELATIONTYPE()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SPEC-RELATION-TYPE' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SPECRELATIONTYPE> getSPECRELATIONTYPE();

	/**
	 * Returns the value of the '<em><b>SPECIFICATIONTYPE</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONTYPE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECIFICATIONTYPE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECIFICATIONTYPE</em>' containment reference list.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getSPECTYPESType_SPECIFICATIONTYPE()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='SPECIFICATION-TYPE' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<SPECIFICATIONTYPE> getSPECIFICATIONTYPE();

} // SPECTYPESType
