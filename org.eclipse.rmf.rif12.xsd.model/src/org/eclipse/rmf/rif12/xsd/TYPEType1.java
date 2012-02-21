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

package org.eclipse.rmf.rif12.xsd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TYPE Type1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.TYPEType1#getDATATYPEDEFINITIONENUMERATIONREF <em>DATATYPEDEFINITIONENUMERATIONREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getTYPEType1()
 * @model extendedMetaData="name='TYPE_._1_._type' kind='elementOnly'"
 * @generated
 */
public interface TYPEType1 extends EObject {
	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONENUMERATIONREF</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONENUMERATIONREF</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONENUMERATIONREF</em>' reference.
	 * @see #setDATATYPEDEFINITIONENUMERATIONREF(DATATYPEDEFINITIONENUMERATION)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getTYPEType1_DATATYPEDEFINITIONENUMERATIONREF()
	 * @model resolveProxies="false"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-ENUMERATION-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	DATATYPEDEFINITIONENUMERATION getDATATYPEDEFINITIONENUMERATIONREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.TYPEType1#getDATATYPEDEFINITIONENUMERATIONREF <em>DATATYPEDEFINITIONENUMERATIONREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATATYPEDEFINITIONENUMERATIONREF</em>' reference.
	 * @see #getDATATYPEDEFINITIONENUMERATIONREF()
	 * @generated
	 */
	void setDATATYPEDEFINITIONENUMERATIONREF(DATATYPEDEFINITIONENUMERATION value);

} // TYPEType1
