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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.rmf.tests.serialization.env.emf.myreqif.DATATYPESType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.MyreqifPackage;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.REQIFCONTENT;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECIFICATIONSType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECOBJECTSType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONGROUPSType;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECRELATIONSType1;
import org.eclipse.rmf.tests.serialization.env.emf.myreqif.SPECTYPESType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>REQIFCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFCONTENTImpl#getDATATYPES <em>DATATYPES</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFCONTENTImpl#getSPECTYPES <em>SPECTYPES</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFCONTENTImpl#getSPECOBJECTS <em>SPECOBJECTS</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFCONTENTImpl#getSPECRELATIONS <em>SPECRELATIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFCONTENTImpl#getSPECIFICATIONS <em>SPECIFICATIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.tests.serialization.env.emf.myreqif.impl.REQIFCONTENTImpl#getSPECRELATIONGROUPS <em>SPECRELATIONGROUPS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class REQIFCONTENTImpl extends EObjectImpl implements REQIFCONTENT {
	/**
	 * The cached value of the '{@link #getDATATYPES() <em>DATATYPES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDATATYPES()
	 * @generated
	 * @ordered
	 */
	protected DATATYPESType dATATYPES;

	/**
	 * The cached value of the '{@link #getSPECTYPES() <em>SPECTYPES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECTYPES()
	 * @generated
	 * @ordered
	 */
	protected SPECTYPESType sPECTYPES;

	/**
	 * The cached value of the '{@link #getSPECOBJECTS() <em>SPECOBJECTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECOBJECTS()
	 * @generated
	 * @ordered
	 */
	protected SPECOBJECTSType sPECOBJECTS;

	/**
	 * The cached value of the '{@link #getSPECRELATIONS() <em>SPECRELATIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECRELATIONS()
	 * @generated
	 * @ordered
	 */
	protected SPECRELATIONSType1 sPECRELATIONS;

	/**
	 * The cached value of the '{@link #getSPECIFICATIONS() <em>SPECIFICATIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECIFICATIONS()
	 * @generated
	 * @ordered
	 */
	protected SPECIFICATIONSType sPECIFICATIONS;

	/**
	 * The cached value of the '{@link #getSPECRELATIONGROUPS() <em>SPECRELATIONGROUPS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECRELATIONGROUPS()
	 * @generated
	 * @ordered
	 */
	protected SPECRELATIONGROUPSType sPECRELATIONGROUPS;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REQIFCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MyreqifPackage.Literals.REQIFCONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DATATYPESType getDATATYPES() {
		return dATATYPES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDATATYPES(DATATYPESType newDATATYPES, NotificationChain msgs) {
		DATATYPESType oldDATATYPES = dATATYPES;
		dATATYPES = newDATATYPES;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFCONTENT__DATATYPES, oldDATATYPES, newDATATYPES);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDATATYPES(DATATYPESType newDATATYPES) {
		if (newDATATYPES != dATATYPES) {
			NotificationChain msgs = null;
			if (dATATYPES != null)
				msgs = ((InternalEObject)dATATYPES).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.REQIFCONTENT__DATATYPES, null, msgs);
			if (newDATATYPES != null)
				msgs = ((InternalEObject)newDATATYPES).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.REQIFCONTENT__DATATYPES, null, msgs);
			msgs = basicSetDATATYPES(newDATATYPES, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFCONTENT__DATATYPES, newDATATYPES, newDATATYPES));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECTYPESType getSPECTYPES() {
		return sPECTYPES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECTYPES(SPECTYPESType newSPECTYPES, NotificationChain msgs) {
		SPECTYPESType oldSPECTYPES = sPECTYPES;
		sPECTYPES = newSPECTYPES;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFCONTENT__SPECTYPES, oldSPECTYPES, newSPECTYPES);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECTYPES(SPECTYPESType newSPECTYPES) {
		if (newSPECTYPES != sPECTYPES) {
			NotificationChain msgs = null;
			if (sPECTYPES != null)
				msgs = ((InternalEObject)sPECTYPES).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.REQIFCONTENT__SPECTYPES, null, msgs);
			if (newSPECTYPES != null)
				msgs = ((InternalEObject)newSPECTYPES).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.REQIFCONTENT__SPECTYPES, null, msgs);
			msgs = basicSetSPECTYPES(newSPECTYPES, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFCONTENT__SPECTYPES, newSPECTYPES, newSPECTYPES));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECOBJECTSType getSPECOBJECTS() {
		return sPECOBJECTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECOBJECTS(SPECOBJECTSType newSPECOBJECTS, NotificationChain msgs) {
		SPECOBJECTSType oldSPECOBJECTS = sPECOBJECTS;
		sPECOBJECTS = newSPECOBJECTS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFCONTENT__SPECOBJECTS, oldSPECOBJECTS, newSPECOBJECTS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECOBJECTS(SPECOBJECTSType newSPECOBJECTS) {
		if (newSPECOBJECTS != sPECOBJECTS) {
			NotificationChain msgs = null;
			if (sPECOBJECTS != null)
				msgs = ((InternalEObject)sPECOBJECTS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.REQIFCONTENT__SPECOBJECTS, null, msgs);
			if (newSPECOBJECTS != null)
				msgs = ((InternalEObject)newSPECOBJECTS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.REQIFCONTENT__SPECOBJECTS, null, msgs);
			msgs = basicSetSPECOBJECTS(newSPECOBJECTS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFCONTENT__SPECOBJECTS, newSPECOBJECTS, newSPECOBJECTS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECRELATIONSType1 getSPECRELATIONS() {
		return sPECRELATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECRELATIONS(SPECRELATIONSType1 newSPECRELATIONS, NotificationChain msgs) {
		SPECRELATIONSType1 oldSPECRELATIONS = sPECRELATIONS;
		sPECRELATIONS = newSPECRELATIONS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFCONTENT__SPECRELATIONS, oldSPECRELATIONS, newSPECRELATIONS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECRELATIONS(SPECRELATIONSType1 newSPECRELATIONS) {
		if (newSPECRELATIONS != sPECRELATIONS) {
			NotificationChain msgs = null;
			if (sPECRELATIONS != null)
				msgs = ((InternalEObject)sPECRELATIONS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.REQIFCONTENT__SPECRELATIONS, null, msgs);
			if (newSPECRELATIONS != null)
				msgs = ((InternalEObject)newSPECRELATIONS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.REQIFCONTENT__SPECRELATIONS, null, msgs);
			msgs = basicSetSPECRELATIONS(newSPECRELATIONS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFCONTENT__SPECRELATIONS, newSPECRELATIONS, newSPECRELATIONS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECIFICATIONSType getSPECIFICATIONS() {
		return sPECIFICATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECIFICATIONS(SPECIFICATIONSType newSPECIFICATIONS, NotificationChain msgs) {
		SPECIFICATIONSType oldSPECIFICATIONS = sPECIFICATIONS;
		sPECIFICATIONS = newSPECIFICATIONS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFCONTENT__SPECIFICATIONS, oldSPECIFICATIONS, newSPECIFICATIONS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECIFICATIONS(SPECIFICATIONSType newSPECIFICATIONS) {
		if (newSPECIFICATIONS != sPECIFICATIONS) {
			NotificationChain msgs = null;
			if (sPECIFICATIONS != null)
				msgs = ((InternalEObject)sPECIFICATIONS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.REQIFCONTENT__SPECIFICATIONS, null, msgs);
			if (newSPECIFICATIONS != null)
				msgs = ((InternalEObject)newSPECIFICATIONS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.REQIFCONTENT__SPECIFICATIONS, null, msgs);
			msgs = basicSetSPECIFICATIONS(newSPECIFICATIONS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFCONTENT__SPECIFICATIONS, newSPECIFICATIONS, newSPECIFICATIONS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECRELATIONGROUPSType getSPECRELATIONGROUPS() {
		return sPECRELATIONGROUPS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECRELATIONGROUPS(SPECRELATIONGROUPSType newSPECRELATIONGROUPS, NotificationChain msgs) {
		SPECRELATIONGROUPSType oldSPECRELATIONGROUPS = sPECRELATIONGROUPS;
		sPECRELATIONGROUPS = newSPECRELATIONGROUPS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFCONTENT__SPECRELATIONGROUPS, oldSPECRELATIONGROUPS, newSPECRELATIONGROUPS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECRELATIONGROUPS(SPECRELATIONGROUPSType newSPECRELATIONGROUPS) {
		if (newSPECRELATIONGROUPS != sPECRELATIONGROUPS) {
			NotificationChain msgs = null;
			if (sPECRELATIONGROUPS != null)
				msgs = ((InternalEObject)sPECRELATIONGROUPS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.REQIFCONTENT__SPECRELATIONGROUPS, null, msgs);
			if (newSPECRELATIONGROUPS != null)
				msgs = ((InternalEObject)newSPECRELATIONGROUPS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyreqifPackage.REQIFCONTENT__SPECRELATIONGROUPS, null, msgs);
			msgs = basicSetSPECRELATIONGROUPS(newSPECRELATIONGROUPS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MyreqifPackage.REQIFCONTENT__SPECRELATIONGROUPS, newSPECRELATIONGROUPS, newSPECRELATIONGROUPS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MyreqifPackage.REQIFCONTENT__DATATYPES:
				return basicSetDATATYPES(null, msgs);
			case MyreqifPackage.REQIFCONTENT__SPECTYPES:
				return basicSetSPECTYPES(null, msgs);
			case MyreqifPackage.REQIFCONTENT__SPECOBJECTS:
				return basicSetSPECOBJECTS(null, msgs);
			case MyreqifPackage.REQIFCONTENT__SPECRELATIONS:
				return basicSetSPECRELATIONS(null, msgs);
			case MyreqifPackage.REQIFCONTENT__SPECIFICATIONS:
				return basicSetSPECIFICATIONS(null, msgs);
			case MyreqifPackage.REQIFCONTENT__SPECRELATIONGROUPS:
				return basicSetSPECRELATIONGROUPS(null, msgs);
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
			case MyreqifPackage.REQIFCONTENT__DATATYPES:
				return getDATATYPES();
			case MyreqifPackage.REQIFCONTENT__SPECTYPES:
				return getSPECTYPES();
			case MyreqifPackage.REQIFCONTENT__SPECOBJECTS:
				return getSPECOBJECTS();
			case MyreqifPackage.REQIFCONTENT__SPECRELATIONS:
				return getSPECRELATIONS();
			case MyreqifPackage.REQIFCONTENT__SPECIFICATIONS:
				return getSPECIFICATIONS();
			case MyreqifPackage.REQIFCONTENT__SPECRELATIONGROUPS:
				return getSPECRELATIONGROUPS();
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
			case MyreqifPackage.REQIFCONTENT__DATATYPES:
				setDATATYPES((DATATYPESType)newValue);
				return;
			case MyreqifPackage.REQIFCONTENT__SPECTYPES:
				setSPECTYPES((SPECTYPESType)newValue);
				return;
			case MyreqifPackage.REQIFCONTENT__SPECOBJECTS:
				setSPECOBJECTS((SPECOBJECTSType)newValue);
				return;
			case MyreqifPackage.REQIFCONTENT__SPECRELATIONS:
				setSPECRELATIONS((SPECRELATIONSType1)newValue);
				return;
			case MyreqifPackage.REQIFCONTENT__SPECIFICATIONS:
				setSPECIFICATIONS((SPECIFICATIONSType)newValue);
				return;
			case MyreqifPackage.REQIFCONTENT__SPECRELATIONGROUPS:
				setSPECRELATIONGROUPS((SPECRELATIONGROUPSType)newValue);
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
			case MyreqifPackage.REQIFCONTENT__DATATYPES:
				setDATATYPES((DATATYPESType)null);
				return;
			case MyreqifPackage.REQIFCONTENT__SPECTYPES:
				setSPECTYPES((SPECTYPESType)null);
				return;
			case MyreqifPackage.REQIFCONTENT__SPECOBJECTS:
				setSPECOBJECTS((SPECOBJECTSType)null);
				return;
			case MyreqifPackage.REQIFCONTENT__SPECRELATIONS:
				setSPECRELATIONS((SPECRELATIONSType1)null);
				return;
			case MyreqifPackage.REQIFCONTENT__SPECIFICATIONS:
				setSPECIFICATIONS((SPECIFICATIONSType)null);
				return;
			case MyreqifPackage.REQIFCONTENT__SPECRELATIONGROUPS:
				setSPECRELATIONGROUPS((SPECRELATIONGROUPSType)null);
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
			case MyreqifPackage.REQIFCONTENT__DATATYPES:
				return dATATYPES != null;
			case MyreqifPackage.REQIFCONTENT__SPECTYPES:
				return sPECTYPES != null;
			case MyreqifPackage.REQIFCONTENT__SPECOBJECTS:
				return sPECOBJECTS != null;
			case MyreqifPackage.REQIFCONTENT__SPECRELATIONS:
				return sPECRELATIONS != null;
			case MyreqifPackage.REQIFCONTENT__SPECIFICATIONS:
				return sPECIFICATIONS != null;
			case MyreqifPackage.REQIFCONTENT__SPECRELATIONGROUPS:
				return sPECRELATIONGROUPS != null;
		}
		return super.eIsSet(featureID);
	}

} //REQIFCONTENTImpl
