/*******************************************************************************
 * Copyright (c) 2014 itemis AG and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Mark Broerkens (itemis AG) - initial API and implementation
 *******************************************************************************/
/**
 */
package org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.Extension;
import org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.SpecObjectExtension;
import org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.ToolextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl.ExtensionImpl#getSpecObjectExtensions <em>Spec Object Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExtensionImpl extends EObjectImpl implements Extension {
	/**
	 * The cached value of the '{@link #getSpecObjectExtensions() <em>Spec Object Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecObjectExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecObjectExtension> specObjectExtensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolextensionPackage.Literals.EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecObjectExtension> getSpecObjectExtensions() {
		if (specObjectExtensions == null) {
			specObjectExtensions = new EObjectContainmentEList.Unsettable<SpecObjectExtension>(SpecObjectExtension.class, this, ToolextensionPackage.EXTENSION__SPEC_OBJECT_EXTENSIONS);
		}
		return specObjectExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpecObjectExtensions() {
		if (specObjectExtensions != null) ((InternalEList.Unsettable<?>)specObjectExtensions).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpecObjectExtensions() {
		return specObjectExtensions != null && ((InternalEList.Unsettable<?>)specObjectExtensions).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ToolextensionPackage.EXTENSION__SPEC_OBJECT_EXTENSIONS:
				return ((InternalEList<?>)getSpecObjectExtensions()).basicRemove(otherEnd, msgs);
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
			case ToolextensionPackage.EXTENSION__SPEC_OBJECT_EXTENSIONS:
				return getSpecObjectExtensions();
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
			case ToolextensionPackage.EXTENSION__SPEC_OBJECT_EXTENSIONS:
				getSpecObjectExtensions().clear();
				getSpecObjectExtensions().addAll((Collection<? extends SpecObjectExtension>)newValue);
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
			case ToolextensionPackage.EXTENSION__SPEC_OBJECT_EXTENSIONS:
				unsetSpecObjectExtensions();
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
			case ToolextensionPackage.EXTENSION__SPEC_OBJECT_EXTENSIONS:
				return isSetSpecObjectExtensions();
		}
		return super.eIsSet(featureID);
	}

} //ExtensionImpl
