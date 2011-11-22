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

package org.eclipse.rmf.reqif10.datatypes;

import org.eclipse.rmf.reqif10.AttributeValueXhtml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xhtml Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.datatypes.XhtmlContent#getAttributeValue <em>Attribute Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.datatypes.DatatypesPackage#getXhtmlContent()
 * @model
 * @generated
 */
public interface XhtmlContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Value</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.AttributeValueXhtml#getTheValue <em>The Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Value</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Value</em>' container reference.
	 * @see #setAttributeValue(AttributeValueXhtml)
	 * @see org.eclipse.rmf.reqif10.datatypes.DatatypesPackage#getXhtmlContent_AttributeValue()
	 * @see org.eclipse.rmf.reqif10.AttributeValueXhtml#getTheValue
	 * @model opposite="theValue" transient="false" ordered="false"
	 * @generated
	 */
	AttributeValueXhtml getAttributeValue();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.datatypes.XhtmlContent#getAttributeValue <em>Attribute Value</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Value</em>' container reference.
	 * @see #getAttributeValue()
	 * @generated
	 */
	void setAttributeValue(AttributeValueXhtml value);

} // XhtmlContent
