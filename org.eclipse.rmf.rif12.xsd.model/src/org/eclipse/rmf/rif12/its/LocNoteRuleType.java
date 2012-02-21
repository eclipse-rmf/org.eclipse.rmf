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

package org.eclipse.rmf.rif12.its;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loc Note Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.LocNoteRuleType#getLocNotePointer <em>Loc Note Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.LocNoteRuleType#getLocNoteRef <em>Loc Note Ref</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.LocNoteRuleType#getLocNoteRefPointer <em>Loc Note Ref Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.LocNoteRuleType#getLocNoteType <em>Loc Note Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.LocNoteRuleType#getSelector <em>Selector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.its.ItsPackage#getLocNoteRuleType()
 * @model extendedMetaData="name='locNoteRule_._type' kind='elementOnly'"
 * @generated
 */
public interface LocNoteRuleType extends ItsLocNoteRuleContent {
	/**
	 * Returns the value of the '<em><b>Loc Note Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative XPath expression pointing to a node that holds the localization note.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Note Pointer</em>' attribute.
	 * @see #setLocNotePointer(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getLocNoteRuleType_LocNotePointer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='locNotePointer'"
	 * @generated
	 */
	String getLocNotePointer();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.LocNoteRuleType#getLocNotePointer <em>Loc Note Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Note Pointer</em>' attribute.
	 * @see #getLocNotePointer()
	 * @generated
	 */
	void setLocNotePointer(String value);

	/**
	 * Returns the value of the '<em><b>Loc Note Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI referring to the location of the localization note.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Note Ref</em>' attribute.
	 * @see #setLocNoteRef(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getLocNoteRuleType_LocNoteRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='locNoteRef'"
	 * @generated
	 */
	String getLocNoteRef();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.LocNoteRuleType#getLocNoteRef <em>Loc Note Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Note Ref</em>' attribute.
	 * @see #getLocNoteRef()
	 * @generated
	 */
	void setLocNoteRef(String value);

	/**
	 * Returns the value of the '<em><b>Loc Note Ref Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative XPath expression pointing to a node that holds the URI referring to the location of the localization note.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Note Ref Pointer</em>' attribute.
	 * @see #setLocNoteRefPointer(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getLocNoteRuleType_LocNoteRefPointer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='locNoteRefPointer'"
	 * @generated
	 */
	String getLocNoteRefPointer();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.LocNoteRuleType#getLocNoteRefPointer <em>Loc Note Ref Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Note Ref Pointer</em>' attribute.
	 * @see #getLocNoteRefPointer()
	 * @generated
	 */
	void setLocNoteRefPointer(String value);

	/**
	 * Returns the value of the '<em><b>Loc Note Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.rif12.its.LocNoteTypeType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The type of localization note.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Note Type</em>' attribute.
	 * @see org.eclipse.rmf.rif12.its.LocNoteTypeType
	 * @see #isSetLocNoteType()
	 * @see #unsetLocNoteType()
	 * @see #setLocNoteType(LocNoteTypeType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getLocNoteRuleType_LocNoteType()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='locNoteType'"
	 * @generated
	 */
	LocNoteTypeType getLocNoteType();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.LocNoteRuleType#getLocNoteType <em>Loc Note Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Note Type</em>' attribute.
	 * @see org.eclipse.rmf.rif12.its.LocNoteTypeType
	 * @see #isSetLocNoteType()
	 * @see #unsetLocNoteType()
	 * @see #getLocNoteType()
	 * @generated
	 */
	void setLocNoteType(LocNoteTypeType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif12.its.LocNoteRuleType#getLocNoteType <em>Loc Note Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetLocNoteType()
	 * @see #getLocNoteType()
	 * @see #setLocNoteType(LocNoteTypeType)
	 * @generated
	 */
	void unsetLocNoteType();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif12.its.LocNoteRuleType#getLocNoteType <em>Loc Note Type</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Loc Note Type</em>' attribute is set.
	 * @see #unsetLocNoteType()
	 * @see #getLocNoteType()
	 * @see #setLocNoteType(LocNoteTypeType)
	 * @generated
	 */
	boolean isSetLocNoteType();

	/**
	 * Returns the value of the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XPath expression identifying the nodes to be selected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector</em>' attribute.
	 * @see #setSelector(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getLocNoteRuleType_Selector()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='selector'"
	 * @generated
	 */
	String getSelector();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.LocNoteRuleType#getSelector <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' attribute.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(String value);

} // LocNoteRuleType
