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

package org.eclipse.rmf.rif11.ExchangeFile;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Hierarchy Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The root element of the tree that constitutes the structure of SpecObjects.
 * Kl�rt, ob Haupt-Kapitel modifiziert werden d�rfen und ob der Name der Hierachie ge�ndert werden kann.
 * Vererbt an die Haupt-Kapitel und an die Attribute der Hierarchie.
 * 
 * Bezieht sich NICHT auf die inhalte der Anforderungen und deren Attribute in der Gruppe.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchyRoot#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getSpecHierarchyRoot()
 * @model
 * @generated
 */
public interface SpecHierarchyRoot extends SpecElementWithUserDefinedAttributes {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.SpecHierarchy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getSpecHierarchyRoot_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<SpecHierarchy> getChildren();

} // SpecHierarchyRoot
