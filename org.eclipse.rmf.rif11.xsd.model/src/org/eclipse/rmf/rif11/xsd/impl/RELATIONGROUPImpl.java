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

package org.eclipse.rmf.rif11.xsd.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.rmf.rif11.xsd.RELATIONGROUP;
import org.eclipse.rmf.rif11.xsd.RELATIONTYPEType;
import org.eclipse.rmf.rif11.xsd.RifPackage;
import org.eclipse.rmf.rif11.xsd.SPECRELATIONSType2;
import org.eclipse.rmf.rif11.xsd.TARGETGROUPType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RELATIONGROUP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPImpl#getRELATIONTYPE <em>RELATIONTYPE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPImpl#getSPECRELATIONS <em>SPECRELATIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.RELATIONGROUPImpl#getTARGETGROUP <em>TARGETGROUP</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RELATIONGROUPImpl extends EObjectImpl implements RELATIONGROUP {
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
	 * The cached value of the '{@link #getRELATIONTYPE() <em>RELATIONTYPE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRELATIONTYPE()
	 * @generated
	 * @ordered
	 */
	protected RELATIONTYPEType rELATIONTYPE;

	/**
	 * The cached value of the '{@link #getSPECRELATIONS() <em>SPECRELATIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECRELATIONS()
	 * @generated
	 * @ordered
	 */
	protected SPECRELATIONSType2 sPECRELATIONS;

	/**
	 * The cached value of the '{@link #getTARGETGROUP() <em>TARGETGROUP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTARGETGROUP()
	 * @generated
	 * @ordered
	 */
	protected TARGETGROUPType tARGETGROUP;

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
		return RifPackage.Literals.RELATIONGROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RELATIONGROUP__DESC, oldDESC, dESC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RELATIONGROUP__IDENTIFIER, oldIDENTIFIER, iDENTIFIER));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RELATIONGROUP__LASTCHANGE, oldLASTCHANGE, lASTCHANGE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RELATIONGROUP__LONGNAME, oldLONGNAME, lONGNAME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RELATIONTYPEType getRELATIONTYPE() {
		return rELATIONTYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRELATIONTYPE(RELATIONTYPEType newRELATIONTYPE, NotificationChain msgs) {
		RELATIONTYPEType oldRELATIONTYPE = rELATIONTYPE;
		rELATIONTYPE = newRELATIONTYPE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.RELATIONGROUP__RELATIONTYPE, oldRELATIONTYPE, newRELATIONTYPE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRELATIONTYPE(RELATIONTYPEType newRELATIONTYPE) {
		if (newRELATIONTYPE != rELATIONTYPE) {
			NotificationChain msgs = null;
			if (rELATIONTYPE != null)
				msgs = ((InternalEObject)rELATIONTYPE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.RELATIONGROUP__RELATIONTYPE, null, msgs);
			if (newRELATIONTYPE != null)
				msgs = ((InternalEObject)newRELATIONTYPE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.RELATIONGROUP__RELATIONTYPE, null, msgs);
			msgs = basicSetRELATIONTYPE(newRELATIONTYPE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RELATIONGROUP__RELATIONTYPE, newRELATIONTYPE, newRELATIONTYPE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECRELATIONSType2 getSPECRELATIONS() {
		return sPECRELATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECRELATIONS(SPECRELATIONSType2 newSPECRELATIONS, NotificationChain msgs) {
		SPECRELATIONSType2 oldSPECRELATIONS = sPECRELATIONS;
		sPECRELATIONS = newSPECRELATIONS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.RELATIONGROUP__SPECRELATIONS, oldSPECRELATIONS, newSPECRELATIONS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECRELATIONS(SPECRELATIONSType2 newSPECRELATIONS) {
		if (newSPECRELATIONS != sPECRELATIONS) {
			NotificationChain msgs = null;
			if (sPECRELATIONS != null)
				msgs = ((InternalEObject)sPECRELATIONS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.RELATIONGROUP__SPECRELATIONS, null, msgs);
			if (newSPECRELATIONS != null)
				msgs = ((InternalEObject)newSPECRELATIONS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.RELATIONGROUP__SPECRELATIONS, null, msgs);
			msgs = basicSetSPECRELATIONS(newSPECRELATIONS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RELATIONGROUP__SPECRELATIONS, newSPECRELATIONS, newSPECRELATIONS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TARGETGROUPType getTARGETGROUP() {
		return tARGETGROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTARGETGROUP(TARGETGROUPType newTARGETGROUP, NotificationChain msgs) {
		TARGETGROUPType oldTARGETGROUP = tARGETGROUP;
		tARGETGROUP = newTARGETGROUP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.RELATIONGROUP__TARGETGROUP, oldTARGETGROUP, newTARGETGROUP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTARGETGROUP(TARGETGROUPType newTARGETGROUP) {
		if (newTARGETGROUP != tARGETGROUP) {
			NotificationChain msgs = null;
			if (tARGETGROUP != null)
				msgs = ((InternalEObject)tARGETGROUP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.RELATIONGROUP__TARGETGROUP, null, msgs);
			if (newTARGETGROUP != null)
				msgs = ((InternalEObject)newTARGETGROUP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.RELATIONGROUP__TARGETGROUP, null, msgs);
			msgs = basicSetTARGETGROUP(newTARGETGROUP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RELATIONGROUP__TARGETGROUP, newTARGETGROUP, newTARGETGROUP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.RELATIONGROUP__RELATIONTYPE:
				return basicSetRELATIONTYPE(null, msgs);
			case RifPackage.RELATIONGROUP__SPECRELATIONS:
				return basicSetSPECRELATIONS(null, msgs);
			case RifPackage.RELATIONGROUP__TARGETGROUP:
				return basicSetTARGETGROUP(null, msgs);
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
			case RifPackage.RELATIONGROUP__DESC:
				return getDESC();
			case RifPackage.RELATIONGROUP__IDENTIFIER:
				return getIDENTIFIER();
			case RifPackage.RELATIONGROUP__LASTCHANGE:
				return getLASTCHANGE();
			case RifPackage.RELATIONGROUP__LONGNAME:
				return getLONGNAME();
			case RifPackage.RELATIONGROUP__RELATIONTYPE:
				return getRELATIONTYPE();
			case RifPackage.RELATIONGROUP__SPECRELATIONS:
				return getSPECRELATIONS();
			case RifPackage.RELATIONGROUP__TARGETGROUP:
				return getTARGETGROUP();
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
			case RifPackage.RELATIONGROUP__DESC:
				setDESC((String)newValue);
				return;
			case RifPackage.RELATIONGROUP__IDENTIFIER:
				setIDENTIFIER((String)newValue);
				return;
			case RifPackage.RELATIONGROUP__LASTCHANGE:
				setLASTCHANGE((XMLGregorianCalendar)newValue);
				return;
			case RifPackage.RELATIONGROUP__LONGNAME:
				setLONGNAME((String)newValue);
				return;
			case RifPackage.RELATIONGROUP__RELATIONTYPE:
				setRELATIONTYPE((RELATIONTYPEType)newValue);
				return;
			case RifPackage.RELATIONGROUP__SPECRELATIONS:
				setSPECRELATIONS((SPECRELATIONSType2)newValue);
				return;
			case RifPackage.RELATIONGROUP__TARGETGROUP:
				setTARGETGROUP((TARGETGROUPType)newValue);
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
			case RifPackage.RELATIONGROUP__DESC:
				setDESC(DESC_EDEFAULT);
				return;
			case RifPackage.RELATIONGROUP__IDENTIFIER:
				setIDENTIFIER(IDENTIFIER_EDEFAULT);
				return;
			case RifPackage.RELATIONGROUP__LASTCHANGE:
				setLASTCHANGE(LASTCHANGE_EDEFAULT);
				return;
			case RifPackage.RELATIONGROUP__LONGNAME:
				setLONGNAME(LONGNAME_EDEFAULT);
				return;
			case RifPackage.RELATIONGROUP__RELATIONTYPE:
				setRELATIONTYPE((RELATIONTYPEType)null);
				return;
			case RifPackage.RELATIONGROUP__SPECRELATIONS:
				setSPECRELATIONS((SPECRELATIONSType2)null);
				return;
			case RifPackage.RELATIONGROUP__TARGETGROUP:
				setTARGETGROUP((TARGETGROUPType)null);
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
			case RifPackage.RELATIONGROUP__DESC:
				return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals(dESC);
			case RifPackage.RELATIONGROUP__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
			case RifPackage.RELATIONGROUP__LASTCHANGE:
				return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
			case RifPackage.RELATIONGROUP__LONGNAME:
				return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals(lONGNAME);
			case RifPackage.RELATIONGROUP__RELATIONTYPE:
				return rELATIONTYPE != null;
			case RifPackage.RELATIONGROUP__SPECRELATIONS:
				return sPECRELATIONS != null;
			case RifPackage.RELATIONGROUP__TARGETGROUP:
				return tARGETGROUP != null;
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
