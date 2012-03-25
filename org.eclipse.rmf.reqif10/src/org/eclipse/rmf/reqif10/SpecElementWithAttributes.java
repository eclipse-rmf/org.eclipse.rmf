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
 * A representation of the model object '<em><b>Spec Element With Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.SpecElementWithAttributes#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getSpecElementWithAttributes()
 * @model abstract="true"
 *        extendedMetaData="name='SPEC-ELEMENT-WITH-ATTRIBUTES' kind='elementOnly'"
 * @generated
 */
public interface SpecElementWithAttributes extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Values</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.AttributeValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' containment reference list.
	 * @see #isSetValues()
	 * @see #unsetValues()
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getSpecElementWithAttributes_Values()
	 * @model containment="true" unsettable="true" ordered="false"
	 *        extendedMetaData="name='VALUES' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AttributeValue> getValues();

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.SpecElementWithAttributes#getValues <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValues()
	 * @see #getValues()
	 * @generated
	 */
	void unsetValues();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.SpecElementWithAttributes#getValues <em>Values</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Values</em>' containment reference list is set.
	 * @see #unsetValues()
	 * @see #getValues()
	 * @generated
	 */
	boolean isSetValues();

} // SpecElementWithAttributes
