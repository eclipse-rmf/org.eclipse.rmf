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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.rmf.reqif10.pror.configuration.ConfigurationPackage;
import org.eclipse.rmf.reqif10.pror.configuration.LabelConfiguration;
import org.eclipse.rmf.reqif10.pror.configuration.ProrGeneralConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pror General Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.pror.configuration.impl.ProrGeneralConfigurationImpl#getLabelConfiguration <em>Label Configuration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProrGeneralConfigurationImpl extends EObjectImpl implements ProrGeneralConfiguration {
	/**
	 * The cached value of the '{@link #getLabelConfiguration() <em>Label Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelConfiguration()
	 * @generated
	 * @ordered
	 */
	protected LabelConfiguration labelConfiguration;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProrGeneralConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConfigurationPackage.Literals.PROR_GENERAL_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelConfiguration getLabelConfiguration() {
		return labelConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelConfiguration(LabelConfiguration newLabelConfiguration, NotificationChain msgs) {
		LabelConfiguration oldLabelConfiguration = labelConfiguration;
		labelConfiguration = newLabelConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PROR_GENERAL_CONFIGURATION__LABEL_CONFIGURATION, oldLabelConfiguration, newLabelConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelConfiguration(LabelConfiguration newLabelConfiguration) {
		if (newLabelConfiguration != labelConfiguration) {
			NotificationChain msgs = null;
			if (labelConfiguration != null)
				msgs = ((InternalEObject)labelConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.PROR_GENERAL_CONFIGURATION__LABEL_CONFIGURATION, null, msgs);
			if (newLabelConfiguration != null)
				msgs = ((InternalEObject)newLabelConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ConfigurationPackage.PROR_GENERAL_CONFIGURATION__LABEL_CONFIGURATION, null, msgs);
			msgs = basicSetLabelConfiguration(newLabelConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ConfigurationPackage.PROR_GENERAL_CONFIGURATION__LABEL_CONFIGURATION, newLabelConfiguration, newLabelConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ConfigurationPackage.PROR_GENERAL_CONFIGURATION__LABEL_CONFIGURATION:
				return basicSetLabelConfiguration(null, msgs);
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
			case ConfigurationPackage.PROR_GENERAL_CONFIGURATION__LABEL_CONFIGURATION:
				return getLabelConfiguration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ConfigurationPackage.PROR_GENERAL_CONFIGURATION__LABEL_CONFIGURATION:
				setLabelConfiguration((LabelConfiguration)newValue);
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
			case ConfigurationPackage.PROR_GENERAL_CONFIGURATION__LABEL_CONFIGURATION:
				setLabelConfiguration((LabelConfiguration)null);
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
			case ConfigurationPackage.PROR_GENERAL_CONFIGURATION__LABEL_CONFIGURATION:
				return labelConfiguration != null;
		}
		return super.eIsSet(featureID);
	}

} //ProrGeneralConfigurationImpl
