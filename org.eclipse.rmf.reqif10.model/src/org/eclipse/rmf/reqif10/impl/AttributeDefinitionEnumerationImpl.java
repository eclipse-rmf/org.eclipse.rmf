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

import org.eclipse.rmf.reqif10.AttributeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.AttributeValueEnumeration;
import org.eclipse.rmf.reqif10.DatatypeDefinitionEnumeration;
import org.eclipse.rmf.reqif10.Reqif10Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Definition Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionEnumerationImpl#getMultiValued <em>Multi Valued</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionEnumerationImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AttributeDefinitionEnumerationImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDefinitionEnumerationImpl extends AttributeDefinitionImpl implements AttributeDefinitionEnumeration {
	/**
	 * The default value of the '{@link #getMultiValued() <em>Multi Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiValued()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MULTI_VALUED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMultiValued() <em>Multi Valued</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiValued()
	 * @generated
	 * @ordered
	 */
	protected Boolean multiValued = MULTI_VALUED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DatatypeDefinitionEnumeration type;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected AttributeValueEnumeration defaultValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDefinitionEnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Reqif10Package.Literals.ATTRIBUTE_DEFINITION_ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMultiValued() {
		return multiValued;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiValued(Boolean newMultiValued) {
		Boolean oldMultiValued = multiValued;
		multiValued = newMultiValued;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__MULTI_VALUED, oldMultiValued, multiValued));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionEnumeration getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (DatatypeDefinitionEnumeration)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionEnumeration basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DatatypeDefinitionEnumeration newType) {
		DatatypeDefinitionEnumeration oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueEnumeration getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(AttributeValueEnumeration newDefaultValue, NotificationChain msgs) {
		AttributeValueEnumeration oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(AttributeValueEnumeration newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__OWNING_DEFINITION, AttributeValueEnumeration.class, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__OWNING_DEFINITION, AttributeValueEnumeration.class, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULT_VALUE:
				if (defaultValue != null)
					msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULT_VALUE, null, msgs);
				return basicSetDefaultValue((AttributeValueEnumeration)otherEnd, msgs);
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
			case Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULT_VALUE:
				return basicSetDefaultValue(null, msgs);
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
			case Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__MULTI_VALUED:
				return getMultiValued();
			case Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULT_VALUE:
				return getDefaultValue();
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
			case Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__MULTI_VALUED:
				setMultiValued((Boolean)newValue);
				return;
			case Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__TYPE:
				setType((DatatypeDefinitionEnumeration)newValue);
				return;
			case Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULT_VALUE:
				setDefaultValue((AttributeValueEnumeration)newValue);
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
			case Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__MULTI_VALUED:
				setMultiValued(MULTI_VALUED_EDEFAULT);
				return;
			case Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__TYPE:
				setType((DatatypeDefinitionEnumeration)null);
				return;
			case Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULT_VALUE:
				setDefaultValue((AttributeValueEnumeration)null);
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
			case Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__MULTI_VALUED:
				return MULTI_VALUED_EDEFAULT == null ? multiValued != null : !MULTI_VALUED_EDEFAULT.equals(multiValued);
			case Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__TYPE:
				return type != null;
			case Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULT_VALUE:
				return defaultValue != null;
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
		result.append(" (multiValued: ");
		result.append(multiValued);
		result.append(')');
		return result.toString();
	}

} //AttributeDefinitionEnumerationImpl
