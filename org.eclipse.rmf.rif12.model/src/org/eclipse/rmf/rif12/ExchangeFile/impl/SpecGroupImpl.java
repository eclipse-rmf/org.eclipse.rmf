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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage;
import org.eclipse.rmf.rif12.ExchangeFile.RelationGroup;
import org.eclipse.rmf.rif12.ExchangeFile.SpecGroup;
import org.eclipse.rmf.rif12.ExchangeFile.SpecObject;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.SpecGroupImpl#getSpecObjects <em>Spec Objects</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.SpecGroupImpl#getRelationGroups <em>Relation Groups</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecGroupImpl extends SpecElementWithUserDefinedAttributesImpl implements SpecGroup {
	/**
	 * The cached value of the '{@link #getSpecObjects() <em>Spec Objects</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecObjects()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecObject> specObjects;

	/**
	 * The cached value of the '{@link #getRelationGroups() <em>Relation Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<RelationGroup> relationGroups;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExchangeFilePackage.Literals.SPEC_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecObject> getSpecObjects() {
		if (specObjects == null) {
			specObjects = new EObjectResolvingEList<SpecObject>(SpecObject.class, this, ExchangeFilePackage.SPEC_GROUP__SPEC_OBJECTS);
		}
		return specObjects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RelationGroup> getRelationGroups() {
		if (relationGroups == null) {
			relationGroups = new EObjectContainmentEList<RelationGroup>(RelationGroup.class, this, ExchangeFilePackage.SPEC_GROUP__RELATION_GROUPS);
		}
		return relationGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExchangeFilePackage.SPEC_GROUP__RELATION_GROUPS:
				return ((InternalEList<?>)getRelationGroups()).basicRemove(otherEnd, msgs);
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
			case ExchangeFilePackage.SPEC_GROUP__SPEC_OBJECTS:
				return getSpecObjects();
			case ExchangeFilePackage.SPEC_GROUP__RELATION_GROUPS:
				return getRelationGroups();
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
			case ExchangeFilePackage.SPEC_GROUP__SPEC_OBJECTS:
				getSpecObjects().clear();
				getSpecObjects().addAll((Collection<? extends SpecObject>)newValue);
				return;
			case ExchangeFilePackage.SPEC_GROUP__RELATION_GROUPS:
				getRelationGroups().clear();
				getRelationGroups().addAll((Collection<? extends RelationGroup>)newValue);
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
			case ExchangeFilePackage.SPEC_GROUP__SPEC_OBJECTS:
				getSpecObjects().clear();
				return;
			case ExchangeFilePackage.SPEC_GROUP__RELATION_GROUPS:
				getRelationGroups().clear();
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
			case ExchangeFilePackage.SPEC_GROUP__SPEC_OBJECTS:
				return specObjects != null && !specObjects.isEmpty();
			case ExchangeFilePackage.SPEC_GROUP__RELATION_GROUPS:
				return relationGroups != null && !relationGroups.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SpecGroupImpl
