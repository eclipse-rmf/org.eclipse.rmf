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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RIF</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RIF#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RIF#getCoreContent <em>Core Content</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RIF#getToolExtensions <em>Tool Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIF()
 * @model
 * @generated
 */
public interface RIF extends EObject {
	/**
	 * Returns the value of the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header</em>' containment reference.
	 * @see #setHeader(RIFHeader)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIF_Header()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RIFHeader getHeader();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.RIF#getHeader <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header</em>' containment reference.
	 * @see #getHeader()
	 * @generated
	 */
	void setHeader(RIFHeader value);

	/**
	 * Returns the value of the '<em><b>Core Content</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Content</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Content</em>' containment reference.
	 * @see #setCoreContent(RIFContent)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIF_CoreContent()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RIFContent getCoreContent();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.RIF#getCoreContent <em>Core Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Content</em>' containment reference.
	 * @see #getCoreContent()
	 * @generated
	 */
	void setCoreContent(RIFContent value);

	/**
	 * Returns the value of the '<em><b>Tool Extensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tool Extensions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tool Extensions</em>' containment reference.
	 * @see #setToolExtensions(RIFToolExtension)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRIF_ToolExtensions()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	RIFToolExtension getToolExtensions();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.RIF#getToolExtensions <em>Tool Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Extensions</em>' containment reference.
	 * @see #getToolExtensions()
	 * @generated
	 */
	void setToolExtensions(RIFToolExtension value);

} // RIF
