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

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DATATYPEDEFINITIONREAL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Definition of the simple data type "Real".
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getACCURACY <em>ACCURACY</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getMAX <em>MAX</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getMIN <em>MIN</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDATATYPEDEFINITIONREAL()
 * @model extendedMetaData="name='DATATYPE-DEFINITION-REAL' kind='elementOnly'"
 * @generated
 */
public interface DATATYPEDEFINITIONREAL extends EObject {
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDATATYPEDEFINITIONREAL_DESC()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='DESC' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getDESC <em>DESC</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDATATYPEDEFINITIONREAL_IDENTIFIER()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='element' name='IDENTIFIER' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDATATYPEDEFINITIONREAL_LASTCHANGE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='LAST-CHANGE' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getLASTCHANGE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
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
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDATATYPEDEFINITIONREAL_LONGNAME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='LONG-NAME' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getLONGNAME <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LONGNAME</em>' attribute.
	 * @see #getLONGNAME()
	 * @generated
	 */
	void setLONGNAME(String value);

	/**
	 * Returns the value of the '<em><b>ACCURACY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ACCURACY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ACCURACY</em>' attribute.
	 * @see #setACCURACY(BigInteger)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDATATYPEDEFINITIONREAL_ACCURACY()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='ACCURACY' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getACCURACY();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getACCURACY <em>ACCURACY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ACCURACY</em>' attribute.
	 * @see #getACCURACY()
	 * @generated
	 */
	void setACCURACY(BigInteger value);

	/**
	 * Returns the value of the '<em><b>MAX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MAX</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MAX</em>' attribute.
	 * @see #isSetMAX()
	 * @see #unsetMAX()
	 * @see #setMAX(double)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDATATYPEDEFINITIONREAL_MAX()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='MAX' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMAX();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getMAX <em>MAX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MAX</em>' attribute.
	 * @see #isSetMAX()
	 * @see #unsetMAX()
	 * @see #getMAX()
	 * @generated
	 */
	void setMAX(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getMAX <em>MAX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMAX()
	 * @see #getMAX()
	 * @see #setMAX(double)
	 * @generated
	 */
	void unsetMAX();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getMAX <em>MAX</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>MAX</em>' attribute is set.
	 * @see #unsetMAX()
	 * @see #getMAX()
	 * @see #setMAX(double)
	 * @generated
	 */
	boolean isSetMAX();

	/**
	 * Returns the value of the '<em><b>MIN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>MIN</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>MIN</em>' attribute.
	 * @see #isSetMIN()
	 * @see #unsetMIN()
	 * @see #setMIN(double)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDATATYPEDEFINITIONREAL_MIN()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='element' name='MIN' namespace='##targetNamespace'"
	 * @generated
	 */
	double getMIN();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getMIN <em>MIN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MIN</em>' attribute.
	 * @see #isSetMIN()
	 * @see #unsetMIN()
	 * @see #getMIN()
	 * @generated
	 */
	void setMIN(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getMIN <em>MIN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMIN()
	 * @see #getMIN()
	 * @see #setMIN(double)
	 * @generated
	 */
	void unsetMIN();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONREAL#getMIN <em>MIN</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>MIN</em>' attribute is set.
	 * @see #unsetMIN()
	 * @see #getMIN()
	 * @see #setMIN(double)
	 * @generated
	 */
	boolean isSetMIN();

} // DATATYPEDEFINITIONREAL
