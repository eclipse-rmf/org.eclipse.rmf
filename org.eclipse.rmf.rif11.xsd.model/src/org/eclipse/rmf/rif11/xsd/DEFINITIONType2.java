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
 * A representation of the model object '<em><b>DEFINITION Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType2#getATTRIBUTEDEFINITIONSIMPLEREF <em>ATTRIBUTEDEFINITIONSIMPLEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDEFINITIONType2()
 * @model extendedMetaData="name='DEFINITION_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface DEFINITIONType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONSIMPLEREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONSIMPLEREF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONSIMPLEREF</em>' reference.
	 * @see #setATTRIBUTEDEFINITIONSIMPLEREF(ATTRIBUTEDEFINITIONSIMPLE)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDEFINITIONType2_ATTRIBUTEDEFINITIONSIMPLEREF()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-SIMPLE-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	ATTRIBUTEDEFINITIONSIMPLE getATTRIBUTEDEFINITIONSIMPLEREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType2#getATTRIBUTEDEFINITIONSIMPLEREF <em>ATTRIBUTEDEFINITIONSIMPLEREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATTRIBUTEDEFINITIONSIMPLEREF</em>' reference.
	 * @see #getATTRIBUTEDEFINITIONSIMPLEREF()
	 * @generated
	 */
	void setATTRIBUTEDEFINITIONSIMPLEREF(ATTRIBUTEDEFINITIONSIMPLE value);

} // DEFINITIONType2
