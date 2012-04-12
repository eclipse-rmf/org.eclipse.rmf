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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Definition Complex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionComplex#getEmbedded <em>Embedded</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionComplex()
 * @model abstract="true"
 * @generated
 */
public interface DatatypeDefinitionComplex extends DatatypeDefinition {
	/**
	 * Returns the value of the '<em><b>Embedded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Embedded</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Embedded</em>' attribute.
	 * @see #setEmbedded(Boolean)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionComplex_Embedded()
	 * @model dataType="org.eclipse.rmf.rif12.DataTypes.boolean" required="true" ordered="false"
	 * @generated
	 */
	Boolean getEmbedded();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionComplex#getEmbedded <em>Embedded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Embedded</em>' attribute.
	 * @see #getEmbedded()
	 * @generated
	 */
	void setEmbedded(Boolean value);

} // DatatypeDefinitionComplex
