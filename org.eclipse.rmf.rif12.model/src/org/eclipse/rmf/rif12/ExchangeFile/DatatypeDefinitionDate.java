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

import org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.DatatypeDefinitionDateFormatEnum;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Definition Date</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionDate#getFormat <em>Format</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionDate()
 * @model
 * @generated
 */
public interface DatatypeDefinitionDate extends DatatypeDefinitionSimple {

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.DatatypeDefinitionDateFormatEnum}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.DatatypeDefinitionDateFormatEnum
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #setFormat(DatatypeDefinitionDateFormatEnum)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getDatatypeDefinitionDate_Format()
	 * @model unsettable="true" required="true"
	 * @generated
	 */
	DatatypeDefinitionDateFormatEnum getFormat();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionDate#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see org.eclipse.rmf.rif12.EA_AUTOSARM2_Types_Package.DatatypeDefinitionDateFormatEnum
	 * @see #isSetFormat()
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(DatatypeDefinitionDateFormatEnum value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionDate#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetFormat()
	 * @see #getFormat()
	 * @see #setFormat(DatatypeDefinitionDateFormatEnum)
	 * @generated
	 */
	void unsetFormat();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.DatatypeDefinitionDate#getFormat <em>Format</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Format</em>' attribute is set.
	 * @see #unsetFormat()
	 * @see #getFormat()
	 * @see #setFormat(DatatypeDefinitionDateFormatEnum)
	 * @generated
	 */
	boolean isSetFormat();
} // DatatypeDefinitionDate
