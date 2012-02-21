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
 * A representation of the model object '<em><b>RELATIONGROUP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies a relation type.
 * 
 * Any relation between two SpecObjects must be of a certain type. I.e., any relation must belong to a RelationGroup which specifies the relation type.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getRELATIONTYPE <em>RELATIONTYPE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getSPECRELATIONS <em>SPECRELATIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getTARGETGROUP <em>TARGETGROUP</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRELATIONGROUP()
 * @model extendedMetaData="name='RELATION-GROUP' kind='elementOnly'"
 * @generated
 */
public interface RELATIONGROUP extends EObject {
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRELATIONGROUP_DESC()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getDESC <em>DESC</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRELATIONGROUP_IDENTIFIER()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRELATIONGROUP_LASTCHANGE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLASTCHANGE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRELATIONGROUP_LONGNAME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getLONGNAME <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LONGNAME</em>' attribute.
	 * @see #getLONGNAME()
	 * @generated
	 */
	void setLONGNAME(String value);

	/**
	 * Returns the value of the '<em><b>RELATIONTYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RELATIONTYPE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RELATIONTYPE</em>' containment reference.
	 * @see #setRELATIONTYPE(RELATIONTYPEType)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRELATIONGROUP_RELATIONTYPE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RELATION-TYPE' namespace='##targetNamespace'"
	 * @generated
	 */
	RELATIONTYPEType getRELATIONTYPE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getRELATIONTYPE <em>RELATIONTYPE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RELATIONTYPE</em>' containment reference.
	 * @see #getRELATIONTYPE()
	 * @generated
	 */
	void setRELATIONTYPE(RELATIONTYPEType value);

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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRELATIONGROUP_SPECRELATIONS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-RELATIONS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECRELATIONSType2 getSPECRELATIONS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getSPECRELATIONS <em>SPECRELATIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECRELATIONS</em>' containment reference.
	 * @see #getSPECRELATIONS()
	 * @generated
	 */
	void setSPECRELATIONS(SPECRELATIONSType2 value);

	/**
	 * Returns the value of the '<em><b>TARGETGROUP</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TARGETGROUP</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TARGETGROUP</em>' containment reference.
	 * @see #setTARGETGROUP(TARGETGROUPType)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getRELATIONGROUP_TARGETGROUP()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TARGET-GROUP' namespace='##targetNamespace'"
	 * @generated
	 */
	TARGETGROUPType getTARGETGROUP();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.RELATIONGROUP#getTARGETGROUP <em>TARGETGROUP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TARGETGROUP</em>' containment reference.
	 * @see #getTARGETGROUP()
	 * @generated
	 */
	void setTARGETGROUP(TARGETGROUPType value);

} // RELATIONGROUP
