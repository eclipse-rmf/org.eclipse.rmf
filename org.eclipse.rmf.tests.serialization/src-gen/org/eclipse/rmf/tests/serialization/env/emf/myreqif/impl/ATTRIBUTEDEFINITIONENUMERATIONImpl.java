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

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType20;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ATTRIBUTEDEFINITIONENUMERATION;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DEFAULTVALUEType1;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.TYPEType9;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATTRIBUTEDEFINITIONENUMERATION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONENUMERATIONImpl#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONENUMERATIONImpl#getALTERNATIVEID <em>ALTERNATIVEID</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONENUMERATIONImpl#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONENUMERATIONImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONENUMERATIONImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONENUMERATIONImpl#isISEDITABLE <em>ISEDITABLE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONENUMERATIONImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONENUMERATIONImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.ATTRIBUTEDEFINITIONENUMERATIONImpl#isMULTIVALUED <em>MULTIVALUED</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ATTRIBUTEDEFINITIONENUMERATIONImpl extends EObjectImpl implements ATTRIBUTEDEFINITIONENUMERATION {
	/**
	 * The cached value of the '{@link #getDEFAULTVALUE() <em>DEFAULTVALUE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDEFAULTVALUE()
	 * @generated
	 * @ordered
	 */
	protected DEFAULTVALUEType1 dEFAULTVALUE;

	/**
	 * The cached value of the '{@link #getALTERNATIVEID() <em>ALTERNATIVEID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getALTERNATIVEID()
	 * @generated
	 * @ordered
	 */
	protected ALTERNATIVEIDType20 aLTERNATIVEID;

	/**
	 * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTYPE()
	 * @generated
	 * @ordered
	 */
	protected TYPEType9 tYPE;

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
	 * The default value of the '{@link #isMULTIVALUED() <em>MULTIVALUED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMULTIVALUED()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTIVALUED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMULTIVALUED() <em>MULTIVALUED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMULTIVALUED()
	 * @generated
	 * @ordered
	 */
	protected boolean mULTIVALUED = MULTIVALUED_EDEFAULT;

	/**
	 * This is true if the MULTIVALUED attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mULTIVALUEDESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATTRIBUTEDEFINITIONENUMERATIONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.ATTRIBUTEDEFINITIONENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEFAULTVALUEType1 getDEFAULTVALUE() {
		return dEFAULTVALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDEFAULTVALUE(DEFAULTVALUEType1 newDEFAULTVALUE, NotificationChain msgs) {
		DEFAULTVALUEType1 oldDEFAULTVALUE = dEFAULTVALUE;
		dEFAULTVALUE = newDEFAULTVALUE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__DEFAULTVALUE, oldDEFAULTVALUE, newDEFAULTVALUE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDEFAULTVALUE(DEFAULTVALUEType1 newDEFAULTVALUE) {
		if (newDEFAULTVALUE != dEFAULTVALUE) {
			NotificationChain msgs = null;
			if (dEFAULTVALUE != null)
				msgs = ((InternalEObject)dEFAULTVALUE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__DEFAULTVALUE, null, msgs);
			if (newDEFAULTVALUE != null)
				msgs = ((InternalEObject)newDEFAULTVALUE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__DEFAULTVALUE, null, msgs);
			msgs = basicSetDEFAULTVALUE(newDEFAULTVALUE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__DEFAULTVALUE, newDEFAULTVALUE, newDEFAULTVALUE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType20 getALTERNATIVEID() {
		return aLTERNATIVEID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetALTERNATIVEID(ALTERNATIVEIDType20 newALTERNATIVEID, NotificationChain msgs) {
		ALTERNATIVEIDType20 oldALTERNATIVEID = aLTERNATIVEID;
		aLTERNATIVEID = newALTERNATIVEID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__ALTERNATIVEID, oldALTERNATIVEID, newALTERNATIVEID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setALTERNATIVEID(ALTERNATIVEIDType20 newALTERNATIVEID) {
		if (newALTERNATIVEID != aLTERNATIVEID) {
			NotificationChain msgs = null;
			if (aLTERNATIVEID != null)
				msgs = ((InternalEObject)aLTERNATIVEID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__ALTERNATIVEID, null, msgs);
			if (newALTERNATIVEID != null)
				msgs = ((InternalEObject)newALTERNATIVEID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__ALTERNATIVEID, null, msgs);
			msgs = basicSetALTERNATIVEID(newALTERNATIVEID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__ALTERNATIVEID, newALTERNATIVEID, newALTERNATIVEID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEType9 getTYPE() {
		return tYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTYPE(TYPEType9 newTYPE, NotificationChain msgs) {
		TYPEType9 oldTYPE = tYPE;
		tYPE = newTYPE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__TYPE, oldTYPE, newTYPE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTYPE(TYPEType9 newTYPE) {
		if (newTYPE != tYPE) {
			NotificationChain msgs = null;
			if (tYPE != null)
				msgs = ((InternalEObject)tYPE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__TYPE, null, msgs);
			if (newTYPE != null)
				msgs = ((InternalEObject)newTYPE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__TYPE, null, msgs);
			msgs = basicSetTYPE(newTYPE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__TYPE, newTYPE, newTYPE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__DESC, oldDESC, dESC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__IDENTIFIER, oldIDENTIFIER, iDENTIFIER));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__ISEDITABLE, oldISEDITABLE, iSEDITABLE, !oldISEDITABLEESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__ISEDITABLE, oldISEDITABLE, ISEDITABLE_EDEFAULT, oldISEDITABLEESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__LASTCHANGE, oldLASTCHANGE, lASTCHANGE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__LONGNAME, oldLONGNAME, lONGNAME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMULTIVALUED() {
		return mULTIVALUED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMULTIVALUED(boolean newMULTIVALUED) {
		boolean oldMULTIVALUED = mULTIVALUED;
		mULTIVALUED = newMULTIVALUED;
		boolean oldMULTIVALUEDESet = mULTIVALUEDESet;
		mULTIVALUEDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__MULTIVALUED, oldMULTIVALUED, mULTIVALUED, !oldMULTIVALUEDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMULTIVALUED() {
		boolean oldMULTIVALUED = mULTIVALUED;
		boolean oldMULTIVALUEDESet = mULTIVALUEDESet;
		mULTIVALUED = MULTIVALUED_EDEFAULT;
		mULTIVALUEDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__MULTIVALUED, oldMULTIVALUED, MULTIVALUED_EDEFAULT, oldMULTIVALUEDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMULTIVALUED() {
		return mULTIVALUEDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__DEFAULTVALUE:
				return basicSetDEFAULTVALUE(null, msgs);
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__ALTERNATIVEID:
				return basicSetALTERNATIVEID(null, msgs);
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__TYPE:
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
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__DEFAULTVALUE:
				return getDEFAULTVALUE();
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__ALTERNATIVEID:
				return getALTERNATIVEID();
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__TYPE:
				return getTYPE();
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__DESC:
				return getDESC();
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__IDENTIFIER:
				return getIDENTIFIER();
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__ISEDITABLE:
				return isISEDITABLE();
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__LASTCHANGE:
				return getLASTCHANGE();
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__LONGNAME:
				return getLONGNAME();
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__MULTIVALUED:
				return isMULTIVALUED();
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
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__DEFAULTVALUE:
				setDEFAULTVALUE((DEFAULTVALUEType1)newValue);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__ALTERNATIVEID:
				setALTERNATIVEID((ALTERNATIVEIDType20)newValue);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__TYPE:
				setTYPE((TYPEType9)newValue);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__DESC:
				setDESC((String)newValue);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__IDENTIFIER:
				setIDENTIFIER((String)newValue);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__ISEDITABLE:
				setISEDITABLE((Boolean)newValue);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__LASTCHANGE:
				setLASTCHANGE((XMLGregorianCalendar)newValue);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__LONGNAME:
				setLONGNAME((String)newValue);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__MULTIVALUED:
				setMULTIVALUED((Boolean)newValue);
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
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__DEFAULTVALUE:
				setDEFAULTVALUE((DEFAULTVALUEType1)null);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__ALTERNATIVEID:
				setALTERNATIVEID((ALTERNATIVEIDType20)null);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__TYPE:
				setTYPE((TYPEType9)null);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__DESC:
				setDESC(DESC_EDEFAULT);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__IDENTIFIER:
				setIDENTIFIER(IDENTIFIER_EDEFAULT);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__ISEDITABLE:
				unsetISEDITABLE();
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__LASTCHANGE:
				setLASTCHANGE(LASTCHANGE_EDEFAULT);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__LONGNAME:
				setLONGNAME(LONGNAME_EDEFAULT);
				return;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__MULTIVALUED:
				unsetMULTIVALUED();
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
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__DEFAULTVALUE:
				return dEFAULTVALUE != null;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__ALTERNATIVEID:
				return aLTERNATIVEID != null;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__TYPE:
				return tYPE != null;
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__DESC:
				return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals(dESC);
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__ISEDITABLE:
				return isSetISEDITABLE();
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__LASTCHANGE:
				return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__LONGNAME:
				return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals(lONGNAME);
			case MyreqifPackage.ATTRIBUTEDEFINITIONENUMERATION__MULTIVALUED:
				return isSetMULTIVALUED();
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
		result.append(", mULTIVALUED: ");
		if (mULTIVALUEDESet) result.append(mULTIVALUED); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ATTRIBUTEDEFINITIONENUMERATIONImpl
