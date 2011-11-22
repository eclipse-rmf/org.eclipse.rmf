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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.SpecRelation#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.SpecRelation#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.SpecRelation#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.SpecRelation#getCoreContent <em>Core Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecRelation()
 * @model
 * @generated
 */
public interface SpecRelation extends SpecElementWithAttributes {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SpecObject)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecRelation_Target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SpecObject getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.SpecRelation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SpecObject value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SpecObject)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecRelation_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SpecObject getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.SpecRelation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SpecObject value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #setType(SpecRelationType)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecRelation_Type()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SpecRelationType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.SpecRelation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(SpecRelationType value);

	/**
	 * Returns the value of the '<em><b>Core Content</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.rmf.reqif10.ReqIfContent#getSpecRelations <em>Spec Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Core Content</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Core Content</em>' container reference.
	 * @see #setCoreContent(ReqIfContent)
	 * @see org.eclipse.rmf.reqif10.Reqif10Package#getSpecRelation_CoreContent()
	 * @see org.eclipse.rmf.reqif10.ReqIfContent#getSpecRelations
	 * @model opposite="specRelations" required="true" transient="false" ordered="false"
	 * @generated
	 */
	ReqIfContent getCoreContent();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.SpecRelation#getCoreContent <em>Core Content</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Core Content</em>' container reference.
	 * @see #getCoreContent()
	 * @generated
	 */
	void setCoreContent(ReqIfContent value);

} // SpecRelation
