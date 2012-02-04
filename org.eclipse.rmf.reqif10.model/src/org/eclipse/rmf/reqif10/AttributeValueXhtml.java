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

import org.eclipse.rmf.reqif10.datatypes.XhtmlContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Xhtml</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeValueXhtml#getIsSimplified <em>Is Simplified</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeValueXhtml#getOwningDefinition <em>Owning Definition</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeValueXhtml#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeValueXhtml#getTheOriginalValue <em>The Original Value</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeValueXhtml#getTheValue <em>The Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAttributeValueXhtml()
 * @model
 * @generated
 */
public interface AttributeValueXhtml extends AttributeValue {
	/**
	 * Returns the value of the '<em><b>Is Simplified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Simplified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Simplified</em>' attribute.
	 * @see #setIsSimplified(Object)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAttributeValueXhtml_IsSimplified()
	 * @model ordered="false"
	 * @generated
	 */
	Object getIsSimplified();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueXhtml#getIsSimplified <em>Is Simplified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Simplified</em>' attribute.
	 * @see #getIsSimplified()
	 * @generated
	 */
	void setIsSimplified(Object value);

	/**
	 * Returns the value of the '<em><b>Owning Definition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.AttributeDefinitionXhtml#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Definition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Definition</em>' container reference.
	 * @see #setOwningDefinition(AttributeDefinitionXhtml)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAttributeValueXhtml_OwningDefinition()
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionXhtml#getDefaultValue
	 * @model opposite="defaultValue" required="true" transient="false" ordered="false"
	 * @generated
	 */
	AttributeDefinitionXhtml getOwningDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueXhtml#getOwningDefinition <em>Owning Definition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Definition</em>' container reference.
	 * @see #getOwningDefinition()
	 * @generated
	 */
	void setOwningDefinition(AttributeDefinitionXhtml value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(AttributeDefinitionXhtml)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAttributeValueXhtml_Definition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AttributeDefinitionXhtml getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueXhtml#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(AttributeDefinitionXhtml value);

	/**
	 * Returns the value of the '<em><b>The Original Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Original Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Original Value</em>' containment reference.
	 * @see #setTheOriginalValue(XhtmlContent)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAttributeValueXhtml_TheOriginalValue()
	 * @model containment="true" volatile="true" ordered="false"
	 * @generated
	 */
	XhtmlContent getTheOriginalValue();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueXhtml#getTheOriginalValue <em>The Original Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Original Value</em>' containment reference.
	 * @see #getTheOriginalValue()
	 * @generated
	 */
	void setTheOriginalValue(XhtmlContent value);

	/**
	 * Returns the value of the '<em><b>The Value</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.datatypes.XhtmlContent#getAttributeValue <em>Attribute Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Value</em>' containment reference.
	 * @see #setTheValue(XhtmlContent)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAttributeValueXhtml_TheValue()
	 * @see org.eclipse.rmf.reqif10.datatypes.XhtmlContent#getAttributeValue
	 * @model opposite="attributeValue" containment="true" required="true" ordered="false"
	 * @generated
	 */
	XhtmlContent getTheValue();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueXhtml#getTheValue <em>The Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Value</em>' containment reference.
	 * @see #getTheValue()
	 * @generated
	 */
	void setTheValue(XhtmlContent value);

} // AttributeValueXhtml
