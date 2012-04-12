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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.rmf.rif11.ExchangeFile.ExchangeFilePackage;
import org.eclipse.rmf.rif11.ExchangeFile.RelationGroup;
import org.eclipse.rmf.rif11.ExchangeFile.SpecGroup;
import org.eclipse.rmf.rif11.ExchangeFile.SpecRelation;
import org.eclipse.rmf.rif11.ExchangeFile.SpecType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relation Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RelationGroupImpl#getSpecRelations <em>Spec Relations</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RelationGroupImpl#getRelationType <em>Relation Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.ExchangeFile.impl.RelationGroupImpl#getSourceGroup <em>Source Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelationGroupImpl extends IdentifiableImpl implements RelationGroup {
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
	 * The cached value of the '{@link #getRelationType() <em>Relation Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationType()
	 * @generated
	 * @ordered
	 */
	protected SpecType relationType;

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
		return ExchangeFilePackage.Literals.RELATION_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecRelation> getSpecRelations() {
		if (specRelations == null) {
			specRelations = new EObjectResolvingEList<SpecRelation>(SpecRelation.class, this, ExchangeFilePackage.RELATION_GROUP__SPEC_RELATIONS);
		}
		return specRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecType getRelationType() {
		if (relationType != null && relationType.eIsProxy()) {
			InternalEObject oldRelationType = (InternalEObject)relationType;
			relationType = (SpecType)eResolveProxy(oldRelationType);
			if (relationType != oldRelationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExchangeFilePackage.RELATION_GROUP__RELATION_TYPE, oldRelationType, relationType));
			}
		}
		return relationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecType basicGetRelationType() {
		return relationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRelationType(SpecType newRelationType) {
		SpecType oldRelationType = relationType;
		relationType = newRelationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.RELATION_GROUP__RELATION_TYPE, oldRelationType, relationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecGroup getSourceGroup() {
		if (eContainerFeatureID() != ExchangeFilePackage.RELATION_GROUP__SOURCE_GROUP) return null;
		return (SpecGroup)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceGroup(SpecGroup newSourceGroup, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSourceGroup, ExchangeFilePackage.RELATION_GROUP__SOURCE_GROUP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceGroup(SpecGroup newSourceGroup) {
		if (newSourceGroup != eInternalContainer() || (eContainerFeatureID() != ExchangeFilePackage.RELATION_GROUP__SOURCE_GROUP && newSourceGroup != null)) {
			if (EcoreUtil.isAncestor(this, newSourceGroup))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSourceGroup != null)
				msgs = ((InternalEObject)newSourceGroup).eInverseAdd(this, ExchangeFilePackage.SPEC_GROUP__RELATION_GROUPS, SpecGroup.class, msgs);
			msgs = basicSetSourceGroup(newSourceGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.RELATION_GROUP__SOURCE_GROUP, newSourceGroup, newSourceGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExchangeFilePackage.RELATION_GROUP__SOURCE_GROUP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSourceGroup((SpecGroup)otherEnd, msgs);
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
			case ExchangeFilePackage.RELATION_GROUP__SOURCE_GROUP:
				return basicSetSourceGroup(null, msgs);
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
			case ExchangeFilePackage.RELATION_GROUP__SOURCE_GROUP:
				return eInternalContainer().eInverseRemove(this, ExchangeFilePackage.SPEC_GROUP__RELATION_GROUPS, SpecGroup.class, msgs);
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
			case ExchangeFilePackage.RELATION_GROUP__SPEC_RELATIONS:
				return getSpecRelations();
			case ExchangeFilePackage.RELATION_GROUP__RELATION_TYPE:
				if (resolve) return getRelationType();
				return basicGetRelationType();
			case ExchangeFilePackage.RELATION_GROUP__SOURCE_GROUP:
				return getSourceGroup();
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
			case ExchangeFilePackage.RELATION_GROUP__SPEC_RELATIONS:
				getSpecRelations().clear();
				getSpecRelations().addAll((Collection<? extends SpecRelation>)newValue);
				return;
			case ExchangeFilePackage.RELATION_GROUP__RELATION_TYPE:
				setRelationType((SpecType)newValue);
				return;
			case ExchangeFilePackage.RELATION_GROUP__SOURCE_GROUP:
				setSourceGroup((SpecGroup)newValue);
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
			case ExchangeFilePackage.RELATION_GROUP__SPEC_RELATIONS:
				getSpecRelations().clear();
				return;
			case ExchangeFilePackage.RELATION_GROUP__RELATION_TYPE:
				setRelationType((SpecType)null);
				return;
			case ExchangeFilePackage.RELATION_GROUP__SOURCE_GROUP:
				setSourceGroup((SpecGroup)null);
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
			case ExchangeFilePackage.RELATION_GROUP__SPEC_RELATIONS:
				return specRelations != null && !specRelations.isEmpty();
			case ExchangeFilePackage.RELATION_GROUP__RELATION_TYPE:
				return relationType != null;
			case ExchangeFilePackage.RELATION_GROUP__SOURCE_GROUP:
				return getSourceGroup() != null;
		}
		return super.eIsSet(featureID);
	}

} //RelationGroupImpl
