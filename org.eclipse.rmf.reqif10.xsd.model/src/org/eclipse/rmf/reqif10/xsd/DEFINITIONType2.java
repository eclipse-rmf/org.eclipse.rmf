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
 * A representation of the model object '<em><b>DEFINITION Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.DEFINITIONType2#getATTRIBUTEDEFINITIONSTRINGREF <em>ATTRIBUTEDEFINITIONSTRINGREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getDEFINITIONType2()
 * @model extendedMetaData="name='DEFINITION_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface DEFINITIONType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONSTRINGREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONSTRINGREF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONSTRINGREF</em>' reference.
	 * @see #setATTRIBUTEDEFINITIONSTRINGREF(ATTRIBUTEDEFINITIONSTRING)
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getDEFINITIONType2_ATTRIBUTEDEFINITIONSTRINGREF()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-STRING-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	ATTRIBUTEDEFINITIONSTRING getATTRIBUTEDEFINITIONSTRINGREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.DEFINITIONType2#getATTRIBUTEDEFINITIONSTRINGREF <em>ATTRIBUTEDEFINITIONSTRINGREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATTRIBUTEDEFINITIONSTRINGREF</em>' reference.
	 * @see #getATTRIBUTEDEFINITIONSTRINGREF()
	 * @generated
	 */
	void setATTRIBUTEDEFINITIONSTRINGREF(ATTRIBUTEDEFINITIONSTRING value);

} // DEFINITIONType2
