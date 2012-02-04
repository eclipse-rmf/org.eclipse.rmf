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
 * A representation of the model object '<em><b>Attribute Definition Xhtml</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeDefinitionXhtml#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeDefinitionXhtml#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAttributeDefinitionXhtml()
 * @model
 * @generated
 */
public interface AttributeDefinitionXhtml extends AttributeDefinition {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(DatatypeDefinitionXhtml)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAttributeDefinitionXhtml_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	DatatypeDefinitionXhtml getType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionXhtml#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(DatatypeDefinitionXhtml value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.AttributeValueXhtml#getOwningDefinition <em>Owning Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' containment reference.
	 * @see #setDefaultValue(AttributeValueXhtml)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAttributeDefinitionXhtml_DefaultValue()
	 * @see org.eclipse.rmf.reqif10.AttributeValueXhtml#getOwningDefinition
	 * @model opposite="owningDefinition" containment="true" ordered="false"
	 * @generated
	 */
	AttributeValueXhtml getDefaultValue();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeDefinitionXhtml#getDefaultValue <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' containment reference.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(AttributeValueXhtml value);

} // AttributeDefinitionXhtml
