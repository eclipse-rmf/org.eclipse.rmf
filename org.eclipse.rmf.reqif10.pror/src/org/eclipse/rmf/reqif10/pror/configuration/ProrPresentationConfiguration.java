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
import org.eclipse.rmf.reqif10.DatatypeDefinition;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pror Presentation Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration#getDatatype <em>Datatype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getProrPresentationConfiguration()
 * @model abstract="true"
 * @generated
 */
public interface ProrPresentationConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Datatype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datatype</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datatype</em>' reference.
	 * @see #setDatatype(DatatypeDefinition)
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getProrPresentationConfiguration_Datatype()
	 * @model required="true"
	 * @generated
	 */
	DatatypeDefinition getDatatype();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration#getDatatype <em>Datatype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datatype</em>' reference.
	 * @see #getDatatype()
	 * @generated
	 */
	void setDatatype(DatatypeDefinition value);

} // ProrPresentationConfiguration
