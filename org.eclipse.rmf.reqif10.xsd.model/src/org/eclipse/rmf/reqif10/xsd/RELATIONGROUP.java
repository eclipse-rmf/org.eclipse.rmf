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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RELATIONGROUP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP#getALTERNATIVEID <em>ALTERNATIVEID</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP#getSOURCESPECIFICATION <em>SOURCESPECIFICATION</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP#getSPECRELATIONS <em>SPECRELATIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP#getTARGETSPECIFICATION <em>TARGETSPECIFICATION</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP#getLONGNAME <em>LONGNAME</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getRELATIONGROUP()
 * @model extendedMetaData="name='RELATION-GROUP' kind='elementOnly'"
 * @generated
 */
public interface RELATIONGROUP extends EObject {
	/**
	 * Returns the value of the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ALTERNATIVEID</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ALTERNATIVEID</em>' containment reference.
	 * @see #setALTERNATIVEID(ALTERNATIVEIDType11)
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getRELATIONGROUP_ALTERNATIVEID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ALTERNATIVE-ID' namespace='##targetNamespace'"
	 * @generated
	 */
	ALTERNATIVEIDType11 getALTERNATIVEID();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP#getALTERNATIVEID <em>ALTERNATIVEID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ALTERNATIVEID</em>' containment reference.
	 * @see #getALTERNATIVEID()
	 * @generated
	 */
	void setALTERNATIVEID(ALTERNATIVEIDType11 value);

	/**
	 * Returns the value of the '<em><b>SOURCESPECIFICATION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SOURCESPECIFICATION</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SOURCESPECIFICATION</em>' containment reference.
	 * @see #setSOURCESPECIFICATION(SOURCESPECIFICATIONType)
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getRELATIONGROUP_SOURCESPECIFICATION()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='SOURCE-SPECIFICATION' namespace='##targetNamespace'"
	 * @generated
	 */
	SOURCESPECIFICATIONType getSOURCESPECIFICATION();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP#getSOURCESPECIFICATION <em>SOURCESPECIFICATION</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SOURCESPECIFICATION</em>' containment reference.
	 * @see #getSOURCESPECIFICATION()
	 * @generated
	 */
	void setSOURCESPECIFICATION(SOURCESPECIFICATIONType value);

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
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getRELATIONGROUP_SPECRELATIONS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='SPEC-RELATIONS' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECRELATIONSType getSPECRELATIONS();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP#getSPECRELATIONS <em>SPECRELATIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECRELATIONS</em>' containment reference.
	 * @see #getSPECRELATIONS()
	 * @generated
	 */
	void setSPECRELATIONS(SPECRELATIONSType value);

	/**
	 * Returns the value of the '<em><b>TARGETSPECIFICATION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TARGETSPECIFICATION</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TARGETSPECIFICATION</em>' containment reference.
	 * @see #setTARGETSPECIFICATION(TARGETSPECIFICATIONType)
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getRELATIONGROUP_TARGETSPECIFICATION()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TARGET-SPECIFICATION' namespace='##targetNamespace'"
	 * @generated
	 */
	TARGETSPECIFICATIONType getTARGETSPECIFICATION();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP#getTARGETSPECIFICATION <em>TARGETSPECIFICATION</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TARGETSPECIFICATION</em>' containment reference.
	 * @see #getTARGETSPECIFICATION()
	 * @generated
	 */
	void setTARGETSPECIFICATION(TARGETSPECIFICATIONType value);

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
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getRELATIONGROUP_TYPE()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TYPE' namespace='##targetNamespace'"
	 * @generated
	 */
	TYPEType getTYPE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP#getTYPE <em>TYPE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TYPE</em>' containment reference.
	 * @see #getTYPE()
	 * @generated
	 */
	void setTYPE(TYPEType value);

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
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getRELATIONGROUP_DESC()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DESC'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP#getDESC <em>DESC</em>}' attribute.
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
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getRELATIONGROUP_IDENTIFIER()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='IDENTIFIER'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getRELATIONGROUP_LASTCHANGE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='attribute' name='LAST-CHANGE'"
	 * @generated
	 */
	XMLGregorianCalendar getLASTCHANGE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
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
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getRELATIONGROUP_LONGNAME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='LONG-NAME'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.RELATIONGROUP#getLONGNAME <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LONGNAME</em>' attribute.
	 * @see #getLONGNAME()
	 * @generated
	 */
	void setLONGNAME(String value);

} // RELATIONGROUP
