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

import org.eclipse.rmf.reqif10.ReqIf;
import org.eclipse.rmf.reqif10.Reqif10Package;
import org.eclipse.rmf.reqif10.ReqIfToolExtension;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tool Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfToolExtensionImpl#getDocumentRoot <em>Document Root</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReqIfToolExtensionImpl extends EObjectImpl implements ReqIfToolExtension {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqIfToolExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Reqif10Package.Literals.REQ_IF_TOOL_EXTENSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIf getDocumentRoot() {
		if (eContainerFeatureID() != Reqif10Package.REQ_IF_TOOL_EXTENSION__DOCUMENT_ROOT) return null;
		return (ReqIf)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDocumentRoot(ReqIf newDocumentRoot, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newDocumentRoot, Reqif10Package.REQ_IF_TOOL_EXTENSION__DOCUMENT_ROOT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentRoot(ReqIf newDocumentRoot) {
		if (newDocumentRoot != eInternalContainer() || (eContainerFeatureID() != Reqif10Package.REQ_IF_TOOL_EXTENSION__DOCUMENT_ROOT && newDocumentRoot != null)) {
			if (EcoreUtil.isAncestor(this, newDocumentRoot))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newDocumentRoot != null)
				msgs = ((InternalEObject)newDocumentRoot).eInverseAdd(this, Reqif10Package.REQ_IF__TOOL_EXTENSIONS, ReqIf.class, msgs);
			msgs = basicSetDocumentRoot(newDocumentRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.REQ_IF_TOOL_EXTENSION__DOCUMENT_ROOT, newDocumentRoot, newDocumentRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Reqif10Package.REQ_IF_TOOL_EXTENSION__DOCUMENT_ROOT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetDocumentRoot((ReqIf)otherEnd, msgs);
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
			case Reqif10Package.REQ_IF_TOOL_EXTENSION__DOCUMENT_ROOT:
				return basicSetDocumentRoot(null, msgs);
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
			case Reqif10Package.REQ_IF_TOOL_EXTENSION__DOCUMENT_ROOT:
				return eInternalContainer().eInverseRemove(this, Reqif10Package.REQ_IF__TOOL_EXTENSIONS, ReqIf.class, msgs);
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
			case Reqif10Package.REQ_IF_TOOL_EXTENSION__DOCUMENT_ROOT:
				return getDocumentRoot();
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
			case Reqif10Package.REQ_IF_TOOL_EXTENSION__DOCUMENT_ROOT:
				setDocumentRoot((ReqIf)newValue);
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
			case Reqif10Package.REQ_IF_TOOL_EXTENSION__DOCUMENT_ROOT:
				setDocumentRoot((ReqIf)null);
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
			case Reqif10Package.REQ_IF_TOOL_EXTENSION__DOCUMENT_ROOT:
				return getDocumentRoot() != null;
		}
		return super.eIsSet(featureID);
	}

} //ReqIfToolExtensionImpl
