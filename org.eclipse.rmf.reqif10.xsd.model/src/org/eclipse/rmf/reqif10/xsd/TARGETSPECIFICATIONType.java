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
 * A representation of the model object '<em><b>TARGETSPECIFICATION Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.TARGETSPECIFICATIONType#getSPECIFICATIONREF <em>SPECIFICATIONREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getTARGETSPECIFICATIONType()
 * @model extendedMetaData="name='TARGET-SPECIFICATION_._type' kind='elementOnly'"
 * @generated
 */
public interface TARGETSPECIFICATIONType extends EObject {
	/**
	 * Returns the value of the '<em><b>SPECIFICATIONREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>SPECIFICATIONREF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>SPECIFICATIONREF</em>' reference.
	 * @see #setSPECIFICATIONREF(SPECIFICATION)
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getTARGETSPECIFICATIONType_SPECIFICATIONREF()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='SPECIFICATION-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	SPECIFICATION getSPECIFICATIONREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.TARGETSPECIFICATIONType#getSPECIFICATIONREF <em>SPECIFICATIONREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>SPECIFICATIONREF</em>' reference.
	 * @see #getSPECIFICATIONREF()
	 * @generated
	 */
	void setSPECIFICATIONREF(SPECIFICATION value);

} // TARGETSPECIFICATIONType
