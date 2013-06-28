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

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEVALUEXHTML;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFINITIONType3;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATTRIBUTEVALUEXHTML</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEXHTMLImpl#getTHEVALUE <em>THEVALUE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEXHTMLImpl#getTHEORIGINALVALUE <em>THEORIGINALVALUE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEXHTMLImpl#getDEFINITION <em>DEFINITION</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEVALUEXHTMLImpl#isISSIMPLIFIED <em>ISSIMPLIFIED</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ATTRIBUTEVALUEXHTMLImpl extends EObjectImpl implements ATTRIBUTEVALUEXHTML {
	/**
	 * The default value of the '{@link #getTHEVALUE() <em>THEVALUE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTHEVALUE()
	 * @generated
	 * @ordered
	 */
	protected static final String THEVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTHEVALUE() <em>THEVALUE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTHEVALUE()
	 * @generated
	 * @ordered
	 */
	protected String tHEVALUE = THEVALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTHEORIGINALVALUE() <em>THEORIGINALVALUE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTHEORIGINALVALUE()
	 * @generated
	 * @ordered
	 */
	protected static final String THEORIGINALVALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTHEORIGINALVALUE() <em>THEORIGINALVALUE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTHEORIGINALVALUE()
	 * @generated
	 * @ordered
	 */
	protected String tHEORIGINALVALUE = THEORIGINALVALUE_EDEFAULT;

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
		return MyreqifPackage.Literals.ATTRIBUTEVALUEXHTML;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTHEVALUE() {
		return tHEVALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTHEVALUE(String newTHEVALUE) {
		String oldTHEVALUE = tHEVALUE;
		tHEVALUE = newTHEVALUE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEVALUEXHTML__THEVALUE, oldTHEVALUE, tHEVALUE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTHEORIGINALVALUE() {
		return tHEORIGINALVALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTHEORIGINALVALUE(String newTHEORIGINALVALUE) {
		String oldTHEORIGINALVALUE = tHEORIGINALVALUE;
		tHEORIGINALVALUE = newTHEORIGINALVALUE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEVALUEXHTML__THEORIGINALVALUE, oldTHEORIGINALVALUE, tHEORIGINALVALUE));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEVALUEXHTML__DEFINITION, oldDEFINITION, newDEFINITION);
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
				msgs = ((InternalEObject)dEFINITION).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.ATTRIBUTEVALUEXHTML__DEFINITION, null, msgs);
			if (newDEFINITION != null)
				msgs = ((InternalEObject)newDEFINITION).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.ATTRIBUTEVALUEXHTML__DEFINITION, null, msgs);
			msgs = basicSetDEFINITION(newDEFINITION, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEVALUEXHTML__DEFINITION, newDEFINITION, newDEFINITION));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEVALUEXHTML__ISSIMPLIFIED, oldISSIMPLIFIED, iSSIMPLIFIED, !oldISSIMPLIFIEDESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MyreqifPackage.ATTRIBUTEVALUEXHTML__ISSIMPLIFIED, oldISSIMPLIFIED, ISSIMPLIFIED_EDEFAULT, oldISSIMPLIFIEDESet));
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
			case MyreqifPackage.ATTRIBUTEVALUEXHTML__DEFINITION:
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
			case MyreqifPackage.ATTRIBUTEVALUEXHTML__THEVALUE:
				return getTHEVALUE();
			case MyreqifPackage.ATTRIBUTEVALUEXHTML__THEORIGINALVALUE:
				return getTHEORIGINALVALUE();
			case MyreqifPackage.ATTRIBUTEVALUEXHTML__DEFINITION:
				return getDEFINITION();
			case MyreqifPackage.ATTRIBUTEVALUEXHTML__ISSIMPLIFIED:
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
			case MyreqifPackage.ATTRIBUTEVALUEXHTML__THEVALUE:
				setTHEVALUE((String)newValue);
				return;
			case MyreqifPackage.ATTRIBUTEVALUEXHTML__THEORIGINALVALUE:
				setTHEORIGINALVALUE((String)newValue);
				return;
			case MyreqifPackage.ATTRIBUTEVALUEXHTML__DEFINITION:
				setDEFINITION((DEFINITIONType3)newValue);
				return;
			case MyreqifPackage.ATTRIBUTEVALUEXHTML__ISSIMPLIFIED:
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
			case MyreqifPackage.ATTRIBUTEVALUEXHTML__THEVALUE:
				setTHEVALUE(THEVALUE_EDEFAULT);
				return;
			case MyreqifPackage.ATTRIBUTEVALUEXHTML__THEORIGINALVALUE:
				setTHEORIGINALVALUE(THEORIGINALVALUE_EDEFAULT);
				return;
			case MyreqifPackage.ATTRIBUTEVALUEXHTML__DEFINITION:
				setDEFINITION((DEFINITIONType3)null);
				return;
			case MyreqifPackage.ATTRIBUTEVALUEXHTML__ISSIMPLIFIED:
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
			case MyreqifPackage.ATTRIBUTEVALUEXHTML__THEVALUE:
				return THEVALUE_EDEFAULT == null ? tHEVALUE != null : !THEVALUE_EDEFAULT.equals(tHEVALUE);
			case MyreqifPackage.ATTRIBUTEVALUEXHTML__THEORIGINALVALUE:
				return THEORIGINALVALUE_EDEFAULT == null ? tHEORIGINALVALUE != null : !THEORIGINALVALUE_EDEFAULT.equals(tHEORIGINALVALUE);
			case MyreqifPackage.ATTRIBUTEVALUEXHTML__DEFINITION:
				return dEFINITION != null;
			case MyreqifPackage.ATTRIBUTEVALUEXHTML__ISSIMPLIFIED:
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
		result.append(" (tHEVALUE: ");
		result.append(tHEVALUE);
		result.append(", tHEORIGINALVALUE: ");
		result.append(tHEORIGINALVALUE);
		result.append(", iSSIMPLIFIED: ");
		if (iSSIMPLIFIEDESet) result.append(iSSIMPLIFIED); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ATTRIBUTEVALUEXHTMLImpl
