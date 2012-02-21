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
 * A representation of the model object '<em><b>TYPE Type8</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.TYPEType8#getDATATYPEDEFINITIONDATEREF <em>DATATYPEDEFINITIONDATEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getTYPEType8()
 * @model extendedMetaData="name='TYPE_._8_._type' kind='elementOnly'"
 * @generated
 */
public interface TYPEType8 extends EObject {
	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONDATEREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONDATEREF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONDATEREF</em>' reference.
	 * @see #setDATATYPEDEFINITIONDATEREF(DATATYPEDEFINITIONDATE)
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getTYPEType8_DATATYPEDEFINITIONDATEREF()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-DATE-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	DATATYPEDEFINITIONDATE getDATATYPEDEFINITIONDATEREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.TYPEType8#getDATATYPEDEFINITIONDATEREF <em>DATATYPEDEFINITIONDATEREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATATYPEDEFINITIONDATEREF</em>' reference.
	 * @see #getDATATYPEDEFINITIONDATEREF()
	 * @generated
	 */
	void setDATATYPEDEFINITIONDATEREF(DATATYPEDEFINITIONDATE value);

} // TYPEType8
