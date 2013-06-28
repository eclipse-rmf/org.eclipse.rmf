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

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFHEADER;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REQIFHEADER</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFHEADERImpl#getCOMMENT <em>COMMENT</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFHEADERImpl#getCREATIONTIME <em>CREATIONTIME</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFHEADERImpl#getREPOSITORYID <em>REPOSITORYID</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFHEADERImpl#getREQIFTOOLID <em>REQIFTOOLID</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFHEADERImpl#getREQIFVERSION <em>REQIFVERSION</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFHEADERImpl#getSOURCETOOLID <em>SOURCETOOLID</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFHEADERImpl#getTITLE <em>TITLE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFHEADERImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class REQIFHEADERImpl extends EObjectImpl implements REQIFHEADER {
	/**
	 * The default value of the '{@link #getCOMMENT() <em>COMMENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOMMENT()
	 * @generated
	 * @ordered
	 */
	protected static final String COMMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCOMMENT() <em>COMMENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCOMMENT()
	 * @generated
	 * @ordered
	 */
	protected String cOMMENT = COMMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCREATIONTIME() <em>CREATIONTIME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATIONTIME()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar CREATIONTIME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCREATIONTIME() <em>CREATIONTIME</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCREATIONTIME()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar cREATIONTIME = CREATIONTIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getREPOSITORYID() <em>REPOSITORYID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREPOSITORYID()
	 * @generated
	 * @ordered
	 */
	protected static final String REPOSITORYID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getREPOSITORYID() <em>REPOSITORYID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREPOSITORYID()
	 * @generated
	 * @ordered
	 */
	protected String rEPOSITORYID = REPOSITORYID_EDEFAULT;

	/**
	 * The default value of the '{@link #getREQIFTOOLID() <em>REQIFTOOLID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREQIFTOOLID()
	 * @generated
	 * @ordered
	 */
	protected static final String REQIFTOOLID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getREQIFTOOLID() <em>REQIFTOOLID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREQIFTOOLID()
	 * @generated
	 * @ordered
	 */
	protected String rEQIFTOOLID = REQIFTOOLID_EDEFAULT;

	/**
	 * The default value of the '{@link #getREQIFVERSION() <em>REQIFVERSION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREQIFVERSION()
	 * @generated
	 * @ordered
	 */
	protected static final String REQIFVERSION_EDEFAULT = "1.0";

	/**
	 * The cached value of the '{@link #getREQIFVERSION() <em>REQIFVERSION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getREQIFVERSION()
	 * @generated
	 * @ordered
	 */
	protected String rEQIFVERSION = REQIFVERSION_EDEFAULT;

	/**
	 * This is true if the REQIFVERSION attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rEQIFVERSIONESet;

	/**
	 * The default value of the '{@link #getSOURCETOOLID() <em>SOURCETOOLID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSOURCETOOLID()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCETOOLID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSOURCETOOLID() <em>SOURCETOOLID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSOURCETOOLID()
	 * @generated
	 * @ordered
	 */
	protected String sOURCETOOLID = SOURCETOOLID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTITLE() <em>TITLE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTITLE()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTITLE() <em>TITLE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTITLE()
	 * @generated
	 * @ordered
	 */
	protected String tITLE = TITLE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REQIFHEADERImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.REQIFHEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCOMMENT() {
		return cOMMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCOMMENT(String newCOMMENT) {
		String oldCOMMENT = cOMMENT;
		cOMMENT = newCOMMENT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFHEADER__COMMENT, oldCOMMENT, cOMMENT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getCREATIONTIME() {
		return cREATIONTIME;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCREATIONTIME(XMLGregorianCalendar newCREATIONTIME) {
		XMLGregorianCalendar oldCREATIONTIME = cREATIONTIME;
		cREATIONTIME = newCREATIONTIME;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFHEADER__CREATIONTIME, oldCREATIONTIME, cREATIONTIME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getREPOSITORYID() {
		return rEPOSITORYID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setREPOSITORYID(String newREPOSITORYID) {
		String oldREPOSITORYID = rEPOSITORYID;
		rEPOSITORYID = newREPOSITORYID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFHEADER__REPOSITORYID, oldREPOSITORYID, rEPOSITORYID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getREQIFTOOLID() {
		return rEQIFTOOLID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setREQIFTOOLID(String newREQIFTOOLID) {
		String oldREQIFTOOLID = rEQIFTOOLID;
		rEQIFTOOLID = newREQIFTOOLID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFHEADER__REQIFTOOLID, oldREQIFTOOLID, rEQIFTOOLID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getREQIFVERSION() {
		return rEQIFVERSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setREQIFVERSION(String newREQIFVERSION) {
		String oldREQIFVERSION = rEQIFVERSION;
		rEQIFVERSION = newREQIFVERSION;
		boolean oldREQIFVERSIONESet = rEQIFVERSIONESet;
		rEQIFVERSIONESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFHEADER__REQIFVERSION, oldREQIFVERSION, rEQIFVERSION, !oldREQIFVERSIONESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetREQIFVERSION() {
		String oldREQIFVERSION = rEQIFVERSION;
		boolean oldREQIFVERSIONESet = rEQIFVERSIONESet;
		rEQIFVERSION = REQIFVERSION_EDEFAULT;
		rEQIFVERSIONESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MyreqifPackage.REQIFHEADER__REQIFVERSION, oldREQIFVERSION, REQIFVERSION_EDEFAULT, oldREQIFVERSIONESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetREQIFVERSION() {
		return rEQIFVERSIONESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSOURCETOOLID() {
		return sOURCETOOLID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSOURCETOOLID(String newSOURCETOOLID) {
		String oldSOURCETOOLID = sOURCETOOLID;
		sOURCETOOLID = newSOURCETOOLID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFHEADER__SOURCETOOLID, oldSOURCETOOLID, sOURCETOOLID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTITLE() {
		return tITLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTITLE(String newTITLE) {
		String oldTITLE = tITLE;
		tITLE = newTITLE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFHEADER__TITLE, oldTITLE, tITLE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFHEADER__IDENTIFIER, oldIDENTIFIER, iDENTIFIER));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MyreqifPackage.REQIFHEADER__COMMENT:
				return getCOMMENT();
			case MyreqifPackage.REQIFHEADER__CREATIONTIME:
				return getCREATIONTIME();
			case MyreqifPackage.REQIFHEADER__REPOSITORYID:
				return getREPOSITORYID();
			case MyreqifPackage.REQIFHEADER__REQIFTOOLID:
				return getREQIFTOOLID();
			case MyreqifPackage.REQIFHEADER__REQIFVERSION:
				return getREQIFVERSION();
			case MyreqifPackage.REQIFHEADER__SOURCETOOLID:
				return getSOURCETOOLID();
			case MyreqifPackage.REQIFHEADER__TITLE:
				return getTITLE();
			case MyreqifPackage.REQIFHEADER__IDENTIFIER:
				return getIDENTIFIER();
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
			case MyreqifPackage.REQIFHEADER__COMMENT:
				setCOMMENT((String)newValue);
				return;
			case MyreqifPackage.REQIFHEADER__CREATIONTIME:
				setCREATIONTIME((XMLGregorianCalendar)newValue);
				return;
			case MyreqifPackage.REQIFHEADER__REPOSITORYID:
				setREPOSITORYID((String)newValue);
				return;
			case MyreqifPackage.REQIFHEADER__REQIFTOOLID:
				setREQIFTOOLID((String)newValue);
				return;
			case MyreqifPackage.REQIFHEADER__REQIFVERSION:
				setREQIFVERSION((String)newValue);
				return;
			case MyreqifPackage.REQIFHEADER__SOURCETOOLID:
				setSOURCETOOLID((String)newValue);
				return;
			case MyreqifPackage.REQIFHEADER__TITLE:
				setTITLE((String)newValue);
				return;
			case MyreqifPackage.REQIFHEADER__IDENTIFIER:
				setIDENTIFIER((String)newValue);
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
			case MyreqifPackage.REQIFHEADER__COMMENT:
				setCOMMENT(COMMENT_EDEFAULT);
				return;
			case MyreqifPackage.REQIFHEADER__CREATIONTIME:
				setCREATIONTIME(CREATIONTIME_EDEFAULT);
				return;
			case MyreqifPackage.REQIFHEADER__REPOSITORYID:
				setREPOSITORYID(REPOSITORYID_EDEFAULT);
				return;
			case MyreqifPackage.REQIFHEADER__REQIFTOOLID:
				setREQIFTOOLID(REQIFTOOLID_EDEFAULT);
				return;
			case MyreqifPackage.REQIFHEADER__REQIFVERSION:
				unsetREQIFVERSION();
				return;
			case MyreqifPackage.REQIFHEADER__SOURCETOOLID:
				setSOURCETOOLID(SOURCETOOLID_EDEFAULT);
				return;
			case MyreqifPackage.REQIFHEADER__TITLE:
				setTITLE(TITLE_EDEFAULT);
				return;
			case MyreqifPackage.REQIFHEADER__IDENTIFIER:
				setIDENTIFIER(IDENTIFIER_EDEFAULT);
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
			case MyreqifPackage.REQIFHEADER__COMMENT:
				return COMMENT_EDEFAULT == null ? cOMMENT != null : !COMMENT_EDEFAULT.equals(cOMMENT);
			case MyreqifPackage.REQIFHEADER__CREATIONTIME:
				return CREATIONTIME_EDEFAULT == null ? cREATIONTIME != null : !CREATIONTIME_EDEFAULT.equals(cREATIONTIME);
			case MyreqifPackage.REQIFHEADER__REPOSITORYID:
				return REPOSITORYID_EDEFAULT == null ? rEPOSITORYID != null : !REPOSITORYID_EDEFAULT.equals(rEPOSITORYID);
			case MyreqifPackage.REQIFHEADER__REQIFTOOLID:
				return REQIFTOOLID_EDEFAULT == null ? rEQIFTOOLID != null : !REQIFTOOLID_EDEFAULT.equals(rEQIFTOOLID);
			case MyreqifPackage.REQIFHEADER__REQIFVERSION:
				return isSetREQIFVERSION();
			case MyreqifPackage.REQIFHEADER__SOURCETOOLID:
				return SOURCETOOLID_EDEFAULT == null ? sOURCETOOLID != null : !SOURCETOOLID_EDEFAULT.equals(sOURCETOOLID);
			case MyreqifPackage.REQIFHEADER__TITLE:
				return TITLE_EDEFAULT == null ? tITLE != null : !TITLE_EDEFAULT.equals(tITLE);
			case MyreqifPackage.REQIFHEADER__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
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
		result.append(" (cOMMENT: ");
		result.append(cOMMENT);
		result.append(", cREATIONTIME: ");
		result.append(cREATIONTIME);
		result.append(", rEPOSITORYID: ");
		result.append(rEPOSITORYID);
		result.append(", rEQIFTOOLID: ");
		result.append(rEQIFTOOLID);
		result.append(", rEQIFVERSION: ");
		if (rEQIFVERSIONESet) result.append(rEQIFVERSION); else result.append("<unset>");
		result.append(", sOURCETOOLID: ");
		result.append(sOURCETOOLID);
		result.append(", tITLE: ");
		result.append(tITLE);
		result.append(", iDENTIFIER: ");
		result.append(iDENTIFIER);
		result.append(')');
		return result.toString();
	}

} //REQIFHEADERImpl
