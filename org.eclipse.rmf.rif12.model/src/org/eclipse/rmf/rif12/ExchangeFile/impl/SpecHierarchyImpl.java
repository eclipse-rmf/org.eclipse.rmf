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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.rmf.rif12.ExchangeFile.AttributeValue;
import org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage;
import org.eclipse.rmf.rif12.ExchangeFile.SpecHierarchy;
import org.eclipse.rmf.rif12.ExchangeFile.SpecObject;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.SpecHierarchyImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.SpecHierarchyImpl#getValues <em>Values</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.SpecHierarchyImpl#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecHierarchyImpl extends IdentifiableImpl implements SpecHierarchy {
	/**
	 * The cached value of the '{@link #getObject() <em>Object</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObject()
	 * @generated
	 * @ordered
	 */
	protected SpecObject object;

	/**
	 * The cached value of the '{@link #getValues() <em>Values</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValues()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeValue> values;

	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecHierarchy> children;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecHierarchyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExchangeFilePackage.Literals.SPEC_HIERARCHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecObject getObject() {
		if (object != null && object.eIsProxy()) {
			InternalEObject oldObject = (InternalEObject)object;
			object = (SpecObject)eResolveProxy(oldObject);
			if (object != oldObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExchangeFilePackage.SPEC_HIERARCHY__OBJECT, oldObject, object));
			}
		}
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecObject basicGetObject() {
		return object;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObject(SpecObject newObject) {
		SpecObject oldObject = object;
		object = newObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.SPEC_HIERARCHY__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeValue> getValues() {
		if (values == null) {
			values = new EObjectResolvingEList<AttributeValue>(AttributeValue.class, this, ExchangeFilePackage.SPEC_HIERARCHY__VALUES);
		}
		return values;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecHierarchy> getChildren() {
		if (children == null) {
			children = new EObjectContainmentEList<SpecHierarchy>(SpecHierarchy.class, this, ExchangeFilePackage.SPEC_HIERARCHY__CHILDREN);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExchangeFilePackage.SPEC_HIERARCHY__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
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
			case ExchangeFilePackage.SPEC_HIERARCHY__OBJECT:
				if (resolve) return getObject();
				return basicGetObject();
			case ExchangeFilePackage.SPEC_HIERARCHY__VALUES:
				return getValues();
			case ExchangeFilePackage.SPEC_HIERARCHY__CHILDREN:
				return getChildren();
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
			case ExchangeFilePackage.SPEC_HIERARCHY__OBJECT:
				setObject((SpecObject)newValue);
				return;
			case ExchangeFilePackage.SPEC_HIERARCHY__VALUES:
				getValues().clear();
				getValues().addAll((Collection<? extends AttributeValue>)newValue);
				return;
			case ExchangeFilePackage.SPEC_HIERARCHY__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends SpecHierarchy>)newValue);
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
			case ExchangeFilePackage.SPEC_HIERARCHY__OBJECT:
				setObject((SpecObject)null);
				return;
			case ExchangeFilePackage.SPEC_HIERARCHY__VALUES:
				getValues().clear();
				return;
			case ExchangeFilePackage.SPEC_HIERARCHY__CHILDREN:
				getChildren().clear();
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
			case ExchangeFilePackage.SPEC_HIERARCHY__OBJECT:
				return object != null;
			case ExchangeFilePackage.SPEC_HIERARCHY__VALUES:
				return values != null && !values.isEmpty();
			case ExchangeFilePackage.SPEC_HIERARCHY__CHILDREN:
				return children != null && !children.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecHierarchyImpl
