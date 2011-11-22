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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.rmf.reqif10.xsd.ATTRIBUTEVALUEXHTML;
import org.eclipse.rmf.reqif10.xsd.DEFINITIONType3;
import org.eclipse.rmf.reqif10.xsd.ReqifPackage;
import org.eclipse.rmf.reqif10.xsd.XHTMLCONTENT;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATTRIBUTEVALUEXHTML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.ATTRIBUTEVALUEXHTMLImpl#getTHEVALUE <em>THEVALUE</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.ATTRIBUTEVALUEXHTMLImpl#getTHEORIGINALVALUE <em>THEORIGINALVALUE</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.ATTRIBUTEVALUEXHTMLImpl#getDEFINITION <em>DEFINITION</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.ATTRIBUTEVALUEXHTMLImpl#isISSIMPLIFIED <em>ISSIMPLIFIED</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ATTRIBUTEVALUEXHTMLImpl extends EObjectImpl implements ATTRIBUTEVALUEXHTML {
	/**
	 * The cached value of the '{@link #getTHEVALUE() <em>THEVALUE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTHEVALUE()
	 * @generated
	 * @ordered
	 */
	protected XHTMLCONTENT tHEVALUE;

	/**
	 * The cached value of the '{@link #getTHEORIGINALVALUE() <em>THEORIGINALVALUE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTHEORIGINALVALUE()
	 * @generated
	 * @ordered
	 */
	protected XHTMLCONTENT tHEORIGINALVALUE;

	/**
	 * The cached value of the '{@link #getDEFINITION() <em>DEFINITION</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDEFINITION()
	 * @generated
	 * @ordered
	 */
	protected DEFINITIONType3 dEFINITION;

	/**
	 * The default value of the '{@link #isISSIMPLIFIED() <em>ISSIMPLIFIED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isISSIMPLIFIED()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISSIMPLIFIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isISSIMPLIFIED() <em>ISSIMPLIFIED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isISSIMPLIFIED()
	 * @generated
	 * @ordered
	 */
	protected boolean iSSIMPLIFIED = ISSIMPLIFIED_EDEFAULT;

	/**
	 * This is true if the ISSIMPLIFIED attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iSSIMPLIFIEDESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATTRIBUTEVALUEXHTMLImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqifPackage.Literals.ATTRIBUTEVALUEXHTML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XHTMLCONTENT getTHEVALUE() {
		return tHEVALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTHEVALUE(XHTMLCONTENT newTHEVALUE, NotificationChain msgs) {
		XHTMLCONTENT oldTHEVALUE = tHEVALUE;
		tHEVALUE = newTHEVALUE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqifPackage.ATTRIBUTEVALUEXHTML__THEVALUE, oldTHEVALUE, newTHEVALUE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTHEVALUE(XHTMLCONTENT newTHEVALUE) {
		if (newTHEVALUE != tHEVALUE) {
			NotificationChain msgs = null;
			if (tHEVALUE != null)
				msgs = ((InternalEObject)tHEVALUE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.ATTRIBUTEVALUEXHTML__THEVALUE, null, msgs);
			if (newTHEVALUE != null)
				msgs = ((InternalEObject)newTHEVALUE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.ATTRIBUTEVALUEXHTML__THEVALUE, null, msgs);
			msgs = basicSetTHEVALUE(newTHEVALUE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.ATTRIBUTEVALUEXHTML__THEVALUE, newTHEVALUE, newTHEVALUE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XHTMLCONTENT getTHEORIGINALVALUE() {
		return tHEORIGINALVALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTHEORIGINALVALUE(XHTMLCONTENT newTHEORIGINALVALUE, NotificationChain msgs) {
		XHTMLCONTENT oldTHEORIGINALVALUE = tHEORIGINALVALUE;
		tHEORIGINALVALUE = newTHEORIGINALVALUE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqifPackage.ATTRIBUTEVALUEXHTML__THEORIGINALVALUE, oldTHEORIGINALVALUE, newTHEORIGINALVALUE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTHEORIGINALVALUE(XHTMLCONTENT newTHEORIGINALVALUE) {
		if (newTHEORIGINALVALUE != tHEORIGINALVALUE) {
			NotificationChain msgs = null;
			if (tHEORIGINALVALUE != null)
				msgs = ((InternalEObject)tHEORIGINALVALUE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.ATTRIBUTEVALUEXHTML__THEORIGINALVALUE, null, msgs);
			if (newTHEORIGINALVALUE != null)
				msgs = ((InternalEObject)newTHEORIGINALVALUE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.ATTRIBUTEVALUEXHTML__THEORIGINALVALUE, null, msgs);
			msgs = basicSetTHEORIGINALVALUE(newTHEORIGINALVALUE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.ATTRIBUTEVALUEXHTML__THEORIGINALVALUE, newTHEORIGINALVALUE, newTHEORIGINALVALUE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEFINITIONType3 getDEFINITION() {
		return dEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDEFINITION(DEFINITIONType3 newDEFINITION, NotificationChain msgs) {
		DEFINITIONType3 oldDEFINITION = dEFINITION;
		dEFINITION = newDEFINITION;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqifPackage.ATTRIBUTEVALUEXHTML__DEFINITION, oldDEFINITION, newDEFINITION);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDEFINITION(DEFINITIONType3 newDEFINITION) {
		if (newDEFINITION != dEFINITION) {
			NotificationChain msgs = null;
			if (dEFINITION != null)
				msgs = ((InternalEObject)dEFINITION).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.ATTRIBUTEVALUEXHTML__DEFINITION, null, msgs);
			if (newDEFINITION != null)
				msgs = ((InternalEObject)newDEFINITION).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.ATTRIBUTEVALUEXHTML__DEFINITION, null, msgs);
			msgs = basicSetDEFINITION(newDEFINITION, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.ATTRIBUTEVALUEXHTML__DEFINITION, newDEFINITION, newDEFINITION));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isISSIMPLIFIED() {
		return iSSIMPLIFIED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISSIMPLIFIED(boolean newISSIMPLIFIED) {
		boolean oldISSIMPLIFIED = iSSIMPLIFIED;
		iSSIMPLIFIED = newISSIMPLIFIED;
		boolean oldISSIMPLIFIEDESet = iSSIMPLIFIEDESet;
		iSSIMPLIFIEDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.ATTRIBUTEVALUEXHTML__ISSIMPLIFIED, oldISSIMPLIFIED, iSSIMPLIFIED, !oldISSIMPLIFIEDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetISSIMPLIFIED() {
		boolean oldISSIMPLIFIED = iSSIMPLIFIED;
		boolean oldISSIMPLIFIEDESet = iSSIMPLIFIEDESet;
		iSSIMPLIFIED = ISSIMPLIFIED_EDEFAULT;
		iSSIMPLIFIEDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ReqifPackage.ATTRIBUTEVALUEXHTML__ISSIMPLIFIED, oldISSIMPLIFIED, ISSIMPLIFIED_EDEFAULT, oldISSIMPLIFIEDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetISSIMPLIFIED() {
		return iSSIMPLIFIEDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReqifPackage.ATTRIBUTEVALUEXHTML__THEVALUE:
				return basicSetTHEVALUE(null, msgs);
			case ReqifPackage.ATTRIBUTEVALUEXHTML__THEORIGINALVALUE:
				return basicSetTHEORIGINALVALUE(null, msgs);
			case ReqifPackage.ATTRIBUTEVALUEXHTML__DEFINITION:
				return basicSetDEFINITION(null, msgs);
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
			case ReqifPackage.ATTRIBUTEVALUEXHTML__THEVALUE:
				return getTHEVALUE();
			case ReqifPackage.ATTRIBUTEVALUEXHTML__THEORIGINALVALUE:
				return getTHEORIGINALVALUE();
			case ReqifPackage.ATTRIBUTEVALUEXHTML__DEFINITION:
				return getDEFINITION();
			case ReqifPackage.ATTRIBUTEVALUEXHTML__ISSIMPLIFIED:
				return isISSIMPLIFIED();
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
			case ReqifPackage.ATTRIBUTEVALUEXHTML__THEVALUE:
				setTHEVALUE((XHTMLCONTENT)newValue);
				return;
			case ReqifPackage.ATTRIBUTEVALUEXHTML__THEORIGINALVALUE:
				setTHEORIGINALVALUE((XHTMLCONTENT)newValue);
				return;
			case ReqifPackage.ATTRIBUTEVALUEXHTML__DEFINITION:
				setDEFINITION((DEFINITIONType3)newValue);
				return;
			case ReqifPackage.ATTRIBUTEVALUEXHTML__ISSIMPLIFIED:
				setISSIMPLIFIED((Boolean)newValue);
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
			case ReqifPackage.ATTRIBUTEVALUEXHTML__THEVALUE:
				setTHEVALUE((XHTMLCONTENT)null);
				return;
			case ReqifPackage.ATTRIBUTEVALUEXHTML__THEORIGINALVALUE:
				setTHEORIGINALVALUE((XHTMLCONTENT)null);
				return;
			case ReqifPackage.ATTRIBUTEVALUEXHTML__DEFINITION:
				setDEFINITION((DEFINITIONType3)null);
				return;
			case ReqifPackage.ATTRIBUTEVALUEXHTML__ISSIMPLIFIED:
				unsetISSIMPLIFIED();
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
			case ReqifPackage.ATTRIBUTEVALUEXHTML__THEVALUE:
				return tHEVALUE != null;
			case ReqifPackage.ATTRIBUTEVALUEXHTML__THEORIGINALVALUE:
				return tHEORIGINALVALUE != null;
			case ReqifPackage.ATTRIBUTEVALUEXHTML__DEFINITION:
				return dEFINITION != null;
			case ReqifPackage.ATTRIBUTEVALUEXHTML__ISSIMPLIFIED:
				return isSetISSIMPLIFIED();
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
		result.append(" (iSSIMPLIFIED: ");
		if (iSSIMPLIFIEDESet) result.append(iSSIMPLIFIED); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ATTRIBUTEVALUEXHTMLImpl
