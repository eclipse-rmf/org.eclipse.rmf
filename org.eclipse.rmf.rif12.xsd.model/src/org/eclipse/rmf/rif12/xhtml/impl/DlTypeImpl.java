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

package org.eclipse.rmf.rif12.xhtml.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.rmf.rif12.xhtml.DdType;
import org.eclipse.rmf.rif12.xhtml.DlType;
import org.eclipse.rmf.rif12.xhtml.DtType;
import org.eclipse.rmf.rif12.xhtml.XhtmlPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dl Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.DlTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.DlTypeImpl#getDt <em>Dt</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.DlTypeImpl#getDd <em>Dd</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.DlTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.DlTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.DlTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.DlTypeImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DlTypeImpl extends EObjectImpl implements DlType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected List<String> class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DlTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.Literals.DL_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, XhtmlPackage.DL_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DtType> getDt() {
		return getGroup().list(XhtmlPackage.Literals.DL_TYPE__DT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DdType> getDd() {
		return getGroup().list(XhtmlPackage.Literals.DL_TYPE__DD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(List<String> newClass) {
		List<String> oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.DL_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.DL_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.DL_TYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.DL_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XhtmlPackage.DL_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.DL_TYPE__DT:
				return ((InternalEList<?>)getDt()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.DL_TYPE__DD:
				return ((InternalEList<?>)getDd()).basicRemove(otherEnd, msgs);
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
			case XhtmlPackage.DL_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XhtmlPackage.DL_TYPE__DT:
				return getDt();
			case XhtmlPackage.DL_TYPE__DD:
				return getDd();
			case XhtmlPackage.DL_TYPE__CLASS:
				return getClass_();
			case XhtmlPackage.DL_TYPE__ID:
				return getId();
			case XhtmlPackage.DL_TYPE__STYLE:
				return getStyle();
			case XhtmlPackage.DL_TYPE__TITLE:
				return getTitle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case XhtmlPackage.DL_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XhtmlPackage.DL_TYPE__DT:
				getDt().clear();
				getDt().addAll((Collection<? extends DtType>)newValue);
				return;
			case XhtmlPackage.DL_TYPE__DD:
				getDd().clear();
				getDd().addAll((Collection<? extends DdType>)newValue);
				return;
			case XhtmlPackage.DL_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case XhtmlPackage.DL_TYPE__ID:
				setId((String)newValue);
				return;
			case XhtmlPackage.DL_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case XhtmlPackage.DL_TYPE__TITLE:
				setTitle((String)newValue);
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
			case XhtmlPackage.DL_TYPE__GROUP:
				getGroup().clear();
				return;
			case XhtmlPackage.DL_TYPE__DT:
				getDt().clear();
				return;
			case XhtmlPackage.DL_TYPE__DD:
				getDd().clear();
				return;
			case XhtmlPackage.DL_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case XhtmlPackage.DL_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case XhtmlPackage.DL_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case XhtmlPackage.DL_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case XhtmlPackage.DL_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case XhtmlPackage.DL_TYPE__DT:
				return !getDt().isEmpty();
			case XhtmlPackage.DL_TYPE__DD:
				return !getDd().isEmpty();
			case XhtmlPackage.DL_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case XhtmlPackage.DL_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case XhtmlPackage.DL_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case XhtmlPackage.DL_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", class: ");
		result.append(class_);
		result.append(", id: ");
		result.append(id);
		result.append(", style: ");
		result.append(style);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //DlTypeImpl
