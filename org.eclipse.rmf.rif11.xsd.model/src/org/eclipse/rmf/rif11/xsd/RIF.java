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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RIF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * This is the root element.
 * 
 * Instances of concrete elements must directly or indirectly be aggregated by the root element.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RIF#getAUTHOR <em>AUTHOR</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RIF#getCOMMENT <em>COMMENT</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RIF#getCOUNTRYCODE <em>COUNTRYCODE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RIF#getCREATIONTIME <em>CREATIONTIME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RIF#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RIF#getSOURCETOOLID <em>SOURCETOOLID</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RIF#getTITLE <em>TITLE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RIF#getVERSION <em>VERSION</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RIF#getACCESSPOLICIES <em>ACCESSPOLICIES</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RIF#getDATATYPES <em>DATATYPES</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RIF#getSPECTYPES <em>SPECTYPES</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RIF#getSPECOBJECTS <em>SPECOBJECTS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RIF#getSPECRELATIONS <em>SPECRELATIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RIF#getSPECGROUPS <em>SPECGROUPS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RIF#getSPECHIERARCHYROOTS <em>SPECHIERARCHYROOTS</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRIF()
 * @model extendedMetaData="name='RIF' kind='elementOnly'"
 * @generated
 */
public interface RIF extends EObject {
	/**
	 * Returns the value of the '<em><b>AUTHOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>AUTHOR</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>AUTHOR</em>' attribute.
	 * @see #setAUTHOR(String)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRIF_AUTHOR()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='AUTHOR' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAUTHOR();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RIF#getAUTHOR <em>AUTHOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>AUTHOR</em>' attribute.
	 * @see #getAUTHOR()
	 * @generated
	 */
	void setAUTHOR(String value);

	/**
	 * Returns the value of the '<em><b>COMMENT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>COMMENT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>COMMENT</em>' attribute.
	 * @see #setCOMMENT(String)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRIF_COMMENT()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='COMMENT' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCOMMENT();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RIF#getCOMMENT <em>COMMENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COMMENT</em>' attribute.
	 * @see #getCOMMENT()
	 * @generated
	 */
	void setCOMMENT(String value);

	/**
	 * Returns the value of the '<em><b>COUNTRYCODE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>COUNTRYCODE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>COUNTRYCODE</em>' attribute.
	 * @see #setCOUNTRYCODE(String)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRIF_COUNTRYCODE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='COUNTRY-CODE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCOUNTRYCODE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RIF#getCOUNTRYCODE <em>COUNTRYCODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COUNTRYCODE</em>' attribute.
	 * @see #getCOUNTRYCODE()
	 * @generated
	 */
	void setCOUNTRYCODE(String value);

	/**
	 * Returns the value of the '<em><b>CREATIONTIME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>CREATIONTIME</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>CREATIONTIME</em>' attribute.
	 * @see #setCREATIONTIME(XMLGregorianCalendar)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRIF_CREATIONTIME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='CREATION-TIME' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCREATIONTIME();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RIF#getCREATIONTIME <em>CREATIONTIME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATIONTIME</em>' attribute.
	 * @see #getCREATIONTIME()
	 * @generated
	 */
	void setCREATIONTIME(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>IDENTIFIER</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>IDENTIFIER</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>IDENTIFIER</em>' attribute.
	 * @see #setIDENTIFIER(String)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRIF_IDENTIFIER()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RIF#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDENTIFIER</em>' attribute.
	 * @see #getIDENTIFIER()
	 * @generated
	 */
	void setIDENTIFIER(String value);

	/**
	 * Returns the value of the '<em><b>SOURCETOOLID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SOURCETOOLID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SOURCETOOLID</em>' attribute.
	 * @see #setSOURCETOOLID(String)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRIF_SOURCETOOLID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='SOURCE-TOOL-ID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSOURCETOOLID();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RIF#getSOURCETOOLID <em>SOURCETOOLID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SOURCETOOLID</em>' attribute.
	 * @see #getSOURCETOOLID()
	 * @generated
	 */
	void setSOURCETOOLID(String value);

	/**
	 * Returns the value of the '<em><b>TITLE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TITLE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TITLE</em>' attribute.
	 * @see #setTITLE(String)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRIF_TITLE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='TITLE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTITLE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RIF#getTITLE <em>TITLE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TITLE</em>' attribute.
	 * @see #getTITLE()
	 * @generated
	 */
	void setTITLE(String value);

	/**
	 * Returns the value of the '<em><b>VERSION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VERSION</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VERSION</em>' attribute.
	 * @see #setVERSION(String)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRIF_VERSION()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='VERSION' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVERSION();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RIF#getVERSION <em>VERSION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VERSION</em>' attribute.
	 * @see #getVERSION()
	 * @generated
	 */
	void setVERSION(String value);

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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRIF_ACCESSPOLICIES()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ACCESS-POLICIES' namespace='##targetNamespace'"
	 * @generated
	 */
	ACCESSPOLICIESType getACCESSPOLICIES();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RIF#getACCESSPOLICIES <em>ACCESSPOLICIES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ACCESSPOLICIES</em>' containment reference.
	 * @see #getACCESSPOLICIES()
	 * @generated
	 */
	void setACCESSPOLICIES(ACCESSPOLICIESType value);

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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRIF_DATATYPES()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DATATYPES' namespace='##targetNamespace'"
	 * @generated
	 */
	DATATYPESType getDATATYPES();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RIF#getDATATYPES <em>DATATYPES</em>}' containment reference.
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
	 * @see #setSPECTYPES(SPECTYPESType)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRIF_SPECTYPES()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-TYPES' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECTYPESType getSPECTYPES();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RIF#getSPECTYPES <em>SPECTYPES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECTYPES</em>' containment reference.
	 * @see #getSPECTYPES()
	 * @generated
	 */
	void setSPECTYPES(SPECTYPESType value);

	/**
	 * Returns the value of the '<em><b>SPECOBJECTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECOBJECTS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECOBJECTS</em>' containment reference.
	 * @see #setSPECOBJECTS(SPECOBJECTSType)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRIF_SPECOBJECTS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-OBJECTS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECOBJECTSType getSPECOBJECTS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RIF#getSPECOBJECTS <em>SPECOBJECTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECOBJECTS</em>' containment reference.
	 * @see #getSPECOBJECTS()
	 * @generated
	 */
	void setSPECOBJECTS(SPECOBJECTSType value);

	/**
	 * Returns the value of the '<em><b>SPECRELATIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECRELATIONS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECRELATIONS</em>' containment reference.
	 * @see #setSPECRELATIONS(SPECRELATIONSType1)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRIF_SPECRELATIONS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-RELATIONS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECRELATIONSType1 getSPECRELATIONS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RIF#getSPECRELATIONS <em>SPECRELATIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECRELATIONS</em>' containment reference.
	 * @see #getSPECRELATIONS()
	 * @generated
	 */
	void setSPECRELATIONS(SPECRELATIONSType1 value);

	/**
	 * Returns the value of the '<em><b>SPECGROUPS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECGROUPS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECGROUPS</em>' containment reference.
	 * @see #setSPECGROUPS(SPECGROUPSType)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRIF_SPECGROUPS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-GROUPS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECGROUPSType getSPECGROUPS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RIF#getSPECGROUPS <em>SPECGROUPS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECGROUPS</em>' containment reference.
	 * @see #getSPECGROUPS()
	 * @generated
	 */
	void setSPECGROUPS(SPECGROUPSType value);

	/**
	 * Returns the value of the '<em><b>SPECHIERARCHYROOTS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECHIERARCHYROOTS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECHIERARCHYROOTS</em>' containment reference.
	 * @see #setSPECHIERARCHYROOTS(SPECHIERARCHYROOTSType)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRIF_SPECHIERARCHYROOTS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-HIERARCHY-ROOTS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECHIERARCHYROOTSType getSPECHIERARCHYROOTS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RIF#getSPECHIERARCHYROOTS <em>SPECHIERARCHYROOTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECHIERARCHYROOTS</em>' containment reference.
	 * @see #getSPECHIERARCHYROOTS()
	 * @generated
	 */
	void setSPECHIERARCHYROOTS(SPECHIERARCHYROOTSType value);

} // RIF
