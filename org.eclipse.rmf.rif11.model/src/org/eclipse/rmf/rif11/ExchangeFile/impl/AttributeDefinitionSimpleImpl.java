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

package org.eclipse.rmf.rif11.ExchangeFile.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeDefinitionSimple;
import org.eclipse.rmf.rif11.ExchangeFile.AttributeValueSimple;
import org.eclipse.rmf.rif11.ExchangeFile.DatatypeDefinitionSimple;
import org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Definition Simple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeDefinitionSimpleImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.AttributeDefinitionSimpleImpl#getDefaultValue <em>Default Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeDefinitionSimpleImpl extends AttributeDefinitionImpl implements AttributeDefinitionSimple {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected DatatypeDefinitionSimple type;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected AttributeValueSimple defaultValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDefinitionSimpleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExchangeFilePackage.Literals.ATTRIBUTE_DEFINITION_SIMPLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionSimple getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (DatatypeDefinitionSimple)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExchangeFilePackage.ATTRIBUTE_DEFINITION_SIMPLE__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatatypeDefinitionSimple basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(DatatypeDefinitionSimple newType) {
		DatatypeDefinitionSimple oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.ATTRIBUTE_DEFINITION_SIMPLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeValueSimple getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefaultValue(AttributeValueSimple newDefaultValue, NotificationChain msgs) {
		AttributeValueSimple oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE, oldDefaultValue, newDefaultValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(AttributeValueSimple newDefaultValue) {
		if (newDefaultValue != defaultValue) {
			NotificationChain msgs = null;
			if (defaultValue != null)
				msgs = ((InternalEObject)defaultValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExchangeFilePackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE, null, msgs);
			if (newDefaultValue != null)
				msgs = ((InternalEObject)newDefaultValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExchangeFilePackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE, null, msgs);
			msgs = basicSetDefaultValue(newDefaultValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE, newDefaultValue, newDefaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExchangeFilePackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE:
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
			case ExchangeFilePackage.ATTRIBUTE_DEFINITION_SIMPLE__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ExchangeFilePackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE:
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
			case ExchangeFilePackage.ATTRIBUTE_DEFINITION_SIMPLE__TYPE:
				setType((DatatypeDefinitionSimple)newValue);
				return;
			case ExchangeFilePackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE:
				setDefaultValue((AttributeValueSimple)newValue);
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
			case ExchangeFilePackage.ATTRIBUTE_DEFINITION_SIMPLE__TYPE:
				setType((DatatypeDefinitionSimple)null);
				return;
			case ExchangeFilePackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE:
				setDefaultValue((AttributeValueSimple)null);
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
			case ExchangeFilePackage.ATTRIBUTE_DEFINITION_SIMPLE__TYPE:
				return type != null;
			case ExchangeFilePackage.ATTRIBUTE_DEFINITION_SIMPLE__DEFAULT_VALUE:
				return defaultValue != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeDefinitionSimpleImpl
