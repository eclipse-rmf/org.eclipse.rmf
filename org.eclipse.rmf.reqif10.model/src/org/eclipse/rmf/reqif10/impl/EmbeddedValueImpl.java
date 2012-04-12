/*******************************************************************************
 * Copyright (c) 2011 itemis GmbH.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Nirmal Sasidharan - initial API and implementation
 ******************************************************************************/

package org.eclipse.rmf.reqif10.impl;

import org.eclipse.rmf.reqif10.EmbeddedValue;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.Reqif10Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Embedded Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.EmbeddedValueImpl#getKey <em>Key</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.EmbeddedValueImpl#getOtherContent <em>Other Content</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.EmbeddedValueImpl#getEnumValue <em>Enum Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmbeddedValueImpl extends EObjectImpl implements EmbeddedValue {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final Object KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected Object key = KEY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOtherContent() <em>Other Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherContent()
	 * @generated
	 * @ordered
	 */
	protected static final Object OTHER_CONTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOtherContent() <em>Other Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherContent()
	 * @generated
	 * @ordered
	 */
	protected Object otherContent = OTHER_CONTENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmbeddedValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Reqif10Package.Literals.EMBEDDED_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKey(Object newKey) {
		Object oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.EMBEDDED_VALUE__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getOtherContent() {
		return otherContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOtherContent(Object newOtherContent) {
		Object oldOtherContent = otherContent;
		otherContent = newOtherContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.EMBEDDED_VALUE__OTHER_CONTENT, oldOtherContent, otherContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumValue getEnumValue() {
		if (eContainerFeatureID() != Reqif10Package.EMBEDDED_VALUE__ENUM_VALUE) return null;
		return (EnumValue)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumValue(EnumValue newEnumValue, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newEnumValue, Reqif10Package.EMBEDDED_VALUE__ENUM_VALUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumValue(EnumValue newEnumValue) {
		if (newEnumValue != eInternalContainer() || (eContainerFeatureID() != Reqif10Package.EMBEDDED_VALUE__ENUM_VALUE && newEnumValue != null)) {
			if (EcoreUtil.isAncestor(this, newEnumValue))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newEnumValue != null)
				msgs = ((InternalEObject)newEnumValue).eInverseAdd(this, Reqif10Package.ENUM_VALUE__PROPERTIES, EnumValue.class, msgs);
			msgs = basicSetEnumValue(newEnumValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.EMBEDDED_VALUE__ENUM_VALUE, newEnumValue, newEnumValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Reqif10Package.EMBEDDED_VALUE__ENUM_VALUE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetEnumValue((EnumValue)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Reqif10Package.EMBEDDED_VALUE__ENUM_VALUE:
				return basicSetEnumValue(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Reqif10Package.EMBEDDED_VALUE__ENUM_VALUE:
				return eInternalContainer().eInverseRemove(this, Reqif10Package.ENUM_VALUE__PROPERTIES, EnumValue.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Reqif10Package.EMBEDDED_VALUE__KEY:
				return getKey();
			case Reqif10Package.EMBEDDED_VALUE__OTHER_CONTENT:
				return getOtherContent();
			case Reqif10Package.EMBEDDED_VALUE__ENUM_VALUE:
				return getEnumValue();
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
			case Reqif10Package.EMBEDDED_VALUE__KEY:
				setKey(newValue);
				return;
			case Reqif10Package.EMBEDDED_VALUE__OTHER_CONTENT:
				setOtherContent(newValue);
				return;
			case Reqif10Package.EMBEDDED_VALUE__ENUM_VALUE:
				setEnumValue((EnumValue)newValue);
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
			case Reqif10Package.EMBEDDED_VALUE__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case Reqif10Package.EMBEDDED_VALUE__OTHER_CONTENT:
				setOtherContent(OTHER_CONTENT_EDEFAULT);
				return;
			case Reqif10Package.EMBEDDED_VALUE__ENUM_VALUE:
				setEnumValue((EnumValue)null);
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
			case Reqif10Package.EMBEDDED_VALUE__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case Reqif10Package.EMBEDDED_VALUE__OTHER_CONTENT:
				return OTHER_CONTENT_EDEFAULT == null ? otherContent != null : !OTHER_CONTENT_EDEFAULT.equals(otherContent);
			case Reqif10Package.EMBEDDED_VALUE__ENUM_VALUE:
				return getEnumValue() != null;
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
		result.append(" (key: ");
		result.append(key);
		result.append(", otherContent: ");
		result.append(otherContent);
		result.append(')');
		return result.toString();
	}

} //EmbeddedValueImpl
