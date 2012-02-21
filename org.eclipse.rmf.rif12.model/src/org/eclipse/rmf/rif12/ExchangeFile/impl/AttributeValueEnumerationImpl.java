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
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeDefinitionEnumeration;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValueEnumeration;
import org.eclipse.rmf.rif12.ExchangeFile.EnumValue;
import org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.AttributeValueEnumerationImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.AttributeValueEnumerationImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueEnumerationImpl extends AttributeValueImpl implements AttributeValueEnumeration {
	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<EnumValue> values;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected AttributeDefinitionEnumeration definition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueEnumerationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExchangeFilePackage.Literals.ATTRIBUTE_VALUE_ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumValue> getValues() {
		if (values == null) {
			values = new EObjectResolvingEList<EnumValue>(EnumValue.class, this, ExchangeFilePackage.ATTRIBUTE_VALUE_ENUMERATION__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionEnumeration getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (AttributeDefinitionEnumeration)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExchangeFilePackage.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionEnumeration basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(AttributeDefinitionEnumeration newDefinition) {
		AttributeDefinitionEnumeration oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExchangeFilePackage.ATTRIBUTE_VALUE_ENUMERATION__VALUES:
				return getValues();
			case ExchangeFilePackage.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
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
			case ExchangeFilePackage.ATTRIBUTE_VALUE_ENUMERATION__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends EnumValue>)newValue);
				return;
			case ExchangeFilePackage.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION:
				setDefinition((AttributeDefinitionEnumeration)newValue);
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
			case ExchangeFilePackage.ATTRIBUTE_VALUE_ENUMERATION__VALUES:
				getValues().clear();
				return;
			case ExchangeFilePackage.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION:
				setDefinition((AttributeDefinitionEnumeration)null);
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
			case ExchangeFilePackage.ATTRIBUTE_VALUE_ENUMERATION__VALUES:
				return values != null && !values.isEmpty();
			case ExchangeFilePackage.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION:
				return definition != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeValueEnumerationImpl
