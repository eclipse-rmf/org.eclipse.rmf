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
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEDEFINITIONCOMPLEX;
import org.eclipse.rmf.rif12.xsd.DEFAULTVALUEType2;
import org.eclipse.rmf.rif12.xsd.RifPackage;
import org.eclipse.rmf.rif12.xsd.TYPEType7;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATTRIBUTEDEFINITIONCOMPLEX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEDEFINITIONCOMPLEXImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEDEFINITIONCOMPLEXImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEDEFINITIONCOMPLEXImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEDEFINITIONCOMPLEXImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEDEFINITIONCOMPLEXImpl#getDEFAULTVALUE <em>DEFAULTVALUE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEDEFINITIONCOMPLEXImpl#getTYPE <em>TYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ATTRIBUTEDEFINITIONCOMPLEXImpl extends EObjectImpl implements ATTRIBUTEDEFINITIONCOMPLEX {
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
	 * The cached value of the '{@link #getDEFAULTVALUE() <em>DEFAULTVALUE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDEFAULTVALUE()
	 * @generated
	 * @ordered
	 */
	protected DEFAULTVALUEType2 dEFAULTVALUE;

	/**
	 * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTYPE()
	 * @generated
	 * @ordered
	 */
	protected TYPEType7 tYPE;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATTRIBUTEDEFINITIONCOMPLEXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.ATTRIBUTEDEFINITIONCOMPLEX;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__DESC, oldDESC, dESC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__IDENTIFIER, oldIDENTIFIER, iDENTIFIER));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__LASTCHANGE, oldLASTCHANGE, lASTCHANGE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__LONGNAME, oldLONGNAME, lONGNAME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEFAULTVALUEType2 getDEFAULTVALUE() {
		return dEFAULTVALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDEFAULTVALUE(DEFAULTVALUEType2 newDEFAULTVALUE, NotificationChain msgs) {
		DEFAULTVALUEType2 oldDEFAULTVALUE = dEFAULTVALUE;
		dEFAULTVALUE = newDEFAULTVALUE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__DEFAULTVALUE, oldDEFAULTVALUE, newDEFAULTVALUE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDEFAULTVALUE(DEFAULTVALUEType2 newDEFAULTVALUE) {
		if (newDEFAULTVALUE != dEFAULTVALUE) {
			NotificationChain msgs = null;
			if (dEFAULTVALUE != null)
				msgs = ((InternalEObject)dEFAULTVALUE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__DEFAULTVALUE, null, msgs);
			if (newDEFAULTVALUE != null)
				msgs = ((InternalEObject)newDEFAULTVALUE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__DEFAULTVALUE, null, msgs);
			msgs = basicSetDEFAULTVALUE(newDEFAULTVALUE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__DEFAULTVALUE, newDEFAULTVALUE, newDEFAULTVALUE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TYPEType7 getTYPE() {
		return tYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTYPE(TYPEType7 newTYPE, NotificationChain msgs) {
		TYPEType7 oldTYPE = tYPE;
		tYPE = newTYPE;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__TYPE, oldTYPE, newTYPE);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTYPE(TYPEType7 newTYPE) {
		if (newTYPE != tYPE) {
			NotificationChain msgs = null;
			if (tYPE != null)
				msgs = ((InternalEObject)tYPE).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__TYPE, null, msgs);
			if (newTYPE != null)
				msgs = ((InternalEObject)newTYPE).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__TYPE, null, msgs);
			msgs = basicSetTYPE(newTYPE, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__TYPE, newTYPE, newTYPE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__DEFAULTVALUE:
				return basicSetDEFAULTVALUE(null, msgs);
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__TYPE:
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
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__DESC:
				return getDESC();
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__IDENTIFIER:
				return getIDENTIFIER();
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__LASTCHANGE:
				return getLASTCHANGE();
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__LONGNAME:
				return getLONGNAME();
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__DEFAULTVALUE:
				return getDEFAULTVALUE();
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__TYPE:
				return getTYPE();
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
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__DESC:
				setDESC((String)newValue);
				return;
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__IDENTIFIER:
				setIDENTIFIER((String)newValue);
				return;
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__LASTCHANGE:
				setLASTCHANGE((XMLGregorianCalendar)newValue);
				return;
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__LONGNAME:
				setLONGNAME((String)newValue);
				return;
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__DEFAULTVALUE:
				setDEFAULTVALUE((DEFAULTVALUEType2)newValue);
				return;
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__TYPE:
				setTYPE((TYPEType7)newValue);
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
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__DESC:
				setDESC(DESC_EDEFAULT);
				return;
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__IDENTIFIER:
				setIDENTIFIER(IDENTIFIER_EDEFAULT);
				return;
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__LASTCHANGE:
				setLASTCHANGE(LASTCHANGE_EDEFAULT);
				return;
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__LONGNAME:
				setLONGNAME(LONGNAME_EDEFAULT);
				return;
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__DEFAULTVALUE:
				setDEFAULTVALUE((DEFAULTVALUEType2)null);
				return;
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__TYPE:
				setTYPE((TYPEType7)null);
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
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__DESC:
				return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals(dESC);
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__LASTCHANGE:
				return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__LONGNAME:
				return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals(lONGNAME);
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__DEFAULTVALUE:
				return dEFAULTVALUE != null;
			case RifPackage.ATTRIBUTEDEFINITIONCOMPLEX__TYPE:
				return tYPE != null;
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

} //ATTRIBUTEDEFINITIONCOMPLEXImpl
