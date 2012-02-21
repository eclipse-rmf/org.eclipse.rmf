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
 * A representation of the model object '<em><b>TARGETGROUP Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.TARGETGROUPType#getSPECGROUPREF <em>SPECGROUPREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getTARGETGROUPType()
 * @model extendedMetaData="name='TARGET-GROUP_._type' kind='elementOnly'"
 * @generated
 */
public interface TARGETGROUPType extends EObject {
	/**
	 * Returns the value of the '<em><b>SPECGROUPREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECGROUPREF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECGROUPREF</em>' reference.
	 * @see #setSPECGROUPREF(SPECGROUP)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getTARGETGROUPType_SPECGROUPREF()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SPEC-GROUP-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECGROUP getSPECGROUPREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.TARGETGROUPType#getSPECGROUPREF <em>SPECGROUPREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECGROUPREF</em>' reference.
	 * @see #getSPECGROUPREF()
	 * @generated
	 */
	void setSPECGROUPREF(SPECGROUP value);

} // TARGETGROUPType
