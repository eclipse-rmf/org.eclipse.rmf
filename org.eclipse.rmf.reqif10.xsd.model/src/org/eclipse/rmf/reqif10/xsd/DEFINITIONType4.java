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
 * A representation of the model object '<em><b>DEFINITION Type4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.DEFINITIONType4#getATTRIBUTEDEFINITIONREALREF <em>ATTRIBUTEDEFINITIONREALREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getDEFINITIONType4()
 * @model extendedMetaData="name='DEFINITION_._4_._type' kind='elementOnly'"
 * @generated
 */
public interface DEFINITIONType4 extends EObject {
	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONREALREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONREALREF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONREALREF</em>' reference.
	 * @see #setATTRIBUTEDEFINITIONREALREF(ATTRIBUTEDEFINITIONREAL)
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getDEFINITIONType4_ATTRIBUTEDEFINITIONREALREF()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-REAL-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	ATTRIBUTEDEFINITIONREAL getATTRIBUTEDEFINITIONREALREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.DEFINITIONType4#getATTRIBUTEDEFINITIONREALREF <em>ATTRIBUTEDEFINITIONREALREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATTRIBUTEDEFINITIONREALREF</em>' reference.
	 * @see #getATTRIBUTEDEFINITIONREALREF()
	 * @generated
	 */
	void setATTRIBUTEDEFINITIONREALREF(ATTRIBUTEDEFINITIONREAL value);

} // DEFINITIONType4
