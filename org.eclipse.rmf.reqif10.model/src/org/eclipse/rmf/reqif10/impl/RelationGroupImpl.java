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

import org.eclipse.rmf.reqif10.RelationGroup;
import org.eclipse.rmf.reqif10.RelationGroupType;
import org.eclipse.rmf.reqif10.Reqif10Package;
import org.eclipse.rmf.reqif10.ReqIfContent;
import org.eclipse.rmf.reqif10.SpecRelation;
import org.eclipse.rmf.reqif10.Specification;

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
 * An implementation of the model object '<em><b>Relation Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.RelationGroupImpl#getSpecRelations <em>Spec Relations</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.RelationGroupImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.RelationGroupImpl#getSourceSpecification <em>Source Specification</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.RelationGroupImpl#getTargetSpecification <em>Target Specification</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.RelationGroupImpl#getCoreContent <em>Core Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationGroupImpl extends SpecElementWithAttributesImpl implements RelationGroup {
	/**
	 * The cached value of the '{@link #getSpecRelations() <em>Spec Relations</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecRelation> specRelations;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected RelationGroupType type;

	/**
	 * The cached value of the '{@link #getSourceSpecification() <em>Source Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceSpecification()
	 * @generated
	 * @ordered
	 */
	protected Specification sourceSpecification;

	/**
	 * The cached value of the '{@link #getTargetSpecification() <em>Target Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSpecification()
	 * @generated
	 * @ordered
	 */
	protected Specification targetSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Reqif10Package.Literals.RELATION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecRelation> getSpecRelations() {
		if (specRelations == null) {
			specRelations = new EObjectResolvingEList<SpecRelation>(SpecRelation.class, this, Reqif10Package.RELATION_GROUP__SPEC_RELATIONS);
		}
		return specRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationGroupType getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject)type;
			type = (RelationGroupType)eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Reqif10Package.RELATION_GROUP__TYPE, oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RelationGroupType basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(RelationGroupType newType) {
		RelationGroupType oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.RELATION_GROUP__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification getSourceSpecification() {
		if (sourceSpecification != null && sourceSpecification.eIsProxy()) {
			InternalEObject oldSourceSpecification = (InternalEObject)sourceSpecification;
			sourceSpecification = (Specification)eResolveProxy(oldSourceSpecification);
			if (sourceSpecification != oldSourceSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Reqif10Package.RELATION_GROUP__SOURCE_SPECIFICATION, oldSourceSpecification, sourceSpecification));
			}
		}
		return sourceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification basicGetSourceSpecification() {
		return sourceSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceSpecification(Specification newSourceSpecification) {
		Specification oldSourceSpecification = sourceSpecification;
		sourceSpecification = newSourceSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.RELATION_GROUP__SOURCE_SPECIFICATION, oldSourceSpecification, sourceSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification getTargetSpecification() {
		if (targetSpecification != null && targetSpecification.eIsProxy()) {
			InternalEObject oldTargetSpecification = (InternalEObject)targetSpecification;
			targetSpecification = (Specification)eResolveProxy(oldTargetSpecification);
			if (targetSpecification != oldTargetSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Reqif10Package.RELATION_GROUP__TARGET_SPECIFICATION, oldTargetSpecification, targetSpecification));
			}
		}
		return targetSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specification basicGetTargetSpecification() {
		return targetSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSpecification(Specification newTargetSpecification) {
		Specification oldTargetSpecification = targetSpecification;
		targetSpecification = newTargetSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.RELATION_GROUP__TARGET_SPECIFICATION, oldTargetSpecification, targetSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIfContent getCoreContent() {
		if (eContainerFeatureID() != Reqif10Package.RELATION_GROUP__CORE_CONTENT) return null;
		return (ReqIfContent)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoreContent(ReqIfContent newCoreContent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCoreContent, Reqif10Package.RELATION_GROUP__CORE_CONTENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreContent(ReqIfContent newCoreContent) {
		if (newCoreContent != eInternalContainer() || (eContainerFeatureID() != Reqif10Package.RELATION_GROUP__CORE_CONTENT && newCoreContent != null)) {
			if (EcoreUtil.isAncestor(this, newCoreContent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCoreContent != null)
				msgs = ((InternalEObject)newCoreContent).eInverseAdd(this, Reqif10Package.REQ_IF_CONTENT__SPEC_RELATION_GROUPS, ReqIfContent.class, msgs);
			msgs = basicSetCoreContent(newCoreContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.RELATION_GROUP__CORE_CONTENT, newCoreContent, newCoreContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Reqif10Package.RELATION_GROUP__CORE_CONTENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCoreContent((ReqIfContent)otherEnd, msgs);
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
			case Reqif10Package.RELATION_GROUP__CORE_CONTENT:
				return basicSetCoreContent(null, msgs);
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
			case Reqif10Package.RELATION_GROUP__CORE_CONTENT:
				return eInternalContainer().eInverseRemove(this, Reqif10Package.REQ_IF_CONTENT__SPEC_RELATION_GROUPS, ReqIfContent.class, msgs);
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
			case Reqif10Package.RELATION_GROUP__SPEC_RELATIONS:
				return getSpecRelations();
			case Reqif10Package.RELATION_GROUP__TYPE:
				if (resolve) return getType();
				return basicGetType();
			case Reqif10Package.RELATION_GROUP__SOURCE_SPECIFICATION:
				if (resolve) return getSourceSpecification();
				return basicGetSourceSpecification();
			case Reqif10Package.RELATION_GROUP__TARGET_SPECIFICATION:
				if (resolve) return getTargetSpecification();
				return basicGetTargetSpecification();
			case Reqif10Package.RELATION_GROUP__CORE_CONTENT:
				return getCoreContent();
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
			case Reqif10Package.RELATION_GROUP__SPEC_RELATIONS:
				getSpecRelations().clear();
				getSpecRelations().addAll((Collection<? extends SpecRelation>)newValue);
				return;
			case Reqif10Package.RELATION_GROUP__TYPE:
				setType((RelationGroupType)newValue);
				return;
			case Reqif10Package.RELATION_GROUP__SOURCE_SPECIFICATION:
				setSourceSpecification((Specification)newValue);
				return;
			case Reqif10Package.RELATION_GROUP__TARGET_SPECIFICATION:
				setTargetSpecification((Specification)newValue);
				return;
			case Reqif10Package.RELATION_GROUP__CORE_CONTENT:
				setCoreContent((ReqIfContent)newValue);
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
			case Reqif10Package.RELATION_GROUP__SPEC_RELATIONS:
				getSpecRelations().clear();
				return;
			case Reqif10Package.RELATION_GROUP__TYPE:
				setType((RelationGroupType)null);
				return;
			case Reqif10Package.RELATION_GROUP__SOURCE_SPECIFICATION:
				setSourceSpecification((Specification)null);
				return;
			case Reqif10Package.RELATION_GROUP__TARGET_SPECIFICATION:
				setTargetSpecification((Specification)null);
				return;
			case Reqif10Package.RELATION_GROUP__CORE_CONTENT:
				setCoreContent((ReqIfContent)null);
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
			case Reqif10Package.RELATION_GROUP__SPEC_RELATIONS:
				return specRelations != null && !specRelations.isEmpty();
			case Reqif10Package.RELATION_GROUP__TYPE:
				return type != null;
			case Reqif10Package.RELATION_GROUP__SOURCE_SPECIFICATION:
				return sourceSpecification != null;
			case Reqif10Package.RELATION_GROUP__TARGET_SPECIFICATION:
				return targetSpecification != null;
			case Reqif10Package.RELATION_GROUP__CORE_CONTENT:
				return getCoreContent() != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationGroupImpl
