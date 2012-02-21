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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RIFCONTENT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIFCONTENT#getDATATYPES <em>DATATYPES</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIFCONTENT#getSPECTYPES <em>SPECTYPES</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIFCONTENT#getSPECOBJECTS <em>SPECOBJECTS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIFCONTENT#getSPECRELATIONS <em>SPECRELATIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIFCONTENT#getSPECGROUPS <em>SPECGROUPS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIFCONTENT#getSPECHIERARCHYROOTS <em>SPECHIERARCHYROOTS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIFCONTENT#getSPECGROUPHIERARCHYROOTS <em>SPECGROUPHIERARCHYROOTS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIFCONTENT#getACCESSPOLICIES <em>ACCESSPOLICIES</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIFCONTENT()
 * @model extendedMetaData="name='RIF-CONTENT' kind='elementOnly'"
 * @generated
 */
public interface RIFCONTENT extends EObject {
	/**
	 * Returns the value of the '<em><b>DATATYPES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPES</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPES</em>' containment reference.
	 * @see #setDATATYPES(DATATYPESType)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIFCONTENT_DATATYPES()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DATATYPES' namespace='##targetNamespace'"
	 * @generated
	 */
	DATATYPESType getDATATYPES();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIFCONTENT#getDATATYPES <em>DATATYPES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATATYPES</em>' containment reference.
	 * @see #getDATATYPES()
	 * @generated
	 */
	void setDATATYPES(DATATYPESType value);

	/**
	 * Returns the value of the '<em><b>SPECTYPES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECTYPES</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECTYPES</em>' containment reference.
	 * @see #setSPECTYPES(SPECTYPESType1)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIFCONTENT_SPECTYPES()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-TYPES' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECTYPESType1 getSPECTYPES();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIFCONTENT#getSPECTYPES <em>SPECTYPES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECTYPES</em>' containment reference.
	 * @see #getSPECTYPES()
	 * @generated
	 */
	void setSPECTYPES(SPECTYPESType1 value);

	/**
	 * Returns the value of the '<em><b>SPECOBJECTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECOBJECTS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECOBJECTS</em>' containment reference.
	 * @see #setSPECOBJECTS(SPECOBJECTSType2)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIFCONTENT_SPECOBJECTS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-OBJECTS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECOBJECTSType2 getSPECOBJECTS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIFCONTENT#getSPECOBJECTS <em>SPECOBJECTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECOBJECTS</em>' containment reference.
	 * @see #getSPECOBJECTS()
	 * @generated
	 */
	void setSPECOBJECTS(SPECOBJECTSType2 value);

	/**
	 * Returns the value of the '<em><b>SPECRELATIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECRELATIONS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECRELATIONS</em>' containment reference.
	 * @see #setSPECRELATIONS(SPECRELATIONSType2)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIFCONTENT_SPECRELATIONS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-RELATIONS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECRELATIONSType2 getSPECRELATIONS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIFCONTENT#getSPECRELATIONS <em>SPECRELATIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECRELATIONS</em>' containment reference.
	 * @see #getSPECRELATIONS()
	 * @generated
	 */
	void setSPECRELATIONS(SPECRELATIONSType2 value);

	/**
	 * Returns the value of the '<em><b>SPECGROUPS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECGROUPS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECGROUPS</em>' containment reference.
	 * @see #setSPECGROUPS(SPECGROUPSType1)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIFCONTENT_SPECGROUPS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-GROUPS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECGROUPSType1 getSPECGROUPS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIFCONTENT#getSPECGROUPS <em>SPECGROUPS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECGROUPS</em>' containment reference.
	 * @see #getSPECGROUPS()
	 * @generated
	 */
	void setSPECGROUPS(SPECGROUPSType1 value);

	/**
	 * Returns the value of the '<em><b>SPECHIERARCHYROOTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECHIERARCHYROOTS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECHIERARCHYROOTS</em>' containment reference.
	 * @see #setSPECHIERARCHYROOTS(SPECHIERARCHYROOTSType1)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIFCONTENT_SPECHIERARCHYROOTS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-HIERARCHY-ROOTS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECHIERARCHYROOTSType1 getSPECHIERARCHYROOTS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIFCONTENT#getSPECHIERARCHYROOTS <em>SPECHIERARCHYROOTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECHIERARCHYROOTS</em>' containment reference.
	 * @see #getSPECHIERARCHYROOTS()
	 * @generated
	 */
	void setSPECHIERARCHYROOTS(SPECHIERARCHYROOTSType1 value);

	/**
	 * Returns the value of the '<em><b>SPECGROUPHIERARCHYROOTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECGROUPHIERARCHYROOTS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECGROUPHIERARCHYROOTS</em>' containment reference.
	 * @see #setSPECGROUPHIERARCHYROOTS(SPECGROUPHIERARCHYROOTSType)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIFCONTENT_SPECGROUPHIERARCHYROOTS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-GROUP-HIERARCHY-ROOTS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECGROUPHIERARCHYROOTSType getSPECGROUPHIERARCHYROOTS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIFCONTENT#getSPECGROUPHIERARCHYROOTS <em>SPECGROUPHIERARCHYROOTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECGROUPHIERARCHYROOTS</em>' containment reference.
	 * @see #getSPECGROUPHIERARCHYROOTS()
	 * @generated
	 */
	void setSPECGROUPHIERARCHYROOTS(SPECGROUPHIERARCHYROOTSType value);

	/**
	 * Returns the value of the '<em><b>ACCESSPOLICIES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ACCESSPOLICIES</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ACCESSPOLICIES</em>' containment reference.
	 * @see #setACCESSPOLICIES(ACCESSPOLICIESType)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIFCONTENT_ACCESSPOLICIES()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ACCESS-POLICIES' namespace='##targetNamespace'"
	 * @generated
	 */
	ACCESSPOLICIESType getACCESSPOLICIES();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIFCONTENT#getACCESSPOLICIES <em>ACCESSPOLICIES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ACCESSPOLICIES</em>' containment reference.
	 * @see #getACCESSPOLICIES()
	 * @generated
	 */
	void setACCESSPOLICIES(ACCESSPOLICIESType value);

} // RIFCONTENT
