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

package org.eclipse.rmf.reqif10;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relation Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.RelationGroup#getSpecRelations <em>Spec Relations</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.RelationGroup#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.RelationGroup#getSourceSpecification <em>Source Specification</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.RelationGroup#getTargetSpecification <em>Target Specification</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.RelationGroup#getCoreContent <em>Core Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getRelationGroup()
 * @model
 * @generated
 */
public interface RelationGroup extends SpecElementWithAttributes {
	/**
	 * Returns the value of the '<em><b>Spec Relations</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.SpecRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec Relations</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec Relations</em>' reference list.
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getRelationGroup_SpecRelations()
	 * @model ordered="false"
	 * @generated
	 */
	EList<SpecRelation> getSpecRelations();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(RelationGroupType)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getRelationGroup_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	RelationGroupType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.RelationGroup#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(RelationGroupType value);

	/**
	 * Returns the value of the '<em><b>Source Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Specification</em>' reference.
	 * @see #setSourceSpecification(Specification)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getRelationGroup_SourceSpecification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Specification getSourceSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.RelationGroup#getSourceSpecification <em>Source Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Specification</em>' reference.
	 * @see #getSourceSpecification()
	 * @generated
	 */
	void setSourceSpecification(Specification value);

	/**
	 * Returns the value of the '<em><b>Target Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Specification</em>' reference.
	 * @see #setTargetSpecification(Specification)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getRelationGroup_TargetSpecification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Specification getTargetSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.RelationGroup#getTargetSpecification <em>Target Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Specification</em>' reference.
	 * @see #getTargetSpecification()
	 * @generated
	 */
	void setTargetSpecification(Specification value);

	/**
	 * Returns the value of the '<em><b>Core Content</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.ReqIfContent#getSpecRelationGroups <em>Spec Relation Groups</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Content</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Content</em>' container reference.
	 * @see #setCoreContent(ReqIfContent)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getRelationGroup_CoreContent()
	 * @see org.eclipse.rmf.reqif10.ReqIfContent#getSpecRelationGroups
	 * @model opposite="specRelationGroups" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ReqIfContent getCoreContent();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.RelationGroup#getCoreContent <em>Core Content</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Content</em>' container reference.
	 * @see #getCoreContent()
	 * @generated
	 */
	void setCoreContent(ReqIfContent value);

} // RelationGroup
