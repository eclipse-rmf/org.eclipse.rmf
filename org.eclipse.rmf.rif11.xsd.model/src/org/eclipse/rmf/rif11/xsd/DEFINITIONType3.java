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
 * A representation of the model object '<em><b>DEFINITION Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType3#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDEFINITIONType3()
 * @model extendedMetaData="name='DEFINITION_._3_._type' kind='elementOnly'"
 * @generated
 */
public interface DEFINITIONType3 extends EObject {
	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONENUMERATIONREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>' reference.
	 * @see #setATTRIBUTEDEFINITIONENUMERATIONREF(ATTRIBUTEDEFINITIONENUMERATION)
	 * @see org.eclipse.rmf.rif11.xsd.RifPackage#getDEFINITIONType3_ATTRIBUTEDEFINITIONENUMERATIONREF()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-ENUMERATION-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	ATTRIBUTEDEFINITIONENUMERATION getATTRIBUTEDEFINITIONENUMERATIONREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.xsd.DEFINITIONType3#getATTRIBUTEDEFINITIONENUMERATIONREF <em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATTRIBUTEDEFINITIONENUMERATIONREF</em>' reference.
	 * @see #getATTRIBUTEDEFINITIONENUMERATIONREF()
	 * @generated
	 */
	void setATTRIBUTEDEFINITIONENUMERATIONREF(ATTRIBUTEDEFINITIONENUMERATION value);

} // DEFINITIONType3
