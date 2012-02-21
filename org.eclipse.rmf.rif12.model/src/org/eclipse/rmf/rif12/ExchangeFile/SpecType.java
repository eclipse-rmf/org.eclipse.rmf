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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Name des SpecTypes.
 * Attribut-Definitionen hinzuf�gen oder l�schen.
 * Vererbt an die AttributeDefinitions.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.SpecType#getSpecAttributes <em>Spec Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getSpecType()
 * @model
 * @generated
 */
public interface SpecType extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Spec Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.ExchangeFile.AttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Attributes</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getSpecType_SpecAttributes()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<AttributeDefinition> getSpecAttributes();

} // SpecType
