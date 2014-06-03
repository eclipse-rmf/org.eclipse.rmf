/*******************************************************************************
 * Copyright (c) 2011, 2013 Formal Mind GmbH and University of Dusseldorf.
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
 * A representation of the model object '<em><b>Pror Tool Extension</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension#getSpecViewConfigurations <em>Spec View Configurations</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension#getGeneralConfiguration <em>General Configuration</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension#getPresentationConfigurations <em>Presentation Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getProrToolExtension()
 * @model
 * @generated
 */
public interface ProrToolExtension extends EObject {
	/**
	 * Returns the value of the '<em><b>Spec View Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.rmf.reqif10.pror.configuration.ProrSpecViewConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spec View Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spec View Configurations</em>' containment reference list.
	 * @see #isSetSpecViewConfigurations()
	 * @see #unsetSpecViewConfigurations()
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getProrToolExtension_SpecViewConfigurations()
	 * @model containment="true" unsettable="true"
	 *        extendedMetaData="name='specViewConfigurations' kind='element' namespace='##targetNamespace'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='specViewConfigurations' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	EList<ProrSpecViewConfiguration> getSpecViewConfigurations();

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension#getSpecViewConfigurations <em>Spec View Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSpecViewConfigurations()
	 * @see #getSpecViewConfigurations()
	 * @generated
	 */
	void unsetSpecViewConfigurations();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension#getSpecViewConfigurations <em>Spec View Configurations</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Spec View Configurations</em>' containment reference list is set.
	 * @see #unsetSpecViewConfigurations()
	 * @see #getSpecViewConfigurations()
	 * @generated
	 */
	boolean isSetSpecViewConfigurations();

	/**
	 * Returns the value of the '<em><b>General Configuration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>General Configuration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>General Configuration</em>' containment reference.
	 * @see #isSetGeneralConfiguration()
	 * @see #unsetGeneralConfiguration()
	 * @see #setGeneralConfiguration(ProrGeneralConfiguration)
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getProrToolExtension_GeneralConfiguration()
	 * @model containment="true" unsettable="true" required="true"
	 *        extendedMetaData="name='generalConfiguration' kind='element' namespace='##targetNamespace'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='generalConfiguration' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	ProrGeneralConfiguration getGeneralConfiguration();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension#getGeneralConfiguration <em>General Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>General Configuration</em>' containment reference.
	 * @see #isSetGeneralConfiguration()
	 * @see #unsetGeneralConfiguration()
	 * @see #getGeneralConfiguration()
	 * @generated
	 */
	void setGeneralConfiguration(ProrGeneralConfiguration value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension#getGeneralConfiguration <em>General Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetGeneralConfiguration()
	 * @see #getGeneralConfiguration()
	 * @see #setGeneralConfiguration(ProrGeneralConfiguration)
	 * @generated
	 */
	void unsetGeneralConfiguration();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension#getGeneralConfiguration <em>General Configuration</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>General Configuration</em>' containment reference is set.
	 * @see #unsetGeneralConfiguration()
	 * @see #getGeneralConfiguration()
	 * @see #setGeneralConfiguration(ProrGeneralConfiguration)
	 * @generated
	 */
	boolean isSetGeneralConfiguration();

	/**
	 * Returns the value of the '<em><b>Presentation Configurations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Presentation Configurations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Presentation Configurations</em>' containment reference.
	 * @see #isSetPresentationConfigurations()
	 * @see #unsetPresentationConfigurations()
	 * @see #setPresentationConfigurations(ProrPresentationConfigurations)
	 * @see org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage#getProrToolExtension_PresentationConfigurations()
	 * @model containment="true" unsettable="true" required="true"
	 *        extendedMetaData="name='presentationConfigurations' kind='element' namespace='##targetNamespace'"
	 *        annotation="http:///org/eclipse/sphinx/emf/serialization/XMLPersistenceMappingExtendedMetaData wrapperName='presentationConfigurations' featureWrapperElement='true' featureElement='false' classifierWrapperElement='false' classifierElement='true'"
	 * @generated
	 */
	ProrPresentationConfigurations getPresentationConfigurations();

	/**
	 * Sets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension#getPresentationConfigurations <em>Presentation Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Presentation Configurations</em>' containment reference.
	 * @see #isSetPresentationConfigurations()
	 * @see #unsetPresentationConfigurations()
	 * @see #getPresentationConfigurations()
	 * @generated
	 */
	void setPresentationConfigurations(ProrPresentationConfigurations value);

	/**
	 * Unsets the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension#getPresentationConfigurations <em>Presentation Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPresentationConfigurations()
	 * @see #getPresentationConfigurations()
	 * @see #setPresentationConfigurations(ProrPresentationConfigurations)
	 * @generated
	 */
	void unsetPresentationConfigurations();

	/**
	 * Returns whether the value of the '{@link org.eclipse.rmf.reqif10.pror.configuration.ProrToolExtension#getPresentationConfigurations <em>Presentation Configurations</em>}' containment reference is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Presentation Configurations</em>' containment reference is set.
	 * @see #unsetPresentationConfigurations()
	 * @see #getPresentationConfigurations()
	 * @see #setPresentationConfigurations(ProrPresentationConfigurations)
	 * @generated
	 */
	boolean isSetPresentationConfigurations();

} // ProrToolExtension
