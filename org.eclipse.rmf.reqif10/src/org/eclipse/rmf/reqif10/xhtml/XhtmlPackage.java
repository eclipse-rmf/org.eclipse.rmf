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
package org.eclipse.rmf.reqif10.xhtml;

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
 *       Block Structural
 * 
 *         * div, p
 *   
 *       This module declares the elements and their attributes used to
 *       support block-level structural markup.            
 *           
 *       This is the XML Schema Block Structural module for XHTML
 *       $Id: xhtml-blkstruct-1.xsd,v 1.1 2010/07/29 13:42:50 bertails Exp $
 *     
 * 
 * 
 *           XHTML Datatypes
 *           This is the XML Schema datatypes module for XHTML
 *           
 *           Defines containers for the XHTML datatypes, many of
 *           these imported from other specifications and standards.
 *           
 *           $Id: xhtml-datatypes-1.xsd,v 1.1 2010/07/29 13:42:51 bertails Exp $
 *         
 * 
 * 
 * <!-- end-model-doc -->
 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlFactory
 * @model kind="package"
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
	String eNS_URI = "http://www.w3.org/1999/xhtml";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xhtml";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XhtmlPackage eINSTANCE = org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlAbbrTypeImpl <em>Abbr Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlAbbrTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlAbbrType()
	 * @generated
	 */
	int XHTML_ABBR_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>Abbr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ABBR_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlAcronymTypeImpl <em>Acronym Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlAcronymTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlAcronymType()
	 * @generated
	 */
	int XHTML_ACRONYM_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>Acronym Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ACRONYM_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlAddressTypeImpl <em>Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlAddressTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlAddressType()
	 * @generated
	 */
	int XHTML_ADDRESS_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ADDRESS_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl <em>AType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlATypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlAType()
	 * @generated
	 */
	int XHTML_ATYPE = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inl No Anchor Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__XHTML_INL_NO_ANCHOR_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__OBJECT = 22;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__INS = 23;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__DEL = 24;

	/**
	 * The feature id for the '<em><b>Accesskey</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__ACCESSKEY = 25;

	/**
	 * The feature id for the '<em><b>Charset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__CHARSET = 26;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__CLASS = 27;

	/**
	 * The feature id for the '<em><b>Href</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__HREF = 28;

	/**
	 * The feature id for the '<em><b>Hreflang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__HREFLANG = 29;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__ID = 30;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__LANG = 31;

	/**
	 * The feature id for the '<em><b>Rel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__REL = 32;

	/**
	 * The feature id for the '<em><b>Rev</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__REV = 33;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__SPACE = 34;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__STYLE = 35;

	/**
	 * The feature id for the '<em><b>Tabindex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__TABINDEX = 36;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__TITLE = 37;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE__TYPE = 38;

	/**
	 * The number of structural features of the '<em>AType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_ATYPE_FEATURE_COUNT = 39;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl <em>Blockquote Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBlockquoteTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlBlockquoteType()
	 * @generated
	 */
	int XHTML_BLOCKQUOTE_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Xhtml Block Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__XHTML_BLOCK_MIX = 0;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__H1 = 1;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__H2 = 2;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__H3 = 3;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__H4 = 4;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__H5 = 5;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__H6 = 6;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__UL = 7;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__OL = 8;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__DL = 9;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__P = 10;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__DIV = 11;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__PRE = 12;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__BLOCKQUOTE = 13;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__ADDRESS = 14;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__HR = 15;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__TABLE = 16;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__INS = 17;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__DEL = 18;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__CITE = 19;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__CLASS = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__ID = 21;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__LANG = 22;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__SPACE = 23;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__STYLE = 24;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE__TITLE = 25;

	/**
	 * The number of structural features of the '<em>Blockquote Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BLOCKQUOTE_TYPE_FEATURE_COUNT = 26;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBrTypeImpl <em>Br Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlBrTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlBrType()
	 * @generated
	 */
	int XHTML_BR_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BR_TYPE__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BR_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BR_TYPE__SPACE = 2;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BR_TYPE__TITLE = 3;

	/**
	 * The number of structural features of the '<em>Br Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_BR_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlCaptionTypeImpl <em>Caption Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlCaptionTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlCaptionType()
	 * @generated
	 */
	int XHTML_CAPTION_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>Caption Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CAPTION_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlCiteTypeImpl <em>Cite Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlCiteTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlCiteType()
	 * @generated
	 */
	int XHTML_CITE_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>Cite Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CITE_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlCodeTypeImpl <em>Code Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlCodeTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlCodeType()
	 * @generated
	 */
	int XHTML_CODE_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>Code Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_CODE_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlColgroupTypeImpl <em>Colgroup Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlColgroupTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlColgroupType()
	 * @generated
	 */
	int XHTML_COLGROUP_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Col</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COLGROUP_TYPE__COL = 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COLGROUP_TYPE__ALIGN = 1;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COLGROUP_TYPE__CHAR = 2;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COLGROUP_TYPE__CHAROFF = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COLGROUP_TYPE__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COLGROUP_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COLGROUP_TYPE__LANG = 6;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COLGROUP_TYPE__SPACE = 7;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COLGROUP_TYPE__SPAN = 8;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COLGROUP_TYPE__STYLE = 9;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COLGROUP_TYPE__TITLE = 10;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COLGROUP_TYPE__VALIGN = 11;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COLGROUP_TYPE__WIDTH = 12;

	/**
	 * The number of structural features of the '<em>Colgroup Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COLGROUP_TYPE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlColTypeImpl <em>Col Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlColTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlColType()
	 * @generated
	 */
	int XHTML_COL_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COL_TYPE__ALIGN = 0;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COL_TYPE__CHAR = 1;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COL_TYPE__CHAROFF = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COL_TYPE__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COL_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COL_TYPE__LANG = 5;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COL_TYPE__SPACE = 6;

	/**
	 * The feature id for the '<em><b>Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COL_TYPE__SPAN = 7;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COL_TYPE__STYLE = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COL_TYPE__TITLE = 9;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COL_TYPE__VALIGN = 10;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COL_TYPE__WIDTH = 11;

	/**
	 * The number of structural features of the '<em>Col Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_COL_TYPE_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDdTypeImpl <em>Dd Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDdTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlDdType()
	 * @generated
	 */
	int XHTML_DD_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Flow Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__XHTML_FLOW_MIX = 1;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__H1 = 2;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__H2 = 3;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__H3 = 4;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__H4 = 5;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__H5 = 6;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__H6 = 7;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__UL = 8;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__OL = 9;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__DL = 10;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__P = 11;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__DIV = 12;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__PRE = 13;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__BLOCKQUOTE = 14;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__ADDRESS = 15;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__HR = 16;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__TABLE = 17;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__BR = 18;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__SPAN = 19;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__EM = 20;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__STRONG = 21;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__DFN = 22;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__CODE = 23;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__SAMP = 24;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__KBD = 25;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__VAR = 26;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__CITE = 27;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__ABBR = 28;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__ACRONYM = 29;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__Q = 30;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__TT = 31;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__I = 32;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__B = 33;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__BIG = 34;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__SMALL = 35;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__SUB = 36;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__SUP = 37;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__A = 38;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__OBJECT = 39;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__INS = 40;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__DEL = 41;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__CLASS = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__ID = 43;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__LANG = 44;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__SPACE = 45;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__STYLE = 46;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE__TITLE = 47;

	/**
	 * The number of structural features of the '<em>Dd Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DD_TYPE_FEATURE_COUNT = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDfnTypeImpl <em>Dfn Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDfnTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlDfnType()
	 * @generated
	 */
	int XHTML_DFN_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>Dfn Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DFN_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDivTypeImpl <em>Div Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDivTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlDivType()
	 * @generated
	 */
	int XHTML_DIV_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Flow Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__XHTML_FLOW_MIX = 1;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__H1 = 2;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__H2 = 3;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__H3 = 4;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__H4 = 5;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__H5 = 6;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__H6 = 7;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__UL = 8;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__OL = 9;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__DL = 10;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__P = 11;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__DIV = 12;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__PRE = 13;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__BLOCKQUOTE = 14;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__ADDRESS = 15;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__HR = 16;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__TABLE = 17;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__BR = 18;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__SPAN = 19;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__EM = 20;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__STRONG = 21;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__DFN = 22;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__CODE = 23;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__SAMP = 24;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__KBD = 25;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__VAR = 26;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__CITE = 27;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__ABBR = 28;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__ACRONYM = 29;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__Q = 30;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__TT = 31;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__I = 32;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__B = 33;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__BIG = 34;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__SMALL = 35;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__SUB = 36;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__SUP = 37;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__A = 38;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__OBJECT = 39;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__INS = 40;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__DEL = 41;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__CLASS = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__ID = 43;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__LANG = 44;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__SPACE = 45;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__STYLE = 46;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE__TITLE = 47;

	/**
	 * The number of structural features of the '<em>Div Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DIV_TYPE_FEATURE_COUNT = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDlTypeImpl <em>Dl Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDlTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlDlType()
	 * @generated
	 */
	int XHTML_DL_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DL_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Dt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DL_TYPE__DT = 1;

	/**
	 * The feature id for the '<em><b>Dd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DL_TYPE__DD = 2;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DL_TYPE__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DL_TYPE__ID = 4;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DL_TYPE__LANG = 5;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DL_TYPE__SPACE = 6;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DL_TYPE__STYLE = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DL_TYPE__TITLE = 8;

	/**
	 * The number of structural features of the '<em>Dl Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DL_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDtTypeImpl <em>Dt Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlDtTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlDtType()
	 * @generated
	 */
	int XHTML_DT_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>Dt Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_DT_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlEditTypeImpl <em>Edit Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlEditTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlEditType()
	 * @generated
	 */
	int XHTML_EDIT_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Flow Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__XHTML_FLOW_MIX = 1;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__H1 = 2;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__H2 = 3;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__H3 = 4;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__H4 = 5;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__H5 = 6;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__H6 = 7;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__UL = 8;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__OL = 9;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__DL = 10;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__P = 11;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__DIV = 12;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__PRE = 13;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__BLOCKQUOTE = 14;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__ADDRESS = 15;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__HR = 16;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__TABLE = 17;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__BR = 18;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__SPAN = 19;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__EM = 20;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__STRONG = 21;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__DFN = 22;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__CODE = 23;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__SAMP = 24;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__KBD = 25;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__VAR = 26;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__CITE = 27;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__ABBR = 28;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__ACRONYM = 29;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__Q = 30;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__TT = 31;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__I = 32;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__B = 33;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__BIG = 34;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__SMALL = 35;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__SUB = 36;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__SUP = 37;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__A = 38;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__OBJECT = 39;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__INS = 40;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__DEL = 41;

	/**
	 * The feature id for the '<em><b>Cite1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__CITE1 = 42;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__CLASS = 43;

	/**
	 * The feature id for the '<em><b>Datetime</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__DATETIME = 44;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__ID = 45;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__LANG = 46;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__SPACE = 47;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__STYLE = 48;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE__TITLE = 49;

	/**
	 * The number of structural features of the '<em>Edit Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EDIT_TYPE_FEATURE_COUNT = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlEmTypeImpl <em>Em Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlEmTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlEmType()
	 * @generated
	 */
	int XHTML_EM_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>Em Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_EM_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlH1TypeImpl <em>H1 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlH1TypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlH1Type()
	 * @generated
	 */
	int XHTML_H1_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>H1 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H1_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlH2TypeImpl <em>H2 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlH2TypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlH2Type()
	 * @generated
	 */
	int XHTML_H2_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>H2 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H2_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlH3TypeImpl <em>H3 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlH3TypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlH3Type()
	 * @generated
	 */
	int XHTML_H3_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>H3 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H3_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlH4TypeImpl <em>H4 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlH4TypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlH4Type()
	 * @generated
	 */
	int XHTML_H4_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>H4 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H4_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlH5TypeImpl <em>H5 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlH5TypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlH5Type()
	 * @generated
	 */
	int XHTML_H5_TYPE = 22;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>H5 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H5_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlH6TypeImpl <em>H6 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlH6TypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlH6Type()
	 * @generated
	 */
	int XHTML_H6_TYPE = 23;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>H6 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_H6_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlHeadingTypeImpl <em>Heading Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlHeadingTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlHeadingType()
	 * @generated
	 */
	int XHTML_HEADING_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>Heading Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HEADING_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlHrTypeImpl <em>Hr Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlHrTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlHrType()
	 * @generated
	 */
	int XHTML_HR_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HR_TYPE__CLASS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HR_TYPE__ID = 1;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HR_TYPE__LANG = 2;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HR_TYPE__SPACE = 3;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HR_TYPE__STYLE = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HR_TYPE__TITLE = 5;

	/**
	 * The number of structural features of the '<em>Hr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_HR_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlInlPresTypeImpl <em>Inl Pres Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlInlPresTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlInlPresType()
	 * @generated
	 */
	int XHTML_INL_PRES_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>Inl Pres Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_INL_PRES_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlKbdTypeImpl <em>Kbd Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlKbdTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlKbdType()
	 * @generated
	 */
	int XHTML_KBD_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>Kbd Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_KBD_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl <em>Li Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlLiTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlLiType()
	 * @generated
	 */
	int XHTML_LI_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Flow Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__XHTML_FLOW_MIX = 1;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__H1 = 2;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__H2 = 3;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__H3 = 4;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__H4 = 5;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__H5 = 6;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__H6 = 7;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__UL = 8;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__OL = 9;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__DL = 10;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__P = 11;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__DIV = 12;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__PRE = 13;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__BLOCKQUOTE = 14;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__ADDRESS = 15;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__HR = 16;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__TABLE = 17;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__BR = 18;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__SPAN = 19;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__EM = 20;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__STRONG = 21;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__DFN = 22;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__CODE = 23;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__SAMP = 24;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__KBD = 25;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__VAR = 26;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__CITE = 27;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__ABBR = 28;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__ACRONYM = 29;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__Q = 30;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__TT = 31;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__I = 32;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__B = 33;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__BIG = 34;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__SMALL = 35;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__SUB = 36;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__SUP = 37;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__A = 38;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__OBJECT = 39;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__INS = 40;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__DEL = 41;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__CLASS = 42;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__ID = 43;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__LANG = 44;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__SPACE = 45;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__STYLE = 46;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE__TITLE = 47;

	/**
	 * The number of structural features of the '<em>Li Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_LI_TYPE_FEATURE_COUNT = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlObjectTypeImpl <em>Object Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlObjectTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlObjectType()
	 * @generated
	 */
	int XHTML_OBJECT_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Param</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__PARAM = 2;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__H1 = 3;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__H2 = 4;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__H3 = 5;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__H4 = 6;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__H5 = 7;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__H6 = 8;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__UL = 9;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__OL = 10;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__DL = 11;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__P = 12;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__DIV = 13;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__PRE = 14;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__BLOCKQUOTE = 15;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__ADDRESS = 16;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__HR = 17;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__TABLE = 18;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__BR = 19;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__SPAN = 20;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__EM = 21;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__STRONG = 22;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__DFN = 23;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__CODE = 24;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__SAMP = 25;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__KBD = 26;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__VAR = 27;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__CITE = 28;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__ABBR = 29;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__ACRONYM = 30;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__Q = 31;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__TT = 32;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__I = 33;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__B = 34;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__BIG = 35;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__SMALL = 36;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__SUB = 37;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__SUP = 38;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__A = 39;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__OBJECT = 40;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__INS = 41;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__DEL = 42;

	/**
	 * The feature id for the '<em><b>Archive</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__ARCHIVE = 43;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__CLASS = 44;

	/**
	 * The feature id for the '<em><b>Classid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__CLASSID = 45;

	/**
	 * The feature id for the '<em><b>Codebase</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__CODEBASE = 46;

	/**
	 * The feature id for the '<em><b>Codetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__CODETYPE = 47;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__DATA = 48;

	/**
	 * The feature id for the '<em><b>Declare</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__DECLARE = 49;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__HEIGHT = 50;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__ID = 51;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__LANG = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__NAME = 53;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__SPACE = 54;

	/**
	 * The feature id for the '<em><b>Standby</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__STANDBY = 55;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__STYLE = 56;

	/**
	 * The feature id for the '<em><b>Tabindex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__TABINDEX = 57;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__TITLE = 58;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__TYPE = 59;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE__WIDTH = 60;

	/**
	 * The number of structural features of the '<em>Object Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OBJECT_TYPE_FEATURE_COUNT = 61;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlOlTypeImpl <em>Ol Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlOlTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlOlType()
	 * @generated
	 */
	int XHTML_OL_TYPE = 30;

	/**
	 * The feature id for the '<em><b>Li</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OL_TYPE__LI = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OL_TYPE__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OL_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OL_TYPE__LANG = 3;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OL_TYPE__SPACE = 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OL_TYPE__STYLE = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OL_TYPE__TITLE = 6;

	/**
	 * The number of structural features of the '<em>Ol Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_OL_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlParamTypeImpl <em>Param Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlParamTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlParamType()
	 * @generated
	 */
	int XHTML_PARAM_TYPE = 31;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PARAM_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PARAM_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PARAM_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PARAM_TYPE__VALUE = 3;

	/**
	 * The feature id for the '<em><b>Valuetype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PARAM_TYPE__VALUETYPE = 4;

	/**
	 * The number of structural features of the '<em>Param Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PARAM_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPreTypeImpl <em>Pre Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPreTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlPreType()
	 * @generated
	 */
	int XHTML_PRE_TYPE = 32;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Pre Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__XHTML_INLINE_PRE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__A = 18;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__INS = 19;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__DEL = 20;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__CLASS = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__ID = 22;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__LANG = 23;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__SPACE = 24;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__STYLE = 25;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE__TITLE = 26;

	/**
	 * The number of structural features of the '<em>Pre Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PRE_TYPE_FEATURE_COUNT = 27;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPTypeImpl <em>PType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlPType()
	 * @generated
	 */
	int XHTML_PTYPE = 33;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>PType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_PTYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlQTypeImpl <em>QType</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlQTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlQType()
	 * @generated
	 */
	int XHTML_QTYPE = 34;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Cite1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__CITE1 = 26;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__CLASS = 27;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__ID = 28;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__LANG = 29;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__SPACE = 30;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__STYLE = 31;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE__TITLE = 32;

	/**
	 * The number of structural features of the '<em>QType</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_QTYPE_FEATURE_COUNT = 33;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlSampTypeImpl <em>Samp Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlSampTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlSampType()
	 * @generated
	 */
	int XHTML_SAMP_TYPE = 35;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>Samp Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SAMP_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlSpanTypeImpl <em>Span Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlSpanTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlSpanType()
	 * @generated
	 */
	int XHTML_SPAN_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>Span Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_SPAN_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlStrongTypeImpl <em>Strong Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlStrongTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlStrongType()
	 * @generated
	 */
	int XHTML_STRONG_TYPE = 37;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>Strong Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_STRONG_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTableTypeImpl <em>Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTableTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlTableType()
	 * @generated
	 */
	int XHTML_TABLE_TYPE = 38;

	/**
	 * The feature id for the '<em><b>Caption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__CAPTION = 0;

	/**
	 * The feature id for the '<em><b>Col</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__COL = 1;

	/**
	 * The feature id for the '<em><b>Colgroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__COLGROUP = 2;

	/**
	 * The feature id for the '<em><b>Thead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__THEAD = 3;

	/**
	 * The feature id for the '<em><b>Tfoot</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__TFOOT = 4;

	/**
	 * The feature id for the '<em><b>Tbody</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__TBODY = 5;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__TR = 6;

	/**
	 * The feature id for the '<em><b>Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__BORDER = 7;

	/**
	 * The feature id for the '<em><b>Cellpadding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__CELLPADDING = 8;

	/**
	 * The feature id for the '<em><b>Cellspacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__CELLSPACING = 9;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__CLASS = 10;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__FRAME = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__ID = 12;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__LANG = 13;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__RULES = 14;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__SPACE = 15;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__STYLE = 16;

	/**
	 * The feature id for the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__SUMMARY = 17;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__TITLE = 18;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE__WIDTH = 19;

	/**
	 * The number of structural features of the '<em>Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TABLE_TYPE_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTbodyTypeImpl <em>Tbody Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTbodyTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlTbodyType()
	 * @generated
	 */
	int XHTML_TBODY_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TBODY_TYPE__TR = 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TBODY_TYPE__ALIGN = 1;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TBODY_TYPE__CHAR = 2;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TBODY_TYPE__CHAROFF = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TBODY_TYPE__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TBODY_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TBODY_TYPE__LANG = 6;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TBODY_TYPE__SPACE = 7;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TBODY_TYPE__STYLE = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TBODY_TYPE__TITLE = 9;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TBODY_TYPE__VALIGN = 10;

	/**
	 * The number of structural features of the '<em>Tbody Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TBODY_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTdTypeImpl <em>Td Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTdTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlTdType()
	 * @generated
	 */
	int XHTML_TD_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Flow Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__XHTML_FLOW_MIX = 1;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__H1 = 2;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__H2 = 3;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__H3 = 4;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__H4 = 5;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__H5 = 6;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__H6 = 7;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__UL = 8;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__OL = 9;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__DL = 10;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__P = 11;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__DIV = 12;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__PRE = 13;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__BLOCKQUOTE = 14;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__ADDRESS = 15;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__HR = 16;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__TABLE = 17;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__BR = 18;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__SPAN = 19;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__EM = 20;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__STRONG = 21;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__DFN = 22;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__CODE = 23;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__SAMP = 24;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__KBD = 25;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__VAR = 26;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__CITE = 27;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__ABBR = 28;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__ACRONYM = 29;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__Q = 30;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__TT = 31;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__I = 32;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__B = 33;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__BIG = 34;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__SMALL = 35;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__SUB = 36;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__SUP = 37;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__A = 38;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__OBJECT = 39;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__INS = 40;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__DEL = 41;

	/**
	 * The feature id for the '<em><b>Abbr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__ABBR1 = 42;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__ALIGN = 43;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__AXIS = 44;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__CHAR = 45;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__CHAROFF = 46;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__CLASS = 47;

	/**
	 * The feature id for the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__COLSPAN = 48;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__HEADERS = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__ID = 50;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__LANG = 51;

	/**
	 * The feature id for the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__ROWSPAN = 52;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__SCOPE = 53;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__SPACE = 54;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__STYLE = 55;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__TITLE = 56;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE__VALIGN = 57;

	/**
	 * The number of structural features of the '<em>Td Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TD_TYPE_FEATURE_COUNT = 58;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTfootTypeImpl <em>Tfoot Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTfootTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlTfootType()
	 * @generated
	 */
	int XHTML_TFOOT_TYPE = 41;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TFOOT_TYPE__TR = 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TFOOT_TYPE__ALIGN = 1;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TFOOT_TYPE__CHAR = 2;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TFOOT_TYPE__CHAROFF = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TFOOT_TYPE__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TFOOT_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TFOOT_TYPE__LANG = 6;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TFOOT_TYPE__SPACE = 7;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TFOOT_TYPE__STYLE = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TFOOT_TYPE__TITLE = 9;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TFOOT_TYPE__VALIGN = 10;

	/**
	 * The number of structural features of the '<em>Tfoot Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TFOOT_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTheadTypeImpl <em>Thead Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTheadTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlTheadType()
	 * @generated
	 */
	int XHTML_THEAD_TYPE = 42;

	/**
	 * The feature id for the '<em><b>Tr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_THEAD_TYPE__TR = 0;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_THEAD_TYPE__ALIGN = 1;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_THEAD_TYPE__CHAR = 2;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_THEAD_TYPE__CHAROFF = 3;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_THEAD_TYPE__CLASS = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_THEAD_TYPE__ID = 5;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_THEAD_TYPE__LANG = 6;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_THEAD_TYPE__SPACE = 7;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_THEAD_TYPE__STYLE = 8;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_THEAD_TYPE__TITLE = 9;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_THEAD_TYPE__VALIGN = 10;

	/**
	 * The number of structural features of the '<em>Thead Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_THEAD_TYPE_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl <em>Th Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlThTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlThType()
	 * @generated
	 */
	int XHTML_TH_TYPE = 43;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Flow Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__XHTML_FLOW_MIX = 1;

	/**
	 * The feature id for the '<em><b>H1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__H1 = 2;

	/**
	 * The feature id for the '<em><b>H2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__H2 = 3;

	/**
	 * The feature id for the '<em><b>H3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__H3 = 4;

	/**
	 * The feature id for the '<em><b>H4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__H4 = 5;

	/**
	 * The feature id for the '<em><b>H5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__H5 = 6;

	/**
	 * The feature id for the '<em><b>H6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__H6 = 7;

	/**
	 * The feature id for the '<em><b>Ul</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__UL = 8;

	/**
	 * The feature id for the '<em><b>Ol</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__OL = 9;

	/**
	 * The feature id for the '<em><b>Dl</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__DL = 10;

	/**
	 * The feature id for the '<em><b>P</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__P = 11;

	/**
	 * The feature id for the '<em><b>Div</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__DIV = 12;

	/**
	 * The feature id for the '<em><b>Pre</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__PRE = 13;

	/**
	 * The feature id for the '<em><b>Blockquote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__BLOCKQUOTE = 14;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__ADDRESS = 15;

	/**
	 * The feature id for the '<em><b>Hr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__HR = 16;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__TABLE = 17;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__BR = 18;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__SPAN = 19;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__EM = 20;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__STRONG = 21;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__DFN = 22;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__CODE = 23;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__SAMP = 24;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__KBD = 25;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__VAR = 26;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__CITE = 27;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__ABBR = 28;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__ACRONYM = 29;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__Q = 30;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__TT = 31;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__I = 32;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__B = 33;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__BIG = 34;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__SMALL = 35;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__SUB = 36;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__SUP = 37;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__A = 38;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__OBJECT = 39;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__INS = 40;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__DEL = 41;

	/**
	 * The feature id for the '<em><b>Abbr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__ABBR1 = 42;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__ALIGN = 43;

	/**
	 * The feature id for the '<em><b>Axis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__AXIS = 44;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__CHAR = 45;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__CHAROFF = 46;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__CLASS = 47;

	/**
	 * The feature id for the '<em><b>Colspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__COLSPAN = 48;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__HEADERS = 49;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__ID = 50;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__LANG = 51;

	/**
	 * The feature id for the '<em><b>Rowspan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__ROWSPAN = 52;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__SCOPE = 53;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__SPACE = 54;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__STYLE = 55;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__TITLE = 56;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE__VALIGN = 57;

	/**
	 * The number of structural features of the '<em>Th Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TH_TYPE_FEATURE_COUNT = 58;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTrTypeImpl <em>Tr Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlTrTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlTrType()
	 * @generated
	 */
	int XHTML_TR_TYPE = 44;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TR_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Th</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TR_TYPE__TH = 1;

	/**
	 * The feature id for the '<em><b>Td</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TR_TYPE__TD = 2;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TR_TYPE__ALIGN = 3;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TR_TYPE__CHAR = 4;

	/**
	 * The feature id for the '<em><b>Charoff</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TR_TYPE__CHAROFF = 5;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TR_TYPE__CLASS = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TR_TYPE__ID = 7;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TR_TYPE__LANG = 8;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TR_TYPE__SPACE = 9;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TR_TYPE__STYLE = 10;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TR_TYPE__TITLE = 11;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TR_TYPE__VALIGN = 12;

	/**
	 * The number of structural features of the '<em>Tr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_TR_TYPE_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlUlTypeImpl <em>Ul Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlUlTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlUlType()
	 * @generated
	 */
	int XHTML_UL_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Li</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_UL_TYPE__LI = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_UL_TYPE__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_UL_TYPE__ID = 2;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_UL_TYPE__LANG = 3;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_UL_TYPE__SPACE = 4;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_UL_TYPE__STYLE = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_UL_TYPE__TITLE = 6;

	/**
	 * The number of structural features of the '<em>Ul Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_UL_TYPE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.XhtmlVarTypeImpl <em>Var Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlVarTypeImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getXhtmlVarType()
	 * @generated
	 */
	int XHTML_VAR_TYPE = 46;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Xhtml Inline Mix</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__XHTML_INLINE_MIX = 1;

	/**
	 * The feature id for the '<em><b>Br</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__BR = 2;

	/**
	 * The feature id for the '<em><b>Span</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__SPAN = 3;

	/**
	 * The feature id for the '<em><b>Em</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__EM = 4;

	/**
	 * The feature id for the '<em><b>Strong</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__STRONG = 5;

	/**
	 * The feature id for the '<em><b>Dfn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__DFN = 6;

	/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__CODE = 7;

	/**
	 * The feature id for the '<em><b>Samp</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__SAMP = 8;

	/**
	 * The feature id for the '<em><b>Kbd</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__KBD = 9;

	/**
	 * The feature id for the '<em><b>Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__VAR = 10;

	/**
	 * The feature id for the '<em><b>Cite</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__CITE = 11;

	/**
	 * The feature id for the '<em><b>Abbr</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__ABBR = 12;

	/**
	 * The feature id for the '<em><b>Acronym</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__ACRONYM = 13;

	/**
	 * The feature id for the '<em><b>Q</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__Q = 14;

	/**
	 * The feature id for the '<em><b>Tt</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__TT = 15;

	/**
	 * The feature id for the '<em><b>I</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__I = 16;

	/**
	 * The feature id for the '<em><b>B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__B = 17;

	/**
	 * The feature id for the '<em><b>Big</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__BIG = 18;

	/**
	 * The feature id for the '<em><b>Small</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__SMALL = 19;

	/**
	 * The feature id for the '<em><b>Sub</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__SUB = 20;

	/**
	 * The feature id for the '<em><b>Sup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__SUP = 21;

	/**
	 * The feature id for the '<em><b>A</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__A = 22;

	/**
	 * The feature id for the '<em><b>Object</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__OBJECT = 23;

	/**
	 * The feature id for the '<em><b>Ins</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__INS = 24;

	/**
	 * The feature id for the '<em><b>Del</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__DEL = 25;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__CLASS = 26;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__ID = 27;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__LANG = 28;

	/**
	 * The feature id for the '<em><b>Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__SPACE = 29;

	/**
	 * The feature id for the '<em><b>Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__STYLE = 30;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE__TITLE = 31;

	/**
	 * The number of structural features of the '<em>Var Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XHTML_VAR_TYPE_FEATURE_COUNT = 32;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.DocumentRootImpl
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 47;

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
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CLASS = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ID = 4;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 5;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.AlignType <em>Align Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.AlignType
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getAlignType()
	 * @generated
	 */
	int ALIGN_TYPE = 48;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.DeclareType <em>Declare Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.DeclareType
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getDeclareType()
	 * @generated
	 */
	int DECLARE_TYPE = 49;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.FrameType <em>Frame Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.FrameType
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getFrameType()
	 * @generated
	 */
	int FRAME_TYPE = 50;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.RulesType <em>Rules Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.RulesType
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getRulesType()
	 * @generated
	 */
	int RULES_TYPE = 51;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.ScopeType <em>Scope Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.ScopeType
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getScopeType()
	 * @generated
	 */
	int SCOPE_TYPE = 52;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.ValignType <em>Valign Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.ValignType
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getValignType()
	 * @generated
	 */
	int VALIGN_TYPE = 53;

	/**
	 * The meta object id for the '{@link org.eclipse.rmf.reqif10.xhtml.ValuetypeType <em>Valuetype Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.ValuetypeType
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getValuetypeType()
	 * @generated
	 */
	int VALUETYPE_TYPE = 54;

	/**
	 * The meta object id for the '<em>Align Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.AlignType
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getAlignTypeObject()
	 * @generated
	 */
	int ALIGN_TYPE_OBJECT = 55;

	/**
	 * The meta object id for the '<em>Declare Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.DeclareType
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getDeclareTypeObject()
	 * @generated
	 */
	int DECLARE_TYPE_OBJECT = 56;

	/**
	 * The meta object id for the '<em>Frame Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.FrameType
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getFrameTypeObject()
	 * @generated
	 */
	int FRAME_TYPE_OBJECT = 57;

	/**
	 * The meta object id for the '<em>Rules Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.RulesType
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getRulesTypeObject()
	 * @generated
	 */
	int RULES_TYPE_OBJECT = 58;

	/**
	 * The meta object id for the '<em>Scope Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.ScopeType
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getScopeTypeObject()
	 * @generated
	 */
	int SCOPE_TYPE_OBJECT = 59;

	/**
	 * The meta object id for the '<em>Valign Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.ValignType
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getValignTypeObject()
	 * @generated
	 */
	int VALIGN_TYPE_OBJECT = 60;

	/**
	 * The meta object id for the '<em>Valuetype Type Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.rmf.reqif10.xhtml.ValuetypeType
	 * @see org.eclipse.rmf.reqif10.xhtml.impl.XhtmlPackageImpl#getValuetypeTypeObject()
	 * @generated
	 */
	int VALUETYPE_TYPE_OBJECT = 61;


	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType <em>Abbr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abbr Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType
	 * @generated
	 */
	EClass getXhtmlAbbrType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getMixed()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EAttribute getXhtmlAbbrType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getXhtmlInlineMix()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EAttribute getXhtmlAbbrType_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getBr()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getSpan()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getEm()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getStrong()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getDfn()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getCode()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getSamp()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getKbd()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getVar()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getCite()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getAbbr()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getAcronym()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getQ()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getTt()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getI()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getB()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getBig()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getSmall()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getSub()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getSup()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getA()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getObject()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getIns()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getDel()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EReference getXhtmlAbbrType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getClass_()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EAttribute getXhtmlAbbrType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getId()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EAttribute getXhtmlAbbrType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getLang()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EAttribute getXhtmlAbbrType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getSpace()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EAttribute getXhtmlAbbrType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getStyle()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EAttribute getXhtmlAbbrType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAbbrType#getTitle()
	 * @see #getXhtmlAbbrType()
	 * @generated
	 */
	EAttribute getXhtmlAbbrType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType <em>Acronym Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Acronym Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType
	 * @generated
	 */
	EClass getXhtmlAcronymType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getMixed()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EAttribute getXhtmlAcronymType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getXhtmlInlineMix()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EAttribute getXhtmlAcronymType_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getBr()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getSpan()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getEm()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getStrong()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getDfn()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getCode()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getSamp()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getKbd()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getVar()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getCite()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getAbbr()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getAcronym()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getQ()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getTt()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getI()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getB()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getBig()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getSmall()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getSub()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getSup()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getA()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getObject()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getIns()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getDel()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EReference getXhtmlAcronymType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getClass_()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EAttribute getXhtmlAcronymType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getId()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EAttribute getXhtmlAcronymType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getLang()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EAttribute getXhtmlAcronymType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getSpace()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EAttribute getXhtmlAcronymType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getStyle()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EAttribute getXhtmlAcronymType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAcronymType#getTitle()
	 * @see #getXhtmlAcronymType()
	 * @generated
	 */
	EAttribute getXhtmlAcronymType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType
	 * @generated
	 */
	EClass getXhtmlAddressType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getMixed()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EAttribute getXhtmlAddressType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getXhtmlInlineMix()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EAttribute getXhtmlAddressType_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getBr()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getSpan()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getEm()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getStrong()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getDfn()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getCode()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getSamp()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getKbd()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getVar()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getCite()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getAbbr()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getAcronym()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getQ()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getTt()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getI()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getB()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getBig()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getSmall()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getSub()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getSup()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getA()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getObject()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getIns()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getDel()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EReference getXhtmlAddressType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getClass_()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EAttribute getXhtmlAddressType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getId()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EAttribute getXhtmlAddressType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getLang()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EAttribute getXhtmlAddressType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getSpace()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EAttribute getXhtmlAddressType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getStyle()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EAttribute getXhtmlAddressType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAddressType#getTitle()
	 * @see #getXhtmlAddressType()
	 * @generated
	 */
	EAttribute getXhtmlAddressType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType <em>AType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>AType</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType
	 * @generated
	 */
	EClass getXhtmlAType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getMixed()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EAttribute getXhtmlAType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getXhtmlInlNoAnchorMix <em>Xhtml Inl No Anchor Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inl No Anchor Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getXhtmlInlNoAnchorMix()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EAttribute getXhtmlAType_XhtmlInlNoAnchorMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getBr()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getSpan()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getEm()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getStrong()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getDfn()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getCode()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getSamp()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getKbd()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getVar()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getCite()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getAbbr()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getAcronym()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getQ()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getTt()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getI()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getB()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getBig()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getSmall()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getSub()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getSup()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getObject()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getIns()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getDel()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EReference getXhtmlAType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getAccesskey <em>Accesskey</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Accesskey</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getAccesskey()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EAttribute getXhtmlAType_Accesskey();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getCharset <em>Charset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charset</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getCharset()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EAttribute getXhtmlAType_Charset();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getClass_()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EAttribute getXhtmlAType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getHref <em>Href</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Href</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getHref()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EAttribute getXhtmlAType_Href();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getHreflang <em>Hreflang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Hreflang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getHreflang()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EAttribute getXhtmlAType_Hreflang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getId()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EAttribute getXhtmlAType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getLang()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EAttribute getXhtmlAType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getRel <em>Rel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rel</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getRel()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EAttribute getXhtmlAType_Rel();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getRev <em>Rev</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rev</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getRev()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EAttribute getXhtmlAType_Rev();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getSpace()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EAttribute getXhtmlAType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getStyle()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EAttribute getXhtmlAType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getTabindex <em>Tabindex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tabindex</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getTabindex()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EAttribute getXhtmlAType_Tabindex();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getTitle()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EAttribute getXhtmlAType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlAType#getType()
	 * @see #getXhtmlAType()
	 * @generated
	 */
	EAttribute getXhtmlAType_Type();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType <em>Blockquote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Blockquote Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType
	 * @generated
	 */
	EClass getXhtmlBlockquoteType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getXhtmlBlockMix <em>Xhtml Block Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Block Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getXhtmlBlockMix()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EAttribute getXhtmlBlockquoteType_XhtmlBlockMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getH1()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EReference getXhtmlBlockquoteType_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getH2()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EReference getXhtmlBlockquoteType_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getH3()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EReference getXhtmlBlockquoteType_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getH4()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EReference getXhtmlBlockquoteType_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getH5()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EReference getXhtmlBlockquoteType_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getH6()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EReference getXhtmlBlockquoteType_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getUl()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EReference getXhtmlBlockquoteType_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getOl()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EReference getXhtmlBlockquoteType_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dl</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getDl()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EReference getXhtmlBlockquoteType_Dl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getP()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EReference getXhtmlBlockquoteType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getDiv()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EReference getXhtmlBlockquoteType_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getPre()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EReference getXhtmlBlockquoteType_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getBlockquote()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EReference getXhtmlBlockquoteType_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getAddress()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EReference getXhtmlBlockquoteType_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getHr()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EReference getXhtmlBlockquoteType_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getTable()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EReference getXhtmlBlockquoteType_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getIns()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EReference getXhtmlBlockquoteType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getDel()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EReference getXhtmlBlockquoteType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getCite()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EAttribute getXhtmlBlockquoteType_Cite();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getClass_()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EAttribute getXhtmlBlockquoteType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getId()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EAttribute getXhtmlBlockquoteType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getLang()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EAttribute getXhtmlBlockquoteType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getSpace()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EAttribute getXhtmlBlockquoteType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getStyle()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EAttribute getXhtmlBlockquoteType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBlockquoteType#getTitle()
	 * @see #getXhtmlBlockquoteType()
	 * @generated
	 */
	EAttribute getXhtmlBlockquoteType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBrType <em>Br Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Br Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBrType
	 * @generated
	 */
	EClass getXhtmlBrType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBrType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBrType#getClass_()
	 * @see #getXhtmlBrType()
	 * @generated
	 */
	EAttribute getXhtmlBrType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBrType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBrType#getId()
	 * @see #getXhtmlBrType()
	 * @generated
	 */
	EAttribute getXhtmlBrType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBrType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBrType#getSpace()
	 * @see #getXhtmlBrType()
	 * @generated
	 */
	EAttribute getXhtmlBrType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlBrType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlBrType#getTitle()
	 * @see #getXhtmlBrType()
	 * @generated
	 */
	EAttribute getXhtmlBrType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType <em>Caption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Caption Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType
	 * @generated
	 */
	EClass getXhtmlCaptionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getMixed()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EAttribute getXhtmlCaptionType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getXhtmlInlineMix()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EAttribute getXhtmlCaptionType_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getBr()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getSpan()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getEm()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getStrong()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getDfn()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getCode()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getSamp()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getKbd()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getVar()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getCite()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getAbbr()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getAcronym()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getQ()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getTt()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getI()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getB()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getBig()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getSmall()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getSub()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getSup()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getA()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getObject()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getIns()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getDel()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EReference getXhtmlCaptionType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getClass_()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EAttribute getXhtmlCaptionType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getId()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EAttribute getXhtmlCaptionType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getLang()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EAttribute getXhtmlCaptionType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getSpace()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EAttribute getXhtmlCaptionType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getStyle()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EAttribute getXhtmlCaptionType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCaptionType#getTitle()
	 * @see #getXhtmlCaptionType()
	 * @generated
	 */
	EAttribute getXhtmlCaptionType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType <em>Cite Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cite Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType
	 * @generated
	 */
	EClass getXhtmlCiteType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getMixed()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EAttribute getXhtmlCiteType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getXhtmlInlineMix()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EAttribute getXhtmlCiteType_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getBr()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getSpan()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getEm()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getStrong()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getDfn()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getCode()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getSamp()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getKbd()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getVar()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getCite()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getAbbr()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getAcronym()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getQ()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getTt()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getI()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getB()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getBig()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getSmall()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getSub()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getSup()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getA()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getObject()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getIns()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getDel()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EReference getXhtmlCiteType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getClass_()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EAttribute getXhtmlCiteType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getId()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EAttribute getXhtmlCiteType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getLang()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EAttribute getXhtmlCiteType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getSpace()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EAttribute getXhtmlCiteType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getStyle()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EAttribute getXhtmlCiteType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCiteType#getTitle()
	 * @see #getXhtmlCiteType()
	 * @generated
	 */
	EAttribute getXhtmlCiteType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType <em>Code Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType
	 * @generated
	 */
	EClass getXhtmlCodeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getMixed()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EAttribute getXhtmlCodeType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getXhtmlInlineMix()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EAttribute getXhtmlCodeType_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getBr()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getSpan()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getEm()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getStrong()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getDfn()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getCode()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getSamp()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getKbd()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getVar()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getCite()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getAbbr()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getAcronym()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getQ()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getTt()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getI()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getB()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getBig()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getSmall()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getSub()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getSup()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getA()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getObject()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getIns()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getDel()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EReference getXhtmlCodeType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getClass_()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EAttribute getXhtmlCodeType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getId()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EAttribute getXhtmlCodeType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getLang()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EAttribute getXhtmlCodeType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getSpace()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EAttribute getXhtmlCodeType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getStyle()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EAttribute getXhtmlCodeType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlCodeType#getTitle()
	 * @see #getXhtmlCodeType()
	 * @generated
	 */
	EAttribute getXhtmlCodeType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType <em>Colgroup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colgroup Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType
	 * @generated
	 */
	EClass getXhtmlColgroupType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Col</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getCol()
	 * @see #getXhtmlColgroupType()
	 * @generated
	 */
	EReference getXhtmlColgroupType_Col();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getAlign()
	 * @see #getXhtmlColgroupType()
	 * @generated
	 */
	EAttribute getXhtmlColgroupType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getChar()
	 * @see #getXhtmlColgroupType()
	 * @generated
	 */
	EAttribute getXhtmlColgroupType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getCharoff()
	 * @see #getXhtmlColgroupType()
	 * @generated
	 */
	EAttribute getXhtmlColgroupType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getClass_()
	 * @see #getXhtmlColgroupType()
	 * @generated
	 */
	EAttribute getXhtmlColgroupType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getId()
	 * @see #getXhtmlColgroupType()
	 * @generated
	 */
	EAttribute getXhtmlColgroupType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getLang()
	 * @see #getXhtmlColgroupType()
	 * @generated
	 */
	EAttribute getXhtmlColgroupType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getSpace()
	 * @see #getXhtmlColgroupType()
	 * @generated
	 */
	EAttribute getXhtmlColgroupType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getSpan()
	 * @see #getXhtmlColgroupType()
	 * @generated
	 */
	EAttribute getXhtmlColgroupType_Span();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getStyle()
	 * @see #getXhtmlColgroupType()
	 * @generated
	 */
	EAttribute getXhtmlColgroupType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getTitle()
	 * @see #getXhtmlColgroupType()
	 * @generated
	 */
	EAttribute getXhtmlColgroupType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getValign()
	 * @see #getXhtmlColgroupType()
	 * @generated
	 */
	EAttribute getXhtmlColgroupType_Valign();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColgroupType#getWidth()
	 * @see #getXhtmlColgroupType()
	 * @generated
	 */
	EAttribute getXhtmlColgroupType_Width();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColType <em>Col Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Col Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColType
	 * @generated
	 */
	EClass getXhtmlColType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getAlign()
	 * @see #getXhtmlColType()
	 * @generated
	 */
	EAttribute getXhtmlColType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getChar()
	 * @see #getXhtmlColType()
	 * @generated
	 */
	EAttribute getXhtmlColType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getCharoff()
	 * @see #getXhtmlColType()
	 * @generated
	 */
	EAttribute getXhtmlColType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getClass_()
	 * @see #getXhtmlColType()
	 * @generated
	 */
	EAttribute getXhtmlColType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getId()
	 * @see #getXhtmlColType()
	 * @generated
	 */
	EAttribute getXhtmlColType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getLang()
	 * @see #getXhtmlColType()
	 * @generated
	 */
	EAttribute getXhtmlColType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getSpace()
	 * @see #getXhtmlColType()
	 * @generated
	 */
	EAttribute getXhtmlColType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getSpan()
	 * @see #getXhtmlColType()
	 * @generated
	 */
	EAttribute getXhtmlColType_Span();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getStyle()
	 * @see #getXhtmlColType()
	 * @generated
	 */
	EAttribute getXhtmlColType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getTitle()
	 * @see #getXhtmlColType()
	 * @generated
	 */
	EAttribute getXhtmlColType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getValign()
	 * @see #getXhtmlColType()
	 * @generated
	 */
	EAttribute getXhtmlColType_Valign();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlColType#getWidth()
	 * @see #getXhtmlColType()
	 * @generated
	 */
	EAttribute getXhtmlColType_Width();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType <em>Dd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dd Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType
	 * @generated
	 */
	EClass getXhtmlDdType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getMixed()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EAttribute getXhtmlDdType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getXhtmlFlowMix <em>Xhtml Flow Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Flow Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getXhtmlFlowMix()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EAttribute getXhtmlDdType_XhtmlFlowMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getH1()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getH2()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getH3()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getH4()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getH5()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getH6()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getUl()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getOl()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dl</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getDl()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Dl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getP()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getDiv()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getPre()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getBlockquote()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getAddress()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getHr()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getTable()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getBr()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getSpan()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getEm()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getStrong()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getDfn()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getCode()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getSamp()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getKbd()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getVar()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getCite()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getAbbr()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getAcronym()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getQ()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getTt()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getI()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getB()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getBig()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getSmall()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getSub()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getSup()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getA()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getObject()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getIns()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getDel()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EReference getXhtmlDdType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getClass_()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EAttribute getXhtmlDdType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getId()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EAttribute getXhtmlDdType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getLang()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EAttribute getXhtmlDdType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getSpace()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EAttribute getXhtmlDdType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getStyle()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EAttribute getXhtmlDdType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDdType#getTitle()
	 * @see #getXhtmlDdType()
	 * @generated
	 */
	EAttribute getXhtmlDdType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType <em>Dfn Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dfn Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType
	 * @generated
	 */
	EClass getXhtmlDfnType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getMixed()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EAttribute getXhtmlDfnType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getXhtmlInlineMix()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EAttribute getXhtmlDfnType_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getBr()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getSpan()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getEm()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getStrong()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getDfn()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getCode()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getSamp()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getKbd()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getVar()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getCite()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getAbbr()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getAcronym()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getQ()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getTt()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getI()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getB()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getBig()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getSmall()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getSub()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getSup()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getA()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getObject()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getIns()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getDel()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EReference getXhtmlDfnType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getClass_()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EAttribute getXhtmlDfnType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getId()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EAttribute getXhtmlDfnType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getLang()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EAttribute getXhtmlDfnType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getSpace()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EAttribute getXhtmlDfnType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getStyle()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EAttribute getXhtmlDfnType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDfnType#getTitle()
	 * @see #getXhtmlDfnType()
	 * @generated
	 */
	EAttribute getXhtmlDfnType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType <em>Div Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Div Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType
	 * @generated
	 */
	EClass getXhtmlDivType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getMixed()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EAttribute getXhtmlDivType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getXhtmlFlowMix <em>Xhtml Flow Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Flow Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getXhtmlFlowMix()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EAttribute getXhtmlDivType_XhtmlFlowMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getH1()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getH2()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getH3()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getH4()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getH5()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getH6()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getUl()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getOl()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dl</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getDl()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Dl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getP()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getDiv()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getPre()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getBlockquote()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getAddress()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getHr()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getTable()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getBr()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getSpan()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getEm()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getStrong()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getDfn()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getCode()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getSamp()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getKbd()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getVar()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getCite()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getAbbr()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getAcronym()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getQ()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getTt()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getI()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getB()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getBig()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getSmall()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getSub()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getSup()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getA()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getObject()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getIns()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getDel()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EReference getXhtmlDivType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getClass_()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EAttribute getXhtmlDivType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getId()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EAttribute getXhtmlDivType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getLang()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EAttribute getXhtmlDivType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getSpace()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EAttribute getXhtmlDivType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getStyle()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EAttribute getXhtmlDivType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDivType#getTitle()
	 * @see #getXhtmlDivType()
	 * @generated
	 */
	EAttribute getXhtmlDivType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDlType <em>Dl Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dl Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDlType
	 * @generated
	 */
	EClass getXhtmlDlType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDlType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDlType#getGroup()
	 * @see #getXhtmlDlType()
	 * @generated
	 */
	EAttribute getXhtmlDlType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDlType#getDt <em>Dt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDlType#getDt()
	 * @see #getXhtmlDlType()
	 * @generated
	 */
	EReference getXhtmlDlType_Dt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDlType#getDd <em>Dd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDlType#getDd()
	 * @see #getXhtmlDlType()
	 * @generated
	 */
	EReference getXhtmlDlType_Dd();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDlType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDlType#getClass_()
	 * @see #getXhtmlDlType()
	 * @generated
	 */
	EAttribute getXhtmlDlType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDlType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDlType#getId()
	 * @see #getXhtmlDlType()
	 * @generated
	 */
	EAttribute getXhtmlDlType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDlType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDlType#getLang()
	 * @see #getXhtmlDlType()
	 * @generated
	 */
	EAttribute getXhtmlDlType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDlType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDlType#getSpace()
	 * @see #getXhtmlDlType()
	 * @generated
	 */
	EAttribute getXhtmlDlType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDlType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDlType#getStyle()
	 * @see #getXhtmlDlType()
	 * @generated
	 */
	EAttribute getXhtmlDlType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDlType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDlType#getTitle()
	 * @see #getXhtmlDlType()
	 * @generated
	 */
	EAttribute getXhtmlDlType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType <em>Dt Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dt Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType
	 * @generated
	 */
	EClass getXhtmlDtType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getMixed()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EAttribute getXhtmlDtType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getXhtmlInlineMix()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EAttribute getXhtmlDtType_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getBr()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getSpan()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getEm()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getStrong()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getDfn()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getCode()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getSamp()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getKbd()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getVar()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getCite()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getAbbr()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getAcronym()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getQ()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getTt()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getI()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getB()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getBig()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getSmall()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getSub()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getSup()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getA()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getObject()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getIns()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getDel()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EReference getXhtmlDtType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getClass_()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EAttribute getXhtmlDtType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getId()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EAttribute getXhtmlDtType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getLang()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EAttribute getXhtmlDtType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getSpace()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EAttribute getXhtmlDtType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getStyle()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EAttribute getXhtmlDtType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlDtType#getTitle()
	 * @see #getXhtmlDtType()
	 * @generated
	 */
	EAttribute getXhtmlDtType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType <em>Edit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edit Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType
	 * @generated
	 */
	EClass getXhtmlEditType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getMixed()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EAttribute getXhtmlEditType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getXhtmlFlowMix <em>Xhtml Flow Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Flow Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getXhtmlFlowMix()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EAttribute getXhtmlEditType_XhtmlFlowMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getH1()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getH2()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getH3()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getH4()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getH5()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getH6()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getUl()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getOl()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dl</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getDl()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Dl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getP()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getDiv()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getPre()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getBlockquote()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getAddress()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getHr()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getTable()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getBr()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getSpan()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getEm()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getStrong()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getDfn()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getCode()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getSamp()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getKbd()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getVar()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getCite()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getAbbr()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getAcronym()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getQ()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getTt()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getI()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getB()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getBig()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getSmall()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getSub()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getSup()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getA()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getObject()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getIns()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getDel()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EReference getXhtmlEditType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getCite1 <em>Cite1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cite1</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getCite1()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EAttribute getXhtmlEditType_Cite1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getClass_()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EAttribute getXhtmlEditType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getDatetime <em>Datetime</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Datetime</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getDatetime()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EAttribute getXhtmlEditType_Datetime();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getId()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EAttribute getXhtmlEditType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getLang()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EAttribute getXhtmlEditType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getSpace()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EAttribute getXhtmlEditType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getStyle()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EAttribute getXhtmlEditType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEditType#getTitle()
	 * @see #getXhtmlEditType()
	 * @generated
	 */
	EAttribute getXhtmlEditType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType <em>Em Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Em Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType
	 * @generated
	 */
	EClass getXhtmlEmType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getMixed()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EAttribute getXhtmlEmType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getXhtmlInlineMix()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EAttribute getXhtmlEmType_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getBr()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getSpan()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getEm()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getStrong()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getDfn()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getCode()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getSamp()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getKbd()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getVar()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getCite()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getAbbr()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getAcronym()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getQ()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getTt()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getI()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getB()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getBig()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getSmall()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getSub()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getSup()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getA()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getObject()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getIns()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getDel()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EReference getXhtmlEmType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getClass_()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EAttribute getXhtmlEmType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getId()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EAttribute getXhtmlEmType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getLang()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EAttribute getXhtmlEmType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getSpace()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EAttribute getXhtmlEmType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getStyle()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EAttribute getXhtmlEmType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlEmType#getTitle()
	 * @see #getXhtmlEmType()
	 * @generated
	 */
	EAttribute getXhtmlEmType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type <em>H1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H1 Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type
	 * @generated
	 */
	EClass getXhtmlH1Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getMixed()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EAttribute getXhtmlH1Type_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getXhtmlInlineMix()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EAttribute getXhtmlH1Type_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getBr()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getSpan()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getEm()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getStrong()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getDfn()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getCode()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getSamp()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getKbd()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getVar()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getCite()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getAbbr()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getAcronym()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getQ()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getTt()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getI()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getB()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getBig()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getSmall()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getSub()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getSup()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getA()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getObject()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getIns()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getDel()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EReference getXhtmlH1Type_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getClass_()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EAttribute getXhtmlH1Type_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getId()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EAttribute getXhtmlH1Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getLang()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EAttribute getXhtmlH1Type_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getSpace()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EAttribute getXhtmlH1Type_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getStyle()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EAttribute getXhtmlH1Type_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH1Type#getTitle()
	 * @see #getXhtmlH1Type()
	 * @generated
	 */
	EAttribute getXhtmlH1Type_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type <em>H2 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H2 Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type
	 * @generated
	 */
	EClass getXhtmlH2Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getMixed()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EAttribute getXhtmlH2Type_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getXhtmlInlineMix()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EAttribute getXhtmlH2Type_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getBr()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getSpan()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getEm()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getStrong()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getDfn()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getCode()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getSamp()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getKbd()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getVar()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getCite()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getAbbr()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getAcronym()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getQ()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getTt()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getI()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getB()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getBig()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getSmall()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getSub()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getSup()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getA()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getObject()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getIns()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getDel()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EReference getXhtmlH2Type_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getClass_()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EAttribute getXhtmlH2Type_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getId()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EAttribute getXhtmlH2Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getLang()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EAttribute getXhtmlH2Type_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getSpace()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EAttribute getXhtmlH2Type_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getStyle()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EAttribute getXhtmlH2Type_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH2Type#getTitle()
	 * @see #getXhtmlH2Type()
	 * @generated
	 */
	EAttribute getXhtmlH2Type_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type <em>H3 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H3 Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type
	 * @generated
	 */
	EClass getXhtmlH3Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getMixed()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EAttribute getXhtmlH3Type_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getXhtmlInlineMix()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EAttribute getXhtmlH3Type_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getBr()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getSpan()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getEm()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getStrong()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getDfn()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getCode()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getSamp()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getKbd()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getVar()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getCite()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getAbbr()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getAcronym()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getQ()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getTt()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getI()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getB()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getBig()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getSmall()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getSub()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getSup()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getA()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getObject()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getIns()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getDel()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EReference getXhtmlH3Type_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getClass_()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EAttribute getXhtmlH3Type_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getId()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EAttribute getXhtmlH3Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getLang()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EAttribute getXhtmlH3Type_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getSpace()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EAttribute getXhtmlH3Type_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getStyle()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EAttribute getXhtmlH3Type_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH3Type#getTitle()
	 * @see #getXhtmlH3Type()
	 * @generated
	 */
	EAttribute getXhtmlH3Type_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type <em>H4 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H4 Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type
	 * @generated
	 */
	EClass getXhtmlH4Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getMixed()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EAttribute getXhtmlH4Type_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getXhtmlInlineMix()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EAttribute getXhtmlH4Type_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getBr()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getSpan()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getEm()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getStrong()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getDfn()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getCode()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getSamp()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getKbd()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getVar()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getCite()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getAbbr()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getAcronym()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getQ()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getTt()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getI()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getB()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getBig()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getSmall()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getSub()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getSup()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getA()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getObject()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getIns()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getDel()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EReference getXhtmlH4Type_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getClass_()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EAttribute getXhtmlH4Type_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getId()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EAttribute getXhtmlH4Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getLang()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EAttribute getXhtmlH4Type_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getSpace()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EAttribute getXhtmlH4Type_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getStyle()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EAttribute getXhtmlH4Type_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH4Type#getTitle()
	 * @see #getXhtmlH4Type()
	 * @generated
	 */
	EAttribute getXhtmlH4Type_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type <em>H5 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H5 Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type
	 * @generated
	 */
	EClass getXhtmlH5Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getMixed()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EAttribute getXhtmlH5Type_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getXhtmlInlineMix()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EAttribute getXhtmlH5Type_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getBr()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getSpan()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getEm()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getStrong()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getDfn()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getCode()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getSamp()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getKbd()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getVar()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getCite()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getAbbr()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getAcronym()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getQ()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getTt()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getI()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getB()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getBig()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getSmall()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getSub()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getSup()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getA()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getObject()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getIns()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getDel()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EReference getXhtmlH5Type_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getClass_()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EAttribute getXhtmlH5Type_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getId()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EAttribute getXhtmlH5Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getLang()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EAttribute getXhtmlH5Type_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getSpace()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EAttribute getXhtmlH5Type_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getStyle()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EAttribute getXhtmlH5Type_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH5Type#getTitle()
	 * @see #getXhtmlH5Type()
	 * @generated
	 */
	EAttribute getXhtmlH5Type_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type <em>H6 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>H6 Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type
	 * @generated
	 */
	EClass getXhtmlH6Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getMixed()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EAttribute getXhtmlH6Type_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getXhtmlInlineMix()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EAttribute getXhtmlH6Type_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getBr()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getSpan()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getEm()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getStrong()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getDfn()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getCode()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getSamp()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getKbd()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getVar()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getCite()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getAbbr()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getAcronym()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getQ()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getTt()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getI()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getB()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getBig()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getSmall()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getSub()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getSup()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getA()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getObject()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getIns()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getDel()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EReference getXhtmlH6Type_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getClass_()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EAttribute getXhtmlH6Type_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getId()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EAttribute getXhtmlH6Type_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getLang()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EAttribute getXhtmlH6Type_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getSpace()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EAttribute getXhtmlH6Type_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getStyle()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EAttribute getXhtmlH6Type_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlH6Type#getTitle()
	 * @see #getXhtmlH6Type()
	 * @generated
	 */
	EAttribute getXhtmlH6Type_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType <em>Heading Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Heading Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType
	 * @generated
	 */
	EClass getXhtmlHeadingType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getMixed()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EAttribute getXhtmlHeadingType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getXhtmlInlineMix()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EAttribute getXhtmlHeadingType_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getBr()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getSpan()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getEm()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getStrong()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getDfn()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getCode()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getSamp()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getKbd()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getVar()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getCite()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getAbbr()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getAcronym()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getQ()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getTt()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getI()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getB()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getBig()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getSmall()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getSub()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getSup()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getA()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getObject()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getIns()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getDel()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EReference getXhtmlHeadingType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getClass_()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EAttribute getXhtmlHeadingType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getId()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EAttribute getXhtmlHeadingType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getLang()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EAttribute getXhtmlHeadingType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getSpace()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EAttribute getXhtmlHeadingType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getStyle()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EAttribute getXhtmlHeadingType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHeadingType#getTitle()
	 * @see #getXhtmlHeadingType()
	 * @generated
	 */
	EAttribute getXhtmlHeadingType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHrType <em>Hr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hr Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHrType
	 * @generated
	 */
	EClass getXhtmlHrType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHrType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHrType#getClass_()
	 * @see #getXhtmlHrType()
	 * @generated
	 */
	EAttribute getXhtmlHrType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHrType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHrType#getId()
	 * @see #getXhtmlHrType()
	 * @generated
	 */
	EAttribute getXhtmlHrType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHrType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHrType#getLang()
	 * @see #getXhtmlHrType()
	 * @generated
	 */
	EAttribute getXhtmlHrType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHrType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHrType#getSpace()
	 * @see #getXhtmlHrType()
	 * @generated
	 */
	EAttribute getXhtmlHrType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHrType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHrType#getStyle()
	 * @see #getXhtmlHrType()
	 * @generated
	 */
	EAttribute getXhtmlHrType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlHrType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlHrType#getTitle()
	 * @see #getXhtmlHrType()
	 * @generated
	 */
	EAttribute getXhtmlHrType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType <em>Inl Pres Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inl Pres Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType
	 * @generated
	 */
	EClass getXhtmlInlPresType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getMixed()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EAttribute getXhtmlInlPresType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getXhtmlInlineMix()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EAttribute getXhtmlInlPresType_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getBr()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getSpan()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getEm()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getStrong()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getDfn()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getCode()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getSamp()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getKbd()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getVar()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getCite()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getAbbr()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getAcronym()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getQ()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getTt()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getI()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getB()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getBig()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getSmall()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getSub()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getSup()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getA()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getObject()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getIns()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getDel()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EReference getXhtmlInlPresType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getClass_()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EAttribute getXhtmlInlPresType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getId()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EAttribute getXhtmlInlPresType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getLang()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EAttribute getXhtmlInlPresType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getSpace()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EAttribute getXhtmlInlPresType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getStyle()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EAttribute getXhtmlInlPresType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlInlPresType#getTitle()
	 * @see #getXhtmlInlPresType()
	 * @generated
	 */
	EAttribute getXhtmlInlPresType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType <em>Kbd Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kbd Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType
	 * @generated
	 */
	EClass getXhtmlKbdType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getMixed()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EAttribute getXhtmlKbdType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getXhtmlInlineMix()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EAttribute getXhtmlKbdType_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getBr()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getSpan()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getEm()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getStrong()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getDfn()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getCode()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getSamp()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getKbd()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getVar()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getCite()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getAbbr()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getAcronym()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getQ()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getTt()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getI()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getB()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getBig()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getSmall()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getSub()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getSup()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getA()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getObject()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getIns()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getDel()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EReference getXhtmlKbdType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getClass_()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EAttribute getXhtmlKbdType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getId()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EAttribute getXhtmlKbdType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getLang()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EAttribute getXhtmlKbdType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getSpace()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EAttribute getXhtmlKbdType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getStyle()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EAttribute getXhtmlKbdType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlKbdType#getTitle()
	 * @see #getXhtmlKbdType()
	 * @generated
	 */
	EAttribute getXhtmlKbdType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType <em>Li Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Li Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType
	 * @generated
	 */
	EClass getXhtmlLiType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getMixed()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EAttribute getXhtmlLiType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getXhtmlFlowMix <em>Xhtml Flow Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Flow Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getXhtmlFlowMix()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EAttribute getXhtmlLiType_XhtmlFlowMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getH1()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getH2()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getH3()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getH4()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getH5()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getH6()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getUl()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getOl()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dl</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getDl()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Dl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getP()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getDiv()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getPre()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getBlockquote()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getAddress()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getHr()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getTable()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getBr()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getSpan()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getEm()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getStrong()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getDfn()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getCode()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getSamp()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getKbd()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getVar()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getCite()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getAbbr()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getAcronym()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getQ()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getTt()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getI()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getB()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getBig()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getSmall()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getSub()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getSup()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getA()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getObject()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getIns()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getDel()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EReference getXhtmlLiType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getClass_()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EAttribute getXhtmlLiType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getId()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EAttribute getXhtmlLiType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getLang()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EAttribute getXhtmlLiType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getSpace()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EAttribute getXhtmlLiType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getStyle()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EAttribute getXhtmlLiType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlLiType#getTitle()
	 * @see #getXhtmlLiType()
	 * @generated
	 */
	EAttribute getXhtmlLiType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType <em>Object Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Object Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType
	 * @generated
	 */
	EClass getXhtmlObjectType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getMixed()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getGroup()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Param</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getParam()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Param();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getH1()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getH2()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getH3()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getH4()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getH5()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getH6()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getUl()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getOl()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dl</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getDl()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Dl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getP()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getDiv()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getPre()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getBlockquote()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getAddress()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getHr()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getTable()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getBr()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getSpan()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getEm()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getStrong()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getDfn()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getCode()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getSamp()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getKbd()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getVar()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getCite()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getAbbr()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getAcronym()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getQ()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getTt()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getI()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getB()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getBig()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getSmall()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getSub()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getSup()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getA()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getObject()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getIns()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getDel()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EReference getXhtmlObjectType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getArchive <em>Archive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Archive</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getArchive()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Archive();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getClass_()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getClassid <em>Classid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Classid</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getClassid()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Classid();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getCodebase <em>Codebase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codebase</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getCodebase()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Codebase();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getCodetype <em>Codetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Codetype</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getCodetype()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Codetype();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getData()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Data();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getDeclare <em>Declare</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declare</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getDeclare()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Declare();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getHeight()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getId()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getLang()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getName()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getSpace()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getStandby <em>Standby</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Standby</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getStandby()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Standby();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getStyle()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getTabindex <em>Tabindex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tabindex</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getTabindex()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Tabindex();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getTitle()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getType()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlObjectType#getWidth()
	 * @see #getXhtmlObjectType()
	 * @generated
	 */
	EAttribute getXhtmlObjectType_Width();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlOlType <em>Ol Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ol Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlOlType
	 * @generated
	 */
	EClass getXhtmlOlType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlOlType#getLi <em>Li</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Li</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlOlType#getLi()
	 * @see #getXhtmlOlType()
	 * @generated
	 */
	EReference getXhtmlOlType_Li();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlOlType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlOlType#getClass_()
	 * @see #getXhtmlOlType()
	 * @generated
	 */
	EAttribute getXhtmlOlType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlOlType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlOlType#getId()
	 * @see #getXhtmlOlType()
	 * @generated
	 */
	EAttribute getXhtmlOlType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlOlType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlOlType#getLang()
	 * @see #getXhtmlOlType()
	 * @generated
	 */
	EAttribute getXhtmlOlType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlOlType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlOlType#getSpace()
	 * @see #getXhtmlOlType()
	 * @generated
	 */
	EAttribute getXhtmlOlType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlOlType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlOlType#getStyle()
	 * @see #getXhtmlOlType()
	 * @generated
	 */
	EAttribute getXhtmlOlType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlOlType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlOlType#getTitle()
	 * @see #getXhtmlOlType()
	 * @generated
	 */
	EAttribute getXhtmlOlType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Param Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlParamType
	 * @generated
	 */
	EClass getXhtmlParamType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlParamType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlParamType#getId()
	 * @see #getXhtmlParamType()
	 * @generated
	 */
	EAttribute getXhtmlParamType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlParamType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlParamType#getName()
	 * @see #getXhtmlParamType()
	 * @generated
	 */
	EAttribute getXhtmlParamType_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlParamType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlParamType#getType()
	 * @see #getXhtmlParamType()
	 * @generated
	 */
	EAttribute getXhtmlParamType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlParamType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlParamType#getValue()
	 * @see #getXhtmlParamType()
	 * @generated
	 */
	EAttribute getXhtmlParamType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlParamType#getValuetype <em>Valuetype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valuetype</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlParamType#getValuetype()
	 * @see #getXhtmlParamType()
	 * @generated
	 */
	EAttribute getXhtmlParamType_Valuetype();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType <em>Pre Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pre Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType
	 * @generated
	 */
	EClass getXhtmlPreType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getMixed()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EAttribute getXhtmlPreType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getXhtmlInlinePreMix <em>Xhtml Inline Pre Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Pre Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getXhtmlInlinePreMix()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EAttribute getXhtmlPreType_XhtmlInlinePreMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getBr()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getSpan()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getEm()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getStrong()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getDfn()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getCode()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getSamp()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getKbd()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getVar()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getCite()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getAbbr()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getAcronym()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getQ()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getTt()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getI()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getB()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getA()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getIns()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getDel()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EReference getXhtmlPreType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getClass_()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EAttribute getXhtmlPreType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getId()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EAttribute getXhtmlPreType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getLang()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EAttribute getXhtmlPreType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getSpace()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EAttribute getXhtmlPreType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getStyle()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EAttribute getXhtmlPreType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPreType#getTitle()
	 * @see #getXhtmlPreType()
	 * @generated
	 */
	EAttribute getXhtmlPreType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType <em>PType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>PType</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType
	 * @generated
	 */
	EClass getXhtmlPType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getMixed()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EAttribute getXhtmlPType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getXhtmlInlineMix()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EAttribute getXhtmlPType_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getBr()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getSpan()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getEm()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getStrong()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getDfn()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getCode()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getSamp()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getKbd()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getVar()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getCite()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getAbbr()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getAcronym()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getQ()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getTt()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getI()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getB()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getBig()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getSmall()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getSub()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getSup()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getA()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getObject()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getIns()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getDel()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EReference getXhtmlPType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getClass_()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EAttribute getXhtmlPType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getId()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EAttribute getXhtmlPType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getLang()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EAttribute getXhtmlPType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getSpace()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EAttribute getXhtmlPType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getStyle()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EAttribute getXhtmlPType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlPType#getTitle()
	 * @see #getXhtmlPType()
	 * @generated
	 */
	EAttribute getXhtmlPType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType <em>QType</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>QType</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType
	 * @generated
	 */
	EClass getXhtmlQType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getMixed()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EAttribute getXhtmlQType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getXhtmlInlineMix()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EAttribute getXhtmlQType_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getBr()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getSpan()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getEm()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getStrong()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getDfn()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getCode()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getSamp()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getKbd()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getVar()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getCite()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getAbbr()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getAcronym()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getQ()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getTt()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getI()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getB()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getBig()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getSmall()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getSub()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getSup()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getA()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getObject()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getIns()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getDel()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EReference getXhtmlQType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getCite1 <em>Cite1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cite1</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getCite1()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EAttribute getXhtmlQType_Cite1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getClass_()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EAttribute getXhtmlQType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getId()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EAttribute getXhtmlQType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getLang()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EAttribute getXhtmlQType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getSpace()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EAttribute getXhtmlQType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getStyle()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EAttribute getXhtmlQType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlQType#getTitle()
	 * @see #getXhtmlQType()
	 * @generated
	 */
	EAttribute getXhtmlQType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType <em>Samp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Samp Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType
	 * @generated
	 */
	EClass getXhtmlSampType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getMixed()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EAttribute getXhtmlSampType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getXhtmlInlineMix()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EAttribute getXhtmlSampType_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getBr()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getSpan()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getEm()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getStrong()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getDfn()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getCode()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getSamp()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getKbd()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getVar()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getCite()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getAbbr()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getAcronym()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getQ()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getTt()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getI()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getB()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getBig()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getSmall()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getSub()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getSup()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getA()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getObject()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getIns()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getDel()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EReference getXhtmlSampType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getClass_()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EAttribute getXhtmlSampType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getId()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EAttribute getXhtmlSampType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getLang()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EAttribute getXhtmlSampType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getSpace()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EAttribute getXhtmlSampType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getStyle()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EAttribute getXhtmlSampType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSampType#getTitle()
	 * @see #getXhtmlSampType()
	 * @generated
	 */
	EAttribute getXhtmlSampType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType <em>Span Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType
	 * @generated
	 */
	EClass getXhtmlSpanType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getMixed()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EAttribute getXhtmlSpanType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getXhtmlInlineMix()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EAttribute getXhtmlSpanType_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getBr()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSpan()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getEm()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getStrong()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getDfn()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getCode()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSamp()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getKbd()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getVar()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getCite()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getAbbr()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getAcronym()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getQ()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getTt()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getI()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getB()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getBig()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSmall()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSub()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSup()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getA()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getObject()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getIns()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getDel()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EReference getXhtmlSpanType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getClass_()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EAttribute getXhtmlSpanType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getId()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EAttribute getXhtmlSpanType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getLang()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EAttribute getXhtmlSpanType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getSpace()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EAttribute getXhtmlSpanType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getStyle()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EAttribute getXhtmlSpanType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlSpanType#getTitle()
	 * @see #getXhtmlSpanType()
	 * @generated
	 */
	EAttribute getXhtmlSpanType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType <em>Strong Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Strong Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType
	 * @generated
	 */
	EClass getXhtmlStrongType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getMixed()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EAttribute getXhtmlStrongType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getXhtmlInlineMix()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EAttribute getXhtmlStrongType_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getBr()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getSpan()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getEm()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getStrong()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getDfn()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getCode()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getSamp()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getKbd()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getVar()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getCite()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getAbbr()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getAcronym()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getQ()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getTt()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getI()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getB()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getBig()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getSmall()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getSub()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getSup()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getA()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getObject()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getIns()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getDel()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EReference getXhtmlStrongType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getClass_()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EAttribute getXhtmlStrongType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getId()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EAttribute getXhtmlStrongType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getLang()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EAttribute getXhtmlStrongType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getSpace()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EAttribute getXhtmlStrongType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getStyle()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EAttribute getXhtmlStrongType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlStrongType#getTitle()
	 * @see #getXhtmlStrongType()
	 * @generated
	 */
	EAttribute getXhtmlStrongType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType
	 * @generated
	 */
	EClass getXhtmlTableType();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getCaption <em>Caption</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Caption</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getCaption()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EReference getXhtmlTableType_Caption();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getCol <em>Col</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Col</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getCol()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EReference getXhtmlTableType_Col();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getColgroup <em>Colgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colgroup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getColgroup()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EReference getXhtmlTableType_Colgroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getThead <em>Thead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thead</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getThead()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EReference getXhtmlTableType_Thead();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getTfoot <em>Tfoot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tfoot</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getTfoot()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EReference getXhtmlTableType_Tfoot();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getTbody <em>Tbody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tbody</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getTbody()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EReference getXhtmlTableType_Tbody();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getTr()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EReference getXhtmlTableType_Tr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getBorder <em>Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getBorder()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EAttribute getXhtmlTableType_Border();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getCellpadding <em>Cellpadding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cellpadding</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getCellpadding()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EAttribute getXhtmlTableType_Cellpadding();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getCellspacing <em>Cellspacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cellspacing</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getCellspacing()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EAttribute getXhtmlTableType_Cellspacing();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getClass_()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EAttribute getXhtmlTableType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Frame</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getFrame()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EAttribute getXhtmlTableType_Frame();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getId()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EAttribute getXhtmlTableType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getLang()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EAttribute getXhtmlTableType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rules</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getRules()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EAttribute getXhtmlTableType_Rules();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getSpace()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EAttribute getXhtmlTableType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getStyle()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EAttribute getXhtmlTableType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getSummary <em>Summary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Summary</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getSummary()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EAttribute getXhtmlTableType_Summary();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getTitle()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EAttribute getXhtmlTableType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTableType#getWidth()
	 * @see #getXhtmlTableType()
	 * @generated
	 */
	EAttribute getXhtmlTableType_Width();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType <em>Tbody Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tbody Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType
	 * @generated
	 */
	EClass getXhtmlTbodyType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getTr()
	 * @see #getXhtmlTbodyType()
	 * @generated
	 */
	EReference getXhtmlTbodyType_Tr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getAlign()
	 * @see #getXhtmlTbodyType()
	 * @generated
	 */
	EAttribute getXhtmlTbodyType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getChar()
	 * @see #getXhtmlTbodyType()
	 * @generated
	 */
	EAttribute getXhtmlTbodyType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getCharoff()
	 * @see #getXhtmlTbodyType()
	 * @generated
	 */
	EAttribute getXhtmlTbodyType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getClass_()
	 * @see #getXhtmlTbodyType()
	 * @generated
	 */
	EAttribute getXhtmlTbodyType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getId()
	 * @see #getXhtmlTbodyType()
	 * @generated
	 */
	EAttribute getXhtmlTbodyType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getLang()
	 * @see #getXhtmlTbodyType()
	 * @generated
	 */
	EAttribute getXhtmlTbodyType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getSpace()
	 * @see #getXhtmlTbodyType()
	 * @generated
	 */
	EAttribute getXhtmlTbodyType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getStyle()
	 * @see #getXhtmlTbodyType()
	 * @generated
	 */
	EAttribute getXhtmlTbodyType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getTitle()
	 * @see #getXhtmlTbodyType()
	 * @generated
	 */
	EAttribute getXhtmlTbodyType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTbodyType#getValign()
	 * @see #getXhtmlTbodyType()
	 * @generated
	 */
	EAttribute getXhtmlTbodyType_Valign();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType <em>Td Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Td Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType
	 * @generated
	 */
	EClass getXhtmlTdType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getMixed()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EAttribute getXhtmlTdType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getXhtmlFlowMix <em>Xhtml Flow Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Flow Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getXhtmlFlowMix()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EAttribute getXhtmlTdType_XhtmlFlowMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getH1()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getH2()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getH3()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getH4()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getH5()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getH6()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getUl()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getOl()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dl</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getDl()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Dl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getP()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getDiv()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getPre()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getBlockquote()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getAddress()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getHr()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getTable()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getBr()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getSpan()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getEm()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getStrong()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getDfn()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getCode()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getSamp()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getKbd()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getVar()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getCite()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getAbbr()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getAcronym()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getQ()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getTt()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getI()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getB()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getBig()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getSmall()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getSub()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getSup()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getA()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getObject()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getIns()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getDel()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EReference getXhtmlTdType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getAbbr1 <em>Abbr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbr1</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getAbbr1()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EAttribute getXhtmlTdType_Abbr1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getAlign()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EAttribute getXhtmlTdType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getAxis()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EAttribute getXhtmlTdType_Axis();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getChar()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EAttribute getXhtmlTdType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getCharoff()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EAttribute getXhtmlTdType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getClass_()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EAttribute getXhtmlTdType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getColspan <em>Colspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colspan</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getColspan()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EAttribute getXhtmlTdType_Colspan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Headers</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getHeaders()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EAttribute getXhtmlTdType_Headers();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getId()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EAttribute getXhtmlTdType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getLang()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EAttribute getXhtmlTdType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getRowspan <em>Rowspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowspan</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getRowspan()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EAttribute getXhtmlTdType_Rowspan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getScope()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EAttribute getXhtmlTdType_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getSpace()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EAttribute getXhtmlTdType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getStyle()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EAttribute getXhtmlTdType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getTitle()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EAttribute getXhtmlTdType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTdType#getValign()
	 * @see #getXhtmlTdType()
	 * @generated
	 */
	EAttribute getXhtmlTdType_Valign();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType <em>Tfoot Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tfoot Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType
	 * @generated
	 */
	EClass getXhtmlTfootType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getTr()
	 * @see #getXhtmlTfootType()
	 * @generated
	 */
	EReference getXhtmlTfootType_Tr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getAlign()
	 * @see #getXhtmlTfootType()
	 * @generated
	 */
	EAttribute getXhtmlTfootType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getChar()
	 * @see #getXhtmlTfootType()
	 * @generated
	 */
	EAttribute getXhtmlTfootType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getCharoff()
	 * @see #getXhtmlTfootType()
	 * @generated
	 */
	EAttribute getXhtmlTfootType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getClass_()
	 * @see #getXhtmlTfootType()
	 * @generated
	 */
	EAttribute getXhtmlTfootType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getId()
	 * @see #getXhtmlTfootType()
	 * @generated
	 */
	EAttribute getXhtmlTfootType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getLang()
	 * @see #getXhtmlTfootType()
	 * @generated
	 */
	EAttribute getXhtmlTfootType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getSpace()
	 * @see #getXhtmlTfootType()
	 * @generated
	 */
	EAttribute getXhtmlTfootType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getStyle()
	 * @see #getXhtmlTfootType()
	 * @generated
	 */
	EAttribute getXhtmlTfootType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getTitle()
	 * @see #getXhtmlTfootType()
	 * @generated
	 */
	EAttribute getXhtmlTfootType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTfootType#getValign()
	 * @see #getXhtmlTfootType()
	 * @generated
	 */
	EAttribute getXhtmlTfootType_Valign();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType <em>Thead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thead Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType
	 * @generated
	 */
	EClass getXhtmlTheadType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getTr <em>Tr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getTr()
	 * @see #getXhtmlTheadType()
	 * @generated
	 */
	EReference getXhtmlTheadType_Tr();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getAlign()
	 * @see #getXhtmlTheadType()
	 * @generated
	 */
	EAttribute getXhtmlTheadType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getChar()
	 * @see #getXhtmlTheadType()
	 * @generated
	 */
	EAttribute getXhtmlTheadType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getCharoff()
	 * @see #getXhtmlTheadType()
	 * @generated
	 */
	EAttribute getXhtmlTheadType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getClass_()
	 * @see #getXhtmlTheadType()
	 * @generated
	 */
	EAttribute getXhtmlTheadType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getId()
	 * @see #getXhtmlTheadType()
	 * @generated
	 */
	EAttribute getXhtmlTheadType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getLang()
	 * @see #getXhtmlTheadType()
	 * @generated
	 */
	EAttribute getXhtmlTheadType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getSpace()
	 * @see #getXhtmlTheadType()
	 * @generated
	 */
	EAttribute getXhtmlTheadType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getStyle()
	 * @see #getXhtmlTheadType()
	 * @generated
	 */
	EAttribute getXhtmlTheadType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getTitle()
	 * @see #getXhtmlTheadType()
	 * @generated
	 */
	EAttribute getXhtmlTheadType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTheadType#getValign()
	 * @see #getXhtmlTheadType()
	 * @generated
	 */
	EAttribute getXhtmlTheadType_Valign();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType <em>Th Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Th Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType
	 * @generated
	 */
	EClass getXhtmlThType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getMixed()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EAttribute getXhtmlThType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getXhtmlFlowMix <em>Xhtml Flow Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Flow Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getXhtmlFlowMix()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EAttribute getXhtmlThType_XhtmlFlowMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getH1 <em>H1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H1</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getH1()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_H1();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getH2 <em>H2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H2</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getH2()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_H2();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getH3 <em>H3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H3</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getH3()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_H3();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getH4 <em>H4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H4</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getH4()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_H4();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getH5 <em>H5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H5</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getH5()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_H5();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getH6 <em>H6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>H6</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getH6()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_H6();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getUl <em>Ul</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ul</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getUl()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Ul();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getOl <em>Ol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ol</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getOl()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Ol();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getDl <em>Dl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dl</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getDl()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Dl();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>P</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getP()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_P();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getDiv <em>Div</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Div</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getDiv()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Div();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getPre <em>Pre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pre</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getPre()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Pre();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getBlockquote <em>Blockquote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Blockquote</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getBlockquote()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Blockquote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Address</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAddress()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Address();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getHr <em>Hr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getHr()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Hr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getTable()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getBr()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSpan()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getEm()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getStrong()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getDfn()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getCode()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSamp()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getKbd()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getVar()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getCite()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAbbr()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAcronym()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getQ()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getTt()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getI()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getB()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getBig()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSmall()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSub()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSup()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getA()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getObject()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getIns()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getDel()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EReference getXhtmlThType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAbbr1 <em>Abbr1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abbr1</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAbbr1()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EAttribute getXhtmlThType_Abbr1();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAlign()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EAttribute getXhtmlThType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAxis <em>Axis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Axis</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getAxis()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EAttribute getXhtmlThType_Axis();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getChar()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EAttribute getXhtmlThType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getCharoff()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EAttribute getXhtmlThType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getClass_()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EAttribute getXhtmlThType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getColspan <em>Colspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colspan</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getColspan()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EAttribute getXhtmlThType_Colspan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Headers</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getHeaders()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EAttribute getXhtmlThType_Headers();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getId()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EAttribute getXhtmlThType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getLang()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EAttribute getXhtmlThType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getRowspan <em>Rowspan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowspan</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getRowspan()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EAttribute getXhtmlThType_Rowspan();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getScope()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EAttribute getXhtmlThType_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getSpace()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EAttribute getXhtmlThType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getStyle()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EAttribute getXhtmlThType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getTitle()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EAttribute getXhtmlThType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlThType#getValign()
	 * @see #getXhtmlThType()
	 * @generated
	 */
	EAttribute getXhtmlThType_Valign();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTrType <em>Tr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tr Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTrType
	 * @generated
	 */
	EClass getXhtmlTrType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getGroup()
	 * @see #getXhtmlTrType()
	 * @generated
	 */
	EAttribute getXhtmlTrType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getTh <em>Th</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Th</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getTh()
	 * @see #getXhtmlTrType()
	 * @generated
	 */
	EReference getXhtmlTrType_Th();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getTd <em>Td</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Td</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getTd()
	 * @see #getXhtmlTrType()
	 * @generated
	 */
	EReference getXhtmlTrType_Td();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getAlign()
	 * @see #getXhtmlTrType()
	 * @generated
	 */
	EAttribute getXhtmlTrType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getChar()
	 * @see #getXhtmlTrType()
	 * @generated
	 */
	EAttribute getXhtmlTrType_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getCharoff <em>Charoff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Charoff</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getCharoff()
	 * @see #getXhtmlTrType()
	 * @generated
	 */
	EAttribute getXhtmlTrType_Charoff();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getClass_()
	 * @see #getXhtmlTrType()
	 * @generated
	 */
	EAttribute getXhtmlTrType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getId()
	 * @see #getXhtmlTrType()
	 * @generated
	 */
	EAttribute getXhtmlTrType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getLang()
	 * @see #getXhtmlTrType()
	 * @generated
	 */
	EAttribute getXhtmlTrType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getSpace()
	 * @see #getXhtmlTrType()
	 * @generated
	 */
	EAttribute getXhtmlTrType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getStyle()
	 * @see #getXhtmlTrType()
	 * @generated
	 */
	EAttribute getXhtmlTrType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getTitle()
	 * @see #getXhtmlTrType()
	 * @generated
	 */
	EAttribute getXhtmlTrType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlTrType#getValign()
	 * @see #getXhtmlTrType()
	 * @generated
	 */
	EAttribute getXhtmlTrType_Valign();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlUlType <em>Ul Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ul Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlUlType
	 * @generated
	 */
	EClass getXhtmlUlType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlUlType#getLi <em>Li</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Li</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlUlType#getLi()
	 * @see #getXhtmlUlType()
	 * @generated
	 */
	EReference getXhtmlUlType_Li();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlUlType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlUlType#getClass_()
	 * @see #getXhtmlUlType()
	 * @generated
	 */
	EAttribute getXhtmlUlType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlUlType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlUlType#getId()
	 * @see #getXhtmlUlType()
	 * @generated
	 */
	EAttribute getXhtmlUlType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlUlType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlUlType#getLang()
	 * @see #getXhtmlUlType()
	 * @generated
	 */
	EAttribute getXhtmlUlType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlUlType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlUlType#getSpace()
	 * @see #getXhtmlUlType()
	 * @generated
	 */
	EAttribute getXhtmlUlType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlUlType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlUlType#getStyle()
	 * @see #getXhtmlUlType()
	 * @generated
	 */
	EAttribute getXhtmlUlType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlUlType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlUlType#getTitle()
	 * @see #getXhtmlUlType()
	 * @generated
	 */
	EAttribute getXhtmlUlType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType <em>Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType
	 * @generated
	 */
	EClass getXhtmlVarType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getMixed()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EAttribute getXhtmlVarType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getXhtmlInlineMix <em>Xhtml Inline Mix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Xhtml Inline Mix</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getXhtmlInlineMix()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EAttribute getXhtmlVarType_XhtmlInlineMix();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getBr <em>Br</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Br</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getBr()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Br();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getSpan <em>Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Span</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getSpan()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Span();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getEm <em>Em</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Em</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getEm()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Em();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getStrong <em>Strong</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Strong</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getStrong()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Strong();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getDfn <em>Dfn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dfn</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getDfn()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Dfn();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Code</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getCode()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getSamp <em>Samp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Samp</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getSamp()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Samp();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getKbd <em>Kbd</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Kbd</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getKbd()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Kbd();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getVar <em>Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getVar()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Var();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getCite <em>Cite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cite</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getCite()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Cite();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getAbbr <em>Abbr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Abbr</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getAbbr()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Abbr();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getAcronym <em>Acronym</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Acronym</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getAcronym()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Acronym();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getQ <em>Q</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Q</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getQ()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Q();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getTt <em>Tt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Tt</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getTt()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Tt();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getI <em>I</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>I</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getI()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_I();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getB <em>B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>B</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getB()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_B();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getBig <em>Big</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Big</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getBig()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Big();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getSmall <em>Small</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Small</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getSmall()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Small();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getSub <em>Sub</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getSub()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Sub();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getSup <em>Sup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sup</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getSup()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Sup();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getA <em>A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>A</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getA()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_A();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getObject <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getObject()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Object();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getIns <em>Ins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ins</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getIns()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Ins();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getDel <em>Del</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Del</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getDel()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EReference getXhtmlVarType_Del();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getClass_()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EAttribute getXhtmlVarType_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getId()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EAttribute getXhtmlVarType_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getLang()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EAttribute getXhtmlVarType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getSpace <em>Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Space</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getSpace()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EAttribute getXhtmlVarType_Space();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getStyle <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Style</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getStyle()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EAttribute getXhtmlVarType_Style();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.XhtmlVarType#getTitle()
	 * @see #getXhtmlVarType()
	 * @generated
	 */
	EAttribute getXhtmlVarType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.rmf.reqif10.xhtml.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.rmf.reqif10.xhtml.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.rmf.reqif10.xhtml.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.rmf.reqif10.xhtml.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.DocumentRoot#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.DocumentRoot#getClass_()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.DocumentRoot#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.DocumentRoot#getId()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.rmf.reqif10.xhtml.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Title();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.reqif10.xhtml.AlignType <em>Align Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Align Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.AlignType
	 * @generated
	 */
	EEnum getAlignType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.reqif10.xhtml.DeclareType <em>Declare Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Declare Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.DeclareType
	 * @generated
	 */
	EEnum getDeclareType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.reqif10.xhtml.FrameType <em>Frame Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Frame Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.FrameType
	 * @generated
	 */
	EEnum getFrameType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.reqif10.xhtml.RulesType <em>Rules Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Rules Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.RulesType
	 * @generated
	 */
	EEnum getRulesType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.reqif10.xhtml.ScopeType <em>Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.ScopeType
	 * @generated
	 */
	EEnum getScopeType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.reqif10.xhtml.ValignType <em>Valign Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Valign Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.ValignType
	 * @generated
	 */
	EEnum getValignType();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.rmf.reqif10.xhtml.ValuetypeType <em>Valuetype Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Valuetype Type</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.ValuetypeType
	 * @generated
	 */
	EEnum getValuetypeType();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.reqif10.xhtml.AlignType <em>Align Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Align Type Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.AlignType
	 * @model instanceClass="org.eclipse.rmf.reqif10.xhtml.AlignType"
	 *        extendedMetaData="name='align_._type:Object' baseType='align_._type'"
	 * @generated
	 */
	EDataType getAlignTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.reqif10.xhtml.DeclareType <em>Declare Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Declare Type Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.DeclareType
	 * @model instanceClass="org.eclipse.rmf.reqif10.xhtml.DeclareType"
	 *        extendedMetaData="name='declare_._type:Object' baseType='declare_._type'"
	 * @generated
	 */
	EDataType getDeclareTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.reqif10.xhtml.FrameType <em>Frame Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Frame Type Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.FrameType
	 * @model instanceClass="org.eclipse.rmf.reqif10.xhtml.FrameType"
	 *        extendedMetaData="name='frame_._type:Object' baseType='frame_._type'"
	 * @generated
	 */
	EDataType getFrameTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.reqif10.xhtml.RulesType <em>Rules Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Rules Type Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.RulesType
	 * @model instanceClass="org.eclipse.rmf.reqif10.xhtml.RulesType"
	 *        extendedMetaData="name='rules_._type:Object' baseType='rules_._type'"
	 * @generated
	 */
	EDataType getRulesTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.reqif10.xhtml.ScopeType <em>Scope Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Scope Type Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.ScopeType
	 * @model instanceClass="org.eclipse.rmf.reqif10.xhtml.ScopeType"
	 *        extendedMetaData="name='scope_._type:Object' baseType='scope_._type'"
	 * @generated
	 */
	EDataType getScopeTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.reqif10.xhtml.ValignType <em>Valign Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Valign Type Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.ValignType
	 * @model instanceClass="org.eclipse.rmf.reqif10.xhtml.ValignType"
	 *        extendedMetaData="name='valign_._type:Object' baseType='valign_._type'"
	 * @generated
	 */
	EDataType getValignTypeObject();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.rmf.reqif10.xhtml.ValuetypeType <em>Valuetype Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Valuetype Type Object</em>'.
	 * @see org.eclipse.rmf.reqif10.xhtml.ValuetypeType
	 * @model instanceClass="org.eclipse.rmf.reqif10.xhtml.ValuetypeType"
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

} //XhtmlPackage
