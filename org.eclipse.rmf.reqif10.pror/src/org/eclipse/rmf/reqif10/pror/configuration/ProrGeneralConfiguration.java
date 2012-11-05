/*******************************************************************************
 * Copyright (c) 2011 Formal Mind GmbH and University of Dusseldorf.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Michael Jastram - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.pror.configuration;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pror General Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.ProrGeneralConfiguration#getLabelConfiguration <em>Label Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getProrGeneralConfiguration()
 * @model
 * @generated
 */
public interface ProrGeneralConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Label Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Configuration</em>' containment reference.
	 * @see #setLabelConfiguration(LabelConfiguration)
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getProrGeneralConfiguration_LabelConfiguration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LabelConfiguration getLabelConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrGeneralConfiguration#getLabelConfiguration <em>Label Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Configuration</em>' containment reference.
	 * @see #getLabelConfiguration()
	 * @generated
	 */
	void setLabelConfiguration(LabelConfiguration value);

} // ProrGeneralConfiguration
