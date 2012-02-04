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
import org.eclipse.rmf.reqif10.ReqIfContent;
import org.eclipse.rmf.reqif10.ReqIfHeader;
import org.eclipse.rmf.reqif10.ReqIfToolExtension;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Req If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfImpl#getTheHeader <em>The Header</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfImpl#getToolExtensions <em>Tool Extensions</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIfImpl#getCoreContent <em>Core Content</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReqIfImpl extends EObjectImpl implements ReqIf {
	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTheHeader() <em>The Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheHeader()
	 * @generated
	 * @ordered
	 */
	protected ReqIfHeader theHeader;

	/**
	 * The cached value of the '{@link #getToolExtensions() <em>Tool Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<ReqIfToolExtension> toolExtensions;

	/**
	 * The cached value of the '{@link #getCoreContent() <em>Core Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreContent()
	 * @generated
	 * @ordered
	 */
	protected ReqIfContent coreContent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqIfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Reqif10Package.Literals.REQ_IF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.REQ_IF__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIfHeader getTheHeader() {
		return theHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheHeader(ReqIfHeader newTheHeader, NotificationChain msgs) {
		ReqIfHeader oldTheHeader = theHeader;
		theHeader = newTheHeader;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Reqif10Package.REQ_IF__THE_HEADER, oldTheHeader, newTheHeader);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheHeader(ReqIfHeader newTheHeader) {
		if (newTheHeader != theHeader) {
			NotificationChain msgs = null;
			if (theHeader != null)
				msgs = ((InternalEObject)theHeader).eInverseRemove(this, Reqif10Package.REQ_IF_HEADER__DOCUMENT_ROOT, ReqIfHeader.class, msgs);
			if (newTheHeader != null)
				msgs = ((InternalEObject)newTheHeader).eInverseAdd(this, Reqif10Package.REQ_IF_HEADER__DOCUMENT_ROOT, ReqIfHeader.class, msgs);
			msgs = basicSetTheHeader(newTheHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.REQ_IF__THE_HEADER, newTheHeader, newTheHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReqIfToolExtension> getToolExtensions() {
		if (toolExtensions == null) {
			toolExtensions = new EObjectContainmentWithInverseEList<ReqIfToolExtension>(ReqIfToolExtension.class, this, Reqif10Package.REQ_IF__TOOL_EXTENSIONS, Reqif10Package.REQ_IF_TOOL_EXTENSION__DOCUMENT_ROOT);
		}
		return toolExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIfContent getCoreContent() {
		return coreContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoreContent(ReqIfContent newCoreContent, NotificationChain msgs) {
		ReqIfContent oldCoreContent = coreContent;
		coreContent = newCoreContent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Reqif10Package.REQ_IF__CORE_CONTENT, oldCoreContent, newCoreContent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreContent(ReqIfContent newCoreContent) {
		if (newCoreContent != coreContent) {
			NotificationChain msgs = null;
			if (coreContent != null)
				msgs = ((InternalEObject)coreContent).eInverseRemove(this, Reqif10Package.REQ_IF_CONTENT__DOCUMENT_ROOT, ReqIfContent.class, msgs);
			if (newCoreContent != null)
				msgs = ((InternalEObject)newCoreContent).eInverseAdd(this, Reqif10Package.REQ_IF_CONTENT__DOCUMENT_ROOT, ReqIfContent.class, msgs);
			msgs = basicSetCoreContent(newCoreContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Reqif10Package.REQ_IF__CORE_CONTENT, newCoreContent, newCoreContent));
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
			case Reqif10Package.REQ_IF__THE_HEADER:
				if (theHeader != null)
					msgs = ((InternalEObject)theHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Reqif10Package.REQ_IF__THE_HEADER, null, msgs);
				return basicSetTheHeader((ReqIfHeader)otherEnd, msgs);
			case Reqif10Package.REQ_IF__TOOL_EXTENSIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getToolExtensions()).basicAdd(otherEnd, msgs);
			case Reqif10Package.REQ_IF__CORE_CONTENT:
				if (coreContent != null)
					msgs = ((InternalEObject)coreContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Reqif10Package.REQ_IF__CORE_CONTENT, null, msgs);
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
			case Reqif10Package.REQ_IF__THE_HEADER:
				return basicSetTheHeader(null, msgs);
			case Reqif10Package.REQ_IF__TOOL_EXTENSIONS:
				return ((InternalEList<?>)getToolExtensions()).basicRemove(otherEnd, msgs);
			case Reqif10Package.REQ_IF__CORE_CONTENT:
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Reqif10Package.REQ_IF__LANG:
				return getLang();
			case Reqif10Package.REQ_IF__THE_HEADER:
				return getTheHeader();
			case Reqif10Package.REQ_IF__TOOL_EXTENSIONS:
				return getToolExtensions();
			case Reqif10Package.REQ_IF__CORE_CONTENT:
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
			case Reqif10Package.REQ_IF__LANG:
				setLang((String)newValue);
				return;
			case Reqif10Package.REQ_IF__THE_HEADER:
				setTheHeader((ReqIfHeader)newValue);
				return;
			case Reqif10Package.REQ_IF__TOOL_EXTENSIONS:
				getToolExtensions().clear();
				getToolExtensions().addAll((Collection<? extends ReqIfToolExtension>)newValue);
				return;
			case Reqif10Package.REQ_IF__CORE_CONTENT:
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
			case Reqif10Package.REQ_IF__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case Reqif10Package.REQ_IF__THE_HEADER:
				setTheHeader((ReqIfHeader)null);
				return;
			case Reqif10Package.REQ_IF__TOOL_EXTENSIONS:
				getToolExtensions().clear();
				return;
			case Reqif10Package.REQ_IF__CORE_CONTENT:
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
			case Reqif10Package.REQ_IF__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case Reqif10Package.REQ_IF__THE_HEADER:
				return theHeader != null;
			case Reqif10Package.REQ_IF__TOOL_EXTENSIONS:
				return toolExtensions != null && !toolExtensions.isEmpty();
			case Reqif10Package.REQ_IF__CORE_CONTENT:
				return coreContent != null;
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
		result.append(" (lang: ");
		result.append(lang);
		result.append(')');
		return result.toString();
	}

} //ReqIfImpl
