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

import java.math.BigInteger;

import javax.xml.datatype.XMLGregorianCalendar;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONREAL;
import org.eclipse.rmf.rif12.xsd.RifPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DATATYPEDEFINITIONREAL</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONREALImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONREALImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONREALImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONREALImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONREALImpl#getACCURACY <em>ACCURACY</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONREALImpl#getMAX <em>MAX</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONREALImpl#getMIN <em>MIN</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DATATYPEDEFINITIONREALImpl extends EObjectImpl implements DATATYPEDEFINITIONREAL {
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
	 * The default value of the '{@link #getACCURACY() <em>ACCURACY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACCURACY()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ACCURACY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getACCURACY() <em>ACCURACY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACCURACY()
	 * @generated
	 * @ordered
	 */
	protected BigInteger aCCURACY = ACCURACY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMAX() <em>MAX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAX()
	 * @generated
	 * @ordered
	 */
	protected static final double MAX_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMAX() <em>MAX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAX()
	 * @generated
	 * @ordered
	 */
	protected double mAX = MAX_EDEFAULT;

	/**
	 * This is true if the MAX attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mAXESet;

	/**
	 * The default value of the '{@link #getMIN() <em>MIN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMIN()
	 * @generated
	 * @ordered
	 */
	protected static final double MIN_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMIN() <em>MIN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMIN()
	 * @generated
	 * @ordered
	 */
	protected double mIN = MIN_EDEFAULT;

	/**
	 * This is true if the MIN attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mINESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DATATYPEDEFINITIONREALImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.DATATYPEDEFINITIONREAL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONREAL__DESC, oldDESC, dESC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONREAL__IDENTIFIER, oldIDENTIFIER, iDENTIFIER));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONREAL__LASTCHANGE, oldLASTCHANGE, lASTCHANGE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONREAL__LONGNAME, oldLONGNAME, lONGNAME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getACCURACY() {
		return aCCURACY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACCURACY(BigInteger newACCURACY) {
		BigInteger oldACCURACY = aCCURACY;
		aCCURACY = newACCURACY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONREAL__ACCURACY, oldACCURACY, aCCURACY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMAX() {
		return mAX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMAX(double newMAX) {
		double oldMAX = mAX;
		mAX = newMAX;
		boolean oldMAXESet = mAXESet;
		mAXESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONREAL__MAX, oldMAX, mAX, !oldMAXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMAX() {
		double oldMAX = mAX;
		boolean oldMAXESet = mAXESet;
		mAX = MAX_EDEFAULT;
		mAXESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RifPackage.DATATYPEDEFINITIONREAL__MAX, oldMAX, MAX_EDEFAULT, oldMAXESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMAX() {
		return mAXESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMIN() {
		return mIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMIN(double newMIN) {
		double oldMIN = mIN;
		mIN = newMIN;
		boolean oldMINESet = mINESet;
		mINESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONREAL__MIN, oldMIN, mIN, !oldMINESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMIN() {
		double oldMIN = mIN;
		boolean oldMINESet = mINESet;
		mIN = MIN_EDEFAULT;
		mINESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RifPackage.DATATYPEDEFINITIONREAL__MIN, oldMIN, MIN_EDEFAULT, oldMINESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMIN() {
		return mINESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RifPackage.DATATYPEDEFINITIONREAL__DESC:
				return getDESC();
			case RifPackage.DATATYPEDEFINITIONREAL__IDENTIFIER:
				return getIDENTIFIER();
			case RifPackage.DATATYPEDEFINITIONREAL__LASTCHANGE:
				return getLASTCHANGE();
			case RifPackage.DATATYPEDEFINITIONREAL__LONGNAME:
				return getLONGNAME();
			case RifPackage.DATATYPEDEFINITIONREAL__ACCURACY:
				return getACCURACY();
			case RifPackage.DATATYPEDEFINITIONREAL__MAX:
				return getMAX();
			case RifPackage.DATATYPEDEFINITIONREAL__MIN:
				return getMIN();
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
			case RifPackage.DATATYPEDEFINITIONREAL__DESC:
				setDESC((String)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONREAL__IDENTIFIER:
				setIDENTIFIER((String)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONREAL__LASTCHANGE:
				setLASTCHANGE((XMLGregorianCalendar)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONREAL__LONGNAME:
				setLONGNAME((String)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONREAL__ACCURACY:
				setACCURACY((BigInteger)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONREAL__MAX:
				setMAX((Double)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONREAL__MIN:
				setMIN((Double)newValue);
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
			case RifPackage.DATATYPEDEFINITIONREAL__DESC:
				setDESC(DESC_EDEFAULT);
				return;
			case RifPackage.DATATYPEDEFINITIONREAL__IDENTIFIER:
				setIDENTIFIER(IDENTIFIER_EDEFAULT);
				return;
			case RifPackage.DATATYPEDEFINITIONREAL__LASTCHANGE:
				setLASTCHANGE(LASTCHANGE_EDEFAULT);
				return;
			case RifPackage.DATATYPEDEFINITIONREAL__LONGNAME:
				setLONGNAME(LONGNAME_EDEFAULT);
				return;
			case RifPackage.DATATYPEDEFINITIONREAL__ACCURACY:
				setACCURACY(ACCURACY_EDEFAULT);
				return;
			case RifPackage.DATATYPEDEFINITIONREAL__MAX:
				unsetMAX();
				return;
			case RifPackage.DATATYPEDEFINITIONREAL__MIN:
				unsetMIN();
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
			case RifPackage.DATATYPEDEFINITIONREAL__DESC:
				return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals(dESC);
			case RifPackage.DATATYPEDEFINITIONREAL__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
			case RifPackage.DATATYPEDEFINITIONREAL__LASTCHANGE:
				return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
			case RifPackage.DATATYPEDEFINITIONREAL__LONGNAME:
				return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals(lONGNAME);
			case RifPackage.DATATYPEDEFINITIONREAL__ACCURACY:
				return ACCURACY_EDEFAULT == null ? aCCURACY != null : !ACCURACY_EDEFAULT.equals(aCCURACY);
			case RifPackage.DATATYPEDEFINITIONREAL__MAX:
				return isSetMAX();
			case RifPackage.DATATYPEDEFINITIONREAL__MIN:
				return isSetMIN();
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
		result.append(", aCCURACY: ");
		result.append(aCCURACY);
		result.append(", mAX: ");
		if (mAXESet) result.append(mAX); else result.append("<unset>");
		result.append(", mIN: ");
		if (mINESet) result.append(mIN); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //DATATYPEDEFINITIONREALImpl
