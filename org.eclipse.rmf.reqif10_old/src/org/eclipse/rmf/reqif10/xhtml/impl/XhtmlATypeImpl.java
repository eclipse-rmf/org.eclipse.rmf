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

import org.eclipse.rmf.reqif10.xhtml.XhtmlAType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlBrType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlEditType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlEmType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlPackage;
import org.eclipse.rmf.reqif10.xhtml.XhtmlQType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlSampType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType;
import org.eclipse.rmf.reqif10.xhtml.XhtmlVarType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AType</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getXhtmlInlNoAnchorMix <em>Xhtml Inl No Anchor Mix</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getI <em>I</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getB <em>B</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getIns <em>Ins</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getDel <em>Del</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getAccesskey <em>Accesskey</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getCharset <em>Charset</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getHref <em>Href</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getHreflang <em>Hreflang</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getRel <em>Rel</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getRev <em>Rev</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getSpace <em>Space</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getTabindex <em>Tabindex</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XhtmlATypeImpl extends EObjectImpl implements XhtmlAType {
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
	 * The default value of the '{@link #getAccesskey() <em>Accesskey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesskey()
	 * @generated
	 * @ordered
	 */
	protected static final String ACCESSKEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAccesskey() <em>Accesskey</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccesskey()
	 * @generated
	 * @ordered
	 */
	protected String accesskey = ACCESSKEY_EDEFAULT;

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
	 * The default value of the '{@link #getTabindex() <em>Tabindex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabindex()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger TABINDEX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTabindex() <em>Tabindex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTabindex()
	 * @generated
	 * @ordered
	 */
	protected BigInteger tabindex = TABINDEX_EDEFAULT;

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
	protected XhtmlATypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.eINSTANCE.getXhtmlAType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XhtmlPackage.XHTML_ATYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getXhtmlInlNoAnchorMix() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XhtmlPackage.eINSTANCE.getXhtmlAType_XhtmlInlNoAnchorMix());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlBrType> getBr() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Br());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlSpanType> getSpan() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Span());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlEmType> getEm() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Em());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlStrongType> getStrong() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Strong());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlDfnType> getDfn() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Dfn());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlCodeType> getCode() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Code());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlSampType> getSamp() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Samp());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlKbdType> getKbd() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Kbd());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlVarType> getVar() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Var());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlCiteType> getCite() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Cite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlAbbrType> getAbbr() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Abbr());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlAcronymType> getAcronym() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Acronym());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlQType> getQ() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Q());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlInlPresType> getTt() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Tt());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlInlPresType> getI() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_I());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlInlPresType> getB() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_B());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlInlPresType> getBig() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Big());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlInlPresType> getSmall() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Small());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlInlPresType> getSub() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Sub());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlInlPresType> getSup() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Sup());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlObjectType> getObject() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Object());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlEditType> getIns() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Ins());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XhtmlEditType> getDel() {
		return getXhtmlInlNoAnchorMix().list(XhtmlPackage.eINSTANCE.getXhtmlAType_Del());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAccesskey() {
		return accesskey;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccesskey(String newAccesskey) {
		String oldAccesskey = accesskey;
		accesskey = newAccesskey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_ATYPE__ACCESSKEY, oldAccesskey, accesskey));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_ATYPE__CHARSET, oldCharset, charset));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_ATYPE__CLASS, oldClass, class_));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_ATYPE__HREF, oldHref, href));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_ATYPE__HREFLANG, oldHreflang, hreflang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_ATYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_ATYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_ATYPE__REL, oldRel, rel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_ATYPE__REV, oldRev, rev));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_ATYPE__SPACE, oldSpace, space, !oldSpaceESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.XHTML_ATYPE__SPACE, oldSpace, SPACE_EDEFAULT, oldSpaceESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_ATYPE__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getTabindex() {
		return tabindex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTabindex(BigInteger newTabindex) {
		BigInteger oldTabindex = tabindex;
		tabindex = newTabindex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_ATYPE__TABINDEX, oldTabindex, tabindex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_ATYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.XHTML_ATYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XhtmlPackage.XHTML_ATYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__XHTML_INL_NO_ANCHOR_MIX:
				return ((InternalEList<?>)getXhtmlInlNoAnchorMix()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__BR:
				return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__DFN:
				return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__SAMP:
				return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__KBD:
				return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__VAR:
				return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__CITE:
				return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__ABBR:
				return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__Q:
				return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__BIG:
				return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__SMALL:
				return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__INS:
				return ((InternalEList<?>)getIns()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.XHTML_ATYPE__DEL:
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
			case XhtmlPackage.XHTML_ATYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XhtmlPackage.XHTML_ATYPE__XHTML_INL_NO_ANCHOR_MIX:
				if (coreType) return getXhtmlInlNoAnchorMix();
				return ((FeatureMap.Internal)getXhtmlInlNoAnchorMix()).getWrapper();
			case XhtmlPackage.XHTML_ATYPE__BR:
				return getBr();
			case XhtmlPackage.XHTML_ATYPE__SPAN:
				return getSpan();
			case XhtmlPackage.XHTML_ATYPE__EM:
				return getEm();
			case XhtmlPackage.XHTML_ATYPE__STRONG:
				return getStrong();
			case XhtmlPackage.XHTML_ATYPE__DFN:
				return getDfn();
			case XhtmlPackage.XHTML_ATYPE__CODE:
				return getCode();
			case XhtmlPackage.XHTML_ATYPE__SAMP:
				return getSamp();
			case XhtmlPackage.XHTML_ATYPE__KBD:
				return getKbd();
			case XhtmlPackage.XHTML_ATYPE__VAR:
				return getVar();
			case XhtmlPackage.XHTML_ATYPE__CITE:
				return getCite();
			case XhtmlPackage.XHTML_ATYPE__ABBR:
				return getAbbr();
			case XhtmlPackage.XHTML_ATYPE__ACRONYM:
				return getAcronym();
			case XhtmlPackage.XHTML_ATYPE__Q:
				return getQ();
			case XhtmlPackage.XHTML_ATYPE__TT:
				return getTt();
			case XhtmlPackage.XHTML_ATYPE__I:
				return getI();
			case XhtmlPackage.XHTML_ATYPE__B:
				return getB();
			case XhtmlPackage.XHTML_ATYPE__BIG:
				return getBig();
			case XhtmlPackage.XHTML_ATYPE__SMALL:
				return getSmall();
			case XhtmlPackage.XHTML_ATYPE__SUB:
				return getSub();
			case XhtmlPackage.XHTML_ATYPE__SUP:
				return getSup();
			case XhtmlPackage.XHTML_ATYPE__OBJECT:
				return getObject();
			case XhtmlPackage.XHTML_ATYPE__INS:
				return getIns();
			case XhtmlPackage.XHTML_ATYPE__DEL:
				return getDel();
			case XhtmlPackage.XHTML_ATYPE__ACCESSKEY:
				return getAccesskey();
			case XhtmlPackage.XHTML_ATYPE__CHARSET:
				return getCharset();
			case XhtmlPackage.XHTML_ATYPE__CLASS:
				return getClass_();
			case XhtmlPackage.XHTML_ATYPE__HREF:
				return getHref();
			case XhtmlPackage.XHTML_ATYPE__HREFLANG:
				return getHreflang();
			case XhtmlPackage.XHTML_ATYPE__ID:
				return getId();
			case XhtmlPackage.XHTML_ATYPE__LANG:
				return getLang();
			case XhtmlPackage.XHTML_ATYPE__REL:
				return getRel();
			case XhtmlPackage.XHTML_ATYPE__REV:
				return getRev();
			case XhtmlPackage.XHTML_ATYPE__SPACE:
				return getSpace();
			case XhtmlPackage.XHTML_ATYPE__STYLE:
				return getStyle();
			case XhtmlPackage.XHTML_ATYPE__TABINDEX:
				return getTabindex();
			case XhtmlPackage.XHTML_ATYPE__TITLE:
				return getTitle();
			case XhtmlPackage.XHTML_ATYPE__TYPE:
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
			case XhtmlPackage.XHTML_ATYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__XHTML_INL_NO_ANCHOR_MIX:
				((FeatureMap.Internal)getXhtmlInlNoAnchorMix()).set(newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends XhtmlBrType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends XhtmlSpanType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends XhtmlEmType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends XhtmlStrongType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__DFN:
				getDfn().clear();
				getDfn().addAll((Collection<? extends XhtmlDfnType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends XhtmlCodeType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__SAMP:
				getSamp().clear();
				getSamp().addAll((Collection<? extends XhtmlSampType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__KBD:
				getKbd().clear();
				getKbd().addAll((Collection<? extends XhtmlKbdType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends XhtmlVarType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__CITE:
				getCite().clear();
				getCite().addAll((Collection<? extends XhtmlCiteType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__ABBR:
				getAbbr().clear();
				getAbbr().addAll((Collection<? extends XhtmlAbbrType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends XhtmlAcronymType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends XhtmlQType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends XhtmlInlPresType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__I:
				getI().clear();
				getI().addAll((Collection<? extends XhtmlInlPresType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__B:
				getB().clear();
				getB().addAll((Collection<? extends XhtmlInlPresType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__BIG:
				getBig().clear();
				getBig().addAll((Collection<? extends XhtmlInlPresType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__SMALL:
				getSmall().clear();
				getSmall().addAll((Collection<? extends XhtmlInlPresType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends XhtmlInlPresType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends XhtmlInlPresType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends XhtmlObjectType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__INS:
				getIns().clear();
				getIns().addAll((Collection<? extends XhtmlEditType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__DEL:
				getDel().clear();
				getDel().addAll((Collection<? extends XhtmlEditType>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__ACCESSKEY:
				setAccesskey((String)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__CHARSET:
				setCharset((String)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__CLASS:
				setClass((String)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__HREF:
				setHref((String)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__HREFLANG:
				setHreflang((String)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__ID:
				setId((String)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__LANG:
				setLang((String)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__REL:
				setRel((List<String>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__REV:
				setRev((List<String>)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__SPACE:
				setSpace((SpaceType)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__STYLE:
				setStyle((String)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__TABINDEX:
				setTabindex((BigInteger)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__TITLE:
				setTitle((String)newValue);
				return;
			case XhtmlPackage.XHTML_ATYPE__TYPE:
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
			case XhtmlPackage.XHTML_ATYPE__MIXED:
				getMixed().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__XHTML_INL_NO_ANCHOR_MIX:
				getXhtmlInlNoAnchorMix().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__BR:
				getBr().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__SPAN:
				getSpan().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__EM:
				getEm().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__STRONG:
				getStrong().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__DFN:
				getDfn().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__CODE:
				getCode().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__SAMP:
				getSamp().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__KBD:
				getKbd().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__VAR:
				getVar().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__CITE:
				getCite().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__ABBR:
				getAbbr().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__ACRONYM:
				getAcronym().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__Q:
				getQ().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__TT:
				getTt().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__I:
				getI().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__B:
				getB().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__BIG:
				getBig().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__SMALL:
				getSmall().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__SUB:
				getSub().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__SUP:
				getSup().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__OBJECT:
				getObject().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__INS:
				getIns().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__DEL:
				getDel().clear();
				return;
			case XhtmlPackage.XHTML_ATYPE__ACCESSKEY:
				setAccesskey(ACCESSKEY_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_ATYPE__CHARSET:
				setCharset(CHARSET_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_ATYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_ATYPE__HREF:
				setHref(HREF_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_ATYPE__HREFLANG:
				setHreflang(HREFLANG_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_ATYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_ATYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_ATYPE__REL:
				setRel(REL_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_ATYPE__REV:
				setRev(REV_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_ATYPE__SPACE:
				unsetSpace();
				return;
			case XhtmlPackage.XHTML_ATYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_ATYPE__TABINDEX:
				setTabindex(TABINDEX_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_ATYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case XhtmlPackage.XHTML_ATYPE__TYPE:
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
			case XhtmlPackage.XHTML_ATYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XhtmlPackage.XHTML_ATYPE__XHTML_INL_NO_ANCHOR_MIX:
				return !getXhtmlInlNoAnchorMix().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__BR:
				return !getBr().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__SPAN:
				return !getSpan().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__EM:
				return !getEm().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__STRONG:
				return !getStrong().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__DFN:
				return !getDfn().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__CODE:
				return !getCode().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__SAMP:
				return !getSamp().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__KBD:
				return !getKbd().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__VAR:
				return !getVar().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__CITE:
				return !getCite().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__ABBR:
				return !getAbbr().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__ACRONYM:
				return !getAcronym().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__Q:
				return !getQ().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__TT:
				return !getTt().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__I:
				return !getI().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__B:
				return !getB().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__BIG:
				return !getBig().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__SMALL:
				return !getSmall().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__SUB:
				return !getSub().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__SUP:
				return !getSup().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__OBJECT:
				return !getObject().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__INS:
				return !getIns().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__DEL:
				return !getDel().isEmpty();
			case XhtmlPackage.XHTML_ATYPE__ACCESSKEY:
				return ACCESSKEY_EDEFAULT == null ? accesskey != null : !ACCESSKEY_EDEFAULT.equals(accesskey);
			case XhtmlPackage.XHTML_ATYPE__CHARSET:
				return CHARSET_EDEFAULT == null ? charset != null : !CHARSET_EDEFAULT.equals(charset);
			case XhtmlPackage.XHTML_ATYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case XhtmlPackage.XHTML_ATYPE__HREF:
				return HREF_EDEFAULT == null ? href != null : !HREF_EDEFAULT.equals(href);
			case XhtmlPackage.XHTML_ATYPE__HREFLANG:
				return HREFLANG_EDEFAULT == null ? hreflang != null : !HREFLANG_EDEFAULT.equals(hreflang);
			case XhtmlPackage.XHTML_ATYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case XhtmlPackage.XHTML_ATYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case XhtmlPackage.XHTML_ATYPE__REL:
				return REL_EDEFAULT == null ? rel != null : !REL_EDEFAULT.equals(rel);
			case XhtmlPackage.XHTML_ATYPE__REV:
				return REV_EDEFAULT == null ? rev != null : !REV_EDEFAULT.equals(rev);
			case XhtmlPackage.XHTML_ATYPE__SPACE:
				return isSetSpace();
			case XhtmlPackage.XHTML_ATYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case XhtmlPackage.XHTML_ATYPE__TABINDEX:
				return TABINDEX_EDEFAULT == null ? tabindex != null : !TABINDEX_EDEFAULT.equals(tabindex);
			case XhtmlPackage.XHTML_ATYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case XhtmlPackage.XHTML_ATYPE__TYPE:
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", accesskey: ");
		result.append(accesskey);
		result.append(", charset: ");
		result.append(charset);
		result.append(", class: ");
		result.append(class_);
		result.append(", href: ");
		result.append(href);
		result.append(", hreflang: ");
		result.append(hreflang);
		result.append(", id: ");
		result.append(id);
		result.append(", lang: ");
		result.append(lang);
		result.append(", rel: ");
		result.append(rel);
		result.append(", rev: ");
		result.append(rev);
		result.append(", space: ");
		if (spaceESet) result.append(space); else result.append("<unset>");
		result.append(", style: ");
		result.append(style);
		result.append(", tabindex: ");
		result.append(tabindex);
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //XhtmlATypeImpl
