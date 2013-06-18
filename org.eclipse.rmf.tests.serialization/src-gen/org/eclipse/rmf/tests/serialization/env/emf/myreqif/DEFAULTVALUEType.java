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
 * A representation of the model object '<em><b>DEFAULTVALUE Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType#getATTRIBUTEVALUEDATE <em>ATTRIBUTEVALUEDATE</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getDEFAULTVALUEType()
 * @model extendedMetaData="name='DEFAULT-VALUE_._type' kind='elementOnly'"
 * @generated
 */
public interface DEFAULTVALUEType extends EObject {
	/**
	 * Returns the value of the '<em><b>ATTRIBUTEVALUEDATE</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ATTRIBUTEVALUEDATE</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ATTRIBUTEVALUEDATE</em>' containment reference.
	 * @see #setATTRIBUTEVALUEDATE(ATTRIBUTEVALUEDATE)
	 * @see org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage#getDEFAULTVALUEType_ATTRIBUTEVALUEDATE()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ATTRIBUTE-VALUE-DATE' namespace='##targetNamespace'"
	 * @generated
	 */
	ATTRIBUTEVALUEDATE getATTRIBUTEVALUEDATE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType#getATTRIBUTEVALUEDATE <em>ATTRIBUTEVALUEDATE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ATTRIBUTEVALUEDATE</em>' containment reference.
	 * @see #getATTRIBUTEVALUEDATE()
	 * @generated
	 */
	void setATTRIBUTEVALUEDATE(ATTRIBUTEVALUEDATE value);

} // DEFAULTVALUEType
