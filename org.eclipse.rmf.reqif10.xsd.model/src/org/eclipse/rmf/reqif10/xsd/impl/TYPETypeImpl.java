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

package org.eclipse.rmf.reqif10.xsd.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.rmf.reqif10.xsd.RELATIONGROUPTYPE;
import org.eclipse.rmf.reqif10.xsd.ReqifPackage;
import org.eclipse.rmf.reqif10.xsd.TYPEType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>TYPE Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.TYPETypeImpl#getRELATIONGROUPTYPEREF <em>RELATIONGROUPTYPEREF</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TYPETypeImpl extends EObjectImpl implements TYPEType {
	/**
	 * The cached value of the '{@link #getRELATIONGROUPTYPEREF() <em>RELATIONGROUPTYPEREF</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRELATIONGROUPTYPEREF()
	 * @generated
	 * @ordered
	 */
	protected RELATIONGROUPTYPE rELATIONGROUPTYPEREF;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TYPETypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqifPackage.Literals.TYPE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RELATIONGROUPTYPE getRELATIONGROUPTYPEREF() {
		return rELATIONGROUPTYPEREF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRELATIONGROUPTYPEREF(RELATIONGROUPTYPE newRELATIONGROUPTYPEREF) {
		RELATIONGROUPTYPE oldRELATIONGROUPTYPEREF = rELATIONGROUPTYPEREF;
		rELATIONGROUPTYPEREF = newRELATIONGROUPTYPEREF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.TYPE_TYPE__RELATIONGROUPTYPEREF, oldRELATIONGROUPTYPEREF, rELATIONGROUPTYPEREF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ReqifPackage.TYPE_TYPE__RELATIONGROUPTYPEREF:
				return getRELATIONGROUPTYPEREF();
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
			case ReqifPackage.TYPE_TYPE__RELATIONGROUPTYPEREF:
				setRELATIONGROUPTYPEREF((RELATIONGROUPTYPE)newValue);
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
			case ReqifPackage.TYPE_TYPE__RELATIONGROUPTYPEREF:
				setRELATIONGROUPTYPEREF((RELATIONGROUPTYPE)null);
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
			case ReqifPackage.TYPE_TYPE__RELATIONGROUPTYPEREF:
				return rELATIONGROUPTYPEREF != null;
		}
		return super.eIsSet(featureID);
	}

} //TYPETypeImpl
