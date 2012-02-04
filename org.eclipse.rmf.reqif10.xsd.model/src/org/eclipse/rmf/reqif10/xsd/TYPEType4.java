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
 * A representation of the model object '<em><b>TYPE Type4</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.TYPEType4#getDATATYPEDEFINITIONREALREF <em>DATATYPEDEFINITIONREALREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getTYPEType4()
 * @model extendedMetaData="name='TYPE_._4_._type' kind='elementOnly'"
 * @generated
 */
public interface TYPEType4 extends EObject {
	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONREALREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONREALREF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONREALREF</em>' reference.
	 * @see #setDATATYPEDEFINITIONREALREF(DATATYPEDEFINITIONREAL)
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getTYPEType4_DATATYPEDEFINITIONREALREF()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-REAL-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	DATATYPEDEFINITIONREAL getDATATYPEDEFINITIONREALREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.TYPEType4#getDATATYPEDEFINITIONREALREF <em>DATATYPEDEFINITIONREALREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATATYPEDEFINITIONREALREF</em>' reference.
	 * @see #getDATATYPEDEFINITIONREALREF()
	 * @generated
	 */
	void setDATATYPEDEFINITIONREALREF(DATATYPEDEFINITIONREAL value);

} // TYPEType4
