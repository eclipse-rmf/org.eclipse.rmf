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
 * A representation of the model object '<em><b>CORECONTENT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.CORECONTENTType#getREQIFCONTENT <em>REQIFCONTENT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getCORECONTENTType()
 * @model extendedMetaData="name='CORE-CONTENT_._type' kind='elementOnly'"
 * @generated
 */
public interface CORECONTENTType extends EObject {
	/**
	 * Returns the value of the '<em><b>REQIFCONTENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>REQIFCONTENT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>REQIFCONTENT</em>' containment reference.
	 * @see #setREQIFCONTENT(REQIFCONTENT)
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getCORECONTENTType_REQIFCONTENT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='REQ-IF-CONTENT' namespace='##targetNamespace'"
	 * @generated
	 */
	REQIFCONTENT getREQIFCONTENT();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.CORECONTENTType#getREQIFCONTENT <em>REQIFCONTENT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>REQIFCONTENT</em>' containment reference.
	 * @see #getREQIFCONTENT()
	 * @generated
	 */
	void setREQIFCONTENT(REQIFCONTENT value);

} // CORECONTENTType
