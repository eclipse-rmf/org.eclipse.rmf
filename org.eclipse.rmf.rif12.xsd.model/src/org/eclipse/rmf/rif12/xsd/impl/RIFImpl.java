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

package org.eclipse.rmf.rif12.xsd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.rmf.rif12.its.DirType;
import org.eclipse.rmf.rif12.xsd.CORECONTENTType;
import org.eclipse.rmf.rif12.xsd.HEADERType;
import org.eclipse.rmf.rif12.xsd.RIF;
import org.eclipse.rmf.rif12.xsd.RifPackage;
import org.eclipse.rmf.rif12.xsd.TOOLEXTENSIONSType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RIF</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFImpl#getHEADER <em>HEADER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFImpl#getCORECONTENT <em>CORECONTENT</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFImpl#getTOOLEXTENSIONS <em>TOOLEXTENSIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFImpl#getLang <em>Lang</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RIFImpl extends EObjectImpl implements RIF {
	/**
	 * The cached value of the '{@link #getHEADER() <em>HEADER</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHEADER()
	 * @generated
	 * @ordered
	 */
	protected HEADERType hEADER;

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
	 * The default value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected static final DirType DIR_EDEFAULT = DirType.LTR;

	/**
	 * The cached value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected DirType dir = DIR_EDEFAULT;

	/**
	 * This is true if the Dir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dirESet;

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
		return RifPackage.Literals.RIF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HEADERType getHEADER() {
		return hEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHEADER(HEADERType newHEADER, NotificationChain msgs) {
		HEADERType oldHEADER = hEADER;
		hEADER = newHEADER;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.RIF__HEADER, oldHEADER, newHEADER);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHEADER(HEADERType newHEADER) {
		if (newHEADER != hEADER) {
			NotificationChain msgs = null;
			if (hEADER != null)
				msgs = ((InternalEObject)hEADER).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIF__HEADER, null, msgs);
			if (newHEADER != null)
				msgs = ((InternalEObject)newHEADER).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIF__HEADER, null, msgs);
			msgs = basicSetHEADER(newHEADER, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIF__HEADER, newHEADER, newHEADER));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.RIF__CORECONTENT, oldCORECONTENT, newCORECONTENT);
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
				msgs = ((InternalEObject)cORECONTENT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIF__CORECONTENT, null, msgs);
			if (newCORECONTENT != null)
				msgs = ((InternalEObject)newCORECONTENT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIF__CORECONTENT, null, msgs);
			msgs = basicSetCORECONTENT(newCORECONTENT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIF__CORECONTENT, newCORECONTENT, newCORECONTENT));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.RIF__TOOLEXTENSIONS, oldTOOLEXTENSIONS, newTOOLEXTENSIONS);
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
				msgs = ((InternalEObject)tOOLEXTENSIONS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIF__TOOLEXTENSIONS, null, msgs);
			if (newTOOLEXTENSIONS != null)
				msgs = ((InternalEObject)newTOOLEXTENSIONS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIF__TOOLEXTENSIONS, null, msgs);
			msgs = basicSetTOOLEXTENSIONS(newTOOLEXTENSIONS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIF__TOOLEXTENSIONS, newTOOLEXTENSIONS, newTOOLEXTENSIONS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType getDir() {
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDir(DirType newDir) {
		DirType oldDir = dir;
		dir = newDir == null ? DIR_EDEFAULT : newDir;
		boolean oldDirESet = dirESet;
		dirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIF__DIR, oldDir, dir, !oldDirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDir() {
		DirType oldDir = dir;
		boolean oldDirESet = dirESet;
		dir = DIR_EDEFAULT;
		dirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RifPackage.RIF__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDir() {
		return dirESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIF__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.RIF__HEADER:
				return basicSetHEADER(null, msgs);
			case RifPackage.RIF__CORECONTENT:
				return basicSetCORECONTENT(null, msgs);
			case RifPackage.RIF__TOOLEXTENSIONS:
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
			case RifPackage.RIF__HEADER:
				return getHEADER();
			case RifPackage.RIF__CORECONTENT:
				return getCORECONTENT();
			case RifPackage.RIF__TOOLEXTENSIONS:
				return getTOOLEXTENSIONS();
			case RifPackage.RIF__DIR:
				return getDir();
			case RifPackage.RIF__LANG:
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
			case RifPackage.RIF__HEADER:
				setHEADER((HEADERType)newValue);
				return;
			case RifPackage.RIF__CORECONTENT:
				setCORECONTENT((CORECONTENTType)newValue);
				return;
			case RifPackage.RIF__TOOLEXTENSIONS:
				setTOOLEXTENSIONS((TOOLEXTENSIONSType)newValue);
				return;
			case RifPackage.RIF__DIR:
				setDir((DirType)newValue);
				return;
			case RifPackage.RIF__LANG:
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
			case RifPackage.RIF__HEADER:
				setHEADER((HEADERType)null);
				return;
			case RifPackage.RIF__CORECONTENT:
				setCORECONTENT((CORECONTENTType)null);
				return;
			case RifPackage.RIF__TOOLEXTENSIONS:
				setTOOLEXTENSIONS((TOOLEXTENSIONSType)null);
				return;
			case RifPackage.RIF__DIR:
				unsetDir();
				return;
			case RifPackage.RIF__LANG:
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
			case RifPackage.RIF__HEADER:
				return hEADER != null;
			case RifPackage.RIF__CORECONTENT:
				return cORECONTENT != null;
			case RifPackage.RIF__TOOLEXTENSIONS:
				return tOOLEXTENSIONS != null;
			case RifPackage.RIF__DIR:
				return isSetDir();
			case RifPackage.RIF__LANG:
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
		result.append(" (dir: ");
		if (dirESet) result.append(dir); else result.append("<unset>");
		result.append(", lang: ");
		result.append(lang);
		result.append(')');
		return result.toString();
	}

} //RIFImpl
