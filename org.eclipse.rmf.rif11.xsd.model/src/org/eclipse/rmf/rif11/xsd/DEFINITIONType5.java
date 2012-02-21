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

package org.eclipse.rmf.rif11.xsd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DEFINITION Type5</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType5#getATTRIBUTEDEFINITIONCOMPLEXREF <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDEFINITIONType5()
 * @model extendedMetaData="name='DEFINITION_._5_._type' kind='elementOnly'"
 * @generated
 */
public interface DEFINITIONType5 extends EObject {
	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONCOMPLEXREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>' reference.
	 * @see #setATTRIBUTEDEFINITIONCOMPLEXREF(ATTRIBUTEDEFINITIONCOMPLEX)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDEFINITIONType5_ATTRIBUTEDEFINITIONCOMPLEXREF()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-COMPLEX-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	ATTRIBUTEDEFINITIONCOMPLEX getATTRIBUTEDEFINITIONCOMPLEXREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType5#getATTRIBUTEDEFINITIONCOMPLEXREF <em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATTRIBUTEDEFINITIONCOMPLEXREF</em>' reference.
	 * @see #getATTRIBUTEDEFINITIONCOMPLEXREF()
	 * @generated
	 */
	void setATTRIBUTEDEFINITIONCOMPLEXREF(ATTRIBUTEDEFINITIONCOMPLEX value);

} // DEFINITIONType5
