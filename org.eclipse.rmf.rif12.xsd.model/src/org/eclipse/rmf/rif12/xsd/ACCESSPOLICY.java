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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ACCESSPOLICY</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getACCESSMODE <em>ACCESSMODE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getATTRIBUTEDEFINITIONS <em>ATTRIBUTEDEFINITIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getATTRIBUTEVALUES <em>ATTRIBUTEVALUES</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getDATATYPEDEFINITIONS <em>DATATYPEDEFINITIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getRELATIONGROUPS <em>RELATIONGROUPS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getSPECGROUPS <em>SPECGROUPS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getSPECHIERARCHIES <em>SPECHIERARCHIES</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getSPECHIERARCHYROOTS <em>SPECHIERARCHYROOTS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getSPECOBJECTS <em>SPECOBJECTS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getSPECRELATIONS <em>SPECRELATIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getSPECTYPES <em>SPECTYPES</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getACCESSPOLICY()
 * @model extendedMetaData="name='ACCESS-POLICY' kind='elementOnly'"
 * @generated
 */
public interface ACCESSPOLICY extends EObject {
	/**
	 * Returns the value of the '<em><b>DESC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DESC</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DESC</em>' attribute.
	 * @see #setDESC(String)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getACCESSPOLICY_DESC()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getDESC <em>DESC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DESC</em>' attribute.
	 * @see #getDESC()
	 * @generated
	 */
	void setDESC(String value);

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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getACCESSPOLICY_IDENTIFIER()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDENTIFIER</em>' attribute.
	 * @see #getIDENTIFIER()
	 * @generated
	 */
	void setIDENTIFIER(String value);

	/**
	 * Returns the value of the '<em><b>LASTCHANGE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LASTCHANGE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LASTCHANGE</em>' attribute.
	 * @see #setLASTCHANGE(XMLGregorianCalendar)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getACCESSPOLICY_LASTCHANGE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLASTCHANGE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LASTCHANGE</em>' attribute.
	 * @see #getLASTCHANGE()
	 * @generated
	 */
	void setLASTCHANGE(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>LONGNAME</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>LONGNAME</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>LONGNAME</em>' attribute.
	 * @see #setLONGNAME(String)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getACCESSPOLICY_LONGNAME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getLONGNAME <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LONGNAME</em>' attribute.
	 * @see #getLONGNAME()
	 * @generated
	 */
	void setLONGNAME(String value);

	/**
	 * Returns the value of the '<em><b>ACCESSMODE</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICYACCESSMODEENUM}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ACCESSMODE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ACCESSMODE</em>' attribute.
	 * @see org.eclipse.rmf.rif12.xsd.ACCESSPOLICYACCESSMODEENUM
	 * @see #isSetACCESSMODE()
	 * @see #unsetACCESSMODE()
	 * @see #setACCESSMODE(ACCESSPOLICYACCESSMODEENUM)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getACCESSPOLICY_ACCESSMODE()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='element' name='ACCESS-MODE' namespace='##targetNamespace'"
	 * @generated
	 */
	ACCESSPOLICYACCESSMODEENUM getACCESSMODE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getACCESSMODE <em>ACCESSMODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ACCESSMODE</em>' attribute.
	 * @see org.eclipse.rmf.rif12.xsd.ACCESSPOLICYACCESSMODEENUM
	 * @see #isSetACCESSMODE()
	 * @see #unsetACCESSMODE()
	 * @see #getACCESSMODE()
	 * @generated
	 */
	void setACCESSMODE(ACCESSPOLICYACCESSMODEENUM value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getACCESSMODE <em>ACCESSMODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetACCESSMODE()
	 * @see #getACCESSMODE()
	 * @see #setACCESSMODE(ACCESSPOLICYACCESSMODEENUM)
	 * @generated
	 */
	void unsetACCESSMODE();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getACCESSMODE <em>ACCESSMODE</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ACCESSMODE</em>' attribute is set.
	 * @see #unsetACCESSMODE()
	 * @see #getACCESSMODE()
	 * @see #setACCESSMODE(ACCESSPOLICYACCESSMODEENUM)
	 * @generated
	 */
	boolean isSetACCESSMODE();

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONS</em>' containment reference.
	 * @see #setATTRIBUTEDEFINITIONS(ATTRIBUTEDEFINITIONSType)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getACCESSPOLICY_ATTRIBUTEDEFINITIONS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITIONS' namespace='##targetNamespace'"
	 * @generated
	 */
	ATTRIBUTEDEFINITIONSType getATTRIBUTEDEFINITIONS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getATTRIBUTEDEFINITIONS <em>ATTRIBUTEDEFINITIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATTRIBUTEDEFINITIONS</em>' containment reference.
	 * @see #getATTRIBUTEDEFINITIONS()
	 * @generated
	 */
	void setATTRIBUTEDEFINITIONS(ATTRIBUTEDEFINITIONSType value);

	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUES</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUES</em>' containment reference.
	 * @see #setATTRIBUTEVALUES(ATTRIBUTEVALUESType)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getACCESSPOLICY_ATTRIBUTEVALUES()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUES' namespace='##targetNamespace'"
	 * @generated
	 */
	ATTRIBUTEVALUESType getATTRIBUTEVALUES();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getATTRIBUTEVALUES <em>ATTRIBUTEVALUES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATTRIBUTEVALUES</em>' containment reference.
	 * @see #getATTRIBUTEVALUES()
	 * @generated
	 */
	void setATTRIBUTEVALUES(ATTRIBUTEVALUESType value);

	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONS</em>' containment reference.
	 * @see #setDATATYPEDEFINITIONS(DATATYPEDEFINITIONSType)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getACCESSPOLICY_DATATYPEDEFINITIONS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITIONS' namespace='##targetNamespace'"
	 * @generated
	 */
	DATATYPEDEFINITIONSType getDATATYPEDEFINITIONS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getDATATYPEDEFINITIONS <em>DATATYPEDEFINITIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATATYPEDEFINITIONS</em>' containment reference.
	 * @see #getDATATYPEDEFINITIONS()
	 * @generated
	 */
	void setDATATYPEDEFINITIONS(DATATYPEDEFINITIONSType value);

	/**
	 * Returns the value of the '<em><b>RELATIONGROUPS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RELATIONGROUPS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RELATIONGROUPS</em>' containment reference.
	 * @see #setRELATIONGROUPS(RELATIONGROUPSType)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getACCESSPOLICY_RELATIONGROUPS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RELATION-GROUPS' namespace='##targetNamespace'"
	 * @generated
	 */
	RELATIONGROUPSType getRELATIONGROUPS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getRELATIONGROUPS <em>RELATIONGROUPS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RELATIONGROUPS</em>' containment reference.
	 * @see #getRELATIONGROUPS()
	 * @generated
	 */
	void setRELATIONGROUPS(RELATIONGROUPSType value);

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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getACCESSPOLICY_SPECGROUPS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-GROUPS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECGROUPSType getSPECGROUPS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getSPECGROUPS <em>SPECGROUPS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECGROUPS</em>' containment reference.
	 * @see #getSPECGROUPS()
	 * @generated
	 */
	void setSPECGROUPS(SPECGROUPSType value);

	/**
	 * Returns the value of the '<em><b>SPECHIERARCHIES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECHIERARCHIES</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECHIERARCHIES</em>' containment reference.
	 * @see #setSPECHIERARCHIES(SPECHIERARCHIESType)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getACCESSPOLICY_SPECHIERARCHIES()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-HIERARCHIES' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECHIERARCHIESType getSPECHIERARCHIES();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getSPECHIERARCHIES <em>SPECHIERARCHIES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECHIERARCHIES</em>' containment reference.
	 * @see #getSPECHIERARCHIES()
	 * @generated
	 */
	void setSPECHIERARCHIES(SPECHIERARCHIESType value);

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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getACCESSPOLICY_SPECHIERARCHYROOTS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-HIERARCHY-ROOTS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECHIERARCHYROOTSType getSPECHIERARCHYROOTS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getSPECHIERARCHYROOTS <em>SPECHIERARCHYROOTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECHIERARCHYROOTS</em>' containment reference.
	 * @see #getSPECHIERARCHYROOTS()
	 * @generated
	 */
	void setSPECHIERARCHYROOTS(SPECHIERARCHYROOTSType value);

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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getACCESSPOLICY_SPECOBJECTS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-OBJECTS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECOBJECTSType getSPECOBJECTS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getSPECOBJECTS <em>SPECOBJECTS</em>}' containment reference.
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
	 * @see #setSPECRELATIONS(SPECRELATIONSType)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getACCESSPOLICY_SPECRELATIONS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-RELATIONS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECRELATIONSType getSPECRELATIONS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getSPECRELATIONS <em>SPECRELATIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECRELATIONS</em>' containment reference.
	 * @see #getSPECRELATIONS()
	 * @generated
	 */
	void setSPECRELATIONS(SPECRELATIONSType value);

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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getACCESSPOLICY_SPECTYPES()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-TYPES' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECTYPESType getSPECTYPES();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ACCESSPOLICY#getSPECTYPES <em>SPECTYPES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECTYPES</em>' containment reference.
	 * @see #getSPECTYPES()
	 * @generated
	 */
	void setSPECTYPES(SPECTYPESType value);

} // ACCESSPOLICY
