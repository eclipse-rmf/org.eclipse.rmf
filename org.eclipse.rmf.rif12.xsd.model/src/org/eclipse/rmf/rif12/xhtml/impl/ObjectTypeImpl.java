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
import org.eclipse.rmf.rif12.xhtml.AType;
import org.eclipse.rmf.rif12.xhtml.AbbrType;
import org.eclipse.rmf.rif12.xhtml.AcronymType;
import org.eclipse.rmf.rif12.xhtml.AddressType;
import org.eclipse.rmf.rif12.xhtml.BType;
import org.eclipse.rmf.rif12.xhtml.BigType;
import org.eclipse.rmf.rif12.xhtml.BlockquoteType;
import org.eclipse.rmf.rif12.xhtml.BrType;
import org.eclipse.rmf.rif12.xhtml.CiteType;
import org.eclipse.rmf.rif12.xhtml.CodeType;
import org.eclipse.rmf.rif12.xhtml.DeclareType;
import org.eclipse.rmf.rif12.xhtml.DelType;
import org.eclipse.rmf.rif12.xhtml.DfnType;
import org.eclipse.rmf.rif12.xhtml.DivType;
import org.eclipse.rmf.rif12.xhtml.DlType;
import org.eclipse.rmf.rif12.xhtml.EmType;
import org.eclipse.rmf.rif12.xhtml.H1Type;
import org.eclipse.rmf.rif12.xhtml.H2Type;
import org.eclipse.rmf.rif12.xhtml.H3Type;
import org.eclipse.rmf.rif12.xhtml.H4Type;
import org.eclipse.rmf.rif12.xhtml.H5Type;
import org.eclipse.rmf.rif12.xhtml.H6Type;
import org.eclipse.rmf.rif12.xhtml.HrType;
import org.eclipse.rmf.rif12.xhtml.IType;
import org.eclipse.rmf.rif12.xhtml.ImgType;
import org.eclipse.rmf.rif12.xhtml.InsType;
import org.eclipse.rmf.rif12.xhtml.KbdType;
import org.eclipse.rmf.rif12.xhtml.ObjectType;
import org.eclipse.rmf.rif12.xhtml.OlType;
import org.eclipse.rmf.rif12.xhtml.PType;
import org.eclipse.rmf.rif12.xhtml.ParamType;
import org.eclipse.rmf.rif12.xhtml.PreType;
import org.eclipse.rmf.rif12.xhtml.QType;
import org.eclipse.rmf.rif12.xhtml.SampType;
import org.eclipse.rmf.rif12.xhtml.SmallType;
import org.eclipse.rmf.rif12.xhtml.SpanType;
import org.eclipse.rmf.rif12.xhtml.StrikeType;
import org.eclipse.rmf.rif12.xhtml.StrongType;
import org.eclipse.rmf.rif12.xhtml.SubType;
import org.eclipse.rmf.rif12.xhtml.SupType;
import org.eclipse.rmf.rif12.xhtml.TableType;
import org.eclipse.rmf.rif12.xhtml.TtType;
import org.eclipse.rmf.rif12.xhtml.UType;
import org.eclipse.rmf.rif12.xhtml.UlType;
import org.eclipse.rmf.rif12.xhtml.VarType;
import org.eclipse.rmf.rif12.xhtml.XhtmlPackage;


/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getParam <em>Param</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getP <em>P</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getH1 <em>H1</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getH2 <em>H2</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getH3 <em>H3</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getH4 <em>H4</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getH5 <em>H5</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getH6 <em>H6</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getDiv <em>Div</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getUl <em>Ul</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getOl <em>Ol</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getDl <em>Dl</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getPre <em>Pre</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getHr <em>Hr</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getBlockquote <em>Blockquote</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getTable <em>Table</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getA <em>A</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getBr <em>Br</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getSpan <em>Span</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getObject <em>Object</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getImg <em>Img</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getTt <em>Tt</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getI <em>I</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getB <em>B</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getBig <em>Big</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getSmall <em>Small</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getU <em>U</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getStrike <em>Strike</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getEm <em>Em</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getStrong <em>Strong</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getDfn <em>Dfn</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getCode <em>Code</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getSamp <em>Samp</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getKbd <em>Kbd</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getVar <em>Var</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getCite <em>Cite</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getAbbr <em>Abbr</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getAcronym <em>Acronym</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getSub <em>Sub</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getSup <em>Sup</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getIns <em>Ins</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getDel <em>Del</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getArchive <em>Archive</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getClassid <em>Classid</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getCodebase <em>Codebase</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getCodetype <em>Codetype</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getData <em>Data</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getDeclare <em>Declare</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getStandby <em>Standby</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getTabindex <em>Tabindex</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getUsemap <em>Usemap</em>}</li>
 *   <li>{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl#getWidth <em>Width</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ObjectTypeImpl extends EObjectImpl implements ObjectType {
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
	 * The default value of the '{@link #getArchive() <em>Archive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchive()
	 * @generated
	 * @ordered
	 */
	protected static final String ARCHIVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getArchive() <em>Archive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArchive()
	 * @generated
	 * @ordered
	 */
	protected String archive = ARCHIVE_EDEFAULT;

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
	 * The default value of the '{@link #getClassid() <em>Classid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassid()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASSID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassid() <em>Classid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassid()
	 * @generated
	 * @ordered
	 */
	protected String classid = CLASSID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodebase() <em>Codebase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodebase()
	 * @generated
	 * @ordered
	 */
	protected static final String CODEBASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodebase() <em>Codebase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodebase()
	 * @generated
	 * @ordered
	 */
	protected String codebase = CODEBASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodetype() <em>Codetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodetype()
	 * @generated
	 * @ordered
	 */
	protected static final String CODETYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodetype() <em>Codetype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodetype()
	 * @generated
	 * @ordered
	 */
	protected String codetype = CODETYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected String data = DATA_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeclare() <em>Declare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclare()
	 * @generated
	 * @ordered
	 */
	protected static final DeclareType DECLARE_EDEFAULT = DeclareType.DECLARE;

	/**
	 * The cached value of the '{@link #getDeclare() <em>Declare</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclare()
	 * @generated
	 * @ordered
	 */
	protected DeclareType declare = DECLARE_EDEFAULT;

	/**
	 * This is true if the Declare attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean declareESet;

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
	 * The default value of the '{@link #getStandby() <em>Standby</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandby()
	 * @generated
	 * @ordered
	 */
	protected static final String STANDBY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStandby() <em>Standby</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStandby()
	 * @generated
	 * @ordered
	 */
	protected String standby = STANDBY_EDEFAULT;

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
	protected ObjectTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return XhtmlPackage.Literals.OBJECT_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, XhtmlPackage.OBJECT_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(XhtmlPackage.Literals.OBJECT_TYPE__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamType> getParam() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__PARAM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PType> getP() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__P);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H1Type> getH1() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__H1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H2Type> getH2() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__H2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H3Type> getH3() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__H3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H4Type> getH4() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__H4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H5Type> getH5() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__H5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<H6Type> getH6() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__H6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DivType> getDiv() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__DIV);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UlType> getUl() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__UL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OlType> getOl() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__OL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DlType> getDl() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__DL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PreType> getPre() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__PRE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HrType> getHr() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__HR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BlockquoteType> getBlockquote() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__BLOCKQUOTE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AddressType> getAddress() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__ADDRESS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TableType> getTable() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__TABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AType> getA() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__A);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BrType> getBr() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__BR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpanType> getSpan() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__SPAN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ObjectType> getObject() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__OBJECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ImgType> getImg() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__IMG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TtType> getTt() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__TT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IType> getI() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__I);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BType> getB() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__B);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BigType> getBig() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__BIG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SmallType> getSmall() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__SMALL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UType> getU() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__U);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StrikeType> getStrike() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__STRIKE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmType> getEm() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__EM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StrongType> getStrong() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__STRONG);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DfnType> getDfn() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__DFN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CodeType> getCode() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__CODE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<QType> getQ() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__Q);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SampType> getSamp() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__SAMP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KbdType> getKbd() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__KBD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarType> getVar() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__VAR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CiteType> getCite() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__CITE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbbrType> getAbbr() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__ABBR);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AcronymType> getAcronym() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__ACRONYM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SubType> getSub() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__SUB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SupType> getSup() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__SUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InsType> getIns() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__INS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DelType> getDel() {
		return getGroup().list(XhtmlPackage.Literals.OBJECT_TYPE__DEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getArchive() {
		return archive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArchive(String newArchive) {
		String oldArchive = archive;
		archive = newArchive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.OBJECT_TYPE__ARCHIVE, oldArchive, archive));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.OBJECT_TYPE__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassid() {
		return classid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassid(String newClassid) {
		String oldClassid = classid;
		classid = newClassid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.OBJECT_TYPE__CLASSID, oldClassid, classid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodebase() {
		return codebase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodebase(String newCodebase) {
		String oldCodebase = codebase;
		codebase = newCodebase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.OBJECT_TYPE__CODEBASE, oldCodebase, codebase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodetype() {
		return codetype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodetype(String newCodetype) {
		String oldCodetype = codetype;
		codetype = newCodetype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.OBJECT_TYPE__CODETYPE, oldCodetype, codetype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getData() {
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setData(String newData) {
		String oldData = data;
		data = newData;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.OBJECT_TYPE__DATA, oldData, data));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeclareType getDeclare() {
		return declare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclare(DeclareType newDeclare) {
		DeclareType oldDeclare = declare;
		declare = newDeclare == null ? DECLARE_EDEFAULT : newDeclare;
		boolean oldDeclareESet = declareESet;
		declareESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.OBJECT_TYPE__DECLARE, oldDeclare, declare, !oldDeclareESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDeclare() {
		DeclareType oldDeclare = declare;
		boolean oldDeclareESet = declareESet;
		declare = DECLARE_EDEFAULT;
		declareESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, XhtmlPackage.OBJECT_TYPE__DECLARE, oldDeclare, DECLARE_EDEFAULT, oldDeclareESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeclare() {
		return declareESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.OBJECT_TYPE__HEIGHT, oldHeight, height));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.OBJECT_TYPE__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.OBJECT_TYPE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStandby() {
		return standby;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStandby(String newStandby) {
		String oldStandby = standby;
		standby = newStandby;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.OBJECT_TYPE__STANDBY, oldStandby, standby));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.OBJECT_TYPE__STYLE, oldStyle, style));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.OBJECT_TYPE__TABINDEX, oldTabindex, tabindex));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.OBJECT_TYPE__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.OBJECT_TYPE__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.OBJECT_TYPE__USEMAP, oldUsemap, usemap));
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
			eNotify(new ENotificationImpl(this, Notification.SET, XhtmlPackage.OBJECT_TYPE__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case XhtmlPackage.OBJECT_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__PARAM:
				return ((InternalEList<?>)getParam()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__P:
				return ((InternalEList<?>)getP()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__H1:
				return ((InternalEList<?>)getH1()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__H2:
				return ((InternalEList<?>)getH2()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__H3:
				return ((InternalEList<?>)getH3()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__H4:
				return ((InternalEList<?>)getH4()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__H5:
				return ((InternalEList<?>)getH5()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__H6:
				return ((InternalEList<?>)getH6()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__DIV:
				return ((InternalEList<?>)getDiv()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__UL:
				return ((InternalEList<?>)getUl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__OL:
				return ((InternalEList<?>)getOl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__DL:
				return ((InternalEList<?>)getDl()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__PRE:
				return ((InternalEList<?>)getPre()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__HR:
				return ((InternalEList<?>)getHr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__BLOCKQUOTE:
				return ((InternalEList<?>)getBlockquote()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__ADDRESS:
				return ((InternalEList<?>)getAddress()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__TABLE:
				return ((InternalEList<?>)getTable()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__A:
				return ((InternalEList<?>)getA()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__BR:
				return ((InternalEList<?>)getBr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__SPAN:
				return ((InternalEList<?>)getSpan()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__OBJECT:
				return ((InternalEList<?>)getObject()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__IMG:
				return ((InternalEList<?>)getImg()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__TT:
				return ((InternalEList<?>)getTt()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__I:
				return ((InternalEList<?>)getI()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__B:
				return ((InternalEList<?>)getB()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__BIG:
				return ((InternalEList<?>)getBig()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__SMALL:
				return ((InternalEList<?>)getSmall()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__U:
				return ((InternalEList<?>)getU()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__STRIKE:
				return ((InternalEList<?>)getStrike()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__EM:
				return ((InternalEList<?>)getEm()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__STRONG:
				return ((InternalEList<?>)getStrong()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__DFN:
				return ((InternalEList<?>)getDfn()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__CODE:
				return ((InternalEList<?>)getCode()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__Q:
				return ((InternalEList<?>)getQ()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__SAMP:
				return ((InternalEList<?>)getSamp()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__KBD:
				return ((InternalEList<?>)getKbd()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__VAR:
				return ((InternalEList<?>)getVar()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__CITE:
				return ((InternalEList<?>)getCite()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__ABBR:
				return ((InternalEList<?>)getAbbr()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__ACRONYM:
				return ((InternalEList<?>)getAcronym()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__SUB:
				return ((InternalEList<?>)getSub()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__SUP:
				return ((InternalEList<?>)getSup()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__INS:
				return ((InternalEList<?>)getIns()).basicRemove(otherEnd, msgs);
			case XhtmlPackage.OBJECT_TYPE__DEL:
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
			case XhtmlPackage.OBJECT_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case XhtmlPackage.OBJECT_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case XhtmlPackage.OBJECT_TYPE__PARAM:
				return getParam();
			case XhtmlPackage.OBJECT_TYPE__P:
				return getP();
			case XhtmlPackage.OBJECT_TYPE__H1:
				return getH1();
			case XhtmlPackage.OBJECT_TYPE__H2:
				return getH2();
			case XhtmlPackage.OBJECT_TYPE__H3:
				return getH3();
			case XhtmlPackage.OBJECT_TYPE__H4:
				return getH4();
			case XhtmlPackage.OBJECT_TYPE__H5:
				return getH5();
			case XhtmlPackage.OBJECT_TYPE__H6:
				return getH6();
			case XhtmlPackage.OBJECT_TYPE__DIV:
				return getDiv();
			case XhtmlPackage.OBJECT_TYPE__UL:
				return getUl();
			case XhtmlPackage.OBJECT_TYPE__OL:
				return getOl();
			case XhtmlPackage.OBJECT_TYPE__DL:
				return getDl();
			case XhtmlPackage.OBJECT_TYPE__PRE:
				return getPre();
			case XhtmlPackage.OBJECT_TYPE__HR:
				return getHr();
			case XhtmlPackage.OBJECT_TYPE__BLOCKQUOTE:
				return getBlockquote();
			case XhtmlPackage.OBJECT_TYPE__ADDRESS:
				return getAddress();
			case XhtmlPackage.OBJECT_TYPE__TABLE:
				return getTable();
			case XhtmlPackage.OBJECT_TYPE__A:
				return getA();
			case XhtmlPackage.OBJECT_TYPE__BR:
				return getBr();
			case XhtmlPackage.OBJECT_TYPE__SPAN:
				return getSpan();
			case XhtmlPackage.OBJECT_TYPE__OBJECT:
				return getObject();
			case XhtmlPackage.OBJECT_TYPE__IMG:
				return getImg();
			case XhtmlPackage.OBJECT_TYPE__TT:
				return getTt();
			case XhtmlPackage.OBJECT_TYPE__I:
				return getI();
			case XhtmlPackage.OBJECT_TYPE__B:
				return getB();
			case XhtmlPackage.OBJECT_TYPE__BIG:
				return getBig();
			case XhtmlPackage.OBJECT_TYPE__SMALL:
				return getSmall();
			case XhtmlPackage.OBJECT_TYPE__U:
				return getU();
			case XhtmlPackage.OBJECT_TYPE__STRIKE:
				return getStrike();
			case XhtmlPackage.OBJECT_TYPE__EM:
				return getEm();
			case XhtmlPackage.OBJECT_TYPE__STRONG:
				return getStrong();
			case XhtmlPackage.OBJECT_TYPE__DFN:
				return getDfn();
			case XhtmlPackage.OBJECT_TYPE__CODE:
				return getCode();
			case XhtmlPackage.OBJECT_TYPE__Q:
				return getQ();
			case XhtmlPackage.OBJECT_TYPE__SAMP:
				return getSamp();
			case XhtmlPackage.OBJECT_TYPE__KBD:
				return getKbd();
			case XhtmlPackage.OBJECT_TYPE__VAR:
				return getVar();
			case XhtmlPackage.OBJECT_TYPE__CITE:
				return getCite();
			case XhtmlPackage.OBJECT_TYPE__ABBR:
				return getAbbr();
			case XhtmlPackage.OBJECT_TYPE__ACRONYM:
				return getAcronym();
			case XhtmlPackage.OBJECT_TYPE__SUB:
				return getSub();
			case XhtmlPackage.OBJECT_TYPE__SUP:
				return getSup();
			case XhtmlPackage.OBJECT_TYPE__INS:
				return getIns();
			case XhtmlPackage.OBJECT_TYPE__DEL:
				return getDel();
			case XhtmlPackage.OBJECT_TYPE__ARCHIVE:
				return getArchive();
			case XhtmlPackage.OBJECT_TYPE__CLASS:
				return getClass_();
			case XhtmlPackage.OBJECT_TYPE__CLASSID:
				return getClassid();
			case XhtmlPackage.OBJECT_TYPE__CODEBASE:
				return getCodebase();
			case XhtmlPackage.OBJECT_TYPE__CODETYPE:
				return getCodetype();
			case XhtmlPackage.OBJECT_TYPE__DATA:
				return getData();
			case XhtmlPackage.OBJECT_TYPE__DECLARE:
				return getDeclare();
			case XhtmlPackage.OBJECT_TYPE__HEIGHT:
				return getHeight();
			case XhtmlPackage.OBJECT_TYPE__ID:
				return getId();
			case XhtmlPackage.OBJECT_TYPE__NAME:
				return getName();
			case XhtmlPackage.OBJECT_TYPE__STANDBY:
				return getStandby();
			case XhtmlPackage.OBJECT_TYPE__STYLE:
				return getStyle();
			case XhtmlPackage.OBJECT_TYPE__TABINDEX:
				return getTabindex();
			case XhtmlPackage.OBJECT_TYPE__TITLE:
				return getTitle();
			case XhtmlPackage.OBJECT_TYPE__TYPE:
				return getType();
			case XhtmlPackage.OBJECT_TYPE__USEMAP:
				return getUsemap();
			case XhtmlPackage.OBJECT_TYPE__WIDTH:
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
			case XhtmlPackage.OBJECT_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__PARAM:
				getParam().clear();
				getParam().addAll((Collection<? extends ParamType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__P:
				getP().clear();
				getP().addAll((Collection<? extends PType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__H1:
				getH1().clear();
				getH1().addAll((Collection<? extends H1Type>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__H2:
				getH2().clear();
				getH2().addAll((Collection<? extends H2Type>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__H3:
				getH3().clear();
				getH3().addAll((Collection<? extends H3Type>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__H4:
				getH4().clear();
				getH4().addAll((Collection<? extends H4Type>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__H5:
				getH5().clear();
				getH5().addAll((Collection<? extends H5Type>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__H6:
				getH6().clear();
				getH6().addAll((Collection<? extends H6Type>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__DIV:
				getDiv().clear();
				getDiv().addAll((Collection<? extends DivType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__UL:
				getUl().clear();
				getUl().addAll((Collection<? extends UlType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__OL:
				getOl().clear();
				getOl().addAll((Collection<? extends OlType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__DL:
				getDl().clear();
				getDl().addAll((Collection<? extends DlType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__PRE:
				getPre().clear();
				getPre().addAll((Collection<? extends PreType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__HR:
				getHr().clear();
				getHr().addAll((Collection<? extends HrType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__BLOCKQUOTE:
				getBlockquote().clear();
				getBlockquote().addAll((Collection<? extends BlockquoteType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__ADDRESS:
				getAddress().clear();
				getAddress().addAll((Collection<? extends AddressType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__TABLE:
				getTable().clear();
				getTable().addAll((Collection<? extends TableType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__A:
				getA().clear();
				getA().addAll((Collection<? extends AType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__BR:
				getBr().clear();
				getBr().addAll((Collection<? extends BrType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__SPAN:
				getSpan().clear();
				getSpan().addAll((Collection<? extends SpanType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__OBJECT:
				getObject().clear();
				getObject().addAll((Collection<? extends ObjectType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__IMG:
				getImg().clear();
				getImg().addAll((Collection<? extends ImgType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__TT:
				getTt().clear();
				getTt().addAll((Collection<? extends TtType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__I:
				getI().clear();
				getI().addAll((Collection<? extends IType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__B:
				getB().clear();
				getB().addAll((Collection<? extends BType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__BIG:
				getBig().clear();
				getBig().addAll((Collection<? extends BigType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__SMALL:
				getSmall().clear();
				getSmall().addAll((Collection<? extends SmallType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__U:
				getU().clear();
				getU().addAll((Collection<? extends UType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__STRIKE:
				getStrike().clear();
				getStrike().addAll((Collection<? extends StrikeType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__EM:
				getEm().clear();
				getEm().addAll((Collection<? extends EmType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__STRONG:
				getStrong().clear();
				getStrong().addAll((Collection<? extends StrongType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__DFN:
				getDfn().clear();
				getDfn().addAll((Collection<? extends DfnType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__CODE:
				getCode().clear();
				getCode().addAll((Collection<? extends CodeType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__Q:
				getQ().clear();
				getQ().addAll((Collection<? extends QType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__SAMP:
				getSamp().clear();
				getSamp().addAll((Collection<? extends SampType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__KBD:
				getKbd().clear();
				getKbd().addAll((Collection<? extends KbdType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__VAR:
				getVar().clear();
				getVar().addAll((Collection<? extends VarType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__CITE:
				getCite().clear();
				getCite().addAll((Collection<? extends CiteType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__ABBR:
				getAbbr().clear();
				getAbbr().addAll((Collection<? extends AbbrType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__ACRONYM:
				getAcronym().clear();
				getAcronym().addAll((Collection<? extends AcronymType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__SUB:
				getSub().clear();
				getSub().addAll((Collection<? extends SubType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__SUP:
				getSup().clear();
				getSup().addAll((Collection<? extends SupType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__INS:
				getIns().clear();
				getIns().addAll((Collection<? extends InsType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__DEL:
				getDel().clear();
				getDel().addAll((Collection<? extends DelType>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__ARCHIVE:
				setArchive((String)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__CLASS:
				setClass((List<String>)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__CLASSID:
				setClassid((String)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__CODEBASE:
				setCodebase((String)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__CODETYPE:
				setCodetype((String)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__DATA:
				setData((String)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__DECLARE:
				setDeclare((DeclareType)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__HEIGHT:
				setHeight((String)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__ID:
				setId((String)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__NAME:
				setName((String)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__STANDBY:
				setStandby((String)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__STYLE:
				setStyle((String)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__TABINDEX:
				setTabindex((BigInteger)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__TITLE:
				setTitle((String)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__TYPE:
				setType((String)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__USEMAP:
				setUsemap((String)newValue);
				return;
			case XhtmlPackage.OBJECT_TYPE__WIDTH:
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
			case XhtmlPackage.OBJECT_TYPE__MIXED:
				getMixed().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__GROUP:
				getGroup().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__PARAM:
				getParam().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__P:
				getP().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__H1:
				getH1().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__H2:
				getH2().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__H3:
				getH3().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__H4:
				getH4().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__H5:
				getH5().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__H6:
				getH6().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__DIV:
				getDiv().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__UL:
				getUl().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__OL:
				getOl().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__DL:
				getDl().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__PRE:
				getPre().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__HR:
				getHr().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__BLOCKQUOTE:
				getBlockquote().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__ADDRESS:
				getAddress().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__TABLE:
				getTable().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__A:
				getA().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__BR:
				getBr().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__SPAN:
				getSpan().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__OBJECT:
				getObject().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__IMG:
				getImg().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__TT:
				getTt().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__I:
				getI().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__B:
				getB().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__BIG:
				getBig().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__SMALL:
				getSmall().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__U:
				getU().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__STRIKE:
				getStrike().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__EM:
				getEm().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__STRONG:
				getStrong().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__DFN:
				getDfn().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__CODE:
				getCode().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__Q:
				getQ().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__SAMP:
				getSamp().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__KBD:
				getKbd().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__VAR:
				getVar().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__CITE:
				getCite().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__ABBR:
				getAbbr().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__ACRONYM:
				getAcronym().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__SUB:
				getSub().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__SUP:
				getSup().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__INS:
				getIns().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__DEL:
				getDel().clear();
				return;
			case XhtmlPackage.OBJECT_TYPE__ARCHIVE:
				setArchive(ARCHIVE_EDEFAULT);
				return;
			case XhtmlPackage.OBJECT_TYPE__CLASS:
				setClass(CLASS_EDEFAULT);
				return;
			case XhtmlPackage.OBJECT_TYPE__CLASSID:
				setClassid(CLASSID_EDEFAULT);
				return;
			case XhtmlPackage.OBJECT_TYPE__CODEBASE:
				setCodebase(CODEBASE_EDEFAULT);
				return;
			case XhtmlPackage.OBJECT_TYPE__CODETYPE:
				setCodetype(CODETYPE_EDEFAULT);
				return;
			case XhtmlPackage.OBJECT_TYPE__DATA:
				setData(DATA_EDEFAULT);
				return;
			case XhtmlPackage.OBJECT_TYPE__DECLARE:
				unsetDeclare();
				return;
			case XhtmlPackage.OBJECT_TYPE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case XhtmlPackage.OBJECT_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case XhtmlPackage.OBJECT_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case XhtmlPackage.OBJECT_TYPE__STANDBY:
				setStandby(STANDBY_EDEFAULT);
				return;
			case XhtmlPackage.OBJECT_TYPE__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case XhtmlPackage.OBJECT_TYPE__TABINDEX:
				setTabindex(TABINDEX_EDEFAULT);
				return;
			case XhtmlPackage.OBJECT_TYPE__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case XhtmlPackage.OBJECT_TYPE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case XhtmlPackage.OBJECT_TYPE__USEMAP:
				setUsemap(USEMAP_EDEFAULT);
				return;
			case XhtmlPackage.OBJECT_TYPE__WIDTH:
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
			case XhtmlPackage.OBJECT_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case XhtmlPackage.OBJECT_TYPE__GROUP:
				return !getGroup().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__PARAM:
				return !getParam().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__P:
				return !getP().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__H1:
				return !getH1().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__H2:
				return !getH2().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__H3:
				return !getH3().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__H4:
				return !getH4().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__H5:
				return !getH5().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__H6:
				return !getH6().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__DIV:
				return !getDiv().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__UL:
				return !getUl().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__OL:
				return !getOl().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__DL:
				return !getDl().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__PRE:
				return !getPre().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__HR:
				return !getHr().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__BLOCKQUOTE:
				return !getBlockquote().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__ADDRESS:
				return !getAddress().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__TABLE:
				return !getTable().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__A:
				return !getA().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__BR:
				return !getBr().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__SPAN:
				return !getSpan().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__OBJECT:
				return !getObject().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__IMG:
				return !getImg().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__TT:
				return !getTt().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__I:
				return !getI().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__B:
				return !getB().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__BIG:
				return !getBig().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__SMALL:
				return !getSmall().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__U:
				return !getU().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__STRIKE:
				return !getStrike().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__EM:
				return !getEm().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__STRONG:
				return !getStrong().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__DFN:
				return !getDfn().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__CODE:
				return !getCode().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__Q:
				return !getQ().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__SAMP:
				return !getSamp().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__KBD:
				return !getKbd().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__VAR:
				return !getVar().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__CITE:
				return !getCite().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__ABBR:
				return !getAbbr().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__ACRONYM:
				return !getAcronym().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__SUB:
				return !getSub().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__SUP:
				return !getSup().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__INS:
				return !getIns().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__DEL:
				return !getDel().isEmpty();
			case XhtmlPackage.OBJECT_TYPE__ARCHIVE:
				return ARCHIVE_EDEFAULT == null ? archive != null : !ARCHIVE_EDEFAULT.equals(archive);
			case XhtmlPackage.OBJECT_TYPE__CLASS:
				return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
			case XhtmlPackage.OBJECT_TYPE__CLASSID:
				return CLASSID_EDEFAULT == null ? classid != null : !CLASSID_EDEFAULT.equals(classid);
			case XhtmlPackage.OBJECT_TYPE__CODEBASE:
				return CODEBASE_EDEFAULT == null ? codebase != null : !CODEBASE_EDEFAULT.equals(codebase);
			case XhtmlPackage.OBJECT_TYPE__CODETYPE:
				return CODETYPE_EDEFAULT == null ? codetype != null : !CODETYPE_EDEFAULT.equals(codetype);
			case XhtmlPackage.OBJECT_TYPE__DATA:
				return DATA_EDEFAULT == null ? data != null : !DATA_EDEFAULT.equals(data);
			case XhtmlPackage.OBJECT_TYPE__DECLARE:
				return isSetDeclare();
			case XhtmlPackage.OBJECT_TYPE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
			case XhtmlPackage.OBJECT_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case XhtmlPackage.OBJECT_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case XhtmlPackage.OBJECT_TYPE__STANDBY:
				return STANDBY_EDEFAULT == null ? standby != null : !STANDBY_EDEFAULT.equals(standby);
			case XhtmlPackage.OBJECT_TYPE__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case XhtmlPackage.OBJECT_TYPE__TABINDEX:
				return TABINDEX_EDEFAULT == null ? tabindex != null : !TABINDEX_EDEFAULT.equals(tabindex);
			case XhtmlPackage.OBJECT_TYPE__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case XhtmlPackage.OBJECT_TYPE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case XhtmlPackage.OBJECT_TYPE__USEMAP:
				return USEMAP_EDEFAULT == null ? usemap != null : !USEMAP_EDEFAULT.equals(usemap);
			case XhtmlPackage.OBJECT_TYPE__WIDTH:
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", archive: ");
		result.append(archive);
		result.append(", class: ");
		result.append(class_);
		result.append(", classid: ");
		result.append(classid);
		result.append(", codebase: ");
		result.append(codebase);
		result.append(", codetype: ");
		result.append(codetype);
		result.append(", data: ");
		result.append(data);
		result.append(", declare: ");
		if (declareESet) result.append(declare); else result.append("<unset>");
		result.append(", height: ");
		result.append(height);
		result.append(", id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", standby: ");
		result.append(standby);
		result.append(", style: ");
		result.append(style);
		result.append(", tabindex: ");
		result.append(tabindex);
		result.append(", title: ");
		result.append(title);
		result.append(", type: ");
		result.append(type);
		result.append(", usemap: ");
		result.append(usemap);
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //ObjectTypeImpl
