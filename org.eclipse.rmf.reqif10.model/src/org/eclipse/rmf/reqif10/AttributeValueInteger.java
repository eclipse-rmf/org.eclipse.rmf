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

import java.math.BigInteger;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Integer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeValueInteger#getTheValue <em>The Value</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeValueInteger#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeValueInteger#getOwningDefinition <em>Owning Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAttributeValueInteger()
 * @model
 * @generated
 */
public interface AttributeValueInteger extends AttributeValueSimple {
	/**
	 * Returns the value of the '<em><b>The Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Value</em>' attribute.
	 * @see #setTheValue(BigInteger)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAttributeValueInteger_TheValue()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	BigInteger getTheValue();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueInteger#getTheValue <em>The Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Value</em>' attribute.
	 * @see #getTheValue()
	 * @generated
	 */
	void setTheValue(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(AttributeDefinitionInteger)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAttributeValueInteger_Definition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AttributeDefinitionInteger getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueInteger#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(AttributeDefinitionInteger value);

	/**
	 * Returns the value of the '<em><b>Owning Definition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.AttributeDefinitionInteger#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owning Definition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owning Definition</em>' container reference.
	 * @see #setOwningDefinition(AttributeDefinitionInteger)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAttributeValueInteger_OwningDefinition()
	 * @see org.eclipse.rmf.reqif10.AttributeDefinitionInteger#getDefaultValue
	 * @model opposite="defaultValue" required="true" transient="false" ordered="false"
	 * @generated
	 */
	AttributeDefinitionInteger getOwningDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueInteger#getOwningDefinition <em>Owning Definition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owning Definition</em>' container reference.
	 * @see #getOwningDefinition()
	 * @generated
	 */
	void setOwningDefinition(AttributeDefinitionInteger value);

} // AttributeValueInteger
