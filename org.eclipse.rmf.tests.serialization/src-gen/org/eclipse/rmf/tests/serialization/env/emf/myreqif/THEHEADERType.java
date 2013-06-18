/**
 * Copyright (c) 2013 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    itemis AG - initial API and implementation
 * 
 */
package org.eclipse.rmf.tests.serialization.env.emf.myreqif;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>THEHEADER Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.THEHEADERType#getREQIFHEADER <em>REQIFHEADER</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getTHEHEADERType()
 * @model extendedMetaData="name='THE-HEADER_._type' kind='elementOnly'"
 * @generated
 */
public interface THEHEADERType extends EObject {
	/**
	 * Returns the value of the '<em><b>REQIFHEADER</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>REQIFHEADER</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>REQIFHEADER</em>' containment reference.
	 * @see #setREQIFHEADER(REQIFHEADER)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getTHEHEADERType_REQIFHEADER()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='REQ-IF-HEADER' namespace='##targetNamespace'"
	 * @generated
	 */
	REQIFHEADER getREQIFHEADER();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.THEHEADERType#getREQIFHEADER <em>REQIFHEADER</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>REQIFHEADER</em>' containment reference.
	 * @see #getREQIFHEADER()
	 * @generated
	 */
	void setREQIFHEADER(REQIFHEADER value);

} // THEHEADERType
