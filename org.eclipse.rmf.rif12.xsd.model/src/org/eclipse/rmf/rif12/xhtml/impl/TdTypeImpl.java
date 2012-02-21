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

import java.math.BigInteger;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.rmf.rif12.xhtml.AlignType;
import org.eclipse.rmf.rif12.xhtml.Scope;
import org.eclipse.rmf.rif12.xhtml.TdType;
import org.eclipse.rmf.rif12.xhtml.ValignType;
import org.eclipse.rmf.rif12.xhtml.XhtmlPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Td Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.TdTypeImpl#getAbbr1 <em>Abbr1</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.TdTypeImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.TdTypeImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.TdTypeImpl#getChar <em>Char</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.TdTypeImpl#getCharoff <em>Charoff</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.TdTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.TdTypeImpl#getColspan <em>Colspan</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.TdTypeImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.TdTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.TdTypeImpl#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.TdTypeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.TdTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.TdTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.TdTypeImpl#getValign <em>Valign</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TdTypeImpl extends FlowImpl implements TdType {
	/**
	 * The default value of the '{@link #getAbbr1() <em>Abbr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbr1()
	 * @generated
	 * @ordered
	 */
	protected static final String ABBR1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbbr1() <em>Abbr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbbr1()
	 * @generated
	 * @ordered
	 */
	protected String abbr1 = ABBR1_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final AlignType ALIGN_EDEFAULT = AlignType.LEFT;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected AlignType align = ALIGN_EDEFAULT;

	/**
	 * This is true if the Align attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean alignESet;

	/**
	 * The default value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected static final Object AXIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected Object axis = AXIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected String char_ = CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharoff() <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharoff()
	 * @generated
	 * @ordered
	 */
	protected static final String CHAROFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharoff() <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharoff()
	 * @generated
	 * @ordered
	 */
	protected String charoff = CHAROFF_EDEFAULT;

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
	 * The default value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColspan()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COLSPAN_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColspan()
	 * @generated
	 * @ordered
	 */
	protected BigInteger colspan = COLSPAN_EDEFAULT;

	/**
	 * This is true if the Colspan attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean colspanESet;

	/**
	 * The default value of the '{@link #getHeaders() <em>Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> HEADERS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeaders() <em>Headers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaders()
	 * @generated
	 * @ordered
	 */
	protected List<String> headers = HEADERS_EDEFAULT;

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
	 * The default value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ROWSPAN_EDEFAULT = new BigInteger("1");

	/**
	 * The cached value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowspan()
	 * @generated
	 * @ordered
	 */
	protected BigInteger rowspan = ROWSPAN_EDEFAULT;

	/**
	 * This is true if the Rowspan attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean rowspanESet;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final Scope SCOPE_EDEFAULT = Scope.ROW;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected Scope scope = SCOPE_EDEFAULT;

	/**
	 * This is true if the Scope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scopeESet;

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
	 * The default value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected static final ValignType VALIGN_EDEFAULT = ValignType.TOP;

	/**
	 * The cached value of the '{@link #getValign() <em>Valign</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValign()
	 * @generated
	 * @ordered
	 */
	protected ValignType valign = VALIGN_EDEFAULT;

	/**
	 * This is true if the Valign attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valignESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TdTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.Literals.TD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbbr1() {
		return abbr1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbbr1(String newAbbr1) {
		String oldAbbr1 = abbr1;
		abbr1 = newAbbr1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TD_TYPE__ABBR1, oldAbbr1, abbr1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlignType getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(AlignType newAlign) {
		AlignType oldAlign = align;
		align = newAlign == null ? ALIGN_EDEFAULT : newAlign;
		boolean oldAlignESet = alignESet;
		alignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TD_TYPE__ALIGN, oldAlign, align, !oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAlign() {
		AlignType oldAlign = align;
		boolean oldAlignESet = alignESet;
		align = ALIGN_EDEFAULT;
		alignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.TD_TYPE__ALIGN, oldAlign, ALIGN_EDEFAULT, oldAlignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAlign() {
		return alignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(Object newAxis) {
		Object oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TD_TYPE__AXIS, oldAxis, axis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChar() {
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChar(String newChar) {
		String oldChar = char_;
		char_ = newChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TD_TYPE__CHAR, oldChar, char_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharoff() {
		return charoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharoff(String newCharoff) {
		String oldCharoff = charoff;
		charoff = newCharoff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TD_TYPE__CHAROFF, oldCharoff, charoff));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TD_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getColspan() {
		return colspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColspan(BigInteger newColspan) {
		BigInteger oldColspan = colspan;
		colspan = newColspan;
		boolean oldColspanESet = colspanESet;
		colspanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TD_TYPE__COLSPAN, oldColspan, colspan, !oldColspanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetColspan() {
		BigInteger oldColspan = colspan;
		boolean oldColspanESet = colspanESet;
		colspan = COLSPAN_EDEFAULT;
		colspanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.TD_TYPE__COLSPAN, oldColspan, COLSPAN_EDEFAULT, oldColspanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetColspan() {
		return colspanESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getHeaders() {
		return headers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaders(List<String> newHeaders) {
		List<String> oldHeaders = headers;
		headers = newHeaders;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TD_TYPE__HEADERS, oldHeaders, headers));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TD_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRowspan() {
		return rowspan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowspan(BigInteger newRowspan) {
		BigInteger oldRowspan = rowspan;
		rowspan = newRowspan;
		boolean oldRowspanESet = rowspanESet;
		rowspanESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TD_TYPE__ROWSPAN, oldRowspan, rowspan, !oldRowspanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRowspan() {
		BigInteger oldRowspan = rowspan;
		boolean oldRowspanESet = rowspanESet;
		rowspan = ROWSPAN_EDEFAULT;
		rowspanESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.TD_TYPE__ROWSPAN, oldRowspan, ROWSPAN_EDEFAULT, oldRowspanESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRowspan() {
		return rowspanESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Scope getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(Scope newScope) {
		Scope oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		boolean oldScopeESet = scopeESet;
		scopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TD_TYPE__SCOPE, oldScope, scope, !oldScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScope() {
		Scope oldScope = scope;
		boolean oldScopeESet = scopeESet;
		scope = SCOPE_EDEFAULT;
		scopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.TD_TYPE__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetScope() {
		return scopeESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TD_TYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TD_TYPE__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValignType getValign() {
		return valign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValign(ValignType newValign) {
		ValignType oldValign = valign;
		valign = newValign == null ? VALIGN_EDEFAULT : newValign;
		boolean oldValignESet = valignESet;
		valignESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.TD_TYPE__VALIGN, oldValign, valign, !oldValignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValign() {
		ValignType oldValign = valign;
		boolean oldValignESet = valignESet;
		valign = VALIGN_EDEFAULT;
		valignESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.TD_TYPE__VALIGN, oldValign, VALIGN_EDEFAULT, oldValignESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValign() {
		return valignESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case XhtmlPackage.TD_TYPE__ABBR1:
				return getAbbr1();
			case XhtmlPackage.TD_TYPE__ALIGN:
				return getAlign();
			case XhtmlPackage.TD_TYPE__AXIS:
				return getAxis();
			case XhtmlPackage.TD_TYPE__CHAR:
				return getChar();
			case XhtmlPackage.TD_TYPE__CHAROFF:
				return getCharoff();
			case XhtmlPackage.TD_TYPE__CLASS:
				return getClass_();
			case XhtmlPackage.TD_TYPE__COLSPAN:
				return getColspan();
			case XhtmlPackage.TD_TYPE__HEADERS:
				return getHeaders();
			case XhtmlPackage.TD_TYPE__ID:
				return getId();
			case XhtmlPackage.TD_TYPE__ROWSPAN:
				return getRowspan();
			case XhtmlPackage.TD_TYPE__SCOPE:
				return getScope();
			case XhtmlPackage.TD_TYPE__STYLE:
				return getStyle();
			case XhtmlPackage.TD_TYPE__TITLE:
				return getTitle();
			case XhtmlPackage.TD_TYPE__VALIGN:
				return getValign();
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
			case XhtmlPackage.TD_TYPE__ABBR1:
				setAbbr1((String)newValue);
				return;
			case XhtmlPackage.TD_TYPE__ALIGN:
				setAlign((AlignType)newValue);
				return;
			case XhtmlPackage.TD_TYPE__AXIS:
				setAxis(newValue);
				return;
			case XhtmlPackage.TD_TYPE__CHAR:
				setChar((String)newValue);
				return;
			case XhtmlPackage.TD_TYPE__CHAROFF:
				setCharoff((String)newValue);
				return;
			case XhtmlPackage.TD_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case XhtmlPackage.TD_TYPE__COLSPAN:
				setColspan((BigInteger)newValue);
				return;
			case XhtmlPackage.TD_TYPE__HEADERS:
				setHeaders((List<String>)newValue);
				return;
			case XhtmlPackage.TD_TYPE__ID:
				setId((String)newValue);
				return;
			case XhtmlPackage.TD_TYPE__ROWSPAN:
				setRowspan((BigInteger)newValue);
				return;
			case XhtmlPackage.TD_TYPE__SCOPE:
				setScope((Scope)newValue);
				return;
			case XhtmlPackage.TD_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case XhtmlPackage.TD_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case XhtmlPackage.TD_TYPE__VALIGN:
				setValign((ValignType)newValue);
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
			case XhtmlPackage.TD_TYPE__ABBR1:
				setAbbr1(ABBR1_EDEFAULT);
				return;
			case XhtmlPackage.TD_TYPE__ALIGN:
				unsetAlign();
				return;
			case XhtmlPackage.TD_TYPE__AXIS:
				setAxis(AXIS_EDEFAULT);
				return;
			case XhtmlPackage.TD_TYPE__CHAR:
				setChar(CHAR_EDEFAULT);
				return;
			case XhtmlPackage.TD_TYPE__CHAROFF:
				setCharoff(CHAROFF_EDEFAULT);
				return;
			case XhtmlPackage.TD_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case XhtmlPackage.TD_TYPE__COLSPAN:
				unsetColspan();
				return;
			case XhtmlPackage.TD_TYPE__HEADERS:
				setHeaders(HEADERS_EDEFAULT);
				return;
			case XhtmlPackage.TD_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case XhtmlPackage.TD_TYPE__ROWSPAN:
				unsetRowspan();
				return;
			case XhtmlPackage.TD_TYPE__SCOPE:
				unsetScope();
				return;
			case XhtmlPackage.TD_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case XhtmlPackage.TD_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case XhtmlPackage.TD_TYPE__VALIGN:
				unsetValign();
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
			case XhtmlPackage.TD_TYPE__ABBR1:
				return ABBR1_EDEFAULT == null ? abbr1 != null : !ABBR1_EDEFAULT.equals(abbr1);
			case XhtmlPackage.TD_TYPE__ALIGN:
				return isSetAlign();
			case XhtmlPackage.TD_TYPE__AXIS:
				return AXIS_EDEFAULT == null ? axis != null : !AXIS_EDEFAULT.equals(axis);
			case XhtmlPackage.TD_TYPE__CHAR:
				return CHAR_EDEFAULT == null ? char_ != null : !CHAR_EDEFAULT.equals(char_);
			case XhtmlPackage.TD_TYPE__CHAROFF:
				return CHAROFF_EDEFAULT == null ? charoff != null : !CHAROFF_EDEFAULT.equals(charoff);
			case XhtmlPackage.TD_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case XhtmlPackage.TD_TYPE__COLSPAN:
				return isSetColspan();
			case XhtmlPackage.TD_TYPE__HEADERS:
				return HEADERS_EDEFAULT == null ? headers != null : !HEADERS_EDEFAULT.equals(headers);
			case XhtmlPackage.TD_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case XhtmlPackage.TD_TYPE__ROWSPAN:
				return isSetRowspan();
			case XhtmlPackage.TD_TYPE__SCOPE:
				return isSetScope();
			case XhtmlPackage.TD_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case XhtmlPackage.TD_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case XhtmlPackage.TD_TYPE__VALIGN:
				return isSetValign();
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
		result.append(" (abbr1: ");
		result.append(abbr1);
		result.append(", align: ");
		if (alignESet) result.append(align); else result.append("<unset>");
		result.append(", axis: ");
		result.append(axis);
		result.append(", char: ");
		result.append(char_);
		result.append(", charoff: ");
		result.append(charoff);
		result.append(", class: ");
		result.append(class_);
		result.append(", colspan: ");
		if (colspanESet) result.append(colspan); else result.append("<unset>");
		result.append(", headers: ");
		result.append(headers);
		result.append(", id: ");
		result.append(id);
		result.append(", rowspan: ");
		if (rowspanESet) result.append(rowspan); else result.append("<unset>");
		result.append(", scope: ");
		if (scopeESet) result.append(scope); else result.append("<unset>");
		result.append(", style: ");
		result.append(style);
		result.append(", title: ");
		result.append(title);
		result.append(", valign: ");
		if (valignESet) result.append(valign); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TdTypeImpl
