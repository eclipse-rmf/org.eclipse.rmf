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

package org.eclipse.rmf.reqif10.xsd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TYPE Type7</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.TYPEType7#getSPECRELATIONTYPEREF <em>SPECRELATIONTYPEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getTYPEType7()
 * @model extendedMetaData="name='TYPE_._7_._type' kind='elementOnly'"
 * @generated
 */
public interface TYPEType7 extends EObject {
	/**
	 * Returns the value of the '<em><b>SPECRELATIONTYPEREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECRELATIONTYPEREF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECRELATIONTYPEREF</em>' reference.
	 * @see #setSPECRELATIONTYPEREF(SPECRELATIONTYPE)
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getTYPEType7_SPECRELATIONTYPEREF()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SPEC-RELATION-TYPE-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECRELATIONTYPE getSPECRELATIONTYPEREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.TYPEType7#getSPECRELATIONTYPEREF <em>SPECRELATIONTYPEREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECRELATIONTYPEREF</em>' reference.
	 * @see #getSPECRELATIONTYPEREF()
	 * @generated
	 */
	void setSPECRELATIONTYPEREF(SPECRELATIONTYPE value);

} // TYPEType7
