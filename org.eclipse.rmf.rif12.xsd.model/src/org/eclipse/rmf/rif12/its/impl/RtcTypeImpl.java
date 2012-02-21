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
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.rmf.rif12.its.DirType1;
import org.eclipse.rmf.rif12.its.ItsPackage;
import org.eclipse.rmf.rif12.its.LocNoteTypeType1;
import org.eclipse.rmf.rif12.its.RtcType;
import org.eclipse.rmf.rif12.its.TermType1;
import org.eclipse.rmf.rif12.its.TranslateType1;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rtc Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.RtcTypeImpl#getDir <em>Dir</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.RtcTypeImpl#getLocNote <em>Loc Note</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.RtcTypeImpl#getLocNoteRef <em>Loc Note Ref</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.RtcTypeImpl#getLocNoteType <em>Loc Note Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.RtcTypeImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.RtcTypeImpl#getTermInfoRef <em>Term Info Ref</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.its.impl.RtcTypeImpl#getTranslate <em>Translate</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RtcTypeImpl extends ItsRtcContentImpl implements RtcType {
	/**
	 * The default value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected static final DirType1 DIR_EDEFAULT = DirType1.LTR;

	/**
	 * The cached value of the '{@link #getDir() <em>Dir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDir()
	 * @generated
	 * @ordered
	 */
	protected DirType1 dir = DIR_EDEFAULT;

	/**
	 * This is true if the Dir attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean dirESet;

	/**
	 * The default value of the '{@link #getLocNote() <em>Loc Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocNote()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_NOTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocNote() <em>Loc Note</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocNote()
	 * @generated
	 * @ordered
	 */
	protected String locNote = LOC_NOTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocNoteRef() <em>Loc Note Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocNoteRef()
	 * @generated
	 * @ordered
	 */
	protected static final String LOC_NOTE_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocNoteRef() <em>Loc Note Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocNoteRef()
	 * @generated
	 * @ordered
	 */
	protected String locNoteRef = LOC_NOTE_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocNoteType() <em>Loc Note Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocNoteType()
	 * @generated
	 * @ordered
	 */
	protected static final LocNoteTypeType1 LOC_NOTE_TYPE_EDEFAULT = LocNoteTypeType1.ALERT;

	/**
	 * The cached value of the '{@link #getLocNoteType() <em>Loc Note Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocNoteType()
	 * @generated
	 * @ordered
	 */
	protected LocNoteTypeType1 locNoteType = LOC_NOTE_TYPE_EDEFAULT;

	/**
	 * This is true if the Loc Note Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean locNoteTypeESet;

	/**
	 * The default value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected static final TermType1 TERM_EDEFAULT = TermType1.YES;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected TermType1 term = TERM_EDEFAULT;

	/**
	 * This is true if the Term attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean termESet;

	/**
	 * The default value of the '{@link #getTermInfoRef() <em>Term Info Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermInfoRef()
	 * @generated
	 * @ordered
	 */
	protected static final String TERM_INFO_REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTermInfoRef() <em>Term Info Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermInfoRef()
	 * @generated
	 * @ordered
	 */
	protected String termInfoRef = TERM_INFO_REF_EDEFAULT;

	/**
	 * The default value of the '{@link #getTranslate() <em>Translate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslate()
	 * @generated
	 * @ordered
	 */
	protected static final TranslateType1 TRANSLATE_EDEFAULT = TranslateType1.YES;

	/**
	 * The cached value of the '{@link #getTranslate() <em>Translate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTranslate()
	 * @generated
	 * @ordered
	 */
	protected TranslateType1 translate = TRANSLATE_EDEFAULT;

	/**
	 * This is true if the Translate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean translateESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RtcTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ItsPackage.Literals.RTC_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DirType1 getDir() {
		return dir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDir(DirType1 newDir) {
		DirType1 oldDir = dir;
		dir = newDir == null ? DIR_EDEFAULT : newDir;
		boolean oldDirESet = dirESet;
		dirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.RTC_TYPE__DIR, oldDir, dir, !oldDirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDir() {
		DirType1 oldDir = dir;
		boolean oldDirESet = dirESet;
		dir = DIR_EDEFAULT;
		dirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ItsPackage.RTC_TYPE__DIR, oldDir, DIR_EDEFAULT, oldDirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDir() {
		return dirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocNote() {
		return locNote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocNote(String newLocNote) {
		String oldLocNote = locNote;
		locNote = newLocNote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.RTC_TYPE__LOC_NOTE, oldLocNote, locNote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocNoteRef() {
		return locNoteRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocNoteRef(String newLocNoteRef) {
		String oldLocNoteRef = locNoteRef;
		locNoteRef = newLocNoteRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.RTC_TYPE__LOC_NOTE_REF, oldLocNoteRef, locNoteRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocNoteTypeType1 getLocNoteType() {
		return locNoteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocNoteType(LocNoteTypeType1 newLocNoteType) {
		LocNoteTypeType1 oldLocNoteType = locNoteType;
		locNoteType = newLocNoteType == null ? LOC_NOTE_TYPE_EDEFAULT : newLocNoteType;
		boolean oldLocNoteTypeESet = locNoteTypeESet;
		locNoteTypeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.RTC_TYPE__LOC_NOTE_TYPE, oldLocNoteType, locNoteType, !oldLocNoteTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocNoteType() {
		LocNoteTypeType1 oldLocNoteType = locNoteType;
		boolean oldLocNoteTypeESet = locNoteTypeESet;
		locNoteType = LOC_NOTE_TYPE_EDEFAULT;
		locNoteTypeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ItsPackage.RTC_TYPE__LOC_NOTE_TYPE, oldLocNoteType, LOC_NOTE_TYPE_EDEFAULT, oldLocNoteTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocNoteType() {
		return locNoteTypeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermType1 getTerm() {
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTerm(TermType1 newTerm) {
		TermType1 oldTerm = term;
		term = newTerm == null ? TERM_EDEFAULT : newTerm;
		boolean oldTermESet = termESet;
		termESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.RTC_TYPE__TERM, oldTerm, term, !oldTermESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTerm() {
		TermType1 oldTerm = term;
		boolean oldTermESet = termESet;
		term = TERM_EDEFAULT;
		termESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ItsPackage.RTC_TYPE__TERM, oldTerm, TERM_EDEFAULT, oldTermESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTerm() {
		return termESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTermInfoRef() {
		return termInfoRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermInfoRef(String newTermInfoRef) {
		String oldTermInfoRef = termInfoRef;
		termInfoRef = newTermInfoRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.RTC_TYPE__TERM_INFO_REF, oldTermInfoRef, termInfoRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TranslateType1 getTranslate() {
		return translate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTranslate(TranslateType1 newTranslate) {
		TranslateType1 oldTranslate = translate;
		translate = newTranslate == null ? TRANSLATE_EDEFAULT : newTranslate;
		boolean oldTranslateESet = translateESet;
		translateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ItsPackage.RTC_TYPE__TRANSLATE, oldTranslate, translate, !oldTranslateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTranslate() {
		TranslateType1 oldTranslate = translate;
		boolean oldTranslateESet = translateESet;
		translate = TRANSLATE_EDEFAULT;
		translateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, ItsPackage.RTC_TYPE__TRANSLATE, oldTranslate, TRANSLATE_EDEFAULT, oldTranslateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTranslate() {
		return translateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ItsPackage.RTC_TYPE__DIR:
				return getDir();
			case ItsPackage.RTC_TYPE__LOC_NOTE:
				return getLocNote();
			case ItsPackage.RTC_TYPE__LOC_NOTE_REF:
				return getLocNoteRef();
			case ItsPackage.RTC_TYPE__LOC_NOTE_TYPE:
				return getLocNoteType();
			case ItsPackage.RTC_TYPE__TERM:
				return getTerm();
			case ItsPackage.RTC_TYPE__TERM_INFO_REF:
				return getTermInfoRef();
			case ItsPackage.RTC_TYPE__TRANSLATE:
				return getTranslate();
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
			case ItsPackage.RTC_TYPE__DIR:
				setDir((DirType1)newValue);
				return;
			case ItsPackage.RTC_TYPE__LOC_NOTE:
				setLocNote((String)newValue);
				return;
			case ItsPackage.RTC_TYPE__LOC_NOTE_REF:
				setLocNoteRef((String)newValue);
				return;
			case ItsPackage.RTC_TYPE__LOC_NOTE_TYPE:
				setLocNoteType((LocNoteTypeType1)newValue);
				return;
			case ItsPackage.RTC_TYPE__TERM:
				setTerm((TermType1)newValue);
				return;
			case ItsPackage.RTC_TYPE__TERM_INFO_REF:
				setTermInfoRef((String)newValue);
				return;
			case ItsPackage.RTC_TYPE__TRANSLATE:
				setTranslate((TranslateType1)newValue);
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
			case ItsPackage.RTC_TYPE__DIR:
				unsetDir();
				return;
			case ItsPackage.RTC_TYPE__LOC_NOTE:
				setLocNote(LOC_NOTE_EDEFAULT);
				return;
			case ItsPackage.RTC_TYPE__LOC_NOTE_REF:
				setLocNoteRef(LOC_NOTE_REF_EDEFAULT);
				return;
			case ItsPackage.RTC_TYPE__LOC_NOTE_TYPE:
				unsetLocNoteType();
				return;
			case ItsPackage.RTC_TYPE__TERM:
				unsetTerm();
				return;
			case ItsPackage.RTC_TYPE__TERM_INFO_REF:
				setTermInfoRef(TERM_INFO_REF_EDEFAULT);
				return;
			case ItsPackage.RTC_TYPE__TRANSLATE:
				unsetTranslate();
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
			case ItsPackage.RTC_TYPE__DIR:
				return isSetDir();
			case ItsPackage.RTC_TYPE__LOC_NOTE:
				return LOC_NOTE_EDEFAULT == null ? locNote != null : !LOC_NOTE_EDEFAULT.equals(locNote);
			case ItsPackage.RTC_TYPE__LOC_NOTE_REF:
				return LOC_NOTE_REF_EDEFAULT == null ? locNoteRef != null : !LOC_NOTE_REF_EDEFAULT.equals(locNoteRef);
			case ItsPackage.RTC_TYPE__LOC_NOTE_TYPE:
				return isSetLocNoteType();
			case ItsPackage.RTC_TYPE__TERM:
				return isSetTerm();
			case ItsPackage.RTC_TYPE__TERM_INFO_REF:
				return TERM_INFO_REF_EDEFAULT == null ? termInfoRef != null : !TERM_INFO_REF_EDEFAULT.equals(termInfoRef);
			case ItsPackage.RTC_TYPE__TRANSLATE:
				return isSetTranslate();
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
		result.append(" (dir: ");
		if (dirESet) result.append(dir); else result.append("<unset>");
		result.append(", locNote: ");
		result.append(locNote);
		result.append(", locNoteRef: ");
		result.append(locNoteRef);
		result.append(", locNoteType: ");
		if (locNoteTypeESet) result.append(locNoteType); else result.append("<unset>");
		result.append(", term: ");
		if (termESet) result.append(term); else result.append("<unset>");
		result.append(", termInfoRef: ");
		result.append(termInfoRef);
		result.append(", translate: ");
		if (translateESet) result.append(translate); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //RtcTypeImpl
