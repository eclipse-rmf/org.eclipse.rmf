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
import org.eclipse.rmf.reqif10.EnumValue;
import org.eclipse.rmf.reqif10.Reqif10Package;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Enumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AttributeValueEnumerationImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AttributeValueEnumerationImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AttributeValueEnumerationImpl#getOwningDefinition <em>Owning Definition</em>}</li>
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
		return Reqif10Package.Literals.ATTRIBUTE_VALUE_ENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnumValue> getValues() {
		if (values == null) {
			values = new EObjectResolvingEList<EnumValue>(EnumValue.class, this, Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__VALUES);
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION, oldDefinition, definition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionEnumeration getOwningDefinition() {
		if (eContainerFeatureID() != Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__OWNING_DEFINITION) return null;
		return (AttributeDefinitionEnumeration)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningDefinition(AttributeDefinitionEnumeration newOwningDefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningDefinition, Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__OWNING_DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningDefinition(AttributeDefinitionEnumeration newOwningDefinition) {
		if (newOwningDefinition != eInternalContainer() || (eContainerFeatureID() != Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__OWNING_DEFINITION && newOwningDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newOwningDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningDefinition != null)
				msgs = ((InternalEObject)newOwningDefinition).eInverseAdd(this, Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULT_VALUE, AttributeDefinitionEnumeration.class, msgs);
			msgs = basicSetOwningDefinition(newOwningDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__OWNING_DEFINITION, newOwningDefinition, newOwningDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__OWNING_DEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningDefinition((AttributeDefinitionEnumeration)otherEnd, msgs);
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
			case Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__OWNING_DEFINITION:
				return basicSetOwningDefinition(null, msgs);
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
			case Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__OWNING_DEFINITION:
				return eInternalContainer().eInverseRemove(this, Reqif10Package.ATTRIBUTE_DEFINITION_ENUMERATION__DEFAULT_VALUE, AttributeDefinitionEnumeration.class, msgs);
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
			case Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__VALUES:
				return getValues();
			case Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__OWNING_DEFINITION:
				return getOwningDefinition();
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
			case Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends EnumValue>)newValue);
				return;
			case Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION:
				setDefinition((AttributeDefinitionEnumeration)newValue);
				return;
			case Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__OWNING_DEFINITION:
				setOwningDefinition((AttributeDefinitionEnumeration)newValue);
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
			case Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__VALUES:
				getValues().clear();
				return;
			case Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION:
				setDefinition((AttributeDefinitionEnumeration)null);
				return;
			case Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__OWNING_DEFINITION:
				setOwningDefinition((AttributeDefinitionEnumeration)null);
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
			case Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__VALUES:
				return values != null && !values.isEmpty();
			case Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__DEFINITION:
				return definition != null;
			case Reqif10Package.ATTRIBUTE_VALUE_ENUMERATION__OWNING_DEFINITION:
				return getOwningDefinition() != null;
		}
		return super.eIsSet(featureID);
	}

} //AttributeValueEnumerationImpl
