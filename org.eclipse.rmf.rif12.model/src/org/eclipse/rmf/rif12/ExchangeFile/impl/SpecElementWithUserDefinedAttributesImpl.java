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

package org.eclipse.rmf.rif12.ExchangeFile.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValue;
import org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage;
import org.eclipse.rmf.rif12.ExchangeFile.SpecElementWithUserDefinedAttributes;
import org.eclipse.rmf.rif12.ExchangeFile.SpecType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec Element With User Defined Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.SpecElementWithUserDefinedAttributesImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.SpecElementWithUserDefinedAttributesImpl#getValues <em>Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SpecElementWithUserDefinedAttributesImpl extends IdentifiableImpl implements SpecElementWithUserDefinedAttributes {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected SpecType type;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeValue> values;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecElementWithUserDefinedAttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExchangeFilePackage.Literals.SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (SpecType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExchangeFilePackage.SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(SpecType newType) {
		SpecType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValue> getValues() {
		if (values == null) {
			values = new EObjectContainmentEList<AttributeValue>(AttributeValue.class, this, ExchangeFilePackage.SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExchangeFilePackage.SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__VALUES:
				return ((InternalEList<?>)getValues()).basicRemove(otherEnd, msgs);
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
			case ExchangeFilePackage.SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case ExchangeFilePackage.SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__VALUES:
				return getValues();
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
			case ExchangeFilePackage.SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__TYPE:
				setType((SpecType)newValue);
				return;
			case ExchangeFilePackage.SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends AttributeValue>)newValue);
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
			case ExchangeFilePackage.SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__TYPE:
				setType((SpecType)null);
				return;
			case ExchangeFilePackage.SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__VALUES:
				getValues().clear();
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
			case ExchangeFilePackage.SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__TYPE:
				return type != null;
			case ExchangeFilePackage.SPEC_ELEMENT_WITH_USER_DEFINED_ATTRIBUTES__VALUES:
				return values != null && !values.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecElementWithUserDefinedAttributesImpl
