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

import java.math.BigInteger;

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

import org.eclipse.emf.ecore.xml.namespace.SpaceType;

import org.eclipse.rmf.reqif10.xhtml.AlignType;
import org.eclipse.rmf.reqif10.xhtml.ScopeType;
import org.eclipse.rmf.reqif10.xhtml.ValignType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlAType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlBrType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDivType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDlType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlEditType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlEmType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type;
import org.eclipse.rmf.reqif10.xhtml.XhtmlHrType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlOlType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPreType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlQType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlSampType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlTableType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlThType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlUlType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlVarType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Th Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getXhtmlFlowMix <em>Xhtml Flow Mix</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getH1 <em>H1</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getH2 <em>H2</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getH3 <em>H3</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getH4 <em>H4</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getH5 <em>H5</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getH6 <em>H6</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getDl <em>Dl</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getI <em>I</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getB <em>B</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getA <em>A</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getIns <em>Ins</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getDel <em>Del</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getAbbr1 <em>Abbr1</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getAxis <em>Axis</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getChar <em>Char</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getCharoff <em>Charoff</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getColspan <em>Colspan</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getHeaders <em>Headers</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl#getValign <em>Valign</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XhtmlThTypeImpl extends EObjectImpl implements XhtmlThType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

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
	protected static final String AXIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAxis() <em>Axis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxis()
	 * @generated
	 * @ordered
	 */
	protected String axis = AXIS_EDEFAULT;

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
	protected static final Object CHAROFF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharoff() <em>Charoff</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharoff()
	 * @generated
	 * @ordered
	 */
	protected Object charoff = CHAROFF_EDEFAULT;

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
	protected static final ScopeType SCOPE_EDEFAULT = ScopeType.ROW;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected ScopeType scope = SCOPE_EDEFAULT;

	/**
	 * This is true if the Scope attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean scopeESet;

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
	protected XhtmlThTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.eINSTANCE.getXhtmlThType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XhtmlPackage.XHTML_TH_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getXhtmlFlowMix() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XhtmlPackage.eINSTANCE.getXhtmlThType_XhtmlFlowMix());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlH1Type> getH1() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_H1());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlH2Type> getH2() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_H2());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlH3Type> getH3() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_H3());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlH4Type> getH4() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_H4());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlH5Type> getH5() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_H5());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlH6Type> getH6() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_H6());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlUlType> getUl() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Ul());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlOlType> getOl() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Ol());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlDlType> getDl() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Dl());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlPType> getP() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_P());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlDivType> getDiv() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Div());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlPreType> getPre() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Pre());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlBlockquoteType> getBlockquote() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Blockquote());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlAddressType> getAddress() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Address());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlHrType> getHr() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Hr());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlTableType> getTable() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Table());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlBrType> getBr() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Br());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlSpanType> getSpan() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Span());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlEmType> getEm() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Em());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlStrongType> getStrong() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Strong());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlDfnType> getDfn() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Dfn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlCodeType> getCode() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlSampType> getSamp() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Samp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlKbdType> getKbd() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Kbd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlVarType> getVar() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Var());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlCiteType> getCite() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Cite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlAbbrType> getAbbr() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Abbr());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlAcronymType> getAcronym() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Acronym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlQType> getQ() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Q());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlInlPresType> getTt() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Tt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlInlPresType> getI() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_I());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlInlPresType> getB() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_B());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlInlPresType> getBig() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Big());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlInlPresType> getSmall() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Small());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlInlPresType> getSub() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlInlPresType> getSup() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlAType> getA() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_A());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlObjectType> getObject() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Object());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlEditType> getIns() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Ins());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlEditType> getDel() {
		return getXhtmlFlowMix().list(XhtmlPackage.eINSTANCE.getXhtmlThType_Del());
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TH_TYPE__ABBR1, oldAbbr1, abbr1));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TH_TYPE__ALIGN, oldAlign, align, !oldAlignESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.XHTML_TH_TYPE__ALIGN, oldAlign, ALIGN_EDEFAULT, oldAlignESet));
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
	public String getAxis() {
		return axis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxis(String newAxis) {
		String oldAxis = axis;
		axis = newAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TH_TYPE__AXIS, oldAxis, axis));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TH_TYPE__CHAR, oldChar, char_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getCharoff() {
		return charoff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharoff(Object newCharoff) {
		Object oldCharoff = charoff;
		charoff = newCharoff;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TH_TYPE__CHAROFF, oldCharoff, charoff));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TH_TYPE__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TH_TYPE__COLSPAN, oldColspan, colspan, !oldColspanESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.XHTML_TH_TYPE__COLSPAN, oldColspan, COLSPAN_EDEFAULT, oldColspanESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TH_TYPE__HEADERS, oldHeaders, headers));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TH_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TH_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TH_TYPE__ROWSPAN, oldRowspan, rowspan, !oldRowspanESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.XHTML_TH_TYPE__ROWSPAN, oldRowspan, ROWSPAN_EDEFAULT, oldRowspanESet));
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
	public ScopeType getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(ScopeType newScope) {
		ScopeType oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		boolean oldScopeESet = scopeESet;
		scopeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TH_TYPE__SCOPE, oldScope, scope, !oldScopeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetScope() {
		ScopeType oldScope = scope;
		boolean oldScopeESet = scopeESet;
		scope = SCOPE_EDEFAULT;
		scopeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.XHTML_TH_TYPE__SCOPE, oldScope, SCOPE_EDEFAULT, oldScopeESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TH_TYPE__SPACE, oldSpace, space, !oldSpaceESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.XHTML_TH_TYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TH_TYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TH_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_TH_TYPE__VALIGN, oldValign, valign, !oldValignESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.XHTML_TH_TYPE__VALIGN, oldValign, VALIGN_EDEFAULT, oldValignESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XhtmlPackage.XHTML_TH_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__XHTML_FLOW_MIX:
				return ((InternalEList<?>)getXhtmlFlowMix()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__H1:
				return ((InternalEList<?>)getH1()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__H2:
				return ((InternalEList<?>)getH2()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__H3:
				return ((InternalEList<?>)getH3()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__H4:
				return ((InternalEList<?>)getH4()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__H5:
				return ((InternalEList<?>)getH5()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__H6:
				return ((InternalEList<?>)getH6()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__UL:
				return ((InternalEList<?>)getUl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__OL:
				return ((InternalEList<?>)getOl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__DL:
				return ((InternalEList<?>)getDl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__DIV:
				return ((InternalEList<?>)getDiv()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__PRE:
				return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__BLOCKQUOTE:
				return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__HR:
				return ((InternalEList<?>)getHr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__BR:
				return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__DFN:
				return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__SAMP:
				return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__KBD:
				return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__VAR:
				return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__CITE:
				return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__ABBR:
				return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__Q:
				return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__BIG:
				return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__SMALL:
				return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__INS:
				return ((InternalEList<?>)getIns()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_TH_TYPE__DEL:
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
			case XhtmlPackage.XHTML_TH_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XhtmlPackage.XHTML_TH_TYPE__XHTML_FLOW_MIX:
				if (coreType) return getXhtmlFlowMix();
				return ((FeatureMap.Internal)getXhtmlFlowMix()).getWrapper();
			case XhtmlPackage.XHTML_TH_TYPE__H1:
				return getH1();
			case XhtmlPackage.XHTML_TH_TYPE__H2:
				return getH2();
			case XhtmlPackage.XHTML_TH_TYPE__H3:
				return getH3();
			case XhtmlPackage.XHTML_TH_TYPE__H4:
				return getH4();
			case XhtmlPackage.XHTML_TH_TYPE__H5:
				return getH5();
			case XhtmlPackage.XHTML_TH_TYPE__H6:
				return getH6();
			case XhtmlPackage.XHTML_TH_TYPE__UL:
				return getUl();
			case XhtmlPackage.XHTML_TH_TYPE__OL:
				return getOl();
			case XhtmlPackage.XHTML_TH_TYPE__DL:
				return getDl();
			case XhtmlPackage.XHTML_TH_TYPE__P:
				return getP();
			case XhtmlPackage.XHTML_TH_TYPE__DIV:
				return getDiv();
			case XhtmlPackage.XHTML_TH_TYPE__PRE:
				return getPre();
			case XhtmlPackage.XHTML_TH_TYPE__BLOCKQUOTE:
				return getBlockquote();
			case XhtmlPackage.XHTML_TH_TYPE__ADDRESS:
				return getAddress();
			case XhtmlPackage.XHTML_TH_TYPE__HR:
				return getHr();
			case XhtmlPackage.XHTML_TH_TYPE__TABLE:
				return getTable();
			case XhtmlPackage.XHTML_TH_TYPE__BR:
				return getBr();
			case XhtmlPackage.XHTML_TH_TYPE__SPAN:
				return getSpan();
			case XhtmlPackage.XHTML_TH_TYPE__EM:
				return getEm();
			case XhtmlPackage.XHTML_TH_TYPE__STRONG:
				return getStrong();
			case XhtmlPackage.XHTML_TH_TYPE__DFN:
				return getDfn();
			case XhtmlPackage.XHTML_TH_TYPE__CODE:
				return getCode();
			case XhtmlPackage.XHTML_TH_TYPE__SAMP:
				return getSamp();
			case XhtmlPackage.XHTML_TH_TYPE__KBD:
				return getKbd();
			case XhtmlPackage.XHTML_TH_TYPE__VAR:
				return getVar();
			case XhtmlPackage.XHTML_TH_TYPE__CITE:
				return getCite();
			case XhtmlPackage.XHTML_TH_TYPE__ABBR:
				return getAbbr();
			case XhtmlPackage.XHTML_TH_TYPE__ACRONYM:
				return getAcronym();
			case XhtmlPackage.XHTML_TH_TYPE__Q:
				return getQ();
			case XhtmlPackage.XHTML_TH_TYPE__TT:
				return getTt();
			case XhtmlPackage.XHTML_TH_TYPE__I:
				return getI();
			case XhtmlPackage.XHTML_TH_TYPE__B:
				return getB();
			case XhtmlPackage.XHTML_TH_TYPE__BIG:
				return getBig();
			case XhtmlPackage.XHTML_TH_TYPE__SMALL:
				return getSmall();
			case XhtmlPackage.XHTML_TH_TYPE__SUB:
				return getSub();
			case XhtmlPackage.XHTML_TH_TYPE__SUP:
				return getSup();
			case XhtmlPackage.XHTML_TH_TYPE__A:
				return getA();
			case XhtmlPackage.XHTML_TH_TYPE__OBJECT:
				return getObject();
			case XhtmlPackage.XHTML_TH_TYPE__INS:
				return getIns();
			case XhtmlPackage.XHTML_TH_TYPE__DEL:
				return getDel();
			case XhtmlPackage.XHTML_TH_TYPE__ABBR1:
				return getAbbr1();
			case XhtmlPackage.XHTML_TH_TYPE__ALIGN:
				return getAlign();
			case XhtmlPackage.XHTML_TH_TYPE__AXIS:
				return getAxis();
			case XhtmlPackage.XHTML_TH_TYPE__CHAR:
				return getChar();
			case XhtmlPackage.XHTML_TH_TYPE__CHAROFF:
				return getCharoff();
			case XhtmlPackage.XHTML_TH_TYPE__CLASS:
				return getClass_();
			case XhtmlPackage.XHTML_TH_TYPE__COLSPAN:
				return getColspan();
			case XhtmlPackage.XHTML_TH_TYPE__HEADERS:
				return getHeaders();
			case XhtmlPackage.XHTML_TH_TYPE__ID:
				return getId();
			case XhtmlPackage.XHTML_TH_TYPE__LANG:
				return getLang();
			case XhtmlPackage.XHTML_TH_TYPE__ROWSPAN:
				return getRowspan();
			case XhtmlPackage.XHTML_TH_TYPE__SCOPE:
				return getScope();
			case XhtmlPackage.XHTML_TH_TYPE__SPACE:
				return getSpace();
			case XhtmlPackage.XHTML_TH_TYPE__STYLE:
				return getStyle();
			case XhtmlPackage.XHTML_TH_TYPE__TITLE:
				return getTitle();
			case XhtmlPackage.XHTML_TH_TYPE__VALIGN:
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
			case XhtmlPackage.XHTML_TH_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__XHTML_FLOW_MIX:
				((FeatureMap.Internal)getXhtmlFlowMix()).set(newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__H1:
				getH1().clear();
				getH1().addAll((Collection<? extends XhtmlH1Type>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__H2:
				getH2().clear();
				getH2().addAll((Collection<? extends XhtmlH2Type>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__H3:
				getH3().clear();
				getH3().addAll((Collection<? extends XhtmlH3Type>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__H4:
				getH4().clear();
				getH4().addAll((Collection<? extends XhtmlH4Type>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__H5:
				getH5().clear();
				getH5().addAll((Collection<? extends XhtmlH5Type>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__H6:
				getH6().clear();
				getH6().addAll((Collection<? extends XhtmlH6Type>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__UL:
				getUl().clear();
				getUl().addAll((Collection<? extends XhtmlUlType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__OL:
				getOl().clear();
				getOl().addAll((Collection<? extends XhtmlOlType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__DL:
				getDl().clear();
				getDl().addAll((Collection<? extends XhtmlDlType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends XhtmlPType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__DIV:
				getDiv().clear();
				getDiv().addAll((Collection<? extends XhtmlDivType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__PRE:
				getPre().clear();
				getPre().addAll((Collection<? extends XhtmlPreType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__BLOCKQUOTE:
				getBlockquote().clear();
				getBlockquote().addAll((Collection<? extends XhtmlBlockquoteType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends XhtmlAddressType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__HR:
				getHr().clear();
				getHr().addAll((Collection<? extends XhtmlHrType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends XhtmlTableType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends XhtmlBrType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends XhtmlSpanType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends XhtmlEmType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends XhtmlStrongType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__DFN:
				getDfn().clear();
				getDfn().addAll((Collection<? extends XhtmlDfnType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends XhtmlCodeType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__SAMP:
				getSamp().clear();
				getSamp().addAll((Collection<? extends XhtmlSampType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__KBD:
				getKbd().clear();
				getKbd().addAll((Collection<? extends XhtmlKbdType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends XhtmlVarType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__CITE:
				getCite().clear();
				getCite().addAll((Collection<? extends XhtmlCiteType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__ABBR:
				getAbbr().clear();
				getAbbr().addAll((Collection<? extends XhtmlAbbrType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends XhtmlAcronymType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends XhtmlQType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends XhtmlInlPresType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__I:
				getI().clear();
				getI().addAll((Collection<? extends XhtmlInlPresType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__B:
				getB().clear();
				getB().addAll((Collection<? extends XhtmlInlPresType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__BIG:
				getBig().clear();
				getBig().addAll((Collection<? extends XhtmlInlPresType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__SMALL:
				getSmall().clear();
				getSmall().addAll((Collection<? extends XhtmlInlPresType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends XhtmlInlPresType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends XhtmlInlPresType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__A:
				getA().clear();
				getA().addAll((Collection<? extends XhtmlAType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends XhtmlObjectType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__INS:
				getIns().clear();
				getIns().addAll((Collection<? extends XhtmlEditType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__DEL:
				getDel().clear();
				getDel().addAll((Collection<? extends XhtmlEditType>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__ABBR1:
				setAbbr1((String)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__ALIGN:
				setAlign((AlignType)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__AXIS:
				setAxis((String)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__CHAR:
				setChar((String)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__CHAROFF:
				setCharoff(newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__CLASS:
				setClass((String)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__COLSPAN:
				setColspan((BigInteger)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__HEADERS:
				setHeaders((List<String>)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__ID:
				setId((String)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__LANG:
				setLang((String)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__ROWSPAN:
				setRowspan((BigInteger)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__SCOPE:
				setScope((ScopeType)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__SPACE:
				setSpace((SpaceType)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__VALIGN:
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
			case XhtmlPackage.XHTML_TH_TYPE__MIXED:
				getMixed().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__XHTML_FLOW_MIX:
				getXhtmlFlowMix().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__H1:
				getH1().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__H2:
				getH2().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__H3:
				getH3().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__H4:
				getH4().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__H5:
				getH5().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__H6:
				getH6().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__UL:
				getUl().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__OL:
				getOl().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__DL:
				getDl().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__P:
				getP().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__DIV:
				getDiv().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__PRE:
				getPre().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__BLOCKQUOTE:
				getBlockquote().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__HR:
				getHr().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__TABLE:
				getTable().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__BR:
				getBr().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__SPAN:
				getSpan().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__EM:
				getEm().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__STRONG:
				getStrong().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__DFN:
				getDfn().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__CODE:
				getCode().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__SAMP:
				getSamp().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__KBD:
				getKbd().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__VAR:
				getVar().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__CITE:
				getCite().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__ABBR:
				getAbbr().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__ACRONYM:
				getAcronym().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__Q:
				getQ().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__TT:
				getTt().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__I:
				getI().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__B:
				getB().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__BIG:
				getBig().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__SMALL:
				getSmall().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__SUB:
				getSub().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__SUP:
				getSup().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__A:
				getA().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__OBJECT:
				getObject().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__INS:
				getIns().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__DEL:
				getDel().clear();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__ABBR1:
				setAbbr1(ABBR1_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__ALIGN:
				unsetAlign();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__AXIS:
				setAxis(AXIS_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__CHAR:
				setChar(CHAR_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__CHAROFF:
				setCharoff(CHAROFF_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__COLSPAN:
				unsetColspan();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__HEADERS:
				setHeaders(HEADERS_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__ROWSPAN:
				unsetRowspan();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__SCOPE:
				unsetScope();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__SPACE:
				unsetSpace();
				return;
			case XhtmlPackage.XHTML_TH_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_TH_TYPE__VALIGN:
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
			case XhtmlPackage.XHTML_TH_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__XHTML_FLOW_MIX:
				return !getXhtmlFlowMix().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__H1:
				return !getH1().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__H2:
				return !getH2().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__H3:
				return !getH3().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__H4:
				return !getH4().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__H5:
				return !getH5().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__H6:
				return !getH6().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__UL:
				return !getUl().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__OL:
				return !getOl().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__DL:
				return !getDl().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__P:
				return !getP().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__DIV:
				return !getDiv().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__PRE:
				return !getPre().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__BLOCKQUOTE:
				return !getBlockquote().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__HR:
				return !getHr().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__TABLE:
				return !getTable().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__BR:
				return !getBr().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__SPAN:
				return !getSpan().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__EM:
				return !getEm().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__STRONG:
				return !getStrong().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__DFN:
				return !getDfn().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__CODE:
				return !getCode().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__SAMP:
				return !getSamp().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__KBD:
				return !getKbd().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__VAR:
				return !getVar().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__CITE:
				return !getCite().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__ABBR:
				return !getAbbr().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__ACRONYM:
				return !getAcronym().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__Q:
				return !getQ().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__TT:
				return !getTt().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__I:
				return !getI().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__B:
				return !getB().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__BIG:
				return !getBig().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__SMALL:
				return !getSmall().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__SUB:
				return !getSub().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__SUP:
				return !getSup().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__A:
				return !getA().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__OBJECT:
				return !getObject().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__INS:
				return !getIns().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__DEL:
				return !getDel().isEmpty();
			case XhtmlPackage.XHTML_TH_TYPE__ABBR1:
				return ABBR1_EDEFAULT == null ? abbr1 != null : !ABBR1_EDEFAULT.equals(abbr1);
			case XhtmlPackage.XHTML_TH_TYPE__ALIGN:
				return isSetAlign();
			case XhtmlPackage.XHTML_TH_TYPE__AXIS:
				return AXIS_EDEFAULT == null ? axis != null : !AXIS_EDEFAULT.equals(axis);
			case XhtmlPackage.XHTML_TH_TYPE__CHAR:
				return CHAR_EDEFAULT == null ? char_ != null : !CHAR_EDEFAULT.equals(char_);
			case XhtmlPackage.XHTML_TH_TYPE__CHAROFF:
				return CHAROFF_EDEFAULT == null ? charoff != null : !CHAROFF_EDEFAULT.equals(charoff);
			case XhtmlPackage.XHTML_TH_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case XhtmlPackage.XHTML_TH_TYPE__COLSPAN:
				return isSetColspan();
			case XhtmlPackage.XHTML_TH_TYPE__HEADERS:
				return HEADERS_EDEFAULT == null ? headers != null : !HEADERS_EDEFAULT.equals(headers);
			case XhtmlPackage.XHTML_TH_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case XhtmlPackage.XHTML_TH_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case XhtmlPackage.XHTML_TH_TYPE__ROWSPAN:
				return isSetRowspan();
			case XhtmlPackage.XHTML_TH_TYPE__SCOPE:
				return isSetScope();
			case XhtmlPackage.XHTML_TH_TYPE__SPACE:
				return isSetSpace();
			case XhtmlPackage.XHTML_TH_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case XhtmlPackage.XHTML_TH_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case XhtmlPackage.XHTML_TH_TYPE__VALIGN:
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", abbr1: ");
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
		result.append(", lang: ");
		result.append(lang);
		result.append(", rowspan: ");
		if (rowspanESet) result.append(rowspan); else result.append("<unset>");
		result.append(", scope: ");
		if (scopeESet) result.append(scope); else result.append("<unset>");
		result.append(", space: ");
		if (spaceESet) result.append(space); else result.append("<unset>");
		result.append(", style: ");
		result.append(style);
		result.append(", title: ");
		result.append(title);
		result.append(", valign: ");
		if (valignESet) result.append(valign); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //XhtmlThTypeImpl
