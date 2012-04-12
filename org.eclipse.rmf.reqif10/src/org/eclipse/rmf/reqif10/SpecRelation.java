/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
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
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getSpecRelation()
 * @model extendedMetaData="name='SPEC-RELATION' kind='elementOnly'"
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
	 * @see #isSetTarget()
	 * @see #unsetTarget()
	 * @see #setTarget(SpecObject)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getSpecRelation_Target()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='TARGET' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecObject getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.SpecRelation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #isSetTarget()
	 * @see #unsetTarget()
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SpecObject value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.SpecRelation#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTarget()
	 * @see #getTarget()
	 * @see #setTarget(SpecObject)
	 * @generated
	 */
	void unsetTarget();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.SpecRelation#getTarget <em>Target</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Target</em>' reference is set.
	 * @see #unsetTarget()
	 * @see #getTarget()
	 * @see #setTarget(SpecObject)
	 * @generated
	 */
	boolean isSetTarget();

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #isSetSource()
	 * @see #unsetSource()
	 * @see #setSource(SpecObject)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getSpecRelation_Source()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='SOURCE' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecObject getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.SpecRelation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #isSetSource()
	 * @see #unsetSource()
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SpecObject value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.SpecRelation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSource()
	 * @see #getSource()
	 * @see #setSource(SpecObject)
	 * @generated
	 */
	void unsetSource();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.SpecRelation#getSource <em>Source</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Source</em>' reference is set.
	 * @see #unsetSource()
	 * @see #getSource()
	 * @see #setSource(SpecObject)
	 * @generated
	 */
	boolean isSetSource();

	/**
	 * Returns the value of the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #setType(SpecRelationType)
	 * @see org.eclipse.rmf.reqif10.ReqIF10Package#getSpecRelation_Type()
	 * @model unsettable="true" required="true" ordered="false"
	 *        extendedMetaData="name='TYPE' kind='element' namespace='##targetNamespace'"
	 * @generated
	 */
	SpecRelationType getType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.SpecRelation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' reference.
	 * @see #isSetType()
	 * @see #unsetType()
	 * @see #getType()
	 * @generated
	 */
	void setType(SpecRelationType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.SpecRelation#getType <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetType()
	 * @see #getType()
	 * @see #setType(SpecRelationType)
	 * @generated
	 */
	void unsetType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.SpecRelation#getType <em>Type</em>}' reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Type</em>' reference is set.
	 * @see #unsetType()
	 * @see #getType()
	 * @see #setType(SpecRelationType)
	 * @generated
	 */
	boolean isSetType();

} // SpecRelation
