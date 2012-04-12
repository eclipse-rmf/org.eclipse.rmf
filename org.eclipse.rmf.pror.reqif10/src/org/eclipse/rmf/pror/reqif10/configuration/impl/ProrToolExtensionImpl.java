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

package org.eclipse.rmf.pror.reqif10.configuration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.rmf.pror.reqif10.configuration.ConfigurationPackage;
import org.eclipse.rmf.pror.reqif10.configuration.ProrGeneralConfiguration;
import org.eclipse.rmf.pror.reqif10.configuration.ProrPresentationConfigurations;
import org.eclipse.rmf.pror.reqif10.configuration.ProrSpecViewConfiguration;
import org.eclipse.rmf.pror.reqif10.configuration.ProrToolExtension;
import org.eclipse.rmf.reqif10.impl.ReqIFToolExtensionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pror Tool Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.pror.reqif10.configuration.impl.ProrToolExtensionImpl#getSpecViewConfigurations <em>Spec View Configurations</em>}</li>
 *   <li>{@link org.eclipse.rmf.pror.reqif10.configuration.impl.ProrToolExtensionImpl#getGeneralConfiguration <em>General Configuration</em>}</li>
 *   <li>{@link org.eclipse.rmf.pror.reqif10.configuration.impl.ProrToolExtensionImpl#getPresentationConfigurations <em>Presentation Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProrToolExtensionImpl extends ReqIFToolExtensionImpl implements ProrToolExtension {
	/**
	 * The cached value of the '{@link #getSpecViewConfigurations() <em>Spec View Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecViewConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<ProrSpecViewConfiguration> specViewConfigurations;

	/**
	 * The cached value of the '{@link #getGeneralConfiguration() <em>General Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralConfiguration()
	 * @generated
	 * @ordered
	 */
	protected ProrGeneralConfiguration generalConfiguration;

	/**
	 * The cached value of the '{@link #getPresentationConfigurations() <em>Presentation Configurations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationConfigurations()
	 * @generated
	 * @ordered
	 */
	protected ProrPresentationConfigurations presentationConfigurations;

	/**
	 * <!-- begin-user-doc -->
	 * Set to public, so that the framework can instantiate this class.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ProrToolExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.PROR_TOOL_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProrSpecViewConfiguration> getSpecViewConfigurations() {
		if (specViewConfigurations == null) {
			specViewConfigurations = new EObjectContainmentEList<ProrSpecViewConfiguration>(ProrSpecViewConfiguration.class, this, ConfigurationPackage.PROR_TOOL_EXTENSION__SPEC_VIEW_CONFIGURATIONS);
		}
		return specViewConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProrGeneralConfiguration getGeneralConfiguration() {
		return generalConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGeneralConfiguration(ProrGeneralConfiguration newGeneralConfiguration, NotificationChain msgs) {
		ProrGeneralConfiguration oldGeneralConfiguration = generalConfiguration;
		generalConfiguration = newGeneralConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PROR_TOOL_EXTENSION__GENERAL_CONFIGURATION, oldGeneralConfiguration, newGeneralConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneralConfiguration(ProrGeneralConfiguration newGeneralConfiguration) {
		if (newGeneralConfiguration != generalConfiguration) {
			NotificationChain msgs = null;
			if (generalConfiguration != null)
				msgs = ((InternalEObject)generalConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.PROR_TOOL_EXTENSION__GENERAL_CONFIGURATION, null, msgs);
			if (newGeneralConfiguration != null)
				msgs = ((InternalEObject)newGeneralConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.PROR_TOOL_EXTENSION__GENERAL_CONFIGURATION, null, msgs);
			msgs = basicSetGeneralConfiguration(newGeneralConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PROR_TOOL_EXTENSION__GENERAL_CONFIGURATION, newGeneralConfiguration, newGeneralConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProrPresentationConfigurations getPresentationConfigurations() {
		return presentationConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPresentationConfigurations(ProrPresentationConfigurations newPresentationConfigurations, NotificationChain msgs) {
		ProrPresentationConfigurations oldPresentationConfigurations = presentationConfigurations;
		presentationConfigurations = newPresentationConfigurations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PROR_TOOL_EXTENSION__PRESENTATION_CONFIGURATIONS, oldPresentationConfigurations, newPresentationConfigurations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPresentationConfigurations(ProrPresentationConfigurations newPresentationConfigurations) {
		if (newPresentationConfigurations != presentationConfigurations) {
			NotificationChain msgs = null;
			if (presentationConfigurations != null)
				msgs = ((InternalEObject)presentationConfigurations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.PROR_TOOL_EXTENSION__PRESENTATION_CONFIGURATIONS, null, msgs);
			if (newPresentationConfigurations != null)
				msgs = ((InternalEObject)newPresentationConfigurations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.PROR_TOOL_EXTENSION__PRESENTATION_CONFIGURATIONS, null, msgs);
			msgs = basicSetPresentationConfigurations(newPresentationConfigurations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PROR_TOOL_EXTENSION__PRESENTATION_CONFIGURATIONS, newPresentationConfigurations, newPresentationConfigurations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.PROR_TOOL_EXTENSION__SPEC_VIEW_CONFIGURATIONS:
				return ((InternalEList<?>)getSpecViewConfigurations()).basicRemove(otherEnd, msgs);
			case ConfigurationPackage.PROR_TOOL_EXTENSION__GENERAL_CONFIGURATION:
				return basicSetGeneralConfiguration(null, msgs);
			case ConfigurationPackage.PROR_TOOL_EXTENSION__PRESENTATION_CONFIGURATIONS:
				return basicSetPresentationConfigurations(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ConfigurationPackage.PROR_TOOL_EXTENSION__SPEC_VIEW_CONFIGURATIONS:
				return getSpecViewConfigurations();
			case ConfigurationPackage.PROR_TOOL_EXTENSION__GENERAL_CONFIGURATION:
				return getGeneralConfiguration();
			case ConfigurationPackage.PROR_TOOL_EXTENSION__PRESENTATION_CONFIGURATIONS:
				return getPresentationConfigurations();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigurationPackage.PROR_TOOL_EXTENSION__SPEC_VIEW_CONFIGURATIONS:
				getSpecViewConfigurations().clear();
				getSpecViewConfigurations().addAll((Collection<? extends ProrSpecViewConfiguration>)newValue);
				return;
			case ConfigurationPackage.PROR_TOOL_EXTENSION__GENERAL_CONFIGURATION:
				setGeneralConfiguration((ProrGeneralConfiguration)newValue);
				return;
			case ConfigurationPackage.PROR_TOOL_EXTENSION__PRESENTATION_CONFIGURATIONS:
				setPresentationConfigurations((ProrPresentationConfigurations)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ConfigurationPackage.PROR_TOOL_EXTENSION__SPEC_VIEW_CONFIGURATIONS:
				getSpecViewConfigurations().clear();
				return;
			case ConfigurationPackage.PROR_TOOL_EXTENSION__GENERAL_CONFIGURATION:
				setGeneralConfiguration((ProrGeneralConfiguration)null);
				return;
			case ConfigurationPackage.PROR_TOOL_EXTENSION__PRESENTATION_CONFIGURATIONS:
				setPresentationConfigurations((ProrPresentationConfigurations)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ConfigurationPackage.PROR_TOOL_EXTENSION__SPEC_VIEW_CONFIGURATIONS:
				return specViewConfigurations != null && !specViewConfigurations.isEmpty();
			case ConfigurationPackage.PROR_TOOL_EXTENSION__GENERAL_CONFIGURATION:
				return generalConfiguration != null;
			case ConfigurationPackage.PROR_TOOL_EXTENSION__PRESENTATION_CONFIGURATIONS:
				return presentationConfigurations != null;
		}
		return super.eIsSet(featureID);
	}

} //ProrToolExtensionImpl
