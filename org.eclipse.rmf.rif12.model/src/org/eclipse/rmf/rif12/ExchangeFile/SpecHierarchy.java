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

package org.eclipse.rmf.rif12.ExchangeFile;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Dient dazu, f�r Unterkapitel zu kennzeichnen, ob innerhalb dieses Unterkapitels umstrukturiert und erg�nzt bzw. gel�scht werden darf.
 * Hat aber nichts mit den Inhalten der SpecObjekte und deren Eigenschaften zu tun, nur mit der Kapitelstruktur als solches!
 * Vorsicht: Dadurch k�nnen aus Knoten (�berschriften) Bl�tter (Anforderungen) gemacht werden und umgekehrt.
 * Vererbt rekursiv an die Unter-Unter-Kapitel.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.SpecHierarchy#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.SpecHierarchy#getValues <em>Values</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.SpecHierarchy#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getSpecHierarchy()
 * @model
 * @generated
 */
public interface SpecHierarchy extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' reference.
	 * @see #setObject(SpecObject)
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getSpecHierarchy_Object()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SpecObject getObject();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.SpecHierarchy#getObject <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' reference.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(SpecObject value);

	/**
	 * Returns the value of the '<em><b>Values</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.ExchangeFile.AttributeValue}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Values</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Values</em>' reference list.
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getSpecHierarchy_Values()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AttributeValue> getValues();

	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.ExchangeFile.SpecHierarchy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getSpecHierarchy_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecHierarchy> getChildren();

} // SpecHierarchy
