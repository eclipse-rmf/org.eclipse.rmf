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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeDefinition#getSpecType <em>Spec Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAttributeDefinition()
 * @model abstract="true"
 * @generated
 */
public interface AttributeDefinition extends AccessControlledElement {
	/**
	 * Returns the value of the '<em><b>Spec Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.SpecType#getSpecAttributes <em>Spec Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Type</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Type</em>' container reference.
	 * @see #setSpecType(SpecType)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAttributeDefinition_SpecType()
	 * @see org.eclipse.rmf.reqif10.SpecType#getSpecAttributes
	 * @model opposite="specAttributes" required="true" transient="false" ordered="false"
	 * @generated
	 */
	SpecType getSpecType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinition#getSpecType <em>Spec Type</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec Type</em>' container reference.
	 * @see #getSpecType()
	 * @generated
	 */
	void setSpecType(SpecType value);

} // AttributeDefinition
