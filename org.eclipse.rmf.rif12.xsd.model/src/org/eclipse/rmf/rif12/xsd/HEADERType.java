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
 * A representation of the model object '<em><b>HEADER Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.HEADERType#getRIFHEADER <em>RIFHEADER</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getHEADERType()
 * @model extendedMetaData="name='HEADER_._type' kind='elementOnly'"
 * @generated
 */
public interface HEADERType extends EObject {
	/**
	 * Returns the value of the '<em><b>RIFHEADER</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RIFHEADER</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RIFHEADER</em>' containment reference.
	 * @see #setRIFHEADER(RIFHEADER)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getHEADERType_RIFHEADER()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RIF-HEADER' namespace='##targetNamespace'"
	 * @generated
	 */
	RIFHEADER getRIFHEADER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.HEADERType#getRIFHEADER <em>RIFHEADER</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RIFHEADER</em>' containment reference.
	 * @see #getRIFHEADER()
	 * @generated
	 */
	void setRIFHEADER(RIFHEADER value);

} // HEADERType
