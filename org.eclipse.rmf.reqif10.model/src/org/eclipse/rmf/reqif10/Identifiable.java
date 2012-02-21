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

package org.eclipse.rmf.reqif10;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Identifiable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.Identifiable#getDesc <em>Desc</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.Identifiable#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.Identifiable#getLastChange <em>Last Change</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.Identifiable#getLongName <em>Long Name</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.Identifiable#getAlternativeId <em>Alternative Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getIdentifiable()
 * @model abstract="true"
 * @generated
 */
public interface Identifiable extends EObject {
	/**
	 * Returns the value of the '<em><b>Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Desc</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Desc</em>' attribute.
	 * @see #setDesc(String)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getIdentifiable_Desc()
	 * @model ordered="false"
	 * @generated
	 */
	String getDesc();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.Identifiable#getDesc <em>Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Desc</em>' attribute.
	 * @see #getDesc()
	 * @generated
	 */
	void setDesc(String value);

	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(String)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getIdentifiable_Identifier()
	 * @model id="true" dataType="org.eclipse.rmf.reqif10.datatypes.Id" required="true" ordered="false"
	 * @generated
	 */
	String getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.Identifiable#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(String value);

	/**
	 * Returns the value of the '<em><b>Last Change</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Change</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Change</em>' attribute.
	 * @see #setLastChange(XMLGregorianCalendar)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getIdentifiable_LastChange()
	 * @model dataType="org.eclipse.rmf.reqif10.datatypes.DateTime" required="true" ordered="false"
	 * @generated
	 */
	XMLGregorianCalendar getLastChange();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.Identifiable#getLastChange <em>Last Change</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Change</em>' attribute.
	 * @see #getLastChange()
	 * @generated
	 */
	void setLastChange(XMLGregorianCalendar value);

	/**
	 * Returns the value of the '<em><b>Long Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Name</em>' attribute.
	 * @see #setLongName(String)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getIdentifiable_LongName()
	 * @model ordered="false"
	 * @generated
	 */
	String getLongName();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.Identifiable#getLongName <em>Long Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Name</em>' attribute.
	 * @see #getLongName()
	 * @generated
	 */
	void setLongName(String value);

	/**
	 * Returns the value of the '<em><b>Alternative Id</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.AlternativeId#getIdent <em>Ident</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternative Id</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternative Id</em>' containment reference.
	 * @see #setAlternativeId(AlternativeId)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getIdentifiable_AlternativeId()
	 * @see org.eclipse.rmf.reqif10.AlternativeId#getIdent
	 * @model opposite="ident" containment="true" ordered="false"
	 * @generated
	 */
	AlternativeId getAlternativeId();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.Identifiable#getAlternativeId <em>Alternative Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alternative Id</em>' containment reference.
	 * @see #getAlternativeId()
	 * @generated
	 */
	void setAlternativeId(AlternativeId value);

} // Identifiable
