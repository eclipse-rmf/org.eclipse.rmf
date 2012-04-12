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

package org.eclipse.rmf.rif12.xhtml;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * 
 *     This schema is a subset of the official W3C XHTML Schema
 *     
 * 
 *     ================ Character mnemonic entities =========================
 * 
 *     XHTML entity sets are identified by the PUBLIC and SYSTEM identifiers:
 *   
 *     PUBLIC "-//W3C//ENTITIES Latin 1 for XHTML//EN"
 *     SYSTEM "http://www.w3.org/TR/xhtml1/DTD/xhtml-lat1.ent"
 * 
 *     PUBLIC "-//W3C//ENTITIES Special for XHTML//EN"
 *     SYSTEM "http://www.w3.org/TR/xhtml1/DTD/xhtml-special.ent"
 * 
 *     PUBLIC "-//W3C//ENTITIES Symbols for XHTML//EN"
 *     SYSTEM "http://www.w3.org/TR/xhtml1/DTD/xhtml-symbol.ent"
 *     
 * 
 *     ================== Imported Names ====================================
 *     
 * 
 *     these are used for image maps
 *     
 * 
 *     =================== Generic Attributes ===============================
 *     
 * 
 *     =================== Text Elements ====================================
 *     
 * 
 *     ================== Block level elements ==============================
 *     
 * 
 *     ================== Content models for exclusions =====================
 *     
 * 
 *     ================ Document Structure ==================================
 *     
 * 
 *     =================== Document Body ====================================
 *     
 * 
 *     =================== Paragraphs =======================================
 *     
 * 
 *     =================== Headings =========================================
 *     There are six levels of headings from h1 (the most important)
 *     to h6 (the least important).
 *     
 * 
 *     =================== Lists ============================================
 *     
 * 
 *     definition lists - dt for term, dd for its definition
 *     
 * 
 *     =================== Address ==========================================
 *     
 * 
 *     =================== Horizontal Rule ==================================
 *     
 * 
 *     =================== Preformatted Text ================================
 *     
 * 
 *     =================== Block-like Quotes ================================
 *     
 * 
 *     =================== Inserted/Deleted Text ============================
 *     ins/del are allowed in block and inline content, but its
 *     inappropriate to include block content within an ins element
 *     occurring in inline content.
 *     
 * 
 *     ================== The Anchor Element ================================
 *     
 * 
 *     ===================== Inline Elements ================================
 *     
 * 
 *     ==================== Object ======================================
 *     object is used to embed objects as part of HTML pages.
 *     param elements should precede other content. Parameters
 *     can also be expressed as attribute/value pairs on the
 *     object element itself when brevity is desired.
 *     
 * 
 *     =================== Images ===========================================
 *     To avoid accessibility problems for people who aren't
 *     able to see the image, you should provide a text
 *     description using the alt and longdesc attributes.
 *     In addition, avoid the use of server-side image maps.
 *     Note that in this DTD there is no name attribute. That
 *     is only available in the transitional and frameset DTD.
 *     
 * 
 *     ======================= Tables =======================================
 *     Derived from IETF HTML table standard, see [RFC1942]
 *     
 * 
 *     Use thead to duplicate headers when breaking table
 *     across page boundaries, or for static headers when
 *     tbody sections are rendered in scrolling panel.
 *     Use tfoot to duplicate footers when breaking table
 *     across page boundaries, or for static footers when
 *     tbody sections are rendered in scrolling panel.
 *     Use multiple tbody sections when rules are needed
 *     between groups of table rows.
 *     
 * 
 *     th is for headers, td for data and for cells acting as both
 *     
 * <!-- end-model-doc -->
 * @see org.eclipse.rmf.rif12.xhtml.XhtmlFactory
 * @model kind="package"
 *        annotation="http://www.w3.org/XML/1998/namespace lang='en'"
 * @generated
 */
public interface XhtmlPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xhtml";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://automotive-his.de/200706/rif-xhtml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rif-xhtml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XhtmlPackage eINSTANCE = org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.InlineImpl <em>Inline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.InlineImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getInline()
	 * @generated
	 */
	int INLINE = 35;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__A = 2;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__BR = 3;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__SPAN = 4;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__IMG = 6;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__TT = 7;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__I = 8;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__B = 9;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__BIG = 10;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__SMALL = 11;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__U = 12;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__STRIKE = 13;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__EM = 14;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__STRONG = 15;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__DFN = 16;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__CODE = 17;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__Q = 18;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__SAMP = 19;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__KBD = 20;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__VAR = 21;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__CITE = 22;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__ABBR = 23;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__ACRONYM = 24;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__SUB = 25;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__SUP = 26;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__INS = 27;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE__DEL = 28;

	/**
	 * The number of structural features of the '<em>Inline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INLINE_FEATURE_COUNT = 29;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.AbbrTypeImpl <em>Abbr Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.AbbrTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getAbbrType()
	 * @generated
	 */
	int ABBR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Abbr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABBR_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.AContentImpl <em>AContent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.AContentImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getAContent()
	 * @generated
	 */
	int ACONTENT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__OBJECT = 4;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__IMG = 5;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__TT = 6;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__I = 7;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__B = 8;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__BIG = 9;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__SMALL = 10;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__U = 11;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__STRIKE = 12;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__EM = 13;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__STRONG = 14;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__DFN = 15;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__CODE = 16;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__Q = 17;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__SAMP = 18;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__KBD = 19;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__VAR = 20;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__CITE = 21;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__ABBR = 22;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__ACRONYM = 23;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__SUB = 24;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__SUP = 25;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__INS = 26;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT__DEL = 27;

	/**
	 * The number of structural features of the '<em>AContent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACONTENT_FEATURE_COUNT = 28;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.AcronymTypeImpl <em>Acronym Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.AcronymTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getAcronymType()
	 * @generated
	 */
	int ACRONYM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Acronym Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACRONYM_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.AddressTypeImpl <em>Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.AddressTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.ATypeImpl <em>AType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.ATypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getAType()
	 * @generated
	 */
	int ATYPE = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__MIXED = ACONTENT__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__GROUP = ACONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__BR = ACONTENT__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__SPAN = ACONTENT__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__OBJECT = ACONTENT__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__IMG = ACONTENT__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__TT = ACONTENT__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__I = ACONTENT__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__B = ACONTENT__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__BIG = ACONTENT__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__SMALL = ACONTENT__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__U = ACONTENT__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__STRIKE = ACONTENT__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__EM = ACONTENT__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__STRONG = ACONTENT__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__DFN = ACONTENT__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__CODE = ACONTENT__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__Q = ACONTENT__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__SAMP = ACONTENT__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__KBD = ACONTENT__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__VAR = ACONTENT__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__CITE = ACONTENT__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__ABBR = ACONTENT__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__ACRONYM = ACONTENT__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__SUB = ACONTENT__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__SUP = ACONTENT__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__INS = ACONTENT__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__DEL = ACONTENT__DEL;

	/**
	 * The feature id for the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__CHARSET = ACONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__CLASS = ACONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Coords</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__COORDS = ACONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__HREF = ACONTENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Hreflang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__HREFLANG = ACONTENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__ID = ACONTENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__NAME = ACONTENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__REL = ACONTENT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__REV = ACONTENT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__SHAPE = ACONTENT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__STYLE = ACONTENT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__TITLE = ACONTENT_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE__TYPE = ACONTENT_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>AType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATYPE_FEATURE_COUNT = ACONTENT_FEATURE_COUNT + 13;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.BigTypeImpl <em>Big Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.BigTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getBigType()
	 * @generated
	 */
	int BIG_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Big Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BIG_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.BlockImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__GROUP = 0;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__P = 1;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__H1 = 2;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__H2 = 3;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__H3 = 4;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__H4 = 5;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__H5 = 6;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__H6 = 7;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DIV = 8;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__UL = 9;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OL = 10;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DL = 11;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__PRE = 12;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__HR = 13;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__BLOCKQUOTE = 14;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__ADDRESS = 15;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__TABLE = 16;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__INS = 17;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__DEL = 18;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.BlockquoteTypeImpl <em>Blockquote Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.BlockquoteTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getBlockquoteType()
	 * @generated
	 */
	int BLOCKQUOTE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__GROUP = BLOCK__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__P = BLOCK__P;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__H1 = BLOCK__H1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__H2 = BLOCK__H2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__H3 = BLOCK__H3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__H4 = BLOCK__H4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__H5 = BLOCK__H5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__H6 = BLOCK__H6;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__DIV = BLOCK__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__UL = BLOCK__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__OL = BLOCK__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__DL = BLOCK__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__PRE = BLOCK__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__HR = BLOCK__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__BLOCKQUOTE = BLOCK__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__ADDRESS = BLOCK__ADDRESS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__TABLE = BLOCK__TABLE;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__INS = BLOCK__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__DEL = BLOCK__DEL;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__CITE = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__CLASS = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__ID = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__STYLE = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE__TITLE = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Blockquote Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCKQUOTE_TYPE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.BodyTypeImpl <em>Body Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.BodyTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getBodyType()
	 * @generated
	 */
	int BODY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__GROUP = BLOCK__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__P = BLOCK__P;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__H1 = BLOCK__H1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__H2 = BLOCK__H2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__H3 = BLOCK__H3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__H4 = BLOCK__H4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__H5 = BLOCK__H5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__H6 = BLOCK__H6;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__DIV = BLOCK__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__UL = BLOCK__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__OL = BLOCK__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__DL = BLOCK__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__PRE = BLOCK__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__HR = BLOCK__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__BLOCKQUOTE = BLOCK__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__ADDRESS = BLOCK__ADDRESS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__TABLE = BLOCK__TABLE;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__INS = BLOCK__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__DEL = BLOCK__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__CLASS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__ID = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__STYLE = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE__TITLE = BLOCK_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Body Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BODY_TYPE_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.BrTypeImpl <em>Br Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.BrTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getBrType()
	 * @generated
	 */
	int BR_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE__STYLE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE__TITLE = 3;

	/**
	 * The number of structural features of the '<em>Br Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BR_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.BTypeImpl <em>BType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.BTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getBType()
	 * @generated
	 */
	int BTYPE = 10;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>BType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BTYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.CaptionTypeImpl <em>Caption Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.CaptionTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getCaptionType()
	 * @generated
	 */
	int CAPTION_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Caption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPTION_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.CiteTypeImpl <em>Cite Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.CiteTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getCiteType()
	 * @generated
	 */
	int CITE_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Cite Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CITE_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.CodeTypeImpl <em>Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.CodeTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getCodeType()
	 * @generated
	 */
	int CODE_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.ColgroupTypeImpl <em>Colgroup Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.ColgroupTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getColgroupType()
	 * @generated
	 */
	int COLGROUP_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Col</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__COL = 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__ALIGN = 1;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__CHAR = 2;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__CHAROFF = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__SPAN = 6;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__STYLE = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__VALIGN = 9;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE__WIDTH = 10;

	/**
	 * The number of structural features of the '<em>Colgroup Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLGROUP_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.ColTypeImpl <em>Col Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.ColTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getColType()
	 * @generated
	 */
	int COL_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__ALIGN = 0;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__CHAR = 1;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__CHAROFF = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__SPAN = 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__STYLE = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__VALIGN = 8;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE__WIDTH = 9;

	/**
	 * The number of structural features of the '<em>Col Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COL_TYPE_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl <em>Flow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.FlowImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getFlow()
	 * @generated
	 */
	int FLOW = 24;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__GROUP = 1;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__P = 2;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__H1 = 3;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__H2 = 4;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__H3 = 5;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__H4 = 6;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__H5 = 7;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__H6 = 8;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DIV = 9;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__UL = 10;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__OL = 11;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DL = 12;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__PRE = 13;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__HR = 14;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__BLOCKQUOTE = 15;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ADDRESS = 16;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TABLE = 17;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__A = 18;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__BR = 19;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SPAN = 20;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__OBJECT = 21;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__IMG = 22;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__TT = 23;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__I = 24;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__B = 25;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__BIG = 26;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SMALL = 27;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__U = 28;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__STRIKE = 29;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__EM = 30;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__STRONG = 31;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DFN = 32;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CODE = 33;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__Q = 34;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SAMP = 35;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__KBD = 36;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__VAR = 37;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__CITE = 38;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ABBR = 39;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__ACRONYM = 40;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SUB = 41;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__SUP = 42;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__INS = 43;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW__DEL = 44;

	/**
	 * The number of structural features of the '<em>Flow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLOW_FEATURE_COUNT = 45;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.DdTypeImpl <em>Dd Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.DdTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDdType()
	 * @generated
	 */
	int DD_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__H1 = FLOW__H1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__H2 = FLOW__H2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__H3 = FLOW__H3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__H4 = FLOW__H4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__H5 = FLOW__H5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__H6 = FLOW__H6;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__ADDRESS = FLOW__ADDRESS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__OBJECT = FLOW__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__U = FLOW__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__STRIKE = FLOW__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__SUP = FLOW__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__INS = FLOW__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__DEL = FLOW__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__CLASS = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__ID = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__STYLE = FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE__TITLE = FLOW_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dd Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DD_TYPE_FEATURE_COUNT = FLOW_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.DelTypeImpl <em>Del Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.DelTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDelType()
	 * @generated
	 */
	int DEL_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__H1 = FLOW__H1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__H2 = FLOW__H2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__H3 = FLOW__H3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__H4 = FLOW__H4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__H5 = FLOW__H5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__H6 = FLOW__H6;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__ADDRESS = FLOW__ADDRESS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__OBJECT = FLOW__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__U = FLOW__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__STRIKE = FLOW__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__SUP = FLOW__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__INS = FLOW__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__DEL = FLOW__DEL;

	/**
	 * The feature id for the '<em><b>Cite1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__CITE1 = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__CLASS = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__DATETIME = FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__ID = FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__STYLE = FLOW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE__TITLE = FLOW_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Del Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEL_TYPE_FEATURE_COUNT = FLOW_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.DfnTypeImpl <em>Dfn Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.DfnTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDfnType()
	 * @generated
	 */
	int DFN_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dfn Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DFN_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.DivTypeImpl <em>Div Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.DivTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDivType()
	 * @generated
	 */
	int DIV_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__H1 = FLOW__H1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__H2 = FLOW__H2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__H3 = FLOW__H3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__H4 = FLOW__H4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__H5 = FLOW__H5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__H6 = FLOW__H6;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__ADDRESS = FLOW__ADDRESS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__OBJECT = FLOW__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__U = FLOW__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__STRIKE = FLOW__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__SUP = FLOW__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__INS = FLOW__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__DEL = FLOW__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__CLASS = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__ID = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__STYLE = FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE__TITLE = FLOW_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Div Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIV_TYPE_FEATURE_COUNT = FLOW_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.DlTypeImpl <em>Dl Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.DlTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDlType()
	 * @generated
	 */
	int DL_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Dt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE__DT = 1;

	/**
	 * The feature id for the '<em><b>Dd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE__DD = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE__STYLE = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE__TITLE = 6;

	/**
	 * The number of structural features of the '<em>Dl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DL_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.DocumentRootImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 21;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__A = 3;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABBR = 4;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACRONYM = 5;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS = 6;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__B = 7;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BIG = 8;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BLOCKQUOTE = 9;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BODY = 10;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BR = 11;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAPTION = 12;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CITE = 13;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CODE = 14;

	/**
	 * The feature id for the '<em><b>Col</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COL = 15;

	/**
	 * The feature id for the '<em><b>Colgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLGROUP = 16;

	/**
	 * The feature id for the '<em><b>Dd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DD = 17;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DEL = 18;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DFN = 19;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DIV = 20;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DL = 21;

	/**
	 * The feature id for the '<em><b>Dt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DT = 22;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EM = 23;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__H1 = 24;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__H2 = 25;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__H3 = 26;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__H4 = 27;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__H5 = 28;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__H6 = 29;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HR = 30;

	/**
	 * The feature id for the '<em><b>Html</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__HTML = 31;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__I = 32;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMG = 33;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INS = 34;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KBD = 35;

	/**
	 * The feature id for the '<em><b>Li</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LI = 36;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OBJECT = 37;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OL = 38;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__P = 39;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARAM = 40;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PRE = 41;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__Q = 42;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SAMP = 43;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SMALL = 44;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPAN = 45;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRIKE = 46;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STRONG = 47;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUB = 48;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUP = 49;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE = 50;

	/**
	 * The feature id for the '<em><b>Tbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TBODY = 51;

	/**
	 * The feature id for the '<em><b>Td</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TD = 52;

	/**
	 * The feature id for the '<em><b>Tfoot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TFOOT = 53;

	/**
	 * The feature id for the '<em><b>Th</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TH = 54;

	/**
	 * The feature id for the '<em><b>Thead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THEAD = 55;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TR = 56;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TT = 57;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__U = 58;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__UL = 59;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__VAR = 60;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 61;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.DtTypeImpl <em>Dt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.DtTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDtType()
	 * @generated
	 */
	int DT_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Dt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DT_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.EmTypeImpl <em>Em Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.EmTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getEmType()
	 * @generated
	 */
	int EM_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Em Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EM_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.FormContentImpl <em>Form Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.FormContentImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getFormContent()
	 * @generated
	 */
	int FORM_CONTENT = 25;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__GROUP = 0;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__P = 1;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__H1 = 2;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__H2 = 3;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__H3 = 4;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__H4 = 5;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__H5 = 6;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__H6 = 7;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__DIV = 8;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__UL = 9;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__OL = 10;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__DL = 11;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__PRE = 12;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__HR = 13;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__BLOCKQUOTE = 14;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__ADDRESS = 15;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__TABLE = 16;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__INS = 17;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT__DEL = 18;

	/**
	 * The number of structural features of the '<em>Form Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORM_CONTENT_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.H1TypeImpl <em>H1 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.H1TypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getH1Type()
	 * @generated
	 */
	int H1_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>H1 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H1_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.H2TypeImpl <em>H2 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.H2TypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getH2Type()
	 * @generated
	 */
	int H2_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>H2 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H2_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.H3TypeImpl <em>H3 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.H3TypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getH3Type()
	 * @generated
	 */
	int H3_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>H3 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H3_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.H4TypeImpl <em>H4 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.H4TypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getH4Type()
	 * @generated
	 */
	int H4_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>H4 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H4_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.H5TypeImpl <em>H5 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.H5TypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getH5Type()
	 * @generated
	 */
	int H5_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>H5 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H5_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.H6TypeImpl <em>H6 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.H6TypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getH6Type()
	 * @generated
	 */
	int H6_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>H6 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int H6_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.HrTypeImpl <em>Hr Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.HrTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getHrType()
	 * @generated
	 */
	int HR_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_TYPE__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_TYPE__STYLE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_TYPE__TITLE = 3;

	/**
	 * The number of structural features of the '<em>Hr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HR_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.HtmlTypeImpl <em>Html Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.HtmlTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getHtmlType()
	 * @generated
	 */
	int HTML_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Body</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_TYPE__BODY = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Html Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTML_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.ImgTypeImpl <em>Img Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.ImgTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getImgType()
	 * @generated
	 */
	int IMG_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Alt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__ALT = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__HEIGHT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__ID = 3;

	/**
	 * The feature id for the '<em><b>Ismap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__ISMAP = 4;

	/**
	 * The feature id for the '<em><b>Longdesc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__LONGDESC = 5;

	/**
	 * The feature id for the '<em><b>Src</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__SRC = 6;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__STYLE = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__TITLE = 8;

	/**
	 * The feature id for the '<em><b>Usemap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__USEMAP = 9;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE__WIDTH = 10;

	/**
	 * The number of structural features of the '<em>Img Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMG_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.InsTypeImpl <em>Ins Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.InsTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getInsType()
	 * @generated
	 */
	int INS_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__H1 = FLOW__H1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__H2 = FLOW__H2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__H3 = FLOW__H3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__H4 = FLOW__H4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__H5 = FLOW__H5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__H6 = FLOW__H6;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__ADDRESS = FLOW__ADDRESS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__OBJECT = FLOW__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__U = FLOW__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__STRIKE = FLOW__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__SUP = FLOW__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__INS = FLOW__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__DEL = FLOW__DEL;

	/**
	 * The feature id for the '<em><b>Cite1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__CITE1 = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__CLASS = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__DATETIME = FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__ID = FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__STYLE = FLOW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE__TITLE = FLOW_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Ins Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INS_TYPE_FEATURE_COUNT = FLOW_FEATURE_COUNT + 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.ITypeImpl <em>IType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.ITypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getIType()
	 * @generated
	 */
	int ITYPE = 37;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>IType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.KbdTypeImpl <em>Kbd Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.KbdTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getKbdType()
	 * @generated
	 */
	int KBD_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Kbd Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KBD_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.LiTypeImpl <em>Li Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.LiTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getLiType()
	 * @generated
	 */
	int LI_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__H1 = FLOW__H1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__H2 = FLOW__H2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__H3 = FLOW__H3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__H4 = FLOW__H4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__H5 = FLOW__H5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__H6 = FLOW__H6;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__ADDRESS = FLOW__ADDRESS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__OBJECT = FLOW__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__U = FLOW__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__STRIKE = FLOW__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__SUP = FLOW__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__INS = FLOW__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__DEL = FLOW__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__CLASS = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__ID = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__STYLE = FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE__TITLE = FLOW_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Li Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LI_TYPE_FEATURE_COUNT = FLOW_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl <em>Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getObjectType()
	 * @generated
	 */
	int OBJECT_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__PARAM = 2;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__P = 3;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__H1 = 4;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__H2 = 5;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__H3 = 6;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__H4 = 7;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__H5 = 8;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__H6 = 9;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__DIV = 10;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__UL = 11;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__OL = 12;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__DL = 13;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__PRE = 14;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__HR = 15;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__BLOCKQUOTE = 16;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__ADDRESS = 17;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__TABLE = 18;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__A = 19;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__BR = 20;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__SPAN = 21;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__OBJECT = 22;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__IMG = 23;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__TT = 24;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__I = 25;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__B = 26;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__BIG = 27;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__SMALL = 28;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__U = 29;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__STRIKE = 30;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__EM = 31;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__STRONG = 32;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__DFN = 33;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__CODE = 34;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__Q = 35;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__SAMP = 36;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__KBD = 37;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__VAR = 38;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__CITE = 39;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__ABBR = 40;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__ACRONYM = 41;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__SUB = 42;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__SUP = 43;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__INS = 44;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__DEL = 45;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__ARCHIVE = 46;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__CLASS = 47;

	/**
	 * The feature id for the '<em><b>Classid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__CLASSID = 48;

	/**
	 * The feature id for the '<em><b>Codebase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__CODEBASE = 49;

	/**
	 * The feature id for the '<em><b>Codetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__CODETYPE = 50;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__DATA = 51;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__DECLARE = 52;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__HEIGHT = 53;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__ID = 54;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__NAME = 55;

	/**
	 * The feature id for the '<em><b>Standby</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__STANDBY = 56;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__STYLE = 57;

	/**
	 * The feature id for the '<em><b>Tabindex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__TABINDEX = 58;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__TITLE = 59;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__TYPE = 60;

	/**
	 * The feature id for the '<em><b>Usemap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__USEMAP = 61;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE__WIDTH = 62;

	/**
	 * The number of structural features of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBJECT_TYPE_FEATURE_COUNT = 63;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.OlTypeImpl <em>Ol Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.OlTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getOlType()
	 * @generated
	 */
	int OL_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Li</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_TYPE__LI = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_TYPE__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_TYPE__STYLE = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_TYPE__TITLE = 4;

	/**
	 * The number of structural features of the '<em>Ol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OL_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.ParamTypeImpl <em>Param Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.ParamTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getParamType()
	 * @generated
	 */
	int PARAM_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Valuetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE__VALUETYPE = 4;

	/**
	 * The number of structural features of the '<em>Param Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAM_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.PreContentImpl <em>Pre Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.PreContentImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getPreContent()
	 * @generated
	 */
	int PRE_CONTENT = 43;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__GROUP = 1;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__A = 2;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__TT = 3;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__I = 4;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__B = 5;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__BIG = 6;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__SMALL = 7;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__U = 8;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__STRIKE = 9;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__EM = 10;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__STRONG = 11;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__DFN = 12;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__CODE = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__Q = 14;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__SAMP = 15;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__KBD = 16;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__VAR = 17;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__CITE = 18;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__ABBR = 19;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__ACRONYM = 20;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__SUB = 21;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__SUP = 22;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__BR = 23;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__SPAN = 24;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__INS = 25;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT__DEL = 26;

	/**
	 * The number of structural features of the '<em>Pre Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_CONTENT_FEATURE_COUNT = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.PreTypeImpl <em>Pre Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.PreTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getPreType()
	 * @generated
	 */
	int PRE_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__MIXED = PRE_CONTENT__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__GROUP = PRE_CONTENT__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__A = PRE_CONTENT__A;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__TT = PRE_CONTENT__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__I = PRE_CONTENT__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__B = PRE_CONTENT__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__BIG = PRE_CONTENT__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__SMALL = PRE_CONTENT__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__U = PRE_CONTENT__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__STRIKE = PRE_CONTENT__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__EM = PRE_CONTENT__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__STRONG = PRE_CONTENT__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__DFN = PRE_CONTENT__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__CODE = PRE_CONTENT__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__Q = PRE_CONTENT__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__SAMP = PRE_CONTENT__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__KBD = PRE_CONTENT__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__VAR = PRE_CONTENT__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__CITE = PRE_CONTENT__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__ABBR = PRE_CONTENT__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__ACRONYM = PRE_CONTENT__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__SUB = PRE_CONTENT__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__SUP = PRE_CONTENT__SUP;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__BR = PRE_CONTENT__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__SPAN = PRE_CONTENT__SPAN;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__INS = PRE_CONTENT__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__DEL = PRE_CONTENT__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__CLASS = PRE_CONTENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__ID = PRE_CONTENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__STYLE = PRE_CONTENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE__TITLE = PRE_CONTENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Pre Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRE_TYPE_FEATURE_COUNT = PRE_CONTENT_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.PTypeImpl <em>PType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.PTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getPType()
	 * @generated
	 */
	int PTYPE = 45;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>PType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PTYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.QTypeImpl <em>QType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.QTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getQType()
	 * @generated
	 */
	int QTYPE = 46;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Cite1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__CITE1 = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__CLASS = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__ID = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__STYLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE__TITLE = INLINE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>QType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QTYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.SampTypeImpl <em>Samp Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.SampTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getSampType()
	 * @generated
	 */
	int SAMP_TYPE = 47;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Samp Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SAMP_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.SmallTypeImpl <em>Small Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.SmallTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getSmallType()
	 * @generated
	 */
	int SMALL_TYPE = 48;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Small Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SMALL_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.SpanTypeImpl <em>Span Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.SpanTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getSpanType()
	 * @generated
	 */
	int SPAN_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Span Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.StrikeTypeImpl <em>Strike Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.StrikeTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getStrikeType()
	 * @generated
	 */
	int STRIKE_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Strike Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRIKE_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.StrongTypeImpl <em>Strong Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.StrongTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getStrongType()
	 * @generated
	 */
	int STRONG_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Strong Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRONG_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.SubTypeImpl <em>Sub Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.SubTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getSubType()
	 * @generated
	 */
	int SUB_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sub Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.SupTypeImpl <em>Sup Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.SupTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getSupType()
	 * @generated
	 */
	int SUP_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Sup Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUP_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.TableTypeImpl <em>Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.TableTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getTableType()
	 * @generated
	 */
	int TABLE_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__CAPTION = 0;

	/**
	 * The feature id for the '<em><b>Col</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__COL = 1;

	/**
	 * The feature id for the '<em><b>Colgroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__COLGROUP = 2;

	/**
	 * The feature id for the '<em><b>Thead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__THEAD = 3;

	/**
	 * The feature id for the '<em><b>Tfoot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TFOOT = 4;

	/**
	 * The feature id for the '<em><b>Tbody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TBODY = 5;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TR = 6;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__BORDER = 7;

	/**
	 * The feature id for the '<em><b>Cellpadding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__CELLPADDING = 8;

	/**
	 * The feature id for the '<em><b>Cellspacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__CELLSPACING = 9;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__CLASS = 10;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__ID = 11;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__STYLE = 12;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__SUMMARY = 13;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TITLE = 14;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__WIDTH = 15;

	/**
	 * The number of structural features of the '<em>Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.TbodyTypeImpl <em>Tbody Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.TbodyTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getTbodyType()
	 * @generated
	 */
	int TBODY_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__TR = 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__ALIGN = 1;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__CHAR = 2;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__CHAROFF = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__STYLE = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__VALIGN = 8;

	/**
	 * The number of structural features of the '<em>Tbody Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.TdTypeImpl <em>Td Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.TdTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getTdType()
	 * @generated
	 */
	int TD_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__H1 = FLOW__H1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__H2 = FLOW__H2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__H3 = FLOW__H3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__H4 = FLOW__H4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__H5 = FLOW__H5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__H6 = FLOW__H6;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__ADDRESS = FLOW__ADDRESS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__OBJECT = FLOW__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__U = FLOW__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__STRIKE = FLOW__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__SUP = FLOW__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__INS = FLOW__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__DEL = FLOW__DEL;

	/**
	 * The feature id for the '<em><b>Abbr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__ABBR1 = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__ALIGN = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__AXIS = FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__CHAR = FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__CHAROFF = FLOW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__CLASS = FLOW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__COLSPAN = FLOW_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__HEADERS = FLOW_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__ID = FLOW_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__ROWSPAN = FLOW_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__SCOPE = FLOW_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__STYLE = FLOW_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__TITLE = FLOW_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE__VALIGN = FLOW_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Td Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TD_TYPE_FEATURE_COUNT = FLOW_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.TfootTypeImpl <em>Tfoot Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.TfootTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getTfootType()
	 * @generated
	 */
	int TFOOT_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__TR = 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__ALIGN = 1;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__CHAR = 2;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__CHAROFF = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__STYLE = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE__VALIGN = 8;

	/**
	 * The number of structural features of the '<em>Tfoot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TFOOT_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.TheadTypeImpl <em>Thead Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.TheadTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getTheadType()
	 * @generated
	 */
	int THEAD_TYPE = 58;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__TR = 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__ALIGN = 1;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__CHAR = 2;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__CHAROFF = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__STYLE = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__VALIGN = 8;

	/**
	 * The number of structural features of the '<em>Thead Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.ThTypeImpl <em>Th Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.ThTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getThType()
	 * @generated
	 */
	int TH_TYPE = 59;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__MIXED = FLOW__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__GROUP = FLOW__GROUP;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__P = FLOW__P;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__H1 = FLOW__H1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__H2 = FLOW__H2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__H3 = FLOW__H3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__H4 = FLOW__H4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__H5 = FLOW__H5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__H6 = FLOW__H6;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__DIV = FLOW__DIV;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__UL = FLOW__UL;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__OL = FLOW__OL;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__DL = FLOW__DL;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__PRE = FLOW__PRE;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__HR = FLOW__HR;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__BLOCKQUOTE = FLOW__BLOCKQUOTE;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__ADDRESS = FLOW__ADDRESS;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__TABLE = FLOW__TABLE;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__A = FLOW__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__BR = FLOW__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__SPAN = FLOW__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__OBJECT = FLOW__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__IMG = FLOW__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__TT = FLOW__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__I = FLOW__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__B = FLOW__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__BIG = FLOW__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__SMALL = FLOW__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__U = FLOW__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__STRIKE = FLOW__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__EM = FLOW__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__STRONG = FLOW__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__DFN = FLOW__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__CODE = FLOW__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__Q = FLOW__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__SAMP = FLOW__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__KBD = FLOW__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__VAR = FLOW__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__CITE = FLOW__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__ABBR = FLOW__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__ACRONYM = FLOW__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__SUB = FLOW__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__SUP = FLOW__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__INS = FLOW__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__DEL = FLOW__DEL;

	/**
	 * The feature id for the '<em><b>Abbr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__ABBR1 = FLOW_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__ALIGN = FLOW_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__AXIS = FLOW_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__CHAR = FLOW_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__CHAROFF = FLOW_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__CLASS = FLOW_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__COLSPAN = FLOW_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__HEADERS = FLOW_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__ID = FLOW_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__ROWSPAN = FLOW_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__SCOPE = FLOW_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__STYLE = FLOW_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__TITLE = FLOW_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE__VALIGN = FLOW_FEATURE_COUNT + 13;

	/**
	 * The number of structural features of the '<em>Th Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TH_TYPE_FEATURE_COUNT = FLOW_FEATURE_COUNT + 14;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.TrTypeImpl <em>Tr Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.TrTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getTrType()
	 * @generated
	 */
	int TR_TYPE = 60;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Th</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__TH = 1;

	/**
	 * The feature id for the '<em><b>Td</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__TD = 2;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__ALIGN = 3;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__CHAR = 4;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__CHAROFF = 5;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__CLASS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__ID = 7;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__STYLE = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__TITLE = 9;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE__VALIGN = 10;

	/**
	 * The number of structural features of the '<em>Tr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TR_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.TtTypeImpl <em>Tt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.TtTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getTtType()
	 * @generated
	 */
	int TT_TYPE = 61;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TT_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.UlTypeImpl <em>Ul Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.UlTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getUlType()
	 * @generated
	 */
	int UL_TYPE = 62;

	/**
	 * The feature id for the '<em><b>Li</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_TYPE__LI = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_TYPE__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_TYPE__STYLE = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_TYPE__TITLE = 4;

	/**
	 * The number of structural features of the '<em>Ul Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UL_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.UTypeImpl <em>UType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.UTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getUType()
	 * @generated
	 */
	int UTYPE = 63;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>UType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.impl.VarTypeImpl <em>Var Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.impl.VarTypeImpl
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getVarType()
	 * @generated
	 */
	int VAR_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__MIXED = INLINE__MIXED;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__GROUP = INLINE__GROUP;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__A = INLINE__A;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__BR = INLINE__BR;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__SPAN = INLINE__SPAN;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__OBJECT = INLINE__OBJECT;

	/**
	 * The feature id for the '<em><b>Img</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__IMG = INLINE__IMG;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__TT = INLINE__TT;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__I = INLINE__I;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__B = INLINE__B;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__BIG = INLINE__BIG;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__SMALL = INLINE__SMALL;

	/**
	 * The feature id for the '<em><b>U</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__U = INLINE__U;

	/**
	 * The feature id for the '<em><b>Strike</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__STRIKE = INLINE__STRIKE;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__EM = INLINE__EM;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__STRONG = INLINE__STRONG;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__DFN = INLINE__DFN;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__CODE = INLINE__CODE;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__Q = INLINE__Q;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__SAMP = INLINE__SAMP;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__KBD = INLINE__KBD;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__VAR = INLINE__VAR;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__CITE = INLINE__CITE;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__ABBR = INLINE__ABBR;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__ACRONYM = INLINE__ACRONYM;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__SUB = INLINE__SUB;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__SUP = INLINE__SUP;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__INS = INLINE__INS;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__DEL = INLINE__DEL;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__CLASS = INLINE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__ID = INLINE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__STYLE = INLINE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE__TITLE = INLINE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Var Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TYPE_FEATURE_COUNT = INLINE_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.AlignType <em>Align Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.AlignType
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getAlignType()
	 * @generated
	 */
	int ALIGN_TYPE = 65;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.DeclareType <em>Declare Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.DeclareType
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDeclareType()
	 * @generated
	 */
	int DECLARE_TYPE = 66;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.IsmapType <em>Ismap Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.IsmapType
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getIsmapType()
	 * @generated
	 */
	int ISMAP_TYPE = 67;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.Scope <em>Scope</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.Scope
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 68;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.Shape <em>Shape</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.Shape
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 69;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.ValignType <em>Valign Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.ValignType
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getValignType()
	 * @generated
	 */
	int VALIGN_TYPE = 70;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.rif12.xhtml.ValuetypeType <em>Valuetype Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.ValuetypeType
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getValuetypeType()
	 * @generated
	 */
	int VALUETYPE_TYPE = 71;

	/**
	 * The meta object id for the '<em>Align Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.AlignType
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getAlignTypeObject()
	 * @generated
	 */
	int ALIGN_TYPE_OBJECT = 72;

	/**
	 * The meta object id for the '<em>Character</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getCharacter()
	 * @generated
	 */
	int CHARACTER = 73;

	/**
	 * The meta object id for the '<em>Charset</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getCharset()
	 * @generated
	 */
	int CHARSET = 74;

	/**
	 * The meta object id for the '<em>Charsets</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getCharsets()
	 * @generated
	 */
	int CHARSETS = 75;

	/**
	 * The meta object id for the '<em>Content Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getContentType()
	 * @generated
	 */
	int CONTENT_TYPE = 76;

	/**
	 * The meta object id for the '<em>Content Types</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getContentTypes()
	 * @generated
	 */
	int CONTENT_TYPES = 77;

	/**
	 * The meta object id for the '<em>Coords</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getCoords()
	 * @generated
	 */
	int COORDS = 78;

	/**
	 * The meta object id for the '<em>Datetime</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDatetime()
	 * @generated
	 */
	int DATETIME = 79;

	/**
	 * The meta object id for the '<em>Declare Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.DeclareType
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDeclareTypeObject()
	 * @generated
	 */
	int DECLARE_TYPE_OBJECT = 80;

	/**
	 * The meta object id for the '<em>Ismap Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.IsmapType
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getIsmapTypeObject()
	 * @generated
	 */
	int ISMAP_TYPE_OBJECT = 81;

	/**
	 * The meta object id for the '<em>Language Code</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getLanguageCode()
	 * @generated
	 */
	int LANGUAGE_CODE = 82;

	/**
	 * The meta object id for the '<em>Length</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getLength()
	 * @generated
	 */
	int LENGTH = 83;

	/**
	 * The meta object id for the '<em>Link Types</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.List
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getLinkTypes()
	 * @generated
	 */
	int LINK_TYPES = 84;

	/**
	 * The meta object id for the '<em>Multi Length</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getMultiLength()
	 * @generated
	 */
	int MULTI_LENGTH = 85;

	/**
	 * The meta object id for the '<em>Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getNumber()
	 * @generated
	 */
	int NUMBER = 86;

	/**
	 * The meta object id for the '<em>Pixels</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getPixels()
	 * @generated
	 */
	int PIXELS = 87;

	/**
	 * The meta object id for the '<em>Scope Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.Scope
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getScopeObject()
	 * @generated
	 */
	int SCOPE_OBJECT = 88;

	/**
	 * The meta object id for the '<em>Script</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getScript()
	 * @generated
	 */
	int SCRIPT = 89;

	/**
	 * The meta object id for the '<em>Shape Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.Shape
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getShapeObject()
	 * @generated
	 */
	int SHAPE_OBJECT = 90;

	/**
	 * The meta object id for the '<em>Style Sheet</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getStyleSheet()
	 * @generated
	 */
	int STYLE_SHEET = 91;

	/**
	 * The meta object id for the '<em>Tabindex Number</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigInteger
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getTabindexNumber()
	 * @generated
	 */
	int TABINDEX_NUMBER = 92;

	/**
	 * The meta object id for the '<em>Text</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getText()
	 * @generated
	 */
	int TEXT = 93;

	/**
	 * The meta object id for the '<em>URI</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getURI()
	 * @generated
	 */
	int URI = 94;

	/**
	 * The meta object id for the '<em>Uri List</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getUriList()
	 * @generated
	 */
	int URI_LIST = 95;

	/**
	 * The meta object id for the '<em>Valign Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.ValignType
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getValignTypeObject()
	 * @generated
	 */
	int VALIGN_TYPE_OBJECT = 96;

	/**
	 * The meta object id for the '<em>Valuetype Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.rif12.xhtml.ValuetypeType
	 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getValuetypeTypeObject()
	 * @generated
	 */
	int VALUETYPE_TYPE_OBJECT = 97;


	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.AbbrType <em>Abbr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abbr Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AbbrType
	 * @generated
	 */
	EClass getAbbrType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AbbrType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AbbrType#getClass_()
	 * @see #getAbbrType()
	 * @generated
	 */
	EAttribute getAbbrType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AbbrType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AbbrType#getId()
	 * @see #getAbbrType()
	 * @generated
	 */
	EAttribute getAbbrType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AbbrType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AbbrType#getStyle()
	 * @see #getAbbrType()
	 * @generated
	 */
	EAttribute getAbbrType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AbbrType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AbbrType#getTitle()
	 * @see #getAbbrType()
	 * @generated
	 */
	EAttribute getAbbrType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.AContent <em>AContent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AContent</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent
	 * @generated
	 */
	EClass getAContent();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getMixed()
	 * @see #getAContent()
	 * @generated
	 */
	EAttribute getAContent_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getGroup()
	 * @see #getAContent()
	 * @generated
	 */
	EAttribute getAContent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getBr()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getSpan()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getObject()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getImg()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Img();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getTt()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getI()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getB()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getBig()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getSmall()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>U</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getU()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_U();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getStrike <em>Strike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strike</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getStrike()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Strike();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getEm()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getStrong()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getDfn()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getCode()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getQ()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getSamp()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getKbd()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getVar()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getCite()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getAbbr()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getAcronym()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getSub()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getSup()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getIns()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.AContent#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AContent#getDel()
	 * @see #getAContent()
	 * @generated
	 */
	EReference getAContent_Del();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.AcronymType <em>Acronym Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acronym Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AcronymType
	 * @generated
	 */
	EClass getAcronymType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AcronymType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AcronymType#getClass_()
	 * @see #getAcronymType()
	 * @generated
	 */
	EAttribute getAcronymType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AcronymType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AcronymType#getId()
	 * @see #getAcronymType()
	 * @generated
	 */
	EAttribute getAcronymType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AcronymType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AcronymType#getStyle()
	 * @see #getAcronymType()
	 * @generated
	 */
	EAttribute getAcronymType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AcronymType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AcronymType#getTitle()
	 * @see #getAcronymType()
	 * @generated
	 */
	EAttribute getAcronymType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AddressType
	 * @generated
	 */
	EClass getAddressType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AddressType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AddressType#getClass_()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AddressType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AddressType#getId()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AddressType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AddressType#getStyle()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AddressType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AddressType#getTitle()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.AType <em>AType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AType</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AType
	 * @generated
	 */
	EClass getAType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AType#getCharset <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charset</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AType#getCharset()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Charset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AType#getClass_()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AType#getCoords <em>Coords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coords</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AType#getCoords()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Coords();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AType#getHref()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AType#getHreflang <em>Hreflang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hreflang</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AType#getHreflang()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Hreflang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AType#getId()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AType#getName()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AType#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AType#getRel()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Rel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AType#getRev <em>Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rev</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AType#getRev()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Rev();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AType#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AType#getShape()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Shape();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AType#getStyle()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AType#getTitle()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.AType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AType#getType()
	 * @see #getAType()
	 * @generated
	 */
	EAttribute getAType_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.BigType <em>Big Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Big Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BigType
	 * @generated
	 */
	EClass getBigType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BigType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BigType#getClass_()
	 * @see #getBigType()
	 * @generated
	 */
	EAttribute getBigType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BigType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BigType#getId()
	 * @see #getBigType()
	 * @generated
	 */
	EAttribute getBigType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BigType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BigType#getStyle()
	 * @see #getBigType()
	 * @generated
	 */
	EAttribute getBigType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BigType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BigType#getTitle()
	 * @see #getBigType()
	 * @generated
	 */
	EAttribute getBigType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.xhtml.Block#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getGroup()
	 * @see #getBlock()
	 * @generated
	 */
	EAttribute getBlock_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Block#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getP()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Block#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getH1()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Block#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getH2()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Block#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getH3()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Block#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getH4()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Block#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getH5()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Block#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getH6()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Block#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getDiv()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Block#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getUl()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Block#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getOl()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Block#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dl</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getDl()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Dl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Block#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getPre()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Block#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getHr()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Block#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getBlockquote()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Block#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getAddress()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Block#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getTable()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Block#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getIns()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Block#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Block#getDel()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Del();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.BlockquoteType <em>Blockquote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blockquote Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BlockquoteType
	 * @generated
	 */
	EClass getBlockquoteType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BlockquoteType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cite</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BlockquoteType#getCite()
	 * @see #getBlockquoteType()
	 * @generated
	 */
	EAttribute getBlockquoteType_Cite();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BlockquoteType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BlockquoteType#getClass_()
	 * @see #getBlockquoteType()
	 * @generated
	 */
	EAttribute getBlockquoteType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BlockquoteType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BlockquoteType#getId()
	 * @see #getBlockquoteType()
	 * @generated
	 */
	EAttribute getBlockquoteType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BlockquoteType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BlockquoteType#getStyle()
	 * @see #getBlockquoteType()
	 * @generated
	 */
	EAttribute getBlockquoteType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BlockquoteType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BlockquoteType#getTitle()
	 * @see #getBlockquoteType()
	 * @generated
	 */
	EAttribute getBlockquoteType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.BodyType <em>Body Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Body Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BodyType
	 * @generated
	 */
	EClass getBodyType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BodyType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BodyType#getClass_()
	 * @see #getBodyType()
	 * @generated
	 */
	EAttribute getBodyType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BodyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BodyType#getId()
	 * @see #getBodyType()
	 * @generated
	 */
	EAttribute getBodyType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BodyType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BodyType#getStyle()
	 * @see #getBodyType()
	 * @generated
	 */
	EAttribute getBodyType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BodyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BodyType#getTitle()
	 * @see #getBodyType()
	 * @generated
	 */
	EAttribute getBodyType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.BrType <em>Br Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Br Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BrType
	 * @generated
	 */
	EClass getBrType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BrType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BrType#getClass_()
	 * @see #getBrType()
	 * @generated
	 */
	EAttribute getBrType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BrType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BrType#getId()
	 * @see #getBrType()
	 * @generated
	 */
	EAttribute getBrType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BrType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BrType#getStyle()
	 * @see #getBrType()
	 * @generated
	 */
	EAttribute getBrType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BrType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BrType#getTitle()
	 * @see #getBrType()
	 * @generated
	 */
	EAttribute getBrType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.BType <em>BType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BType</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BType
	 * @generated
	 */
	EClass getBType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BType#getClass_()
	 * @see #getBType()
	 * @generated
	 */
	EAttribute getBType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BType#getId()
	 * @see #getBType()
	 * @generated
	 */
	EAttribute getBType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BType#getStyle()
	 * @see #getBType()
	 * @generated
	 */
	EAttribute getBType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.BType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.BType#getTitle()
	 * @see #getBType()
	 * @generated
	 */
	EAttribute getBType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.CaptionType <em>Caption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caption Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.CaptionType
	 * @generated
	 */
	EClass getCaptionType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.CaptionType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.CaptionType#getClass_()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.CaptionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.CaptionType#getId()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.CaptionType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.CaptionType#getStyle()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.CaptionType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.CaptionType#getTitle()
	 * @see #getCaptionType()
	 * @generated
	 */
	EAttribute getCaptionType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.CiteType <em>Cite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cite Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.CiteType
	 * @generated
	 */
	EClass getCiteType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.CiteType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.CiteType#getClass_()
	 * @see #getCiteType()
	 * @generated
	 */
	EAttribute getCiteType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.CiteType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.CiteType#getId()
	 * @see #getCiteType()
	 * @generated
	 */
	EAttribute getCiteType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.CiteType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.CiteType#getStyle()
	 * @see #getCiteType()
	 * @generated
	 */
	EAttribute getCiteType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.CiteType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.CiteType#getTitle()
	 * @see #getCiteType()
	 * @generated
	 */
	EAttribute getCiteType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.CodeType <em>Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.CodeType
	 * @generated
	 */
	EClass getCodeType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.CodeType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.CodeType#getClass_()
	 * @see #getCodeType()
	 * @generated
	 */
	EAttribute getCodeType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.CodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.CodeType#getId()
	 * @see #getCodeType()
	 * @generated
	 */
	EAttribute getCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.CodeType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.CodeType#getStyle()
	 * @see #getCodeType()
	 * @generated
	 */
	EAttribute getCodeType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.CodeType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.CodeType#getTitle()
	 * @see #getCodeType()
	 * @generated
	 */
	EAttribute getCodeType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.ColgroupType <em>Colgroup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colgroup Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColgroupType
	 * @generated
	 */
	EClass getColgroupType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ColgroupType#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Col</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColgroupType#getCol()
	 * @see #getColgroupType()
	 * @generated
	 */
	EReference getColgroupType_Col();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColgroupType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColgroupType#getAlign()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColgroupType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColgroupType#getChar()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColgroupType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColgroupType#getCharoff()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColgroupType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColgroupType#getClass_()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColgroupType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColgroupType#getId()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColgroupType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColgroupType#getSpan()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Span();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColgroupType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColgroupType#getStyle()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColgroupType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColgroupType#getTitle()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColgroupType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColgroupType#getValign()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Valign();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColgroupType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColgroupType#getWidth()
	 * @see #getColgroupType()
	 * @generated
	 */
	EAttribute getColgroupType_Width();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.ColType <em>Col Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Col Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColType
	 * @generated
	 */
	EClass getColType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColType#getAlign()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColType#getChar()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColType#getCharoff()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColType#getClass_()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColType#getId()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColType#getSpan()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Span();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColType#getStyle()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColType#getTitle()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColType#getValign()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Valign();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ColType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ColType#getWidth()
	 * @see #getColType()
	 * @generated
	 */
	EAttribute getColType_Width();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.DdType <em>Dd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dd Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DdType
	 * @generated
	 */
	EClass getDdType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DdType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DdType#getClass_()
	 * @see #getDdType()
	 * @generated
	 */
	EAttribute getDdType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DdType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DdType#getId()
	 * @see #getDdType()
	 * @generated
	 */
	EAttribute getDdType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DdType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DdType#getStyle()
	 * @see #getDdType()
	 * @generated
	 */
	EAttribute getDdType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DdType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DdType#getTitle()
	 * @see #getDdType()
	 * @generated
	 */
	EAttribute getDdType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.DelType <em>Del Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Del Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DelType
	 * @generated
	 */
	EClass getDelType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DelType#getCite1 <em>Cite1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cite1</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DelType#getCite1()
	 * @see #getDelType()
	 * @generated
	 */
	EAttribute getDelType_Cite1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DelType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DelType#getClass_()
	 * @see #getDelType()
	 * @generated
	 */
	EAttribute getDelType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DelType#getDatetime <em>Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DelType#getDatetime()
	 * @see #getDelType()
	 * @generated
	 */
	EAttribute getDelType_Datetime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DelType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DelType#getId()
	 * @see #getDelType()
	 * @generated
	 */
	EAttribute getDelType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DelType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DelType#getStyle()
	 * @see #getDelType()
	 * @generated
	 */
	EAttribute getDelType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DelType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DelType#getTitle()
	 * @see #getDelType()
	 * @generated
	 */
	EAttribute getDelType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.DfnType <em>Dfn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dfn Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DfnType
	 * @generated
	 */
	EClass getDfnType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DfnType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DfnType#getClass_()
	 * @see #getDfnType()
	 * @generated
	 */
	EAttribute getDfnType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DfnType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DfnType#getId()
	 * @see #getDfnType()
	 * @generated
	 */
	EAttribute getDfnType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DfnType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DfnType#getStyle()
	 * @see #getDfnType()
	 * @generated
	 */
	EAttribute getDfnType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DfnType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DfnType#getTitle()
	 * @see #getDfnType()
	 * @generated
	 */
	EAttribute getDfnType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.DivType <em>Div Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DivType
	 * @generated
	 */
	EClass getDivType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DivType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DivType#getClass_()
	 * @see #getDivType()
	 * @generated
	 */
	EAttribute getDivType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DivType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DivType#getId()
	 * @see #getDivType()
	 * @generated
	 */
	EAttribute getDivType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DivType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DivType#getStyle()
	 * @see #getDivType()
	 * @generated
	 */
	EAttribute getDivType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DivType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DivType#getTitle()
	 * @see #getDivType()
	 * @generated
	 */
	EAttribute getDivType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.DlType <em>Dl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dl Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DlType
	 * @generated
	 */
	EClass getDlType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.xhtml.DlType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DlType#getGroup()
	 * @see #getDlType()
	 * @generated
	 */
	EAttribute getDlType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.DlType#getDt <em>Dt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dt</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DlType#getDt()
	 * @see #getDlType()
	 * @generated
	 */
	EReference getDlType_Dt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.DlType#getDd <em>Dd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dd</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DlType#getDd()
	 * @see #getDlType()
	 * @generated
	 */
	EReference getDlType_Dd();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DlType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DlType#getClass_()
	 * @see #getDlType()
	 * @generated
	 */
	EAttribute getDlType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DlType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DlType#getId()
	 * @see #getDlType()
	 * @generated
	 */
	EAttribute getDlType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DlType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DlType#getStyle()
	 * @see #getDlType()
	 * @generated
	 */
	EAttribute getDlType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DlType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DlType#getTitle()
	 * @see #getDlType()
	 * @generated
	 */
	EAttribute getDlType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>A</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getA()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_A();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getAbbr()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Abbr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getAcronym()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Acronym();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Address();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>B</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getB()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_B();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Big</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getBig()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Big();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Blockquote</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getBlockquote()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Blockquote();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getBody()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Body();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Br</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getBr()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Br();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caption</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getCaption()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Caption();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cite</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getCite()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Cite();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Code</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getCode()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Code();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Col</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getCol()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Col();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getColgroup <em>Colgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Colgroup</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getColgroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Colgroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getDd <em>Dd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dd</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getDd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dd();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Del</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getDel()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Del();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getDfn()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dfn();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Div</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getDiv()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Div();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dl</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getDl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dl();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getDt <em>Dt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Dt</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getDt()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Dt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Em</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getEm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Em();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H1</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getH1()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_H1();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H2</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getH2()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_H2();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H3</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getH3()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_H3();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H4</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getH4()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_H4();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H5</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getH5()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_H5();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>H6</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getH6()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_H6();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Hr</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getHr()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Hr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getHtml <em>Html</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Html</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getHtml()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Html();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>I</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getI()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_I();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Img</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getImg()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Img();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ins</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getIns()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Ins();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getKbd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Kbd();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getLi <em>Li</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Li</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getLi()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Li();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Object</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getObject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Object();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ol</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getOl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Ol();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>P</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getP()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_P();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Param</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getParam()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Param();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pre</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getPre()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Pre();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Q</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getQ()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Q();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Samp</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getSamp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Samp();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Small</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getSmall()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Small();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Span</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getSpan()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Span();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getStrike <em>Strike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strike</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getStrike()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Strike();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Strong</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getStrong()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Strong();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sub</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getSub()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sub();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Sup</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getSup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Sup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getTable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Table();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getTbody <em>Tbody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tbody</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getTbody()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Tbody();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getTd <em>Td</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Td</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getTd()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Td();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getTfoot <em>Tfoot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tfoot</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getTfoot()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Tfoot();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getTh <em>Th</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Th</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getTh()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Th();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getThead <em>Thead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thead</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getThead()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Thead();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tr</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getTr()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Tr();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tt</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getTt()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Tt();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>U</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getU()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_U();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ul</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getUl()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Ul();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.DocumentRoot#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DocumentRoot#getVar()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Var();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.DtType <em>Dt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dt Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DtType
	 * @generated
	 */
	EClass getDtType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DtType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DtType#getClass_()
	 * @see #getDtType()
	 * @generated
	 */
	EAttribute getDtType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DtType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DtType#getId()
	 * @see #getDtType()
	 * @generated
	 */
	EAttribute getDtType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DtType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DtType#getStyle()
	 * @see #getDtType()
	 * @generated
	 */
	EAttribute getDtType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.DtType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DtType#getTitle()
	 * @see #getDtType()
	 * @generated
	 */
	EAttribute getDtType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.EmType <em>Em Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Em Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.EmType
	 * @generated
	 */
	EClass getEmType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.EmType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.EmType#getClass_()
	 * @see #getEmType()
	 * @generated
	 */
	EAttribute getEmType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.EmType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.EmType#getId()
	 * @see #getEmType()
	 * @generated
	 */
	EAttribute getEmType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.EmType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.EmType#getStyle()
	 * @see #getEmType()
	 * @generated
	 */
	EAttribute getEmType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.EmType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.EmType#getTitle()
	 * @see #getEmType()
	 * @generated
	 */
	EAttribute getEmType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.Flow <em>Flow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Flow</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow
	 * @generated
	 */
	EClass getFlow();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getMixed()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getGroup()
	 * @see #getFlow()
	 * @generated
	 */
	EAttribute getFlow_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getP()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getH1()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getH2()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getH3()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getH4()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getH5()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getH6()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getDiv()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getUl()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getOl()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dl</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getDl()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Dl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getPre()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getHr()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getBlockquote()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getAddress()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getTable()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getA()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getBr()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getSpan()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getObject()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getImg()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Img();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getTt()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getI()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getB()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getBig()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getSmall()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>U</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getU()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_U();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getStrike <em>Strike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strike</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getStrike()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Strike();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getEm()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getStrong()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getDfn()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getCode()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getQ()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getSamp()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getKbd()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getVar()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getCite()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getAbbr()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getAcronym()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getSub()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getSup()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getIns()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Flow#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Flow#getDel()
	 * @see #getFlow()
	 * @generated
	 */
	EReference getFlow_Del();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.FormContent <em>Form Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Form Content</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent
	 * @generated
	 */
	EClass getFormContent();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getGroup()
	 * @see #getFormContent()
	 * @generated
	 */
	EAttribute getFormContent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getP()
	 * @see #getFormContent()
	 * @generated
	 */
	EReference getFormContent_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getH1()
	 * @see #getFormContent()
	 * @generated
	 */
	EReference getFormContent_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getH2()
	 * @see #getFormContent()
	 * @generated
	 */
	EReference getFormContent_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getH3()
	 * @see #getFormContent()
	 * @generated
	 */
	EReference getFormContent_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getH4()
	 * @see #getFormContent()
	 * @generated
	 */
	EReference getFormContent_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getH5()
	 * @see #getFormContent()
	 * @generated
	 */
	EReference getFormContent_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getH6()
	 * @see #getFormContent()
	 * @generated
	 */
	EReference getFormContent_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getDiv()
	 * @see #getFormContent()
	 * @generated
	 */
	EReference getFormContent_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getUl()
	 * @see #getFormContent()
	 * @generated
	 */
	EReference getFormContent_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getOl()
	 * @see #getFormContent()
	 * @generated
	 */
	EReference getFormContent_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dl</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getDl()
	 * @see #getFormContent()
	 * @generated
	 */
	EReference getFormContent_Dl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getPre()
	 * @see #getFormContent()
	 * @generated
	 */
	EReference getFormContent_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getHr()
	 * @see #getFormContent()
	 * @generated
	 */
	EReference getFormContent_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getBlockquote()
	 * @see #getFormContent()
	 * @generated
	 */
	EReference getFormContent_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getAddress()
	 * @see #getFormContent()
	 * @generated
	 */
	EReference getFormContent_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getTable()
	 * @see #getFormContent()
	 * @generated
	 */
	EReference getFormContent_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getIns()
	 * @see #getFormContent()
	 * @generated
	 */
	EReference getFormContent_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.FormContent#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.FormContent#getDel()
	 * @see #getFormContent()
	 * @generated
	 */
	EReference getFormContent_Del();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.H1Type <em>H1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H1 Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H1Type
	 * @generated
	 */
	EClass getH1Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H1Type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H1Type#getClass_()
	 * @see #getH1Type()
	 * @generated
	 */
	EAttribute getH1Type_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H1Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H1Type#getId()
	 * @see #getH1Type()
	 * @generated
	 */
	EAttribute getH1Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H1Type#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H1Type#getStyle()
	 * @see #getH1Type()
	 * @generated
	 */
	EAttribute getH1Type_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H1Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H1Type#getTitle()
	 * @see #getH1Type()
	 * @generated
	 */
	EAttribute getH1Type_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.H2Type <em>H2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H2 Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H2Type
	 * @generated
	 */
	EClass getH2Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H2Type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H2Type#getClass_()
	 * @see #getH2Type()
	 * @generated
	 */
	EAttribute getH2Type_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H2Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H2Type#getId()
	 * @see #getH2Type()
	 * @generated
	 */
	EAttribute getH2Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H2Type#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H2Type#getStyle()
	 * @see #getH2Type()
	 * @generated
	 */
	EAttribute getH2Type_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H2Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H2Type#getTitle()
	 * @see #getH2Type()
	 * @generated
	 */
	EAttribute getH2Type_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.H3Type <em>H3 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H3 Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H3Type
	 * @generated
	 */
	EClass getH3Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H3Type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H3Type#getClass_()
	 * @see #getH3Type()
	 * @generated
	 */
	EAttribute getH3Type_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H3Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H3Type#getId()
	 * @see #getH3Type()
	 * @generated
	 */
	EAttribute getH3Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H3Type#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H3Type#getStyle()
	 * @see #getH3Type()
	 * @generated
	 */
	EAttribute getH3Type_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H3Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H3Type#getTitle()
	 * @see #getH3Type()
	 * @generated
	 */
	EAttribute getH3Type_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.H4Type <em>H4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H4 Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H4Type
	 * @generated
	 */
	EClass getH4Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H4Type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H4Type#getClass_()
	 * @see #getH4Type()
	 * @generated
	 */
	EAttribute getH4Type_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H4Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H4Type#getId()
	 * @see #getH4Type()
	 * @generated
	 */
	EAttribute getH4Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H4Type#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H4Type#getStyle()
	 * @see #getH4Type()
	 * @generated
	 */
	EAttribute getH4Type_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H4Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H4Type#getTitle()
	 * @see #getH4Type()
	 * @generated
	 */
	EAttribute getH4Type_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.H5Type <em>H5 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H5 Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H5Type
	 * @generated
	 */
	EClass getH5Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H5Type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H5Type#getClass_()
	 * @see #getH5Type()
	 * @generated
	 */
	EAttribute getH5Type_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H5Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H5Type#getId()
	 * @see #getH5Type()
	 * @generated
	 */
	EAttribute getH5Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H5Type#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H5Type#getStyle()
	 * @see #getH5Type()
	 * @generated
	 */
	EAttribute getH5Type_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H5Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H5Type#getTitle()
	 * @see #getH5Type()
	 * @generated
	 */
	EAttribute getH5Type_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.H6Type <em>H6 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H6 Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H6Type
	 * @generated
	 */
	EClass getH6Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H6Type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H6Type#getClass_()
	 * @see #getH6Type()
	 * @generated
	 */
	EAttribute getH6Type_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H6Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H6Type#getId()
	 * @see #getH6Type()
	 * @generated
	 */
	EAttribute getH6Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H6Type#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H6Type#getStyle()
	 * @see #getH6Type()
	 * @generated
	 */
	EAttribute getH6Type_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.H6Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.H6Type#getTitle()
	 * @see #getH6Type()
	 * @generated
	 */
	EAttribute getH6Type_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.HrType <em>Hr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hr Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.HrType
	 * @generated
	 */
	EClass getHrType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.HrType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.HrType#getClass_()
	 * @see #getHrType()
	 * @generated
	 */
	EAttribute getHrType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.HrType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.HrType#getId()
	 * @see #getHrType()
	 * @generated
	 */
	EAttribute getHrType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.HrType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.HrType#getStyle()
	 * @see #getHrType()
	 * @generated
	 */
	EAttribute getHrType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.HrType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.HrType#getTitle()
	 * @see #getHrType()
	 * @generated
	 */
	EAttribute getHrType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.HtmlType <em>Html Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Html Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.HtmlType
	 * @generated
	 */
	EClass getHtmlType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.HtmlType#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Body</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.HtmlType#getBody()
	 * @see #getHtmlType()
	 * @generated
	 */
	EReference getHtmlType_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.HtmlType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.HtmlType#getId()
	 * @see #getHtmlType()
	 * @generated
	 */
	EAttribute getHtmlType_Id();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.ImgType <em>Img Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Img Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ImgType
	 * @generated
	 */
	EClass getImgType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getAlt <em>Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alt</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ImgType#getAlt()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Alt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ImgType#getClass_()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ImgType#getHeight()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ImgType#getId()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getIsmap <em>Ismap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ismap</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ImgType#getIsmap()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Ismap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getLongdesc <em>Longdesc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Longdesc</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ImgType#getLongdesc()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Longdesc();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Src</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ImgType#getSrc()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Src();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ImgType#getStyle()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ImgType#getTitle()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getUsemap <em>Usemap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usemap</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ImgType#getUsemap()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Usemap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ImgType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ImgType#getWidth()
	 * @see #getImgType()
	 * @generated
	 */
	EAttribute getImgType_Width();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.Inline <em>Inline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inline</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline
	 * @generated
	 */
	EClass getInline();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getMixed()
	 * @see #getInline()
	 * @generated
	 */
	EAttribute getInline_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getGroup()
	 * @see #getInline()
	 * @generated
	 */
	EAttribute getInline_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getA()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getBr()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getSpan()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getObject()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getImg()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Img();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getTt()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getI()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getB()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getBig()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getSmall()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>U</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getU()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_U();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getStrike <em>Strike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strike</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getStrike()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Strike();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getEm()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getStrong()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getDfn()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getCode()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getQ()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getSamp()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getKbd()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getVar()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getCite()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getAbbr()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getAcronym()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getSub()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getSup()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getIns()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.Inline#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Inline#getDel()
	 * @see #getInline()
	 * @generated
	 */
	EReference getInline_Del();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.InsType <em>Ins Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ins Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.InsType
	 * @generated
	 */
	EClass getInsType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.InsType#getCite1 <em>Cite1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cite1</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.InsType#getCite1()
	 * @see #getInsType()
	 * @generated
	 */
	EAttribute getInsType_Cite1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.InsType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.InsType#getClass_()
	 * @see #getInsType()
	 * @generated
	 */
	EAttribute getInsType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.InsType#getDatetime <em>Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.InsType#getDatetime()
	 * @see #getInsType()
	 * @generated
	 */
	EAttribute getInsType_Datetime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.InsType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.InsType#getId()
	 * @see #getInsType()
	 * @generated
	 */
	EAttribute getInsType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.InsType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.InsType#getStyle()
	 * @see #getInsType()
	 * @generated
	 */
	EAttribute getInsType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.InsType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.InsType#getTitle()
	 * @see #getInsType()
	 * @generated
	 */
	EAttribute getInsType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.IType <em>IType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IType</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.IType
	 * @generated
	 */
	EClass getIType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.IType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.IType#getClass_()
	 * @see #getIType()
	 * @generated
	 */
	EAttribute getIType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.IType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.IType#getId()
	 * @see #getIType()
	 * @generated
	 */
	EAttribute getIType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.IType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.IType#getStyle()
	 * @see #getIType()
	 * @generated
	 */
	EAttribute getIType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.IType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.IType#getTitle()
	 * @see #getIType()
	 * @generated
	 */
	EAttribute getIType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.KbdType <em>Kbd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kbd Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.KbdType
	 * @generated
	 */
	EClass getKbdType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.KbdType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.KbdType#getClass_()
	 * @see #getKbdType()
	 * @generated
	 */
	EAttribute getKbdType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.KbdType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.KbdType#getId()
	 * @see #getKbdType()
	 * @generated
	 */
	EAttribute getKbdType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.KbdType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.KbdType#getStyle()
	 * @see #getKbdType()
	 * @generated
	 */
	EAttribute getKbdType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.KbdType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.KbdType#getTitle()
	 * @see #getKbdType()
	 * @generated
	 */
	EAttribute getKbdType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.LiType <em>Li Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Li Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.LiType
	 * @generated
	 */
	EClass getLiType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.LiType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.LiType#getClass_()
	 * @see #getLiType()
	 * @generated
	 */
	EAttribute getLiType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.LiType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.LiType#getId()
	 * @see #getLiType()
	 * @generated
	 */
	EAttribute getLiType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.LiType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.LiType#getStyle()
	 * @see #getLiType()
	 * @generated
	 */
	EAttribute getLiType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.LiType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.LiType#getTitle()
	 * @see #getLiType()
	 * @generated
	 */
	EAttribute getLiType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.ObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType
	 * @generated
	 */
	EClass getObjectType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getMixed()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getGroup()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getParam()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Param();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getP()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getH1()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getH2()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getH3()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getH4()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getH5()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getH6()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getDiv()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getUl()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getOl()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dl</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getDl()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Dl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getPre()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getHr()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getBlockquote()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getAddress()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getTable()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getA()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getBr()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getSpan()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getObject()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getImg <em>Img</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Img</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getImg()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Img();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getTt()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getI()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getB()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getBig()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getSmall()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>U</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getU()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_U();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getStrike <em>Strike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strike</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getStrike()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Strike();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getEm()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getStrong()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getDfn()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getCode()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getQ()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getSamp()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getKbd()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getVar()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getCite()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getAbbr()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getAcronym()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getSub()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getSup()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getIns()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getDel()
	 * @see #getObjectType()
	 * @generated
	 */
	EReference getObjectType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getArchive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getArchive()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Archive();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getClass_()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getClassid <em>Classid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classid</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getClassid()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Classid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getCodebase <em>Codebase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codebase</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getCodebase()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Codebase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getCodetype <em>Codetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codetype</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getCodetype()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Codetype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getData()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getDeclare <em>Declare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declare</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getDeclare()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Declare();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getHeight()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getId()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getName()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getStandby <em>Standby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standby</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getStandby()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Standby();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getStyle()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getTabindex <em>Tabindex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tabindex</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getTabindex()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Tabindex();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getTitle()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getType()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getUsemap <em>Usemap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Usemap</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getUsemap()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Usemap();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ObjectType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ObjectType#getWidth()
	 * @see #getObjectType()
	 * @generated
	 */
	EAttribute getObjectType_Width();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.OlType <em>Ol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ol Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.OlType
	 * @generated
	 */
	EClass getOlType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.OlType#getLi <em>Li</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Li</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.OlType#getLi()
	 * @see #getOlType()
	 * @generated
	 */
	EReference getOlType_Li();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.OlType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.OlType#getClass_()
	 * @see #getOlType()
	 * @generated
	 */
	EAttribute getOlType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.OlType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.OlType#getId()
	 * @see #getOlType()
	 * @generated
	 */
	EAttribute getOlType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.OlType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.OlType#getStyle()
	 * @see #getOlType()
	 * @generated
	 */
	EAttribute getOlType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.OlType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.OlType#getTitle()
	 * @see #getOlType()
	 * @generated
	 */
	EAttribute getOlType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.ParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ParamType
	 * @generated
	 */
	EClass getParamType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ParamType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ParamType#getId()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ParamType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ParamType#getName()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ParamType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ParamType#getType()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ParamType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ParamType#getValue()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ParamType#getValuetype <em>Valuetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valuetype</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ParamType#getValuetype()
	 * @see #getParamType()
	 * @generated
	 */
	EAttribute getParamType_Valuetype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.PreContent <em>Pre Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Content</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent
	 * @generated
	 */
	EClass getPreContent();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getMixed()
	 * @see #getPreContent()
	 * @generated
	 */
	EAttribute getPreContent_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getGroup()
	 * @see #getPreContent()
	 * @generated
	 */
	EAttribute getPreContent_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getA()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getTt()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getI()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getB()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getBig()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getSmall()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getU <em>U</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>U</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getU()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_U();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getStrike <em>Strike</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strike</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getStrike()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Strike();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getEm()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getStrong()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getDfn()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getCode()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getQ()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getSamp()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getKbd()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getVar()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getCite()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getAbbr()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getAcronym()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getSub()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getSup()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getBr()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getSpan()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getIns()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.PreContent#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreContent#getDel()
	 * @see #getPreContent()
	 * @generated
	 */
	EReference getPreContent_Del();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.PreType <em>Pre Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreType
	 * @generated
	 */
	EClass getPreType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.PreType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreType#getClass_()
	 * @see #getPreType()
	 * @generated
	 */
	EAttribute getPreType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.PreType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreType#getId()
	 * @see #getPreType()
	 * @generated
	 */
	EAttribute getPreType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.PreType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreType#getStyle()
	 * @see #getPreType()
	 * @generated
	 */
	EAttribute getPreType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.PreType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PreType#getTitle()
	 * @see #getPreType()
	 * @generated
	 */
	EAttribute getPreType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.PType <em>PType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PType</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PType
	 * @generated
	 */
	EClass getPType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.PType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PType#getClass_()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.PType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PType#getId()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.PType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PType#getStyle()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.PType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.PType#getTitle()
	 * @see #getPType()
	 * @generated
	 */
	EAttribute getPType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.QType <em>QType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QType</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.QType
	 * @generated
	 */
	EClass getQType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.QType#getCite1 <em>Cite1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cite1</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.QType#getCite1()
	 * @see #getQType()
	 * @generated
	 */
	EAttribute getQType_Cite1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.QType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.QType#getClass_()
	 * @see #getQType()
	 * @generated
	 */
	EAttribute getQType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.QType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.QType#getId()
	 * @see #getQType()
	 * @generated
	 */
	EAttribute getQType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.QType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.QType#getStyle()
	 * @see #getQType()
	 * @generated
	 */
	EAttribute getQType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.QType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.QType#getTitle()
	 * @see #getQType()
	 * @generated
	 */
	EAttribute getQType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.SampType <em>Samp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Samp Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SampType
	 * @generated
	 */
	EClass getSampType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SampType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SampType#getClass_()
	 * @see #getSampType()
	 * @generated
	 */
	EAttribute getSampType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SampType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SampType#getId()
	 * @see #getSampType()
	 * @generated
	 */
	EAttribute getSampType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SampType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SampType#getStyle()
	 * @see #getSampType()
	 * @generated
	 */
	EAttribute getSampType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SampType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SampType#getTitle()
	 * @see #getSampType()
	 * @generated
	 */
	EAttribute getSampType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.SmallType <em>Small Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Small Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SmallType
	 * @generated
	 */
	EClass getSmallType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SmallType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SmallType#getClass_()
	 * @see #getSmallType()
	 * @generated
	 */
	EAttribute getSmallType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SmallType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SmallType#getId()
	 * @see #getSmallType()
	 * @generated
	 */
	EAttribute getSmallType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SmallType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SmallType#getStyle()
	 * @see #getSmallType()
	 * @generated
	 */
	EAttribute getSmallType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SmallType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SmallType#getTitle()
	 * @see #getSmallType()
	 * @generated
	 */
	EAttribute getSmallType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.SpanType <em>Span Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SpanType
	 * @generated
	 */
	EClass getSpanType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SpanType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SpanType#getClass_()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SpanType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SpanType#getId()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SpanType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SpanType#getStyle()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SpanType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SpanType#getTitle()
	 * @see #getSpanType()
	 * @generated
	 */
	EAttribute getSpanType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.StrikeType <em>Strike Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strike Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.StrikeType
	 * @generated
	 */
	EClass getStrikeType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.StrikeType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.StrikeType#getClass_()
	 * @see #getStrikeType()
	 * @generated
	 */
	EAttribute getStrikeType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.StrikeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.StrikeType#getId()
	 * @see #getStrikeType()
	 * @generated
	 */
	EAttribute getStrikeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.StrikeType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.StrikeType#getStyle()
	 * @see #getStrikeType()
	 * @generated
	 */
	EAttribute getStrikeType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.StrikeType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.StrikeType#getTitle()
	 * @see #getStrikeType()
	 * @generated
	 */
	EAttribute getStrikeType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.StrongType <em>Strong Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.StrongType
	 * @generated
	 */
	EClass getStrongType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.StrongType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.StrongType#getClass_()
	 * @see #getStrongType()
	 * @generated
	 */
	EAttribute getStrongType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.StrongType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.StrongType#getId()
	 * @see #getStrongType()
	 * @generated
	 */
	EAttribute getStrongType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.StrongType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.StrongType#getStyle()
	 * @see #getStrongType()
	 * @generated
	 */
	EAttribute getStrongType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.StrongType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.StrongType#getTitle()
	 * @see #getStrongType()
	 * @generated
	 */
	EAttribute getStrongType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.SubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SubType
	 * @generated
	 */
	EClass getSubType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SubType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SubType#getClass_()
	 * @see #getSubType()
	 * @generated
	 */
	EAttribute getSubType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SubType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SubType#getId()
	 * @see #getSubType()
	 * @generated
	 */
	EAttribute getSubType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SubType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SubType#getStyle()
	 * @see #getSubType()
	 * @generated
	 */
	EAttribute getSubType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SubType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SubType#getTitle()
	 * @see #getSubType()
	 * @generated
	 */
	EAttribute getSubType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.SupType <em>Sup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sup Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SupType
	 * @generated
	 */
	EClass getSupType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SupType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SupType#getClass_()
	 * @see #getSupType()
	 * @generated
	 */
	EAttribute getSupType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SupType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SupType#getId()
	 * @see #getSupType()
	 * @generated
	 */
	EAttribute getSupType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SupType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SupType#getStyle()
	 * @see #getSupType()
	 * @generated
	 */
	EAttribute getSupType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.SupType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.SupType#getTitle()
	 * @see #getSupType()
	 * @generated
	 */
	EAttribute getSupType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.TableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TableType
	 * @generated
	 */
	EClass getTableType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.TableType#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caption</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TableType#getCaption()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Caption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.TableType#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Col</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TableType#getCol()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Col();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.TableType#getColgroup <em>Colgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colgroup</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TableType#getColgroup()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Colgroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.TableType#getThead <em>Thead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thead</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TableType#getThead()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Thead();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.rif12.xhtml.TableType#getTfoot <em>Tfoot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tfoot</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TableType#getTfoot()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Tfoot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.TableType#getTbody <em>Tbody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tbody</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TableType#getTbody()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Tbody();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.TableType#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TableType#getTr()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Tr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TableType#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TableType#getBorder()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Border();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TableType#getCellpadding <em>Cellpadding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cellpadding</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TableType#getCellpadding()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Cellpadding();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TableType#getCellspacing <em>Cellspacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cellspacing</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TableType#getCellspacing()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Cellspacing();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TableType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TableType#getClass_()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TableType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TableType#getId()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TableType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TableType#getStyle()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TableType#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TableType#getSummary()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Summary();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TableType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TableType#getTitle()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TableType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TableType#getWidth()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Width();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.TbodyType <em>Tbody Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tbody Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TbodyType
	 * @generated
	 */
	EClass getTbodyType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.TbodyType#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TbodyType#getTr()
	 * @see #getTbodyType()
	 * @generated
	 */
	EReference getTbodyType_Tr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TbodyType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TbodyType#getAlign()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TbodyType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TbodyType#getChar()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TbodyType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TbodyType#getCharoff()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TbodyType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TbodyType#getClass_()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TbodyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TbodyType#getId()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TbodyType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TbodyType#getStyle()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TbodyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TbodyType#getTitle()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TbodyType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TbodyType#getValign()
	 * @see #getTbodyType()
	 * @generated
	 */
	EAttribute getTbodyType_Valign();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.TdType <em>Td Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Td Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TdType
	 * @generated
	 */
	EClass getTdType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TdType#getAbbr1 <em>Abbr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbr1</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TdType#getAbbr1()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Abbr1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TdType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TdType#getAlign()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TdType#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TdType#getAxis()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Axis();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TdType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TdType#getChar()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TdType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TdType#getCharoff()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TdType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TdType#getClass_()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TdType#getColspan <em>Colspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colspan</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TdType#getColspan()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Colspan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TdType#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Headers</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TdType#getHeaders()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Headers();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TdType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TdType#getId()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TdType#getRowspan <em>Rowspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowspan</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TdType#getRowspan()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Rowspan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TdType#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TdType#getScope()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TdType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TdType#getStyle()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TdType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TdType#getTitle()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TdType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TdType#getValign()
	 * @see #getTdType()
	 * @generated
	 */
	EAttribute getTdType_Valign();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.TfootType <em>Tfoot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tfoot Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TfootType
	 * @generated
	 */
	EClass getTfootType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.TfootType#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TfootType#getTr()
	 * @see #getTfootType()
	 * @generated
	 */
	EReference getTfootType_Tr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TfootType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TfootType#getAlign()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TfootType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TfootType#getChar()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TfootType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TfootType#getCharoff()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TfootType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TfootType#getClass_()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TfootType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TfootType#getId()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TfootType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TfootType#getStyle()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TfootType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TfootType#getTitle()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TfootType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TfootType#getValign()
	 * @see #getTfootType()
	 * @generated
	 */
	EAttribute getTfootType_Valign();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.TheadType <em>Thead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thead Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TheadType
	 * @generated
	 */
	EClass getTheadType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.TheadType#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TheadType#getTr()
	 * @see #getTheadType()
	 * @generated
	 */
	EReference getTheadType_Tr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TheadType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TheadType#getAlign()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TheadType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TheadType#getChar()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TheadType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TheadType#getCharoff()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TheadType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TheadType#getClass_()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TheadType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TheadType#getId()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TheadType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TheadType#getStyle()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TheadType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TheadType#getTitle()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TheadType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TheadType#getValign()
	 * @see #getTheadType()
	 * @generated
	 */
	EAttribute getTheadType_Valign();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.ThType <em>Th Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Th Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ThType
	 * @generated
	 */
	EClass getThType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ThType#getAbbr1 <em>Abbr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbr1</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ThType#getAbbr1()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Abbr1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ThType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ThType#getAlign()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ThType#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ThType#getAxis()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Axis();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ThType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ThType#getChar()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ThType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ThType#getCharoff()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ThType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ThType#getClass_()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ThType#getColspan <em>Colspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colspan</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ThType#getColspan()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Colspan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ThType#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Headers</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ThType#getHeaders()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Headers();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ThType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ThType#getId()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ThType#getRowspan <em>Rowspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowspan</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ThType#getRowspan()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Rowspan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ThType#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ThType#getScope()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ThType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ThType#getStyle()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ThType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ThType#getTitle()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.ThType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ThType#getValign()
	 * @see #getThType()
	 * @generated
	 */
	EAttribute getThType_Valign();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.TrType <em>Tr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tr Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TrType
	 * @generated
	 */
	EClass getTrType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.rif12.xhtml.TrType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TrType#getGroup()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.TrType#getTh <em>Th</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Th</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TrType#getTh()
	 * @see #getTrType()
	 * @generated
	 */
	EReference getTrType_Th();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.TrType#getTd <em>Td</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Td</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TrType#getTd()
	 * @see #getTrType()
	 * @generated
	 */
	EReference getTrType_Td();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TrType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TrType#getAlign()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TrType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TrType#getChar()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TrType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TrType#getCharoff()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TrType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TrType#getClass_()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TrType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TrType#getId()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TrType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TrType#getStyle()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TrType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TrType#getTitle()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TrType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TrType#getValign()
	 * @see #getTrType()
	 * @generated
	 */
	EAttribute getTrType_Valign();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.TtType <em>Tt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tt Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TtType
	 * @generated
	 */
	EClass getTtType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TtType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TtType#getClass_()
	 * @see #getTtType()
	 * @generated
	 */
	EAttribute getTtType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TtType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TtType#getId()
	 * @see #getTtType()
	 * @generated
	 */
	EAttribute getTtType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TtType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TtType#getStyle()
	 * @see #getTtType()
	 * @generated
	 */
	EAttribute getTtType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.TtType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.TtType#getTitle()
	 * @see #getTtType()
	 * @generated
	 */
	EAttribute getTtType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.UlType <em>Ul Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ul Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.UlType
	 * @generated
	 */
	EClass getUlType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.rif12.xhtml.UlType#getLi <em>Li</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Li</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.UlType#getLi()
	 * @see #getUlType()
	 * @generated
	 */
	EReference getUlType_Li();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.UlType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.UlType#getClass_()
	 * @see #getUlType()
	 * @generated
	 */
	EAttribute getUlType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.UlType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.UlType#getId()
	 * @see #getUlType()
	 * @generated
	 */
	EAttribute getUlType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.UlType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.UlType#getStyle()
	 * @see #getUlType()
	 * @generated
	 */
	EAttribute getUlType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.UlType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.UlType#getTitle()
	 * @see #getUlType()
	 * @generated
	 */
	EAttribute getUlType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.UType <em>UType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>UType</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.UType
	 * @generated
	 */
	EClass getUType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.UType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.UType#getClass_()
	 * @see #getUType()
	 * @generated
	 */
	EAttribute getUType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.UType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.UType#getId()
	 * @see #getUType()
	 * @generated
	 */
	EAttribute getUType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.UType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.UType#getStyle()
	 * @see #getUType()
	 * @generated
	 */
	EAttribute getUType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.UType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.UType#getTitle()
	 * @see #getUType()
	 * @generated
	 */
	EAttribute getUType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.rif12.xhtml.VarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.VarType
	 * @generated
	 */
	EClass getVarType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.VarType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.VarType#getClass_()
	 * @see #getVarType()
	 * @generated
	 */
	EAttribute getVarType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.VarType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.VarType#getId()
	 * @see #getVarType()
	 * @generated
	 */
	EAttribute getVarType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.VarType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.VarType#getStyle()
	 * @see #getVarType()
	 * @generated
	 */
	EAttribute getVarType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.rif12.xhtml.VarType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.VarType#getTitle()
	 * @see #getVarType()
	 * @generated
	 */
	EAttribute getVarType_Title();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.xhtml.AlignType <em>Align Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Align Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AlignType
	 * @generated
	 */
	EEnum getAlignType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.xhtml.DeclareType <em>Declare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Declare Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DeclareType
	 * @generated
	 */
	EEnum getDeclareType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.xhtml.IsmapType <em>Ismap Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Ismap Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.IsmapType
	 * @generated
	 */
	EEnum getIsmapType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.xhtml.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Scope
	 * @generated
	 */
	EEnum getScope();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.xhtml.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Shape</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Shape
	 * @generated
	 */
	EEnum getShape();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.xhtml.ValignType <em>Valign Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Valign Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ValignType
	 * @generated
	 */
	EEnum getValignType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.rif12.xhtml.ValuetypeType <em>Valuetype Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Valuetype Type</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ValuetypeType
	 * @generated
	 */
	EEnum getValuetypeType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif12.xhtml.AlignType <em>Align Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Align Type Object</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.AlignType
	 * @model instanceClass="org.eclipse.rmf.rif12.xhtml.AlignType"
	 *        extendedMetaData="name='align_._type:Object' baseType='align_._type'"
	 * @generated
	 */
	EDataType getAlignTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Character</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Character' baseType='http://www.eclipse.org/emf/2003/XMLType#string' length='1'"
	 * @generated
	 */
	EDataType getCharacter();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Charset</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Charset' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getCharset();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Charsets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Charsets</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Charsets' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getCharsets();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Content Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Content Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ContentType' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getContentType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Content Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Content Types</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='ContentTypes' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getContentTypes();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Coords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Coords</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Coords' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getCoords();

	/**
	 * Returns the meta object for data type '{@link javax.xml.datatype.XMLGregorianCalendar <em>Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Datetime</em>'.
	 * @see javax.xml.datatype.XMLGregorianCalendar
	 * @model instanceClass="javax.xml.datatype.XMLGregorianCalendar"
	 *        extendedMetaData="name='Datetime' baseType='http://www.eclipse.org/emf/2003/XMLType#dateTime'"
	 * @generated
	 */
	EDataType getDatetime();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif12.xhtml.DeclareType <em>Declare Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Declare Type Object</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.DeclareType
	 * @model instanceClass="org.eclipse.rmf.rif12.xhtml.DeclareType"
	 *        extendedMetaData="name='declare_._type:Object' baseType='declare_._type'"
	 * @generated
	 */
	EDataType getDeclareTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif12.xhtml.IsmapType <em>Ismap Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Ismap Type Object</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.IsmapType
	 * @model instanceClass="org.eclipse.rmf.rif12.xhtml.IsmapType"
	 *        extendedMetaData="name='ismap_._type:Object' baseType='ismap_._type'"
	 * @generated
	 */
	EDataType getIsmapTypeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Language Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Language Code</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='LanguageCode' baseType='http://www.eclipse.org/emf/2003/XMLType#language'"
	 * @generated
	 */
	EDataType getLanguageCode();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Length</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Length' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getLength();

	/**
	 * Returns the meta object for data type '{@link java.util.List <em>Link Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Link Types</em>'.
	 * @see java.util.List
	 * @model instanceClass="java.util.List"
	 *        extendedMetaData="name='LinkTypes' baseType='http://www.eclipse.org/emf/2003/XMLType#NMTOKENS'"
	 * @generated
	 */
	EDataType getLinkTypes();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Multi Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Multi Length</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='MultiLength' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='[-+]?(\\d+|\\d+(\\.\\d+)?%25)|[1-9]?(\\d+)?\\*'"
	 * @generated
	 */
	EDataType getMultiLength();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Number</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Number' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger' pattern='[0-9]+'"
	 * @generated
	 */
	EDataType getNumber();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Pixels</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pixels</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='Pixels' baseType='http://www.eclipse.org/emf/2003/XMLType#nonNegativeInteger'"
	 * @generated
	 */
	EDataType getPixels();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif12.xhtml.Scope <em>Scope Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scope Object</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Scope
	 * @model instanceClass="org.eclipse.rmf.rif12.xhtml.Scope"
	 *        extendedMetaData="name='Scope:Object' baseType='Scope'"
	 * @generated
	 */
	EDataType getScopeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Script</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Script</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Script' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getScript();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif12.xhtml.Shape <em>Shape Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Shape Object</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.Shape
	 * @model instanceClass="org.eclipse.rmf.rif12.xhtml.Shape"
	 *        extendedMetaData="name='Shape:Object' baseType='Shape'"
	 * @generated
	 */
	EDataType getShapeObject();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Style Sheet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Style Sheet</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='StyleSheet' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getStyleSheet();

	/**
	 * Returns the meta object for data type '{@link java.math.BigInteger <em>Tabindex Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Tabindex Number</em>'.
	 * @see java.math.BigInteger
	 * @model instanceClass="java.math.BigInteger"
	 *        extendedMetaData="name='tabindexNumber' baseType='Number' minInclusive='0' maxInclusive='32767'"
	 * @generated
	 */
	EDataType getTabindexNumber();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Text</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='Text' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getText();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>URI</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>URI</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='URI' baseType='http://www.eclipse.org/emf/2003/XMLType#anyURI'"
	 * @generated
	 */
	EDataType getURI();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Uri List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Uri List</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='UriList' baseType='http://www.eclipse.org/emf/2003/XMLType#string'"
	 * @generated
	 */
	EDataType getUriList();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif12.xhtml.ValignType <em>Valign Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Valign Type Object</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ValignType
	 * @model instanceClass="org.eclipse.rmf.rif12.xhtml.ValignType"
	 *        extendedMetaData="name='valign_._type:Object' baseType='valign_._type'"
	 * @generated
	 */
	EDataType getValignTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.rif12.xhtml.ValuetypeType <em>Valuetype Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Valuetype Type Object</em>'.
	 * @see org.eclipse.rmf.rif12.xhtml.ValuetypeType
	 * @model instanceClass="org.eclipse.rmf.rif12.xhtml.ValuetypeType"
	 *        extendedMetaData="name='valuetype_._type:Object' baseType='valuetype_._type'"
	 * @generated
	 */
	EDataType getValuetypeTypeObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XhtmlFactory getXhtmlFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.AbbrTypeImpl <em>Abbr Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.AbbrTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getAbbrType()
		 * @generated
		 */
		EClass ABBR_TYPE = eINSTANCE.getAbbrType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABBR_TYPE__CLASS = eINSTANCE.getAbbrType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABBR_TYPE__ID = eINSTANCE.getAbbrType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABBR_TYPE__STYLE = eINSTANCE.getAbbrType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABBR_TYPE__TITLE = eINSTANCE.getAbbrType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.AContentImpl <em>AContent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.AContentImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getAContent()
		 * @generated
		 */
		EClass ACONTENT = eINSTANCE.getAContent();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACONTENT__MIXED = eINSTANCE.getAContent_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACONTENT__GROUP = eINSTANCE.getAContent_Group();

		/**
		 * The meta object literal for the '<em><b>Br</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__BR = eINSTANCE.getAContent_Br();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__SPAN = eINSTANCE.getAContent_Span();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__OBJECT = eINSTANCE.getAContent_Object();

		/**
		 * The meta object literal for the '<em><b>Img</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__IMG = eINSTANCE.getAContent_Img();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__TT = eINSTANCE.getAContent_Tt();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__I = eINSTANCE.getAContent_I();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__B = eINSTANCE.getAContent_B();

		/**
		 * The meta object literal for the '<em><b>Big</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__BIG = eINSTANCE.getAContent_Big();

		/**
		 * The meta object literal for the '<em><b>Small</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__SMALL = eINSTANCE.getAContent_Small();

		/**
		 * The meta object literal for the '<em><b>U</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__U = eINSTANCE.getAContent_U();

		/**
		 * The meta object literal for the '<em><b>Strike</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__STRIKE = eINSTANCE.getAContent_Strike();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__EM = eINSTANCE.getAContent_Em();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__STRONG = eINSTANCE.getAContent_Strong();

		/**
		 * The meta object literal for the '<em><b>Dfn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__DFN = eINSTANCE.getAContent_Dfn();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__CODE = eINSTANCE.getAContent_Code();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__Q = eINSTANCE.getAContent_Q();

		/**
		 * The meta object literal for the '<em><b>Samp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__SAMP = eINSTANCE.getAContent_Samp();

		/**
		 * The meta object literal for the '<em><b>Kbd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__KBD = eINSTANCE.getAContent_Kbd();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__VAR = eINSTANCE.getAContent_Var();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__CITE = eINSTANCE.getAContent_Cite();

		/**
		 * The meta object literal for the '<em><b>Abbr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__ABBR = eINSTANCE.getAContent_Abbr();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__ACRONYM = eINSTANCE.getAContent_Acronym();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__SUB = eINSTANCE.getAContent_Sub();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__SUP = eINSTANCE.getAContent_Sup();

		/**
		 * The meta object literal for the '<em><b>Ins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__INS = eINSTANCE.getAContent_Ins();

		/**
		 * The meta object literal for the '<em><b>Del</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACONTENT__DEL = eINSTANCE.getAContent_Del();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.AcronymTypeImpl <em>Acronym Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.AcronymTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getAcronymType()
		 * @generated
		 */
		EClass ACRONYM_TYPE = eINSTANCE.getAcronymType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACRONYM_TYPE__CLASS = eINSTANCE.getAcronymType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACRONYM_TYPE__ID = eINSTANCE.getAcronymType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACRONYM_TYPE__STYLE = eINSTANCE.getAcronymType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACRONYM_TYPE__TITLE = eINSTANCE.getAcronymType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.AddressTypeImpl <em>Address Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.AddressTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getAddressType()
		 * @generated
		 */
		EClass ADDRESS_TYPE = eINSTANCE.getAddressType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__CLASS = eINSTANCE.getAddressType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__ID = eINSTANCE.getAddressType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__STYLE = eINSTANCE.getAddressType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__TITLE = eINSTANCE.getAddressType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.ATypeImpl <em>AType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.ATypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getAType()
		 * @generated
		 */
		EClass ATYPE = eINSTANCE.getAType();

		/**
		 * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__CHARSET = eINSTANCE.getAType_Charset();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__CLASS = eINSTANCE.getAType_Class();

		/**
		 * The meta object literal for the '<em><b>Coords</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__COORDS = eINSTANCE.getAType_Coords();

		/**
		 * The meta object literal for the '<em><b>Href</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__HREF = eINSTANCE.getAType_Href();

		/**
		 * The meta object literal for the '<em><b>Hreflang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__HREFLANG = eINSTANCE.getAType_Hreflang();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__ID = eINSTANCE.getAType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__NAME = eINSTANCE.getAType_Name();

		/**
		 * The meta object literal for the '<em><b>Rel</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__REL = eINSTANCE.getAType_Rel();

		/**
		 * The meta object literal for the '<em><b>Rev</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__REV = eINSTANCE.getAType_Rev();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__SHAPE = eINSTANCE.getAType_Shape();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__STYLE = eINSTANCE.getAType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__TITLE = eINSTANCE.getAType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATYPE__TYPE = eINSTANCE.getAType_Type();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.BigTypeImpl <em>Big Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.BigTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getBigType()
		 * @generated
		 */
		EClass BIG_TYPE = eINSTANCE.getBigType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_TYPE__CLASS = eINSTANCE.getBigType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_TYPE__ID = eINSTANCE.getBigType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_TYPE__STYLE = eINSTANCE.getBigType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BIG_TYPE__TITLE = eINSTANCE.getBigType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.BlockImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCK__GROUP = eINSTANCE.getBlock_Group();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__P = eINSTANCE.getBlock_P();

		/**
		 * The meta object literal for the '<em><b>H1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__H1 = eINSTANCE.getBlock_H1();

		/**
		 * The meta object literal for the '<em><b>H2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__H2 = eINSTANCE.getBlock_H2();

		/**
		 * The meta object literal for the '<em><b>H3</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__H3 = eINSTANCE.getBlock_H3();

		/**
		 * The meta object literal for the '<em><b>H4</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__H4 = eINSTANCE.getBlock_H4();

		/**
		 * The meta object literal for the '<em><b>H5</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__H5 = eINSTANCE.getBlock_H5();

		/**
		 * The meta object literal for the '<em><b>H6</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__H6 = eINSTANCE.getBlock_H6();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__DIV = eINSTANCE.getBlock_Div();

		/**
		 * The meta object literal for the '<em><b>Ul</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__UL = eINSTANCE.getBlock_Ul();

		/**
		 * The meta object literal for the '<em><b>Ol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__OL = eINSTANCE.getBlock_Ol();

		/**
		 * The meta object literal for the '<em><b>Dl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__DL = eINSTANCE.getBlock_Dl();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__PRE = eINSTANCE.getBlock_Pre();

		/**
		 * The meta object literal for the '<em><b>Hr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__HR = eINSTANCE.getBlock_Hr();

		/**
		 * The meta object literal for the '<em><b>Blockquote</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__BLOCKQUOTE = eINSTANCE.getBlock_Blockquote();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__ADDRESS = eINSTANCE.getBlock_Address();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__TABLE = eINSTANCE.getBlock_Table();

		/**
		 * The meta object literal for the '<em><b>Ins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__INS = eINSTANCE.getBlock_Ins();

		/**
		 * The meta object literal for the '<em><b>Del</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__DEL = eINSTANCE.getBlock_Del();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.BlockquoteTypeImpl <em>Blockquote Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.BlockquoteTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getBlockquoteType()
		 * @generated
		 */
		EClass BLOCKQUOTE_TYPE = eINSTANCE.getBlockquoteType();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKQUOTE_TYPE__CITE = eINSTANCE.getBlockquoteType_Cite();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKQUOTE_TYPE__CLASS = eINSTANCE.getBlockquoteType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKQUOTE_TYPE__ID = eINSTANCE.getBlockquoteType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKQUOTE_TYPE__STYLE = eINSTANCE.getBlockquoteType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BLOCKQUOTE_TYPE__TITLE = eINSTANCE.getBlockquoteType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.BodyTypeImpl <em>Body Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.BodyTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getBodyType()
		 * @generated
		 */
		EClass BODY_TYPE = eINSTANCE.getBodyType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY_TYPE__CLASS = eINSTANCE.getBodyType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY_TYPE__ID = eINSTANCE.getBodyType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY_TYPE__STYLE = eINSTANCE.getBodyType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BODY_TYPE__TITLE = eINSTANCE.getBodyType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.BrTypeImpl <em>Br Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.BrTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getBrType()
		 * @generated
		 */
		EClass BR_TYPE = eINSTANCE.getBrType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BR_TYPE__CLASS = eINSTANCE.getBrType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BR_TYPE__ID = eINSTANCE.getBrType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BR_TYPE__STYLE = eINSTANCE.getBrType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BR_TYPE__TITLE = eINSTANCE.getBrType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.BTypeImpl <em>BType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.BTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getBType()
		 * @generated
		 */
		EClass BTYPE = eINSTANCE.getBType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTYPE__CLASS = eINSTANCE.getBType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTYPE__ID = eINSTANCE.getBType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTYPE__STYLE = eINSTANCE.getBType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BTYPE__TITLE = eINSTANCE.getBType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.CaptionTypeImpl <em>Caption Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.CaptionTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getCaptionType()
		 * @generated
		 */
		EClass CAPTION_TYPE = eINSTANCE.getCaptionType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPTION_TYPE__CLASS = eINSTANCE.getCaptionType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPTION_TYPE__ID = eINSTANCE.getCaptionType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPTION_TYPE__STYLE = eINSTANCE.getCaptionType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPTION_TYPE__TITLE = eINSTANCE.getCaptionType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.CiteTypeImpl <em>Cite Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.CiteTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getCiteType()
		 * @generated
		 */
		EClass CITE_TYPE = eINSTANCE.getCiteType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITE_TYPE__CLASS = eINSTANCE.getCiteType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITE_TYPE__ID = eINSTANCE.getCiteType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITE_TYPE__STYLE = eINSTANCE.getCiteType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CITE_TYPE__TITLE = eINSTANCE.getCiteType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.CodeTypeImpl <em>Code Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.CodeTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getCodeType()
		 * @generated
		 */
		EClass CODE_TYPE = eINSTANCE.getCodeType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_TYPE__CLASS = eINSTANCE.getCodeType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_TYPE__ID = eINSTANCE.getCodeType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_TYPE__STYLE = eINSTANCE.getCodeType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODE_TYPE__TITLE = eINSTANCE.getCodeType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.ColgroupTypeImpl <em>Colgroup Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.ColgroupTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getColgroupType()
		 * @generated
		 */
		EClass COLGROUP_TYPE = eINSTANCE.getColgroupType();

		/**
		 * The meta object literal for the '<em><b>Col</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COLGROUP_TYPE__COL = eINSTANCE.getColgroupType_Col();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__ALIGN = eINSTANCE.getColgroupType_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__CHAR = eINSTANCE.getColgroupType_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__CHAROFF = eINSTANCE.getColgroupType_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__CLASS = eINSTANCE.getColgroupType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__ID = eINSTANCE.getColgroupType_Id();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__SPAN = eINSTANCE.getColgroupType_Span();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__STYLE = eINSTANCE.getColgroupType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__TITLE = eINSTANCE.getColgroupType_Title();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__VALIGN = eINSTANCE.getColgroupType_Valign();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLGROUP_TYPE__WIDTH = eINSTANCE.getColgroupType_Width();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.ColTypeImpl <em>Col Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.ColTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getColType()
		 * @generated
		 */
		EClass COL_TYPE = eINSTANCE.getColType();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__ALIGN = eINSTANCE.getColType_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__CHAR = eINSTANCE.getColType_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__CHAROFF = eINSTANCE.getColType_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__CLASS = eINSTANCE.getColType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__ID = eINSTANCE.getColType_Id();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__SPAN = eINSTANCE.getColType_Span();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__STYLE = eINSTANCE.getColType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__TITLE = eINSTANCE.getColType_Title();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__VALIGN = eINSTANCE.getColType_Valign();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COL_TYPE__WIDTH = eINSTANCE.getColType_Width();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.DdTypeImpl <em>Dd Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.DdTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDdType()
		 * @generated
		 */
		EClass DD_TYPE = eINSTANCE.getDdType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DD_TYPE__CLASS = eINSTANCE.getDdType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DD_TYPE__ID = eINSTANCE.getDdType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DD_TYPE__STYLE = eINSTANCE.getDdType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DD_TYPE__TITLE = eINSTANCE.getDdType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.DelTypeImpl <em>Del Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.DelTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDelType()
		 * @generated
		 */
		EClass DEL_TYPE = eINSTANCE.getDelType();

		/**
		 * The meta object literal for the '<em><b>Cite1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEL_TYPE__CITE1 = eINSTANCE.getDelType_Cite1();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEL_TYPE__CLASS = eINSTANCE.getDelType_Class();

		/**
		 * The meta object literal for the '<em><b>Datetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEL_TYPE__DATETIME = eINSTANCE.getDelType_Datetime();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEL_TYPE__ID = eINSTANCE.getDelType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEL_TYPE__STYLE = eINSTANCE.getDelType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEL_TYPE__TITLE = eINSTANCE.getDelType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.DfnTypeImpl <em>Dfn Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.DfnTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDfnType()
		 * @generated
		 */
		EClass DFN_TYPE = eINSTANCE.getDfnType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFN_TYPE__CLASS = eINSTANCE.getDfnType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFN_TYPE__ID = eINSTANCE.getDfnType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFN_TYPE__STYLE = eINSTANCE.getDfnType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DFN_TYPE__TITLE = eINSTANCE.getDfnType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.DivTypeImpl <em>Div Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.DivTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDivType()
		 * @generated
		 */
		EClass DIV_TYPE = eINSTANCE.getDivType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV_TYPE__CLASS = eINSTANCE.getDivType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV_TYPE__ID = eINSTANCE.getDivType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV_TYPE__STYLE = eINSTANCE.getDivType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DIV_TYPE__TITLE = eINSTANCE.getDivType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.DlTypeImpl <em>Dl Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.DlTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDlType()
		 * @generated
		 */
		EClass DL_TYPE = eINSTANCE.getDlType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DL_TYPE__GROUP = eINSTANCE.getDlType_Group();

		/**
		 * The meta object literal for the '<em><b>Dt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DL_TYPE__DT = eINSTANCE.getDlType_Dt();

		/**
		 * The meta object literal for the '<em><b>Dd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DL_TYPE__DD = eINSTANCE.getDlType_Dd();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DL_TYPE__CLASS = eINSTANCE.getDlType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DL_TYPE__ID = eINSTANCE.getDlType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DL_TYPE__STYLE = eINSTANCE.getDlType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DL_TYPE__TITLE = eINSTANCE.getDlType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.DocumentRootImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__A = eINSTANCE.getDocumentRoot_A();

		/**
		 * The meta object literal for the '<em><b>Abbr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ABBR = eINSTANCE.getDocumentRoot_Abbr();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ACRONYM = eINSTANCE.getDocumentRoot_Acronym();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADDRESS = eINSTANCE.getDocumentRoot_Address();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__B = eINSTANCE.getDocumentRoot_B();

		/**
		 * The meta object literal for the '<em><b>Big</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BIG = eINSTANCE.getDocumentRoot_Big();

		/**
		 * The meta object literal for the '<em><b>Blockquote</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BLOCKQUOTE = eINSTANCE.getDocumentRoot_Blockquote();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BODY = eINSTANCE.getDocumentRoot_Body();

		/**
		 * The meta object literal for the '<em><b>Br</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BR = eINSTANCE.getDocumentRoot_Br();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CAPTION = eINSTANCE.getDocumentRoot_Caption();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CITE = eINSTANCE.getDocumentRoot_Cite();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CODE = eINSTANCE.getDocumentRoot_Code();

		/**
		 * The meta object literal for the '<em><b>Col</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COL = eINSTANCE.getDocumentRoot_Col();

		/**
		 * The meta object literal for the '<em><b>Colgroup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COLGROUP = eINSTANCE.getDocumentRoot_Colgroup();

		/**
		 * The meta object literal for the '<em><b>Dd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DD = eINSTANCE.getDocumentRoot_Dd();

		/**
		 * The meta object literal for the '<em><b>Del</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DEL = eINSTANCE.getDocumentRoot_Del();

		/**
		 * The meta object literal for the '<em><b>Dfn</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DFN = eINSTANCE.getDocumentRoot_Dfn();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DIV = eINSTANCE.getDocumentRoot_Div();

		/**
		 * The meta object literal for the '<em><b>Dl</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DL = eINSTANCE.getDocumentRoot_Dl();

		/**
		 * The meta object literal for the '<em><b>Dt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__DT = eINSTANCE.getDocumentRoot_Dt();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EM = eINSTANCE.getDocumentRoot_Em();

		/**
		 * The meta object literal for the '<em><b>H1</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__H1 = eINSTANCE.getDocumentRoot_H1();

		/**
		 * The meta object literal for the '<em><b>H2</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__H2 = eINSTANCE.getDocumentRoot_H2();

		/**
		 * The meta object literal for the '<em><b>H3</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__H3 = eINSTANCE.getDocumentRoot_H3();

		/**
		 * The meta object literal for the '<em><b>H4</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__H4 = eINSTANCE.getDocumentRoot_H4();

		/**
		 * The meta object literal for the '<em><b>H5</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__H5 = eINSTANCE.getDocumentRoot_H5();

		/**
		 * The meta object literal for the '<em><b>H6</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__H6 = eINSTANCE.getDocumentRoot_H6();

		/**
		 * The meta object literal for the '<em><b>Hr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HR = eINSTANCE.getDocumentRoot_Hr();

		/**
		 * The meta object literal for the '<em><b>Html</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__HTML = eINSTANCE.getDocumentRoot_Html();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__I = eINSTANCE.getDocumentRoot_I();

		/**
		 * The meta object literal for the '<em><b>Img</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMG = eINSTANCE.getDocumentRoot_Img();

		/**
		 * The meta object literal for the '<em><b>Ins</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INS = eINSTANCE.getDocumentRoot_Ins();

		/**
		 * The meta object literal for the '<em><b>Kbd</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KBD = eINSTANCE.getDocumentRoot_Kbd();

		/**
		 * The meta object literal for the '<em><b>Li</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LI = eINSTANCE.getDocumentRoot_Li();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OBJECT = eINSTANCE.getDocumentRoot_Object();

		/**
		 * The meta object literal for the '<em><b>Ol</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OL = eINSTANCE.getDocumentRoot_Ol();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__P = eINSTANCE.getDocumentRoot_P();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARAM = eINSTANCE.getDocumentRoot_Param();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PRE = eINSTANCE.getDocumentRoot_Pre();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__Q = eINSTANCE.getDocumentRoot_Q();

		/**
		 * The meta object literal for the '<em><b>Samp</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SAMP = eINSTANCE.getDocumentRoot_Samp();

		/**
		 * The meta object literal for the '<em><b>Small</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SMALL = eINSTANCE.getDocumentRoot_Small();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SPAN = eINSTANCE.getDocumentRoot_Span();

		/**
		 * The meta object literal for the '<em><b>Strike</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STRIKE = eINSTANCE.getDocumentRoot_Strike();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__STRONG = eINSTANCE.getDocumentRoot_Strong();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUB = eINSTANCE.getDocumentRoot_Sub();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SUP = eINSTANCE.getDocumentRoot_Sup();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TABLE = eINSTANCE.getDocumentRoot_Table();

		/**
		 * The meta object literal for the '<em><b>Tbody</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TBODY = eINSTANCE.getDocumentRoot_Tbody();

		/**
		 * The meta object literal for the '<em><b>Td</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TD = eINSTANCE.getDocumentRoot_Td();

		/**
		 * The meta object literal for the '<em><b>Tfoot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TFOOT = eINSTANCE.getDocumentRoot_Tfoot();

		/**
		 * The meta object literal for the '<em><b>Th</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TH = eINSTANCE.getDocumentRoot_Th();

		/**
		 * The meta object literal for the '<em><b>Thead</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__THEAD = eINSTANCE.getDocumentRoot_Thead();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TR = eINSTANCE.getDocumentRoot_Tr();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TT = eINSTANCE.getDocumentRoot_Tt();

		/**
		 * The meta object literal for the '<em><b>U</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__U = eINSTANCE.getDocumentRoot_U();

		/**
		 * The meta object literal for the '<em><b>Ul</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__UL = eINSTANCE.getDocumentRoot_Ul();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__VAR = eINSTANCE.getDocumentRoot_Var();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.DtTypeImpl <em>Dt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.DtTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDtType()
		 * @generated
		 */
		EClass DT_TYPE = eINSTANCE.getDtType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DT_TYPE__CLASS = eINSTANCE.getDtType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DT_TYPE__ID = eINSTANCE.getDtType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DT_TYPE__STYLE = eINSTANCE.getDtType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DT_TYPE__TITLE = eINSTANCE.getDtType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.EmTypeImpl <em>Em Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.EmTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getEmType()
		 * @generated
		 */
		EClass EM_TYPE = eINSTANCE.getEmType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_TYPE__CLASS = eINSTANCE.getEmType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_TYPE__ID = eINSTANCE.getEmType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_TYPE__STYLE = eINSTANCE.getEmType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EM_TYPE__TITLE = eINSTANCE.getEmType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.FlowImpl <em>Flow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.FlowImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getFlow()
		 * @generated
		 */
		EClass FLOW = eINSTANCE.getFlow();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__MIXED = eINSTANCE.getFlow_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLOW__GROUP = eINSTANCE.getFlow_Group();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__P = eINSTANCE.getFlow_P();

		/**
		 * The meta object literal for the '<em><b>H1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__H1 = eINSTANCE.getFlow_H1();

		/**
		 * The meta object literal for the '<em><b>H2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__H2 = eINSTANCE.getFlow_H2();

		/**
		 * The meta object literal for the '<em><b>H3</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__H3 = eINSTANCE.getFlow_H3();

		/**
		 * The meta object literal for the '<em><b>H4</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__H4 = eINSTANCE.getFlow_H4();

		/**
		 * The meta object literal for the '<em><b>H5</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__H5 = eINSTANCE.getFlow_H5();

		/**
		 * The meta object literal for the '<em><b>H6</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__H6 = eINSTANCE.getFlow_H6();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__DIV = eINSTANCE.getFlow_Div();

		/**
		 * The meta object literal for the '<em><b>Ul</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__UL = eINSTANCE.getFlow_Ul();

		/**
		 * The meta object literal for the '<em><b>Ol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__OL = eINSTANCE.getFlow_Ol();

		/**
		 * The meta object literal for the '<em><b>Dl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__DL = eINSTANCE.getFlow_Dl();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__PRE = eINSTANCE.getFlow_Pre();

		/**
		 * The meta object literal for the '<em><b>Hr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__HR = eINSTANCE.getFlow_Hr();

		/**
		 * The meta object literal for the '<em><b>Blockquote</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__BLOCKQUOTE = eINSTANCE.getFlow_Blockquote();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__ADDRESS = eINSTANCE.getFlow_Address();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__TABLE = eINSTANCE.getFlow_Table();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__A = eINSTANCE.getFlow_A();

		/**
		 * The meta object literal for the '<em><b>Br</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__BR = eINSTANCE.getFlow_Br();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SPAN = eINSTANCE.getFlow_Span();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__OBJECT = eINSTANCE.getFlow_Object();

		/**
		 * The meta object literal for the '<em><b>Img</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__IMG = eINSTANCE.getFlow_Img();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__TT = eINSTANCE.getFlow_Tt();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__I = eINSTANCE.getFlow_I();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__B = eINSTANCE.getFlow_B();

		/**
		 * The meta object literal for the '<em><b>Big</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__BIG = eINSTANCE.getFlow_Big();

		/**
		 * The meta object literal for the '<em><b>Small</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SMALL = eINSTANCE.getFlow_Small();

		/**
		 * The meta object literal for the '<em><b>U</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__U = eINSTANCE.getFlow_U();

		/**
		 * The meta object literal for the '<em><b>Strike</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__STRIKE = eINSTANCE.getFlow_Strike();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__EM = eINSTANCE.getFlow_Em();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__STRONG = eINSTANCE.getFlow_Strong();

		/**
		 * The meta object literal for the '<em><b>Dfn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__DFN = eINSTANCE.getFlow_Dfn();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__CODE = eINSTANCE.getFlow_Code();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__Q = eINSTANCE.getFlow_Q();

		/**
		 * The meta object literal for the '<em><b>Samp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SAMP = eINSTANCE.getFlow_Samp();

		/**
		 * The meta object literal for the '<em><b>Kbd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__KBD = eINSTANCE.getFlow_Kbd();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__VAR = eINSTANCE.getFlow_Var();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__CITE = eINSTANCE.getFlow_Cite();

		/**
		 * The meta object literal for the '<em><b>Abbr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__ABBR = eINSTANCE.getFlow_Abbr();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__ACRONYM = eINSTANCE.getFlow_Acronym();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SUB = eINSTANCE.getFlow_Sub();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__SUP = eINSTANCE.getFlow_Sup();

		/**
		 * The meta object literal for the '<em><b>Ins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__INS = eINSTANCE.getFlow_Ins();

		/**
		 * The meta object literal for the '<em><b>Del</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLOW__DEL = eINSTANCE.getFlow_Del();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.FormContentImpl <em>Form Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.FormContentImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getFormContent()
		 * @generated
		 */
		EClass FORM_CONTENT = eINSTANCE.getFormContent();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FORM_CONTENT__GROUP = eINSTANCE.getFormContent_Group();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CONTENT__P = eINSTANCE.getFormContent_P();

		/**
		 * The meta object literal for the '<em><b>H1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CONTENT__H1 = eINSTANCE.getFormContent_H1();

		/**
		 * The meta object literal for the '<em><b>H2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CONTENT__H2 = eINSTANCE.getFormContent_H2();

		/**
		 * The meta object literal for the '<em><b>H3</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CONTENT__H3 = eINSTANCE.getFormContent_H3();

		/**
		 * The meta object literal for the '<em><b>H4</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CONTENT__H4 = eINSTANCE.getFormContent_H4();

		/**
		 * The meta object literal for the '<em><b>H5</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CONTENT__H5 = eINSTANCE.getFormContent_H5();

		/**
		 * The meta object literal for the '<em><b>H6</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CONTENT__H6 = eINSTANCE.getFormContent_H6();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CONTENT__DIV = eINSTANCE.getFormContent_Div();

		/**
		 * The meta object literal for the '<em><b>Ul</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CONTENT__UL = eINSTANCE.getFormContent_Ul();

		/**
		 * The meta object literal for the '<em><b>Ol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CONTENT__OL = eINSTANCE.getFormContent_Ol();

		/**
		 * The meta object literal for the '<em><b>Dl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CONTENT__DL = eINSTANCE.getFormContent_Dl();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CONTENT__PRE = eINSTANCE.getFormContent_Pre();

		/**
		 * The meta object literal for the '<em><b>Hr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CONTENT__HR = eINSTANCE.getFormContent_Hr();

		/**
		 * The meta object literal for the '<em><b>Blockquote</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CONTENT__BLOCKQUOTE = eINSTANCE.getFormContent_Blockquote();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CONTENT__ADDRESS = eINSTANCE.getFormContent_Address();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CONTENT__TABLE = eINSTANCE.getFormContent_Table();

		/**
		 * The meta object literal for the '<em><b>Ins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CONTENT__INS = eINSTANCE.getFormContent_Ins();

		/**
		 * The meta object literal for the '<em><b>Del</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORM_CONTENT__DEL = eINSTANCE.getFormContent_Del();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.H1TypeImpl <em>H1 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.H1TypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getH1Type()
		 * @generated
		 */
		EClass H1_TYPE = eINSTANCE.getH1Type();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H1_TYPE__CLASS = eINSTANCE.getH1Type_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H1_TYPE__ID = eINSTANCE.getH1Type_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H1_TYPE__STYLE = eINSTANCE.getH1Type_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H1_TYPE__TITLE = eINSTANCE.getH1Type_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.H2TypeImpl <em>H2 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.H2TypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getH2Type()
		 * @generated
		 */
		EClass H2_TYPE = eINSTANCE.getH2Type();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H2_TYPE__CLASS = eINSTANCE.getH2Type_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H2_TYPE__ID = eINSTANCE.getH2Type_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H2_TYPE__STYLE = eINSTANCE.getH2Type_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H2_TYPE__TITLE = eINSTANCE.getH2Type_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.H3TypeImpl <em>H3 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.H3TypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getH3Type()
		 * @generated
		 */
		EClass H3_TYPE = eINSTANCE.getH3Type();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H3_TYPE__CLASS = eINSTANCE.getH3Type_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H3_TYPE__ID = eINSTANCE.getH3Type_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H3_TYPE__STYLE = eINSTANCE.getH3Type_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H3_TYPE__TITLE = eINSTANCE.getH3Type_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.H4TypeImpl <em>H4 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.H4TypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getH4Type()
		 * @generated
		 */
		EClass H4_TYPE = eINSTANCE.getH4Type();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H4_TYPE__CLASS = eINSTANCE.getH4Type_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H4_TYPE__ID = eINSTANCE.getH4Type_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H4_TYPE__STYLE = eINSTANCE.getH4Type_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H4_TYPE__TITLE = eINSTANCE.getH4Type_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.H5TypeImpl <em>H5 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.H5TypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getH5Type()
		 * @generated
		 */
		EClass H5_TYPE = eINSTANCE.getH5Type();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H5_TYPE__CLASS = eINSTANCE.getH5Type_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H5_TYPE__ID = eINSTANCE.getH5Type_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H5_TYPE__STYLE = eINSTANCE.getH5Type_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H5_TYPE__TITLE = eINSTANCE.getH5Type_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.H6TypeImpl <em>H6 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.H6TypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getH6Type()
		 * @generated
		 */
		EClass H6_TYPE = eINSTANCE.getH6Type();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H6_TYPE__CLASS = eINSTANCE.getH6Type_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H6_TYPE__ID = eINSTANCE.getH6Type_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H6_TYPE__STYLE = eINSTANCE.getH6Type_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute H6_TYPE__TITLE = eINSTANCE.getH6Type_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.HrTypeImpl <em>Hr Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.HrTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getHrType()
		 * @generated
		 */
		EClass HR_TYPE = eINSTANCE.getHrType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HR_TYPE__CLASS = eINSTANCE.getHrType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HR_TYPE__ID = eINSTANCE.getHrType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HR_TYPE__STYLE = eINSTANCE.getHrType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HR_TYPE__TITLE = eINSTANCE.getHrType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.HtmlTypeImpl <em>Html Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.HtmlTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getHtmlType()
		 * @generated
		 */
		EClass HTML_TYPE = eINSTANCE.getHtmlType();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HTML_TYPE__BODY = eINSTANCE.getHtmlType_Body();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTML_TYPE__ID = eINSTANCE.getHtmlType_Id();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.ImgTypeImpl <em>Img Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.ImgTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getImgType()
		 * @generated
		 */
		EClass IMG_TYPE = eINSTANCE.getImgType();

		/**
		 * The meta object literal for the '<em><b>Alt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__ALT = eINSTANCE.getImgType_Alt();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__CLASS = eINSTANCE.getImgType_Class();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__HEIGHT = eINSTANCE.getImgType_Height();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__ID = eINSTANCE.getImgType_Id();

		/**
		 * The meta object literal for the '<em><b>Ismap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__ISMAP = eINSTANCE.getImgType_Ismap();

		/**
		 * The meta object literal for the '<em><b>Longdesc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__LONGDESC = eINSTANCE.getImgType_Longdesc();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__SRC = eINSTANCE.getImgType_Src();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__STYLE = eINSTANCE.getImgType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__TITLE = eINSTANCE.getImgType_Title();

		/**
		 * The meta object literal for the '<em><b>Usemap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__USEMAP = eINSTANCE.getImgType_Usemap();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMG_TYPE__WIDTH = eINSTANCE.getImgType_Width();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.InlineImpl <em>Inline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.InlineImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getInline()
		 * @generated
		 */
		EClass INLINE = eINSTANCE.getInline();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE__MIXED = eINSTANCE.getInline_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INLINE__GROUP = eINSTANCE.getInline_Group();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__A = eINSTANCE.getInline_A();

		/**
		 * The meta object literal for the '<em><b>Br</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__BR = eINSTANCE.getInline_Br();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__SPAN = eINSTANCE.getInline_Span();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__OBJECT = eINSTANCE.getInline_Object();

		/**
		 * The meta object literal for the '<em><b>Img</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__IMG = eINSTANCE.getInline_Img();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__TT = eINSTANCE.getInline_Tt();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__I = eINSTANCE.getInline_I();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__B = eINSTANCE.getInline_B();

		/**
		 * The meta object literal for the '<em><b>Big</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__BIG = eINSTANCE.getInline_Big();

		/**
		 * The meta object literal for the '<em><b>Small</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__SMALL = eINSTANCE.getInline_Small();

		/**
		 * The meta object literal for the '<em><b>U</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__U = eINSTANCE.getInline_U();

		/**
		 * The meta object literal for the '<em><b>Strike</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__STRIKE = eINSTANCE.getInline_Strike();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__EM = eINSTANCE.getInline_Em();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__STRONG = eINSTANCE.getInline_Strong();

		/**
		 * The meta object literal for the '<em><b>Dfn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__DFN = eINSTANCE.getInline_Dfn();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__CODE = eINSTANCE.getInline_Code();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__Q = eINSTANCE.getInline_Q();

		/**
		 * The meta object literal for the '<em><b>Samp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__SAMP = eINSTANCE.getInline_Samp();

		/**
		 * The meta object literal for the '<em><b>Kbd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__KBD = eINSTANCE.getInline_Kbd();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__VAR = eINSTANCE.getInline_Var();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__CITE = eINSTANCE.getInline_Cite();

		/**
		 * The meta object literal for the '<em><b>Abbr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__ABBR = eINSTANCE.getInline_Abbr();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__ACRONYM = eINSTANCE.getInline_Acronym();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__SUB = eINSTANCE.getInline_Sub();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__SUP = eINSTANCE.getInline_Sup();

		/**
		 * The meta object literal for the '<em><b>Ins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__INS = eINSTANCE.getInline_Ins();

		/**
		 * The meta object literal for the '<em><b>Del</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INLINE__DEL = eINSTANCE.getInline_Del();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.InsTypeImpl <em>Ins Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.InsTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getInsType()
		 * @generated
		 */
		EClass INS_TYPE = eINSTANCE.getInsType();

		/**
		 * The meta object literal for the '<em><b>Cite1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INS_TYPE__CITE1 = eINSTANCE.getInsType_Cite1();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INS_TYPE__CLASS = eINSTANCE.getInsType_Class();

		/**
		 * The meta object literal for the '<em><b>Datetime</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INS_TYPE__DATETIME = eINSTANCE.getInsType_Datetime();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INS_TYPE__ID = eINSTANCE.getInsType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INS_TYPE__STYLE = eINSTANCE.getInsType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INS_TYPE__TITLE = eINSTANCE.getInsType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.ITypeImpl <em>IType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.ITypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getIType()
		 * @generated
		 */
		EClass ITYPE = eINSTANCE.getIType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITYPE__CLASS = eINSTANCE.getIType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITYPE__ID = eINSTANCE.getIType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITYPE__STYLE = eINSTANCE.getIType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITYPE__TITLE = eINSTANCE.getIType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.KbdTypeImpl <em>Kbd Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.KbdTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getKbdType()
		 * @generated
		 */
		EClass KBD_TYPE = eINSTANCE.getKbdType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KBD_TYPE__CLASS = eINSTANCE.getKbdType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KBD_TYPE__ID = eINSTANCE.getKbdType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KBD_TYPE__STYLE = eINSTANCE.getKbdType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KBD_TYPE__TITLE = eINSTANCE.getKbdType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.LiTypeImpl <em>Li Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.LiTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getLiType()
		 * @generated
		 */
		EClass LI_TYPE = eINSTANCE.getLiType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LI_TYPE__CLASS = eINSTANCE.getLiType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LI_TYPE__ID = eINSTANCE.getLiType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LI_TYPE__STYLE = eINSTANCE.getLiType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LI_TYPE__TITLE = eINSTANCE.getLiType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl <em>Object Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.ObjectTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getObjectType()
		 * @generated
		 */
		EClass OBJECT_TYPE = eINSTANCE.getObjectType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__MIXED = eINSTANCE.getObjectType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__GROUP = eINSTANCE.getObjectType_Group();

		/**
		 * The meta object literal for the '<em><b>Param</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__PARAM = eINSTANCE.getObjectType_Param();

		/**
		 * The meta object literal for the '<em><b>P</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__P = eINSTANCE.getObjectType_P();

		/**
		 * The meta object literal for the '<em><b>H1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__H1 = eINSTANCE.getObjectType_H1();

		/**
		 * The meta object literal for the '<em><b>H2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__H2 = eINSTANCE.getObjectType_H2();

		/**
		 * The meta object literal for the '<em><b>H3</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__H3 = eINSTANCE.getObjectType_H3();

		/**
		 * The meta object literal for the '<em><b>H4</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__H4 = eINSTANCE.getObjectType_H4();

		/**
		 * The meta object literal for the '<em><b>H5</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__H5 = eINSTANCE.getObjectType_H5();

		/**
		 * The meta object literal for the '<em><b>H6</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__H6 = eINSTANCE.getObjectType_H6();

		/**
		 * The meta object literal for the '<em><b>Div</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__DIV = eINSTANCE.getObjectType_Div();

		/**
		 * The meta object literal for the '<em><b>Ul</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__UL = eINSTANCE.getObjectType_Ul();

		/**
		 * The meta object literal for the '<em><b>Ol</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__OL = eINSTANCE.getObjectType_Ol();

		/**
		 * The meta object literal for the '<em><b>Dl</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__DL = eINSTANCE.getObjectType_Dl();

		/**
		 * The meta object literal for the '<em><b>Pre</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__PRE = eINSTANCE.getObjectType_Pre();

		/**
		 * The meta object literal for the '<em><b>Hr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__HR = eINSTANCE.getObjectType_Hr();

		/**
		 * The meta object literal for the '<em><b>Blockquote</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__BLOCKQUOTE = eINSTANCE.getObjectType_Blockquote();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__ADDRESS = eINSTANCE.getObjectType_Address();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__TABLE = eINSTANCE.getObjectType_Table();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__A = eINSTANCE.getObjectType_A();

		/**
		 * The meta object literal for the '<em><b>Br</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__BR = eINSTANCE.getObjectType_Br();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__SPAN = eINSTANCE.getObjectType_Span();

		/**
		 * The meta object literal for the '<em><b>Object</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__OBJECT = eINSTANCE.getObjectType_Object();

		/**
		 * The meta object literal for the '<em><b>Img</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__IMG = eINSTANCE.getObjectType_Img();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__TT = eINSTANCE.getObjectType_Tt();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__I = eINSTANCE.getObjectType_I();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__B = eINSTANCE.getObjectType_B();

		/**
		 * The meta object literal for the '<em><b>Big</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__BIG = eINSTANCE.getObjectType_Big();

		/**
		 * The meta object literal for the '<em><b>Small</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__SMALL = eINSTANCE.getObjectType_Small();

		/**
		 * The meta object literal for the '<em><b>U</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__U = eINSTANCE.getObjectType_U();

		/**
		 * The meta object literal for the '<em><b>Strike</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__STRIKE = eINSTANCE.getObjectType_Strike();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__EM = eINSTANCE.getObjectType_Em();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__STRONG = eINSTANCE.getObjectType_Strong();

		/**
		 * The meta object literal for the '<em><b>Dfn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__DFN = eINSTANCE.getObjectType_Dfn();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__CODE = eINSTANCE.getObjectType_Code();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__Q = eINSTANCE.getObjectType_Q();

		/**
		 * The meta object literal for the '<em><b>Samp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__SAMP = eINSTANCE.getObjectType_Samp();

		/**
		 * The meta object literal for the '<em><b>Kbd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__KBD = eINSTANCE.getObjectType_Kbd();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__VAR = eINSTANCE.getObjectType_Var();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__CITE = eINSTANCE.getObjectType_Cite();

		/**
		 * The meta object literal for the '<em><b>Abbr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__ABBR = eINSTANCE.getObjectType_Abbr();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__ACRONYM = eINSTANCE.getObjectType_Acronym();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__SUB = eINSTANCE.getObjectType_Sub();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__SUP = eINSTANCE.getObjectType_Sup();

		/**
		 * The meta object literal for the '<em><b>Ins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__INS = eINSTANCE.getObjectType_Ins();

		/**
		 * The meta object literal for the '<em><b>Del</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OBJECT_TYPE__DEL = eINSTANCE.getObjectType_Del();

		/**
		 * The meta object literal for the '<em><b>Archive</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__ARCHIVE = eINSTANCE.getObjectType_Archive();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__CLASS = eINSTANCE.getObjectType_Class();

		/**
		 * The meta object literal for the '<em><b>Classid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__CLASSID = eINSTANCE.getObjectType_Classid();

		/**
		 * The meta object literal for the '<em><b>Codebase</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__CODEBASE = eINSTANCE.getObjectType_Codebase();

		/**
		 * The meta object literal for the '<em><b>Codetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__CODETYPE = eINSTANCE.getObjectType_Codetype();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__DATA = eINSTANCE.getObjectType_Data();

		/**
		 * The meta object literal for the '<em><b>Declare</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__DECLARE = eINSTANCE.getObjectType_Declare();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__HEIGHT = eINSTANCE.getObjectType_Height();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__ID = eINSTANCE.getObjectType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__NAME = eINSTANCE.getObjectType_Name();

		/**
		 * The meta object literal for the '<em><b>Standby</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__STANDBY = eINSTANCE.getObjectType_Standby();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__STYLE = eINSTANCE.getObjectType_Style();

		/**
		 * The meta object literal for the '<em><b>Tabindex</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__TABINDEX = eINSTANCE.getObjectType_Tabindex();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__TITLE = eINSTANCE.getObjectType_Title();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__TYPE = eINSTANCE.getObjectType_Type();

		/**
		 * The meta object literal for the '<em><b>Usemap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__USEMAP = eINSTANCE.getObjectType_Usemap();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OBJECT_TYPE__WIDTH = eINSTANCE.getObjectType_Width();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.OlTypeImpl <em>Ol Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.OlTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getOlType()
		 * @generated
		 */
		EClass OL_TYPE = eINSTANCE.getOlType();

		/**
		 * The meta object literal for the '<em><b>Li</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OL_TYPE__LI = eINSTANCE.getOlType_Li();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OL_TYPE__CLASS = eINSTANCE.getOlType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OL_TYPE__ID = eINSTANCE.getOlType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OL_TYPE__STYLE = eINSTANCE.getOlType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OL_TYPE__TITLE = eINSTANCE.getOlType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.ParamTypeImpl <em>Param Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.ParamTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getParamType()
		 * @generated
		 */
		EClass PARAM_TYPE = eINSTANCE.getParamType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TYPE__ID = eINSTANCE.getParamType_Id();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TYPE__NAME = eINSTANCE.getParamType_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TYPE__TYPE = eINSTANCE.getParamType_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TYPE__VALUE = eINSTANCE.getParamType_Value();

		/**
		 * The meta object literal for the '<em><b>Valuetype</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAM_TYPE__VALUETYPE = eINSTANCE.getParamType_Valuetype();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.PreContentImpl <em>Pre Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.PreContentImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getPreContent()
		 * @generated
		 */
		EClass PRE_CONTENT = eINSTANCE.getPreContent();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_CONTENT__MIXED = eINSTANCE.getPreContent_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_CONTENT__GROUP = eINSTANCE.getPreContent_Group();

		/**
		 * The meta object literal for the '<em><b>A</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__A = eINSTANCE.getPreContent_A();

		/**
		 * The meta object literal for the '<em><b>Tt</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__TT = eINSTANCE.getPreContent_Tt();

		/**
		 * The meta object literal for the '<em><b>I</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__I = eINSTANCE.getPreContent_I();

		/**
		 * The meta object literal for the '<em><b>B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__B = eINSTANCE.getPreContent_B();

		/**
		 * The meta object literal for the '<em><b>Big</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__BIG = eINSTANCE.getPreContent_Big();

		/**
		 * The meta object literal for the '<em><b>Small</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__SMALL = eINSTANCE.getPreContent_Small();

		/**
		 * The meta object literal for the '<em><b>U</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__U = eINSTANCE.getPreContent_U();

		/**
		 * The meta object literal for the '<em><b>Strike</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__STRIKE = eINSTANCE.getPreContent_Strike();

		/**
		 * The meta object literal for the '<em><b>Em</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__EM = eINSTANCE.getPreContent_Em();

		/**
		 * The meta object literal for the '<em><b>Strong</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__STRONG = eINSTANCE.getPreContent_Strong();

		/**
		 * The meta object literal for the '<em><b>Dfn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__DFN = eINSTANCE.getPreContent_Dfn();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__CODE = eINSTANCE.getPreContent_Code();

		/**
		 * The meta object literal for the '<em><b>Q</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__Q = eINSTANCE.getPreContent_Q();

		/**
		 * The meta object literal for the '<em><b>Samp</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__SAMP = eINSTANCE.getPreContent_Samp();

		/**
		 * The meta object literal for the '<em><b>Kbd</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__KBD = eINSTANCE.getPreContent_Kbd();

		/**
		 * The meta object literal for the '<em><b>Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__VAR = eINSTANCE.getPreContent_Var();

		/**
		 * The meta object literal for the '<em><b>Cite</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__CITE = eINSTANCE.getPreContent_Cite();

		/**
		 * The meta object literal for the '<em><b>Abbr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__ABBR = eINSTANCE.getPreContent_Abbr();

		/**
		 * The meta object literal for the '<em><b>Acronym</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__ACRONYM = eINSTANCE.getPreContent_Acronym();

		/**
		 * The meta object literal for the '<em><b>Sub</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__SUB = eINSTANCE.getPreContent_Sub();

		/**
		 * The meta object literal for the '<em><b>Sup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__SUP = eINSTANCE.getPreContent_Sup();

		/**
		 * The meta object literal for the '<em><b>Br</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__BR = eINSTANCE.getPreContent_Br();

		/**
		 * The meta object literal for the '<em><b>Span</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__SPAN = eINSTANCE.getPreContent_Span();

		/**
		 * The meta object literal for the '<em><b>Ins</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__INS = eINSTANCE.getPreContent_Ins();

		/**
		 * The meta object literal for the '<em><b>Del</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRE_CONTENT__DEL = eINSTANCE.getPreContent_Del();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.PreTypeImpl <em>Pre Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.PreTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getPreType()
		 * @generated
		 */
		EClass PRE_TYPE = eINSTANCE.getPreType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_TYPE__CLASS = eINSTANCE.getPreType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_TYPE__ID = eINSTANCE.getPreType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_TYPE__STYLE = eINSTANCE.getPreType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRE_TYPE__TITLE = eINSTANCE.getPreType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.PTypeImpl <em>PType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.PTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getPType()
		 * @generated
		 */
		EClass PTYPE = eINSTANCE.getPType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__CLASS = eINSTANCE.getPType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__ID = eINSTANCE.getPType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__STYLE = eINSTANCE.getPType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PTYPE__TITLE = eINSTANCE.getPType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.QTypeImpl <em>QType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.QTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getQType()
		 * @generated
		 */
		EClass QTYPE = eINSTANCE.getQType();

		/**
		 * The meta object literal for the '<em><b>Cite1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QTYPE__CITE1 = eINSTANCE.getQType_Cite1();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QTYPE__CLASS = eINSTANCE.getQType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QTYPE__ID = eINSTANCE.getQType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QTYPE__STYLE = eINSTANCE.getQType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QTYPE__TITLE = eINSTANCE.getQType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.SampTypeImpl <em>Samp Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.SampTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getSampType()
		 * @generated
		 */
		EClass SAMP_TYPE = eINSTANCE.getSampType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMP_TYPE__CLASS = eINSTANCE.getSampType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMP_TYPE__ID = eINSTANCE.getSampType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMP_TYPE__STYLE = eINSTANCE.getSampType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SAMP_TYPE__TITLE = eINSTANCE.getSampType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.SmallTypeImpl <em>Small Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.SmallTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getSmallType()
		 * @generated
		 */
		EClass SMALL_TYPE = eINSTANCE.getSmallType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL_TYPE__CLASS = eINSTANCE.getSmallType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL_TYPE__ID = eINSTANCE.getSmallType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL_TYPE__STYLE = eINSTANCE.getSmallType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SMALL_TYPE__TITLE = eINSTANCE.getSmallType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.SpanTypeImpl <em>Span Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.SpanTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getSpanType()
		 * @generated
		 */
		EClass SPAN_TYPE = eINSTANCE.getSpanType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__CLASS = eINSTANCE.getSpanType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__ID = eINSTANCE.getSpanType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__STYLE = eINSTANCE.getSpanType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_TYPE__TITLE = eINSTANCE.getSpanType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.StrikeTypeImpl <em>Strike Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.StrikeTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getStrikeType()
		 * @generated
		 */
		EClass STRIKE_TYPE = eINSTANCE.getStrikeType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRIKE_TYPE__CLASS = eINSTANCE.getStrikeType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRIKE_TYPE__ID = eINSTANCE.getStrikeType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRIKE_TYPE__STYLE = eINSTANCE.getStrikeType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRIKE_TYPE__TITLE = eINSTANCE.getStrikeType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.StrongTypeImpl <em>Strong Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.StrongTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getStrongType()
		 * @generated
		 */
		EClass STRONG_TYPE = eINSTANCE.getStrongType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRONG_TYPE__CLASS = eINSTANCE.getStrongType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRONG_TYPE__ID = eINSTANCE.getStrongType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRONG_TYPE__STYLE = eINSTANCE.getStrongType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRONG_TYPE__TITLE = eINSTANCE.getStrongType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.SubTypeImpl <em>Sub Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.SubTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getSubType()
		 * @generated
		 */
		EClass SUB_TYPE = eINSTANCE.getSubType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TYPE__CLASS = eINSTANCE.getSubType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TYPE__ID = eINSTANCE.getSubType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TYPE__STYLE = eINSTANCE.getSubType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUB_TYPE__TITLE = eINSTANCE.getSubType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.SupTypeImpl <em>Sup Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.SupTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getSupType()
		 * @generated
		 */
		EClass SUP_TYPE = eINSTANCE.getSupType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUP_TYPE__CLASS = eINSTANCE.getSupType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUP_TYPE__ID = eINSTANCE.getSupType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUP_TYPE__STYLE = eINSTANCE.getSupType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUP_TYPE__TITLE = eINSTANCE.getSupType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.TableTypeImpl <em>Table Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.TableTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getTableType()
		 * @generated
		 */
		EClass TABLE_TYPE = eINSTANCE.getTableType();

		/**
		 * The meta object literal for the '<em><b>Caption</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__CAPTION = eINSTANCE.getTableType_Caption();

		/**
		 * The meta object literal for the '<em><b>Col</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__COL = eINSTANCE.getTableType_Col();

		/**
		 * The meta object literal for the '<em><b>Colgroup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__COLGROUP = eINSTANCE.getTableType_Colgroup();

		/**
		 * The meta object literal for the '<em><b>Thead</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__THEAD = eINSTANCE.getTableType_Thead();

		/**
		 * The meta object literal for the '<em><b>Tfoot</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__TFOOT = eINSTANCE.getTableType_Tfoot();

		/**
		 * The meta object literal for the '<em><b>Tbody</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__TBODY = eINSTANCE.getTableType_Tbody();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__TR = eINSTANCE.getTableType_Tr();

		/**
		 * The meta object literal for the '<em><b>Border</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__BORDER = eINSTANCE.getTableType_Border();

		/**
		 * The meta object literal for the '<em><b>Cellpadding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__CELLPADDING = eINSTANCE.getTableType_Cellpadding();

		/**
		 * The meta object literal for the '<em><b>Cellspacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__CELLSPACING = eINSTANCE.getTableType_Cellspacing();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__CLASS = eINSTANCE.getTableType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__ID = eINSTANCE.getTableType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__STYLE = eINSTANCE.getTableType_Style();

		/**
		 * The meta object literal for the '<em><b>Summary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__SUMMARY = eINSTANCE.getTableType_Summary();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__TITLE = eINSTANCE.getTableType_Title();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__WIDTH = eINSTANCE.getTableType_Width();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.TbodyTypeImpl <em>Tbody Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.TbodyTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getTbodyType()
		 * @generated
		 */
		EClass TBODY_TYPE = eINSTANCE.getTbodyType();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBODY_TYPE__TR = eINSTANCE.getTbodyType_Tr();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__ALIGN = eINSTANCE.getTbodyType_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__CHAR = eINSTANCE.getTbodyType_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__CHAROFF = eINSTANCE.getTbodyType_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__CLASS = eINSTANCE.getTbodyType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__ID = eINSTANCE.getTbodyType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__STYLE = eINSTANCE.getTbodyType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__TITLE = eINSTANCE.getTbodyType_Title();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TBODY_TYPE__VALIGN = eINSTANCE.getTbodyType_Valign();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.TdTypeImpl <em>Td Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.TdTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getTdType()
		 * @generated
		 */
		EClass TD_TYPE = eINSTANCE.getTdType();

		/**
		 * The meta object literal for the '<em><b>Abbr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__ABBR1 = eINSTANCE.getTdType_Abbr1();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__ALIGN = eINSTANCE.getTdType_Align();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__AXIS = eINSTANCE.getTdType_Axis();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__CHAR = eINSTANCE.getTdType_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__CHAROFF = eINSTANCE.getTdType_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__CLASS = eINSTANCE.getTdType_Class();

		/**
		 * The meta object literal for the '<em><b>Colspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__COLSPAN = eINSTANCE.getTdType_Colspan();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__HEADERS = eINSTANCE.getTdType_Headers();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__ID = eINSTANCE.getTdType_Id();

		/**
		 * The meta object literal for the '<em><b>Rowspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__ROWSPAN = eINSTANCE.getTdType_Rowspan();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__SCOPE = eINSTANCE.getTdType_Scope();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__STYLE = eINSTANCE.getTdType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__TITLE = eINSTANCE.getTdType_Title();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TD_TYPE__VALIGN = eINSTANCE.getTdType_Valign();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.TfootTypeImpl <em>Tfoot Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.TfootTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getTfootType()
		 * @generated
		 */
		EClass TFOOT_TYPE = eINSTANCE.getTfootType();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TFOOT_TYPE__TR = eINSTANCE.getTfootType_Tr();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__ALIGN = eINSTANCE.getTfootType_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__CHAR = eINSTANCE.getTfootType_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__CHAROFF = eINSTANCE.getTfootType_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__CLASS = eINSTANCE.getTfootType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__ID = eINSTANCE.getTfootType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__STYLE = eINSTANCE.getTfootType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__TITLE = eINSTANCE.getTfootType_Title();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TFOOT_TYPE__VALIGN = eINSTANCE.getTfootType_Valign();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.TheadTypeImpl <em>Thead Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.TheadTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getTheadType()
		 * @generated
		 */
		EClass THEAD_TYPE = eINSTANCE.getTheadType();

		/**
		 * The meta object literal for the '<em><b>Tr</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEAD_TYPE__TR = eINSTANCE.getTheadType_Tr();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__ALIGN = eINSTANCE.getTheadType_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__CHAR = eINSTANCE.getTheadType_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__CHAROFF = eINSTANCE.getTheadType_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__CLASS = eINSTANCE.getTheadType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__ID = eINSTANCE.getTheadType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__STYLE = eINSTANCE.getTheadType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__TITLE = eINSTANCE.getTheadType_Title();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute THEAD_TYPE__VALIGN = eINSTANCE.getTheadType_Valign();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.ThTypeImpl <em>Th Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.ThTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getThType()
		 * @generated
		 */
		EClass TH_TYPE = eINSTANCE.getThType();

		/**
		 * The meta object literal for the '<em><b>Abbr1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__ABBR1 = eINSTANCE.getThType_Abbr1();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__ALIGN = eINSTANCE.getThType_Align();

		/**
		 * The meta object literal for the '<em><b>Axis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__AXIS = eINSTANCE.getThType_Axis();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__CHAR = eINSTANCE.getThType_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__CHAROFF = eINSTANCE.getThType_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__CLASS = eINSTANCE.getThType_Class();

		/**
		 * The meta object literal for the '<em><b>Colspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__COLSPAN = eINSTANCE.getThType_Colspan();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__HEADERS = eINSTANCE.getThType_Headers();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__ID = eINSTANCE.getThType_Id();

		/**
		 * The meta object literal for the '<em><b>Rowspan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__ROWSPAN = eINSTANCE.getThType_Rowspan();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__SCOPE = eINSTANCE.getThType_Scope();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__STYLE = eINSTANCE.getThType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__TITLE = eINSTANCE.getThType_Title();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TH_TYPE__VALIGN = eINSTANCE.getThType_Valign();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.TrTypeImpl <em>Tr Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.TrTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getTrType()
		 * @generated
		 */
		EClass TR_TYPE = eINSTANCE.getTrType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__GROUP = eINSTANCE.getTrType_Group();

		/**
		 * The meta object literal for the '<em><b>Th</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TR_TYPE__TH = eINSTANCE.getTrType_Th();

		/**
		 * The meta object literal for the '<em><b>Td</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TR_TYPE__TD = eINSTANCE.getTrType_Td();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__ALIGN = eINSTANCE.getTrType_Align();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__CHAR = eINSTANCE.getTrType_Char();

		/**
		 * The meta object literal for the '<em><b>Charoff</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__CHAROFF = eINSTANCE.getTrType_Charoff();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__CLASS = eINSTANCE.getTrType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__ID = eINSTANCE.getTrType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__STYLE = eINSTANCE.getTrType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__TITLE = eINSTANCE.getTrType_Title();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TR_TYPE__VALIGN = eINSTANCE.getTrType_Valign();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.TtTypeImpl <em>Tt Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.TtTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getTtType()
		 * @generated
		 */
		EClass TT_TYPE = eINSTANCE.getTtType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TT_TYPE__CLASS = eINSTANCE.getTtType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TT_TYPE__ID = eINSTANCE.getTtType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TT_TYPE__STYLE = eINSTANCE.getTtType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TT_TYPE__TITLE = eINSTANCE.getTtType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.UlTypeImpl <em>Ul Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.UlTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getUlType()
		 * @generated
		 */
		EClass UL_TYPE = eINSTANCE.getUlType();

		/**
		 * The meta object literal for the '<em><b>Li</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UL_TYPE__LI = eINSTANCE.getUlType_Li();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UL_TYPE__CLASS = eINSTANCE.getUlType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UL_TYPE__ID = eINSTANCE.getUlType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UL_TYPE__STYLE = eINSTANCE.getUlType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UL_TYPE__TITLE = eINSTANCE.getUlType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.UTypeImpl <em>UType</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.UTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getUType()
		 * @generated
		 */
		EClass UTYPE = eINSTANCE.getUType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTYPE__CLASS = eINSTANCE.getUType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTYPE__ID = eINSTANCE.getUType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTYPE__STYLE = eINSTANCE.getUType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTYPE__TITLE = eINSTANCE.getUType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.impl.VarTypeImpl <em>Var Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.impl.VarTypeImpl
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getVarType()
		 * @generated
		 */
		EClass VAR_TYPE = eINSTANCE.getVarType();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_TYPE__CLASS = eINSTANCE.getVarType_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_TYPE__ID = eINSTANCE.getVarType_Id();

		/**
		 * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_TYPE__STYLE = eINSTANCE.getVarType_Style();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_TYPE__TITLE = eINSTANCE.getVarType_Title();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.AlignType <em>Align Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.AlignType
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getAlignType()
		 * @generated
		 */
		EEnum ALIGN_TYPE = eINSTANCE.getAlignType();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.DeclareType <em>Declare Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.DeclareType
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDeclareType()
		 * @generated
		 */
		EEnum DECLARE_TYPE = eINSTANCE.getDeclareType();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.IsmapType <em>Ismap Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.IsmapType
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getIsmapType()
		 * @generated
		 */
		EEnum ISMAP_TYPE = eINSTANCE.getIsmapType();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.Scope <em>Scope</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.Scope
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getScope()
		 * @generated
		 */
		EEnum SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.Shape <em>Shape</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.Shape
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getShape()
		 * @generated
		 */
		EEnum SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.ValignType <em>Valign Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.ValignType
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getValignType()
		 * @generated
		 */
		EEnum VALIGN_TYPE = eINSTANCE.getValignType();

		/**
		 * The meta object literal for the '{@link org.eclipse.rmf.rif12.xhtml.ValuetypeType <em>Valuetype Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.ValuetypeType
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getValuetypeType()
		 * @generated
		 */
		EEnum VALUETYPE_TYPE = eINSTANCE.getValuetypeType();

		/**
		 * The meta object literal for the '<em>Align Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.AlignType
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getAlignTypeObject()
		 * @generated
		 */
		EDataType ALIGN_TYPE_OBJECT = eINSTANCE.getAlignTypeObject();

		/**
		 * The meta object literal for the '<em>Character</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getCharacter()
		 * @generated
		 */
		EDataType CHARACTER = eINSTANCE.getCharacter();

		/**
		 * The meta object literal for the '<em>Charset</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getCharset()
		 * @generated
		 */
		EDataType CHARSET = eINSTANCE.getCharset();

		/**
		 * The meta object literal for the '<em>Charsets</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getCharsets()
		 * @generated
		 */
		EDataType CHARSETS = eINSTANCE.getCharsets();

		/**
		 * The meta object literal for the '<em>Content Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getContentType()
		 * @generated
		 */
		EDataType CONTENT_TYPE = eINSTANCE.getContentType();

		/**
		 * The meta object literal for the '<em>Content Types</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getContentTypes()
		 * @generated
		 */
		EDataType CONTENT_TYPES = eINSTANCE.getContentTypes();

		/**
		 * The meta object literal for the '<em>Coords</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getCoords()
		 * @generated
		 */
		EDataType COORDS = eINSTANCE.getCoords();

		/**
		 * The meta object literal for the '<em>Datetime</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see javax.xml.datatype.XMLGregorianCalendar
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDatetime()
		 * @generated
		 */
		EDataType DATETIME = eINSTANCE.getDatetime();

		/**
		 * The meta object literal for the '<em>Declare Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.DeclareType
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getDeclareTypeObject()
		 * @generated
		 */
		EDataType DECLARE_TYPE_OBJECT = eINSTANCE.getDeclareTypeObject();

		/**
		 * The meta object literal for the '<em>Ismap Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.IsmapType
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getIsmapTypeObject()
		 * @generated
		 */
		EDataType ISMAP_TYPE_OBJECT = eINSTANCE.getIsmapTypeObject();

		/**
		 * The meta object literal for the '<em>Language Code</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getLanguageCode()
		 * @generated
		 */
		EDataType LANGUAGE_CODE = eINSTANCE.getLanguageCode();

		/**
		 * The meta object literal for the '<em>Length</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getLength()
		 * @generated
		 */
		EDataType LENGTH = eINSTANCE.getLength();

		/**
		 * The meta object literal for the '<em>Link Types</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.List
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getLinkTypes()
		 * @generated
		 */
		EDataType LINK_TYPES = eINSTANCE.getLinkTypes();

		/**
		 * The meta object literal for the '<em>Multi Length</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getMultiLength()
		 * @generated
		 */
		EDataType MULTI_LENGTH = eINSTANCE.getMultiLength();

		/**
		 * The meta object literal for the '<em>Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getNumber()
		 * @generated
		 */
		EDataType NUMBER = eINSTANCE.getNumber();

		/**
		 * The meta object literal for the '<em>Pixels</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getPixels()
		 * @generated
		 */
		EDataType PIXELS = eINSTANCE.getPixels();

		/**
		 * The meta object literal for the '<em>Scope Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.Scope
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getScopeObject()
		 * @generated
		 */
		EDataType SCOPE_OBJECT = eINSTANCE.getScopeObject();

		/**
		 * The meta object literal for the '<em>Script</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getScript()
		 * @generated
		 */
		EDataType SCRIPT = eINSTANCE.getScript();

		/**
		 * The meta object literal for the '<em>Shape Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.Shape
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getShapeObject()
		 * @generated
		 */
		EDataType SHAPE_OBJECT = eINSTANCE.getShapeObject();

		/**
		 * The meta object literal for the '<em>Style Sheet</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getStyleSheet()
		 * @generated
		 */
		EDataType STYLE_SHEET = eINSTANCE.getStyleSheet();

		/**
		 * The meta object literal for the '<em>Tabindex Number</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigInteger
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getTabindexNumber()
		 * @generated
		 */
		EDataType TABINDEX_NUMBER = eINSTANCE.getTabindexNumber();

		/**
		 * The meta object literal for the '<em>Text</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getText()
		 * @generated
		 */
		EDataType TEXT = eINSTANCE.getText();

		/**
		 * The meta object literal for the '<em>URI</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getURI()
		 * @generated
		 */
		EDataType URI = eINSTANCE.getURI();

		/**
		 * The meta object literal for the '<em>Uri List</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getUriList()
		 * @generated
		 */
		EDataType URI_LIST = eINSTANCE.getUriList();

		/**
		 * The meta object literal for the '<em>Valign Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.ValignType
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getValignTypeObject()
		 * @generated
		 */
		EDataType VALIGN_TYPE_OBJECT = eINSTANCE.getValignTypeObject();

		/**
		 * The meta object literal for the '<em>Valuetype Type Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.rmf.rif12.xhtml.ValuetypeType
		 * @see org.eclipse.rmf.rif12.xhtml.impl.XhtmlPackageImpl#getValuetypeTypeObject()
		 * @generated
		 */
		EDataType VALUETYPE_TYPE_OBJECT = eINSTANCE.getValuetypeTypeObject();

	}

} //XhtmlPackage
