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

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.rmf.rif12.xhtml.ImgType;
import org.eclipse.rmf.rif12.xhtml.IsmapType;
import org.eclipse.rmf.rif12.xhtml.XhtmlPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Img Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ImgTypeImpl#getAlt <em>Alt</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ImgTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ImgTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ImgTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ImgTypeImpl#getIsmap <em>Ismap</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ImgTypeImpl#getLongdesc <em>Longdesc</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ImgTypeImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ImgTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ImgTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ImgTypeImpl#getUsemap <em>Usemap</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ImgTypeImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ImgTypeImpl extends EObjectImpl implements ImgType {
	/**
	 * The default value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected static final String ALT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlt() <em>Alt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlt()
	 * @generated
	 * @ordered
	 */
	protected String alt = ALT_EDEFAULT;

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
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final String HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected String height = HEIGHT_EDEFAULT;

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
	 * The default value of the '{@link #getIsmap() <em>Ismap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsmap()
	 * @generated
	 * @ordered
	 */
	protected static final IsmapType ISMAP_EDEFAULT = IsmapType.ISMAP;

	/**
	 * The cached value of the '{@link #getIsmap() <em>Ismap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsmap()
	 * @generated
	 * @ordered
	 */
	protected IsmapType ismap = ISMAP_EDEFAULT;

	/**
	 * This is true if the Ismap attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ismapESet;

	/**
	 * The default value of the '{@link #getLongdesc() <em>Longdesc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongdesc()
	 * @generated
	 * @ordered
	 */
	protected static final String LONGDESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongdesc() <em>Longdesc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongdesc()
	 * @generated
	 * @ordered
	 */
	protected String longdesc = LONGDESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected static final String SRC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected String src = SRC_EDEFAULT;

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
	 * The default value of the '{@link #getUsemap() <em>Usemap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsemap()
	 * @generated
	 * @ordered
	 */
	protected static final String USEMAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUsemap() <em>Usemap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsemap()
	 * @generated
	 * @ordered
	 */
	protected String usemap = USEMAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final String WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected String width = WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImgTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.Literals.IMG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlt() {
		return alt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlt(String newAlt) {
		String oldAlt = alt;
		alt = newAlt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.IMG_TYPE__ALT, oldAlt, alt));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.IMG_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHeight() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeight(String newHeight) {
		String oldHeight = height;
		height = newHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.IMG_TYPE__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.IMG_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsmapType getIsmap() {
		return ismap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsmap(IsmapType newIsmap) {
		IsmapType oldIsmap = ismap;
		ismap = newIsmap == null ? ISMAP_EDEFAULT : newIsmap;
		boolean oldIsmapESet = ismapESet;
		ismapESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.IMG_TYPE__ISMAP, oldIsmap, ismap, !oldIsmapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsmap() {
		IsmapType oldIsmap = ismap;
		boolean oldIsmapESet = ismapESet;
		ismap = ISMAP_EDEFAULT;
		ismapESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.IMG_TYPE__ISMAP, oldIsmap, ISMAP_EDEFAULT, oldIsmapESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsmap() {
		return ismapESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongdesc() {
		return longdesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongdesc(String newLongdesc) {
		String oldLongdesc = longdesc;
		longdesc = newLongdesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.IMG_TYPE__LONGDESC, oldLongdesc, longdesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSrc() {
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSrc(String newSrc) {
		String oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.IMG_TYPE__SRC, oldSrc, src));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.IMG_TYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.IMG_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUsemap() {
		return usemap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsemap(String newUsemap) {
		String oldUsemap = usemap;
		usemap = newUsemap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.IMG_TYPE__USEMAP, oldUsemap, usemap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(String newWidth) {
		String oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.IMG_TYPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XhtmlPackage.IMG_TYPE__ALT:
				return getAlt();
			case XhtmlPackage.IMG_TYPE__CLASS:
				return getClass_();
			case XhtmlPackage.IMG_TYPE__HEIGHT:
				return getHeight();
			case XhtmlPackage.IMG_TYPE__ID:
				return getId();
			case XhtmlPackage.IMG_TYPE__ISMAP:
				return getIsmap();
			case XhtmlPackage.IMG_TYPE__LONGDESC:
				return getLongdesc();
			case XhtmlPackage.IMG_TYPE__SRC:
				return getSrc();
			case XhtmlPackage.IMG_TYPE__STYLE:
				return getStyle();
			case XhtmlPackage.IMG_TYPE__TITLE:
				return getTitle();
			case XhtmlPackage.IMG_TYPE__USEMAP:
				return getUsemap();
			case XhtmlPackage.IMG_TYPE__WIDTH:
				return getWidth();
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
			case XhtmlPackage.IMG_TYPE__ALT:
				setAlt((String)newValue);
				return;
			case XhtmlPackage.IMG_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case XhtmlPackage.IMG_TYPE__HEIGHT:
				setHeight((String)newValue);
				return;
			case XhtmlPackage.IMG_TYPE__ID:
				setId((String)newValue);
				return;
			case XhtmlPackage.IMG_TYPE__ISMAP:
				setIsmap((IsmapType)newValue);
				return;
			case XhtmlPackage.IMG_TYPE__LONGDESC:
				setLongdesc((String)newValue);
				return;
			case XhtmlPackage.IMG_TYPE__SRC:
				setSrc((String)newValue);
				return;
			case XhtmlPackage.IMG_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case XhtmlPackage.IMG_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case XhtmlPackage.IMG_TYPE__USEMAP:
				setUsemap((String)newValue);
				return;
			case XhtmlPackage.IMG_TYPE__WIDTH:
				setWidth((String)newValue);
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
			case XhtmlPackage.IMG_TYPE__ALT:
				setAlt(ALT_EDEFAULT);
				return;
			case XhtmlPackage.IMG_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case XhtmlPackage.IMG_TYPE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case XhtmlPackage.IMG_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case XhtmlPackage.IMG_TYPE__ISMAP:
				unsetIsmap();
				return;
			case XhtmlPackage.IMG_TYPE__LONGDESC:
				setLongdesc(LONGDESC_EDEFAULT);
				return;
			case XhtmlPackage.IMG_TYPE__SRC:
				setSrc(SRC_EDEFAULT);
				return;
			case XhtmlPackage.IMG_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case XhtmlPackage.IMG_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case XhtmlPackage.IMG_TYPE__USEMAP:
				setUsemap(USEMAP_EDEFAULT);
				return;
			case XhtmlPackage.IMG_TYPE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
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
			case XhtmlPackage.IMG_TYPE__ALT:
				return ALT_EDEFAULT == null ? alt != null : !ALT_EDEFAULT.equals(alt);
			case XhtmlPackage.IMG_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case XhtmlPackage.IMG_TYPE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case XhtmlPackage.IMG_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case XhtmlPackage.IMG_TYPE__ISMAP:
				return isSetIsmap();
			case XhtmlPackage.IMG_TYPE__LONGDESC:
				return LONGDESC_EDEFAULT == null ? longdesc != null : !LONGDESC_EDEFAULT.equals(longdesc);
			case XhtmlPackage.IMG_TYPE__SRC:
				return SRC_EDEFAULT == null ? src != null : !SRC_EDEFAULT.equals(src);
			case XhtmlPackage.IMG_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case XhtmlPackage.IMG_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case XhtmlPackage.IMG_TYPE__USEMAP:
				return USEMAP_EDEFAULT == null ? usemap != null : !USEMAP_EDEFAULT.equals(usemap);
			case XhtmlPackage.IMG_TYPE__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
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
		result.append(" (alt: ");
		result.append(alt);
		result.append(", class: ");
		result.append(class_);
		result.append(", height: ");
		result.append(height);
		result.append(", id: ");
		result.append(id);
		result.append(", ismap: ");
		if (ismapESet) result.append(ismap); else result.append("<unset>");
		result.append(", longdesc: ");
		result.append(longdesc);
		result.append(", src: ");
		result.append(src);
		result.append(", style: ");
		result.append(style);
		result.append(", title: ");
		result.append(title);
		result.append(", usemap: ");
		result.append(usemap);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //ImgTypeImpl
