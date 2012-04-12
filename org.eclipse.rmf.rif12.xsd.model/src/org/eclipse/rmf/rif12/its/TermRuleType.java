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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Term Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.TermRuleType#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.TermRuleType#getTerm <em>Term</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.TermRuleType#getTermInfoPointer <em>Term Info Pointer</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.TermRuleType#getTermInfoRef <em>Term Info Ref</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.TermRuleType#getTermInfoRefPointer <em>Term Info Ref Pointer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.its.ItsPackage#getTermRuleType()
 * @model extendedMetaData="name='termRule_._type' kind='empty'"
 * @generated
 */
public interface TermRuleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XPath expression identifying the nodes to be selected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector</em>' attribute.
	 * @see #setSelector(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getTermRuleType_Selector()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='selector'"
	 * @generated
	 */
	String getSelector();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.TermRuleType#getSelector <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' attribute.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(String value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.rif12.its.TermType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Indicates whether the selection is a term or not.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term</em>' attribute.
	 * @see org.eclipse.rmf.rif12.its.TermType
	 * @see #isSetTerm()
	 * @see #unsetTerm()
	 * @see #setTerm(TermType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getTermRuleType_Term()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='term'"
	 * @generated
	 */
	TermType getTerm();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.TermRuleType#getTerm <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term</em>' attribute.
	 * @see org.eclipse.rmf.rif12.its.TermType
	 * @see #isSetTerm()
	 * @see #unsetTerm()
	 * @see #getTerm()
	 * @generated
	 */
	void setTerm(TermType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif12.its.TermRuleType#getTerm <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetTerm()
	 * @see #getTerm()
	 * @see #setTerm(TermType)
	 * @generated
	 */
	void unsetTerm();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif12.its.TermRuleType#getTerm <em>Term</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Term</em>' attribute is set.
	 * @see #unsetTerm()
	 * @see #getTerm()
	 * @see #setTerm(TermType)
	 * @generated
	 */
	boolean isSetTerm();

	/**
	 * Returns the value of the '<em><b>Term Info Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative XPath expression pointing to a node containing
	 * 		      information about the term.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term Info Pointer</em>' attribute.
	 * @see #setTermInfoPointer(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getTermRuleType_TermInfoPointer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='termInfoPointer'"
	 * @generated
	 */
	String getTermInfoPointer();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.TermRuleType#getTermInfoPointer <em>Term Info Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Info Pointer</em>' attribute.
	 * @see #getTermInfoPointer()
	 * @generated
	 */
	void setTermInfoPointer(String value);

	/**
	 * Returns the value of the '<em><b>Term Info Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URI referring to the resource providing information about the term.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term Info Ref</em>' attribute.
	 * @see #setTermInfoRef(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getTermRuleType_TermInfoRef()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.AnyURI"
	 *        extendedMetaData="kind='attribute' name='termInfoRef'"
	 * @generated
	 */
	String getTermInfoRef();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.TermRuleType#getTermInfoRef <em>Term Info Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Info Ref</em>' attribute.
	 * @see #getTermInfoRef()
	 * @generated
	 */
	void setTermInfoRef(String value);

	/**
	 * Returns the value of the '<em><b>Term Info Ref Pointer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Relative XPath expression pointing to a node containing a URI referring to the resource providing information about the term.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Term Info Ref Pointer</em>' attribute.
	 * @see #setTermInfoRefPointer(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getTermRuleType_TermInfoRefPointer()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='termInfoRefPointer'"
	 * @generated
	 */
	String getTermInfoRefPointer();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.TermRuleType#getTermInfoRefPointer <em>Term Info Ref Pointer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Term Info Ref Pointer</em>' attribute.
	 * @see #getTermInfoRefPointer()
	 * @generated
	 */
	void setTermInfoRefPointer(String value);

} // TermRuleType
