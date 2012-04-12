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
import org.eclipse.rmf.rif11.xsd.ACCESSPOLICY;
import org.eclipse.rmf.rif11.xsd.ACCESSPOLICYACCESSMODEENUM;
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEDEFINITIONSType;
import org.eclipse.rmf.rif11.xsd.ATTRIBUTEVALUESType;
import org.eclipse.rmf.rif11.xsd.DATATYPEDEFINITIONSType;
import org.eclipse.rmf.rif11.xsd.RELATIONGROUPSType1;
import org.eclipse.rmf.rif11.xsd.RifPackage;
import org.eclipse.rmf.rif11.xsd.SPECGROUPSType1;
import org.eclipse.rmf.rif11.xsd.SPECHIERARCHIESType;
import org.eclipse.rmf.rif11.xsd.SPECHIERARCHYROOTSType1;
import org.eclipse.rmf.rif11.xsd.SPECOBJECTSType1;
import org.eclipse.rmf.rif11.xsd.SPECRELATIONSType;
import org.eclipse.rmf.rif11.xsd.SPECTYPESType1;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>ACCESSPOLICY</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl#getLONGNAME <em>LONGNAME</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl#getACCESSMODE <em>ACCESSMODE</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl#getATTRIBUTEDEFINITIONS <em>ATTRIBUTEDEFINITIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl#getATTRIBUTEVALUES <em>ATTRIBUTEVALUES</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl#getDATATYPEDEFINITIONS <em>DATATYPEDEFINITIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl#getRELATIONGROUPS <em>RELATIONGROUPS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl#getSPECGROUPS <em>SPECGROUPS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl#getSPECHIERARCHIES <em>SPECHIERARCHIES</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl#getSPECHIERARCHYROOTS <em>SPECHIERARCHYROOTS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl#getSPECOBJECTS <em>SPECOBJECTS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl#getSPECRELATIONS <em>SPECRELATIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xsd.impl.ACCESSPOLICYImpl#getSPECTYPES <em>SPECTYPES</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ACCESSPOLICYImpl extends EObjectImpl implements ACCESSPOLICY {
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
	 * The default value of the '{@link #getACCESSMODE() <em>ACCESSMODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACCESSMODE()
	 * @generated
	 * @ordered
	 */
	protected static final ACCESSPOLICYACCESSMODEENUM ACCESSMODE_EDEFAULT = ACCESSPOLICYACCESSMODEENUM.EDIT;

	/**
	 * The cached value of the '{@link #getACCESSMODE() <em>ACCESSMODE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACCESSMODE()
	 * @generated
	 * @ordered
	 */
	protected ACCESSPOLICYACCESSMODEENUM aCCESSMODE = ACCESSMODE_EDEFAULT;

	/**
	 * This is true if the ACCESSMODE attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean aCCESSMODEESet;

	/**
	 * The cached value of the '{@link #getATTRIBUTEDEFINITIONS() <em>ATTRIBUTEDEFINITIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEDEFINITIONS()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEDEFINITIONSType aTTRIBUTEDEFINITIONS;

	/**
	 * The cached value of the '{@link #getATTRIBUTEVALUES() <em>ATTRIBUTEVALUES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getATTRIBUTEVALUES()
	 * @generated
	 * @ordered
	 */
	protected ATTRIBUTEVALUESType aTTRIBUTEVALUES;

	/**
	 * The cached value of the '{@link #getDATATYPEDEFINITIONS() <em>DATATYPEDEFINITIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPEDEFINITIONS()
	 * @generated
	 * @ordered
	 */
	protected DATATYPEDEFINITIONSType dATATYPEDEFINITIONS;

	/**
	 * The cached value of the '{@link #getRELATIONGROUPS() <em>RELATIONGROUPS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRELATIONGROUPS()
	 * @generated
	 * @ordered
	 */
	protected RELATIONGROUPSType1 rELATIONGROUPS;

	/**
	 * The cached value of the '{@link #getSPECGROUPS() <em>SPECGROUPS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECGROUPS()
	 * @generated
	 * @ordered
	 */
	protected SPECGROUPSType1 sPECGROUPS;

	/**
	 * The cached value of the '{@link #getSPECHIERARCHIES() <em>SPECHIERARCHIES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECHIERARCHIES()
	 * @generated
	 * @ordered
	 */
	protected SPECHIERARCHIESType sPECHIERARCHIES;

	/**
	 * The cached value of the '{@link #getSPECHIERARCHYROOTS() <em>SPECHIERARCHYROOTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECHIERARCHYROOTS()
	 * @generated
	 * @ordered
	 */
	protected SPECHIERARCHYROOTSType1 sPECHIERARCHYROOTS;

	/**
	 * The cached value of the '{@link #getSPECOBJECTS() <em>SPECOBJECTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECOBJECTS()
	 * @generated
	 * @ordered
	 */
	protected SPECOBJECTSType1 sPECOBJECTS;

	/**
	 * The cached value of the '{@link #getSPECRELATIONS() <em>SPECRELATIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECRELATIONS()
	 * @generated
	 * @ordered
	 */
	protected SPECRELATIONSType sPECRELATIONS;

	/**
	 * The cached value of the '{@link #getSPECTYPES() <em>SPECTYPES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECTYPES()
	 * @generated
	 * @ordered
	 */
	protected SPECTYPESType1 sPECTYPES;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ACCESSPOLICYImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.ACCESSPOLICY;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__DESC, oldDESC, dESC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__IDENTIFIER, oldIDENTIFIER, iDENTIFIER));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__LASTCHANGE, oldLASTCHANGE, lASTCHANGE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__LONGNAME, oldLONGNAME, lONGNAME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACCESSPOLICYACCESSMODEENUM getACCESSMODE() {
		return aCCESSMODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACCESSMODE(ACCESSPOLICYACCESSMODEENUM newACCESSMODE) {
		ACCESSPOLICYACCESSMODEENUM oldACCESSMODE = aCCESSMODE;
		aCCESSMODE = newACCESSMODE == null ? ACCESSMODE_EDEFAULT : newACCESSMODE;
		boolean oldACCESSMODEESet = aCCESSMODEESet;
		aCCESSMODEESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__ACCESSMODE, oldACCESSMODE, aCCESSMODE, !oldACCESSMODEESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetACCESSMODE() {
		ACCESSPOLICYACCESSMODEENUM oldACCESSMODE = aCCESSMODE;
		boolean oldACCESSMODEESet = aCCESSMODEESet;
		aCCESSMODE = ACCESSMODE_EDEFAULT;
		aCCESSMODEESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, RifPackage.ACCESSPOLICY__ACCESSMODE, oldACCESSMODE, ACCESSMODE_EDEFAULT, oldACCESSMODEESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetACCESSMODE() {
		return aCCESSMODEESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEDEFINITIONSType getATTRIBUTEDEFINITIONS() {
		return aTTRIBUTEDEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATTRIBUTEDEFINITIONS(ATTRIBUTEDEFINITIONSType newATTRIBUTEDEFINITIONS, NotificationChain msgs) {
		ATTRIBUTEDEFINITIONSType oldATTRIBUTEDEFINITIONS = aTTRIBUTEDEFINITIONS;
		aTTRIBUTEDEFINITIONS = newATTRIBUTEDEFINITIONS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__ATTRIBUTEDEFINITIONS, oldATTRIBUTEDEFINITIONS, newATTRIBUTEDEFINITIONS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEDEFINITIONS(ATTRIBUTEDEFINITIONSType newATTRIBUTEDEFINITIONS) {
		if (newATTRIBUTEDEFINITIONS != aTTRIBUTEDEFINITIONS) {
			NotificationChain msgs = null;
			if (aTTRIBUTEDEFINITIONS != null)
				msgs = ((InternalEObject)aTTRIBUTEDEFINITIONS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__ATTRIBUTEDEFINITIONS, null, msgs);
			if (newATTRIBUTEDEFINITIONS != null)
				msgs = ((InternalEObject)newATTRIBUTEDEFINITIONS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__ATTRIBUTEDEFINITIONS, null, msgs);
			msgs = basicSetATTRIBUTEDEFINITIONS(newATTRIBUTEDEFINITIONS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__ATTRIBUTEDEFINITIONS, newATTRIBUTEDEFINITIONS, newATTRIBUTEDEFINITIONS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ATTRIBUTEVALUESType getATTRIBUTEVALUES() {
		return aTTRIBUTEVALUES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetATTRIBUTEVALUES(ATTRIBUTEVALUESType newATTRIBUTEVALUES, NotificationChain msgs) {
		ATTRIBUTEVALUESType oldATTRIBUTEVALUES = aTTRIBUTEVALUES;
		aTTRIBUTEVALUES = newATTRIBUTEVALUES;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__ATTRIBUTEVALUES, oldATTRIBUTEVALUES, newATTRIBUTEVALUES);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setATTRIBUTEVALUES(ATTRIBUTEVALUESType newATTRIBUTEVALUES) {
		if (newATTRIBUTEVALUES != aTTRIBUTEVALUES) {
			NotificationChain msgs = null;
			if (aTTRIBUTEVALUES != null)
				msgs = ((InternalEObject)aTTRIBUTEVALUES).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__ATTRIBUTEVALUES, null, msgs);
			if (newATTRIBUTEVALUES != null)
				msgs = ((InternalEObject)newATTRIBUTEVALUES).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__ATTRIBUTEVALUES, null, msgs);
			msgs = basicSetATTRIBUTEVALUES(newATTRIBUTEVALUES, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__ATTRIBUTEVALUES, newATTRIBUTEVALUES, newATTRIBUTEVALUES));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPEDEFINITIONSType getDATATYPEDEFINITIONS() {
		return dATATYPEDEFINITIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDATATYPEDEFINITIONS(DATATYPEDEFINITIONSType newDATATYPEDEFINITIONS, NotificationChain msgs) {
		DATATYPEDEFINITIONSType oldDATATYPEDEFINITIONS = dATATYPEDEFINITIONS;
		dATATYPEDEFINITIONS = newDATATYPEDEFINITIONS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__DATATYPEDEFINITIONS, oldDATATYPEDEFINITIONS, newDATATYPEDEFINITIONS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPEDEFINITIONS(DATATYPEDEFINITIONSType newDATATYPEDEFINITIONS) {
		if (newDATATYPEDEFINITIONS != dATATYPEDEFINITIONS) {
			NotificationChain msgs = null;
			if (dATATYPEDEFINITIONS != null)
				msgs = ((InternalEObject)dATATYPEDEFINITIONS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__DATATYPEDEFINITIONS, null, msgs);
			if (newDATATYPEDEFINITIONS != null)
				msgs = ((InternalEObject)newDATATYPEDEFINITIONS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__DATATYPEDEFINITIONS, null, msgs);
			msgs = basicSetDATATYPEDEFINITIONS(newDATATYPEDEFINITIONS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__DATATYPEDEFINITIONS, newDATATYPEDEFINITIONS, newDATATYPEDEFINITIONS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RELATIONGROUPSType1 getRELATIONGROUPS() {
		return rELATIONGROUPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRELATIONGROUPS(RELATIONGROUPSType1 newRELATIONGROUPS, NotificationChain msgs) {
		RELATIONGROUPSType1 oldRELATIONGROUPS = rELATIONGROUPS;
		rELATIONGROUPS = newRELATIONGROUPS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__RELATIONGROUPS, oldRELATIONGROUPS, newRELATIONGROUPS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRELATIONGROUPS(RELATIONGROUPSType1 newRELATIONGROUPS) {
		if (newRELATIONGROUPS != rELATIONGROUPS) {
			NotificationChain msgs = null;
			if (rELATIONGROUPS != null)
				msgs = ((InternalEObject)rELATIONGROUPS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__RELATIONGROUPS, null, msgs);
			if (newRELATIONGROUPS != null)
				msgs = ((InternalEObject)newRELATIONGROUPS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__RELATIONGROUPS, null, msgs);
			msgs = basicSetRELATIONGROUPS(newRELATIONGROUPS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__RELATIONGROUPS, newRELATIONGROUPS, newRELATIONGROUPS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECGROUPSType1 getSPECGROUPS() {
		return sPECGROUPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECGROUPS(SPECGROUPSType1 newSPECGROUPS, NotificationChain msgs) {
		SPECGROUPSType1 oldSPECGROUPS = sPECGROUPS;
		sPECGROUPS = newSPECGROUPS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__SPECGROUPS, oldSPECGROUPS, newSPECGROUPS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECGROUPS(SPECGROUPSType1 newSPECGROUPS) {
		if (newSPECGROUPS != sPECGROUPS) {
			NotificationChain msgs = null;
			if (sPECGROUPS != null)
				msgs = ((InternalEObject)sPECGROUPS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__SPECGROUPS, null, msgs);
			if (newSPECGROUPS != null)
				msgs = ((InternalEObject)newSPECGROUPS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__SPECGROUPS, null, msgs);
			msgs = basicSetSPECGROUPS(newSPECGROUPS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__SPECGROUPS, newSPECGROUPS, newSPECGROUPS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECHIERARCHIESType getSPECHIERARCHIES() {
		return sPECHIERARCHIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECHIERARCHIES(SPECHIERARCHIESType newSPECHIERARCHIES, NotificationChain msgs) {
		SPECHIERARCHIESType oldSPECHIERARCHIES = sPECHIERARCHIES;
		sPECHIERARCHIES = newSPECHIERARCHIES;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__SPECHIERARCHIES, oldSPECHIERARCHIES, newSPECHIERARCHIES);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECHIERARCHIES(SPECHIERARCHIESType newSPECHIERARCHIES) {
		if (newSPECHIERARCHIES != sPECHIERARCHIES) {
			NotificationChain msgs = null;
			if (sPECHIERARCHIES != null)
				msgs = ((InternalEObject)sPECHIERARCHIES).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__SPECHIERARCHIES, null, msgs);
			if (newSPECHIERARCHIES != null)
				msgs = ((InternalEObject)newSPECHIERARCHIES).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__SPECHIERARCHIES, null, msgs);
			msgs = basicSetSPECHIERARCHIES(newSPECHIERARCHIES, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__SPECHIERARCHIES, newSPECHIERARCHIES, newSPECHIERARCHIES));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECHIERARCHYROOTSType1 getSPECHIERARCHYROOTS() {
		return sPECHIERARCHYROOTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECHIERARCHYROOTS(SPECHIERARCHYROOTSType1 newSPECHIERARCHYROOTS, NotificationChain msgs) {
		SPECHIERARCHYROOTSType1 oldSPECHIERARCHYROOTS = sPECHIERARCHYROOTS;
		sPECHIERARCHYROOTS = newSPECHIERARCHYROOTS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__SPECHIERARCHYROOTS, oldSPECHIERARCHYROOTS, newSPECHIERARCHYROOTS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECHIERARCHYROOTS(SPECHIERARCHYROOTSType1 newSPECHIERARCHYROOTS) {
		if (newSPECHIERARCHYROOTS != sPECHIERARCHYROOTS) {
			NotificationChain msgs = null;
			if (sPECHIERARCHYROOTS != null)
				msgs = ((InternalEObject)sPECHIERARCHYROOTS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__SPECHIERARCHYROOTS, null, msgs);
			if (newSPECHIERARCHYROOTS != null)
				msgs = ((InternalEObject)newSPECHIERARCHYROOTS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__SPECHIERARCHYROOTS, null, msgs);
			msgs = basicSetSPECHIERARCHYROOTS(newSPECHIERARCHYROOTS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__SPECHIERARCHYROOTS, newSPECHIERARCHYROOTS, newSPECHIERARCHYROOTS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECOBJECTSType1 getSPECOBJECTS() {
		return sPECOBJECTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECOBJECTS(SPECOBJECTSType1 newSPECOBJECTS, NotificationChain msgs) {
		SPECOBJECTSType1 oldSPECOBJECTS = sPECOBJECTS;
		sPECOBJECTS = newSPECOBJECTS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__SPECOBJECTS, oldSPECOBJECTS, newSPECOBJECTS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECOBJECTS(SPECOBJECTSType1 newSPECOBJECTS) {
		if (newSPECOBJECTS != sPECOBJECTS) {
			NotificationChain msgs = null;
			if (sPECOBJECTS != null)
				msgs = ((InternalEObject)sPECOBJECTS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__SPECOBJECTS, null, msgs);
			if (newSPECOBJECTS != null)
				msgs = ((InternalEObject)newSPECOBJECTS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__SPECOBJECTS, null, msgs);
			msgs = basicSetSPECOBJECTS(newSPECOBJECTS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__SPECOBJECTS, newSPECOBJECTS, newSPECOBJECTS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECRELATIONSType getSPECRELATIONS() {
		return sPECRELATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECRELATIONS(SPECRELATIONSType newSPECRELATIONS, NotificationChain msgs) {
		SPECRELATIONSType oldSPECRELATIONS = sPECRELATIONS;
		sPECRELATIONS = newSPECRELATIONS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__SPECRELATIONS, oldSPECRELATIONS, newSPECRELATIONS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECRELATIONS(SPECRELATIONSType newSPECRELATIONS) {
		if (newSPECRELATIONS != sPECRELATIONS) {
			NotificationChain msgs = null;
			if (sPECRELATIONS != null)
				msgs = ((InternalEObject)sPECRELATIONS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__SPECRELATIONS, null, msgs);
			if (newSPECRELATIONS != null)
				msgs = ((InternalEObject)newSPECRELATIONS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__SPECRELATIONS, null, msgs);
			msgs = basicSetSPECRELATIONS(newSPECRELATIONS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__SPECRELATIONS, newSPECRELATIONS, newSPECRELATIONS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECTYPESType1 getSPECTYPES() {
		return sPECTYPES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECTYPES(SPECTYPESType1 newSPECTYPES, NotificationChain msgs) {
		SPECTYPESType1 oldSPECTYPES = sPECTYPES;
		sPECTYPES = newSPECTYPES;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__SPECTYPES, oldSPECTYPES, newSPECTYPES);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECTYPES(SPECTYPESType1 newSPECTYPES) {
		if (newSPECTYPES != sPECTYPES) {
			NotificationChain msgs = null;
			if (sPECTYPES != null)
				msgs = ((InternalEObject)sPECTYPES).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__SPECTYPES, null, msgs);
			if (newSPECTYPES != null)
				msgs = ((InternalEObject)newSPECTYPES).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.ACCESSPOLICY__SPECTYPES, null, msgs);
			msgs = basicSetSPECTYPES(newSPECTYPES, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.ACCESSPOLICY__SPECTYPES, newSPECTYPES, newSPECTYPES));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.ACCESSPOLICY__ATTRIBUTEDEFINITIONS:
				return basicSetATTRIBUTEDEFINITIONS(null, msgs);
			case RifPackage.ACCESSPOLICY__ATTRIBUTEVALUES:
				return basicSetATTRIBUTEVALUES(null, msgs);
			case RifPackage.ACCESSPOLICY__DATATYPEDEFINITIONS:
				return basicSetDATATYPEDEFINITIONS(null, msgs);
			case RifPackage.ACCESSPOLICY__RELATIONGROUPS:
				return basicSetRELATIONGROUPS(null, msgs);
			case RifPackage.ACCESSPOLICY__SPECGROUPS:
				return basicSetSPECGROUPS(null, msgs);
			case RifPackage.ACCESSPOLICY__SPECHIERARCHIES:
				return basicSetSPECHIERARCHIES(null, msgs);
			case RifPackage.ACCESSPOLICY__SPECHIERARCHYROOTS:
				return basicSetSPECHIERARCHYROOTS(null, msgs);
			case RifPackage.ACCESSPOLICY__SPECOBJECTS:
				return basicSetSPECOBJECTS(null, msgs);
			case RifPackage.ACCESSPOLICY__SPECRELATIONS:
				return basicSetSPECRELATIONS(null, msgs);
			case RifPackage.ACCESSPOLICY__SPECTYPES:
				return basicSetSPECTYPES(null, msgs);
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
			case RifPackage.ACCESSPOLICY__DESC:
				return getDESC();
			case RifPackage.ACCESSPOLICY__IDENTIFIER:
				return getIDENTIFIER();
			case RifPackage.ACCESSPOLICY__LASTCHANGE:
				return getLASTCHANGE();
			case RifPackage.ACCESSPOLICY__LONGNAME:
				return getLONGNAME();
			case RifPackage.ACCESSPOLICY__ACCESSMODE:
				return getACCESSMODE();
			case RifPackage.ACCESSPOLICY__ATTRIBUTEDEFINITIONS:
				return getATTRIBUTEDEFINITIONS();
			case RifPackage.ACCESSPOLICY__ATTRIBUTEVALUES:
				return getATTRIBUTEVALUES();
			case RifPackage.ACCESSPOLICY__DATATYPEDEFINITIONS:
				return getDATATYPEDEFINITIONS();
			case RifPackage.ACCESSPOLICY__RELATIONGROUPS:
				return getRELATIONGROUPS();
			case RifPackage.ACCESSPOLICY__SPECGROUPS:
				return getSPECGROUPS();
			case RifPackage.ACCESSPOLICY__SPECHIERARCHIES:
				return getSPECHIERARCHIES();
			case RifPackage.ACCESSPOLICY__SPECHIERARCHYROOTS:
				return getSPECHIERARCHYROOTS();
			case RifPackage.ACCESSPOLICY__SPECOBJECTS:
				return getSPECOBJECTS();
			case RifPackage.ACCESSPOLICY__SPECRELATIONS:
				return getSPECRELATIONS();
			case RifPackage.ACCESSPOLICY__SPECTYPES:
				return getSPECTYPES();
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
			case RifPackage.ACCESSPOLICY__DESC:
				setDESC((String)newValue);
				return;
			case RifPackage.ACCESSPOLICY__IDENTIFIER:
				setIDENTIFIER((String)newValue);
				return;
			case RifPackage.ACCESSPOLICY__LASTCHANGE:
				setLASTCHANGE((XMLGregorianCalendar)newValue);
				return;
			case RifPackage.ACCESSPOLICY__LONGNAME:
				setLONGNAME((String)newValue);
				return;
			case RifPackage.ACCESSPOLICY__ACCESSMODE:
				setACCESSMODE((ACCESSPOLICYACCESSMODEENUM)newValue);
				return;
			case RifPackage.ACCESSPOLICY__ATTRIBUTEDEFINITIONS:
				setATTRIBUTEDEFINITIONS((ATTRIBUTEDEFINITIONSType)newValue);
				return;
			case RifPackage.ACCESSPOLICY__ATTRIBUTEVALUES:
				setATTRIBUTEVALUES((ATTRIBUTEVALUESType)newValue);
				return;
			case RifPackage.ACCESSPOLICY__DATATYPEDEFINITIONS:
				setDATATYPEDEFINITIONS((DATATYPEDEFINITIONSType)newValue);
				return;
			case RifPackage.ACCESSPOLICY__RELATIONGROUPS:
				setRELATIONGROUPS((RELATIONGROUPSType1)newValue);
				return;
			case RifPackage.ACCESSPOLICY__SPECGROUPS:
				setSPECGROUPS((SPECGROUPSType1)newValue);
				return;
			case RifPackage.ACCESSPOLICY__SPECHIERARCHIES:
				setSPECHIERARCHIES((SPECHIERARCHIESType)newValue);
				return;
			case RifPackage.ACCESSPOLICY__SPECHIERARCHYROOTS:
				setSPECHIERARCHYROOTS((SPECHIERARCHYROOTSType1)newValue);
				return;
			case RifPackage.ACCESSPOLICY__SPECOBJECTS:
				setSPECOBJECTS((SPECOBJECTSType1)newValue);
				return;
			case RifPackage.ACCESSPOLICY__SPECRELATIONS:
				setSPECRELATIONS((SPECRELATIONSType)newValue);
				return;
			case RifPackage.ACCESSPOLICY__SPECTYPES:
				setSPECTYPES((SPECTYPESType1)newValue);
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
			case RifPackage.ACCESSPOLICY__DESC:
				setDESC(DESC_EDEFAULT);
				return;
			case RifPackage.ACCESSPOLICY__IDENTIFIER:
				setIDENTIFIER(IDENTIFIER_EDEFAULT);
				return;
			case RifPackage.ACCESSPOLICY__LASTCHANGE:
				setLASTCHANGE(LASTCHANGE_EDEFAULT);
				return;
			case RifPackage.ACCESSPOLICY__LONGNAME:
				setLONGNAME(LONGNAME_EDEFAULT);
				return;
			case RifPackage.ACCESSPOLICY__ACCESSMODE:
				unsetACCESSMODE();
				return;
			case RifPackage.ACCESSPOLICY__ATTRIBUTEDEFINITIONS:
				setATTRIBUTEDEFINITIONS((ATTRIBUTEDEFINITIONSType)null);
				return;
			case RifPackage.ACCESSPOLICY__ATTRIBUTEVALUES:
				setATTRIBUTEVALUES((ATTRIBUTEVALUESType)null);
				return;
			case RifPackage.ACCESSPOLICY__DATATYPEDEFINITIONS:
				setDATATYPEDEFINITIONS((DATATYPEDEFINITIONSType)null);
				return;
			case RifPackage.ACCESSPOLICY__RELATIONGROUPS:
				setRELATIONGROUPS((RELATIONGROUPSType1)null);
				return;
			case RifPackage.ACCESSPOLICY__SPECGROUPS:
				setSPECGROUPS((SPECGROUPSType1)null);
				return;
			case RifPackage.ACCESSPOLICY__SPECHIERARCHIES:
				setSPECHIERARCHIES((SPECHIERARCHIESType)null);
				return;
			case RifPackage.ACCESSPOLICY__SPECHIERARCHYROOTS:
				setSPECHIERARCHYROOTS((SPECHIERARCHYROOTSType1)null);
				return;
			case RifPackage.ACCESSPOLICY__SPECOBJECTS:
				setSPECOBJECTS((SPECOBJECTSType1)null);
				return;
			case RifPackage.ACCESSPOLICY__SPECRELATIONS:
				setSPECRELATIONS((SPECRELATIONSType)null);
				return;
			case RifPackage.ACCESSPOLICY__SPECTYPES:
				setSPECTYPES((SPECTYPESType1)null);
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
			case RifPackage.ACCESSPOLICY__DESC:
				return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals(dESC);
			case RifPackage.ACCESSPOLICY__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
			case RifPackage.ACCESSPOLICY__LASTCHANGE:
				return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
			case RifPackage.ACCESSPOLICY__LONGNAME:
				return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals(lONGNAME);
			case RifPackage.ACCESSPOLICY__ACCESSMODE:
				return isSetACCESSMODE();
			case RifPackage.ACCESSPOLICY__ATTRIBUTEDEFINITIONS:
				return aTTRIBUTEDEFINITIONS != null;
			case RifPackage.ACCESSPOLICY__ATTRIBUTEVALUES:
				return aTTRIBUTEVALUES != null;
			case RifPackage.ACCESSPOLICY__DATATYPEDEFINITIONS:
				return dATATYPEDEFINITIONS != null;
			case RifPackage.ACCESSPOLICY__RELATIONGROUPS:
				return rELATIONGROUPS != null;
			case RifPackage.ACCESSPOLICY__SPECGROUPS:
				return sPECGROUPS != null;
			case RifPackage.ACCESSPOLICY__SPECHIERARCHIES:
				return sPECHIERARCHIES != null;
			case RifPackage.ACCESSPOLICY__SPECHIERARCHYROOTS:
				return sPECHIERARCHYROOTS != null;
			case RifPackage.ACCESSPOLICY__SPECOBJECTS:
				return sPECOBJECTS != null;
			case RifPackage.ACCESSPOLICY__SPECRELATIONS:
				return sPECRELATIONS != null;
			case RifPackage.ACCESSPOLICY__SPECTYPES:
				return sPECTYPES != null;
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
		result.append(", aCCESSMODE: ");
		if (aCCESSMODEESet) result.append(aCCESSMODE); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ACCESSPOLICYImpl
