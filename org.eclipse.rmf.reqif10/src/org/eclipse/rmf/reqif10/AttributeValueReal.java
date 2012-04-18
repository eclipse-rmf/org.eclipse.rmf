/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Real</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeValueReal#getTheValue <em>The Value</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeValueReal#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeValueReal()
 * @model extendedMetaData="name='ATTRIBUTE-VALUE-REAL' kind='elementOnly'"
 * @generated
 */
public interface AttributeValueReal extends AttributeValueSimple {
	/**
	 * Returns the value of the '<em><b>The Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Value</em>' attribute.
	 * @see #isSetTheValue()
	 * @see #unsetTheValue()
	 * @see #setTheValue(double)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeValueReal_TheValue()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='THE-VALUE' kind='attribute'"
	 * @generated
	 */
	double getTheValue();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueReal#getTheValue <em>The Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Value</em>' attribute.
	 * @see #isSetTheValue()
	 * @see #unsetTheValue()
	 * @see #getTheValue()
	 * @generated
	 */
	void setTheValue(double value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueReal#getTheValue <em>The Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTheValue()
	 * @see #getTheValue()
	 * @see #setTheValue(double)
	 * @generated
	 */
	void unsetTheValue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueReal#getTheValue <em>The Value</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>The Value</em>' attribute is set.
	 * @see #unsetTheValue()
	 * @see #getTheValue()
	 * @see #setTheValue(double)
	 * @generated
	 */
	boolean isSetTheValue();

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #isSetDefinition()
	 * @see #unsetDefinition()
	 * @see #setDefinition(AttributeDefinitionReal)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeValueReal_Definition()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='DEFINITION' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeDefinitionReal getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueReal#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #isSetDefinition()
	 * @see #unsetDefinition()
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(AttributeDefinitionReal value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueReal#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefinition()
	 * @see #getDefinition()
	 * @see #setDefinition(AttributeDefinitionReal)
	 * @generated
	 */
	void unsetDefinition();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueReal#getDefinition <em>Definition</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Definition</em>' reference is set.
	 * @see #unsetDefinition()
	 * @see #getDefinition()
	 * @see #setDefinition(AttributeDefinitionReal)
	 * @generated
	 */
	boolean isSetDefinition();

} // AttributeValueReal
