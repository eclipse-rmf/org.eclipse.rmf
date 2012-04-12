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

package org.eclipse.rmf.rif11.ExchangeFile;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value File Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reference to the complex data that is stored in an external file.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueFileReference#getPathToFile <em>Path To File</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueFileReference#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAttributeValueFileReference()
 * @model
 * @generated
 */
public interface AttributeValueFileReference extends AttributeValueComplex {
	/**
	 * Returns the value of the '<em><b>Path To File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path To File</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path To File</em>' attribute.
	 * @see #setPathToFile(String)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAttributeValueFileReference_PathToFile()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.String" required="true" ordered="false"
	 * @generated
	 */
	String getPathToFile();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueFileReference#getPathToFile <em>Path To File</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path To File</em>' attribute.
	 * @see #getPathToFile()
	 * @generated
	 */
	void setPathToFile(String value);

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
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getAttributeValueFileReference_Definition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AttributeDefinitionComplex getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.AttributeValueFileReference#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(AttributeDefinitionComplex value);

} // AttributeValueFileReference
