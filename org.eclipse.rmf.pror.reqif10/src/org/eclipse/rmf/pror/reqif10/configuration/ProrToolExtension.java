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

package org.eclipse.rmf.pror.reqif10.configuration;

import org.eclipse.emf.common.util.EList;

import org.eclipse.rmf.reqif10.ReqIfToolExtension;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pror Tool Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.pror.reqif10.configuration.ProrToolExtension#getSpecViewConfigurations <em>Spec View Configurations</em>}</li>
 *   <li>{@link org.eclipse.rmf.pror.reqif10.configuration.ProrToolExtension#getGeneralConfiguration <em>General Configuration</em>}</li>
 *   <li>{@link org.eclipse.rmf.pror.reqif10.configuration.ProrToolExtension#getPresentationConfigurations <em>Presentation Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.pror.reqif10.configuration.ConfigPackage#getProrToolExtension()
 * @model
 * @generated
 */
public interface ProrToolExtension extends ReqIfToolExtension {
	/**
	 * Returns the value of the '<em><b>Spec View Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.pror.reqif10.configuration.ProrSpecViewConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec View Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec View Configurations</em>' containment reference list.
	 * @see org.eclipse.rmf.pror.reqif10.configuration.ConfigPackage#getProrToolExtension_SpecViewConfigurations()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProrSpecViewConfiguration> getSpecViewConfigurations();

	/**
	 * Returns the value of the '<em><b>General Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Configuration</em>' containment reference.
	 * @see #setGeneralConfiguration(ProrGeneralConfiguration)
	 * @see org.eclipse.rmf.pror.reqif10.configuration.ConfigPackage#getProrToolExtension_GeneralConfiguration()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProrGeneralConfiguration getGeneralConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.pror.reqif10.configuration.ProrToolExtension#getGeneralConfiguration <em>General Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Configuration</em>' containment reference.
	 * @see #getGeneralConfiguration()
	 * @generated
	 */
	void setGeneralConfiguration(ProrGeneralConfiguration value);

	/**
	 * Returns the value of the '<em><b>Presentation Configurations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Configurations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Configurations</em>' containment reference.
	 * @see #setPresentationConfigurations(ProrPresentationConfigurations)
	 * @see org.eclipse.rmf.pror.reqif10.configuration.ConfigPackage#getProrToolExtension_PresentationConfigurations()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ProrPresentationConfigurations getPresentationConfigurations();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.pror.reqif10.configuration.ProrToolExtension#getPresentationConfigurations <em>Presentation Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Configurations</em>' containment reference.
	 * @see #getPresentationConfigurations()
	 * @generated
	 */
	void setPresentationConfigurations(ProrPresentationConfigurations value);

} // ProrToolExtension
