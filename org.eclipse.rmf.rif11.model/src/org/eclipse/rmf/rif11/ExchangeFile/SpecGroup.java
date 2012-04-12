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
 * A representation of the model object '<em><b>Spec Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Constitutes a group of SpecObjects that belong together.
 * A group of SpecObjects is a simple set, i.e. no structure or order is implicited by SpecGroup.
 * Darf die Gruppe umbenannt werden?
 * Darf der SpecType der Gruppe ver�ndert werden?
 * D�rfen der Gruppe neue Anforderungen hinzugef�gt oder daraus gel�scht werden?
 * Vererbt an die Gruppen-Attribute.
 * Vererbt an die RelationGroups.
 * 
 * Bezieht sich NICHT auf die inhalte der Anforderungen und deren Attribute in der Gruppe.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.SpecGroup#getSpecObjects <em>Spec Objects</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.SpecGroup#getRelationGroups <em>Relation Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getSpecGroup()
 * @model
 * @generated
 */
public interface SpecGroup extends SpecElementWithUserDefinedAttributes {
	/**
	 * Returns the value of the '<em><b>Spec Objects</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.SpecObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Objects</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Objects</em>' reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getSpecGroup_SpecObjects()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SpecObject> getSpecObjects();

	/**
	 * Returns the value of the '<em><b>Relation Groups</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.RelationGroup}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.rif11.ExchangeFile.RelationGroup#getSourceGroup <em>Source Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Groups</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Groups</em>' containment reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getSpecGroup_RelationGroups()
	 * @see org.eclipse.rmf.rif11.ExchangeFile.RelationGroup#getSourceGroup
	 * @model opposite="sourceGroup" containment="true" ordered="false"
	 * @generated
	 */
	EList<RelationGroup> getRelationGroups();

} // SpecGroup
