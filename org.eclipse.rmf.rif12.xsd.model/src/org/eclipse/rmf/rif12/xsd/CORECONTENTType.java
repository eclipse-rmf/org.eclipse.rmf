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
 * A representation of the model object '<em><b>CORECONTENT Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.CORECONTENTType#getRIFCONTENT <em>RIFCONTENT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getCORECONTENTType()
 * @model extendedMetaData="name='CORE-CONTENT_._type' kind='elementOnly'"
 * @generated
 */
public interface CORECONTENTType extends EObject {
	/**
	 * Returns the value of the '<em><b>RIFCONTENT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>RIFCONTENT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>RIFCONTENT</em>' containment reference.
	 * @see #setRIFCONTENT(RIFCONTENT)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getCORECONTENTType_RIFCONTENT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='RIF-CONTENT' namespace='##targetNamespace'"
	 * @generated
	 */
	RIFCONTENT getRIFCONTENT();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.CORECONTENTType#getRIFCONTENT <em>RIFCONTENT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RIFCONTENT</em>' containment reference.
	 * @see #getRIFCONTENT()
	 * @generated
	 */
	void setRIFCONTENT(RIFCONTENT value);

} // CORECONTENTType
