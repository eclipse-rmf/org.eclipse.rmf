/**
 * Copyright (c) 2013 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    itemis AG - initial API and implementation
 * 
 */
package org.eclipse.rmf.tests.serialization.env.emf.myreqif;

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DATATYPEDEFINITIONREAL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getALTERNATIVEID <em>ALTERNATIVEID</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getACCURACY <em>ACCURACY</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getMAX <em>MAX</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getMIN <em>MIN</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getDATATYPEDEFINITIONREAL()
 * @model extendedMetaData="name='DATATYPE-DEFINITION-REAL' kind='elementOnly'"
 * @generated
 */
public interface DATATYPEDEFINITIONREAL extends EObject {
	/**
	 * Returns the value of the '<em><b>ALTERNATIVEID</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ALTERNATIVEID</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ALTERNATIVEID</em>' containment reference.
	 * @see #setALTERNATIVEID(ALTERNATIVEIDType3)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getDATATYPEDEFINITIONREAL_ALTERNATIVEID()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ALTERNATIVE-ID' namespace='##targetNamespace'"
	 * @generated
	 */
	ALTERNATIVEIDType3 getALTERNATIVEID();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getALTERNATIVEID <em>ALTERNATIVEID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ALTERNATIVEID</em>' containment reference.
	 * @see #getALTERNATIVEID()
	 * @generated
	 */
	void setALTERNATIVEID(ALTERNATIVEIDType3 value);

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
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getDATATYPEDEFINITIONREAL_ACCURACY()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='ACCURACY'"
	 * @generated
	 */
	BigInteger getACCURACY();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getACCURACY <em>ACCURACY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ACCURACY</em>' attribute.
	 * @see #getACCURACY()
	 * @generated
	 */
	void setACCURACY(BigInteger value);

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
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getDATATYPEDEFINITIONREAL_DESC()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DESC'"
	 * @generated
	 */
	String getDESC();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getDESC <em>DESC</em>}' attribute.
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
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getDATATYPEDEFINITIONREAL_IDENTIFIER()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='IDENTIFIER'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
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
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getDATATYPEDEFINITIONREAL_LASTCHANGE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='attribute' name='LAST-CHANGE'"
	 * @generated
	 */
	XMLGregorianCalendar getLASTCHANGE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getLASTCHANGE <em>LASTCHANGE</em>}' attribute.
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
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getDATATYPEDEFINITIONREAL_LONGNAME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='LONG-NAME'"
	 * @generated
	 */
	String getLONGNAME();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getLONGNAME <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LONGNAME</em>' attribute.
	 * @see #getLONGNAME()
	 * @generated
	 */
	void setLONGNAME(String value);

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
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getDATATYPEDEFINITIONREAL_MAX()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='MAX'"
	 * @generated
	 */
	double getMAX();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getMAX <em>MAX</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getMAX <em>MAX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMAX()
	 * @see #getMAX()
	 * @see #setMAX(double)
	 * @generated
	 */
	void unsetMAX();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getMAX <em>MAX</em>}' attribute is set.
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
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getDATATYPEDEFINITIONREAL_MIN()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Double" required="true"
	 *        extendedMetaData="kind='attribute' name='MIN'"
	 * @generated
	 */
	double getMIN();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getMIN <em>MIN</em>}' attribute.
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
	 * Unsets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getMIN <em>MIN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMIN()
	 * @see #getMIN()
	 * @see #setMIN(double)
	 * @generated
	 */
	void unsetMIN();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPEDEFINITIONREAL#getMIN <em>MIN</em>}' attribute is set.
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
