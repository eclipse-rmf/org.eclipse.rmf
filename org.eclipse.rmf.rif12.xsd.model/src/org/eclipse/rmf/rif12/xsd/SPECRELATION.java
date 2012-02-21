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
 * A representation of the model object '<em><b>SPECRELATION</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Indicates a relation between two SpecObjects.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.SPECRELATION#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.SPECRELATION#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.SPECRELATION#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.SPECRELATION#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.SPECRELATION#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.SPECRELATION#getVALUES <em>VALUES</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.SPECRELATION#getSOURCE <em>SOURCE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.SPECRELATION#getTARGET <em>TARGET</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getSPECRELATION()
 * @model extendedMetaData="name='SPEC-RELATION' kind='elementOnly'"
 * @generated
 */
public interface SPECRELATION extends EObject {
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getSPECRELATION_DESC()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.SPECRELATION#getDESC <em>DESC</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getSPECRELATION_IDENTIFIER()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.SPECRELATION#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getSPECRELATION_LASTCHANGE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLASTCHANGE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.SPECRELATION#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getSPECRELATION_LONGNAME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.SPECRELATION#getLONGNAME <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LONGNAME</em>' attribute.
	 * @see #getLONGNAME()
	 * @generated
	 */
	void setLONGNAME(String value);

	/**
	 * Returns the value of the '<em><b>TYPE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TYPE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TYPE</em>' containment reference.
	 * @see #setTYPE(TYPEType)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getSPECRELATION_TYPE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TYPE' namespace='##targetNamespace'"
	 * @generated
	 */
	TYPEType getTYPE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.SPECRELATION#getTYPE <em>TYPE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TYPE</em>' containment reference.
	 * @see #getTYPE()
	 * @generated
	 */
	void setTYPE(TYPEType value);

	/**
	 * Returns the value of the '<em><b>VALUES</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>VALUES</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>VALUES</em>' containment reference.
	 * @see #setVALUES(VALUESType3)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getSPECRELATION_VALUES()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='VALUES' namespace='##targetNamespace'"
	 * @generated
	 */
	VALUESType3 getVALUES();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.SPECRELATION#getVALUES <em>VALUES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VALUES</em>' containment reference.
	 * @see #getVALUES()
	 * @generated
	 */
	void setVALUES(VALUESType3 value);

	/**
	 * Returns the value of the '<em><b>SOURCE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SOURCE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SOURCE</em>' containment reference.
	 * @see #setSOURCE(SOURCEType)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getSPECRELATION_SOURCE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SOURCE' namespace='##targetNamespace'"
	 * @generated
	 */
	SOURCEType getSOURCE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.SPECRELATION#getSOURCE <em>SOURCE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SOURCE</em>' containment reference.
	 * @see #getSOURCE()
	 * @generated
	 */
	void setSOURCE(SOURCEType value);

	/**
	 * Returns the value of the '<em><b>TARGET</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TARGET</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TARGET</em>' containment reference.
	 * @see #setTARGET(TARGETType)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getSPECRELATION_TARGET()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TARGET' namespace='##targetNamespace'"
	 * @generated
	 */
	TARGETType getTARGET();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.SPECRELATION#getTARGET <em>TARGET</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TARGET</em>' containment reference.
	 * @see #getTARGET()
	 * @generated
	 */
	void setTARGET(TARGETType value);

} // SPECRELATION
