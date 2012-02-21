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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage;
import org.eclipse.rmf.rif12.ExchangeFile.SpecGroup;
import org.eclipse.rmf.rif12.ExchangeFile.SpecGroupHierarchy;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Spec Group Hierarchy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.SpecGroupHierarchyImpl#getGroup <em>Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SpecGroupHierarchyImpl extends IdentifiableImpl implements SpecGroupHierarchy {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected SpecGroup group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecGroupHierarchyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExchangeFilePackage.Literals.SPEC_GROUP_HIERARCHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecGroup getGroup() {
		if (group != null && group.eIsProxy()) {
			InternalEObject oldGroup = (InternalEObject)group;
			group = (SpecGroup)eResolveProxy(oldGroup);
			if (group != oldGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ExchangeFilePackage.SPEC_GROUP_HIERARCHY__GROUP, oldGroup, group));
			}
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecGroup basicGetGroup() {
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGroup(SpecGroup newGroup) {
		SpecGroup oldGroup = group;
		group = newGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.SPEC_GROUP_HIERARCHY__GROUP, oldGroup, group));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExchangeFilePackage.SPEC_GROUP_HIERARCHY__GROUP:
				if (resolve) return getGroup();
				return basicGetGroup();
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
			case ExchangeFilePackage.SPEC_GROUP_HIERARCHY__GROUP:
				setGroup((SpecGroup)newValue);
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
			case ExchangeFilePackage.SPEC_GROUP_HIERARCHY__GROUP:
				setGroup((SpecGroup)null);
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
			case ExchangeFilePackage.SPEC_GROUP_HIERARCHY__GROUP:
				return group != null;
		}
		return super.eIsSet(featureID);
	}

} //SpecGroupHierarchyImpl
