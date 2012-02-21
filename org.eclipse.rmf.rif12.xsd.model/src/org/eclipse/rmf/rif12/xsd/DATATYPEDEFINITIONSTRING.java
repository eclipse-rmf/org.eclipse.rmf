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

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DATATYPEDEFINITIONSTRING</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the simple data type "String".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSTRING#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSTRING#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSTRING#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSTRING#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSTRING#getMAXLENGTH <em>MAXLENGTH</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONSTRING()
 * @model extendedMetaData="name='DATATYPE-DEFINITION-STRING' kind='elementOnly'"
 * @generated
 */
public interface DATATYPEDEFINITIONSTRING extends EObject {
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONSTRING_DESC()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSTRING#getDESC <em>DESC</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONSTRING_IDENTIFIER()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSTRING#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONSTRING_LASTCHANGE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLASTCHANGE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSTRING#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONSTRING_LONGNAME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSTRING#getLONGNAME <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LONGNAME</em>' attribute.
	 * @see #getLONGNAME()
	 * @generated
	 */
	void setLONGNAME(String value);

	/**
	 * Returns the value of the '<em><b>MAXLENGTH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MAXLENGTH</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAXLENGTH</em>' attribute.
	 * @see #setMAXLENGTH(BigInteger)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getDATATYPEDEFINITIONSTRING_MAXLENGTH()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='MAX-LENGTH' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getMAXLENGTH();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONSTRING#getMAXLENGTH <em>MAXLENGTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MAXLENGTH</em>' attribute.
	 * @see #getMAXLENGTH()
	 * @generated
	 */
	void setMAXLENGTH(BigInteger value);

} // DATATYPEDEFINITIONSTRING
