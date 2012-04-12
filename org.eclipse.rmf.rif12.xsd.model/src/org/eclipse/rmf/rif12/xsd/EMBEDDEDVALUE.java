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

import java.math.BigInteger;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EMBEDDEDVALUE</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Contains additional data for an enumeration value.
 * 
 * Possible data is e.g. a key, a color.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.EMBEDDEDVALUE#getKEY <em>KEY</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.EMBEDDEDVALUE#getOTHERCONTENT <em>OTHERCONTENT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getEMBEDDEDVALUE()
 * @model extendedMetaData="name='EMBEDDED-VALUE' kind='elementOnly'"
 * @generated
 */
public interface EMBEDDEDVALUE extends EObject {
	/**
	 * Returns the value of the '<em><b>KEY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>KEY</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>KEY</em>' attribute.
	 * @see #setKEY(BigInteger)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getEMBEDDEDVALUE_KEY()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='element' name='KEY' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getKEY();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.EMBEDDEDVALUE#getKEY <em>KEY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>KEY</em>' attribute.
	 * @see #getKEY()
	 * @generated
	 */
	void setKEY(BigInteger value);

	/**
	 * Returns the value of the '<em><b>OTHERCONTENT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>OTHERCONTENT</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>OTHERCONTENT</em>' attribute.
	 * @see #setOTHERCONTENT(String)
	 * @see org.eclipse.rmf.rif12.xsd.RifPackage#getEMBEDDEDVALUE_OTHERCONTENT()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='OTHER-CONTENT' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOTHERCONTENT();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.xsd.EMBEDDEDVALUE#getOTHERCONTENT <em>OTHERCONTENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OTHERCONTENT</em>' attribute.
	 * @see #getOTHERCONTENT()
	 * @generated
	 */
	void setOTHERCONTENT(String value);

} // EMBEDDEDVALUE
