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
import org.eclipse.rmf.rif12.xsd.ATTRIBUTEVALUEEMBEDDEDDOCUMENT;
import org.eclipse.rmf.rif12.xsd.DEFINITIONType5;
import org.eclipse.rmf.rif12.xsd.RifPackage;
import org.eclipse.rmf.rif12.xsd.XHTMLCONTENT;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ATTRIBUTEVALUEEMBEDDEDDOCUMENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEVALUEEMBEDDEDDOCUMENTImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEVALUEEMBEDDEDDOCUMENTImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEVALUEEMBEDDEDDOCUMENTImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEVALUEEMBEDDEDDOCUMENTImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEVALUEEMBEDDEDDOCUMENTImpl#getDEFINITION <em>DEFINITION</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.ATTRIBUTEVALUEEMBEDDEDDOCUMENTImpl#getXHTMLCONTENT <em>XHTMLCONTENT</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ATTRIBUTEVALUEEMBEDDEDDOCUMENTImpl extends EObjectImpl implements ATTRIBUTEVALUEEMBEDDEDDOCUMENT {
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
	protected DEFINITIONType5 dEFINITION;

	/**
	 * The cached value of the '{@link #getXHTMLCONTENT() <em>XHTMLCONTENT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXHTMLCONTENT()
	 * @generated
	 * @ordered
	 */
	protected XHTMLCONTENT xHTMLCONTENT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATTRIBUTEVALUEEMBEDDEDDOCUMENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.ATTRIBUTEVALUEEMBEDDEDDOCUMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DESC, oldDESC, dESC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__IDENTIFIER, oldIDENTIFIER, iDENTIFIER));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__LASTCHANGE, oldLASTCHANGE, lASTCHANGE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__LONGNAME, oldLONGNAME, lONGNAME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEFINITIONType5 getDEFINITION() {
		return dEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDEFINITION(DEFINITIONType5 newDEFINITION, NotificationChain msgs) {
		DEFINITIONType5 oldDEFINITION = dEFINITION;
		dEFINITION = newDEFINITION;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DEFINITION, oldDEFINITION, newDEFINITION);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDEFINITION(DEFINITIONType5 newDEFINITION) {
		if (newDEFINITION != dEFINITION) {
			NotificationChain msgs = null;
			if (dEFINITION != null)
				msgs = ((InternalEObject)dEFINITION).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DEFINITION, null, msgs);
			if (newDEFINITION != null)
				msgs = ((InternalEObject)newDEFINITION).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DEFINITION, null, msgs);
			msgs = basicSetDEFINITION(newDEFINITION, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DEFINITION, newDEFINITION, newDEFINITION));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XHTMLCONTENT getXHTMLCONTENT() {
		return xHTMLCONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXHTMLCONTENT(XHTMLCONTENT newXHTMLCONTENT, NotificationChain msgs) {
		XHTMLCONTENT oldXHTMLCONTENT = xHTMLCONTENT;
		xHTMLCONTENT = newXHTMLCONTENT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__XHTMLCONTENT, oldXHTMLCONTENT, newXHTMLCONTENT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXHTMLCONTENT(XHTMLCONTENT newXHTMLCONTENT) {
		if (newXHTMLCONTENT != xHTMLCONTENT) {
			NotificationChain msgs = null;
			if (xHTMLCONTENT != null)
				msgs = ((InternalEObject)xHTMLCONTENT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__XHTMLCONTENT, null, msgs);
			if (newXHTMLCONTENT != null)
				msgs = ((InternalEObject)newXHTMLCONTENT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__XHTMLCONTENT, null, msgs);
			msgs = basicSetXHTMLCONTENT(newXHTMLCONTENT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__XHTMLCONTENT, newXHTMLCONTENT, newXHTMLCONTENT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DEFINITION:
				return basicSetDEFINITION(null, msgs);
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__XHTMLCONTENT:
				return basicSetXHTMLCONTENT(null, msgs);
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
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DESC:
				return getDESC();
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__IDENTIFIER:
				return getIDENTIFIER();
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__LASTCHANGE:
				return getLASTCHANGE();
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__LONGNAME:
				return getLONGNAME();
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DEFINITION:
				return getDEFINITION();
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__XHTMLCONTENT:
				return getXHTMLCONTENT();
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
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DESC:
				setDESC((String)newValue);
				return;
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__IDENTIFIER:
				setIDENTIFIER((String)newValue);
				return;
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__LASTCHANGE:
				setLASTCHANGE((XMLGregorianCalendar)newValue);
				return;
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__LONGNAME:
				setLONGNAME((String)newValue);
				return;
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DEFINITION:
				setDEFINITION((DEFINITIONType5)newValue);
				return;
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__XHTMLCONTENT:
				setXHTMLCONTENT((XHTMLCONTENT)newValue);
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
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DESC:
				setDESC(DESC_EDEFAULT);
				return;
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__IDENTIFIER:
				setIDENTIFIER(IDENTIFIER_EDEFAULT);
				return;
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__LASTCHANGE:
				setLASTCHANGE(LASTCHANGE_EDEFAULT);
				return;
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__LONGNAME:
				setLONGNAME(LONGNAME_EDEFAULT);
				return;
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DEFINITION:
				setDEFINITION((DEFINITIONType5)null);
				return;
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__XHTMLCONTENT:
				setXHTMLCONTENT((XHTMLCONTENT)null);
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
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DESC:
				return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals(dESC);
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__LASTCHANGE:
				return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__LONGNAME:
				return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals(lONGNAME);
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__DEFINITION:
				return dEFINITION != null;
			case RifPackage.ATTRIBUTEVALUEEMBEDDEDDOCUMENT__XHTMLCONTENT:
				return xHTMLCONTENT != null;
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

} //ATTRIBUTEVALUEEMBEDDEDDOCUMENTImpl
