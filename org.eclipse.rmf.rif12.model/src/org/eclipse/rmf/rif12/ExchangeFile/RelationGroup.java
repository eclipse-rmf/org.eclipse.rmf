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
 * A representation of the model object '<em><b>Relation Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Insbesondere wird hier festgelegt, wer neue Relationen anlegen darf, die zu dieser RelationGroup geh�ren sollen. Damit kann eingeschr�nkt werden, wer Traces erzeugen soll, die von den Objekten der Eltern SpecGroup ausgehen.
 * Bezieht sich auch auf die Auswahl der TargetGroup und des vorgesehenen SpecType der SpecRelation Objekte in der RelationGroup.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RelationGroup#getSpecRelations <em>Spec Relations</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.RelationGroup#getRelationType <em>Relation Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRelationGroup()
 * @model
 * @generated
 */
public interface RelationGroup extends Identifiable {
	/**
	 * Returns the value of the '<em><b>Spec Relations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.rif12.ExchangeFile.SpecRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Relations</em>' reference list.
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRelationGroup_SpecRelations()
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
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getRelationGroup_RelationType()
	 * @model ordered="false"
	 * @generated
	 */
	SpecType getRelationType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.RelationGroup#getRelationType <em>Relation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Relation Type</em>' reference.
	 * @see #getRelationType()
	 * @generated
	 */
	void setRelationType(SpecType value);

} // RelationGroup
