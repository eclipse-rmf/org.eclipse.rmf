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

package org.eclipse.rmf.rif12.xsd;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DATATYPEDEFINITIONS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONBINARYFILEREF <em>DATATYPEDEFINITIONBINARYFILEREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONBOOLEANREF <em>DATATYPEDEFINITIONBOOLEANREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONDATEREF <em>DATATYPEDEFINITIONDATEREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONDOCUMENTREF <em>DATATYPEDEFINITIONDOCUMENTREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONENUMERATIONREF <em>DATATYPEDEFINITIONENUMERATIONREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONINTEGERREF <em>DATATYPEDEFINITIONINTEGERREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONREALREF <em>DATATYPEDEFINITIONREALREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONSTRINGREF <em>DATATYPEDEFINITIONSTRINGREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSType#getDATATYPEDEFINITIONXMLDATAREF <em>DATATYPEDEFINITIONXMLDATAREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONSType()
 * @model extendedMetaData="name='DATATYPE-DEFINITIONS_._type' kind='elementOnly'"
 * @generated
 */
public interface DATATYPEDEFINITIONSType extends EObject {
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONSType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONBINARYFILEREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONBINARYFILE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONBINARYFILEREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONBINARYFILEREF</em>' reference list.
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONBINARYFILEREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-BINARY-FILE-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DATATYPEDEFINITIONBINARYFILE> getDATATYPEDEFINITIONBINARYFILEREF();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONBOOLEANREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONBOOLEAN}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONBOOLEANREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONBOOLEANREF</em>' reference list.
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONBOOLEANREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-BOOLEAN-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DATATYPEDEFINITIONBOOLEAN> getDATATYPEDEFINITIONBOOLEANREF();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONDATEREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDATE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONDATEREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONDATEREF</em>' reference list.
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONDATEREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-DATE-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DATATYPEDEFINITIONDATE> getDATATYPEDEFINITIONDATEREF();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONDOCUMENTREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDOCUMENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONDOCUMENTREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONDOCUMENTREF</em>' reference list.
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONDOCUMENTREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-DOCUMENT-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DATATYPEDEFINITIONDOCUMENT> getDATATYPEDEFINITIONDOCUMENTREF();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONENUMERATIONREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONENUMERATION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONENUMERATIONREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONENUMERATIONREF</em>' reference list.
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONENUMERATIONREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-ENUMERATION-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DATATYPEDEFINITIONENUMERATION> getDATATYPEDEFINITIONENUMERATIONREF();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONINTEGERREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONINTEGER}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONINTEGERREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONINTEGERREF</em>' reference list.
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONINTEGERREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-INTEGER-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DATATYPEDEFINITIONINTEGER> getDATATYPEDEFINITIONINTEGERREF();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONREALREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONREAL}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONREALREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONREALREF</em>' reference list.
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONREALREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-REAL-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DATATYPEDEFINITIONREAL> getDATATYPEDEFINITIONREALREF();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONSTRINGREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSTRING}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONSTRINGREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONSTRINGREF</em>' reference list.
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONSTRINGREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-STRING-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DATATYPEDEFINITIONSTRING> getDATATYPEDEFINITIONSTRINGREF();

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONXMLDATAREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONXMLDATA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONXMLDATAREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONXMLDATAREF</em>' reference list.
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONSType_DATATYPEDEFINITIONXMLDATAREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-XML-DATA-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<DATATYPEDEFINITIONXMLDATA> getDATATYPEDEFINITIONXMLDATAREF();

} // DATATYPEDEFINITIONSType
