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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>REQIFHEADER</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getCOMMENT <em>COMMENT</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getCREATIONTIME <em>CREATIONTIME</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getREPOSITORYID <em>REPOSITORYID</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getREQIFTOOLID <em>REQIFTOOLID</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getREQIFVERSION <em>REQIFVERSION</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getSOURCETOOLID <em>SOURCETOOLID</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getTITLE <em>TITLE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getREQIFHEADER()
 * @model extendedMetaData="name='REQ-IF-HEADER' kind='elementOnly'"
 * @generated
 */
public interface REQIFHEADER extends EObject {
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
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getREQIFHEADER_COMMENT()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='COMMENT' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCOMMENT();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getCOMMENT <em>COMMENT</em>}' attribute.
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
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getREQIFHEADER_CREATIONTIME()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.DateTime" required="true"
	 *        extendedMetaData="kind='element' name='CREATION-TIME' namespace='##targetNamespace'"
	 * @generated
	 */
	XMLGregorianCalendar getCREATIONTIME();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getCREATIONTIME <em>CREATIONTIME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CREATIONTIME</em>' attribute.
	 * @see #getCREATIONTIME()
	 * @generated
	 */
	void setCREATIONTIME(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>REPOSITORYID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>REPOSITORYID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>REPOSITORYID</em>' attribute.
	 * @see #setREPOSITORYID(String)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getREQIFHEADER_REPOSITORYID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='REPOSITORY-ID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getREPOSITORYID();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getREPOSITORYID <em>REPOSITORYID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>REPOSITORYID</em>' attribute.
	 * @see #getREPOSITORYID()
	 * @generated
	 */
	void setREPOSITORYID(String value);

	/**
	 * Returns the value of the '<em><b>REQIFTOOLID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>REQIFTOOLID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>REQIFTOOLID</em>' attribute.
	 * @see #setREQIFTOOLID(String)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getREQIFHEADER_REQIFTOOLID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='REQ-IF-TOOL-ID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getREQIFTOOLID();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getREQIFTOOLID <em>REQIFTOOLID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>REQIFTOOLID</em>' attribute.
	 * @see #getREQIFTOOLID()
	 * @generated
	 */
	void setREQIFTOOLID(String value);

	/**
	 * Returns the value of the '<em><b>REQIFVERSION</b></em>' attribute.
	 * The default value is <code>"1.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>REQIFVERSION</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>REQIFVERSION</em>' attribute.
	 * @see #isSetREQIFVERSION()
	 * @see #unsetREQIFVERSION()
	 * @see #setREQIFVERSION(String)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getREQIFHEADER_REQIFVERSION()
	 * @model default="1.0" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='REQ-IF-VERSION' namespace='##targetNamespace'"
	 * @generated
	 */
	String getREQIFVERSION();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getREQIFVERSION <em>REQIFVERSION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>REQIFVERSION</em>' attribute.
	 * @see #isSetREQIFVERSION()
	 * @see #unsetREQIFVERSION()
	 * @see #getREQIFVERSION()
	 * @generated
	 */
	void setREQIFVERSION(String value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getREQIFVERSION <em>REQIFVERSION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetREQIFVERSION()
	 * @see #getREQIFVERSION()
	 * @see #setREQIFVERSION(String)
	 * @generated
	 */
	void unsetREQIFVERSION();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getREQIFVERSION <em>REQIFVERSION</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>REQIFVERSION</em>' attribute is set.
	 * @see #unsetREQIFVERSION()
	 * @see #getREQIFVERSION()
	 * @see #setREQIFVERSION(String)
	 * @generated
	 */
	boolean isSetREQIFVERSION();

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
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getREQIFHEADER_SOURCETOOLID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='SOURCE-TOOL-ID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSOURCETOOLID();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getSOURCETOOLID <em>SOURCETOOLID</em>}' attribute.
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
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getREQIFHEADER_TITLE()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='TITLE' namespace='##targetNamespace'"
	 * @generated
	 */
	String getTITLE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getTITLE <em>TITLE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TITLE</em>' attribute.
	 * @see #getTITLE()
	 * @generated
	 */
	void setTITLE(String value);

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
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getREQIFHEADER_IDENTIFIER()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID" required="true"
	 *        extendedMetaData="kind='attribute' name='IDENTIFIER'"
	 * @generated
	 */
	String getIDENTIFIER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER#getIDENTIFIER <em>IDENTIFIER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDENTIFIER</em>' attribute.
	 * @see #getIDENTIFIER()
	 * @generated
	 */
	void setIDENTIFIER(String value);

} // REQIFHEADER
