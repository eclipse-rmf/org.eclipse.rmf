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

package org.eclipse.rmf.rif12.its.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.rmf.rif12.its.ItsLocNoteRuleContent;
import org.eclipse.rmf.rif12.its.ItsPackage;
import org.eclipse.rmf.rif12.its.LocNoteType;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loc Note Rule Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.ItsLocNoteRuleContentImpl#getLocNote <em>Loc Note</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ItsLocNoteRuleContentImpl extends EObjectImpl implements ItsLocNoteRuleContent {
	/**
	 * The cached value of the '{@link #getLocNote() <em>Loc Note</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocNote()
	 * @generated
	 * @ordered
	 */
	protected LocNoteType locNote;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItsLocNoteRuleContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItsPackage.Literals.ITS_LOC_NOTE_RULE_CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocNoteType getLocNote() {
		return locNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocNote(LocNoteType newLocNote, NotificationChain msgs) {
		LocNoteType oldLocNote = locNote;
		locNote = newLocNote;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_LOC_NOTE_RULE_CONTENT__LOC_NOTE, oldLocNote, newLocNote);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocNote(LocNoteType newLocNote) {
		if (newLocNote != locNote) {
			NotificationChain msgs = null;
			if (locNote != null)
				msgs = ((InternalEObject)locNote).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_LOC_NOTE_RULE_CONTENT__LOC_NOTE, null, msgs);
			if (newLocNote != null)
				msgs = ((InternalEObject)newLocNote).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ItsPackage.ITS_LOC_NOTE_RULE_CONTENT__LOC_NOTE, null, msgs);
			msgs = basicSetLocNote(newLocNote, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.ITS_LOC_NOTE_RULE_CONTENT__LOC_NOTE, newLocNote, newLocNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ItsPackage.ITS_LOC_NOTE_RULE_CONTENT__LOC_NOTE:
				return basicSetLocNote(null, msgs);
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
			case ItsPackage.ITS_LOC_NOTE_RULE_CONTENT__LOC_NOTE:
				return getLocNote();
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
			case ItsPackage.ITS_LOC_NOTE_RULE_CONTENT__LOC_NOTE:
				setLocNote((LocNoteType)newValue);
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
			case ItsPackage.ITS_LOC_NOTE_RULE_CONTENT__LOC_NOTE:
				setLocNote((LocNoteType)null);
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
			case ItsPackage.ITS_LOC_NOTE_RULE_CONTENT__LOC_NOTE:
				return locNote != null;
		}
		return super.eIsSet(featureID);
	}

} //ItsLocNoteRuleContentImpl
