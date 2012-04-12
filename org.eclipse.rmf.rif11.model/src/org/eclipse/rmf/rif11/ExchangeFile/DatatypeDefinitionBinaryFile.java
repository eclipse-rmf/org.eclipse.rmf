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
 * A representation of the model object '<em><b>Datatype Definition Binary File</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Defines a complex data type that is based on generic binary data.
 * 
 * It contains further information on the file format, the associated application etc.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile#getApplication <em>Application</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile#getFilenameSuffix <em>Filename Suffix</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile#getFormatName <em>Format Name</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile#getMimeType <em>Mime Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionBinaryFile()
 * @model
 * @generated
 */
public interface DatatypeDefinitionBinaryFile extends DatatypeDefinitionComplex {
	/**
	 * Returns the value of the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' attribute.
	 * @see #setApplication(String)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionBinaryFile_Application()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.String" required="true" ordered="false"
	 * @generated
	 */
	String getApplication();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' attribute.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(String value);

	/**
	 * Returns the value of the '<em><b>Filename Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename Suffix</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename Suffix</em>' attribute.
	 * @see #setFilenameSuffix(String)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionBinaryFile_FilenameSuffix()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.String" required="true" ordered="false"
	 * @generated
	 */
	String getFilenameSuffix();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile#getFilenameSuffix <em>Filename Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Filename Suffix</em>' attribute.
	 * @see #getFilenameSuffix()
	 * @generated
	 */
	void setFilenameSuffix(String value);

	/**
	 * Returns the value of the '<em><b>Format Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format Name</em>' attribute.
	 * @see #setFormatName(String)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionBinaryFile_FormatName()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.String" required="true" ordered="false"
	 * @generated
	 */
	String getFormatName();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile#getFormatName <em>Format Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format Name</em>' attribute.
	 * @see #getFormatName()
	 * @generated
	 */
	void setFormatName(String value);

	/**
	 * Returns the value of the '<em><b>Mime Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mime Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mime Type</em>' attribute.
	 * @see #setMimeType(String)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionBinaryFile_MimeType()
	 * @model dataType="org.eclipse.rmf.rif11.EA_AUTOSARM2_Types_Package.String" required="true" ordered="false"
	 * @generated
	 */
	String getMimeType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionBinaryFile#getMimeType <em>Mime Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mime Type</em>' attribute.
	 * @see #getMimeType()
	 * @generated
	 */
	void setMimeType(String value);

} // DatatypeDefinitionBinaryFile
