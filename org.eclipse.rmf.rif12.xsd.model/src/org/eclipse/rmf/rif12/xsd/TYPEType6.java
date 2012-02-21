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

package org.eclipse.rmf.rif12.xsd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TYPE Type6</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.TYPEType6#getSPECTYPEREF <em>SPECTYPEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getTYPEType6()
 * @model extendedMetaData="name='TYPE_._6_._type' kind='elementOnly'"
 * @generated
 */
public interface TYPEType6 extends EObject {
	/**
	 * Returns the value of the '<em><b>SPECTYPEREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECTYPEREF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECTYPEREF</em>' reference.
	 * @see #setSPECTYPEREF(SPECTYPE)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getTYPEType6_SPECTYPEREF()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SPEC-TYPE-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECTYPE getSPECTYPEREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.TYPEType6#getSPECTYPEREF <em>SPECTYPEREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECTYPEREF</em>' reference.
	 * @see #getSPECTYPEREF()
	 * @generated
	 */
	void setSPECTYPEREF(SPECTYPE value);

} // TYPEType6
