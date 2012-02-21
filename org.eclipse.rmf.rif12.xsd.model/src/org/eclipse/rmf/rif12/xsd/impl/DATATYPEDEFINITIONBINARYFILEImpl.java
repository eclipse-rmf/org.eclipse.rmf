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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONBINARYFILE;
import org.eclipse.rmf.rif12.xsd.RifPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DATATYPEDEFINITIONBINARYFILE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONBINARYFILEImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONBINARYFILEImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONBINARYFILEImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONBINARYFILEImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONBINARYFILEImpl#isEMBEDDED <em>EMBEDDED</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONBINARYFILEImpl#getAPPLICATION <em>APPLICATION</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONBINARYFILEImpl#getFILENAMESUFFIX <em>FILENAMESUFFIX</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONBINARYFILEImpl#getFORMATNAME <em>FORMATNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONBINARYFILEImpl#getMIMETYPE <em>MIMETYPE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DATATYPEDEFINITIONBINARYFILEImpl extends EObjectImpl implements DATATYPEDEFINITIONBINARYFILE {
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
	 * The default value of the '{@link #isEMBEDDED() <em>EMBEDDED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEMBEDDED()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EMBEDDED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEMBEDDED() <em>EMBEDDED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEMBEDDED()
	 * @generated
	 * @ordered
	 */
	protected boolean eMBEDDED = EMBEDDED_EDEFAULT;

	/**
	 * This is true if the EMBEDDED attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean eMBEDDEDESet;

	/**
	 * The default value of the '{@link #getAPPLICATION() <em>APPLICATION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPPLICATION()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAPPLICATION() <em>APPLICATION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPPLICATION()
	 * @generated
	 * @ordered
	 */
	protected String aPPLICATION = APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFILENAMESUFFIX() <em>FILENAMESUFFIX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFILENAMESUFFIX()
	 * @generated
	 * @ordered
	 */
	protected static final String FILENAMESUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFILENAMESUFFIX() <em>FILENAMESUFFIX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFILENAMESUFFIX()
	 * @generated
	 * @ordered
	 */
	protected String fILENAMESUFFIX = FILENAMESUFFIX_EDEFAULT;

	/**
	 * The default value of the '{@link #getFORMATNAME() <em>FORMATNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFORMATNAME()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMATNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFORMATNAME() <em>FORMATNAME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFORMATNAME()
	 * @generated
	 * @ordered
	 */
	protected String fORMATNAME = FORMATNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMIMETYPE() <em>MIMETYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMIMETYPE()
	 * @generated
	 * @ordered
	 */
	protected static final String MIMETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMIMETYPE() <em>MIMETYPE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMIMETYPE()
	 * @generated
	 * @ordered
	 */
	protected String mIMETYPE = MIMETYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DATATYPEDEFINITIONBINARYFILEImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.DATATYPEDEFINITIONBINARYFILE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONBINARYFILE__DESC, oldDESC, dESC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONBINARYFILE__IDENTIFIER, oldIDENTIFIER, iDENTIFIER));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONBINARYFILE__LASTCHANGE, oldLASTCHANGE, lASTCHANGE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONBINARYFILE__LONGNAME, oldLONGNAME, lONGNAME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEMBEDDED() {
		return eMBEDDED;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEMBEDDED(boolean newEMBEDDED) {
		boolean oldEMBEDDED = eMBEDDED;
		eMBEDDED = newEMBEDDED;
		boolean oldEMBEDDEDESet = eMBEDDEDESet;
		eMBEDDEDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONBINARYFILE__EMBEDDED, oldEMBEDDED, eMBEDDED, !oldEMBEDDEDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEMBEDDED() {
		boolean oldEMBEDDED = eMBEDDED;
		boolean oldEMBEDDEDESet = eMBEDDEDESet;
		eMBEDDED = EMBEDDED_EDEFAULT;
		eMBEDDEDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RifPackage.DATATYPEDEFINITIONBINARYFILE__EMBEDDED, oldEMBEDDED, EMBEDDED_EDEFAULT, oldEMBEDDEDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEMBEDDED() {
		return eMBEDDEDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAPPLICATION() {
		return aPPLICATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPPLICATION(String newAPPLICATION) {
		String oldAPPLICATION = aPPLICATION;
		aPPLICATION = newAPPLICATION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONBINARYFILE__APPLICATION, oldAPPLICATION, aPPLICATION));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFILENAMESUFFIX() {
		return fILENAMESUFFIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFILENAMESUFFIX(String newFILENAMESUFFIX) {
		String oldFILENAMESUFFIX = fILENAMESUFFIX;
		fILENAMESUFFIX = newFILENAMESUFFIX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONBINARYFILE__FILENAMESUFFIX, oldFILENAMESUFFIX, fILENAMESUFFIX));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFORMATNAME() {
		return fORMATNAME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFORMATNAME(String newFORMATNAME) {
		String oldFORMATNAME = fORMATNAME;
		fORMATNAME = newFORMATNAME;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONBINARYFILE__FORMATNAME, oldFORMATNAME, fORMATNAME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMIMETYPE() {
		return mIMETYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMIMETYPE(String newMIMETYPE) {
		String oldMIMETYPE = mIMETYPE;
		mIMETYPE = newMIMETYPE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONBINARYFILE__MIMETYPE, oldMIMETYPE, mIMETYPE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__DESC:
				return getDESC();
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__IDENTIFIER:
				return getIDENTIFIER();
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__LASTCHANGE:
				return getLASTCHANGE();
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__LONGNAME:
				return getLONGNAME();
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__EMBEDDED:
				return isEMBEDDED();
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__APPLICATION:
				return getAPPLICATION();
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__FILENAMESUFFIX:
				return getFILENAMESUFFIX();
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__FORMATNAME:
				return getFORMATNAME();
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__MIMETYPE:
				return getMIMETYPE();
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
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__DESC:
				setDESC((String)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__IDENTIFIER:
				setIDENTIFIER((String)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__LASTCHANGE:
				setLASTCHANGE((XMLGregorianCalendar)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__LONGNAME:
				setLONGNAME((String)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__EMBEDDED:
				setEMBEDDED((Boolean)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__APPLICATION:
				setAPPLICATION((String)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__FILENAMESUFFIX:
				setFILENAMESUFFIX((String)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__FORMATNAME:
				setFORMATNAME((String)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__MIMETYPE:
				setMIMETYPE((String)newValue);
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
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__DESC:
				setDESC(DESC_EDEFAULT);
				return;
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__IDENTIFIER:
				setIDENTIFIER(IDENTIFIER_EDEFAULT);
				return;
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__LASTCHANGE:
				setLASTCHANGE(LASTCHANGE_EDEFAULT);
				return;
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__LONGNAME:
				setLONGNAME(LONGNAME_EDEFAULT);
				return;
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__EMBEDDED:
				unsetEMBEDDED();
				return;
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__APPLICATION:
				setAPPLICATION(APPLICATION_EDEFAULT);
				return;
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__FILENAMESUFFIX:
				setFILENAMESUFFIX(FILENAMESUFFIX_EDEFAULT);
				return;
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__FORMATNAME:
				setFORMATNAME(FORMATNAME_EDEFAULT);
				return;
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__MIMETYPE:
				setMIMETYPE(MIMETYPE_EDEFAULT);
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
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__DESC:
				return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals(dESC);
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__LASTCHANGE:
				return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__LONGNAME:
				return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals(lONGNAME);
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__EMBEDDED:
				return isSetEMBEDDED();
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__APPLICATION:
				return APPLICATION_EDEFAULT == null ? aPPLICATION != null : !APPLICATION_EDEFAULT.equals(aPPLICATION);
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__FILENAMESUFFIX:
				return FILENAMESUFFIX_EDEFAULT == null ? fILENAMESUFFIX != null : !FILENAMESUFFIX_EDEFAULT.equals(fILENAMESUFFIX);
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__FORMATNAME:
				return FORMATNAME_EDEFAULT == null ? fORMATNAME != null : !FORMATNAME_EDEFAULT.equals(fORMATNAME);
			case RifPackage.DATATYPEDEFINITIONBINARYFILE__MIMETYPE:
				return MIMETYPE_EDEFAULT == null ? mIMETYPE != null : !MIMETYPE_EDEFAULT.equals(mIMETYPE);
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
		result.append(", eMBEDDED: ");
		if (eMBEDDEDESet) result.append(eMBEDDED); else result.append("<unset>");
		result.append(", aPPLICATION: ");
		result.append(aPPLICATION);
		result.append(", fILENAMESUFFIX: ");
		result.append(fILENAMESUFFIX);
		result.append(", fORMATNAME: ");
		result.append(fORMATNAME);
		result.append(", mIMETYPE: ");
		result.append(mIMETYPE);
		result.append(')');
		return result.toString();
	}

} //DATATYPEDEFINITIONBINARYFILEImpl
