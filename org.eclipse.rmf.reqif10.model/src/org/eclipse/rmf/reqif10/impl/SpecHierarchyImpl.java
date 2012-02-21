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
import org.eclipse.rmf.reqif10.SpecHierarchy;
import org.eclipse.rmf.reqif10.SpecObject;
import org.eclipse.rmf.reqif10.Specification;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.SpecHierarchyImpl#getIsTableInternal <em>Is Table Internal</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.SpecHierarchyImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.SpecHierarchyImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.SpecHierarchyImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.SpecHierarchyImpl#getEditableAtts <em>Editable Atts</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.SpecHierarchyImpl#getRoot <em>Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecHierarchyImpl extends AccessControlledElementImpl implements SpecHierarchy {
	/**
	 * The default value of the '{@link #getIsTableInternal() <em>Is Table Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTableInternal()
	 * @generated
	 * @ordered
	 */
	protected static final Object IS_TABLE_INTERNAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIsTableInternal() <em>Is Table Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsTableInternal()
	 * @generated
	 * @ordered
	 */
	protected Object isTableInternal = IS_TABLE_INTERNAL_EDEFAULT;

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
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecHierarchy> children;

	/**
	 * The cached value of the '{@link #getEditableAtts() <em>Editable Atts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEditableAtts()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeDefinition> editableAtts;

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
		return Reqif10Package.Literals.SPEC_HIERARCHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIsTableInternal() {
		return isTableInternal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsTableInternal(Object newIsTableInternal) {
		Object oldIsTableInternal = isTableInternal;
		isTableInternal = newIsTableInternal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.SPEC_HIERARCHY__IS_TABLE_INTERNAL, oldIsTableInternal, isTableInternal));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Reqif10Package.SPEC_HIERARCHY__OBJECT, oldObject, object));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.SPEC_HIERARCHY__OBJECT, oldObject, object));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecHierarchy getParent() {
		if (eContainerFeatureID() != Reqif10Package.SPEC_HIERARCHY__PARENT) return null;
		return (SpecHierarchy)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(SpecHierarchy newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, Reqif10Package.SPEC_HIERARCHY__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(SpecHierarchy newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != Reqif10Package.SPEC_HIERARCHY__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, Reqif10Package.SPEC_HIERARCHY__CHILDREN, SpecHierarchy.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.SPEC_HIERARCHY__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecHierarchy> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<SpecHierarchy>(SpecHierarchy.class, this, Reqif10Package.SPEC_HIERARCHY__CHILDREN, Reqif10Package.SPEC_HIERARCHY__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeDefinition> getEditableAtts() {
		if (editableAtts == null) {
			editableAtts = new EObjectResolvingEList<AttributeDefinition>(AttributeDefinition.class, this, Reqif10Package.SPEC_HIERARCHY__EDITABLE_ATTS);
		}
		return editableAtts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification getRoot() {
		if (eContainerFeatureID() != Reqif10Package.SPEC_HIERARCHY__ROOT) return null;
		return (Specification)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(Specification newRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newRoot, Reqif10Package.SPEC_HIERARCHY__ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoot(Specification newRoot) {
		if (newRoot != eInternalContainer() || (eContainerFeatureID() != Reqif10Package.SPEC_HIERARCHY__ROOT && newRoot != null)) {
			if (EcoreUtil.isAncestor(this, newRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newRoot != null)
				msgs = ((InternalEObject)newRoot).eInverseAdd(this, Reqif10Package.SPECIFICATION__CHILDREN, Specification.class, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.SPEC_HIERARCHY__ROOT, newRoot, newRoot));
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
			case Reqif10Package.SPEC_HIERARCHY__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((SpecHierarchy)otherEnd, msgs);
			case Reqif10Package.SPEC_HIERARCHY__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case Reqif10Package.SPEC_HIERARCHY__ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetRoot((Specification)otherEnd, msgs);
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
			case Reqif10Package.SPEC_HIERARCHY__PARENT:
				return basicSetParent(null, msgs);
			case Reqif10Package.SPEC_HIERARCHY__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case Reqif10Package.SPEC_HIERARCHY__ROOT:
				return basicSetRoot(null, msgs);
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
			case Reqif10Package.SPEC_HIERARCHY__PARENT:
				return eInternalContainer().eInverseRemove(this, Reqif10Package.SPEC_HIERARCHY__CHILDREN, SpecHierarchy.class, msgs);
			case Reqif10Package.SPEC_HIERARCHY__ROOT:
				return eInternalContainer().eInverseRemove(this, Reqif10Package.SPECIFICATION__CHILDREN, Specification.class, msgs);
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
			case Reqif10Package.SPEC_HIERARCHY__IS_TABLE_INTERNAL:
				return getIsTableInternal();
			case Reqif10Package.SPEC_HIERARCHY__OBJECT:
				if (resolve) return getObject();
				return basicGetObject();
			case Reqif10Package.SPEC_HIERARCHY__PARENT:
				return getParent();
			case Reqif10Package.SPEC_HIERARCHY__CHILDREN:
				return getChildren();
			case Reqif10Package.SPEC_HIERARCHY__EDITABLE_ATTS:
				return getEditableAtts();
			case Reqif10Package.SPEC_HIERARCHY__ROOT:
				return getRoot();
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
			case Reqif10Package.SPEC_HIERARCHY__IS_TABLE_INTERNAL:
				setIsTableInternal(newValue);
				return;
			case Reqif10Package.SPEC_HIERARCHY__OBJECT:
				setObject((SpecObject)newValue);
				return;
			case Reqif10Package.SPEC_HIERARCHY__PARENT:
				setParent((SpecHierarchy)newValue);
				return;
			case Reqif10Package.SPEC_HIERARCHY__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends SpecHierarchy>)newValue);
				return;
			case Reqif10Package.SPEC_HIERARCHY__EDITABLE_ATTS:
				getEditableAtts().clear();
				getEditableAtts().addAll((Collection<? extends AttributeDefinition>)newValue);
				return;
			case Reqif10Package.SPEC_HIERARCHY__ROOT:
				setRoot((Specification)newValue);
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
			case Reqif10Package.SPEC_HIERARCHY__IS_TABLE_INTERNAL:
				setIsTableInternal(IS_TABLE_INTERNAL_EDEFAULT);
				return;
			case Reqif10Package.SPEC_HIERARCHY__OBJECT:
				setObject((SpecObject)null);
				return;
			case Reqif10Package.SPEC_HIERARCHY__PARENT:
				setParent((SpecHierarchy)null);
				return;
			case Reqif10Package.SPEC_HIERARCHY__CHILDREN:
				getChildren().clear();
				return;
			case Reqif10Package.SPEC_HIERARCHY__EDITABLE_ATTS:
				getEditableAtts().clear();
				return;
			case Reqif10Package.SPEC_HIERARCHY__ROOT:
				setRoot((Specification)null);
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
			case Reqif10Package.SPEC_HIERARCHY__IS_TABLE_INTERNAL:
				return IS_TABLE_INTERNAL_EDEFAULT == null ? isTableInternal != null : !IS_TABLE_INTERNAL_EDEFAULT.equals(isTableInternal);
			case Reqif10Package.SPEC_HIERARCHY__OBJECT:
				return object != null;
			case Reqif10Package.SPEC_HIERARCHY__PARENT:
				return getParent() != null;
			case Reqif10Package.SPEC_HIERARCHY__CHILDREN:
				return children != null && !children.isEmpty();
			case Reqif10Package.SPEC_HIERARCHY__EDITABLE_ATTS:
				return editableAtts != null && !editableAtts.isEmpty();
			case Reqif10Package.SPEC_HIERARCHY__ROOT:
				return getRoot() != null;
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
		result.append(" (isTableInternal: ");
		result.append(isTableInternal);
		result.append(')');
		return result.toString();
	}

} //SpecHierarchyImpl
