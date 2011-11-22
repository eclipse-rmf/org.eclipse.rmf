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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alternative Id</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.AlternativeId#getIdentifier <em>Identifier</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.AlternativeId#getIdent <em>Ident</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAlternativeId()
 * @model
 * @generated
 */
public interface AlternativeId extends EObject {
	/**
	 * Returns the value of the '<em><b>Identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identifier</em>' attribute.
	 * @see #setIdentifier(Object)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAlternativeId_Identifier()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getIdentifier();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AlternativeId#getIdentifier <em>Identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identifier</em>' attribute.
	 * @see #getIdentifier()
	 * @generated
	 */
	void setIdentifier(Object value);

	/**
	 * Returns the value of the '<em><b>Ident</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.Identifiable#getAlternativeId <em>Alternative Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ident</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ident</em>' container reference.
	 * @see #setIdent(Identifiable)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAlternativeId_Ident()
	 * @see org.eclipse.rmf.reqif10.Identifiable#getAlternativeId
	 * @model opposite="alternativeId" required="true" transient="false" ordered="false"
	 * @generated
	 */
	Identifiable getIdent();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AlternativeId#getIdent <em>Ident</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ident</em>' container reference.
	 * @see #getIdent()
	 * @generated
	 */
	void setIdent(Identifiable value);

} // AlternativeId
