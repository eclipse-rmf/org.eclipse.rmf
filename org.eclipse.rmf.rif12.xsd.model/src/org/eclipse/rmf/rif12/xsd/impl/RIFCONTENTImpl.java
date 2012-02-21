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

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.rmf.rif12.xsd.ACCESSPOLICIESType;
import org.eclipse.rmf.rif12.xsd.DATATYPESType;
import org.eclipse.rmf.rif12.xsd.RIFCONTENT;
import org.eclipse.rmf.rif12.xsd.RifPackage;
import org.eclipse.rmf.rif12.xsd.SPECGROUPHIERARCHYROOTSType;
import org.eclipse.rmf.rif12.xsd.SPECGROUPSType1;
import org.eclipse.rmf.rif12.xsd.SPECHIERARCHYROOTSType1;
import org.eclipse.rmf.rif12.xsd.SPECOBJECTSType2;
import org.eclipse.rmf.rif12.xsd.SPECRELATIONSType2;
import org.eclipse.rmf.rif12.xsd.SPECTYPESType1;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>RIFCONTENT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFCONTENTImpl#getDATATYPES <em>DATATYPES</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFCONTENTImpl#getSPECTYPES <em>SPECTYPES</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFCONTENTImpl#getSPECOBJECTS <em>SPECOBJECTS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFCONTENTImpl#getSPECRELATIONS <em>SPECRELATIONS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFCONTENTImpl#getSPECGROUPS <em>SPECGROUPS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFCONTENTImpl#getSPECHIERARCHYROOTS <em>SPECHIERARCHYROOTS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFCONTENTImpl#getSPECGROUPHIERARCHYROOTS <em>SPECGROUPHIERARCHYROOTS</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xsd.impl.RIFCONTENTImpl#getACCESSPOLICIES <em>ACCESSPOLICIES</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RIFCONTENTImpl extends EObjectImpl implements RIFCONTENT {
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
	protected SPECTYPESType1 sPECTYPES;

	/**
	 * The cached value of the '{@link #getSPECOBJECTS() <em>SPECOBJECTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECOBJECTS()
	 * @generated
	 * @ordered
	 */
	protected SPECOBJECTSType2 sPECOBJECTS;

	/**
	 * The cached value of the '{@link #getSPECRELATIONS() <em>SPECRELATIONS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECRELATIONS()
	 * @generated
	 * @ordered
	 */
	protected SPECRELATIONSType2 sPECRELATIONS;

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
	 * The cached value of the '{@link #getSPECHIERARCHYROOTS() <em>SPECHIERARCHYROOTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECHIERARCHYROOTS()
	 * @generated
	 * @ordered
	 */
	protected SPECHIERARCHYROOTSType1 sPECHIERARCHYROOTS;

	/**
	 * The cached value of the '{@link #getSPECGROUPHIERARCHYROOTS() <em>SPECGROUPHIERARCHYROOTS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSPECGROUPHIERARCHYROOTS()
	 * @generated
	 * @ordered
	 */
	protected SPECGROUPHIERARCHYROOTSType sPECGROUPHIERARCHYROOTS;

	/**
	 * The cached value of the '{@link #getACCESSPOLICIES() <em>ACCESSPOLICIES</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getACCESSPOLICIES()
	 * @generated
	 * @ordered
	 */
	protected ACCESSPOLICIESType aCCESSPOLICIES;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RIFCONTENTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RifPackage.Literals.RIFCONTENT;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.RIFCONTENT__DATATYPES, oldDATATYPES, newDATATYPES);
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
				msgs = ((InternalEObject)dATATYPES).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIFCONTENT__DATATYPES, null, msgs);
			if (newDATATYPES != null)
				msgs = ((InternalEObject)newDATATYPES).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIFCONTENT__DATATYPES, null, msgs);
			msgs = basicSetDATATYPES(newDATATYPES, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIFCONTENT__DATATYPES, newDATATYPES, newDATATYPES));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.RIFCONTENT__SPECTYPES, oldSPECTYPES, newSPECTYPES);
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
				msgs = ((InternalEObject)sPECTYPES).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIFCONTENT__SPECTYPES, null, msgs);
			if (newSPECTYPES != null)
				msgs = ((InternalEObject)newSPECTYPES).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIFCONTENT__SPECTYPES, null, msgs);
			msgs = basicSetSPECTYPES(newSPECTYPES, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIFCONTENT__SPECTYPES, newSPECTYPES, newSPECTYPES));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECOBJECTSType2 getSPECOBJECTS() {
		return sPECOBJECTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECOBJECTS(SPECOBJECTSType2 newSPECOBJECTS, NotificationChain msgs) {
		SPECOBJECTSType2 oldSPECOBJECTS = sPECOBJECTS;
		sPECOBJECTS = newSPECOBJECTS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.RIFCONTENT__SPECOBJECTS, oldSPECOBJECTS, newSPECOBJECTS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECOBJECTS(SPECOBJECTSType2 newSPECOBJECTS) {
		if (newSPECOBJECTS != sPECOBJECTS) {
			NotificationChain msgs = null;
			if (sPECOBJECTS != null)
				msgs = ((InternalEObject)sPECOBJECTS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIFCONTENT__SPECOBJECTS, null, msgs);
			if (newSPECOBJECTS != null)
				msgs = ((InternalEObject)newSPECOBJECTS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIFCONTENT__SPECOBJECTS, null, msgs);
			msgs = basicSetSPECOBJECTS(newSPECOBJECTS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIFCONTENT__SPECOBJECTS, newSPECOBJECTS, newSPECOBJECTS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECRELATIONSType2 getSPECRELATIONS() {
		return sPECRELATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECRELATIONS(SPECRELATIONSType2 newSPECRELATIONS, NotificationChain msgs) {
		SPECRELATIONSType2 oldSPECRELATIONS = sPECRELATIONS;
		sPECRELATIONS = newSPECRELATIONS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.RIFCONTENT__SPECRELATIONS, oldSPECRELATIONS, newSPECRELATIONS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECRELATIONS(SPECRELATIONSType2 newSPECRELATIONS) {
		if (newSPECRELATIONS != sPECRELATIONS) {
			NotificationChain msgs = null;
			if (sPECRELATIONS != null)
				msgs = ((InternalEObject)sPECRELATIONS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIFCONTENT__SPECRELATIONS, null, msgs);
			if (newSPECRELATIONS != null)
				msgs = ((InternalEObject)newSPECRELATIONS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIFCONTENT__SPECRELATIONS, null, msgs);
			msgs = basicSetSPECRELATIONS(newSPECRELATIONS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIFCONTENT__SPECRELATIONS, newSPECRELATIONS, newSPECRELATIONS));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.RIFCONTENT__SPECGROUPS, oldSPECGROUPS, newSPECGROUPS);
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
				msgs = ((InternalEObject)sPECGROUPS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIFCONTENT__SPECGROUPS, null, msgs);
			if (newSPECGROUPS != null)
				msgs = ((InternalEObject)newSPECGROUPS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIFCONTENT__SPECGROUPS, null, msgs);
			msgs = basicSetSPECGROUPS(newSPECGROUPS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIFCONTENT__SPECGROUPS, newSPECGROUPS, newSPECGROUPS));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.RIFCONTENT__SPECHIERARCHYROOTS, oldSPECHIERARCHYROOTS, newSPECHIERARCHYROOTS);
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
				msgs = ((InternalEObject)sPECHIERARCHYROOTS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIFCONTENT__SPECHIERARCHYROOTS, null, msgs);
			if (newSPECHIERARCHYROOTS != null)
				msgs = ((InternalEObject)newSPECHIERARCHYROOTS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIFCONTENT__SPECHIERARCHYROOTS, null, msgs);
			msgs = basicSetSPECHIERARCHYROOTS(newSPECHIERARCHYROOTS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIFCONTENT__SPECHIERARCHYROOTS, newSPECHIERARCHYROOTS, newSPECHIERARCHYROOTS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SPECGROUPHIERARCHYROOTSType getSPECGROUPHIERARCHYROOTS() {
		return sPECGROUPHIERARCHYROOTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSPECGROUPHIERARCHYROOTS(SPECGROUPHIERARCHYROOTSType newSPECGROUPHIERARCHYROOTS, NotificationChain msgs) {
		SPECGROUPHIERARCHYROOTSType oldSPECGROUPHIERARCHYROOTS = sPECGROUPHIERARCHYROOTS;
		sPECGROUPHIERARCHYROOTS = newSPECGROUPHIERARCHYROOTS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.RIFCONTENT__SPECGROUPHIERARCHYROOTS, oldSPECGROUPHIERARCHYROOTS, newSPECGROUPHIERARCHYROOTS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSPECGROUPHIERARCHYROOTS(SPECGROUPHIERARCHYROOTSType newSPECGROUPHIERARCHYROOTS) {
		if (newSPECGROUPHIERARCHYROOTS != sPECGROUPHIERARCHYROOTS) {
			NotificationChain msgs = null;
			if (sPECGROUPHIERARCHYROOTS != null)
				msgs = ((InternalEObject)sPECGROUPHIERARCHYROOTS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIFCONTENT__SPECGROUPHIERARCHYROOTS, null, msgs);
			if (newSPECGROUPHIERARCHYROOTS != null)
				msgs = ((InternalEObject)newSPECGROUPHIERARCHYROOTS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIFCONTENT__SPECGROUPHIERARCHYROOTS, null, msgs);
			msgs = basicSetSPECGROUPHIERARCHYROOTS(newSPECGROUPHIERARCHYROOTS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIFCONTENT__SPECGROUPHIERARCHYROOTS, newSPECGROUPHIERARCHYROOTS, newSPECGROUPHIERARCHYROOTS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ACCESSPOLICIESType getACCESSPOLICIES() {
		return aCCESSPOLICIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetACCESSPOLICIES(ACCESSPOLICIESType newACCESSPOLICIES, NotificationChain msgs) {
		ACCESSPOLICIESType oldACCESSPOLICIES = aCCESSPOLICIES;
		aCCESSPOLICIES = newACCESSPOLICIES;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, RifPackage.RIFCONTENT__ACCESSPOLICIES, oldACCESSPOLICIES, newACCESSPOLICIES);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setACCESSPOLICIES(ACCESSPOLICIESType newACCESSPOLICIES) {
		if (newACCESSPOLICIES != aCCESSPOLICIES) {
			NotificationChain msgs = null;
			if (aCCESSPOLICIES != null)
				msgs = ((InternalEObject)aCCESSPOLICIES).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIFCONTENT__ACCESSPOLICIES, null, msgs);
			if (newACCESSPOLICIES != null)
				msgs = ((InternalEObject)newACCESSPOLICIES).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - RifPackage.RIFCONTENT__ACCESSPOLICIES, null, msgs);
			msgs = basicSetACCESSPOLICIES(newACCESSPOLICIES, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RifPackage.RIFCONTENT__ACCESSPOLICIES, newACCESSPOLICIES, newACCESSPOLICIES));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RifPackage.RIFCONTENT__DATATYPES:
				return basicSetDATATYPES(null, msgs);
			case RifPackage.RIFCONTENT__SPECTYPES:
				return basicSetSPECTYPES(null, msgs);
			case RifPackage.RIFCONTENT__SPECOBJECTS:
				return basicSetSPECOBJECTS(null, msgs);
			case RifPackage.RIFCONTENT__SPECRELATIONS:
				return basicSetSPECRELATIONS(null, msgs);
			case RifPackage.RIFCONTENT__SPECGROUPS:
				return basicSetSPECGROUPS(null, msgs);
			case RifPackage.RIFCONTENT__SPECHIERARCHYROOTS:
				return basicSetSPECHIERARCHYROOTS(null, msgs);
			case RifPackage.RIFCONTENT__SPECGROUPHIERARCHYROOTS:
				return basicSetSPECGROUPHIERARCHYROOTS(null, msgs);
			case RifPackage.RIFCONTENT__ACCESSPOLICIES:
				return basicSetACCESSPOLICIES(null, msgs);
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
			case RifPackage.RIFCONTENT__DATATYPES:
				return getDATATYPES();
			case RifPackage.RIFCONTENT__SPECTYPES:
				return getSPECTYPES();
			case RifPackage.RIFCONTENT__SPECOBJECTS:
				return getSPECOBJECTS();
			case RifPackage.RIFCONTENT__SPECRELATIONS:
				return getSPECRELATIONS();
			case RifPackage.RIFCONTENT__SPECGROUPS:
				return getSPECGROUPS();
			case RifPackage.RIFCONTENT__SPECHIERARCHYROOTS:
				return getSPECHIERARCHYROOTS();
			case RifPackage.RIFCONTENT__SPECGROUPHIERARCHYROOTS:
				return getSPECGROUPHIERARCHYROOTS();
			case RifPackage.RIFCONTENT__ACCESSPOLICIES:
				return getACCESSPOLICIES();
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
			case RifPackage.RIFCONTENT__DATATYPES:
				setDATATYPES((DATATYPESType)newValue);
				return;
			case RifPackage.RIFCONTENT__SPECTYPES:
				setSPECTYPES((SPECTYPESType1)newValue);
				return;
			case RifPackage.RIFCONTENT__SPECOBJECTS:
				setSPECOBJECTS((SPECOBJECTSType2)newValue);
				return;
			case RifPackage.RIFCONTENT__SPECRELATIONS:
				setSPECRELATIONS((SPECRELATIONSType2)newValue);
				return;
			case RifPackage.RIFCONTENT__SPECGROUPS:
				setSPECGROUPS((SPECGROUPSType1)newValue);
				return;
			case RifPackage.RIFCONTENT__SPECHIERARCHYROOTS:
				setSPECHIERARCHYROOTS((SPECHIERARCHYROOTSType1)newValue);
				return;
			case RifPackage.RIFCONTENT__SPECGROUPHIERARCHYROOTS:
				setSPECGROUPHIERARCHYROOTS((SPECGROUPHIERARCHYROOTSType)newValue);
				return;
			case RifPackage.RIFCONTENT__ACCESSPOLICIES:
				setACCESSPOLICIES((ACCESSPOLICIESType)newValue);
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
			case RifPackage.RIFCONTENT__DATATYPES:
				setDATATYPES((DATATYPESType)null);
				return;
			case RifPackage.RIFCONTENT__SPECTYPES:
				setSPECTYPES((SPECTYPESType1)null);
				return;
			case RifPackage.RIFCONTENT__SPECOBJECTS:
				setSPECOBJECTS((SPECOBJECTSType2)null);
				return;
			case RifPackage.RIFCONTENT__SPECRELATIONS:
				setSPECRELATIONS((SPECRELATIONSType2)null);
				return;
			case RifPackage.RIFCONTENT__SPECGROUPS:
				setSPECGROUPS((SPECGROUPSType1)null);
				return;
			case RifPackage.RIFCONTENT__SPECHIERARCHYROOTS:
				setSPECHIERARCHYROOTS((SPECHIERARCHYROOTSType1)null);
				return;
			case RifPackage.RIFCONTENT__SPECGROUPHIERARCHYROOTS:
				setSPECGROUPHIERARCHYROOTS((SPECGROUPHIERARCHYROOTSType)null);
				return;
			case RifPackage.RIFCONTENT__ACCESSPOLICIES:
				setACCESSPOLICIES((ACCESSPOLICIESType)null);
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
			case RifPackage.RIFCONTENT__DATATYPES:
				return dATATYPES != null;
			case RifPackage.RIFCONTENT__SPECTYPES:
				return sPECTYPES != null;
			case RifPackage.RIFCONTENT__SPECOBJECTS:
				return sPECOBJECTS != null;
			case RifPackage.RIFCONTENT__SPECRELATIONS:
				return sPECRELATIONS != null;
			case RifPackage.RIFCONTENT__SPECGROUPS:
				return sPECGROUPS != null;
			case RifPackage.RIFCONTENT__SPECHIERARCHYROOTS:
				return sPECHIERARCHYROOTS != null;
			case RifPackage.RIFCONTENT__SPECGROUPHIERARCHYROOTS:
				return sPECGROUPHIERARCHYROOTS != null;
			case RifPackage.RIFCONTENT__ACCESSPOLICIES:
				return aCCESSPOLICIES != null;
		}
		return super.eIsSet(featureID);
	}

} //RIFCONTENTImpl
