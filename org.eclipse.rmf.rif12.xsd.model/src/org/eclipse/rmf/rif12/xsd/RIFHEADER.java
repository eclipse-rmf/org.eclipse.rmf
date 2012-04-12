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
 * A representation of the model object '<em><b>RIFHEADER</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIFHEADER#getAUTHOR <em>AUTHOR</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIFHEADER#getCOMMENT <em>COMMENT</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIFHEADER#getCREATIONTIME <em>CREATIONTIME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIFHEADER#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIFHEADER#getSOURCETOOLID <em>SOURCETOOLID</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.RIFHEADER#getTITLE <em>TITLE</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIFHEADER()
 * @model extendedMetaData="name='RIF-HEADER' kind='elementOnly'"
 * @generated
 */
public interface RIFHEADER extends EObject {
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIFHEADER_AUTHOR()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='AUTHOR' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAUTHOR();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIFHEADER#getAUTHOR <em>AUTHOR</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIFHEADER_COMMENT()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='COMMENT' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCOMMENT();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIFHEADER#getCOMMENT <em>COMMENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COMMENT</em>' attribute.
	 * @see #getCOMMENT()
	 * @generated
	 */
	void setCOMMENT(String value);

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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIFHEADER_CREATIONTIME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='CREATION-TIME' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCREATIONTIME();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIFHEADER#getCREATIONTIME <em>CREATIONTIME</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIFHEADER_IDENTIFIER()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIFHEADER#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIFHEADER_SOURCETOOLID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='SOURCE-TOOL-ID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSOURCETOOLID();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIFHEADER#getSOURCETOOLID <em>SOURCETOOLID</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getRIFHEADER_TITLE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='TITLE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTITLE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.RIFHEADER#getTITLE <em>TITLE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TITLE</em>' attribute.
	 * @see #getTITLE()
	 * @generated
	 */
	void setTITLE(String value);

} // RIFHEADER
