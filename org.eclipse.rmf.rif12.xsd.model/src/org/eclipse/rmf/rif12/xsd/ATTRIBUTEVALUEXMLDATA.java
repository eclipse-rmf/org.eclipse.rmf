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
 * A representation of the model object '<em><b>ATTRIBUTEVALUEXMLDATA</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Wrapper for a different namespace (e.g. for XHTML).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEXMLDATA#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEXMLDATA#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEXMLDATA#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEXMLDATA#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEXMLDATA#getDEFINITION <em>DEFINITION</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEXMLDATA#getXMLCONTENT <em>XMLCONTENT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getATTRIBUTEVALUEXMLDATA()
 * @model extendedMetaData="name='ATTRIBUTE-VALUE-XML-DATA' kind='elementOnly'"
 * @generated
 */
public interface ATTRIBUTEVALUEXMLDATA extends EObject {
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getATTRIBUTEVALUEXMLDATA_DESC()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEXMLDATA#getDESC <em>DESC</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getATTRIBUTEVALUEXMLDATA_IDENTIFIER()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEXMLDATA#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getATTRIBUTEVALUEXMLDATA_LASTCHANGE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLASTCHANGE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEXMLDATA#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getATTRIBUTEVALUEXMLDATA_LONGNAME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEXMLDATA#getLONGNAME <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LONGNAME</em>' attribute.
	 * @see #getLONGNAME()
	 * @generated
	 */
	void setLONGNAME(String value);

	/**
	 * Returns the value of the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DEFINITION</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DEFINITION</em>' containment reference.
	 * @see #setDEFINITION(DEFINITIONType2)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getATTRIBUTEVALUEXMLDATA_DEFINITION()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DEFINITION' namespace='##targetNamespace'"
	 * @generated
	 */
	DEFINITIONType2 getDEFINITION();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEXMLDATA#getDEFINITION <em>DEFINITION</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DEFINITION</em>' containment reference.
	 * @see #getDEFINITION()
	 * @generated
	 */
	void setDEFINITION(DEFINITIONType2 value);

	/**
	 * Returns the value of the '<em><b>XMLCONTENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLCONTENT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLCONTENT</em>' containment reference.
	 * @see #setXMLCONTENT(XMLCONTENT)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getATTRIBUTEVALUEXMLDATA_XMLCONTENT()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='XML-CONTENT' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLCONTENT getXMLCONTENT();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEXMLDATA#getXMLCONTENT <em>XMLCONTENT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>XMLCONTENT</em>' containment reference.
	 * @see #getXMLCONTENT()
	 * @generated
	 */
	void setXMLCONTENT(XMLCONTENT value);

} // ATTRIBUTEVALUEXMLDATA
