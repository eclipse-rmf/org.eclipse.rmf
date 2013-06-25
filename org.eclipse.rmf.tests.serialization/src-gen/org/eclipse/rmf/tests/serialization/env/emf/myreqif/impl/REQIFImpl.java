/**
 * Copyright (c) 2013 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *    itemis AG - initial API and implementation
 * 
 */
package org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.CORECONTENTType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIF;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.THEHEADERType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TOOLEXTENSIONSType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REQIF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFImpl#getTHEHEADER <em>THEHEADER</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFImpl#getCORECONTENT <em>CORECONTENT</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFImpl#getTOOLEXTENSIONS <em>TOOLEXTENSIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFImpl#getLang <em>Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class REQIFImpl extends EObjectImpl implements REQIF {
	/**
	 * The cached value of the '{@link #getTHEHEADER() <em>THEHEADER</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTHEHEADER()
	 * @generated
	 * @ordered
	 */
	protected THEHEADERType tHEHEADER;

	/**
	 * The cached value of the '{@link #getCORECONTENT() <em>CORECONTENT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCORECONTENT()
	 * @generated
	 * @ordered
	 */
	protected CORECONTENTType cORECONTENT;

	/**
	 * The cached value of the '{@link #getTOOLEXTENSIONS() <em>TOOLEXTENSIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTOOLEXTENSIONS()
	 * @generated
	 * @ordered
	 */
	protected TOOLEXTENSIONSType tOOLEXTENSIONS;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REQIFImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.REQIF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public THEHEADERType getTHEHEADER() {
		return tHEHEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTHEHEADER(THEHEADERType newTHEHEADER, NotificationChain msgs) {
		THEHEADERType oldTHEHEADER = tHEHEADER;
		tHEHEADER = newTHEHEADER;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIF__THEHEADER, oldTHEHEADER, newTHEHEADER);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTHEHEADER(THEHEADERType newTHEHEADER) {
		if (newTHEHEADER != tHEHEADER) {
			NotificationChain msgs = null;
			if (tHEHEADER != null)
				msgs = ((InternalEObject)tHEHEADER).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.REQIF__THEHEADER, null, msgs);
			if (newTHEHEADER != null)
				msgs = ((InternalEObject)newTHEHEADER).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.REQIF__THEHEADER, null, msgs);
			msgs = basicSetTHEHEADER(newTHEHEADER, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIF__THEHEADER, newTHEHEADER, newTHEHEADER));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CORECONTENTType getCORECONTENT() {
		return cORECONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCORECONTENT(CORECONTENTType newCORECONTENT, NotificationChain msgs) {
		CORECONTENTType oldCORECONTENT = cORECONTENT;
		cORECONTENT = newCORECONTENT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIF__CORECONTENT, oldCORECONTENT, newCORECONTENT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCORECONTENT(CORECONTENTType newCORECONTENT) {
		if (newCORECONTENT != cORECONTENT) {
			NotificationChain msgs = null;
			if (cORECONTENT != null)
				msgs = ((InternalEObject)cORECONTENT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.REQIF__CORECONTENT, null, msgs);
			if (newCORECONTENT != null)
				msgs = ((InternalEObject)newCORECONTENT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.REQIF__CORECONTENT, null, msgs);
			msgs = basicSetCORECONTENT(newCORECONTENT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIF__CORECONTENT, newCORECONTENT, newCORECONTENT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TOOLEXTENSIONSType getTOOLEXTENSIONS() {
		return tOOLEXTENSIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTOOLEXTENSIONS(TOOLEXTENSIONSType newTOOLEXTENSIONS, NotificationChain msgs) {
		TOOLEXTENSIONSType oldTOOLEXTENSIONS = tOOLEXTENSIONS;
		tOOLEXTENSIONS = newTOOLEXTENSIONS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIF__TOOLEXTENSIONS, oldTOOLEXTENSIONS, newTOOLEXTENSIONS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTOOLEXTENSIONS(TOOLEXTENSIONSType newTOOLEXTENSIONS) {
		if (newTOOLEXTENSIONS != tOOLEXTENSIONS) {
			NotificationChain msgs = null;
			if (tOOLEXTENSIONS != null)
				msgs = ((InternalEObject)tOOLEXTENSIONS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.REQIF__TOOLEXTENSIONS, null, msgs);
			if (newTOOLEXTENSIONS != null)
				msgs = ((InternalEObject)newTOOLEXTENSIONS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.REQIF__TOOLEXTENSIONS, null, msgs);
			msgs = basicSetTOOLEXTENSIONS(newTOOLEXTENSIONS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIF__TOOLEXTENSIONS, newTOOLEXTENSIONS, newTOOLEXTENSIONS));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIF__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyreqifPackage.REQIF__THEHEADER:
				return basicSetTHEHEADER(null, msgs);
			case MyreqifPackage.REQIF__CORECONTENT:
				return basicSetCORECONTENT(null, msgs);
			case MyreqifPackage.REQIF__TOOLEXTENSIONS:
				return basicSetTOOLEXTENSIONS(null, msgs);
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
			case MyreqifPackage.REQIF__THEHEADER:
				return getTHEHEADER();
			case MyreqifPackage.REQIF__CORECONTENT:
				return getCORECONTENT();
			case MyreqifPackage.REQIF__TOOLEXTENSIONS:
				return getTOOLEXTENSIONS();
			case MyreqifPackage.REQIF__LANG:
				return getLang();
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
			case MyreqifPackage.REQIF__THEHEADER:
				setTHEHEADER((THEHEADERType)newValue);
				return;
			case MyreqifPackage.REQIF__CORECONTENT:
				setCORECONTENT((CORECONTENTType)newValue);
				return;
			case MyreqifPackage.REQIF__TOOLEXTENSIONS:
				setTOOLEXTENSIONS((TOOLEXTENSIONSType)newValue);
				return;
			case MyreqifPackage.REQIF__LANG:
				setLang((String)newValue);
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
			case MyreqifPackage.REQIF__THEHEADER:
				setTHEHEADER((THEHEADERType)null);
				return;
			case MyreqifPackage.REQIF__CORECONTENT:
				setCORECONTENT((CORECONTENTType)null);
				return;
			case MyreqifPackage.REQIF__TOOLEXTENSIONS:
				setTOOLEXTENSIONS((TOOLEXTENSIONSType)null);
				return;
			case MyreqifPackage.REQIF__LANG:
				setLang(LANG_EDEFAULT);
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
			case MyreqifPackage.REQIF__THEHEADER:
				return tHEHEADER != null;
			case MyreqifPackage.REQIF__CORECONTENT:
				return cORECONTENT != null;
			case MyreqifPackage.REQIF__TOOLEXTENSIONS:
				return tOOLEXTENSIONS != null;
			case MyreqifPackage.REQIF__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
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

} //REQIFImpl
