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
 * A representation of the model object '<em><b>Within Text Rule Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.WithinTextRuleType#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.WithinTextRuleType#getWithinText <em>Within Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.its.ItsPackage#getWithinTextRuleType()
 * @model extendedMetaData="name='withinTextRule_._type' kind='empty'"
 * @generated
 */
public interface WithinTextRuleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Selector</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * XPath expression identifying the nodes to be selected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Selector</em>' attribute.
	 * @see #setSelector(String)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getWithinTextRuleType_Selector()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='attribute' name='selector'"
	 * @generated
	 */
	String getSelector();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.WithinTextRuleType#getSelector <em>Selector</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selector</em>' attribute.
	 * @see #getSelector()
	 * @generated
	 */
	void setSelector(String value);

	/**
	 * Returns the value of the '<em><b>Within Text</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.rmf.rif12.its.WithinTextType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * States whether current context is regarded as
	 * 		    "within text".
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Within Text</em>' attribute.
	 * @see org.eclipse.rmf.rif12.its.WithinTextType
	 * @see #isSetWithinText()
	 * @see #unsetWithinText()
	 * @see #setWithinText(WithinTextType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getWithinTextRuleType_WithinText()
	 * @model unsettable="true" required="true"
	 *        extendedMetaData="kind='attribute' name='withinText'"
	 * @generated
	 */
	WithinTextType getWithinText();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.WithinTextRuleType#getWithinText <em>Within Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Within Text</em>' attribute.
	 * @see org.eclipse.rmf.rif12.its.WithinTextType
	 * @see #isSetWithinText()
	 * @see #unsetWithinText()
	 * @see #getWithinText()
	 * @generated
	 */
	void setWithinText(WithinTextType value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.rif12.its.WithinTextRuleType#getWithinText <em>Within Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWithinText()
	 * @see #getWithinText()
	 * @see #setWithinText(WithinTextType)
	 * @generated
	 */
	void unsetWithinText();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.rif12.its.WithinTextRuleType#getWithinText <em>Within Text</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Within Text</em>' attribute is set.
	 * @see #unsetWithinText()
	 * @see #getWithinText()
	 * @see #setWithinText(WithinTextType)
	 * @generated
	 */
	boolean isSetWithinText();

} // WithinTextRuleType
