/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.xsd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DATATYPES Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.DATATYPESType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.DATATYPESType#getDATATYPEDEFINITIONBOOLEAN <em>DATATYPEDEFINITIONBOOLEAN</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.DATATYPESType#getDATATYPEDEFINITIONDATE <em>DATATYPEDEFINITIONDATE</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.DATATYPESType#getDATATYPEDEFINITIONENUMERATION <em>DATATYPEDEFINITIONENUMERATION</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.DATATYPESType#getDATATYPEDEFINITIONINTEGER <em>DATATYPEDEFINITIONINTEGER</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.DATATYPESType#getDATATYPEDEFINITIONREAL <em>DATATYPEDEFINITIONREAL</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.DATATYPESType#getDATATYPEDEFINITIONSTRING <em>DATATYPEDEFINITIONSTRING</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.DATATYPESType#getDATATYPEDEFINITIONXHTML <em>DATATYPEDEFINITIONXHTML</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getDATATYPESType()
 * @model extendedMetaData="name='DATATYPES_._type' kind='elementOnly'"
 * @generated
 */
public interface DATATYPESType extends EObject {
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
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getDATATYPESType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONBOOLEAN</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONBOOLEAN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONBOOLEAN</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONBOOLEAN</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getDATATYPESType_DATATYPEDEFINITIONBOOLEAN()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-BOOLEAN' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DATATYPEDEFINITIONBOOLEAN> getDATATYPEDEFINITIONBOOLEAN();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONDATE</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONDATE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONDATE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONDATE</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getDATATYPESType_DATATYPEDEFINITIONDATE()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-DATE' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DATATYPEDEFINITIONDATE> getDATATYPEDEFINITIONDATE();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONENUMERATION</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONENUMERATION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONENUMERATION</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONENUMERATION</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getDATATYPESType_DATATYPEDEFINITIONENUMERATION()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-ENUMERATION' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DATATYPEDEFINITIONENUMERATION> getDATATYPEDEFINITIONENUMERATION();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONINTEGER</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONINTEGER}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONINTEGER</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONINTEGER</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getDATATYPESType_DATATYPEDEFINITIONINTEGER()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-INTEGER' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DATATYPEDEFINITIONINTEGER> getDATATYPEDEFINITIONINTEGER();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONREAL</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONREAL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONREAL</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONREAL</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getDATATYPESType_DATATYPEDEFINITIONREAL()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-REAL' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DATATYPEDEFINITIONREAL> getDATATYPEDEFINITIONREAL();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONSTRING</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONSTRING}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONSTRING</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONSTRING</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getDATATYPESType_DATATYPEDEFINITIONSTRING()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-STRING' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DATATYPEDEFINITIONSTRING> getDATATYPEDEFINITIONSTRING();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONXHTML</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONXHTML}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONXHTML</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONXHTML</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getDATATYPESType_DATATYPEDEFINITIONXHTML()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-XHTML' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DATATYPEDEFINITIONXHTML> getDATATYPEDEFINITIONXHTML();

} // DATATYPESType
