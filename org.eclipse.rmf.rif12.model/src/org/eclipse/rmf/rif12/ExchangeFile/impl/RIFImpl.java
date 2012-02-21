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
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.rmf.rif12.ExchangeFile.ExchangeFilePackage;
import org.eclipse.rmf.rif12.ExchangeFile.RIF;
import org.eclipse.rmf.rif12.ExchangeFile.RIFContent;
import org.eclipse.rmf.rif12.ExchangeFile.RIFHeader;
import org.eclipse.rmf.rif12.ExchangeFile.RIFToolExtension;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RIF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.RIFImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.RIFImpl#getCoreContent <em>Core Content</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.ExchangeFile.impl.RIFImpl#getToolExtensions <em>Tool Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RIFImpl extends EObjectImpl implements RIF {
	/**
	 * The cached value of the '{@link #getHeader() <em>Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeader()
	 * @generated
	 * @ordered
	 */
	protected RIFHeader header;

	/**
	 * The cached value of the '{@link #getCoreContent() <em>Core Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreContent()
	 * @generated
	 * @ordered
	 */
	protected RIFContent coreContent;

	/**
	 * The cached value of the '{@link #getToolExtensions() <em>Tool Extensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolExtensions()
	 * @generated
	 * @ordered
	 */
	protected RIFToolExtension toolExtensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RIFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExchangeFilePackage.Literals.RIF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIFHeader getHeader() {
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeader(RIFHeader newHeader, NotificationChain msgs) {
		RIFHeader oldHeader = header;
		header = newHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.RIF__HEADER, oldHeader, newHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeader(RIFHeader newHeader) {
		if (newHeader != header) {
			NotificationChain msgs = null;
			if (header != null)
				msgs = ((InternalEObject)header).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExchangeFilePackage.RIF__HEADER, null, msgs);
			if (newHeader != null)
				msgs = ((InternalEObject)newHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExchangeFilePackage.RIF__HEADER, null, msgs);
			msgs = basicSetHeader(newHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.RIF__HEADER, newHeader, newHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIFContent getCoreContent() {
		return coreContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoreContent(RIFContent newCoreContent, NotificationChain msgs) {
		RIFContent oldCoreContent = coreContent;
		coreContent = newCoreContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.RIF__CORE_CONTENT, oldCoreContent, newCoreContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreContent(RIFContent newCoreContent) {
		if (newCoreContent != coreContent) {
			NotificationChain msgs = null;
			if (coreContent != null)
				msgs = ((InternalEObject)coreContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExchangeFilePackage.RIF__CORE_CONTENT, null, msgs);
			if (newCoreContent != null)
				msgs = ((InternalEObject)newCoreContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExchangeFilePackage.RIF__CORE_CONTENT, null, msgs);
			msgs = basicSetCoreContent(newCoreContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.RIF__CORE_CONTENT, newCoreContent, newCoreContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RIFToolExtension getToolExtensions() {
		return toolExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToolExtensions(RIFToolExtension newToolExtensions, NotificationChain msgs) {
		RIFToolExtension oldToolExtensions = toolExtensions;
		toolExtensions = newToolExtensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.RIF__TOOL_EXTENSIONS, oldToolExtensions, newToolExtensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolExtensions(RIFToolExtension newToolExtensions) {
		if (newToolExtensions != toolExtensions) {
			NotificationChain msgs = null;
			if (toolExtensions != null)
				msgs = ((InternalEObject)toolExtensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ExchangeFilePackage.RIF__TOOL_EXTENSIONS, null, msgs);
			if (newToolExtensions != null)
				msgs = ((InternalEObject)newToolExtensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ExchangeFilePackage.RIF__TOOL_EXTENSIONS, null, msgs);
			msgs = basicSetToolExtensions(newToolExtensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExchangeFilePackage.RIF__TOOL_EXTENSIONS, newToolExtensions, newToolExtensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ExchangeFilePackage.RIF__HEADER:
				return basicSetHeader(null, msgs);
			case ExchangeFilePackage.RIF__CORE_CONTENT:
				return basicSetCoreContent(null, msgs);
			case ExchangeFilePackage.RIF__TOOL_EXTENSIONS:
				return basicSetToolExtensions(null, msgs);
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
			case ExchangeFilePackage.RIF__HEADER:
				return getHeader();
			case ExchangeFilePackage.RIF__CORE_CONTENT:
				return getCoreContent();
			case ExchangeFilePackage.RIF__TOOL_EXTENSIONS:
				return getToolExtensions();
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
			case ExchangeFilePackage.RIF__HEADER:
				setHeader((RIFHeader)newValue);
				return;
			case ExchangeFilePackage.RIF__CORE_CONTENT:
				setCoreContent((RIFContent)newValue);
				return;
			case ExchangeFilePackage.RIF__TOOL_EXTENSIONS:
				setToolExtensions((RIFToolExtension)newValue);
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
			case ExchangeFilePackage.RIF__HEADER:
				setHeader((RIFHeader)null);
				return;
			case ExchangeFilePackage.RIF__CORE_CONTENT:
				setCoreContent((RIFContent)null);
				return;
			case ExchangeFilePackage.RIF__TOOL_EXTENSIONS:
				setToolExtensions((RIFToolExtension)null);
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
			case ExchangeFilePackage.RIF__HEADER:
				return header != null;
			case ExchangeFilePackage.RIF__CORE_CONTENT:
				return coreContent != null;
			case ExchangeFilePackage.RIF__TOOL_EXTENSIONS:
				return toolExtensions != null;
		}
		return super.eIsSet(featureID);
	}

} //RIFImpl
