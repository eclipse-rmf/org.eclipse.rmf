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
 * A representation of the model object '<em><b>Spec Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.SpecType#getCoreContent <em>Core Content</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.SpecType#getSpecAttributes <em>Spec Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecType()
 * @model abstract="true"
 * @generated
 */
public interface SpecType extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Core Content</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.ReqIfContent#getSpecTypes <em>Spec Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Content</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Content</em>' container reference.
	 * @see #setCoreContent(ReqIfContent)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecType_CoreContent()
	 * @see org.eclipse.rmf.reqif10.ReqIfContent#getSpecTypes
	 * @model opposite="specTypes" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ReqIfContent getCoreContent();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.SpecType#getCoreContent <em>Core Content</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Content</em>' container reference.
	 * @see #getCoreContent()
	 * @generated
	 */
	void setCoreContent(ReqIfContent value);

	/**
	 * Returns the value of the '<em><b>Spec Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.AttributeDefinition}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.AttributeDefinition#getSpecType <em>Spec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Attributes</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecType_SpecAttributes()
	 * @see org.eclipse.rmf.reqif10.AttributeDefinition#getSpecType
	 * @model opposite="specType" containment="true" ordered="false"
	 * @generated
	 */
	EList<AttributeDefinition> getSpecAttributes();

} // SpecType
