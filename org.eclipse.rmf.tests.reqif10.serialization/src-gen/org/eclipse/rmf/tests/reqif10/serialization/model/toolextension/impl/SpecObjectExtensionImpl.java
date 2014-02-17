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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.rmf.reqif10.SpecObject;

import org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.SpecObjectExtension;
import org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.ToolextensionPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec Object Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl.SpecObjectExtensionImpl#getExtendedDesc <em>Extended Desc</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.reqif10.serialization.model.toolextension.impl.SpecObjectExtensionImpl#getExtendedSpecObject <em>Extended Spec Object</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecObjectExtensionImpl extends EObjectImpl implements SpecObjectExtension {
	/**
	 * The default value of the '{@link #getExtendedDesc() <em>Extended Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTENDED_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExtendedDesc() <em>Extended Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedDesc()
	 * @generated
	 * @ordered
	 */
	protected String extendedDesc = EXTENDED_DESC_EDEFAULT;

	/**
	 * The cached value of the '{@link #getExtendedSpecObject() <em>Extended Spec Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtendedSpecObject()
	 * @generated
	 * @ordered
	 */
	protected SpecObject extendedSpecObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecObjectExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ToolextensionPackage.Literals.SPEC_OBJECT_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExtendedDesc() {
		return extendedDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedDesc(String newExtendedDesc) {
		String oldExtendedDesc = extendedDesc;
		extendedDesc = newExtendedDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolextensionPackage.SPEC_OBJECT_EXTENSION__EXTENDED_DESC, oldExtendedDesc, extendedDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecObject getExtendedSpecObject() {
		if (extendedSpecObject != null && extendedSpecObject.eIsProxy()) {
			InternalEObject oldExtendedSpecObject = (InternalEObject)extendedSpecObject;
			extendedSpecObject = (SpecObject)eResolveProxy(oldExtendedSpecObject);
			if (extendedSpecObject != oldExtendedSpecObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ToolextensionPackage.SPEC_OBJECT_EXTENSION__EXTENDED_SPEC_OBJECT, oldExtendedSpecObject, extendedSpecObject));
			}
		}
		return extendedSpecObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecObject basicGetExtendedSpecObject() {
		return extendedSpecObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExtendedSpecObject(SpecObject newExtendedSpecObject) {
		SpecObject oldExtendedSpecObject = extendedSpecObject;
		extendedSpecObject = newExtendedSpecObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ToolextensionPackage.SPEC_OBJECT_EXTENSION__EXTENDED_SPEC_OBJECT, oldExtendedSpecObject, extendedSpecObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ToolextensionPackage.SPEC_OBJECT_EXTENSION__EXTENDED_DESC:
				return getExtendedDesc();
			case ToolextensionPackage.SPEC_OBJECT_EXTENSION__EXTENDED_SPEC_OBJECT:
				if (resolve) return getExtendedSpecObject();
				return basicGetExtendedSpecObject();
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
			case ToolextensionPackage.SPEC_OBJECT_EXTENSION__EXTENDED_DESC:
				setExtendedDesc((String)newValue);
				return;
			case ToolextensionPackage.SPEC_OBJECT_EXTENSION__EXTENDED_SPEC_OBJECT:
				setExtendedSpecObject((SpecObject)newValue);
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
			case ToolextensionPackage.SPEC_OBJECT_EXTENSION__EXTENDED_DESC:
				setExtendedDesc(EXTENDED_DESC_EDEFAULT);
				return;
			case ToolextensionPackage.SPEC_OBJECT_EXTENSION__EXTENDED_SPEC_OBJECT:
				setExtendedSpecObject((SpecObject)null);
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
			case ToolextensionPackage.SPEC_OBJECT_EXTENSION__EXTENDED_DESC:
				return EXTENDED_DESC_EDEFAULT == null ? extendedDesc != null : !EXTENDED_DESC_EDEFAULT.equals(extendedDesc);
			case ToolextensionPackage.SPEC_OBJECT_EXTENSION__EXTENDED_SPEC_OBJECT:
				return extendedSpecObject != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (extendedDesc: ");
		result.append(extendedDesc);
		result.append(')');
		return result.toString();
	}

} //SpecObjectExtensionImpl
