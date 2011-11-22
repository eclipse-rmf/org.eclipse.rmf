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

import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.EmbeddedValue;
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.Reqif10Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Enum Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.EnumValueImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.EnumValueImpl#get_ <em></em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EnumValueImpl extends IdentifiableImpl implements EnumValue {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EmbeddedValue properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnumValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Reqif10Package.Literals.ENUM_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmbeddedValue getProperties() {
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProperties(EmbeddedValue newProperties, NotificationChain msgs) {
		EmbeddedValue oldProperties = properties;
		properties = newProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Reqif10Package.ENUM_VALUE__PROPERTIES, oldProperties, newProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProperties(EmbeddedValue newProperties) {
		if (newProperties != properties) {
			NotificationChain msgs = null;
			if (properties != null)
				msgs = ((InternalEObject)properties).eInverseRemove(this, Reqif10Package.EMBEDDED_VALUE__ENUM_VALUE, EmbeddedValue.class, msgs);
			if (newProperties != null)
				msgs = ((InternalEObject)newProperties).eInverseAdd(this, Reqif10Package.EMBEDDED_VALUE__ENUM_VALUE, EmbeddedValue.class, msgs);
			msgs = basicSetProperties(newProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.ENUM_VALUE__PROPERTIES, newProperties, newProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionEnumeration get_() {
		if (eContainerFeatureID() != Reqif10Package.ENUM_VALUE__) return null;
		return (DatatypeDefinitionEnumeration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSet_(DatatypeDefinitionEnumeration new_, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)new_, Reqif10Package.ENUM_VALUE__, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_(DatatypeDefinitionEnumeration new_) {
		if (new_ != eInternalContainer() || (eContainerFeatureID() != Reqif10Package.ENUM_VALUE__ && new_ != null)) {
			if (EcoreUtil.isAncestor(this, new_))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (new_ != null)
				msgs = ((InternalEObject)new_).eInverseAdd(this, Reqif10Package.DATATYPE_DEFINITION_ENUMERATION__SPECIFIED_VALUES, DatatypeDefinitionEnumeration.class, msgs);
			msgs = basicSet_(new_, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.ENUM_VALUE__, new_, new_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Reqif10Package.ENUM_VALUE__PROPERTIES:
				if (properties != null)
					msgs = ((InternalEObject)properties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Reqif10Package.ENUM_VALUE__PROPERTIES, null, msgs);
				return basicSetProperties((EmbeddedValue)otherEnd, msgs);
			case Reqif10Package.ENUM_VALUE__:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSet_((DatatypeDefinitionEnumeration)otherEnd, msgs);
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
			case Reqif10Package.ENUM_VALUE__PROPERTIES:
				return basicSetProperties(null, msgs);
			case Reqif10Package.ENUM_VALUE__:
				return basicSet_(null, msgs);
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
			case Reqif10Package.ENUM_VALUE__:
				return eInternalContainer().eInverseRemove(this, Reqif10Package.DATATYPE_DEFINITION_ENUMERATION__SPECIFIED_VALUES, DatatypeDefinitionEnumeration.class, msgs);
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
			case Reqif10Package.ENUM_VALUE__PROPERTIES:
				return getProperties();
			case Reqif10Package.ENUM_VALUE__:
				return get_();
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
			case Reqif10Package.ENUM_VALUE__PROPERTIES:
				setProperties((EmbeddedValue)newValue);
				return;
			case Reqif10Package.ENUM_VALUE__:
				set_((DatatypeDefinitionEnumeration)newValue);
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
			case Reqif10Package.ENUM_VALUE__PROPERTIES:
				setProperties((EmbeddedValue)null);
				return;
			case Reqif10Package.ENUM_VALUE__:
				set_((DatatypeDefinitionEnumeration)null);
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
			case Reqif10Package.ENUM_VALUE__PROPERTIES:
				return properties != null;
			case Reqif10Package.ENUM_VALUE__:
				return get_() != null;
		}
		return super.eIsSet(featureID);
	}

} //EnumValueImpl
