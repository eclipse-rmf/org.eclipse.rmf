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

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.rmf.rif12.xsd.CHILDRENType2;
import org.eclipse.rmf.rif12.xsd.RifPackage;
import org.eclipse.rmf.rif12.xsd.SPECGROUPHIERARCHYROOT;
import org.eclipse.rmf.rif12.xsd.TYPEType3;
import org.eclipse.rmf.rif12.xsd.VALUESType1;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPECGROUPHIERARCHYROOT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.SPECGROUPHIERARCHYROOTImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.SPECGROUPHIERARCHYROOTImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.SPECGROUPHIERARCHYROOTImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.SPECGROUPHIERARCHYROOTImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.SPECGROUPHIERARCHYROOTImpl#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.SPECGROUPHIERARCHYROOTImpl#getVALUES <em>VALUES</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.SPECGROUPHIERARCHYROOTImpl#getCHILDREN <em>CHILDREN</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SPECGROUPHIERARCHYROOTImpl extends EObjectImpl implements SPECGROUPHIERARCHYROOT {
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
	protected TYPEType3 tYPE;

	/**
	 * The cached value of the '{@link #getVALUES() <em>VALUES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVALUES()
	 * @generated
	 * @ordered
	 */
	protected VALUESType1 vALUES;

	/**
	 * The cached value of the '{@link #getCHILDREN() <em>CHILDREN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCHILDREN()
	 * @generated
	 * @ordered
	 */
	protected CHILDRENType2 cHILDREN;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SPECGROUPHIERARCHYROOTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.SPECGROUPHIERARCHYROOT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUPHIERARCHYROOT__DESC, oldDESC, dESC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUPHIERARCHYROOT__IDENTIFIER, oldIDENTIFIER, iDENTIFIER));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUPHIERARCHYROOT__LASTCHANGE, oldLASTCHANGE, lASTCHANGE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUPHIERARCHYROOT__LONGNAME, oldLONGNAME, lONGNAME));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUPHIERARCHYROOT__TYPE, oldTYPE, newTYPE);
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
				msgs = ((InternalEObject)tYPE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.SPECGROUPHIERARCHYROOT__TYPE, null, msgs);
			if (newTYPE != null)
				msgs = ((InternalEObject)newTYPE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.SPECGROUPHIERARCHYROOT__TYPE, null, msgs);
			msgs = basicSetTYPE(newTYPE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUPHIERARCHYROOT__TYPE, newTYPE, newTYPE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VALUESType1 getVALUES() {
		return vALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVALUES(VALUESType1 newVALUES, NotificationChain msgs) {
		VALUESType1 oldVALUES = vALUES;
		vALUES = newVALUES;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUPHIERARCHYROOT__VALUES, oldVALUES, newVALUES);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVALUES(VALUESType1 newVALUES) {
		if (newVALUES != vALUES) {
			NotificationChain msgs = null;
			if (vALUES != null)
				msgs = ((InternalEObject)vALUES).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.SPECGROUPHIERARCHYROOT__VALUES, null, msgs);
			if (newVALUES != null)
				msgs = ((InternalEObject)newVALUES).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.SPECGROUPHIERARCHYROOT__VALUES, null, msgs);
			msgs = basicSetVALUES(newVALUES, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUPHIERARCHYROOT__VALUES, newVALUES, newVALUES));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHILDRENType2 getCHILDREN() {
		return cHILDREN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCHILDREN(CHILDRENType2 newCHILDREN, NotificationChain msgs) {
		CHILDRENType2 oldCHILDREN = cHILDREN;
		cHILDREN = newCHILDREN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUPHIERARCHYROOT__CHILDREN, oldCHILDREN, newCHILDREN);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCHILDREN(CHILDRENType2 newCHILDREN) {
		if (newCHILDREN != cHILDREN) {
			NotificationChain msgs = null;
			if (cHILDREN != null)
				msgs = ((InternalEObject)cHILDREN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.SPECGROUPHIERARCHYROOT__CHILDREN, null, msgs);
			if (newCHILDREN != null)
				msgs = ((InternalEObject)newCHILDREN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.SPECGROUPHIERARCHYROOT__CHILDREN, null, msgs);
			msgs = basicSetCHILDREN(newCHILDREN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.SPECGROUPHIERARCHYROOT__CHILDREN, newCHILDREN, newCHILDREN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.SPECGROUPHIERARCHYROOT__TYPE:
				return basicSetTYPE(null, msgs);
			case RifPackage.SPECGROUPHIERARCHYROOT__VALUES:
				return basicSetVALUES(null, msgs);
			case RifPackage.SPECGROUPHIERARCHYROOT__CHILDREN:
				return basicSetCHILDREN(null, msgs);
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
			case RifPackage.SPECGROUPHIERARCHYROOT__DESC:
				return getDESC();
			case RifPackage.SPECGROUPHIERARCHYROOT__IDENTIFIER:
				return getIDENTIFIER();
			case RifPackage.SPECGROUPHIERARCHYROOT__LASTCHANGE:
				return getLASTCHANGE();
			case RifPackage.SPECGROUPHIERARCHYROOT__LONGNAME:
				return getLONGNAME();
			case RifPackage.SPECGROUPHIERARCHYROOT__TYPE:
				return getTYPE();
			case RifPackage.SPECGROUPHIERARCHYROOT__VALUES:
				return getVALUES();
			case RifPackage.SPECGROUPHIERARCHYROOT__CHILDREN:
				return getCHILDREN();
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
			case RifPackage.SPECGROUPHIERARCHYROOT__DESC:
				setDESC((String)newValue);
				return;
			case RifPackage.SPECGROUPHIERARCHYROOT__IDENTIFIER:
				setIDENTIFIER((String)newValue);
				return;
			case RifPackage.SPECGROUPHIERARCHYROOT__LASTCHANGE:
				setLASTCHANGE((XMLGregorianCalendar)newValue);
				return;
			case RifPackage.SPECGROUPHIERARCHYROOT__LONGNAME:
				setLONGNAME((String)newValue);
				return;
			case RifPackage.SPECGROUPHIERARCHYROOT__TYPE:
				setTYPE((TYPEType3)newValue);
				return;
			case RifPackage.SPECGROUPHIERARCHYROOT__VALUES:
				setVALUES((VALUESType1)newValue);
				return;
			case RifPackage.SPECGROUPHIERARCHYROOT__CHILDREN:
				setCHILDREN((CHILDRENType2)newValue);
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
			case RifPackage.SPECGROUPHIERARCHYROOT__DESC:
				setDESC(DESC_EDEFAULT);
				return;
			case RifPackage.SPECGROUPHIERARCHYROOT__IDENTIFIER:
				setIDENTIFIER(IDENTIFIER_EDEFAULT);
				return;
			case RifPackage.SPECGROUPHIERARCHYROOT__LASTCHANGE:
				setLASTCHANGE(LASTCHANGE_EDEFAULT);
				return;
			case RifPackage.SPECGROUPHIERARCHYROOT__LONGNAME:
				setLONGNAME(LONGNAME_EDEFAULT);
				return;
			case RifPackage.SPECGROUPHIERARCHYROOT__TYPE:
				setTYPE((TYPEType3)null);
				return;
			case RifPackage.SPECGROUPHIERARCHYROOT__VALUES:
				setVALUES((VALUESType1)null);
				return;
			case RifPackage.SPECGROUPHIERARCHYROOT__CHILDREN:
				setCHILDREN((CHILDRENType2)null);
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
			case RifPackage.SPECGROUPHIERARCHYROOT__DESC:
				return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals(dESC);
			case RifPackage.SPECGROUPHIERARCHYROOT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
			case RifPackage.SPECGROUPHIERARCHYROOT__LASTCHANGE:
				return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
			case RifPackage.SPECGROUPHIERARCHYROOT__LONGNAME:
				return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals(lONGNAME);
			case RifPackage.SPECGROUPHIERARCHYROOT__TYPE:
				return tYPE != null;
			case RifPackage.SPECGROUPHIERARCHYROOT__VALUES:
				return vALUES != null;
			case RifPackage.SPECGROUPHIERARCHYROOT__CHILDREN:
				return cHILDREN != null;
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

} //SPECGROUPHIERARCHYROOTImpl
