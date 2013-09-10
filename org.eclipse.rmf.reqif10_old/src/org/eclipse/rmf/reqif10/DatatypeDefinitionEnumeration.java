/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
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
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getDatatypeDefinitionEnumeration()
 * @model extendedMetaData="name='DATATYPE-DEFINITION-ENUMERATION' kind='elementOnly'"
 * @generated
 */
public interface DatatypeDefinitionEnumeration extends DatatypeDefinition {
	/**
	 * Returns the value of the '<em><b>Specified Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.EnumValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specified Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specified Values</em>' containment reference list.
	 * @see #isSetSpecifiedValues()
	 * @see #unsetSpecifiedValues()
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getDatatypeDefinitionEnumeration_SpecifiedValues()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="name='SPECIFIED-VALUES' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EnumValue> getSpecifiedValues();

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration#getSpecifiedValues <em>Specified Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecifiedValues()
	 * @see #getSpecifiedValues()
	 * @generated
	 */
	void unsetSpecifiedValues();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration#getSpecifiedValues <em>Specified Values</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Specified Values</em>' containment reference list is set.
	 * @see #unsetSpecifiedValues()
	 * @see #getSpecifiedValues()
	 * @generated
	 */
	boolean isSetSpecifiedValues();

} // DatatypeDefinitionEnumeration
