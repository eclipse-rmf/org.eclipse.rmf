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
 * A representation of the model object '<em><b>Attribute Value XHTML</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeValueXHTML#isSimplified <em>Simplified</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeValueXHTML#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeValueXHTML#getTheOriginalValue <em>The Original Value</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeValueXHTML#getTheValue <em>The Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeValueXHTML()
 * @model extendedMetaData="name='ATTRIBUTE-VALUE-XHTML' kind='elementOnly'"
 * @generated
 */
public interface AttributeValueXHTML extends AttributeValue {
	/**
	 * Returns the value of the '<em><b>Simplified</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simplified</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simplified</em>' attribute.
	 * @see #isSetSimplified()
	 * @see #unsetSimplified()
	 * @see #setSimplified(boolean)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeValueXHTML_Simplified()
	 * @model unsettable="true" ordered="false"
	 *        extendedMetaData="name='IS-SIMPLIFIED' kind='attribute'"
	 * @generated
	 */
	boolean isSimplified();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueXHTML#isSimplified <em>Simplified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simplified</em>' attribute.
	 * @see #isSetSimplified()
	 * @see #unsetSimplified()
	 * @see #isSimplified()
	 * @generated
	 */
	void setSimplified(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueXHTML#isSimplified <em>Simplified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSimplified()
	 * @see #isSimplified()
	 * @see #setSimplified(boolean)
	 * @generated
	 */
	void unsetSimplified();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueXHTML#isSimplified <em>Simplified</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Simplified</em>' attribute is set.
	 * @see #unsetSimplified()
	 * @see #isSimplified()
	 * @see #setSimplified(boolean)
	 * @generated
	 */
	boolean isSetSimplified();

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
	 * @see #setDefinition(AttributeDefinitionXHTML)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeValueXHTML_Definition()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='DEFINITION' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeDefinitionXHTML getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueXHTML#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #isSetDefinition()
	 * @see #unsetDefinition()
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(AttributeDefinitionXHTML value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueXHTML#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDefinition()
	 * @see #getDefinition()
	 * @see #setDefinition(AttributeDefinitionXHTML)
	 * @generated
	 */
	void unsetDefinition();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueXHTML#getDefinition <em>Definition</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Definition</em>' reference is set.
	 * @see #unsetDefinition()
	 * @see #getDefinition()
	 * @see #setDefinition(AttributeDefinitionXHTML)
	 * @generated
	 */
	boolean isSetDefinition();

	/**
	 * Returns the value of the '<em><b>The Original Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Original Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Original Value</em>' containment reference.
	 * @see #isSetTheOriginalValue()
	 * @see #unsetTheOriginalValue()
	 * @see #setTheOriginalValue(XhtmlContent)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeValueXHTML_TheOriginalValue()
	 * @model containment="true" unsettable="true" ordered="false"
	 *        extendedMetaData="name='THE-ORIGINAL-VALUE' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	XhtmlContent getTheOriginalValue();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueXHTML#getTheOriginalValue <em>The Original Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Original Value</em>' containment reference.
	 * @see #isSetTheOriginalValue()
	 * @see #unsetTheOriginalValue()
	 * @see #getTheOriginalValue()
	 * @generated
	 */
	void setTheOriginalValue(XhtmlContent value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueXHTML#getTheOriginalValue <em>The Original Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTheOriginalValue()
	 * @see #getTheOriginalValue()
	 * @see #setTheOriginalValue(XhtmlContent)
	 * @generated
	 */
	void unsetTheOriginalValue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueXHTML#getTheOriginalValue <em>The Original Value</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>The Original Value</em>' containment reference is set.
	 * @see #unsetTheOriginalValue()
	 * @see #getTheOriginalValue()
	 * @see #setTheOriginalValue(XhtmlContent)
	 * @generated
	 */
	boolean isSetTheOriginalValue();

	/**
	 * Returns the value of the '<em><b>The Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>The Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>The Value</em>' containment reference.
	 * @see #isSetTheValue()
	 * @see #unsetTheValue()
	 * @see #setTheValue(XhtmlContent)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getAttributeValueXHTML_TheValue()
	 * @model containment="true" unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='THE-VALUE' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	XhtmlContent getTheValue();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueXHTML#getTheValue <em>The Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>The Value</em>' containment reference.
	 * @see #isSetTheValue()
	 * @see #unsetTheValue()
	 * @see #getTheValue()
	 * @generated
	 */
	void setTheValue(XhtmlContent value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueXHTML#getTheValue <em>The Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTheValue()
	 * @see #getTheValue()
	 * @see #setTheValue(XhtmlContent)
	 * @generated
	 */
	void unsetTheValue();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.AttributeValueXHTML#getTheValue <em>The Value</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>The Value</em>' containment reference is set.
	 * @see #unsetTheValue()
	 * @see #getTheValue()
	 * @see #setTheValue(XhtmlContent)
	 * @generated
	 */
	boolean isSetTheValue();

} // AttributeValueXHTML
