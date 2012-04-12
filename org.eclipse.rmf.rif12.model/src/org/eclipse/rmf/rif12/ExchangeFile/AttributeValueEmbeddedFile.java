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

package org.eclipse.rmf.rif12.ExchangeFile;

import org.eclipse.rmf.rif12.DataTypes.BinaryContent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value Embedded File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.AttributeValueEmbeddedFile#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.AttributeValueEmbeddedFile#getBinaryContent <em>Binary Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getAttributeValueEmbeddedFile()
 * @model
 * @generated
 */
public interface AttributeValueEmbeddedFile extends AttributeValueComplex {
	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(AttributeDefinitionComplex)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getAttributeValueEmbeddedFile_Definition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AttributeDefinitionComplex getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.AttributeValueEmbeddedFile#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(AttributeDefinitionComplex value);

	/**
	 * Returns the value of the '<em><b>Binary Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Binary Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Binary Content</em>' containment reference.
	 * @see #setBinaryContent(BinaryContent)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getAttributeValueEmbeddedFile_BinaryContent()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	BinaryContent getBinaryContent();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.AttributeValueEmbeddedFile#getBinaryContent <em>Binary Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Binary Content</em>' containment reference.
	 * @see #getBinaryContent()
	 * @generated
	 */
	void setBinaryContent(BinaryContent value);

} // AttributeValueEmbeddedFile
