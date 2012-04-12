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
 * A representation of the model object '<em><b>Spec Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.SpecType#getSpecAttributes <em>Spec Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getSpecType()
 * @model abstract="true"
 *        extendedMetaData="name='SPEC-TYPE' kind='elementOnly'"
 * @generated
 */
public interface SpecType extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Spec Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.AttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Attributes</em>' containment reference list.
	 * @see #isSetSpecAttributes()
	 * @see #unsetSpecAttributes()
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getSpecType_SpecAttributes()
	 * @model containment="true" unsettable="true" ordered="false"
	 *        extendedMetaData="name='SPEC-ATTRIBUTES' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AttributeDefinition> getSpecAttributes();

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.SpecType#getSpecAttributes <em>Spec Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecAttributes()
	 * @see #getSpecAttributes()
	 * @generated
	 */
	void unsetSpecAttributes();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.SpecType#getSpecAttributes <em>Spec Attributes</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spec Attributes</em>' containment reference list is set.
	 * @see #unsetSpecAttributes()
	 * @see #getSpecAttributes()
	 * @generated
	 */
	boolean isSetSpecAttributes();

} // SpecType
