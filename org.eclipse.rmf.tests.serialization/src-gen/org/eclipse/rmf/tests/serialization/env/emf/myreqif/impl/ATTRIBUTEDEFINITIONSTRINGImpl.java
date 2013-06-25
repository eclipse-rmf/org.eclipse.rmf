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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType15;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONSTRING;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType4;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType3;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATTRIBUTEDEFINITIONSTRING</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONSTRINGImpl#getALTERNATIVEID <em>ALTERNATIVEID</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONSTRINGImpl#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONSTRINGImpl#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONSTRINGImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONSTRINGImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONSTRINGImpl#isISEDITABLE <em>ISEDITABLE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONSTRINGImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONSTRINGImpl#getLONGNAME <em>LONGNAME</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ATTRIBUTEDEFINITIONSTRINGImpl extends EObjectImpl implements ATTRIBUTEDEFINITIONSTRING {
	/**
	 * The cached value of the '{@link #getALTERNATIVEID() <em>ALTERNATIVEID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getALTERNATIVEID()
	 * @generated
	 * @ordered
	 */
	protected ALTERNATIVEIDType15 aLTERNATIVEID;

	/**
	 * The cached value of the '{@link #getDEFAULTVALUE() <em>DEFAULTVALUE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDEFAULTVALUE()
	 * @generated
	 * @ordered
	 */
	protected DEFAULTVALUEType4 dEFAULTVALUE;

	/**
	 * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTYPE()
	 * @generated
	 * @ordered
	 */
	protected TYPEType3 tYPE;

	/**
	 * The default value of the '{@link #getDESC() <em>DESC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDESC()
	 * @generated
	 * @ordered
	 */
	protected static final String DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDESC() <em>DESC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDESC()
	 * @generated
	 * @ordered
	 */
	protected String dESC = DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getIDENTIFIER() <em>IDENTIFIER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDENTIFIER()
	 * @generated
	 * @ordered
	 */
	protected static final String IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIDENTIFIER() <em>IDENTIFIER</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIDENTIFIER()
	 * @generated
	 * @ordered
	 */
	protected String iDENTIFIER = IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #isISEDITABLE() <em>ISEDITABLE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isISEDITABLE()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISEDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isISEDITABLE() <em>ISEDITABLE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isISEDITABLE()
	 * @generated
	 * @ordered
	 */
	protected boolean iSEDITABLE = ISEDITABLE_EDEFAULT;

	/**
	 * This is true if the ISEDITABLE attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iSEDITABLEESet;

	/**
	 * The default value of the '{@link #getLASTCHANGE() <em>LASTCHANGE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLASTCHANGE()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar LASTCHANGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLASTCHANGE() <em>LASTCHANGE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLASTCHANGE()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar lASTCHANGE = LASTCHANGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLONGNAME() <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLONGNAME()
	 * @generated
	 * @ordered
	 */
	protected static final String LONGNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLONGNAME() <em>LONGNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLONGNAME()
	 * @generated
	 * @ordered
	 */
	protected String lONGNAME = LONGNAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATTRIBUTEDEFINITIONSTRINGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.ATTRIBUTEDEFINITIONSTRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType15 getALTERNATIVEID() {
		return aLTERNATIVEID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetALTERNATIVEID(ALTERNATIVEIDType15 newALTERNATIVEID, NotificationChain msgs) {
		ALTERNATIVEIDType15 oldALTERNATIVEID = aLTERNATIVEID;
		aLTERNATIVEID = newALTERNATIVEID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__ALTERNATIVEID, oldALTERNATIVEID, newALTERNATIVEID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setALTERNATIVEID(ALTERNATIVEIDType15 newALTERNATIVEID) {
		if (newALTERNATIVEID != aLTERNATIVEID) {
			NotificationChain msgs = null;
			if (aLTERNATIVEID != null)
				msgs = ((InternalEObject)aLTERNATIVEID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__ALTERNATIVEID, null, msgs);
			if (newALTERNATIVEID != null)
				msgs = ((InternalEObject)newALTERNATIVEID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__ALTERNATIVEID, null, msgs);
			msgs = basicSetALTERNATIVEID(newALTERNATIVEID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__ALTERNATIVEID, newALTERNATIVEID, newALTERNATIVEID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEFAULTVALUEType4 getDEFAULTVALUE() {
		return dEFAULTVALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDEFAULTVALUE(DEFAULTVALUEType4 newDEFAULTVALUE, NotificationChain msgs) {
		DEFAULTVALUEType4 oldDEFAULTVALUE = dEFAULTVALUE;
		dEFAULTVALUE = newDEFAULTVALUE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__DEFAULTVALUE, oldDEFAULTVALUE, newDEFAULTVALUE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDEFAULTVALUE(DEFAULTVALUEType4 newDEFAULTVALUE) {
		if (newDEFAULTVALUE != dEFAULTVALUE) {
			NotificationChain msgs = null;
			if (dEFAULTVALUE != null)
				msgs = ((InternalEObject)dEFAULTVALUE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__DEFAULTVALUE, null, msgs);
			if (newDEFAULTVALUE != null)
				msgs = ((InternalEObject)newDEFAULTVALUE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__DEFAULTVALUE, null, msgs);
			msgs = basicSetDEFAULTVALUE(newDEFAULTVALUE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__DEFAULTVALUE, newDEFAULTVALUE, newDEFAULTVALUE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEType3 getTYPE() {
		return tYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTYPE(TYPEType3 newTYPE, NotificationChain msgs) {
		TYPEType3 oldTYPE = tYPE;
		tYPE = newTYPE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__TYPE, oldTYPE, newTYPE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTYPE(TYPEType3 newTYPE) {
		if (newTYPE != tYPE) {
			NotificationChain msgs = null;
			if (tYPE != null)
				msgs = ((InternalEObject)tYPE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__TYPE, null, msgs);
			if (newTYPE != null)
				msgs = ((InternalEObject)newTYPE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__TYPE, null, msgs);
			msgs = basicSetTYPE(newTYPE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__TYPE, newTYPE, newTYPE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDESC() {
		return dESC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDESC(String newDESC) {
		String oldDESC = dESC;
		dESC = newDESC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__DESC, oldDESC, dESC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIDENTIFIER() {
		return iDENTIFIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIDENTIFIER(String newIDENTIFIER) {
		String oldIDENTIFIER = iDENTIFIER;
		iDENTIFIER = newIDENTIFIER;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__IDENTIFIER, oldIDENTIFIER, iDENTIFIER));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isISEDITABLE() {
		return iSEDITABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISEDITABLE(boolean newISEDITABLE) {
		boolean oldISEDITABLE = iSEDITABLE;
		iSEDITABLE = newISEDITABLE;
		boolean oldISEDITABLEESet = iSEDITABLEESet;
		iSEDITABLEESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__ISEDITABLE, oldISEDITABLE, iSEDITABLE, !oldISEDITABLEESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetISEDITABLE() {
		boolean oldISEDITABLE = iSEDITABLE;
		boolean oldISEDITABLEESet = iSEDITABLEESet;
		iSEDITABLE = ISEDITABLE_EDEFAULT;
		iSEDITABLEESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__ISEDITABLE, oldISEDITABLE, ISEDITABLE_EDEFAULT, oldISEDITABLEESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetISEDITABLE() {
		return iSEDITABLEESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getLASTCHANGE() {
		return lASTCHANGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLASTCHANGE(XMLGregorianCalendar newLASTCHANGE) {
		XMLGregorianCalendar oldLASTCHANGE = lASTCHANGE;
		lASTCHANGE = newLASTCHANGE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__LASTCHANGE, oldLASTCHANGE, lASTCHANGE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLONGNAME() {
		return lONGNAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLONGNAME(String newLONGNAME) {
		String oldLONGNAME = lONGNAME;
		lONGNAME = newLONGNAME;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__LONGNAME, oldLONGNAME, lONGNAME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__ALTERNATIVEID:
				return basicSetALTERNATIVEID(null, msgs);
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__DEFAULTVALUE:
				return basicSetDEFAULTVALUE(null, msgs);
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__TYPE:
				return basicSetTYPE(null, msgs);
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
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__ALTERNATIVEID:
				return getALTERNATIVEID();
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__DEFAULTVALUE:
				return getDEFAULTVALUE();
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__TYPE:
				return getTYPE();
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__DESC:
				return getDESC();
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__IDENTIFIER:
				return getIDENTIFIER();
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__ISEDITABLE:
				return isISEDITABLE();
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__LASTCHANGE:
				return getLASTCHANGE();
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__LONGNAME:
				return getLONGNAME();
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
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__ALTERNATIVEID:
				setALTERNATIVEID((ALTERNATIVEIDType15)newValue);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__DEFAULTVALUE:
				setDEFAULTVALUE((DEFAULTVALUEType4)newValue);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__TYPE:
				setTYPE((TYPEType3)newValue);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__DESC:
				setDESC((String)newValue);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__IDENTIFIER:
				setIDENTIFIER((String)newValue);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__ISEDITABLE:
				setISEDITABLE((Boolean)newValue);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__LASTCHANGE:
				setLASTCHANGE((XMLGregorianCalendar)newValue);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__LONGNAME:
				setLONGNAME((String)newValue);
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
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__ALTERNATIVEID:
				setALTERNATIVEID((ALTERNATIVEIDType15)null);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__DEFAULTVALUE:
				setDEFAULTVALUE((DEFAULTVALUEType4)null);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__TYPE:
				setTYPE((TYPEType3)null);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__DESC:
				setDESC(DESC_EDEFAULT);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__IDENTIFIER:
				setIDENTIFIER(IDENTIFIER_EDEFAULT);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__ISEDITABLE:
				unsetISEDITABLE();
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__LASTCHANGE:
				setLASTCHANGE(LASTCHANGE_EDEFAULT);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__LONGNAME:
				setLONGNAME(LONGNAME_EDEFAULT);
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
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__ALTERNATIVEID:
				return aLTERNATIVEID != null;
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__DEFAULTVALUE:
				return dEFAULTVALUE != null;
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__TYPE:
				return tYPE != null;
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__DESC:
				return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals(dESC);
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__ISEDITABLE:
				return isSetISEDITABLE();
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__LASTCHANGE:
				return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
			case MyreqifPackage.ATTRIBUTEDEFINITIONSTRING__LONGNAME:
				return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals(lONGNAME);
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
		result.append(" (dESC: ");
		result.append(dESC);
		result.append(", iDENTIFIER: ");
		result.append(iDENTIFIER);
		result.append(", iSEDITABLE: ");
		if (iSEDITABLEESet) result.append(iSEDITABLE); else result.append("<unset>");
		result.append(", lASTCHANGE: ");
		result.append(lASTCHANGE);
		result.append(", lONGNAME: ");
		result.append(lONGNAME);
		result.append(')');
		return result.toString();
	}

} //ATTRIBUTEDEFINITIONSTRINGImpl
