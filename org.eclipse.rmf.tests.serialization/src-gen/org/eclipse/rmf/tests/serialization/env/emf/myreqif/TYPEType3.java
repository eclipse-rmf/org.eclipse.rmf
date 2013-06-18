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
 * A representation of the model object '<em><b>TYPE Type3</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType3#getDATATYPEDEFINITIONSTRINGREF <em>DATATYPEDEFINITIONSTRINGREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getTYPEType3()
 * @model extendedMetaData="name='TYPE_._3_._type' kind='elementOnly'"
 * @generated
 */
public interface TYPEType3 extends EObject {
	/**
	 * Returns the value of the '<em><b>DATATYPEDEFINITIONSTRINGREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DATATYPEDEFINITIONSTRINGREF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DATATYPEDEFINITIONSTRINGREF</em>' attribute.
	 * @see #setDATATYPEDEFINITIONSTRINGREF(String)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getTYPEType3_DATATYPEDEFINITIONSTRINGREF()
	 * @model dataType="org.eclipse.rmf.tests.serialization.env.emf.myreqif.LOCALREF"
	 *        extendedMetaData="kind='element' name='DATATYPE-DEFINITION-STRING-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDATATYPEDEFINITIONSTRINGREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType3#getDATATYPEDEFINITIONSTRINGREF <em>DATATYPEDEFINITIONSTRINGREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DATATYPEDEFINITIONSTRINGREF</em>' attribute.
	 * @see #getDATATYPEDEFINITIONSTRINGREF()
	 * @generated
	 */
	void setDATATYPEDEFINITIONSTRINGREF(String value);

} // TYPEType3
