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
 * A representation of the model object '<em><b>ATTRIBUTEVALUES Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUESType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUESType#getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUESType#getATTRIBUTEVALUEEMBEDDEDFILEREF <em>ATTRIBUTEVALUEEMBEDDEDFILEREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUESType#getATTRIBUTEVALUEENUMERATIONREF <em>ATTRIBUTEVALUEENUMERATIONREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUESType#getATTRIBUTEVALUEFILEREFERENCEREF <em>ATTRIBUTEVALUEFILEREFERENCEREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUESType#getATTRIBUTEVALUESIMPLEREF <em>ATTRIBUTEVALUESIMPLEREF</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUESType#getATTRIBUTEVALUEXMLDATAREF <em>ATTRIBUTEVALUEXMLDATAREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getATTRIBUTEVALUESType()
 * @model extendedMetaData="name='ATTRIBUTE-VALUES_._type' kind='elementOnly'"
 * @generated
 */
public interface ATTRIBUTEVALUESType extends EObject {
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getATTRIBUTEVALUESType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF</em>' reference list.
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getATTRIBUTEVALUESType_ATTRIBUTEVALUEEMBEDDEDDOCUMENTREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUEEMBEDDEDDOCUMENT> getATTRIBUTEVALUEEMBEDDEDDOCUMENTREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILEREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEEMBEDDEDFILE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEEMBEDDEDFILEREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEEMBEDDEDFILEREF</em>' reference list.
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getATTRIBUTEVALUESType_ATTRIBUTEVALUEEMBEDDEDFILEREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-EMBEDDED-FILE-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUEEMBEDDEDFILE> getATTRIBUTEVALUEEMBEDDEDFILEREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEENUMERATIONREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEENUMERATION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEENUMERATIONREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEENUMERATIONREF</em>' reference list.
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getATTRIBUTEVALUESType_ATTRIBUTEVALUEENUMERATIONREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-ENUMERATION-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUEENUMERATION> getATTRIBUTEVALUEENUMERATIONREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEFILEREFERENCEREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEFILEREFERENCE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEFILEREFERENCEREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEFILEREFERENCEREF</em>' reference list.
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getATTRIBUTEVALUESType_ATTRIBUTEVALUEFILEREFERENCEREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-FILE-REFERENCE-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUEFILEREFERENCE> getATTRIBUTEVALUEFILEREFERENCEREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUESIMPLEREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUESIMPLE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUESIMPLEREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUESIMPLEREF</em>' reference list.
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getATTRIBUTEVALUESType_ATTRIBUTEVALUESIMPLEREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-SIMPLE-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUESIMPLE> getATTRIBUTEVALUESIMPLEREF();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEXMLDATAREF</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEXMLDATA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEXMLDATAREF</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEXMLDATAREF</em>' reference list.
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getATTRIBUTEVALUESType_ATTRIBUTEVALUEXMLDATAREF()
	 * @model resolveProxies="false" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-XML-DATA-REF' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUEXMLDATA> getATTRIBUTEVALUEXMLDATAREF();

} // ATTRIBUTEVALUESType
