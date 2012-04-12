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
 * A representation of the model object '<em><b>Ruby Rule Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsRubyRuleContent#getRubyText <em>Ruby Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRubyRuleContent()
 * @model extendedMetaData="name='its-rubyRule.content' kind='elementOnly'"
 * @generated
 */
public interface ItsRubyRuleContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Ruby Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ruby text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ruby Text</em>' containment reference.
	 * @see #setRubyText(RubyTextType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsRubyRuleContent_RubyText()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='rubyText' namespace='##targetNamespace'"
	 * @generated
	 */
	RubyTextType getRubyText();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.ItsRubyRuleContent#getRubyText <em>Ruby Text</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ruby Text</em>' containment reference.
	 * @see #getRubyText()
	 * @generated
	 */
	void setRubyText(RubyTextType value);

} // ItsRubyRuleContent
