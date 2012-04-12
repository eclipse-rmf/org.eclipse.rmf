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
 * A representation of the model object '<em><b>TYPE Type2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.TYPEType2#getDATATYPEDEFINITIONINTEGERREF <em>DATATYPEDEFINITIONINTEGERREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getTYPEType2()
 * @model extendedMetaData="name='TYPE_._2_._type' kind='elementOnly'"
 * @generated
 */
public interface TYPEType2 extends EObject {
	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONINTEGERREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONINTEGERREF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONINTEGERREF</em>' reference.
	 * @see #setDATATYPEDEFINITIONINTEGERREF(DATATYPEDEFINITIONINTEGER)
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getTYPEType2_DATATYPEDEFINITIONINTEGERREF()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-INTEGER-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	DATATYPEDEFINITIONINTEGER getDATATYPEDEFINITIONINTEGERREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.TYPEType2#getDATATYPEDEFINITIONINTEGERREF <em>DATATYPEDEFINITIONINTEGERREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATATYPEDEFINITIONINTEGERREF</em>' reference.
	 * @see #getDATATYPEDEFINITIONINTEGERREF()
	 * @generated
	 */
	void setDATATYPEDEFINITIONINTEGERREF(DATATYPEDEFINITIONINTEGER value);

} // TYPEType2
