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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Specification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.Specification#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.Specification#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.Specification#getCoreContent <em>Core Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecification()
 * @model
 * @generated
 */
public interface Specification extends SpecElementWithAttributes {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(SpecificationType)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecification_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SpecificationType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.Specification#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SpecificationType value);

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.SpecHierarchy}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.SpecHierarchy#getRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecification_Children()
	 * @see org.eclipse.rmf.reqif10.SpecHierarchy#getRoot
	 * @model opposite="root" containment="true"
	 * @generated
	 */
	EList<SpecHierarchy> getChildren();

	/**
	 * Returns the value of the '<em><b>Core Content</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.ReqIfContent#getSpecifications <em>Specifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Content</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Content</em>' container reference.
	 * @see #setCoreContent(ReqIfContent)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecification_CoreContent()
	 * @see org.eclipse.rmf.reqif10.ReqIfContent#getSpecifications
	 * @model opposite="specifications" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ReqIfContent getCoreContent();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.Specification#getCoreContent <em>Core Content</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Content</em>' container reference.
	 * @see #getCoreContent()
	 * @generated
	 */
	void setCoreContent(ReqIfContent value);

} // Specification
