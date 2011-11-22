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
 * A representation of the model object '<em><b>EDITABLEATTS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.EDITABLEATTSType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.EDITABLEATTSType#getATTRIBUTEDEFINITIONBOOLEANREF <em>ATTRIBUTEDEFINITIONBOOLEANREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.EDITABLEATTSType#getATTRIBUTEDEFINITIONDATEREF <em>ATTRIBUTEDEFINITIONDATEREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.EDITABLEATTSType#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.EDITABLEATTSType#getATTRIBUTEDEFINITIONINTEGERREF <em>ATTRIBUTEDEFINITIONINTEGERREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.EDITABLEATTSType#getATTRIBUTEDEFINITIONREALREF <em>ATTRIBUTEDEFINITIONREALREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.EDITABLEATTSType#getATTRIBUTEDEFINITIONSTRINGREF <em>ATTRIBUTEDEFINITIONSTRINGREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.EDITABLEATTSType#getATTRIBUTEDEFINITIONXHTMLREF <em>ATTRIBUTEDEFINITIONXHTMLREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getEDITABLEATTSType()
 * @model extendedMetaData="name='EDITABLE-ATTS_._type' kind='elementOnly'"
 * @generated
 */
public interface EDITABLEATTSType extends EObject {
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
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getEDITABLEATTSType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONBOOLEANREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONBOOLEAN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONBOOLEANREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONBOOLEANREF</em>' reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getEDITABLEATTSType_ATTRIBUTEDEFINITIONBOOLEANREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-BOOLEAN-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEDEFINITIONBOOLEAN> getATTRIBUTEDEFINITIONBOOLEANREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONDATEREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONDATE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONDATEREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONDATEREF</em>' reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getEDITABLEATTSType_ATTRIBUTEDEFINITIONDATEREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-DATE-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEDEFINITIONDATE> getATTRIBUTEDEFINITIONDATEREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONENUMERATIONREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONENUMERATION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>' reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getEDITABLEATTSType_ATTRIBUTEDEFINITIONENUMERATIONREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-ENUMERATION-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEDEFINITIONENUMERATION> getATTRIBUTEDEFINITIONENUMERATIONREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONINTEGERREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONINTEGER}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONINTEGERREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONINTEGERREF</em>' reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getEDITABLEATTSType_ATTRIBUTEDEFINITIONINTEGERREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-INTEGER-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEDEFINITIONINTEGER> getATTRIBUTEDEFINITIONINTEGERREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONREALREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONREAL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONREALREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONREALREF</em>' reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getEDITABLEATTSType_ATTRIBUTEDEFINITIONREALREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-REAL-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEDEFINITIONREAL> getATTRIBUTEDEFINITIONREALREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONSTRINGREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONSTRING}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONSTRINGREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONSTRINGREF</em>' reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getEDITABLEATTSType_ATTRIBUTEDEFINITIONSTRINGREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-STRING-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEDEFINITIONSTRING> getATTRIBUTEDEFINITIONSTRINGREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONXHTMLREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEDEFINITIONXHTML}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONXHTMLREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONXHTMLREF</em>' reference list.
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getEDITABLEATTSType_ATTRIBUTEDEFINITIONXHTMLREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-XHTML-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEDEFINITIONXHTML> getATTRIBUTEDEFINITIONXHTMLREF();

} // EDITABLEATTSType
