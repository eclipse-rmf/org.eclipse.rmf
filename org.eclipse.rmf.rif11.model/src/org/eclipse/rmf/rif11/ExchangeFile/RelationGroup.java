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
 * A representation of the model object '<em><b>Relation Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Specifies a relation type.
 * 
 * Any relation between two SpecObjects must be of a certain type. I.e., any relation must belong to a RelationGroup which specifies the relation type.
 * Insbesondere wird hier festgelegt, wer neue Relationen anlegen darf, die zu dieser RelationGroup geh�ren sollen. Damit kann eingeschr�nkt werden, wer Traces erzeugen soll, die von den Objekten der Eltern SpecGroup ausgehen.
 * Bezieht sich auch auf die Auswahl der TargetGroup und des vorgesehenen SpecType der SpecRelation Objekte in der RelationGroup.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.RelationGroup#getSpecRelations <em>Spec Relations</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.RelationGroup#getRelationType <em>Relation Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.RelationGroup#getSourceGroup <em>Source Group</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRelationGroup()
 * @model
 * @generated
 */
public interface RelationGroup extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Spec Relations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif11.ExchangeFile.SpecRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Relations</em>' reference list.
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRelationGroup_SpecRelations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SpecRelation> getSpecRelations();

	/**
	 * Returns the value of the '<em><b>Relation Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relation Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relation Type</em>' reference.
	 * @see #setRelationType(SpecType)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRelationGroup_RelationType()
	 * @model ordered="false"
	 * @generated
	 */
	SpecType getRelationType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.RelationGroup#getRelationType <em>Relation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Type</em>' reference.
	 * @see #getRelationType()
	 * @generated
	 */
	void setRelationType(SpecType value);

	/**
	 * Returns the value of the '<em><b>Source Group</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.rif11.ExchangeFile.SpecGroup#getRelationGroups <em>Relation Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Group</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Group</em>' container reference.
	 * @see #setSourceGroup(SpecGroup)
	 * @see org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage#getRelationGroup_SourceGroup()
	 * @see org.eclipse.rmf.rif11.ExchangeFile.SpecGroup#getRelationGroups
	 * @model opposite="relationGroups" required="true" transient="false" ordered="false"
	 * @generated
	 */
	SpecGroup getSourceGroup();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif11.ExchangeFile.RelationGroup#getSourceGroup <em>Source Group</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Group</em>' container reference.
	 * @see #getSourceGroup()
	 * @generated
	 */
	void setSourceGroup(SpecGroup value);

} // RelationGroup
