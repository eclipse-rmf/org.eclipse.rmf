/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.rmf.reqif10.ReqIF;
import org.eclipse.rmf.reqif10.ReqIF10Package;
import org.eclipse.rmf.reqif10.ReqIFContent;
import org.eclipse.rmf.reqif10.ReqIFHeader;
import org.eclipse.rmf.reqif10.ReqIFToolExtension;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Req IF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIFImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIFImpl#getTheHeader <em>The Header</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIFImpl#getCoreContent <em>Core Content</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.impl.ReqIFImpl#getToolExtensions <em>Tool Extensions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReqIFImpl extends EObjectImpl implements ReqIF {
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
	 * This is true if the Lang attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean langESet;

	/**
	 * The cached value of the '{@link #getTheHeader() <em>The Header</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTheHeader()
	 * @generated
	 * @ordered
	 */
	protected ReqIFHeader theHeader;

	/**
	 * This is true if the The Header containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean theHeaderESet;

	/**
	 * The cached value of the '{@link #getCoreContent() <em>Core Content</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoreContent()
	 * @generated
	 * @ordered
	 */
	protected ReqIFContent coreContent;

	/**
	 * This is true if the Core Content containment reference has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coreContentESet;

	/**
	 * The cached value of the '{@link #getToolExtensions() <em>Tool Extensions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolExtensions()
	 * @generated
	 * @ordered
	 */
	protected EList<ReqIFToolExtension> toolExtensions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReqIFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqIF10Package.Literals.REQ_IF;
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
		boolean oldLangESet = langESet;
		langESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqIF10Package.REQ_IF__LANG, oldLang, lang, !oldLangESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLang() {
		String oldLang = lang;
		boolean oldLangESet = langESet;
		lang = LANG_EDEFAULT;
		langESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.REQ_IF__LANG, oldLang, LANG_EDEFAULT, oldLangESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLang() {
		return langESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIFHeader getTheHeader() {
		return theHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTheHeader(ReqIFHeader newTheHeader, NotificationChain msgs) {
		ReqIFHeader oldTheHeader = theHeader;
		theHeader = newTheHeader;
		boolean oldTheHeaderESet = theHeaderESet;
		theHeaderESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqIF10Package.REQ_IF__THE_HEADER, oldTheHeader, newTheHeader, !oldTheHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTheHeader(ReqIFHeader newTheHeader) {
		if (newTheHeader != theHeader) {
			NotificationChain msgs = null;
			if (theHeader != null)
				msgs = ((InternalEObject)theHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqIF10Package.REQ_IF__THE_HEADER, null, msgs);
			if (newTheHeader != null)
				msgs = ((InternalEObject)newTheHeader).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqIF10Package.REQ_IF__THE_HEADER, null, msgs);
			msgs = basicSetTheHeader(newTheHeader, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTheHeaderESet = theHeaderESet;
			theHeaderESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ReqIF10Package.REQ_IF__THE_HEADER, newTheHeader, newTheHeader, !oldTheHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetTheHeader(NotificationChain msgs) {
		ReqIFHeader oldTheHeader = theHeader;
		theHeader = null;
		boolean oldTheHeaderESet = theHeaderESet;
		theHeaderESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.REQ_IF__THE_HEADER, oldTheHeader, null, oldTheHeaderESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTheHeader() {
		if (theHeader != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)theHeader).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqIF10Package.REQ_IF__THE_HEADER, null, msgs);
			msgs = basicUnsetTheHeader(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldTheHeaderESet = theHeaderESet;
			theHeaderESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.REQ_IF__THE_HEADER, null, null, oldTheHeaderESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTheHeader() {
		return theHeaderESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReqIFToolExtension> getToolExtensions() {
		if (toolExtensions == null) {
			toolExtensions = new EObjectContainmentEList.Unsettable<ReqIFToolExtension>(ReqIFToolExtension.class, this, ReqIF10Package.REQ_IF__TOOL_EXTENSIONS);
		}
		return toolExtensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetToolExtensions() {
		if (toolExtensions != null) ((InternalEList.Unsettable<?>)toolExtensions).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetToolExtensions() {
		return toolExtensions != null && ((InternalEList.Unsettable<?>)toolExtensions).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReqIFContent getCoreContent() {
		return coreContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoreContent(ReqIFContent newCoreContent, NotificationChain msgs) {
		ReqIFContent oldCoreContent = coreContent;
		coreContent = newCoreContent;
		boolean oldCoreContentESet = coreContentESet;
		coreContentESet = true;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqIF10Package.REQ_IF__CORE_CONTENT, oldCoreContent, newCoreContent, !oldCoreContentESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoreContent(ReqIFContent newCoreContent) {
		if (newCoreContent != coreContent) {
			NotificationChain msgs = null;
			if (coreContent != null)
				msgs = ((InternalEObject)coreContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqIF10Package.REQ_IF__CORE_CONTENT, null, msgs);
			if (newCoreContent != null)
				msgs = ((InternalEObject)newCoreContent).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqIF10Package.REQ_IF__CORE_CONTENT, null, msgs);
			msgs = basicSetCoreContent(newCoreContent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCoreContentESet = coreContentESet;
			coreContentESet = true;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.SET, ReqIF10Package.REQ_IF__CORE_CONTENT, newCoreContent, newCoreContent, !oldCoreContentESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicUnsetCoreContent(NotificationChain msgs) {
		ReqIFContent oldCoreContent = coreContent;
		coreContent = null;
		boolean oldCoreContentESet = coreContentESet;
		coreContentESet = false;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.REQ_IF__CORE_CONTENT, oldCoreContent, null, oldCoreContentESet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCoreContent() {
		if (coreContent != null) {
			NotificationChain msgs = null;
			msgs = ((InternalEObject)coreContent).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqIF10Package.REQ_IF__CORE_CONTENT, null, msgs);
			msgs = basicUnsetCoreContent(msgs);
			if (msgs != null) msgs.dispatch();
		}
		else {
			boolean oldCoreContentESet = coreContentESet;
			coreContentESet = false;
			if (eNotificationRequired())
				eNotify(new ENotificationImpl(this, Notification.UNSET, ReqIF10Package.REQ_IF__CORE_CONTENT, null, null, oldCoreContentESet));
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCoreContent() {
		return coreContentESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReqIF10Package.REQ_IF__THE_HEADER:
				return basicUnsetTheHeader(msgs);
			case ReqIF10Package.REQ_IF__CORE_CONTENT:
				return basicUnsetCoreContent(msgs);
			case ReqIF10Package.REQ_IF__TOOL_EXTENSIONS:
				return ((InternalEList<?>)getToolExtensions()).basicRemove(otherEnd, msgs);
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
			case ReqIF10Package.REQ_IF__LANG:
				return getLang();
			case ReqIF10Package.REQ_IF__THE_HEADER:
				return getTheHeader();
			case ReqIF10Package.REQ_IF__CORE_CONTENT:
				return getCoreContent();
			case ReqIF10Package.REQ_IF__TOOL_EXTENSIONS:
				return getToolExtensions();
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
			case ReqIF10Package.REQ_IF__LANG:
				setLang((String)newValue);
				return;
			case ReqIF10Package.REQ_IF__THE_HEADER:
				setTheHeader((ReqIFHeader)newValue);
				return;
			case ReqIF10Package.REQ_IF__CORE_CONTENT:
				setCoreContent((ReqIFContent)newValue);
				return;
			case ReqIF10Package.REQ_IF__TOOL_EXTENSIONS:
				getToolExtensions().clear();
				getToolExtensions().addAll((Collection<? extends ReqIFToolExtension>)newValue);
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
			case ReqIF10Package.REQ_IF__LANG:
				unsetLang();
				return;
			case ReqIF10Package.REQ_IF__THE_HEADER:
				unsetTheHeader();
				return;
			case ReqIF10Package.REQ_IF__CORE_CONTENT:
				unsetCoreContent();
				return;
			case ReqIF10Package.REQ_IF__TOOL_EXTENSIONS:
				unsetToolExtensions();
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
			case ReqIF10Package.REQ_IF__LANG:
				return isSetLang();
			case ReqIF10Package.REQ_IF__THE_HEADER:
				return isSetTheHeader();
			case ReqIF10Package.REQ_IF__CORE_CONTENT:
				return isSetCoreContent();
			case ReqIF10Package.REQ_IF__TOOL_EXTENSIONS:
				return isSetToolExtensions();
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
		if (langESet) result.append(lang); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ReqIFImpl
