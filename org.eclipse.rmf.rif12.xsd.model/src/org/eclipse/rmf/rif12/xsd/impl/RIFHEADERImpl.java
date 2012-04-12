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
import org.eclipse.rmf.rif12.xsd.RIFHEADER;
import org.eclipse.rmf.rif12.xsd.RifPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RIFHEADER</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFHEADERImpl#getAUTHOR <em>AUTHOR</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFHEADERImpl#getCOMMENT <em>COMMENT</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFHEADERImpl#getCREATIONTIME <em>CREATIONTIME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFHEADERImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFHEADERImpl#getSOURCETOOLID <em>SOURCETOOLID</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFHEADERImpl#getTITLE <em>TITLE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RIFHEADERImpl extends EObjectImpl implements RIFHEADER {
	/**
	 * The default value of the '{@link #getAUTHOR() <em>AUTHOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUTHOR()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTHOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAUTHOR() <em>AUTHOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAUTHOR()
	 * @generated
	 * @ordered
	 */
	protected String aUTHOR = AUTHOR_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RIFHEADERImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.RIFHEADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAUTHOR() {
		return aUTHOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAUTHOR(String newAUTHOR) {
		String oldAUTHOR = aUTHOR;
		aUTHOR = newAUTHOR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIFHEADER__AUTHOR, oldAUTHOR, aUTHOR));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIFHEADER__COMMENT, oldCOMMENT, cOMMENT));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIFHEADER__CREATIONTIME, oldCREATIONTIME, cREATIONTIME));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIFHEADER__IDENTIFIER, oldIDENTIFIER, iDENTIFIER));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIFHEADER__SOURCETOOLID, oldSOURCETOOLID, sOURCETOOLID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIFHEADER__TITLE, oldTITLE, tITLE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RifPackage.RIFHEADER__AUTHOR:
				return getAUTHOR();
			case RifPackage.RIFHEADER__COMMENT:
				return getCOMMENT();
			case RifPackage.RIFHEADER__CREATIONTIME:
				return getCREATIONTIME();
			case RifPackage.RIFHEADER__IDENTIFIER:
				return getIDENTIFIER();
			case RifPackage.RIFHEADER__SOURCETOOLID:
				return getSOURCETOOLID();
			case RifPackage.RIFHEADER__TITLE:
				return getTITLE();
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
			case RifPackage.RIFHEADER__AUTHOR:
				setAUTHOR((String)newValue);
				return;
			case RifPackage.RIFHEADER__COMMENT:
				setCOMMENT((String)newValue);
				return;
			case RifPackage.RIFHEADER__CREATIONTIME:
				setCREATIONTIME((XMLGregorianCalendar)newValue);
				return;
			case RifPackage.RIFHEADER__IDENTIFIER:
				setIDENTIFIER((String)newValue);
				return;
			case RifPackage.RIFHEADER__SOURCETOOLID:
				setSOURCETOOLID((String)newValue);
				return;
			case RifPackage.RIFHEADER__TITLE:
				setTITLE((String)newValue);
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
			case RifPackage.RIFHEADER__AUTHOR:
				setAUTHOR(AUTHOR_EDEFAULT);
				return;
			case RifPackage.RIFHEADER__COMMENT:
				setCOMMENT(COMMENT_EDEFAULT);
				return;
			case RifPackage.RIFHEADER__CREATIONTIME:
				setCREATIONTIME(CREATIONTIME_EDEFAULT);
				return;
			case RifPackage.RIFHEADER__IDENTIFIER:
				setIDENTIFIER(IDENTIFIER_EDEFAULT);
				return;
			case RifPackage.RIFHEADER__SOURCETOOLID:
				setSOURCETOOLID(SOURCETOOLID_EDEFAULT);
				return;
			case RifPackage.RIFHEADER__TITLE:
				setTITLE(TITLE_EDEFAULT);
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
			case RifPackage.RIFHEADER__AUTHOR:
				return AUTHOR_EDEFAULT == null ? aUTHOR != null : !AUTHOR_EDEFAULT.equals(aUTHOR);
			case RifPackage.RIFHEADER__COMMENT:
				return COMMENT_EDEFAULT == null ? cOMMENT != null : !COMMENT_EDEFAULT.equals(cOMMENT);
			case RifPackage.RIFHEADER__CREATIONTIME:
				return CREATIONTIME_EDEFAULT == null ? cREATIONTIME != null : !CREATIONTIME_EDEFAULT.equals(cREATIONTIME);
			case RifPackage.RIFHEADER__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
			case RifPackage.RIFHEADER__SOURCETOOLID:
				return SOURCETOOLID_EDEFAULT == null ? sOURCETOOLID != null : !SOURCETOOLID_EDEFAULT.equals(sOURCETOOLID);
			case RifPackage.RIFHEADER__TITLE:
				return TITLE_EDEFAULT == null ? tITLE != null : !TITLE_EDEFAULT.equals(tITLE);
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
		result.append(" (aUTHOR: ");
		result.append(aUTHOR);
		result.append(", cOMMENT: ");
		result.append(cOMMENT);
		result.append(", cREATIONTIME: ");
		result.append(cREATIONTIME);
		result.append(", iDENTIFIER: ");
		result.append(iDENTIFIER);
		result.append(", sOURCETOOLID: ");
		result.append(sOURCETOOLID);
		result.append(", tITLE: ");
		result.append(tITLE);
		result.append(')');
		return result.toString();
	}

} //RIFHEADERImpl
