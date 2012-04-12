/**
 * Copyright (c) 2012 itemis AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mark Broerkens - initial API and implementation
 * 
 */
package org.eclipse.rmf.reqif10.xhtml.impl;

import java.util.Collection;

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

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

import org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDivType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDlType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlEditType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlHrType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlOlType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPreType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlTableType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlUlType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Blockquote Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getXhtmlBlockMix <em>Xhtml Block Mix</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getH1 <em>H1</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getH2 <em>H2</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getH3 <em>H3</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getH4 <em>H4</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getH5 <em>H5</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getH6 <em>H6</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getDl <em>Dl</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getIns <em>Ins</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getDel <em>Del</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl#getTitle <em>Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XhtmlBlockquoteTypeImpl extends EObjectImpl implements XhtmlBlockquoteType {
	/**
	 * The cached value of the '{@link #getXhtmlBlockMix() <em>Xhtml Block Mix</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXhtmlBlockMix()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap xhtmlBlockMix;

	/**
	 * The default value of the '{@link #getCite() <em>Cite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCite()
	 * @generated
	 * @ordered
	 */
	protected static final String CITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCite() <em>Cite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCite()
	 * @generated
	 * @ordered
	 */
	protected String cite = CITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

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
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpace() <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected static final SpaceType SPACE_EDEFAULT = SpaceType.PRESERVE_LITERAL;

	/**
	 * The cached value of the '{@link #getSpace() <em>Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpace()
	 * @generated
	 * @ordered
	 */
	protected SpaceType space = SPACE_EDEFAULT;

	/**
	 * This is true if the Space attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean spaceESet;

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
	protected XhtmlBlockquoteTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getXhtmlBlockMix() {
		if (xhtmlBlockMix == null) {
			xhtmlBlockMix = new BasicFeatureMap(this, XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__XHTML_BLOCK_MIX);
		}
		return xhtmlBlockMix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlH1Type> getH1() {
		return getXhtmlBlockMix().list(XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType_H1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlH2Type> getH2() {
		return getXhtmlBlockMix().list(XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType_H2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlH3Type> getH3() {
		return getXhtmlBlockMix().list(XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType_H3());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlH4Type> getH4() {
		return getXhtmlBlockMix().list(XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType_H4());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlH5Type> getH5() {
		return getXhtmlBlockMix().list(XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType_H5());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlH6Type> getH6() {
		return getXhtmlBlockMix().list(XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType_H6());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlUlType> getUl() {
		return getXhtmlBlockMix().list(XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType_Ul());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlOlType> getOl() {
		return getXhtmlBlockMix().list(XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType_Ol());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlDlType> getDl() {
		return getXhtmlBlockMix().list(XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType_Dl());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlPType> getP() {
		return getXhtmlBlockMix().list(XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlDivType> getDiv() {
		return getXhtmlBlockMix().list(XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType_Div());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlPreType> getPre() {
		return getXhtmlBlockMix().list(XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType_Pre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlBlockquoteType> getBlockquote() {
		return getXhtmlBlockMix().list(XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType_Blockquote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlAddressType> getAddress() {
		return getXhtmlBlockMix().list(XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlHrType> getHr() {
		return getXhtmlBlockMix().list(XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType_Hr());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlTableType> getTable() {
		return getXhtmlBlockMix().list(XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType_Table());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlEditType> getIns() {
		return getXhtmlBlockMix().list(XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType_Ins());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlEditType> getDel() {
		return getXhtmlBlockMix().list(XhtmlPackage.eINSTANCE.getXhtmlBlockquoteType_Del());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCite() {
		return cite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCite(String newCite) {
		String oldCite = cite;
		cite = newCite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__CITE, oldCite, cite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__LANG, oldLang, lang));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpaceType getSpace() {
		return space;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpace(SpaceType newSpace) {
		SpaceType oldSpace = space;
		space = newSpace == null ? SPACE_EDEFAULT : newSpace;
		boolean oldSpaceESet = spaceESet;
		spaceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSpace() {
		SpaceType oldSpace = space;
		boolean oldSpaceESet = spaceESet;
		space = SPACE_EDEFAULT;
		spaceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSpace() {
		return spaceESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__XHTML_BLOCK_MIX:
				return ((InternalEList<?>)getXhtmlBlockMix()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H1:
				return ((InternalEList<?>)getH1()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H2:
				return ((InternalEList<?>)getH2()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H3:
				return ((InternalEList<?>)getH3()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H4:
				return ((InternalEList<?>)getH4()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H5:
				return ((InternalEList<?>)getH5()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H6:
				return ((InternalEList<?>)getH6()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__UL:
				return ((InternalEList<?>)getUl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__OL:
				return ((InternalEList<?>)getOl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__DL:
				return ((InternalEList<?>)getDl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__DIV:
				return ((InternalEList<?>)getDiv()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__PRE:
				return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__BLOCKQUOTE:
				return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__HR:
				return ((InternalEList<?>)getHr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__INS:
				return ((InternalEList<?>)getIns()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__DEL:
				return ((InternalEList<?>)getDel()).basicRemove(otherEnd, msgs);
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
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__XHTML_BLOCK_MIX:
				if (coreType) return getXhtmlBlockMix();
				return ((FeatureMap.Internal)getXhtmlBlockMix()).getWrapper();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H1:
				return getH1();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H2:
				return getH2();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H3:
				return getH3();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H4:
				return getH4();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H5:
				return getH5();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H6:
				return getH6();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__UL:
				return getUl();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__OL:
				return getOl();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__DL:
				return getDl();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__P:
				return getP();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__DIV:
				return getDiv();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__PRE:
				return getPre();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__BLOCKQUOTE:
				return getBlockquote();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__ADDRESS:
				return getAddress();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__HR:
				return getHr();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__TABLE:
				return getTable();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__INS:
				return getIns();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__DEL:
				return getDel();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__CITE:
				return getCite();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__CLASS:
				return getClass_();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__ID:
				return getId();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__LANG:
				return getLang();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__SPACE:
				return getSpace();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__STYLE:
				return getStyle();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__TITLE:
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
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__XHTML_BLOCK_MIX:
				((FeatureMap.Internal)getXhtmlBlockMix()).set(newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H1:
				getH1().clear();
				getH1().addAll((Collection<? extends XhtmlH1Type>)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H2:
				getH2().clear();
				getH2().addAll((Collection<? extends XhtmlH2Type>)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H3:
				getH3().clear();
				getH3().addAll((Collection<? extends XhtmlH3Type>)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H4:
				getH4().clear();
				getH4().addAll((Collection<? extends XhtmlH4Type>)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H5:
				getH5().clear();
				getH5().addAll((Collection<? extends XhtmlH5Type>)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H6:
				getH6().clear();
				getH6().addAll((Collection<? extends XhtmlH6Type>)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__UL:
				getUl().clear();
				getUl().addAll((Collection<? extends XhtmlUlType>)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__OL:
				getOl().clear();
				getOl().addAll((Collection<? extends XhtmlOlType>)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__DL:
				getDl().clear();
				getDl().addAll((Collection<? extends XhtmlDlType>)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends XhtmlPType>)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__DIV:
				getDiv().clear();
				getDiv().addAll((Collection<? extends XhtmlDivType>)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__PRE:
				getPre().clear();
				getPre().addAll((Collection<? extends XhtmlPreType>)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__BLOCKQUOTE:
				getBlockquote().clear();
				getBlockquote().addAll((Collection<? extends XhtmlBlockquoteType>)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends XhtmlAddressType>)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__HR:
				getHr().clear();
				getHr().addAll((Collection<? extends XhtmlHrType>)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends XhtmlTableType>)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__INS:
				getIns().clear();
				getIns().addAll((Collection<? extends XhtmlEditType>)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__DEL:
				getDel().clear();
				getDel().addAll((Collection<? extends XhtmlEditType>)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__CITE:
				setCite((String)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__ID:
				setId((String)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__LANG:
				setLang((String)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__SPACE:
				setSpace((SpaceType)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__TITLE:
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
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__XHTML_BLOCK_MIX:
				getXhtmlBlockMix().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H1:
				getH1().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H2:
				getH2().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H3:
				getH3().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H4:
				getH4().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H5:
				getH5().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H6:
				getH6().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__UL:
				getUl().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__OL:
				getOl().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__DL:
				getDl().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__P:
				getP().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__DIV:
				getDiv().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__PRE:
				getPre().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__BLOCKQUOTE:
				getBlockquote().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__HR:
				getHr().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__TABLE:
				getTable().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__INS:
				getIns().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__DEL:
				getDel().clear();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__CITE:
				setCite(CITE_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__SPACE:
				unsetSpace();
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__TITLE:
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
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__XHTML_BLOCK_MIX:
				return xhtmlBlockMix != null && !xhtmlBlockMix.isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H1:
				return !getH1().isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H2:
				return !getH2().isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H3:
				return !getH3().isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H4:
				return !getH4().isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H5:
				return !getH5().isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__H6:
				return !getH6().isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__UL:
				return !getUl().isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__OL:
				return !getOl().isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__DL:
				return !getDl().isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__P:
				return !getP().isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__DIV:
				return !getDiv().isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__PRE:
				return !getPre().isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__BLOCKQUOTE:
				return !getBlockquote().isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__HR:
				return !getHr().isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__TABLE:
				return !getTable().isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__INS:
				return !getIns().isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__DEL:
				return !getDel().isEmpty();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__CITE:
				return CITE_EDEFAULT == null ? cite != null : !CITE_EDEFAULT.equals(cite);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__SPACE:
				return isSetSpace();
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case XhtmlPackage.XHTML_BLOCKQUOTE_TYPE__TITLE:
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
		result.append(" (xhtmlBlockMix: ");
		result.append(xhtmlBlockMix);
		result.append(", cite: ");
		result.append(cite);
		result.append(", class: ");
		result.append(class_);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", space: ");
		if (spaceESet) result.append(space); else result.append("<unset>");
		result.append(", style: ");
		result.append(style);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //XhtmlBlockquoteTypeImpl
