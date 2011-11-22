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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType11;
import org.eclipse.rmf.reqif10.xsd.RELATIONGROUP;
import org.eclipse.rmf.reqif10.xsd.ReqifPackage;
import org.eclipse.rmf.reqif10.xsd.SOURCESPECIFICATIONType;
import org.eclipse.rmf.reqif10.xsd.SPECRELATIONSType;
import org.eclipse.rmf.reqif10.xsd.TARGETSPECIFICATIONType;
import org.eclipse.rmf.reqif10.xsd.TYPEType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RELATIONGROUP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.RELATIONGROUPImpl#getALTERNATIVEID <em>ALTERNATIVEID</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.RELATIONGROUPImpl#getSOURCESPECIFICATION <em>SOURCESPECIFICATION</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.RELATIONGROUPImpl#getSPECRELATIONS <em>SPECRELATIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.RELATIONGROUPImpl#getTARGETSPECIFICATION <em>TARGETSPECIFICATION</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.RELATIONGROUPImpl#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.RELATIONGROUPImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.RELATIONGROUPImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.RELATIONGROUPImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.RELATIONGROUPImpl#getLONGNAME <em>LONGNAME</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RELATIONGROUPImpl extends EObjectImpl implements RELATIONGROUP {
	/**
	 * The cached value of the '{@link #getALTERNATIVEID() <em>ALTERNATIVEID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getALTERNATIVEID()
	 * @generated
	 * @ordered
	 */
	protected ALTERNATIVEIDType11 aLTERNATIVEID;

	/**
	 * The cached value of the '{@link #getSOURCESPECIFICATION() <em>SOURCESPECIFICATION</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSOURCESPECIFICATION()
	 * @generated
	 * @ordered
	 */
	protected SOURCESPECIFICATIONType sOURCESPECIFICATION;

	/**
	 * The cached value of the '{@link #getSPECRELATIONS() <em>SPECRELATIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECRELATIONS()
	 * @generated
	 * @ordered
	 */
	protected SPECRELATIONSType sPECRELATIONS;

	/**
	 * The cached value of the '{@link #getTARGETSPECIFICATION() <em>TARGETSPECIFICATION</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTARGETSPECIFICATION()
	 * @generated
	 * @ordered
	 */
	protected TARGETSPECIFICATIONType tARGETSPECIFICATION;

	/**
	 * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTYPE()
	 * @generated
	 * @ordered
	 */
	protected TYPEType tYPE;

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
	protected RELATIONGROUPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqifPackage.Literals.RELATIONGROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType11 getALTERNATIVEID() {
		return aLTERNATIVEID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetALTERNATIVEID(ALTERNATIVEIDType11 newALTERNATIVEID, NotificationChain msgs) {
		ALTERNATIVEIDType11 oldALTERNATIVEID = aLTERNATIVEID;
		aLTERNATIVEID = newALTERNATIVEID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqifPackage.RELATIONGROUP__ALTERNATIVEID, oldALTERNATIVEID, newALTERNATIVEID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setALTERNATIVEID(ALTERNATIVEIDType11 newALTERNATIVEID) {
		if (newALTERNATIVEID != aLTERNATIVEID) {
			NotificationChain msgs = null;
			if (aLTERNATIVEID != null)
				msgs = ((InternalEObject)aLTERNATIVEID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.RELATIONGROUP__ALTERNATIVEID, null, msgs);
			if (newALTERNATIVEID != null)
				msgs = ((InternalEObject)newALTERNATIVEID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.RELATIONGROUP__ALTERNATIVEID, null, msgs);
			msgs = basicSetALTERNATIVEID(newALTERNATIVEID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.RELATIONGROUP__ALTERNATIVEID, newALTERNATIVEID, newALTERNATIVEID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SOURCESPECIFICATIONType getSOURCESPECIFICATION() {
		return sOURCESPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSOURCESPECIFICATION(SOURCESPECIFICATIONType newSOURCESPECIFICATION, NotificationChain msgs) {
		SOURCESPECIFICATIONType oldSOURCESPECIFICATION = sOURCESPECIFICATION;
		sOURCESPECIFICATION = newSOURCESPECIFICATION;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqifPackage.RELATIONGROUP__SOURCESPECIFICATION, oldSOURCESPECIFICATION, newSOURCESPECIFICATION);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSOURCESPECIFICATION(SOURCESPECIFICATIONType newSOURCESPECIFICATION) {
		if (newSOURCESPECIFICATION != sOURCESPECIFICATION) {
			NotificationChain msgs = null;
			if (sOURCESPECIFICATION != null)
				msgs = ((InternalEObject)sOURCESPECIFICATION).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.RELATIONGROUP__SOURCESPECIFICATION, null, msgs);
			if (newSOURCESPECIFICATION != null)
				msgs = ((InternalEObject)newSOURCESPECIFICATION).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.RELATIONGROUP__SOURCESPECIFICATION, null, msgs);
			msgs = basicSetSOURCESPECIFICATION(newSOURCESPECIFICATION, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.RELATIONGROUP__SOURCESPECIFICATION, newSOURCESPECIFICATION, newSOURCESPECIFICATION));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECRELATIONSType getSPECRELATIONS() {
		return sPECRELATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECRELATIONS(SPECRELATIONSType newSPECRELATIONS, NotificationChain msgs) {
		SPECRELATIONSType oldSPECRELATIONS = sPECRELATIONS;
		sPECRELATIONS = newSPECRELATIONS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqifPackage.RELATIONGROUP__SPECRELATIONS, oldSPECRELATIONS, newSPECRELATIONS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECRELATIONS(SPECRELATIONSType newSPECRELATIONS) {
		if (newSPECRELATIONS != sPECRELATIONS) {
			NotificationChain msgs = null;
			if (sPECRELATIONS != null)
				msgs = ((InternalEObject)sPECRELATIONS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.RELATIONGROUP__SPECRELATIONS, null, msgs);
			if (newSPECRELATIONS != null)
				msgs = ((InternalEObject)newSPECRELATIONS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.RELATIONGROUP__SPECRELATIONS, null, msgs);
			msgs = basicSetSPECRELATIONS(newSPECRELATIONS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.RELATIONGROUP__SPECRELATIONS, newSPECRELATIONS, newSPECRELATIONS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TARGETSPECIFICATIONType getTARGETSPECIFICATION() {
		return tARGETSPECIFICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTARGETSPECIFICATION(TARGETSPECIFICATIONType newTARGETSPECIFICATION, NotificationChain msgs) {
		TARGETSPECIFICATIONType oldTARGETSPECIFICATION = tARGETSPECIFICATION;
		tARGETSPECIFICATION = newTARGETSPECIFICATION;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqifPackage.RELATIONGROUP__TARGETSPECIFICATION, oldTARGETSPECIFICATION, newTARGETSPECIFICATION);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTARGETSPECIFICATION(TARGETSPECIFICATIONType newTARGETSPECIFICATION) {
		if (newTARGETSPECIFICATION != tARGETSPECIFICATION) {
			NotificationChain msgs = null;
			if (tARGETSPECIFICATION != null)
				msgs = ((InternalEObject)tARGETSPECIFICATION).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.RELATIONGROUP__TARGETSPECIFICATION, null, msgs);
			if (newTARGETSPECIFICATION != null)
				msgs = ((InternalEObject)newTARGETSPECIFICATION).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.RELATIONGROUP__TARGETSPECIFICATION, null, msgs);
			msgs = basicSetTARGETSPECIFICATION(newTARGETSPECIFICATION, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.RELATIONGROUP__TARGETSPECIFICATION, newTARGETSPECIFICATION, newTARGETSPECIFICATION));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEType getTYPE() {
		return tYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTYPE(TYPEType newTYPE, NotificationChain msgs) {
		TYPEType oldTYPE = tYPE;
		tYPE = newTYPE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqifPackage.RELATIONGROUP__TYPE, oldTYPE, newTYPE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTYPE(TYPEType newTYPE) {
		if (newTYPE != tYPE) {
			NotificationChain msgs = null;
			if (tYPE != null)
				msgs = ((InternalEObject)tYPE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.RELATIONGROUP__TYPE, null, msgs);
			if (newTYPE != null)
				msgs = ((InternalEObject)newTYPE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.RELATIONGROUP__TYPE, null, msgs);
			msgs = basicSetTYPE(newTYPE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.RELATIONGROUP__TYPE, newTYPE, newTYPE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.RELATIONGROUP__DESC, oldDESC, dESC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.RELATIONGROUP__IDENTIFIER, oldIDENTIFIER, iDENTIFIER));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.RELATIONGROUP__LASTCHANGE, oldLASTCHANGE, lASTCHANGE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.RELATIONGROUP__LONGNAME, oldLONGNAME, lONGNAME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReqifPackage.RELATIONGROUP__ALTERNATIVEID:
				return basicSetALTERNATIVEID(null, msgs);
			case ReqifPackage.RELATIONGROUP__SOURCESPECIFICATION:
				return basicSetSOURCESPECIFICATION(null, msgs);
			case ReqifPackage.RELATIONGROUP__SPECRELATIONS:
				return basicSetSPECRELATIONS(null, msgs);
			case ReqifPackage.RELATIONGROUP__TARGETSPECIFICATION:
				return basicSetTARGETSPECIFICATION(null, msgs);
			case ReqifPackage.RELATIONGROUP__TYPE:
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
			case ReqifPackage.RELATIONGROUP__ALTERNATIVEID:
				return getALTERNATIVEID();
			case ReqifPackage.RELATIONGROUP__SOURCESPECIFICATION:
				return getSOURCESPECIFICATION();
			case ReqifPackage.RELATIONGROUP__SPECRELATIONS:
				return getSPECRELATIONS();
			case ReqifPackage.RELATIONGROUP__TARGETSPECIFICATION:
				return getTARGETSPECIFICATION();
			case ReqifPackage.RELATIONGROUP__TYPE:
				return getTYPE();
			case ReqifPackage.RELATIONGROUP__DESC:
				return getDESC();
			case ReqifPackage.RELATIONGROUP__IDENTIFIER:
				return getIDENTIFIER();
			case ReqifPackage.RELATIONGROUP__LASTCHANGE:
				return getLASTCHANGE();
			case ReqifPackage.RELATIONGROUP__LONGNAME:
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
			case ReqifPackage.RELATIONGROUP__ALTERNATIVEID:
				setALTERNATIVEID((ALTERNATIVEIDType11)newValue);
				return;
			case ReqifPackage.RELATIONGROUP__SOURCESPECIFICATION:
				setSOURCESPECIFICATION((SOURCESPECIFICATIONType)newValue);
				return;
			case ReqifPackage.RELATIONGROUP__SPECRELATIONS:
				setSPECRELATIONS((SPECRELATIONSType)newValue);
				return;
			case ReqifPackage.RELATIONGROUP__TARGETSPECIFICATION:
				setTARGETSPECIFICATION((TARGETSPECIFICATIONType)newValue);
				return;
			case ReqifPackage.RELATIONGROUP__TYPE:
				setTYPE((TYPEType)newValue);
				return;
			case ReqifPackage.RELATIONGROUP__DESC:
				setDESC((String)newValue);
				return;
			case ReqifPackage.RELATIONGROUP__IDENTIFIER:
				setIDENTIFIER((String)newValue);
				return;
			case ReqifPackage.RELATIONGROUP__LASTCHANGE:
				setLASTCHANGE((XMLGregorianCalendar)newValue);
				return;
			case ReqifPackage.RELATIONGROUP__LONGNAME:
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
			case ReqifPackage.RELATIONGROUP__ALTERNATIVEID:
				setALTERNATIVEID((ALTERNATIVEIDType11)null);
				return;
			case ReqifPackage.RELATIONGROUP__SOURCESPECIFICATION:
				setSOURCESPECIFICATION((SOURCESPECIFICATIONType)null);
				return;
			case ReqifPackage.RELATIONGROUP__SPECRELATIONS:
				setSPECRELATIONS((SPECRELATIONSType)null);
				return;
			case ReqifPackage.RELATIONGROUP__TARGETSPECIFICATION:
				setTARGETSPECIFICATION((TARGETSPECIFICATIONType)null);
				return;
			case ReqifPackage.RELATIONGROUP__TYPE:
				setTYPE((TYPEType)null);
				return;
			case ReqifPackage.RELATIONGROUP__DESC:
				setDESC(DESC_EDEFAULT);
				return;
			case ReqifPackage.RELATIONGROUP__IDENTIFIER:
				setIDENTIFIER(IDENTIFIER_EDEFAULT);
				return;
			case ReqifPackage.RELATIONGROUP__LASTCHANGE:
				setLASTCHANGE(LASTCHANGE_EDEFAULT);
				return;
			case ReqifPackage.RELATIONGROUP__LONGNAME:
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
			case ReqifPackage.RELATIONGROUP__ALTERNATIVEID:
				return aLTERNATIVEID != null;
			case ReqifPackage.RELATIONGROUP__SOURCESPECIFICATION:
				return sOURCESPECIFICATION != null;
			case ReqifPackage.RELATIONGROUP__SPECRELATIONS:
				return sPECRELATIONS != null;
			case ReqifPackage.RELATIONGROUP__TARGETSPECIFICATION:
				return tARGETSPECIFICATION != null;
			case ReqifPackage.RELATIONGROUP__TYPE:
				return tYPE != null;
			case ReqifPackage.RELATIONGROUP__DESC:
				return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals(dESC);
			case ReqifPackage.RELATIONGROUP__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
			case ReqifPackage.RELATIONGROUP__LASTCHANGE:
				return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
			case ReqifPackage.RELATIONGROUP__LONGNAME:
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
		result.append(", lASTCHANGE: ");
		result.append(lASTCHANGE);
		result.append(", lONGNAME: ");
		result.append(lONGNAME);
		result.append(')');
		return result.toString();
	}

} //RELATIONGROUPImpl
