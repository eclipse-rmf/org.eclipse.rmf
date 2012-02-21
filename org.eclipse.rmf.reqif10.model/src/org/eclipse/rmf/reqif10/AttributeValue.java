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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.AttributeValue#getSpecElAt <em>Spec El At</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAttributeValue()
 * @model abstract="true"
 * @generated
 */
public interface AttributeValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Spec El At</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec El At</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec El At</em>' reference.
	 * @see #setSpecElAt(SpecElementWithAttributes)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getAttributeValue_SpecElAt()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SpecElementWithAttributes getSpecElAt();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.AttributeValue#getSpecElAt <em>Spec El At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spec El At</em>' reference.
	 * @see #getSpecElAt()
	 * @generated
	 */
	void setSpecElAt(SpecElementWithAttributes value);

} // AttributeValue
