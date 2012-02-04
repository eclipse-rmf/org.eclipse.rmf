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

import java.math.BigInteger;
import org.eclipse.rmf.reqif10.AttributeDefinitionInteger;
import org.eclipse.rmf.reqif10.AttributeValueInteger;
import org.eclipse.rmf.reqif10.Reqif10Package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Value Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AttributeValueIntegerImpl#getTheValue <em>The Value</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AttributeValueIntegerImpl#getDefinition <em>Definition</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.AttributeValueIntegerImpl#getOwningDefinition <em>Owning Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeValueIntegerImpl extends AttributeValueSimpleImpl implements AttributeValueInteger {
	/**
	 * The default value of the '{@link #getTheValue() <em>The Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheValue()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger THE_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTheValue() <em>The Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheValue()
	 * @generated
	 * @ordered
	 */
	protected BigInteger theValue = THE_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefinition() <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinition()
	 * @generated
	 * @ordered
	 */
	protected AttributeDefinitionInteger definition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeValueIntegerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Reqif10Package.Literals.ATTRIBUTE_VALUE_INTEGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTheValue() {
		return theValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheValue(BigInteger newTheValue) {
		BigInteger oldTheValue = theValue;
		theValue = newTheValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.ATTRIBUTE_VALUE_INTEGER__THE_VALUE, oldTheValue, theValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionInteger getDefinition() {
		if (definition != null && definition.eIsProxy()) {
			InternalEObject oldDefinition = (InternalEObject)definition;
			definition = (AttributeDefinitionInteger)eResolveProxy(oldDefinition);
			if (definition != oldDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Reqif10Package.ATTRIBUTE_VALUE_INTEGER__DEFINITION, oldDefinition, definition));
			}
		}
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionInteger basicGetDefinition() {
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(AttributeDefinitionInteger newDefinition) {
		AttributeDefinitionInteger oldDefinition = definition;
		definition = newDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.ATTRIBUTE_VALUE_INTEGER__DEFINITION, oldDefinition, definition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeDefinitionInteger getOwningDefinition() {
		if (eContainerFeatureID() != Reqif10Package.ATTRIBUTE_VALUE_INTEGER__OWNING_DEFINITION) return null;
		return (AttributeDefinitionInteger)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningDefinition(AttributeDefinitionInteger newOwningDefinition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningDefinition, Reqif10Package.ATTRIBUTE_VALUE_INTEGER__OWNING_DEFINITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningDefinition(AttributeDefinitionInteger newOwningDefinition) {
		if (newOwningDefinition != eInternalContainer() || (eContainerFeatureID() != Reqif10Package.ATTRIBUTE_VALUE_INTEGER__OWNING_DEFINITION && newOwningDefinition != null)) {
			if (EcoreUtil.isAncestor(this, newOwningDefinition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningDefinition != null)
				msgs = ((InternalEObject)newOwningDefinition).eInverseAdd(this, Reqif10Package.ATTRIBUTE_DEFINITION_INTEGER__DEFAULT_VALUE, AttributeDefinitionInteger.class, msgs);
			msgs = basicSetOwningDefinition(newOwningDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.ATTRIBUTE_VALUE_INTEGER__OWNING_DEFINITION, newOwningDefinition, newOwningDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Reqif10Package.ATTRIBUTE_VALUE_INTEGER__OWNING_DEFINITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningDefinition((AttributeDefinitionInteger)otherEnd, msgs);
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
			case Reqif10Package.ATTRIBUTE_VALUE_INTEGER__OWNING_DEFINITION:
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
			case Reqif10Package.ATTRIBUTE_VALUE_INTEGER__OWNING_DEFINITION:
				return eInternalContainer().eInverseRemove(this, Reqif10Package.ATTRIBUTE_DEFINITION_INTEGER__DEFAULT_VALUE, AttributeDefinitionInteger.class, msgs);
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
			case Reqif10Package.ATTRIBUTE_VALUE_INTEGER__THE_VALUE:
				return getTheValue();
			case Reqif10Package.ATTRIBUTE_VALUE_INTEGER__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
			case Reqif10Package.ATTRIBUTE_VALUE_INTEGER__OWNING_DEFINITION:
				return getOwningDefinition();
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
			case Reqif10Package.ATTRIBUTE_VALUE_INTEGER__THE_VALUE:
				setTheValue((BigInteger)newValue);
				return;
			case Reqif10Package.ATTRIBUTE_VALUE_INTEGER__DEFINITION:
				setDefinition((AttributeDefinitionInteger)newValue);
				return;
			case Reqif10Package.ATTRIBUTE_VALUE_INTEGER__OWNING_DEFINITION:
				setOwningDefinition((AttributeDefinitionInteger)newValue);
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
			case Reqif10Package.ATTRIBUTE_VALUE_INTEGER__THE_VALUE:
				setTheValue(THE_VALUE_EDEFAULT);
				return;
			case Reqif10Package.ATTRIBUTE_VALUE_INTEGER__DEFINITION:
				setDefinition((AttributeDefinitionInteger)null);
				return;
			case Reqif10Package.ATTRIBUTE_VALUE_INTEGER__OWNING_DEFINITION:
				setOwningDefinition((AttributeDefinitionInteger)null);
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
			case Reqif10Package.ATTRIBUTE_VALUE_INTEGER__THE_VALUE:
				return THE_VALUE_EDEFAULT == null ? theValue != null : !THE_VALUE_EDEFAULT.equals(theValue);
			case Reqif10Package.ATTRIBUTE_VALUE_INTEGER__DEFINITION:
				return definition != null;
			case Reqif10Package.ATTRIBUTE_VALUE_INTEGER__OWNING_DEFINITION:
				return getOwningDefinition() != null;
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
		result.append(" (theValue: ");
		result.append(theValue);
		result.append(')');
		return result.toString();
	}

} //AttributeValueIntegerImpl
