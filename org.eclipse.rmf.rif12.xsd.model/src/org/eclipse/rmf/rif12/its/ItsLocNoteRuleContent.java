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
 * A representation of the model object '<em><b>Loc Note Rule Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.ItsLocNoteRuleContent#getLocNote <em>Loc Note</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsLocNoteRuleContent()
 * @model extendedMetaData="name='its-locNoteRule.content' kind='elementOnly'"
 * @generated
 */
public interface ItsLocNoteRuleContent extends EObject {
	/**
	 * Returns the value of the '<em><b>Loc Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains a localization note.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Loc Note</em>' containment reference.
	 * @see #setLocNote(LocNoteType)
	 * @see org.eclipse.rmf.rif12.its.ItsPackage#getItsLocNoteRuleContent_LocNote()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='locNote' namespace='##targetNamespace'"
	 * @generated
	 */
	LocNoteType getLocNote();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.its.ItsLocNoteRuleContent#getLocNote <em>Loc Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loc Note</em>' containment reference.
	 * @see #getLocNote()
	 * @generated
	 */
	void setLocNote(LocNoteType value);

} // ItsLocNoteRuleContent
