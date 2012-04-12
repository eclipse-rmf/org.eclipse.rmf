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

package org.eclipse.rmf.rif12.its;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rbc Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsRbcContent#getRb <em>Rb</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRbcContent()
 * @model extendedMetaData="name='its-rbc.content' kind='elementOnly'"
 * @generated
 */
public interface ItsRbcContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Rb</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.its.RbType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ruby base text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rb</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRbcContent_Rb()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='rb' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RbType> getRb();

} // ItsRbcContent
