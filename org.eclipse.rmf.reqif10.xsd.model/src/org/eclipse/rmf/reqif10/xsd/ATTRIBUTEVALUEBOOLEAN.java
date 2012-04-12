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
 * A representation of the model object '<em><b>ATTRIBUTEVALUEBOOLEAN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEBOOLEAN#getDEFINITION <em>DEFINITION</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEBOOLEAN#isTHEVALUE <em>THEVALUE</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getATTRIBUTEVALUEBOOLEAN()
 * @model extendedMetaData="name='ATTRIBUTE-VALUE-BOOLEAN' kind='elementOnly'"
 * @generated
 */
public interface ATTRIBUTEVALUEBOOLEAN extends EObject {
	/**
	 * Returns the value of the '<em><b>DEFINITION</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DEFINITION</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DEFINITION</em>' containment reference.
	 * @see #setDEFINITION(DEFINITIONType6)
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getATTRIBUTEVALUEBOOLEAN_DEFINITION()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='DEFINITION' namespace='##targetNamespace'"
	 * @generated
	 */
	DEFINITIONType6 getDEFINITION();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEBOOLEAN#getDEFINITION <em>DEFINITION</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DEFINITION</em>' containment reference.
	 * @see #getDEFINITION()
	 * @generated
	 */
	void setDEFINITION(DEFINITIONType6 value);

	/**
	 * Returns the value of the '<em><b>THEVALUE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>THEVALUE</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>THEVALUE</em>' attribute.
	 * @see #isSetTHEVALUE()
	 * @see #unsetTHEVALUE()
	 * @see #setTHEVALUE(boolean)
	 * @see org.eclipse.rmf.reqif10.xsd.ReqifPackage#getATTRIBUTEVALUEBOOLEAN_THEVALUE()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean" required="true"
	 *        extendedMetaData="kind='attribute' name='THE-VALUE'"
	 * @generated
	 */
	boolean isTHEVALUE();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEBOOLEAN#isTHEVALUE <em>THEVALUE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>THEVALUE</em>' attribute.
	 * @see #isSetTHEVALUE()
	 * @see #unsetTHEVALUE()
	 * @see #isTHEVALUE()
	 * @generated
	 */
	void setTHEVALUE(boolean value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEBOOLEAN#isTHEVALUE <em>THEVALUE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTHEVALUE()
	 * @see #isTHEVALUE()
	 * @see #setTHEVALUE(boolean)
	 * @generated
	 */
	void unsetTHEVALUE();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEBOOLEAN#isTHEVALUE <em>THEVALUE</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>THEVALUE</em>' attribute is set.
	 * @see #unsetTHEVALUE()
	 * @see #isTHEVALUE()
	 * @see #setTHEVALUE(boolean)
	 * @generated
	 */
	boolean isSetTHEVALUE();

} // ATTRIBUTEVALUEBOOLEAN
