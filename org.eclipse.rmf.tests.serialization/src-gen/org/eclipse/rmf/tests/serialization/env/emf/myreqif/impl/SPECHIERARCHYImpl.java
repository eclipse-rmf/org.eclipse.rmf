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
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.ALTERNATIVEIDType11;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.CHILDRENType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.EDITABLEATTSType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.OBJECTType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECHIERARCHY;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SPECHIERARCHY</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECHIERARCHYImpl#getALTERNATIVEID <em>ALTERNATIVEID</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECHIERARCHYImpl#getCHILDREN <em>CHILDREN</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECHIERARCHYImpl#getEDITABLEATTS <em>EDITABLEATTS</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECHIERARCHYImpl#getOBJECT <em>OBJECT</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECHIERARCHYImpl#getDESC <em>DESC</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECHIERARCHYImpl#getIDENTIFIER <em>IDENTIFIER</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECHIERARCHYImpl#isISEDITABLE <em>ISEDITABLE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECHIERARCHYImpl#isISTABLEINTERNAL <em>ISTABLEINTERNAL</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECHIERARCHYImpl#getLASTCHANGE <em>LASTCHANGE</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.SPECHIERARCHYImpl#getLONGNAME <em>LONGNAME</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SPECHIERARCHYImpl extends EObjectImpl implements SPECHIERARCHY {
	/**
	 * The cached value of the '{@link #getALTERNATIVEID() <em>ALTERNATIVEID</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getALTERNATIVEID()
	 * @generated
	 * @ordered
	 */
	protected ALTERNATIVEIDType11 aLTERNATIVEID;

	/**
	 * The cached value of the '{@link #getCHILDREN() <em>CHILDREN</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCHILDREN()
	 * @generated
	 * @ordered
	 */
	protected CHILDRENType cHILDREN;

	/**
	 * The cached value of the '{@link #getEDITABLEATTS() <em>EDITABLEATTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEDITABLEATTS()
	 * @generated
	 * @ordered
	 */
	protected EDITABLEATTSType eDITABLEATTS;

	/**
	 * The cached value of the '{@link #getOBJECT() <em>OBJECT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOBJECT()
	 * @generated
	 * @ordered
	 */
	protected OBJECTType oBJECT;

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
	 * The default value of the '{@link #isISEDITABLE() <em>ISEDITABLE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isISEDITABLE()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISEDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isISEDITABLE() <em>ISEDITABLE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isISEDITABLE()
	 * @generated
	 * @ordered
	 */
	protected boolean iSEDITABLE = ISEDITABLE_EDEFAULT;

	/**
	 * This is true if the ISEDITABLE attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iSEDITABLEESet;

	/**
	 * The default value of the '{@link #isISTABLEINTERNAL() <em>ISTABLEINTERNAL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isISTABLEINTERNAL()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ISTABLEINTERNAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isISTABLEINTERNAL() <em>ISTABLEINTERNAL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isISTABLEINTERNAL()
	 * @generated
	 * @ordered
	 */
	protected boolean iSTABLEINTERNAL = ISTABLEINTERNAL_EDEFAULT;

	/**
	 * This is true if the ISTABLEINTERNAL attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iSTABLEINTERNALESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SPECHIERARCHYImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.SPECHIERARCHY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ALTERNATIVEIDType11 getALTERNATIVEID() {
		return aLTERNATIVEID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetALTERNATIVEID(ALTERNATIVEIDType11 newALTERNATIVEID, NotificationChain msgs) {
		ALTERNATIVEIDType11 oldALTERNATIVEID = aLTERNATIVEID;
		aLTERNATIVEID = newALTERNATIVEID;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.SPECHIERARCHY__ALTERNATIVEID, oldALTERNATIVEID, newALTERNATIVEID);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setALTERNATIVEID(ALTERNATIVEIDType11 newALTERNATIVEID) {
		if (newALTERNATIVEID != aLTERNATIVEID) {
			NotificationChain msgs = null;
			if (aLTERNATIVEID != null)
				msgs = ((InternalEObject)aLTERNATIVEID).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.SPECHIERARCHY__ALTERNATIVEID, null, msgs);
			if (newALTERNATIVEID != null)
				msgs = ((InternalEObject)newALTERNATIVEID).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.SPECHIERARCHY__ALTERNATIVEID, null, msgs);
			msgs = basicSetALTERNATIVEID(newALTERNATIVEID, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.SPECHIERARCHY__ALTERNATIVEID, newALTERNATIVEID, newALTERNATIVEID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CHILDRENType getCHILDREN() {
		return cHILDREN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCHILDREN(CHILDRENType newCHILDREN, NotificationChain msgs) {
		CHILDRENType oldCHILDREN = cHILDREN;
		cHILDREN = newCHILDREN;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.SPECHIERARCHY__CHILDREN, oldCHILDREN, newCHILDREN);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCHILDREN(CHILDRENType newCHILDREN) {
		if (newCHILDREN != cHILDREN) {
			NotificationChain msgs = null;
			if (cHILDREN != null)
				msgs = ((InternalEObject)cHILDREN).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.SPECHIERARCHY__CHILDREN, null, msgs);
			if (newCHILDREN != null)
				msgs = ((InternalEObject)newCHILDREN).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.SPECHIERARCHY__CHILDREN, null, msgs);
			msgs = basicSetCHILDREN(newCHILDREN, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.SPECHIERARCHY__CHILDREN, newCHILDREN, newCHILDREN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDITABLEATTSType getEDITABLEATTS() {
		return eDITABLEATTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEDITABLEATTS(EDITABLEATTSType newEDITABLEATTS, NotificationChain msgs) {
		EDITABLEATTSType oldEDITABLEATTS = eDITABLEATTS;
		eDITABLEATTS = newEDITABLEATTS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.SPECHIERARCHY__EDITABLEATTS, oldEDITABLEATTS, newEDITABLEATTS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEDITABLEATTS(EDITABLEATTSType newEDITABLEATTS) {
		if (newEDITABLEATTS != eDITABLEATTS) {
			NotificationChain msgs = null;
			if (eDITABLEATTS != null)
				msgs = ((InternalEObject)eDITABLEATTS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.SPECHIERARCHY__EDITABLEATTS, null, msgs);
			if (newEDITABLEATTS != null)
				msgs = ((InternalEObject)newEDITABLEATTS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.SPECHIERARCHY__EDITABLEATTS, null, msgs);
			msgs = basicSetEDITABLEATTS(newEDITABLEATTS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.SPECHIERARCHY__EDITABLEATTS, newEDITABLEATTS, newEDITABLEATTS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OBJECTType getOBJECT() {
		return oBJECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOBJECT(OBJECTType newOBJECT, NotificationChain msgs) {
		OBJECTType oldOBJECT = oBJECT;
		oBJECT = newOBJECT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.SPECHIERARCHY__OBJECT, oldOBJECT, newOBJECT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOBJECT(OBJECTType newOBJECT) {
		if (newOBJECT != oBJECT) {
			NotificationChain msgs = null;
			if (oBJECT != null)
				msgs = ((InternalEObject)oBJECT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.SPECHIERARCHY__OBJECT, null, msgs);
			if (newOBJECT != null)
				msgs = ((InternalEObject)newOBJECT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.SPECHIERARCHY__OBJECT, null, msgs);
			msgs = basicSetOBJECT(newOBJECT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.SPECHIERARCHY__OBJECT, newOBJECT, newOBJECT));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.SPECHIERARCHY__DESC, oldDESC, dESC));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.SPECHIERARCHY__IDENTIFIER, oldIDENTIFIER, iDENTIFIER));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isISEDITABLE() {
		return iSEDITABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISEDITABLE(boolean newISEDITABLE) {
		boolean oldISEDITABLE = iSEDITABLE;
		iSEDITABLE = newISEDITABLE;
		boolean oldISEDITABLEESet = iSEDITABLEESet;
		iSEDITABLEESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.SPECHIERARCHY__ISEDITABLE, oldISEDITABLE, iSEDITABLE, !oldISEDITABLEESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetISEDITABLE() {
		boolean oldISEDITABLE = iSEDITABLE;
		boolean oldISEDITABLEESet = iSEDITABLEESet;
		iSEDITABLE = ISEDITABLE_EDEFAULT;
		iSEDITABLEESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MyreqifPackage.SPECHIERARCHY__ISEDITABLE, oldISEDITABLE, ISEDITABLE_EDEFAULT, oldISEDITABLEESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetISEDITABLE() {
		return iSEDITABLEESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isISTABLEINTERNAL() {
		return iSTABLEINTERNAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setISTABLEINTERNAL(boolean newISTABLEINTERNAL) {
		boolean oldISTABLEINTERNAL = iSTABLEINTERNAL;
		iSTABLEINTERNAL = newISTABLEINTERNAL;
		boolean oldISTABLEINTERNALESet = iSTABLEINTERNALESet;
		iSTABLEINTERNALESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.SPECHIERARCHY__ISTABLEINTERNAL, oldISTABLEINTERNAL, iSTABLEINTERNAL, !oldISTABLEINTERNALESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetISTABLEINTERNAL() {
		boolean oldISTABLEINTERNAL = iSTABLEINTERNAL;
		boolean oldISTABLEINTERNALESet = iSTABLEINTERNALESet;
		iSTABLEINTERNAL = ISTABLEINTERNAL_EDEFAULT;
		iSTABLEINTERNALESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, MyreqifPackage.SPECHIERARCHY__ISTABLEINTERNAL, oldISTABLEINTERNAL, ISTABLEINTERNAL_EDEFAULT, oldISTABLEINTERNALESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetISTABLEINTERNAL() {
		return iSTABLEINTERNALESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.SPECHIERARCHY__LASTCHANGE, oldLASTCHANGE, lASTCHANGE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.SPECHIERARCHY__LONGNAME, oldLONGNAME, lONGNAME));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyreqifPackage.SPECHIERARCHY__ALTERNATIVEID:
				return basicSetALTERNATIVEID(null, msgs);
			case MyreqifPackage.SPECHIERARCHY__CHILDREN:
				return basicSetCHILDREN(null, msgs);
			case MyreqifPackage.SPECHIERARCHY__EDITABLEATTS:
				return basicSetEDITABLEATTS(null, msgs);
			case MyreqifPackage.SPECHIERARCHY__OBJECT:
				return basicSetOBJECT(null, msgs);
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
			case MyreqifPackage.SPECHIERARCHY__ALTERNATIVEID:
				return getALTERNATIVEID();
			case MyreqifPackage.SPECHIERARCHY__CHILDREN:
				return getCHILDREN();
			case MyreqifPackage.SPECHIERARCHY__EDITABLEATTS:
				return getEDITABLEATTS();
			case MyreqifPackage.SPECHIERARCHY__OBJECT:
				return getOBJECT();
			case MyreqifPackage.SPECHIERARCHY__DESC:
				return getDESC();
			case MyreqifPackage.SPECHIERARCHY__IDENTIFIER:
				return getIDENTIFIER();
			case MyreqifPackage.SPECHIERARCHY__ISEDITABLE:
				return isISEDITABLE();
			case MyreqifPackage.SPECHIERARCHY__ISTABLEINTERNAL:
				return isISTABLEINTERNAL();
			case MyreqifPackage.SPECHIERARCHY__LASTCHANGE:
				return getLASTCHANGE();
			case MyreqifPackage.SPECHIERARCHY__LONGNAME:
				return getLONGNAME();
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
			case MyreqifPackage.SPECHIERARCHY__ALTERNATIVEID:
				setALTERNATIVEID((ALTERNATIVEIDType11)newValue);
				return;
			case MyreqifPackage.SPECHIERARCHY__CHILDREN:
				setCHILDREN((CHILDRENType)newValue);
				return;
			case MyreqifPackage.SPECHIERARCHY__EDITABLEATTS:
				setEDITABLEATTS((EDITABLEATTSType)newValue);
				return;
			case MyreqifPackage.SPECHIERARCHY__OBJECT:
				setOBJECT((OBJECTType)newValue);
				return;
			case MyreqifPackage.SPECHIERARCHY__DESC:
				setDESC((String)newValue);
				return;
			case MyreqifPackage.SPECHIERARCHY__IDENTIFIER:
				setIDENTIFIER((String)newValue);
				return;
			case MyreqifPackage.SPECHIERARCHY__ISEDITABLE:
				setISEDITABLE((Boolean)newValue);
				return;
			case MyreqifPackage.SPECHIERARCHY__ISTABLEINTERNAL:
				setISTABLEINTERNAL((Boolean)newValue);
				return;
			case MyreqifPackage.SPECHIERARCHY__LASTCHANGE:
				setLASTCHANGE((XMLGregorianCalendar)newValue);
				return;
			case MyreqifPackage.SPECHIERARCHY__LONGNAME:
				setLONGNAME((String)newValue);
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
			case MyreqifPackage.SPECHIERARCHY__ALTERNATIVEID:
				setALTERNATIVEID((ALTERNATIVEIDType11)null);
				return;
			case MyreqifPackage.SPECHIERARCHY__CHILDREN:
				setCHILDREN((CHILDRENType)null);
				return;
			case MyreqifPackage.SPECHIERARCHY__EDITABLEATTS:
				setEDITABLEATTS((EDITABLEATTSType)null);
				return;
			case MyreqifPackage.SPECHIERARCHY__OBJECT:
				setOBJECT((OBJECTType)null);
				return;
			case MyreqifPackage.SPECHIERARCHY__DESC:
				setDESC(DESC_EDEFAULT);
				return;
			case MyreqifPackage.SPECHIERARCHY__IDENTIFIER:
				setIDENTIFIER(IDENTIFIER_EDEFAULT);
				return;
			case MyreqifPackage.SPECHIERARCHY__ISEDITABLE:
				unsetISEDITABLE();
				return;
			case MyreqifPackage.SPECHIERARCHY__ISTABLEINTERNAL:
				unsetISTABLEINTERNAL();
				return;
			case MyreqifPackage.SPECHIERARCHY__LASTCHANGE:
				setLASTCHANGE(LASTCHANGE_EDEFAULT);
				return;
			case MyreqifPackage.SPECHIERARCHY__LONGNAME:
				setLONGNAME(LONGNAME_EDEFAULT);
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
			case MyreqifPackage.SPECHIERARCHY__ALTERNATIVEID:
				return aLTERNATIVEID != null;
			case MyreqifPackage.SPECHIERARCHY__CHILDREN:
				return cHILDREN != null;
			case MyreqifPackage.SPECHIERARCHY__EDITABLEATTS:
				return eDITABLEATTS != null;
			case MyreqifPackage.SPECHIERARCHY__OBJECT:
				return oBJECT != null;
			case MyreqifPackage.SPECHIERARCHY__DESC:
				return DESC_EDEFAULT == null ? dESC != null : !DESC_EDEFAULT.equals(dESC);
			case MyreqifPackage.SPECHIERARCHY__IDENTIFIER:
				return IDENTIFIER_EDEFAULT == null ? iDENTIFIER != null : !IDENTIFIER_EDEFAULT.equals(iDENTIFIER);
			case MyreqifPackage.SPECHIERARCHY__ISEDITABLE:
				return isSetISEDITABLE();
			case MyreqifPackage.SPECHIERARCHY__ISTABLEINTERNAL:
				return isSetISTABLEINTERNAL();
			case MyreqifPackage.SPECHIERARCHY__LASTCHANGE:
				return LASTCHANGE_EDEFAULT == null ? lASTCHANGE != null : !LASTCHANGE_EDEFAULT.equals(lASTCHANGE);
			case MyreqifPackage.SPECHIERARCHY__LONGNAME:
				return LONGNAME_EDEFAULT == null ? lONGNAME != null : !LONGNAME_EDEFAULT.equals(lONGNAME);
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
		result.append(", iSEDITABLE: ");
		if (iSEDITABLEESet) result.append(iSEDITABLE); else result.append("<unset>");
		result.append(", iSTABLEINTERNAL: ");
		if (iSTABLEINTERNALESet) result.append(iSTABLEINTERNAL); else result.append("<unset>");
		result.append(", lASTCHANGE: ");
		result.append(lASTCHANGE);
		result.append(", lONGNAME: ");
		result.append(lONGNAME);
		result.append(')');
		return result.toString();
	}

} //SPECHIERARCHYImpl
