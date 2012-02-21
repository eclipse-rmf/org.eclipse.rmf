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

package org.eclipse.rmf.rif11.xhtml.impl;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.rmf.rif11.xhtml.AType;
import org.eclipse.rmf.rif11.xhtml.Shape;
import org.eclipse.rmf.rif11.xhtml.XhtmlPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.impl.ATypeImpl#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.impl.ATypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.impl.ATypeImpl#getCoords <em>Coords</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.impl.ATypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.impl.ATypeImpl#getHreflang <em>Hreflang</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.impl.ATypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.impl.ATypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.impl.ATypeImpl#getRel <em>Rel</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.impl.ATypeImpl#getRev <em>Rev</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.impl.ATypeImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.impl.ATypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.impl.ATypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif11.xhtml.impl.ATypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ATypeImpl extends AContentImpl implements AType {
	/**
	 * The default value of the '{@link #getCharset() <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharset()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharset() <em>Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharset()
	 * @generated
	 * @ordered
	 */
	protected String charset = CHARSET_EDEFAULT;

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
	 * The default value of the '{@link #getCoords() <em>Coords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoords()
	 * @generated
	 * @ordered
	 */
	protected static final String COORDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoords() <em>Coords</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoords()
	 * @generated
	 * @ordered
	 */
	protected String coords = COORDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected static final String HREF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHref() <em>Href</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHref()
	 * @generated
	 * @ordered
	 */
	protected String href = HREF_EDEFAULT;

	/**
	 * The default value of the '{@link #getHreflang() <em>Hreflang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHreflang()
	 * @generated
	 * @ordered
	 */
	protected static final String HREFLANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHreflang() <em>Hreflang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHreflang()
	 * @generated
	 * @ordered
	 */
	protected String hreflang = HREFLANG_EDEFAULT;

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
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRel() <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRel()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> REL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRel() <em>Rel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRel()
	 * @generated
	 * @ordered
	 */
	protected List<String> rel = REL_EDEFAULT;

	/**
	 * The default value of the '{@link #getRev() <em>Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRev()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> REV_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRev() <em>Rev</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRev()
	 * @generated
	 * @ordered
	 */
	protected List<String> rev = REV_EDEFAULT;

	/**
	 * The default value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected static final Shape SHAPE_EDEFAULT = Shape.RECT;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected Shape shape = SHAPE_EDEFAULT;

	/**
	 * This is true if the Shape attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean shapeESet;

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
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ATypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.eINSTANCE.getAType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharset() {
		return charset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharset(String newCharset) {
		String oldCharset = charset;
		charset = newCharset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.ATYPE__CHARSET, oldCharset, charset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.ATYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoords() {
		return coords;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoords(String newCoords) {
		String oldCoords = coords;
		coords = newCoords;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.ATYPE__COORDS, oldCoords, coords));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHref() {
		return href;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHref(String newHref) {
		String oldHref = href;
		href = newHref;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.ATYPE__HREF, oldHref, href));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHreflang() {
		return hreflang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHreflang(String newHreflang) {
		String oldHreflang = hreflang;
		hreflang = newHreflang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.ATYPE__HREFLANG, oldHreflang, hreflang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.ATYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.ATYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getRel() {
		return rel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRel(List<String> newRel) {
		List<String> oldRel = rel;
		rel = newRel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.ATYPE__REL, oldRel, rel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getRev() {
		return rev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRev(List<String> newRev) {
		List<String> oldRev = rev;
		rev = newRev;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.ATYPE__REV, oldRev, rev));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape getShape() {
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShape(Shape newShape) {
		Shape oldShape = shape;
		shape = newShape == null ? SHAPE_EDEFAULT : newShape;
		boolean oldShapeESet = shapeESet;
		shapeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.ATYPE__SHAPE, oldShape, shape, !oldShapeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetShape() {
		Shape oldShape = shape;
		boolean oldShapeESet = shapeESet;
		shape = SHAPE_EDEFAULT;
		shapeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.ATYPE__SHAPE, oldShape, SHAPE_EDEFAULT, oldShapeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetShape() {
		return shapeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.ATYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.ATYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.ATYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XhtmlPackage.ATYPE__CHARSET:
				return getCharset();
			case XhtmlPackage.ATYPE__CLASS:
				return getClass_();
			case XhtmlPackage.ATYPE__COORDS:
				return getCoords();
			case XhtmlPackage.ATYPE__HREF:
				return getHref();
			case XhtmlPackage.ATYPE__HREFLANG:
				return getHreflang();
			case XhtmlPackage.ATYPE__ID:
				return getId();
			case XhtmlPackage.ATYPE__NAME:
				return getName();
			case XhtmlPackage.ATYPE__REL:
				return getRel();
			case XhtmlPackage.ATYPE__REV:
				return getRev();
			case XhtmlPackage.ATYPE__SHAPE:
				return getShape();
			case XhtmlPackage.ATYPE__STYLE:
				return getStyle();
			case XhtmlPackage.ATYPE__TITLE:
				return getTitle();
			case XhtmlPackage.ATYPE__TYPE:
				return getType();
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
			case XhtmlPackage.ATYPE__CHARSET:
				setCharset((String)newValue);
				return;
			case XhtmlPackage.ATYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case XhtmlPackage.ATYPE__COORDS:
				setCoords((String)newValue);
				return;
			case XhtmlPackage.ATYPE__HREF:
				setHref((String)newValue);
				return;
			case XhtmlPackage.ATYPE__HREFLANG:
				setHreflang((String)newValue);
				return;
			case XhtmlPackage.ATYPE__ID:
				setId((String)newValue);
				return;
			case XhtmlPackage.ATYPE__NAME:
				setName((String)newValue);
				return;
			case XhtmlPackage.ATYPE__REL:
				setRel((List<String>)newValue);
				return;
			case XhtmlPackage.ATYPE__REV:
				setRev((List<String>)newValue);
				return;
			case XhtmlPackage.ATYPE__SHAPE:
				setShape((Shape)newValue);
				return;
			case XhtmlPackage.ATYPE__STYLE:
				setStyle((String)newValue);
				return;
			case XhtmlPackage.ATYPE__TITLE:
				setTitle((String)newValue);
				return;
			case XhtmlPackage.ATYPE__TYPE:
				setType((String)newValue);
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
			case XhtmlPackage.ATYPE__CHARSET:
				setCharset(CHARSET_EDEFAULT);
				return;
			case XhtmlPackage.ATYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case XhtmlPackage.ATYPE__COORDS:
				setCoords(COORDS_EDEFAULT);
				return;
			case XhtmlPackage.ATYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case XhtmlPackage.ATYPE__HREFLANG:
				setHreflang(HREFLANG_EDEFAULT);
				return;
			case XhtmlPackage.ATYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case XhtmlPackage.ATYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XhtmlPackage.ATYPE__REL:
				setRel(REL_EDEFAULT);
				return;
			case XhtmlPackage.ATYPE__REV:
				setRev(REV_EDEFAULT);
				return;
			case XhtmlPackage.ATYPE__SHAPE:
				unsetShape();
				return;
			case XhtmlPackage.ATYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case XhtmlPackage.ATYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case XhtmlPackage.ATYPE__TYPE:
				setType(TYPE_EDEFAULT);
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
			case XhtmlPackage.ATYPE__CHARSET:
				return CHARSET_EDEFAULT == null ? charset != null : !CHARSET_EDEFAULT.equals(charset);
			case XhtmlPackage.ATYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case XhtmlPackage.ATYPE__COORDS:
				return COORDS_EDEFAULT == null ? coords != null : !COORDS_EDEFAULT.equals(coords);
			case XhtmlPackage.ATYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case XhtmlPackage.ATYPE__HREFLANG:
				return HREFLANG_EDEFAULT == null ? hreflang != null : !HREFLANG_EDEFAULT.equals(hreflang);
			case XhtmlPackage.ATYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case XhtmlPackage.ATYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XhtmlPackage.ATYPE__REL:
				return REL_EDEFAULT == null ? rel != null : !REL_EDEFAULT.equals(rel);
			case XhtmlPackage.ATYPE__REV:
				return REV_EDEFAULT == null ? rev != null : !REV_EDEFAULT.equals(rev);
			case XhtmlPackage.ATYPE__SHAPE:
				return isSetShape();
			case XhtmlPackage.ATYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case XhtmlPackage.ATYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case XhtmlPackage.ATYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (charset: ");
		result.append(charset);
		result.append(", class: ");
		result.append(class_);
		result.append(", coords: ");
		result.append(coords);
		result.append(", href: ");
		result.append(href);
		result.append(", hreflang: ");
		result.append(hreflang);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", rel: ");
		result.append(rel);
		result.append(", rev: ");
		result.append(rev);
		result.append(", shape: ");
		if (shapeESet) result.append(shape); else result.append("<unset>");
		result.append(", style: ");
		result.append(style);
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //ATypeImpl
