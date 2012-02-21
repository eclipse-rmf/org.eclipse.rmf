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
 * A representation of the model object '<em><b>ATTRIBUTEVALUESIMPLE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains the concrete value of a simple data type.
 * 
 * The value is encoded as a string in "theValue". No type checking is done by the resulting Schema. The importer of the tool has to verify the correct type of the value in "theValue".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getDEFINITION <em>DEFINITION</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getTHEVALUE <em>THEVALUE</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getATTRIBUTEVALUESIMPLE()
 * @model extendedMetaData="name='ATTRIBUTE-VALUE-SIMPLE' kind='elementOnly'"
 * @generated
 */
public interface ATTRIBUTEVALUESIMPLE extends EObject {
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getATTRIBUTEVALUESIMPLE_DESC()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getDESC <em>DESC</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getATTRIBUTEVALUESIMPLE_IDENTIFIER()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getATTRIBUTEVALUESIMPLE_LASTCHANGE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLASTCHANGE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getATTRIBUTEVALUESIMPLE_LONGNAME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getLONGNAME <em>LONGNAME</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getATTRIBUTEVALUESIMPLE_DEFINITION()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DEFINITION' namespace='##targetNamespace'"
	 * @generated
	 */
	DEFINITIONType2 getDEFINITION();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getDEFINITION <em>DEFINITION</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DEFINITION</em>' containment reference.
	 * @see #getDEFINITION()
	 * @generated
	 */
	void setDEFINITION(DEFINITIONType2 value);

	/**
	 * Returns the value of the '<em><b>THEVALUE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>THEVALUE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>THEVALUE</em>' attribute.
	 * @see #setTHEVALUE(String)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getATTRIBUTEVALUESIMPLE_THEVALUE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='THE-VALUE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTHEVALUE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESIMPLE#getTHEVALUE <em>THEVALUE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>THEVALUE</em>' attribute.
	 * @see #getTHEVALUE()
	 * @generated
	 */
	void setTHEVALUE(String value);

} // ATTRIBUTEVALUESIMPLE
