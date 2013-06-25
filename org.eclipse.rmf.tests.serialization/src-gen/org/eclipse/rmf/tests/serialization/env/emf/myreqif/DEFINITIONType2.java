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
 * A representation of the model object '<em><b>DEFINITION Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType2#getATTRIBUTEDEFINITIONSTRINGREF <em>ATTRIBUTEDEFINITIONSTRINGREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getDEFINITIONType2()
 * @model extendedMetaData="name='DEFINITION_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface DEFINITIONType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>ATTRIBUTEDEFINITIONSTRINGREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEDEFINITIONSTRINGREF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEDEFINITIONSTRINGREF</em>' attribute.
	 * @see #setATTRIBUTEDEFINITIONSTRINGREF(String)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getDEFINITIONType2_ATTRIBUTEDEFINITIONSTRINGREF()
	 * @model dataType="org.eclipse.rmf.tests.serialization.env.emf.myreqif.LOCALREF"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-DEFINITION-STRING-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	String getATTRIBUTEDEFINITIONSTRINGREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType2#getATTRIBUTEDEFINITIONSTRINGREF <em>ATTRIBUTEDEFINITIONSTRINGREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATTRIBUTEDEFINITIONSTRINGREF</em>' attribute.
	 * @see #getATTRIBUTEDEFINITIONSTRINGREF()
	 * @generated
	 */
	void setATTRIBUTEDEFINITIONSTRINGREF(String value);

} // DEFINITIONType2
