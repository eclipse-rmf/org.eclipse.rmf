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
 * A representation of the model object '<em><b>EDITABLEATTS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONBOOLEANREF <em>ATTRIBUTEDEFINITIONBOOLEANREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONDATEREF <em>ATTRIBUTEDEFINITIONDATEREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONINTEGERREF <em>ATTRIBUTEDEFINITIONINTEGERREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONREALREF <em>ATTRIBUTEDEFINITIONREALREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONSTRINGREF <em>ATTRIBUTEDEFINITIONSTRINGREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType#getATTRIBUTEDEFINITIONXHTMLREF <em>ATTRIBUTEDEFINITIONXHTMLREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getEDITABLEATTSType()
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
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getEDITABLEATTSType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONBOOLEANREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONBOOLEANREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONBOOLEANREF</em>' attribute list.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getEDITABLEATTSType_ATTRIBUTEDEFINITIONBOOLEANREF()
	 * @model unique="false" dataType="org.eclipse.rmf.tests.serialization.env.emf.myreqif.LOCALREF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-BOOLEAN-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getATTRIBUTEDEFINITIONBOOLEANREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONDATEREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONDATEREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONDATEREF</em>' attribute list.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getEDITABLEATTSType_ATTRIBUTEDEFINITIONDATEREF()
	 * @model unique="false" dataType="org.eclipse.rmf.tests.serialization.env.emf.myreqif.LOCALREF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-DATE-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getATTRIBUTEDEFINITIONDATEREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONENUMERATIONREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>' attribute list.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getEDITABLEATTSType_ATTRIBUTEDEFINITIONENUMERATIONREF()
	 * @model unique="false" dataType="org.eclipse.rmf.tests.serialization.env.emf.myreqif.LOCALREF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-ENUMERATION-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getATTRIBUTEDEFINITIONENUMERATIONREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONINTEGERREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONINTEGERREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONINTEGERREF</em>' attribute list.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getEDITABLEATTSType_ATTRIBUTEDEFINITIONINTEGERREF()
	 * @model unique="false" dataType="org.eclipse.rmf.tests.serialization.env.emf.myreqif.LOCALREF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-INTEGER-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getATTRIBUTEDEFINITIONINTEGERREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONREALREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONREALREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONREALREF</em>' attribute list.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getEDITABLEATTSType_ATTRIBUTEDEFINITIONREALREF()
	 * @model unique="false" dataType="org.eclipse.rmf.tests.serialization.env.emf.myreqif.LOCALREF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-REAL-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getATTRIBUTEDEFINITIONREALREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONSTRINGREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONSTRINGREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONSTRINGREF</em>' attribute list.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getEDITABLEATTSType_ATTRIBUTEDEFINITIONSTRINGREF()
	 * @model unique="false" dataType="org.eclipse.rmf.tests.serialization.env.emf.myreqif.LOCALREF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-STRING-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getATTRIBUTEDEFINITIONSTRINGREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONXHTMLREF</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONXHTMLREF</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONXHTMLREF</em>' attribute list.
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getEDITABLEATTSType_ATTRIBUTEDEFINITIONXHTMLREF()
	 * @model unique="false" dataType="org.eclipse.rmf.tests.serialization.env.emf.myreqif.LOCALREF" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-XHTML-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<String> getATTRIBUTEDEFINITIONXHTMLREF();

} // EDITABLEATTSType
