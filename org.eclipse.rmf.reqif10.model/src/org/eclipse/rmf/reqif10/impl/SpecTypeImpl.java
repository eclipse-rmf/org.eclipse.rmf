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

import org.eclipse.rmf.reqif10.AttributeDefinition;
import org.eclipse.rmf.reqif10.Reqif10Package;
import org.eclipse.rmf.reqif10.ReqIfContent;
import org.eclipse.rmf.reqif10.SpecType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.SpecTypeImpl#getCoreContent <em>Core Content</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.SpecTypeImpl#getSpecAttributes <em>Spec Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SpecTypeImpl extends IdentifiableImpl implements SpecType {
	/**
	 * The cached value of the '{@link #getSpecAttributes() <em>Spec Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeDefinition> specAttributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Reqif10Package.Literals.SPEC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIfContent getCoreContent() {
		if (eContainerFeatureID() != Reqif10Package.SPEC_TYPE__CORE_CONTENT) return null;
		return (ReqIfContent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoreContent(ReqIfContent newCoreContent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCoreContent, Reqif10Package.SPEC_TYPE__CORE_CONTENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreContent(ReqIfContent newCoreContent) {
		if (newCoreContent != eInternalContainer() || (eContainerFeatureID() != Reqif10Package.SPEC_TYPE__CORE_CONTENT && newCoreContent != null)) {
			if (EcoreUtil.isAncestor(this, newCoreContent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCoreContent != null)
				msgs = ((InternalEObject)newCoreContent).eInverseAdd(this, Reqif10Package.REQ_IF_CONTENT__SPEC_TYPES, ReqIfContent.class, msgs);
			msgs = basicSetCoreContent(newCoreContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.SPEC_TYPE__CORE_CONTENT, newCoreContent, newCoreContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeDefinition> getSpecAttributes() {
		if (specAttributes == null) {
			specAttributes = new EObjectContainmentWithInverseEList<AttributeDefinition>(AttributeDefinition.class, this, Reqif10Package.SPEC_TYPE__SPEC_ATTRIBUTES, Reqif10Package.ATTRIBUTE_DEFINITION__SPEC_TYPE);
		}
		return specAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Reqif10Package.SPEC_TYPE__CORE_CONTENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCoreContent((ReqIfContent)otherEnd, msgs);
			case Reqif10Package.SPEC_TYPE__SPEC_ATTRIBUTES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSpecAttributes()).basicAdd(otherEnd, msgs);
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
			case Reqif10Package.SPEC_TYPE__CORE_CONTENT:
				return basicSetCoreContent(null, msgs);
			case Reqif10Package.SPEC_TYPE__SPEC_ATTRIBUTES:
				return ((InternalEList<?>)getSpecAttributes()).basicRemove(otherEnd, msgs);
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
			case Reqif10Package.SPEC_TYPE__CORE_CONTENT:
				return eInternalContainer().eInverseRemove(this, Reqif10Package.REQ_IF_CONTENT__SPEC_TYPES, ReqIfContent.class, msgs);
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
			case Reqif10Package.SPEC_TYPE__CORE_CONTENT:
				return getCoreContent();
			case Reqif10Package.SPEC_TYPE__SPEC_ATTRIBUTES:
				return getSpecAttributes();
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
			case Reqif10Package.SPEC_TYPE__CORE_CONTENT:
				setCoreContent((ReqIfContent)newValue);
				return;
			case Reqif10Package.SPEC_TYPE__SPEC_ATTRIBUTES:
				getSpecAttributes().clear();
				getSpecAttributes().addAll((Collection<? extends AttributeDefinition>)newValue);
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
			case Reqif10Package.SPEC_TYPE__CORE_CONTENT:
				setCoreContent((ReqIfContent)null);
				return;
			case Reqif10Package.SPEC_TYPE__SPEC_ATTRIBUTES:
				getSpecAttributes().clear();
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
			case Reqif10Package.SPEC_TYPE__CORE_CONTENT:
				return getCoreContent() != null;
			case Reqif10Package.SPEC_TYPE__SPEC_ATTRIBUTES:
				return specAttributes != null && !specAttributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecTypeImpl
