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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spec Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Darf die einzelne Relation umbenannt werden (falls wir den LongName aus Identifiable daf�r �berhaupt benutzen wollen)?
 * Darf der SpecType der Relation ver�ndert werden?
 * D�rfen Source- und Target der Relation ver�ndert werden?
 * Vererbt an die AttributeValues.
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.SpecRelation#getTarget <em>Target</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.SpecRelation#getSource <em>Source</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getSpecRelation()
 * @model
 * @generated
 */
public interface SpecRelation extends SpecElementWithUserDefinedAttributes {
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
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getSpecRelation_Target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SpecObject getTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.SpecRelation#getTarget <em>Target</em>}' reference.
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
	 * @see org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage#getSpecRelation_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SpecObject getSource();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.rif12.ExchangeFile.SpecRelation#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SpecObject value);

} // SpecRelation
