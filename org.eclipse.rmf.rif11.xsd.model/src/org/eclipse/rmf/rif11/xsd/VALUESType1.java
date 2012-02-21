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

package org.eclipse.rmf.rif11.xsd;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>VALUES Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.VALUESType1#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.VALUESType1#getATTRIBUTEVALUEEMBEDDEDDOCUMENT <em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.VALUESType1#getATTRIBUTEVALUEEMBEDDEDFILE <em>ATTRIBUTEVALUEEMBEDDEDFILE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.VALUESType1#getATTRIBUTEVALUEENUMERATION <em>ATTRIBUTEVALUEENUMERATION</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.VALUESType1#getATTRIBUTEVALUEFILEREFERENCE <em>ATTRIBUTEVALUEFILEREFERENCE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.VALUESType1#getATTRIBUTEVALUESIMPLE <em>ATTRIBUTEVALUESIMPLE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.VALUESType1#getATTRIBUTEVALUEXMLDATA <em>ATTRIBUTEVALUEXMLDATA</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getVALUESType1()
 * @model extendedMetaData="name='VALUES_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface VALUESType1 extends EObject {
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getVALUESType1_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</em>' containment reference list.
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getVALUESType1_ATTRIBUTEVALUEEMBEDDEDDOCUMENT()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-EMBEDDED-DOCUMENT' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUEEMBEDDEDDOCUMENT> getATTRIBUTEVALUEEMBEDDEDDOCUMENT();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEEMBEDDEDFILE</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEEMBEDDEDFILE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEEMBEDDEDFILE</em>' containment reference list.
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getVALUESType1_ATTRIBUTEVALUEEMBEDDEDFILE()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-EMBEDDED-FILE' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUEEMBEDDEDFILE> getATTRIBUTEVALUEEMBEDDEDFILE();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEENUMERATION</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEENUMERATION</em>' containment reference list.
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getVALUESType1_ATTRIBUTEVALUEENUMERATION()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-ENUMERATION' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUEENUMERATION> getATTRIBUTEVALUEENUMERATION();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEFILEREFERENCE</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEFILEREFERENCE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEFILEREFERENCE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEFILEREFERENCE</em>' containment reference list.
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getVALUESType1_ATTRIBUTEVALUEFILEREFERENCE()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-FILE-REFERENCE' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUEFILEREFERENCE> getATTRIBUTEVALUEFILEREFERENCE();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUESIMPLE</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUESIMPLE</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUESIMPLE</em>' containment reference list.
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getVALUESType1_ATTRIBUTEVALUESIMPLE()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-SIMPLE' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUESIMPLE> getATTRIBUTEVALUESIMPLE();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEXMLDATA}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEXMLDATA</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEXMLDATA</em>' containment reference list.
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getVALUESType1_ATTRIBUTEVALUEXMLDATA()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-XML-DATA' namespace='##targetNamespace' group='#group:0'"
	 * @generated
	 */
	EList<ATTRIBUTEVALUEXMLDATA> getATTRIBUTEVALUEXMLDATA();

} // VALUESType1
