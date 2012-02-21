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
 * A representation of the model object '<em><b>Datatype Definition Xml Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a complex data type that is based on an XML-Schema.
 * 
 * It contains the reference to the XML-Schema on which the complex data is based.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionXmlData#getNameSpaceURI <em>Name Space URI</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionXmlData#getSchemaLocation <em>Schema Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionXmlData()
 * @model
 * @generated
 */
public interface DatatypeDefinitionXmlData extends DatatypeDefinitionComplex {
	/**
	 * Returns the value of the '<em><b>Name Space URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Space URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Space URI</em>' attribute.
	 * @see #setNameSpaceURI(String)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionXmlData_NameSpaceURI()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.String" required="true" ordered="false"
	 * @generated
	 */
	String getNameSpaceURI();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionXmlData#getNameSpaceURI <em>Name Space URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Space URI</em>' attribute.
	 * @see #getNameSpaceURI()
	 * @generated
	 */
	void setNameSpaceURI(String value);

	/**
	 * Returns the value of the '<em><b>Schema Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schema Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schema Location</em>' attribute.
	 * @see #setSchemaLocation(String)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionXmlData_SchemaLocation()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.String" required="true" ordered="false"
	 * @generated
	 */
	String getSchemaLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionXmlData#getSchemaLocation <em>Schema Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Schema Location</em>' attribute.
	 * @see #getSchemaLocation()
	 * @generated
	 */
	void setSchemaLocation(String value);

} // DatatypeDefinitionXmlData
