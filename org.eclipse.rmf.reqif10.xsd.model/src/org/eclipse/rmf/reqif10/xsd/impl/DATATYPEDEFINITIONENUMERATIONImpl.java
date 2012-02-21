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

import org.eclipse.rmf.reqif10.xsd.ALTERNATIVEIDType1;
import org.eclipse.rmf.reqif10.xsd.DATATYPEDEFINITIONENUMERATION;
import org.eclipse.rmf.reqif10.xsd.ReqifPackage;
import org.eclipse.rmf.reqif10.xsd.SPECIFIEDVALUESType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DATATYPEDEFINITIONENUMERATION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DATATYPEDEFINITIONENUMERATIONImpl#getALTERNATIVEID <em>ALTERNATIVEID</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DATATYPEDEFINITIONENUMERATIONImpl#getSPECIFIEDVALUES <em>SPECIFIEDVALUES</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DATATYPEDEFINITIONENUMERATIONImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DATATYPEDEFINITIONENUMERATIONImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DATATYPEDEFINITIONENUMERATIONImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xsd.impl.DATATYPEDEFINITIONENUMERATIONImpl#getLONGNAME <em>LONGNAME</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DATATYPEDEFINITIONENUMERATIONImpl extends EObjectImpl implements DATATYPEDEFINITIONENUMERATION {
	/**
	 * The cached value of the '{@link #getALTERNATIVEID() <em>ALTERNATIVEID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getALTERNATIVEID()
	 * @generated
	 * @ordered
	 */
	protected ALTERNATIVEIDType1 aLTERNATIVEID;

	/**
	 * The cached value of the '{@link #getSPECIFIEDVALUES() <em>SPECIFIEDVALUES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECIFIEDVALUES()
	 * @generated
	 * @ordered
	 */
	protected SPECIFIEDVALUESType sPECIFIEDVALUES;

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
	protected DATATYPEDEFINITIONENUMERATIONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ReqifPackage.Literals.DATATYPEDEFINITIONENUMERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType1 getALTERNATIVEID() {
		return aLTERNATIVEID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetALTERNATIVEID(ALTERNATIVEIDType1 newALTERNATIVEID, NotificationChain msgs) {
		ALTERNATIVEIDType1 oldALTERNATIVEID = aLTERNATIVEID;
		aLTERNATIVEID = newALTERNATIVEID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqifPackage.DATATYPEDEFINITIONENUMERATION__ALTERNATIVEID, oldALTERNATIVEID, newALTERNATIVEID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setALTERNATIVEID(ALTERNATIVEIDType1 newALTERNATIVEID) {
		if (newALTERNATIVEID != aLTERNATIVEID) {
			NotificationChain msgs = null;
			if (aLTERNATIVEID != null)
				msgs = ((InternalEObject)aLTERNATIVEID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.DATATYPEDEFINITIONENUMERATION__ALTERNATIVEID, null, msgs);
			if (newALTERNATIVEID != null)
				msgs = ((InternalEObject)newALTERNATIVEID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.DATATYPEDEFINITIONENUMERATION__ALTERNATIVEID, null, msgs);
			msgs = basicSetALTERNATIVEID(newALTERNATIVEID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.DATATYPEDEFINITIONENUMERATION__ALTERNATIVEID, newALTERNATIVEID, newALTERNATIVEID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECIFIEDVALUESType getSPECIFIEDVALUES() {
		return sPECIFIEDVALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECIFIEDVALUES(SPECIFIEDVALUESType newSPECIFIEDVALUES, NotificationChain msgs) {
		SPECIFIEDVALUESType oldSPECIFIEDVALUES = sPECIFIEDVALUES;
		sPECIFIEDVALUES = newSPECIFIEDVALUES;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ReqifPackage.DATATYPEDEFINITIONENUMERATION__SPECIFIEDVALUES, oldSPECIFIEDVALUES, newSPECIFIEDVALUES);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECIFIEDVALUES(SPECIFIEDVALUESType newSPECIFIEDVALUES) {
		if (newSPECIFIEDVALUES != sPECIFIEDVALUES) {
			NotificationChain msgs = null;
			if (sPECIFIEDVALUES != null)
				msgs = ((InternalEObject)sPECIFIEDVALUES).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.DATATYPEDEFINITIONENUMERATION__SPECIFIEDVALUES, null, msgs);
			if (newSPECIFIEDVALUES != null)
				msgs = ((InternalEObject)newSPECIFIEDVALUES).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ReqifPackage.DATATYPEDEFINITIONENUMERATION__SPECIFIEDVALUES, null, msgs);
			msgs = basicSetSPECIFIEDVALUES(newSPECIFIEDVALUES, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.DATATYPEDEFINITIONENUMERATION__SPECIFIEDVALUES, newSPECIFIEDVALUES, newSPECIFIEDVALUES));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.DATATYPEDEFINITIONENUMERATION__DESC, oldDESC, dESC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.DATATYPEDEFINITIONENUMERATION__IDENTIFIER, oldIDENTIFIER, iDENTIFIER));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.DATATYPEDEFINITIONENUMERATION__LASTCHANGE, oldLASTCHANGE, lASTCHANGE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ReqifPackage.DATATYPEDEFINITIONENUMERATION__LONGNAME, oldLONGNAME, lONGNAME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__ALTERNATIVEID:
				return basicSetALTERNATIVEID(null, msgs);
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__SPECIFIEDVALUES:
				return basicSetSPECIFIEDVALUES(null, msgs);
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
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__ALTERNATIVEID:
				return getALTERNATIVEID();
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__SPECIFIEDVALUES:
				return getSPECIFIEDVALUES();
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__DESC:
				return getDESC();
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__IDENTIFIER:
				return getIDENTIFIER();
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__LASTCHANGE:
				return getLASTCHANGE();
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__LONGNAME:
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
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__ALTERNATIVEID:
				setALTERNATIVEID((ALTERNATIVEIDType1)newValue);
				return;
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__SPECIFIEDVALUES:
				setSPECIFIEDVALUES((SPECIFIEDVALUESType)newValue);
				return;
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__DESC:
				setDESC((String)newValue);
				return;
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__IDENTIFIER:
				setIDENTIFIER((String)newValue);
				return;
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__LASTCHANGE:
				setLASTCHANGE((XMLGregorianCalendar)newValue);
				return;
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__LONGNAME:
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
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__ALTERNATIVEID:
				setALTERNATIVEID((ALTERNATIVEIDType1)null);
				return;
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__SPECIFIEDVALUES:
				setSPECIFIEDVALUES((SPECIFIEDVALUESType)null);
				return;
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__DESC:
				setDESC(DESC_EDEFAULT);
				return;
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__IDENTIFIER:
				setIDENTIFIER(IDENTIFIER_EDEFAULT);
				return;
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__LASTCHANGE:
				setLASTCHANGE(LASTCHANGE_EDEFAULT);
				return;
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__LONGNAME:
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
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__ALTERNATIVEID:
				return aLTERNATIVEID != null;
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__SPECIFIEDVALUES:
				return sPECIFIEDVALUES != null;
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__DESC:
				return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals(dESC);
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__LASTCHANGE:
				return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
			case ReqifPackage.DATATYPEDEFINITIONENUMERATION__LONGNAME:
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

} //DATATYPEDEFINITIONENUMERATIONImpl
