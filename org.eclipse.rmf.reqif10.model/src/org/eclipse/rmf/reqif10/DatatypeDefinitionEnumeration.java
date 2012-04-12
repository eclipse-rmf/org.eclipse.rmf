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

package org.eclipse.rmf.reqif10;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Datatype Definition Enumeration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration#getSpecifiedValues <em>Specified Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getDatatypeDefinitionEnumeration()
 * @model
 * @generated
 */
public interface DatatypeDefinitionEnumeration extends DatatypeDefinition {
	/**
	 * Returns the value of the '<em><b>Specified Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.EnumValue}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.EnumValue#get_ <em></em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specified Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specified Values</em>' containment reference list.
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getDatatypeDefinitionEnumeration_SpecifiedValues()
	 * @see org.eclipse.rmf.reqif10.EnumValue#get_
	 * @model opposite="_" containment="true"
	 * @generated
	 */
	EList<EnumValue> getSpecifiedValues();

} // DatatypeDefinitionEnumeration
