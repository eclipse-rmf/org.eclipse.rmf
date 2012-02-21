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
import org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType;
import org.eclipse.rmf.rif11.xsd.RifPackage;
import org.eclipse.rmf.rif11.xsd.SPECGROUP;
import org.eclipse.rmf.rif11.xsd.SPECOBJECTSType2;
import org.eclipse.rmf.rif11.xsd.TYPEType1;
import org.eclipse.rmf.rif11.xsd.VALUESType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPECGROUP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.SPECGROUPImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.SPECGROUPImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.SPECGROUPImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.SPECGROUPImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.SPECGROUPImpl#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.SPECGROUPImpl#getVALUES <em>VALUES</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.SPECGROUPImpl#getRELATIONGROUPS <em>RELATIONGROUPS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.SPECGROUPImpl#getSPECOBJECTS <em>SPECOBJECTS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SPECGROUPImpl extends EObjectImpl implements SPECGROUP {
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
	 * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTYPE()
	 * @generated
	 * @ordered
	 */
	protected TYPEType1 tYPE;

	/**
	 * The cached value of the '{@link #getVALUES() <em>VALUES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVALUES()
	 * @generated
	 * @ordered
	 */
	protected VALUESType vALUES;

	/**
	 * The cached value of the '{@link #getRELATIONGROUPS() <em>RELATIONGROUPS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRELATIONGROUPS()
	 * @generated
	 * @ordered
	 */
	protected RELATIONGROUPSType rELATIONGROUPS;

	/**
	 * The cached value of the '{@link #getSPECOBJECTS() <em>SPECOBJECTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECOBJECTS()
	 * @generated
	 * @ordered
	 */
	protected SPECOBJECTSType2 sPECOBJECTS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SPECGROUPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.SPECGROUP;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUP__DESC, oldDESC, dESC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUP__IDENTIFIER, oldIDENTIFIER, iDENTIFIER));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUP__LASTCHANGE, oldLASTCHANGE, lASTCHANGE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUP__LONGNAME, oldLONGNAME, lONGNAME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEType1 getTYPE() {
		return tYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTYPE(TYPEType1 newTYPE, NotificationChain msgs) {
		TYPEType1 oldTYPE = tYPE;
		tYPE = newTYPE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUP__TYPE, oldTYPE, newTYPE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTYPE(TYPEType1 newTYPE) {
		if (newTYPE != tYPE) {
			NotificationChain msgs = null;
			if (tYPE != null)
				msgs = ((InternalEObject)tYPE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.SPECGROUP__TYPE, null, msgs);
			if (newTYPE != null)
				msgs = ((InternalEObject)newTYPE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.SPECGROUP__TYPE, null, msgs);
			msgs = basicSetTYPE(newTYPE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUP__TYPE, newTYPE, newTYPE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VALUESType getVALUES() {
		return vALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVALUES(VALUESType newVALUES, NotificationChain msgs) {
		VALUESType oldVALUES = vALUES;
		vALUES = newVALUES;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUP__VALUES, oldVALUES, newVALUES);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVALUES(VALUESType newVALUES) {
		if (newVALUES != vALUES) {
			NotificationChain msgs = null;
			if (vALUES != null)
				msgs = ((InternalEObject)vALUES).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.SPECGROUP__VALUES, null, msgs);
			if (newVALUES != null)
				msgs = ((InternalEObject)newVALUES).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.SPECGROUP__VALUES, null, msgs);
			msgs = basicSetVALUES(newVALUES, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUP__VALUES, newVALUES, newVALUES));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RELATIONGROUPSType getRELATIONGROUPS() {
		return rELATIONGROUPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRELATIONGROUPS(RELATIONGROUPSType newRELATIONGROUPS, NotificationChain msgs) {
		RELATIONGROUPSType oldRELATIONGROUPS = rELATIONGROUPS;
		rELATIONGROUPS = newRELATIONGROUPS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUP__RELATIONGROUPS, oldRELATIONGROUPS, newRELATIONGROUPS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRELATIONGROUPS(RELATIONGROUPSType newRELATIONGROUPS) {
		if (newRELATIONGROUPS != rELATIONGROUPS) {
			NotificationChain msgs = null;
			if (rELATIONGROUPS != null)
				msgs = ((InternalEObject)rELATIONGROUPS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.SPECGROUP__RELATIONGROUPS, null, msgs);
			if (newRELATIONGROUPS != null)
				msgs = ((InternalEObject)newRELATIONGROUPS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.SPECGROUP__RELATIONGROUPS, null, msgs);
			msgs = basicSetRELATIONGROUPS(newRELATIONGROUPS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUP__RELATIONGROUPS, newRELATIONGROUPS, newRELATIONGROUPS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECOBJECTSType2 getSPECOBJECTS() {
		return sPECOBJECTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECOBJECTS(SPECOBJECTSType2 newSPECOBJECTS, NotificationChain msgs) {
		SPECOBJECTSType2 oldSPECOBJECTS = sPECOBJECTS;
		sPECOBJECTS = newSPECOBJECTS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUP__SPECOBJECTS, oldSPECOBJECTS, newSPECOBJECTS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECOBJECTS(SPECOBJECTSType2 newSPECOBJECTS) {
		if (newSPECOBJECTS != sPECOBJECTS) {
			NotificationChain msgs = null;
			if (sPECOBJECTS != null)
				msgs = ((InternalEObject)sPECOBJECTS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.SPECGROUP__SPECOBJECTS, null, msgs);
			if (newSPECOBJECTS != null)
				msgs = ((InternalEObject)newSPECOBJECTS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.SPECGROUP__SPECOBJECTS, null, msgs);
			msgs = basicSetSPECOBJECTS(newSPECOBJECTS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUP__SPECOBJECTS, newSPECOBJECTS, newSPECOBJECTS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.SPECGROUP__TYPE:
				return basicSetTYPE(null, msgs);
			case RifPackage.SPECGROUP__VALUES:
				return basicSetVALUES(null, msgs);
			case RifPackage.SPECGROUP__RELATIONGROUPS:
				return basicSetRELATIONGROUPS(null, msgs);
			case RifPackage.SPECGROUP__SPECOBJECTS:
				return basicSetSPECOBJECTS(null, msgs);
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
			case RifPackage.SPECGROUP__DESC:
				return getDESC();
			case RifPackage.SPECGROUP__IDENTIFIER:
				return getIDENTIFIER();
			case RifPackage.SPECGROUP__LASTCHANGE:
				return getLASTCHANGE();
			case RifPackage.SPECGROUP__LONGNAME:
				return getLONGNAME();
			case RifPackage.SPECGROUP__TYPE:
				return getTYPE();
			case RifPackage.SPECGROUP__VALUES:
				return getVALUES();
			case RifPackage.SPECGROUP__RELATIONGROUPS:
				return getRELATIONGROUPS();
			case RifPackage.SPECGROUP__SPECOBJECTS:
				return getSPECOBJECTS();
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
			case RifPackage.SPECGROUP__DESC:
				setDESC((String)newValue);
				return;
			case RifPackage.SPECGROUP__IDENTIFIER:
				setIDENTIFIER((String)newValue);
				return;
			case RifPackage.SPECGROUP__LASTCHANGE:
				setLASTCHANGE((XMLGregorianCalendar)newValue);
				return;
			case RifPackage.SPECGROUP__LONGNAME:
				setLONGNAME((String)newValue);
				return;
			case RifPackage.SPECGROUP__TYPE:
				setTYPE((TYPEType1)newValue);
				return;
			case RifPackage.SPECGROUP__VALUES:
				setVALUES((VALUESType)newValue);
				return;
			case RifPackage.SPECGROUP__RELATIONGROUPS:
				setRELATIONGROUPS((RELATIONGROUPSType)newValue);
				return;
			case RifPackage.SPECGROUP__SPECOBJECTS:
				setSPECOBJECTS((SPECOBJECTSType2)newValue);
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
			case RifPackage.SPECGROUP__DESC:
				setDESC(DESC_EDEFAULT);
				return;
			case RifPackage.SPECGROUP__IDENTIFIER:
				setIDENTIFIER(IDENTIFIER_EDEFAULT);
				return;
			case RifPackage.SPECGROUP__LASTCHANGE:
				setLASTCHANGE(LASTCHANGE_EDEFAULT);
				return;
			case RifPackage.SPECGROUP__LONGNAME:
				setLONGNAME(LONGNAME_EDEFAULT);
				return;
			case RifPackage.SPECGROUP__TYPE:
				setTYPE((TYPEType1)null);
				return;
			case RifPackage.SPECGROUP__VALUES:
				setVALUES((VALUESType)null);
				return;
			case RifPackage.SPECGROUP__RELATIONGROUPS:
				setRELATIONGROUPS((RELATIONGROUPSType)null);
				return;
			case RifPackage.SPECGROUP__SPECOBJECTS:
				setSPECOBJECTS((SPECOBJECTSType2)null);
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
			case RifPackage.SPECGROUP__DESC:
				return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals(dESC);
			case RifPackage.SPECGROUP__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
			case RifPackage.SPECGROUP__LASTCHANGE:
				return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
			case RifPackage.SPECGROUP__LONGNAME:
				return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals(lONGNAME);
			case RifPackage.SPECGROUP__TYPE:
				return tYPE != null;
			case RifPackage.SPECGROUP__VALUES:
				return vALUES != null;
			case RifPackage.SPECGROUP__RELATIONGROUPS:
				return rELATIONGROUPS != null;
			case RifPackage.SPECGROUP__SPECOBJECTS:
				return sPECOBJECTS != null;
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

} //SPECGROUPImpl
