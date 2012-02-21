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
import org.eclipse.rmf.rif12.xsd.DATATYPEDEFINITIONDOCUMENT;
import org.eclipse.rmf.rif12.xsd.RifPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DATATYPEDEFINITIONDOCUMENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONDOCUMENTImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONDOCUMENTImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONDOCUMENTImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONDOCUMENTImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.DATATYPEDEFINITIONDOCUMENTImpl#isEMBEDDED <em>EMBEDDED</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DATATYPEDEFINITIONDOCUMENTImpl extends EObjectImpl implements DATATYPEDEFINITIONDOCUMENT {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DATATYPEDEFINITIONDOCUMENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.DATATYPEDEFINITIONDOCUMENT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONDOCUMENT__DESC, oldDESC, dESC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONDOCUMENT__IDENTIFIER, oldIDENTIFIER, iDENTIFIER));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONDOCUMENT__LASTCHANGE, oldLASTCHANGE, lASTCHANGE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONDOCUMENT__LONGNAME, oldLONGNAME, lONGNAME));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.DATATYPEDEFINITIONDOCUMENT__EMBEDDED, oldEMBEDDED, eMBEDDED, !oldEMBEDDEDESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, RifPackage.DATATYPEDEFINITIONDOCUMENT__EMBEDDED, oldEMBEDDED, EMBEDDED_EDEFAULT, oldEMBEDDEDESet));
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__DESC:
				return getDESC();
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__IDENTIFIER:
				return getIDENTIFIER();
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__LASTCHANGE:
				return getLASTCHANGE();
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__LONGNAME:
				return getLONGNAME();
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__EMBEDDED:
				return isEMBEDDED();
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
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__DESC:
				setDESC((String)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__IDENTIFIER:
				setIDENTIFIER((String)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__LASTCHANGE:
				setLASTCHANGE((XMLGregorianCalendar)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__LONGNAME:
				setLONGNAME((String)newValue);
				return;
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__EMBEDDED:
				setEMBEDDED((Boolean)newValue);
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
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__DESC:
				setDESC(DESC_EDEFAULT);
				return;
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__IDENTIFIER:
				setIDENTIFIER(IDENTIFIER_EDEFAULT);
				return;
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__LASTCHANGE:
				setLASTCHANGE(LASTCHANGE_EDEFAULT);
				return;
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__LONGNAME:
				setLONGNAME(LONGNAME_EDEFAULT);
				return;
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__EMBEDDED:
				unsetEMBEDDED();
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
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__DESC:
				return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals(dESC);
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__LASTCHANGE:
				return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__LONGNAME:
				return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals(lONGNAME);
			case RifPackage.DATATYPEDEFINITIONDOCUMENT__EMBEDDED:
				return isSetEMBEDDED();
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
		result.append(')');
		return result.toString();
	}

} //DATATYPEDEFINITIONDOCUMENTImpl
