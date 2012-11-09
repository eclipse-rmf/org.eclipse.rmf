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

package org.eclipse.rmf.reqif10.pror.configuration.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrPresentationConfigurations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pror Presentation Configurations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.impl.ProrPresentationConfigurationsImpl#getPresentationConfigurations <em>Presentation Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProrPresentationConfigurationsImpl extends EObjectImpl implements ProrPresentationConfigurations {
	/**
	 * The cached value of the '{@link #getPresentationConfigurations() <em>Presentation Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPresentationConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<ProrPresentationConfiguration> presentationConfigurations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProrPresentationConfigurationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.PROR_PRESENTATION_CONFIGURATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProrPresentationConfiguration> getPresentationConfigurations() {
		if (presentationConfigurations == null) {
			presentationConfigurations = new EObjectContainmentEList<ProrPresentationConfiguration>(ProrPresentationConfiguration.class, this, ConfigurationPackage.PROR_PRESENTATION_CONFIGURATIONS__PRESENTATION_CONFIGURATIONS);
		}
		return presentationConfigurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.PROR_PRESENTATION_CONFIGURATIONS__PRESENTATION_CONFIGURATIONS:
				return ((InternalEList<?>)getPresentationConfigurations()).basicRemove(otherEnd, msgs);
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
			case ConfigurationPackage.PROR_PRESENTATION_CONFIGURATIONS__PRESENTATION_CONFIGURATIONS:
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
			case ConfigurationPackage.PROR_PRESENTATION_CONFIGURATIONS__PRESENTATION_CONFIGURATIONS:
				getPresentationConfigurations().clear();
				getPresentationConfigurations().addAll((Collection<? extends ProrPresentationConfiguration>)newValue);
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
			case ConfigurationPackage.PROR_PRESENTATION_CONFIGURATIONS__PRESENTATION_CONFIGURATIONS:
				getPresentationConfigurations().clear();
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
			case ConfigurationPackage.PROR_PRESENTATION_CONFIGURATIONS__PRESENTATION_CONFIGURATIONS:
				return presentationConfigurations != null && !presentationConfigurations.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ProrPresentationConfigurationsImpl
