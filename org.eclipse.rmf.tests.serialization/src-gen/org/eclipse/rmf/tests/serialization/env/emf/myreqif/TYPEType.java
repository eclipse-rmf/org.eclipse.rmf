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
 * A representation of the model object '<em><b>TYPE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType#getRELATIONGROUPTYPEREF <em>RELATIONGROUPTYPEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getTYPEType()
 * @model extendedMetaData="name='TYPE_._type' kind='elementOnly'"
 * @generated
 */
public interface TYPEType extends EObject {
	/**
	 * Returns the value of the '<em><b>RELATIONGROUPTYPEREF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RELATIONGROUPTYPEREF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RELATIONGROUPTYPEREF</em>' attribute.
	 * @see #setRELATIONGROUPTYPEREF(String)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getTYPEType_RELATIONGROUPTYPEREF()
	 * @model dataType="org.eclipse.rmf.tests.serialization.env.emf.myreqif.LOCALREF"
	 *        extendedMetaData="kind='element' name='RELATION-GROUP-TYPE-REF' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRELATIONGROUPTYPEREF();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType#getRELATIONGROUPTYPEREF <em>RELATIONGROUPTYPEREF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RELATIONGROUPTYPEREF</em>' attribute.
	 * @see #getRELATIONGROUPTYPEREF()
	 * @generated
	 */
	void setRELATIONGROUPTYPEREF(String value);

} // TYPEType
