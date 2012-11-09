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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.LabelConfiguration#getDefaultLabel <em>Default Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getLabelConfiguration()
 * @model
 * @generated
 */
public interface LabelConfiguration extends EObject {
	/**
	 * Returns the value of the '<em><b>Default Label</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Label</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Label</em>' attribute list.
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getLabelConfiguration_DefaultLabel()
	 * @model
	 * @generated
	 */
	EList<String> getDefaultLabel();

} // LabelConfiguration
