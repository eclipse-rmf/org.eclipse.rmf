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
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUEENUMERATION;
import org.eclipse.rmf.rif11.xsd.DEFINITIONType3;
import org.eclipse.rmf.rif11.xsd.RifPackage;
import org.eclipse.rmf.rif11.xsd.VALUESType4;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATTRIBUTEVALUEENUMERATION</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEENUMERATIONImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEENUMERATIONImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEENUMERATIONImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEENUMERATIONImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEENUMERATIONImpl#getDEFINITION <em>DEFINITION</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ATTRIBUTEVALUEENUMERATIONImpl#getVALUES <em>VALUES</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ATTRIBUTEVALUEENUMERATIONImpl extends EObjectImpl implements ATTRIBUTEVALUEENUMERATION {
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
	 * The cached value of the '{@link #getDEFINITION() <em>DEFINITION</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDEFINITION()
	 * @generated
	 * @ordered
	 */
	protected DEFINITIONType3 dEFINITION;

	/**
	 * The cached value of the '{@link #getVALUES() <em>VALUES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVALUES()
	 * @generated
	 * @ordered
	 */
	protected VALUESType4 vALUES;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATTRIBUTEVALUEENUMERATIONImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.ATTRIBUTEVALUEENUMERATION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEVALUEENUMERATION__DESC, oldDESC, dESC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEVALUEENUMERATION__IDENTIFIER, oldIDENTIFIER, iDENTIFIER));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEVALUEENUMERATION__LASTCHANGE, oldLASTCHANGE, lASTCHANGE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEVALUEENUMERATION__LONGNAME, oldLONGNAME, lONGNAME));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEVALUEENUMERATION__DEFINITION, oldDEFINITION, newDEFINITION);
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
				msgs = ((InternalEObject)dEFINITION).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.ATTRIBUTEVALUEENUMERATION__DEFINITION, null, msgs);
			if (newDEFINITION != null)
				msgs = ((InternalEObject)newDEFINITION).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.ATTRIBUTEVALUEENUMERATION__DEFINITION, null, msgs);
			msgs = basicSetDEFINITION(newDEFINITION, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEVALUEENUMERATION__DEFINITION, newDEFINITION, newDEFINITION));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VALUESType4 getVALUES() {
		return vALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVALUES(VALUESType4 newVALUES, NotificationChain msgs) {
		VALUESType4 oldVALUES = vALUES;
		vALUES = newVALUES;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEVALUEENUMERATION__VALUES, oldVALUES, newVALUES);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVALUES(VALUESType4 newVALUES) {
		if (newVALUES != vALUES) {
			NotificationChain msgs = null;
			if (vALUES != null)
				msgs = ((InternalEObject)vALUES).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.ATTRIBUTEVALUEENUMERATION__VALUES, null, msgs);
			if (newVALUES != null)
				msgs = ((InternalEObject)newVALUES).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.ATTRIBUTEVALUEENUMERATION__VALUES, null, msgs);
			msgs = basicSetVALUES(newVALUES, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEVALUEENUMERATION__VALUES, newVALUES, newVALUES));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.ATTRIBUTEVALUEENUMERATION__DEFINITION:
				return basicSetDEFINITION(null, msgs);
			case RifPackage.ATTRIBUTEVALUEENUMERATION__VALUES:
				return basicSetVALUES(null, msgs);
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
			case RifPackage.ATTRIBUTEVALUEENUMERATION__DESC:
				return getDESC();
			case RifPackage.ATTRIBUTEVALUEENUMERATION__IDENTIFIER:
				return getIDENTIFIER();
			case RifPackage.ATTRIBUTEVALUEENUMERATION__LASTCHANGE:
				return getLASTCHANGE();
			case RifPackage.ATTRIBUTEVALUEENUMERATION__LONGNAME:
				return getLONGNAME();
			case RifPackage.ATTRIBUTEVALUEENUMERATION__DEFINITION:
				return getDEFINITION();
			case RifPackage.ATTRIBUTEVALUEENUMERATION__VALUES:
				return getVALUES();
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
			case RifPackage.ATTRIBUTEVALUEENUMERATION__DESC:
				setDESC((String)newValue);
				return;
			case RifPackage.ATTRIBUTEVALUEENUMERATION__IDENTIFIER:
				setIDENTIFIER((String)newValue);
				return;
			case RifPackage.ATTRIBUTEVALUEENUMERATION__LASTCHANGE:
				setLASTCHANGE((XMLGregorianCalendar)newValue);
				return;
			case RifPackage.ATTRIBUTEVALUEENUMERATION__LONGNAME:
				setLONGNAME((String)newValue);
				return;
			case RifPackage.ATTRIBUTEVALUEENUMERATION__DEFINITION:
				setDEFINITION((DEFINITIONType3)newValue);
				return;
			case RifPackage.ATTRIBUTEVALUEENUMERATION__VALUES:
				setVALUES((VALUESType4)newValue);
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
			case RifPackage.ATTRIBUTEVALUEENUMERATION__DESC:
				setDESC(DESC_EDEFAULT);
				return;
			case RifPackage.ATTRIBUTEVALUEENUMERATION__IDENTIFIER:
				setIDENTIFIER(IDENTIFIER_EDEFAULT);
				return;
			case RifPackage.ATTRIBUTEVALUEENUMERATION__LASTCHANGE:
				setLASTCHANGE(LASTCHANGE_EDEFAULT);
				return;
			case RifPackage.ATTRIBUTEVALUEENUMERATION__LONGNAME:
				setLONGNAME(LONGNAME_EDEFAULT);
				return;
			case RifPackage.ATTRIBUTEVALUEENUMERATION__DEFINITION:
				setDEFINITION((DEFINITIONType3)null);
				return;
			case RifPackage.ATTRIBUTEVALUEENUMERATION__VALUES:
				setVALUES((VALUESType4)null);
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
			case RifPackage.ATTRIBUTEVALUEENUMERATION__DESC:
				return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals(dESC);
			case RifPackage.ATTRIBUTEVALUEENUMERATION__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
			case RifPackage.ATTRIBUTEVALUEENUMERATION__LASTCHANGE:
				return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
			case RifPackage.ATTRIBUTEVALUEENUMERATION__LONGNAME:
				return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals(lONGNAME);
			case RifPackage.ATTRIBUTEVALUEENUMERATION__DEFINITION:
				return dEFINITION != null;
			case RifPackage.ATTRIBUTEVALUEENUMERATION__VALUES:
				return vALUES != null;
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

} //ATTRIBUTEVALUEENUMERATIONImpl
